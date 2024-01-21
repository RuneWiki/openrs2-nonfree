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

@OriginalClass("client!cg")
public final class Class14_Sub1 extends Class14 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method3221(@OriginalArg(0) Graphics arg0) {
		this.method575();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
	private synchronized void method573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg1, arg0, arg2, this.aColorModel1, super.anIntArray401, arg1 * super.anInt4220 + arg3, super.anInt4220);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!cg", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!cg", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
	private synchronized void method575() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4220, super.anInt4217, this.aColorModel1, super.anIntArray401, 0, super.anInt4220);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!cg", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!cg", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4220, super.anInt4217);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Graphics;IIIBI)V")
	@Override
	public void method3226(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method573(arg2, arg3, arg1, arg4);
		@Pc(9) Shape local9 = arg0.getClip();
		arg0.clipRect(arg4, arg3, arg2, arg1);
		arg0.drawImage(super.anImage4, 0, 0, this);
		arg0.setClip(local9);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method3224(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt4220 = arg1;
		super.anIntArray401 = new int[arg2 * arg1 + 1];
		super.anInt4217 = arg2;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg0.createImage(this);
		this.method575();
		arg0.prepareImage(super.anImage4, this);
		this.method575();
		arg0.prepareImage(super.anImage4, this);
		this.method575();
		arg0.prepareImage(super.anImage4, this);
		this.method3223();
	}
}
