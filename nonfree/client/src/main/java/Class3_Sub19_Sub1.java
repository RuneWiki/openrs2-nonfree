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

@OriginalClass("client!ec")
public final class Class3_Sub19_Sub1 extends Class3_Sub19 {

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	@Override
	public void method6858(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method6861(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt8143 = this.aCanvas4.getSize().width;
		this.anInt8145 = this.aCanvas4.getSize().height;
		this.anIntArray623 = new int[this.anInt8145 * this.anInt8143];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray623, this.anIntArray623.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt8143, this.anInt8145), local40, null);
		this.anImage1 = new BufferedImage(local48, local58, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method6860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.height = arg1;
		this.aRectangle1.x = arg4;
		this.aRectangle1.y = arg0;
		this.aRectangle1.width = arg2;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas4);
		arg3.setClip(this.aShape1);
	}
}
