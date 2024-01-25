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

@OriginalClass("client!ni")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas23;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method5360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.y = arg3;
		this.aRectangle1.width = arg1;
		this.aRectangle1.x = arg4;
		this.aRectangle1.height = arg0;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage1, 0, 0, this.aCanvas23);
		arg2.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZLjava/awt/Graphics;)V")
	@Override
	public void method5361(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas23);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5363(@OriginalArg(1) Canvas arg0) {
		this.aCanvas23 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt7029 = this.aCanvas23.getSize().width;
		this.anInt7027 = this.aCanvas23.getSize().height;
		this.anIntArray667 = new int[this.anInt7027 * this.anInt7029];
		@Pc(46) DataBufferInt local46 = new DataBufferInt(this.anIntArray667, this.anIntArray667.length);
		@Pc(54) DirectColorModel local54 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(64) WritableRaster local64 = Raster.createWritableRaster(local54.createCompatibleSampleModel(this.anInt7029, this.anInt7027), local46, null);
		this.anImage1 = new BufferedImage(local54, local64, false, new Hashtable());
	}
}
