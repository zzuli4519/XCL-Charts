package com.data;
/**
 * @author Seven
 */
public class MyData {
	private String name;
	private int[] data;
	private int color;
	
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setData(int[] data){
		this.data = data;
	}
	public int[] getData(){
		return data;
	}
	
	public void setColor(int color){
		this.color = color;
	}
	public int getColor(){
		return color;
	}
}