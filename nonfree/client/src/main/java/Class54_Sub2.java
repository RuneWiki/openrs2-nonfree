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

@OriginalClass("client!en")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!en", name = "p", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!en", name = "q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!en", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
	@Override
	public void method1857(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method1855(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt2044 = this.aCanvas3.getSize().width;
		this.anInt2043 = this.aCanvas3.getSize().height;
		this.anIntArray119 = new int[this.anInt2043 * this.anInt2044];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray119, this.anIntArray119.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt2044, this.anInt2043), local36, null);
		this.anImage2 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.x = arg1;
		this.aRectangle1.height = arg2;
		this.aRectangle1.y = arg3;
		this.aRectangle1.width = arg0;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas3);
		arg4.setClip(this.aShape1);
	}
}
