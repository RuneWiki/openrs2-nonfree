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

@OriginalClass("client!no")
public final class Class1_Sub22_Sub2 extends Class1_Sub22 implements ImageProducer {

	@OriginalMember(owner = "client!no", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!no", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!no", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!no", name = "H", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	static {
		new Class114("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
		new Class114("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIII)V")
	private synchronized void method5317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg0, arg3, this.aColorModel1, super.anIntArray455, arg1 + super.anInt6138 * arg2, super.anInt6138);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!no", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5315(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = arg0;
		super.anInt6138 = this.aCanvas11.getSize().width;
		super.anInt6140 = this.aCanvas11.getSize().height;
		super.anIntArray455 = new int[super.anInt6138 * super.anInt6140];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas11.createImage(this);
		this.method5322();
		this.aCanvas11.prepareImage(this.anImage2, this.aCanvas11);
		this.method5322();
		this.aCanvas11.prepareImage(this.anImage2, this.aCanvas11);
		this.method5322();
		this.aCanvas11.prepareImage(this.anImage2, this.aCanvas11);
	}

	@OriginalMember(owner = "client!no", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!no", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6138, super.anInt6140);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	@Override
	public void method5313(@OriginalArg(3) Graphics arg0) {
		this.method5322();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas11);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	@Override
	public void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.method5317(arg4, arg0, arg1, arg2);
		@Pc(17) Shape local17 = arg3.getClip();
		arg3.clipRect(arg0, arg1, arg4, arg2);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas11);
		arg3.setClip(local17);
	}

	@OriginalMember(owner = "client!no", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	private synchronized void method5322() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6138, super.anInt6140, this.aColorModel1, super.anIntArray455, 0, super.anInt6138);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
