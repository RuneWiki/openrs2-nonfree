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

@OriginalClass("client!pp")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 implements ImageProducer {

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!pp", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!pp", name = "J", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!pp", name = "L", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
	private synchronized void method7480() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt8384, super.anInt8383, this.aColorModel1, super.anIntArray422, 0, super.anInt8384);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIZII)V")
	private synchronized void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray422, arg3 + arg2 * super.anInt8384, super.anInt8384);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIILjava/awt/Graphics;)V")
	@Override
	public void method7474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Graphics arg6) {
		this.method7481(arg4, arg0, arg1, arg3);
		@Pc(16) Shape local16 = arg6.getClip();
		arg6.clipRect(arg2, arg5, arg4, arg0);
		arg6.drawImage(this.anImage13, arg2 - arg3, arg5 - arg1, this.aCanvas11);
		arg6.setClip(local16);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILjava/awt/Canvas;B)V")
	@Override
	public void method7470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2) {
		super.anInt8384 = arg1;
		super.anInt8383 = arg0;
		this.aCanvas11 = arg2;
		super.anIntArray422 = new int[super.anInt8384 * super.anInt8383];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage13 = this.aCanvas11.createImage(this);
		this.method7480();
		this.aCanvas11.prepareImage(this.anImage13, this.aCanvas11);
		this.method7480();
		this.aCanvas11.prepareImage(this.anImage13, this.aCanvas11);
		this.method7480();
		this.aCanvas11.prepareImage(this.anImage13, this.aCanvas11);
	}

	@OriginalMember(owner = "client!pp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!pp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!pp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt8384, super.anInt8383);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!pp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
