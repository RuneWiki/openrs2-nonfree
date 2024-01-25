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

@OriginalClass("client!c")
public final class Class28_Sub1 extends Class28 implements ImageProducer {

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!c", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method3790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method783(arg0, arg2, arg3, arg1);
		@Pc(20) Shape local20 = arg4.getClip();
		arg4.clipRect(arg1, arg3, arg0, arg2);
		arg4.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg4.setClip(local20);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	private synchronized void method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray356, arg3 + arg2 * super.anInt4116, super.anInt4116);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
	private synchronized void method784() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4116, super.anInt4118, this.aColorModel1, super.anIntArray356, 0, super.anInt4116);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!c", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4116, super.anInt4118);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!c", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!c", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method3789(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt4116 = this.aCanvas1.getSize().width;
		super.anInt4118 = this.aCanvas1.getSize().height;
		super.anIntArray356 = new int[super.anInt4116 * super.anInt4118];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method784();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method784();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method784();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method3787(@OriginalArg(2) Graphics arg0) {
		this.method784();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!c", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
