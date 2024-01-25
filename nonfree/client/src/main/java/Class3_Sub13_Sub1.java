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

@OriginalClass("client!c")
public final class Class3_Sub13_Sub1 extends Class3_Sub13 {

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	@Override
	public void method4822(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5276 = arg1;
		this.anInt5275 = arg2;
		this.anIntArray475 = new int[this.anInt5275 * this.anInt5276];
		@Pc(37) DataBufferInt local37 = new DataBufferInt(this.anIntArray475, this.anIntArray475.length);
		@Pc(45) DirectColorModel local45 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(55) WritableRaster local55 = Raster.createWritableRaster(local45.createCompatibleSampleModel(this.anInt5276, this.anInt5275), local37, (Point) null);
		this.anImage1 = new BufferedImage(local45, local55, false, new Hashtable());
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
	@Override
	public void method4824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Graphics arg5, @OriginalArg(6) int arg6) {
		this.aShape1 = arg5.getClip();
		this.aRectangle1.y = arg2;
		this.aRectangle1.height = arg3;
		this.aRectangle1.width = arg0;
		this.aRectangle1.x = arg6;
		arg5.setClip(this.aRectangle1);
		arg5.drawImage(this.anImage1, arg6 - arg4, -arg1 + arg2, this.aCanvas3);
		arg5.setClip(this.aShape1);
	}
}
