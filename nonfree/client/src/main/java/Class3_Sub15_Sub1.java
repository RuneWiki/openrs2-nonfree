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

@OriginalClass("client!cj")
public final class Class3_Sub15_Sub1 extends Class3_Sub15 {

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	private Class3_Sub15_Sub1() {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	@Override
	public void method5519(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas3 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt6370 = arg0;
		this.anInt6369 = arg2;
		this.anIntArray488 = new int[this.anInt6370 * this.anInt6369];
		@Pc(39) DataBufferInt local39 = new DataBufferInt(this.anIntArray488, this.anIntArray488.length);
		@Pc(47) DirectColorModel local47 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(57) WritableRaster local57 = Raster.createWritableRaster(local47.createCompatibleSampleModel(this.anInt6369, this.anInt6370), local39, (Point) null);
		this.anImage1 = new BufferedImage(local47, local57, false, new Hashtable());
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIILjava/awt/Graphics;IIII)V")
	@Override
	public void method5522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.y = arg1;
		this.aRectangle1.height = arg5;
		this.aRectangle1.width = arg6;
		this.aRectangle1.x = arg3;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage1, arg3 - arg0, arg1 + -arg4, this.aCanvas3);
		arg2.setClip(this.aShape1);
	}
}
