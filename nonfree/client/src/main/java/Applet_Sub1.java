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

@OriginalClass("client!ot")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ot", name = "cb", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!ot", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static395.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
	protected abstract void method1144();

	@OriginalMember(owner = "client!ot", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static75.aString26 != null) {
				@Pc(10) String local10 = Static75.aString26.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(61) String local61 = Static75.aString25;
					if (local61.equals("1.1") || local61.startsWith("1.1.") || local61.equals("1.2") || local61.startsWith("1.2.")) {
						this.method1153("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static75.aString25 == null || Static75.aString25.equals("1.4.2"))) {
					this.method1153("wrongjava");
					return;
				}
			}
			if (Static75.aString25 != null && Static75.aString25.startsWith("1.")) {
				@Pc(115) int local115 = 2;
				@Pc(117) int local117 = 0;
				while (Static75.aString25.length() > local115) {
					@Pc(125) char local125 = Static75.aString25.charAt(local115);
					if (local125 < '0' || local125 > '9') {
						break;
					}
					local117 = local125 + local117 * 10 - '0';
					local115++;
				}
				if (local117 >= 5) {
					Static513.aBoolean753 = true;
				}
			}
			@Pc(158) Applet local158 = Static31.anApplet_Sub1_3;
			if (Static395.anApplet1 != null) {
				local158 = Static395.anApplet1;
			}
			@Pc(164) Method local164 = Static75.aMethod1;
			if (local164 != null) {
				try {
					local164.invoke(local158, Boolean.TRUE);
				} catch (@Pc(178) Throwable local178) {
				}
			}
			Static495.method7147();
			Static82.method1059();
			this.method1151();
			this.method1148();
			Static420.aClass199_1 = Static672.method8909();
			while (Static699.aLong373 == 0L || Static699.aLong373 > Static626.method8479()) {
				Static522.anInt8874 = Static420.aClass199_1.method8111(Static11.aLong14);
				for (@Pc(203) int local203 = 0; local203 < Static522.anInt8874; local203++) {
					this.method1152();
				}
				this.method1158();
				Static627.method8497(Static67.aCanvas1, Static310.aClass47_4);
			}
		} catch (@Pc(250) ThreadDeath local250) {
			throw local250;
		} catch (@Pc(253) Throwable local253) {
			Static64.method799(this.method1159(), local253);
			this.method1153("crash");
		} finally {
			@Pc(271) Object local271 = null;
			this.method1145(true);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)V")
	private void method1145(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static362.aBoolean643) {
				return;
			}
			Static362.aBoolean643 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static395.anApplet1 != null) {
			Static395.anApplet1.destroy();
		}
		try {
			this.method1146();
		} catch (@Pc(49) Exception local49) {
		}
		if (this.aBoolean115) {
			try {
				jagmisc.quit();
			} catch (@Pc(55) Throwable local55) {
			}
			this.aBoolean115 = false;
		}
		Static253.method3957();
		Static114.method2021();
		if (Static67.aCanvas1 != null) {
			try {
				Static67.aCanvas1.removeFocusListener(this);
				Static67.aCanvas1.getParent().remove(Static67.aCanvas1);
			} catch (@Pc(77) Exception local77) {
			}
		}
		if (Static310.aClass47_4 != null) {
			try {
				Static310.aClass47_4.method955();
			} catch (@Pc(85) Exception local85) {
			}
		}
		this.method1155();
		if (Static131.aFrame1 != null) {
			Static131.aFrame1.setVisible(false);
			Static131.aFrame1.dispose();
			Static131.aFrame1 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)V")
	protected abstract void method1146();

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)Z")
	public final boolean method1147() {
		return Static376.method5425("jaclib");
	}

	@OriginalMember(owner = "client!ot", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "(I)V")
	protected abstract void method1148();

	@OriginalMember(owner = "client!ot", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static433.aBoolean579 = true;
		Static581.aBoolean690 = true;
	}

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "(I)Z")
	public final boolean method1149() {
		return Static376.method5425("jagtheora");
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
	protected abstract void method1150();

	@OriginalMember(owner = "client!ot", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static31.anApplet_Sub1_3 != this || Static362.aBoolean643) {
			return;
		}
		Static581.aBoolean690 = true;
		if (Static513.aBoolean753 && Static626.method8479() - Static79.aLong63 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || local29.width >= Static554.anInt9243 && Static57.anInt8465 <= local29.height) {
				Static489.aBoolean633 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ot", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	public synchronized void method1151() {
		if (Static67.aCanvas1 != null) {
			Static67.aCanvas1.removeFocusListener(this);
			Static67.aCanvas1.getParent().setBackground(Color.black);
			Static67.aCanvas1.getParent().remove(Static67.aCanvas1);
		}
		@Pc(32) Container local32;
		if (Static691.aFrame2 != null) {
			local32 = Static691.aFrame2;
		} else if (Static131.aFrame1 != null) {
			local32 = Static131.aFrame1;
		} else if (Static395.anApplet1 == null) {
			local32 = Static31.anApplet_Sub1_3;
		} else {
			local32 = Static395.anApplet1;
		}
		local32.setLayout((LayoutManager) null);
		Static67.aCanvas1 = new Canvas_Sub1(this);
		local32.add(Static67.aCanvas1);
		Static67.aCanvas1.setSize(Static575.anInt9435, Static272.anInt5005);
		Static67.aCanvas1.setVisible(true);
		if (local32 == Static131.aFrame1) {
			@Pc(69) Insets local69 = Static131.aFrame1.getInsets();
			Static67.aCanvas1.setLocation(local69.left + Static676.anInt10698, Static306.anInt5502 + local69.top);
		} else {
			Static67.aCanvas1.setLocation(Static676.anInt10698, Static306.anInt5502);
		}
		Static67.aCanvas1.addFocusListener(this);
		Static67.aCanvas1.requestFocus();
		Static153.aBoolean230 = true;
		Static433.aBoolean579 = true;
		Static581.aBoolean690 = true;
		Static489.aBoolean633 = false;
		Static79.aLong63 = Static626.method8479();
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
	private void method1152() {
		@Pc(14) long local14 = Static626.method8479();
		@Pc(18) long local18 = Static460.aLongArray21[Static482.anInt8388];
		Static460.aLongArray21[Static482.anInt8388] = local14;
		@Pc(35) boolean local35;
		if (local18 == 0L || local18 >= local14) {
			local35 = false;
		} else {
			local35 = true;
		}
		Static482.anInt8388 = Static482.anInt8388 + 1 & 0x1F;
		synchronized (this) {
			Static153.aBoolean230 = Static433.aBoolean579;
		}
		this.method1144();
	}

	@OriginalMember(owner = "client!ot", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static131.aFrame1 == null) {
			return Static395.anApplet1 == null || Static395.anApplet1 == this ? super.getCodeBase() : Static395.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ot", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static31.anApplet_Sub1_3 == this && !Static362.aBoolean643) {
			Static699.aLong373 = Static626.method8479();
			Static564.method7845(5000L);
			Static376.aClass47_5 = null;
			this.method1145(false);
		}
	}

	@OriginalMember(owner = "client!ot", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1153(@OriginalArg(0) String arg0) {
		if (this.aBoolean116) {
			return;
		}
		this.aBoolean116 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static733.method8728(Static395.anApplet1, "loggedout");
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(B)Z")
	protected final boolean method1154() {
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
			if (local10.endsWith("192.168.1.")) {
				return true;
			}
			if (40 <= 5) {
				this.run();
			}
			this.method1153("invalidhost");
			return false;
		}
	}

	@OriginalMember(owner = "client!ot", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static31.anApplet_Sub1_3 == this && !Static362.aBoolean643) {
			Static699.aLong373 = 0L;
		}
	}

	@OriginalMember(owner = "client!ot", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static131.aFrame1 == null) {
			return Static395.anApplet1 == null || Static395.anApplet1 == this ? super.getAppletContext() : Static395.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static131.aFrame1 == null) {
			return Static395.anApplet1 == null || Static395.anApplet1 == this ? super.getParameter(arg0) : Static395.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "(B)V")
	protected abstract void method1155();

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "(I)Z")
	public final boolean method1156() {
		return Static376.method5425("jagmisc");
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method1157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static31.anApplet_Sub1_3 == null) {
				Static306.anInt5502 = 0;
				Static272.anInt5005 = arg0;
				Static57.anInt8465 = arg0;
				Static31.anApplet_Sub1_3 = this;
				Static616.anInt9968 = 663;
				Static697.anApplet2 = Static395.anApplet1;
				Static575.anInt9435 = arg1;
				Static554.anInt9243 = arg1;
				Static676.anInt10698 = 0;
				Static376.aClass47_5 = Static310.aClass47_4 = new Class47(arg3, arg2, 37, Static395.anApplet1 != null);
				@Pc(72) Class201 local72 = Static310.aClass47_4.method941(this, 1);
				while (local72.anInt5729 == 0) {
					Static564.method7845(10L);
				}
			} else {
				Static195.anInt7171++;
				if (Static195.anInt7171 >= 3) {
					this.method1153("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(84) Throwable local84) {
			Static64.method799((String) null, local84);
			this.method1153("crash");
		}
	}

	@OriginalMember(owner = "client!ot", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static31.anApplet_Sub1_3 == this && !Static362.aBoolean643) {
			Static699.aLong373 = Static626.method8479() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "(I)V")
	private void method1158() {
		@Pc(15) long local15 = Static626.method8479();
		@Pc(19) long local19 = Static29.aLongArray1[Static652.anInt10454];
		Static29.aLongArray1[Static652.anInt10454] = local15;
		if (local19 != 0L && local19 < local15) {
			@Pc(41) int local41 = (int) (local15 - local19);
			Static482.anInt8392 = ((local41 >> 1) + 32000) / local41;
		}
		Static652.anInt10454 = Static652.anInt10454 + 1 & 0x1F;
		if (Static236.anInt4477++ > 50) {
			Static581.aBoolean690 = true;
			Static236.anInt4477 -= 50;
			Static67.aCanvas1.setSize(Static575.anInt9435, Static272.anInt5005);
			Static67.aCanvas1.setVisible(true);
			if (Static131.aFrame1 != null && Static691.aFrame2 == null) {
				@Pc(88) Insets local88 = Static131.aFrame1.getInsets();
				Static67.aCanvas1.setLocation(Static676.anInt10698 + local88.left, Static306.anInt5502 + local88.top);
			} else {
				Static67.aCanvas1.setLocation(Static676.anInt10698, Static306.anInt5502);
			}
		}
		this.method1150();
	}

	@OriginalMember(owner = "client!ot", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "(I)Ljava/lang/String;")
	public String method1159() {
		return null;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZIILjava/lang/String;IIII)V")
	protected final void method1160(@OriginalArg(3) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static272.anInt5005 = 768;
			Static57.anInt8465 = 768;
			Static697.anApplet2 = null;
			Static575.anInt9435 = 1024;
			Static554.anInt9243 = 1024;
			Static306.anInt5502 = 0;
			Static616.anInt9968 = 663;
			Static676.anInt10698 = 0;
			Static31.anApplet_Sub1_3 = this;
			Static131.aFrame1 = new Frame();
			Static131.aFrame1.setTitle("Jagex");
			Static131.aFrame1.setResizable(true);
			Static131.aFrame1.addWindowListener(this);
			Static131.aFrame1.setVisible(true);
			Static131.aFrame1.toFront();
			@Pc(49) Insets local49 = Static131.aFrame1.getInsets();
			Static131.aFrame1.setSize(local49.right + local49.left + Static554.anInt9243, local49.top + Static57.anInt8465 + local49.bottom);
			Static376.aClass47_5 = Static310.aClass47_4 = new Class47(arg1, arg0, 37, true);
			@Pc(81) Class201 local81 = Static310.aClass47_4.method941(this, 1);
			while (local81.anInt5729 == 0) {
				Static564.method7845(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static64.method799((String) null, local95);
		}
	}

	@OriginalMember(owner = "client!ot", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static433.aBoolean579 = false;
	}

	@OriginalMember(owner = "client!ot", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static131.aFrame1 == null) {
			return Static395.anApplet1 == null || Static395.anApplet1 == this ? super.getDocumentBase() : Static395.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}
}
