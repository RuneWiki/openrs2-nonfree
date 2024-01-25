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

@OriginalClass("client!wd")
public final class Class215 implements Runnable {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "[Lclient!im;")
	public Class108[] aClass108Array1;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!ci;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Z")
	private boolean aBoolean545 = false;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!tj;")
	private Class193 aClass193_9 = null;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!tj;")
	private Class193 aClass193_10 = null;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!im;")
	public Class108 aClass108_3 = null;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!im;")
	public Class108 aClass108_2 = null;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!im;")
	public Class108 aClass108_4 = null;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class215(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static343.aString263 = "Unknown";
		this.anApplet1 = arg0;
		Static343.aString267 = "1.1";
		try {
			Static343.aString263 = System.getProperty("java.vendor");
			Static343.aString267 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static343.aString262 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static343.aString262 = "Unknown";
		}
		Static343.aString266 = Static343.aString262.toLowerCase();
		try {
			Static343.aString265 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static343.aString265 = "";
		}
		try {
			Static343.aString268 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static343.aString268 = "";
		}
		try {
			Static343.aString264 = System.getProperty("user.home");
			if (Static343.aString264 != null) {
				Static343.aString264 = Static343.aString264 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static343.aString264 == null) {
			Static343.aString264 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static343.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static343.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static343.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static343.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean545 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLjava/awt/Component;II)Lclient!tj;")
	private Class193 method5652(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0) {
			@Pc(7) Point local7 = arg1.getLocationOnScreen();
			return this.method5667(null, 14, local7.x + arg2, arg3 - -local7.y);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class193 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean545) {
						return;
					}
					if (this.aClass193_9 != null) {
						local15 = this.aClass193_9;
						this.aClass193_9 = this.aClass193_9.aClass193_6;
						if (this.aClass193_9 == null) {
							this.aClass193_10 = null;
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
				@Pc(41) int local41 = local15.anInt5987;
				if (local41 == 1) {
					if (Static292.method5114() < Static343.aLong210) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt5985);
				} else if (local41 == 2) {
					@Pc(77) Thread local77 = new Thread((Runnable) local15.anObject6);
					local77.setDaemon(true);
					local77.start();
					local77.setPriority(local15.anInt5985);
					local15.anObject7 = local77;
				} else if (local41 == 4) {
					if (Static292.method5114() < Static343.aLong210) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local41 == 8) {
						local102 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local41 == 9) {
						local102 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local41 == 18) {
						@Pc(163) Clipboard local163 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject7 = local163.getContents(null);
					} else if (local41 == 19) {
						@Pc(147) Transferable local147 = (Transferable) local15.anObject6;
						@Pc(150) Clipboard local150 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local150.setContents(local147, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5986 = 1;
			} catch (@Pc(192) ThreadDeath local192) {
				throw local192;
			} catch (@Pc(195) Throwable local195) {
				local15.anInt5986 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lclient!tj;")
	public Class193 method5653(@OriginalArg(1) int arg0) {
		return this.method5667(null, 3, arg0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!tj;")
	public Class193 method5654(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method5667(arg0, 2, arg1, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lclient!tj;")
	public Class193 method5655() {
		return this.method5667(null, 13, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!tj;")
	public Class193 method5656(@OriginalArg(0) Class arg0) {
		return this.method5667(arg0, 20, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIBI)Lclient!tj;")
	public Class193 method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method5667(null, 6, (arg0 << 16) + arg2, arg1 << 16);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!tj;")
	public Class193 method5658(@OriginalArg(0) Frame arg0) {
		return this.method5667(arg0, 7, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public void method5659() {
		Static343.aLong210 = Static292.method5114() + 5000L;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!tj;")
	public Class193 method5660(@OriginalArg(0) String arg0) {
		return this.method5667(arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!tj;")
	public Class193 method5661(@OriginalArg(0) URL arg0) {
		return this.method5667(arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lclient!ci;")
	public Interface1 method5662() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!tj;")
	private Class193 method5663(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.aBoolean545 = false;
		}
		return this.method5667(arg0, 21, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public void method5664() {
		synchronized (this) {
			this.aBoolean545 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		if (this.aClass108_3 != null) {
			try {
				this.aClass108_3.method2207();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass108_2 != null) {
			try {
				this.aClass108_2.method2207();
			} catch (@Pc(50) IOException local50) {
			}
		}
		if (this.aClass108Array1 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.aClass108Array1.length; local56++) {
				if (this.aClass108Array1[local56] != null) {
					try {
						this.aClass108Array1[local56].method2207();
					} catch (@Pc(70) IOException local70) {
					}
				}
			}
		}
		if (this.aClass108_4 != null) {
			try {
				this.aClass108_4.method2207();
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!tj;")
	public Class193 method5665(@OriginalArg(0) Class arg0) {
		return this.method5667(arg0, 11, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method5666(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) Class193 local7 = this.method5676(arg0, 21, 8, 0);
		if (arg1) {
			Static343.aLong210 = 86L;
		}
		return (byte[]) local7.anObject7;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Object;IIIZ)Lclient!tj;")
	private Class193 method5667(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) Class193 local15 = new Class193();
		local15.anObject6 = arg0;
		local15.anInt5985 = arg2;
		local15.anInt5987 = arg1;
		synchronized (this) {
			if (this.aClass193_10 == null) {
				this.aClass193_10 = this.aClass193_9 = local15;
			} else {
				this.aClass193_10.aClass193_6 = local15;
				this.aClass193_10 = local15;
			}
			this.notify();
			return local15;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lclient!tj;")
	public Class193 method5668() {
		return this.method5667(null, 5, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!tj;")
	public Class193 method5669(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method5667(new Object[] { arg1, arg0 }, 9, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Lclient!tj;")
	private Class193 method5670(@OriginalArg(0) Transferable arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.aClass108_3 = null;
		}
		return this.method5667(arg0, 19, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Lclient!tj;")
	public Class193 method5671(@OriginalArg(0) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method5667(new Object[] { arg0, arg2, arg1 }, 8, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB[IILjava/awt/Point;Ljava/awt/Component;)Lclient!tj;")
	public Class193 method5672(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) Component arg4) {
		return this.method5667(new Object[] { arg4, arg1, arg3 }, 17, arg2, arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILjava/lang/String;)Lclient!tj;")
	public Class193 method5673(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method5667(arg1, 1, arg0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)Lclient!tj;")
	private Class193 method5674(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.method5667(null, 18, 0, 0) : null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!tj;")
	private Class193 method5675(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		return this.method5667(arg0, 15, arg1 ? 1 : 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!tj;")
	private Class193 method5676(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class193 local3 = new Class193();
		synchronized (local3) {
			local3.anInt5985 = arg3;
			if (arg2 != 8) {
				this.method5656(null);
			}
			local3.anObject6 = arg0;
			local3.anInt5987 = arg1;
			synchronized (this) {
				if (this.aClass193_10 == null) {
					this.aClass193_10 = this.aClass193_9 = local3;
				} else {
					this.aClass193_10.aClass193_6 = local3;
					this.aClass193_10 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(57) InterruptedException local57) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Z")
	public boolean method5677() {
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Lclient!tj;")
	public Class193 method5678() {
		return this.method5667(null, 12, 0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!tj;")
	public Class193 method5679(@OriginalArg(1) Class arg0) {
		return this.method5667(arg0, 10, 0, 0);
	}
}
