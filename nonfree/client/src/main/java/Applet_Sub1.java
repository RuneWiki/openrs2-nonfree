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

@OriginalClass("client!td")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!td", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!td", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static39.anApplet_Sub1_1 == this && !Static7.aBoolean20) {
			Static189.aLong130 = Static68.method1276();
			Static119.method2069(5000L);
			Static191.aClass1_4 = null;
			this.method627(false);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
	private void method627(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static7.aBoolean20) {
				return;
			}
			Static7.aBoolean20 = true;
		}
		if (Static23.aClass1_1.anApplet1 != null) {
			Static23.aClass1_1.anApplet1.destroy();
		}
		if (Static69.aCanvas1 != null) {
			try {
				Static69.aCanvas1.removeFocusListener(this);
				@Pc(41) Container local41;
				if (Static67.aFrame1 == null) {
					local41 = Static23.aClass1_1.anApplet1;
				} else {
					local41 = Static67.aFrame1;
				}
				local41.remove(Static69.aCanvas1);
			} catch (@Pc(50) Exception local50) {
			}
		}
		try {
			this.method629();
		} catch (@Pc(56) Exception local56) {
		}
		if (Static23.aClass1_1 != null) {
			try {
				Static23.aClass1_1.method9();
			} catch (@Pc(63) Exception local63) {
			}
		}
		this.method636();
		if (Static67.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(73) Throwable local73) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!td", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static16.aBoolean120 = true;
		Static18.aBoolean104 = true;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	protected abstract void method628();

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	protected abstract void method629();

	@OriginalMember(owner = "client!td", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	protected final void method630(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static212.anInt4234 = 497;
			Static89.anInt4290 = 765;
			Static39.anApplet_Sub1_1 = this;
			Static190.anInt3767 = 503;
			Static67.aFrame1 = new Frame();
			Static67.aFrame1.setTitle("Jagex");
			Static67.aFrame1.setResizable(false);
			Static67.aFrame1.addWindowListener(this);
			Static67.aFrame1.setVisible(true);
			Static67.aFrame1.toFront();
			@Pc(37) Insets local37 = Static67.aFrame1.getInsets();
			Static67.aFrame1.setSize(local37.left + local37.right + 765, local37.top + 503 + local37.bottom);
			Static191.aClass1_4 = Static23.aClass1_1 = new Class1(true, null, arg1, arg0, 24);
			Static23.aClass1_1.method8(this, 1);
		} catch (@Pc(73) Exception local73) {
			Static188.method2856(null, local73);
		}
	}

	@OriginalMember(owner = "client!td", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static67.aFrame1 == null) {
			return Static23.aClass1_1 == null || Static23.aClass1_1.anApplet1 == this ? super.getParameter(arg0) : Static23.aClass1_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static16.aBoolean120 = false;
	}

	@OriginalMember(owner = "client!td", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	private void method632() {
		@Pc(6) long local6 = Static68.method1276();
		@Pc(10) long local10 = Static165.aLongArray6[Static142.anInt2989];
		Static165.aLongArray6[Static142.anInt2989] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local6 <= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static142.anInt2989 = Static142.anInt2989 + 1 & 0x1F;
		synchronized (this) {
			Static84.aBoolean98 = Static16.aBoolean120;
		}
		this.method634();
	}

	@OriginalMember(owner = "client!td", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)Z")
	protected final boolean method633() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
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
				this.method641("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	protected abstract void method634();

	@OriginalMember(owner = "client!td", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static67.aFrame1 == null) {
			return Static23.aClass1_1 == null || Static23.aClass1_1.anApplet1 == this ? super.getDocumentBase() : Static23.aClass1_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	protected final void method635(@OriginalArg(3) int arg0) {
		try {
			if (Static39.anApplet_Sub1_1 != null) {
				Static117.anInt2705++;
				if (Static117.anInt2705 >= 3) {
					this.method641("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static89.anInt4290 = 765;
			Static212.anInt4234 = 497;
			Static39.anApplet_Sub1_1 = this;
			Static190.anInt3767 = 503;
			if (Static23.aClass1_1 == null) {
				Static191.aClass1_4 = Static23.aClass1_1 = new Class1(false, this, arg0, null, 0);
			}
			Static23.aClass1_1.method8(this, 1);
		} catch (@Pc(55) Exception local55) {
			Static188.method2856(null, local55);
			this.method641("crash");
		}
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	protected abstract void method636();

	@OriginalMember(owner = "client!td", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static39.anApplet_Sub1_1 == this && !Static7.aBoolean20) {
			Static189.aLong130 = Static68.method1276() + 4000L;
		}
	}

	@OriginalMember(owner = "client!td", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static39.anApplet_Sub1_1 == this && !Static7.aBoolean20) {
			Static189.aLong130 = 0L;
		}
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	private void method637() {
		@Pc(6) long local6 = Static68.method1276();
		@Pc(10) long local10 = Static181.aLongArray7[Static107.anInt3107];
		Static181.aLongArray7[Static107.anInt3107] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(36) int local36 = (int) (local6 - local10);
			Static130.anInt2835 = ((local36 >> 1) + 32000) / local36;
		}
		Static107.anInt3107 = Static107.anInt3107 + 1 & 0x1F;
		if (Static27.anInt1417++ > 50) {
			Static18.aBoolean104 = true;
			Static27.anInt1417 -= 50;
			Static69.aCanvas1.setSize(Static89.anInt4290, Static190.anInt3767);
			Static69.aCanvas1.setVisible(true);
			if (Static67.aFrame1 == null) {
				Static69.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(77) Insets local77 = Static67.aFrame1.getInsets();
				Static69.aCanvas1.setLocation(local77.left, local77.top);
			}
		}
		this.method628();
	}

	@OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static1.aString3 != null) {
				@Pc(10) String local10 = Static1.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static1.aString2;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method641("wrongjava");
						return;
					}
					Static123.anInt2757 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static1.aString2 == null || Static1.aString2.equals("1.4.2"))) {
					this.method641("wrongjava");
					return;
				}
			}
			if (Static23.aClass1_1.anApplet1 != null) {
				@Pc(70) Method local70 = Static1.aMethod1;
				if (local70 != null) {
					try {
						local70.invoke(Static23.aClass1_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(85) Throwable local85) {
					}
				}
			}
			this.method639();
			Static191.aClass34_1 = Static102.method1768(Static89.anInt4290, Static69.aCanvas1, Static190.anInt3767);
			this.method638();
			Static189.aClass41_1 = Static185.method2832();
			while (Static189.aLong130 == 0L || Static189.aLong130 > Static68.method1276()) {
				Static159.anInt3224 = Static189.aClass41_1.method1581(Static43.anInt1142, Static123.anInt2757);
				for (@Pc(111) int local111 = 0; local111 < Static159.anInt3224; local111++) {
					this.method632();
				}
				this.method637();
				Static80.method1451(Static23.aClass1_1, Static69.aCanvas1);
			}
		} catch (@Pc(142) Exception local142) {
			Static188.method2856(null, local142);
			this.method641("crash");
		}
		this.method627(true);
	}

	@OriginalMember(owner = "client!td", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	protected abstract void method638();

	@OriginalMember(owner = "client!td", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static67.aFrame1 == null) {
			return Static23.aClass1_1 == null || Static23.aClass1_1.anApplet1 == this ? super.getAppletContext() : Static23.aClass1_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	private synchronized void method639() {
		@Pc(6) Container local6;
		if (Static67.aFrame1 == null) {
			local6 = Static23.aClass1_1.anApplet1;
		} else {
			local6 = Static67.aFrame1;
		}
		if (Static69.aCanvas1 != null) {
			Static69.aCanvas1.removeFocusListener(this);
			local6.remove(Static69.aCanvas1);
		}
		Static69.aCanvas1 = new Canvas_Sub1(this);
		local6.add(Static69.aCanvas1);
		Static69.aCanvas1.setSize(Static89.anInt4290, Static190.anInt3767);
		Static69.aCanvas1.setVisible(true);
		if (Static67.aFrame1 == null) {
			Static69.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(54) Insets local54 = Static67.aFrame1.getInsets();
			Static69.aCanvas1.setLocation(local54.left, local54.top);
		}
		Static69.aCanvas1.addFocusListener(this);
		Static69.aCanvas1.requestFocus();
		Static18.aBoolean104 = true;
		Static182.aLong126 = Static68.method1276();
	}

	@OriginalMember(owner = "client!td", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!td", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static67.aFrame1 == null) {
			return Static23.aClass1_1 == null || Static23.aClass1_1.anApplet1 == this ? super.getCodeBase() : Static23.aClass1_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method641(@OriginalArg(0) String arg0) {
		if (this.aBoolean47) {
			return;
		}
		this.aBoolean47 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!td", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static39.anApplet_Sub1_1 != this || Static7.aBoolean20) {
			return;
		}
		Static18.aBoolean104 = true;
		if (Static1.aString2 == null || !Static1.aString2.startsWith("1.5") || Static68.method1276() - Static182.aLong126 <= 1000L) {
			return;
		}
		@Pc(30) Rectangle local30 = arg0.getClipBounds();
		@Pc(45) boolean local45;
		if (local30 == null || Static89.anInt4290 <= local30.width && local30.height >= Static190.anInt3767) {
			local45 = true;
		} else {
			local45 = false;
		}
	}
}
