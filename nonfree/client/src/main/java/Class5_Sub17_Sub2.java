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

@OriginalClass("client!qc")
public final class Class5_Sub17_Sub2 extends Class5_Sub17 {

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	@Override
	public void method4119(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILjava/awt/Graphics;ZII)V")
	@Override
	public void method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.y = arg0;
		this.aRectangle1.width = arg3;
		this.aRectangle1.x = arg1;
		this.aRectangle1.height = arg4;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage3, 0, 0, this.aCanvas4);
		arg2.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method4121(@OriginalArg(1) Canvas arg0) {
		this.aCanvas4 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5326 = this.aCanvas4.getSize().width;
		this.anInt5324 = this.aCanvas4.getSize().height;
		this.anIntArray386 = new int[this.anInt5324 * this.anInt5326];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray386, this.anIntArray386.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt5326, this.anInt5324), local36, null);
		this.anImage3 = new BufferedImage(local44, local54, false, new Hashtable());
	}
}
