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

@OriginalClass("client!es")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!es", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!es", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.height = arg1;
		this.aRectangle1.width = arg2;
		this.aRectangle1.y = arg4;
		this.aRectangle1.x = arg0;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage4, 0, 0, this.aCanvas2);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method4868(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt6118 = this.aCanvas2.getSize().width;
		this.anInt6119 = this.aCanvas2.getSize().height;
		this.anIntArray512 = new int[this.anInt6118 * this.anInt6119];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray512, this.anIntArray512.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt6118, this.anInt6119), local36, null);
		this.anImage4 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method4869(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aCanvas2);
	}
}
