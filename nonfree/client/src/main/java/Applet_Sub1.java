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

@OriginalClass("client!ld")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ld", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static79.aFrame1 == null) {
			return Static8.aClass43_1 == null || Static8.aClass43_1.anApplet1 == this ? super.getParameter(arg0) : Static8.aClass43_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static79.aFrame1 == null) {
			return Static8.aClass43_1 == null || Static8.aClass43_1.anApplet1 == this ? super.getCodeBase() : Static8.aClass43_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBII)V")
	protected final void method380(@OriginalArg(0) int arg0) {
		try {
			if (Static108.anApplet_Sub1_1 == null) {
				Static31.anInt927 = 765;
				Static26.anInt765 = 503;
				Static5.anInt75 = 455;
				Static108.anApplet_Sub1_1 = this;
				if (Static8.aClass43_1 == null) {
					Static87.aClass43_3 = Static8.aClass43_1 = new Class43(false, this, arg0, null, 0);
				}
				Static8.aClass43_1.method1093(1, this);
			} else {
				Static46.anInt2271++;
				if (Static46.anInt2271 >= 3) {
					this.method391("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(57) Exception local57) {
			Static61.method1200(null, local57);
			this.method391("crash");
		}
	}

	@OriginalMember(owner = "client!ld", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	protected abstract void method381();

	@OriginalMember(owner = "client!ld", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static108.anApplet_Sub1_1 == this && !Static83.aBoolean103) {
			Static103.aLong81 = 0L;
		}
	}

	@OriginalMember(owner = "client!ld", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ld", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static79.aFrame1 == null) {
			return Static8.aClass43_1 == null || Static8.aClass43_1.anApplet1 == this ? super.getDocumentBase() : Static8.aClass43_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static108.anApplet_Sub1_1 != this || Static83.aBoolean103) {
			return;
		}
		Static80.aBoolean98 = true;
		if (Static58.aString2 != null && Static58.aString2.startsWith("1.5") && Static38.method694() - Static56.aLong40 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || Static31.anInt927 <= local28.width && local28.height >= Static26.anInt765) {
				Static87.aBoolean109 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	private synchronized void method382() {
		if (Static83.aBoolean103) {
			return;
		}
		Static83.aBoolean103 = true;
		try {
			Static59.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method381();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static79.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static8.aClass43_1 != null) {
			try {
				Static8.aClass43_1.method1092();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method384();
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	private void method383() {
		@Pc(6) long local6 = Static38.method694();
		@Pc(10) long local10 = Static103.aLongArray29[Static62.anInt1810];
		@Pc(26) boolean local26;
		if (local10 == 0L || local6 <= local10) {
			local26 = false;
		} else {
			local26 = true;
		}
		Static103.aLongArray29[Static62.anInt1810] = local6;
		Static62.anInt1810 = Static62.anInt1810 + 1 & 0x1F;
		synchronized (this) {
			Static82.aBoolean101 = Static32.aBoolean48;
		}
		this.method392();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	protected abstract void method384();

	@OriginalMember(owner = "client!ld", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static108.anApplet_Sub1_1 == this && !Static83.aBoolean103) {
			Static103.aLong81 = Static38.method694() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ld", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	protected abstract void method386();

	@OriginalMember(owner = "client!ld", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
	protected final synchronized void method387() {
		@Pc(5) Container local5;
		if (Static79.aFrame1 == null) {
			local5 = Static8.aClass43_1.anApplet1;
		} else {
			local5 = Static79.aFrame1;
		}
		if (Static59.aCanvas1 != null) {
			Static59.aCanvas1.removeFocusListener(this);
			local5.remove(Static59.aCanvas1);
		}
		Static59.aCanvas1 = new Canvas_Sub1(this);
		local5.add(Static59.aCanvas1);
		Static59.aCanvas1.setSize(Static31.anInt927, Static26.anInt765);
		Static59.aCanvas1.setVisible(true);
		if (Static79.aFrame1 == null) {
			Static59.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static79.aFrame1.getInsets();
			Static59.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static59.aCanvas1.addFocusListener(this);
		Static59.aCanvas1.requestFocus();
		Static80.aBoolean98 = true;
		Static87.aBoolean109 = false;
		Static56.aLong40 = Static38.method694();
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
	private void method388() {
		@Pc(7) long local7 = Static111.aLongArray33[Static118.anInt2976];
		@Pc(10) long local10 = Static38.method694();
		Static111.aLongArray33[Static118.anInt2976] = local10;
		if ((long) 0 != local7 && local7 < local10) {
			@Pc(29) int local29 = (int) (local10 - local7);
			Static83.anInt2256 = ((local29 >> 1) + 32000) / local29;
		}
		Static118.anInt2976 = Static118.anInt2976 + 1 & 0x1F;
		if (Static63.anInt1814++ > 50) {
			Static80.aBoolean98 = true;
			Static63.anInt1814 -= 50;
			Static59.aCanvas1.setSize(Static31.anInt927, Static26.anInt765);
			Static59.aCanvas1.setVisible(true);
			if (Static79.aFrame1 == null) {
				Static59.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(76) Insets local76 = Static79.aFrame1.getInsets();
				Static59.aCanvas1.setLocation(local76.left, local76.top);
			}
		}
		this.method386();
	}

	@OriginalMember(owner = "client!ld", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ld", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ld", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method391(@OriginalArg(0) String arg0) {
		if (this.aBoolean24) {
			return;
		}
		this.aBoolean24 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
	protected abstract void method392();

	@OriginalMember(owner = "client!ld", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static79.aFrame1 == null) {
			return Static8.aClass43_1 == null || Static8.aClass43_1.anApplet1 == this ? super.getAppletContext() : Static8.aClass43_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)Z")
	protected final boolean method393() {
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
				this.method391("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static108.anApplet_Sub1_1 == this && !Static83.aBoolean103) {
			Static103.aLong81 = Static38.method694();
			Static68.method1266(5000L);
			Static87.aClass43_3 = null;
			this.method382();
		}
	}

	@OriginalMember(owner = "client!ld", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ld", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ld", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static32.aBoolean48 = false;
	}

	@OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static58.aString3 != null) {
				@Pc(10) String local10 = Static58.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static58.aString2;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method391("wrongjava");
						return;
					}
					Static115.anInt2914 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static58.aString2 == null || Static58.aString2.equals("1.4.2"))) {
					this.method391("wrongjava");
					return;
				}
			}
			if (Static8.aClass43_1.anApplet1 != null) {
				@Pc(67) Method local67 = Static58.aMethod1;
				if (local67 != null) {
					try {
						local67.invoke(Static8.aClass43_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method387();
			Static51.aClass30_9 = Static11.method235(Static26.anInt765, Static59.aCanvas1, Static31.anInt927);
			this.method396();
			Static16.aClass33_1 = Static66.method394();
			Static16.aClass33_1.method1517();
			while (Static103.aLong81 == 0L || Static38.method694() < Static103.aLong81) {
				Static16.anInt468 = Static16.aClass33_1.method1520(Static115.anInt2914, Static91.anInt2395);
				for (@Pc(111) int local111 = 0; local111 < Static16.anInt468; local111++) {
					this.method383();
				}
				this.method388();
				Static115.method1896(true);
			}
		} catch (@Pc(141) Exception local141) {
			Static61.method1200(null, local141);
			this.method391("crash");
		}
		this.method382();
	}

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)V")
	protected abstract void method396();

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;IBIIII)V")
	protected final void method397(@OriginalArg(0) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static108.anApplet_Sub1_1 = this;
			Static5.anInt75 = 455;
			Static31.anInt927 = 765;
			Static26.anInt765 = 503;
			Static79.aFrame1 = new Frame();
			Static79.aFrame1.setTitle("Jagex");
			Static79.aFrame1.setResizable(false);
			Static79.aFrame1.addWindowListener(this);
			Static79.aFrame1.setVisible(true);
			Static79.aFrame1.toFront();
			@Pc(37) Insets local37 = Static79.aFrame1.getInsets();
			Static79.aFrame1.setSize(local37.right + local37.left + 765, 503 - -local37.top - -local37.bottom);
			Static87.aClass43_3 = Static8.aClass43_1 = new Class43(true, null, arg1, arg0, 16);
			Static8.aClass43_1.method1093(1, this);
		} catch (@Pc(75) Exception local75) {
			Static61.method1200(null, local75);
		}
	}

	@OriginalMember(owner = "client!ld", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static32.aBoolean48 = true;
		Static80.aBoolean98 = true;
	}
}
