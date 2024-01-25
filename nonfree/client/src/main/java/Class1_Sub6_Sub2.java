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

@OriginalClass("client!ep")
public final class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method1801(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt2079 = this.aCanvas3.getSize().width;
		this.anInt2078 = this.aCanvas3.getSize().height;
		this.anIntArray169 = new int[this.anInt2079 * this.anInt2078];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray169, this.anIntArray169.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt2079, this.anInt2078), local36, null);
		this.anImage2 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.y = arg3;
		this.aRectangle1.x = arg1;
		this.aRectangle1.width = arg4;
		this.aRectangle1.height = arg0;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage2, 0, 0, this.aCanvas3);
		arg2.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method1800(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas3);
	}
}
