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

@OriginalClass("client!wg")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
	@Override
	public void method5563(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas10);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
	@Override
	public void method5564(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.y = arg4;
		this.aRectangle1.width = arg3;
		this.aRectangle1.x = arg2;
		this.aRectangle1.height = arg1;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas10);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method5565(@OriginalArg(0) Canvas arg0) {
		this.aCanvas10 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt7368 = this.aCanvas10.getSize().width;
		this.anInt7369 = this.aCanvas10.getSize().height;
		this.anIntArray489 = new int[this.anInt7369 * this.anInt7368];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray489, this.anIntArray489.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt7368, this.anInt7369), local36, null);
		this.anImage3 = new BufferedImage(local51, local61, false, new Hashtable());
	}
}
