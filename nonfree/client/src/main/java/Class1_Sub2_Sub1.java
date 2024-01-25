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

@OriginalClass("client!hm")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 implements ImageProducer {

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!hm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7368, super.anInt7369);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method5565(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		super.anInt7368 = this.aCanvas5.getSize().width;
		super.anInt7369 = this.aCanvas5.getSize().height;
		super.anIntArray489 = new int[super.anInt7368 * super.anInt7369];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas5.createImage(this);
		this.method2194();
		this.aCanvas5.prepareImage(this.anImage1, this.aCanvas5);
		this.method2194();
		this.aCanvas5.prepareImage(this.anImage1, this.aCanvas5);
		this.method2194();
		this.aCanvas5.prepareImage(this.anImage1, this.aCanvas5);
	}

	@OriginalMember(owner = "client!hm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg2, arg0, this.aColorModel1, super.anIntArray489, super.anInt7368 * arg3 + arg1, super.anInt7368);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
	@Override
	public void method5564(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2192(arg1, arg2, arg3, arg4);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg2, arg4, arg3, arg1);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas5);
		arg0.setClip(local13);
	}

	@OriginalMember(owner = "client!hm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!hm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
	@Override
	public void method5563(@OriginalArg(1) Graphics arg0) {
		this.method2194();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V")
	private synchronized void method2194() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7368, super.anInt7369, this.aColorModel1, super.anIntArray489, 0, super.anInt7368);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
