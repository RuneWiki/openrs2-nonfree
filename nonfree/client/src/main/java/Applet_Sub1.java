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

@OriginalClass("client!gv")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!gv", name = "F", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	protected abstract void method1116();

	@OriginalMember(owner = "client!gv", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!gv", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	protected abstract void method1117();

	@OriginalMember(owner = "client!gv", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static41.anApplet_Sub1_1 == this && !Static413.aBoolean468) {
			Static148.aLong85 = Static449.method6552();
			Static88.method4161(5000L);
			Static148.aClass209_47 = null;
			this.method1130(false);
		}
	}

	@OriginalMember(owner = "client!gv", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static41.anApplet_Sub1_1 == this && !Static413.aBoolean468) {
			Static148.aLong85 = 0L;
		}
	}

	@OriginalMember(owner = "client!gv", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static41.anApplet_Sub1_1 != this || Static413.aBoolean468) {
			return;
		}
		Static30.aBoolean46 = true;
		if (Static289.aBoolean323 && Static449.method6552() - Static38.aLong42 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static142.anInt2934 && local26.height >= Static212.anInt3904) {
				Static331.aBoolean358 = true;
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIII)V")
	protected final void method1119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (Static41.anApplet_Sub1_1 == null) {
				Static41.anApplet_Sub1_1 = this;
				Static221.anInt4007 = 0;
				Static199.anInt3767 = arg0;
				Static212.anInt3904 = arg0;
				Static348.anInt6272 = arg2;
				Static142.anInt2934 = arg2;
				Static217.anInt3944 = 0;
				Static440.anInt7777 = 582;
				if (Static45.aClass209_127 == null) {
					Static148.aClass209_47 = Static45.aClass209_127 = new Class209(this, arg1, null, 0);
				}
				@Pc(69) Class122 local69 = Static45.aClass209_127.method4687(this, 1);
				while (local69.anInt3557 == 0) {
					Static88.method4161(10L);
				}
			} else {
				Static272.anInt4880++;
				if (Static272.anInt4880 >= 3) {
					this.method1135("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(82) Throwable local82) {
			Static390.method5741(local82, null);
			this.method1135("crash");
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	public final void method1121() {
		if (this.aBoolean110) {
			return;
		}
		try {
			@Pc(19) Class122 local19 = Static45.aClass209_127.method4697(Static41.anApplet_Sub1_1.getClass());
			while (local19.anInt3557 == 0) {
				Static88.method4161(100L);
			}
			if (local19.anObject7 != null) {
				throw (Throwable) local19.anObject7;
			}
			jagmisc.init();
			this.aBoolean110 = true;
			Static47.aClass15_1 = Static183.method3934();
		} catch (@Pc(47) Throwable local47) {
		}
	}

	@OriginalMember(owner = "client!gv", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!gv", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static133.aFrame3 == null) {
			return Static45.aClass209_127 == null || Static45.aClass209_127.anApplet1 == this ? super.getDocumentBase() : Static45.aClass209_127.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gv", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gv", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static163.aBoolean217 = true;
		Static30.aBoolean46 = true;
	}

	@OriginalMember(owner = "client!gv", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static133.aFrame3 == null) {
			return Static45.aClass209_127 == null || Static45.aClass209_127.anApplet1 == this ? super.getParameter(arg0) : Static45.aClass209_127.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gv", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gv", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static163.aBoolean217 = false;
	}

	@OriginalMember(owner = "client!gv", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static41.anApplet_Sub1_1 == this && !Static413.aBoolean468) {
			Static148.aLong85 = Static449.method6552() + 4000L;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLjava/lang/String;IIIIII)V")
	protected final void method1125(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static348.anInt6272 = 1024;
			Static142.anInt2934 = 1024;
			Static217.anInt3944 = 0;
			Static199.anInt3767 = 768;
			Static212.anInt3904 = 768;
			Static41.anApplet_Sub1_1 = this;
			Static440.anInt7777 = 582;
			Static221.anInt4007 = 0;
			Static133.aFrame3 = new Frame();
			Static133.aFrame3.setTitle("Jagex");
			Static133.aFrame3.setResizable(true);
			Static133.aFrame3.addWindowListener(this);
			Static133.aFrame3.setVisible(true);
			Static133.aFrame3.toFront();
			@Pc(44) Insets local44 = Static133.aFrame3.getInsets();
			Static133.aFrame3.setSize(local44.right + local44.left + Static142.anInt2934, local44.bottom + local44.top + Static212.anInt3904);
			Static148.aClass209_47 = Static45.aClass209_127 = new Class209(null, arg1, arg0, 30);
			@Pc(76) Class122 local76 = Static45.aClass209_127.method4687(this, 1);
			while (local76.anInt3557 == 0) {
				Static88.method4161(10L);
			}
		} catch (@Pc(86) Exception local86) {
			Static390.method5741(local86, null);
		}
	}

	@OriginalMember(owner = "client!gv", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static133.aFrame3 == null) {
			return Static45.aClass209_127 == null || Static45.aClass209_127.anApplet1 == this ? super.getCodeBase() : Static45.aClass209_127.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V")
	private void method1126() {
		@Pc(6) long local6 = Static449.method6552();
		@Pc(10) long local10 = Static405.aLongArray8[Static63.anInt1716];
		Static405.aLongArray8[Static63.anInt1716] = local6;
		@Pc(29) boolean local29;
		if (local10 == 0L || local10 >= local6) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static63.anInt1716 = Static63.anInt1716 + 1 & 0x1F;
		synchronized (this) {
			Static185.aBoolean236 = Static163.aBoolean217;
		}
		this.method1128();
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)V")
	protected abstract void method1128();

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(Z)V")
	public final synchronized void method1129() {
		if (Static280.aCanvas3 != null) {
			Static280.aCanvas3.removeFocusListener(this);
			Static280.aCanvas3.getParent().remove(Static280.aCanvas3);
		}
		@Pc(18) Container local18;
		if (Static264.aFrame2 != null) {
			local18 = Static264.aFrame2;
		} else if (Static133.aFrame3 == null) {
			local18 = Static45.aClass209_127.anApplet1;
		} else {
			local18 = Static133.aFrame3;
		}
		local18.setLayout(null);
		Static280.aCanvas3 = new Canvas_Sub1(this);
		local18.add(Static280.aCanvas3);
		Static280.aCanvas3.setSize(Static348.anInt6272, Static199.anInt3767);
		Static280.aCanvas3.setVisible(true);
		if (Static133.aFrame3 == local18) {
			@Pc(60) Insets local60 = Static133.aFrame3.getInsets();
			Static280.aCanvas3.setLocation(local60.left + Static221.anInt4007, local60.top + Static217.anInt3944);
		} else {
			Static280.aCanvas3.setLocation(Static221.anInt4007, Static217.anInt3944);
		}
		Static280.aCanvas3.addFocusListener(this);
		Static280.aCanvas3.requestFocus();
		Static163.aBoolean217 = true;
		Static185.aBoolean236 = true;
		Static30.aBoolean46 = true;
		Static331.aBoolean358 = false;
		Static38.aLong42 = Static449.method6552();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZZ)V")
	private void method1130(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static413.aBoolean468) {
				return;
			}
			Static413.aBoolean468 = true;
		}
		if (Static45.aClass209_127.anApplet1 != null) {
			Static45.aClass209_127.anApplet1.destroy();
		}
		try {
			this.method1132();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean110) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean110 = false;
		}
		@Pc(48) Class122 local48 = Static45.aClass209_127.method4679(Static41.anApplet_Sub1_1.getClass());
		while (local48.anInt3557 == 0) {
			Static88.method4161(100L);
		}
		if (Static280.aCanvas3 != null) {
			try {
				Static280.aCanvas3.removeFocusListener(this);
				Static280.aCanvas3.getParent().remove(Static280.aCanvas3);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Static45.aClass209_127 != null) {
			try {
				Static45.aClass209_127.method4686();
			} catch (@Pc(82) Exception local82) {
			}
		}
		this.method1117();
		if (Static133.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(92) Throwable local92) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!gv", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "(B)V")
	protected abstract void method1132();

	@OriginalMember(owner = "client!gv", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static133.aFrame3 == null) {
			return Static45.aClass209_127 == null || Static45.aClass209_127.anApplet1 == this ? super.getAppletContext() : Static45.aClass209_127.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gv", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "(I)V")
	private void method1133() {
		@Pc(6) long local6 = Static449.method6552();
		@Pc(10) long local10 = Static322.aLongArray5[Static130.anInt2776];
		Static322.aLongArray5[Static130.anInt2776] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(32) int local32 = (int) (local6 - local10);
			Static135.anInt2872 = ((local32 >> 1) + 32000) / local32;
		}
		Static130.anInt2776 = Static130.anInt2776 + 1 & 0x1F;
		if (Static440.anInt7784++ > 50) {
			Static440.anInt7784 -= 50;
			Static30.aBoolean46 = true;
			Static280.aCanvas3.setSize(Static348.anInt6272, Static199.anInt3767);
			Static280.aCanvas3.setVisible(true);
			if (Static133.aFrame3 != null && Static264.aFrame2 == null) {
				@Pc(82) Insets local82 = Static133.aFrame3.getInsets();
				Static280.aCanvas3.setLocation(local82.left + Static221.anInt4007, local82.top + Static217.anInt3944);
			} else {
				Static280.aCanvas3.setLocation(Static221.anInt4007, Static217.anInt3944);
			}
		}
		this.method1134();
	}

	@OriginalMember(owner = "client!gv", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "(I)V")
	protected abstract void method1134();

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	protected final void method1135(@OriginalArg(0) String arg0) {
		if (this.aBoolean109) {
			return;
		}
		this.aBoolean109 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static456.method3806("loggedout", Static45.aClass209_127.anApplet1);
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!gv", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)Z")
	protected final boolean method1136() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
			return true;
		} else if (local8.equals("stellardawn.com") || local8.endsWith(".stellardawn.com")) {
			return true;
		} else if (local8.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local8.length() > 0 && local8.charAt(local8.length() - 1) >= '0' && local8.charAt(local8.length() - 1) <= '9') {
				local8 = local8.substring(0, local8.length() - 1);
			}
			if (local8.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1135("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label108: {
				if (Static325.aString40 != null) {
					@Pc(6) String local6 = Static325.aString40.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(36) String local36 = Static325.aString45;
						if (local36.equals("1.1") || local36.startsWith("1.1.") || local36.equals("1.2") || local36.startsWith("1.2.")) {
							this.method1135("wrongjava");
							break label108;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static325.aString45 == null || Static325.aString45.equals("1.4.2"))) {
						this.method1135("wrongjava");
						break label108;
					}
				}
				@Pc(66) int local66;
				if (Static325.aString45 != null && Static325.aString45.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (Static325.aString45.length() > local66) {
						@Pc(74) char local74 = Static325.aString45.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local66++;
						local68 = local68 * 10 + local74 - 48;
					}
					if (local68 >= 5) {
						Static289.aBoolean323 = true;
					}
				}
				if (Static45.aClass209_127.anApplet1 != null) {
					@Pc(107) Method local107 = Static325.aMethod2;
					if (local107 != null) {
						try {
							local107.invoke(Static45.aClass209_127.anApplet1, Boolean.TRUE);
						} catch (@Pc(122) Throwable local122) {
						}
					}
				}
				Static116.method2022();
				Static271.method4043();
				this.method1129();
				this.method1116();
				Static47.aClass15_1 = Static183.method3934();
				this.method1121();
				while (Static148.aLong85 == 0L || Static449.method6552() < Static148.aLong85) {
					Static254.anInt4642 = Static47.aClass15_1.method6110(Static207.anInt3860);
					for (local66 = 0; local66 < Static254.anInt4642; local66++) {
						this.method1126();
					}
					this.method1133();
					Static350.method5231(Static280.aCanvas3, Static45.aClass209_127);
				}
			}
		} catch (@Pc(185) Throwable local185) {
			Static390.method5741(local185, null);
			this.method1135("crash");
		}
		this.method1130(true);
	}
}
