import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Canvas_Sub1 extends Canvas implements WindowListener {

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Ljava/applet/Applet;")
	private final Applet anApplet2;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Ljava/awt/Frame;")
	private final Frame aFrame1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/applet/Applet;II)V")
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

	@OriginalMember(owner = "client!k", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.anApplet2.destroy();
	}

	@OriginalMember(owner = "client!k", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.anApplet2.update(arg0);
	}

	@OriginalMember(owner = "client!k", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.anApplet2.paint(arg0);
	}
}
