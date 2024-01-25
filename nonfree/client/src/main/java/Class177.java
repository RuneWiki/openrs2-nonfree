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

@OriginalClass("client!nt")
public final class Class177 implements Runnable {

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "Lclient!mi;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "[Lclient!st;")
	public Class235[] aClass235Array1;

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "Lclient!um;")
	private Class253 aClass253_4 = null;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!st;")
	public Class235 aClass235_2 = null;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!st;")
	public Class235 aClass235_3 = null;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "Lclient!st;")
	public Class235 aClass235_4 = null;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "Z")
	private boolean aBoolean443 = false;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "Lclient!um;")
	private Class253 aClass253_5 = null;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString45;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
	private final int anInt4839;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class177(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString45 = arg2;
		Static289.aString49 = "1.1";
		this.anInt4839 = arg1;
		Static289.aString50 = "Unknown";
		this.anApplet1 = arg0;
		try {
			Static289.aString50 = System.getProperty("java.vendor");
			Static289.aString49 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static289.aString47 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static289.aString47 = "Unknown";
		}
		Static289.aString48 = Static289.aString47.toLowerCase();
		try {
			Static289.aString51 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static289.aString51 = "";
		}
		try {
			Static289.aString46 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static289.aString46 = "";
		}
		try {
			Static289.aString52 = System.getProperty("user.home");
			if (Static289.aString52 != null) {
				Static289.aString52 = Static289.aString52 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static289.aString52 == null) {
			Static289.aString52 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static289.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static289.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static289.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static289.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean443 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public void method3829() {
		synchronized (this) {
			this.aBoolean443 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass235_2 != null) {
			try {
				this.aClass235_2.method4942();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass235_4 != null) {
			try {
				this.aClass235_4.method4942();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass235Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass235Array1.length; local44++) {
				if (this.aClass235Array1[local44] != null) {
					try {
						this.aClass235Array1[local44].method4942();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass235_3 != null) {
			try {
				this.aClass235_3.method4942();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!um;")
	public Class253 method3830(@OriginalArg(0) String arg0) {
		return this.method3831(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!um;")
	private Class253 method3831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class253 local3 = new Class253();
		local3.anInt6668 = arg0;
		local3.anInt6670 = arg3;
		local3.anObject10 = arg2;
		synchronized (this) {
			if (this.aClass253_4 == null) {
				this.aClass253_4 = this.aClass253_5 = local3;
			} else {
				this.aClass253_4.aClass253_7 = local3;
				this.aClass253_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/String;I)Lclient!um;")
	public Class253 method3832(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		return arg0 ? this.method3831(0, 0, arg1, 12) : this.method3831(0, 0, arg1, 13);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!um;")
	public Class253 method3833(@OriginalArg(1) Class arg0) {
		return this.method3831(0, 0, arg0, 20);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!um;")
	public Class253 method3834(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3831(0, 0, new Object[] { arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)Lclient!um;")
	private Class253 method3835(@OriginalArg(0) byte arg0) {
		if (arg0 < 69) {
			Static289.aString46 = null;
		}
		return this.method3831(0, 0, null, 18);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILjava/lang/Object;IB)Lclient!um;")
	private Class253 method3836(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(3) Class253 local3 = new Class253();
		synchronized (local3) {
			local3.anObject10 = arg1;
			local3.anInt6668 = arg2;
			local3.anInt6670 = arg0;
			synchronized (this) {
				if (this.aClass253_4 == null) {
					this.aClass253_4 = this.aClass253_5 = local3;
				} else {
					this.aClass253_4.aClass253_7 = local3;
					this.aClass253_4 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
				if (arg3 != 8) {
					this.method3833(null);
				}
			} catch (@Pc(57) InterruptedException local57) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!um;")
	private Class253 method3837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg2 != 14) {
			Static289.method3839(null, null, 93);
		}
		@Pc(11) Point local11 = arg3.getLocationOnScreen();
		return this.method3831(local11.x + arg0, arg1 + local11.y, null, 14);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method3838(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg0) {
			@Pc(12) Class253 local12 = this.method3836(21, arg1, 0, (byte) 8);
			return (byte[]) local12.anObject9;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class253 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean443) {
						return;
					}
					if (this.aClass253_5 != null) {
						local15 = this.aClass253_5;
						this.aClass253_5 = this.aClass253_5.aClass253_7;
						if (this.aClass253_5 == null) {
							this.aClass253_4 = null;
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
				@Pc(41) int local41 = local15.anInt6670;
				if (local41 == 1) {
					if (Static289.aLong163 > Static183.method2674()) {
						throw new IOException();
					}
					local15.anObject9 = new Socket(InetAddress.getByName((String) local15.anObject10), local15.anInt6668);
				} else if (local41 == 2) {
					@Pc(81) Thread local81 = new Thread((Runnable) local15.anObject10);
					local81.setDaemon(true);
					local81.start();
					local81.setPriority(local15.anInt6668);
					local15.anObject9 = local81;
				} else if (local41 == 4) {
					if (Static183.method2674() < Static289.aLong163) {
						throw new IOException();
					}
					local15.anObject9 = new DataInputStream(((URL) local15.anObject10).openStream());
				} else {
					@Pc(108) Object[] local108;
					if (local41 == 8) {
						local108 = (Object[]) local15.anObject10;
						local15.anObject9 = ((Class) local108[0]).getDeclaredMethod((String) local108[1], (Class[]) local108[2]);
					} else if (local41 == 9) {
						local108 = (Object[]) local15.anObject10;
						local15.anObject9 = ((Class) local108[0]).getDeclaredField((String) local108[1]);
					} else if (local41 == 18) {
						@Pc(155) Clipboard local155 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject9 = local155.getContents(null);
					} else if (local41 == 19) {
						@Pc(139) Transferable local139 = (Transferable) local15.anObject10;
						@Pc(142) Clipboard local142 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local142.setContents(local139, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6669 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt6669 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lclient!um;")
	public Class253 method3840(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method3831(arg1, 0, arg0, 2);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILjava/lang/String;)Lclient!um;")
	public Class253 method3841(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method3831(arg0, 0, arg1, 1);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Lclient!um;")
	public Class253 method3842(@OriginalArg(1) int arg0) {
		return this.method3831(arg0, 0, null, 3);
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(B)Z")
	public boolean method3843() {
		return false;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!um;")
	public Class253 method3844(@OriginalArg(1) Frame arg0) {
		return this.method3831(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)Lclient!mi;")
	public Interface6 method3845() {
		return this.anInterface6_2;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(ZLjava/lang/Class;)Lclient!um;")
	public Class253 method3846(@OriginalArg(1) Class arg0) {
		return this.method3831(0, 0, arg0, 11);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/Class;B)V")
	public void method3847(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(26) Runtime local26 = Runtime.getRuntime();
		@Pc(37) Method local37 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(47) Method local47;
		if (!Static289.aString48.startsWith("mac")) {
			local47 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local37.invoke(local47, Boolean.TRUE);
			local47.invoke(local26, arg0, "jawt");
			local37.invoke(local47, Boolean.FALSE);
		}
		local47 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local37.invoke(local47, Boolean.TRUE);
		if (!Static289.aString48.startsWith("win")) {
			throw new Exception();
		}
		local47.invoke(local26, arg0, this.method3854("sw3d.dll").toString());
		local37.invoke(local47, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Lclient!um;")
	public Class253 method3848() {
		return this.method3831(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!um;")
	private Class253 method3849(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return this.method3831(arg1 ? 1 : 0, 0, arg0, 15);
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(B)V")
	public void method3850() {
		Static289.aLong163 = Static183.method2674() + 5000L;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!um;")
	public Class253 method3851(@OriginalArg(0) URL arg0) {
		return this.method3831(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lclient!um;")
	private Class253 method3852(@OriginalArg(1) Transferable arg0) {
		return this.method3831(0, 0, arg0, 19);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILjava/awt/Point;Ljava/awt/Component;[I)Lclient!um;")
	public Class253 method3853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int[] arg4) {
		return this.method3831(arg1, arg0, new Object[] { arg3, arg4, arg2 }, 17);
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method3854(@OriginalArg(1) String arg0) {
		return Static289.method3839(this.aString45, arg0, this.anInt4839);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIB)Lclient!um;")
	public Class253 method3855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method3831((arg2 << 16) + arg0, arg1 << 16, null, 6);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;BLjava/lang/String;)Lclient!um;")
	public Class253 method3856(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) String arg2) {
		return this.method3831(0, 0, new Object[] { arg1, arg2, arg0 }, 8);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!um;")
	private Class253 method3857(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 <= 93 ? null : this.method3831(0, 0, arg0, 21);
	}
}
