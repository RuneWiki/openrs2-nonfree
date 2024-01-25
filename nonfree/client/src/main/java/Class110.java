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

@OriginalClass("client!kq")
public final class Class110 implements Runnable {

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "[Lclient!jc;")
	public Class99[] aClass99Array1;

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "Lclient!uh;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "Lclient!jc;")
	public Class99 aClass99_3 = null;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Z")
	private boolean aBoolean302 = false;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "Lclient!mq;")
	private Class134 aClass134_3 = null;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!jc;")
	public Class99 aClass99_2 = null;

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "Lclient!mq;")
	private Class134 aClass134_4 = null;

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "Lclient!jc;")
	public Class99 aClass99_4 = null;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class110(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static168.aString142 = "1.1";
		this.anApplet1 = arg0;
		Static168.aString145 = "Unknown";
		try {
			Static168.aString145 = System.getProperty("java.vendor");
			Static168.aString142 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static168.aString143 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static168.aString143 = "Unknown";
		}
		Static168.aString140 = Static168.aString143.toLowerCase();
		try {
			Static168.aString144 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static168.aString144 = "";
		}
		try {
			Static168.aString139 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static168.aString139 = "";
		}
		try {
			Static168.aString141 = System.getProperty("user.home");
			if (Static168.aString141 != null) {
				Static168.aString141 = Static168.aString141 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static168.aString141 == null) {
			Static168.aString141 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static168.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static168.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static168.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static168.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean302 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lclient!mq;")
	public Class134 method3354(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method3361(new Object[] { arg0, arg2, arg1 }, 0, 0, 8);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Lclient!uh;")
	public Interface9 method3355() {
		return this.anInterface9_1;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)Lclient!mq;")
	public Class134 method3356() {
		return this.method3361(null, 0, 0, 13);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!mq;")
	public Class134 method3357(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method3361(arg0, arg1, 0, 1);
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)Lclient!mq;")
	public Class134 method3358() {
		return this.method3361(null, 0, 0, 12);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!mq;")
	public Class134 method3359(@OriginalArg(0) URL arg0) {
		return this.method3361(arg0, 0, 0, 4);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!mq;")
	public Class134 method3360(@OriginalArg(0) String arg0) {
		return this.method3361(arg0, 0, 0, 16);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLjava/lang/Object;III)Lclient!mq;")
	private Class134 method3361(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class134 local3 = new Class134();
		local3.anInt4034 = arg1;
		local3.anObject5 = arg0;
		local3.anInt4035 = arg3;
		synchronized (this) {
			if (this.aClass134_4 == null) {
				this.aClass134_4 = this.aClass134_3 = local3;
			} else {
				this.aClass134_4.aClass134_5 = local3;
				this.aClass134_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!mq;")
	private Class134 method3362(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 >= -100 ? null : this.method3361(arg1, 0, 0, 19);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)Z")
	public boolean method3363() {
		return false;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZI)Lclient!mq;")
	public Class134 method3364(@OriginalArg(1) int arg0) {
		return this.method3361(null, arg0, 0, 3);
	}

	@OriginalMember(owner = "client!kq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class134 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean302) {
						return;
					}
					if (this.aClass134_3 != null) {
						local15 = this.aClass134_3;
						this.aClass134_3 = this.aClass134_3.aClass134_5;
						if (this.aClass134_3 == null) {
							this.aClass134_4 = null;
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
				@Pc(41) int local41 = local15.anInt4035;
				if (local41 == 1) {
					if (Static349.method5647() < Static168.aLong122) {
						throw new IOException();
					}
					local15.anObject6 = new Socket(InetAddress.getByName((String) local15.anObject5), local15.anInt4034);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject5);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt4034);
					local15.anObject6 = local56;
				} else if (local41 == 4) {
					if (Static349.method5647() < Static168.aLong122) {
						throw new IOException();
					}
					local15.anObject6 = new DataInputStream(((URL) local15.anObject5).openStream());
				} else {
					@Pc(104) Object[] local104;
					if (local41 == 8) {
						local104 = (Object[]) local15.anObject5;
						local15.anObject6 = ((Class) local104[0]).getDeclaredMethod((String) local104[1], (Class[]) local104[2]);
					} else if (local41 == 9) {
						local104 = (Object[]) local15.anObject5;
						local15.anObject6 = ((Class) local104[0]).getDeclaredField((String) local104[1]);
					} else if (local41 == 18) {
						@Pc(131) Clipboard local131 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject6 = local131.getContents(null);
					} else if (local41 == 19) {
						@Pc(151) Transferable local151 = (Transferable) local15.anObject5;
						@Pc(154) Clipboard local154 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local154.setContents(local151, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt4033 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt4033 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)Lclient!mq;")
	private Class134 method3365(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.method3361(null, 0, 0, 18) : null;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!mq;")
	public Class134 method3366(@OriginalArg(1) Frame arg0) {
		return this.method3361(arg0, 0, 0, 7);
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)Lclient!mq;")
	public Class134 method3367() {
		return this.method3361(null, 0, 0, 5);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!mq;")
	public Class134 method3368(@OriginalArg(0) Class arg0) {
		return this.method3361(arg0, 0, 0, 11);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BZLjava/awt/Component;)Lclient!mq;")
	private Class134 method3369(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		return arg0 > -96 ? null : this.method3361(arg2, arg1 ? 1 : 0, 0, 15);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBIII)Lclient!mq;")
	public Class134 method3370(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3361(null, arg0 + (arg1 << 16), arg2 << 16, 6);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!mq;")
	private Class134 method3371(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 <= 120 ? null : this.method3361(arg0, 0, 0, 21);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!mq;")
	private Class134 method3372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class134 local3 = new Class134();
		synchronized (local3) {
			local3.anInt4034 = arg1;
			local3.anObject5 = arg3;
			local3.anInt4035 = arg0;
			synchronized (this) {
				if (this.aClass134_4 == null) {
					this.aClass134_4 = this.aClass134_3 = local3;
				} else {
					this.aClass134_4.aClass134_5 = local3;
					this.aClass134_4 = local3;
				}
				this.notify();
			}
			try {
				if (arg2 != 1) {
					this.method3360(null);
				}
				local3.wait();
			} catch (@Pc(57) InterruptedException local57) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method3373(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -6552) {
			this.method3369((byte) -92, true, null);
		}
		@Pc(18) Class134 local18 = this.method3372(21, 0, arg0 + 6553, arg1);
		return (byte[]) local18.anObject6;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIBLjava/awt/Component;)Lclient!mq;")
	private Class134 method3374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Component arg3) {
		if (arg2 < 7) {
			Static168.aString142 = null;
		}
		@Pc(7) Point local7 = arg3.getLocationOnScreen();
		return this.method3361(null, arg1 + local7.x, arg0 + local7.y, 14);
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)V")
	public void method3375() {
		Static168.aLong122 = Static349.method5647() + 5000L;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!mq;")
	public Class134 method3376(@OriginalArg(1) Class arg0) {
		return this.method3361(arg0, 0, 0, 10);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!mq;")
	public Class134 method3377(@OriginalArg(1) Class arg0) {
		return this.method3361(arg0, 0, 0, 20);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILjava/awt/Point;Ljava/awt/Component;I[I)Lclient!mq;")
	public Class134 method3378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) Component arg3, @OriginalArg(5) int[] arg4) {
		return this.method3361(new Object[] { arg3, arg4, arg2 }, arg0, arg1, 17);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!mq;")
	public Class134 method3379(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3361(arg1, arg0, 0, 2);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
	public void method3380() {
		synchronized (this) {
			this.aBoolean302 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass99_2 != null) {
			try {
				this.aClass99_2.method2725();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass99_3 != null) {
			try {
				this.aClass99_3.method2725();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass99Array1 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aClass99Array1.length; local51++) {
				if (this.aClass99Array1[local51] != null) {
					try {
						this.aClass99Array1[local51].method2725();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass99_4 != null) {
			try {
				this.aClass99_4.method2725();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lclient!mq;")
	public Class134 method3381(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method3361(new Object[] { arg0, arg1 }, 0, 0, 9);
	}
}
