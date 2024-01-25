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

@OriginalClass("client!mga")
public final class Class5_Sub18_Sub2 extends Class5_Sub18 implements ImageProducer {

	@OriginalMember(owner = "client!mga", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!mga", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!mga", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!mga", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!mga", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6328, super.anInt6326);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V")
	private synchronized void method5410() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6328, super.anInt6326, this.aColorModel1, super.anIntArray346, 0, super.anInt6328);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mga", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IBIII)V")
	private synchronized void method5411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg2, arg1, this.aColorModel1, super.anIntArray346, super.anInt6328 * arg3 + arg0, super.anInt6328);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mga", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method5405(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6326 = arg2;
		super.anInt6328 = arg1;
		this.aCanvas8 = arg0;
		super.anIntArray346 = new int[super.anInt6328 * super.anInt6326];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage12 = this.aCanvas8.createImage(this);
		this.method5410();
		this.aCanvas8.prepareImage(this.anImage12, this.aCanvas8);
		this.method5410();
		this.aCanvas8.prepareImage(this.anImage12, this.aCanvas8);
		this.method5410();
		this.aCanvas8.prepareImage(this.anImage12, this.aCanvas8);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V")
	@Override
	public void method5406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5411(arg0, arg2, arg4, arg1);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg6, arg5, arg4, arg2);
		arg3.drawImage(this.anImage12, arg6 - arg0, -arg1 + arg5, this.aCanvas8);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!mga", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!mga", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
