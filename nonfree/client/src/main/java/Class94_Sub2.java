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

@OriginalClass("client!nq")
public final class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method4039(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt4359 = this.aCanvas4.getSize().width;
		this.anInt4354 = this.aCanvas4.getSize().height;
		this.anIntArray350 = new int[this.anInt4359 * this.anInt4354];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray350, this.anIntArray350.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt4359, this.anInt4354), local36, null);
		this.anImage3 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
	@Override
	public void method4041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.x = arg2;
		this.aRectangle1.y = arg0;
		this.aRectangle1.width = arg1;
		this.aRectangle1.height = arg4;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage3, 0, 0, this.aCanvas4);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	@Override
	public void method4040(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
	}
}
