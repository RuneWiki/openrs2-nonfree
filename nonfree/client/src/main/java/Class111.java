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

@OriginalClass("client!is")
public final class Class111 implements Runnable {

	@OriginalMember(owner = "client!is", name = "g", descriptor = "[Lclient!bt;")
	public Class25[] aClass25Array1;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "Lclient!uf;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!or;")
	private Class182 aClass182_6 = null;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Lclient!bt;")
	public Class25 aClass25_1 = null;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Lclient!bt;")
	public Class25 aClass25_3 = null;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "Lclient!bt;")
	public Class25 aClass25_2 = null;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "Lclient!or;")
	private Class182 aClass182_7 = null;

	@OriginalMember(owner = "client!is", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!is", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class111(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static152.aString33 = "1.1";
		Static152.aString34 = "Unknown";
		try {
			Static152.aString34 = System.getProperty("java.vendor");
			Static152.aString33 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static152.aString29 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static152.aString29 = "Unknown";
		}
		Static152.aString35 = Static152.aString29.toLowerCase();
		try {
			Static152.aString32 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static152.aString32 = "";
		}
		try {
			Static152.aString31 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static152.aString31 = "";
		}
		try {
			Static152.aString30 = System.getProperty("user.home");
			if (Static152.aString30 != null) {
				Static152.aString30 = Static152.aString30 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static152.aString30 == null) {
			Static152.aString30 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static152.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static152.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static152.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static152.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean222 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!or;")
	public Class182 method2796(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method2812(9, 0, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public void method2797() {
		Static152.aLong103 = Static39.method699() + (long) 5000;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!or;")
	public Class182 method2798(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method2812(1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Lclient!or;")
	public Class182 method2799() {
		return this.method2812(13, 0, 0, null);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!or;")
	public Class182 method2800(@OriginalArg(1) Frame arg0) {
		return this.method2812(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)Lclient!or;")
	private Class182 method2801(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method2802(null, null, null);
		}
		return this.method2812(18, 0, 0, null);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Lclient!or;")
	public Class182 method2802(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2) {
		return this.method2812(8, 0, 0, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!or;")
	public Class182 method2803(@OriginalArg(1) Class arg0) {
		return this.method2812(11, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!or;")
	public Class182 method2804(@OriginalArg(0) Class arg0) {
		return this.method2812(20, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/String;)Lclient!or;")
	public Class182 method2805(@OriginalArg(1) String arg0) {
		return this.method2812(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
	public void method2806() {
		synchronized (this) {
			this.aBoolean222 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass25_3 != null) {
			try {
				this.aClass25_3.method594();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass25_2 != null) {
			try {
				this.aClass25_2.method594();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass25Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass25Array1.length; local50++) {
				if (this.aClass25Array1[local50] != null) {
					try {
						this.aClass25Array1[local50].method594();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass25_1 != null) {
			try {
				this.aClass25_1.method594();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lclient!or;")
	private Class182 method2807(@OriginalArg(1) Transferable arg0) {
		return this.method2812(19, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!or;")
	private Class182 method2808(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 == 21 ? this.method2812(21, 0, 0, arg0) : null;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/awt/Component;BI)Lclient!or;")
	private Class182 method2809(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		if (arg2 != -14) {
			this.method2799();
		}
		@Pc(9) Point local9 = arg1.getLocationOnScreen();
		return this.method2812(14, local9.x + arg0, local9.y + arg3, null);
	}

	@OriginalMember(owner = "client!is", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class182 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean222) {
						return;
					}
					if (this.aClass182_7 != null) {
						local15 = this.aClass182_7;
						this.aClass182_7 = this.aClass182_7.aClass182_9;
						if (this.aClass182_7 == null) {
							this.aClass182_6 = null;
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
				@Pc(41) int local41 = local15.anInt4499;
				if (local41 == 1) {
					if (Static152.aLong103 > Static39.method699()) {
						throw new IOException();
					}
					local15.anObject6 = new Socket(InetAddress.getByName((String) local15.anObject5), local15.anInt4500);
				} else if (local41 == 2) {
					@Pc(162) Thread local162 = new Thread((Runnable) local15.anObject5);
					local162.setDaemon(true);
					local162.start();
					local162.setPriority(local15.anInt4500);
					local15.anObject6 = local162;
				} else if (local41 == 4) {
					if (Static39.method699() < Static152.aLong103) {
						throw new IOException();
					}
					local15.anObject6 = new DataInputStream(((URL) local15.anObject5).openStream());
				} else {
					@Pc(86) Object[] local86;
					if (local41 == 8) {
						local86 = (Object[]) local15.anObject5;
						local15.anObject6 = ((Class) local86[0]).getDeclaredMethod((String) local86[1], (Class[]) local86[2]);
					} else if (local41 == 9) {
						local86 = (Object[]) local15.anObject5;
						local15.anObject6 = ((Class) local86[0]).getDeclaredField((String) local86[1]);
					} else if (local41 == 18) {
						@Pc(133) Clipboard local133 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject6 = local133.getContents(null);
					} else if (local41 == 19) {
						@Pc(117) Transferable local117 = (Transferable) local15.anObject5;
						@Pc(120) Clipboard local120 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local120.setContents(local117, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt4498 = 1;
			} catch (@Pc(204) ThreadDeath local204) {
				throw local204;
			} catch (@Pc(207) Throwable local207) {
				local15.anInt4498 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)Z")
	public boolean method2810() {
		return false;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!or;")
	public Class182 method2811(@OriginalArg(0) URL arg0) {
		return this.method2812(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIILjava/lang/Object;)Lclient!or;")
	private Class182 method2812(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class182 local3 = new Class182();
		local3.anInt4500 = arg1;
		local3.anObject5 = arg3;
		local3.anInt4499 = arg0;
		synchronized (this) {
			if (this.aClass182_6 == null) {
				this.aClass182_6 = this.aClass182_7 = local3;
			} else {
				this.aClass182_6.aClass182_9 = local3;
				this.aClass182_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIII)Lclient!or;")
	public Class182 method2813(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method2812(6, (arg1 << 16) + arg2, arg0 << 16, null);
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(Z)Lclient!or;")
	public Class182 method2814() {
		return this.method2812(12, 0, 0, null);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!or;")
	public Class182 method2815(@OriginalArg(0) Class arg0) {
		return this.method2812(10, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/awt/Component;ILjava/awt/Point;[III)Lclient!or;")
	public Class182 method2816(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		return this.method2812(17, arg4, arg1, new Object[] { arg0, arg3, arg2 });
	}

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(I)Lclient!uf;")
	public Interface11 method2817() {
		return this.anInterface11_2;
	}

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(I)Lclient!or;")
	public Class182 method2818() {
		return this.method2812(5, 0, 0, null);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!or;")
	public Class182 method2819(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2812(2, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!or;")
	private Class182 method2820(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class182 local3 = new Class182();
		if (arg1 >= -113) {
			return null;
		}
		synchronized (local3) {
			local3.anObject5 = arg0;
			local3.anInt4500 = arg2;
			local3.anInt4499 = arg3;
			synchronized (this) {
				if (this.aClass182_6 == null) {
					this.aClass182_6 = this.aClass182_7 = local3;
				} else {
					this.aClass182_6.aClass182_9 = local3;
					this.aClass182_6 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(54) InterruptedException local54) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Lclient!or;")
	public Class182 method2821(@OriginalArg(0) int arg0) {
		return this.method2812(3, arg0, 0, null);
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method2822(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class182 local7 = this.method2820(arg1, -125, 0, 21);
		return arg0 == 32222 ? (byte[]) local7.anObject6 : null;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!or;")
	private Class182 method2823(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return arg2 == 15 ? this.method2812(15, arg1 ? 1 : 0, 0, arg0) : null;
	}
}
