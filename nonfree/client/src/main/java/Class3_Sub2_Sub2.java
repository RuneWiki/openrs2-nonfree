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

@OriginalClass("client!vea")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vea", name = "x", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!vea", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!vea", name = "z", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!vea", name = "A", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas15;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method8080(@OriginalArg(0) Canvas arg0) {
		this.aCanvas15 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt9945 = this.aCanvas15.getSize().width;
		this.anInt9943 = this.aCanvas15.getSize().height;
		this.anIntArray656 = new int[this.anInt9945 * this.anInt9943];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray656, this.anIntArray656.length);
		@Pc(44) DirectColorModel local44 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(54) WritableRaster local54 = Raster.createWritableRaster(local44.createCompatibleSampleModel(this.anInt9945, this.anInt9943), local36, null);
		this.anImage13 = new BufferedImage(local44, local54, false, new Hashtable());
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.y = arg2;
		this.aRectangle1.height = arg0;
		this.aRectangle1.width = arg1;
		this.aRectangle1.x = arg4;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage13, 0, 0, this.aCanvas15);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method8074(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage13, 0, 0, this.aCanvas15);
	}
}
