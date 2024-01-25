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

@OriginalClass("client!cu")
public final class Class14_Sub6_Sub2 extends Class14_Sub6 {

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!cu", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIBILjava/awt/Graphics;II)V")
	@Override
	public void method1597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.height = arg0;
		this.aRectangle1.width = arg2;
		this.aRectangle1.y = arg6;
		this.aRectangle1.x = arg3;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage4, arg3 - arg5, -arg1 + arg6, this.aCanvas3);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	@Override
	public void method1601(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas3 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt1869 = arg2;
		this.anInt1867 = arg0;
		this.anIntArray136 = new int[this.anInt1869 * this.anInt1867];
		@Pc(37) DataBufferInt local37 = new DataBufferInt(this.anIntArray136, this.anIntArray136.length);
		@Pc(45) DirectColorModel local45 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(55) WritableRaster local55 = Raster.createWritableRaster(local45.createCompatibleSampleModel(this.anInt1867, this.anInt1869), local37, (Point) null);
		this.anImage4 = new BufferedImage(local45, local55, false, new Hashtable());
	}
}
