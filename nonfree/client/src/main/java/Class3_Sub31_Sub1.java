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

@OriginalClass("client!kga")
public final class Class3_Sub31_Sub1 extends Class3_Sub31 {

	@OriginalMember(owner = "client!kga", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!kga", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!kga", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!kga", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "()V")
	private Class3_Sub31_Sub1() {
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
	@Override
	public void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.width = arg5;
		this.aRectangle1.y = arg6;
		this.aRectangle1.x = arg3;
		this.aRectangle1.height = arg0;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage2, arg3 - arg4, arg6 + -arg2, this.aCanvas8);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	@Override
	public void method5152(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas8 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt6047 = arg2;
		this.anInt6048 = arg0;
		this.anIntArray346 = new int[this.anInt6048 * this.anInt6047];
		@Pc(38) DataBufferInt local38 = new DataBufferInt(this.anIntArray346, this.anIntArray346.length);
		@Pc(46) DirectColorModel local46 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(56) WritableRaster local56 = Raster.createWritableRaster(local46.createCompatibleSampleModel(this.anInt6047, this.anInt6048), local38, (Point) null);
		this.anImage2 = new BufferedImage(local46, local56, false, new Hashtable());
	}
}
