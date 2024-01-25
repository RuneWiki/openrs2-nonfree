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

@OriginalClass("client!eea")
public final class Class6_Sub13_Sub1 extends Class6_Sub13 {

	@OriginalMember(owner = "client!eea", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!eea", name = "w", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!eea", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!eea", name = "y", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
	@Override
	public void method7245(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.height = arg4;
		this.aRectangle1.y = arg0;
		this.aRectangle1.width = arg2;
		this.aRectangle1.x = arg3;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage1, 0, 0, this.aCanvas6);
		arg1.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method7246(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7241(@OriginalArg(1) Canvas arg0) {
		this.aCanvas6 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt8669 = this.aCanvas6.getSize().width;
		this.anInt8670 = this.aCanvas6.getSize().height;
		this.anIntArray729 = new int[this.anInt8670 * this.anInt8669];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray729, this.anIntArray729.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt8669, this.anInt8670), local40, null);
		this.anImage1 = new BufferedImage(local48, local58, false, new Hashtable());
	}
}
