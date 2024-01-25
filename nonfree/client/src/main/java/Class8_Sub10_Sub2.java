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

@OriginalClass("client!gq")
public final class Class8_Sub10_Sub2 extends Class8_Sub10 implements ImageProducer {

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
	@Override
	public void method3523(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method3526(arg2, arg4, arg1, arg6);
		@Pc(18) Shape local18 = arg0.getClip();
		arg0.clipRect(arg3, arg5, arg2, arg4);
		arg0.drawImage(this.anImage6, arg3 - arg6, arg5 - arg1, this.aCanvas6);
		arg0.setClip(local18);
	}

	@OriginalMember(owner = "client!gq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4339, super.anInt4338);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Canvas;IZI)V")
	@Override
	public void method3520(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt4338 = arg2;
		super.anInt4339 = arg1;
		this.aCanvas6 = arg0;
		super.anIntArray237 = new int[super.anInt4338 * super.anInt4339];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage6 = this.aCanvas6.createImage(this);
		this.method3525();
		this.aCanvas6.prepareImage(this.anImage6, this.aCanvas6);
		this.method3525();
		this.aCanvas6.prepareImage(this.anImage6, this.aCanvas6);
		this.method3525();
		this.aCanvas6.prepareImage(this.anImage6, this.aCanvas6);
	}

	@OriginalMember(owner = "client!gq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!gq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
	private synchronized void method3525() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4339, super.anInt4338, this.aColorModel1, super.anIntArray237, 0, super.anInt4339);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)V")
	private synchronized void method3526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray237, arg3 + super.anInt4339 * arg2, super.anInt4339);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!gq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
