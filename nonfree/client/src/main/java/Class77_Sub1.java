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

@OriginalClass("client!fk")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method5044(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5040(@OriginalArg(1) Canvas arg0) {
		this.aCanvas2 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5685 = this.aCanvas2.getSize().width;
		this.anInt5690 = this.aCanvas2.getSize().height;
		this.anIntArray499 = new int[this.anInt5690 * this.anInt5685];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray499, this.anIntArray499.length);
		@Pc(55) DirectColorModel local55 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(65) WritableRaster local65 = Raster.createWritableRaster(local55.createCompatibleSampleModel(this.anInt5685, this.anInt5690), local36, null);
		this.anImage1 = new BufferedImage(local55, local65, false, new Hashtable());
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method5043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.x = arg2;
		this.aRectangle1.width = arg0;
		this.aRectangle1.height = arg1;
		this.aRectangle1.y = arg4;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas2);
		arg3.setClip(this.aShape1);
	}
}
