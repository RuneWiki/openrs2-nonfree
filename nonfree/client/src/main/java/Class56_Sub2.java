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

@OriginalClass("client!jn")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIZIILjava/awt/Graphics;)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.x = arg1;
		this.aRectangle1.width = arg2;
		this.aRectangle1.y = arg0;
		this.aRectangle1.height = arg3;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas3);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2987(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method2990(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt3197 = this.aCanvas3.getSize().width;
		this.anInt3198 = this.aCanvas3.getSize().height;
		this.anIntArray271 = new int[this.anInt3198 * this.anInt3197];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray271, this.anIntArray271.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt3197, this.anInt3198), local36, null);
		this.anImage3 = new BufferedImage(local44, local61, false, new Hashtable());
	}
}
