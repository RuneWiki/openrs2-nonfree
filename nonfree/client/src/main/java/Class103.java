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
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class103 implements Runnable {

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[Lclient!ko;")
	public Class142[] aClass142Array1;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!td;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!ko;")
	public Class142 aClass142_2 = null;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!ko;")
	public Class142 aClass142_1 = null;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!uu;")
	private Class249 aClass249_3 = null;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Lclient!ko;")
	public Class142 aClass142_3 = null;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "Lclient!uu;")
	private Class249 aClass249_4 = null;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	private final int anInt2574;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Ljava/lang/String;")
	private final String aString26;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class103(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static143.aString28 = "Unknown";
		this.anInt2574 = arg1;
		this.aString26 = arg2;
		Static143.aString24 = "1.1";
		try {
			Static143.aString28 = System.getProperty("java.vendor");
			Static143.aString24 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static143.aString29 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static143.aString29 = "Unknown";
		}
		Static143.aString25 = Static143.aString29.toLowerCase();
		try {
			Static143.aString22 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static143.aString22 = "";
		}
		try {
			Static143.aString23 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static143.aString23 = "";
		}
		try {
			Static143.aString27 = System.getProperty("user.home");
			if (Static143.aString27 != null) {
				Static143.aString27 = Static143.aString27 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static143.aString27 == null) {
			Static143.aString27 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static143.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static143.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static143.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static143.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean188 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Lclient!td;")
	public Interface9 method2352() {
		return this.anInterface9_1;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!uu;")
	private Class249 method2353(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 15) {
			this.aClass249_3 = null;
		}
		return this.method2372(0, 15, arg1, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lclient!uu;")
	public Class249 method2354() {
		return this.method2372(0, 5, null, 0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Component;BI)Lclient!uu;")
	private Class249 method2355(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		if (arg2 >= -71) {
			this.aClass142_3 = null;
		}
		return this.method2372(arg0 + local2.y, 14, null, local2.x + arg3);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)Z")
	public boolean method2356() {
		return false;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!uu;")
	public Class249 method2357(@OriginalArg(1) Frame arg0) {
		return this.method2372(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lclient!uu;")
	private Class249 method2358(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != -52) {
			this.method2354();
		}
		return this.method2372(0, 19, arg1, 0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)Lclient!uu;")
	public Class249 method2359(@OriginalArg(0) int arg0) {
		return this.method2372(0, 3, null, arg0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Lclient!uu;")
	private Class249 method2360(@OriginalArg(0) byte arg0) {
		return arg0 == -49 ? this.method2372(0, 18, null, 0) : null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!uu;")
	public Class249 method2361(@OriginalArg(1) Class arg0) {
		return this.method2372(0, 20, arg0, 0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!uu;")
	private Class249 method2362(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class249 local3 = new Class249();
		synchronized (local3) {
			if (arg3 != 2) {
				this.method2377(118, 126, -80);
			}
			local3.anInt6930 = arg1;
			local3.anObject11 = arg0;
			local3.anInt6931 = arg2;
			synchronized (this) {
				if (this.aClass249_3 == null) {
					this.aClass249_3 = this.aClass249_4 = local3;
				} else {
					this.aClass249_3.aClass249_9 = local3;
					this.aClass249_3 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(60) InterruptedException local60) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/lang/String;)Lclient!uu;")
	public Class249 method2363(@OriginalArg(1) String arg0) {
		return this.method2372(0, 12, arg0, 0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!uu;")
	public Class249 method2364(@OriginalArg(1) Class arg0) {
		return this.method2372(0, 11, arg0, 0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!uu;")
	public Class249 method2365(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method2372(0, 9, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILjava/awt/Component;[IBLjava/awt/Point;)Lclient!uu;")
	public Class249 method2367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Point arg4) {
		return this.method2372(arg1, 17, new Object[] { arg2, arg3, arg4 }, arg0);
	}

	@OriginalMember(owner = "client!hf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class249 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean188) {
						return;
					}
					if (this.aClass249_4 != null) {
						local15 = this.aClass249_4;
						this.aClass249_4 = this.aClass249_4.aClass249_9;
						if (this.aClass249_4 == null) {
							this.aClass249_3 = null;
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
				@Pc(41) int local41 = local15.anInt6930;
				if (local41 == 1) {
					if (Static143.aLong78 > Static154.method2527()) {
						throw new IOException();
					}
					local15.anObject10 = new Socket(InetAddress.getByName((String) local15.anObject11), local15.anInt6931);
				} else if (local41 == 2) {
					@Pc(81) Thread local81 = new Thread((Runnable) local15.anObject11);
					local81.setDaemon(true);
					local81.start();
					local81.setPriority(local15.anInt6931);
					local15.anObject10 = local81;
				} else if (local41 == 4) {
					if (Static154.method2527() < Static143.aLong78) {
						throw new IOException();
					}
					local15.anObject10 = new DataInputStream(((URL) local15.anObject11).openStream());
				} else {
					@Pc(106) Object[] local106;
					if (local41 == 8) {
						local106 = (Object[]) local15.anObject11;
						local15.anObject10 = ((Class) local106[0]).getDeclaredMethod((String) local106[1], (Class[]) local106[2]);
					} else if (local41 == 9) {
						local106 = (Object[]) local15.anObject11;
						local15.anObject10 = ((Class) local106[0]).getDeclaredField((String) local106[1]);
					} else if (local41 == 18) {
						@Pc(167) Clipboard local167 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject10 = local167.getContents(null);
					} else if (local41 == 19) {
						@Pc(156) Transferable local156 = (Transferable) local15.anObject11;
						@Pc(159) Clipboard local159 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local159.setContents(local156, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6929 = 1;
			} catch (@Pc(196) ThreadDeath local196) {
				throw local196;
			} catch (@Pc(199) Throwable local199) {
				local15.anInt6929 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Lclient!uu;")
	public Class249 method2368(@OriginalArg(0) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method2372(0, 8, new Object[] { arg0, arg2, arg1 }, 0);
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	public void method2369() {
		Static143.aLong78 = Static154.method2527() + (long) 5000;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!uu;")
	public Class249 method2370(@OriginalArg(0) String arg0) {
		return this.method2372(0, 16, arg0, 0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;)Lclient!uu;")
	private Class249 method2371(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == -1 ? this.method2372(0, 21, arg1, 0) : null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILjava/lang/Object;BI)Lclient!uu;")
	private Class249 method2372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class249 local10 = new Class249();
		local10.anInt6931 = arg3;
		local10.anInt6930 = arg1;
		local10.anObject11 = arg2;
		synchronized (this) {
			if (this.aClass249_3 == null) {
				this.aClass249_3 = this.aClass249_4 = local10;
			} else {
				this.aClass249_3.aClass249_9 = local10;
				this.aClass249_3 = local10;
			}
			this.notify();
			return local10;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method2373(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return null;
		} else {
			@Pc(12) Class249 local12 = this.method2362(arg0, 21, 0, 2);
			return (byte[]) local12.anObject10;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!uu;")
	public Class249 method2374(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method2372(0, 2, arg1, arg0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!uu;")
	public Class249 method2375(@OriginalArg(0) URL arg0) {
		return this.method2372(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method2376(@OriginalArg(1) String arg0) {
		return Static143.method2366(this.anInt2574, this.aString26, arg0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBII)Lclient!uu;")
	public Class249 method2377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return this.method2372(arg1 << 16, 6, null, arg2 + (arg0 << 16));
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;IB)Lclient!uu;")
	public Class249 method2378(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2372(0, 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public void method2379() {
		synchronized (this) {
			this.aBoolean188 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass142_3 != null) {
			try {
				this.aClass142_3.method3267();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass142_2 != null) {
			try {
				this.aClass142_2.method3267();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass142Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass142Array1.length; local44++) {
				if (this.aClass142Array1[local44] != null) {
					try {
						this.aClass142Array1[local44].method3267();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass142_1 != null) {
			try {
				this.aClass142_1.method3267();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}
}
