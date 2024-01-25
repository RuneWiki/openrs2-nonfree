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

@OriginalClass("client!cia")
public final class Class4_Sub12_Sub1 extends Class4_Sub12 {

	@OriginalMember(owner = "client!cia", name = "l", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!cia", name = "m", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!cia", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!cia", name = "o", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIIBLjava/awt/Graphics;III)V")
	@Override
	public void method8687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.height = arg2;
		this.aRectangle1.x = arg4;
		this.aRectangle1.y = arg6;
		this.aRectangle1.width = arg1;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, arg4 - arg0, arg6 - arg5, this.aCanvas3);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ljava/awt/Canvas;BII)V")
	@Override
	public void method8686(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt10265 = arg2;
		this.anInt10264 = arg1;
		this.anIntArray710 = new int[this.anInt10264 * this.anInt10265];
		@Pc(34) DataBufferInt local34 = new DataBufferInt(this.anIntArray710, this.anIntArray710.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt10264, this.anInt10265), local34, (Point) null);
		this.anImage1 = new BufferedImage(local42, local52, false, new Hashtable());
	}
}
