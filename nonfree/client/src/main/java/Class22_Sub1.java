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

@OriginalClass("client!nh")
public final class Class22_Sub1 extends Class22 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!nh", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!nh", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
	private synchronized void method1974() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3227, super.anInt3234, this.aColorModel1, super.anIntArray236, 0, super.anInt3227);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3227, super.anInt3234);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!nh", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!nh", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method2337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		super.anInt3227 = arg0;
		super.anIntArray236 = new int[arg1 * arg0 + 1];
		super.anInt3234 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage3 = arg2.createImage(this);
		this.method1974();
		arg2.prepareImage(super.anImage3, this);
		this.method1974();
		arg2.prepareImage(super.anImage3, this);
		this.method1974();
		arg2.prepareImage(super.anImage3, this);
		this.method2341();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2338(@OriginalArg(1) Graphics arg0) {
		this.method1974();
		arg0.drawImage(super.anImage3, 0, 0, this);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIB)V")
	private synchronized void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg3, arg0, this.aColorModel1, super.anIntArray236, super.anInt3227 * arg1 + arg2, super.anInt3227);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2342(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1979(arg4, arg0, arg2, arg3);
		@Pc(17) Shape local17 = arg1.getClip();
		arg1.clipRect(arg2, arg0, arg3, arg4);
		arg1.drawImage(super.anImage3, 0, 0, this);
		arg1.setClip(local17);
	}

	@OriginalMember(owner = "client!nh", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
