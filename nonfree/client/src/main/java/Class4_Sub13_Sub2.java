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

@OriginalClass("client!oj")
public final class Class4_Sub13_Sub2 extends Class4_Sub13 {

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method3731(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method3733(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4694 = this.aCanvas3.getSize().width;
		this.anInt4695 = this.aCanvas3.getSize().height;
		this.anIntArray380 = new int[this.anInt4695 * this.anInt4694];
		@Pc(43) DataBufferInt local43 = new DataBufferInt(this.anIntArray380, this.anIntArray380.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt4694, this.anInt4695), local43, null);
		this.anImage3 = new BufferedImage(local51, local61, false, new Hashtable());
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method3735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.x = arg0;
		this.aRectangle1.y = arg1;
		this.aRectangle1.height = arg4;
		this.aRectangle1.width = arg3;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage3, 0, 0, this.aCanvas3);
		arg2.setClip(this.aShape1);
	}
}
