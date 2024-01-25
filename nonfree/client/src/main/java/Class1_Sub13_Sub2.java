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
public final class Class1_Sub13_Sub2 extends Class1_Sub13 {

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas15;

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	@Override
	public void method8178(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas15);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
	@Override
	public void method8177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.x = arg4;
		this.aRectangle1.width = arg0;
		this.aRectangle1.y = arg3;
		this.aRectangle1.height = arg1;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage3, 0, 0, this.aCanvas15);
		arg2.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method8181(@OriginalArg(1) Canvas arg0) {
		this.aCanvas15 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt9491 = this.aCanvas15.getSize().width;
		this.anInt9492 = this.aCanvas15.getSize().height;
		this.anIntArray833 = new int[this.anInt9491 * this.anInt9492];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray833, this.anIntArray833.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt9491, this.anInt9492), local36, null);
		this.anImage3 = new BufferedImage(local44, local61, false, new Hashtable());
	}
}
