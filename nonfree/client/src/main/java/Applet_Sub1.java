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

@OriginalClass("client!be")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!be", name = "F", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!be", name = "K", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Z")
	protected final boolean method857() {
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
				this.method872("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBILjava/lang/String;IIIZ)V")
	protected final void method858(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static335.anInt6496 = 1024;
			Static286.anInt5753 = 1024;
			Static89.anApplet_Sub1_1 = this;
			Static209.anInt6934 = 570;
			Static25.anInt396 = 768;
			Static38.anInt556 = 768;
			Static10.anInt185 = 0;
			Static177.anInt3977 = 0;
			Static291.aFrame4 = new Frame();
			Static291.aFrame4.setTitle("Jagex");
			Static291.aFrame4.setResizable(true);
			Static291.aFrame4.addWindowListener(this);
			Static291.aFrame4.setVisible(true);
			Static291.aFrame4.toFront();
			@Pc(42) Insets local42 = Static291.aFrame4.getInsets();
			Static291.aFrame4.setSize(local42.left + Static286.anInt5753 + local42.right, Static38.anInt556 - -local42.top - -local42.bottom);
			Static227.aClass179_5 = Static62.aClass179_2 = new Class179(null, arg0, arg1, 29);
			@Pc(76) Class26 local76 = Static62.aClass179_2.method4875(1, this);
			while (local76.anInt484 == 0) {
				Static248.method4401(10L);
			}
		} catch (@Pc(94) Exception local94) {
			Static40.method506(null, local94);
		}
	}

	@OriginalMember(owner = "client!be", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static89.anApplet_Sub1_1 != this || Static347.aBoolean602) {
			return;
		}
		Static266.aBoolean487 = true;
		if (Static341.aBoolean38 && Static22.method285() - Static157.aLong115 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static286.anInt5753 && Static38.anInt556 <= local26.height) {
				Static128.aBoolean262 = true;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	protected abstract void method860();

	@OriginalMember(owner = "client!be", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!be", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!be", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static319.aBoolean561 = true;
		Static266.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	private void method861() {
		@Pc(6) long local6 = Static22.method285();
		@Pc(10) long local10 = Static302.aLongArray9[Static144.anInt3086];
		Static302.aLongArray9[Static144.anInt3086] = local6;
		@Pc(23) boolean local23;
		if (local10 == 0L || local10 >= local6) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static144.anInt3086 = Static144.anInt3086 + 1 & 0x1F;
		synchronized (this) {
			Static107.aBoolean216 = Static319.aBoolean561;
		}
		this.method869();
	}

	@OriginalMember(owner = "client!be", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static291.aFrame4 == null) {
			return Static62.aClass179_2 == null || Static62.aClass179_2.anApplet1 == this ? super.getAppletContext() : Static62.aClass179_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	protected abstract void method863();

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public final synchronized void method864() {
		if (Static95.aCanvas3 != null) {
			Static95.aCanvas3.removeFocusListener(this);
			Static95.aCanvas3.getParent().remove(Static95.aCanvas3);
		}
		@Pc(18) Container local18;
		if (Static229.aFrame3 != null) {
			local18 = Static229.aFrame3;
		} else if (Static291.aFrame4 == null) {
			local18 = Static62.aClass179_2.anApplet1;
		} else {
			local18 = Static291.aFrame4;
		}
		local18.setLayout(null);
		Static95.aCanvas3 = new Canvas_Sub1(this);
		local18.add(Static95.aCanvas3);
		Static95.aCanvas3.setSize(Static335.anInt6496, Static25.anInt396);
		Static95.aCanvas3.setVisible(true);
		if (Static291.aFrame4 == local18) {
			@Pc(59) Insets local59 = Static291.aFrame4.getInsets();
			Static95.aCanvas3.setLocation(local59.left + Static10.anInt185, Static177.anInt3977 + local59.top);
		} else {
			Static95.aCanvas3.setLocation(Static10.anInt185, Static177.anInt3977);
		}
		Static95.aCanvas3.addFocusListener(this);
		Static95.aCanvas3.requestFocus();
		Static107.aBoolean216 = true;
		Static319.aBoolean561 = true;
		Static266.aBoolean487 = true;
		Static128.aBoolean262 = false;
		Static157.aLong115 = Static22.method285();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)V")
	private void method865(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static347.aBoolean602) {
				return;
			}
			Static347.aBoolean602 = true;
		}
		if (Static62.aClass179_2.anApplet1 != null) {
			Static62.aClass179_2.anApplet1.destroy();
		}
		try {
			this.method867();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean80) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean80 = false;
		}
		@Pc(53) Class26 local53 = Static62.aClass179_2.method4877(Static89.anApplet_Sub1_1.getClass());
		while (local53.anInt484 == 0) {
			Static248.method4401(100L);
		}
		if (Static95.aCanvas3 != null) {
			try {
				Static95.aCanvas3.removeFocusListener(this);
				Static95.aCanvas3.getParent().remove(Static95.aCanvas3);
			} catch (@Pc(75) Exception local75) {
			}
		}
		if (Static62.aClass179_2 != null) {
			try {
				Static62.aClass179_2.method4896();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method863();
		if (Static291.aFrame4 != null) {
			try {
				System.exit(0);
			} catch (@Pc(95) Throwable local95) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public final void method866() {
		if (this.aBoolean80) {
			return;
		}
		try {
			@Pc(14) Class26 local14 = Static62.aClass179_2.method4889(Static89.anApplet_Sub1_1.getClass());
			while (local14.anInt484 == 0) {
				Static248.method4401(100L);
			}
			if (local14.anObject1 != null) {
				throw (Throwable) local14.anObject1;
			}
			jagmisc.init();
			this.aBoolean80 = true;
			Static356.aClass6_1 = Static299.method5050();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	protected abstract void method867();

	@OriginalMember(owner = "client!be", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!be", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!be", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static293.aString58 != null) {
					@Pc(6) String local6 = Static293.aString58.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(36) String local36 = Static293.aString56;
						if (local36.equals("1.1") || local36.startsWith("1.1.") || local36.equals("1.2") || local36.startsWith("1.2.")) {
							this.method872("wrongjava");
							break label107;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static293.aString56 == null || Static293.aString56.equals("1.4.2"))) {
						this.method872("wrongjava");
						break label107;
					}
				}
				@Pc(66) int local66;
				if (Static293.aString56 != null && Static293.aString56.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (local66 < Static293.aString56.length()) {
						@Pc(74) char local74 = Static293.aString56.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local66++;
						local68 = local68 * 10 + local74 - 48;
					}
					if (local68 >= 5) {
						Static341.aBoolean38 = true;
					}
				}
				if (Static62.aClass179_2.anApplet1 != null) {
					@Pc(109) Method local109 = Static293.aMethod2;
					if (local109 != null) {
						try {
							local109.invoke(Static62.aClass179_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(124) Throwable local124) {
						}
					}
				}
				Static328.method5597();
				Static330.method5384();
				this.method864();
				this.method860();
				Static356.aClass6_1 = Static299.method5050();
				this.method866();
				while (Static127.aLong94 == 0L || Static127.aLong94 > Static22.method285()) {
					Static135.anInt2908 = Static356.aClass6_1.method4870(Static282.anInt5684);
					for (local66 = 0; local66 < Static135.anInt2908; local66++) {
						this.method861();
					}
					this.method874();
					Static234.method4285(Static95.aCanvas3, Static62.aClass179_2);
				}
			}
		} catch (@Pc(183) Exception local183) {
			Static40.method506(null, local183);
			this.method872("crash");
		}
		this.method865(true);
	}

	@OriginalMember(owner = "client!be", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static291.aFrame4 == null) {
			return Static62.aClass179_2 == null || Static62.aClass179_2.anApplet1 == this ? super.getParameter(arg0) : Static62.aClass179_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!be", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static89.anApplet_Sub1_1 == this && !Static347.aBoolean602) {
			Static127.aLong94 = 0L;
		}
	}

	@OriginalMember(owner = "client!be", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
	protected abstract void method869();

	@OriginalMember(owner = "client!be", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!be", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static89.anApplet_Sub1_1 == this && !Static347.aBoolean602) {
			Static127.aLong94 = Static22.method285() + 4000L;
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
	protected abstract void method870();

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method872(@OriginalArg(1) String arg0) {
		if (this.aBoolean81) {
			return;
		}
		this.aBoolean81 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static381.method5669(Static62.aClass179_2.anApplet1, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!be", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static89.anApplet_Sub1_1 == this && !Static347.aBoolean602) {
			Static127.aLong94 = Static22.method285();
			Static248.method4401(5000L);
			Static227.aClass179_5 = null;
			this.method865(false);
		}
	}

	@OriginalMember(owner = "client!be", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	private void method874() {
		@Pc(6) long local6 = Static22.method285();
		@Pc(10) long local10 = Static128.aLongArray4[Static120.anInt43];
		Static128.aLongArray4[Static120.anInt43] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(29) int local29 = (int) (local6 - local10);
			Static212.anInt4619 = ((local29 >> 1) + 32000) / local29;
		}
		Static120.anInt43 = Static120.anInt43 + 1 & 0x1F;
		if (Static127.anInt2750++ > 50) {
			Static266.aBoolean487 = true;
			Static127.anInt2750 -= 50;
			Static95.aCanvas3.setSize(Static335.anInt6496, Static25.anInt396);
			Static95.aCanvas3.setVisible(true);
			if (Static291.aFrame4 != null && Static229.aFrame3 == null) {
				@Pc(76) Insets local76 = Static291.aFrame4.getInsets();
				Static95.aCanvas3.setLocation(local76.left + Static10.anInt185, local76.top + Static177.anInt3977);
			} else {
				Static95.aCanvas3.setLocation(Static10.anInt185, Static177.anInt3977);
			}
		}
		this.method870();
	}

	@OriginalMember(owner = "client!be", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static291.aFrame4 == null) {
			return Static62.aClass179_2 == null || Static62.aClass179_2.anApplet1 == this ? super.getCodeBase() : Static62.aClass179_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!be", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!be", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static319.aBoolean561 = false;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIII)V")
	protected final void method875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (Static89.anApplet_Sub1_1 == null) {
				Static335.anInt6496 = arg1;
				Static286.anInt5753 = arg1;
				Static10.anInt185 = 0;
				Static209.anInt6934 = 570;
				Static25.anInt396 = arg2;
				Static38.anInt556 = arg2;
				Static89.anApplet_Sub1_1 = this;
				Static177.anInt3977 = 0;
				if (Static62.aClass179_2 == null) {
					Static227.aClass179_5 = Static62.aClass179_2 = new Class179(this, arg0, null, 0);
				}
				@Pc(66) Class26 local66 = Static62.aClass179_2.method4875(1, this);
				while (local66.anInt484 == 0) {
					Static248.method4401(10L);
				}
			} else {
				Static115.anInt2451++;
				if (Static115.anInt2451 >= 3) {
					this.method872("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(79) Exception local79) {
			Static40.method506(null, local79);
			this.method872("crash");
		}
	}

	@OriginalMember(owner = "client!be", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static291.aFrame4 == null) {
			return Static62.aClass179_2 == null || Static62.aClass179_2.anApplet1 == this ? super.getDocumentBase() : Static62.aClass179_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}
}
