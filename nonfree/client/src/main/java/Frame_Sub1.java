import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FLFIRZAJ")
public final class Frame_Sub1 extends Frame {

	@OriginalMember(owner = "client!FLFIRZAJ", name = "a", descriptor = "Z")
	private boolean aBoolean37 = true;

	@OriginalMember(owner = "client!FLFIRZAJ", name = "b", descriptor = "Lclient!CMOCHGYM;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!FLFIRZAJ", name = "<init>", descriptor = "(Lclient!CMOCHGYM;III)V")
	public Frame_Sub1(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anApplet_Sub1_1 = arg0;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg1 + 8, arg2 + 28);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("66432, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FLFIRZAJ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@OriginalMember(owner = "client!FLFIRZAJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_1.update(arg0);
	}

	@OriginalMember(owner = "client!FLFIRZAJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_1.paint(arg0);
	}
}
