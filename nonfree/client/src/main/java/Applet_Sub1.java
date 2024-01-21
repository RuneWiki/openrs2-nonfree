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

@OriginalClass("client!ba")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ba", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ba", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static202.anApplet_Sub1_2 == this && !Static153.aBoolean141) {
			Static143.aLong49 = Static190.method3141();
			Static135.method2569(5000L);
			Static164.aClass14_4 = null;
			this.method592(false);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	protected final void method582(@OriginalArg(4) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static33.anInt972 = 503;
			Static134.anInt3339 = 493;
			Static202.anApplet_Sub1_2 = this;
			Static176.anInt3920 = 765;
			Static165.aFrame1 = new Frame();
			Static165.aFrame1.setTitle("Jagex");
			Static165.aFrame1.setResizable(false);
			Static165.aFrame1.addWindowListener(this);
			Static165.aFrame1.setVisible(true);
			Static165.aFrame1.toFront();
			@Pc(32) Insets local32 = Static165.aFrame1.getInsets();
			Static165.aFrame1.setSize(local32.left + local32.right + 765, local32.bottom + local32.top + 503);
			Static164.aClass14_4 = Static153.aClass14_3 = new Class14(true, null, arg0, arg1, 24);
			Static153.aClass14_3.method625(this, 1);
		} catch (@Pc(69) Exception local69) {
			Static107.method1977(local69, null);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z")
	protected final boolean method583() {
		@Pc(15) String local15 = this.getDocumentBase().getHost().toLowerCase();
		if (local15.equals("jagex.com") || local15.endsWith(".jagex.com")) {
			return true;
		} else if (local15.equals("runescape.com") || local15.endsWith(".runescape.com")) {
			return true;
		} else if (local15.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local15.length() > 0 && local15.charAt(local15.length() - 1) >= '0' && local15.charAt(local15.length() - 1) <= '9') {
				local15 = local15.substring(0, local15.length() - 1);
			}
			if (local15.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method585("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static179.aBoolean161 = true;
		Static174.aBoolean157 = true;
	}

	@OriginalMember(owner = "client!ba", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static179.aBoolean161 = false;
	}

	@OriginalMember(owner = "client!ba", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static165.aFrame1 == null) {
			return Static153.aClass14_3 == null || Static153.aClass14_3.anApplet1 == this ? super.getAppletContext() : Static153.aClass14_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ba", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static202.anApplet_Sub1_2 == this && !Static153.aBoolean141) {
			Static143.aLong49 = 0L;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method585(@OriginalArg(1) String arg0) {
		if (this.aBoolean35) {
			return;
		}
		this.aBoolean35 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ba", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ba", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	protected abstract void method586();

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	protected abstract void method587();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	protected abstract void method588();

	@OriginalMember(owner = "client!ba", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static202.anApplet_Sub1_2 == this && !Static153.aBoolean141) {
			Static143.aLong49 = Static190.method3141() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ba", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static165.aFrame1 == null) {
			return Static153.aClass14_3 == null || Static153.aClass14_3.anApplet1 == this ? super.getParameter(arg0) : Static153.aClass14_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ba", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static165.aFrame1 == null) {
			return Static153.aClass14_3 == null || Static153.aClass14_3.anApplet1 == this ? super.getCodeBase() : Static153.aClass14_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	protected abstract void method590();

	@OriginalMember(owner = "client!ba", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static165.aFrame1 == null) {
			return Static153.aClass14_3 == null || Static153.aClass14_3.anApplet1 == this ? super.getDocumentBase() : Static153.aClass14_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
	private void method591() {
		@Pc(11) long local11 = Static190.method3141();
		@Pc(15) long local15 = Static100.aLongArray5[Static83.anInt2028];
		Static100.aLongArray5[Static83.anInt2028] = local11;
		Static83.anInt2028 = Static83.anInt2028 + 1 & 0x1F;
		if (local15 != 0L && local15 < local11) {
			@Pc(41) int local41 = (int) (local11 - local15);
			Static81.anInt2015 = ((local41 >> 1) + 32000) / local41;
		}
		if (Static79.anInt1930++ > 50) {
			Static79.anInt1930 -= 50;
			Static174.aBoolean157 = true;
			Static36.aCanvas1.setSize(Static176.anInt3920, Static33.anInt972);
			Static36.aCanvas1.setVisible(true);
			if (Static165.aFrame1 == null) {
				Static36.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(76) Insets local76 = Static165.aFrame1.getInsets();
				Static36.aCanvas1.setLocation(local76.left, local76.top);
			}
		}
		this.method599();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZB)V")
	private void method592(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static153.aBoolean141) {
				return;
			}
			Static153.aBoolean141 = true;
		}
		if (Static153.aClass14_3.anApplet1 != null) {
			Static153.aClass14_3.anApplet1.destroy();
		}
		if (Static36.aCanvas1 != null) {
			try {
				Static36.aCanvas1.removeFocusListener(this);
				@Pc(42) Container local42;
				if (Static165.aFrame1 == null) {
					local42 = Static153.aClass14_3.anApplet1;
				} else {
					local42 = Static165.aFrame1;
				}
				local42.remove(Static36.aCanvas1);
			} catch (@Pc(50) Exception local50) {
			}
		}
		try {
			this.method587();
		} catch (@Pc(58) Exception local58) {
		}
		if (Static153.aClass14_3 != null) {
			try {
				Static153.aClass14_3.method619();
			} catch (@Pc(65) Exception local65) {
			}
		}
		this.method590();
		if (Static165.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(75) Throwable local75) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ba", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
	private synchronized void method594() {
		@Pc(6) Container local6;
		if (Static165.aFrame1 == null) {
			local6 = Static153.aClass14_3.anApplet1;
		} else {
			local6 = Static165.aFrame1;
		}
		if (Static36.aCanvas1 != null) {
			Static36.aCanvas1.removeFocusListener(this);
			local6.remove(Static36.aCanvas1);
		}
		Static36.aCanvas1 = new Canvas_Sub1(this);
		local6.add(Static36.aCanvas1);
		Static36.aCanvas1.setSize(Static176.anInt3920, Static33.anInt972);
		Static36.aCanvas1.setVisible(true);
		if (Static165.aFrame1 == null) {
			Static36.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static165.aFrame1.getInsets();
			Static36.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static36.aCanvas1.addFocusListener(this);
		Static36.aCanvas1.requestFocus();
		Static174.aBoolean157 = true;
		Static13.aLong28 = Static190.method3141();
	}

	@OriginalMember(owner = "client!ba", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
	protected final void method597(@OriginalArg(4) int arg0) {
		try {
			if (Static202.anApplet_Sub1_2 == null) {
				Static134.anInt3339 = 493;
				Static176.anInt3920 = 765;
				Static202.anApplet_Sub1_2 = this;
				Static33.anInt972 = 503;
				if (Static153.aClass14_3 == null) {
					Static164.aClass14_4 = Static153.aClass14_3 = new Class14(false, this, arg0, null, 0);
				}
				Static153.aClass14_3.method625(this, 1);
			} else {
				Static115.anInt2805++;
				if (Static115.anInt2805 >= 3) {
					this.method585("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(58) Exception local58) {
			Static107.method1977(local58, null);
			this.method585("crash");
		}
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
	protected abstract void method599();

	@OriginalMember(owner = "client!ba", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static32.aString1 != null) {
				@Pc(10) String local10 = Static32.aString1.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static32.aString3;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method585("wrongjava");
						return;
					}
					Static160.anInt2785 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static32.aString3 == null || Static32.aString3.equals("1.4.2"))) {
					this.method585("wrongjava");
					return;
				}
			}
			if (Static153.aClass14_3.anApplet1 != null) {
				@Pc(69) Method local69 = Static32.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(Static153.aClass14_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method594();
			Static188.aClass37_1 = Static70.method1202(Static33.anInt972, Static36.aCanvas1, Static176.anInt3920);
			this.method586();
			Static53.aClass20_1 = Static53.method945();
			while (Static143.aLong49 == 0L || Static143.aLong49 > Static190.method3141()) {
				Static116.anInt2830 = Static53.aClass20_1.method1111(Static160.anInt2785, Static41.anInt1102);
				for (@Pc(110) int local110 = 0; local110 < Static116.anInt2830; local110++) {
					this.method600();
				}
				this.method591();
				Static105.method1957(Static36.aCanvas1, Static153.aClass14_3);
			}
		} catch (@Pc(141) Exception local141) {
			Static107.method1977(local141, null);
			this.method585("crash");
		}
		this.method592(true);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
	private void method600() {
		@Pc(6) long local6 = Static190.method3141();
		@Pc(10) long local10 = Static25.aLongArray1[Static198.anInt4265];
		Static25.aLongArray1[Static198.anInt4265] = local6;
		@Pc(27) boolean local27;
		if (local10 == 0L || local6 <= local10) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static198.anInt4265 = Static198.anInt4265 + 1 & 0x1F;
		synchronized (this) {
			Static40.aBoolean42 = Static179.aBoolean161;
		}
		this.method588();
	}

	@OriginalMember(owner = "client!ba", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static202.anApplet_Sub1_2 != this || Static153.aBoolean141) {
			return;
		}
		Static174.aBoolean157 = true;
		if (Static32.aString3 == null || !Static32.aString3.startsWith("1.5") || Static190.method3141() - Static13.aLong28 <= 1000L) {
			return;
		}
		@Pc(27) Rectangle local27 = arg0.getClipBounds();
		@Pc(42) boolean local42;
		if (local27 == null || local27.width >= Static176.anInt3920 && Static33.anInt972 <= local27.height) {
			local42 = true;
		} else {
			local42 = false;
		}
	}

	@OriginalMember(owner = "client!ba", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
