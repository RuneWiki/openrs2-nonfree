import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import sign.signlink;

public final class Class32 implements ImageProducer, ImageObserver {

	private int anInt685 = 299;

	public int[] anIntArray197;

	public int anInt686;

	public int anInt687;

	ColorModel aColorModel1;

	ImageConsumer anImageConsumer1;

	public Image anImage1;

	public Class32(Component arg0, int arg1, int arg2, int arg3) {
		try {
			this.anInt686 = arg1;
			this.anInt687 = arg3;
			this.anIntArray197 = new int[arg1 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method465();
			arg0.prepareImage(this.anImage1, this);
			this.method465();
			arg0.prepareImage(this.anImage1, this);
			this.method465();
			int var7 = 96 / arg2;
			arg0.prepareImage(this.anImage1, this);
			this.method463((byte) 62);
		} catch (RuntimeException var6) {
			signlink.reporterror("56385, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method463(byte arg0) {
		try {
			if (arg0 != 62) {
				this.anInt685 = -283;
			}
			Class1_Sub3_Sub2.method354(this.anInt686, this.anIntArray197, -657, this.anInt687);
		} catch (RuntimeException var3) {
			signlink.reporterror("2756, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public void method464(int arg0, Graphics arg1, int arg2, int arg3) {
		try {
			if (arg3 == 5193) {
				this.method465();
				arg1.drawImage(this.anImage1, arg2, arg0, this);
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("13203, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt686, this.anInt687);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	public synchronized void method465() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt686, this.anInt687, this.aColorModel1, this.anIntArray197, 0, this.anInt686);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
