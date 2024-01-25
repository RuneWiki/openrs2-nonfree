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
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class102 implements Runnable {

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "Lclient!kaa;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!gaa", name = "y", descriptor = "[Lclient!laa;")
	public Class177[] aClass177Array1;

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "Lclient!laa;")
	public Class177 aClass177_1 = null;

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "Lclient!laa;")
	public Class177 aClass177_2 = null;

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "Lclient!jr;")
	private Class157 aClass157_3 = null;

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "Lclient!jr;")
	private Class157 aClass157_4 = null;

	@OriginalMember(owner = "client!gaa", name = "p", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!gaa", name = "r", descriptor = "Lclient!laa;")
	public Class177 aClass177_3 = null;

	@OriginalMember(owner = "client!gaa", name = "t", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
	private final int anInt2789;

	@OriginalMember(owner = "client!gaa", name = "s", descriptor = "Ljava/lang/String;")
	private final String aString30;

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class102(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static151.aString24 = "1.1";
		Static151.aString29 = "Unknown";
		this.anInt2789 = arg1;
		this.aString30 = arg2;
		this.anApplet1 = arg0;
		try {
			Static151.aString29 = System.getProperty("java.vendor");
			Static151.aString24 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static151.aString27 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static151.aString27 = "Unknown";
		}
		Static151.aString31 = Static151.aString27.toLowerCase();
		try {
			Static151.aString28 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static151.aString28 = "";
		}
		try {
			Static151.aString25 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static151.aString25 = "";
		}
		try {
			Static151.aString26 = System.getProperty("user.home");
			if (Static151.aString26 != null) {
				Static151.aString26 = Static151.aString26 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static151.aString26 == null) {
			Static151.aString26 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static151.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static151.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static151.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static151.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean181 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!jr;")
	public Class157 method2380(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2386(0, 0, new Object[] { arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method2381(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class157 local7 = this.method2390((byte) 122, 21, 0, arg0);
		if (arg1 != -5856) {
			this.method2403(null);
		}
		return (byte[]) local7.anObject12;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)Lclient!jr;")
	public Class157 method2382(@OriginalArg(0) int arg0) {
		return this.method2386(0, arg0, null, 3);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZLjava/awt/Component;)Lclient!jr;")
	private Class157 method2383(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg1) {
			this.method2396(null);
		}
		return this.method2386(0, arg0 ? 1 : 0, arg2, 15);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Lclient!jr;")
	public Class157 method2384(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) Point arg4) {
		return this.method2386(arg2, arg1, new Object[] { arg3, arg0, arg4 }, 17);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!jr;")
	public Class157 method2385(@OriginalArg(1) String arg0) {
		return this.method2386(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!gaa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class157 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean181) {
						return;
					}
					if (this.aClass157_3 != null) {
						local15 = this.aClass157_3;
						this.aClass157_3 = this.aClass157_3.aClass157_7;
						if (this.aClass157_3 == null) {
							this.aClass157_4 = null;
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
				@Pc(41) int local41 = local15.anInt4741;
				if (local41 == 1) {
					if (Static151.aLong129 > Static60.method1119()) {
						throw new IOException();
					}
					local15.anObject12 = new Socket(InetAddress.getByName((String) local15.anObject13), local15.anInt4740);
				} else if (local41 == 2) {
					@Pc(187) Thread local187 = new Thread((Runnable) local15.anObject13);
					local187.setDaemon(true);
					local187.start();
					local187.setPriority(local15.anInt4740);
					local15.anObject12 = local187;
				} else if (local41 == 4) {
					if (Static151.aLong129 > Static60.method1119()) {
						throw new IOException();
					}
					local15.anObject12 = new DataInputStream(((URL) local15.anObject13).openStream());
				} else {
					@Pc(125) Object[] local125;
					if (local41 == 8) {
						local125 = (Object[]) local15.anObject13;
						local15.anObject12 = ((Class) local125[0]).getDeclaredMethod((String) local125[1], (Class[]) local125[2]);
					} else if (local41 == 9) {
						local125 = (Object[]) local15.anObject13;
						local15.anObject12 = ((Class) local125[0]).getDeclaredField((String) local125[1]);
					} else if (local41 == 18) {
						@Pc(115) Clipboard local115 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject12 = local115.getContents(null);
					} else if (local41 == 19) {
						@Pc(104) Transferable local104 = (Transferable) local15.anObject13;
						@Pc(107) Clipboard local107 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local107.setContents(local104, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt4742 = 1;
			} catch (@Pc(204) ThreadDeath local204) {
				throw local204;
			} catch (@Pc(207) Throwable local207) {
				local15.anInt4742 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!jr;")
	private Class157 method2386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class157 local3 = new Class157();
		local3.anInt4740 = arg1;
		local3.anObject13 = arg2;
		local3.anInt4741 = arg3;
		synchronized (this) {
			if (this.aClass157_4 == null) {
				this.aClass157_4 = this.aClass157_3 = local3;
			} else {
				this.aClass157_4.aClass157_7 = local3;
				this.aClass157_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZBLjava/lang/String;)Lclient!jr;")
	public Class157 method2388(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		return arg0 ? this.method2386(0, 0, arg1, 12) : this.method2386(0, 0, arg1, 13);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	public void method2389() {
		Static151.aLong129 = Static60.method1119() + 5000L;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIILjava/lang/Object;)Lclient!jr;")
	private Class157 method2390(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class157 local3 = new Class157();
		synchronized (local3) {
			if (arg0 < 113) {
				this.aThread3 = null;
			}
			local3.anInt4740 = arg2;
			local3.anObject13 = arg3;
			local3.anInt4741 = arg1;
			synchronized (this) {
				if (this.aClass157_4 == null) {
					this.aClass157_4 = this.aClass157_3 = local3;
				} else {
					this.aClass157_4.aClass157_7 = local3;
					this.aClass157_4 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(55) InterruptedException local55) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!jr;")
	public Class157 method2391(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method2386(0, arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!jr;")
	private Class157 method2392(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		return arg3 < 104 ? null : this.method2386(local2.y + arg2, arg0 - -local2.x, null, 14);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLjava/lang/Class;)V")
	private void method2393(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static151.aString31.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg1, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		if (!arg0) {
			Static151.aString24 = null;
		}
		local25.invoke(local35, Boolean.TRUE);
		if (!Static151.aString31.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg1, this.method2402("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	public boolean method2394(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!jr;")
	public Class157 method2395(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2386(0, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!jr;")
	public Class157 method2396(@OriginalArg(0) URL arg0) {
		return this.method2386(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!jr;")
	public Class157 method2397(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method2386(0, 0, new Object[] { arg1, arg0, arg2 }, 8);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
	public void method2398() {
		synchronized (this) {
			this.aBoolean181 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		if (this.aClass177_1 != null) {
			try {
				this.aClass177_1.method4411();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass177_2 != null) {
			try {
				this.aClass177_2.method4411();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass177Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass177Array1.length; local55++) {
				if (this.aClass177Array1[local55] != null) {
					try {
						this.aClass177Array1[local55].method4411();
					} catch (@Pc(69) IOException local69) {
					}
				}
			}
		}
		if (this.aClass177_3 != null) {
			try {
				this.aClass177_3.method4411();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)Z")
	public boolean method2399() {
		return false;
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)Lclient!jr;")
	private Class157 method2400(@OriginalArg(0) byte arg0) {
		if (arg0 > -88) {
			this.method2382(88);
		}
		return this.method2386(0, 0, null, 18);
	}

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "(B)Lclient!kaa;")
	public Interface4 method2401() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method2402(@OriginalArg(0) String arg0) {
		return Static151.method2387(this.anInt2789, arg0, this.aString30);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/lang/String;)Lclient!jr;")
	private Class157 method2403(@OriginalArg(1) String arg0) {
		return this.method2386(0, 0, arg0, 21);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lclient!jr;")
	private Class157 method2404(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 < 93 ? null : this.method2386(0, 0, arg1, 19);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!jr;")
	public Class157 method2405(@OriginalArg(0) Frame arg0) {
		return this.method2386(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIII)Lclient!jr;")
	public Class157 method2406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method2386(arg0 << 16, (arg2 << 16) - -arg1, null, 6);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)Lclient!jr;")
	public Class157 method2407() {
		return this.method2386(0, 0, null, 5);
	}
}
