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

@OriginalClass("client!mr")
public final class Class226 implements Runnable {

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "Z")
	public boolean aBoolean415 = false;

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "Lclient!fg;")
	private Class108 aClass108_5 = null;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "Lclient!el;")
	public Class92 aClass92_1 = null;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "Lclient!el;")
	public Class92 aClass92_2 = null;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "Lclient!el;")
	public Class92 aClass92_3 = null;

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "Z")
	public boolean aBoolean416 = false;

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "Lclient!fg;")
	private Class108 aClass108_6 = null;

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!mr", name = "z", descriptor = "[Lclient!el;")
	public Class92[] aClass92Array1;

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "Ljava/lang/Object;")
	private Object anObject12;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Lclient!ga;")
	private Class114 aClass114_1;

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "Lclient!nr;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class226(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static359.aString70 = "1.1";
		this.aBoolean416 = arg3;
		Static359.anInt5677 = arg0;
		Static359.aString71 = "Unknown";
		Static359.aString73 = arg1;
		try {
			Static359.aString71 = System.getProperty("java.vendor");
			Static359.aString70 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static359.aString71.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean415 = true;
		}
		try {
			Static359.aString66 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static359.aString66 = "Unknown";
		}
		Static359.aString67 = Static359.aString66.toLowerCase();
		try {
			Static359.aString69 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static359.aString69 = "";
		}
		try {
			Static359.aString72 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static359.aString72 = "";
		}
		try {
			Static359.aString68 = System.getProperty("user.home");
			if (Static359.aString68 != null) {
				Static359.aString68 = Static359.aString68 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static359.aString68 == null) {
			Static359.aString68 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean415) {
			try {
				Static359.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static359.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static306.method4187(Static359.aString73, Static359.anInt5677);
		if (this.aBoolean416) {
			this.aClass92_2 = new Class92(Static306.method4188(null, Static359.anInt5677, "random.dat"), "rw", 25L);
			this.aClass92_3 = new Class92(Static306.method4189("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass92_1 = new Class92(Static306.method4189("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass92Array1 = new Class92[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass92Array1[local181] = new Class92(Static306.method4189("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean415) {
				try {
					this.anObject13 = Class.forName("Class239").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean415) {
					this.aClass114_1 = new Class114();
				} else {
					this.anObject12 = Class.forName("Class198").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean415) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject11 = Class.forName("Class162").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean416 && !this.aBoolean415) {
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
		this.aBoolean414 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lclient!fg;")
	public Class108 method4839(@OriginalArg(0) Frame arg0) {
		return this.method4849(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)Z")
	public boolean method4840() {
		if (!this.aBoolean416) {
			return false;
		} else if (this.aBoolean415) {
			return this.aClass114_1 != null;
		} else {
			return this.anObject12 != null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;ZIZ)Lclient!fg;")
	public Class108 method4841(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method4849(arg2 ? 22 : 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!fg;")
	public Class108 method4842(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4849(2, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIBII)Lclient!fg;")
	public Class108 method4843(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method4849(6, null, arg0 + (arg2 << 16), arg1 << 16);
	}

	@OriginalMember(owner = "client!mr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class108 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean414) {
						return;
					}
					if (this.aClass108_5 != null) {
						local15 = this.aClass108_5;
						this.aClass108_5 = this.aClass108_5.aClass108_3;
						if (this.aClass108_5 == null) {
							this.aClass108_6 = null;
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
				@Pc(41) int local41 = local15.anInt2767;
				if (local41 == 1) {
					if (Static359.aLong154 > Static476.method6413()) {
						throw new IOException();
					}
					local15.anObject6 = new Socket(InetAddress.getByName((String) local15.anObject5), local15.anInt2765);
				} else if (local41 == 22) {
					if (Static476.method6413() < Static359.aLong154) {
						throw new IOException();
					}
					try {
						local15.anObject6 = Static333.method4503(local15.anInt2765, (String) local15.anObject5).method8153();
					} catch (@Pc(843) IOException_Sub1 local843) {
						local15.anObject6 = local843.getMessage();
						throw local843;
					}
				} else if (local41 == 2) {
					@Pc(808) Thread local808 = new Thread((Runnable) local15.anObject5);
					local808.setDaemon(true);
					local808.start();
					local808.setPriority(local15.anInt2765);
					local15.anObject6 = local808;
				} else if (local41 == 4) {
					if (Static476.method6413() < Static359.aLong154) {
						throw new IOException();
					}
					local15.anObject6 = new DataInputStream(((URL) local15.anObject5).openStream());
				} else {
					@Pc(104) Object[] local104;
					if (local41 == 8) {
						local104 = (Object[]) local15.anObject5;
						if (this.aBoolean416 && ((Class) local104[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject6 = ((Class) local104[0]).getDeclaredMethod((String) local104[1], (Class[]) local104[2]);
					} else if (local41 == 9) {
						local104 = (Object[]) local15.anObject5;
						if (this.aBoolean416 && ((Class) local104[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject6 = ((Class) local104[0]).getDeclaredField((String) local104[1]);
					} else if (local41 == 18) {
						@Pc(795) Clipboard local795 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject6 = local795.getContents(null);
					} else if (local41 == 19) {
						@Pc(784) Transferable local784 = (Transferable) local15.anObject5;
						@Pc(787) Clipboard local787 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local787.setContents(local784, null);
					} else if (this.aBoolean416) {
						@Pc(393) String local393;
						if (local41 == 3) {
							if (Static359.aLong154 > Static476.method6413()) {
								throw new IOException();
							}
							local393 = (local15.anInt2765 >> 24 & 0xFF) + "." + (local15.anInt2765 >> 16 & 0xFF) + "." + (local15.anInt2765 >> 8 & 0xFF) + "." + (local15.anInt2765 & 0xFF);
							local15.anObject6 = InetAddress.getByName(local393).getHostName();
						} else if (local41 == 21) {
							if (Static359.aLong154 > Static476.method6413()) {
								throw new IOException();
							}
							local15.anObject6 = InetAddress.getByName((String) local15.anObject5).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean415) {
								local15.anObject6 = this.aClass114_1.method2578();
							} else {
								local15.anObject6 = Class.forName("Class198").getMethod("listmodes").invoke(this.anObject12);
							}
						} else if (local41 == 6) {
							@Pc(589) Frame local589 = new Frame("Jagex Full Screen");
							local15.anObject6 = local589;
							local589.setResizable(false);
							if (this.aBoolean415) {
								this.aClass114_1.method2579(local15.anInt2764 & 0xFFFF, local15.anInt2765 >>> 16, local15.anInt2764 >> 16, local589, local15.anInt2765 & 0xFFFF);
							} else {
								Class.forName("Class198").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject12, local589, Integer.valueOf(local15.anInt2765 >>> 16), new Integer(local15.anInt2765 & 0xFFFF), Integer.valueOf(local15.anInt2764 >> 16), new Integer(local15.anInt2764 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(233) Class92 local233;
							if (local41 == 12) {
								local233 = Static359.method4848((String) local15.anObject5, Static359.aString73, Static359.anInt5677);
								local15.anObject6 = local233;
							} else if (local41 == 13) {
								local233 = Static359.method4848((String) local15.anObject5, "", Static359.anInt5677);
								local15.anObject6 = local233;
							} else if (this.aBoolean416 && local41 == 14) {
								@Pc(248) int local248 = local15.anInt2765;
								@Pc(251) int local251 = local15.anInt2764;
								if (this.aBoolean415) {
									this.aCallback_Sub1_1.method5166(local251, local248);
								} else {
									Class.forName("Class162").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject11, Integer.valueOf(local248), new Integer(local251));
								}
							} else if (this.aBoolean416 && local41 == 15) {
								@Pc(312) boolean local312 = local15.anInt2765 != 0;
								@Pc(316) Component local316 = (Component) local15.anObject5;
								if (this.aBoolean415) {
									this.aCallback_Sub1_1.method5167(local312, local316);
								} else {
									Class.forName("Class162").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject11, local316, Boolean.valueOf(local312));
								}
							} else if (!this.aBoolean415 && local41 == 17) {
								local104 = (Object[]) local15.anObject5;
								Class.forName("Class162").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject11, (Component) local104[0], (int[]) local104[1], Integer.valueOf(local15.anInt2765), new Integer(local15.anInt2764), (Point) local104[2]);
							} else if (local41 == 16) {
								try {
									if (!Static359.aString67.startsWith("win")) {
										throw new Exception();
									}
									local393 = (String) local15.anObject5;
									if (!local393.startsWith("http://") && !local393.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(407) String local407 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(409) int local409 = 0;
									while (true) {
										if (local409 >= local393.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local393 + "\"");
											local15.anObject6 = null;
											break;
										}
										if (local407.indexOf(local393.charAt(local409)) == -1) {
											throw new Exception();
										}
										local409++;
									}
								} catch (@Pc(448) Exception local448) {
									local15.anObject6 = local448;
									throw local448;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean415) {
							this.aClass114_1.method2577((Frame) local15.anObject5);
						} else {
							Class.forName("Class198").getMethod("exit").invoke(this.anObject12);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2766 = 1;
			} catch (@Pc(854) ThreadDeath local854) {
				throw local854;
			} catch (@Pc(857) Throwable local857) {
				local15.anInt2766 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Lclient!fg;")
	public Class108 method4844(@OriginalArg(0) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method4849(8, new Object[] { arg2, arg1, arg0 }, 0, 0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Lclient!fg;")
	public Class108 method4845(@OriginalArg(0) int arg0) {
		return this.method4849(3, null, arg0, 0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/net/URL;)Lclient!fg;")
	public Class108 method4846(@OriginalArg(1) URL arg0) {
		return this.method4849(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([BILjava/io/File;)Z")
	public boolean method4847(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lclient!fg;")
	private Class108 method4849(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class108 local8 = new Class108();
		local8.anObject5 = arg1;
		local8.anInt2765 = arg2;
		local8.anInt2764 = arg3;
		local8.anInt2767 = arg0;
		synchronized (this) {
			if (this.aClass108_6 == null) {
				this.aClass108_6 = this.aClass108_5 = local8;
			} else {
				this.aClass108_6.aClass108_3 = local8;
				this.aClass108_6 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public void method4850() {
		Static359.aLong154 = Static476.method6413() + 5000L;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Point;[IIILjava/awt/Component;I)Lclient!fg;")
	public Class108 method4851(@OriginalArg(0) Point arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4) {
		return this.method4849(17, new Object[] { arg4, arg1, arg0 }, arg2, arg3);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/lang/String;)Lclient!fg;")
	public Class108 method4852(@OriginalArg(1) String arg0) {
		return this.method4849(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
	public void method4853() {
		synchronized (this) {
			this.aBoolean414 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass92_3 != null) {
			try {
				this.aClass92_3.method1845();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass92_1 != null) {
			try {
				this.aClass92_1.method1845();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass92Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass92Array1.length; local48++) {
				if (this.aClass92Array1[local48] != null) {
					try {
						this.aClass92Array1[local48].method1845();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass92_2 != null) {
			try {
				this.aClass92_2.method1845();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!fg;")
	public Class108 method4854(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method4849(9, new Object[] { arg0, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)Lclient!fg;")
	public Class108 method4855() {
		return this.method4849(5, null, 0, 0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method4857() {
		return this.anObject13;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/lang/String;Z)Lclient!fg;")
	public Class108 method4858(@OriginalArg(1) String arg0) {
		return this.method4849(12, arg0, 0, 0);
	}
}
