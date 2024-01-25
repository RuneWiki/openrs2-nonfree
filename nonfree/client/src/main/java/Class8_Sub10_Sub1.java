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

@OriginalClass("client!cda")
public final class Class8_Sub10_Sub1 extends Class8_Sub10 {

	@OriginalMember(owner = "client!cda", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!cda", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!cda", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!cda", name = "t", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/Canvas;IZI)V")
	@Override
	public void method3520(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4339 = arg1;
		this.anInt4338 = arg2;
		this.anIntArray237 = new int[this.anInt4338 * this.anInt4339];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray237, this.anIntArray237.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt4339, this.anInt4338), local30, null);
		this.anImage4 = new BufferedImage(local38, local48, false, new Hashtable());
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
	@Override
	public void method3523(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.x = arg3;
		this.aRectangle1.y = arg5;
		this.aRectangle1.width = arg2;
		this.aRectangle1.height = arg4;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage4, arg3 - arg6, -arg1 + arg5, this.aCanvas5);
		arg0.setClip(this.aShape1);
	}
}
