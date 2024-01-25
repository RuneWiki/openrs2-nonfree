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

@OriginalClass("client!wl")
public final class Class1_Sub17_Sub2 extends Class1_Sub17 {

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method5956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.x = arg0;
		this.aRectangle1.width = arg1;
		this.aRectangle1.height = arg3;
		this.aRectangle1.y = arg4;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage3, 0, 0, this.aCanvas7);
		arg2.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	@Override
	public void method5957(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas7);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5953(@OriginalArg(0) Canvas arg0) {
		this.aCanvas7 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt7727 = this.aCanvas7.getSize().width;
		this.anInt7726 = this.aCanvas7.getSize().height;
		this.anIntArray581 = new int[this.anInt7726 * this.anInt7727];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray581, this.anIntArray581.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt7727, this.anInt7726), local36, null);
		this.anImage3 = new BufferedImage(local44, local54, false, new Hashtable());
	}
}
