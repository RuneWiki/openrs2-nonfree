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

@OriginalClass("client!bfa")
public final class Class1_Sub11_Sub1 extends Class1_Sub11 {

	@OriginalMember(owner = "client!bfa", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!bfa", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!bfa", name = "v", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!bfa", name = "w", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	@Override
	public void method7779(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7777(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt9558 = this.aCanvas1.getSize().width;
		this.anInt9561 = this.aCanvas1.getSize().height;
		this.anIntArray602 = new int[this.anInt9558 * this.anInt9561];
		@Pc(42) DataBufferInt local42 = new DataBufferInt(this.anIntArray602, this.anIntArray602.length);
		@Pc(50) DirectColorModel local50 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(60) WritableRaster local60 = Raster.createWritableRaster(local50.createCompatibleSampleModel(this.anInt9558, this.anInt9561), local42, null);
		this.anImage1 = new BufferedImage(local50, local60, false, new Hashtable());
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.y = arg0;
		this.aRectangle1.x = arg3;
		this.aRectangle1.height = arg4;
		this.aRectangle1.width = arg1;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg2.setClip(this.aShape1);
	}
}
