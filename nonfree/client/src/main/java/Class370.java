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

@OriginalClass("client!wea")
public final class Class370 implements Runnable {

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "Lclient!so;")
	public Class320 aClass320_2 = null;

	@OriginalMember(owner = "client!wea", name = "j", descriptor = "Lclient!so;")
	public Class320 aClass320_3 = null;

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "Z")
	public boolean aBoolean739 = false;

	@OriginalMember(owner = "client!wea", name = "w", descriptor = "Lclient!of;")
	private Class240 aClass240_15 = null;

	@OriginalMember(owner = "client!wea", name = "z", descriptor = "Z")
	private boolean aBoolean741 = false;

	@OriginalMember(owner = "client!wea", name = "m", descriptor = "Lclient!so;")
	public Class320 aClass320_4 = null;

	@OriginalMember(owner = "client!wea", name = "s", descriptor = "Z")
	public boolean aBoolean740 = false;

	@OriginalMember(owner = "client!wea", name = "v", descriptor = "Lclient!of;")
	private Class240 aClass240_14 = null;

	@OriginalMember(owner = "client!wea", name = "x", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!wea", name = "t", descriptor = "[Lclient!so;")
	public Class320[] aClass320Array1;

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "Ljava/lang/Object;")
	private Object anObject18;

	@OriginalMember(owner = "client!wea", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!wea", name = "A", descriptor = "Lclient!nt;")
	private Class231 aClass231_1;

	@OriginalMember(owner = "client!wea", name = "p", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "Lclient!lq;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!wea", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class370(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static623.aString114 = arg1;
		this.aBoolean739 = arg3;
		Static623.aString115 = "1.1";
		Static623.aString112 = "Unknown";
		Static623.anInt10877 = arg0;
		try {
			Static623.aString112 = System.getProperty("java.vendor");
			Static623.aString115 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static623.aString112.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean740 = true;
		}
		try {
			Static623.aString113 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static623.aString113 = "Unknown";
		}
		Static623.aString117 = Static623.aString113.toLowerCase();
		try {
			Static623.aString111 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static623.aString111 = "";
		}
		try {
			Static623.aString110 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static623.aString110 = "";
		}
		try {
			Static623.aString116 = System.getProperty("user.home");
			if (Static623.aString116 != null) {
				Static623.aString116 = Static623.aString116 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static623.aString116 == null) {
			Static623.aString116 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean740) {
			try {
				Static623.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static623.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static53.method1775(Static623.aString114, Static623.anInt10877);
		if (this.aBoolean739) {
			this.aClass320_4 = new Class320(Static53.method1774(Static623.anInt10877, "random.dat", null), "rw", 25L);
			this.aClass320_3 = new Class320(Static53.method1776("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass320_2 = new Class320(Static53.method1776("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass320Array1 = new Class320[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass320Array1[local181] = new Class320(Static53.method1776("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean740) {
				try {
					this.anObject18 = Class.forName("Class4").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean740) {
					this.aClass231_1 = new Class231();
				} else {
					this.anObject20 = Class.forName("Class122").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean740) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject19 = Class.forName("Class259").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean739 && !this.aBoolean740) {
			@Pc(261) ThreadGroup local261 = Thread.currentThread().getThreadGroup();
			for (@Pc(264) ThreadGroup local264 = local261.getParent(); local264 != null; local264 = local264.getParent()) {
				local261 = local264;
			}
			@Pc(275) Thread[] local275 = new Thread[1000];
			local261.enumerate(local275);
			for (@Pc(281) int local281 = 0; local281 < local275.length; local281++) {
				if (local275[local281] != null && local275[local281].getName().startsWith("AWT")) {
					local275[local281].setPriority(1);
				}
			}
		}
		this.aBoolean741 = false;
		this.aThread7 = new Thread(this);
		this.aThread7.setPriority(10);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIIB)Lclient!of;")
	public Class240 method9064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method9081(arg1 << 16, 6, arg0 + (arg2 << 16), null);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!of;")
	public Class240 method9065(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method9081(0, 8, 0, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)Lclient!of;")
	public Class240 method9067(@OriginalArg(1) int arg0) {
		return this.method9081(0, 3, arg0, null);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(BLjava/lang/String;Z)Lclient!of;")
	public Class240 method9068(@OriginalArg(1) String arg0) {
		return this.method9081(0, 12, 0, arg0);
	}

	@OriginalMember(owner = "client!wea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class240 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean741) {
						return;
					}
					if (this.aClass240_14 != null) {
						local15 = this.aClass240_14;
						this.aClass240_14 = this.aClass240_14.aClass240_11;
						if (this.aClass240_14 == null) {
							this.aClass240_15 = null;
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
				@Pc(41) int local41 = local15.anInt7565;
				if (local41 == 1) {
					if (Static277.method5091() < Static623.aLong272) {
						throw new IOException();
					}
					local15.anObject13 = new Socket(InetAddress.getByName((String) local15.anObject12), local15.anInt7568);
				} else if (local41 == 22) {
					if (Static277.method5091() < Static623.aLong272) {
						throw new IOException();
					}
					try {
						local15.anObject13 = Static276.method5085(local15.anInt7568, (String) local15.anObject12).method4584();
					} catch (@Pc(834) IOException_Sub1 local834) {
						local15.anObject13 = local834.getMessage();
						throw local834;
					}
				} else if (local41 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local15.anObject12);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local15.anInt7568);
					local15.anObject13 = local59;
				} else if (local41 == 4) {
					if (Static623.aLong272 > Static277.method5091()) {
						throw new IOException();
					}
					local15.anObject13 = new DataInputStream(((URL) local15.anObject12).openStream());
				} else {
					@Pc(403) Object[] local403;
					if (local41 == 8) {
						local403 = (Object[]) local15.anObject12;
						if (this.aBoolean739 && ((Class) local403[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local403[0]).getDeclaredMethod((String) local403[1], (Class[]) local403[2]);
					} else if (local41 == 9) {
						local403 = (Object[]) local15.anObject12;
						if (this.aBoolean739 && ((Class) local403[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local403[0]).getDeclaredField((String) local403[1]);
					} else if (local41 == 18) {
						@Pc(740) Clipboard local740 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject13 = local740.getContents(null);
					} else if (local41 == 19) {
						@Pc(118) Transferable local118 = (Transferable) local15.anObject12;
						@Pc(121) Clipboard local121 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local121.setContents(local118, null);
					} else if (this.aBoolean739) {
						@Pc(180) String local180;
						if (local41 == 3) {
							if (Static623.aLong272 > Static277.method5091()) {
								throw new IOException();
							}
							local180 = (local15.anInt7568 >> 24 & 0xFF) + "." + (local15.anInt7568 >> 16 & 0xFF) + "." + (local15.anInt7568 >> 8 & 0xFF) + "." + (local15.anInt7568 & 0xFF);
							local15.anObject13 = InetAddress.getByName(local180).getHostName();
						} else if (local41 == 21) {
							if (Static277.method5091() < Static623.aLong272) {
								throw new IOException();
							}
							local15.anObject13 = InetAddress.getByName((String) local15.anObject12).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean740) {
								local15.anObject13 = this.aClass231_1.method6298();
							} else {
								local15.anObject13 = Class.forName("Class122").getMethod("listmodes").invoke(this.anObject20);
							}
						} else if (local41 == 6) {
							@Pc(593) Frame local593 = new Frame("Jagex Full Screen");
							local15.anObject13 = local593;
							local593.setResizable(false);
							if (this.aBoolean740) {
								this.aClass231_1.method6299(local15.anInt7568 & 0xFFFF, local15.anInt7567 >> 16, local15.anInt7568 >>> 16, local15.anInt7567 & 0xFFFF, local593);
							} else {
								Class.forName("Class122").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject20, local593, Integer.valueOf(local15.anInt7568 >>> 16), new Integer(local15.anInt7568 & 0xFFFF), Integer.valueOf(local15.anInt7567 >> 16), new Integer(local15.anInt7567 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(254) Class320 local254;
							if (local41 == 12) {
								local254 = Static623.method9076((String) local15.anObject12, Static623.aString114, Static623.anInt10877);
								local15.anObject13 = local254;
							} else if (local41 == 13) {
								local254 = Static623.method9076((String) local15.anObject12, "", Static623.anInt10877);
								local15.anObject13 = local254;
							} else if (this.aBoolean739 && local41 == 14) {
								@Pc(272) int local272 = local15.anInt7568;
								@Pc(275) int local275 = local15.anInt7567;
								if (this.aBoolean740) {
									this.aCallback_Sub1_1.method5704(local272, local275);
								} else {
									Class.forName("Class259").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject19, Integer.valueOf(local272), new Integer(local275));
								}
							} else if (this.aBoolean739 && local41 == 15) {
								@Pc(338) boolean local338 = local15.anInt7568 != 0;
								@Pc(342) Component local342 = (Component) local15.anObject12;
								if (this.aBoolean740) {
									this.aCallback_Sub1_1.method5705(local338, local342);
								} else {
									Class.forName("Class259").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject19, local342, Boolean.valueOf(local338));
								}
							} else if (!this.aBoolean740 && local41 == 17) {
								local403 = (Object[]) local15.anObject12;
								Class.forName("Class259").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject19, (Component) local403[0], (int[]) local403[1], Integer.valueOf(local15.anInt7568), new Integer(local15.anInt7567), (Point) local403[2]);
							} else if (local41 == 16) {
								try {
									if (!Static623.aString117.startsWith("win")) {
										throw new Exception();
									}
									local180 = (String) local15.anObject12;
									if (!local180.startsWith("http://") && !local180.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(525) String local525 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(527) int local527 = 0; local180.length() > local527; local527++) {
										if (local525.indexOf(local180.charAt(local527)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local180 + "\"");
									local15.anObject13 = null;
								} catch (@Pc(566) Exception local566) {
									local15.anObject13 = local566;
									throw local566;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean740) {
							this.aClass231_1.method6300((Frame) local15.anObject12);
						} else {
							Class.forName("Class122").getMethod("exit").invoke(this.anObject20);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt7566 = 1;
			} catch (@Pc(869) ThreadDeath local869) {
				throw local869;
			} catch (@Pc(872) Throwable local872) {
				local15.anInt7566 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
	public void method9069() {
		synchronized (this) {
			this.aBoolean741 = true;
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass320_3 != null) {
			try {
				this.aClass320_3.method7905();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass320_2 != null) {
			try {
				this.aClass320_2.method7905();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass320Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass320Array1.length; local50++) {
				if (this.aClass320Array1[local50] != null) {
					try {
						this.aClass320Array1[local50].method7905();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass320_4 != null) {
			try {
				this.aClass320_4.method7905();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZILjava/lang/String;I)Lclient!of;")
	public Class240 method9070(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return this.method9081(0, arg0 ? 22 : 1, arg1, arg2);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!of;")
	public Class240 method9071(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method9081(0, 2, arg1, arg0);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!of;")
	public Class240 method9072(@OriginalArg(0) URL arg0) {
		return this.method9081(0, 4, 0, arg0);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[IILjava/awt/Point;Ljava/awt/Component;I)Lclient!of;")
	public Class240 method9073(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		return this.method9081(arg0, 17, arg4, new Object[] { arg3, arg1, arg2 });
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
	public void method9074() {
		Static623.aLong272 = Static277.method5091() + 5000L;
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)Lclient!of;")
	public Class240 method9075() {
		return this.method9081(0, 5, 0, null);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "([BBLjava/io/File;)Z")
	public boolean method9077(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!of;")
	public Class240 method9078(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method9081(0, 9, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method9079() {
		return this.anObject18;
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!of;")
	public Class240 method9080(@OriginalArg(0) String arg0) {
		return this.method9081(0, 16, 0, arg0);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!of;")
	private Class240 method9081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class240 local3 = new Class240();
		local3.anObject12 = arg3;
		local3.anInt7567 = arg0;
		local3.anInt7565 = arg1;
		local3.anInt7568 = arg2;
		synchronized (this) {
			if (this.aClass240_15 == null) {
				this.aClass240_15 = this.aClass240_14 = local3;
			} else {
				this.aClass240_15.aClass240_11 = local3;
				this.aClass240_15 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "(I)Z")
	public boolean method9082() {
		if (!this.aBoolean739) {
			return false;
		} else if (this.aBoolean740) {
			return this.aClass231_1 != null;
		} else {
			return this.anObject20 != null;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!of;")
	public Class240 method9083(@OriginalArg(1) Frame arg0) {
		return this.method9081(0, 7, 0, arg0);
	}
}
