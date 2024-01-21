import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HAQQOONQ")
public final class Frame_Sub1 extends Frame {

	@OriginalMember(owner = "client!HAQQOONQ", name = "a", descriptor = "Lclient!KWRIFYWM;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!HAQQOONQ", name = "<init>", descriptor = "(ILclient!KWRIFYWM;ZI)V")
	public Frame_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			this.anApplet_Sub1_1 = arg1;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg3 + 8, arg0 + 28);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("98025, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HAQQOONQ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@OriginalMember(owner = "client!HAQQOONQ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_1.update(arg0);
	}

	@OriginalMember(owner = "client!HAQQOONQ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_1.paint(arg0);
	}
}
