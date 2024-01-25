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

@OriginalClass("client!gka")
public final class Class5_Sub18_Sub1 extends Class5_Sub18 {

	@OriginalMember(owner = "client!gka", name = "p", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!gka", name = "q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!gka", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!gka", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!gka", name = "<init>", descriptor = "()V")
	private Class5_Sub18_Sub1() {
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V")
	@Override
	public void method5406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.height = arg2;
		this.aRectangle1.width = arg4;
		this.aRectangle1.x = arg6;
		this.aRectangle1.y = arg5;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, arg6 - arg0, arg5 + -arg1, this.aCanvas5);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method5405(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt6328 = arg1;
		this.anInt6326 = arg2;
		this.anIntArray346 = new int[this.anInt6328 * this.anInt6326];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray346, this.anIntArray346.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt6328, this.anInt6326), local30, (Point) null);
		this.anImage1 = new BufferedImage(local38, local48, false, new Hashtable());
	}
}
