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

@OriginalClass("client!hv")
public final class Class1_Sub22_Sub1 extends Class1_Sub22 {

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	@Override
	public void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.height = arg2;
		this.aRectangle1.width = arg4;
		this.aRectangle1.x = arg0;
		this.aRectangle1.y = arg1;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas8);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	@Override
	public void method5313(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas8);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5315(@OriginalArg(0) Canvas arg0) {
		this.aCanvas8 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt6138 = this.aCanvas8.getSize().width;
		this.anInt6140 = this.aCanvas8.getSize().height;
		this.anIntArray455 = new int[this.anInt6140 * this.anInt6138];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray455, this.anIntArray455.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt6138, this.anInt6140), local36, null);
		this.anImage1 = new BufferedImage(local44, local58, false, new Hashtable());
	}
}
