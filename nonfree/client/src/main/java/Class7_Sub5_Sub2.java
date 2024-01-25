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

@OriginalClass("client!uj")
public final class Class7_Sub5_Sub2 extends Class7_Sub5 {

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5132(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.height = arg4;
		this.aRectangle1.x = arg2;
		this.aRectangle1.width = arg3;
		this.aRectangle1.y = arg1;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method5130(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5134(@OriginalArg(1) Canvas arg0) {
		this.aCanvas4 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt6466 = this.aCanvas4.getSize().width;
		this.anInt6469 = this.aCanvas4.getSize().height;
		this.anIntArray577 = new int[this.anInt6469 * this.anInt6466];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray577, this.anIntArray577.length);
		@Pc(52) DirectColorModel local52 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local52.createCompatibleSampleModel(this.anInt6466, this.anInt6469), local36, null);
		this.anImage3 = new BufferedImage(local52, local62, false, new Hashtable());
	}
}
