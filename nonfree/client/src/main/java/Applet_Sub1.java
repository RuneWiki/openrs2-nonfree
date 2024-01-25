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

@OriginalClass("client!lw")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!lw", name = "B", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!lw", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static531.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static613.aFrame2 == null) {
			return Static531.anApplet2 == null || Static531.anApplet2 == this ? super.getDocumentBase() : Static531.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "(I)Z")
	public final boolean method1339() {
		return Static425.method6393("jagtheora");
	}

	@OriginalMember(owner = "client!lw", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static93.aBoolean108 = true;
		Static467.aBoolean547 = true;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	protected final void method1340(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static267.anApplet_Sub1_1 == null) {
				Static312.anApplet1 = Static531.anApplet2;
				Static267.anApplet_Sub1_1 = this;
				Static365.anInt6233 = 0;
				Static159.anInt2414 = 661;
				Static563.anInt4939 = arg1;
				Static34.anInt543 = arg1;
				Static506.anInt8791 = arg3;
				Static235.anInt4561 = arg3;
				Static663.anInt10806 = 0;
				Static61.aClass173_2 = Static344.aClass173_5 = new Class173(arg2, arg0, 37, Static531.anApplet2 != null);
				@Pc(70) Class230 local70 = Static344.aClass173_5.method4250(1, this);
				while (local70.anInt6256 == 0) {
					Static548.method7968(10L);
				}
			} else {
				Static684.anInt11142++;
				if (Static684.anInt11142 >= 3) {
					this.method1346("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(82) Throwable local82) {
			Static629.method8829((String) null, local82);
			this.method1346("crash");
		}
	}

	@OriginalMember(owner = "client!lw", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!lw", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
	private void method1341() {
		@Pc(14) long local14 = Static26.method382();
		@Pc(18) long local18 = Static590.aLongArray19[Static507.anInt8803];
		Static590.aLongArray19[Static507.anInt8803] = local14;
		Static507.anInt8803 = Static507.anInt8803 + 1 & 0x1F;
		@Pc(41) boolean local41;
		if (local18 == 0L || local14 <= local18) {
			local41 = false;
		} else {
			local41 = true;
		}
		synchronized (this) {
			Static271.aBoolean373 = Static93.aBoolean108;
		}
		this.method1348();
	}

	@OriginalMember(owner = "client!lw", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static613.aFrame2 == null) {
			return Static531.anApplet2 == null || Static531.anApplet2 == this ? super.getAppletContext() : Static531.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZIIILjava/lang/String;IIB)V")
	protected final void method1342(@OriginalArg(4) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static365.anInt6233 = 0;
			Static159.anInt2414 = 661;
			Static267.anApplet_Sub1_1 = this;
			Static312.anApplet1 = null;
			Static506.anInt8791 = 768;
			Static235.anInt4561 = 768;
			Static663.anInt10806 = 0;
			Static563.anInt4939 = 1024;
			Static34.anInt543 = 1024;
			Static613.aFrame2 = new Frame();
			Static613.aFrame2.setTitle("Jagex");
			Static613.aFrame2.setResizable(true);
			Static613.aFrame2.addWindowListener(this);
			Static613.aFrame2.setVisible(true);
			Static613.aFrame2.toFront();
			@Pc(42) Insets local42 = Static613.aFrame2.getInsets();
			Static613.aFrame2.setSize(Static34.anInt543 + local42.left + local42.right, local42.top + Static235.anInt4561 + local42.bottom);
			Static61.aClass173_2 = Static344.aClass173_5 = new Class173(arg1, arg0, 37, true);
			@Pc(83) Class230 local83 = Static344.aClass173_5.method4250(1, this);
			while (local83.anInt6256 == 0) {
				Static548.method7968(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static629.method8829((String) null, local95);
		}
	}

	@OriginalMember(owner = "client!lw", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lw", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "(I)Z")
	public final boolean method1343() {
		return Static425.method6393("jaclib");
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V")
	private void method1344(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static75.aBoolean74) {
				return;
			}
			Static75.aBoolean74 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static531.anApplet2 != null) {
			Static531.anApplet2.destroy();
		}
		try {
			this.method1351();
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean90) {
			try {
				jagmisc.quit();
			} catch (@Pc(54) Throwable local54) {
			}
			this.aBoolean90 = false;
		}
		Static567.method8138();
		Static233.method3927();
		if (Static626.aCanvas12 != null) {
			try {
				Static626.aCanvas12.removeFocusListener(this);
				Static626.aCanvas12.getParent().remove(Static626.aCanvas12);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Static344.aClass173_5 != null) {
			try {
				Static344.aClass173_5.method4246();
			} catch (@Pc(82) Exception local82) {
			}
		}
		this.method1353();
		if (Static613.aFrame2 != null) {
			Static613.aFrame2.setVisible(false);
			Static613.aFrame2.dispose();
			Static613.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!lw", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static613.aFrame2 == null) {
			return Static531.anApplet2 == null || Static531.anApplet2 == this ? super.getCodeBase() : Static531.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "(I)Z")
	protected final boolean method1345() {
		@Pc(10) String local10 = this.getDocumentBase().getHost().toLowerCase();
		if (local10.equals("jagex.com") || local10.endsWith(".jagex.com")) {
			return true;
		} else if (local10.equals("runescape.com") || local10.endsWith(".runescape.com")) {
			return true;
		} else if (local10.equals("stellardawn.com") || local10.endsWith(".stellardawn.com")) {
			return true;
		} else if (local10.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local10.length() > 0 && local10.charAt(local10.length() - 1) >= '0' && local10.charAt(local10.length() - 1) <= '9') {
				local10 = local10.substring(0, local10.length() - 1);
			}
			if (12859 != 12859) {
				this.focusLost((FocusEvent) null);
			}
			if (local10.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1346("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method1346(@OriginalArg(1) String arg0) {
		if (this.aBoolean91) {
			return;
		}
		this.aBoolean91 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static698.method8237(Static531.anApplet2, "loggedout");
		} catch (@Pc(39) Throwable local39) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public synchronized void method1347() {
		if (Static626.aCanvas12 != null) {
			Static626.aCanvas12.removeFocusListener(this);
			Static626.aCanvas12.getParent().setBackground(Color.black);
			Static626.aCanvas12.getParent().remove(Static626.aCanvas12);
		}
		@Pc(27) Container local27;
		if (Static12.aFrame1 != null) {
			local27 = Static12.aFrame1;
		} else if (Static613.aFrame2 != null) {
			local27 = Static613.aFrame2;
		} else if (Static531.anApplet2 == null) {
			local27 = Static267.anApplet_Sub1_1;
		} else {
			local27 = Static531.anApplet2;
		}
		local27.setLayout((LayoutManager) null);
		Static626.aCanvas12 = new Canvas_Sub1(this);
		local27.add(Static626.aCanvas12);
		Static626.aCanvas12.setSize(Static563.anInt4939, Static506.anInt8791);
		Static626.aCanvas12.setVisible(true);
		if (local27 == Static613.aFrame2) {
			@Pc(73) Insets local73 = Static613.aFrame2.getInsets();
			Static626.aCanvas12.setLocation(Static365.anInt6233 + local73.left, Static663.anInt10806 + local73.top);
		} else {
			Static626.aCanvas12.setLocation(Static365.anInt6233, Static663.anInt10806);
		}
		Static626.aCanvas12.addFocusListener(this);
		Static626.aCanvas12.requestFocus();
		Static271.aBoolean373 = true;
		Static93.aBoolean108 = true;
		Static467.aBoolean547 = true;
		Static376.aBoolean625 = false;
		Static335.aLong163 = Static26.method382();
	}

	@OriginalMember(owner = "client!lw", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static267.anApplet_Sub1_1 == this && !Static75.aBoolean74) {
			Static396.aLong190 = 0L;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)V")
	protected abstract void method1348();

	@OriginalMember(owner = "client!lw", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static251.aString62 != null) {
				@Pc(10) String local10 = Static251.aString62.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(61) String local61 = Static251.aString64;
					if (local61.equals("1.1") || local61.startsWith("1.1.") || local61.equals("1.2") || local61.startsWith("1.2.")) {
						this.method1346("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static251.aString64 == null || Static251.aString64.equals("1.4.2"))) {
					this.method1346("wrongjava");
					return;
				}
			}
			if (Static251.aString64 != null && Static251.aString64.startsWith("1.")) {
				@Pc(115) int local115 = 2;
				@Pc(117) int local117 = 0;
				while (Static251.aString64.length() > local115) {
					@Pc(125) char local125 = Static251.aString64.charAt(local115);
					if (local125 < '0' || local125 > '9') {
						break;
					}
					local115++;
					local117 = local117 * 10 + local125 - 48;
				}
				if (local117 >= 5) {
					Static468.aBoolean548 = true;
				}
			}
			@Pc(161) Applet local161 = Static267.anApplet_Sub1_1;
			if (Static531.anApplet2 != null) {
				local161 = Static531.anApplet2;
			}
			@Pc(167) Method local167 = Static251.aMethod2;
			if (local167 != null) {
				try {
					local167.invoke(local161, Boolean.TRUE);
				} catch (@Pc(181) Throwable local181) {
				}
			}
			Static488.method7355();
			Static625.method9475();
			this.method1347();
			this.method1355();
			Static15.aClass2_1 = Static534.method7888();
			while (Static396.aLong190 == 0L || Static396.aLong190 > Static26.method382()) {
				Static465.anInt7805 = Static15.aClass2_1.method8988(Static579.aLong295);
				for (@Pc(206) int local206 = 0; local206 < Static465.anInt7805; local206++) {
					this.method1341();
				}
				this.method1352();
				Static19.method294(Static626.aCanvas12, Static344.aClass173_5);
			}
		} catch (@Pc(249) ThreadDeath local249) {
			throw local249;
		} catch (@Pc(252) Throwable local252) {
			Static629.method8829(this.method1350(), local252);
			this.method1346("crash");
		} finally {
			@Pc(270) Object local270 = null;
			this.method1344(true);
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)V")
	protected abstract void method1349();

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method1350() {
		return null;
	}

	@OriginalMember(owner = "client!lw", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lw", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static267.anApplet_Sub1_1 != this || Static75.aBoolean74) {
			return;
		}
		Static467.aBoolean547 = true;
		if (Static468.aBoolean548 && Static26.method382() - Static335.aLong163 > 1000L) {
			@Pc(31) Rectangle local31 = arg0.getClipBounds();
			if (local31 == null || local31.width >= Static34.anInt543 && local31.height >= Static235.anInt4561) {
				Static376.aBoolean625 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static267.anApplet_Sub1_1 == this && !Static75.aBoolean74) {
			Static396.aLong190 = Static26.method382() + 4000L;
		}
	}

	@OriginalMember(owner = "client!lw", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static267.anApplet_Sub1_1 == this && !Static75.aBoolean74) {
			Static396.aLong190 = Static26.method382();
			Static548.method7968(5000L);
			Static61.aClass173_2 = null;
			this.method1344(false);
		}
	}

	@OriginalMember(owner = "client!lw", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lw", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static613.aFrame2 == null) {
			return Static531.anApplet2 == null || Static531.anApplet2 == this ? super.getParameter(arg0) : Static531.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static93.aBoolean108 = false;
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(I)V")
	protected abstract void method1351();

	@OriginalMember(owner = "client!lw", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "(I)V")
	private void method1352() {
		@Pc(6) long local6 = Static26.method382();
		@Pc(10) long local10 = Static124.aLongArray8[Static399.anInt6985];
		Static124.aLongArray8[Static399.anInt6985] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(30) int local30 = (int) (local6 - local10);
			Static485.anInt8396 = ((local30 >> 1) + 32000) / local30;
		}
		Static399.anInt6985 = Static399.anInt6985 + 1 & 0x1F;
		if (Static288.anInt5260++ > 50) {
			Static288.anInt5260 -= 50;
			Static467.aBoolean547 = true;
			Static626.aCanvas12.setSize(Static563.anInt4939, Static506.anInt8791);
			Static626.aCanvas12.setVisible(true);
			if (Static613.aFrame2 != null && Static12.aFrame1 == null) {
				@Pc(83) Insets local83 = Static613.aFrame2.getInsets();
				Static626.aCanvas12.setLocation(local83.left + Static365.anInt6233, local83.top + Static663.anInt10806);
			} else {
				Static626.aCanvas12.setLocation(Static365.anInt6233, Static663.anInt10806);
			}
		}
		this.method1349();
	}

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "(I)V")
	protected abstract void method1353();

	@OriginalMember(owner = "client!lw", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)Z")
	public final boolean method1354() {
		return Static425.method6393("jagmisc");
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
	protected abstract void method1355();
}
