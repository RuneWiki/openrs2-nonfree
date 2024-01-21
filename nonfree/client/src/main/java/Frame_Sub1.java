import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JYOWNEXJ")
public final class Frame_Sub1 extends Frame {

	@OriginalMember(owner = "client!JYOWNEXJ", name = "a", descriptor = "Lclient!OFXQYNOM;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!JYOWNEXJ", name = "<init>", descriptor = "(ILclient!OFXQYNOM;II)V")
	public Frame_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg0 + 8, arg2 + 28);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("24169, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JYOWNEXJ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@OriginalMember(owner = "client!JYOWNEXJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.update(arg0);
	}

	@OriginalMember(owner = "client!JYOWNEXJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.paint(arg0);
	}
}
