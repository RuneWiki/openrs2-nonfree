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

@OriginalClass("client!l")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!l", name = "providesignlink", descriptor = "(Lclient!rj;)V")
	public static void providesignlink(@OriginalArg(0) Class154 arg0) {
		Static26.aClass154_1 = arg0;
		Static196.aClass154_3 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	protected abstract void method660();

	@OriginalMember(owner = "client!l", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static107.anApplet_Sub1_1 == this && !Static218.aBoolean72) {
			Static224.aLong145 = Static298.method4535();
			Static282.method4345(5000L);
			Static196.aClass154_3 = null;
			this.method661(false);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BZ)V")
	private void method661(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static218.aBoolean72) {
				return;
			}
			Static218.aBoolean72 = true;
		}
		if (Static26.aClass154_1.anApplet1 != null) {
			Static26.aClass154_1.anApplet1.destroy();
		}
		try {
			this.method676();
		} catch (@Pc(41) Exception local41) {
		}
		if (this.aBoolean37) {
			try {
				jagmisc.quit();
			} catch (@Pc(48) Throwable local48) {
			}
			this.aBoolean37 = false;
		}
		Static26.aClass154_1.method3886(Static107.anApplet_Sub1_1.getClass());
		if (Static127.aCanvas1 != null) {
			try {
				Static127.aCanvas1.removeFocusListener(this);
				Static127.aCanvas1.getParent().remove(Static127.aCanvas1);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static26.aClass154_1 != null) {
			try {
				Static26.aClass154_1.method3889();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method673();
		if (Static197.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(87) Throwable local87) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method662(@OriginalArg(0) String arg0) {
		if (this.aBoolean34) {
			return;
		}
		this.aBoolean34 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static321.method2506("loggedout", Static26.aClass154_1.anApplet1);
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!l", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	protected abstract void method663();

	@OriginalMember(owner = "client!l", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static197.aFrame1 == null) {
			return Static26.aClass154_1 == null || Static26.aClass154_1.anApplet1 == this ? super.getCodeBase() : Static26.aClass154_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static250.aBoolean313 = false;
	}

	@OriginalMember(owner = "client!l", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	private void method664() {
		@Pc(6) long local6 = Static298.method4535();
		@Pc(10) long local10 = Static12.aLongArray1[Static199.anInt3819];
		Static12.aLongArray1[Static199.anInt3819] = local6;
		Static199.anInt3819 = Static199.anInt3819 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
		}
		synchronized (this) {
			Static13.aBoolean6 = Static250.aBoolean313;
		}
		this.method674();
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Z")
	protected final boolean method665() {
		@Pc(14) String local14 = this.getDocumentBase().getHost().toLowerCase();
		if (local14.equals("jagex.com") || local14.endsWith(".jagex.com")) {
			return true;
		} else if (local14.equals("runescape.com") || local14.endsWith(".runescape.com")) {
			return true;
		} else if (local14.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local14.length() > 0 && local14.charAt(local14.length() - 1) >= '0' && local14.charAt(local14.length() - 1) <= '9') {
				local14 = local14.substring(0, local14.length() - 1);
			}
			if (local14.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method662("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
	protected final void method666(@OriginalArg(2) int arg0) {
		try {
			if (Static107.anApplet_Sub1_1 != null) {
				Static249.anInt4508++;
				if (Static249.anInt4508 < 3) {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					return;
				}
				this.method662("alreadyloaded");
				return;
			}
			Static292.anInt5236 = 765;
			Static171.anInt3365 = 765;
			Static120.anInt2505 = 503;
			Static132.anInt3685 = 503;
			Static103.anInt2068 = 0;
			Static107.anApplet_Sub1_1 = this;
			Static111.anInt2298 = 1549;
			Static209.anInt3975 = 0;
			@Pc(58) String local58 = this.getParameter("openwinjs");
			if (local58 != null && local58.equals("1")) {
				Static64.aBoolean77 = true;
			} else {
				Static64.aBoolean77 = false;
			}
			if (Static26.aClass154_1 == null) {
				Static196.aClass154_3 = Static26.aClass154_1 = new Class154(this, arg0, null, 0);
			}
			@Pc(89) Class185 local89 = Static26.aClass154_1.method3881(1, this);
			while (local89.anInt5276 == 0) {
				Static282.method4345(10L);
			}
			Static126.aThread3 = (Thread) local89.anObject6;
		} catch (@Pc(106) Exception local106) {
			Static159.method2733(local106, null);
			this.method662("crash");
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	public final void method668() {
		if (this.aBoolean37) {
			return;
		}
		try {
			@Pc(20) Class185 local20 = Static26.aClass154_1.method3888(Static107.anApplet_Sub1_1.getClass());
			while (local20.anInt5276 == 0) {
				Static282.method4345(100L);
			}
			if (local20.anObject6 != null) {
				throw (Throwable) local20.anObject6;
			}
			jagmisc.init();
			this.aBoolean37 = true;
			Static53.aClass45_1 = Static313.method2574();
		} catch (@Pc(49) Throwable local49) {
		}
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	public final synchronized void method669() {
		if (Static127.aCanvas1 != null) {
			Static127.aCanvas1.removeFocusListener(this);
			Static127.aCanvas1.getParent().remove(Static127.aCanvas1);
		}
		@Pc(19) Container local19;
		if (Static275.aFrame2 != null) {
			local19 = Static275.aFrame2;
		} else if (Static197.aFrame1 == null) {
			local19 = Static26.aClass154_1.anApplet1;
		} else {
			local19 = Static197.aFrame1;
		}
		local19.setLayout(null);
		Static127.aCanvas1 = new Canvas_Sub2(this);
		local19.add(Static127.aCanvas1);
		Static127.aCanvas1.setSize(Static292.anInt5236, Static120.anInt2505);
		Static127.aCanvas1.setVisible(true);
		if (Static197.aFrame1 == local19) {
			@Pc(61) Insets local61 = Static197.aFrame1.getInsets();
			Static127.aCanvas1.setLocation(local61.left + Static103.anInt2068, Static209.anInt3975 + local61.top);
		} else {
			Static127.aCanvas1.setLocation(Static103.anInt2068, Static209.anInt3975);
		}
		Static127.aCanvas1.addFocusListener(this);
		Static127.aCanvas1.requestFocus();
		Static13.aBoolean6 = true;
		Static250.aBoolean313 = true;
		Static52.aBoolean380 = true;
		Static270.aBoolean338 = false;
		Static180.aLong124 = Static298.method4535();
	}

	@OriginalMember(owner = "client!l", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static197.aFrame1 == null) {
			return Static26.aClass154_1 == null || Static26.aClass154_1.anApplet1 == this ? super.getDocumentBase() : Static26.aClass154_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static197.aFrame1 == null) {
			return Static26.aClass154_1 == null || Static26.aClass154_1.anApplet1 == this ? super.getAppletContext() : Static26.aClass154_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	private void method671() {
		@Pc(8) long local8 = Static298.method4535();
		@Pc(12) long local12 = Static21.aLongArray2[Static179.anInt3460];
		Static21.aLongArray2[Static179.anInt3460] = local8;
		if (local12 != 0L && local12 < local8) {
			@Pc(30) int local30 = (int) (local8 - local12);
			Static69.anInt4976 = ((local30 >> 1) + 32000) / local30;
		}
		Static179.anInt3460 = Static179.anInt3460 + 1 & 0x1F;
		if (Static107.anInt2165++ > 50) {
			Static107.anInt2165 -= 50;
			Static52.aBoolean380 = true;
			Static127.aCanvas1.setSize(Static292.anInt5236, Static120.anInt2505);
			Static127.aCanvas1.setVisible(true);
			if (Static197.aFrame1 != null && Static275.aFrame2 == null) {
				@Pc(78) Insets local78 = Static197.aFrame1.getInsets();
				Static127.aCanvas1.setLocation(local78.left + Static103.anInt2068, local78.top + Static209.anInt3975);
			} else {
				Static127.aCanvas1.setLocation(Static103.anInt2068, Static209.anInt3975);
			}
		}
		this.method663();
	}

	@OriginalMember(owner = "client!l", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static107.anApplet_Sub1_1 != this || Static218.aBoolean72) {
			return;
		}
		Static52.aBoolean380 = true;
		if (Static311.aBoolean385 && !Static156.aBoolean211 && Static298.method4535() - Static180.aLong124 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || Static171.anInt3365 <= local27.width && Static132.anInt3685 <= local27.height) {
				Static270.aBoolean338 = true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static107.anApplet_Sub1_1 == this && !Static218.aBoolean72) {
			Static224.aLong145 = 0L;
		}
	}

	@OriginalMember(owner = "client!l", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
	protected abstract void method673();

	@OriginalMember(owner = "client!l", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static197.aFrame1 == null) {
			return Static26.aClass154_1 == null || Static26.aClass154_1.anApplet1 == this ? super.getParameter(arg0) : Static26.aClass154_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	protected abstract void method674();

	@OriginalMember(owner = "client!l", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZBIIIILjava/lang/String;I)V")
	protected final void method675(@OriginalArg(3) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static103.anInt2068 = 0;
			Static111.anInt2298 = 549;
			Static107.anApplet_Sub1_1 = this;
			Static209.anInt3975 = 0;
			Static120.anInt2505 = 768;
			Static132.anInt3685 = 768;
			Static292.anInt5236 = 1024;
			Static171.anInt3365 = 1024;
			Static197.aFrame1 = new Frame();
			Static197.aFrame1.setTitle("Jagex");
			Static197.aFrame1.setResizable(true);
			Static197.aFrame1.addWindowListener(this);
			Static197.aFrame1.setVisible(true);
			Static197.aFrame1.toFront();
			@Pc(43) Insets local43 = Static197.aFrame1.getInsets();
			Static197.aFrame1.setSize(local43.right + local43.left + Static171.anInt3365, local43.top + Static132.anInt3685 + local43.bottom);
			Static196.aClass154_3 = Static26.aClass154_1 = new Class154(null, arg0, arg1, 29);
			@Pc(75) Class185 local75 = Static26.aClass154_1.method3881(1, this);
			while (local75.anInt5276 == 0) {
				Static282.method4345(10L);
			}
			Static126.aThread3 = (Thread) local75.anObject6;
		} catch (@Pc(92) Exception local92) {
			Static159.method2733(local92, null);
		}
	}

	@OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static246.aString262 != null) {
				@Pc(11) String local11 = Static246.aString262.toLowerCase();
				if (local11.indexOf("sun") != -1 || local11.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static246.aString261;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method662("wrongjava");
						return;
					}
					Static53.anInt1031 = 5;
				} else if (local11.indexOf("ibm") != -1 && (Static246.aString261 == null || Static246.aString261.equals("1.4.2"))) {
					this.method662("wrongjava");
					return;
				}
			}
			@Pc(78) int local78;
			if (Static246.aString261 != null && Static246.aString261.startsWith("1.")) {
				@Pc(76) int local76 = 0;
				for (local78 = 2; Static246.aString261.length() > local78; local78++) {
					@Pc(90) char local90 = Static246.aString261.charAt(local78);
					if (local90 < '0' || local90 > '9') {
						break;
					}
					local76 = local90 + local76 * 10 - 48;
				}
				if (local76 >= 5) {
					Static311.aBoolean385 = true;
				}
			}
			if (Static26.aClass154_1.anApplet1 != null) {
				@Pc(125) Method local125 = Static246.aMethod2;
				if (local125 != null) {
					try {
						local125.invoke(Static26.aClass154_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(141) Throwable local141) {
					}
				}
			}
			Static169.method2871();
			this.method669();
			Static94.aClass58_3 = Static42.method795(Static127.aCanvas1, Static120.anInt2505, Static292.anInt5236);
			this.method660();
			Static53.aClass45_1 = Static313.method2574();
			this.method668();
			while (Static224.aLong145 == 0L || Static298.method4535() < Static224.aLong145) {
				Static75.anInt1557 = Static53.aClass45_1.method4592(Static53.anInt1031, Static134.anInt5649);
				for (local78 = 0; local78 < Static75.anInt1557; local78++) {
					this.method664();
				}
				this.method671();
				Static159.method2736(Static26.aClass154_1, Static127.aCanvas1);
			}
		} catch (@Pc(204) Exception local204) {
			Static159.method2733(local204, null);
			this.method662("crash");
		}
		this.method661(true);
	}

	@OriginalMember(owner = "client!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static250.aBoolean313 = true;
		Static52.aBoolean380 = true;
	}

	@OriginalMember(owner = "client!l", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static107.anApplet_Sub1_1 == this && !Static218.aBoolean72) {
			Static224.aLong145 = Static298.method4535() + 4000L;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
	protected abstract void method676();
}
