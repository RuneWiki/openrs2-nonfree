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

@OriginalClass("client!or")
public final class Class1_Sub30_Sub2 extends Class1_Sub30 {

	@OriginalMember(owner = "client!or", name = "u", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method4039(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5159 = this.aCanvas4.getSize().width;
		this.anInt5157 = this.aCanvas4.getSize().height;
		this.anIntArray338 = new int[this.anInt5157 * this.anInt5159];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray338, this.anIntArray338.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt5159, this.anInt5157), local40, null);
		this.anImage3 = new BufferedImage(local48, local58, false, new Hashtable());
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	@Override
	public void method4040(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.x = arg2;
		this.aRectangle1.width = arg4;
		this.aRectangle1.y = arg3;
		this.aRectangle1.height = arg1;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	@Override
	public void method4041(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
	}
}
