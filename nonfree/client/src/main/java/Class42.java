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

@OriginalClass("client!ci")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!ql;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "[Lclient!hi;")
	public Class110[] aClass110Array1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!mg;")
	private Class159 aClass159_1 = null;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!hi;")
	public Class110 aClass110_1 = null;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "Lclient!mg;")
	private Class159 aClass159_2 = null;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!hi;")
	public Class110 aClass110_2 = null;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Lclient!hi;")
	public Class110 aClass110_3 = null;

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
	private final int anInt769;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class42(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt769 = arg1;
		Static48.aString11 = "1.1";
		Static48.aString14 = "Unknown";
		this.anApplet1 = arg0;
		this.aString12 = arg2;
		try {
			Static48.aString14 = System.getProperty("java.vendor");
			Static48.aString11 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static48.aString15 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static48.aString15 = "Unknown";
		}
		Static48.aString13 = Static48.aString15.toLowerCase();
		try {
			Static48.aString8 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static48.aString8 = "";
		}
		try {
			Static48.aString10 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static48.aString10 = "";
		}
		try {
			Static48.aString9 = System.getProperty("user.home");
			if (Static48.aString9 != null) {
				Static48.aString9 = Static48.aString9 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static48.aString9 == null) {
			Static48.aString9 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static48.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static48.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static48.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static48.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean67 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lclient!mg;")
	public Class159 method642(@OriginalArg(0) Frame arg0) {
		return this.method644(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public void method643() {
		Static48.aLong33 = Static107.method1707() + 5000L;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!mg;")
	private Class159 method644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class159 local3 = new Class159();
		local3.anInt4272 = arg0;
		local3.anInt4273 = arg3;
		local3.anObject7 = arg2;
		synchronized (this) {
			if (this.aClass159_1 == null) {
				this.aClass159_1 = this.aClass159_2 = local3;
			} else {
				this.aClass159_1.aClass159_5 = local3;
				this.aClass159_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!mg;")
	public Class159 method645(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method644(0, 0, new Object[] { arg1, arg2, arg0 }, 8);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!mg;")
	public Class159 method646(@OriginalArg(1) Class arg0) {
		return this.method644(0, 0, arg0, 20);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Lclient!mg;")
	private Class159 method647(@OriginalArg(0) int arg0) {
		return arg0 == 6343 ? this.method644(0, 0, null, 18) : null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!mg;")
	public Class159 method648(@OriginalArg(0) URL arg0) {
		return this.method644(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Lclient!mg;")
	public Class159 method649() {
		return this.method644(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lclient!mg;")
	public Class159 method650(@OriginalArg(0) int arg0) {
		return this.method644(arg0, 0, null, 3);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!mg;")
	private Class159 method651(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		return arg2 == 0 ? this.method644(arg0 ? 1 : 0, 0, arg1, 15) : null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)Lclient!mg;")
	public Class159 method652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method644(arg1 + (arg2 << 16), arg0 << 16, null, 6);
	}

	@OriginalMember(owner = "client!ci", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class159 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean67) {
						return;
					}
					if (this.aClass159_2 != null) {
						local15 = this.aClass159_2;
						this.aClass159_2 = this.aClass159_2.aClass159_5;
						if (this.aClass159_2 == null) {
							this.aClass159_1 = null;
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
				@Pc(41) int local41 = local15.anInt4273;
				if (local41 == 1) {
					if (Static107.method1707() < Static48.aLong33) {
						throw new IOException();
					}
					local15.anObject8 = new Socket(InetAddress.getByName((String) local15.anObject7), local15.anInt4272);
				} else if (local41 == 2) {
					@Pc(185) Thread local185 = new Thread((Runnable) local15.anObject7);
					local185.setDaemon(true);
					local185.start();
					local185.setPriority(local15.anInt4272);
					local15.anObject8 = local185;
				} else if (local41 == 4) {
					if (Static48.aLong33 > Static107.method1707()) {
						throw new IOException();
					}
					local15.anObject8 = new DataInputStream(((URL) local15.anObject7).openStream());
				} else {
					@Pc(84) Object[] local84;
					if (local41 == 8) {
						local84 = (Object[]) local15.anObject7;
						local15.anObject8 = ((Class) local84[0]).getDeclaredMethod((String) local84[1], (Class[]) local84[2]);
					} else if (local41 == 9) {
						local84 = (Object[]) local15.anObject7;
						local15.anObject8 = ((Class) local84[0]).getDeclaredField((String) local84[1]);
					} else if (local41 == 18) {
						@Pc(127) Clipboard local127 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject8 = local127.getContents(null);
					} else if (local41 == 19) {
						@Pc(147) Transferable local147 = (Transferable) local15.anObject7;
						@Pc(150) Clipboard local150 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local150.setContents(local147, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt4271 = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.anInt4271 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!mg;")
	public Class159 method653(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method644(arg0, 0, arg1, 2);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)Lclient!ql;")
	public Interface8 method654() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!mg;")
	public Class159 method655(@OriginalArg(1) Class arg0) {
		return this.method644(0, 0, arg0, 11);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!mg;")
	public Class159 method656(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method644(arg1, 0, arg0, 1);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!mg;")
	private Class159 method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 != -22623) {
			this.aClass110_1 = null;
		}
		@Pc(8) Point local8 = arg3.getLocationOnScreen();
		return this.method644(arg0 + local8.x, arg2 - -local8.y, null, 14);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)Z")
	public boolean method658() {
		return false;
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
	public void method659() {
		synchronized (this) {
			this.aBoolean67 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass110_2 != null) {
			try {
				this.aClass110_2.method2357();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass110_1 != null) {
			try {
				this.aClass110_1.method2357();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass110Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass110Array1.length; local53++) {
				if (this.aClass110Array1[local53] != null) {
					try {
						this.aClass110Array1[local53].method2357();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass110_3 != null) {
			try {
				this.aClass110_3.method2357();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/String;)Lclient!mg;")
	private Class159 method660(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == 33 ? this.method644(0, 0, arg1, 21) : null;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(ILjava/lang/String;)Lclient!mg;")
	public Class159 method661(@OriginalArg(1) String arg0) {
		return this.method644(0, 0, arg0, 12);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[IIILjava/awt/Point;Ljava/awt/Component;)Lclient!mg;")
	public Class159 method662(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) Component arg4) {
		return this.method644(arg2, arg0, new Object[] { arg4, arg1, arg3 }, 17);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!mg;")
	public Class159 method663(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method644(0, 0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!mg;")
	public Class159 method665(@OriginalArg(0) String arg0) {
		return this.method644(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!mg;")
	private Class159 method666(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 119) {
			this.aString12 = null;
		}
		return this.method644(0, 0, arg0, 19);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method667(@OriginalArg(1) String arg0) {
		return Static48.method664(this.anInt769, this.aString12, arg0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method668(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -102) {
			Static48.aString10 = null;
		}
		@Pc(12) Class159 local12 = this.method670(0, 0, 21, arg0);
		return (byte[]) local12.anObject8;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(ILjava/lang/Class;)V")
	public void method669(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static48.aString13.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg0, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!Static48.aString13.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg0, this.method667("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!mg;")
	private Class159 method670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class159 local3 = new Class159();
		synchronized (local3) {
			local3.anInt4272 = arg1;
			local3.anObject7 = arg3;
			local3.anInt4273 = arg2;
			synchronized (this) {
				if (this.aClass159_1 == null) {
					this.aClass159_1 = this.aClass159_2 = local3;
				} else {
					this.aClass159_1.aClass159_5 = local3;
					this.aClass159_1 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
			if (arg0 != 0) {
				this.method655(null);
			}
			return local3;
		}
	}
}
