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

@OriginalClass("client!to")
public final class Class3_Sub28_Sub2 extends Class3_Sub28 {

	@OriginalMember(owner = "client!to", name = "q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method6899(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt8304 = this.aCanvas11.getSize().width;
		this.anInt8302 = this.aCanvas11.getSize().height;
		this.anIntArray531 = new int[this.anInt8304 * this.anInt8302];
		@Pc(44) DataBufferInt local44 = new DataBufferInt(this.anIntArray531, this.anIntArray531.length);
		@Pc(52) DirectColorModel local52 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local52.createCompatibleSampleModel(this.anInt8304, this.anInt8302), local44, null);
		this.anImage13 = new BufferedImage(local52, local62, false, new Hashtable());
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	@Override
	public void method6898(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage13, 0, 0, this.aCanvas11);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
	@Override
	public void method6900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.x = arg1;
		this.aRectangle1.height = arg3;
		this.aRectangle1.width = arg4;
		this.aRectangle1.y = arg0;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage13, 0, 0, this.aCanvas11);
		arg2.setClip(this.aShape1);
	}
}
