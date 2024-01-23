import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
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

@OriginalClass("client!vl")
public final class Class177 implements Runnable {

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Lclient!pb;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "[Lclient!mc;")
	public Class110[] aClass110Array1;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "Lclient!mc;")
	public Class110 aClass110_2 = null;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!ch;")
	private Class28 aClass28_7 = null;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Lclient!mc;")
	public Class110 aClass110_3 = null;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "Z")
	private boolean aBoolean470 = false;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Lclient!ch;")
	private Class28 aClass28_8 = null;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "Lclient!mc;")
	public Class110 aClass110_4 = null;

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class177(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static282.aString284 = "1.1";
		Static282.aString282 = "Unknown";
		try {
			Static282.aString282 = System.getProperty("java.vendor");
			Static282.aString284 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static282.aString283 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static282.aString283 = "Unknown";
		}
		Static282.aString285 = Static282.aString283.toLowerCase();
		try {
			Static282.aString280 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static282.aString280 = "";
		}
		try {
			Static282.aString281 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static282.aString281 = "";
		}
		try {
			Static282.aString279 = System.getProperty("user.home");
			if (Static282.aString279 != null) {
				Static282.aString279 = Static282.aString279 + "/";
			}
		} catch (@Pc(81) Exception local81) {
		}
		if (Static282.aString279 == null) {
			Static282.aString279 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(91) Throwable local91) {
		}
		try {
			if (arg0 == null) {
				Static282.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static282.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(119) Exception local119) {
		}
		try {
			if (arg0 == null) {
				Static282.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static282.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(146) Exception local146) {
		}
		this.aBoolean470 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([IILjava/awt/Component;ILjava/awt/Point;I)Lclient!ch;")
	public Class28 method4668(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4) {
		return this.method4673(new Object[] { arg2, arg0, arg4 }, 17, arg1, arg3);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!ch;")
	public Class28 method4669(@OriginalArg(1) Class arg0) {
		return this.method4673(arg0, 10, 0, 0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!ch;")
	public Class28 method4670(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method4673(new Object[] { arg0, arg1 }, 9, 0, 0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public void method4671() {
		Static282.aLong300 = Static6.method126() + 5000L;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)Lclient!ch;")
	public Class28 method4672(@OriginalArg(0) int arg0) {
		return this.method4673(null, 3, 0, arg0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Lclient!ch;")
	private Class28 method4673(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class28 local3 = new Class28();
		local3.anObject1 = arg0;
		local3.anInt727 = arg1;
		local3.anInt725 = arg3;
		synchronized (this) {
			if (this.aClass28_8 == null) {
				this.aClass28_8 = this.aClass28_7 = local3;
			} else {
				this.aClass28_8.aClass28_2 = local3;
				this.aClass28_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Lclient!ch;")
	public Class28 method4674(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method4673(new Object[] { arg0, arg1, arg2 }, 8, 0, 0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ch;")
	public Class28 method4675(@OriginalArg(1) URL arg0) {
		return this.method4673(arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Lclient!ch;")
	public Class28 method4677() {
		return this.method4673(null, 5, 0, 0);
	}

	@OriginalMember(owner = "client!vl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class28 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean470) {
						return;
					}
					if (this.aClass28_7 != null) {
						local17 = this.aClass28_7;
						this.aClass28_7 = this.aClass28_7.aClass28_2;
						if (this.aClass28_7 == null) {
							this.aClass28_8 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local17.anInt727;
				if (local47 == 1) {
					if (Static282.aLong300 > Static6.method126()) {
						throw new IOException();
					}
					local17.anObject2 = new Socket(InetAddress.getByName((String) local17.anObject1), local17.anInt725);
				} else if (local47 == 2) {
					@Pc(82) Thread local82 = new Thread((Runnable) local17.anObject1);
					local82.setDaemon(true);
					local82.start();
					local82.setPriority(local17.anInt725);
					local17.anObject2 = local82;
				} else if (local47 == 4) {
					if (Static6.method126() < Static282.aLong300) {
						throw new IOException();
					}
					local17.anObject2 = new DataInputStream(((URL) local17.anObject1).openStream());
				} else {
					@Pc(109) Object[] local109;
					if (local47 == 8) {
						local109 = (Object[]) local17.anObject1;
						local17.anObject2 = ((Class) local109[0]).getDeclaredMethod((String) local109[1], (Class[]) local109[2]);
					} else if (local47 == 9) {
						local109 = (Object[]) local17.anObject1;
						local17.anObject2 = ((Class) local109[0]).getDeclaredField((String) local109[1]);
					} else {
						throw new Exception();
					}
				}
				local17.anInt726 = 1;
			} catch (@Pc(174) ThreadDeath local174) {
				throw local174;
			} catch (@Pc(177) Throwable local177) {
				local17.anInt726 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!ch;")
	public Class28 method4678(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4673(arg0, 2, 0, arg1);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!ch;")
	public Class28 method4679(@OriginalArg(0) String arg0) {
		return this.method4673(arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Lclient!pb;")
	public Interface4 method4680() {
		return this.anInterface4_2;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!ch;")
	public Class28 method4681(@OriginalArg(1) Class arg0) {
		return this.method4673(arg0, 11, 0, 0);
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)Z")
	public boolean method4682() {
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)Lclient!ch;")
	public Class28 method4683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method4673(null, 6, arg2 << 16, arg0 + (arg1 << 16));
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!ch;")
	public Class28 method4684(@OriginalArg(0) Frame arg0) {
		return this.method4673(arg0, 7, 0, 0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ch;")
	public Class28 method4685(@OriginalArg(0) String arg0) {
		return this.method4673(arg0, 12, 0, 0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILjava/lang/String;)Lclient!ch;")
	public Class28 method4686(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method4673(arg1, 1, 0, arg0);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public void method4687() {
		synchronized (this) {
			this.aBoolean470 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass110_4 != null) {
			try {
				this.aClass110_4.method2681();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass110_3 != null) {
			try {
				this.aClass110_3.method2681();
			} catch (@Pc(52) IOException local52) {
			}
		}
		if (this.aClass110Array1 != null) {
			for (@Pc(59) int local59 = 0; local59 < this.aClass110Array1.length; local59++) {
				if (this.aClass110Array1[local59] != null) {
					try {
						this.aClass110Array1[local59].method2681();
					} catch (@Pc(82) IOException local82) {
					}
				}
			}
		}
		if (this.aClass110_2 != null) {
			try {
				this.aClass110_2.method2681();
			} catch (@Pc(94) IOException local94) {
			}
		}
	}
}
