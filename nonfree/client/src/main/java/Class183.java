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

@OriginalClass("client!or")
public final class Class183 implements Runnable {

	@OriginalMember(owner = "client!or", name = "p", descriptor = "Lclient!dh;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "[Lclient!oh;")
	public Class178[] aClass178Array1;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!oh;")
	public Class178 aClass178_2 = null;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "Lclient!oh;")
	public Class178 aClass178_3 = null;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "Lclient!gp;")
	private Class91 aClass91_7 = null;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "Lclient!oh;")
	public Class178 aClass178_4 = null;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "Lclient!gp;")
	private Class91 aClass91_8 = null;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "Z")
	private boolean aBoolean338 = false;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "I")
	private final int anInt4809;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Ljava/lang/String;")
	private String aString137;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class183(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static293.aString140 = "1.1";
		Static293.aString139 = "Unknown";
		this.anInt4809 = arg1;
		this.aString137 = arg2;
		this.anApplet1 = arg0;
		try {
			Static293.aString139 = System.getProperty("java.vendor");
			Static293.aString140 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static293.aString141 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static293.aString141 = "Unknown";
		}
		Static293.aString142 = Static293.aString141.toLowerCase();
		try {
			Static293.aString143 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static293.aString143 = "";
		}
		try {
			Static293.aString138 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static293.aString138 = "";
		}
		try {
			Static293.aString136 = System.getProperty("user.home");
			if (Static293.aString136 != null) {
				Static293.aString136 = Static293.aString136 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static293.aString136 == null) {
			Static293.aString136 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static293.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static293.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static293.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static293.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean338 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!gp;")
	private Class91 method3897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		if (arg1 < 82) {
			this.aBoolean338 = false;
		}
		@Pc(9) Class91 local9 = new Class91();
		synchronized (local9) {
			local9.anInt2445 = arg2;
			local9.anInt2444 = arg0;
			local9.anObject4 = arg3;
			synchronized (this) {
				if (this.aClass91_8 == null) {
					this.aClass91_8 = this.aClass91_7 = local9;
				} else {
					this.aClass91_8.aClass91_2 = local9;
					this.aClass91_8 = local9;
				}
				this.notify();
			}
			try {
				local9.wait();
			} catch (@Pc(55) InterruptedException local55) {
			}
			return local9;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/Class;)V")
	public void method3898(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(22) Runtime local22 = Runtime.getRuntime();
		@Pc(33) Method local33 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(43) Method local43;
		if (!Static293.aString142.startsWith("mac")) {
			local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local33.invoke(local43, Boolean.TRUE);
			local43.invoke(local22, arg0, "jawt");
			local33.invoke(local43, Boolean.FALSE);
		}
		local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local33.invoke(local43, Boolean.TRUE);
		if (!Static293.aString142.startsWith("win")) {
			throw new Exception();
		}
		local43.invoke(local22, arg0, this.method3920("sw3d.dll").toString());
		local33.invoke(local43, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method3899(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 85) {
			this.method3901(null);
		}
		@Pc(15) Class91 local15 = this.method3897(21, 93, 0, arg0);
		return (byte[]) local15.anObject3;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!gp;")
	private Class91 method3900(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 8602) {
			this.aString137 = null;
		}
		return this.method3917(0, 0, arg1, 19);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!gp;")
	public Class91 method3901(@OriginalArg(0) URL arg0) {
		return this.method3917(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lclient!gp;")
	public Class91 method3902() {
		return this.method3917(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!gp;")
	public Class91 method3903(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method3917(arg1, 0, arg0, 1);
	}

	@OriginalMember(owner = "client!or", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class91 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean338) {
						return;
					}
					if (this.aClass91_7 != null) {
						local15 = this.aClass91_7;
						this.aClass91_7 = this.aClass91_7.aClass91_2;
						if (this.aClass91_7 == null) {
							this.aClass91_8 = null;
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
				@Pc(41) int local41 = local15.anInt2444;
				if (local41 == 1) {
					if (Static293.aLong162 > Static110.method1702()) {
						throw new IOException();
					}
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt2445);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject4);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt2445);
					local15.anObject3 = local56;
				} else if (local41 == 4) {
					if (Static110.method1702() < Static293.aLong162) {
						throw new IOException();
					}
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(139) Object[] local139;
					if (local41 == 8) {
						local139 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local139[0]).getDeclaredMethod((String) local139[1], (Class[]) local139[2]);
					} else if (local41 == 9) {
						local139 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local139[0]).getDeclaredField((String) local139[1]);
					} else if (local41 == 18) {
						@Pc(129) Clipboard local129 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject3 = local129.getContents(null);
					} else if (local41 == 19) {
						@Pc(113) Transferable local113 = (Transferable) local15.anObject4;
						@Pc(116) Clipboard local116 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local116.setContents(local113, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2446 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt2446 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!gp;")
	public Class91 method3904(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method3917(arg1, 0, arg0, 2);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	public void method3905() {
		synchronized (this) {
			this.aBoolean338 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass178_4 != null) {
			try {
				this.aClass178_4.method3779();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass178_3 != null) {
			try {
				this.aClass178_3.method3779();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass178Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass178Array1.length; local50++) {
				if (this.aClass178Array1[local50] != null) {
					try {
						this.aClass178Array1[local50].method3779();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass178_2 != null) {
			try {
				this.aClass178_2.method3779();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!gp;")
	public Class91 method3907(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3917(0, 0, new Object[] { arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZLjava/awt/Component;)Lclient!gp;")
	private Class91 method3908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Component arg3) {
		if (arg2) {
			@Pc(7) Point local7 = arg3.getLocationOnScreen();
			return this.method3917(local7.x + arg1, arg0 + local7.y, null, 14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)Lclient!dh;")
	public Interface4 method3909() {
		return this.anInterface4_2;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!gp;")
	public Class91 method3910(@OriginalArg(0) String arg0) {
		return this.method3917(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/String;)Lclient!gp;")
	private Class91 method3911(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -31589) {
			this.method3918(null);
		}
		return this.method3917(0, 0, arg1, 21);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!gp;")
	public Class91 method3912(@OriginalArg(0) Class arg0) {
		return this.method3917(0, 0, arg0, 20);
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Lclient!gp;")
	private Class91 method3913(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aString137 = null;
		}
		return this.method3917(0, 0, null, 18);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)Lclient!gp;")
	public Class91 method3914(@OriginalArg(0) int arg0) {
		return this.method3917(arg0, 0, null, 3);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	public void method3915() {
		Static293.aLong162 = Static110.method1702() + 5000L;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!gp;")
	public Class91 method3916(@OriginalArg(0) Frame arg0) {
		return this.method3917(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BIILjava/lang/Object;I)Lclient!gp;")
	private Class91 method3917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class91 local8 = new Class91();
		local8.anInt2445 = arg0;
		local8.anObject4 = arg2;
		local8.anInt2444 = arg3;
		synchronized (this) {
			if (this.aClass91_8 == null) {
				this.aClass91_8 = this.aClass91_7 = local8;
			} else {
				this.aClass91_8.aClass91_2 = local8;
				this.aClass91_8 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!gp;")
	public Class91 method3918(@OriginalArg(0) Class arg0) {
		return this.method3917(0, 0, arg0, 11);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!gp;")
	private Class91 method3919(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != 0) {
			this.method3925(-28, -80, -73);
		}
		return this.method3917(arg2 ? 1 : 0, 0, arg1, 15);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method3920(@OriginalArg(0) String arg0) {
		return Static293.method3906(this.aString137, this.anInt4809, arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/String;Z)Lclient!gp;")
	public Class91 method3921(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method3917(0, 0, arg0, 12) : this.method3917(0, 0, arg0, 13);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/Component;IZ[ILjava/awt/Point;)Lclient!gp;")
	public Class91 method3922(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Point arg4) {
		return this.method3917(arg0, arg2, new Object[] { arg1, arg3, arg4 }, 17);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lclient!gp;")
	public Class91 method3923(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method3917(0, 0, new Object[] { arg1, arg0, arg2 }, 8);
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(I)Z")
	public boolean method3924() {
		return false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)Lclient!gp;")
	public Class91 method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method3917((arg2 << 16) + arg1, arg0 << 16, null, 6);
	}
}
