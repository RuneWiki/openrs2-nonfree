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

@OriginalClass("client!g")
public final class Class11_Sub2 extends Class11 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!g", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method578(@OriginalArg(0) Graphics arg0) {
		this.method588();
		arg0.drawImage(super.anImage3, 0, 0, this);
	}

	@OriginalMember(owner = "client!g", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	private synchronized void method586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg1, arg2, this.aColorModel1, super.anIntArray104, super.anInt883 * arg3 + arg0, super.anInt883);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!g", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!g", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V")
	private synchronized void method588() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt883, super.anInt884, this.aColorModel1, super.anIntArray104, 0, super.anInt883);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		super.anIntArray104 = new int[arg1 * arg0 + 1];
		super.anInt883 = arg1;
		super.anInt884 = arg0;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage3 = arg2.createImage(this);
		this.method588();
		arg2.prepareImage(super.anImage3, this);
		this.method588();
		arg2.prepareImage(super.anImage3, this);
		this.method588();
		arg2.prepareImage(super.anImage3, this);
		this.method577();
	}

	@OriginalMember(owner = "client!g", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt883, super.anInt884);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method582(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method586(arg3, arg1, arg2, arg4);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(super.anImage3, 0, 0, this);
		arg0.setClip(local13);
	}

	@OriginalMember(owner = "client!g", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
