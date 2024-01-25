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

@OriginalClass("client!jf")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIBILjava/awt/Graphics;)V")
	@Override
	public void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.x = arg1;
		this.aRectangle1.width = arg3;
		this.aRectangle1.y = arg2;
		this.aRectangle1.height = arg0;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas5);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
	@Override
	public void method4707(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	@Override
	public void method4705(@OriginalArg(1) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5670 = this.aCanvas5.getSize().width;
		this.anInt5666 = this.aCanvas5.getSize().height;
		this.anIntArray458 = new int[this.anInt5666 * this.anInt5670];
		@Pc(43) DataBufferInt local43 = new DataBufferInt(this.anIntArray458, this.anIntArray458.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt5670, this.anInt5666), local43, null);
		this.anImage2 = new BufferedImage(local51, local61, false, new Hashtable());
	}
}
