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

@OriginalClass("client!aba")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!aba", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!aba", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
	@Override
	public void method6780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.width = arg6;
		this.aRectangle1.height = arg0;
		this.aRectangle1.y = arg3;
		this.aRectangle1.x = arg5;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage1, arg5 - arg2, arg3 + -arg1, this.aCanvas1);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	@Override
	public void method6778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		this.aCanvas1 = arg2;
		this.aRectangle1 = new Rectangle();
		this.anInt8241 = arg1;
		this.anInt8242 = arg0;
		this.anIntArray439 = new int[this.anInt8242 * this.anInt8241];
		@Pc(34) DataBufferInt local34 = new DataBufferInt(this.anIntArray439, this.anIntArray439.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt8242, this.anInt8241), local34, (Point) null);
		this.anImage1 = new BufferedImage(local42, local52, false, new Hashtable());
	}
}
