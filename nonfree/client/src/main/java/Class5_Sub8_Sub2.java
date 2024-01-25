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

@OriginalClass("client!tea")
public final class Class5_Sub8_Sub2 extends Class5_Sub8 {

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!tea", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!tea", name = "t", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILjava/awt/Canvas;BI)V")
	@Override
	public void method7712(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas13 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt9181 = arg0;
		this.anInt9183 = arg2;
		this.anIntArray507 = new int[this.anInt9183 * this.anInt9181];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray507, this.anIntArray507.length);
		@Pc(46) DirectColorModel local46 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(56) WritableRaster local56 = Raster.createWritableRaster(local46.createCompatibleSampleModel(this.anInt9183, this.anInt9181), local30, (Point) null);
		this.anImage13 = new BufferedImage(local46, local56, false, new Hashtable());
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.y = arg0;
		this.aRectangle1.x = arg1;
		this.aRectangle1.width = arg3;
		this.aRectangle1.height = arg6;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage13, arg1 - arg2, arg0 + -arg5, this.aCanvas13);
		arg4.setClip(this.aShape1);
	}
}
