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

@OriginalClass("client!vda")
public final class Class12_Sub5_Sub2 extends Class12_Sub5 {

	@OriginalMember(owner = "client!vda", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!vda", name = "w", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!vda", name = "x", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!vda", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas15;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7567(@OriginalArg(1) Canvas arg0) {
		this.aCanvas15 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt9178 = this.aCanvas15.getSize().width;
		this.anInt9182 = this.aCanvas15.getSize().height;
		this.anIntArray674 = new int[this.anInt9178 * this.anInt9182];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray674, this.anIntArray674.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt9178, this.anInt9182), local36, null);
		this.anImage12 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/awt/Graphics;IIZII)V")
	@Override
	public void method7570(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.width = arg1;
		this.aRectangle1.y = arg2;
		this.aRectangle1.x = arg4;
		this.aRectangle1.height = arg3;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage12, 0, 0, this.aCanvas15);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	@Override
	public void method7565(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage12, 0, 0, this.aCanvas15);
	}
}
