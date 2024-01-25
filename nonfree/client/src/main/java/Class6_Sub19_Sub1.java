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

@OriginalClass("client!fu")
public final class Class6_Sub19_Sub1 extends Class6_Sub19 implements ImageProducer {

	@OriginalMember(owner = "client!fu", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!fu", name = "J", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!fu", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
	private synchronized void method3224() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9382, super.anInt9388, this.aColorModel1, super.anIntArray495, 0, super.anInt9382);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljava/awt/Graphics;IBIIIII)V")
	@Override
	public void method7652(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method3225(arg4, arg3, arg2, arg5);
		@Pc(19) Shape local19 = arg0.getClip();
		arg0.clipRect(arg1, arg6, arg3, arg5);
		arg0.drawImage(this.anImage2, arg1 - arg2, -arg4 + arg6, this.aCanvas7);
		arg0.setClip(local19);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	@Override
	public void method7659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		super.anInt9382 = arg1;
		super.anInt9388 = arg0;
		this.aCanvas7 = arg2;
		super.anIntArray495 = new int[super.anInt9388 * super.anInt9382];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas7.createImage(this);
		this.method3224();
		this.aCanvas7.prepareImage(this.anImage2, this.aCanvas7);
		this.method3224();
		this.aCanvas7.prepareImage(this.anImage2, this.aCanvas7);
		this.method3224();
		this.aCanvas7.prepareImage(this.anImage2, this.aCanvas7);
	}

	@OriginalMember(owner = "client!fu", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BIIII)V")
	private synchronized void method3225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg1, arg3, this.aColorModel1, super.anIntArray495, super.anInt9382 * arg0 + arg2, super.anInt9382);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!fu", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9382, super.anInt9388);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!fu", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!fu", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
