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

@OriginalClass("client!re")
public final class Class4_Sub22_Sub2 extends Class4_Sub22 implements ImageProducer {

	@OriginalMember(owner = "client!re", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!re", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!re", name = "F", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!re", name = "L", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	static {
		new Class83("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!re", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	private synchronized void method4610() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5857, super.anInt5856, this.aColorModel1, super.anIntArray409, 0, super.anInt5857);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZIII)V")
	private synchronized void method4611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg3, arg0, this.aColorModel1, super.anIntArray409, super.anInt5857 * arg2 + arg1, super.anInt5857);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!re", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method4608(@OriginalArg(3) Graphics arg0) {
		this.method4610();
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas7);
	}

	@OriginalMember(owner = "client!re", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
	@Override
	public void method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method4611(arg4, arg2, arg0, arg1);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg2, arg0, arg1, arg4);
		arg3.drawImage(this.anImage3, 0, 0, this.aCanvas7);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	@Override
	public void method4606(@OriginalArg(1) Canvas arg0) {
		this.aCanvas7 = arg0;
		super.anInt5857 = this.aCanvas7.getSize().width;
		super.anInt5856 = this.aCanvas7.getSize().height;
		super.anIntArray409 = new int[super.anInt5857 * super.anInt5856];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas7.createImage(this);
		this.method4610();
		this.aCanvas7.prepareImage(this.anImage3, this.aCanvas7);
		this.method4610();
		this.aCanvas7.prepareImage(this.anImage3, this.aCanvas7);
		this.method4610();
		this.aCanvas7.prepareImage(this.anImage3, this.aCanvas7);
	}

	@OriginalMember(owner = "client!re", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5857, super.anInt5856);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!re", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
