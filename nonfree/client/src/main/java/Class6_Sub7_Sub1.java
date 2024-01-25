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

@OriginalClass("client!ck")
public final class Class6_Sub7_Sub1 extends Class6_Sub7 {

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	@Override
	public void method4871(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method4874(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5817 = this.aCanvas1.getSize().width;
		this.anInt5821 = this.aCanvas1.getSize().height;
		this.anIntArray395 = new int[this.anInt5821 * this.anInt5817];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray395, this.anIntArray395.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt5817, this.anInt5821), local36, null);
		this.anImage1 = new BufferedImage(local44, local62, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	@Override
	public void method4868(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.x = arg1;
		this.aRectangle1.height = arg4;
		this.aRectangle1.y = arg2;
		this.aRectangle1.width = arg3;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg0.setClip(this.aShape1);
	}
}
