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

@OriginalClass("client!fq")
public final class Class83 implements Runnable {

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "[Lclient!hh;")
	public Class98[] aClass98Array1;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Lclient!ee;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!hh;")
	public Class98 aClass98_3 = null;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!hh;")
	public Class98 aClass98_2 = null;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!hh;")
	public Class98 aClass98_1 = null;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "Lclient!tc;")
	private Class232 aClass232_2 = null;

	@OriginalMember(owner = "client!fq", name = "u", descriptor = "Lclient!tc;")
	private Class232 aClass232_3 = null;

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "Ljava/lang/String;")
	private final String aString25;

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
	private final int anInt2197;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class83(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString25 = arg2;
		this.anInt2197 = arg1;
		Static117.aString29 = "Unknown";
		Static117.aString28 = "1.1";
		this.anApplet1 = arg0;
		try {
			Static117.aString29 = System.getProperty("java.vendor");
			Static117.aString28 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static117.aString24 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static117.aString24 = "Unknown";
		}
		Static117.aString26 = Static117.aString24.toLowerCase();
		try {
			Static117.aString30 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static117.aString30 = "";
		}
		try {
			Static117.aString27 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static117.aString27 = "";
		}
		try {
			Static117.aString23 = System.getProperty("user.home");
			if (Static117.aString23 != null) {
				Static117.aString23 = Static117.aString23 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static117.aString23 == null) {
			Static117.aString23 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static117.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static117.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static117.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static117.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean250 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lclient!tc;")
	private Class232 method1855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class232 local3 = new Class232();
		local3.anInt6401 = arg1;
		local3.anObject9 = arg2;
		local3.anInt6400 = arg3;
		synchronized (this) {
			if (this.aClass232_2 == null) {
				this.aClass232_2 = this.aClass232_3 = local3;
			} else {
				this.aClass232_2.aClass232_8 = local3;
				this.aClass232_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!tc;")
	public Class232 method1856(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method1855(0, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!tc;")
	private Class232 method1857(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		return arg1 == 58 ? this.method1855(0, 0, arg0, 21) : null;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!tc;")
	public Class232 method1858(@OriginalArg(0) Class arg0) {
		return this.method1855(0, 0, arg0, 20);
	}

	@OriginalMember(owner = "client!fq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class232 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean250) {
						return;
					}
					if (this.aClass232_3 != null) {
						local15 = this.aClass232_3;
						this.aClass232_3 = this.aClass232_3.aClass232_8;
						if (this.aClass232_3 == null) {
							this.aClass232_2 = null;
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
				@Pc(41) int local41 = local15.anInt6400;
				if (local41 == 1) {
					if (Static117.aLong66 > Static27.method359()) {
						throw new IOException();
					}
					local15.anObject8 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt6401);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject9);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt6401);
					local15.anObject8 = local56;
				} else if (local41 == 4) {
					if (Static117.aLong66 > Static27.method359()) {
						throw new IOException();
					}
					local15.anObject8 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(83) Object[] local83;
					if (local41 == 8) {
						local83 = (Object[]) local15.anObject9;
						local15.anObject8 = ((Class) local83[0]).getDeclaredMethod((String) local83[1], (Class[]) local83[2]);
					} else if (local41 == 9) {
						local83 = (Object[]) local15.anObject9;
						local15.anObject8 = ((Class) local83[0]).getDeclaredField((String) local83[1]);
					} else if (local41 == 18) {
						@Pc(110) Clipboard local110 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject8 = local110.getContents(null);
					} else if (local41 == 19) {
						@Pc(123) Transferable local123 = (Transferable) local15.anObject9;
						@Pc(126) Clipboard local126 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local126.setContents(local123, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6402 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt6402 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/net/URL;)Lclient!tc;")
	public Class232 method1859(@OriginalArg(1) URL arg0) {
		return this.method1855(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Object;ZIII)Lclient!tc;")
	private Class232 method1860(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class232 local3 = new Class232();
		synchronized (local3) {
			local3.anInt6401 = arg3;
			local3.anObject9 = arg0;
			local3.anInt6400 = arg2;
			synchronized (this) {
				if (this.aClass232_2 == null) {
					this.aClass232_2 = this.aClass232_3 = local3;
				} else {
					this.aClass232_2.aClass232_8 = local3;
					this.aClass232_2 = local3;
				}
				this.notify();
				if (!arg1) {
					Static117.aString29 = null;
				}
			}
			try {
				local3.wait();
			} catch (@Pc(54) InterruptedException local54) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!tc;")
	public Class232 method1861(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method1855(0, 0, new Object[] { arg2, arg0, arg1 }, 8);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!tc;")
	public Class232 method1862(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method1855(0, 0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public void method1863() {
		synchronized (this) {
			this.aBoolean250 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass98_3 != null) {
			try {
				this.aClass98_3.method2224();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass98_2 != null) {
			try {
				this.aClass98_2.method2224();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass98Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass98Array1.length; local49++) {
				if (this.aClass98Array1[local49] != null) {
					try {
						this.aClass98Array1[local49].method2224();
					} catch (@Pc(65) IOException local65) {
					}
				}
			}
		}
		if (this.aClass98_1 != null) {
			try {
				this.aClass98_1.method2224();
			} catch (@Pc(85) IOException local85) {
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!tc;")
	public Class232 method1864(@OriginalArg(0) Frame arg0) {
		return this.method1855(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!tc;")
	public Class232 method1865(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method1855(0, arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/Point;[IILjava/awt/Component;II)Lclient!tc;")
	public Class232 method1867(@OriginalArg(0) Point arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4) {
		return this.method1855(arg2, arg4, new Object[] { arg3, arg1, arg0 }, 17);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIII)Lclient!tc;")
	public Class232 method1868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method1855(arg0 << 16, (arg2 << 16) + arg1, null, 6);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)Z")
	public boolean method1869() {
		return false;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method1870(@OriginalArg(0) String arg0) {
		@Pc(7) Class232 local7 = this.method1860(arg0, true, 21, 0);
		return (byte[]) local7.anObject8;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(Ljava/lang/Class;I)V")
	public void method1871(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(31) Method local31 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(41) Method local41;
		if (!Static117.aString26.startsWith("mac")) {
			local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local31.invoke(local41, Boolean.TRUE);
			local41.invoke(local14, arg0, "jawt");
			local31.invoke(local41, Boolean.FALSE);
		}
		local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local31.invoke(local41, Boolean.TRUE);
		if (!Static117.aString26.startsWith("win")) {
			throw new Exception();
		}
		local41.invoke(local14, arg0, this.method1878("sw3d.dll").toString());
		local31.invoke(local41, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)Lclient!tc;")
	public Class232 method1872() {
		return this.method1855(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Lclient!tc;")
	private Class232 method1873(@OriginalArg(0) byte arg0) {
		if (arg0 <= 2) {
			this.method1865(null, -41);
		}
		return this.method1855(0, 0, null, 18);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!tc;")
	public Class232 method1874(@OriginalArg(1) Class arg0) {
		return this.method1855(0, 0, arg0, 11);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V")
	public void method1875() {
		Static117.aLong66 = Static27.method359() + 5000L;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!tc;")
	private Class232 method1876(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		return arg1 == 19 ? this.method1855(0, 0, arg0, 19) : null;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;ZZ)Lclient!tc;")
	public Class232 method1877(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method1855(0, 0, arg0, 12) : this.method1855(0, 0, arg0, 13);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method1878(@OriginalArg(1) String arg0) {
		return Static117.method1866(this.aString25, arg0, this.anInt2197);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!tc;")
	private Class232 method1879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg0 != 1339) {
			this.method1858(null);
		}
		@Pc(10) Point local10 = arg3.getLocationOnScreen();
		return this.method1855(arg1 + local10.y, local10.x + arg2, null, 14);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)Lclient!tc;")
	public Class232 method1880(@OriginalArg(1) int arg0) {
		return this.method1855(0, arg0, null, 3);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLjava/lang/String;)Lclient!tc;")
	public Class232 method1881(@OriginalArg(1) String arg0) {
		return this.method1855(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLjava/awt/Component;Z)Lclient!tc;")
	private Class232 method1882(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		return arg0 ? this.method1855(0, arg2 ? 1 : 0, arg1, 15) : null;
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)Lclient!ee;")
	public Interface1 method1883() {
		return this.anInterface1_1;
	}
}
