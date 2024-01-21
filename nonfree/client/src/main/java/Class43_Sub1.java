import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class43_Sub1 extends Class43 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!lb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		super.anIntArray395 = new int[arg1 * arg0 + 1];
		super.anInt2724 = arg0;
		super.anInt2728 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg2.createImage(this);
		this.method1114();
		arg2.prepareImage(super.anImage4, this);
		this.method1114();
		arg2.prepareImage(super.anImage4, this);
		this.method1114();
		arg2.prepareImage(super.anImage4, this);
		this.method1906();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
	private synchronized void method1113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg2, arg0, this.aColorModel1, super.anIntArray395, arg3 * super.anInt2728 + arg1, super.anInt2728);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1908(@OriginalArg(2) Graphics arg0) {
		this.method1114();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	private synchronized void method1114() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2728, super.anInt2724, this.aColorModel1, super.anIntArray395, 0, super.anInt2728);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!lb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2728, super.anInt2724);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!lb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIIILjava/awt/Graphics;)V")
	@Override
	public void method1907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method1113(arg2, arg0, arg3, arg1);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg0, arg1, arg3, arg2);
		arg4.drawImage(super.anImage4, 0, 0, this);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!lb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}
}
