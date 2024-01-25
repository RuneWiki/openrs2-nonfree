import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
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

@OriginalClass("client!lr")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!lr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static201.aBoolean344 = true;
		Static181.aBoolean317 = true;
	}

	@OriginalMember(owner = "client!lr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static11.anApplet_Sub1_5 != this || Static194.aBoolean339) {
			return;
		}
		Static181.aBoolean317 = true;
		if (Static94.aBoolean164 && Static349.method5647() - Static45.aLong42 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || Static328.anInt6274 <= local25.width && Static262.anInt5078 <= local25.height) {
				Static239.aBoolean390 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static232.aFrame3 == null) {
			return Static180.aClass110_6 == null || Static180.aClass110_6.anApplet1 == this ? super.getParameter(arg0) : Static180.aClass110_6.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!lr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	protected abstract void method1058();

	@OriginalMember(owner = "client!lr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static232.aFrame3 == null) {
			return Static180.aClass110_6 == null || Static180.aClass110_6.anApplet1 == this ? super.getAppletContext() : Static180.aClass110_6.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	private void method1060() {
		@Pc(6) long local6 = Static349.method5647();
		@Pc(10) long local10 = Static125.aLongArray6[Static87.anInt1720];
		Static125.aLongArray6[Static87.anInt1720] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(35) int local35 = (int) (local6 - local10);
			Static50.anInt1156 = ((local35 >> 1) + 32000) / local35;
		}
		Static87.anInt1720 = Static87.anInt1720 + 1 & 0x1F;
		if (Static71.anInt1458++ > 50) {
			Static71.anInt1458 -= 50;
			Static181.aBoolean317 = true;
			Static261.aCanvas4.setSize(Static11.anInt5389, Static320.anInt6140);
			Static261.aCanvas4.setVisible(true);
			if (Static232.aFrame3 != null && Static292.aFrame2 == null) {
				@Pc(76) Insets local76 = Static232.aFrame3.getInsets();
				Static261.aCanvas4.setLocation(local76.left + Static340.anInt3938, Static78.anInt1584 + local76.top);
			} else {
				Static261.aCanvas4.setLocation(Static340.anInt3938, Static78.anInt1584);
			}
		}
		this.method1062();
	}

	@OriginalMember(owner = "client!lr", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static11.anApplet_Sub1_5 == this && !Static194.aBoolean339) {
			Static24.aLong26 = Static349.method5647();
			Static134.method2598(5000L);
			Static40.aClass110_8 = null;
			this.method1073(false);
		}
	}

	@OriginalMember(owner = "client!lr", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static11.anApplet_Sub1_5 == this && !Static194.aBoolean339) {
			Static24.aLong26 = Static349.method5647() + 4000L;
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	protected abstract void method1061();

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V")
	protected abstract void method1062();

	@OriginalMember(owner = "client!lr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static232.aFrame3 == null) {
			return Static180.aClass110_6 == null || Static180.aClass110_6.anApplet1 == this ? super.getCodeBase() : Static180.aClass110_6.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static201.aBoolean344 = false;
	}

	@OriginalMember(owner = "client!lr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	private void method1063() {
		@Pc(6) long local6 = Static349.method5647();
		@Pc(10) long local10 = Static49.aLongArray1[Static193.anInt3953];
		Static49.aLongArray1[Static193.anInt3953] = local6;
		Static193.anInt3953 = Static193.anInt3953 + 1 & 0x1F;
		@Pc(34) boolean local34;
		if ((long) 0 == local10 || local6 <= local10) {
			local34 = false;
		} else {
			local34 = true;
		}
		synchronized (this) {
			Static20.aBoolean41 = Static201.aBoolean344;
		}
		this.method1066();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method1064(@OriginalArg(1) String arg0) {
		if (this.aBoolean100) {
			return;
		}
		this.aBoolean100 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static365.method4929(Static180.aClass110_6.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!lr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static232.aFrame3 == null) {
			return Static180.aClass110_6 == null || Static180.aClass110_6.anApplet1 == this ? super.getDocumentBase() : Static180.aClass110_6.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZIIBLjava/lang/String;I)V")
	protected final void method1065(@OriginalArg(4) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static11.anInt5389 = 1024;
			Static328.anInt6274 = 1024;
			Static320.anInt6140 = 768;
			Static262.anInt5078 = 768;
			Static11.anApplet_Sub1_5 = this;
			Static340.anInt3938 = 0;
			Static340.anInt3935 = 563;
			Static78.anInt1584 = 0;
			Static232.aFrame3 = new Frame();
			Static232.aFrame3.setTitle("Jagex");
			Static232.aFrame3.setResizable(true);
			Static232.aFrame3.addWindowListener(this);
			Static232.aFrame3.setVisible(true);
			Static232.aFrame3.toFront();
			@Pc(46) Insets local46 = Static232.aFrame3.getInsets();
			Static232.aFrame3.setSize(local46.right + Static328.anInt6274 + local46.left, local46.bottom + local46.top + Static262.anInt5078);
			Static40.aClass110_8 = Static180.aClass110_6 = new Class110(null, arg0, arg1, 29);
			@Pc(79) Class134 local79 = Static180.aClass110_6.method3379(1, this);
			while (local79.anInt4033 == 0) {
				Static134.method2598(10L);
			}
		} catch (@Pc(89) Exception local89) {
			Static152.method2899(null, local89);
		}
	}

	@OriginalMember(owner = "client!lr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	protected abstract void method1066();

	@OriginalMember(owner = "client!lr", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label110: {
				if (Static168.aString145 != null) {
					@Pc(6) String local6 = Static168.aString145.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(19) String local19 = Static168.aString142;
						if (local19.equals("1.1") || local19.startsWith("1.1.") || local19.equals("1.2") || local19.startsWith("1.2.")) {
							this.method1064("wrongjava");
							break label110;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static168.aString142 == null || Static168.aString142.equals("1.4.2"))) {
						this.method1064("wrongjava");
						break label110;
					}
				}
				@Pc(66) int local66;
				if (Static168.aString142 != null && Static168.aString142.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (local66 < Static168.aString142.length()) {
						@Pc(74) char local74 = Static168.aString142.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local66++;
						local68 = local74 + local68 * 10 - 48;
					}
					if (local68 >= 5) {
						Static94.aBoolean164 = true;
					}
				}
				if (Static180.aClass110_6.anApplet1 != null) {
					@Pc(108) Method local108 = Static168.aMethod1;
					if (local108 != null) {
						try {
							local108.invoke(Static180.aClass110_6.anApplet1, Boolean.TRUE);
						} catch (@Pc(123) Throwable local123) {
						}
					}
				}
				Static252.method4469();
				Static71.method1418();
				this.method1070();
				this.method1074();
				Static24.aClass37_1 = Static295.method5058();
				this.method1068();
				while (Static24.aLong26 == 0L || Static24.aLong26 > Static349.method5647()) {
					Static54.anInt3489 = Static24.aClass37_1.method3581(Static295.anInt5744);
					for (local66 = 0; local66 < Static54.anInt3489; local66++) {
						this.method1063();
					}
					this.method1060();
					if (Static156.anInt3120 == 1) {
						Static134.method2598(5L);
					}
					Static238.method4252(Static261.aCanvas4, Static180.aClass110_6);
				}
			}
		} catch (@Pc(186) Exception local186) {
			Static152.method2899(null, local186);
			this.method1064("crash");
		}
		this.method1073(true);
	}

	@OriginalMember(owner = "client!lr", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(Z)V")
	public final void method1068() {
		if (this.aBoolean99) {
			return;
		}
		try {
			@Pc(14) Class134 local14 = Static180.aClass110_6.method3377(Static11.anApplet_Sub1_5.getClass());
			while (local14.anInt4033 == 0) {
				Static134.method2598(100L);
			}
			if (local14.anObject6 != null) {
				throw (Throwable) local14.anObject6;
			}
			jagmisc.init();
			this.aBoolean99 = true;
			Static24.aClass37_1 = Static295.method5058();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)Z")
	protected final boolean method1069() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.equals("jagex.com") || local13.endsWith(".jagex.com")) {
			return true;
		} else if (local13.equals("runescape.com") || local13.endsWith(".runescape.com")) {
			return true;
		} else if (local13.equals("stellardawn.com") || local13.endsWith(".stellardawn.com")) {
			return true;
		} else if (local13.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local13.length() > 0 && local13.charAt(local13.length() - 1) >= '0' && local13.charAt(local13.length() - 1) <= '9') {
				local13 = local13.substring(0, local13.length() - 1);
			}
			if (local13.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1064("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
	public final synchronized void method1070() {
		if (Static261.aCanvas4 != null) {
			Static261.aCanvas4.removeFocusListener(this);
			Static261.aCanvas4.getParent().remove(Static261.aCanvas4);
		}
		@Pc(18) Container local18;
		if (Static292.aFrame2 != null) {
			local18 = Static292.aFrame2;
		} else if (Static232.aFrame3 == null) {
			local18 = Static180.aClass110_6.anApplet1;
		} else {
			local18 = Static232.aFrame3;
		}
		local18.setLayout(null);
		Static261.aCanvas4 = new Canvas_Sub1(this);
		local18.add(Static261.aCanvas4);
		Static261.aCanvas4.setSize(Static11.anInt5389, Static320.anInt6140);
		Static261.aCanvas4.setVisible(true);
		if (Static232.aFrame3 == local18) {
			@Pc(54) Insets local54 = Static232.aFrame3.getInsets();
			Static261.aCanvas4.setLocation(local54.left + Static340.anInt3938, Static78.anInt1584 + local54.top);
		} else {
			Static261.aCanvas4.setLocation(Static340.anInt3938, Static78.anInt1584);
		}
		Static261.aCanvas4.addFocusListener(this);
		Static261.aCanvas4.requestFocus();
		Static201.aBoolean344 = true;
		Static20.aBoolean41 = true;
		Static181.aBoolean317 = true;
		Static239.aBoolean390 = false;
		Static45.aLong42 = Static349.method5647();
	}

	@OriginalMember(owner = "client!lr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V")
	protected final void method1072(@OriginalArg(2) int arg0) {
		try {
			if (Static11.anApplet_Sub1_5 == null) {
				Static78.anInt1584 = 0;
				Static11.anInt5389 = 765;
				Static328.anInt6274 = 765;
				Static11.anApplet_Sub1_5 = this;
				Static320.anInt6140 = 503;
				Static262.anInt5078 = 503;
				Static340.anInt3935 = 563;
				Static340.anInt3938 = 0;
				if (Static180.aClass110_6 == null) {
					Static40.aClass110_8 = Static180.aClass110_6 = new Class110(this, arg0, null, 0);
				}
				@Pc(62) Class134 local62 = Static180.aClass110_6.method3379(1, this);
				while (local62.anInt4033 == 0) {
					Static134.method2598(10L);
				}
			} else {
				Static47.anInt1077++;
				if (Static47.anInt1077 >= 3) {
					this.method1064("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(77) Exception local77) {
			Static152.method2899(null, local77);
			this.method1064("crash");
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZZ)V")
	private void method1073(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static194.aBoolean339) {
				return;
			}
			Static194.aBoolean339 = true;
		}
		if (Static180.aClass110_6.anApplet1 != null) {
			Static180.aClass110_6.anApplet1.destroy();
		}
		try {
			this.method1058();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean99) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean99 = false;
		}
		@Pc(48) Class134 local48 = Static180.aClass110_6.method3368(Static11.anApplet_Sub1_5.getClass());
		while (local48.anInt4033 == 0) {
			Static134.method2598(100L);
		}
		if (Static261.aCanvas4 != null) {
			try {
				Static261.aCanvas4.removeFocusListener(this);
				Static261.aCanvas4.getParent().remove(Static261.aCanvas4);
			} catch (@Pc(70) Exception local70) {
			}
		}
		if (Static180.aClass110_6 != null) {
			try {
				Static180.aClass110_6.method3380();
			} catch (@Pc(78) Exception local78) {
			}
		}
		this.method1061();
		if (Static232.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(88) Throwable local88) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!lr", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static11.anApplet_Sub1_5 == this && !Static194.aBoolean339) {
			Static24.aLong26 = 0L;
		}
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
	protected abstract void method1074();
}
