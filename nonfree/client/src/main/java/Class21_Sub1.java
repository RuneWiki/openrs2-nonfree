import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class21_Sub1 extends Class21 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!l", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!l", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!l", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		super.anIntArray212 = new int[arg0 * arg1 + 1];
		super.anInt2143 = arg1;
		super.anInt2141 = arg0;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage3 = arg2.createImage(this);
		this.method1092();
		arg2.prepareImage(super.anImage3, this);
		this.method1092();
		arg2.prepareImage(super.anImage3, this);
		this.method1092();
		arg2.prepareImage(super.anImage3, this);
		this.method1445();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	private synchronized void method1092() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2143, super.anInt2141, this.aColorModel1, super.anIntArray212, 0, super.anInt2143);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!l", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2143, super.anInt2141);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!l", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public void method1442(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		this.method1092();
		arg1.drawImage(super.anImage3, arg0, arg2, this);
	}

	@OriginalMember(owner = "client!l", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!l", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
