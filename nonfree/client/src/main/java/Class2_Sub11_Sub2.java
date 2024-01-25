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

@OriginalClass("client!vt")
public final class Class2_Sub11_Sub2 extends Class2_Sub11 {

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method5826(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas7);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5825(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.x = arg2;
		this.aRectangle1.height = arg3;
		this.aRectangle1.width = arg4;
		this.aRectangle1.y = arg1;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas7);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5822(@OriginalArg(1) Canvas arg0) {
		this.aCanvas7 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt7514 = this.aCanvas7.getSize().width;
		this.anInt7512 = this.aCanvas7.getSize().height;
		this.anIntArray501 = new int[this.anInt7514 * this.anInt7512];
		@Pc(44) DataBufferInt local44 = new DataBufferInt(this.anIntArray501, this.anIntArray501.length);
		@Pc(52) DirectColorModel local52 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local52.createCompatibleSampleModel(this.anInt7514, this.anInt7512), local44, null);
		this.anImage2 = new BufferedImage(local52, local62, false, new Hashtable());
	}
}
