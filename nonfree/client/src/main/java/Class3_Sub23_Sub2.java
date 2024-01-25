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

@OriginalClass("client!qf")
public final class Class3_Sub23_Sub2 extends Class3_Sub23 {

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
	@Override
	public void method6869(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.x = arg5;
		this.aRectangle1.width = arg0;
		this.aRectangle1.height = arg6;
		this.aRectangle1.y = arg4;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage2, arg5 - arg3, arg4 + -arg2, this.aCanvas12);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	@Override
	public void method6871(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas12 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt8162 = arg0;
		this.anInt8164 = arg2;
		this.anIntArray504 = new int[this.anInt8162 * this.anInt8164];
		@Pc(44) DataBufferInt local44 = new DataBufferInt(this.anIntArray504, this.anIntArray504.length);
		@Pc(52) DirectColorModel local52 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local52.createCompatibleSampleModel(this.anInt8162, this.anInt8164), local44, (Point) null);
		this.anImage2 = new BufferedImage(local52, local62, false, new Hashtable());
	}
}
