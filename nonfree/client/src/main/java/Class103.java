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

@OriginalClass("client!hs")
public final class Class103 implements Runnable {

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "Lclient!gm;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "[Lclient!rq;")
	public Class203[] aClass203Array1;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Lclient!qd;")
	private Class190 aClass190_3 = null;

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "Lclient!rq;")
	public Class203 aClass203_1 = null;

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "Lclient!rq;")
	public Class203 aClass203_2 = null;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "Lclient!qd;")
	private Class190 aClass190_4 = null;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "Lclient!rq;")
	public Class203 aClass203_3 = null;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
	private final int anInt3461;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Ljava/lang/String;")
	private final String aString40;

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class103(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static162.aString35 = "1.1";
		this.anApplet1 = arg0;
		Static162.aString38 = "Unknown";
		this.anInt3461 = arg1;
		this.aString40 = arg2;
		try {
			Static162.aString38 = System.getProperty("java.vendor");
			Static162.aString35 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static162.aString39 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static162.aString39 = "Unknown";
		}
		Static162.aString37 = Static162.aString39.toLowerCase();
		try {
			Static162.aString33 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static162.aString33 = "";
		}
		try {
			Static162.aString34 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static162.aString34 = "";
		}
		try {
			Static162.aString36 = System.getProperty("user.home");
			if (Static162.aString36 != null) {
				Static162.aString36 = Static162.aString36 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static162.aString36 == null) {
			Static162.aString36 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static162.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static162.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static162.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static162.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean267 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)Lclient!qd;")
	public Class190 method2816(@OriginalArg(1) int arg0) {
		return this.method2823(arg0, null, 21, 0, 3);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!qd;")
	public Class190 method2817(@OriginalArg(0) String arg0) {
		return this.method2823(0, arg0, 21, 0, 16);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)Lclient!qd;")
	private Class190 method2818(@OriginalArg(0) byte arg0) {
		return arg0 == -65 ? this.method2823(0, null, 21, 0, 18) : null;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/net/URL;)Lclient!qd;")
	public Class190 method2819(@OriginalArg(1) URL arg0) {
		return this.method2823(0, arg0, 21, 0, 4);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!qd;")
	public Class190 method2820(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method2823(0, new Object[] { arg1, arg0 }, 21, 0, 9);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method2821(@OriginalArg(0) String arg0) {
		return Static162.method2826(this.aString40, arg0, this.anInt3461);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lclient!qd;")
	private Class190 method2822(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class190 local3 = new Class190();
		synchronized (local3) {
			local3.anObject6 = arg2;
			local3.anInt5800 = arg3;
			local3.anInt5801 = arg0;
			synchronized (this) {
				if (this.aClass190_3 == null) {
					this.aClass190_3 = this.aClass190_4 = local3;
				} else {
					this.aClass190_3.aClass190_6 = local3;
					this.aClass190_3 = local3;
				}
				this.notify();
				if (arg1 <= 113) {
					Static162.method2826(null, null, -36);
				}
			}
			try {
				local3.wait();
			} catch (@Pc(58) InterruptedException local58) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!qd;")
	private Class190 method2823(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class190 local3 = new Class190();
		local3.anInt5801 = arg0;
		local3.anInt5800 = arg4;
		local3.anObject6 = arg1;
		synchronized (this) {
			if (this.aClass190_3 == null) {
				this.aClass190_3 = this.aClass190_4 = local3;
			} else {
				this.aClass190_3.aClass190_6 = local3;
				this.aClass190_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!qd;")
	private Class190 method2824(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != 31331) {
			this.anEventQueue1 = null;
		}
		@Pc(8) Point local8 = arg0.getLocationOnScreen();
		return this.method2823(local8.x + arg2, null, 21, arg3 + local8.y, 14);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Lclient!qd;")
	public Class190 method2825(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method2823(0, new Object[] { arg2, arg0, arg1 }, 21, 0, 8);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!qd;")
	public Class190 method2827(@OriginalArg(1) Class arg0) {
		return this.method2823(0, arg0, 21, 0, 20);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!qd;")
	public Class190 method2828(@OriginalArg(1) Frame arg0) {
		return this.method2823(0, arg0, 21, 0, 7);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method2829(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method2836(52, 124, -6);
		}
		@Pc(18) Class190 local18 = this.method2822(0, (byte) 127, arg0, 21);
		return (byte[]) local18.anObject7;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Lclient!qd;")
	public Class190 method2830() {
		return this.method2823(0, null, 21, 0, 5);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!qd;")
	private Class190 method2831(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		return arg1 < 113 ? null : this.method2823(0, arg0, 21, 0, 21);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!qd;")
	public Class190 method2832(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method2823(arg1, arg0, 21, 0, 2);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Lclient!gm;")
	public Interface4 method2833() {
		return this.anInterface4_2;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!qd;")
	public Class190 method2834(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2823(arg1, arg0, 21, 0, 1);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	public void method2835() {
		Static162.aLong102 = Static150.method2672() + 5000L;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIBI)Lclient!qd;")
	public Class190 method2836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method2823((arg2 << 16) + arg1, null, 21, arg0 << 16, 6);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;[IIII)Lclient!qd;")
	public Class190 method2837(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method2823(arg3, new Object[] { arg0, arg2, arg1 }, 21, arg4, 17);
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	public void method2838() {
		synchronized (this) {
			this.aBoolean267 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass203_2 != null) {
			try {
				this.aClass203_2.method4993();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass203_3 != null) {
			try {
				this.aClass203_3.method4993();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass203Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass203Array1.length; local50++) {
				if (this.aClass203Array1[local50] != null) {
					try {
						this.aClass203Array1[local50].method4993();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass203_1 != null) {
			try {
				this.aClass203_1.method4993();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!qd;")
	public Class190 method2839(@OriginalArg(1) Class arg0) {
		return this.method2823(0, arg0, 21, 0, 11);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	public void method2840(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(20) Runtime local20 = Runtime.getRuntime();
		@Pc(31) Method local31 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(41) Method local41;
		if (!Static162.aString37.startsWith("mac")) {
			local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local31.invoke(local41, Boolean.TRUE);
			local41.invoke(local20, arg0, "jawt");
			local31.invoke(local41, Boolean.FALSE);
		}
		local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local31.invoke(local41, Boolean.TRUE);
		if (!Static162.aString37.startsWith("win")) {
			throw new Exception();
		}
		local41.invoke(local20, arg0, this.method2821("sw3d.dll").toString());
		local31.invoke(local41, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!hs", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class190 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean267) {
						return;
					}
					if (this.aClass190_4 != null) {
						local15 = this.aClass190_4;
						this.aClass190_4 = this.aClass190_4.aClass190_6;
						if (this.aClass190_4 == null) {
							this.aClass190_3 = null;
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
				@Pc(41) int local41 = local15.anInt5800;
				if (local41 == 1) {
					if (Static162.aLong102 > Static150.method2672()) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt5801);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject6);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt5801);
					local15.anObject7 = local56;
				} else if (local41 == 4) {
					if (Static162.aLong102 > Static150.method2672()) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local41 == 8) {
						local81 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local41 == 9) {
						local81 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else if (local41 == 18) {
						@Pc(126) Clipboard local126 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject7 = local126.getContents(null);
					} else if (local41 == 19) {
						@Pc(110) Transferable local110 = (Transferable) local15.anObject6;
						@Pc(113) Clipboard local113 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local113.setContents(local110, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5799 = 1;
			} catch (@Pc(196) ThreadDeath local196) {
				throw local196;
			} catch (@Pc(199) Throwable local199) {
				local15.anInt5799 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Ljava/lang/String;Z)Lclient!qd;")
	public Class190 method2841(@OriginalArg(0) String arg0) {
		return this.method2823(0, arg0, 21, 0, 12);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!qd;")
	private Class190 method2842(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -26435) {
			this.aClass190_3 = null;
		}
		return this.method2823(0, arg0, arg1 + 26456, 0, 19);
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)Z")
	public boolean method2843() {
		return false;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLjava/awt/Component;Z)Lclient!qd;")
	private Class190 method2844(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != -33) {
			this.aClass203_2 = null;
		}
		return this.method2823(arg2 ? 1 : 0, arg1, 21, 0, 15);
	}
}
