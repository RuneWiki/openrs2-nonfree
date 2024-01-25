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

@OriginalClass("client!oo")
public final class Class4_Sub17_Sub2 extends Class4_Sub17 {

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	@Override
	public void method4041(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
	@Override
	public void method4038(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.width = arg4;
		this.aRectangle1.y = arg1;
		this.aRectangle1.x = arg3;
		this.aRectangle1.height = arg2;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas6);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method4042(@OriginalArg(1) Canvas arg0) {
		this.aCanvas6 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5254 = this.aCanvas6.getSize().width;
		this.anInt5253 = this.aCanvas6.getSize().height;
		this.anIntArray452 = new int[this.anInt5253 * this.anInt5254];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray452, this.anIntArray452.length);
		@Pc(54) DirectColorModel local54 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(64) WritableRaster local64 = Raster.createWritableRaster(local54.createCompatibleSampleModel(this.anInt5254, this.anInt5253), local36, null);
		this.anImage2 = new BufferedImage(local54, local64, false, new Hashtable());
	}
}
