import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class2_Sub24_Sub1 extends Class2_Sub24 implements ImageProducer {

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!ir", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ir", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ir", name = "H", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method5586(@OriginalArg(0) Canvas arg0) {
		this.aCanvas6 = arg0;
		super.anInt6743 = this.aCanvas6.getSize().width;
		super.anInt6744 = this.aCanvas6.getSize().height;
		super.anIntArray433 = new int[super.anInt6744 * super.anInt6743];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage11 = this.aCanvas6.createImage(this);
		this.method3390();
		this.aCanvas6.prepareImage(this.anImage11, this.aCanvas6);
		this.method3390();
		this.aCanvas6.prepareImage(this.anImage11, this.aCanvas6);
		this.method3390();
		this.aCanvas6.prepareImage(this.anImage11, this.aCanvas6);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method5585(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method3388(arg4, arg3, arg0, arg2);
		@Pc(19) Shape local19 = arg1.getClip();
		arg1.clipRect(arg0, arg4, arg3, arg2);
		arg1.drawImage(this.anImage11, 0, 0, this.aCanvas6);
		arg1.setClip(local19);
	}

	@OriginalMember(owner = "client!ir", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ir", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIZI)V")
	private synchronized void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg1, arg3, this.aColorModel1, super.anIntArray433, arg2 + arg0 * super.anInt6743, super.anInt6743);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ir", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6743, super.anInt6744);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ir", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	private synchronized void method3390() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6743, super.anInt6744, this.aColorModel1, super.anIntArray433, 0, super.anInt6743);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	@Override
	public void method5587(@OriginalArg(1) Graphics arg0) {
		this.method3390();
		arg0.drawImage(this.anImage11, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!ir", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}
}
