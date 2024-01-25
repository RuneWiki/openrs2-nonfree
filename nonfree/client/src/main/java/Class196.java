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

@OriginalClass("client!pc")
public final class Class196 implements Runnable {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[Lclient!en;")
	public Class70[] aClass70Array1;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!eu;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!cw;")
	private Class45 aClass45_5 = null;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!en;")
	public Class70 aClass70_2 = null;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!en;")
	public Class70 aClass70_3 = null;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Lclient!cw;")
	private Class45 aClass45_6 = null;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "Lclient!en;")
	public Class70 aClass70_4 = null;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private final int anInt4899;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString46;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class196(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt4899 = arg1;
		this.anApplet1 = arg0;
		Static300.aString51 = "1.1";
		this.aString46 = arg2;
		Static300.aString45 = "Unknown";
		try {
			Static300.aString45 = System.getProperty("java.vendor");
			Static300.aString51 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static300.aString52 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static300.aString52 = "Unknown";
		}
		Static300.aString49 = Static300.aString52.toLowerCase();
		try {
			Static300.aString47 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static300.aString47 = "";
		}
		try {
			Static300.aString48 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static300.aString48 = "";
		}
		try {
			Static300.aString50 = System.getProperty("user.home");
			if (Static300.aString50 != null) {
				Static300.aString50 = Static300.aString50 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static300.aString50 == null) {
			Static300.aString50 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static300.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static300.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static300.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static300.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean358 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lclient!cw;")
	public Class45 method3894() {
		return this.method3903(0, 5, null, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!cw;")
	private Class45 method3895(@OriginalArg(0) Transferable arg0) {
		return this.method3903(0, 19, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZILjava/lang/Runnable;)Lclient!cw;")
	public Class45 method3896(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3903(arg0, 2, arg1, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[IIB)Lclient!cw;")
	public Class45 method3897(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		return this.method3903(arg0, 17, new Object[] { arg2, arg3, arg1 }, arg4);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Lclient!eu;")
	public Interface2 method3898() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!cw;")
	public Class45 method3899(@OriginalArg(1) Class arg0) {
		return this.method3903(0, 11, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/net/URL;)Lclient!cw;")
	public Class45 method3900(@OriginalArg(1) URL arg0) {
		return this.method3903(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!cw;")
	private Class45 method3901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		if (arg0 < 48) {
			this.method3910();
		}
		return this.method3903(local2.x + arg1, 14, null, arg2 + local2.y);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lclient!cw;")
	public Class45 method3902(@OriginalArg(1) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method3903(0, 8, new Object[] { arg1, arg2, arg0 }, 0);
	}

	@OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class45 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean358) {
						return;
					}
					if (this.aClass45_5 != null) {
						local15 = this.aClass45_5;
						this.aClass45_5 = this.aClass45_5.aClass45_1;
						if (this.aClass45_5 == null) {
							this.aClass45_6 = null;
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
				@Pc(41) int local41 = local15.anInt1128;
				if (local41 == 1) {
					if (Static266.method3498() < Static300.aLong152) {
						throw new IOException();
					}
					local15.anObject5 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt1130);
				} else if (local41 == 2) {
					@Pc(54) Thread local54 = new Thread((Runnable) local15.anObject6);
					local54.setDaemon(true);
					local54.start();
					local54.setPriority(local15.anInt1130);
					local15.anObject5 = local54;
				} else if (local41 == 4) {
					if (Static266.method3498() < Static300.aLong152) {
						throw new IOException();
					}
					local15.anObject5 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local41 == 8) {
						local102 = (Object[]) local15.anObject6;
						local15.anObject5 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local41 == 9) {
						local102 = (Object[]) local15.anObject6;
						local15.anObject5 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local41 == 18) {
						@Pc(151) Clipboard local151 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject5 = local151.getContents(null);
					} else if (local41 == 19) {
						@Pc(135) Transferable local135 = (Transferable) local15.anObject6;
						@Pc(138) Clipboard local138 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local138.setContents(local135, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt1129 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt1129 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILjava/lang/Object;ZI)Lclient!cw;")
	private Class45 method3903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class45 local3 = new Class45();
		local3.anInt1128 = arg1;
		local3.anInt1130 = arg0;
		local3.anObject6 = arg2;
		synchronized (this) {
			if (this.aClass45_6 == null) {
				this.aClass45_6 = this.aClass45_5 = local3;
			} else {
				this.aClass45_6.aClass45_1 = local3;
				this.aClass45_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Z")
	public boolean method3904() {
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!cw;")
	public Class45 method3905(@OriginalArg(0) int arg0) {
		return this.method3903(arg0, 3, null, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method3906(@OriginalArg(1) String arg0) {
		return Static300.method3919(this.anInt4899, arg0, this.aString46);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!cw;")
	private Class45 method3907(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2) {
		if (arg1 != 108) {
			this.anEventQueue1 = null;
		}
		return this.method3903(arg0 ? 1 : 0, 15, arg2, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;ZB)Lclient!cw;")
	public Class45 method3908(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method3903(0, 12, arg0, 0) : this.method3903(0, 13, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method3909(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class45 local7 = this.method3921(21, arg1, arg0, (byte) -78, 0);
		return (byte[]) local7.anObject5;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public void method3910() {
		Static300.aLong152 = (long) 5000 + Static266.method3498();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lclient!cw;")
	public Class45 method3911(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3903(0, 9, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!cw;")
	public Class45 method3912(@OriginalArg(1) Class arg0) {
		return this.method3903(0, 20, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!cw;")
	public Class45 method3913(@OriginalArg(0) String arg0) {
		return this.method3903(0, 16, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;IB)Lclient!cw;")
	public Class45 method3914(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method3903(arg1, 1, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Lclient!cw;")
	private Class45 method3915(@OriginalArg(0) int arg0) {
		if (arg0 < 103) {
			this.method3905(65);
		}
		return this.method3903(0, 18, null, 0);
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	public void method3916() {
		synchronized (this) {
			this.aBoolean358 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass70_3 != null) {
			try {
				this.aClass70_3.method1443();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass70_2 != null) {
			try {
				this.aClass70_2.method1443();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass70Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass70Array1.length; local50++) {
				if (this.aClass70Array1[local50] != null) {
					try {
						this.aClass70Array1[local50].method1443();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass70_4 != null) {
			try {
				this.aClass70_4.method1443();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!cw;")
	public Class45 method3917(@OriginalArg(0) Frame arg0) {
		return this.method3903(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!cw;")
	private Class45 method3918(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method3908(null, true);
		}
		return this.method3903(0, 21, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZII)Lclient!cw;")
	public Class45 method3920(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3903(arg0 + (arg2 << 16), 6, null, arg1 << 16);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lclient!cw;")
	private Class45 method3921(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class45 local3 = new Class45();
		synchronized (local3) {
			local3.anInt1130 = arg4;
			local3.anObject6 = arg1;
			local3.anInt1128 = arg0;
			synchronized (this) {
				if (arg3 != -78) {
					this.method3918(null, false);
				}
				if (this.aClass45_6 == null) {
					this.aClass45_6 = this.aClass45_5 = local3;
				} else {
					this.aClass45_6.aClass45_1 = local3;
					this.aClass45_6 = local3;
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

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILjava/lang/Class;)V")
	public void method3922(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!Static300.aString49.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local29.invoke(local39, Boolean.TRUE);
			local39.invoke(local18, arg0, "jawt");
			local29.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local29.invoke(local39, Boolean.TRUE);
		if (!Static300.aString49.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local18, arg0, this.method3906("sw3d.dll").toString());
		local29.invoke(local39, Boolean.FALSE);
	}
}
