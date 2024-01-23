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

@OriginalClass("client!oa")
public final class Class73_Sub2 extends Class73 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		super.anInt3858 = arg0;
		super.anIntArray283 = new int[arg1 * arg0 + 1];
		super.anInt3856 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg2.createImage(this);
		this.method2876();
		arg2.prepareImage(super.anImage4, this);
		this.method2876();
		arg2.prepareImage(super.anImage4, this);
		this.method2876();
		arg2.prepareImage(super.anImage4, this);
		this.method2864();
	}

	@OriginalMember(owner = "client!oa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	@Override
	public void method2867(@OriginalArg(3) Graphics arg0) {
		this.method2876();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2870(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2874(arg0, arg3, arg4, arg2);
		@Pc(18) Shape local18 = arg1.getClip();
		arg1.clipRect(arg4, arg3, arg0, arg2);
		arg1.drawImage(super.anImage4, 0, 0, this);
		arg1.setClip(local18);
	}

	@OriginalMember(owner = "client!oa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!oa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZII)V")
	private synchronized void method2874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg0, arg3, this.aColorModel1, super.anIntArray283, arg2 + super.anInt3858 * arg1, super.anInt3858);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
	private synchronized void method2876() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3858, super.anInt3856, this.aColorModel1, super.anIntArray283, 0, super.anInt3858);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!oa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3858, super.anInt3856);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}
}
