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

@OriginalClass("client!gt")
public final class Class93 implements Runnable {

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "Lclient!ik;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "[Lclient!km;")
	public Class139[] aClass139Array1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "Lclient!km;")
	public Class139 aClass139_2 = null;

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "Lclient!km;")
	public Class139 aClass139_3 = null;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "Lclient!wk;")
	private Class268 aClass268_5 = null;

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "Lclient!km;")
	public Class139 aClass139_4 = null;

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "Lclient!wk;")
	private Class268 aClass268_6 = null;

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
	private int anInt2597;

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "Ljava/lang/String;")
	private final String aString30;

	@OriginalMember(owner = "client!gt", name = "u", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class93(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt2597 = arg1;
		Static144.aString25 = "1.1";
		this.aString30 = arg2;
		Static144.aString23 = "Unknown";
		this.anApplet1 = arg0;
		try {
			Static144.aString23 = System.getProperty("java.vendor");
			Static144.aString25 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static144.aString27 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static144.aString27 = "Unknown";
		}
		Static144.aString29 = Static144.aString27.toLowerCase();
		try {
			Static144.aString24 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static144.aString24 = "";
		}
		try {
			Static144.aString26 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static144.aString26 = "";
		}
		try {
			Static144.aString28 = System.getProperty("user.home");
			if (Static144.aString28 != null) {
				Static144.aString28 = Static144.aString28 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static144.aString28 == null) {
			Static144.aString28 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static144.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static144.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static144.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static144.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean167 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Lclient!wk;")
	public Class268 method2072(@OriginalArg(0) int arg0) {
		return this.method2083(3, 0, arg0, null);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!wk;")
	private Class268 method2073(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != 14) {
			this.method2098(null);
		}
		@Pc(10) Point local10 = arg0.getLocationOnScreen();
		return this.method2083(14, arg2 + local10.y, local10.x + arg3, null);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!wk;")
	public Class268 method2074(@OriginalArg(0) URL arg0) {
		return this.method2083(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Z")
	public boolean method2075() {
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!wk;")
	public Class268 method2076(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method2083(2, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!wk;")
	public Class268 method2077(@OriginalArg(1) Class arg0) {
		return this.method2083(11, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	public void method2078(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static144.aString29.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg0, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!Static144.aString29.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg0, this.method2096("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)Lclient!ik;")
	public Interface7 method2079() {
		return this.anInterface7_1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!wk;")
	private Class268 method2080(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 61) {
			this.method2096(null);
		}
		return this.method2083(21, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!wk;")
	public Class268 method2081(@OriginalArg(0) Frame arg0) {
		return this.method2083(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BIIILjava/lang/Object;)Lclient!wk;")
	private Class268 method2083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class268 local3 = new Class268();
		local3.anInt7419 = arg2;
		local3.anInt7418 = arg0;
		local3.anObject11 = arg3;
		synchronized (this) {
			if (this.aClass268_6 == null) {
				this.aClass268_6 = this.aClass268_5 = local3;
			} else {
				this.aClass268_6.aClass268_8 = local3;
				this.aClass268_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!wk;")
	public Class268 method2084(@OriginalArg(0) String arg0) {
		return this.method2083(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!wk;")
	private Class268 method2085(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		return arg1 == -10606 ? this.method2083(19, 0, 0, arg0) : null;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIII)Lclient!wk;")
	public Class268 method2086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method2083(6, arg0 << 16, arg1 + (arg2 << 16), null);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	public void method2087() {
		synchronized (this) {
			this.aBoolean167 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass139_4 != null) {
			try {
				this.aClass139_4.method2897();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass139_3 != null) {
			try {
				this.aClass139_3.method2897();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass139Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass139Array1.length; local52++) {
				if (this.aClass139Array1[local52] != null) {
					try {
						this.aClass139Array1[local52].method2897();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass139_2 != null) {
			try {
				this.aClass139_2.method2897();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILjava/lang/String;)Lclient!wk;")
	public Class268 method2088(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method2083(1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!wk;")
	private Class268 method2089(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 <= 26) {
			this.method2097(76);
		}
		return this.method2083(15, 0, arg0 ? 1 : 0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[IILjava/awt/Component;ILjava/awt/Point;)Lclient!wk;")
	public Class268 method2090(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method2083(17, arg3, arg1, new Object[] { arg2, arg0, arg4 });
	}

	@OriginalMember(owner = "client!gt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class268 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean167) {
						return;
					}
					if (this.aClass268_5 != null) {
						local15 = this.aClass268_5;
						this.aClass268_5 = this.aClass268_5.aClass268_8;
						if (this.aClass268_5 == null) {
							this.aClass268_6 = null;
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
				@Pc(41) int local41 = local15.anInt7418;
				if (local41 == 1) {
					if (Static144.aLong82 > Static446.method5903()) {
						throw new IOException();
					}
					local15.anObject10 = new Socket(InetAddress.getByName((String) local15.anObject11), local15.anInt7419);
				} else if (local41 == 2) {
					@Pc(77) Thread local77 = new Thread((Runnable) local15.anObject11);
					local77.setDaemon(true);
					local77.start();
					local77.setPriority(local15.anInt7419);
					local15.anObject10 = local77;
				} else if (local41 == 4) {
					if (Static144.aLong82 > Static446.method5903()) {
						throw new IOException();
					}
					local15.anObject10 = new DataInputStream(((URL) local15.anObject11).openStream());
				} else {
					@Pc(100) Object[] local100;
					if (local41 == 8) {
						local100 = (Object[]) local15.anObject11;
						local15.anObject10 = ((Class) local100[0]).getDeclaredMethod((String) local100[1], (Class[]) local100[2]);
					} else if (local41 == 9) {
						local100 = (Object[]) local15.anObject11;
						local15.anObject10 = ((Class) local100[0]).getDeclaredField((String) local100[1]);
					} else if (local41 == 18) {
						@Pc(143) Clipboard local143 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject10 = local143.getContents(null);
					} else if (local41 == 19) {
						@Pc(158) Transferable local158 = (Transferable) local15.anObject11;
						@Pc(161) Clipboard local161 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local161.setContents(local158, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt7420 = 1;
			} catch (@Pc(194) ThreadDeath local194) {
				throw local194;
			} catch (@Pc(197) Throwable local197) {
				local15.anInt7420 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lclient!wk;")
	public Class268 method2091(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method2083(8, 0, 0, new Object[] { arg2, arg0, arg1 });
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILjava/lang/Object;Z)Lclient!wk;")
	private Class268 method2092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) boolean arg3) {
		@Pc(3) Class268 local3 = new Class268();
		synchronized (local3) {
			local3.anInt7418 = arg1;
			local3.anInt7419 = arg0;
			local3.anObject11 = arg2;
			synchronized (this) {
				if (arg3) {
					this.anInt2597 = -55;
				}
				if (this.aClass268_6 == null) {
					this.aClass268_6 = this.aClass268_5 = local3;
				} else {
					this.aClass268_6.aClass268_8 = local3;
					this.aClass268_6 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(55) InterruptedException local55) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!wk;")
	public Class268 method2093(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2083(9, 0, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lclient!wk;")
	public Class268 method2094() {
		return this.method2083(5, 0, 0, null);
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(Z)V")
	public void method2095() {
		Static144.aLong82 = Static446.method5903() + 5000L;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public File method2096(@OriginalArg(0) String arg0) {
		return Static144.method2082(arg0, this.aString30, this.anInt2597);
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Lclient!wk;")
	private Class268 method2097(@OriginalArg(0) int arg0) {
		if (arg0 != 18) {
			this.method2084(null);
		}
		return this.method2083(18, 0, 0, null);
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!wk;")
	public Class268 method2098(@OriginalArg(1) Class arg0) {
		return this.method2083(20, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method2099(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class268 local7 = this.method2092(0, 21, arg1, false);
		if (arg0 < 47) {
			Static144.aHashtable1 = null;
		}
		return (byte[]) local7.anObject10;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;ZB)Lclient!wk;")
	public Class268 method2100(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method2083(12, 0, 0, arg0) : this.method2083(13, 0, 0, arg0);
	}
}
