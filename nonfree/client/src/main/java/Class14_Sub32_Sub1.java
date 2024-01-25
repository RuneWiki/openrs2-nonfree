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

@OriginalClass("client!oia")
public final class Class14_Sub32_Sub1 extends Class14_Sub32 {

	@OriginalMember(owner = "client!oia", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "client!oia", name = "w", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!oia", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!oia", name = "u", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "()V")
	private Class14_Sub32_Sub1() {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILjava/awt/Graphics;IIIBII)V")
	@Override
	public void method9118(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.width = arg4;
		this.aRectangle1.height = arg5;
		this.aRectangle1.y = arg3;
		this.aRectangle1.x = arg6;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage14, arg6 - arg0, -arg2 + arg3, this.aCanvas8);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Ljava/awt/Canvas;ZII)V")
	@Override
	public void method9117(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aCanvas8 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt10672 = arg1;
		this.anInt10670 = arg2;
		this.anIntArray568 = new int[this.anInt10670 * this.anInt10672];
		@Pc(34) DataBufferInt local34 = new DataBufferInt(this.anIntArray568, this.anIntArray568.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt10672, this.anInt10670), local34, (Point) null);
		this.anImage14 = new BufferedImage(local42, local52, false, new Hashtable());
	}
}
