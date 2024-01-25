import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!eu", name = "C", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!eu", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method2580(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.width = arg1;
		this.aRectangle1.x = arg2;
		this.aRectangle1.height = arg4;
		this.aRectangle1.y = arg3;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas3);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method2584(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt3188 = this.aCanvas3.getSize().width;
		this.anInt3186 = this.aCanvas3.getSize().height;
		this.anIntArray237 = new int[this.anInt3186 * this.anInt3188];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray237, this.anIntArray237.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt3188, this.anInt3186), local36, null);
		this.anImage1 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	@Override
	public void method2585(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas3);
	}
}
