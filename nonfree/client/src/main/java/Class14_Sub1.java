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

@OriginalClass("client!ce")
public final class Class14_Sub1 extends Class14 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ce", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt1209, super.anInt1213);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ce", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ce", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method311(arg0, arg3, arg1, arg4);
		@Pc(15) Shape local15 = arg2.getClip();
		arg2.clipRect(arg4, arg1, arg3, arg0);
		arg2.drawImage(super.anImage3, 0, 0, this);
		arg2.setClip(local15);
	}

	@OriginalMember(owner = "client!ce", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	@Override
	public void method692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		super.anInt1209 = arg0;
		super.anInt1213 = arg1;
		super.anIntArray124 = new int[arg0 * arg1 + 1];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage3 = arg2.createImage(this);
		this.method309();
		arg2.prepareImage(super.anImage3, this);
		this.method309();
		arg2.prepareImage(super.anImage3, this);
		this.method309();
		arg2.prepareImage(super.anImage3, this);
		this.method687();
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	private synchronized void method309() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt1209, super.anInt1213, this.aColorModel1, super.anIntArray124, 0, super.anInt1209);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method690(@OriginalArg(0) Graphics arg0) {
		this.method309();
		arg0.drawImage(super.anImage3, 0, 0, this);
	}

	@OriginalMember(owner = "client!ce", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
	private synchronized void method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg1, arg0, this.aColorModel1, super.anIntArray124, super.anInt1209 * arg2 + arg3, super.anInt1209);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ce", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
