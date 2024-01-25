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

@OriginalClass("client!se")
public final class Class5_Sub34_Sub1 extends Class5_Sub34 {

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	@Override
	public void method6470(@OriginalArg(1) Canvas arg0) {
		this.aCanvas13 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt7959 = this.aCanvas13.getSize().width;
		this.anInt7960 = this.aCanvas13.getSize().height;
		this.anIntArray603 = new int[this.anInt7960 * this.anInt7959];
		@Pc(43) DataBufferInt local43 = new DataBufferInt(this.anIntArray603, this.anIntArray603.length);
		@Pc(51) DirectColorModel local51 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(61) WritableRaster local61 = Raster.createWritableRaster(local51.createCompatibleSampleModel(this.anInt7959, this.anInt7960), local43, null);
		this.anImage1 = new BufferedImage(local51, local61, false, new Hashtable());
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method6473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.height = arg4;
		this.aRectangle1.x = arg2;
		this.aRectangle1.y = arg0;
		this.aRectangle1.width = arg1;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas13);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method6471(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas13);
	}
}
