import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
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

@OriginalClass("client!d")
public final class Class28 implements Runnable {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!tc;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "[Lclient!ub;")
	public Class129[] aClass129Array1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Lclient!vj;")
	private Class145 aClass145_2 = null;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!ub;")
	public Class129 aClass129_2 = null;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!vj;")
	private Class145 aClass145_3 = null;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!ub;")
	public Class129 aClass129_4 = null;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!ub;")
	public Class129 aClass129_3 = null;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class28(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static40.aString55 = "Unknown";
		this.anApplet1 = arg0;
		Static40.aString57 = "1.1";
		try {
			Static40.aString55 = System.getProperty("java.vendor");
			Static40.aString57 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static40.aString54 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static40.aString54 = "Unknown";
		}
		Static40.aString58 = Static40.aString54.toLowerCase();
		try {
			Static40.aString56 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static40.aString56 = "";
		}
		try {
			Static40.aString59 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static40.aString59 = "";
		}
		try {
			Static40.aString53 = System.getProperty("user.home");
			if (Static40.aString53 != null) {
				Static40.aString53 = Static40.aString53 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static40.aString53 == null) {
			Static40.aString53 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static40.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static40.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static40.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static40.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean61 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!vj;")
	public Class145 method715(@OriginalArg(1) int arg0) {
		return this.method724(null, arg0, 0, 3);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!vj;")
	public Class145 method716(@OriginalArg(0) String arg0) {
		return this.method724(arg0, 0, 0, 12);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Lclient!vj;")
	public Class145 method717(@OriginalArg(0) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method724(new Object[] { arg0, arg2, arg1 }, 0, 0, 8);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZLjava/lang/String;)Lclient!vj;")
	public Class145 method718(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method724(arg1, arg0, 0, 1);
	}

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class145 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean61) {
						return;
					}
					if (this.aClass145_3 != null) {
						local15 = this.aClass145_3;
						this.aClass145_3 = this.aClass145_3.aClass145_8;
						if (this.aClass145_3 == null) {
							this.aClass145_2 = null;
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
				@Pc(41) int local41 = local15.anInt5355;
				if (local41 == 1) {
					if (Static31.method591() < Static40.aLong31) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt5356);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject6);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt5356);
					local15.anObject7 = local56;
				} else if (local41 == 4) {
					if (Static40.aLong31 > Static31.method591()) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(107) Object[] local107;
					if (local41 == 8) {
						local107 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local107[0]).getDeclaredMethod((String) local107[1], (Class[]) local107[2]);
					} else if (local41 == 9) {
						local107 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local107[0]).getDeclaredField((String) local107[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt5354 = 1;
			} catch (@Pc(168) ThreadDeath local168) {
				throw local168;
			} catch (@Pc(171) Throwable local171) {
				local15.anInt5354 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!vj;")
	public Class145 method719(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method724(arg0, arg1, 0, 2);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!vj;")
	public Class145 method720(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method724(new Object[] { arg0, arg1 }, 0, 0, 9);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!vj;")
	public Class145 method721(@OriginalArg(0) String arg0) {
		return this.method724(arg0, 0, 0, 16);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public void method722() {
		synchronized (this) {
			this.aBoolean61 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass129_4 != null) {
			try {
				this.aClass129_4.method3875();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass129_2 != null) {
			try {
				this.aClass129_2.method3875();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass129Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass129Array1.length; local52++) {
				if (this.aClass129Array1[local52] != null) {
					try {
						this.aClass129Array1[local52].method3875();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass129_3 != null) {
			try {
				this.aClass129_3.method3875();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLjava/net/URL;)Lclient!vj;")
	public Class145 method723(@OriginalArg(1) URL arg0) {
		return this.method724(arg0, 0, 0, 4);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!vj;")
	private Class145 method724(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class145 local3 = new Class145();
		local3.anInt5356 = arg1;
		local3.anInt5355 = arg3;
		local3.anObject6 = arg0;
		synchronized (this) {
			if (this.aClass145_2 == null) {
				this.aClass145_2 = this.aClass145_3 = local3;
			} else {
				this.aClass145_2.aClass145_8 = local3;
				this.aClass145_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/awt/Component;ILjava/awt/Point;[II)Lclient!vj;")
	public Class145 method725(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		return this.method724(new Object[] { arg0, arg3, arg2 }, arg1, arg4, 17);
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public void method726() {
		Static40.aLong31 = Static31.method591() + 5000L;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)Lclient!tc;")
	public Interface3 method727() {
		return this.anInterface3_1;
	}
}
