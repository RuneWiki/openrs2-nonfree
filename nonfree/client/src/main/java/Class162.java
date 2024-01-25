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

@OriginalClass("client!ng")
public final class Class162 implements Runnable {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!rb;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "[Lclient!vl;")
	public Class237[] aClass237Array1;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Lclient!vl;")
	public Class237 aClass237_1 = null;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!iu;")
	private Class112 aClass112_7 = null;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!vl;")
	public Class237 aClass237_3 = null;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "Lclient!iu;")
	private Class112 aClass112_8 = null;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!vl;")
	public Class237 aClass237_2 = null;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class162(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static237.aString49 = "Unknown";
		this.anApplet1 = arg0;
		Static237.aString48 = "1.1";
		try {
			Static237.aString49 = System.getProperty("java.vendor");
			Static237.aString48 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static237.aString52 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static237.aString52 = "Unknown";
		}
		Static237.aString47 = Static237.aString52.toLowerCase();
		try {
			Static237.aString46 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static237.aString46 = "";
		}
		try {
			Static237.aString50 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static237.aString50 = "";
		}
		try {
			Static237.aString51 = System.getProperty("user.home");
			if (Static237.aString51 != null) {
				Static237.aString51 = Static237.aString51 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static237.aString51 == null) {
			Static237.aString51 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static237.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static237.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static237.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static237.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean387 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!iu;")
	public Class112 method3262(@OriginalArg(1) Class arg0) {
		return this.method3287(arg0, 10, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/net/URL;)Lclient!iu;")
	public Class112 method3263(@OriginalArg(1) URL arg0) {
		return this.method3287(arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public void method3264() {
		Static237.aLong131 = Static378.method5293() + 5000L;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)Lclient!iu;")
	public Class112 method3265() {
		return this.method3287(null, 13, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!iu;")
	private Class112 method3266(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class112 local3 = new Class112();
		synchronized (local3) {
			local3.anInt2970 = arg3;
			local3.anInt2968 = arg0;
			local3.anObject4 = arg1;
			synchronized (this) {
				if (this.aClass112_7 == null) {
					this.aClass112_7 = this.aClass112_8 = local3;
				} else {
					this.aClass112_7.aClass112_4 = local3;
					this.aClass112_7 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
			if (arg2 != 0) {
				this.method3265();
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!iu;")
	public Class112 method3267(@OriginalArg(1) Class arg0) {
		return this.method3287(arg0, 20, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Lclient!iu;")
	public Class112 method3268() {
		return this.method3287(null, 12, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lclient!iu;")
	private Class112 method3269(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 < 45 ? null : this.method3287(arg1, 19, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;Z)Lclient!iu;")
	public Class112 method3270(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2) {
		return this.method3287(new Object[] { arg1, arg0, arg2 }, 8, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[ILjava/awt/Point;Ljava/awt/Component;)Lclient!iu;")
	public Class112 method3271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) Component arg4) {
		return this.method3287(new Object[] { arg4, arg2, arg3 }, 17, arg1, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)Z")
	public boolean method3272() {
		return false;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!iu;")
	private Class112 method3273(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 != 1) {
			this.method3289(57, null);
		}
		@Pc(11) Point local11 = arg0.getLocationOnScreen();
		return this.method3287(null, 14, local11.y + arg1, local11.x + arg3);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!iu;")
	public Class112 method3274(@OriginalArg(0) Class arg0) {
		return this.method3287(arg0, 11, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/lang/String;)Lclient!iu;")
	private Class112 method3275(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 > -81) {
			this.method3272();
		}
		return this.method3287(arg1, 21, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Lclient!iu;")
	public Class112 method3276() {
		return this.method3287(null, 5, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Lclient!iu;")
	private Class112 method3277(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aClass112_7 = null;
		}
		return this.method3287(null, 18, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!iu;")
	public Class112 method3278(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3287(arg1, 2, 0, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!iu;")
	public Class112 method3279(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method3287(new Object[] { arg0, arg1 }, 9, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
	public void method3280() {
		synchronized (this) {
			this.aBoolean387 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass237_3 != null) {
			try {
				this.aClass237_3.method5212();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass237_1 != null) {
			try {
				this.aClass237_1.method5212();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass237Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass237Array1.length; local52++) {
				if (this.aClass237Array1[local52] != null) {
					try {
						this.aClass237Array1[local52].method5212();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass237_2 != null) {
			try {
				this.aClass237_2.method5212();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)Lclient!rb;")
	public Interface10 method3281() {
		return this.anInterface10_1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method3282(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class112 local7 = this.method3266(0, arg1, 0, 21);
		return arg0 ? null : (byte[]) local7.anObject5;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZIII)Lclient!iu;")
	public Class112 method3283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method3287(null, 6, arg0 << 16, (arg1 << 16) - -arg2);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!iu;")
	public Class112 method3284(@OriginalArg(0) String arg0) {
		return this.method3287(arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lclient!iu;")
	public Class112 method3285(@OriginalArg(0) int arg0) {
		return this.method3287(null, 3, 0, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class112 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean387) {
						return;
					}
					if (this.aClass112_8 != null) {
						local15 = this.aClass112_8;
						this.aClass112_8 = this.aClass112_8.aClass112_4;
						if (this.aClass112_8 == null) {
							this.aClass112_7 = null;
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
				@Pc(41) int local41 = local15.anInt2970;
				if (local41 == 1) {
					if (Static378.method5293() < Static237.aLong131) {
						throw new IOException();
					}
					local15.anObject5 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt2968);
				} else if (local41 == 2) {
					@Pc(77) Thread local77 = new Thread((Runnable) local15.anObject4);
					local77.setDaemon(true);
					local77.start();
					local77.setPriority(local15.anInt2968);
					local15.anObject5 = local77;
				} else if (local41 == 4) {
					if (Static378.method5293() < Static237.aLong131) {
						throw new IOException();
					}
					local15.anObject5 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(139) Object[] local139;
					if (local41 == 8) {
						local139 = (Object[]) local15.anObject4;
						local15.anObject5 = ((Class) local139[0]).getDeclaredMethod((String) local139[1], (Class[]) local139[2]);
					} else if (local41 == 9) {
						local139 = (Object[]) local15.anObject4;
						local15.anObject5 = ((Class) local139[0]).getDeclaredField((String) local139[1]);
					} else if (local41 == 18) {
						@Pc(129) Clipboard local129 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject5 = local129.getContents(null);
					} else if (local41 == 19) {
						@Pc(113) Transferable local113 = (Transferable) local15.anObject4;
						@Pc(116) Clipboard local116 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local116.setContents(local113, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2969 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt2969 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!iu;")
	public Class112 method3286(@OriginalArg(1) Frame arg0) {
		return this.method3287(arg0, 7, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!iu;")
	private Class112 method3287(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class112 local3 = new Class112();
		local3.anInt2970 = arg1;
		local3.anInt2968 = arg3;
		local3.anObject4 = arg0;
		synchronized (this) {
			if (this.aClass112_7 == null) {
				this.aClass112_7 = this.aClass112_8 = local3;
			} else {
				this.aClass112_7.aClass112_4 = local3;
				this.aClass112_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lclient!iu;")
	private Class112 method3288(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		return arg2 > -3 ? null : this.method3287(arg0, 15, 0, arg1 ? 1 : 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILjava/lang/String;)Lclient!iu;")
	public Class112 method3289(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method3287(arg1, 1, 0, arg0);
	}
}
