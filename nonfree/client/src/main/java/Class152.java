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
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class152 implements Runnable {

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
	public static final int anInt3791 = 3;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "J")
	private static volatile long aLong122;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "[Lclient!rl;")
	public Class204[] aClass204Array1;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "Lclient!fc;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "Lclient!rl;")
	public Class204 aClass204_2 = null;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!cc;")
	private Class32 aClass32_9 = null;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!rl;")
	public Class204 aClass204_1 = null;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "Lclient!rl;")
	public Class204 aClass204_3 = null;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "Lclient!cc;")
	private Class32 aClass32_10 = null;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
		aLong122 = 0L;
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 592)
	public Class152(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static200.aString34 = "1.1";
		this.anApplet1 = arg0;
		Static200.aString33 = "Unknown";
		try {
			Static200.aString33 = System.getProperty("java.vendor");
			Static200.aString34 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static200.aString35 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static200.aString35 = "Unknown";
		}
		Static200.aString30 = Static200.aString35.toLowerCase();
		try {
			Static200.aString31 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static200.aString31 = "";
		}
		try {
			Static200.aString32 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static200.aString32 = "";
		}
		try {
			Static200.aString29 = System.getProperty("user.home");
			if (Static200.aString29 != null) {
				Static200.aString29 = Static200.aString29 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static200.aString29 == null) {
			Static200.aString29 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static200.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static200.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static200.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static200.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean247 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Object;ZII)Lclient!cc;", line = 6)
	private Class32 method3747(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1) {
			this.method3756(7, null);
		}
		@Pc(11) Class32 local11 = new Class32();
		synchronized (local11) {
			local11.anObject3 = arg0;
			local11.anInt991 = arg3;
			local11.anInt990 = arg2;
			synchronized (this) {
				if (this.aClass32_10 == null) {
					this.aClass32_10 = this.aClass32_9 = local11;
				} else {
					this.aClass32_10.aClass32_3 = local11;
					this.aClass32_10 = local11;
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

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/awt/Component;Z)Lclient!cc;", line = 46)
	private Class32 method3748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) boolean arg3) {
		if (arg3) {
			this.aClass204_2 = null;
		}
		@Pc(8) Point local8 = arg2.getLocationOnScreen();
		return this.method3768(null, local8.x + arg0, 14, arg1 + local8.y);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lclient!cc;", line = 62)
	public Class32 method3749(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method3768(new Object[] { arg0, arg1, arg2 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZI)Lclient!cc;", line = 74)
	public Class32 method3750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method3768(null, (arg0 << 16) + arg1, 6, arg2 << 16);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lclient!cc;", line = 84)
	public Class32 method3751() {
		return this.method3768(null, 0, 12, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!cc;", line = 94)
	public Class32 method3752(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method3768(arg0, arg1, 1, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!cc;", line = 109)
	public Class32 method3753(@OriginalArg(1) Class arg0) {
		return this.method3768(arg0, 0, 20, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/String;)Lclient!cc;", line = 124)
	private Class32 method3754(@OriginalArg(1) String arg0) {
		return this.method3768(arg0, 0, 21, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!cc;", line = 138)
	public Class32 method3755(@OriginalArg(1) Class arg0) {
		return this.method3768(arg0, 0, 10, 0);
	}

	@OriginalMember(owner = "client!ml", name = "run", descriptor = "()V", line = 147)
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class32 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean247) {
						return;
					}
					if (this.aClass32_9 != null) {
						local15 = this.aClass32_9;
						this.aClass32_9 = this.aClass32_9.aClass32_3;
						if (this.aClass32_9 == null) {
							this.aClass32_10 = null;
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
				@Pc(41) int local41 = local15.anInt990;
				if (local41 == 1) {
					if (Static190.method3686() < aLong122) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt991);
				} else if (local41 == 2) {
					@Pc(81) Thread local81 = new Thread((Runnable) local15.anObject3);
					local81.setDaemon(true);
					local81.start();
					local81.setPriority(local15.anInt991);
					local15.anObject2 = local81;
				} else if (local41 == 4) {
					if (Static190.method3686() < aLong122) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(166) Object[] local166;
					if (local41 == 8) {
						local166 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local166[0]).getDeclaredMethod((String) local166[1], (Class[]) local166[2]);
					} else if (local41 == 9) {
						local166 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local166[0]).getDeclaredField((String) local166[1]);
					} else if (local41 == 18) {
						@Pc(134) Clipboard local134 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local134.getContents(null);
					} else if (local41 == 19) {
						@Pc(149) Transferable local149 = (Transferable) local15.anObject3;
						@Pc(152) Clipboard local152 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local152.setContents(local149, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt992 = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.anInt992 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 268)
	private byte[] method3756(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -30696) {
			this.method3768(null, -97, 116, -128);
		}
		@Pc(18) Class32 local18 = this.method3747(arg1, true, 21, 0);
		return (byte[]) local18.anObject2;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lclient!cc;", line = 288)
	public Class32 method3757() {
		return this.method3768(null, 0, 13, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lclient!cc;", line = 303)
	public Class32 method3758(@OriginalArg(1) int arg0) {
		return this.method3768(null, arg0, 3, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!cc;", line = 315)
	private Class32 method3759(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		if (arg1 > -88) {
			Static200.aString32 = null;
		}
		return this.method3768(arg2, arg0 ? 1 : 0, 15, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!cc;", line = 326)
	private Class32 method3760(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			aLong122 = -121L;
		}
		return this.method3768(arg0, 0, 19, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 336)
	public void method3761() {
		aLong122 = Static190.method3686() + 5000L;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!cc;", line = 346)
	public Class32 method3762(@OriginalArg(0) String arg0) {
		return this.method3768(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!cc;", line = 358)
	public Class32 method3763(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method3768(new Object[] { arg0, arg1 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!cc;", line = 368)
	public Class32 method3764(@OriginalArg(0) Frame arg0) {
		return this.method3768(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lclient!fc;", line = 380)
	public Interface3 method3765() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Z", line = 394)
	public boolean method3766() {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!cc;", line = 408)
	public Class32 method3767(@OriginalArg(1) URL arg0) {
		return this.method3768(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!cc;", line = 429)
	private Class32 method3768(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class32 local3 = new Class32();
		local3.anObject3 = arg0;
		local3.anInt990 = arg2;
		local3.anInt991 = arg1;
		synchronized (this) {
			if (this.aClass32_10 == null) {
				this.aClass32_10 = this.aClass32_9 = local3;
			} else {
				this.aClass32_10.aClass32_3 = local3;
				this.aClass32_10 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 459)
	public void method3769() {
		synchronized (this) {
			this.aBoolean247 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass204_2 != null) {
			try {
				this.aClass204_2.method5194();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass204_3 != null) {
			try {
				this.aClass204_3.method5194();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass204Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass204Array1.length; local49++) {
				if (this.aClass204Array1[local49] != null) {
					try {
						this.aClass204Array1[local49].method5194();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass204_1 != null) {
			try {
				this.aClass204_1.method5194();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!cc;", line = 517)
	public Class32 method3770(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3768(arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/awt/Point;I[ILjava/awt/Component;I)Lclient!cc;", line = 530)
	public Class32 method3771(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		return this.method3768(new Object[] { arg3, arg2, arg1 }, arg0, 17, arg4);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(ILjava/lang/Class;)Lclient!cc;", line = 541)
	public Class32 method3772(@OriginalArg(1) Class arg0) {
		return this.method3768(arg0, 0, 11, 0);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)Lclient!cc;", line = 557)
	public Class32 method3773() {
		return this.method3768(null, 0, 5, 0);
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)Lclient!cc;", line = 567)
	private Class32 method3774(@OriginalArg(0) byte arg0) {
		if (arg0 != 112) {
			this.method3764(null);
		}
		return this.method3768(null, 0, 18, 0);
	}
}
