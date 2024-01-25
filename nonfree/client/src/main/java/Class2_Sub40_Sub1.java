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

@OriginalClass("client!mja")
public final class Class2_Sub40_Sub1 extends Class2_Sub40 {

	@OriginalMember(owner = "client!mja", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!mja", name = "x", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!mja", name = "v", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!mja", name = "w", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "()V")
	private Class2_Sub40_Sub1() {
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method7508(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aCanvas7 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt8472 = arg1;
		this.anInt8471 = arg2;
		this.anIntArray602 = new int[this.anInt8472 * this.anInt8471];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray602, this.anIntArray602.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt8472, this.anInt8471), local30, (Point) null);
		this.anImage12 = new BufferedImage(local38, local48, false, new Hashtable());
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
	@Override
	public void method7509(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.width = arg3;
		this.aRectangle1.y = arg4;
		this.aRectangle1.height = arg6;
		this.aRectangle1.x = arg1;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage12, arg1 - arg5, -arg2 + arg4, this.aCanvas7);
		arg0.setClip(this.aShape1);
	}
}
