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

@OriginalClass("client!hw")
public final class Class6_Sub23_Sub1 extends Class6_Sub23 {

	@OriginalMember(owner = "client!hw", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!hw", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method6171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.y = arg3;
		this.aRectangle1.width = arg1;
		this.aRectangle1.height = arg4;
		this.aRectangle1.x = arg0;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage2, 0, 0, this.aCanvas8);
		arg2.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method6170(@OriginalArg(0) Canvas arg0) {
		this.aCanvas8 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt7481 = this.aCanvas8.getSize().width;
		this.anInt7484 = this.aCanvas8.getSize().height;
		this.anIntArray539 = new int[this.anInt7484 * this.anInt7481];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray539, this.anIntArray539.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt7481, this.anInt7484), local36, null);
		this.anImage2 = new BufferedImage(local51, local61, false, new Hashtable());
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public void method6173(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas8);
	}
}
