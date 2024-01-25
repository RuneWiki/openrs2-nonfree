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

@OriginalClass("client!ufa")
public final class Class326 implements Runnable {

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lclient!hr;")
	public Class148 aClass148_2 = null;

	@OriginalMember(owner = "client!ufa", name = "j", descriptor = "Lclient!dn;")
	private Class66 aClass66_8 = null;

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "Z")
	public boolean aBoolean802 = false;

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "Lclient!hr;")
	public Class148 aClass148_3 = null;

	@OriginalMember(owner = "client!ufa", name = "x", descriptor = "Z")
	public boolean aBoolean803 = false;

	@OriginalMember(owner = "client!ufa", name = "v", descriptor = "Lclient!dn;")
	private Class66 aClass66_9 = null;

	@OriginalMember(owner = "client!ufa", name = "u", descriptor = "Lclient!hr;")
	public Class148 aClass148_4 = null;

	@OriginalMember(owner = "client!ufa", name = "z", descriptor = "Z")
	private boolean aBoolean804 = false;

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "[Lclient!hr;")
	public Class148[] aClass148Array1;

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!ufa", name = "o", descriptor = "Lclient!du;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "Ljava/lang/Object;")
	private Object anObject18;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!ufa", name = "p", descriptor = "Lclient!vp;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!ufa", name = "A", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class326(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static530.aString122 = arg1;
		Static530.anInt9609 = arg0;
		Static530.aString123 = "1.1";
		Static530.aString121 = "Unknown";
		this.aBoolean802 = arg3;
		try {
			Static530.aString121 = System.getProperty("java.vendor");
			Static530.aString123 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static530.aString121.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean803 = true;
		}
		try {
			Static530.aString117 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static530.aString117 = "Unknown";
		}
		Static530.aString119 = Static530.aString117.toLowerCase();
		try {
			Static530.aString118 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static530.aString118 = "";
		}
		try {
			Static530.aString116 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static530.aString116 = "";
		}
		try {
			Static530.aString120 = System.getProperty("user.home");
			if (Static530.aString120 != null) {
				Static530.aString120 = Static530.aString120 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static530.aString120 == null) {
			Static530.aString120 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean803) {
			try {
				Static530.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static530.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static169.method3107(Static530.aString122, Static530.anInt9609);
		if (this.aBoolean802) {
			this.aClass148_4 = new Class148(Static169.method3109(Static530.anInt9609, "random.dat", null), "rw", 25L);
			this.aClass148_3 = new Class148(Static169.method3108("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass148_2 = new Class148(Static169.method3108("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass148Array1 = new Class148[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass148Array1[local180] = new Class148(Static169.method3108("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean803) {
				try {
					this.anObject20 = Class.forName("Class191").getDeclaredConstructor().newInstance();
				} catch (@Pc(213) Throwable local213) {
				}
			}
			try {
				if (this.aBoolean803) {
					this.aClass71_1 = new Class71();
				} else {
					this.anObject18 = Class.forName("Class259").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(230) Throwable local230) {
			}
			try {
				if (this.aBoolean803) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject19 = Class.forName("Class332").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(246) Throwable local246) {
			}
		}
		if (this.aBoolean802 && !this.aBoolean803) {
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
		this.aBoolean804 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/awt/Point;ILjava/awt/Component;II[I)Lclient!dn;")
	public Class66 method7781(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		return this.method7788(arg1, 17, new Object[] { arg2, arg4, arg0 }, arg3);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
	public void method7782() {
		Static530.aLong238 = Static376.method6088() + 5000L;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;BZ)Lclient!dn;")
	public Class66 method7783(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method7788(0, 12, arg0, 0) : this.method7788(0, 13, arg0, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
	public void method7784() {
		synchronized (this) {
			this.aBoolean804 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass148_3 != null) {
			try {
				this.aClass148_3.method3377();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass148_2 != null) {
			try {
				this.aClass148_2.method3377();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass148Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass148Array1.length; local50++) {
				if (this.aClass148Array1[local50] != null) {
					try {
						this.aClass148Array1[local50].method3377();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass148_4 != null) {
			try {
				this.aClass148_4.method3377();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!dn;")
	public Class66 method7785(@OriginalArg(1) Frame arg0) {
		return this.method7788(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)Lclient!dn;")
	public Class66 method7786() {
		return this.method7788(0, 5, null, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)Lclient!dn;")
	public Class66 method7787(@OriginalArg(0) int arg0) {
		return this.method7788(arg0, 3, null, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!dn;")
	private Class66 method7788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class66 local8 = new Class66();
		local8.anObject3 = arg2;
		local8.anInt2310 = arg0;
		local8.anInt2309 = arg1;
		local8.anInt2307 = arg3;
		synchronized (this) {
			if (this.aClass66_8 == null) {
				this.aClass66_8 = this.aClass66_9 = local8;
			} else {
				this.aClass66_8.aClass66_2 = local8;
				this.aClass66_8 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILjava/lang/String;)Lclient!dn;")
	public Class66 method7789(@OriginalArg(1) String arg0) {
		return this.method7788(0, 16, arg0, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!dn;")
	public Class66 method7790(@OriginalArg(0) URL arg0) {
		return this.method7788(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!dn;")
	public Class66 method7791(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method7788(0, 8, new Object[] { arg1, arg0, arg2 }, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZLjava/lang/String;I)Lclient!dn;")
	public Class66 method7792(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method7788(arg2, arg0 ? 22 : 1, arg1, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "([BLjava/io/File;I)Z")
	public boolean method7793(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ufa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class66 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean804) {
						return;
					}
					if (this.aClass66_9 != null) {
						local15 = this.aClass66_9;
						this.aClass66_9 = this.aClass66_9.aClass66_2;
						if (this.aClass66_9 == null) {
							this.aClass66_8 = null;
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
				@Pc(41) int local41 = local15.anInt2309;
				if (local41 == 1) {
					if (Static376.method6088() < Static530.aLong238) {
						throw new IOException();
					}
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt2310);
				} else if (local41 == 22) {
					if (Static530.aLong238 > Static376.method6088()) {
						throw new IOException();
					}
					try {
						local15.anObject4 = Static408.method6627(local15.anInt2310, (String) local15.anObject3).method6796();
					} catch (@Pc(98) IOException_Sub1 local98) {
						local15.anObject4 = local98.getMessage();
						throw local98;
					}
				} else if (local41 == 2) {
					@Pc(114) Thread local114 = new Thread((Runnable) local15.anObject3);
					local114.setDaemon(true);
					local114.start();
					local114.setPriority(local15.anInt2310);
					local15.anObject4 = local114;
				} else if (local41 == 4) {
					if (Static376.method6088() < Static530.aLong238) {
						throw new IOException();
					}
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(167) Object[] local167;
					if (local41 == 8) {
						local167 = (Object[]) local15.anObject3;
						if (this.aBoolean802 && ((Class) local167[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject4 = ((Class) local167[0]).getDeclaredMethod((String) local167[1], (Class[]) local167[2]);
					} else if (local41 == 9) {
						local167 = (Object[]) local15.anObject3;
						if (this.aBoolean802 && ((Class) local167[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject4 = ((Class) local167[0]).getDeclaredField((String) local167[1]);
					} else if (local41 == 18) {
						@Pc(200) Clipboard local200 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject4 = local200.getContents(null);
					} else if (local41 == 19) {
						@Pc(819) Transferable local819 = (Transferable) local15.anObject3;
						@Pc(822) Clipboard local822 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local822.setContents(local819, null);
					} else if (this.aBoolean802) {
						@Pc(272) String local272;
						if (local41 == 3) {
							if (Static376.method6088() < Static530.aLong238) {
								throw new IOException();
							}
							local272 = (local15.anInt2310 >> 24 & 0xFF) + "." + (local15.anInt2310 >> 16 & 0xFF) + "." + (local15.anInt2310 >> 8 & 0xFF) + "." + (local15.anInt2310 & 0xFF);
							local15.anObject4 = InetAddress.getByName(local272).getHostName();
						} else if (local41 == 21) {
							if (Static376.method6088() < Static530.aLong238) {
								throw new IOException();
							}
							local15.anObject4 = InetAddress.getByName((String) local15.anObject3).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean803) {
								local15.anObject4 = this.aClass71_1.method2144();
							} else {
								local15.anObject4 = Class.forName("Class259").getMethod("listmodes").invoke(this.anObject18);
							}
						} else if (local41 == 6) {
							@Pc(296) Frame local296 = new Frame("Jagex Full Screen");
							local15.anObject4 = local296;
							local296.setResizable(false);
							if (this.aBoolean803) {
								this.aClass71_1.method2143(local15.anInt2310 >>> 16, local15.anInt2307 >> 16, local15.anInt2307 & 0xFFFF, local15.anInt2310 & 0xFFFF, local296);
							} else {
								Class.forName("Class259").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject18, local296, Integer.valueOf(local15.anInt2310 >>> 16), new Integer(local15.anInt2310 & 0xFFFF), Integer.valueOf(local15.anInt2307 >> 16), new Integer(local15.anInt2307 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(427) Class148 local427;
							if (local41 == 12) {
								local427 = Static530.method7794(Static530.aString122, (String) local15.anObject3, Static530.anInt9609);
								local15.anObject4 = local427;
							} else if (local41 == 13) {
								local427 = Static530.method7794("", (String) local15.anObject3, Static530.anInt9609);
								local15.anObject4 = local427;
							} else if (this.aBoolean802 && local41 == 14) {
								@Pc(690) int local690 = local15.anInt2310;
								@Pc(693) int local693 = local15.anInt2307;
								if (this.aBoolean803) {
									this.aCallback_Sub1_1.method8132(local693, local690);
								} else {
									Class.forName("Class332").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject19, Integer.valueOf(local690), new Integer(local693));
								}
							} else if (this.aBoolean802 && local41 == 15) {
								@Pc(455) boolean local455 = local15.anInt2310 != 0;
								@Pc(459) Component local459 = (Component) local15.anObject3;
								if (this.aBoolean803) {
									this.aCallback_Sub1_1.method8131(local459, local455);
								} else {
									Class.forName("Class332").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject19, local459, Boolean.valueOf(local455));
								}
							} else if (!this.aBoolean803 && local41 == 17) {
								local167 = (Object[]) local15.anObject3;
								Class.forName("Class332").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject19, (Component) local167[0], (int[]) local167[1], Integer.valueOf(local15.anInt2310), new Integer(local15.anInt2307), (Point) local167[2]);
							} else if (local41 == 16) {
								try {
									if (!Static530.aString119.startsWith("win")) {
										throw new Exception();
									}
									local272 = (String) local15.anObject3;
									if (!local272.startsWith("http://") && !local272.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(645) String local645 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(647) int local647 = 0;
									while (true) {
										if (local272.length() <= local647) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local272 + "\"");
											local15.anObject4 = null;
											break;
										}
										if (local645.indexOf(local272.charAt(local647)) == -1) {
											throw new Exception();
										}
										local647++;
									}
								} catch (@Pc(682) Exception local682) {
									local15.anObject4 = local682;
									throw local682;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean803) {
							this.aClass71_1.method2142((Frame) local15.anObject3);
						} else {
							Class.forName("Class259").getMethod("exit").invoke(this.anObject18);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2308 = 1;
			} catch (@Pc(864) ThreadDeath local864) {
				throw local864;
			} catch (@Pc(867) Throwable local867) {
				local15.anInt2308 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!dn;")
	public Class66 method7795(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method7788(arg1, 2, arg0, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!dn;")
	public Class66 method7796(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method7788(0, 9, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)Z")
	public boolean method7797() {
		if (!this.aBoolean802) {
			return false;
		} else if (this.aBoolean803) {
			return this.aClass71_1 != null;
		} else {
			return this.anObject18 != null;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIII)Lclient!dn;")
	public Class66 method7798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method7788((arg2 << 16) + arg1, 6, null, arg0 << 16);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method7799() {
		return this.anObject20;
	}
}
