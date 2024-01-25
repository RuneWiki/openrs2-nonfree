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

@OriginalClass("client!pm")
public final class Class2_Sub24_Sub2 extends Class2_Sub24 {

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	@Override
	public void method5587(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage13, 0, 0, this.aCanvas9);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method5586(@OriginalArg(0) Canvas arg0) {
		this.aCanvas9 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt6743 = this.aCanvas9.getSize().width;
		this.anInt6744 = this.aCanvas9.getSize().height;
		this.anIntArray433 = new int[this.anInt6743 * this.anInt6744];
		@Pc(43) DataBufferInt local43 = new DataBufferInt(this.anIntArray433, this.anIntArray433.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt6743, this.anInt6744), local43, null);
		this.anImage13 = new BufferedImage(local51, local61, false, new Hashtable());
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method5585(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg1.getClip();
		this.aRectangle1.height = arg2;
		this.aRectangle1.y = arg4;
		this.aRectangle1.width = arg3;
		this.aRectangle1.x = arg0;
		arg1.setClip(this.aRectangle1);
		arg1.drawImage(this.anImage13, 0, 0, this.aCanvas9);
		arg1.setClip(this.aShape1);
	}
}
