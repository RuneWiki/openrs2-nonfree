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

@OriginalClass("client!hq")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method4813(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5409 = this.aCanvas2.getSize().width;
		this.anInt5411 = this.aCanvas2.getSize().height;
		this.anIntArray683 = new int[this.anInt5409 * this.anInt5411];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray683, this.anIntArray683.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt5409, this.anInt5411), local36, null);
		this.anImage1 = new BufferedImage(local51, local61, false, new Hashtable());
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method4811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.x = arg1;
		this.aRectangle1.y = arg4;
		this.aRectangle1.width = arg2;
		this.aRectangle1.height = arg0;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas2);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	@Override
	public void method4806(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas2);
	}
}
