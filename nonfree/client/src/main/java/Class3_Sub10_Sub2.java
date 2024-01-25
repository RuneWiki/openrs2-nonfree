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

@OriginalClass("client!gt")
public final class Class3_Sub10_Sub2 extends Class3_Sub10 {

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2182(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method2181(@OriginalArg(1) Canvas arg0) {
		this.aCanvas2 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt2900 = this.aCanvas2.getSize().width;
		this.anInt2898 = this.aCanvas2.getSize().height;
		this.anIntArray176 = new int[this.anInt2898 * this.anInt2900];
		@Pc(44) DataBufferInt local44 = new DataBufferInt(this.anIntArray176, this.anIntArray176.length);
		@Pc(52) DirectColorModel local52 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local52.createCompatibleSampleModel(this.anInt2900, this.anInt2898), local44, null);
		this.anImage3 = new BufferedImage(local52, local62, false, new Hashtable());
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method2183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.width = arg1;
		this.aRectangle1.y = arg3;
		this.aRectangle1.height = arg2;
		this.aRectangle1.x = arg0;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas2);
		arg4.setClip(this.aShape1);
	}
}
