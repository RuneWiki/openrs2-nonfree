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

@OriginalClass("client!dj")
public final class Class71 implements Runnable {

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "[Lclient!vr;")
	public Class308[] aClass308Array1;

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "Lclient!pn;")
	private Interface13 anInterface13_2;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!ci;")
	private Class55 aClass55_2 = null;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "Lclient!vr;")
	public Class308 aClass308_4 = null;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Lclient!vr;")
	public Class308 aClass308_3 = null;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Lclient!ci;")
	private Class55 aClass55_3 = null;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!vr;")
	public Class308 aClass308_2 = null;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	private final int anInt2162;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString16;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class71(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt2162 = arg1;
		Static92.aString20 = "1.1";
		this.anApplet1 = arg0;
		Static92.aString15 = "Unknown";
		this.aString16 = arg2;
		try {
			Static92.aString15 = System.getProperty("java.vendor");
			Static92.aString20 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static92.aString14 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static92.aString14 = "Unknown";
		}
		Static92.aString17 = Static92.aString14.toLowerCase();
		try {
			Static92.aString18 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static92.aString18 = "";
		}
		try {
			Static92.aString19 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static92.aString19 = "";
		}
		try {
			Static92.aString21 = System.getProperty("user.home");
			if (Static92.aString21 != null) {
				Static92.aString21 = Static92.aString21 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static92.aString21 == null) {
			Static92.aString21 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static92.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static92.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static92.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static92.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean153 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)Lclient!ci;")
	public Class55 method1972(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method1993(null, -27332, 6, arg0 << 16, arg2 + (arg1 << 16));
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!ci;")
	public Class55 method1973(@OriginalArg(0) URL arg0) {
		return this.method1993(arg0, -27332, 4, 0, 0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Lclient!ci;")
	private Class55 method1974(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1977(null);
		}
		return this.method1993(null, -27332, 18, 0, 0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([BLjava/io/File;B)Z")
	public boolean method1975(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Z")
	public boolean method1976() {
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method1977(@OriginalArg(0) String arg0) {
		return Static92.method1996(arg0, this.anInt2162, this.aString16);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lclient!pn;")
	public Interface13 method1978() {
		return this.anInterface13_2;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!ci;")
	private Class55 method1979(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 0) {
			Static92.aString14 = null;
		}
		return this.method1993(arg1, arg0 - 27332, 19, 0, 0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;ZB)Lclient!ci;")
	public Class55 method1980(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method1993(arg0, -27332, 12, 0, 0) : this.method1993(arg0, -27332, 13, 0, 0);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)Lclient!ci;")
	public Class55 method1981() {
		return this.method1993(null, -27332, 5, 0, 0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!ci;")
	private Class55 method1982(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != 17038) {
			Static92.aString18 = null;
		}
		return this.method1993(arg1, -27332, 15, 0, arg2 ? 1 : 0);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!ci;")
	public Class55 method1983(@OriginalArg(0) String arg0) {
		return this.method1993(arg0, -27332, 16, 0, 0);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	public void method1984() {
		synchronized (this) {
			this.aBoolean153 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass308_3 != null) {
			try {
				this.aClass308_3.method7739();
			} catch (@Pc(30) IOException local30) {
			}
		}
		if (this.aClass308_2 != null) {
			try {
				this.aClass308_2.method7739();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass308Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.aClass308Array1.length; local46++) {
				if (this.aClass308Array1[local46] != null) {
					try {
						this.aClass308Array1[local46].method7739();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass308_4 != null) {
			try {
				this.aClass308_4.method7739();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
	public void method1985() {
		Static92.aLong49 = Static76.method1679() + 5000L;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!ci;")
	public Class55 method1986(@OriginalArg(1) Frame arg0) {
		return this.method1993(arg0, -27332, 7, 0, 0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ci;")
	private Class55 method1987(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 11810) {
			this.method1983(null);
		}
		return this.method1993(arg1, -27332, 21, 0, 0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ci;")
	public Class55 method1988(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1993(arg0, -27332, 2, 0, arg1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)Lclient!ci;")
	public Class55 method1989(@OriginalArg(0) int arg0) {
		return this.method1993(null, -27332, 3, 0, arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BILjava/lang/Object;II)Lclient!ci;")
	private Class55 method1990(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class55 local3 = new Class55();
		synchronized (local3) {
			local3.anInt1480 = arg1;
			if (arg0 >= -13) {
				this.aBoolean153 = false;
			}
			local3.anInt1482 = arg3;
			local3.anObject6 = arg2;
			synchronized (this) {
				if (this.aClass55_3 == null) {
					this.aClass55_3 = this.aClass55_2 = local3;
				} else {
					this.aClass55_3.aClass55_1 = local3;
					this.aClass55_3 = local3;
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

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!ci;")
	public Class55 method1991(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method1993(arg1, -27332, 1, 0, arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method1992(@OriginalArg(0) String arg0) {
		@Pc(7) Class55 local7 = this.method1990((byte) -89, 21, arg0, 0);
		return (byte[]) local7.anObject5;
	}

	@OriginalMember(owner = "client!dj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class55 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean153) {
						return;
					}
					if (this.aClass55_2 != null) {
						local15 = this.aClass55_2;
						this.aClass55_2 = this.aClass55_2.aClass55_1;
						if (this.aClass55_2 == null) {
							this.aClass55_3 = null;
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
				@Pc(41) int local41 = local15.anInt1480;
				if (local41 == 1) {
					if (Static92.aLong49 > Static76.method1679()) {
						throw new IOException();
					}
					local15.anObject5 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt1482);
				} else if (local41 == 2) {
					@Pc(79) Thread local79 = new Thread((Runnable) local15.anObject6);
					local79.setDaemon(true);
					local79.start();
					local79.setPriority(local15.anInt1482);
					local15.anObject5 = local79;
				} else if (local41 == 4) {
					if (Static76.method1679() < Static92.aLong49) {
						throw new IOException();
					}
					local15.anObject5 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(123) Object[] local123;
					if (local41 == 8) {
						local123 = (Object[]) local15.anObject6;
						local15.anObject5 = ((Class) local123[0]).getDeclaredMethod((String) local123[1], (Class[]) local123[2]);
					} else if (local41 == 9) {
						local123 = (Object[]) local15.anObject6;
						local15.anObject5 = ((Class) local123[0]).getDeclaredField((String) local123[1]);
					} else if (local41 == 18) {
						@Pc(150) Clipboard local150 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject5 = local150.getContents(null);
					} else if (local41 == 19) {
						@Pc(165) Transferable local165 = (Transferable) local15.anObject6;
						@Pc(168) Clipboard local168 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local168.setContents(local165, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt1481 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt1481 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!ci;")
	private Class55 method1993(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class55 local3 = new Class55();
		local3.anObject6 = arg0;
		local3.anInt1482 = arg4;
		local3.anInt1480 = arg2;
		synchronized (this) {
			if (this.aClass55_3 == null) {
				this.aClass55_3 = this.aClass55_2 = local3;
			} else {
				this.aClass55_3.aClass55_1 = local3;
				this.aClass55_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lclient!ci;")
	public Class55 method1994(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method1993(new Object[] { arg2, arg1, arg0 }, -27332, 8, 0, 0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!ci;")
	private Class55 method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (arg3 == 14) {
			@Pc(7) Point local7 = arg2.getLocationOnScreen();
			return this.method1993(null, -27332, 14, arg0 + local7.y, local7.x + arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III[ILjava/awt/Point;Ljava/awt/Component;)Lclient!ci;")
	public Class55 method1997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) Component arg4) {
		return this.method1993(new Object[] { arg4, arg2, arg3 }, -27332, 17, arg0, arg1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/Class;)V")
	private void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static92.aString17.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg1, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!Static92.aString17.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg1, this.method1977("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
		if (arg0 != -20260) {
			Static92.aMethod2 = null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lclient!ci;")
	public Class55 method1999(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1993(new Object[] { arg1, arg0 }, -27332, 9, 0, 0);
	}
}
