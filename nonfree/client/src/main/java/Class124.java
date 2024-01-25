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

@OriginalClass("client!ji")
public final class Class124 implements Runnable {

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "[Lclient!rv;")
	public Class220[] aClass220Array1;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!af;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "Lclient!rv;")
	public Class220 aClass220_1 = null;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Lclient!rv;")
	public Class220 aClass220_2 = null;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "Lclient!rm;")
	private Class215 aClass215_4 = null;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "Lclient!rv;")
	public Class220 aClass220_3 = null;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "Lclient!rm;")
	private Class215 aClass215_5 = null;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Ljava/lang/String;")
	private final String aString31;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
	private final int anInt3048;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class124(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static191.aString30 = "Unknown";
		this.aString31 = arg2;
		Static191.aString29 = "1.1";
		this.anInt3048 = arg1;
		try {
			Static191.aString30 = System.getProperty("java.vendor");
			Static191.aString29 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static191.aString32 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static191.aString32 = "Unknown";
		}
		Static191.aString33 = Static191.aString32.toLowerCase();
		try {
			Static191.aString34 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static191.aString34 = "";
		}
		try {
			Static191.aString27 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static191.aString27 = "";
		}
		try {
			Static191.aString28 = System.getProperty("user.home");
			if (Static191.aString28 != null) {
				Static191.aString28 = Static191.aString28 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static191.aString28 == null) {
			Static191.aString28 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static191.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static191.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static191.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static191.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean230 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lclient!rm;")
	public Class215 method2504(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method2507(0, new Object[] { arg0, arg1, arg2 }, 120, 8, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)Lclient!rm;")
	public Class215 method2505(@OriginalArg(1) int arg0) {
		return this.method2507(0, null, 88, 3, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!rm;")
	public Class215 method2506(@OriginalArg(0) Class arg0) {
		return this.method2507(0, arg0, 98, 11, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!rm;")
	private Class215 method2507(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class215 local3 = new Class215();
		local3.anObject9 = arg1;
		local3.anInt5790 = arg4;
		local3.anInt5789 = arg3;
		synchronized (this) {
			if (this.aClass215_5 == null) {
				this.aClass215_5 = this.aClass215_4 = local3;
			} else {
				this.aClass215_5.aClass215_9 = local3;
				this.aClass215_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!rm;")
	private Class215 method2508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 > -95) {
			return null;
		} else {
			@Pc(7) Point local7 = arg3.getLocationOnScreen();
			return this.method2507(arg0 + local7.y, null, 93, 14, local7.x + arg2);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZLjava/awt/Component;)Lclient!rm;")
	private Class215 method2510(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0) {
			Static191.aString27 = null;
		}
		return this.method2507(0, arg2, 39, 15, arg1 ? 1 : 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method2511(@OriginalArg(1) String arg0) {
		return Static191.method2509(arg0, this.aString31, this.anInt3048);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public void method2512() {
		synchronized (this) {
			this.aBoolean230 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		if (this.aClass220_1 != null) {
			try {
				this.aClass220_1.method4584();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass220_2 != null) {
			try {
				this.aClass220_2.method4584();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass220Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass220Array1.length; local55++) {
				if (this.aClass220Array1[local55] != null) {
					try {
						this.aClass220Array1[local55].method4584();
					} catch (@Pc(69) IOException local69) {
					}
				}
			}
		}
		if (this.aClass220_3 != null) {
			try {
				this.aClass220_3.method4584();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method2513(@OriginalArg(1) String arg0) {
		@Pc(15) Class215 local15 = this.method2521(arg0, (byte) 66, 21, 0);
		return (byte[]) local15.anObject10;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!rm;")
	private Class215 method2514(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		return arg0 ? this.method2507(0, arg1, 102, 21, 0) : null;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Lclient!rm;")
	private Class215 method2515(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method2522(null, -89);
		}
		return this.method2507(0, null, arg0 ^ 0x5A, 18, 0);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)Lclient!af;")
	public Interface1 method2516() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[III)Lclient!rm;")
	public Class215 method2517(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		return this.method2507(arg4, new Object[] { arg2, arg3, arg1 }, 26, 17, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)Z")
	public boolean method2518() {
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!rm;")
	public Class215 method2519(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2507(0, new Object[] { arg1, arg0 }, 125, 9, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!rm;")
	public Class215 method2520(@OriginalArg(0) URL arg0) {
		return this.method2507(0, arg0, 124, 4, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lclient!rm;")
	private Class215 method2521(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class215 local3 = new Class215();
		synchronized (local3) {
			local3.anObject9 = arg0;
			if (arg1 <= 64) {
				this.method2512();
			}
			local3.anInt5789 = arg2;
			local3.anInt5790 = arg3;
			synchronized (this) {
				if (this.aClass215_5 == null) {
					this.aClass215_5 = this.aClass215_4 = local3;
				} else {
					this.aClass215_5.aClass215_9 = local3;
					this.aClass215_5 = local3;
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

	@OriginalMember(owner = "client!ji", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class215 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean230) {
						return;
					}
					if (this.aClass215_4 != null) {
						local15 = this.aClass215_4;
						this.aClass215_4 = this.aClass215_4.aClass215_9;
						if (this.aClass215_4 == null) {
							this.aClass215_5 = null;
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
				@Pc(41) int local41 = local15.anInt5789;
				if (local41 == 1) {
					if (Static191.aLong97 > Static232.method3058()) {
						throw new IOException();
					}
					local15.anObject10 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt5790);
				} else if (local41 == 2) {
					@Pc(187) Thread local187 = new Thread((Runnable) local15.anObject9);
					local187.setDaemon(true);
					local187.start();
					local187.setPriority(local15.anInt5790);
					local15.anObject10 = local187;
				} else if (local41 == 4) {
					if (Static232.method3058() < Static191.aLong97) {
						throw new IOException();
					}
					local15.anObject10 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(148) Object[] local148;
					if (local41 == 8) {
						local148 = (Object[]) local15.anObject9;
						local15.anObject10 = ((Class) local148[0]).getDeclaredMethod((String) local148[1], (Class[]) local148[2]);
					} else if (local41 == 9) {
						local148 = (Object[]) local15.anObject9;
						local15.anObject10 = ((Class) local148[0]).getDeclaredField((String) local148[1]);
					} else if (local41 == 18) {
						@Pc(138) Clipboard local138 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject10 = local138.getContents(null);
					} else if (local41 == 19) {
						@Pc(122) Transferable local122 = (Transferable) local15.anObject9;
						@Pc(125) Clipboard local125 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local125.setContents(local122, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5791 = 1;
			} catch (@Pc(204) ThreadDeath local204) {
				throw local204;
			} catch (@Pc(207) Throwable local207) {
				local15.anInt5791 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!rm;")
	private Class215 method2522(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -2103) {
			Static191.aString33 = null;
		}
		return this.method2507(0, arg0, 46, 19, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!rm;")
	public Class215 method2523(@OriginalArg(0) String arg0) {
		return this.method2507(0, arg0, 65, 12, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/Class;)V")
	public void method2524(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static191.aString33.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg0, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!Static191.aString33.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg0, this.method2511("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!rm;")
	public Class215 method2525(@OriginalArg(0) Frame arg0) {
		return this.method2507(0, arg0, 126, 7, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!rm;")
	public Class215 method2526(@OriginalArg(0) Class arg0) {
		return this.method2507(0, arg0, 44, 20, 0);
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
	public void method2527() {
		Static191.aLong97 = (long) 5000 + Static232.method3058();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Lclient!rm;")
	public Class215 method2528() {
		return this.method2507(0, null, 75, 5, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!rm;")
	public Class215 method2529(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method2507(0, arg0, 40, 2, arg1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)Lclient!rm;")
	public Class215 method2530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method2507(arg0 << 16, null, 25, 6, (arg2 << 16) + arg1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!rm;")
	public Class215 method2531(@OriginalArg(0) String arg0) {
		return this.method2507(0, arg0, 12, 16, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;IB)Lclient!rm;")
	public Class215 method2532(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2507(0, arg0, 79, 1, arg1);
	}
}
