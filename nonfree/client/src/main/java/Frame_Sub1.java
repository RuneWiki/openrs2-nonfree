import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZQDWDFIV")
public final class Frame_Sub1 extends Frame {

	@OriginalMember(owner = "client!ZQDWDFIV", name = "a", descriptor = "Lclient!UBLCAEEN;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!ZQDWDFIV", name = "<init>", descriptor = "(IIILclient!UBLCAEEN;)V")
	public Frame_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Applet_Sub1 arg3) {
		try {
			this.anApplet_Sub1_2 = arg3;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			this.toFront();
			@Pc(18) int local18 = 39 / arg1;
			this.resize(arg2 + 8, arg0 + 28);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("54233, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQDWDFIV", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@OriginalMember(owner = "client!ZQDWDFIV", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.update(arg0);
	}

	@OriginalMember(owner = "client!ZQDWDFIV", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.paint(arg0);
	}
}
