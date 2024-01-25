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

@OriginalClass("client!rha")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 implements ImageProducer {

	@OriginalMember(owner = "client!rha", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!rha", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!rha", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!rha", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
	private synchronized void method6781() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt8242, super.anInt8241, this.aColorModel1, super.anIntArray439, 0, super.anInt8242);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	@Override
	public void method6778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		super.anInt8242 = arg0;
		super.anInt8241 = arg1;
		this.aCanvas9 = arg2;
		super.anIntArray439 = new int[super.anInt8241 * super.anInt8242];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas9.createImage(this);
		this.method6781();
		this.aCanvas9.prepareImage(this.anImage3, this.aCanvas9);
		this.method6781();
		this.aCanvas9.prepareImage(this.anImage3, this.aCanvas9);
		this.method6781();
		this.aCanvas9.prepareImage(this.anImage3, this.aCanvas9);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
	@Override
	public void method6780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method6783(arg2, arg0, arg6, arg1);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg5, arg3, arg6, arg0);
		arg4.drawImage(this.anImage3, arg5 - arg2, -arg1 + arg3, this.aCanvas9);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!rha", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt8242, super.anInt8241);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!rha", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!rha", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!rha", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!rha", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIIII)V")
	private synchronized void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg2, arg1, this.aColorModel1, super.anIntArray439, super.anInt8242 * arg3 + arg0, super.anInt8242);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
