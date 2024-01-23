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

@OriginalClass("client!nc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!nc", name = "providesignlink", descriptor = "(Lclient!tk;)V")
	public static void providesignlink(@OriginalArg(0) Class164 arg0) {
		Static87.aClass164_2 = arg0;
		Static59.aClass164_4 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static27.aFrame3 == null) {
			return Static87.aClass164_2 == null || Static87.aClass164_2.anApplet1 == this ? super.getAppletContext() : Static87.aClass164_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static27.aFrame3 == null) {
			return Static87.aClass164_2 == null || Static87.aClass164_2.anApplet1 == this ? super.getCodeBase() : Static87.aClass164_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static260.aString175 != null) {
				@Pc(11) String local11 = Static260.aString175.toLowerCase();
				if (local11.indexOf("sun") != -1 || local11.indexOf("apple") != -1) {
					@Pc(44) String local44 = Static260.aString171;
					if (local44.equals("1.1") || local44.startsWith("1.1.") || local44.equals("1.2") || local44.startsWith("1.2.")) {
						this.method659("wrongjava");
						return;
					}
					Static277.anInt5179 = 5;
				} else if (local11.indexOf("ibm") != -1 && (Static260.aString171 == null || Static260.aString171.equals("1.4.2"))) {
					this.method659("wrongjava");
					return;
				}
			}
			@Pc(75) int local75;
			if (Static260.aString171 != null && Static260.aString171.startsWith("1.")) {
				local75 = 2;
				@Pc(77) int local77 = 0;
				while (local75 < Static260.aString171.length()) {
					@Pc(85) char local85 = Static260.aString171.charAt(local75);
					if (local85 < '0' || local85 > '9') {
						break;
					}
					local77 = local77 * 10 + local85 - 48;
					local75++;
				}
				if (local77 >= 5) {
					Static11.aBoolean8 = true;
				}
			}
			if (Static87.aClass164_2.anApplet1 != null) {
				@Pc(115) Method local115 = Static260.aMethod1;
				if (local115 != null) {
					try {
						local115.invoke(Static87.aClass164_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(131) Throwable local131) {
					}
				}
			}
			Static221.method3527();
			this.method656();
			Static26.aClass119_1 = Static267.method2843(Static235.aCanvas1, Static111.anInt2450, Static216.anInt4287);
			this.method662();
			Static92.aClass3_1 = Static89.method1425();
			while (Static94.aLong80 == 0L || Static94.aLong80 > Static133.method2163()) {
				Static63.anInt1189 = Static92.aClass3_1.method2842(Static277.anInt5179, Static235.anInt4584);
				for (local75 = 0; local75 < Static63.anInt1189; local75++) {
					this.method665();
				}
				this.method669();
				Static284.method4275(Static235.aCanvas1, Static87.aClass164_2);
			}
		} catch (@Pc(195) Exception local195) {
			Static244.method3721(null, local195);
			this.method659("crash");
		}
		this.method657(true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	protected abstract void method650();

	@OriginalMember(owner = "client!nc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!nc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static207.anApplet_Sub1_1 != this || Static118.aBoolean174) {
			return;
		}
		Static196.aBoolean249 = true;
		if (Static11.aBoolean8 && !Static178.aBoolean216 && Static133.method2163() - Static55.aLong39 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static179.anInt3545 && Static210.anInt4102 <= local27.height) {
				Static115.aBoolean170 = true;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static207.anApplet_Sub1_1 == this && !Static118.aBoolean174) {
			Static94.aLong80 = 0L;
		}
	}

	@OriginalMember(owner = "client!nc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static255.aBoolean313 = false;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V")
	public final synchronized void method656() {
		if (Static235.aCanvas1 != null) {
			Static235.aCanvas1.removeFocusListener(this);
			Static235.aCanvas1.getParent().remove(Static235.aCanvas1);
		}
		@Pc(23) Container local23;
		if (Static55.aFrame2 != null) {
			local23 = Static55.aFrame2;
		} else if (Static27.aFrame3 == null) {
			local23 = Static87.aClass164_2.anApplet1;
		} else {
			local23 = Static27.aFrame3;
		}
		local23.setLayout(null);
		Static235.aCanvas1 = new Canvas_Sub2(this);
		local23.add(Static235.aCanvas1);
		Static235.aCanvas1.setSize(Static111.anInt2450, Static216.anInt4287);
		Static235.aCanvas1.setVisible(true);
		if (local23 == Static27.aFrame3) {
			@Pc(60) Insets local60 = Static27.aFrame3.getInsets();
			Static235.aCanvas1.setLocation(Static35.anInt709 + local60.left, local60.top + Static122.anInt2660);
		} else {
			Static235.aCanvas1.setLocation(Static35.anInt709, Static122.anInt2660);
		}
		Static235.aCanvas1.addFocusListener(this);
		Static235.aCanvas1.requestFocus();
		Static159.aBoolean202 = true;
		Static255.aBoolean313 = true;
		Static196.aBoolean249 = true;
		Static115.aBoolean170 = false;
		Static55.aLong39 = Static133.method2163();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZZ)V")
	private void method657(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static118.aBoolean174) {
				return;
			}
			Static118.aBoolean174 = true;
		}
		if (Static87.aClass164_2.anApplet1 != null) {
			Static87.aClass164_2.anApplet1.destroy();
		}
		try {
			this.method650();
		} catch (@Pc(35) Exception local35) {
		}
		if (Static235.aCanvas1 != null) {
			try {
				Static235.aCanvas1.removeFocusListener(this);
				Static235.aCanvas1.getParent().remove(Static235.aCanvas1);
			} catch (@Pc(46) Exception local46) {
			}
		}
		if (Static87.aClass164_2 != null) {
			try {
				Static87.aClass164_2.method3943();
			} catch (@Pc(53) Exception local53) {
			}
		}
		this.method664();
		if (Static27.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(67) Throwable local67) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIZBLjava/lang/String;I)V")
	protected final void method658(@OriginalArg(1) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static111.anInt2450 = 1024;
			Static179.anInt3545 = 1024;
			Static207.anApplet_Sub1_1 = this;
			Static122.anInt2660 = 0;
			Static206.anInt4049 = 542;
			Static35.anInt709 = 0;
			Static216.anInt4287 = 768;
			Static210.anInt4102 = 768;
			Static27.aFrame3 = new Frame();
			Static27.aFrame3.setTitle("Jagex");
			Static27.aFrame3.setResizable(true);
			Static27.aFrame3.addWindowListener(this);
			Static27.aFrame3.setVisible(true);
			Static27.aFrame3.toFront();
			@Pc(46) Insets local46 = Static27.aFrame3.getInsets();
			Static27.aFrame3.setSize(local46.right + local46.left + Static179.anInt3545, Static210.anInt4102 + local46.top + local46.bottom);
			Static59.aClass164_4 = Static87.aClass164_2 = new Class164(null, arg0, arg1, 29);
			@Pc(78) Class123 local78 = Static87.aClass164_2.method3952(1, this);
			while (local78.anInt3791 == 0) {
				Static122.method2061(10L);
			}
			Static279.aThread3 = (Thread) local78.anObject4;
		} catch (@Pc(93) Exception local93) {
			Static244.method3721(null, local93);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method659(@OriginalArg(0) String arg0) {
		if (this.aBoolean62) {
			return;
		}
		this.aBoolean62 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static301.method121(Static87.aClass164_2.anApplet1, "loggedout");
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!nc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V")
	protected abstract void method660();

	@OriginalMember(owner = "client!nc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static27.aFrame3 == null) {
			return Static87.aClass164_2 == null || Static87.aClass164_2.anApplet1 == this ? super.getParameter(arg0) : Static87.aClass164_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	protected abstract void method662();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
	protected final void method663(@OriginalArg(2) int arg0) {
		try {
			if (Static207.anApplet_Sub1_1 != null) {
				Static243.anInt4648++;
				if (Static243.anInt4648 >= 3) {
					this.method659("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static216.anInt4287 = 503;
			Static210.anInt4102 = 503;
			Static122.anInt2660 = 0;
			Static207.anApplet_Sub1_1 = this;
			Static206.anInt4049 = 1542;
			Static111.anInt2450 = 765;
			Static179.anInt3545 = 765;
			Static35.anInt709 = 0;
			@Pc(52) String local52 = this.getParameter("openwinjs");
			if (local52 != null && local52.equals("1")) {
				Static269.aBoolean334 = true;
			} else {
				Static269.aBoolean334 = false;
			}
			if (Static87.aClass164_2 == null) {
				Static59.aClass164_4 = Static87.aClass164_2 = new Class164(this, arg0, null, 0);
			}
			@Pc(83) Class123 local83 = Static87.aClass164_2.method3952(1, this);
			while (local83.anInt3791 == 0) {
				Static122.method2061(10L);
			}
			Static279.aThread3 = (Thread) local83.anObject4;
		} catch (@Pc(97) Exception local97) {
			Static244.method3721(null, local97);
			this.method659("crash");
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	protected abstract void method664();

	@OriginalMember(owner = "client!nc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static27.aFrame3 == null) {
			return Static87.aClass164_2 == null || Static87.aClass164_2.anApplet1 == this ? super.getDocumentBase() : Static87.aClass164_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
	private void method665() {
		@Pc(7) long local7 = Static236.aLongArray11[Static30.anInt590];
		@Pc(10) long local10 = Static133.method2163();
		Static236.aLongArray11[Static30.anInt590] = local10;
		if (local7 != 0L && local10 > local7) {
		}
		Static30.anInt590 = Static30.anInt590 + 1 & 0x1F;
		synchronized (this) {
			Static159.aBoolean202 = Static255.aBoolean313;
		}
		this.method668();
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)Z")
	protected final boolean method666() {
		@Pc(6) String local6 = this.getDocumentBase().getHost().toLowerCase();
		if (local6.equals("jagex.com") || local6.endsWith(".jagex.com")) {
			return true;
		} else if (local6.equals("runescape.com") || local6.endsWith(".runescape.com")) {
			return true;
		} else if (local6.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local6.length() > 0 && local6.charAt(local6.length() - 1) >= '0' && local6.charAt(local6.length() - 1) <= '9') {
				local6 = local6.substring(0, local6.length() - 1);
			}
			if (local6.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method659("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static255.aBoolean313 = true;
		Static196.aBoolean249 = true;
	}

	@OriginalMember(owner = "client!nc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static207.anApplet_Sub1_1 == this && !Static118.aBoolean174) {
			Static94.aLong80 = Static133.method2163() + 4000L;
		}
	}

	@OriginalMember(owner = "client!nc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static207.anApplet_Sub1_1 == this && !Static118.aBoolean174) {
			Static94.aLong80 = Static133.method2163();
			Static122.method2061(5000L);
			Static59.aClass164_4 = null;
			this.method657(false);
		}
	}

	@OriginalMember(owner = "client!nc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
	protected abstract void method668();

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V")
	private void method669() {
		@Pc(7) long local7 = Static268.aLongArray14[Static283.anInt5357];
		@Pc(16) long local16 = Static133.method2163();
		Static268.aLongArray14[Static283.anInt5357] = local16;
		Static283.anInt5357 = Static283.anInt5357 + 1 & 0x1F;
		if (local7 != 0L && local7 < local16) {
			@Pc(39) int local39 = (int) (local16 - local7);
			Static85.anInt1723 = ((local39 >> 1) + 32000) / local39;
		}
		if (Static71.anInt1315++ > 50) {
			Static196.aBoolean249 = true;
			Static71.anInt1315 -= 50;
			Static235.aCanvas1.setSize(Static111.anInt2450, Static216.anInt4287);
			Static235.aCanvas1.setVisible(true);
			if (Static27.aFrame3 != null && Static55.aFrame2 == null) {
				@Pc(74) Insets local74 = Static27.aFrame3.getInsets();
				Static235.aCanvas1.setLocation(local74.left + Static35.anInt709, Static122.anInt2660 + local74.top);
			} else {
				Static235.aCanvas1.setLocation(Static35.anInt709, Static122.anInt2660);
			}
		}
		this.method660();
	}
}
