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

@OriginalClass("client!nf")
public final class Class117 implements Runnable {

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "[Lclient!oe;")
	public Class126[] aClass126Array1;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Lclient!hd;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!oe;")
	public Class126 aClass126_1 = null;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Lclient!oe;")
	public Class126 aClass126_2 = null;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "Lclient!oe;")
	public Class126 aClass126_3 = null;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "Lclient!aj;")
	private Class10 aClass10_8 = null;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!aj;")
	private Class10 aClass10_9 = null;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class117(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static181.aString118 = "Unknown";
		Static181.aString116 = "1.1";
		try {
			Static181.aString118 = System.getProperty("java.vendor");
			Static181.aString116 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static181.aString122 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static181.aString122 = "Unknown";
		}
		Static181.aString120 = Static181.aString122.toLowerCase();
		try {
			Static181.aString119 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static181.aString119 = "";
		}
		try {
			Static181.aString121 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static181.aString121 = "";
		}
		try {
			Static181.aString117 = System.getProperty("user.home");
			if (Static181.aString117 != null) {
				Static181.aString117 = Static181.aString117 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static181.aString117 == null) {
			Static181.aString117 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(91) Throwable local91) {
		}
		try {
			if (arg0 == null) {
				Static181.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static181.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(119) Exception local119) {
		}
		try {
			if (arg0 == null) {
				Static181.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static181.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(146) Exception local146) {
		}
		this.aBoolean257 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Lclient!aj;")
	public Class10 method2988(@OriginalArg(0) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method3007(0, new Object[] { arg0, arg2, arg1 }, 0, 8);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Z")
	public boolean method2989() {
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/lang/String;)Lclient!aj;")
	public Class10 method2990(@OriginalArg(1) String arg0) {
		return this.method3007(0, arg0, 0, 16);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public void method2991() {
		synchronized (this) {
			this.aBoolean257 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass126_2 != null) {
			try {
				this.aClass126_2.method3181();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass126_1 != null) {
			try {
				this.aClass126_1.method3181();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass126Array1 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.aClass126Array1.length; local56++) {
				if (this.aClass126Array1[local56] != null) {
					try {
						this.aClass126Array1[local56].method3181();
					} catch (@Pc(76) IOException local76) {
					}
				}
			}
		}
		if (this.aClass126_3 != null) {
			try {
				this.aClass126_3.method3181();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!aj;")
	public Class10 method2992(@OriginalArg(1) Class arg0) {
		return this.method3007(0, arg0, 0, 10);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Lclient!aj;")
	public Class10 method2993() {
		return this.method3007(0, null, 0, 5);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	public void method2995() {
		Static181.aLong143 = Static135.method2186() + 5000L;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!aj;")
	public Class10 method2996(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method3007(0, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!aj;")
	public Class10 method2998(@OriginalArg(0) Frame arg0) {
		return this.method3007(0, arg0, 0, 7);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Lclient!hd;")
	public Interface3 method2999() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!nf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class10 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean257) {
						return;
					}
					if (this.aClass10_9 != null) {
						local17 = this.aClass10_9;
						this.aClass10_9 = this.aClass10_9.aClass10_2;
						if (this.aClass10_9 == null) {
							this.aClass10_8 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local17.anInt150;
				if (local46 == 1) {
					if (Static181.aLong143 > Static135.method2186()) {
						throw new IOException();
					}
					local17.anObject1 = new Socket(InetAddress.getByName((String) local17.anObject2), local17.anInt152);
				} else if (local46 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local17.anObject2);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local17.anInt152);
					local17.anObject1 = local59;
				} else if (local46 == 4) {
					if (Static135.method2186() < Static181.aLong143) {
						throw new IOException();
					}
					local17.anObject1 = new DataInputStream(((URL) local17.anObject2).openStream());
				} else {
					@Pc(88) Object[] local88;
					if (local46 == 8) {
						local88 = (Object[]) local17.anObject2;
						local17.anObject1 = ((Class) local88[0]).getDeclaredMethod((String) local88[1], (Class[]) local88[2]);
					} else if (local46 == 9) {
						local88 = (Object[]) local17.anObject2;
						local17.anObject1 = ((Class) local88[0]).getDeclaredField((String) local88[1]);
					} else if (local46 == 18) {
						@Pc(106) Clipboard local106 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject1 = local106.getContents(null);
					} else if (local46 == 19) {
						@Pc(123) Transferable local123 = (Transferable) local17.anObject2;
						@Pc(126) Clipboard local126 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local126.setContents(local123, null);
					} else {
						throw new Exception();
					}
				}
				local17.anInt151 = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local17.anInt151 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!aj;")
	public Class10 method3000(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3007(0, arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)Lclient!aj;")
	public Class10 method3001(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3007(arg1 << 16, null, (arg2 << 16) + arg0, 6);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/net/URL;)Lclient!aj;")
	public Class10 method3002(@OriginalArg(1) URL arg0) {
		return this.method3007(0, arg0, 0, 4);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Point;[IILjava/awt/Component;II)Lclient!aj;")
	public Class10 method3003(@OriginalArg(0) Point arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4) {
		return this.method3007(arg4, new Object[] { arg3, arg1, arg0 }, arg2, 17);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!aj;")
	public Class10 method3004(@OriginalArg(0) Class arg0) {
		return this.method3007(0, arg0, 0, 11);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)Lclient!aj;")
	public Class10 method3006(@OriginalArg(0) int arg0) {
		return this.method3007(0, null, arg0, 3);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBLjava/lang/Object;II)Lclient!aj;")
	private Class10 method3007(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class10 local3 = new Class10();
		local3.anInt150 = arg3;
		local3.anObject2 = arg1;
		local3.anInt152 = arg2;
		synchronized (this) {
			if (this.aClass10_8 == null) {
				this.aClass10_8 = this.aClass10_9 = local3;
			} else {
				this.aClass10_8.aClass10_2 = local3;
				this.aClass10_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!aj;")
	public Class10 method3008(@OriginalArg(1) Class arg0) {
		return this.method3007(0, arg0, 0, 20);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!aj;")
	public Class10 method3009(@OriginalArg(0) String arg0) {
		return this.method3007(0, arg0, 0, 12);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!aj;")
	public Class10 method3011(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3007(0, new Object[] { arg1, arg0 }, 0, 9);
	}
}
