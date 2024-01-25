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

@OriginalClass("client!ib")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!ib", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static202.anApplet_Sub1_1 == this && !Static328.aBoolean412) {
			Static380.aLong204 = Static39.method699();
			Static358.method2028(5000L);
			Static237.aClass111_3 = null;
			this.method770(false);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	protected abstract void method756();

	@OriginalMember(owner = "client!ib", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ib", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public final synchronized void method757() {
		if (Static257.aCanvas4 != null) {
			Static257.aCanvas4.removeFocusListener(this);
			Static257.aCanvas4.getParent().remove(Static257.aCanvas4);
		}
		@Pc(20) Container local20;
		if (Static385.aFrame2 != null) {
			local20 = Static385.aFrame2;
		} else if (Static8.aFrame1 == null) {
			local20 = Static359.aClass111_5.anApplet1;
		} else {
			local20 = Static8.aFrame1;
		}
		local20.setLayout(null);
		Static257.aCanvas4 = new Canvas_Sub1(this);
		local20.add(Static257.aCanvas4);
		Static257.aCanvas4.setSize(Static253.anInt4467, Static362.anInt6102);
		Static257.aCanvas4.setVisible(true);
		if (local20 == Static8.aFrame1) {
			@Pc(60) Insets local60 = Static8.aFrame1.getInsets();
			Static257.aCanvas4.setLocation(Static341.anInt5819 + local60.left, local60.top - -Static88.anInt1685);
		} else {
			Static257.aCanvas4.setLocation(Static341.anInt5819, Static88.anInt1685);
		}
		Static257.aCanvas4.addFocusListener(this);
		Static257.aCanvas4.requestFocus();
		Static116.aBoolean199 = true;
		Static90.aBoolean129 = true;
		Static242.aBoolean363 = true;
		Static23.aBoolean37 = false;
		Static356.aLong195 = Static39.method699();
	}

	@OriginalMember(owner = "client!ib", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public final void method758() {
		if (this.aBoolean73) {
			return;
		}
		try {
			@Pc(19) Class182 local19 = Static359.aClass111_5.method2804(Static202.anApplet_Sub1_1.getClass());
			while (local19.anInt4498 == 0) {
				Static358.method2028(100L);
			}
			if (local19.anObject6 != null) {
				throw (Throwable) local19.anObject6;
			}
			jagmisc.init();
			this.aBoolean73 = true;
			Static119.aClass28_1 = Static155.method2835();
		} catch (@Pc(49) Throwable local49) {
		}
	}

	@OriginalMember(owner = "client!ib", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static152.aString34 != null) {
					@Pc(10) String local10 = Static152.aString34.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(41) String local41 = Static152.aString33;
						if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
							this.method766("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static152.aString33 == null || Static152.aString33.equals("1.4.2"))) {
						this.method766("wrongjava");
						break label107;
					}
				}
				@Pc(71) int local71;
				if (Static152.aString33 != null && Static152.aString33.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (local71 < Static152.aString33.length()) {
						@Pc(79) char local79 = Static152.aString33.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local73 = local73 * 10 + local79 - '0';
						local71++;
					}
					if (local73 >= 5) {
						Static228.aBoolean306 = true;
					}
				}
				if (Static359.aClass111_5.anApplet1 != null) {
					@Pc(117) Method local117 = Static152.aMethod1;
					if (local117 != null) {
						try {
							local117.invoke(Static359.aClass111_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(132) Throwable local132) {
						}
					}
				}
				Static387.method5636();
				Static335.method4947();
				this.method757();
				this.method762();
				Static119.aClass28_1 = Static155.method2835();
				this.method758();
				while (Static380.aLong204 == 0L || Static380.aLong204 > Static39.method699()) {
					Static273.anInt4729 = Static119.aClass28_1.method4247(Static293.anInt6496);
					for (local71 = 0; local71 < Static273.anInt4729; local71++) {
						this.method765();
					}
					this.method761();
					Static391.method5670(Static257.aCanvas4, Static359.aClass111_5);
				}
			}
		} catch (@Pc(193) Exception local193) {
			Static142.method2676(local193, null);
			this.method766("crash");
		}
		this.method770(true);
	}

	@OriginalMember(owner = "client!ib", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static202.anApplet_Sub1_1 != this || Static328.aBoolean412) {
			return;
		}
		Static242.aBoolean363 = true;
		if (Static228.aBoolean306 && Static39.method699() - Static356.aLong195 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static70.anInt1246 <= local24.width && Static230.anInt4054 <= local24.height) {
				Static23.aBoolean37 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	protected abstract void method759();

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIZI)V")
	protected final void method760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static202.anApplet_Sub1_1 == null) {
				Static253.anInt4467 = arg0;
				Static70.anInt1246 = arg0;
				Static88.anInt1685 = 0;
				Static158.anInt3032 = 573;
				Static202.anApplet_Sub1_1 = this;
				Static341.anInt5819 = 0;
				Static362.anInt6102 = arg2;
				Static230.anInt4054 = arg2;
				if (Static359.aClass111_5 == null) {
					Static237.aClass111_3 = Static359.aClass111_5 = new Class111(this, arg1, null, 0);
				}
				@Pc(65) Class182 local65 = Static359.aClass111_5.method2819(this, 1);
				while (local65.anInt4498 == 0) {
					Static358.method2028(10L);
				}
			} else {
				Static191.anInt3598++;
				if (Static191.anInt3598 >= 3) {
					this.method766("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(75) Exception local75) {
			Static142.method2676(local75, null);
			this.method766("crash");
		}
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	private void method761() {
		@Pc(14) long local14 = Static39.method699();
		@Pc(18) long local18 = Static230.aLongArray5[Static21.anInt440];
		Static230.aLongArray5[Static21.anInt440] = local14;
		if (local18 != 0L && local18 < local14) {
			@Pc(35) int local35 = (int) (local14 - local18);
			Static70.anInt1250 = ((local35 >> 1) + 32000) / local35;
		}
		Static21.anInt440 = Static21.anInt440 + 1 & 0x1F;
		if (Static224.anInt4001++ > 50) {
			Static242.aBoolean363 = true;
			Static224.anInt4001 -= 50;
			Static257.aCanvas4.setSize(Static253.anInt4467, Static362.anInt6102);
			Static257.aCanvas4.setVisible(true);
			if (Static8.aFrame1 != null && Static385.aFrame2 == null) {
				@Pc(79) Insets local79 = Static8.aFrame1.getInsets();
				Static257.aCanvas4.setLocation(local79.left + Static341.anInt5819, Static88.anInt1685 + local79.top);
			} else {
				Static257.aCanvas4.setLocation(Static341.anInt5819, Static88.anInt1685);
			}
		}
		this.method756();
	}

	@OriginalMember(owner = "client!ib", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
	protected abstract void method762();

	@OriginalMember(owner = "client!ib", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static202.anApplet_Sub1_1 == this && !Static328.aBoolean412) {
			Static380.aLong204 = Static39.method699() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)Z")
	protected final boolean method763() {
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
				this.method766("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;IIIZII)V")
	protected final void method764(@OriginalArg(1) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static362.anInt6102 = 768;
			Static230.anInt4054 = 768;
			Static202.anApplet_Sub1_1 = this;
			Static253.anInt4467 = 1024;
			Static70.anInt1246 = 1024;
			Static341.anInt5819 = 0;
			Static158.anInt3032 = 573;
			Static88.anInt1685 = 0;
			Static8.aFrame1 = new Frame();
			Static8.aFrame1.setTitle("Jagex");
			Static8.aFrame1.setResizable(true);
			Static8.aFrame1.addWindowListener(this);
			Static8.aFrame1.setVisible(true);
			Static8.aFrame1.toFront();
			@Pc(38) Insets local38 = Static8.aFrame1.getInsets();
			Static8.aFrame1.setSize(Static70.anInt1246 + local38.left + local38.right, Static230.anInt4054 - -local38.top + local38.bottom);
			Static237.aClass111_3 = Static359.aClass111_5 = new Class111(null, arg1, arg0, 29);
			@Pc(75) Class182 local75 = Static359.aClass111_5.method2819(this, 1);
			while (local75.anInt4498 == 0) {
				Static358.method2028(10L);
			}
		} catch (@Pc(85) Exception local85) {
			Static142.method2676(local85, null);
		}
	}

	@OriginalMember(owner = "client!ib", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	private void method765() {
		@Pc(10) long local10 = Static39.method699();
		@Pc(14) long local14 = Static23.aLongArray1[Static280.anInt4826];
		Static23.aLongArray1[Static280.anInt4826] = local10;
		Static280.anInt4826 = Static280.anInt4826 + 1 & 0x1F;
		@Pc(37) boolean local37;
		if (local14 == 0L || local10 <= local14) {
			local37 = false;
		} else {
			local37 = true;
		}
		synchronized (this) {
			Static90.aBoolean129 = Static116.aBoolean199;
		}
		this.method759();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method766(@OriginalArg(1) String arg0) {
		if (this.aBoolean74) {
			return;
		}
		this.aBoolean74 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static403.method4138("loggedout", Static359.aClass111_5.anApplet1);
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!ib", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static116.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!ib", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ib", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static8.aFrame1 == null) {
			return Static359.aClass111_5 == null || Static359.aClass111_5.anApplet1 == this ? super.getDocumentBase() : Static359.aClass111_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static8.aFrame1 == null) {
			return Static359.aClass111_5 == null || Static359.aClass111_5.anApplet1 == this ? super.getCodeBase() : Static359.aClass111_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	protected abstract void method767();

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
	protected abstract void method768();

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V")
	private void method770(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static328.aBoolean412) {
				return;
			}
			Static328.aBoolean412 = true;
		}
		if (Static359.aClass111_5.anApplet1 != null) {
			Static359.aClass111_5.anApplet1.destroy();
		}
		try {
			this.method768();
		} catch (@Pc(39) Exception local39) {
		}
		if (this.aBoolean73) {
			try {
				jagmisc.quit();
			} catch (@Pc(45) Throwable local45) {
			}
			this.aBoolean73 = false;
		}
		@Pc(56) Class182 local56 = Static359.aClass111_5.method2803(Static202.anApplet_Sub1_1.getClass());
		while (local56.anInt4498 == 0) {
			Static358.method2028(100L);
		}
		if (Static257.aCanvas4 != null) {
			try {
				Static257.aCanvas4.removeFocusListener(this);
				Static257.aCanvas4.getParent().remove(Static257.aCanvas4);
			} catch (@Pc(78) Exception local78) {
			}
		}
		if (Static359.aClass111_5 != null) {
			try {
				Static359.aClass111_5.method2806();
			} catch (@Pc(88) Exception local88) {
			}
		}
		this.method767();
		if (Static8.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(98) Throwable local98) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ib", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static8.aFrame1 == null) {
			return Static359.aClass111_5 == null || Static359.aClass111_5.anApplet1 == this ? super.getAppletContext() : Static359.aClass111_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static8.aFrame1 == null) {
			return Static359.aClass111_5 == null || Static359.aClass111_5.anApplet1 == this ? super.getParameter(arg0) : Static359.aClass111_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static202.anApplet_Sub1_1 == this && !Static328.aBoolean412) {
			Static380.aLong204 = 0L;
		}
	}

	@OriginalMember(owner = "client!ib", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static116.aBoolean199 = true;
		Static242.aBoolean363 = true;
	}
}
