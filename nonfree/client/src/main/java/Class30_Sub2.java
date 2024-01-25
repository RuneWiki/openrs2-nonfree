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

@OriginalClass("client!pk")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	@Override
	public void method4463(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method4460(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.height = arg4;
		this.aRectangle1.y = arg2;
		this.aRectangle1.x = arg3;
		this.aRectangle1.width = arg0;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage2, 0, 0, this.aCanvas5);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method4462(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5277 = this.aCanvas5.getSize().width;
		this.anInt5276 = this.aCanvas5.getSize().height;
		this.anIntArray411 = new int[this.anInt5277 * this.anInt5276];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray411, this.anIntArray411.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt5277, this.anInt5276), local36, null);
		this.anImage2 = new BufferedImage(local44, local61, false, new Hashtable());
	}
}
