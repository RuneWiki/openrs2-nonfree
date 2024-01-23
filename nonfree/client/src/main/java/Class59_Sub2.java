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

@OriginalClass("client!tm")
public final class Class59_Sub2 extends Class59 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!tm", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!tm", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!tm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt5202, this.anInt5201);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!tm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIIILjava/awt/Graphics;I)V")
	@Override
	public void method4277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method4289(arg4, arg0, arg1, arg2);
		@Pc(9) Shape local9 = arg3.getClip();
		arg3.clipRect(arg4, arg1, arg0, arg2);
		arg3.drawImage(this.anImage5, 0, 0, this);
		arg3.setClip(local9);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	private synchronized void method4283() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt5202, this.anInt5201, this.aColorModel1, this.anIntArray568, 0, this.anInt5202);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public void method4275(@OriginalArg(1) Graphics arg0) {
		this.method4283();
		arg0.drawImage(this.anImage5, 0, 0, this);
	}

	@OriginalMember(owner = "client!tm", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBII)V")
	private synchronized void method4289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg2, arg1, arg3, this.aColorModel1, this.anIntArray568, this.anInt5202 * arg2 + arg0, this.anInt5202);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!tm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	@Override
	public void method4279(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5202 = arg1;
		this.anInt5201 = arg2;
		this.anIntArray568 = new int[arg1 * arg2 + 1];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage5 = arg0.createImage(this);
		this.method4283();
		arg0.prepareImage(this.anImage5, this);
		this.method4283();
		arg0.prepareImage(this.anImage5, this);
		this.method4283();
		arg0.prepareImage(this.anImage5, this);
		this.method4281();
	}
}
