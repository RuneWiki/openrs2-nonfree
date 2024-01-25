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

@OriginalClass("client!qc")
public final class Class6_Sub16_Sub2 extends Class6_Sub16 implements ImageProducer {

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas14;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	@Override
	public void method5952(@OriginalArg(2) Graphics arg0) {
		this.method5962();
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas14);
	}

	@OriginalMember(owner = "client!qc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7174, super.anInt7173);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
	private synchronized void method5958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg3, arg1, arg0, this.aColorModel1, super.anIntArray574, arg2 + arg3 * super.anInt7174, super.anInt7174);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5951(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5958(arg3, arg2, arg1, arg4);
		@Pc(17) Shape local17 = arg0.getClip();
		arg0.clipRect(arg1, arg4, arg2, arg3);
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas14);
		arg0.setClip(local17);
	}

	@OriginalMember(owner = "client!qc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!qc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5956(@OriginalArg(0) Canvas arg0) {
		this.aCanvas14 = arg0;
		super.anInt7174 = this.aCanvas14.getSize().width;
		super.anInt7173 = this.aCanvas14.getSize().height;
		super.anIntArray574 = new int[super.anInt7173 * super.anInt7174];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas14.createImage(this);
		this.method5962();
		this.aCanvas14.prepareImage(this.anImage3, this.aCanvas14);
		this.method5962();
		this.aCanvas14.prepareImage(this.anImage3, this.aCanvas14);
		this.method5962();
		this.aCanvas14.prepareImage(this.anImage3, this.aCanvas14);
	}

	@OriginalMember(owner = "client!qc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
	private synchronized void method5962() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7174, super.anInt7173, this.aColorModel1, super.anIntArray574, 0, super.anInt7174);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
