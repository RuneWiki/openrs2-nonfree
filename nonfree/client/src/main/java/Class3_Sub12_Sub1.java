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

@OriginalClass("client!dg")
public final class Class3_Sub12_Sub1 extends Class3_Sub12 {

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
	@Override
	public void method5830(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.y = arg2;
		this.aRectangle1.x = arg4;
		this.aRectangle1.height = arg5;
		this.aRectangle1.width = arg1;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage5, arg4 - arg3, -arg6 + arg2, this.aCanvas5);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	@Override
	public void method5831(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		this.aCanvas5 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt6771 = arg2;
		this.anInt6770 = arg0;
		this.anIntArray406 = new int[this.anInt6770 * this.anInt6771];
		@Pc(37) DataBufferInt local37 = new DataBufferInt(this.anIntArray406, this.anIntArray406.length);
		@Pc(45) DirectColorModel local45 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(55) WritableRaster local55 = Raster.createWritableRaster(local45.createCompatibleSampleModel(this.anInt6770, this.anInt6771), local37, null);
		this.anImage5 = new BufferedImage(local45, local55, false, new Hashtable());
	}
}
