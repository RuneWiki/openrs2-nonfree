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

@OriginalClass("client!jh")
public final class Class84 implements Runnable {

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "[Lclient!n;")
	public Class115[] aClass115Array1;

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "Lclient!dk;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Lclient!nc;")
	private Class118 aClass118_5 = null;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Lclient!nc;")
	private Class118 aClass118_6 = null;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Lclient!n;")
	public Class115 aClass115_2 = null;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!n;")
	public Class115 aClass115_3 = null;

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "Lclient!n;")
	public Class115 aClass115_4 = null;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class84(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static127.aString84 = "Unknown";
		this.anApplet1 = arg0;
		Static127.aString78 = "1.1";
		try {
			Static127.aString84 = System.getProperty("java.vendor");
			Static127.aString78 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static127.aString80 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static127.aString80 = "Unknown";
		}
		Static127.aString79 = Static127.aString80.toLowerCase();
		try {
			Static127.aString83 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static127.aString83 = "";
		}
		try {
			Static127.aString82 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static127.aString82 = "";
		}
		try {
			Static127.aString81 = System.getProperty("user.home");
			if (Static127.aString81 != null) {
				Static127.aString81 = Static127.aString81 + "/";
			}
		} catch (@Pc(81) Exception local81) {
		}
		if (Static127.aString81 == null) {
			Static127.aString81 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(93) Throwable local93) {
		}
		try {
			if (arg0 == null) {
				Static127.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static127.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(121) Exception local121) {
		}
		try {
			if (arg0 == null) {
				Static127.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static127.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(148) Exception local148) {
		}
		this.aBoolean172 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!nc;")
	public Class118 method1950(@OriginalArg(0) String arg0) {
		return this.method1960(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	public void method1951() {
		synchronized (this) {
			this.aBoolean172 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass115_3 != null) {
			try {
				this.aClass115_3.method2608();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass115_4 != null) {
			try {
				this.aClass115_4.method2608();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass115Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass115Array1.length; local47++) {
				if (this.aClass115Array1[local47] != null) {
					try {
						this.aClass115Array1[local47].method2608();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass115_2 != null) {
			try {
				this.aClass115_2.method2608();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!nc;")
	public Class118 method1952(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method1960(9, new Object[] { arg0, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lclient!nc;")
	public Class118 method1953(@OriginalArg(0) int arg0) {
		return this.method1960(3, null, arg0, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!nc;")
	public Class118 method1954(@OriginalArg(0) String arg0) {
		return this.method1960(12, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!nc;")
	public Class118 method1955(@OriginalArg(1) Class arg0) {
		return this.method1960(11, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!nc;")
	public Class118 method1956(@OriginalArg(1) URL arg0) {
		return this.method1960(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public void method1957() {
		Static127.aLong86 = Static252.method3964() + 5000L;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!nc;")
	public Class118 method1958(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1960(2, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/lang/Object;IIZ)Lclient!nc;")
	private Class118 method1960(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class118 local3 = new Class118();
		local3.anObject2 = arg1;
		local3.anInt3188 = arg0;
		local3.anInt3189 = arg2;
		synchronized (this) {
			if (this.aClass118_5 == null) {
				this.aClass118_5 = this.aClass118_6 = local3;
			} else {
				this.aClass118_5.aClass118_7 = local3;
				this.aClass118_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([IIZLjava/awt/Component;ILjava/awt/Point;)Lclient!nc;")
	public Class118 method1961(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method1960(17, new Object[] { arg2, arg0, arg4 }, arg3, arg1);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Lclient!nc;")
	public Class118 method1962(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) String arg2) {
		return this.method1960(8, new Object[] { arg1, arg2, arg0 }, 0, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!nc;")
	public Class118 method1963(@OriginalArg(0) Frame arg0) {
		return this.method1960(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!nc;")
	public Class118 method1964(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method1960(1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Lclient!dk;")
	public Interface2 method1965() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!jh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class118 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean172) {
						return;
					}
					if (this.aClass118_6 != null) {
						local16 = this.aClass118_6;
						this.aClass118_6 = this.aClass118_6.aClass118_7;
						if (this.aClass118_6 == null) {
							this.aClass118_5 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local16.anInt3188;
				if (local44 == 1) {
					if (Static127.aLong86 > Static252.method3964()) {
						throw new IOException();
					}
					local16.anObject3 = new Socket(InetAddress.getByName((String) local16.anObject2), local16.anInt3189);
				} else if (local44 == 2) {
					@Pc(155) Thread local155 = new Thread((Runnable) local16.anObject2);
					local155.setDaemon(true);
					local155.start();
					local155.setPriority(local16.anInt3189);
					local16.anObject3 = local155;
				} else if (local44 == 4) {
					if (Static127.aLong86 > Static252.method3964()) {
						throw new IOException();
					}
					local16.anObject3 = new DataInputStream(((URL) local16.anObject2).openStream());
				} else {
					@Pc(94) Object[] local94;
					if (local44 == 8) {
						local94 = (Object[]) local16.anObject2;
						local16.anObject3 = ((Class) local94[0]).getDeclaredMethod((String) local94[1], (Class[]) local94[2]);
					} else if (local44 == 9) {
						local94 = (Object[]) local16.anObject2;
						local16.anObject3 = ((Class) local94[0]).getDeclaredField((String) local94[1]);
					} else {
						throw new Exception();
					}
				}
				local16.anInt3187 = 1;
			} catch (@Pc(172) ThreadDeath local172) {
				throw local172;
			} catch (@Pc(175) Throwable local175) {
				local16.anInt3187 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Z")
	public boolean method1966() {
		return false;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!nc;")
	public Class118 method1968(@OriginalArg(1) Class arg0) {
		return this.method1960(10, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIIII)Lclient!nc;")
	public Class118 method1969(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method1960(6, null, (arg0 << 16) + arg2, arg1 << 16);
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)Lclient!nc;")
	public Class118 method1970() {
		return this.method1960(5, null, 0, 0);
	}
}
