import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!wha")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!wha", name = "C", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!wha", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static303.anApplet3 = arg0;
	}

	@OriginalMember(owner = "client!wha", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static238.aBoolean695 = true;
		Static343.aBoolean465 = true;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
	private void method1291() {
		@Pc(12) long local12 = Static191.method3071();
		@Pc(16) long local16 = Static214.aLongArray7[Static15.anInt238];
		Static214.aLongArray7[Static15.anInt238] = local12;
		Static15.anInt238 = Static15.anInt238 + 1 & 0x1F;
		if (local16 != 0L && local12 > local16) {
			@Pc(44) int local44 = (int) (local12 - local16);
			Static557.anInt9262 = ((local44 >> 1) + 32000) / local44;
		}
		if (Static172.anInt3318++ > 50) {
			Static172.anInt3318 -= 50;
			Static343.aBoolean465 = true;
			Static617.aCanvas13.setSize(Static330.anInt6254, Static190.anInt3576);
			Static617.aCanvas13.setVisible(true);
			if (Static190.aFrame1 != null && Static355.aFrame7 == null) {
				@Pc(80) Insets local80 = Static190.aFrame1.getInsets();
				Static617.aCanvas13.setLocation(local80.left + Static294.anInt5875, Static303.anInt8406 + local80.top);
			} else {
				Static617.aCanvas13.setLocation(Static294.anInt5875, Static303.anInt8406);
			}
		}
		this.method1300();
	}

	@OriginalMember(owner = "client!wha", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)Z")
	protected final boolean method1292() {
		@Pc(14) String local14 = this.getDocumentBase().getHost().toLowerCase();
		if (local14.equals("jagex.com") || local14.endsWith(".jagex.com")) {
			return true;
		} else if (local14.equals("runescape.com") || local14.endsWith(".runescape.com")) {
			return true;
		} else if (local14.equals("stellardawn.com") || local14.endsWith(".stellardawn.com")) {
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
				this.method1308("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)V")
	public synchronized void method1293() {
		if (Static617.aCanvas13 != null) {
			Static617.aCanvas13.removeFocusListener(this);
			Static617.aCanvas13.getParent().setBackground(Color.black);
			Static617.aCanvas13.getParent().remove(Static617.aCanvas13);
		}
		@Pc(24) Container local24;
		if (Static355.aFrame7 != null) {
			local24 = Static355.aFrame7;
		} else if (Static190.aFrame1 != null) {
			local24 = Static190.aFrame1;
		} else if (Static303.anApplet3 == null) {
			local24 = Static467.anApplet_Sub1_1;
		} else {
			local24 = Static303.anApplet3;
		}
		local24.setLayout((LayoutManager) null);
		Static617.aCanvas13 = new Canvas_Sub1(this);
		local24.add(Static617.aCanvas13);
		Static617.aCanvas13.setSize(Static330.anInt6254, Static190.anInt3576);
		Static617.aCanvas13.setVisible(true);
		if (Static190.aFrame1 == local24) {
			@Pc(63) Insets local63 = Static190.aFrame1.getInsets();
			Static617.aCanvas13.setLocation(local63.left + Static294.anInt5875, local63.top - -Static303.anInt8406);
		} else {
			Static617.aCanvas13.setLocation(Static294.anInt5875, Static303.anInt8406);
		}
		Static617.aCanvas13.addFocusListener(this);
		Static617.aCanvas13.requestFocus();
		Static489.aBoolean602 = true;
		Static238.aBoolean695 = true;
		Static343.aBoolean465 = true;
		Static175.aBoolean246 = false;
		Static473.aLong211 = Static191.method3071();
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	private void method1294() {
		@Pc(6) long local6 = Static191.method3071();
		@Pc(10) long local10 = Static33.aLongArray2[Static392.anInt7045];
		Static33.aLongArray2[Static392.anInt7045] = local6;
		Static392.anInt7045 = Static392.anInt7045 + 1 & 0x1F;
		@Pc(31) boolean local31;
		if (local10 == 0L || local10 >= local6) {
			local31 = false;
		} else {
			local31 = true;
		}
		synchronized (this) {
			Static489.aBoolean602 = Static238.aBoolean695;
		}
		this.method1298();
	}

	@OriginalMember(owner = "client!wha", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static467.anApplet_Sub1_1 == this && !Static129.aBoolean209) {
			Static20.aLong15 = 0L;
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BZ)V")
	private void method1295(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static129.aBoolean209) {
				return;
			}
			Static129.aBoolean209 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static303.anApplet3 != null) {
			Static303.anApplet3.destroy();
		}
		try {
			this.method1296();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean106) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean106 = false;
		}
		Static434.method6598();
		Static312.method5234();
		if (Static617.aCanvas13 != null) {
			try {
				Static617.aCanvas13.removeFocusListener(this);
				Static617.aCanvas13.getParent().remove(Static617.aCanvas13);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static48.aClass298_12 != null) {
			try {
				Static48.aClass298_12.method7277();
			} catch (@Pc(72) Exception local72) {
			}
		}
		this.method1304();
		if (Static190.aFrame1 != null) {
			Static190.aFrame1.setVisible(false);
			Static190.aFrame1.dispose();
			Static190.aFrame1 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(B)V")
	protected abstract void method1296();

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "(B)V")
	protected abstract void method1298();

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIZLjava/lang/String;ZII)V")
	protected final void method1299(@OriginalArg(2) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static330.anInt6254 = 1024;
			Static136.anInt2830 = 1024;
			Static26.anInt392 = 641;
			Static190.anInt3576 = 768;
			Static155.anInt3159 = 768;
			Static467.anApplet_Sub1_1 = this;
			Static303.anInt8406 = 0;
			Static73.anApplet1 = null;
			Static294.anInt5875 = 0;
			Static190.aFrame1 = new Frame();
			Static190.aFrame1.setTitle("Jagex");
			Static190.aFrame1.setResizable(true);
			Static190.aFrame1.addWindowListener(this);
			Static190.aFrame1.setVisible(true);
			Static190.aFrame1.toFront();
			@Pc(40) Insets local40 = Static190.aFrame1.getInsets();
			Static190.aFrame1.setSize(local40.right + Static136.anInt2830 + local40.left, local40.bottom + local40.top + Static155.anInt3159);
			Static640.aClass298_15 = Static48.aClass298_12 = new Class298(arg0, arg1, 37, true);
			@Pc(73) Class174 local73 = Static48.aClass298_12.method7289(1, this);
			while (local73.anInt5121 == 0) {
				Static143.method2414(10L);
			}
		} catch (@Pc(86) Exception local86) {
			Static296.method5075(local86, (String) null);
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
	protected abstract void method1300();

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method1301() {
		return null;
	}

	@OriginalMember(owner = "client!wha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static238.aBoolean695 = false;
	}

	@OriginalMember(owner = "client!wha", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static190.aFrame1 == null) {
			return Static303.anApplet3 == null || Static303.anApplet3 == this ? super.getAppletContext() : Static303.anApplet3.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wha", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wha", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!wha", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static190.aFrame1 == null) {
			return Static303.anApplet3 == null || Static303.anApplet3 == this ? super.getCodeBase() : Static303.anApplet3.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wha", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static467.anApplet_Sub1_1 == this && !Static129.aBoolean209) {
			Static20.aLong15 = Static191.method3071() + 4000L;
		}
	}

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "(B)V")
	protected abstract void method1302();

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "(I)Z")
	public final boolean method1303() {
		return Static422.method6653("jaclib");
	}

	@OriginalMember(owner = "client!wha", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static467.anApplet_Sub1_1 == this && !Static129.aBoolean209) {
			Static20.aLong15 = Static191.method3071();
			Static143.method2414(5000L);
			Static640.aClass298_15 = null;
			this.method1295(false);
		}
	}

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "(I)V")
	protected abstract void method1304();

	@OriginalMember(owner = "client!wha", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static501.aString73 != null) {
				@Pc(10) String local10 = Static501.aString73.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static501.aString79;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method1308("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static501.aString79 == null || Static501.aString79.equals("1.4.2"))) {
					this.method1308("wrongjava");
					return;
				}
			}
			if (Static501.aString79 != null && Static501.aString79.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (Static501.aString79.length() > local70) {
					@Pc(78) char local78 = Static501.aString79.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local72 = local72 * 10 + local78 - 48;
					local70++;
				}
				if (local72 >= 5) {
					Static129.aBoolean210 = true;
				}
			}
			@Pc(109) Applet local109 = Static467.anApplet_Sub1_1;
			if (Static303.anApplet3 != null) {
				local109 = Static303.anApplet3;
			}
			@Pc(115) Method local115 = Static501.aMethod1;
			if (local115 != null) {
				try {
					local115.invoke(local109, Boolean.TRUE);
				} catch (@Pc(129) Throwable local129) {
				}
			}
			Static209.method3273();
			Static411.method6902();
			this.method1293();
			this.method1302();
			Static602.aClass28_1 = Static402.method6292();
			while (Static20.aLong15 == 0L || Static20.aLong15 > Static191.method3071()) {
				Static420.anInt7405 = Static602.aClass28_1.method8216(Static35.aLong33);
				for (@Pc(152) int local152 = 0; local152 < Static420.anInt7405; local152++) {
					this.method1294();
				}
				this.method1291();
				Static256.method4294(Static48.aClass298_12, Static617.aCanvas13);
			}
		} catch (@Pc(183) ThreadDeath local183) {
			throw local183;
		} catch (@Pc(186) Throwable local186) {
			Static296.method5075(local186, this.method1301());
			this.method1308("crash");
		} finally {
			@Pc(202) Object local202 = null;
			this.method1295(true);
		}
	}

	@OriginalMember(owner = "client!wha", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!wha", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static190.aFrame1 == null) {
			return Static303.anApplet3 == null || Static303.anApplet3 == this ? super.getDocumentBase() : Static303.anApplet3.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wha", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static467.anApplet_Sub1_1 != this || Static129.aBoolean209) {
			return;
		}
		Static343.aBoolean465 = true;
		if (Static129.aBoolean210 && Static191.method3071() - Static473.aLong211 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static136.anInt2830 && Static155.anInt3159 <= local26.height) {
				Static175.aBoolean246 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wha", name = "f", descriptor = "(B)Z")
	public final boolean method1305() {
		return Static422.method6653("jagtheora");
	}

	@OriginalMember(owner = "client!wha", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wha", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method1307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (Static467.anApplet_Sub1_1 == null) {
				Static26.anInt392 = 641;
				Static330.anInt6254 = arg0;
				Static136.anInt2830 = arg0;
				Static190.anInt3576 = arg2;
				Static155.anInt3159 = arg2;
				Static73.anApplet1 = Static303.anApplet3;
				Static303.anInt8406 = 0;
				Static467.anApplet_Sub1_1 = this;
				Static294.anInt5875 = 0;
				Static640.aClass298_15 = Static48.aClass298_12 = new Class298(arg1, arg3, 37, Static303.anApplet3 != null);
				@Pc(69) Class174 local69 = Static48.aClass298_12.method7289(1, this);
				while (local69.anInt5121 == 0) {
					Static143.method2414(10L);
				}
			} else {
				Static37.anInt576++;
				if (Static37.anInt576 >= 3) {
					this.method1308("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(82) Throwable local82) {
			Static296.method5075(local82, (String) null);
			this.method1308("crash");
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1308(@OriginalArg(1) String arg0) {
		if (this.aBoolean107) {
			return;
		}
		this.aBoolean107 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static652.method1818("loggedout", Static303.anApplet3);
		} catch (@Pc(30) Throwable local30) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!wha", name = "f", descriptor = "(I)Z")
	public final boolean method1309() {
		return Static422.method6653("jagmisc");
	}

	@OriginalMember(owner = "client!wha", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wha", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wha", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static190.aFrame1 == null) {
			return Static303.anApplet3 == null || Static303.anApplet3 == this ? super.getParameter(arg0) : Static303.anApplet3.getParameter(arg0);
		} else {
			return null;
		}
	}
}
