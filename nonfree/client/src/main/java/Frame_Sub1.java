import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LQFUVOUC")
public final class Frame_Sub1 extends Frame {

	@OriginalMember(owner = "client!LQFUVOUC", name = "a", descriptor = "I")
	private int anInt416 = -965;

	@OriginalMember(owner = "client!LQFUVOUC", name = "b", descriptor = "Lclient!UNXTKTRJ;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!LQFUVOUC", name = "<init>", descriptor = "(BIILclient!UNXTKTRJ;)V")
	public Frame_Sub1(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Applet_Sub1 arg3) {
		try {
			this.anApplet_Sub1_2 = arg3;
			this.setTitle("Jagex");
			@Pc(15) boolean local15 = false;
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg1 + 8, arg2 + 28);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("9889, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQFUVOUC", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@OriginalMember(owner = "client!LQFUVOUC", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.update(arg0);
	}

	@OriginalMember(owner = "client!LQFUVOUC", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet_Sub1_2.paint(arg0);
	}
}
