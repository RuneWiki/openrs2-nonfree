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

@OriginalClass("client!ev")
public final class Class4_Sub14_Sub1 extends Class4_Sub14 {

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ev", name = "B", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.height = arg0;
		this.aRectangle1.x = arg1;
		this.aRectangle1.width = arg2;
		this.aRectangle1.y = arg4;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas5);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	@Override
	public void method2878(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method2877(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt3640 = this.aCanvas5.getSize().width;
		this.anInt3636 = this.aCanvas5.getSize().height;
		this.anIntArray179 = new int[this.anInt3640 * this.anInt3636];
		@Pc(43) DataBufferInt local43 = new DataBufferInt(this.anIntArray179, this.anIntArray179.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt3640, this.anInt3636), local43, null);
		this.anImage1 = new BufferedImage(local51, local61, false, new Hashtable());
	}
}
