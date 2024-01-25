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
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!en", name = "j", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!en", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	@Override
	public void method2526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.width = arg2;
		this.aRectangle1.height = arg0;
		this.aRectangle1.y = arg4;
		this.aRectangle1.x = arg1;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas2);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method2523(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method2525(@OriginalArg(1) Canvas arg0) {
		this.aCanvas2 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt2990 = this.aCanvas2.getSize().width;
		this.anInt2988 = this.aCanvas2.getSize().height;
		this.anIntArray199 = new int[this.anInt2990 * this.anInt2988];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray199, this.anIntArray199.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt2990, this.anInt2988), local40, null);
		this.anImage2 = new BufferedImage(local48, local58, false, new Hashtable());
	}
}
