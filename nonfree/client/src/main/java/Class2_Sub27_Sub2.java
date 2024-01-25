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

@OriginalClass("client!og")
public final class Class2_Sub27_Sub2 extends Class2_Sub27 {

	@OriginalMember(owner = "client!og", name = "o", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V")
	@Override
	public void method6243(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		this.aCanvas11 = arg1;
		this.aRectangle1 = new Rectangle();
		this.anInt7426 = arg2;
		this.anInt7427 = arg0;
		this.anIntArray501 = new int[this.anInt7426 * this.anInt7427];
		@Pc(34) DataBufferInt local34 = new DataBufferInt(this.anIntArray501, this.anIntArray501.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt7426, this.anInt7427), local34, null);
		this.anImage13 = new BufferedImage(local42, local52, false, new Hashtable());
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZILjava/awt/Graphics;I)V")
	@Override
	public void method6242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Graphics arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg5.getClip();
		this.aRectangle1.width = arg2;
		this.aRectangle1.x = arg4;
		this.aRectangle1.y = arg6;
		this.aRectangle1.height = arg1;
		arg5.setClip(this.aRectangle1);
		arg5.drawImage(this.anImage13, arg4 - arg3, -arg0 + arg6, this.aCanvas11);
		arg5.setClip(this.aShape1);
	}
}
