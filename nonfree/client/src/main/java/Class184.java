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

@OriginalClass("client!we")
public final class Class184 implements Runnable {

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!v;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "[Lclient!hm;")
	public Class68[] aClass68Array1;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!hm;")
	public Class68 aClass68_2 = null;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!hm;")
	public Class68 aClass68_3 = null;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!nn;")
	private Class119 aClass119_10 = null;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!nn;")
	private Class119 aClass119_9 = null;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Z")
	private boolean aBoolean394 = false;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Lclient!hm;")
	public Class68 aClass68_4 = null;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class184(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static300.aString197 = "Unknown";
		Static300.aString193 = "1.1";
		this.anApplet1 = arg0;
		try {
			Static300.aString197 = System.getProperty("java.vendor");
			Static300.aString193 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static300.aString194 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static300.aString194 = "Unknown";
		}
		Static300.aString195 = Static300.aString194.toLowerCase();
		try {
			Static300.aString192 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static300.aString192 = "";
		}
		try {
			Static300.aString198 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static300.aString198 = "";
		}
		try {
			Static300.aString196 = System.getProperty("user.home");
			if (Static300.aString196 != null) {
				Static300.aString196 = Static300.aString196 + "/";
			}
		} catch (@Pc(81) Exception local81) {
		}
		if (Static300.aString196 == null) {
			Static300.aString196 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(92) Throwable local92) {
		}
		try {
			if (arg0 == null) {
				Static300.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static300.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(119) Exception local119) {
		}
		try {
			if (arg0 == null) {
				Static300.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static300.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(147) Exception local147) {
		}
		this.aBoolean394 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class119 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean394) {
						return;
					}
					if (this.aClass119_10 != null) {
						local17 = this.aClass119_10;
						this.aClass119_10 = this.aClass119_10.aClass119_6;
						if (this.aClass119_10 == null) {
							this.aClass119_9 = null;
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
				@Pc(45) int local45 = local17.anInt3697;
				if (local45 == 1) {
					if (Static300.aLong207 > Static61.method1150()) {
						throw new IOException();
					}
					local17.anObject4 = new Socket(InetAddress.getByName((String) local17.anObject3), local17.anInt3696);
				} else if (local45 == 2) {
					@Pc(170) Thread local170 = new Thread((Runnable) local17.anObject3);
					local170.setDaemon(true);
					local170.start();
					local170.setPriority(local17.anInt3696);
					local17.anObject4 = local170;
				} else if (local45 == 4) {
					if (Static61.method1150() < Static300.aLong207) {
						throw new IOException();
					}
					local17.anObject4 = new DataInputStream(((URL) local17.anObject3).openStream());
				} else {
					@Pc(66) Object[] local66;
					if (local45 == 8) {
						local66 = (Object[]) local17.anObject3;
						local17.anObject4 = ((Class) local66[0]).getDeclaredMethod((String) local66[1], (Class[]) local66[2]);
					} else if (local45 == 9) {
						local66 = (Object[]) local17.anObject3;
						local17.anObject4 = ((Class) local66[0]).getDeclaredField((String) local66[1]);
					} else if (local45 == 18) {
						@Pc(134) Clipboard local134 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject4 = local134.getContents(null);
					} else if (local45 == 19) {
						@Pc(123) Transferable local123 = (Transferable) local17.anObject3;
						@Pc(126) Clipboard local126 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local126.setContents(local123, null);
					} else {
						throw new Exception();
					}
				}
				local17.anInt3695 = 1;
			} catch (@Pc(212) ThreadDeath local212) {
				throw local212;
			} catch (@Pc(215) Throwable local215) {
				local17.anInt3695 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!nn;")
	public Class119 method4601(@OriginalArg(0) Class arg0) {
		return this.method4614(10, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[ILjava/awt/Point;ILjava/awt/Component;Z)Lclient!nn;")
	public Class119 method4602(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4) {
		return this.method4614(17, new Object[] { arg4, arg1, arg2 }, arg0, arg3);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Z")
	public boolean method4603() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;B)Lclient!nn;")
	public Class119 method4604(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2) {
		return this.method4614(8, new Object[] { arg0, arg1, arg2 }, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!nn;")
	public Class119 method4605(@OriginalArg(0) String arg0) {
		return this.method4614(12, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Lclient!nn;")
	public Class119 method4606() {
		return this.method4614(5, null, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lclient!nn;")
	public Class119 method4607(@OriginalArg(1) int arg0) {
		return this.method4614(3, null, 0, arg0);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Lclient!v;")
	public Interface5 method4608() {
		return this.anInterface5_2;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/net/URL;)Lclient!nn;")
	public Class119 method4609(@OriginalArg(1) URL arg0) {
		return this.method4614(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!nn;")
	public Class119 method4610(@OriginalArg(0) Class arg0) {
		return this.method4614(11, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!nn;")
	public Class119 method4611(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method4614(1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public void method4612() {
		Static300.aLong207 = Static61.method1150() + 5000L;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!nn;")
	public Class119 method4613(@OriginalArg(1) String arg0) {
		return this.method4614(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!nn;")
	private Class119 method4614(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class119 local3 = new Class119();
		local3.anObject3 = arg1;
		local3.anInt3697 = arg0;
		local3.anInt3696 = arg3;
		synchronized (this) {
			if (this.aClass119_9 == null) {
				this.aClass119_9 = this.aClass119_10 = local3;
			} else {
				this.aClass119_9.aClass119_6 = local3;
				this.aClass119_9 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!nn;")
	public Class119 method4617(@OriginalArg(0) Frame arg0) {
		return this.method4614(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!nn;")
	public Class119 method4618(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method4614(9, new Object[] { arg1, arg0 }, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(Ljava/lang/Class;I)Lclient!nn;")
	public Class119 method4619(@OriginalArg(0) Class arg0) {
		return this.method4614(20, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	public void method4620() {
		synchronized (this) {
			this.aBoolean394 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass68_2 != null) {
			try {
				this.aClass68_2.method1824();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass68_4 != null) {
			try {
				this.aClass68_4.method1824();
			} catch (@Pc(50) IOException local50) {
			}
		}
		if (this.aClass68Array1 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.aClass68Array1.length; local56++) {
				if (this.aClass68Array1[local56] != null) {
					try {
						this.aClass68Array1[local56].method1824();
					} catch (@Pc(79) IOException local79) {
					}
				}
			}
		}
		if (this.aClass68_3 != null) {
			try {
				this.aClass68_3.method1824();
			} catch (@Pc(91) IOException local91) {
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lclient!nn;")
	public Class119 method4621(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4614(2, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIZ)Lclient!nn;")
	public Class119 method4622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method4614(6, null, arg1 << 16, (arg0 << 16) - -arg2);
	}
}
