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

@OriginalClass("client!jd")
public final class Class2_Sub17_Sub2 extends Class2_Sub17 {

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method3774(@OriginalArg(1) Canvas arg0) {
		this.aCanvas6 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4543 = this.aCanvas6.getSize().width;
		this.anInt4544 = this.aCanvas6.getSize().height;
		this.anIntArray302 = new int[this.anInt4544 * this.anInt4543];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray302, this.anIntArray302.length);
		@Pc(54) DirectColorModel local54 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(64) WritableRaster local64 = Raster.createWritableRaster(local54.createCompatibleSampleModel(this.anInt4543, this.anInt4544), local36, null);
		this.anImage13 = new BufferedImage(local54, local64, false, new Hashtable());
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
	@Override
	public void method3778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.x = arg1;
		this.aRectangle1.width = arg2;
		this.aRectangle1.height = arg4;
		this.aRectangle1.y = arg0;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage13, 0, 0, this.aCanvas6);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	@Override
	public void method3777(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage13, 0, 0, this.aCanvas6);
	}
}
