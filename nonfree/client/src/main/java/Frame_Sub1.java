import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GDXGVBDZ")
public final class Frame_Sub1 extends Frame {

	@OriginalMember(owner = "client!GDXGVBDZ", name = "a", descriptor = "I")
	private int anInt237 = -483;

	@OriginalMember(owner = "client!GDXGVBDZ", name = "b", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!GDXGVBDZ", name = "c", descriptor = "Lclient!EBSHSFRY;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!GDXGVBDZ", name = "<init>", descriptor = "(IILclient!EBSHSFRY;Z)V")
	public Frame_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Applet_Sub1 arg2, @OriginalArg(3) boolean arg3) {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg0 + 8, arg1 + 28);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("66369, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GDXGVBDZ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@OriginalMember(owner = "client!GDXGVBDZ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.update(arg0);
	}

	@OriginalMember(owner = "client!GDXGVBDZ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.paint(arg0);
	}
}
