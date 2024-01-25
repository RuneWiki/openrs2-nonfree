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
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!et", name = "b", descriptor = "Lclient!qn;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "[Lclient!rp;")
	public Class207[] aClass207Array1;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Lclient!qt;")
	private Class199 aClass199_4 = null;

	@OriginalMember(owner = "client!et", name = "l", descriptor = "Lclient!qt;")
	private Class199 aClass199_5 = null;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!rp;")
	public Class207 aClass207_1 = null;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "Lclient!rp;")
	public Class207 aClass207_2 = null;

	@OriginalMember(owner = "client!et", name = "v", descriptor = "Lclient!rp;")
	public Class207 aClass207_3 = null;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString20;

	@OriginalMember(owner = "client!et", name = "t", descriptor = "I")
	private final int anInt1988;

	@OriginalMember(owner = "client!et", name = "u", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class66(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		this.aString20 = arg2;
		Static98.aString24 = "1.1";
		this.anInt1988 = arg1;
		Static98.aString23 = "Unknown";
		try {
			Static98.aString23 = System.getProperty("java.vendor");
			Static98.aString24 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static98.aString19 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static98.aString19 = "Unknown";
		}
		Static98.aString25 = Static98.aString19.toLowerCase();
		try {
			Static98.aString21 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static98.aString21 = "";
		}
		try {
			Static98.aString22 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static98.aString22 = "";
		}
		try {
			Static98.aString18 = System.getProperty("user.home");
			if (Static98.aString18 != null) {
				Static98.aString18 = Static98.aString18 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static98.aString18 == null) {
			Static98.aString18 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static98.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static98.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static98.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static98.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean185 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIZI)Lclient!qt;")
	public Class199 method1726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method1737((arg2 << 16) + arg0, arg1 << 16, null, 0, 6);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!qt;")
	public Class199 method1727(@OriginalArg(1) Frame arg0) {
		return this.method1737(0, 0, arg0, 0, 7);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!qt;")
	public Class199 method1728(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method1737(arg1, 0, arg0, 0, 1);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method1729(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class199 local7 = this.method1749(arg0, 0, 0, 21);
		if (arg1 != 14) {
			this.method1733(null);
		}
		return (byte[]) local7.anObject29;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lclient!qt;")
	public Class199 method1730(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return this.method1737(0, 0, new Object[] { arg2, arg1, arg0 }, 0, 8);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Lclient!qt;")
	private Class199 method1731(@OriginalArg(0) byte arg0) {
		return arg0 == -128 ? this.method1737(0, 0, null, arg0 + 128, 18) : null;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
	public void method1732() {
		synchronized (this) {
			this.aBoolean185 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass207_3 != null) {
			try {
				this.aClass207_3.method4713();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass207_1 != null) {
			try {
				this.aClass207_1.method4713();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass207Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass207Array1.length; local44++) {
				if (this.aClass207Array1[local44] != null) {
					try {
						this.aClass207Array1[local44].method4713();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass207_2 != null) {
			try {
				this.aClass207_2.method4713();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/io/File;")
	public File method1733(@OriginalArg(0) String arg0) {
		return Static98.method1748(arg0, this.anInt1988, this.aString20);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Lclient!qn;")
	public Interface10 method1734() {
		return this.anInterface10_1;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!qt;")
	private Class199 method1735(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != -23993) {
			this.method1753();
		}
		return this.method1737(arg2 ? 1 : 0, 0, arg1, 0, 15);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!qt;")
	public Class199 method1736(@OriginalArg(1) Class arg0) {
		return this.method1737(0, 0, arg0, 0, 20);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!qt;")
	private Class199 method1737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class199 local3 = new Class199();
		local3.anInt5758 = arg0;
		local3.anObject28 = arg2;
		local3.anInt5759 = arg4;
		synchronized (this) {
			if (this.aClass199_5 == null) {
				this.aClass199_5 = this.aClass199_4 = local3;
			} else {
				this.aClass199_5.aClass199_9 = local3;
				this.aClass199_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLjava/lang/String;)Lclient!qt;")
	public Class199 method1738(@OriginalArg(1) String arg0) {
		return this.method1737(0, 0, arg0, 0, 12);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)Lclient!qt;")
	public Class199 method1739(@OriginalArg(1) int arg0) {
		return this.method1737(arg0, 0, null, 0, 3);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	public void method1740(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static98.aString25.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg0, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!Static98.aString25.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg0, this.method1733("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!qt;")
	public Class199 method1741(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1737(arg0, 0, arg1, 0, 2);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!qt;")
	private Class199 method1742(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		return arg1 == 87 ? this.method1737(0, 0, arg0, 0, 19) : null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Point;Ljava/awt/Component;I[III)Lclient!qt;")
	public Class199 method1743(@OriginalArg(0) Point arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		return this.method1737(arg2, arg4, new Object[] { arg1, arg3, arg0 }, 0, 17);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!qt;")
	public Class199 method1744(@OriginalArg(0) String arg0) {
		return this.method1737(0, 0, arg0, 0, 16);
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(B)Lclient!qt;")
	public Class199 method1745() {
		return this.method1737(0, 0, null, 0, 5);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!qt;")
	public Class199 method1746(@OriginalArg(0) Class arg0) {
		return this.method1737(0, 0, arg0, 0, 11);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Component;ZII)Lclient!qt;")
	private Class199 method1747(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1) {
			Static98.aHashtable1 = null;
		}
		@Pc(7) Point local7 = arg0.getLocationOnScreen();
		return this.method1737(arg2 + local7.x, local7.y + arg3, null, 0, 14);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!qt;")
	private Class199 method1749(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class199 local3 = new Class199();
		synchronized (local3) {
			local3.anInt5759 = arg3;
			local3.anInt5758 = arg2;
			local3.anObject28 = arg0;
			synchronized (this) {
				if (arg1 != 0) {
					return null;
				}
				if (this.aClass199_5 == null) {
					this.aClass199_5 = this.aClass199_4 = local3;
				} else {
					this.aClass199_5.aClass199_9 = local3;
					this.aClass199_5 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(59) InterruptedException local59) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!qt;")
	public Class199 method1750(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method1737(0, 0, new Object[] { arg0, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!qt;")
	public Class199 method1751(@OriginalArg(0) URL arg0) {
		return this.method1737(0, 0, arg0, 0, 4);
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(Ljava/lang/String;I)Lclient!qt;")
	private Class199 method1752(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 71) {
			this.method1747(null, true, 35, 67);
		}
		return this.method1737(0, 0, arg0, 0, 21);
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(B)V")
	public void method1753() {
		Static98.aLong70 = Static282.method3962() + 5000L;
	}

	@OriginalMember(owner = "client!et", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class199 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean185) {
						return;
					}
					if (this.aClass199_4 != null) {
						local15 = this.aClass199_4;
						this.aClass199_4 = this.aClass199_4.aClass199_9;
						if (this.aClass199_4 == null) {
							this.aClass199_5 = null;
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
				@Pc(41) int local41 = local15.anInt5759;
				if (local41 == 1) {
					if (Static98.aLong70 > Static282.method3962()) {
						throw new IOException();
					}
					local15.anObject29 = new Socket(InetAddress.getByName((String) local15.anObject28), local15.anInt5758);
				} else if (local41 == 2) {
					@Pc(181) Thread local181 = new Thread((Runnable) local15.anObject28);
					local181.setDaemon(true);
					local181.start();
					local181.setPriority(local15.anInt5758);
					local15.anObject29 = local181;
				} else if (local41 == 4) {
					if (Static98.aLong70 > Static282.method3962()) {
						throw new IOException();
					}
					local15.anObject29 = new DataInputStream(((URL) local15.anObject28).openStream());
				} else {
					@Pc(107) Object[] local107;
					if (local41 == 8) {
						local107 = (Object[]) local15.anObject28;
						local15.anObject29 = ((Class) local107[0]).getDeclaredMethod((String) local107[1], (Class[]) local107[2]);
					} else if (local41 == 9) {
						local107 = (Object[]) local15.anObject28;
						local15.anObject29 = ((Class) local107[0]).getDeclaredField((String) local107[1]);
					} else if (local41 == 18) {
						@Pc(168) Clipboard local168 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject29 = local168.getContents(null);
					} else if (local41 == 19) {
						@Pc(152) Transferable local152 = (Transferable) local15.anObject28;
						@Pc(155) Clipboard local155 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local155.setContents(local152, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5760 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt5760 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(B)Z")
	public boolean method1754() {
		return false;
	}
}
