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

@OriginalClass("client!rc")
public final class Class99_Sub2 extends Class99 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
	@Override
	public void method3510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt4427 = arg1;
		this.anIntArray395 = new int[arg0 * arg1 + 1];
		this.anInt4431 = arg0;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage4 = arg2.createImage(this);
		this.method3523();
		arg2.prepareImage(this.anImage4, this);
		this.method3523();
		arg2.prepareImage(this.anImage4, this);
		this.method3523();
		arg2.prepareImage(this.anImage4, this);
		this.method3516();
	}

	@OriginalMember(owner = "client!rc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIIII)V")
	private synchronized void method3519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg2, arg3, this.aColorModel1, this.anIntArray395, arg0 + arg1 * this.anInt4427, this.anInt4427);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	private synchronized void method3523() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt4427, this.anInt4431, this.aColorModel1, this.anIntArray395, 0, this.anInt4427);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!rc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt4427, this.anInt4431);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!rc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	@Override
	public void method3515(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method3519(arg1, arg2, arg3, arg4);
		@Pc(17) Shape local17 = arg0.getClip();
		arg0.clipRect(arg1, arg2, arg3, arg4);
		arg0.drawImage(this.anImage4, 0, 0, this);
		arg0.setClip(local17);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method3514(@OriginalArg(2) Graphics arg0) {
		this.method3523();
		arg0.drawImage(this.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!rc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}
}
