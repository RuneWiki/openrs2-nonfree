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

@OriginalClass("client!jp")
public final class Class6_Sub18_Sub2 extends Class6_Sub18 implements ImageProducer {

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!jp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZIII)V")
	private synchronized void method4131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg3, arg2, this.aColorModel1, super.anIntArray278, arg1 + arg0 * super.anInt4857, super.anInt4857);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!jp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4857, super.anInt4861);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	private synchronized void method4132() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4857, super.anInt4861, this.aColorModel1, super.anIntArray278, 0, super.anInt4857);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!jp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/awt/Canvas;IIB)V")
	@Override
	public void method4130(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt4861 = arg1;
		super.anInt4857 = arg2;
		this.aCanvas3 = arg0;
		super.anIntArray278 = new int[super.anInt4861 * super.anInt4857];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas3.createImage(this);
		this.method4132();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
		this.method4132();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
		this.method4132();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
	}

	@OriginalMember(owner = "client!jp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIBIILjava/awt/Graphics;)V")
	@Override
	public void method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Graphics arg6) {
		this.method4131(arg3, arg5, arg2, arg1);
		@Pc(13) Shape local13 = arg6.getClip();
		arg6.clipRect(arg4, arg0, arg1, arg2);
		arg6.drawImage(this.anImage2, arg4 - arg5, arg0 + -arg3, this.aCanvas3);
		arg6.setClip(local13);
	}
}
