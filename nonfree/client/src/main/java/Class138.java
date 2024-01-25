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

@OriginalClass("client!kj")
public final class Class138 implements Runnable {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "[Lclient!jo;")
	public Class133[] aClass133Array1;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Lclient!pu;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "Lclient!jo;")
	public Class133 aClass133_3 = null;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "Lclient!jo;")
	public Class133 aClass133_2 = null;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "Lclient!jo;")
	public Class133 aClass133_4 = null;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "Z")
	private boolean aBoolean266 = false;

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "Lclient!gu;")
	private Class100 aClass100_6 = null;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "Lclient!gu;")
	private Class100 aClass100_5 = null;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "Ljava/lang/String;")
	private final String aString30;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	private final int anInt3859;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class138(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString30 = arg2;
		this.anInt3859 = arg1;
		this.anApplet1 = arg0;
		Static210.aString27 = "Unknown";
		Static210.aString31 = "1.1";
		try {
			Static210.aString27 = System.getProperty("java.vendor");
			Static210.aString31 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static210.aString26 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static210.aString26 = "Unknown";
		}
		Static210.aString25 = Static210.aString26.toLowerCase();
		try {
			Static210.aString29 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static210.aString29 = "";
		}
		try {
			Static210.aString24 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static210.aString24 = "";
		}
		try {
			Static210.aString28 = System.getProperty("user.home");
			if (Static210.aString28 != null) {
				Static210.aString28 = Static210.aString28 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static210.aString28 == null) {
			Static210.aString28 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static210.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static210.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static210.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static210.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean266 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!gu;")
	public Class100 method3194(@OriginalArg(0) String arg0) {
		return this.method3207(0, 0, 4, 16, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Lclient!gu;")
	public Class100 method3195(@OriginalArg(0) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method3207(0, 0, 4, 8, new Object[] { arg2, arg1, arg0 });
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;II[II)Lclient!gu;")
	public Class100 method3196(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		return this.method3207(arg2, arg4, 4, 17, new Object[] { arg0, arg3, arg1 });
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!gu;")
	public Class100 method3197(@OriginalArg(1) URL arg0) {
		return this.method3207(0, 0, 4, 4, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!gu;")
	public Class100 method3198(@OriginalArg(0) Class arg0) {
		return this.method3207(0, 0, 4, 20, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;)Lclient!gu;")
	private Class100 method3199(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 <= 87 ? null : this.method3207(0, 0, 4, 21, arg1);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public void method3200() {
		Static210.aLong119 = Static101.method1557() + 5000L;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!gu;")
	private Class100 method3201(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		return arg3 == 0 ? this.method3207(arg1 + local2.x, arg2 + local2.y, arg3 ^ 0x4, 14, null) : null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!gu;")
	public Class100 method3202(@OriginalArg(1) Class arg0) {
		return this.method3207(0, 0, 4, 11, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)Lclient!gu;")
	private Class100 method3204(@OriginalArg(0) byte arg0) {
		return arg0 == 71 ? this.method3207(0, 0, 4, 18, null) : null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!gu;")
	public Class100 method3205(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method3207(arg0, 0, 4, 1, arg1);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!gu;")
	public Class100 method3206(@OriginalArg(0) Frame arg0) {
		return this.method3207(0, 0, 4, 7, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!gu;")
	private Class100 method3207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class100 local3 = new Class100();
		local3.anInt2363 = arg0;
		local3.anObject3 = arg4;
		local3.anInt2364 = arg3;
		synchronized (this) {
			if (this.aClass100_5 == null) {
				this.aClass100_5 = this.aClass100_6 = local3;
			} else {
				this.aClass100_5.aClass100_1 = local3;
				this.aClass100_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!gu;")
	private Class100 method3208(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class100 local3 = new Class100();
		synchronized (local3) {
			local3.anInt2364 = arg2;
			local3.anInt2363 = arg3;
			local3.anObject3 = arg1;
			synchronized (this) {
				if (this.aClass100_5 == null) {
					this.aClass100_5 = this.aClass100_6 = local3;
				} else {
					this.aClass100_5.aClass100_1 = local3;
					this.aClass100_5 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
				if (arg0 != 3969) {
					this.anInterface10_1 = null;
				}
			} catch (@Pc(55) InterruptedException local55) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)Z")
	public boolean method3209() {
		return false;
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
	public void method3210() {
		synchronized (this) {
			this.aBoolean266 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass133_3 != null) {
			try {
				this.aClass133_3.method3023();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass133_4 != null) {
			try {
				this.aClass133_4.method3023();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass133Array1 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aClass133Array1.length; local51++) {
				if (this.aClass133Array1[local51] != null) {
					try {
						this.aClass133Array1[local51].method3023();
					} catch (@Pc(65) IOException local65) {
					}
				}
			}
		}
		if (this.aClass133_2 != null) {
			try {
				this.aClass133_2.method3023();
			} catch (@Pc(81) IOException local81) {
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(BLjava/lang/Class;)V")
	public void method3211(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!Static210.aString25.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local29.invoke(local39, Boolean.TRUE);
			local39.invoke(local18, arg0, "jawt");
			local29.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local29.invoke(local39, Boolean.TRUE);
		if (!Static210.aString25.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local18, arg0, this.method3213("sw3d.dll").toString());
		local29.invoke(local39, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!kj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class100 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean266) {
						return;
					}
					if (this.aClass100_6 != null) {
						local15 = this.aClass100_6;
						this.aClass100_6 = this.aClass100_6.aClass100_1;
						if (this.aClass100_6 == null) {
							this.aClass100_5 = null;
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
				@Pc(41) int local41 = local15.anInt2364;
				if (local41 == 1) {
					if (Static101.method1557() < Static210.aLong119) {
						throw new IOException();
					}
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt2363);
				} else if (local41 == 2) {
					@Pc(158) Thread local158 = new Thread((Runnable) local15.anObject3);
					local158.setDaemon(true);
					local158.start();
					local158.setPriority(local15.anInt2363);
					local15.anObject4 = local158;
				} else if (local41 == 4) {
					if (Static101.method1557() < Static210.aLong119) {
						throw new IOException();
					}
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(100) Object[] local100;
					if (local41 == 8) {
						local100 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local100[0]).getDeclaredMethod((String) local100[1], (Class[]) local100[2]);
					} else if (local41 == 9) {
						local100 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local100[0]).getDeclaredField((String) local100[1]);
					} else if (local41 == 18) {
						@Pc(70) Clipboard local70 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject4 = local70.getContents(null);
					} else if (local41 == 19) {
						@Pc(88) Transferable local88 = (Transferable) local15.anObject3;
						@Pc(91) Clipboard local91 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local91.setContents(local88, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2365 = 1;
			} catch (@Pc(196) ThreadDeath local196) {
				throw local196;
			} catch (@Pc(199) Throwable local199) {
				local15.anInt2365 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)Lclient!pu;")
	public Interface10 method3212() {
		return this.anInterface10_1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method3213(@OriginalArg(1) String arg0) {
		return Static210.method3203(this.aString30, this.anInt3859, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method3214(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class100 local7 = this.method3208(3969, arg0, 21, 0);
		return arg1 == -16 ? (byte[]) local7.anObject4 : null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)Lclient!gu;")
	public Class100 method3215() {
		return this.method3207(0, 0, 4, 5, null);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/lang/String;)Lclient!gu;")
	public Class100 method3216(@OriginalArg(1) String arg0) {
		return this.method3207(0, 0, 4, 12, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!gu;")
	private Class100 method3217(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != -98) {
			Static210.aHashtable2 = null;
		}
		return this.method3207(arg2 ? 1 : 0, 0, 4, 15, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!gu;")
	public Class100 method3218(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method3207(0, 0, 4, 9, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!gu;")
	private Class100 method3219(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -13915) {
			this.method3194(null);
		}
		return this.method3207(0, 0, 4, 19, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!gu;")
	public Class100 method3220(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method3207(arg0, 0, 4, 2, arg1);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lclient!gu;")
	public Class100 method3221(@OriginalArg(0) int arg0) {
		return this.method3207(arg0, 0, 4, 3, null);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBIII)Lclient!gu;")
	public Class100 method3222(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3207(arg0 + (arg2 << 16), arg1 << 16, 4, 6, null);
	}
}
