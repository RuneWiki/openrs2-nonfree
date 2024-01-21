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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	protected abstract void method275();

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	protected abstract void method276();

	@OriginalMember(owner = "client!ic", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	protected abstract void method277();

	@OriginalMember(owner = "client!ic", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static33.anApplet_Sub1_1 == this && !Static98.aBoolean123) {
			Static15.aLong17 = 0L;
		}
	}

	@OriginalMember(owner = "client!ic", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static43.aFrame1 == null) {
			return Static88.aClass32_4 == null || Static88.aClass32_4.anApplet1 == this ? super.getDocumentBase() : Static88.aClass32_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
	protected final void method279(@OriginalArg(4) int arg0) {
		try {
			if (Static33.anApplet_Sub1_1 == null) {
				Static24.anInt629 = 765;
				Static79.anInt819 = 423;
				Static16.anInt390 = 503;
				Static33.anApplet_Sub1_1 = this;
				if (Static88.aClass32_4 == null) {
					Static35.aClass32_2 = Static88.aClass32_4 = new Class32(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static88.aClass32_4.method952(1, this);
			} else {
				this.method283("alreadyloaded");
			}
		} catch (@Pc(49) Exception local49) {
			Static16.method293(null, local49);
			this.method283("crash");
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	private void method281() {
		@Pc(5) long local5 = System.currentTimeMillis();
		@Pc(9) long local9 = Static70.aLongArray10[Static69.anInt1781];
		Static70.aLongArray10[Static69.anInt1781] = local5;
		@Pc(24) boolean local24;
		if (local9 == 0L || local5 <= local9) {
			local24 = false;
		} else {
			local24 = true;
		}
		Static69.anInt1781 = Static69.anInt1781 + 1 & 0x1F;
		synchronized (this) {
			Static64.aBoolean88 = Static38.aBoolean51;
		}
		this.method285();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method283(@OriginalArg(1) String arg0) {
		if (this.aBoolean20) {
			return;
		}
		this.aBoolean20 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	private synchronized void method284() {
		if (Static98.aBoolean123) {
			return;
		}
		Static98.aBoolean123 = true;
		try {
			Static19.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method276();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static43.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static88.aClass32_4 != null) {
			try {
				Static88.aClass32_4.method948();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method286();
	}

	@OriginalMember(owner = "client!ic", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static33.anApplet_Sub1_1 == this && !Static98.aBoolean123) {
			Static15.aLong17 = System.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ic", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static43.aFrame1 == null) {
			return Static88.aClass32_4 == null || Static88.aClass32_4.anApplet1 == this ? super.getAppletContext() : Static88.aClass32_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static33.anApplet_Sub1_1 != this || Static98.aBoolean123) {
			return;
		}
		Static89.aBoolean121 = true;
		if (Static49.aString6 != null && Static49.aString6.startsWith("1.5") && System.currentTimeMillis() - Static78.aLong65 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || Static24.anInt629 <= local29.width && local29.height >= Static16.anInt390) {
				Static77.aBoolean102 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static43.aFrame1 == null) {
			return Static88.aClass32_4 == null || Static88.aClass32_4.anApplet1 == this ? super.getCodeBase() : Static88.aClass32_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	protected abstract void method285();

	@OriginalMember(owner = "client!ic", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static43.aFrame1 == null) {
			return Static88.aClass32_4 == null || Static88.aClass32_4.anApplet1 == this ? super.getParameter(arg0) : Static88.aClass32_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	protected abstract void method286();

	@OriginalMember(owner = "client!ic", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static38.aBoolean51 = true;
		Static89.aBoolean121 = true;
	}

	@OriginalMember(owner = "client!ic", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static33.anApplet_Sub1_1 == this && !Static98.aBoolean123) {
			Static15.aLong17 = System.currentTimeMillis();
			Static41.method888(5000L);
			Static35.aClass32_2 = null;
			this.method284();
		}
	}

	@OriginalMember(owner = "client!ic", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static49.aString2 != null) {
				@Pc(10) String local10 = Static49.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static49.aString6;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method283("wrongjava");
						return;
					}
					Static25.anInt655 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static49.aString6 == null || Static49.aString6.equals("1.4.2"))) {
					this.method283("wrongjava");
					return;
				}
			}
			this.method291();
			Static1.aClass12_1 = Static8.method182(Static19.aCanvas1, Static24.anInt629, Static16.anInt390);
			this.method275();
			Static11.aClass7_5 = Static109.method1460();
			Static11.aClass7_5.method682();
			while (Static15.aLong17 == 0L || Static15.aLong17 > System.currentTimeMillis()) {
				Static70.anInt1832 = Static11.aClass7_5.method683(Static25.anInt655, Static70.anInt1823);
				for (@Pc(91) int local91 = 0; local91 < Static70.anInt1832; local91++) {
					this.method281();
				}
				this.method288();
			}
		} catch (@Pc(117) Exception local117) {
			Static16.method293(null, local117);
			this.method283("crash");
		}
		this.method284();
	}

	@OriginalMember(owner = "client!ic", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static38.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
	private void method288() {
		@Pc(5) long local5 = System.currentTimeMillis();
		@Pc(9) long local9 = Static96.aLongArray9[Static104.anInt2719];
		Static96.aLongArray9[Static104.anInt2719] = local5;
		Static104.anInt2719 = Static104.anInt2719 + 1 & 0x1F;
		if (local9 != 0L && local9 < local5) {
			@Pc(36) int local36 = (int) (local5 - local9);
			Static70.anInt1833 = ((local36 >> 1) + 32000) / local36;
		}
		if (Static105.anInt2752++ > 50) {
			Static105.anInt2752 -= 50;
			Static89.aBoolean121 = true;
			Static19.aCanvas1.setSize(Static24.anInt629, Static16.anInt390);
			Static19.aCanvas1.setVisible(true);
			if (Static43.aFrame1 == null) {
				Static19.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(76) Insets local76 = Static43.aFrame1.getInsets();
				Static19.aCanvas1.setLocation(local76.left, local76.top);
			}
		}
		this.method277();
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)Z")
	protected final boolean method289() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.endsWith("jagex.com")) {
			return true;
		} else if (local8.endsWith("runescape.com")) {
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
				this.method283("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/net/InetAddress;IILjava/lang/String;III)V")
	protected final void method290(@OriginalArg(1) InetAddress arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2) {
		try {
			Static24.anInt629 = 765;
			Static16.anInt390 = 503;
			Static79.anInt819 = 423;
			Static33.anApplet_Sub1_1 = this;
			Static43.aFrame1 = new Frame();
			Static43.aFrame1.setTitle("Jagex");
			Static43.aFrame1.setResizable(false);
			Static43.aFrame1.addWindowListener(this);
			Static43.aFrame1.setVisible(true);
			Static43.aFrame1.toFront();
			@Pc(38) Insets local38 = Static43.aFrame1.getInsets();
			Static43.aFrame1.setSize(local38.right + local38.left + 765, local38.bottom + local38.top + 503);
			Static35.aClass32_2 = Static88.aClass32_4 = new Class32(true, null, arg0, arg1, arg2, 12);
			Static88.aClass32_4.method952(1, this);
		} catch (@Pc(74) Exception local74) {
			Static16.method293(null, local74);
		}
	}

	@OriginalMember(owner = "client!ic", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
	protected final synchronized void method291() {
		@Pc(9) Container local9;
		if (Static43.aFrame1 == null) {
			local9 = Static88.aClass32_4.anApplet1;
		} else {
			local9 = Static43.aFrame1;
		}
		if (Static19.aCanvas1 != null) {
			Static19.aCanvas1.removeFocusListener(this);
			local9.remove(Static19.aCanvas1);
		}
		Static19.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static19.aCanvas1);
		Static19.aCanvas1.setSize(Static24.anInt629, Static16.anInt390);
		Static19.aCanvas1.setVisible(true);
		if (Static43.aFrame1 == null) {
			Static19.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static43.aFrame1.getInsets();
			Static19.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static19.aCanvas1.addFocusListener(this);
		Static19.aCanvas1.requestFocus();
		Static89.aBoolean121 = true;
		Static77.aBoolean102 = false;
		Static78.aLong65 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!ic", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ic", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
