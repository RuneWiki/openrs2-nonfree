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

@OriginalClass("client!dr")
public final class Class59 implements Runnable {

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "Lclient!hp;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "[Lclient!gq;")
	public Class99[] aClass99Array1;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!gq;")
	public Class99 aClass99_2 = null;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Lclient!gq;")
	public Class99 aClass99_1 = null;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "Lclient!jv;")
	private Class138 aClass138_2 = null;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "Lclient!jv;")
	private Class138 aClass138_3 = null;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "Lclient!gq;")
	public Class99 aClass99_3 = null;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Ljava/lang/String;")
	private final String aString11;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
	private final int anInt1596;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class59(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static73.aString14 = "Unknown";
		this.aString11 = arg2;
		Static73.aString16 = "1.1";
		this.anInt1596 = arg1;
		this.anApplet1 = arg0;
		try {
			Static73.aString14 = System.getProperty("java.vendor");
			Static73.aString16 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static73.aString9 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static73.aString9 = "Unknown";
		}
		Static73.aString12 = Static73.aString9.toLowerCase();
		try {
			Static73.aString10 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static73.aString10 = "";
		}
		try {
			Static73.aString13 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static73.aString13 = "";
		}
		try {
			Static73.aString15 = System.getProperty("user.home");
			if (Static73.aString15 != null) {
				Static73.aString15 = Static73.aString15 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static73.aString15 == null) {
			Static73.aString15 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static73.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static73.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static73.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static73.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean98 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)Lclient!jv;")
	public Class138 method1350(@OriginalArg(1) int arg0) {
		return this.method1364(arg0, 117, null, 0, 3);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public void method1351() {
		synchronized (this) {
			this.aBoolean98 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass99_1 != null) {
			try {
				this.aClass99_1.method2257();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass99_2 != null) {
			try {
				this.aClass99_2.method2257();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass99Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass99Array1.length; local52++) {
				if (this.aClass99Array1[local52] != null) {
					try {
						this.aClass99Array1[local52].method2257();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass99_3 != null) {
			try {
				this.aClass99_3.method2257();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!jv;")
	public Class138 method1352(@OriginalArg(0) Frame arg0) {
		return this.method1364(0, 66, arg0, 0, 7);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZLjava/lang/String;)Lclient!jv;")
	public Class138 method1353(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method1364(arg0, 80, arg1, 0, 1);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!jv;")
	private Class138 method1354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class138 local3 = new Class138();
		synchronized (local3) {
			local3.anInt3722 = arg0;
			local3.anInt3724 = arg1;
			if (arg2 >= -53) {
				this.anEventQueue1 = null;
			}
			local3.anObject6 = arg3;
			synchronized (this) {
				if (this.aClass138_3 == null) {
					this.aClass138_3 = this.aClass138_2 = local3;
				} else {
					this.aClass138_3.aClass138_6 = local3;
					this.aClass138_3 = local3;
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

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;)Lclient!jv;")
	public Class138 method1355(@OriginalArg(1) String arg0) {
		return this.method1364(0, 63, arg0, 0, 12);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([IILjava/awt/Point;BLjava/awt/Component;I)Lclient!jv;")
	public Class138 method1356(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		return this.method1364(arg1, 104, new Object[] { arg3, arg0, arg2 }, arg4, 17);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
	public void method1357() {
		Static73.aLong51 = Static21.method458() + 5000L;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)Lclient!jv;")
	private Class138 method1358() {
		return this.method1364(0, 103, null, 0, 18);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!jv;")
	public Class138 method1360(@OriginalArg(1) Class arg0) {
		return this.method1364(0, 50, arg0, 0, 20);
	}

	@OriginalMember(owner = "client!dr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class138 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean98) {
						return;
					}
					if (this.aClass138_2 != null) {
						local15 = this.aClass138_2;
						this.aClass138_2 = this.aClass138_2.aClass138_6;
						if (this.aClass138_2 == null) {
							this.aClass138_3 = null;
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
				@Pc(41) int local41 = local15.anInt3724;
				if (local41 == 1) {
					if (Static21.method458() < Static73.aLong51) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt3722);
				} else if (local41 == 2) {
					@Pc(175) Thread local175 = new Thread((Runnable) local15.anObject6);
					local175.setDaemon(true);
					local175.start();
					local175.setPriority(local15.anInt3722);
					local15.anObject7 = local175;
				} else if (local41 == 4) {
					if (Static21.method458() < Static73.aLong51) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(101) Object[] local101;
					if (local41 == 8) {
						local101 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local101[0]).getDeclaredMethod((String) local101[1], (Class[]) local101[2]);
					} else if (local41 == 9) {
						local101 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local101[0]).getDeclaredField((String) local101[1]);
					} else if (local41 == 18) {
						@Pc(146) Clipboard local146 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject7 = local146.getContents(null);
					} else if (local41 == 19) {
						@Pc(135) Transferable local135 = (Transferable) local15.anObject6;
						@Pc(138) Clipboard local138 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local138.setContents(local135, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt3723 = 1;
			} catch (@Pc(192) ThreadDeath local192) {
				throw local192;
			} catch (@Pc(195) Throwable local195) {
				local15.anInt3723 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method1361(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 == -1) {
			@Pc(12) Class138 local12 = this.method1354(0, 21, -78, arg1);
			return (byte[]) local12.anObject7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!jv;")
	private Class138 method1362(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.aClass99_2 = null;
		}
		return this.method1364(arg0 ? 1 : 0, 79, arg1, 0, 15);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!jv;")
	private Class138 method1363(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		if (arg3 != 10000) {
			Static73.anInt1597 = 125;
		}
		return this.method1364(local2.x + arg1, arg3 + -9941, null, local2.y + arg2, 14);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!jv;")
	private Class138 method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class138 local3 = new Class138();
		local3.anInt3724 = arg4;
		local3.anObject6 = arg2;
		local3.anInt3722 = arg0;
		synchronized (this) {
			if (this.aClass138_3 == null) {
				this.aClass138_3 = this.aClass138_2 = local3;
			} else {
				this.aClass138_3.aClass138_6 = local3;
				this.aClass138_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!jv;")
	public Class138 method1365(@OriginalArg(0) String arg0) {
		return this.method1364(0, 92, arg0, 0, 16);
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(B)Lclient!hp;")
	public Interface5 method1366() {
		return this.anInterface5_1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Lclient!jv;")
	public Class138 method1367() {
		return this.method1364(0, 106, null, 0, 5);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLjava/net/URL;)Lclient!jv;")
	public Class138 method1368(@OriginalArg(1) URL arg0) {
		return this.method1364(0, 67, arg0, 0, 4);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)Z")
	public boolean method1369() {
		return false;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLjava/lang/String;)Lclient!jv;")
	private Class138 method1370(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		return arg0 == 29 ? this.method1364(0, 63, arg1, 0, 21) : null;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)Lclient!jv;")
	public Class138 method1371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method1364((arg1 << 16) + arg0, 79, null, arg2 << 16, 6);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!jv;")
	public Class138 method1372(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method1364(arg1, 66, arg0, 0, 2);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method1373(@OriginalArg(0) String arg0) {
		return Static73.method1359(this.anInt1596, arg0, this.aString11);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!jv;")
	public Class138 method1374(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method1364(0, 64, new Object[] { arg1, arg0, arg2 }, 0, 8);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lclient!jv;")
	public Class138 method1375(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method1364(0, 115, new Object[] { arg0, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!jv;")
	private Class138 method1376(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 < 108) {
			this.aBoolean98 = true;
		}
		return this.method1364(0, 50, arg0, 0, 19);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!jv;")
	public Class138 method1377(@OriginalArg(0) Class arg0) {
		return this.method1364(0, 98, arg0, 0, 11);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/Class;Z)V")
	public void method1378(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!Static73.aString12.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local29.invoke(local39, Boolean.TRUE);
			local39.invoke(local18, arg0, "jawt");
			local29.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local29.invoke(local39, Boolean.TRUE);
		if (!Static73.aString12.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local18, arg0, this.method1373("sw3d.dll").toString());
		local29.invoke(local39, Boolean.FALSE);
	}
}
