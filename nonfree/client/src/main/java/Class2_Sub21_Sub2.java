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

@OriginalClass("client!wn")
public final class Class2_Sub21_Sub2 extends Class2_Sub21 {

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas15;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method7767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.x = arg3;
		this.aRectangle1.y = arg1;
		this.aRectangle1.height = arg0;
		this.aRectangle1.width = arg2;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas15);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method7766(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas15);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7764(@OriginalArg(1) Canvas arg0) {
		this.aCanvas15 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt9341 = this.aCanvas15.getSize().width;
		this.anInt9342 = this.aCanvas15.getSize().height;
		this.anIntArray761 = new int[this.anInt9341 * this.anInt9342];
		@Pc(46) DataBufferInt local46 = new DataBufferInt(this.anIntArray761, this.anIntArray761.length);
		@Pc(54) DirectColorModel local54 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(64) WritableRaster local64 = Raster.createWritableRaster(local54.createCompatibleSampleModel(this.anInt9341, this.anInt9342), local46, null);
		this.anImage3 = new BufferedImage(local54, local64, false, new Hashtable());
	}
}
