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

@OriginalClass("client!ic")
public final class Class85_Sub2 extends Class85 {

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method2520(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt2372 = this.aCanvas3.getSize().width;
		this.anInt2369 = this.aCanvas3.getSize().height;
		this.anIntArray311 = new int[this.anInt2372 * this.anInt2369];
		@Pc(46) DataBufferInt local46 = new DataBufferInt(this.anIntArray311, this.anIntArray311.length);
		@Pc(54) DirectColorModel local54 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(64) WritableRaster local64 = Raster.createWritableRaster(local54.createCompatibleSampleModel(this.anInt2372, this.anInt2369), local46, null);
		this.anImage3 = new BufferedImage(local54, local64, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2521(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method2524(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.y = arg1;
		this.aRectangle1.width = arg4;
		this.aRectangle1.height = arg3;
		this.aRectangle1.x = arg2;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas3);
		arg0.setClip(this.aShape1);
	}
}
