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

@OriginalClass("client!df")
public final class Class17_Sub1 extends Class17 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!df", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method1252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method660(arg0, arg2, arg3, arg1);
		@Pc(21) Shape local21 = arg4.getClip();
		arg4.clipRect(arg0, arg3, arg2, arg1);
		arg4.drawImage(super.anImage4, 0, 0, this);
		arg4.setClip(local21);
	}

	@OriginalMember(owner = "client!df", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!df", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	@Override
	public void method1247(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anIntArray158 = new int[arg1 * arg2 + 1];
		super.anInt1883 = arg1;
		super.anInt1881 = arg2;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg0.createImage(this);
		this.method661();
		arg0.prepareImage(super.anImage4, this);
		this.method661();
		arg0.prepareImage(super.anImage4, this);
		this.method661();
		arg0.prepareImage(super.anImage4, this);
		this.method1251();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBIII)V")
	private synchronized void method660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg2, arg1, arg3, this.aColorModel1, super.anIntArray158, arg0 + arg2 * super.anInt1883, super.anInt1883);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	private synchronized void method661() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt1883, super.anInt1881, this.aColorModel1, super.anIntArray158, 0, super.anInt1883);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!df", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	@Override
	public void method1250(@OriginalArg(1) Graphics arg0) {
		this.method661();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!df", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!df", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt1883, super.anInt1881);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}
}
