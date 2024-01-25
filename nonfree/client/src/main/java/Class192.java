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

@OriginalClass("client!kk")
public final class Class192 implements Runnable {

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!cr;")
	public Class62 aClass62_2 = null;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "Z")
	public boolean aBoolean389 = false;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "Z")
	private boolean aBoolean388 = false;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "Lclient!cr;")
	public Class62 aClass62_3 = null;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!tj;")
	private Class330 aClass330_4 = null;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "Lclient!cr;")
	public Class62 aClass62_4 = null;

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "Z")
	public boolean aBoolean390 = false;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Lclient!tj;")
	private Class330 aClass330_5 = null;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "[Lclient!cr;")
	public Class62[] aClass62Array1;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "Ljava/lang/Object;")
	private Object anObject4;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "Lclient!fd;")
	private Class105 aClass105_1;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "Lclient!aq;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static295.aString73 = "1.1";
		Static295.anInt4744 = arg0;
		Static295.aString70 = arg1;
		Static295.aString77 = "Unknown";
		this.aBoolean389 = arg3;
		try {
			Static295.aString77 = System.getProperty("java.vendor");
			Static295.aString73 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static295.aString77.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean390 = true;
		}
		try {
			Static295.aString71 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static295.aString71 = "Unknown";
		}
		Static295.aString75 = Static295.aString71.toLowerCase();
		try {
			Static295.aString74 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static295.aString74 = "";
		}
		try {
			Static295.aString76 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static295.aString76 = "";
		}
		try {
			Static295.aString72 = System.getProperty("user.home");
			if (Static295.aString72 != null) {
				Static295.aString72 = Static295.aString72 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static295.aString72 == null) {
			Static295.aString72 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean390) {
			try {
				Static295.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static295.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static6.method115(Static295.anInt4744, Static295.aString70);
		if (this.aBoolean389) {
			this.aClass62_2 = new Class62(Static6.method116(Static295.anInt4744, (String) null, "random.dat"), "rw", 25L);
			this.aClass62_4 = new Class62(Static6.method117("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass62_3 = new Class62(Static6.method117("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass62Array1 = new Class62[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass62Array1[local180] = new Class62(Static6.method117("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean390) {
				try {
					this.anObject4 = Class.forName("Class115").getDeclaredConstructor().newInstance();
				} catch (@Pc(217) Throwable local217) {
				}
			}
			try {
				if (this.aBoolean390) {
					this.aClass105_1 = new Class105();
				} else {
					this.anObject5 = Class.forName("Class111").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(234) Throwable local234) {
			}
			try {
				if (this.aBoolean390) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject6 = Class.forName("Class216").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(250) Throwable local250) {
			}
		}
		if (this.aBoolean389 && !this.aBoolean390) {
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
		this.aBoolean388 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)Lclient!tj;")
	public Class330 method4322(@OriginalArg(0) int arg0) {
		return this.method4327(0, arg0, 3, (Object) null);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Lclient!tj;")
	public Class330 method4323() {
		return this.method4327(0, 0, 5, (Object) null);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZBLjava/lang/String;)Lclient!tj;")
	public Class330 method4324(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		return this.method4327(0, arg0, arg1 ? 22 : 1, arg2);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Z")
	public boolean method4325() {
		if (!this.aBoolean389) {
			return false;
		} else if (this.aBoolean390) {
			return this.aClass105_1 != null;
		} else {
			return this.anObject5 != null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public void method4326() {
		synchronized (this) {
			this.aBoolean388 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass62_4 != null) {
			try {
				this.aClass62_4.method1255();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass62_3 != null) {
			try {
				this.aClass62_3.method1255();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass62Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass62Array1.length; local52++) {
				if (this.aClass62Array1[local52] != null) {
					try {
						this.aClass62Array1[local52].method1255();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass62_2 != null) {
			try {
				this.aClass62_2.method1255();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class330 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean388) {
						return;
					}
					if (this.aClass330_4 != null) {
						local15 = this.aClass330_4;
						this.aClass330_4 = this.aClass330_4.aClass330_9;
						if (this.aClass330_4 == null) {
							this.aClass330_5 = null;
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
				@Pc(41) int local41 = local15.anInt9131;
				if (local41 == 1) {
					if (Static205.method3179() < Static295.aLong148) {
						throw new IOException();
					}
					local15.anObject19 = new Socket(InetAddress.getByName((String) local15.anObject18), local15.anInt9129);
				} else if (local41 == 22) {
					if (Static295.aLong148 > Static205.method3179()) {
						throw new IOException();
					}
					try {
						local15.anObject19 = Static57.method961(local15.anInt9129, (String) local15.anObject18).method2658();
					} catch (@Pc(71) IOException_Sub1 local71) {
						local15.anObject19 = local71.getMessage();
						throw local71;
					}
				} else if (local41 == 2) {
					@Pc(832) Thread local832 = new Thread((Runnable) local15.anObject18);
					local832.setDaemon(true);
					local832.start();
					local832.setPriority(local15.anInt9129);
					local15.anObject19 = local832;
				} else if (local41 == 4) {
					if (Static205.method3179() < Static295.aLong148) {
						throw new IOException();
					}
					local15.anObject19 = new DataInputStream(((URL) local15.anObject18).openStream());
				} else {
					@Pc(94) Object[] local94;
					if (local41 == 8) {
						local94 = (Object[]) local15.anObject18;
						if (this.aBoolean389 && ((Class) local94[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject19 = ((Class) local94[0]).getDeclaredMethod((String) local94[1], (Class[]) local94[2]);
					} else if (local41 == 9) {
						local94 = (Object[]) local15.anObject18;
						if (this.aBoolean389 && ((Class) local94[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject19 = ((Class) local94[0]).getDeclaredField((String) local94[1]);
					} else if (local41 == 18) {
						@Pc(136) Clipboard local136 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject19 = local136.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(765) Transferable local765 = (Transferable) local15.anObject18;
						@Pc(768) Clipboard local768 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local768.setContents(local765, (ClipboardOwner) null);
					} else if (this.aBoolean389) {
						@Pc(205) String local205;
						if (local41 == 3) {
							if (Static295.aLong148 > Static205.method3179()) {
								throw new IOException();
							}
							local205 = (local15.anInt9129 >> 24 & 0xFF) + "." + (local15.anInt9129 >> 16 & 0xFF) + "." + (local15.anInt9129 >> 8 & 0xFF) + "." + (local15.anInt9129 & 0xFF);
							local15.anObject19 = InetAddress.getByName(local205).getHostName();
						} else if (local41 == 21) {
							if (Static295.aLong148 > Static205.method3179()) {
								throw new IOException();
							}
							local15.anObject19 = InetAddress.getByName((String) local15.anObject18).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean390) {
								local15.anObject19 = this.aClass105_1.method2176();
							} else {
								local15.anObject19 = Class.forName("Class111").getMethod("listmodes").invoke(this.anObject5);
							}
						} else if (local41 == 6) {
							@Pc(229) Frame local229 = new Frame("Jagex Full Screen");
							local15.anObject19 = local229;
							local229.setResizable(false);
							if (this.aBoolean390) {
								this.aClass105_1.method2178(local229, local15.anInt9130 >> 16, local15.anInt9130 & 0xFFFF, local15.anInt9129 & 0xFFFF, local15.anInt9129 >>> 16);
							} else {
								Class.forName("Class111").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject5, local229, Integer.valueOf(local15.anInt9129 >>> 16), new Integer(local15.anInt9129 & 0xFFFF), Integer.valueOf(local15.anInt9130 >> 16), new Integer(local15.anInt9130 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(384) Class62 local384;
							if (local41 == 12) {
								local384 = Static295.method4333(Static295.aString70, Static295.anInt4744, (String) local15.anObject18);
								local15.anObject19 = local384;
							} else if (local41 == 13) {
								local384 = Static295.method4333("", Static295.anInt4744, (String) local15.anObject18);
								local15.anObject19 = local384;
							} else if (this.aBoolean389 && local41 == 14) {
								@Pc(404) int local404 = local15.anInt9129;
								@Pc(407) int local407 = local15.anInt9130;
								if (this.aBoolean390) {
									this.aCallback_Sub1_1.method496(local404, local407);
								} else {
									Class.forName("Class216").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject6, Integer.valueOf(local404), new Integer(local407));
								}
							} else if (this.aBoolean389 && local41 == 15) {
								@Pc(468) boolean local468 = local15.anInt9129 != 0;
								@Pc(472) Component local472 = (Component) local15.anObject18;
								if (this.aBoolean390) {
									this.aCallback_Sub1_1.method495(local472, local468);
								} else {
									Class.forName("Class216").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject6, local472, Boolean.valueOf(local468));
								}
							} else if (!this.aBoolean390 && local41 == 17) {
								local94 = (Object[]) local15.anObject18;
								Class.forName("Class216").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject6, (Component) local94[0], (int[]) local94[1], Integer.valueOf(local15.anInt9129), new Integer(local15.anInt9130), (Point) local94[2]);
							} else if (local41 == 16) {
								try {
									if (!Static295.aString75.startsWith("win")) {
										throw new Exception();
									}
									local205 = (String) local15.anObject18;
									if (!local205.startsWith("http://") && !local205.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(653) String local653 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(655) int local655 = 0; local655 < local205.length(); local655++) {
										if (local653.indexOf(local205.charAt(local655)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local205 + "\"");
									local15.anObject19 = null;
								} catch (@Pc(689) Exception local689) {
									local15.anObject19 = local689;
									throw local689;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean390) {
							this.aClass105_1.method2177((Frame) local15.anObject18);
						} else {
							Class.forName("Class111").getMethod("exit").invoke(this.anObject5);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt9132 = 1;
			} catch (@Pc(870) ThreadDeath local870) {
				throw local870;
			} catch (@Pc(873) Throwable local873) {
				local15.anInt9132 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBIILjava/lang/Object;)Lclient!tj;")
	private Class330 method4327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(11) Class330 local11 = new Class330();
		local11.anInt9130 = arg0;
		local11.anObject18 = arg3;
		local11.anInt9129 = arg1;
		local11.anInt9131 = arg2;
		synchronized (this) {
			if (this.aClass330_5 == null) {
				this.aClass330_5 = this.aClass330_4 = local11;
			} else {
				this.aClass330_5.aClass330_9 = local11;
				this.aClass330_5 = local11;
			}
			this.notify();
			return local11;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([BLjava/io/File;I)Z")
	public boolean method4328(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lclient!tj;")
	public Class330 method4329(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method4327(0, 0, 9, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!tj;")
	public Class330 method4331(@OriginalArg(0) String arg0) {
		return this.method4327(0, 0, 16, arg0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!tj;")
	public Class330 method4332(@OriginalArg(2) String arg0) {
		return this.method4327(0, 0, 12, arg0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!tj;")
	public Class330 method4334(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method4327(0, arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	public void method4335() {
		Static295.aLong148 = Static205.method3179() + 5000L;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)Lclient!tj;")
	public Class330 method4336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method4327(arg2 << 16, arg1 + (arg0 << 16), 6, (Object) null);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!tj;")
	public Class330 method4337(@OriginalArg(0) URL arg0) {
		return this.method4327(0, 0, 4, arg0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lclient!tj;")
	public Class330 method4338(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method4327(0, 0, 8, new Object[] { arg0, arg1, arg2 });
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!tj;")
	public Class330 method4339(@OriginalArg(1) Frame arg0) {
		return this.method4327(0, 0, 7, arg0);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method4340() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/awt/Component;ZILjava/awt/Point;I[I)Lclient!tj;")
	public Class330 method4341(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		return this.method4327(arg1, arg3, 17, new Object[] { arg0, arg4, arg2 });
	}
}
