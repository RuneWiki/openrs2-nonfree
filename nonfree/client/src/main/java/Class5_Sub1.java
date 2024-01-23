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

@OriginalClass("client!ad")
public final class Class5_Sub1 extends Class5 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	@Override
	public void method1981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		super.anInt2632 = arg1;
		super.anInt2633 = arg0;
		super.anIntArray332 = new int[arg1 * arg0 + 1];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage25 = arg2.createImage(this);
		this.method75();
		arg2.prepareImage(super.anImage25, this);
		this.method75();
		arg2.prepareImage(super.anImage25, this);
		this.method75();
		arg2.prepareImage(super.anImage25, this);
		this.method1979();
	}

	@OriginalMember(owner = "client!ad", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2632, super.anInt2633);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ad", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ad", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public void method1976(@OriginalArg(1) Graphics arg0) {
		this.method75();
		arg0.drawImage(super.anImage25, 0, 0, this);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	private synchronized void method75() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2632, super.anInt2633, this.aColorModel1, super.anIntArray332, 0, super.anInt2632);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIB)V")
	private synchronized void method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg3, arg2, this.aColorModel1, super.anIntArray332, arg1 * super.anInt2632 + arg0, super.anInt2632);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method76(arg2, arg0, arg3, arg1);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg2, arg0, arg1, arg3);
		arg4.drawImage(super.anImage25, 0, 0, this);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!ad", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}
}
