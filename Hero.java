
import greenfoot.*;
import java.lang.Math.*;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
     moveUp();
     moveDown();
     rotateLeft();
     rotateRight();
    }
    
    public void moveUp(){
     if(Greenfoot.isKeyDown("up"))
      moveSteps(5);//setLocation(getX(), getY()-5);
    }
    
    
    public void moveSteps(int steps)
    {
       int x1,y1,x2,y2,dir;
       x1=getX();
       y1=getY();
       dir=getRotation()-90;
       x2=x1+(int)(steps *(Math.cos(Math.toRadians(dir))));
       y2=y1+(int)(steps *(Math.sin(Math.toRadians(dir))));
       setLocation(x2,y2);
          }
    
    public void moveDown(){
    if(Greenfoot.isKeyDown("down"))
      {
        moveSteps(-5);
      }
    //setLocation(getX(), getY()+5);
    }
    public void rotateLeft(){
     if(Greenfoot.isKeyDown("left"))setRotation(getRotation()-6);      
    }
    public void rotateRight(){
    if(Greenfoot.isKeyDown("right"))setRotation(getRotation()+6);
    }
}
