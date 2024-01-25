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

@OriginalClass("client!bq")
public final class Class3_Sub2 extends Class3 implements ImageProducer {

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	static {
		new Class85("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!bq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIB)V")
	private synchronized void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg0, arg2, this.aColorModel1, super.anIntArray69, arg1 + super.anInt608 * arg3, super.anInt608);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIILjava/awt/Graphics;B)V")
	@Override
	public void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4) {
		this.method552(arg0, arg3, arg2, arg1);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg3, arg1, arg0, arg2);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas2);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method551(@OriginalArg(2) Graphics arg0) {
		this.method553();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V")
	private synchronized void method553() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt608, super.anInt605, this.aColorModel1, super.anIntArray69, 0, super.anInt608);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt608, super.anInt605);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!bq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!bq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	@Override
	public void method548(@OriginalArg(1) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt608 = this.aCanvas2.getSize().width;
		super.anInt605 = this.aCanvas2.getSize().height;
		super.anIntArray69 = new int[super.anInt605 * super.anInt608];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas2.createImage(this);
		this.method553();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method553();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method553();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
	}

	@OriginalMember(owner = "client!bq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
