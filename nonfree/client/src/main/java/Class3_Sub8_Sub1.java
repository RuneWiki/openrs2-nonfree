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

@OriginalClass("client!hu")
public final class Class3_Sub8_Sub1 extends Class3_Sub8 {

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4) {
		this.aShape1 = arg4.getClip();
		this.aRectangle1.width = arg3;
		this.aRectangle1.x = arg0;
		this.aRectangle1.y = arg2;
		this.aRectangle1.height = arg1;
		arg4.setClip(this.aRectangle1);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas3);
		arg4.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2872(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method2876(@OriginalArg(1) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt3342 = this.aCanvas3.getSize().width;
		this.anInt3346 = this.aCanvas3.getSize().height;
		this.anIntArray197 = new int[this.anInt3346 * this.anInt3342];
		@Pc(48) DataBufferInt local48 = new DataBufferInt(this.anIntArray197, this.anIntArray197.length);
		@Pc(56) DirectColorModel local56 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(66) WritableRaster local66 = Raster.createWritableRaster(local56.createCompatibleSampleModel(this.anInt3342, this.anInt3346), local48, null);
		this.anImage2 = new BufferedImage(local56, local66, false, new Hashtable());
	}
}
