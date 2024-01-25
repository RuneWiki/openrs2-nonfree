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

@OriginalClass("client!hga")
public final class Class138 implements Runnable {

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "Z")
	private boolean aBoolean277 = false;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "Lclient!sca;")
	private Class304 aClass304_2 = null;

	@OriginalMember(owner = "client!hga", name = "q", descriptor = "Lclient!jn;")
	public Class175 aClass175_1 = null;

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
	public boolean aBoolean276 = false;

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "Z")
	public boolean aBoolean278 = false;

	@OriginalMember(owner = "client!hga", name = "w", descriptor = "Lclient!sca;")
	private Class304 aClass304_3 = null;

	@OriginalMember(owner = "client!hga", name = "z", descriptor = "Lclient!jn;")
	public Class175 aClass175_2 = null;

	@OriginalMember(owner = "client!hga", name = "B", descriptor = "Lclient!jn;")
	public Class175 aClass175_3 = null;

	@OriginalMember(owner = "client!hga", name = "v", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!hga", name = "A", descriptor = "[Lclient!jn;")
	public Class175[] aClass175Array1;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "Lclient!el;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "client!hga", name = "u", descriptor = "Ljava/lang/Object;")
	private Object anObject8;

	@OriginalMember(owner = "client!hga", name = "t", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "Lclient!lv;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static211.anInt4043 = arg0;
		Static211.aString42 = "Unknown";
		Static211.aString48 = arg1;
		Static211.aString47 = "1.1";
		this.aBoolean276 = arg3;
		try {
			Static211.aString42 = System.getProperty("java.vendor");
			Static211.aString47 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static211.aString42.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean278 = true;
		}
		try {
			Static211.aString43 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static211.aString43 = "Unknown";
		}
		Static211.aString44 = Static211.aString43.toLowerCase();
		try {
			Static211.aString49 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static211.aString49 = "";
		}
		try {
			Static211.aString45 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static211.aString45 = "";
		}
		try {
			Static211.aString46 = System.getProperty("user.home");
			if (Static211.aString46 != null) {
				Static211.aString46 = Static211.aString46 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static211.aString46 == null) {
			Static211.aString46 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean278) {
			try {
				Static211.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static211.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static370.method6001(Static211.anInt4043, Static211.aString48);
		if (this.aBoolean276) {
			this.aClass175_2 = new Class175(Static370.method5999("random.dat", null, Static211.anInt4043), "rw", 25L);
			this.aClass175_1 = new Class175(Static370.method6000("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass175_3 = new Class175(Static370.method6000("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass175Array1 = new Class175[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass175Array1[local180] = new Class175(Static370.method6000("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean278) {
				try {
					this.anObject6 = Class.forName("Class165").getDeclaredConstructor().newInstance();
				} catch (@Pc(217) Throwable local217) {
				}
			}
			try {
				if (this.aBoolean278) {
					this.aClass92_1 = new Class92();
				} else {
					this.anObject8 = Class.forName("Class333").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(234) Throwable local234) {
			}
			try {
				if (this.aBoolean278) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject7 = Class.forName("Class106").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(250) Throwable local250) {
			}
		}
		if (this.aBoolean276 && !this.aBoolean278) {
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
		this.aBoolean277 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "([BLjava/io/File;Z)Z")
	public boolean method3569(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method3570() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(Z)Z")
	public boolean method3571() {
		if (!this.aBoolean276) {
			return false;
		} else if (this.aBoolean278) {
			return this.aClass92_1 != null;
		} else {
			return this.anObject8 != null;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!sca;")
	public Class304 method3572(@OriginalArg(1) Frame arg0) {
		return this.method3579(0, arg0, 7, 0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
	public void method3573() {
		synchronized (this) {
			this.aBoolean277 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass175_1 != null) {
			try {
				this.aClass175_1.method4462();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass175_3 != null) {
			try {
				this.aClass175_3.method4462();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass175Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass175Array1.length; local50++) {
				if (this.aClass175Array1[local50] != null) {
					try {
						this.aClass175Array1[local50].method4462();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass175_2 != null) {
			try {
				this.aClass175_2.method4462();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
	public void method3574() {
		Static211.aLong112 = (long) 5000 + Static374.method6036();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!sca;")
	public Class304 method3575(@OriginalArg(0) String arg0) {
		return this.method3579(0, arg0, 16, 0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILjava/net/URL;)Lclient!sca;")
	public Class304 method3576(@OriginalArg(1) URL arg0) {
		return this.method3579(0, arg0, 4, 0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lclient!sca;")
	public Class304 method3577(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3579(0, arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;[Ljava/lang/Class;)Lclient!sca;")
	public Class304 method3578(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method3579(0, new Object[] { arg1, arg0, arg2 }, 8, 0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBLjava/lang/Object;II)Lclient!sca;")
	private Class304 method3579(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class304 local3 = new Class304();
		local3.anInt8837 = arg3;
		local3.anInt8836 = arg2;
		local3.anObject15 = arg1;
		local3.anInt8839 = arg0;
		synchronized (this) {
			if (this.aClass304_2 == null) {
				this.aClass304_2 = this.aClass304_3 = local3;
			} else {
				this.aClass304_2.aClass304_6 = local3;
				this.aClass304_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "([IIIILjava/awt/Point;Ljava/awt/Component;)Lclient!sca;")
	public Class304 method3580(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) Component arg4) {
		return this.method3579(arg1, new Object[] { arg4, arg0, arg3 }, 17, arg2);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZLjava/lang/String;)Lclient!sca;")
	public Class304 method3581(@OriginalArg(2) String arg0) {
		return this.method3579(0, arg0, 12, 0);
	}

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "(Z)Lclient!sca;")
	public Class304 method3583() {
		return this.method3579(0, null, 5, 0);
	}

	@OriginalMember(owner = "client!hga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class304 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean277) {
						return;
					}
					if (this.aClass304_3 != null) {
						local15 = this.aClass304_3;
						this.aClass304_3 = this.aClass304_3.aClass304_6;
						if (this.aClass304_3 == null) {
							this.aClass304_2 = null;
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
				@Pc(41) int local41 = local15.anInt8836;
				if (local41 == 1) {
					if (Static211.aLong112 > Static374.method6036()) {
						throw new IOException();
					}
					local15.anObject16 = new Socket(InetAddress.getByName((String) local15.anObject15), local15.anInt8837);
				} else if (local41 == 22) {
					if (Static211.aLong112 > Static374.method6036()) {
						throw new IOException();
					}
					try {
						local15.anObject16 = Static96.method2119((String) local15.anObject15, local15.anInt8837).method5705();
					} catch (@Pc(812) IOException_Sub1 local812) {
						local15.anObject16 = local812.getMessage();
						throw local812;
					}
				} else if (local41 == 2) {
					@Pc(57) Thread local57 = new Thread((Runnable) local15.anObject15);
					local57.setDaemon(true);
					local57.start();
					local57.setPriority(local15.anInt8837);
					local15.anObject16 = local57;
				} else if (local41 == 4) {
					if (Static374.method6036() < Static211.aLong112) {
						throw new IOException();
					}
					local15.anObject16 = new DataInputStream(((URL) local15.anObject15).openStream());
				} else {
					@Pc(99) Object[] local99;
					if (local41 == 8) {
						local99 = (Object[]) local15.anObject15;
						if (this.aBoolean276 && ((Class) local99[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local99[0]).getDeclaredMethod((String) local99[1], (Class[]) local99[2]);
					} else if (local41 == 9) {
						local99 = (Object[]) local15.anObject15;
						if (this.aBoolean276 && ((Class) local99[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local99[0]).getDeclaredField((String) local99[1]);
					} else if (local41 == 18) {
						@Pc(137) Clipboard local137 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject16 = local137.getContents(null);
					} else if (local41 == 19) {
						@Pc(749) Transferable local749 = (Transferable) local15.anObject15;
						@Pc(752) Clipboard local752 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local752.setContents(local749, null);
					} else if (this.aBoolean276) {
						@Pc(376) String local376;
						if (local41 == 3) {
							if (Static211.aLong112 > Static374.method6036()) {
								throw new IOException();
							}
							local376 = (local15.anInt8837 >> 24 & 0xFF) + "." + (local15.anInt8837 >> 16 & 0xFF) + "." + (local15.anInt8837 >> 8 & 0xFF) + "." + (local15.anInt8837 & 0xFF);
							local15.anObject16 = InetAddress.getByName(local376).getHostName();
						} else if (local41 == 21) {
							if (Static374.method6036() < Static211.aLong112) {
								throw new IOException();
							}
							local15.anObject16 = InetAddress.getByName((String) local15.anObject15).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean278) {
								local15.anObject16 = this.aClass92_1.method2526();
							} else {
								local15.anObject16 = Class.forName("Class333").getMethod("listmodes").invoke(this.anObject8);
							}
						} else if (local41 == 6) {
							@Pc(528) Frame local528 = new Frame("Jagex Full Screen");
							local15.anObject16 = local528;
							local528.setResizable(false);
							if (this.aBoolean278) {
								this.aClass92_1.method2525(local15.anInt8837 >>> 16, local15.anInt8839 & 0xFFFF, local15.anInt8839 >> 16, local528, local15.anInt8837 & 0xFFFF);
							} else {
								Class.forName("Class333").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject8, local528, Integer.valueOf(local15.anInt8837 >>> 16), new Integer(local15.anInt8837 & 0xFFFF), Integer.valueOf(local15.anInt8839 >> 16), new Integer(local15.anInt8839 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(182) Class175 local182;
							if (local41 == 12) {
								local182 = Static211.method3584(Static211.anInt4043, Static211.aString48, (String) local15.anObject15);
								local15.anObject16 = local182;
							} else if (local41 == 13) {
								local182 = Static211.method3584(Static211.anInt4043, "", (String) local15.anObject15);
								local15.anObject16 = local182;
							} else if (this.aBoolean276 && local41 == 14) {
								@Pc(439) int local439 = local15.anInt8837;
								@Pc(442) int local442 = local15.anInt8839;
								if (this.aBoolean278) {
									this.aCallback_Sub1_1.method5453(local442, local439);
								} else {
									Class.forName("Class106").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject7, Integer.valueOf(local439), new Integer(local442));
								}
							} else if (this.aBoolean276 && local41 == 15) {
								@Pc(207) boolean local207 = local15.anInt8837 != 0;
								@Pc(211) Component local211 = (Component) local15.anObject15;
								if (this.aBoolean278) {
									this.aCallback_Sub1_1.method5454(local211, local207);
								} else {
									Class.forName("Class106").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject7, local211, Boolean.valueOf(local207));
								}
							} else if (!this.aBoolean278 && local41 == 17) {
								local99 = (Object[]) local15.anObject15;
								Class.forName("Class106").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject7, (Component) local99[0], (int[]) local99[1], Integer.valueOf(local15.anInt8837), new Integer(local15.anInt8839), (Point) local99[2]);
							} else if (local41 == 16) {
								try {
									if (!Static211.aString44.startsWith("win")) {
										throw new Exception();
									}
									local376 = (String) local15.anObject15;
									if (!local376.startsWith("http://") && !local376.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(390) String local390 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(392) int local392 = 0; local392 < local376.length(); local392++) {
										if (local390.indexOf(local376.charAt(local392)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local376 + "\"");
									local15.anObject16 = null;
								} catch (@Pc(426) Exception local426) {
									local15.anObject16 = local426;
									throw local426;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean278) {
							this.aClass92_1.method2524((Frame) local15.anObject15);
						} else {
							Class.forName("Class333").getMethod("exit").invoke(this.anObject8);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt8838 = 1;
			} catch (@Pc(847) ThreadDeath local847) {
				throw local847;
			} catch (@Pc(850) Throwable local850) {
				local15.anInt8838 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIII)Lclient!sca;")
	public Class304 method3585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method3579(arg2 << 16, null, 6, (arg1 << 16) + arg0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)Lclient!sca;")
	public Class304 method3586(@OriginalArg(1) int arg0) {
		return this.method3579(0, null, 3, arg0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!sca;")
	public Class304 method3587(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method3579(0, new Object[] { arg0, arg1 }, 9, 0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZLjava/lang/String;II)Lclient!sca;")
	public Class304 method3588(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return this.method3579(0, arg1, arg0 ? 22 : 1, arg2);
	}
}
