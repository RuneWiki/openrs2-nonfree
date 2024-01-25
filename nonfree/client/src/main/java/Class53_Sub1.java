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

@OriginalClass("client!e")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method1384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.y = arg4;
		this.aRectangle1.width = arg2;
		this.aRectangle1.x = arg0;
		this.aRectangle1.height = arg1;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	@Override
	public void method1388(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method1386(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt1581 = this.aCanvas1.getSize().width;
		this.anInt1579 = this.aCanvas1.getSize().height;
		this.anIntArray73 = new int[this.anInt1579 * this.anInt1581];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray73, this.anIntArray73.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt1581, this.anInt1579), local36, null);
		this.anImage1 = new BufferedImage(local44, local62, false, new Hashtable());
	}
}
