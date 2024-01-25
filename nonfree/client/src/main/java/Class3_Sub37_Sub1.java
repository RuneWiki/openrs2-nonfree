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

@OriginalClass("client!q")
public final class Class3_Sub37_Sub1 extends Class3_Sub37 {

	@OriginalMember(owner = "client!q", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!q", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	@Override
	public void method8299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.width = arg0;
		this.aRectangle1.x = arg6;
		this.aRectangle1.height = arg1;
		this.aRectangle1.y = arg4;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage2, arg6 - arg2, -arg5 + arg4, this.aCanvas12);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method8300(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aCanvas12 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt10101 = arg1;
		this.anInt10098 = arg2;
		this.anIntArray613 = new int[this.anInt10098 * this.anInt10101];
		@Pc(37) DataBufferInt local37 = new DataBufferInt(this.anIntArray613, this.anIntArray613.length);
		@Pc(45) DirectColorModel local45 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(55) WritableRaster local55 = Raster.createWritableRaster(local45.createCompatibleSampleModel(this.anInt10098, this.anInt10101), local37, null);
		this.anImage2 = new BufferedImage(local45, local55, false, new Hashtable());
	}
}
