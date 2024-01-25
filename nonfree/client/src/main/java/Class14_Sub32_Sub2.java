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

@OriginalClass("client!vk")
public final class Class14_Sub32_Sub2 extends Class14_Sub32 implements ImageProducer {

	@OriginalMember(owner = "client!vk", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!vk", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!vk", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage15;

	@OriginalMember(owner = "client!vk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/awt/Canvas;ZII)V")
	@Override
	public void method9117(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt10670 = arg2;
		this.aCanvas13 = arg0;
		super.anInt10672 = arg1;
		super.anIntArray568 = new int[super.anInt10672 * super.anInt10670];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage15 = this.aCanvas13.createImage(this);
		this.method9123();
		this.aCanvas13.prepareImage(this.anImage15, this.aCanvas13);
		this.method9123();
		this.aCanvas13.prepareImage(this.anImage15, this.aCanvas13);
		this.method9123();
		this.aCanvas13.prepareImage(this.anImage15, this.aCanvas13);
	}

	@OriginalMember(owner = "client!vk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt10672, super.anInt10670);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/awt/Graphics;IIIBII)V")
	@Override
	public void method9118(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method9121(arg2, arg0, arg4, arg5);
		@Pc(18) Shape local18 = arg1.getClip();
		arg1.clipRect(arg6, arg3, arg4, arg5);
		arg1.drawImage(this.anImage15, arg6 - arg0, arg3 + -arg2, this.aCanvas13);
		arg1.setClip(local18);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V")
	private synchronized void method9121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg2, arg3, this.aColorModel1, super.anIntArray568, arg1 + arg0 * super.anInt10672, super.anInt10672);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!vk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
	private synchronized void method9123() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt10672, super.anInt10670, this.aColorModel1, super.anIntArray568, 0, super.anInt10672);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
