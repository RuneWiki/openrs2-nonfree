import java.awt.Frame;
import java.awt.Graphics;
import sign.signlink;

public final class Frame_Sub1 extends Frame {

	private int anInt56 = 8;

	Applet_Sub1 anApplet_Sub1_1;

	public Frame_Sub1(int arg0, int arg1, Applet_Sub1 arg2, int arg3) {
		try {
			if (arg1 != 35731) {
				this.anInt56 = -475;
			}
			this.anApplet_Sub1_1 = arg2;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg3 + 8, arg0 + 28);
		} catch (RuntimeException var6) {
			signlink.reporterror("51818, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		this.anApplet_Sub1_1.update(arg0);
	}

	public final void paint(Graphics arg0) {
		this.anApplet_Sub1_1.paint(arg0);
	}
}
