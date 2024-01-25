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

@OriginalClass("client!qv")
public final class Class2_Sub30_Sub2 extends Class2_Sub30 {

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!qv", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method4495(@OriginalArg(1) Canvas arg0) {
		this.aCanvas7 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5721 = this.aCanvas7.getSize().width;
		this.anInt5719 = this.aCanvas7.getSize().height;
		this.anIntArray502 = new int[this.anInt5721 * this.anInt5719];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray502, this.anIntArray502.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt5721, this.anInt5719), local40, null);
		this.anImage3 = new BufferedImage(local48, local58, false, new Hashtable());
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.height = arg2;
		this.aRectangle1.y = arg3;
		this.aRectangle1.width = arg1;
		this.aRectangle1.x = arg0;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas7);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method4498(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas7);
	}
}
