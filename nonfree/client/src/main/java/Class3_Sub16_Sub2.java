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

@OriginalClass("client!wa")
public final class Class3_Sub16_Sub2 extends Class3_Sub16 {

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5830(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.height = arg2;
		this.aRectangle1.x = arg1;
		this.aRectangle1.width = arg4;
		this.aRectangle1.y = arg3;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas7);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	@Override
	public void method5825(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas7);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5831(@OriginalArg(1) Canvas arg0) {
		this.aCanvas7 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt7443 = this.aCanvas7.getSize().width;
		this.anInt7442 = this.aCanvas7.getSize().height;
		this.anIntArray562 = new int[this.anInt7443 * this.anInt7442];
		@Pc(48) DataBufferInt local48 = new DataBufferInt(this.anIntArray562, this.anIntArray562.length);
		@Pc(56) DirectColorModel local56 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(66) WritableRaster local66 = Raster.createWritableRaster(local56.createCompatibleSampleModel(this.anInt7443, this.anInt7442), local48, null);
		this.anImage3 = new BufferedImage(local56, local66, false, new Hashtable());
	}
}
