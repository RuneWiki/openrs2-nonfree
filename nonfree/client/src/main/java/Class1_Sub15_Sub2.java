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

@OriginalClass("client!wp")
public final class Class1_Sub15_Sub2 extends Class1_Sub15 {

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	@Override
	public void method7867(@OriginalArg(1) Canvas arg0) {
		this.aCanvas13 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt9524 = this.aCanvas13.getSize().width;
		this.anInt9526 = this.aCanvas13.getSize().height;
		this.anIntArray632 = new int[this.anInt9524 * this.anInt9526];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray632, this.anIntArray632.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt9524, this.anInt9526), local36, null);
		this.anImage13 = new BufferedImage(local48, local58, false, new Hashtable());
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method7870(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.width = arg4;
		this.aRectangle1.y = arg3;
		this.aRectangle1.x = arg0;
		this.aRectangle1.height = arg2;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage13, 0, 0, this.aCanvas13);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method7866(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage13, 0, 0, this.aCanvas13);
	}
}
