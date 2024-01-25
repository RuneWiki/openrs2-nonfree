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

@OriginalClass("client!pb")
public final class Class6_Sub27_Sub1 extends Class6_Sub27 implements ImageProducer {

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!pb", name = "K", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!pb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!pb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	private synchronized void method6659() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7917, super.anInt7918, this.aColorModel1, super.anIntArray481, 0, super.anInt7917);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIZI)V")
	private synchronized void method6660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray481, arg2 * super.anInt7917 + arg3, super.anInt7917);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7917, super.anInt7918);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!pb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	@Override
	public void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method6660(arg0, arg1, arg3, arg6);
		@Pc(17) Shape local17 = arg4.getClip();
		arg4.clipRect(arg5, arg2, arg0, arg1);
		arg4.drawImage(this.anImage2, arg5 - arg6, -arg3 + arg2, this.aCanvas10);
		arg4.setClip(local17);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	@Override
	public void method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2) {
		this.aCanvas10 = arg2;
		super.anInt7917 = arg1;
		super.anInt7918 = arg0;
		super.anIntArray481 = new int[super.anInt7918 * super.anInt7917];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas10.createImage(this);
		this.method6659();
		this.aCanvas10.prepareImage(this.anImage2, this.aCanvas10);
		this.method6659();
		this.aCanvas10.prepareImage(this.anImage2, this.aCanvas10);
		this.method6659();
		this.aCanvas10.prepareImage(this.anImage2, this.aCanvas10);
	}
}
