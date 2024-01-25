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

@OriginalClass("client!od")
public final class Class180 implements Runnable {

	@OriginalMember(owner = "client!od", name = "l", descriptor = "Lclient!fa;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "[Lclient!sh;")
	public Class222[] aClass222Array1;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Lclient!am;")
	private Class9 aClass9_7 = null;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "Z")
	private boolean aBoolean325 = false;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!sh;")
	public Class222 aClass222_2 = null;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Lclient!am;")
	private Class9 aClass9_6 = null;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!sh;")
	public Class222 aClass222_3 = null;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Lclient!sh;")
	public Class222 aClass222_4 = null;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	private final int anInt4929;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString45;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class180(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static282.aString44 = "1.1";
		this.anApplet1 = arg0;
		this.anInt4929 = arg1;
		Static282.aString46 = "Unknown";
		this.aString45 = arg2;
		try {
			Static282.aString46 = System.getProperty("java.vendor");
			Static282.aString44 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static282.aString47 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static282.aString47 = "Unknown";
		}
		Static282.aString50 = Static282.aString47.toLowerCase();
		try {
			Static282.aString48 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static282.aString48 = "";
		}
		try {
			Static282.aString43 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static282.aString43 = "";
		}
		try {
			Static282.aString49 = System.getProperty("user.home");
			if (Static282.aString49 != null) {
				Static282.aString49 = Static282.aString49 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static282.aString49 == null) {
			Static282.aString49 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static282.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static282.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static282.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static282.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean325 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!am;")
	public Class9 method4072(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method4082(new Object[] { arg0, arg1 }, 9, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public void method4073() {
		Static282.aLong154 = Static279.method4058() + 5000L;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lclient!am;")
	public Class9 method4074(@OriginalArg(1) int arg0) {
		return this.method4082(null, 3, 0, arg0);
	}

	@OriginalMember(owner = "client!od", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class9 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean325) {
						return;
					}
					if (this.aClass9_6 != null) {
						local15 = this.aClass9_6;
						this.aClass9_6 = this.aClass9_6.aClass9_1;
						if (this.aClass9_6 == null) {
							this.aClass9_7 = null;
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
				@Pc(41) int local41 = local15.anInt367;
				if (local41 == 1) {
					if (Static282.aLong154 > Static279.method4058()) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt366);
				} else if (local41 == 2) {
					@Pc(54) Thread local54 = new Thread((Runnable) local15.anObject1);
					local54.setDaemon(true);
					local54.start();
					local54.setPriority(local15.anInt366);
					local15.anObject2 = local54;
				} else if (local41 == 4) {
					if (Static279.method4058() < Static282.aLong154) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(118) Object[] local118;
					if (local41 == 8) {
						local118 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local118[0]).getDeclaredMethod((String) local118[1], (Class[]) local118[2]);
					} else if (local41 == 9) {
						local118 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local118[0]).getDeclaredField((String) local118[1]);
					} else if (local41 == 18) {
						@Pc(108) Clipboard local108 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local108.getContents(null);
					} else if (local41 == 19) {
						@Pc(97) Transferable local97 = (Transferable) local15.anObject1;
						@Pc(100) Clipboard local100 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local100.setContents(local97, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt368 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt368 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!am;")
	private Class9 method4075(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 > -102) {
			this.method4091(null, null, -72, null, 77);
		}
		return this.method4082(arg0, 21, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/net/URL;)Lclient!am;")
	public Class9 method4076(@OriginalArg(1) URL arg0) {
		return this.method4082(arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!am;")
	public Class9 method4077(@OriginalArg(1) Class arg0) {
		return this.method4082(arg0, 11, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lclient!am;")
	private Class9 method4078(@OriginalArg(0) int arg0) {
		if (arg0 != 7) {
			this.method4097(-99, -2, 70, null);
		}
		return this.method4082(null, 18, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Lclient!am;")
	public Class9 method4079() {
		return this.method4082(null, 5, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lclient!am;")
	private Class9 method4080(@OriginalArg(0) boolean arg0, @OriginalArg(1) Transferable arg1) {
		if (!arg0) {
			this.method4085(null);
		}
		return this.method4082(arg1, 19, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!am;")
	private Class9 method4081(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != 10000) {
			Static282.method4098(null, -87, null);
		}
		return this.method4082(arg0, 15, 0, arg2 ? 1 : 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!am;")
	private Class9 method4082(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class9 local3 = new Class9();
		local3.anInt366 = arg3;
		local3.anObject1 = arg0;
		local3.anInt367 = arg1;
		synchronized (this) {
			if (this.aClass9_7 == null) {
				this.aClass9_7 = this.aClass9_6 = local3;
			} else {
				this.aClass9_7.aClass9_1 = local3;
				this.aClass9_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;ZI)Lclient!am;")
	public Class9 method4083(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method4082(arg0, 12, 0, 0) : this.method4082(arg0, 13, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!am;")
	public Class9 method4084(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method4082(arg1, 2, 0, arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method4085(@OriginalArg(1) String arg0) {
		return Static282.method4098(this.aString45, this.anInt4929, arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!am;")
	public Class9 method4086(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method4082(arg1, 1, 0, arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lclient!am;")
	public Class9 method4087(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2) {
		return this.method4082(new Object[] { arg0, arg1, arg2 }, 8, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Z")
	public boolean method4088() {
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	public void method4089(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static282.aString50.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg0, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!Static282.aString50.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg0, this.method4085("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!am;")
	public Class9 method4090(@OriginalArg(0) String arg0) {
		return this.method4082(arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Point;[IIBLjava/awt/Component;I)Lclient!am;")
	public Class9 method4091(@OriginalArg(0) Point arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		return this.method4082(new Object[] { arg3, arg1, arg0 }, 17, arg2, arg4);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!am;")
	public Class9 method4092(@OriginalArg(0) Class arg0) {
		return this.method4082(arg0, 20, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!am;")
	public Class9 method4093(@OriginalArg(0) Frame arg0) {
		return this.method4082(arg0, 7, 0, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!am;")
	private Class9 method4094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class9 local3 = new Class9();
		synchronized (local3) {
			local3.anInt367 = arg0;
			local3.anInt366 = arg1;
			local3.anObject1 = arg3;
			synchronized (this) {
				if (this.aClass9_7 == null) {
					this.aClass9_7 = this.aClass9_6 = local3;
				} else {
					this.aClass9_7.aClass9_1 = local3;
					this.aClass9_7 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
		}
		return arg2 == -26202 ? local3 : null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public void method4095() {
		synchronized (this) {
			this.aBoolean325 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass222_2 != null) {
			try {
				this.aClass222_2.method4988();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass222_4 != null) {
			try {
				this.aClass222_4.method4988();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass222Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass222Array1.length; local50++) {
				if (this.aClass222Array1[local50] != null) {
					try {
						this.aClass222Array1[local50].method4988();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass222_3 != null) {
			try {
				this.aClass222_3.method4988();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIII)Lclient!am;")
	public Class9 method4096(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method4082(null, 6, arg2 << 16, arg0 + (arg1 << 16));
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!am;")
	private Class9 method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 == -1686) {
			@Pc(7) Point local7 = arg3.getLocationOnScreen();
			return this.method4082(null, 14, local7.y + arg0, arg2 + local7.x);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lclient!fa;")
	public Interface3 method4099() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method4100(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class9 local7 = this.method4094(21, 0, -26202, arg1);
		return arg0 == -24846 ? (byte[]) local7.anObject2 : null;
	}
}
