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

@OriginalClass("client!ea")
public final class Class6_Sub16_Sub1 extends Class6_Sub16 {

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5956(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt7174 = this.aCanvas2.getSize().width;
		this.anInt7173 = this.aCanvas2.getSize().height;
		this.anIntArray574 = new int[this.anInt7174 * this.anInt7173];
		@Pc(40) DataBufferInt local40 = new DataBufferInt(this.anIntArray574, this.anIntArray574.length);
		@Pc(48) DirectColorModel local48 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(58) WritableRaster local58 = Raster.createWritableRaster(local48.createCompatibleSampleModel(this.anInt7174, this.anInt7173), local40, null);
		this.anImage2 = new BufferedImage(local48, local58, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5951(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg0.getClip();
		this.aRectangle1.width = arg2;
		this.aRectangle1.y = arg4;
		this.aRectangle1.x = arg1;
		this.aRectangle1.height = arg3;
		arg0.setClip(this.aRectangle1);
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
		arg0.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	@Override
	public void method5952(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
	}
}
