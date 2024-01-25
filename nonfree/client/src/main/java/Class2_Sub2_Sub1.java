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

@OriginalClass("client!f")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!f", name = "A", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!f", name = "C", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILjava/awt/Canvas;B)V")
	@Override
	public void method7470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2) {
		this.aCanvas1 = arg2;
		this.aRectangle1 = new Rectangle();
		this.anInt8383 = arg0;
		this.anInt8384 = arg1;
		this.anIntArray422 = new int[this.anInt8383 * this.anInt8384];
		@Pc(38) DataBufferInt local38 = new DataBufferInt(this.anIntArray422, this.anIntArray422.length);
		@Pc(46) DirectColorModel local46 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(56) WritableRaster local56 = Raster.createWritableRaster(local46.createCompatibleSampleModel(this.anInt8384, this.anInt8383), local38, (Point) null);
		this.anImage1 = new BufferedImage(local46, local56, false, new Hashtable());
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIILjava/awt/Graphics;)V")
	@Override
	public void method7474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Graphics arg6) {
		this.aShape1 = arg6.getClip();
		this.aRectangle1.x = arg2;
		this.aRectangle1.width = arg4;
		this.aRectangle1.height = arg0;
		this.aRectangle1.y = arg5;
		arg6.setClip(this.aRectangle1);
		arg6.drawImage(this.anImage1, arg2 - arg3, -arg1 + arg5, this.aCanvas1);
		arg6.setClip(this.aShape1);
	}
}
