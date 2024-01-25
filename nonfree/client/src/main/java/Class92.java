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
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Z")
	public boolean aBoolean170 = false;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!th;")
	private Class338 aClass338_2 = null;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Lclient!ro;")
	public Class312 aClass312_2 = null;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "Lclient!ro;")
	public Class312 aClass312_3 = null;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!th;")
	private Class338 aClass338_1 = null;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!ro;")
	public Class312 aClass312_1 = null;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "[Lclient!ro;")
	public Class312[] aClass312Array1;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Ljava/lang/Object;")
	private Object anObject4;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!rk;")
	private Class309 aClass309_1;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!tg;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static126.aString38 = "Unknown";
		this.aBoolean172 = arg3;
		Static126.aString37 = arg1;
		Static126.aString40 = "1.1";
		Static126.anInt2223 = arg0;
		try {
			Static126.aString38 = System.getProperty("java.vendor");
			Static126.aString40 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static126.aString38.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean170 = true;
		}
		try {
			Static126.aString33 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static126.aString33 = "Unknown";
		}
		Static126.aString34 = Static126.aString33.toLowerCase();
		try {
			Static126.aString39 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static126.aString39 = "";
		}
		try {
			Static126.aString35 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static126.aString35 = "";
		}
		try {
			Static126.aString36 = System.getProperty("user.home");
			if (Static126.aString36 != null) {
				Static126.aString36 = Static126.aString36 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static126.aString36 == null) {
			Static126.aString36 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean170) {
			try {
				Static126.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static126.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static658.method8790(Static126.aString37, Static126.anInt2223);
		if (this.aBoolean172) {
			this.aClass312_3 = new Class312(Static658.method8791((String) null, Static126.anInt2223, "random.dat"), "rw", 25L);
			this.aClass312_2 = new Class312(Static658.method8789("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass312_1 = new Class312(Static658.method8789("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass312Array1 = new Class312[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass312Array1[local180] = new Class312(Static658.method8789("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean170) {
				try {
					this.anObject4 = Class.forName("Class68").getDeclaredConstructor().newInstance();
				} catch (@Pc(217) Throwable local217) {
				}
			}
			try {
				if (this.aBoolean170) {
					this.aClass309_1 = new Class309();
				} else {
					this.anObject5 = Class.forName("Class198").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(234) Throwable local234) {
			}
			try {
				if (this.aBoolean170) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject6 = Class.forName("Class375").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(250) Throwable local250) {
			}
		}
		if (this.aBoolean172 && !this.aBoolean170) {
			@Pc(260) ThreadGroup local260 = Thread.currentThread().getThreadGroup();
			for (@Pc(263) ThreadGroup local263 = local260.getParent(); local263 != null; local263 = local263.getParent()) {
				local260 = local263;
			}
			@Pc(274) Thread[] local274 = new Thread[1000];
			local260.enumerate(local274);
			for (@Pc(280) int local280 = 0; local280 < local274.length; local280++) {
				if (local274[local280] != null && local274[local280].getName().startsWith("AWT")) {
					local274[local280].setPriority(1);
				}
			}
		}
		this.aBoolean171 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z")
	public boolean method1869() {
		if (!this.aBoolean172) {
			return false;
		} else if (this.aBoolean170) {
			return this.aClass309_1 != null;
		} else {
			return this.anObject5 != null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	public void method1870() {
		Static126.aLong64 = Static15.method380() + 5000L;
	}

	@OriginalMember(owner = "client!ec", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class338 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean171) {
						return;
					}
					if (this.aClass338_1 != null) {
						local15 = this.aClass338_1;
						this.aClass338_1 = this.aClass338_1.aClass338_13;
						if (this.aClass338_1 == null) {
							this.aClass338_2 = null;
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
				@Pc(41) int local41 = local15.anInt9318;
				if (local41 == 1) {
					if (Static15.method380() < Static126.aLong64) {
						throw new IOException();
					}
					local15.anObject18 = new Socket(InetAddress.getByName((String) local15.anObject17), local15.anInt9319);
				} else if (local41 == 22) {
					if (Static126.aLong64 > Static15.method380()) {
						throw new IOException();
					}
					try {
						local15.anObject18 = Static147.method2356((String) local15.anObject17, local15.anInt9319).method4072();
					} catch (@Pc(75) IOException_Sub1 local75) {
						local15.anObject18 = local75.getMessage();
						throw local75;
					}
				} else if (local41 == 2) {
					@Pc(93) Thread local93 = new Thread((Runnable) local15.anObject17);
					local93.setDaemon(true);
					local93.start();
					local93.setPriority(local15.anInt9319);
					local15.anObject18 = local93;
				} else if (local41 == 4) {
					if (Static15.method380() < Static126.aLong64) {
						throw new IOException();
					}
					local15.anObject18 = new DataInputStream(((URL) local15.anObject17).openStream());
				} else {
					@Pc(139) Object[] local139;
					if (local41 == 8) {
						local139 = (Object[]) local15.anObject17;
						if (this.aBoolean172 && ((Class) local139[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject18 = ((Class) local139[0]).getDeclaredMethod((String) local139[1], (Class[]) local139[2]);
					} else if (local41 == 9) {
						local139 = (Object[]) local15.anObject17;
						if (this.aBoolean172 && ((Class) local139[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject18 = ((Class) local139[0]).getDeclaredField((String) local139[1]);
					} else if (local41 == 18) {
						@Pc(835) Clipboard local835 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject18 = local835.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(212) Transferable local212 = (Transferable) local15.anObject17;
						@Pc(215) Clipboard local215 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local215.setContents(local212, (ClipboardOwner) null);
					} else if (this.aBoolean172) {
						@Pc(549) String local549;
						if (local41 == 3) {
							if (Static126.aLong64 > Static15.method380()) {
								throw new IOException();
							}
							local549 = (local15.anInt9319 >> 24 & 0xFF) + "." + (local15.anInt9319 >> 16 & 0xFF) + "." + (local15.anInt9319 >> 8 & 0xFF) + "." + (local15.anInt9319 & 0xFF);
							local15.anObject18 = InetAddress.getByName(local549).getHostName();
						} else if (local41 == 21) {
							if (Static15.method380() < Static126.aLong64) {
								throw new IOException();
							}
							local15.anObject18 = InetAddress.getByName((String) local15.anObject17).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean170) {
								local15.anObject18 = this.aClass309_1.method6831();
							} else {
								local15.anObject18 = Class.forName("Class198").getMethod("listmodes").invoke(this.anObject5);
							}
						} else if (local41 == 6) {
							@Pc(287) Frame local287 = new Frame("Jagex Full Screen");
							local15.anObject18 = local287;
							local287.setResizable(false);
							if (this.aBoolean170) {
								this.aClass309_1.method6829(local287, local15.anInt9320 & 0xFFFF, local15.anInt9319 >>> 16, local15.anInt9319 & 0xFFFF, local15.anInt9320 >> 16);
							} else {
								Class.forName("Class198").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject5, local287, Integer.valueOf(local15.anInt9319 >>> 16), new Integer(local15.anInt9319 & 0xFFFF), Integer.valueOf(local15.anInt9320 >> 16), new Integer(local15.anInt9320 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(442) Class312 local442;
							if (local41 == 12) {
								local442 = Static126.method1872(Static126.anInt2223, (String) local15.anObject17, Static126.aString37);
								local15.anObject18 = local442;
							} else if (local41 == 13) {
								local442 = Static126.method1872(Static126.anInt2223, (String) local15.anObject17, "");
								local15.anObject18 = local442;
							} else if (this.aBoolean172 && local41 == 14) {
								@Pc(472) int local472 = local15.anInt9319;
								@Pc(475) int local475 = local15.anInt9320;
								if (this.aBoolean170) {
									this.aCallback_Sub1_1.method7531(local475, local472);
								} else {
									Class.forName("Class375").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject6, Integer.valueOf(local472), new Integer(local475));
								}
							} else if (this.aBoolean172 && local41 == 15) {
								@Pc(718) boolean local718 = local15.anInt9319 != 0;
								@Pc(722) Component local722 = (Component) local15.anObject17;
								if (this.aBoolean170) {
									this.aCallback_Sub1_1.method7530(local722, local718);
								} else {
									Class.forName("Class375").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject6, local722, Boolean.valueOf(local718));
								}
							} else if (!this.aBoolean170 && local41 == 17) {
								local139 = (Object[]) local15.anObject17;
								Class.forName("Class375").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject6, (Component) local139[0], (int[]) local139[1], Integer.valueOf(local15.anInt9319), new Integer(local15.anInt9320), (Point) local139[2]);
							} else if (local41 == 16) {
								try {
									if (!Static126.aString34.startsWith("win")) {
										throw new Exception();
									}
									local549 = (String) local15.anObject17;
									if (!local549.startsWith("http://") && !local549.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(563) String local563 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(565) int local565 = 0; local565 < local549.length(); local565++) {
										if (local563.indexOf(local549.charAt(local565)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local549 + "\"");
									local15.anObject18 = null;
								} catch (@Pc(603) Exception local603) {
									local15.anObject18 = local603;
									throw local603;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean170) {
							this.aClass309_1.method6830((Frame) local15.anObject17);
						} else {
							Class.forName("Class198").getMethod("exit").invoke(this.anObject5);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt9321 = 1;
			} catch (@Pc(866) ThreadDeath local866) {
				throw local866;
			} catch (@Pc(869) Throwable local869) {
				local15.anInt9321 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!th;")
	public Class338 method1871(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1886(arg1, 0, 2, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIILjava/lang/String;)Lclient!th;")
	public Class338 method1873(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method1886(arg1, 0, arg0 ? 22 : 1, arg2);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Point;Ljava/awt/Component;[IIII)Lclient!th;")
	public Class338 method1874(@OriginalArg(0) Point arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method1886(arg4, arg3, 17, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!th;")
	public Class338 method1875(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method1886(0, 0, 8, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Lclient!th;")
	public Class338 method1876(@OriginalArg(1) int arg0) {
		return this.method1886(arg0, 0, 3, (Object) null);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Lclient!th;")
	public Class338 method1877() {
		return this.method1886(0, 0, 5, (Object) null);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/net/URL;)Lclient!th;")
	public Class338 method1879(@OriginalArg(1) URL arg0) {
		return this.method1886(0, 0, 4, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLjava/lang/String;Z)Lclient!th;")
	public Class338 method1880(@OriginalArg(1) String arg0) {
		return this.method1886(0, 0, 12, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!th;")
	public Class338 method1881(@OriginalArg(0) String arg0) {
		return this.method1886(0, 0, 16, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public void method1882() {
		synchronized (this) {
			this.aBoolean171 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass312_2 != null) {
			try {
				this.aClass312_2.method6838();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass312_1 != null) {
			try {
				this.aClass312_1.method6838();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass312Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass312Array1.length; local53++) {
				if (this.aClass312Array1[local53] != null) {
					try {
						this.aClass312Array1[local53].method6838();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass312_3 != null) {
			try {
				this.aClass312_3.method6838();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB)Lclient!th;")
	public Class338 method1883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method1886((arg0 << 16) + arg2, arg1 << 16, 6, (Object) null);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!th;")
	public Class338 method1884(@OriginalArg(1) Frame arg0) {
		return this.method1886(0, 0, 7, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!th;")
	public Class338 method1885(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method1886(0, 0, 9, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILjava/lang/Object;B)Lclient!th;")
	private Class338 method1886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3) {
		@Pc(3) Class338 local3 = new Class338();
		local3.anInt9320 = arg1;
		local3.anObject17 = arg3;
		local3.anInt9319 = arg0;
		local3.anInt9318 = arg2;
		synchronized (this) {
			if (this.aClass338_2 == null) {
				this.aClass338_2 = this.aClass338_1 = local3;
			} else {
				this.aClass338_2.aClass338_13 = local3;
				this.aClass338_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BILjava/io/File;)Z")
	public boolean method1887(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method1888() {
		return this.anObject4;
	}
}
