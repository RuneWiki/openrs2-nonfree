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

@OriginalClass("client!cj")
public final class Class6_Sub3_Sub1 extends Class6_Sub3 {

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
	@Override
	public void method3819(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.height = arg3;
		this.aRectangle1.x = arg4;
		this.aRectangle1.y = arg0;
		this.aRectangle1.width = arg2;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage1, 0, 0, this.aCanvas5);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method3816(@OriginalArg(1) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4194 = this.aCanvas5.getSize().width;
		this.anInt4195 = this.aCanvas5.getSize().height;
		this.anIntArray384 = new int[this.anInt4194 * this.anInt4195];
		@Pc(39) DataBufferInt local39 = new DataBufferInt(this.anIntArray384, this.anIntArray384.length);
		@Pc(47) DirectColorModel local47 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(57) WritableRaster local57 = Raster.createWritableRaster(local47.createCompatibleSampleModel(this.anInt4194, this.anInt4195), local39, null);
		this.anImage1 = new BufferedImage(local47, local57, false, new Hashtable());
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method3818(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas5);
	}
}
