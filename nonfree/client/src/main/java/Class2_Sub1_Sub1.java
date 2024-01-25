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

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method152(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt132 = this.aCanvas1.getSize().width;
		this.anInt131 = this.aCanvas1.getSize().height;
		this.anIntArray15 = new int[this.anInt131 * this.anInt132];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray15, this.anIntArray15.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt132, this.anInt131), local40, null);
		this.anImage1 = new BufferedImage(local48, local58, false, new Hashtable());
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	@Override
	public void method151(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.width = arg2;
		this.aRectangle1.y = arg0;
		this.aRectangle1.x = arg3;
		this.aRectangle1.height = arg1;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg4.setClip(this.aShape1);
	}
}
