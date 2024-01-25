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

@OriginalClass("client!gt")
public final class Class75 implements Runnable {

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "Lclient!kc;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "[Lclient!ri;")
	public Class183[] aClass183Array1;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "Lclient!ri;")
	public Class183 aClass183_1 = null;

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "Lclient!lf;")
	private Class121 aClass121_5 = null;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "Lclient!lf;")
	private Class121 aClass121_4 = null;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "Lclient!ri;")
	public Class183 aClass183_3 = null;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "Lclient!ri;")
	public Class183 aClass183_2 = null;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class75(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static111.aString17 = "Unknown";
		Static111.aString16 = "1.1";
		try {
			Static111.aString17 = System.getProperty("java.vendor");
			Static111.aString16 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static111.aString18 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static111.aString18 = "Unknown";
		}
		Static111.aString15 = Static111.aString18.toLowerCase();
		try {
			Static111.aString14 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static111.aString14 = "";
		}
		try {
			Static111.aString13 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static111.aString13 = "";
		}
		try {
			Static111.aString12 = System.getProperty("user.home");
			if (Static111.aString12 != null) {
				Static111.aString12 = Static111.aString12 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static111.aString12 == null) {
			Static111.aString12 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static111.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static111.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static111.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static111.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean181 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)Lclient!lf;")
	public Class121 method2348() {
		return this.method2371(5, 0, null, 0);
	}

	@OriginalMember(owner = "client!gt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class121 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean181) {
						return;
					}
					if (this.aClass121_5 != null) {
						local15 = this.aClass121_5;
						this.aClass121_5 = this.aClass121_5.aClass121_7;
						if (this.aClass121_5 == null) {
							this.aClass121_4 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(31) InterruptedException local31) {
					}
				}
			}
			try {
				@Pc(41) int local41 = local15.anInt3691;
				if (local41 == 1) {
					if (Static183.method3462() < Static111.aLong91) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt3692);
				} else if (local41 == 2) {
					@Pc(158) Thread local158 = new Thread((Runnable) local15.anObject3);
					local158.setDaemon(true);
					local158.start();
					local158.setPriority(local15.anInt3692);
					local15.anObject2 = local158;
				} else if (local41 == 4) {
					if (Static183.method3462() < Static111.aLong91) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(66) Object[] local66;
					if (local41 == 8) {
						local66 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local66[0]).getDeclaredMethod((String) local66[1], (Class[]) local66[2]);
					} else if (local41 == 9) {
						local66 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local66[0]).getDeclaredField((String) local66[1]);
					} else if (local41 == 18) {
						@Pc(84) Clipboard local84 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local84.getContents(null);
					} else if (local41 == 19) {
						@Pc(104) Transferable local104 = (Transferable) local15.anObject3;
						@Pc(107) Clipboard local107 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local107.setContents(local104, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt3693 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt3693 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Point;BLjava/awt/Component;[III)Lclient!lf;")
	public Class121 method2349(@OriginalArg(0) Point arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method2371(17, arg3, new Object[] { arg1, arg2, arg0 }, arg4);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Lclient!kc;")
	public Interface5 method2350() {
		return this.anInterface5_2;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!lf;")
	public Class121 method2351(@OriginalArg(0) String arg0) {
		return this.method2371(16, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lclient!lf;")
	private Class121 method2352(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		if (arg2 != 97) {
			Static111.aString12 = null;
		}
		@Pc(7) Point local7 = arg0.getLocationOnScreen();
		return this.method2371(14, local7.y + arg1, null, arg3 + local7.x);
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lclient!lf;")
	public Class121 method2353() {
		return this.method2371(13, 0, null, 0);
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
	public void method2354() {
		synchronized (this) {
			this.aBoolean181 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass183_1 != null) {
			try {
				this.aClass183_1.method4934();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass183_2 != null) {
			try {
				this.aClass183_2.method4934();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass183Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass183Array1.length; local49++) {
				if (this.aClass183Array1[local49] != null) {
					try {
						this.aClass183Array1[local49].method4934();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass183_3 != null) {
			try {
				this.aClass183_3.method4934();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V")
	public void method2355() {
		Static111.aLong91 = Static183.method3462() + 5000L;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBIII)Lclient!lf;")
	public Class121 method2356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method2371(6, arg0 << 16, null, (arg1 << 16) + arg2);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Lclient!lf;")
	public Class121 method2357(@OriginalArg(0) int arg0) {
		return this.method2371(3, 0, null, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBLjava/lang/Object;II)Lclient!lf;")
	private Class121 method2358(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class121 local3 = new Class121();
		synchronized (local3) {
			local3.anInt3692 = arg3;
			local3.anObject3 = arg2;
			local3.anInt3691 = arg0;
			synchronized (this) {
				if (this.aClass121_4 == null) {
					this.aClass121_4 = this.aClass121_5 = local3;
				} else {
					this.aClass121_4.aClass121_7 = local3;
					this.aClass121_4 = local3;
				}
				this.notify();
			}
			if (arg1 <= 93) {
				this.method2354();
			}
			try {
				local3.wait();
			} catch (@Pc(55) InterruptedException local55) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!lf;")
	public Class121 method2359(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2371(1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!lf;")
	public Class121 method2360(@OriginalArg(1) Class arg0) {
		return this.method2371(20, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!lf;")
	public Class121 method2361(@OriginalArg(1) Frame arg0) {
		return this.method2371(7, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!lf;")
	private Class121 method2362(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 < 45 ? null : this.method2371(21, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!lf;")
	private Class121 method2363(@OriginalArg(0) Transferable arg0) {
		return this.method2371(19, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!lf;")
	public Class121 method2364(@OriginalArg(0) Class arg0) {
		return this.method2371(11, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)Z")
	public boolean method2365() {
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!lf;")
	public Class121 method2366(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method2371(2, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!lf;")
	public Class121 method2367(@OriginalArg(0) URL arg0) {
		return this.method2371(4, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!lf;")
	public Class121 method2368(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method2371(8, 0, new Object[] { arg2, arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!lf;")
	public Class121 method2369(@OriginalArg(1) Class arg0) {
		return this.method2371(10, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)Lclient!lf;")
	public Class121 method2370() {
		return this.method2371(12, 0, null, 0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!lf;")
	private Class121 method2371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class121 local3 = new Class121();
		local3.anObject3 = arg2;
		local3.anInt3692 = arg3;
		local3.anInt3691 = arg0;
		synchronized (this) {
			if (this.aClass121_4 == null) {
				this.aClass121_4 = this.aClass121_5 = local3;
			} else {
				this.aClass121_4.aClass121_7 = local3;
				this.aClass121_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!lf;")
	private Class121 method2372(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		return arg0 == 24717 ? this.method2371(15, 0, arg2, arg1 ? 1 : 0) : null;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!lf;")
	public Class121 method2373(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2371(9, 0, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method2374(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 == 7) {
			@Pc(12) Class121 local12 = this.method2358(21, (byte) 112, arg1, 0);
			return (byte[]) local12.anObject2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)Lclient!lf;")
	private Class121 method2375() {
		return this.method2371(18, 0, null, 0);
	}
}
