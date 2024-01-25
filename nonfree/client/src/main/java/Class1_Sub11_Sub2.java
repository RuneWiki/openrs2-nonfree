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

@OriginalClass("client!sk")
public final class Class1_Sub11_Sub2 extends Class1_Sub11 {

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method5036(@OriginalArg(0) Canvas arg0) {
		this.aCanvas7 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt6235 = this.aCanvas7.getSize().width;
		this.anInt6233 = this.aCanvas7.getSize().height;
		this.anIntArray512 = new int[this.anInt6235 * this.anInt6233];
		@Pc(43) DataBufferInt local43 = new DataBufferInt(this.anIntArray512, this.anIntArray512.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt6235, this.anInt6233), local43, null);
		this.anImage3 = new BufferedImage(local51, local61, false, new Hashtable());
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method5037(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas7);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5038(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.x = arg3;
		this.aRectangle1.width = arg4;
		this.aRectangle1.y = arg2;
		this.aRectangle1.height = arg1;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas7);
		arg0.setClip(this.aShape1);
	}
}
