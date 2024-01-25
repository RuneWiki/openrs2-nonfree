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

@OriginalClass("client!hm")
public final class Class6_Sub18_Sub1 extends Class6_Sub18 {

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/awt/Canvas;IIB)V")
	@Override
	public void method4130(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aCanvas2 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4861 = arg1;
		this.anInt4857 = arg2;
		this.anIntArray278 = new int[this.anInt4861 * this.anInt4857];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray278, this.anIntArray278.length);
		@Pc(45) DirectColorModel local45 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(55) WritableRaster local55 = Raster.createWritableRaster(local45.createCompatibleSampleModel(this.anInt4857, this.anInt4861), local30, (Point) null);
		this.anImage1 = new BufferedImage(local45, local55, false, new Hashtable());
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIBIILjava/awt/Graphics;)V")
	@Override
	public void method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Graphics arg6) {
		this.aShape1 = arg6.getClip();
		this.aRectangle1.width = arg1;
		this.aRectangle1.height = arg2;
		this.aRectangle1.y = arg0;
		this.aRectangle1.x = arg4;
		arg6.setClip(this.aRectangle1);
		arg6.drawImage(this.anImage1, arg4 - arg5, -arg3 + arg0, this.aCanvas2);
		arg6.setClip(this.aShape1);
	}
}
