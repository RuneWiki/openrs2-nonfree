import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YVSOOFAD")
public final class Frame_Sub1 extends Frame {

	@OriginalMember(owner = "client!YVSOOFAD", name = "a", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!YVSOOFAD", name = "b", descriptor = "Lclient!AYIVJZQQ;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!YVSOOFAD", name = "<init>", descriptor = "(IILclient!AYIVJZQQ;Z)V")
	public Frame_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Applet_Sub1 arg2, @OriginalArg(3) boolean arg3) {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg1 + 8, arg0 + 28);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("75175, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVSOOFAD", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@OriginalMember(owner = "client!YVSOOFAD", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.update(arg0);
	}

	@OriginalMember(owner = "client!YVSOOFAD", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.paint(arg0);
	}
}
