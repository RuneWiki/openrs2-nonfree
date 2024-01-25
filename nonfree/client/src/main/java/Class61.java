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

@OriginalClass("client!ec")
public final class Class61 implements Runnable {

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[Lclient!wi;")
	public Class266[] aClass266Array1;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!in;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!wi;")
	public Class266 aClass266_2 = null;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!tf;")
	private Class236 aClass236_1 = null;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Lclient!wi;")
	public Class266 aClass266_4 = null;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!wi;")
	public Class266 aClass266_3 = null;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Lclient!tf;")
	private Class236 aClass236_2 = null;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Ljava/lang/String;")
	private final String aString12;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private final int anInt1678;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class61(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString12 = arg2;
		Static85.aString14 = "Unknown";
		this.anInt1678 = arg1;
		this.anApplet1 = arg0;
		Static85.aString8 = "1.1";
		try {
			Static85.aString14 = System.getProperty("java.vendor");
			Static85.aString8 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static85.aString15 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static85.aString15 = "Unknown";
		}
		Static85.aString10 = Static85.aString15.toLowerCase();
		try {
			Static85.aString9 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static85.aString9 = "";
		}
		try {
			Static85.aString11 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static85.aString11 = "";
		}
		try {
			Static85.aString13 = System.getProperty("user.home");
			if (Static85.aString13 != null) {
				Static85.aString13 = Static85.aString13 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static85.aString13 == null) {
			Static85.aString13 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static85.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static85.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static85.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static85.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean96 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!tf;")
	public Class236 method1446(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1452(0, new Object[] { arg1, arg0 }, 0, 9);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!tf;")
	private Class236 method1447(@OriginalArg(0) int arg0) {
		if (arg0 < 43) {
			this.method1465();
		}
		return this.method1452(0, null, 0, 18);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lclient!tf;")
	public Class236 method1448(@OriginalArg(1) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method1452(0, new Object[] { arg2, arg1, arg0 }, 0, 8);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public File method1449(@OriginalArg(0) String arg0) {
		return Static85.method1466(arg0, this.anInt1678, this.aString12);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIIILjava/lang/Object;)Lclient!tf;")
	private Class236 method1450(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class236 local3 = new Class236();
		synchronized (local3) {
			local3.anInt6180 = arg0;
			local3.anObject9 = arg2;
			local3.anInt6179 = arg1;
			synchronized (this) {
				if (this.aClass236_2 == null) {
					this.aClass236_2 = this.aClass236_1 = local3;
				} else {
					this.aClass236_2.aClass236_5 = local3;
					this.aClass236_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(57) InterruptedException local57) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([ILjava/awt/Point;ILjava/awt/Component;BI)Lclient!tf;")
	public Class236 method1451(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(5) int arg4) {
		return this.method1452(arg4, new Object[] { arg3, arg0, arg1 }, arg2, 17);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!tf;")
	private Class236 method1452(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class236 local3 = new Class236();
		local3.anInt6179 = arg3;
		local3.anInt6180 = arg0;
		local3.anObject9 = arg1;
		synchronized (this) {
			if (this.aClass236_2 == null) {
				this.aClass236_2 = this.aClass236_1 = local3;
			} else {
				this.aClass236_2.aClass236_5 = local3;
				this.aClass236_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method1453(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -3650) {
			this.aClass266_4 = null;
		}
		@Pc(13) Class236 local13 = this.method1450(0, 21, arg1);
		return (byte[]) local13.anObject8;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Z")
	public boolean method1454() {
		return false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/net/URL;Z)Lclient!tf;")
	public Class236 method1455(@OriginalArg(0) URL arg0) {
		return this.method1452(0, arg0, 0, 4);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;Z)Lclient!tf;")
	public Class236 method1456(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method1452(0, arg0, 0, 12) : this.method1452(0, arg0, 0, 13);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!tf;")
	public Class236 method1457(@OriginalArg(1) Class arg0) {
		return this.method1452(0, arg0, 0, 20);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(ILjava/lang/String;)Lclient!tf;")
	private Class236 method1458(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 < 21) {
			this.method1471(null, (byte) 52);
		}
		return this.method1452(0, arg1, 0, 21);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!tf;")
	public Class236 method1459(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1452(arg1, arg0, 0, 2);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB)Lclient!tf;")
	public Class236 method1460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method1452((arg2 << 16) + arg1, null, arg0 << 16, 6);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLjava/awt/Component;II)Lclient!tf;")
	private Class236 method1461(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0) {
			return null;
		} else {
			@Pc(7) Point local7 = arg1.getLocationOnScreen();
			return this.method1452(local7.x + arg3, null, arg2 + local7.y, 14);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!tf;")
	public Class236 method1462(@OriginalArg(1) Frame arg0) {
		return this.method1452(0, arg0, 0, 7);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!tf;")
	public Class236 method1463(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method1452(arg1, arg0, 0, 1);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!tf;")
	public Class236 method1464(@OriginalArg(0) String arg0) {
		return this.method1452(0, arg0, 0, 16);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lclient!tf;")
	public Class236 method1465() {
		return this.method1452(0, null, 0, 5);
	}

	@OriginalMember(owner = "client!ec", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class236 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean96) {
						return;
					}
					if (this.aClass236_1 != null) {
						local15 = this.aClass236_1;
						this.aClass236_1 = this.aClass236_1.aClass236_5;
						if (this.aClass236_1 == null) {
							this.aClass236_2 = null;
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
				@Pc(41) int local41 = local15.anInt6179;
				if (local41 == 1) {
					if (Static85.aLong53 > Static158.method2342()) {
						throw new IOException();
					}
					local15.anObject8 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt6180);
				} else if (local41 == 2) {
					@Pc(77) Thread local77 = new Thread((Runnable) local15.anObject9);
					local77.setDaemon(true);
					local77.start();
					local77.setPriority(local15.anInt6180);
					local15.anObject8 = local77;
				} else if (local41 == 4) {
					if (Static158.method2342() < Static85.aLong53) {
						throw new IOException();
					}
					local15.anObject8 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(124) Object[] local124;
					if (local41 == 8) {
						local124 = (Object[]) local15.anObject9;
						local15.anObject8 = ((Class) local124[0]).getDeclaredMethod((String) local124[1], (Class[]) local124[2]);
					} else if (local41 == 9) {
						local124 = (Object[]) local15.anObject9;
						local15.anObject8 = ((Class) local124[0]).getDeclaredField((String) local124[1]);
					} else if (local41 == 18) {
						@Pc(164) Clipboard local164 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject8 = local164.getContents(null);
					} else if (local41 == 19) {
						@Pc(148) Transferable local148 = (Transferable) local15.anObject9;
						@Pc(151) Clipboard local151 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local151.setContents(local148, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6178 = 1;
			} catch (@Pc(194) ThreadDeath local194) {
				throw local194;
			} catch (@Pc(197) Throwable local197) {
				local15.anInt6178 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	public void method1467() {
		synchronized (this) {
			this.aBoolean96 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass266_4 != null) {
			try {
				this.aClass266_4.method5674();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass266_3 != null) {
			try {
				this.aClass266_3.method5674();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass266Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass266Array1.length; local48++) {
				if (this.aClass266Array1[local48] != null) {
					try {
						this.aClass266Array1[local48].method5674();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass266_2 != null) {
			try {
				this.aClass266_2.method5674();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!tf;")
	private Class236 method1468(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		return this.method1452(arg1 ? 1 : 0, arg0, 0, 15);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Lclient!tf;")
	public Class236 method1469(@OriginalArg(0) int arg0) {
		return this.method1452(arg0, null, 0, 3);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Lclient!in;")
	public Interface6 method1470() {
		return this.anInterface6_1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!tf;")
	private Class236 method1471(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		return arg1 == 125 ? this.method1452(0, arg0, 0, 19) : null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLjava/lang/Class;)V")
	public void method1472(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!Static85.aString10.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local39, Boolean.TRUE);
			local39.invoke(local14, arg0, "jawt");
			local25.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local39, Boolean.TRUE);
		if (!Static85.aString10.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local14, arg0, this.method1449("sw3d.dll").toString());
		local25.invoke(local39, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(BLjava/lang/Class;)Lclient!tf;")
	public Class236 method1473(@OriginalArg(1) Class arg0) {
		return this.method1452(0, arg0, 0, 11);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
	public void method1474() {
		Static85.aLong53 = Static158.method2342() + 5000L;
	}
}
