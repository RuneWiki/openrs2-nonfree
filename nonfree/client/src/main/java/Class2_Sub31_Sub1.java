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

@OriginalClass("client!js")
public final class Class2_Sub31_Sub1 extends Class2_Sub31 {

	@OriginalMember(owner = "client!js", name = "C", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!js", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!js", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!js", name = "G", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V")
	@Override
	public void method5142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.x = arg4;
		this.aRectangle1.width = arg5;
		this.aRectangle1.y = arg0;
		this.aRectangle1.height = arg2;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage2, arg4 - arg1, -arg6 + arg0, this.aCanvas5);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method5139(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5956 = arg1;
		this.anInt5959 = arg2;
		this.anIntArray340 = new int[this.anInt5959 * this.anInt5956];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray340, this.anIntArray340.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt5956, this.anInt5959), local30, null);
		this.anImage2 = new BufferedImage(local48, local58, false, new Hashtable());
	}
}
