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
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class114 implements Runnable {

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "Lclient!gq;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "[Lclient!me;")
	public Class154[] aClass154Array1;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "Lclient!me;")
	public Class154 aClass154_1 = null;

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "Lclient!hh;")
	private Class108 aClass108_7 = null;

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "Lclient!hh;")
	private Class108 aClass108_8 = null;

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "Lclient!me;")
	public Class154 aClass154_2 = null;

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "Lclient!me;")
	public Class154 aClass154_3 = null;

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
	private final int anInt2999;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString29;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class114(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static159.aString34 = "Unknown";
		this.anInt2999 = arg1;
		this.aString29 = arg2;
		Static159.aString33 = "1.1";
		try {
			Static159.aString34 = System.getProperty("java.vendor");
			Static159.aString33 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static159.aString27 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static159.aString27 = "Unknown";
		}
		Static159.aString28 = Static159.aString27.toLowerCase();
		try {
			Static159.aString30 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static159.aString30 = "";
		}
		try {
			Static159.aString32 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static159.aString32 = "";
		}
		try {
			Static159.aString31 = System.getProperty("user.home");
			if (Static159.aString31 != null) {
				Static159.aString31 = Static159.aString31 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static159.aString31 == null) {
			Static159.aString31 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static159.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static159.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static159.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static159.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean214 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Lclient!hh;")
	public Class108 method2340() {
		return this.method2353(10000, null, 0, 0, 5);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method2341(@OriginalArg(0) String arg0) {
		return Static159.method2347(this.anInt2999, this.aString29, arg0);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!hh;")
	public Class108 method2342(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method2353(10000, arg1, arg0, 0, 2);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
	public void method2343() {
		synchronized (this) {
			this.aBoolean214 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass154_1 != null) {
			try {
				this.aClass154_1.method3335();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass154_2 != null) {
			try {
				this.aClass154_2.method3335();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass154Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass154Array1.length; local52++) {
				if (this.aClass154Array1[local52] != null) {
					try {
						this.aClass154Array1[local52].method3335();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass154_3 != null) {
			try {
				this.aClass154_3.method3335();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)Z")
	public boolean method2344() {
		return false;
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)Lclient!gq;")
	public Interface8 method2345() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/Class;Z)V")
	public void method2346(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(16) Class[] local16 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!Static159.aString28.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local16);
			local29.invoke(local39, Boolean.TRUE);
			local39.invoke(local18, arg0, "jawt");
			local29.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local16);
		local29.invoke(local39, Boolean.TRUE);
		if (!Static159.aString28.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local18, arg0, this.method2341("sw3d.dll").toString());
		local29.invoke(local39, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lclient!hh;")
	public Class108 method2348(@OriginalArg(1) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method2353(10000, new Object[] { arg2, arg1, arg0 }, 0, 0, 8);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!hh;")
	private Class108 method2349(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -54) {
			Static159.anInt3000 = -87;
		}
		return this.method2353(10000, arg0, 0, 0, 19);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/net/URL;)Lclient!hh;")
	public Class108 method2350(@OriginalArg(1) URL arg0) {
		return this.method2353(10000, arg0, 0, 0, 4);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method2351(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class108 local7 = this.method2355(arg1, 0, arg0, false);
		return (byte[]) local7.anObject4;
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)V")
	public void method2352() {
		Static159.aLong78 = Static199.method2845() + 5000L;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!hh;")
	private Class108 method2353(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class108 local3 = new Class108();
		local3.anInt2805 = arg2;
		local3.anObject3 = arg1;
		local3.anInt2804 = arg4;
		synchronized (this) {
			if (this.aClass108_7 == null) {
				this.aClass108_7 = this.aClass108_8 = local3;
			} else {
				this.aClass108_7.aClass108_6 = local3;
				this.aClass108_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(Ljava/lang/String;I)Lclient!hh;")
	public Class108 method2354(@OriginalArg(0) String arg0) {
		return this.method2353(10000, arg0, 0, 0, 16);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILjava/lang/Object;ZI)Lclient!hh;")
	private Class108 method2355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class108 local3 = new Class108();
		synchronized (local3) {
			local3.anInt2804 = arg0;
			local3.anObject3 = arg2;
			local3.anInt2805 = arg1;
			synchronized (this) {
				if (arg3) {
					return null;
				}
				if (this.aClass108_7 == null) {
					this.aClass108_7 = this.aClass108_8 = local3;
				} else {
					this.aClass108_7.aClass108_6 = local3;
					this.aClass108_7 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(60) InterruptedException local60) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!hu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class108 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean214) {
						return;
					}
					if (this.aClass108_8 != null) {
						local15 = this.aClass108_8;
						this.aClass108_8 = this.aClass108_8.aClass108_6;
						if (this.aClass108_8 == null) {
							this.aClass108_7 = null;
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
				@Pc(41) int local41 = local15.anInt2804;
				if (local41 == 1) {
					if (Static199.method2845() < Static159.aLong78) {
						throw new IOException();
					}
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt2805);
				} else if (local41 == 2) {
					@Pc(158) Thread local158 = new Thread((Runnable) local15.anObject3);
					local158.setDaemon(true);
					local158.start();
					local158.setPriority(local15.anInt2805);
					local15.anObject4 = local158;
				} else if (local41 == 4) {
					if (Static159.aLong78 > Static199.method2845()) {
						throw new IOException();
					}
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(96) Object[] local96;
					if (local41 == 8) {
						local96 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local96[0]).getDeclaredMethod((String) local96[1], (Class[]) local96[2]);
					} else if (local41 == 9) {
						local96 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local96[0]).getDeclaredField((String) local96[1]);
					} else if (local41 == 18) {
						@Pc(86) Clipboard local86 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject4 = local86.getContents(null);
					} else if (local41 == 19) {
						@Pc(75) Transferable local75 = (Transferable) local15.anObject3;
						@Pc(78) Clipboard local78 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local78.setContents(local75, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2803 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt2803 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(Ljava/lang/String;I)Lclient!hh;")
	private Class108 method2356(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -90) {
			this.anInterface8_1 = null;
		}
		return this.method2353(10000, arg0, 0, 0, 21);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!hh;")
	public Class108 method2357(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method2353(10000, new Object[] { arg0, arg1 }, 0, 0, 9);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "([IILjava/awt/Point;Ljava/awt/Component;II)Lclient!hh;")
	public Class108 method2358(@OriginalArg(0) int[] arg0, @OriginalArg(2) Point arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method2353(10000, new Object[] { arg2, arg0, arg1 }, arg4, arg3, 17);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!hh;")
	public Class108 method2359(@OriginalArg(0) Class arg0) {
		return this.method2353(10000, arg0, 0, 0, 11);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIBI)Lclient!hh;")
	public Class108 method2360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method2353(10000, null, arg1 + (arg0 << 16), arg2 << 16, 6);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!hh;")
	public Class108 method2361(@OriginalArg(0) Class arg0) {
		return this.method2353(10000, arg0, 0, 0, 20);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!hh;")
	public Class108 method2362(@OriginalArg(1) Frame arg0) {
		return this.method2353(10000, arg0, 0, 0, 7);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!hh;")
	public Class108 method2363(@OriginalArg(0) String arg0) {
		return this.method2353(10000, arg0, 0, 0, 12);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!hh;")
	public Class108 method2364(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method2353(10000, arg1, arg0, 0, 1);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!hh;")
	private Class108 method2365(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		if (arg0 != 27730) {
			this.anInterface8_1 = null;
		}
		return this.method2353(arg0 - 17730, null, arg2 + local2.x, local2.y + arg3, 14);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!hh;")
	private Class108 method2366(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return arg2 == 0 ? this.method2353(10000, arg0, arg1 ? 1 : 0, 0, 15) : null;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lclient!hh;")
	public Class108 method2367(@OriginalArg(0) int arg0) {
		return this.method2353(10000, null, arg0, 0, 3);
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)Lclient!hh;")
	private Class108 method2368(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.method2341(null);
		}
		return this.method2353(10000, null, 0, 0, 18);
	}
}
