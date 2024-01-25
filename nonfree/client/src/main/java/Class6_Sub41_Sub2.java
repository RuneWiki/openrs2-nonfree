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

@OriginalClass("client!vc")
public final class Class6_Sub41_Sub2 extends Class6_Sub41 {

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	private Class6_Sub41_Sub2() {
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	@Override
	public void method8629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.width = arg2;
		this.aRectangle1.y = arg3;
		this.aRectangle1.height = arg6;
		this.aRectangle1.x = arg0;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage14, arg0 - arg1, arg3 - arg5, this.aCanvas13);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method8628(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aCanvas13 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt9945 = arg2;
		this.anInt9947 = arg1;
		this.anIntArray653 = new int[this.anInt9945 * this.anInt9947];
		@Pc(34) DataBufferInt local34 = new DataBufferInt(this.anIntArray653, this.anIntArray653.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt9945, this.anInt9947), local34, (Point) null);
		this.anImage14 = new BufferedImage(local42, local52, false, new Hashtable());
	}
}
