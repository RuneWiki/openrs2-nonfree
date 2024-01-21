import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BLPTISPL")
public final class Frame_Sub1 extends Frame {

	@OriginalMember(owner = "client!BLPTISPL", name = "a", descriptor = "I")
	private int anInt62 = -38597;

	@OriginalMember(owner = "client!BLPTISPL", name = "b", descriptor = "Lclient!NCIKLCII;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!BLPTISPL", name = "<init>", descriptor = "(IILclient!NCIKLCII;I)V")
	public Frame_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Applet_Sub1 arg2, @OriginalArg(3) int arg3) {
		try {
			this.anApplet_Sub1_1 = arg2;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg3 + 8, arg1 + 28);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("882, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BLPTISPL", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@OriginalMember(owner = "client!BLPTISPL", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_1.update(arg0);
	}

	@OriginalMember(owner = "client!BLPTISPL", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_1.paint(arg0);
	}
}
