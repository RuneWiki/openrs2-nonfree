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

@OriginalClass("client!se")
public final class Class70_Sub1 extends Class70 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!se", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!se", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!se", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3671, super.anInt3670);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	private synchronized void method2792() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3671, super.anInt3670, this.aColorModel1, super.anIntArray619, 0, super.anInt3671);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!se", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIIII)V")
	private synchronized void method2795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg3, arg2, this.aColorModel1, super.anIntArray619, arg1 + super.anInt3671 * arg0, super.anInt3671);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method2797(@OriginalArg(0) Graphics arg0) {
		this.method2792();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!se", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method2800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		super.anInt3671 = arg0;
		super.anIntArray619 = new int[arg1 * arg0 + 1];
		super.anInt3670 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg2.createImage(this);
		this.method2792();
		arg2.prepareImage(super.anImage4, this);
		this.method2792();
		arg2.prepareImage(super.anImage4, this);
		this.method2792();
		arg2.prepareImage(super.anImage4, this);
		this.method2798();
	}

	@OriginalMember(owner = "client!se", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	@Override
	public void method2802(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2795(arg3, arg1, arg2, arg4);
		@Pc(21) Shape local21 = arg0.getClip();
		arg0.clipRect(arg1, arg3, arg4, arg2);
		arg0.drawImage(super.anImage4, 0, 0, this);
		arg0.setClip(local21);
	}
}
