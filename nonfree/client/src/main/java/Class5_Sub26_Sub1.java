import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class5_Sub26_Sub1 extends Class5_Sub26 implements ImageProducer {

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!hm", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	private synchronized void method3631() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4454, super.anInt4455, this.aColorModel1, super.anIntArray230, 0, super.anInt4454);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIBII)V")
	private synchronized void method3632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg0, arg1, arg2, this.aColorModel1, super.anIntArray230, super.anInt4454 * arg0 + arg3, super.anInt4454);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!hm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	@Override
	public void method3764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		this.aCanvas8 = arg2;
		super.anInt4454 = arg1;
		super.anInt4455 = arg0;
		super.anIntArray230 = new int[super.anInt4455 * super.anInt4454];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage11 = this.aCanvas8.createImage(this);
		this.method3631();
		this.aCanvas8.prepareImage(this.anImage11, this.aCanvas8);
		this.method3631();
		this.aCanvas8.prepareImage(this.anImage11, this.aCanvas8);
		this.method3631();
		this.aCanvas8.prepareImage(this.anImage11, this.aCanvas8);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILjava/awt/Graphics;IIIII)V")
	@Override
	public void method3763(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method3632(arg4, arg2, arg3, arg0);
		@Pc(18) Shape local18 = arg1.getClip();
		arg1.clipRect(arg5, arg6, arg2, arg3);
		arg1.drawImage(this.anImage11, arg5 - arg0, -arg4 + arg6, this.aCanvas8);
		arg1.setClip(local18);
	}

	@OriginalMember(owner = "client!hm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4454, super.anInt4455);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!hm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!hm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
