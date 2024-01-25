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

@OriginalClass("client!oo")
public final class Class12_Sub5_Sub1 extends Class12_Sub5 implements ImageProducer {

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!oo", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!oo", name = "H", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!oo", name = "I", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	@Override
	public void method7565(@OriginalArg(2) Graphics arg0) {
		this.method5601();
		arg0.drawImage(this.anImage9, 0, 0, this.aCanvas12);
	}

	@OriginalMember(owner = "client!oo", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!oo", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	private synchronized void method5601() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9178, super.anInt9182, this.aColorModel1, super.anIntArray674, 0, super.anInt9178);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!oo", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9178, super.anInt9182);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!oo", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/awt/Graphics;IIZII)V")
	@Override
	public void method7570(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5604(arg2, arg3, arg1, arg4);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg4, arg2, arg1, arg3);
		arg0.drawImage(this.anImage9, 0, 0, this.aCanvas12);
		arg0.setClip(local13);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7567(@OriginalArg(1) Canvas arg0) {
		this.aCanvas12 = arg0;
		super.anInt9178 = this.aCanvas12.getSize().width;
		super.anInt9182 = this.aCanvas12.getSize().height;
		super.anIntArray674 = new int[super.anInt9182 * super.anInt9178];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage9 = this.aCanvas12.createImage(this);
		this.method5601();
		this.aCanvas12.prepareImage(this.anImage9, this.aCanvas12);
		this.method5601();
		this.aCanvas12.prepareImage(this.anImage9, this.aCanvas12);
		this.method5601();
		this.aCanvas12.prepareImage(this.anImage9, this.aCanvas12);
	}

	@OriginalMember(owner = "client!oo", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIII)V")
	private synchronized void method5604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg0, arg2, arg1, this.aColorModel1, super.anIntArray674, arg0 * super.anInt9178 + arg3, super.anInt9178);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
