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

@OriginalClass("client!ji")
public final class Class123_Sub1 extends Class123 {

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	@Override
	public void method5336(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.width = arg2;
		this.aRectangle1.x = arg0;
		this.aRectangle1.y = arg3;
		this.aRectangle1.height = arg1;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas1);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5332(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5985 = this.aCanvas1.getSize().width;
		this.anInt5987 = this.aCanvas1.getSize().height;
		this.anIntArray643 = new int[this.anInt5985 * this.anInt5987];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray643, this.anIntArray643.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt5985, this.anInt5987), local36, null);
		this.anImage2 = new BufferedImage(local44, local58, false, new Hashtable());
	}
}
