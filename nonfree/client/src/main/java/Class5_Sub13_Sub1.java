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

@OriginalClass("client!dea")
public final class Class5_Sub13_Sub1 extends Class5_Sub13 {

	@OriginalMember(owner = "client!dea", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!dea", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!dea", name = "v", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!dea", name = "y", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V")
	private Class5_Sub13_Sub1() {
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILjava/awt/Graphics;IBIIII)V")
	@Override
	public void method4489(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.height = arg4;
		this.aRectangle1.width = arg6;
		this.aRectangle1.y = arg3;
		this.aRectangle1.x = arg0;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage11, arg0 - arg5, -arg2 + arg3, this.aCanvas1);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	@Override
	public void method4490(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas1 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt4957 = arg0;
		this.anInt4955 = arg2;
		this.anIntArray271 = new int[this.anInt4957 * this.anInt4955];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray271, this.anIntArray271.length);
		@Pc(46) DirectColorModel local46 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(56) WritableRaster local56 = Raster.createWritableRaster(local46.createCompatibleSampleModel(this.anInt4955, this.anInt4957), local30, (Point) null);
		this.anImage11 = new BufferedImage(local46, local56, false, new Hashtable());
	}
}
