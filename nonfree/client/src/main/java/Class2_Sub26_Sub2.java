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

@OriginalClass("client!ww")
public final class Class2_Sub26_Sub2 extends Class2_Sub26 {

	@OriginalMember(owner = "client!ww", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ww", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!ww", name = "w", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ww", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	@Override
	public void method8913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		this.aCanvas13 = arg2;
		this.aRectangle1 = new Rectangle();
		this.anInt10482 = arg1;
		this.anInt10486 = arg0;
		this.anIntArray741 = new int[this.anInt10486 * this.anInt10482];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray741, this.anIntArray741.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt10486, this.anInt10482), local30, (Point) null);
		this.anImage13 = new BufferedImage(local38, local48, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V")
	@Override
	public void method8911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Graphics arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg5.getClip();
		this.aRectangle1.height = arg2;
		this.aRectangle1.width = arg6;
		this.aRectangle1.y = arg3;
		this.aRectangle1.x = arg0;
		arg5.setClip(this.aRectangle1);
		arg5.drawImage(this.anImage13, arg0 - arg4, -arg1 + arg3, this.aCanvas13);
		arg5.setClip(this.aShape1);
	}
}
