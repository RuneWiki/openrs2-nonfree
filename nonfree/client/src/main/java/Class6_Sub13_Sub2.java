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

@OriginalClass("client!lj")
public final class Class6_Sub13_Sub2 extends Class6_Sub13 {

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method4479(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas9);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method4478(@OriginalArg(0) Canvas arg0) {
		this.aCanvas9 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5409 = this.aCanvas9.getSize().width;
		this.anInt5412 = this.aCanvas9.getSize().height;
		this.anIntArray420 = new int[this.anInt5409 * this.anInt5412];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray420, this.anIntArray420.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt5409, this.anInt5412), local36, null);
		this.anImage2 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
	@Override
	public void method4477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.x = arg4;
		this.aRectangle1.width = arg1;
		this.aRectangle1.y = arg2;
		this.aRectangle1.height = arg0;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas9);
		arg3.setClip(this.aShape1);
	}
}
