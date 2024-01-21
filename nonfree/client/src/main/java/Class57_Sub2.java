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

@OriginalClass("client!q")
public final class Class57_Sub2 extends Class57 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!q", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!q", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!q", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method2169(@OriginalArg(2) Graphics arg0) {
		this.method2176();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BILjava/awt/Component;I)V")
	@Override
	public void method2173(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		super.anIntArray454 = new int[arg2 * arg0 + 1];
		super.anInt3063 = arg0;
		super.anInt3060 = arg2;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg1.createImage(this);
		this.method2176();
		arg1.prepareImage(super.anImage4, this);
		this.method2176();
		arg1.prepareImage(super.anImage4, this);
		this.method2176();
		arg1.prepareImage(super.anImage4, this);
		this.method2170();
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
	private synchronized void method2176() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3063, super.anInt3060, this.aColorModel1, super.anIntArray454, 0, super.anInt3063);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!q", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!q", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2171(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2178(arg3, arg0, arg4, arg2);
		@Pc(13) Shape local13 = arg1.getClip();
		arg1.clipRect(arg4, arg0, arg3, arg2);
		arg1.drawImage(super.anImage4, 0, 0, this);
		arg1.setClip(local13);
	}

	@OriginalMember(owner = "client!q", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3063, super.anInt3060);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIII)V")
	private synchronized void method2178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg0, arg3, this.aColorModel1, super.anIntArray454, arg2 + arg1 * super.anInt3063, super.anInt3063);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
