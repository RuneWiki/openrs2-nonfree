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

@OriginalClass("client!dq")
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "[Lclient!sf;")
	public Class220[] aClass220Array1;

	@OriginalMember(owner = "client!dq", name = "v", descriptor = "Lclient!pv;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "Lclient!sf;")
	public Class220 aClass220_2 = null;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "Lclient!sf;")
	public Class220 aClass220_3 = null;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "Lclient!ow;")
	private Class181 aClass181_3 = null;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "Lclient!ow;")
	private Class181 aClass181_4 = null;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Lclient!sf;")
	public Class220 aClass220_1 = null;

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString16;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
	private final int anInt1370;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class51(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static75.aString21 = "Unknown";
		Static75.aString15 = "1.1";
		this.aString16 = arg2;
		this.anInt1370 = arg1;
		this.anApplet1 = arg0;
		try {
			Static75.aString21 = System.getProperty("java.vendor");
			Static75.aString15 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static75.aString20 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static75.aString20 = "Unknown";
		}
		Static75.aString22 = Static75.aString20.toLowerCase();
		try {
			Static75.aString18 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static75.aString18 = "";
		}
		try {
			Static75.aString17 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static75.aString17 = "";
		}
		try {
			Static75.aString19 = System.getProperty("user.home");
			if (Static75.aString19 != null) {
				Static75.aString19 = Static75.aString19 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static75.aString19 == null) {
			Static75.aString19 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static75.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static75.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static75.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static75.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean91 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!ow;")
	public Class181 method1359(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		return arg0 ? this.method1387(arg1, 12, 0, 0) : this.method1387(arg1, 13, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!ow;")
	public Class181 method1360(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method1387(new Object[] { arg1, arg0 }, 9, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/Class;)V")
	public void method1361(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static75.aString22.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg0, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!Static75.aString22.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg0, this.method1362("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method1362(@OriginalArg(1) String arg0) {
		return Static75.method1363(this.anInt1370, this.aString16, arg0);
	}

	@OriginalMember(owner = "client!dq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class181 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean91) {
						return;
					}
					if (this.aClass181_4 != null) {
						local15 = this.aClass181_4;
						this.aClass181_4 = this.aClass181_4.aClass181_7;
						if (this.aClass181_4 == null) {
							this.aClass181_3 = null;
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
				@Pc(41) int local41 = local15.anInt5297;
				if (local41 == 1) {
					if (Static354.method4966() < Static75.aLong50) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt5296);
				} else if (local41 == 2) {
					@Pc(77) Thread local77 = new Thread((Runnable) local15.anObject6);
					local77.setDaemon(true);
					local77.start();
					local77.setPriority(local15.anInt5296);
					local15.anObject7 = local77;
				} else if (local41 == 4) {
					if (Static75.aLong50 > Static354.method4966()) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(125) Object[] local125;
					if (local41 == 8) {
						local125 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local125[0]).getDeclaredMethod((String) local125[1], (Class[]) local125[2]);
					} else if (local41 == 9) {
						local125 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local125[0]).getDeclaredField((String) local125[1]);
					} else if (local41 == 18) {
						@Pc(170) Clipboard local170 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject7 = local170.getContents(null);
					} else if (local41 == 19) {
						@Pc(159) Transferable local159 = (Transferable) local15.anObject6;
						@Pc(162) Clipboard local162 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local162.setContents(local159, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5298 = 1;
			} catch (@Pc(196) ThreadDeath local196) {
				throw local196;
			} catch (@Pc(199) Throwable local199) {
				local15.anInt5298 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method1364(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 == 13388) {
			@Pc(12) Class181 local12 = this.method1386(0, 21, arg1);
			return (byte[]) local12.anObject7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!ow;")
	public Class181 method1365(@OriginalArg(1) Class arg0) {
		return this.method1387(arg0, 11, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/net/URL;)Lclient!ow;")
	public Class181 method1366(@OriginalArg(1) URL arg0) {
		return this.method1387(arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Z")
	public boolean method1367() {
		return false;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)Lclient!pv;")
	public Interface10 method1368() {
		return this.anInterface10_1;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;I[I)Lclient!ow;")
	public Class181 method1369(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		return this.method1387(new Object[] { arg1, arg4, arg2 }, 17, arg0, arg3);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
	public void method1370() {
		synchronized (this) {
			this.aBoolean91 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass220_2 != null) {
			try {
				this.aClass220_2.method5190();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass220_1 != null) {
			try {
				this.aClass220_1.method5190();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass220Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass220Array1.length; local44++) {
				if (this.aClass220Array1[local44] != null) {
					try {
						this.aClass220Array1[local44].method5190();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass220_3 != null) {
			try {
				this.aClass220_3.method5190();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Class;)Lclient!ow;")
	public Class181 method1371(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method1387(new Object[] { arg2, arg1, arg0 }, 8, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!ow;")
	private Class181 method1372(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		return this.method1387(arg0, 15, arg1 ? 1 : 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/awt/Component;IZ)Lclient!ow;")
	private Class181 method1373(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		if (!arg3) {
			this.aClass181_3 = null;
		}
		return this.method1387(null, 14, arg2 + local2.x, local2.y + arg0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Lclient!ow;")
	private Class181 method1374(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method1384(-84, -31, 15);
		}
		return this.method1387(null, 18, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!ow;")
	public Class181 method1375(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method1387(arg1, 1, arg0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!ow;")
	public Class181 method1376(@OriginalArg(0) Frame arg0) {
		return this.method1387(arg0, 7, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	public void method1377() {
		Static75.aLong50 = Static354.method4966() + 5000L;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(ILjava/lang/String;)Lclient!ow;")
	private Class181 method1378(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == 27414 ? this.method1387(arg1, 21, 0, 0) : null;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)Lclient!ow;")
	public Class181 method1379() {
		return this.method1387(null, 5, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ow;")
	public Class181 method1380(@OriginalArg(1) String arg0) {
		return this.method1387(arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!ow;")
	private Class181 method1381(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -5276) {
			this.aClass220_3 = null;
		}
		return this.method1387(arg0, 19, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Lclient!ow;")
	public Class181 method1382(@OriginalArg(0) int arg0) {
		return this.method1387(null, 3, arg0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(BLjava/lang/Class;)Lclient!ow;")
	public Class181 method1383(@OriginalArg(1) Class arg0) {
		return this.method1387(arg0, 20, 0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIII)Lclient!ow;")
	public Class181 method1384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method1387(null, 6, (arg0 << 16) + arg2, arg1 << 16);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ow;")
	public Class181 method1385(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method1387(arg1, 2, arg0, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lclient!ow;")
	private Class181 method1386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2) {
		@Pc(11) Class181 local11 = new Class181();
		synchronized (local11) {
			local11.anInt5296 = arg0;
			local11.anInt5297 = arg1;
			local11.anObject6 = arg2;
			synchronized (this) {
				if (this.aClass181_3 == null) {
					this.aClass181_3 = this.aClass181_4 = local11;
				} else {
					this.aClass181_3.aClass181_7 = local11;
					this.aClass181_3 = local11;
				}
				this.notify();
			}
			try {
				local11.wait();
			} catch (@Pc(57) InterruptedException local57) {
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Lclient!ow;")
	private Class181 method1387(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class181 local3 = new Class181();
		local3.anInt5297 = arg1;
		local3.anObject6 = arg0;
		local3.anInt5296 = arg2;
		synchronized (this) {
			if (this.aClass181_3 == null) {
				this.aClass181_3 = this.aClass181_4 = local3;
			} else {
				this.aClass181_3.aClass181_7 = local3;
				this.aClass181_3 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
