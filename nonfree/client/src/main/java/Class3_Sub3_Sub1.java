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

@OriginalClass("client!ae")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	@Override
	public void method2650(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method2648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.y = arg0;
		this.aRectangle1.width = arg4;
		this.aRectangle1.x = arg1;
		this.aRectangle1.height = arg2;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method2651(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt3250 = this.aCanvas1.getSize().width;
		this.anInt3251 = this.aCanvas1.getSize().height;
		this.anIntArray117 = new int[this.anInt3251 * this.anInt3250];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray117, this.anIntArray117.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt3250, this.anInt3251), local36, null);
		this.anImage1 = new BufferedImage(local44, local54, false, new Hashtable());
	}
}
