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

@OriginalClass("client!np")
public final class Class10_Sub3_Sub2 extends Class10_Sub3 {

	@OriginalMember(owner = "client!np", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!np", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!np", name = "w", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method3890(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4833 = this.aCanvas5.getSize().width;
		this.anInt4831 = this.aCanvas5.getSize().height;
		this.anIntArray476 = new int[this.anInt4833 * this.anInt4831];
		@Pc(48) DataBufferInt local48 = new DataBufferInt(this.anIntArray476, this.anIntArray476.length);
		@Pc(56) DirectColorModel local56 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(66) WritableRaster local66 = Raster.createWritableRaster(local56.createCompatibleSampleModel(this.anInt4833, this.anInt4831), local48, null);
		this.anImage4 = new BufferedImage(local56, local66, false, new Hashtable());
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method3891(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method3893(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.x = arg3;
		this.aRectangle1.width = arg1;
		this.aRectangle1.height = arg2;
		this.aRectangle1.y = arg4;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage4, 0, 0, this.aCanvas5);
		arg0.setClip(this.aShape1);
	}
}
