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

@OriginalClass("client!ds")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method3697(@OriginalArg(1) Canvas arg0) {
		this.aCanvas2 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4082 = this.aCanvas2.getSize().width;
		this.anInt4083 = this.aCanvas2.getSize().height;
		this.anIntArray370 = new int[this.anInt4082 * this.anInt4083];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray370, this.anIntArray370.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt4082, this.anInt4083), local36, null);
		this.anImage2 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method3702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.width = arg3;
		this.aRectangle1.y = arg0;
		this.aRectangle1.height = arg2;
		this.aRectangle1.x = arg1;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas2);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	@Override
	public void method3696(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
	}
}
