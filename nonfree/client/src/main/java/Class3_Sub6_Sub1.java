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

@OriginalClass("client!as")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!as", name = "s", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZIIIILjava/awt/Graphics;)V")
	@Override
	public void method2206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.y = arg3;
		this.aRectangle1.height = arg0;
		this.aRectangle1.width = arg1;
		this.aRectangle1.x = arg2;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage1, 0, 0, this.aCanvas3);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method2207(@OriginalArg(1) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt2588 = this.aCanvas3.getSize().width;
		this.anInt2586 = this.aCanvas3.getSize().height;
		this.anIntArray259 = new int[this.anInt2586 * this.anInt2588];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray259, this.anIntArray259.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(66) WritableRaster local66 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt2588, this.anInt2586), local36, null);
		this.anImage1 = new BufferedImage(local44, local66, false, new Hashtable());
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	@Override
	public void method2204(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas3);
	}
}
