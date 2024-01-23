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

@OriginalClass("client!cc")
public final class Class19_Sub1 extends Class19 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	@Override
	public void method883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		super.anIntArray71 = new int[arg1 * arg0 + 1];
		super.anInt1218 = arg0;
		super.anInt1216 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg2.createImage(this);
		this.method500();
		arg2.prepareImage(super.anImage4, this);
		this.method500();
		arg2.prepareImage(super.anImage4, this);
		this.method500();
		arg2.prepareImage(super.anImage4, this);
		this.method885();
	}

	@OriginalMember(owner = "client!cc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt1218, super.anInt1216);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!cc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIIILjava/awt/Graphics;)V")
	@Override
	public void method882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method499(arg0, arg1, arg2, arg3);
		@Pc(18) Shape local18 = arg4.getClip();
		arg4.clipRect(arg2, arg1, arg0, arg3);
		arg4.drawImage(super.anImage4, 0, 0, this);
		arg4.setClip(local18);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method888(@OriginalArg(3) Graphics arg0) {
		this.method500();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!cc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
	private synchronized void method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg0, arg3, this.aColorModel1, super.anIntArray71, super.anInt1218 * arg1 + arg2, super.anInt1218);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	private synchronized void method500() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt1218, super.anInt1216, this.aColorModel1, super.anIntArray71, 0, super.anInt1218);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!cc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
