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

@OriginalClass("client!ae")
public final class Class9 implements Runnable {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "[Lclient!fca;")
	public Class97[] aClass97Array1;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!tba;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!ei;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Lclient!fca;")
	public Class97 aClass97_2 = null;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "Lclient!fca;")
	public Class97 aClass97_3 = null;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!ei;")
	private Class83 aClass83_1 = null;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!fca;")
	public Class97 aClass97_1 = null;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Ljava/lang/String;")
	private final String aString4;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	private final int anInt147;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class9(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static9.aString5 = "Unknown";
		this.aString4 = arg2;
		this.anInt147 = arg1;
		Static9.aString7 = "1.1";
		this.anApplet1 = arg0;
		try {
			Static9.aString5 = System.getProperty("java.vendor");
			Static9.aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static9.aString1 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static9.aString1 = "Unknown";
		}
		Static9.aString8 = Static9.aString1.toLowerCase();
		try {
			Static9.aString6 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static9.aString6 = "";
		}
		try {
			Static9.aString3 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static9.aString3 = "";
		}
		try {
			Static9.aString2 = System.getProperty("user.home");
			if (Static9.aString2 != null) {
				Static9.aString2 = Static9.aString2 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static9.aString2 == null) {
			Static9.aString2 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static9.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static9.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static9.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static9.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean9 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public void method274() {
		Static9.aLong9 = Static105.method2132() + 5000L;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ei;")
	private Class83 method275(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == -7113 ? this.method296(21, 0, 0, arg1) : null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!ei;")
	public Class83 method276(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method296(1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ei;")
	public Class83 method277(@OriginalArg(1) URL arg0) {
		return this.method296(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!ei;")
	private Class83 method278(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class83 local3 = new Class83();
		synchronized (local3) {
			local3.anObject7 = arg1;
			local3.anInt2494 = arg2;
			local3.anInt2496 = arg0;
			synchronized (this) {
				if (this.aClass83_1 == null) {
					this.aClass83_1 = this.aClass83_2 = local3;
				} else {
					this.aClass83_1.aClass83_5 = local3;
					this.aClass83_1 = local3;
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

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z")
	public boolean method279() {
		return false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIBII)Lclient!ei;")
	public Class83 method280(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method296(6, (arg1 << 16) + arg2, arg0 << 16, null);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Lclient!ei;")
	public Class83 method281(@OriginalArg(0) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method296(8, 0, 0, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Runnable;IZ)Lclient!ei;")
	public Class83 method282(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method296(2, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lclient!ei;")
	public Class83 method283(@OriginalArg(0) int arg0) {
		return this.method296(3, arg0, 0, null);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[ILjava/awt/Point;Ljava/awt/Component;II)Lclient!ei;")
	public Class83 method284(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) Component arg3, @OriginalArg(5) int arg4) {
		return this.method296(17, arg0, arg4, new Object[] { arg3, arg1, arg2 });
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(ILjava/lang/String;)Lclient!ei;")
	public Class83 method285(@OriginalArg(1) String arg0) {
		return this.method296(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Lclient!ei;")
	public Class83 method286() {
		return this.method296(5, 0, 0, null);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!ei;")
	public Class83 method288(@OriginalArg(0) Frame arg0) {
		return this.method296(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public void method289() {
		synchronized (this) {
			this.aBoolean9 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass97_1 != null) {
			try {
				this.aClass97_1.method2499();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass97_3 != null) {
			try {
				this.aClass97_3.method2499();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass97Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass97Array1.length; local55++) {
				if (this.aClass97Array1[local55] != null) {
					try {
						this.aClass97Array1[local55].method2499();
					} catch (@Pc(69) IOException local69) {
					}
				}
			}
		}
		if (this.aClass97_2 != null) {
			try {
				this.aClass97_2.method2499();
			} catch (@Pc(85) IOException local85) {
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!ei;")
	private Class83 method290(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		return this.method296(15, arg1 ? 1 : 0, 0, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Lclient!ei;")
	private Class83 method291(@OriginalArg(0) int arg0) {
		if (arg0 != 18) {
			this.anApplet1 = null;
		}
		return this.method296(18, 0, 0, null);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	public boolean method292(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(25) IOException local25) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLjava/lang/String;B)Lclient!ei;")
	public Class83 method293(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		return arg0 ? this.method296(12, 0, 0, arg1) : this.method296(13, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lclient!ei;")
	private Class83 method294(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		return arg2 > -42 ? null : this.method296(14, arg1 + local2.x, arg3 + local2.y, null);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Lclient!ei;")
	private Class83 method295(@OriginalArg(0) Transferable arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static9.aString8 = null;
		}
		return this.method296(19, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIIILjava/lang/Object;)Lclient!ei;")
	private Class83 method296(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(9) Class83 local9 = new Class83();
		local9.anInt2496 = arg0;
		local9.anInt2494 = arg1;
		local9.anObject7 = arg3;
		synchronized (this) {
			if (this.aClass83_1 == null) {
				this.aClass83_1 = this.aClass83_2 = local9;
			} else {
				this.aClass83_1.aClass83_5 = local9;
				this.aClass83_1 = local9;
			}
			this.notify();
			return local9;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!ei;")
	public Class83 method297(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method296(9, 0, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Lclient!tba;")
	public Interface14 method298() {
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Class;B)V")
	private void method299(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static9.aString8.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg0, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		if (arg1 != 61) {
			this.method274();
		}
		local25.invoke(local35, Boolean.TRUE);
		if (!Static9.aString8.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg0, this.method300("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method300(@OriginalArg(0) String arg0) {
		return Static9.method287(arg0, this.aString4, this.anInt147);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method301(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg0) {
			@Pc(12) Class83 local12 = this.method278(21, arg1, 0);
			return (byte[]) local12.anObject8;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class83 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean9) {
						return;
					}
					if (this.aClass83_2 != null) {
						local15 = this.aClass83_2;
						this.aClass83_2 = this.aClass83_2.aClass83_5;
						if (this.aClass83_2 == null) {
							this.aClass83_1 = null;
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
				@Pc(41) int local41 = local15.anInt2496;
				if (local41 == 1) {
					if (Static105.method2132() < Static9.aLong9) {
						throw new IOException();
					}
					local15.anObject8 = new Socket(InetAddress.getByName((String) local15.anObject7), local15.anInt2494);
				} else if (local41 == 2) {
					@Pc(54) Thread local54 = new Thread((Runnable) local15.anObject7);
					local54.setDaemon(true);
					local54.start();
					local54.setPriority(local15.anInt2494);
					local15.anObject8 = local54;
				} else if (local41 == 4) {
					if (Static105.method2132() < Static9.aLong9) {
						throw new IOException();
					}
					local15.anObject8 = new DataInputStream(((URL) local15.anObject7).openStream());
				} else {
					@Pc(118) Object[] local118;
					if (local41 == 8) {
						local118 = (Object[]) local15.anObject7;
						local15.anObject8 = ((Class) local118[0]).getDeclaredMethod((String) local118[1], (Class[]) local118[2]);
					} else if (local41 == 9) {
						local118 = (Object[]) local15.anObject7;
						local15.anObject8 = ((Class) local118[0]).getDeclaredField((String) local118[1]);
					} else if (local41 == 18) {
						@Pc(108) Clipboard local108 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject8 = local108.getContents(null);
					} else if (local41 == 19) {
						@Pc(92) Transferable local92 = (Transferable) local15.anObject7;
						@Pc(95) Clipboard local95 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local95.setContents(local92, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2495 = 1;
			} catch (@Pc(194) ThreadDeath local194) {
				throw local194;
			} catch (@Pc(197) Throwable local197) {
				local15.anInt2495 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}
}
