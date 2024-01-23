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

@OriginalClass("client!tk")
public final class Class164 implements Runnable {

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "Lclient!nl;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "[Lclient!fk;")
	public Class50[] aClass50Array1;

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "Lclient!oh;")
	private Class123 aClass123_7 = null;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "Lclient!fk;")
	public Class50 aClass50_3 = null;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "Lclient!fk;")
	public Class50 aClass50_2 = null;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "Lclient!oh;")
	private Class123 aClass123_8 = null;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Lclient!fk;")
	public Class50 aClass50_4 = null;

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class164(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static260.aString171 = "1.1";
		Static260.aString175 = "Unknown";
		this.anApplet1 = arg0;
		try {
			Static260.aString175 = System.getProperty("java.vendor");
			Static260.aString171 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static260.aString174 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static260.aString174 = "Unknown";
		}
		Static260.aString172 = Static260.aString174.toLowerCase();
		try {
			Static260.aString177 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static260.aString177 = "";
		}
		try {
			Static260.aString176 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static260.aString176 = "";
		}
		try {
			Static260.aString173 = System.getProperty("user.home");
			if (Static260.aString173 != null) {
				Static260.aString173 = Static260.aString173 + "/";
			}
		} catch (@Pc(80) Exception local80) {
		}
		if (Static260.aString173 == null) {
			Static260.aString173 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(91) Throwable local91) {
		}
		try {
			if (arg0 == null) {
				Static260.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static260.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(118) Exception local118) {
		}
		try {
			if (arg0 == null) {
				Static260.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static260.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(145) Exception local145) {
		}
		this.aBoolean322 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/String;)Lclient!oh;")
	public Class123 method3932(@OriginalArg(1) String arg0) {
		return this.method3934(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)Lclient!oh;")
	public Class123 method3933() {
		return this.method3934(5, 0, 0, null);
	}

	@OriginalMember(owner = "client!tk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class123 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean322) {
						return;
					}
					if (this.aClass123_7 != null) {
						local16 = this.aClass123_7;
						this.aClass123_7 = this.aClass123_7.aClass123_4;
						if (this.aClass123_7 == null) {
							this.aClass123_8 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt3792;
				if (local45 == 1) {
					if (Static260.aLong176 > Static133.method2163()) {
						throw new IOException();
					}
					local16.anObject4 = new Socket(InetAddress.getByName((String) local16.anObject5), local16.anInt3793);
				} else if (local45 == 2) {
					@Pc(83) Thread local83 = new Thread((Runnable) local16.anObject5);
					local83.setDaemon(true);
					local83.start();
					local83.setPriority(local16.anInt3793);
					local16.anObject4 = local83;
				} else if (local45 == 4) {
					if (Static133.method2163() < Static260.aLong176) {
						throw new IOException();
					}
					local16.anObject4 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(118) Object[] local118;
					if (local45 == 8) {
						local118 = (Object[]) local16.anObject5;
						local16.anObject4 = ((Class) local118[0]).getDeclaredMethod((String) local118[1], (Class[]) local118[2]);
					} else if (local45 == 9) {
						local118 = (Object[]) local16.anObject5;
						local16.anObject4 = ((Class) local118[0]).getDeclaredField((String) local118[1]);
					} else {
						throw new Exception();
					}
				}
				local16.anInt3791 = 1;
			} catch (@Pc(179) ThreadDeath local179) {
				throw local179;
			} catch (@Pc(182) Throwable local182) {
				local16.anInt3791 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBIILjava/lang/Object;)Lclient!oh;")
	private Class123 method3934(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class123 local3 = new Class123();
		local3.anInt3792 = arg0;
		local3.anObject5 = arg3;
		local3.anInt3793 = arg2;
		synchronized (this) {
			if (this.aClass123_8 == null) {
				this.aClass123_8 = this.aClass123_7 = local3;
			} else {
				this.aClass123_8.aClass123_4 = local3;
				this.aClass123_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)Lclient!oh;")
	public Class123 method3935(@OriginalArg(0) int arg0) {
		return this.method3934(3, 0, arg0, null);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!oh;")
	public Class123 method3936(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method3934(8, 0, 0, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Lclient!nl;")
	public Interface4 method3938() {
		return this.anInterface4_2;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V")
	public void method3939() {
		Static260.aLong176 = Static133.method2163() + 5000L;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z")
	public boolean method3940() {
		return false;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!oh;")
	public Class123 method3941(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method3934(1, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	public void method3943() {
		synchronized (this) {
			this.aBoolean322 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass50_4 != null) {
			try {
				this.aClass50_4.method1254();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass50_3 != null) {
			try {
				this.aClass50_3.method1254();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass50Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass50Array1.length; local54++) {
				if (this.aClass50Array1[local54] != null) {
					try {
						this.aClass50Array1[local54].method1254();
					} catch (@Pc(74) IOException local74) {
					}
				}
			}
		}
		if (this.aClass50_2 != null) {
			try {
				this.aClass50_2.method1254();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!oh;")
	private Class123 method3944(@OriginalArg(0) Frame arg0) {
		return this.method3934(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)Lclient!oh;")
	public Class123 method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method3934(6, arg2 << 16, arg1 + (arg0 << 16), null);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!oh;")
	public Class123 method3946(@OriginalArg(1) Class arg0) {
		return this.method3934(10, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(ILjava/lang/String;)Lclient!oh;")
	public Class123 method3947(@OriginalArg(1) String arg0) {
		return this.method3934(12, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!oh;")
	public Class123 method3948(@OriginalArg(0) URL arg0) {
		return this.method3934(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!oh;")
	public Class123 method3949(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method3934(9, 0, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;[IIII)Lclient!oh;")
	public Class123 method3950(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method3934(17, arg3, arg4, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!oh;")
	private Class123 method3951(@OriginalArg(0) Class arg0) {
		return this.method3934(11, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lclient!oh;")
	public Class123 method3952(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3934(2, 0, arg0, arg1);
	}
}
