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

@OriginalClass("client!hs")
public final class Class5_Sub26_Sub2 extends Class5_Sub26 {

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	@Override
	public void method3764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		this.aCanvas9 = arg2;
		this.aRectangle1 = new Rectangle();
		this.anInt4455 = arg0;
		this.anInt4454 = arg1;
		this.anIntArray230 = new int[this.anInt4455 * this.anInt4454];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray230, this.anIntArray230.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt4454, this.anInt4455), local30, (Point) null);
		this.anImage12 = new BufferedImage(local38, local48, false, new Hashtable());
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILjava/awt/Graphics;IIIII)V")
	@Override
	public void method3763(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.width = arg2;
		this.aRectangle1.y = arg6;
		this.aRectangle1.x = arg5;
		this.aRectangle1.height = arg3;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage12, arg5 - arg0, arg6 - arg4, this.aCanvas9);
		arg1.setClip(this.aShape1);
	}
}
