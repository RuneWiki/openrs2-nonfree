import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CVFADBZV")
public final class Frame_Sub1 extends Frame {

	@OriginalMember(owner = "client!CVFADBZV", name = "a", descriptor = "I")
	private int anInt169 = -916;

	@OriginalMember(owner = "client!CVFADBZV", name = "b", descriptor = "Lclient!AHZQVBFX;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!CVFADBZV", name = "<init>", descriptor = "(ILclient!AHZQVBFX;II)V")
	public Frame_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anApplet_Sub1_1 = arg1;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg2 + 8, arg3 + 28);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("64493, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CVFADBZV", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@OriginalMember(owner = "client!CVFADBZV", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_1.update(arg0);
	}

	@OriginalMember(owner = "client!CVFADBZV", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_1.paint(arg0);
	}
}
