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

@OriginalClass("client!ul")
public final class Class255 implements Runnable {

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!mt;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "[Lclient!kr;")
	public Class137[] aClass137Array1;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
	private boolean aBoolean537 = false;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Lclient!kr;")
	public Class137 aClass137_2 = null;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Lclient!gm;")
	private Class87 aClass87_7 = null;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Lclient!gm;")
	private Class87 aClass87_8 = null;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!kr;")
	public Class137 aClass137_3 = null;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "Lclient!kr;")
	public Class137 aClass137_4 = null;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	private final int anInt7271;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "Ljava/lang/String;")
	private final String aString73;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class255(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static419.aString72 = "1.1";
		Static419.aString69 = "Unknown";
		this.anInt7271 = arg1;
		this.aString73 = arg2;
		this.anApplet1 = arg0;
		try {
			Static419.aString69 = System.getProperty("java.vendor");
			Static419.aString72 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static419.aString68 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static419.aString68 = "Unknown";
		}
		Static419.aString74 = Static419.aString68.toLowerCase();
		try {
			Static419.aString71 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static419.aString71 = "";
		}
		try {
			Static419.aString70 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static419.aString70 = "";
		}
		try {
			Static419.aString75 = System.getProperty("user.home");
			if (Static419.aString75 != null) {
				Static419.aString75 = Static419.aString75 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static419.aString75 == null) {
			Static419.aString75 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static419.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static419.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static419.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static419.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean537 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Lclient!mt;")
	public Interface6 method5819() {
		return this.anInterface6_2;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!gm;")
	public Class87 method5820(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method5822(0, 2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method5821(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -30326) {
			this.method5819();
		}
		@Pc(16) Class87 local16 = this.method5842(arg1, 0, 21, arg0 + 30326);
		return (byte[]) local16.anObject3;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BIILjava/lang/Object;I)Lclient!gm;")
	private Class87 method5822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class87 local3 = new Class87();
		local3.anInt2677 = arg3;
		local3.anInt2678 = arg1;
		local3.anObject4 = arg2;
		synchronized (this) {
			if (this.aClass87_7 == null) {
				this.aClass87_7 = this.aClass87_8 = local3;
			} else {
				this.aClass87_7.aClass87_3 = local3;
				this.aClass87_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!gm;")
	public Class87 method5824(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method5822(0, 8, new Object[] { arg1, arg0, arg2 }, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!gm;")
	public Class87 method5825(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method5822(0, 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z")
	public boolean method5826() {
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!gm;")
	public Class87 method5827(@OriginalArg(0) Class arg0) {
		return this.method5822(0, 11, arg0, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!gm;")
	public Class87 method5828(@OriginalArg(1) Frame arg0) {
		return this.method5822(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/awt/Component;IBLjava/awt/Point;[II)Lclient!gm;")
	public Class87 method5829(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		return this.method5822(arg4, 17, new Object[] { arg0, arg3, arg2 }, arg1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method5830(@OriginalArg(0) String arg0) {
		return Static419.method5823(this.anInt7271, arg0, this.aString73);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lclient!gm;")
	private Class87 method5831(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 == -37 ? this.method5822(0, 19, arg1, 0) : null;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Lclient!gm;")
	public Class87 method5832(@OriginalArg(0) int arg0) {
		return this.method5822(0, 3, null, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)Lclient!gm;")
	private Class87 method5833() {
		return this.method5822(0, 18, null, 0);
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
	public void method5834() {
		Static419.aLong210 = Static167.method2929() + 5000L;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public void method5835() {
		synchronized (this) {
			this.aBoolean537 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass137_4 != null) {
			try {
				this.aClass137_4.method3708();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass137_3 != null) {
			try {
				this.aClass137_3.method3708();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass137Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass137Array1.length; local52++) {
				if (this.aClass137Array1[local52] != null) {
					try {
						this.aClass137Array1[local52].method3708();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass137_2 != null) {
			try {
				this.aClass137_2.method3708();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBLjava/awt/Component;I)Lclient!gm;")
	private Class87 method5836(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (arg1 == 35) {
			@Pc(7) Point local7 = arg2.getLocationOnScreen();
			return this.method5822(arg3 + local7.y, 14, null, local7.x + arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/awt/Component;Z)Lclient!gm;")
	private Class87 method5837(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		return arg0 >= -115 ? null : this.method5822(0, 15, arg1, arg2 ? 1 : 0);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(ILjava/lang/String;)Lclient!gm;")
	public Class87 method5838(@OriginalArg(1) String arg0) {
		return this.method5822(0, 16, arg0, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)Lclient!gm;")
	public Class87 method5839(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method5822(arg1 << 16, 6, null, arg0 + (arg2 << 16));
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!gm;")
	public Class87 method5840(@OriginalArg(0) URL arg0) {
		return this.method5822(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lclient!gm;")
	public Class87 method5841(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method5822(0, 9, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!gm;")
	private Class87 method5842(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class87 local3 = new Class87();
		synchronized (local3) {
			local3.anInt2677 = arg1;
			local3.anObject4 = arg0;
			local3.anInt2678 = arg2;
			synchronized (this) {
				if (this.aClass87_7 == null) {
					this.aClass87_7 = this.aClass87_8 = local3;
				} else {
					this.aClass87_7.aClass87_3 = local3;
					this.aClass87_7 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
			if (arg3 != 0) {
				this.method5819();
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!gm;")
	private Class87 method5843(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5833();
		}
		return this.method5822(0, 21, arg0, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Lclient!gm;")
	public Class87 method5844() {
		return this.method5822(0, 5, null, 0);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!gm;")
	public Class87 method5845(@OriginalArg(0) Class arg0) {
		return this.method5822(0, 20, arg0, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/lang/Class;)V")
	public void method5846(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(41) Method local41;
		if (!Static419.aString74.startsWith("mac")) {
			local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local41, Boolean.TRUE);
			local41.invoke(local14, arg0, "jawt");
			local25.invoke(local41, Boolean.FALSE);
		}
		local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local41, Boolean.TRUE);
		if (!Static419.aString74.startsWith("win")) {
			throw new Exception();
		}
		local41.invoke(local14, arg0, this.method5830("sw3d.dll").toString());
		local25.invoke(local41, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLjava/lang/String;Z)Lclient!gm;")
	public Class87 method5847(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method5822(0, 12, arg0, 0) : this.method5822(0, 13, arg0, 0);
	}

	@OriginalMember(owner = "client!ul", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class87 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean537) {
						return;
					}
					if (this.aClass87_8 != null) {
						local15 = this.aClass87_8;
						this.aClass87_8 = this.aClass87_8.aClass87_3;
						if (this.aClass87_8 == null) {
							this.aClass87_7 = null;
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
				@Pc(41) int local41 = local15.anInt2678;
				if (local41 == 1) {
					if (Static419.aLong210 > Static167.method2929()) {
						throw new IOException();
					}
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt2677);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject4);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt2677);
					local15.anObject3 = local56;
				} else if (local41 == 4) {
					if (Static167.method2929() < Static419.aLong210) {
						throw new IOException();
					}
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(84) Object[] local84;
					if (local41 == 8) {
						local84 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local84[0]).getDeclaredMethod((String) local84[1], (Class[]) local84[2]);
					} else if (local41 == 9) {
						local84 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local84[0]).getDeclaredField((String) local84[1]);
					} else if (local41 == 18) {
						@Pc(102) Clipboard local102 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject3 = local102.getContents(null);
					} else if (local41 == 19) {
						@Pc(115) Transferable local115 = (Transferable) local15.anObject4;
						@Pc(118) Clipboard local118 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local118.setContents(local115, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2679 = 1;
			} catch (@Pc(196) ThreadDeath local196) {
				throw local196;
			} catch (@Pc(199) Throwable local199) {
				local15.anInt2679 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}
}
