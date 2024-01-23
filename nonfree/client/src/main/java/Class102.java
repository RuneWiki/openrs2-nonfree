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

@OriginalClass("client!la")
public final class Class102 implements Runnable {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!rd;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[Lclient!mc;")
	public Class110[] aClass110Array1;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!me;")
	private Class111 aClass111_5 = null;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!me;")
	private Class111 aClass111_4 = null;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!mc;")
	public Class110 aClass110_1 = null;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!mc;")
	public Class110 aClass110_2 = null;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!mc;")
	public Class110 aClass110_3 = null;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class102(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static158.aString118 = "Unknown";
		Static158.aString119 = "1.1";
		this.anApplet1 = arg0;
		try {
			Static158.aString118 = System.getProperty("java.vendor");
			Static158.aString119 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static158.aString123 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static158.aString123 = "Unknown";
		}
		Static158.aString122 = Static158.aString123.toLowerCase();
		try {
			Static158.aString120 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static158.aString120 = "";
		}
		try {
			Static158.aString121 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static158.aString121 = "";
		}
		try {
			Static158.aString117 = System.getProperty("user.home");
			if (Static158.aString117 != null) {
				Static158.aString117 = Static158.aString117 + "/";
			}
		} catch (@Pc(80) Exception local80) {
		}
		if (Static158.aString117 == null) {
			Static158.aString117 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(91) Throwable local91) {
		}
		try {
			if (arg0 == null) {
				Static158.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static158.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(118) Exception local118) {
		}
		try {
			if (arg0 == null) {
				Static158.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static158.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(145) Exception local145) {
		}
		this.aBoolean240 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lclient!rd;")
	public Interface2 method2870() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!me;")
	public Class111 method2872(@OriginalArg(1) Class arg0) {
		return this.method2879(10, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	public void method2873() {
		Static158.aLong115 = Static221.method3670() + 5000L;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!me;")
	public Class111 method2875(@OriginalArg(1) Class arg0) {
		return this.method2879(11, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	public void method2876() {
		synchronized (this) {
			this.aBoolean240 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass110_3 != null) {
			try {
				this.aClass110_3.method3098();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass110_2 != null) {
			try {
				this.aClass110_2.method3098();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass110Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass110Array1.length; local54++) {
				if (this.aClass110Array1[local54] != null) {
					try {
						this.aClass110Array1[local54].method3098();
					} catch (@Pc(77) IOException local77) {
					}
				}
			}
		}
		if (this.aClass110_1 != null) {
			try {
				this.aClass110_1.method3098();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(I)Lclient!me;")
	public Class111 method2877() {
		return this.method2879(5, 0, null, 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lclient!me;")
	private Class111 method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class111 local11 = new Class111();
		local11.anInt3787 = arg0;
		local11.anInt3789 = arg1;
		local11.anObject5 = arg2;
		synchronized (this) {
			if (this.aClass111_4 == null) {
				this.aClass111_4 = this.aClass111_5 = local11;
			} else {
				this.aClass111_4.aClass111_7 = local11;
				this.aClass111_4 = local11;
			}
			this.notify();
			return local11;
		}
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(I)Z")
	public boolean method2880() {
		return false;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!me;")
	public Class111 method2881(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method2879(1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!me;")
	public Class111 method2882(@OriginalArg(1) int arg0) {
		return this.method2879(3, arg0, null, 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lclient!me;")
	public Class111 method2883(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return this.method2879(8, 0, new Object[] { arg2, arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(ILjava/lang/Class;)Lclient!me;")
	public Class111 method2884(@OriginalArg(1) Class arg0) {
		return this.method2879(20, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/awt/Component;[ILjava/awt/Point;II)Lclient!me;")
	public Class111 method2886(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Point arg3, @OriginalArg(5) int arg4) {
		return this.method2879(17, arg4, new Object[] { arg1, arg2, arg3 }, arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)Lclient!me;")
	public Class111 method2887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return this.method2879(6, arg1 + (arg2 << 16), null, arg0 << 16);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!me;")
	public Class111 method2888(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2879(9, 0, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!me;")
	public Class111 method2889(@OriginalArg(0) Frame arg0) {
		return this.method2879(7, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!me;")
	public Class111 method2890(@OriginalArg(0) String arg0) {
		return this.method2879(16, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!me;")
	public Class111 method2891(@OriginalArg(0) String arg0) {
		return this.method2879(12, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!la", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class111 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean240) {
						return;
					}
					if (this.aClass111_5 != null) {
						local17 = this.aClass111_5;
						this.aClass111_5 = this.aClass111_5.aClass111_7;
						if (this.aClass111_5 == null) {
							this.aClass111_4 = null;
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
				@Pc(45) int local45 = local17.anInt3787;
				if (local45 == 1) {
					if (Static221.method3670() < Static158.aLong115) {
						throw new IOException();
					}
					local17.anObject4 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt3789);
				} else if (local45 == 2) {
					@Pc(190) Thread local190 = new Thread((Runnable) local17.anObject5);
					local190.setDaemon(true);
					local190.start();
					local190.setPriority(local17.anInt3789);
					local17.anObject4 = local190;
				} else if (local45 == 4) {
					if (Static221.method3670() < Static158.aLong115) {
						throw new IOException();
					}
					local17.anObject4 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(99) Object[] local99;
					if (local45 == 8) {
						local99 = (Object[]) local17.anObject5;
						local17.anObject4 = ((Class) local99[0]).getDeclaredMethod((String) local99[1], (Class[]) local99[2]);
					} else if (local45 == 9) {
						local99 = (Object[]) local17.anObject5;
						local17.anObject4 = ((Class) local99[0]).getDeclaredField((String) local99[1]);
					} else if (local45 == 18) {
						@Pc(136) Clipboard local136 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject4 = local136.getContents(null);
					} else if (local45 == 19) {
						@Pc(121) Transferable local121 = (Transferable) local17.anObject5;
						@Pc(124) Clipboard local124 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local124.setContents(local121, null);
					} else {
						throw new Exception();
					}
				}
				local17.anInt3788 = 1;
			} catch (@Pc(207) ThreadDeath local207) {
				throw local207;
			} catch (@Pc(210) Throwable local210) {
				local17.anInt3788 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!me;")
	public Class111 method2892(@OriginalArg(0) URL arg0) {
		return this.method2879(4, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!me;")
	public Class111 method2893(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method2879(2, arg0, arg1, 0);
	}
}
