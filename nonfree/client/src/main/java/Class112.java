import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class112 implements Runnable {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[Lclient!af;")
	public Class5[] aClass5Array1;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!qg;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!en;")
	private Class47 aClass47_4 = null;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!af;")
	public Class5 aClass5_1 = null;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!en;")
	private Class47 aClass47_5 = null;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Lclient!af;")
	public Class5 aClass5_2 = null;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "Lclient!af;")
	public Class5 aClass5_3 = null;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class112(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static179.aString255 = "1.1";
		Static179.aString256 = "Unknown";
		try {
			Static179.aString256 = System.getProperty("java.vendor");
			Static179.aString255 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static179.aString259 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static179.aString259 = "Unknown";
		}
		Static179.aString261 = Static179.aString259.toLowerCase();
		try {
			Static179.aString258 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static179.aString258 = "";
		}
		try {
			Static179.aString260 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static179.aString260 = "";
		}
		try {
			Static179.aString257 = System.getProperty("user.home");
			if (Static179.aString257 != null) {
				Static179.aString257 = Static179.aString257 + "/";
			}
		} catch (@Pc(80) Exception local80) {
		}
		if (Static179.aString257 == null) {
			Static179.aString257 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(91) Throwable local91) {
		}
		try {
			if (arg0 == null) {
				Static179.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static179.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(118) Exception local118) {
		}
		try {
			if (arg0 == null) {
				Static179.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static179.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(146) Exception local146) {
		}
		this.aBoolean248 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)Lclient!en;")
	public Class47 method2878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return this.method2888(arg2 + (arg1 << 16), arg0 << 16, null, 6);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!en;")
	public Class47 method2879(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method2888(arg0, 0, arg1, 2);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/Component;Ljava/awt/Point;BI[I)Lclient!en;")
	public Class47 method2880(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		return this.method2888(arg3, arg0, new Object[] { arg1, arg4, arg2 }, 17);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	public void method2881() {
		Static179.aLong139 = Static258.method3967() + 5000L;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/lang/String;)Lclient!en;")
	public Class47 method2882(@OriginalArg(1) String arg0) {
		return this.method2888(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!en;")
	public Class47 method2883(@OriginalArg(0) URL arg0) {
		return this.method2888(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!en;")
	public Class47 method2884(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2888(0, 0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B[Ljava/lang/Class;)Lclient!en;")
	public Class47 method2885(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method2888(0, 0, new Object[] { arg0, arg1, arg2 }, 8);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lclient!qg;")
	public Interface5 method2886() {
		return this.anInterface5_2;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!en;")
	public Class47 method2887(@OriginalArg(1) int arg0) {
		return this.method2888(arg0, 0, null, 3);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!en;")
	private Class47 method2888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class47 local3 = new Class47();
		local3.anInt1416 = arg0;
		local3.anInt1418 = arg3;
		local3.anObject1 = arg2;
		synchronized (this) {
			if (this.aClass47_4 == null) {
				this.aClass47_4 = this.aClass47_5 = local3;
			} else {
				this.aClass47_4.aClass47_1 = local3;
				this.aClass47_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!en;")
	public Class47 method2889(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method2888(arg1, 0, arg0, 1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!en;")
	public Class47 method2892(@OriginalArg(0) Class arg0) {
		return this.method2888(0, 0, arg0, 20);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!en;")
	public Class47 method2893(@OriginalArg(0) Frame arg0) {
		return this.method2888(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)Z")
	public boolean method2894() {
		return false;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public void method2895() {
		synchronized (this) {
			this.aBoolean248 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass5_3 != null) {
			try {
				this.aClass5_3.method209();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass5_2 != null) {
			try {
				this.aClass5_2.method209();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass5Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass5Array1.length; local53++) {
				if (this.aClass5Array1[local53] != null) {
					try {
						this.aClass5Array1[local53].method209();
					} catch (@Pc(72) IOException local72) {
					}
				}
			}
		}
		if (this.aClass5_1 != null) {
			try {
				this.aClass5_1.method209();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!en;")
	public Class47 method2897(@OriginalArg(1) Class arg0) {
		return this.method2888(0, 0, arg0, 10);
	}

	@OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class47 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean248) {
						return;
					}
					if (this.aClass47_5 != null) {
						local15 = this.aClass47_5;
						this.aClass47_5 = this.aClass47_5.aClass47_1;
						if (this.aClass47_5 == null) {
							this.aClass47_4 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local15.anInt1418;
				if (local44 == 1) {
					if (Static258.method3967() < Static179.aLong139) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt1416);
				} else if (local44 == 2) {
					@Pc(80) Thread local80 = new Thread((Runnable) local15.anObject1);
					local80.setDaemon(true);
					local80.start();
					local80.setPriority(local15.anInt1416);
					local15.anObject2 = local80;
				} else if (local44 == 4) {
					if (Static179.aLong139 > Static258.method3967()) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(106) Object[] local106;
					if (local44 == 8) {
						local106 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local106[0]).getDeclaredMethod((String) local106[1], (Class[]) local106[2]);
					} else if (local44 == 9) {
						local106 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local106[0]).getDeclaredField((String) local106[1]);
					} else if (local44 == 18) {
						@Pc(155) Clipboard local155 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local155.getContents(null);
					} else if (local44 == 19) {
						@Pc(144) Transferable local144 = (Transferable) local15.anObject1;
						@Pc(147) Clipboard local147 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local147.setContents(local144, null);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1417 = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.anInt1417 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Lclient!en;")
	public Class47 method2898() {
		return this.method2888(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;)Lclient!en;")
	public Class47 method2899(@OriginalArg(1) String arg0) {
		return this.method2888(0, 0, arg0, 12);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!en;")
	public Class47 method2900(@OriginalArg(1) Class arg0) {
		return this.method2888(0, 0, arg0, 11);
	}
}
