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

@OriginalClass("client!bk")
public final class Class17 implements Runnable {

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!gi;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "[Lclient!dd;")
	public Class35[] aClass35Array1;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Lclient!dd;")
	public Class35 aClass35_2 = null;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Lclient!dd;")
	public Class35 aClass35_1 = null;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "Lclient!dd;")
	public Class35 aClass35_3 = null;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!ub;")
	private Class163 aClass163_2 = null;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!ub;")
	private Class163 aClass163_3 = null;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class17(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static26.aString28 = "Unknown";
		Static26.aString26 = "1.1";
		this.anApplet1 = arg0;
		try {
			Static26.aString28 = System.getProperty("java.vendor");
			Static26.aString26 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static26.aString23 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static26.aString23 = "Unknown";
		}
		Static26.aString24 = Static26.aString23.toLowerCase();
		try {
			Static26.aString25 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static26.aString25 = "";
		}
		try {
			Static26.aString22 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static26.aString22 = "";
		}
		try {
			Static26.aString27 = System.getProperty("user.home");
			if (Static26.aString27 != null) {
				Static26.aString27 = Static26.aString27 + "/";
			}
		} catch (@Pc(81) Exception local81) {
		}
		if (Static26.aString27 == null) {
			Static26.aString27 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(93) Throwable local93) {
		}
		try {
			if (arg0 == null) {
				Static26.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static26.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(121) Exception local121) {
		}
		try {
			if (arg0 == null) {
				Static26.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static26.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(148) Exception local148) {
		}
		this.aBoolean44 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ub;")
	public Class163 method438(@OriginalArg(0) String arg0) {
		return this.method439(0, arg0, 12, 0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BILjava/lang/Object;II)Lclient!ub;")
	private Class163 method439(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class163 local12 = new Class163();
		local12.anInt5261 = arg2;
		local12.anInt5260 = arg0;
		local12.anObject6 = arg1;
		synchronized (this) {
			if (this.aClass163_2 == null) {
				this.aClass163_2 = this.aClass163_3 = local12;
			} else {
				this.aClass163_2.aClass163_11 = local12;
				this.aClass163_2 = local12;
			}
			this.notify();
			return local12;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIZII)Lclient!ub;")
	public Class163 method440(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method439(arg2 + (arg1 << 16), null, 6, arg0 << 16);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lclient!ub;")
	public Class163 method441() {
		return this.method439(0, null, 5, 0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Point;I[IZILjava/awt/Component;)Lclient!ub;")
	public Class163 method442(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method439(arg1, new Object[] { arg4, arg2, arg0 }, 17, arg3);
	}

	@OriginalMember(owner = "client!bk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class163 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean44) {
						return;
					}
					if (this.aClass163_3 != null) {
						local17 = this.aClass163_3;
						this.aClass163_3 = this.aClass163_3.aClass163_11;
						if (this.aClass163_3 == null) {
							this.aClass163_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local17.anInt5261;
				if (local45 == 1) {
					if (Static26.aLong22 > Static71.method1143()) {
						throw new IOException();
					}
					local17.anObject7 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt5260);
				} else if (local45 == 2) {
					@Pc(84) Thread local84 = new Thread((Runnable) local17.anObject6);
					local84.setDaemon(true);
					local84.start();
					local84.setPriority(local17.anInt5260);
					local17.anObject7 = local84;
				} else if (local45 == 4) {
					if (Static71.method1143() < Static26.aLong22) {
						throw new IOException();
					}
					local17.anObject7 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(136) Object[] local136;
					if (local45 == 8) {
						local136 = (Object[]) local17.anObject6;
						local17.anObject7 = ((Class) local136[0]).getDeclaredMethod((String) local136[1], (Class[]) local136[2]);
					} else if (local45 == 9) {
						local136 = (Object[]) local17.anObject6;
						local17.anObject7 = ((Class) local136[0]).getDeclaredField((String) local136[1]);
					} else if (local45 == 18) {
						@Pc(156) Clipboard local156 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject7 = local156.getContents(null);
					} else if (local45 == 19) {
						@Pc(175) Transferable local175 = (Transferable) local17.anObject6;
						@Pc(178) Clipboard local178 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local178.setContents(local175, null);
					} else {
						throw new Exception();
					}
				}
				local17.anInt5259 = 1;
			} catch (@Pc(209) ThreadDeath local209) {
				throw local209;
			} catch (@Pc(212) Throwable local212) {
				local17.anInt5259 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)Lclient!gi;")
	public Interface2 method443() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;IB)Lclient!ub;")
	public Class163 method445(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method439(arg1, arg0, 1, 0);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V")
	public void method446() {
		Static26.aLong22 = Static71.method1143() + 5000L;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)Z")
	public boolean method447() {
		return false;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!ub;")
	public Class163 method448(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method439(0, new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!ub;")
	public Class163 method449(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method439(arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!ub;")
	public Class163 method450(@OriginalArg(0) Class arg0) {
		return this.method439(0, arg0, 11, 0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ub;")
	public Class163 method451(@OriginalArg(1) URL arg0) {
		return this.method439(0, arg0, 4, 0);
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
	public void method452() {
		synchronized (this) {
			this.aBoolean44 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass35_2 != null) {
			try {
				this.aClass35_2.method779();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass35_1 != null) {
			try {
				this.aClass35_1.method779();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass35Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass35Array1.length; local47++) {
				if (this.aClass35Array1[local47] != null) {
					try {
						this.aClass35Array1[local47].method779();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass35_3 != null) {
			try {
				this.aClass35_3.method779();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lclient!ub;")
	public Class163 method453(@OriginalArg(1) int arg0) {
		return this.method439(arg0, null, 3, 0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!ub;")
	public Class163 method454(@OriginalArg(1) Frame arg0) {
		return this.method439(0, arg0, 7, 0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!ub;")
	public Class163 method456(@OriginalArg(0) String arg0) {
		return this.method439(0, arg0, 16, 0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lclient!ub;")
	public Class163 method458(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method439(0, new Object[] { arg0, arg1, arg2 }, 8, 0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!ub;")
	public Class163 method460(@OriginalArg(1) Class arg0) {
		return this.method439(0, arg0, 10, 0);
	}
}
