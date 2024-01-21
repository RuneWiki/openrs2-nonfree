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

@OriginalClass("client!mc")
public final class Class24_Sub2 extends Class24 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	private synchronized void method1751() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2155, super.anInt2152, this.aColorModel1, super.anIntArray207, 0, super.anInt2155);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIZI)V")
	private synchronized void method1752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray207, arg3 + super.anInt2155 * arg2, super.anInt2155);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1747(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		super.anIntArray207 = new int[arg2 * arg0 + 1];
		super.anInt2155 = arg0;
		super.anInt2152 = arg2;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage3 = arg1.createImage(this);
		this.method1751();
		arg1.prepareImage(super.anImage3, this);
		this.method1751();
		arg1.prepareImage(super.anImage3, this);
		this.method1751();
		arg1.prepareImage(super.anImage3, this);
		this.method1745();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1752(arg1, arg0, arg3, arg4);
		@Pc(9) Shape local9 = arg2.getClip();
		arg2.clipRect(arg4, arg3, arg1, arg0);
		arg2.drawImage(super.anImage3, 0, 0, this);
		arg2.setClip(local9);
	}

	@OriginalMember(owner = "client!mc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2155, super.anInt2152);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!mc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!mc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	@Override
	public void method1748(@OriginalArg(2) Graphics arg0) {
		this.method1751();
		arg0.drawImage(super.anImage3, 0, 0, this);
	}
}
