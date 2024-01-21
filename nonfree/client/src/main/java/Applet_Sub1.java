import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!pc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static60.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!pc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static24.anApplet_Sub1_2 == this && !Static39.aBoolean47) {
			Static24.aLong64 = 0L;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method336(@OriginalArg(1) String arg0) {
		if (this.aBoolean29) {
			return;
		}
		this.aBoolean29 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	protected final void method337(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			Static113.anInt2573 = 472;
			Static32.anInt874 = 503;
			Static10.anInt225 = 765;
			Static24.anApplet_Sub1_2 = this;
			Static107.aFrame1 = new Frame();
			Static107.aFrame1.setTitle("Jagex");
			Static107.aFrame1.setResizable(false);
			Static107.aFrame1.addWindowListener(this);
			Static107.aFrame1.setVisible(true);
			Static107.aFrame1.toFront();
			@Pc(33) Insets local33 = Static107.aFrame1.getInsets();
			Static107.aFrame1.setSize(local33.left + local33.right + 765, local33.bottom + 503 + local33.top);
			Static125.aClass40_4 = Static93.aClass40_3 = new Class40(true, null, arg1, arg0, 16);
			Static93.aClass40_3.method951(this, 1);
		} catch (@Pc(69) Exception local69) {
			Static79.method1133(local69, null);
		}
	}

	@OriginalMember(owner = "client!pc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static107.aFrame1 == null) {
			return Static93.aClass40_3 == null || Static93.aClass40_3.anApplet1 == this ? super.getDocumentBase() : Static93.aClass40_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	protected abstract void method340();

	@OriginalMember(owner = "client!pc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	private void method342() {
		@Pc(6) long local6 = Static27.method497();
		@Pc(10) long local10 = Static127.aLongArray7[Static116.anInt2608];
		Static127.aLongArray7[Static116.anInt2608] = local6;
		if ((long) 0 != local10 && local10 < local6) {
			@Pc(33) int local33 = (int) (local6 - local10);
			Static78.anInt1847 = ((local33 >> 1) + 32000) / local33;
		}
		Static116.anInt2608 = Static116.anInt2608 + 1 & 0x1F;
		if (Static95.anInt2253++ > 50) {
			Static39.aBoolean46 = true;
			Static95.anInt2253 -= 50;
			Static119.aCanvas1.setSize(Static10.anInt225, Static32.anInt874);
			Static119.aCanvas1.setVisible(true);
			if (Static107.aFrame1 == null) {
				Static119.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(74) Insets local74 = Static107.aFrame1.getInsets();
				Static119.aCanvas1.setLocation(local74.left, local74.top);
			}
		}
		this.method353();
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	private synchronized void method344() {
		if (Static39.aBoolean47) {
			return;
		}
		Static39.aBoolean47 = true;
		try {
			Static119.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method340();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static107.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static93.aClass40_3 != null) {
			try {
				Static93.aClass40_3.method943();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method348();
	}

	@OriginalMember(owner = "client!pc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static60.aBoolean62 = true;
		Static39.aBoolean46 = true;
	}

	@OriginalMember(owner = "client!pc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static63.aString2 != null) {
				@Pc(10) String local10 = Static63.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static63.aString3;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method336("wrongjava");
						return;
					}
					Static106.anInt2431 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static63.aString3 == null || Static63.aString3.equals("1.4.2"))) {
					this.method336("wrongjava");
					return;
				}
			}
			if (Static93.aClass40_3.anApplet1 != null) {
				@Pc(68) Method local68 = Static63.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static93.aClass40_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method350();
			Static31.aClass62_1 = Static70.method1050(Static119.aCanvas1, Static32.anInt874, Static10.anInt225);
			this.method347();
			Static50.aClass3_1 = Static19.method357();
			while (Static24.aLong64 == 0L || Static24.aLong64 > Static27.method497()) {
				Static62.anInt1589 = Static50.aClass3_1.method1485(Static106.anInt2431, Static64.anInt2065);
				for (@Pc(109) int local109 = 0; local109 < Static62.anInt1589; local109++) {
					this.method351();
				}
				this.method342();
				Static51.method766(Static93.aClass40_3, Static119.aCanvas1);
			}
		} catch (@Pc(138) Exception local138) {
			Static79.method1133(local138, null);
			this.method336("crash");
		}
		this.method344();
	}

	@OriginalMember(owner = "client!pc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static24.anApplet_Sub1_2 == this && !Static39.aBoolean47) {
			Static24.aLong64 = Static27.method497();
			Static107.method1511(5000L);
			Static125.aClass40_4 = null;
			this.method344();
		}
	}

	@OriginalMember(owner = "client!pc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static107.aFrame1 == null) {
			return Static93.aClass40_3 == null || Static93.aClass40_3.anApplet1 == this ? super.getParameter(arg0) : Static93.aClass40_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static107.aFrame1 == null) {
			return Static93.aClass40_3 == null || Static93.aClass40_3.anApplet1 == this ? super.getCodeBase() : Static93.aClass40_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static24.anApplet_Sub1_2 != this || Static39.aBoolean47) {
			return;
		}
		Static39.aBoolean46 = true;
		if (Static63.aString3 != null && Static63.aString3.startsWith("1.5") && Static27.method497() - Static36.aLong31 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static10.anInt225 && Static32.anInt874 <= local30.height) {
				Static124.aBoolean109 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Z")
	protected final boolean method346() {
		@Pc(4) String local4 = this.getDocumentBase().getHost().toLowerCase();
		if (local4.equals("jagex.com") || local4.endsWith(".jagex.com")) {
			return true;
		} else if (local4.equals("runescape.com") || local4.endsWith(".runescape.com")) {
			return true;
		} else if (local4.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local4.length() > 0 && local4.charAt(local4.length() - 1) >= '0' && local4.charAt(local4.length() - 1) <= '9') {
				local4 = local4.substring(0, local4.length() - 1);
			}
			if (local4.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method336("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static24.anApplet_Sub1_2 == this && !Static39.aBoolean47) {
			Static24.aLong64 = Static27.method497() + 4000L;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	protected abstract void method347();

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	protected abstract void method348();

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
	protected abstract void method349();

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	protected final synchronized void method350() {
		@Pc(15) Container local15;
		if (Static107.aFrame1 == null) {
			local15 = Static93.aClass40_3.anApplet1;
		} else {
			local15 = Static107.aFrame1;
		}
		if (Static119.aCanvas1 != null) {
			Static119.aCanvas1.removeFocusListener(this);
			local15.remove(Static119.aCanvas1);
		}
		Static119.aCanvas1 = new Canvas_Sub1(this);
		local15.add(Static119.aCanvas1);
		Static119.aCanvas1.setSize(Static10.anInt225, Static32.anInt874);
		Static119.aCanvas1.setVisible(true);
		if (Static107.aFrame1 == null) {
			Static119.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static107.aFrame1.getInsets();
			Static119.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static119.aCanvas1.addFocusListener(this);
		Static119.aCanvas1.requestFocus();
		Static39.aBoolean46 = true;
		Static124.aBoolean109 = false;
		Static36.aLong31 = Static27.method497();
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
	private void method351() {
		@Pc(7) long local7 = Static111.aLongArray8[Static22.anInt2547];
		@Pc(10) long local10 = Static27.method497();
		Static111.aLongArray8[Static22.anInt2547] = local10;
		Static22.anInt2547 = Static22.anInt2547 + 1 & 0x1F;
		@Pc(33) boolean local33;
		if (local7 == 0L || local10 <= local7) {
			local33 = false;
		} else {
			local33 = true;
		}
		synchronized (this) {
			Static108.aBoolean99 = Static60.aBoolean62;
		}
		this.method349();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZII)V")
	protected final void method352(@OriginalArg(4) int arg0) {
		try {
			if (Static24.anApplet_Sub1_2 == null) {
				Static24.anApplet_Sub1_2 = this;
				Static10.anInt225 = 765;
				Static32.anInt874 = 503;
				Static113.anInt2573 = 472;
				if (Static93.aClass40_3 == null) {
					Static125.aClass40_4 = Static93.aClass40_3 = new Class40(false, this, arg0, null, 0);
				}
				Static93.aClass40_3.method951(this, 1);
			} else {
				Static31.anInt861++;
				if (Static31.anInt861 >= 3) {
					this.method336("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(59) Exception local59) {
			Static79.method1133(local59, null);
			this.method336("crash");
		}
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	protected abstract void method353();

	@OriginalMember(owner = "client!pc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static107.aFrame1 == null) {
			return Static93.aClass40_3 == null || Static93.aClass40_3.anApplet1 == this ? super.getAppletContext() : Static93.aClass40_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
