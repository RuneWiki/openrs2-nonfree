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

@OriginalClass("client!tc")
public final class Class86_Sub2 extends Class86 {

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.height = arg3;
		this.aRectangle1.y = arg2;
		this.aRectangle1.width = arg0;
		this.aRectangle1.x = arg1;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas5);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	@Override
	public void method5027(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5026(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5892 = this.aCanvas5.getSize().width;
		this.anInt5895 = this.aCanvas5.getSize().height;
		this.anIntArray480 = new int[this.anInt5895 * this.anInt5892];
		@Pc(48) DataBufferInt local48 = new DataBufferInt(this.anIntArray480, this.anIntArray480.length);
		@Pc(56) DirectColorModel local56 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(66) WritableRaster local66 = Raster.createWritableRaster(local56.createCompatibleSampleModel(this.anInt5892, this.anInt5895), local48, null);
		this.anImage3 = new BufferedImage(local56, local66, false, new Hashtable());
	}
}
