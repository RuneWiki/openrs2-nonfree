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

@OriginalClass("client!gh")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!gh", name = "providesignlink", descriptor = "(Lclient!vl;)V")
	public static void providesignlink(@OriginalArg(0) Class177 arg0) {
		Static299.aClass177_5 = arg0;
		Static47.aClass177_3 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
	protected abstract void method679();

	@OriginalMember(owner = "client!gh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static298.aFrame3 == null) {
			return Static299.aClass177_5 == null || Static299.aClass177_5.anApplet1 == this ? super.getDocumentBase() : Static299.aClass177_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	protected abstract void method680();

	@OriginalMember(owner = "client!gh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static299.aBoolean202 = true;
		Static248.aBoolean415 = true;
	}

	@OriginalMember(owner = "client!gh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static298.aFrame3 == null) {
			return Static299.aClass177_5 == null || Static299.aClass177_5.anApplet1 == this ? super.getCodeBase() : Static299.aClass177_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V")
	protected final void method681(@OriginalArg(4) int arg0) {
		try {
			if (Static87.anApplet_Sub1_1 != null) {
				Static164.anInt3454++;
				if (Static164.anInt3454 < 3) {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					return;
				}
				this.method691("alreadyloaded");
				return;
			}
			Static257.anInt5343 = 765;
			Static7.anInt240 = 765;
			Static14.anInt349 = 1543;
			Static87.anApplet_Sub1_1 = this;
			Static239.anInt4867 = 0;
			Static10.anInt283 = 0;
			Static20.anInt1235 = 503;
			Static112.anInt2423 = 503;
			@Pc(55) String local55 = this.getParameter("openwinjs");
			if (local55 != null && local55.equals("1")) {
				Static155.aBoolean491 = true;
			} else {
				Static155.aBoolean491 = false;
			}
			if (Static299.aClass177_5 == null) {
				Static47.aClass177_3 = Static299.aClass177_5 = new Class177(this, arg0, null, 0);
			}
			@Pc(87) Class28 local87 = Static299.aClass177_5.method4678(this, 1);
			while (local87.anInt726 == 0) {
				Static134.method2329(10L);
			}
			Static197.aThread2 = (Thread) local87.anObject2;
		} catch (@Pc(102) Exception local102) {
			Static108.method2009(local102, null);
			this.method691("crash");
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
	private void method682() {
		@Pc(7) long local7 = Static246.aLongArray21[Static55.anInt1263];
		@Pc(10) long local10 = Static6.method126();
		Static246.aLongArray21[Static55.anInt1263] = local10;
		if (local7 != 0L && local7 < local10) {
			@Pc(32) int local32 = (int) (local10 - local7);
			Static104.anInt2261 = ((local32 >> 1) + 32000) / local32;
		}
		Static55.anInt1263 = Static55.anInt1263 + 1 & 0x1F;
		if (Static284.anInt5880++ > 50) {
			Static284.anInt5880 -= 50;
			Static248.aBoolean415 = true;
			Static105.aCanvas1.setSize(Static257.anInt5343, Static20.anInt1235);
			Static105.aCanvas1.setVisible(true);
			if (Static298.aFrame3 != null && Static8.aFrame1 == null) {
				@Pc(81) Insets local81 = Static298.aFrame3.getInsets();
				Static105.aCanvas1.setLocation(Static239.anInt4867 + local81.left, local81.top - -Static10.anInt283);
			} else {
				Static105.aCanvas1.setLocation(Static239.anInt4867, Static10.anInt283);
			}
		}
		this.method692();
	}

	@OriginalMember(owner = "client!gh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static298.aFrame3 == null) {
			return Static299.aClass177_5 == null || Static299.aClass177_5.anApplet1 == this ? super.getParameter(arg0) : Static299.aClass177_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	public final synchronized void method684() {
		if (Static105.aCanvas1 != null) {
			Static105.aCanvas1.removeFocusListener(this);
			Static105.aCanvas1.getParent().remove(Static105.aCanvas1);
		}
		@Pc(21) Container local21;
		if (Static8.aFrame1 != null) {
			local21 = Static8.aFrame1;
		} else if (Static298.aFrame3 == null) {
			local21 = Static299.aClass177_5.anApplet1;
		} else {
			local21 = Static298.aFrame3;
		}
		local21.setLayout(null);
		Static105.aCanvas1 = new Canvas_Sub2(this);
		local21.add(Static105.aCanvas1);
		Static105.aCanvas1.setSize(Static257.anInt5343, Static20.anInt1235);
		Static105.aCanvas1.setVisible(true);
		if (Static298.aFrame3 == local21) {
			@Pc(55) Insets local55 = Static298.aFrame3.getInsets();
			Static105.aCanvas1.setLocation(Static239.anInt4867 + local55.left, local55.top + Static10.anInt283);
		} else {
			Static105.aCanvas1.setLocation(Static239.anInt4867, Static10.anInt283);
		}
		Static105.aCanvas1.addFocusListener(this);
		Static105.aCanvas1.requestFocus();
		Static299.aBoolean202 = true;
		Static283.aBoolean474 = true;
		Static248.aBoolean415 = true;
		Static52.aBoolean89 = false;
		Static238.aLong254 = Static6.method126();
	}

	@OriginalMember(owner = "client!gh", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static87.anApplet_Sub1_1 == this && !Static157.aBoolean268) {
			Static88.aLong250 = Static6.method126();
			Static134.method2329(5000L);
			Static47.aClass177_3 = null;
			this.method690(false);
		}
	}

	@OriginalMember(owner = "client!gh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!gh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static299.aBoolean202 = false;
	}

	@OriginalMember(owner = "client!gh", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static87.anApplet_Sub1_1 == this && !Static157.aBoolean268) {
			Static88.aLong250 = Static6.method126() + 4000L;
		}
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
	private void method686() {
		@Pc(6) long local6 = Static6.method126();
		@Pc(10) long local10 = Static84.aLongArray2[Static75.anInt1618];
		if (local10 != (long) 0 && local6 <= local10) {
		}
		Static84.aLongArray2[Static75.anInt1618] = local6;
		Static75.anInt1618 = Static75.anInt1618 + 1 & 0x1F;
		synchronized (this) {
			Static283.aBoolean474 = Static299.aBoolean202;
		}
		this.method689();
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)V")
	protected abstract void method687();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;IIZIIIB)V")
	protected final void method688(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		try {
			Static257.anInt5343 = 1024;
			Static7.anInt240 = 1024;
			Static87.anApplet_Sub1_1 = this;
			Static10.anInt283 = 0;
			Static14.anInt349 = 543;
			Static20.anInt1235 = 768;
			Static112.anInt2423 = 768;
			Static239.anInt4867 = 0;
			Static298.aFrame3 = new Frame();
			Static298.aFrame3.setTitle("Jagex");
			Static298.aFrame3.setResizable(true);
			Static298.aFrame3.addWindowListener(this);
			Static298.aFrame3.setVisible(true);
			Static298.aFrame3.toFront();
			@Pc(42) Insets local42 = Static298.aFrame3.getInsets();
			Static298.aFrame3.setSize(local42.right + Static7.anInt240 + local42.left, local42.bottom + Static112.anInt2423 - -local42.top);
			Static47.aClass177_3 = Static299.aClass177_5 = new Class177(null, arg1, arg0, 29);
			@Pc(76) Class28 local76 = Static299.aClass177_5.method4678(this, 1);
			while (local76.anInt726 == 0) {
				Static134.method2329(10L);
			}
			Static197.aThread2 = (Thread) local76.anObject2;
		} catch (@Pc(99) Exception local99) {
			Static108.method2009(local99, null);
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)V")
	protected abstract void method689();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V")
	private void method690(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static157.aBoolean268) {
				return;
			}
			Static157.aBoolean268 = true;
		}
		if (Static299.aClass177_5.anApplet1 != null) {
			Static299.aClass177_5.anApplet1.destroy();
		}
		try {
			this.method679();
		} catch (@Pc(38) Exception local38) {
		}
		if (Static105.aCanvas1 != null) {
			try {
				Static105.aCanvas1.removeFocusListener(this);
				Static105.aCanvas1.getParent().remove(Static105.aCanvas1);
			} catch (@Pc(50) Exception local50) {
			}
		}
		if (Static299.aClass177_5 != null) {
			try {
				Static299.aClass177_5.method4687();
			} catch (@Pc(58) Exception local58) {
			}
		}
		this.method680();
		if (Static298.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(68) Throwable local68) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!gh", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static87.anApplet_Sub1_1 == this && !Static157.aBoolean268) {
			Static88.aLong250 = 0L;
		}
	}

	@OriginalMember(owner = "client!gh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method691(@OriginalArg(1) String arg0) {
		if (this.aBoolean60) {
			return;
		}
		this.aBoolean60 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static303.method484("loggedout", Static299.aClass177_5.anApplet1);
		} catch (@Pc(30) Throwable local30) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!gh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
	protected abstract void method692();

	@OriginalMember(owner = "client!gh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!gh", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static282.aString282 != null) {
				@Pc(11) String local11 = Static282.aString282.toLowerCase();
				if (local11.indexOf("sun") != -1 || local11.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static282.aString284;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method691("wrongjava");
						return;
					}
					Static28.anInt610 = 5;
				} else if (local11.indexOf("ibm") != -1 && (Static282.aString284 == null || Static282.aString284.equals("1.4.2"))) {
					this.method691("wrongjava");
					return;
				}
			}
			@Pc(76) int local76;
			if (Static282.aString284 != null && Static282.aString284.startsWith("1.")) {
				local76 = 2;
				@Pc(78) int local78 = 0;
				while (local76 < Static282.aString284.length()) {
					@Pc(86) char local86 = Static282.aString284.charAt(local76);
					if (local86 < '0' || local86 > '9') {
						break;
					}
					local78 = local78 * 10 + local86 - 48;
					local76++;
				}
				if (local78 >= 5) {
					Static26.aBoolean46 = true;
				}
			}
			if (Static299.aClass177_5.anApplet1 != null) {
				@Pc(116) Method local116 = Static282.aMethod2;
				if (local116 != null) {
					try {
						local116.invoke(Static299.aClass177_5.anApplet1, Boolean.TRUE);
					} catch (@Pc(133) Throwable local133) {
					}
				}
			}
			Static96.method1835();
			this.method684();
			Static170.aClass14_1 = Static280.method4660(Static20.anInt1235, Static257.anInt5343, Static105.aCanvas1);
			this.method687();
			Static61.aClass22_2 = Static70.method1316();
			while (Static88.aLong250 == 0L || Static88.aLong250 > Static6.method126()) {
				Static163.anInt3422 = Static61.aClass22_2.method4640(Static28.anInt610, Static268.anInt5543);
				for (local76 = 0; local76 < Static163.anInt3422; local76++) {
					this.method686();
				}
				this.method682();
				Static120.method2209(Static105.aCanvas1, Static299.aClass177_5);
			}
		} catch (@Pc(187) Exception local187) {
			Static108.method2009(local187, null);
			this.method691("crash");
		}
		this.method690(true);
	}

	@OriginalMember(owner = "client!gh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static298.aFrame3 == null) {
			return Static299.aClass177_5 == null || Static299.aClass177_5.anApplet1 == this ? super.getAppletContext() : Static299.aClass177_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static87.anApplet_Sub1_1 != this || Static157.aBoolean268) {
			return;
		}
		Static248.aBoolean415 = true;
		if (Static26.aBoolean46 && !Static60.aBoolean106 && Static6.method126() - Static238.aLong254 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static7.anInt240 && Static112.anInt2423 <= local27.height) {
				Static52.aBoolean89 = true;
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)Z")
	protected final boolean method693() {
		@Pc(16) String local16 = this.getDocumentBase().getHost().toLowerCase();
		if (local16.equals("jagex.com") || local16.endsWith(".jagex.com")) {
			return true;
		} else if (local16.equals("runescape.com") || local16.endsWith(".runescape.com")) {
			return true;
		} else if (local16.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local16.length() > 0 && local16.charAt(local16.length() - 1) >= '0' && local16.charAt(local16.length() - 1) <= '9') {
				local16 = local16.substring(0, local16.length() - 1);
			}
			if (local16.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method691("invalidhost");
				return false;
			}
		}
	}
}
