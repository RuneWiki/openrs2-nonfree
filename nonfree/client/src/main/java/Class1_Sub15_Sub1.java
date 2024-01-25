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

@OriginalClass("client!me")
public final class Class1_Sub15_Sub1 extends Class1_Sub15 implements ImageProducer {

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!me", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!me", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9524, super.anInt9526);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!me", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
	private synchronized void method4865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg3, arg0, this.aColorModel1, super.anIntArray632, arg1 + super.anInt9524 * arg2, super.anInt9524);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!me", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	private synchronized void method4866() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9524, super.anInt9526, this.aColorModel1, super.anIntArray632, 0, super.anInt9524);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method7866(@OriginalArg(2) Graphics arg0) {
		this.method4866();
		arg0.drawImage(this.anImage12, 0, 0, this.aCanvas8);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method7870(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4865(arg2, arg0, arg3, arg4);
		@Pc(13) Shape local13 = arg1.getClip();
		arg1.clipRect(arg0, arg3, arg4, arg2);
		arg1.drawImage(this.anImage12, 0, 0, this.aCanvas8);
		arg1.setClip(local13);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	@Override
	public void method7867(@OriginalArg(1) Canvas arg0) {
		this.aCanvas8 = arg0;
		super.anInt9524 = this.aCanvas8.getSize().width;
		super.anInt9526 = this.aCanvas8.getSize().height;
		super.anIntArray632 = new int[super.anInt9524 * super.anInt9526];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage12 = this.aCanvas8.createImage(this);
		this.method4866();
		this.aCanvas8.prepareImage(this.anImage12, this.aCanvas8);
		this.method4866();
		this.aCanvas8.prepareImage(this.anImage12, this.aCanvas8);
		this.method4866();
		this.aCanvas8.prepareImage(this.anImage12, this.aCanvas8);
	}

	@OriginalMember(owner = "client!me", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
