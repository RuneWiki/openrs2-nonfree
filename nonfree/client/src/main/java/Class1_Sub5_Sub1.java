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

@OriginalClass("client!as")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method2909(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method2910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.x = arg1;
		this.aRectangle1.y = arg2;
		this.aRectangle1.width = arg4;
		this.aRectangle1.height = arg0;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method2908(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt3325 = this.aCanvas1.getSize().width;
		this.anInt3326 = this.aCanvas1.getSize().height;
		this.anIntArray309 = new int[this.anInt3325 * this.anInt3326];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray309, this.anIntArray309.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt3325, this.anInt3326), local36, null);
		this.anImage1 = new BufferedImage(local44, local54, false, new Hashtable());
	}
}
