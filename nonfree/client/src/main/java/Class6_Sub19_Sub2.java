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

@OriginalClass("client!tf")
public final class Class6_Sub19_Sub2 extends Class6_Sub19 {

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	@Override
	public void method7659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		this.aCanvas13 = arg2;
		this.aRectangle1 = new Rectangle();
		this.anInt9388 = arg0;
		this.anInt9382 = arg1;
		this.anIntArray495 = new int[this.anInt9388 * this.anInt9382];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray495, this.anIntArray495.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt9382, this.anInt9388), local40, (Point) null);
		this.anImage13 = new BufferedImage(local48, local58, false, new Hashtable());
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Graphics;IBIIIII)V")
	@Override
	public void method7652(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.width = arg3;
		this.aRectangle1.x = arg1;
		this.aRectangle1.y = arg6;
		this.aRectangle1.height = arg5;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage13, arg1 - arg2, -arg4 + arg6, this.aCanvas13);
		arg0.setClip(this.aShape1);
	}
}
