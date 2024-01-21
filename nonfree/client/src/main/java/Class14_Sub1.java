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

@OriginalClass("client!de")
public final class Class14_Sub1 extends Class14 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!de", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
	@Override
	public void method3032(@OriginalArg(2) Graphics arg0) {
		this.method933();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!de", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	@Override
	public void method3033(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt4130 = arg1;
		super.anIntArray455 = new int[arg2 * arg1 + 1];
		super.anInt4129 = arg2;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg0.createImage(this);
		this.method933();
		arg0.prepareImage(super.anImage4, this);
		this.method933();
		arg0.prepareImage(super.anImage4, this);
		this.method933();
		arg0.prepareImage(super.anImage4, this);
		this.method3036();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
	private synchronized void method932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg2, arg3, this.aColorModel1, super.anIntArray455, super.anInt4129 * arg1 + arg0, super.anInt4129);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!de", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
	@Override
	public void method3031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method932(arg4, arg2, arg0, arg1);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg4, arg2, arg0, arg1);
		arg3.drawImage(super.anImage4, 0, 0, this);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
	private synchronized void method933() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4129, super.anInt4130, this.aColorModel1, super.anIntArray455, 0, super.anInt4129);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!de", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!de", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4129, super.anInt4130);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!de", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!de", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
