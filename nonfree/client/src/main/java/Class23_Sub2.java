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

@OriginalClass("client!me")
public final class Class23_Sub2 extends Class23 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!me", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBII)V")
	private synchronized void method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg2, arg3, this.aColorModel1, super.anIntArray249, arg0 + arg1 * super.anInt2868, super.anInt2868);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!me", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!me", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	private synchronized void method2208() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2868, super.anInt2866, this.aColorModel1, super.anIntArray249, 0, super.anInt2868);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!me", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	@Override
	public void method2198(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anIntArray249 = new int[arg2 * arg1 + 1];
		super.anInt2868 = arg2;
		super.anInt2866 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg0.createImage(this);
		this.method2208();
		arg0.prepareImage(super.anImage4, this);
		this.method2208();
		arg0.prepareImage(super.anImage4, this);
		this.method2208();
		arg0.prepareImage(super.anImage4, this);
		this.method2204();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
	@Override
	public void method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2207(arg4, arg3, arg1, arg0);
		@Pc(9) Shape local9 = arg2.getClip();
		arg2.clipRect(arg4, arg3, arg1, arg0);
		arg2.drawImage(super.anImage4, 0, 0, this);
		arg2.setClip(local9);
	}

	@OriginalMember(owner = "client!me", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2868, super.anInt2866);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!me", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method2205(@OriginalArg(0) Graphics arg0) {
		this.method2208();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}
}
