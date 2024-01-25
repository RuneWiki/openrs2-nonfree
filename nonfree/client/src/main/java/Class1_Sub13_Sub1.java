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

@OriginalClass("client!gp")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 implements ImageProducer {

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!gp", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!gp", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	static {
		new Class45("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	private synchronized void method2916() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9491, super.anInt9492, this.aColorModel1, super.anIntArray833, 0, super.anInt9491);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!gp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!gp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	@Override
	public void method8178(@OriginalArg(2) Graphics arg0) {
		this.method2916();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas7);
	}

	@OriginalMember(owner = "client!gp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
	@Override
	public void method8177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2918(arg0, arg1, arg4, arg3);
		@Pc(18) Shape local18 = arg2.getClip();
		arg2.clipRect(arg4, arg3, arg0, arg1);
		arg2.drawImage(this.anImage1, 0, 0, this.aCanvas7);
		arg2.setClip(local18);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg3, arg0, arg1, this.aColorModel1, super.anIntArray833, arg2 + super.anInt9491 * arg3, super.anInt9491);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!gp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9491, super.anInt9492);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!gp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method8181(@OriginalArg(1) Canvas arg0) {
		this.aCanvas7 = arg0;
		super.anInt9491 = this.aCanvas7.getSize().width;
		super.anInt9492 = this.aCanvas7.getSize().height;
		super.anIntArray833 = new int[super.anInt9491 * super.anInt9492];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas7.createImage(this);
		this.method2916();
		this.aCanvas7.prepareImage(this.anImage1, this.aCanvas7);
		this.method2916();
		this.aCanvas7.prepareImage(this.anImage1, this.aCanvas7);
		this.method2916();
		this.aCanvas7.prepareImage(this.anImage1, this.aCanvas7);
	}
}
