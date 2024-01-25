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

@OriginalClass("client!og")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!og", name = "t", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!og", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static84.anApplet_Sub1_1 != this || Static123.aBoolean231) {
			return;
		}
		Static180.aBoolean307 = true;
		if (Static229.aBoolean369 && Static118.method1934() - Static298.aLong174 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static301.anInt2468 <= local26.width && local26.height >= Static348.anInt5912) {
				Static205.aBoolean346 = true;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	protected abstract void method1090();

	@OriginalMember(owner = "client!og", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static227.aString27 != null) {
					@Pc(10) String local10 = Static227.aString27.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(41) String local41 = Static227.aString29;
						if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
							this.method1094("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static227.aString29 == null || Static227.aString29.equals("1.4.2"))) {
						this.method1094("wrongjava");
						break label107;
					}
				}
				@Pc(71) int local71;
				if (Static227.aString29 != null && Static227.aString29.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (local71 < Static227.aString29.length()) {
						@Pc(79) char local79 = Static227.aString29.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local71++;
						local73 = local79 + local73 * 10 - 48;
					}
					if (local73 >= 5) {
						Static229.aBoolean369 = true;
					}
				}
				if (Static66.aClass143_2.anApplet1 != null) {
					@Pc(111) Method local111 = Static227.aMethod2;
					if (local111 != null) {
						try {
							local111.invoke(Static66.aClass143_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				Static61.method1236();
				Static421.method5374();
				this.method1106();
				this.method1107();
				this.method1103();
				Static286.aClass44_2 = Static242.method3664();
				this.method1107();
				while (Static209.aLong129 == 0L || Static209.aLong129 > Static118.method1934()) {
					Static233.anInt4468 = Static286.aClass44_2.method3067(Static172.anInt3456);
					for (local71 = 0; local71 < Static233.anInt4468; local71++) {
						this.method1102();
					}
					this.method1104();
					Static346.method4591(Static392.aCanvas6, Static66.aClass143_2);
				}
			}
		} catch (@Pc(188) Throwable local188) {
			Static324.method5974(local188, this.method1100());
			this.method1094("crash");
		}
		this.method1098(true);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	protected abstract void method1091();

	@OriginalMember(owner = "client!og", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static84.anApplet_Sub1_1 == this && !Static123.aBoolean231) {
			Static209.aLong129 = 0L;
		}
	}

	@OriginalMember(owner = "client!og", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1094(@OriginalArg(0) String arg0) {
		if (this.aBoolean113) {
			return;
		}
		this.aBoolean113 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static456.method852("loggedout", Static66.aClass143_2.anApplet1);
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)Z")
	protected final boolean method1095() {
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
				this.method1094("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static10.aFrame1 == null) {
			return Static66.aClass143_2 == null || Static66.aClass143_2.anApplet1 == this ? super.getCodeBase() : Static66.aClass143_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLjava/lang/String;IIIII)V")
	protected final void method1096(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static333.anInt5712 = 1024;
			Static301.anInt2468 = 1024;
			Static123.anInt2625 = 768;
			Static348.anInt5912 = 768;
			Static64.anInt1683 = 0;
			Static163.anInt6305 = 0;
			Static354.anInt6028 = 590;
			Static84.anApplet_Sub1_1 = this;
			Static10.aFrame1 = new Frame();
			Static10.aFrame1.setTitle("Jagex");
			Static10.aFrame1.setResizable(true);
			Static10.aFrame1.addWindowListener(this);
			Static10.aFrame1.setVisible(true);
			Static10.aFrame1.toFront();
			@Pc(46) Insets local46 = Static10.aFrame1.getInsets();
			Static10.aFrame1.setSize(Static301.anInt2468 + local46.left + local46.right, local46.bottom + local46.top + Static348.anInt5912);
			Static217.aClass143_3 = Static66.aClass143_2 = new Class143(null, arg1, arg0, 30);
			@Pc(80) Class43 local80 = Static66.aClass143_2.method3397(1, this);
			while (local80.anInt1521 == 0) {
				Static360.method4758(10L);
			}
		} catch (@Pc(90) Exception local90) {
			Static324.method5974(local90, null);
		}
	}

	@OriginalMember(owner = "client!og", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	protected abstract void method1097();

	@OriginalMember(owner = "client!og", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static10.aFrame1 == null) {
			return Static66.aClass143_2 == null || Static66.aClass143_2.anApplet1 == this ? super.getDocumentBase() : Static66.aClass143_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static367.aBoolean536 = false;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
	private void method1098(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static123.aBoolean231) {
				return;
			}
			Static123.aBoolean231 = true;
		}
		if (Static66.aClass143_2.anApplet1 != null) {
			Static66.aClass143_2.anApplet1.destroy();
		}
		try {
			this.method1090();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean114) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean114 = false;
		}
		@Pc(53) Class43 local53 = Static66.aClass143_2.method3403(Static84.anApplet_Sub1_1.getClass());
		while (local53.anInt1521 == 0) {
			Static360.method4758(100L);
		}
		if (Static392.aCanvas6 != null) {
			try {
				Static392.aCanvas6.removeFocusListener(this);
				Static392.aCanvas6.getParent().remove(Static392.aCanvas6);
			} catch (@Pc(75) Exception local75) {
			}
		}
		if (Static66.aClass143_2 != null) {
			try {
				Static66.aClass143_2.method3385();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method1097();
		if (Static10.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!og", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static10.aFrame1 == null) {
			return Static66.aClass143_2 == null || Static66.aClass143_2.anApplet1 == this ? super.getParameter(arg0) : Static66.aClass143_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static367.aBoolean536 = true;
		Static180.aBoolean307 = true;
	}

	@OriginalMember(owner = "client!og", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static84.anApplet_Sub1_1 == this && !Static123.aBoolean231) {
			Static209.aLong129 = Static118.method1934() + 4000L;
		}
	}

	@OriginalMember(owner = "client!og", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Ljava/lang/String;")
	protected String method1100() {
		return null;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	protected abstract void method1101();

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	private void method1102() {
		@Pc(6) long local6 = Static118.method1934();
		@Pc(14) long local14 = Static374.aLongArray9[Static79.anInt5729];
		Static374.aLongArray9[Static79.anInt5729] = local6;
		Static79.anInt5729 = Static79.anInt5729 + 1 & 0x1F;
		@Pc(39) boolean local39;
		if (local14 == 0L || local14 >= local6) {
			local39 = false;
		} else {
			local39 = true;
		}
		synchronized (this) {
			Static168.aBoolean289 = Static367.aBoolean536;
		}
		this.method1101();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	protected abstract void method1103();

	@OriginalMember(owner = "client!og", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!og", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static84.anApplet_Sub1_1 == this && !Static123.aBoolean231) {
			Static209.aLong129 = Static118.method1934();
			Static360.method4758(5000L);
			Static217.aClass143_3 = null;
			this.method1098(false);
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)V")
	private void method1104() {
		@Pc(6) long local6 = Static118.method1934();
		@Pc(10) long local10 = Static189.aLongArray8[Static322.anInt5593];
		Static189.aLongArray8[Static322.anInt5593] = local6;
		Static322.anInt5593 = Static322.anInt5593 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(37) int local37 = (int) (local6 - local10);
			Static320.anInt5587 = ((local37 >> 1) + 32000) / local37;
		}
		if (Static90.anInt2164++ > 50) {
			Static90.anInt2164 -= 50;
			Static180.aBoolean307 = true;
			Static392.aCanvas6.setSize(Static333.anInt5712, Static123.anInt2625);
			Static392.aCanvas6.setVisible(true);
			if (Static10.aFrame1 != null && Static438.aFrame2 == null) {
				@Pc(80) Insets local80 = Static10.aFrame1.getInsets();
				Static392.aCanvas6.setLocation(local80.left + Static163.anInt6305, Static64.anInt1683 + local80.top);
			} else {
				Static392.aCanvas6.setLocation(Static163.anInt6305, Static64.anInt1683);
			}
		}
		this.method1091();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIII)V")
	protected final void method1105(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static84.anApplet_Sub1_1 == null) {
				Static64.anInt1683 = 0;
				Static123.anInt2625 = arg0;
				Static348.anInt5912 = arg0;
				Static84.anApplet_Sub1_1 = this;
				Static333.anInt5712 = arg2;
				Static301.anInt2468 = arg2;
				Static163.anInt6305 = 0;
				Static354.anInt6028 = 590;
				if (Static66.aClass143_2 == null) {
					Static217.aClass143_3 = Static66.aClass143_2 = new Class143(this, arg1, null, 0);
				}
				@Pc(64) Class43 local64 = Static66.aClass143_2.method3397(1, this);
				while (local64.anInt1521 == 0) {
					Static360.method4758(10L);
				}
			} else {
				Static362.anInt6124++;
				if (Static362.anInt6124 >= 3) {
					this.method1094("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(74) Throwable local74) {
			Static324.method5974(local74, null);
			this.method1094("crash");
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	public final synchronized void method1106() {
		if (Static392.aCanvas6 != null) {
			Static392.aCanvas6.removeFocusListener(this);
			Static392.aCanvas6.getParent().remove(Static392.aCanvas6);
		}
		@Pc(24) Container local24;
		if (Static438.aFrame2 != null) {
			local24 = Static438.aFrame2;
		} else if (Static10.aFrame1 == null) {
			local24 = Static66.aClass143_2.anApplet1;
		} else {
			local24 = Static10.aFrame1;
		}
		local24.setLayout(null);
		Static392.aCanvas6 = new Canvas_Sub1(this);
		local24.add(Static392.aCanvas6);
		Static392.aCanvas6.setSize(Static333.anInt5712, Static123.anInt2625);
		Static392.aCanvas6.setVisible(true);
		if (Static10.aFrame1 == local24) {
			@Pc(58) Insets local58 = Static10.aFrame1.getInsets();
			Static392.aCanvas6.setLocation(local58.left + Static163.anInt6305, local58.top - -Static64.anInt1683);
		} else {
			Static392.aCanvas6.setLocation(Static163.anInt6305, Static64.anInt1683);
		}
		Static392.aCanvas6.addFocusListener(this);
		Static392.aCanvas6.requestFocus();
		Static168.aBoolean289 = true;
		Static367.aBoolean536 = true;
		Static180.aBoolean307 = true;
		Static205.aBoolean346 = false;
		Static298.aLong174 = Static118.method1934();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	public final void method1107() {
		if (this.aBoolean114) {
			return;
		}
		try {
			@Pc(18) Class43 local18 = Static66.aClass143_2.method3408(Static84.anApplet_Sub1_1.getClass());
			while (local18.anInt1521 == 0) {
				Static360.method4758(100L);
			}
			if (local18.anObject3 != null) {
				throw (Throwable) local18.anObject3;
			}
			jagmisc.init();
			this.aBoolean114 = true;
			Static286.aClass44_2 = Static242.method3664();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!og", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!og", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static10.aFrame1 == null) {
			return Static66.aClass143_2 == null || Static66.aClass143_2.anApplet1 == this ? super.getAppletContext() : Static66.aClass143_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}
}
