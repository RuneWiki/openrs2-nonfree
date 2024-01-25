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

@OriginalClass("client!qk")
public final class Class168_Sub1 extends Class168 {

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage28;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5329(@OriginalArg(1) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt6161 = this.aCanvas5.getSize().width;
		this.anInt6167 = this.aCanvas5.getSize().height;
		this.anIntArray619 = new int[this.anInt6161 * this.anInt6167];
		@Pc(43) DataBufferInt local43 = new DataBufferInt(this.anIntArray619, this.anIntArray619.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt6161, this.anInt6167), local43, null);
		this.anImage28 = new BufferedImage(local51, local61, false, new Hashtable());
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method5332(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage28, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
	@Override
	public void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.y = arg0;
		this.aRectangle1.width = arg4;
		this.aRectangle1.height = arg1;
		this.aRectangle1.x = arg3;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage28, 0, 0, this.aCanvas5);
		arg2.setClip(this.aShape1);
	}
}
