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

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method551(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	@Override
	public void method548(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt608 = this.aCanvas1.getSize().width;
		this.anInt605 = this.aCanvas1.getSize().height;
		this.anIntArray69 = new int[this.anInt605 * this.anInt608];
		@Pc(48) DataBufferInt local48 = new DataBufferInt(this.anIntArray69, this.anIntArray69.length);
		@Pc(56) DirectColorModel local56 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(66) WritableRaster local66 = Raster.createWritableRaster(local56.createCompatibleSampleModel(this.anInt608, this.anInt605), local48, null);
		this.anImage1 = new BufferedImage(local56, local66, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILjava/awt/Graphics;B)V")
	@Override
	public void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.y = arg1;
		this.aRectangle1.x = arg3;
		this.aRectangle1.height = arg2;
		this.aRectangle1.width = arg0;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg4.setClip(this.aShape1);
	}
}
