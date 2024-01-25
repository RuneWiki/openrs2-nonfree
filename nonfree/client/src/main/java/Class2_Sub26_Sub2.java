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

@OriginalClass("client!pa")
public final class Class2_Sub26_Sub2 extends Class2_Sub26 {

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage15;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIBLjava/awt/Graphics;IIII)V")
	@Override
	public void method5617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.height = arg4;
		this.aRectangle1.width = arg1;
		this.aRectangle1.y = arg5;
		this.aRectangle1.x = arg3;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage15, arg3 - arg0, -arg6 + arg5, this.aCanvas6);
		arg2.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		this.aCanvas6 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt6571 = arg2;
		this.anInt6570 = arg0;
		this.anIntArray482 = new int[this.anInt6570 * this.anInt6571];
		@Pc(37) DataBufferInt local37 = new DataBufferInt(this.anIntArray482, this.anIntArray482.length);
		@Pc(45) DirectColorModel local45 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(55) WritableRaster local55 = Raster.createWritableRaster(local45.createCompatibleSampleModel(this.anInt6571, this.anInt6570), local37, null);
		this.anImage15 = new BufferedImage(local45, local55, false, new Hashtable());
	}
}
