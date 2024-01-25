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

@OriginalClass("client!bd")
public final class Class7_Sub5_Sub1 extends Class7_Sub5 implements ImageProducer {

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!bd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6466, super.anInt6469);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
	private synchronized void method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg2, arg0, this.aColorModel1, super.anIntArray577, super.anInt6466 * arg3 + arg1, super.anInt6466);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5134(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt6466 = this.aCanvas1.getSize().width;
		super.anInt6469 = this.aCanvas1.getSize().height;
		super.anIntArray577 = new int[super.anInt6469 * super.anInt6466];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method274();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method274();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method274();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}

	@OriginalMember(owner = "client!bd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)V")
	private synchronized void method274() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6466, super.anInt6469, this.aColorModel1, super.anIntArray577, 0, super.anInt6466);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method5130(@OriginalArg(2) Graphics arg0) {
		this.method274();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!bd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!bd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5132(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method273(arg4, arg2, arg3, arg1);
		@Pc(18) Shape local18 = arg0.getClip();
		arg0.clipRect(arg2, arg1, arg3, arg4);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg0.setClip(local18);
	}
}
