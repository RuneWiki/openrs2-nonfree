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

@OriginalClass("client!e")
public final class Class23_Sub2 extends Class23 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!e", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt1238, this.anInt1239);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
	private synchronized void method1020() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt1238, this.anInt1239, this.aColorModel1, this.anIntArray144, 0, this.anInt1238);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!e", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!e", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	@Override
	public void method1010(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt1239 = arg1;
		this.anInt1238 = arg2;
		this.anIntArray144 = new int[arg2 * arg1 + 1];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = arg0.createImage(this);
		this.method1020();
		arg0.prepareImage(this.anImage3, this);
		this.method1020();
		arg0.prepareImage(this.anImage3, this);
		this.method1020();
		arg0.prepareImage(this.anImage3, this);
		this.method1012();
	}

	@OriginalMember(owner = "client!e", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!e", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1016(@OriginalArg(2) Graphics arg0) {
		this.method1020();
		arg0.drawImage(this.anImage3, 0, 0, this);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V")
	@Override
	public void method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method1025(arg2, arg0, arg4, arg1);
		@Pc(16) Shape local16 = arg3.getClip();
		arg3.clipRect(arg0, arg2, arg1, arg4);
		arg3.drawImage(this.anImage3, 0, 0, this);
		arg3.setClip(local16);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIB)V")
	private synchronized void method1025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg3, arg2, this.aColorModel1, this.anIntArray144, this.anInt1238 * arg0 + arg1, this.anInt1238);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!e", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
