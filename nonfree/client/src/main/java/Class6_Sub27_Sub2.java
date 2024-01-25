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

@OriginalClass("client!pj")
public final class Class6_Sub27_Sub2 extends Class6_Sub27 {

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!pj", name = "E", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	@Override
	public void method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2) {
		this.aCanvas11 = arg2;
		this.aRectangle1 = new Rectangle();
		this.anInt7917 = arg1;
		this.anInt7918 = arg0;
		this.anIntArray481 = new int[this.anInt7918 * this.anInt7917];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray481, this.anIntArray481.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt7917, this.anInt7918), local30, (Point) null);
		this.anImage3 = new BufferedImage(local42, local52, false, new Hashtable());
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	@Override
	public void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.x = arg5;
		this.aRectangle1.height = arg1;
		this.aRectangle1.width = arg0;
		this.aRectangle1.y = arg2;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage3, arg5 - arg6, -arg3 + arg2, this.aCanvas11);
		arg4.setClip(this.aShape1);
	}
}
