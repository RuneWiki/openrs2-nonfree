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

@OriginalClass("client!rj")
public final class Class154 implements Runnable {

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Lclient!ik;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "[Lclient!on;")
	public Class132[] aClass132Array1;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Lclient!on;")
	public Class132 aClass132_2 = null;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "Lclient!on;")
	public Class132 aClass132_3 = null;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "Lclient!on;")
	public Class132 aClass132_4 = null;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "Lclient!vd;")
	private Class185 aClass185_6 = null;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "Z")
	private boolean aBoolean304 = false;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "Lclient!vd;")
	private Class185 aClass185_7 = null;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class154(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static246.aString261 = "1.1";
		Static246.aString262 = "Unknown";
		try {
			Static246.aString262 = System.getProperty("java.vendor");
			Static246.aString261 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static246.aString265 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static246.aString265 = "Unknown";
		}
		Static246.aString266 = Static246.aString265.toLowerCase();
		try {
			Static246.aString263 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static246.aString263 = "";
		}
		try {
			Static246.aString260 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static246.aString260 = "";
		}
		try {
			Static246.aString264 = System.getProperty("user.home");
			if (Static246.aString264 != null) {
				Static246.aString264 = Static246.aString264 + "/";
			}
		} catch (@Pc(80) Exception local80) {
		}
		if (Static246.aString264 == null) {
			Static246.aString264 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(92) Throwable local92) {
		}
		try {
			if (arg0 == null) {
				Static246.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static246.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		try {
			if (arg0 == null) {
				Static246.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static246.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(148) Exception local148) {
		}
		this.aBoolean304 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!vd;")
	public Class185 method3879(@OriginalArg(1) Class arg0) {
		return this.method3900(10, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([ILjava/awt/Point;Ljava/awt/Component;III)Lclient!vd;")
	public Class185 method3880(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method3900(17, arg3, new Object[] { arg2, arg0, arg1 }, arg4);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!vd;")
	public Class185 method3881(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method3900(2, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!rj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class185 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean304) {
						return;
					}
					if (this.aClass185_6 != null) {
						local17 = this.aClass185_6;
						this.aClass185_6 = this.aClass185_6.aClass185_8;
						if (this.aClass185_6 == null) {
							this.aClass185_7 = null;
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
				@Pc(45) int local45 = local17.anInt5278;
				if (local45 == 1) {
					if (Static298.method4535() < Static246.aLong162) {
						throw new IOException();
					}
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt5277);
				} else if (local45 == 2) {
					@Pc(193) Thread local193 = new Thread((Runnable) local17.anObject5);
					local193.setDaemon(true);
					local193.start();
					local193.setPriority(local17.anInt5277);
					local17.anObject6 = local193;
				} else if (local45 == 4) {
					if (Static246.aLong162 > Static298.method4535()) {
						throw new IOException();
					}
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local45 == 8) {
						local92 = (Object[]) local17.anObject5;
						local17.anObject6 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local45 == 9) {
						local92 = (Object[]) local17.anObject5;
						local17.anObject6 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else if (local45 == 18) {
						@Pc(137) Clipboard local137 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject6 = local137.getContents(null);
					} else if (local45 == 19) {
						@Pc(154) Transferable local154 = (Transferable) local17.anObject5;
						@Pc(157) Clipboard local157 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local157.setContents(local154, null);
					} else {
						throw new Exception();
					}
				}
				local17.anInt5276 = 1;
			} catch (@Pc(210) ThreadDeath local210) {
				throw local210;
			} catch (@Pc(213) Throwable local213) {
				local17.anInt5276 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Lclient!vd;")
	public Class185 method3883() {
		return this.method3900(5, 0, null, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)Lclient!vd;")
	public Class185 method3884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method3900(6, (arg1 << 16) + arg2, null, arg0 << 16);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!vd;")
	public Class185 method3885(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3900(9, 0, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!vd;")
	public Class185 method3886(@OriginalArg(0) Class arg0) {
		return this.method3900(11, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public void method3887() {
		Static246.aLong162 = Static298.method4535() + 5000L;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!vd;")
	public Class185 method3888(@OriginalArg(1) Class arg0) {
		return this.method3900(20, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
	public void method3889() {
		synchronized (this) {
			this.aBoolean304 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		if (this.aClass132_4 != null) {
			try {
				this.aClass132_4.method3356();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass132_2 != null) {
			try {
				this.aClass132_2.method3356();
			} catch (@Pc(48) IOException local48) {
			}
		}
		if (this.aClass132Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass132Array1.length; local53++) {
				if (this.aClass132Array1[local53] != null) {
					try {
						this.aClass132Array1[local53].method3356();
					} catch (@Pc(72) IOException local72) {
					}
				}
			}
		}
		if (this.aClass132_3 != null) {
			try {
				this.aClass132_3.method3356();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!vd;")
	public Class185 method3890(@OriginalArg(0) URL arg0) {
		return this.method3900(4, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;I)Lclient!vd;")
	public Class185 method3892(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method3900(1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!vd;")
	public Class185 method3893(@OriginalArg(0) String arg0) {
		return this.method3900(12, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!vd;")
	public Class185 method3894(@OriginalArg(1) Frame arg0) {
		return this.method3900(7, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!vd;")
	public Class185 method3895(@OriginalArg(0) String arg0) {
		return this.method3900(16, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Z")
	public boolean method3896() {
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lclient!vd;")
	public Class185 method3897(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2) {
		return this.method3900(8, 0, new Object[] { arg1, arg0, arg2 }, 0);
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)Lclient!ik;")
	public Interface2 method3899() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lclient!vd;")
	private Class185 method3900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class185 local10 = new Class185();
		local10.anInt5278 = arg0;
		local10.anObject5 = arg2;
		local10.anInt5277 = arg1;
		synchronized (this) {
			if (this.aClass185_7 == null) {
				this.aClass185_7 = this.aClass185_6 = local10;
			} else {
				this.aClass185_7.aClass185_8 = local10;
				this.aClass185_7 = local10;
			}
			this.notify();
			return local10;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lclient!vd;")
	public Class185 method3901(@OriginalArg(0) int arg0) {
		return this.method3900(3, arg0, null, 0);
	}
}
