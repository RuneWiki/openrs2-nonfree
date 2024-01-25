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

@OriginalClass("client!jk")
public final class Class123_Sub1 extends Class123 {

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
	@Override
	public void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.x = arg2;
		this.aRectangle1.y = arg0;
		this.aRectangle1.height = arg4;
		this.aRectangle1.width = arg3;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage1, 0, 0, this.aCanvas3);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method4319(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method4318(@OriginalArg(1) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4907 = this.aCanvas3.getSize().width;
		this.anInt4906 = this.aCanvas3.getSize().height;
		this.anIntArray969 = new int[this.anInt4907 * this.anInt4906];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray969, this.anIntArray969.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt4907, this.anInt4906), local36, null);
		this.anImage1 = new BufferedImage(local44, local58, false, new Hashtable());
	}
}
