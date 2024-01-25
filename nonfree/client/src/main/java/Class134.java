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
public final class Class134 implements Runnable {

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Lclient!sb;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "[Lclient!hd;")
	public Class84[] aClass84Array1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Lclient!sm;")
	private Class185 aClass185_5 = null;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Lclient!sm;")
	private Class185 aClass185_6 = null;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!hd;")
	public Class84 aClass84_2 = null;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "Lclient!hd;")
	public Class84 aClass84_3 = null;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Lclient!hd;")
	public Class84 aClass84_1 = null;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class134(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static200.aString39 = "1.1";
		Static200.aString38 = "Unknown";
		this.anApplet1 = arg0;
		try {
			Static200.aString38 = System.getProperty("java.vendor");
			Static200.aString39 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static200.aString42 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static200.aString42 = "Unknown";
		}
		Static200.aString41 = Static200.aString42.toLowerCase();
		try {
			Static200.aString37 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static200.aString37 = "";
		}
		try {
			Static200.aString40 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static200.aString40 = "";
		}
		try {
			Static200.aString43 = System.getProperty("user.home");
			if (Static200.aString43 != null) {
				Static200.aString43 = Static200.aString43 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static200.aString43 == null) {
			Static200.aString43 = "~/";
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
		this.aBoolean319 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lclient!sm;")
	private Class185 method3744(@OriginalArg(0) boolean arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0) {
			this.aBoolean319 = false;
		}
		return this.method3753(0, arg1, 19, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBLjava/awt/Component;)Lclient!sm;")
	private Class185 method3745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Component arg3) {
		if (arg2 > -38) {
			return null;
		} else {
			@Pc(7) Point local7 = arg3.getLocationOnScreen();
			return this.method3753(local7.y + arg0, null, 14, local7.x + arg1);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
	public void method3746() {
		Static200.aLong127 = Static208.method3879() + 5000L;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)Lclient!sm;")
	public Class185 method3747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method3753(arg1 << 16, null, 6, arg2 + (arg0 << 16));
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;)Lclient!sm;")
	public Class185 method3748(@OriginalArg(1) String arg0) {
		return this.method3753(0, arg0, 16, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lclient!sm;")
	public Class185 method3749() {
		return this.method3753(0, null, 12, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lclient!sb;")
	public Interface9 method3750() {
		return this.anInterface9_2;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method3751(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class185 local7 = this.method3766(arg1, 21, (byte) -53, 0);
		if (arg0) {
			this.method3759();
		}
		return (byte[]) local7.anObject4;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lclient!sm;")
	public Class185 method3752(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3753(0, new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lclient!sm;")
	private Class185 method3753(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class185 local8 = new Class185();
		local8.anInt5681 = arg2;
		local8.anInt5683 = arg3;
		local8.anObject5 = arg1;
		synchronized (this) {
			if (this.aClass185_5 == null) {
				this.aClass185_5 = this.aClass185_6 = local8;
			} else {
				this.aClass185_5.aClass185_8 = local8;
				this.aClass185_5 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lclient!sm;")
	public Class185 method3754(@OriginalArg(0) int arg0) {
		return this.method3753(0, null, 3, arg0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!sm;")
	public Class185 method3755(@OriginalArg(1) Frame arg0) {
		return this.method3753(0, arg0, 7, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lclient!sm;")
	public Class185 method3756() {
		return this.method3753(0, null, 5, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!sm;")
	private Class185 method3757(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		return arg0 == 0 ? this.method3753(0, arg2, 15, arg1 ? 1 : 0) : null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Point;IILjava/awt/Component;[II)Lclient!sm;")
	public Class185 method3758(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		return this.method3753(arg1, new Object[] { arg2, arg3, arg0 }, 17, arg4);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Lclient!sm;")
	public Class185 method3759() {
		return this.method3753(0, null, 13, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!sm;")
	public Class185 method3760(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method3753(0, arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!sm;")
	public Class185 method3761(@OriginalArg(0) Class arg0) {
		return this.method3753(0, arg0, 11, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!sm;")
	public Class185 method3762(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3753(0, arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!ml", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class185 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean319) {
						return;
					}
					if (this.aClass185_6 != null) {
						local15 = this.aClass185_6;
						this.aClass185_6 = this.aClass185_6.aClass185_8;
						if (this.aClass185_6 == null) {
							this.aClass185_5 = null;
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
				@Pc(41) int local41 = local15.anInt5681;
				if (local41 == 1) {
					if (Static200.aLong127 > Static208.method3879()) {
						throw new IOException();
					}
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject5), local15.anInt5683);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject5);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt5683);
					local15.anObject4 = local56;
				} else if (local41 == 4) {
					if (Static200.aLong127 > Static208.method3879()) {
						throw new IOException();
					}
					local15.anObject4 = new DataInputStream(((URL) local15.anObject5).openStream());
				} else {
					@Pc(100) Object[] local100;
					if (local41 == 8) {
						local100 = (Object[]) local15.anObject5;
						local15.anObject4 = ((Class) local100[0]).getDeclaredMethod((String) local100[1], (Class[]) local100[2]);
					} else if (local41 == 9) {
						local100 = (Object[]) local15.anObject5;
						local15.anObject4 = ((Class) local100[0]).getDeclaredField((String) local100[1]);
					} else if (local41 == 18) {
						@Pc(125) Clipboard local125 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject4 = local125.getContents(null);
					} else if (local41 == 19) {
						@Pc(138) Transferable local138 = (Transferable) local15.anObject5;
						@Pc(141) Clipboard local141 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local141.setContents(local138, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5682 = 1;
			} catch (@Pc(196) ThreadDeath local196) {
				throw local196;
			} catch (@Pc(199) Throwable local199) {
				local15.anInt5682 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)Z")
	public boolean method3763() {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lclient!sm;")
	public Class185 method3764(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method3753(0, new Object[] { arg1, arg0, arg2 }, 8, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/net/URL;)Lclient!sm;")
	public Class185 method3765(@OriginalArg(1) URL arg0) {
		return this.method3753(0, arg0, 4, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lclient!sm;")
	private Class185 method3766(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class185 local3 = new Class185();
		synchronized (local3) {
			local3.anInt5681 = arg1;
			local3.anObject5 = arg0;
			local3.anInt5683 = arg3;
			synchronized (this) {
				if (this.aClass185_5 == null) {
					this.aClass185_5 = this.aClass185_6 = local3;
				} else {
					this.aClass185_5.aClass185_8 = local3;
					this.aClass185_5 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
		}
		return arg2 >= -19 ? null : local3;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Lclient!sm;")
	private Class185 method3767(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			Static200.aString40 = null;
		}
		return this.method3753(0, null, 18, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(ZLjava/lang/String;)Lclient!sm;")
	private Class185 method3768(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		return arg0 ? this.method3753(0, arg1, 21, 0) : null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!sm;")
	public Class185 method3769(@OriginalArg(0) Class arg0) {
		return this.method3753(0, arg0, 10, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	public void method3770() {
		synchronized (this) {
			this.aBoolean319 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass84_1 != null) {
			try {
				this.aClass84_1.method2413();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass84_2 != null) {
			try {
				this.aClass84_2.method2413();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass84Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass84Array1.length; local52++) {
				if (this.aClass84Array1[local52] != null) {
					try {
						this.aClass84Array1[local52].method2413();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass84_3 != null) {
			try {
				this.aClass84_3.method2413();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!sm;")
	public Class185 method3771(@OriginalArg(1) Class arg0) {
		return this.method3753(0, arg0, 20, 0);
	}
}
