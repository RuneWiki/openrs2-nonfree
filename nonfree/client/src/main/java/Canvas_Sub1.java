import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Canvas_Sub1 extends Canvas implements WindowListener {

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_355 = Static12.method257("flash2:");

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!k", name = "x", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array23 = new Class40[200];

	@OriginalMember(owner = "client!k", name = "A", descriptor = "I")
	public static volatile int anInt1166 = 0;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Lclient!o;")
	public static Class40 aClass40_356 = Static12.method257("l");

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Lclient!o;")
	public static Class40 aClass40_357 = Static12.method257("Please remove ");

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Ljava/applet/Applet;")
	private final Applet anApplet2;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Ljava/awt/Frame;")
	private final Frame aFrame1;

	@OriginalMember(owner = "client!k", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 306)
	@Override
	public void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 313)
	@Override
	public void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.anApplet2.destroy();
	}

	@OriginalMember(owner = "client!k", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 330)
	@Override
	public void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 566)
	@Override
	public void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 575)
	@Override
	public void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 585)
	@Override
	public void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 594)
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet2.update(arg0);
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/applet/Applet;II)V", line = 649)
	public Canvas_Sub1(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anApplet2 = arg0;
		this.aFrame1 = new Frame();
		this.aFrame1.setTitle("Jagex");
		this.aFrame1.setResizable(false);
		this.setSize(arg1, arg2);
		this.aFrame1.add(this);
		this.aFrame1.pack();
		this.aFrame1.addWindowListener(this);
		this.aFrame1.setVisible(true);
		this.aFrame1.toFront();
	}

	@OriginalMember(owner = "client!k", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 669)
	@Override
	public void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 676)
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet2.paint(arg0);
	}
}
