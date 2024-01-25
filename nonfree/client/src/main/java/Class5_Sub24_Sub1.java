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

@OriginalClass("client!gn")
public final class Class5_Sub24_Sub1 extends Class5_Sub24 {

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	@Override
	public void method3659(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas3 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt4055 = arg2;
		this.anInt4053 = arg0;
		this.anIntArray204 = new int[this.anInt4055 * this.anInt4053];
		@Pc(38) DataBufferInt local38 = new DataBufferInt(this.anIntArray204, this.anIntArray204.length);
		@Pc(46) DirectColorModel local46 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(56) WritableRaster local56 = Raster.createWritableRaster(local46.createCompatibleSampleModel(this.anInt4055, this.anInt4053), local38, null);
		this.anImage1 = new BufferedImage(local46, local56, false, new Hashtable());
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
	@Override
	public void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.x = arg6;
		this.aRectangle1.width = arg4;
		this.aRectangle1.height = arg3;
		this.aRectangle1.y = arg5;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage1, arg6 - arg2, -arg0 + arg5, this.aCanvas3);
		arg1.setClip(this.aShape1);
	}
}
