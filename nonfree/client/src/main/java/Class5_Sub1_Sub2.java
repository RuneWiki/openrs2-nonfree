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

@OriginalClass("client!ir")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZIIIIILjava/awt/Graphics;)V")
	@Override
	public void method3751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Graphics arg6) {
		this.aShape1 = arg6.getClip();
		this.aRectangle1.y = arg2;
		this.aRectangle1.height = arg0;
		this.aRectangle1.x = arg3;
		this.aRectangle1.width = arg4;
		arg6.setClip(this.aRectangle1);
		arg6.drawImage(this.anImage2, arg3 - arg1, -arg5 + arg2, this.aCanvas4);
		arg6.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method3750(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aCanvas4 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4128 = arg2;
		this.anInt4129 = arg1;
		this.anIntArray350 = new int[this.anInt4129 * this.anInt4128];
		@Pc(37) DataBufferInt local37 = new DataBufferInt(this.anIntArray350, this.anIntArray350.length);
		@Pc(45) DirectColorModel local45 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(55) WritableRaster local55 = Raster.createWritableRaster(local45.createCompatibleSampleModel(this.anInt4128, this.anInt4129), local37, (Point) null);
		this.anImage2 = new BufferedImage(local45, local55, false, new Hashtable());
	}
}
