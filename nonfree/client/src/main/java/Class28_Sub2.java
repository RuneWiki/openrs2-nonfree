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

@OriginalClass("client!nc")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method3789(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4116 = this.aCanvas4.getSize().width;
		this.anInt4118 = this.aCanvas4.getSize().height;
		this.anIntArray356 = new int[this.anInt4116 * this.anInt4118];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray356, this.anIntArray356.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt4116, this.anInt4118), local36, null);
		this.anImage3 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method3790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.y = arg3;
		this.aRectangle1.x = arg1;
		this.aRectangle1.height = arg2;
		this.aRectangle1.width = arg0;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas4);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method3787(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
	}
}
