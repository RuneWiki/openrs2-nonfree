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

@OriginalClass("client!tc")
public final class Class193_Sub2 extends Class193 {

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
	@Override
	public void method4805(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.y = arg2;
		this.aRectangle1.height = arg3;
		this.aRectangle1.x = arg4;
		this.aRectangle1.width = arg1;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas6);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	@Override
	public void method4808(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method4807(@OriginalArg(1) Canvas arg0) {
		this.aCanvas6 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5586 = this.aCanvas6.getSize().width;
		this.anInt5585 = this.aCanvas6.getSize().height;
		this.anIntArray645 = new int[this.anInt5586 * this.anInt5585];
		@Pc(43) DataBufferInt local43 = new DataBufferInt(this.anIntArray645, this.anIntArray645.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt5586, this.anInt5585), local43, null);
		this.anImage3 = new BufferedImage(local51, local61, false, new Hashtable());
	}
}
