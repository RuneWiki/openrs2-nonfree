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

@OriginalClass("client!gq")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method2196(@OriginalArg(1) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt2297 = this.aCanvas3.getSize().width;
		this.anInt2302 = this.aCanvas3.getSize().height;
		this.anIntArray262 = new int[this.anInt2302 * this.anInt2297];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray262, this.anIntArray262.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt2297, this.anInt2302), local36, null);
		this.anImage3 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2198(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.height = arg3;
		this.aRectangle1.y = arg2;
		this.aRectangle1.width = arg0;
		this.aRectangle1.x = arg4;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage3, 0, 0, this.aCanvas3);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2194(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas3);
	}
}
