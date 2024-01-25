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

@OriginalClass("client!aca")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!aca", name = "q", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7320(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt8906 = this.aCanvas1.getSize().width;
		this.anInt8905 = this.aCanvas1.getSize().height;
		this.anIntArray680 = new int[this.anInt8905 * this.anInt8906];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray680, this.anIntArray680.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt8906, this.anInt8905), local36, null);
		this.anImage1 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method7319(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.y = arg1;
		this.aRectangle1.x = arg3;
		this.aRectangle1.width = arg2;
		this.aRectangle1.height = arg0;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg4.setClip(this.aShape1);
	}
}
