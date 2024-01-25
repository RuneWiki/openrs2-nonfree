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

@OriginalClass("client!ft")
public final class Class109 implements Runnable {

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "Lclient!em;")
	public Class91 aClass91_1 = null;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Lclient!pga;")
	private Class260 aClass260_6 = null;

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "Lclient!pga;")
	private Class260 aClass260_5 = null;

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "Lclient!em;")
	public Class91 aClass91_2 = null;

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "Lclient!em;")
	public Class91 aClass91_3 = null;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "Z")
	public boolean aBoolean205 = false;

	@OriginalMember(owner = "client!ft", name = "B", descriptor = "Z")
	public boolean aBoolean206 = false;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "[Lclient!em;")
	public Class91[] aClass91Array1;

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Lclient!dc;")
	private Class66 aClass66_1;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "Lclient!ql;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static148.aString20 = "Unknown";
		Static148.aString25 = arg1;
		Static148.anInt2737 = arg0;
		this.aBoolean206 = arg3;
		Static148.aString22 = "1.1";
		try {
			Static148.aString20 = System.getProperty("java.vendor");
			Static148.aString22 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static148.aString20.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean205 = true;
		}
		try {
			Static148.aString23 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static148.aString23 = "Unknown";
		}
		Static148.aString19 = Static148.aString23.toLowerCase();
		try {
			Static148.aString24 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static148.aString24 = "";
		}
		try {
			Static148.aString21 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static148.aString21 = "";
		}
		try {
			Static148.aString26 = System.getProperty("user.home");
			if (Static148.aString26 != null) {
				Static148.aString26 = Static148.aString26 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static148.aString26 == null) {
			Static148.aString26 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean205) {
			try {
				Static148.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static148.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static178.method2522(Static148.anInt2737, Static148.aString25);
		if (this.aBoolean206) {
			this.aClass91_2 = new Class91(Static178.method2520(null, Static148.anInt2737, "random.dat"), "rw", 25L);
			this.aClass91_1 = new Class91(Static178.method2521("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass91_3 = new Class91(Static178.method2521("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass91Array1 = new Class91[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass91Array1[local180] = new Class91(Static178.method2521("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean205) {
				try {
					this.anObject7 = Class.forName("Class266").getDeclaredConstructor().newInstance();
				} catch (@Pc(213) Throwable local213) {
				}
			}
			try {
				if (this.aBoolean205) {
					this.aClass66_1 = new Class66();
				} else {
					this.anObject6 = Class.forName("Class258").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(230) Throwable local230) {
			}
			try {
				if (this.aBoolean205) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject5 = Class.forName("Class348").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(246) Throwable local246) {
			}
		}
		if (this.aBoolean206 && !this.aBoolean205) {
			@Pc(256) ThreadGroup local256 = Thread.currentThread().getThreadGroup();
			for (@Pc(259) ThreadGroup local259 = local256.getParent(); local259 != null; local259 = local259.getParent()) {
				local256 = local259;
			}
			@Pc(270) Thread[] local270 = new Thread[1000];
			local256.enumerate(local270);
			for (@Pc(276) int local276 = 0; local276 < local270.length; local276++) {
				if (local270[local276] != null && local270[local276].getName().startsWith("AWT")) {
					local270[local276].setPriority(1);
				}
			}
		}
		this.aBoolean204 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!pga;")
	public Class260 method2168(@OriginalArg(0) String arg0) {
		return this.method2174(0, 0, 16, arg0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZLjava/lang/String;I)Lclient!pga;")
	public Class260 method2169(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		return arg0 ? this.method2174(0, 0, 12, arg1) : this.method2174(0, 0, 13, arg1);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)Lclient!pga;")
	public Class260 method2170(@OriginalArg(1) int arg0) {
		return this.method2174(arg0, 0, 3, null);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIII)Lclient!pga;")
	public Class260 method2171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method2174(arg1 + (arg0 << 16), arg2 << 16, 6, null);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	public void method2172() {
		synchronized (this) {
			this.aBoolean204 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass91_1 != null) {
			try {
				this.aClass91_1.method1833();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass91_3 != null) {
			try {
				this.aClass91_3.method1833();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass91Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass91Array1.length; local49++) {
				if (this.aClass91Array1[local49] != null) {
					try {
						this.aClass91Array1[local49].method1833();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass91_2 != null) {
			try {
				this.aClass91_2.method1833();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/net/URL;)Lclient!pga;")
	public Class260 method2173(@OriginalArg(1) URL arg0) {
		return this.method2174(0, 0, 4, arg0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!pga;")
	private Class260 method2174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class260 local3 = new Class260();
		local3.anInt7042 = arg1;
		local3.anObject17 = arg3;
		local3.anInt7040 = arg0;
		local3.anInt7039 = arg2;
		synchronized (this) {
			if (this.aClass260_5 == null) {
				this.aClass260_5 = this.aClass260_6 = local3;
			} else {
				this.aClass260_5.aClass260_9 = local3;
				this.aClass260_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ft", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class260 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean204) {
						return;
					}
					if (this.aClass260_6 != null) {
						local15 = this.aClass260_6;
						this.aClass260_6 = this.aClass260_6.aClass260_9;
						if (this.aClass260_6 == null) {
							this.aClass260_5 = null;
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
				@Pc(41) int local41 = local15.anInt7039;
				if (local41 == 1) {
					if (Static148.aLong89 > Static413.method5668()) {
						throw new IOException();
					}
					local15.anObject16 = new Socket(InetAddress.getByName((String) local15.anObject17), local15.anInt7040);
				} else if (local41 == 22) {
					if (Static413.method5668() < Static148.aLong89) {
						throw new IOException();
					}
					try {
						local15.anObject16 = Static569.method7671((String) local15.anObject17, local15.anInt7040).method4644();
					} catch (@Pc(838) IOException_Sub1 local838) {
						local15.anObject16 = local838.getMessage();
						throw local838;
					}
				} else if (local41 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local15.anObject17);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local15.anInt7040);
					local15.anObject16 = local59;
				} else if (local41 == 4) {
					if (Static413.method5668() < Static148.aLong89) {
						throw new IOException();
					}
					local15.anObject16 = new DataInputStream(((URL) local15.anObject17).openStream());
				} else {
					@Pc(84) Object[] local84;
					if (local41 == 8) {
						local84 = (Object[]) local15.anObject17;
						if (this.aBoolean206 && ((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local84[0]).getDeclaredMethod((String) local84[1], (Class[]) local84[2]);
					} else if (local41 == 9) {
						local84 = (Object[]) local15.anObject17;
						if (this.aBoolean206 && ((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local84[0]).getDeclaredField((String) local84[1]);
					} else if (local41 == 18) {
						@Pc(153) Clipboard local153 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject16 = local153.getContents(null);
					} else if (local41 == 19) {
						@Pc(781) Transferable local781 = (Transferable) local15.anObject17;
						@Pc(784) Clipboard local784 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local784.setContents(local781, null);
					} else if (this.aBoolean206) {
						@Pc(439) String local439;
						if (local41 == 3) {
							if (Static413.method5668() < Static148.aLong89) {
								throw new IOException();
							}
							local439 = (local15.anInt7040 >> 24 & 0xFF) + "." + (local15.anInt7040 >> 16 & 0xFF) + "." + (local15.anInt7040 >> 8 & 0xFF) + "." + (local15.anInt7040 & 0xFF);
							local15.anObject16 = InetAddress.getByName(local439).getHostName();
						} else if (local41 == 21) {
							if (Static148.aLong89 > Static413.method5668()) {
								throw new IOException();
							}
							local15.anObject16 = InetAddress.getByName((String) local15.anObject17).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean205) {
								local15.anObject16 = this.aClass66_1.method1312();
							} else {
								local15.anObject16 = Class.forName("Class258").getMethod("listmodes").invoke(this.anObject6);
							}
						} else if (local41 == 6) {
							@Pc(580) Frame local580 = new Frame("Jagex Full Screen");
							local15.anObject16 = local580;
							local580.setResizable(false);
							if (this.aBoolean205) {
								this.aClass66_1.method1313(local580, local15.anInt7040 >>> 16, local15.anInt7040 & 0xFFFF, local15.anInt7042 & 0xFFFF, local15.anInt7042 >> 16);
							} else {
								Class.forName("Class258").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject6, local580, Integer.valueOf(local15.anInt7040 >>> 16), new Integer(local15.anInt7040 & 0xFFFF), Integer.valueOf(local15.anInt7042 >> 16), new Integer(local15.anInt7042 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(245) Class91 local245;
							if (local41 == 12) {
								local245 = Static148.method2178((String) local15.anObject17, Static148.anInt2737, Static148.aString25);
								local15.anObject16 = local245;
							} else if (local41 == 13) {
								local245 = Static148.method2178((String) local15.anObject17, Static148.anInt2737, "");
								local15.anObject16 = local245;
							} else if (this.aBoolean206 && local41 == 14) {
								@Pc(263) int local263 = local15.anInt7040;
								@Pc(266) int local266 = local15.anInt7042;
								if (this.aBoolean205) {
									this.aCallback_Sub1_1.method6025(local263, local266);
								} else {
									Class.forName("Class348").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject5, Integer.valueOf(local263), new Integer(local266));
								}
							} else if (this.aBoolean206 && local41 == 15) {
								@Pc(510) boolean local510 = local15.anInt7040 != 0;
								@Pc(514) Component local514 = (Component) local15.anObject17;
								if (this.aBoolean205) {
									this.aCallback_Sub1_1.method6026(local510, local514);
								} else {
									Class.forName("Class348").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject5, local514, Boolean.valueOf(local510));
								}
							} else if (!this.aBoolean205 && local41 == 17) {
								local84 = (Object[]) local15.anObject17;
								Class.forName("Class348").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject5, (Component) local84[0], (int[]) local84[1], Integer.valueOf(local15.anInt7040), new Integer(local15.anInt7042), (Point) local84[2]);
							} else if (local41 == 16) {
								try {
									if (!Static148.aString19.startsWith("win")) {
										throw new Exception();
									}
									local439 = (String) local15.anObject17;
									if (!local439.startsWith("http://") && !local439.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(453) String local453 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(455) int local455 = 0; local455 < local439.length(); local455++) {
										if (local453.indexOf(local439.charAt(local455)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local439 + "\"");
									local15.anObject16 = null;
								} catch (@Pc(493) Exception local493) {
									local15.anObject16 = local493;
									throw local493;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean205) {
							this.aClass66_1.method1311((Frame) local15.anObject17);
						} else {
							Class.forName("Class258").getMethod("exit").invoke(this.anObject6);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt7041 = 1;
			} catch (@Pc(869) ThreadDeath local869) {
				throw local869;
			} catch (@Pc(872) Throwable local872) {
				local15.anInt7041 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/lang/String;IZ)Lclient!pga;")
	public Class260 method2175(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method2174(arg1, 0, arg2 ? 22 : 1, arg0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([BBLjava/io/File;)Z")
	public boolean method2176(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!pga;")
	public Class260 method2177(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method2174(arg1, 0, 2, arg0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Z")
	public boolean method2179() {
		if (!this.aBoolean206) {
			return false;
		} else if (this.aBoolean205) {
			return this.aClass66_1 != null;
		} else {
			return this.anObject6 != null;
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method2180() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Class;Ljava/lang/Class;)Lclient!pga;")
	public Class260 method2181(@OriginalArg(0) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method2174(0, 0, 8, new Object[] { arg2, arg0, arg1 });
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!pga;")
	public Class260 method2182(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2174(0, 0, 9, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/awt/Point;IILjava/awt/Component;[II)Lclient!pga;")
	public Class260 method2183(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		return this.method2174(arg4, arg1, 17, new Object[] { arg2, arg3, arg0 });
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)Lclient!pga;")
	public Class260 method2184() {
		return this.method2174(0, 0, 5, null);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!pga;")
	public Class260 method2185(@OriginalArg(1) Frame arg0) {
		return this.method2174(0, 0, 7, arg0);
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)V")
	public void method2186() {
		Static148.aLong89 = Static413.method5668() + 5000L;
	}
}
