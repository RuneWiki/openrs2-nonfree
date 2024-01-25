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

@OriginalClass("client!mh")
public final class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method3582(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt3952 = this.aCanvas3.getSize().width;
		this.anInt3950 = this.aCanvas3.getSize().height;
		this.anIntArray549 = new int[this.anInt3950 * this.anInt3952];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray549, this.anIntArray549.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt3952, this.anInt3950), local40, null);
		this.anImage3 = new BufferedImage(local48, local58, false, new Hashtable());
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method3579(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
	@Override
	public void method3581(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.y = arg4;
		this.aRectangle1.x = arg0;
		this.aRectangle1.width = arg3;
		this.aRectangle1.height = arg2;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage3, 0, 0, this.aCanvas3);
		arg1.setClip(this.aShape1);
	}
}
