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

@OriginalClass("client!ho")
public final class Class3_Sub16_Sub1 extends Class3_Sub16 {

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V")
	@Override
	public void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Graphics arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg5.getClip();
		this.aRectangle1.y = arg3;
		this.aRectangle1.width = arg0;
		this.aRectangle1.x = arg4;
		this.aRectangle1.height = arg1;
		arg5.setClip(this.aRectangle1);
		arg5.drawImage(this.anImage2, arg4 - arg2, -arg6 + arg3, this.aCanvas8);
		arg5.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIBLjava/awt/Canvas;)V")
	@Override
	public void method7950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		this.aCanvas8 = arg2;
		this.aRectangle1 = new Rectangle();
		this.anInt9296 = arg1;
		this.anInt9294 = arg0;
		this.anIntArray582 = new int[this.anInt9294 * this.anInt9296];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray582, this.anIntArray582.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt9296, this.anInt9294), local30, (Point) null);
		this.anImage2 = new BufferedImage(local38, local58, false, new Hashtable());
	}
}
