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

@OriginalClass("client!js")
public final class Class131 implements Runnable {

	@OriginalMember(owner = "client!js", name = "f", descriptor = "[Lclient!sr;")
	public Class224[] aClass224Array1;

	@OriginalMember(owner = "client!js", name = "q", descriptor = "Lclient!cq;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "Lclient!sr;")
	public Class224 aClass224_2 = null;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!js", name = "l", descriptor = "Lclient!sr;")
	public Class224 aClass224_3 = null;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "Z")
	private boolean aBoolean314 = false;

	@OriginalMember(owner = "client!js", name = "n", descriptor = "Lclient!jk;")
	private Class128 aClass128_5 = null;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "Lclient!sr;")
	public Class224 aClass224_4 = null;

	@OriginalMember(owner = "client!js", name = "v", descriptor = "Lclient!jk;")
	private Class128 aClass128_6 = null;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "I")
	private final int anInt3817;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "Ljava/lang/String;")
	private final String aString31;

	@OriginalMember(owner = "client!js", name = "u", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class131(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt3817 = arg1;
		this.anApplet1 = arg0;
		Static197.aString28 = "Unknown";
		Static197.aString30 = "1.1";
		this.aString31 = arg2;
		try {
			Static197.aString28 = System.getProperty("java.vendor");
			Static197.aString30 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static197.aString26 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static197.aString26 = "Unknown";
		}
		Static197.aString29 = Static197.aString26.toLowerCase();
		try {
			Static197.aString32 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static197.aString32 = "";
		}
		try {
			Static197.aString27 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static197.aString27 = "";
		}
		try {
			Static197.aString33 = System.getProperty("user.home");
			if (Static197.aString33 != null) {
				Static197.aString33 = Static197.aString33 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static197.aString33 == null) {
			Static197.aString33 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static197.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static197.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static197.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static197.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean314 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)Lclient!jk;")
	public Class128 method3043(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3050(null, arg2 + (arg0 << 16), 6, arg1 << 16);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!jk;")
	public Class128 method3045(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3050(arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!jk;")
	private Class128 method3046(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		return arg3 == 14 ? this.method3050(null, local2.x + arg2, 14, local2.y + arg0) : null;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!jk;")
	public Class128 method3047(@OriginalArg(1) Class arg0) {
		return this.method3050(arg0, 0, 11, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/lang/String;)Lclient!jk;")
	public Class128 method3048(@OriginalArg(1) String arg0) {
		return this.method3050(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)Lclient!jk;")
	public Class128 method3049(@OriginalArg(1) int arg0) {
		return this.method3050(null, arg0, 3, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lclient!jk;")
	private Class128 method3050(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class128 local3 = new Class128();
		local3.anObject3 = arg0;
		local3.anInt3729 = arg1;
		local3.anInt3728 = arg2;
		synchronized (this) {
			if (this.aClass128_5 == null) {
				this.aClass128_5 = this.aClass128_6 = local3;
			} else {
				this.aClass128_5.aClass128_3 = local3;
				this.aClass128_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Z")
	public boolean method3051() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Lclient!jk;")
	public Class128 method3052() {
		return this.method3050(null, 0, 5, 0);
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
	public void method3053() {
		Static197.aLong101 = Static208.method3182() + 5000L;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!jk;")
	public Class128 method3054(@OriginalArg(1) Frame arg0) {
		return this.method3050(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)Lclient!jk;")
	private Class128 method3055(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.method3050(null, 0, 18, 0) : null;
	}

	@OriginalMember(owner = "client!js", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class128 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean314) {
						return;
					}
					if (this.aClass128_6 != null) {
						local15 = this.aClass128_6;
						this.aClass128_6 = this.aClass128_6.aClass128_3;
						if (this.aClass128_6 == null) {
							this.aClass128_5 = null;
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
				@Pc(41) int local41 = local15.anInt3728;
				if (local41 == 1) {
					if (Static197.aLong101 > Static208.method3182()) {
						throw new IOException();
					}
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt3729);
				} else if (local41 == 2) {
					@Pc(77) Thread local77 = new Thread((Runnable) local15.anObject3);
					local77.setDaemon(true);
					local77.start();
					local77.setPriority(local15.anInt3729);
					local15.anObject4 = local77;
				} else if (local41 == 4) {
					if (Static208.method3182() < Static197.aLong101) {
						throw new IOException();
					}
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(127) Object[] local127;
					if (local41 == 8) {
						local127 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local127[0]).getDeclaredMethod((String) local127[1], (Class[]) local127[2]);
					} else if (local41 == 9) {
						local127 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local127[0]).getDeclaredField((String) local127[1]);
					} else if (local41 == 18) {
						@Pc(176) Clipboard local176 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject4 = local176.getContents(null);
					} else if (local41 == 19) {
						@Pc(160) Transferable local160 = (Transferable) local15.anObject3;
						@Pc(163) Clipboard local163 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local163.setContents(local160, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt3727 = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.anInt3727 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
	public void method3056() {
		synchronized (this) {
			this.aBoolean314 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass224_4 != null) {
			try {
				this.aClass224_4.method5141();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass224_2 != null) {
			try {
				this.aClass224_2.method5141();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass224Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass224Array1.length; local50++) {
				if (this.aClass224Array1[local50] != null) {
					try {
						this.aClass224Array1[local50].method5141();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass224_3 != null) {
			try {
				this.aClass224_3.method5141();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(ILjava/lang/String;)Lclient!jk;")
	private Class128 method3057(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 > -93) {
			this.method3059(null);
		}
		return this.method3050(arg1, 0, 21, 0);
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(ILjava/lang/String;)Lclient!jk;")
	public Class128 method3058(@OriginalArg(1) String arg0) {
		return this.method3050(arg0, 0, 12, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!jk;")
	public Class128 method3059(@OriginalArg(0) URL arg0) {
		return this.method3050(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!jk;")
	public Class128 method3060(@OriginalArg(0) Class arg0) {
		return this.method3050(arg0, 0, 20, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!jk;")
	public Class128 method3061(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3050(new Object[] { arg1, arg0 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;[IIII)Lclient!jk;")
	public Class128 method3062(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method3050(new Object[] { arg0, arg2, arg1 }, arg4, 17, arg3);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Lclient!jk;")
	private Class128 method3063(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class128 local3 = new Class128();
		synchronized (local3) {
			local3.anObject3 = arg0;
			local3.anInt3729 = arg3;
			local3.anInt3728 = arg1;
			synchronized (this) {
				if (this.aClass128_5 == null) {
					this.aClass128_5 = this.aClass128_6 = local3;
				} else {
					this.aClass128_5.aClass128_3 = local3;
					this.aClass128_5 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!jk;")
	private Class128 method3064(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		return arg0 == 15 ? this.method3050(arg2, arg1 ? 1 : 0, 15, 0) : null;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method3065(@OriginalArg(1) String arg0) {
		return Static197.method3044(this.anInt3817, this.aString31, arg0);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)Lclient!cq;")
	public Interface1 method3066() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Lclient!jk;")
	private Class128 method3067(@OriginalArg(0) Transferable arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? null : this.method3050(arg0, 0, 19, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IILjava/lang/String;)Lclient!jk;")
	public Class128 method3068(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method3050(arg1, arg0, 1, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!jk;")
	public Class128 method3069(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method3050(new Object[] { arg1, arg0, arg2 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method3070(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class128 local7 = this.method3063(arg1, 21, arg0, 0);
		return (byte[]) local7.anObject4;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/lang/Class;)V")
	public void method3071(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(16) Class[] local16 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!Static197.aString29.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local16);
			local29.invoke(local39, Boolean.TRUE);
			local39.invoke(local18, arg0, "jawt");
			local29.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local16);
		local29.invoke(local39, Boolean.TRUE);
		if (!Static197.aString29.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local18, arg0, this.method3065("sw3d.dll").toString());
		local29.invoke(local39, Boolean.FALSE);
	}
}
