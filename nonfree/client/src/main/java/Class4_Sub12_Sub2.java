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

@OriginalClass("client!ou")
public final class Class4_Sub12_Sub2 extends Class4_Sub12 {

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method6129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.y = arg1;
		this.aRectangle1.width = arg4;
		this.aRectangle1.height = arg0;
		this.aRectangle1.x = arg2;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage3, 0, 0, this.aCanvas13);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method6131(@OriginalArg(1) Canvas arg0) {
		this.aCanvas13 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt7426 = this.aCanvas13.getSize().width;
		this.anInt7429 = this.aCanvas13.getSize().height;
		this.anIntArray376 = new int[this.anInt7429 * this.anInt7426];
		@Pc(44) DataBufferInt local44 = new DataBufferInt(this.anIntArray376, this.anIntArray376.length);
		@Pc(52) DirectColorModel local52 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local52.createCompatibleSampleModel(this.anInt7426, this.anInt7429), local44, null);
		this.anImage3 = new BufferedImage(local52, local62, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method6130(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas13);
	}
}
