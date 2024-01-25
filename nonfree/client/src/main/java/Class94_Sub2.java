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

@OriginalClass("client!vb")
public final class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method5462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.y = arg2;
		this.aRectangle1.x = arg1;
		this.aRectangle1.width = arg3;
		this.aRectangle1.height = arg0;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas10);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method5463(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas10);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5464(@OriginalArg(0) Canvas arg0) {
		this.aCanvas10 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt6580 = this.aCanvas10.getSize().width;
		this.anInt6579 = this.aCanvas10.getSize().height;
		this.anIntArray521 = new int[this.anInt6579 * this.anInt6580];
		@Pc(43) DataBufferInt local43 = new DataBufferInt(this.anIntArray521, this.anIntArray521.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt6580, this.anInt6579), local43, null);
		this.anImage3 = new BufferedImage(local51, local61, false, new Hashtable());
	}
}
