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

@OriginalClass("client!jaa")
public final class Class1_Sub26_Sub1 extends Class1_Sub26 {

	@OriginalMember(owner = "client!jaa", name = "s", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!jaa", name = "t", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!jaa", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!jaa", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZIILjava/awt/Graphics;II)V")
	@Override
	public void method7345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.width = arg1;
		this.aRectangle1.x = arg0;
		this.aRectangle1.height = arg3;
		this.aRectangle1.y = arg4;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage1, 0, 0, this.aCanvas10);
		arg2.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7342(@OriginalArg(1) Canvas arg0) {
		this.aCanvas10 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt8991 = this.aCanvas10.getSize().width;
		this.anInt8988 = this.aCanvas10.getSize().height;
		this.anIntArray683 = new int[this.anInt8991 * this.anInt8988];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray683, this.anIntArray683.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt8991, this.anInt8988), local40, null);
		this.anImage1 = new BufferedImage(local48, local58, false, new Hashtable());
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method7344(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas10);
	}
}
