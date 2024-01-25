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

@OriginalClass("client!li")
public final class Class143 implements Runnable {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!ol;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "[Lclient!ve;")
	public Class256[] aClass256Array1;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Lclient!ve;")
	public Class256 aClass256_2 = null;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!ve;")
	public Class256 aClass256_3 = null;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!cq;")
	private Class43 aClass43_6 = null;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!ve;")
	public Class256 aClass256_4 = null;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "Z")
	private boolean aBoolean363 = false;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Lclient!cq;")
	private Class43 aClass43_7 = null;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	private final int anInt4226;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "Ljava/lang/String;")
	private final String aString30;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class143(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt4226 = arg1;
		Static227.aString27 = "Unknown";
		this.anApplet1 = arg0;
		this.aString30 = arg2;
		Static227.aString29 = "1.1";
		try {
			Static227.aString27 = System.getProperty("java.vendor");
			Static227.aString29 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static227.aString32 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static227.aString32 = "Unknown";
		}
		Static227.aString28 = Static227.aString32.toLowerCase();
		try {
			Static227.aString31 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static227.aString31 = "";
		}
		try {
			Static227.aString33 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static227.aString33 = "";
		}
		try {
			Static227.aString26 = System.getProperty("user.home");
			if (Static227.aString26 != null) {
				Static227.aString26 = Static227.aString26 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static227.aString26 == null) {
			Static227.aString26 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static227.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static227.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static227.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static227.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean363 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)Lclient!cq;")
	private Class43 method3382(@OriginalArg(1) String arg0) {
		return this.method3405(0, 0, 21, arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!cq;")
	public Class43 method3384(@OriginalArg(0) Frame arg0) {
		return this.method3405(0, 0, 7, arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public void method3385() {
		synchronized (this) {
			this.aBoolean363 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass256_3 != null) {
			try {
				this.aClass256_3.method5388();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass256_2 != null) {
			try {
				this.aClass256_2.method5388();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass256Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass256Array1.length; local47++) {
				if (this.aClass256Array1[local47] != null) {
					try {
						this.aClass256Array1[local47].method5388();
					} catch (@Pc(61) IOException local61) {
					}
				}
			}
		}
		if (this.aClass256_4 != null) {
			try {
				this.aClass256_4.method5388();
			} catch (@Pc(77) IOException local77) {
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)Lclient!cq;")
	public Class43 method3386(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3405(arg1 << 16, arg2 + (arg0 << 16), 6, null);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!cq;")
	private Class43 method3387(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class43 local3 = new Class43();
		synchronized (local3) {
			if (arg2 != -9) {
				return null;
			}
			local3.anInt1522 = arg3;
			local3.anObject4 = arg1;
			local3.anInt1523 = arg0;
			synchronized (this) {
				if (this.aClass43_6 == null) {
					this.aClass43_6 = this.aClass43_7 = local3;
				} else {
					this.aClass43_6.aClass43_2 = local3;
					this.aClass43_6 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(58) InterruptedException local58) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!cq;")
	public Class43 method3388(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3405(0, 0, 9, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Lclient!cq;")
	private Class43 method3389(@OriginalArg(0) int arg0) {
		return arg0 > -1 ? null : this.method3405(0, 0, 18, null);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;B)Lclient!cq;")
	public Class43 method3390(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method3405(0, arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Lclient!cq;")
	public Class43 method3391(@OriginalArg(0) int arg0) {
		return this.method3405(0, arg0, 3, null);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/net/URL;)Lclient!cq;")
	public Class43 method3392(@OriginalArg(1) URL arg0) {
		return this.method3405(0, 0, 4, arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Z")
	public boolean method3393() {
		return false;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(ILjava/lang/String;)Lclient!cq;")
	public Class43 method3394(@OriginalArg(1) String arg0) {
		return this.method3405(0, 0, 12, arg0);
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	public void method3395() {
		Static227.aLong136 = Static118.method1934() + 5000L;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/Class;)V")
	public void method3396(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(40) Method local40;
		if (!Static227.aString28.startsWith("mac")) {
			local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local40, Boolean.TRUE);
			local40.invoke(local14, arg0, "jawt");
			local25.invoke(local40, Boolean.FALSE);
		}
		local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local40, Boolean.TRUE);
		if (!Static227.aString28.startsWith("win")) {
			throw new Exception();
		}
		local40.invoke(local14, arg0, this.method3410("sw3d.dll").toString());
		local25.invoke(local40, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lclient!cq;")
	public Class43 method3397(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3405(0, arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lclient!cq;")
	private Class43 method3398(@OriginalArg(0) boolean arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0) {
			this.method3394(null);
		}
		return this.method3405(0, 0, 19, arg1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!cq;")
	private Class43 method3399(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		if (arg1 <= 88) {
			this.method3407(null, (byte) -68);
		}
		return this.method3405(0, arg0 ? 1 : 0, 15, arg2);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!cq;")
	public Class43 method3400(@OriginalArg(1) String arg0) {
		return this.method3405(0, 0, 16, arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IBILjava/awt/Component;)Lclient!cq;")
	private Class43 method3401(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		return arg1 == -14 ? this.method3405(arg2 + local2.y, arg0 - -local2.x, 14, null) : null;
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(I)Lclient!ol;")
	public Interface7 method3402() {
		return this.anInterface7_2;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!cq;")
	public Class43 method3403(@OriginalArg(1) Class arg0) {
		return this.method3405(0, 0, 11, arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB[ILjava/awt/Point;Ljava/awt/Component;)Lclient!cq;")
	public Class43 method3404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) Component arg4) {
		return this.method3405(arg0, arg1, 17, new Object[] { arg4, arg2, arg3 });
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!cq;")
	private Class43 method3405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class43 local3 = new Class43();
		local3.anInt1523 = arg1;
		local3.anInt1522 = arg2;
		local3.anObject4 = arg3;
		synchronized (this) {
			if (this.aClass43_6 == null) {
				this.aClass43_6 = this.aClass43_7 = local3;
			} else {
				this.aClass43_6.aClass43_2 = local3;
				this.aClass43_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lclient!cq;")
	public Class43 method3406(@OriginalArg(1) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method3405(0, 0, 8, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!li", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class43 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean363) {
						return;
					}
					if (this.aClass43_7 != null) {
						local15 = this.aClass43_7;
						this.aClass43_7 = this.aClass43_7.aClass43_2;
						if (this.aClass43_7 == null) {
							this.aClass43_6 = null;
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
				@Pc(41) int local41 = local15.anInt1522;
				if (local41 == 1) {
					if (Static227.aLong136 > Static118.method1934()) {
						throw new IOException();
					}
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt1523);
				} else if (local41 == 2) {
					@Pc(162) Thread local162 = new Thread((Runnable) local15.anObject4);
					local162.setDaemon(true);
					local162.start();
					local162.setPriority(local15.anInt1523);
					local15.anObject3 = local162;
				} else if (local41 == 4) {
					if (Static118.method1934() < Static227.aLong136) {
						throw new IOException();
					}
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(66) Object[] local66;
					if (local41 == 8) {
						local66 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local66[0]).getDeclaredMethod((String) local66[1], (Class[]) local66[2]);
					} else if (local41 == 9) {
						local66 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local66[0]).getDeclaredField((String) local66[1]);
					} else if (local41 == 18) {
						@Pc(84) Clipboard local84 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject3 = local84.getContents(null);
					} else if (local41 == 19) {
						@Pc(99) Transferable local99 = (Transferable) local15.anObject4;
						@Pc(102) Clipboard local102 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local102.setContents(local99, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt1521 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt1521 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method3407(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 67) {
			this.method3392(null);
		}
		@Pc(15) Class43 local15 = this.method3387(0, arg0, -9, 21);
		return (byte[]) local15.anObject3;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!cq;")
	public Class43 method3408(@OriginalArg(0) Class arg0) {
		return this.method3405(0, 0, 20, arg0);
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(I)Lclient!cq;")
	public Class43 method3409() {
		return this.method3405(0, 0, 5, null);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method3410(@OriginalArg(1) String arg0) {
		return Static227.method3383(arg0, this.aString30, this.anInt4226);
	}
}
