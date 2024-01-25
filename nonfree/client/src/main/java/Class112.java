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

@OriginalClass("client!ge")
public final class Class112 implements Runnable {

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!tj;")
	private Class328 aClass328_2 = null;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Z")
	public boolean aBoolean264 = false;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!kda;")
	public Class171 aClass171_2 = null;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!tj;")
	private Class328 aClass328_1 = null;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!kda;")
	public Class171 aClass171_4 = null;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!kda;")
	public Class171 aClass171_3 = null;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "[Lclient!kda;")
	public Class171[] aClass171Array1;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Ljava/lang/Object;")
	private Object anObject9;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!hga;")
	private Class131 aClass131_1;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Ljava/lang/Object;")
	private Object anObject10;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!gi;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class112(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static177.anInt3645 = arg0;
		this.aBoolean263 = arg3;
		Static177.aString40 = arg1;
		Static177.aString43 = "Unknown";
		Static177.aString46 = "1.1";
		try {
			Static177.aString43 = System.getProperty("java.vendor");
			Static177.aString46 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static177.aString43.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean264 = true;
		}
		try {
			Static177.aString44 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static177.aString44 = "Unknown";
		}
		Static177.aString41 = Static177.aString44.toLowerCase();
		try {
			Static177.aString39 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static177.aString39 = "";
		}
		try {
			Static177.aString45 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static177.aString45 = "";
		}
		try {
			Static177.aString42 = System.getProperty("user.home");
			if (Static177.aString42 != null) {
				Static177.aString42 = Static177.aString42 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static177.aString42 == null) {
			Static177.aString42 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean264) {
			try {
				Static177.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static177.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static93.method1524(Static177.aString40, Static177.anInt3645);
		if (this.aBoolean263) {
			this.aClass171_3 = new Class171(Static93.method1522("random.dat", (String) null, Static177.anInt3645), "rw", 25L);
			this.aClass171_2 = new Class171(Static93.method1523("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass171_4 = new Class171(Static93.method1523("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass171Array1 = new Class171[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass171Array1[local181] = new Class171(Static93.method1523("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean264) {
				try {
					this.anObject9 = Class.forName("Class122").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean264) {
					this.aClass131_1 = new Class131();
				} else {
					this.anObject11 = Class.forName("Class184").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean264) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject10 = Class.forName("Class139").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean263 && !this.aBoolean264) {
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
		this.aBoolean265 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z")
	public boolean method3222() {
		if (!this.aBoolean263) {
			return false;
		} else if (this.aBoolean264) {
			return this.aClass131_1 != null;
		} else {
			return this.anObject11 != null;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/io/File;[B)Z")
	public boolean method3223(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg0);
			local10.write(arg1, 0, arg1.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!tj;")
	public Class328 method3225(@OriginalArg(0) Frame arg0) {
		return this.method3232(7, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ge", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class328 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean265) {
						return;
					}
					if (this.aClass328_2 != null) {
						local15 = this.aClass328_2;
						this.aClass328_2 = this.aClass328_2.aClass328_8;
						if (this.aClass328_2 == null) {
							this.aClass328_1 = null;
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
				@Pc(41) int local41 = local15.anInt9391;
				if (local41 == 1) {
					if (Static177.aLong94 > Static32.method595()) {
						throw new IOException();
					}
					local15.anObject21 = new Socket(InetAddress.getByName((String) local15.anObject20), local15.anInt9390);
				} else if (local41 == 22) {
					if (Static177.aLong94 > Static32.method595()) {
						throw new IOException();
					}
					try {
						local15.anObject21 = Static522.method7782((String) local15.anObject20, local15.anInt9390).method8374();
					} catch (@Pc(851) IOException_Sub1 local851) {
						local15.anObject21 = local851.getMessage();
						throw local851;
					}
				} else if (local41 == 2) {
					@Pc(812) Thread local812 = new Thread((Runnable) local15.anObject20);
					local812.setDaemon(true);
					local812.start();
					local812.setPriority(local15.anInt9390);
					local15.anObject21 = local812;
				} else if (local41 == 4) {
					if (Static177.aLong94 > Static32.method595()) {
						throw new IOException();
					}
					local15.anObject21 = new DataInputStream(((URL) local15.anObject20).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local41 == 8) {
						local92 = (Object[]) local15.anObject20;
						if (this.aBoolean263 && ((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject21 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local41 == 9) {
						local92 = (Object[]) local15.anObject20;
						if (this.aBoolean263 && ((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject21 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else if (local41 == 18) {
						@Pc(125) Clipboard local125 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject21 = local125.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(745) Transferable local745 = (Transferable) local15.anObject20;
						@Pc(748) Clipboard local748 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local748.setContents(local745, (ClipboardOwner) null);
					} else if (this.aBoolean263) {
						@Pc(192) String local192;
						if (local41 == 3) {
							if (Static177.aLong94 > Static32.method595()) {
								throw new IOException();
							}
							local192 = (local15.anInt9390 >> 24 & 0xFF) + "." + (local15.anInt9390 >> 16 & 0xFF) + "." + (local15.anInt9390 >> 8 & 0xFF) + "." + (local15.anInt9390 & 0xFF);
							local15.anObject21 = InetAddress.getByName(local192).getHostName();
						} else if (local41 == 21) {
							if (Static32.method595() < Static177.aLong94) {
								throw new IOException();
							}
							local15.anObject21 = InetAddress.getByName((String) local15.anObject20).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean264) {
								local15.anObject21 = this.aClass131_1.method3603();
							} else {
								local15.anObject21 = Class.forName("Class184").getMethod("listmodes").invoke(this.anObject11);
							}
						} else if (local41 == 6) {
							@Pc(597) Frame local597 = new Frame("Jagex Full Screen");
							local15.anObject21 = local597;
							local597.setResizable(false);
							if (this.aBoolean264) {
								this.aClass131_1.method3602(local15.anInt9392 & 0xFFFF, local15.anInt9390 >>> 16, local597, local15.anInt9390 & 0xFFFF, local15.anInt9392 >> 16);
							} else {
								Class.forName("Class184").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject11, local597, Integer.valueOf(local15.anInt9390 >>> 16), new Integer(local15.anInt9390 & 0xFFFF), Integer.valueOf(local15.anInt9392 >> 16), new Integer(local15.anInt9392 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(242) Class171 local242;
							if (local41 == 12) {
								local242 = Static177.method3224(Static177.aString40, (String) local15.anObject20, Static177.anInt3645);
								local15.anObject21 = local242;
							} else if (local41 == 13) {
								local242 = Static177.method3224("", (String) local15.anObject20, Static177.anInt3645);
								local15.anObject21 = local242;
							} else if (this.aBoolean263 && local41 == 14) {
								@Pc(520) int local520 = local15.anInt9390;
								@Pc(523) int local523 = local15.anInt9392;
								if (this.aBoolean264) {
									this.aCallback_Sub1_1.method3328(local520, local523);
								} else {
									Class.forName("Class139").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject10, Integer.valueOf(local520), new Integer(local523));
								}
							} else if (this.aBoolean263 && local41 == 15) {
								@Pc(464) boolean local464 = local15.anInt9390 != 0;
								@Pc(468) Component local468 = (Component) local15.anObject20;
								if (this.aBoolean264) {
									this.aCallback_Sub1_1.method3329(local468, local464);
								} else {
									Class.forName("Class139").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject10, local468, Boolean.valueOf(local464));
								}
							} else if (!this.aBoolean264 && local41 == 17) {
								local92 = (Object[]) local15.anObject20;
								Class.forName("Class139").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject10, (Component) local92[0], (int[]) local92[1], Integer.valueOf(local15.anInt9390), new Integer(local15.anInt9392), (Point) local92[2]);
							} else if (local41 == 16) {
								try {
									if (!Static177.aString41.startsWith("win")) {
										throw new Exception();
									}
									local192 = (String) local15.anObject20;
									if (!local192.startsWith("http://") && !local192.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(317) String local317 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(319) int local319 = 0;
									while (true) {
										if (local192.length() <= local319) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local192 + "\"");
											local15.anObject21 = null;
											break;
										}
										if (local317.indexOf(local192.charAt(local319)) == -1) {
											throw new Exception();
										}
										local319++;
									}
								} catch (@Pc(357) Exception local357) {
									local15.anObject21 = local357;
									throw local357;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean264) {
							this.aClass131_1.method3601((Frame) local15.anObject20);
						} else {
							Class.forName("Class184").getMethod("exit").invoke(this.anObject11);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt9389 = 1;
			} catch (@Pc(862) ThreadDeath local862) {
				throw local862;
			} catch (@Pc(865) Throwable local865) {
				local15.anInt9389 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!tj;")
	public Class328 method3226(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method3232(9, 0, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/String;ZI)Lclient!tj;")
	public Class328 method3228(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return this.method3232(arg1 ? 22 : 1, 0, arg0, arg2);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lclient!tj;")
	public Class328 method3229(@OriginalArg(1) int arg0) {
		return this.method3232(3, 0, (Object) null, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBIII)Lclient!tj;")
	public Class328 method3230(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3232(6, arg2 << 16, (Object) null, (arg1 << 16) + arg0);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3231() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!tj;")
	private Class328 method3232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class328 local3 = new Class328();
		local3.anInt9390 = arg3;
		local3.anInt9391 = arg0;
		local3.anInt9392 = arg1;
		local3.anObject20 = arg2;
		synchronized (this) {
			if (this.aClass328_1 == null) {
				this.aClass328_1 = this.aClass328_2 = local3;
			} else {
				this.aClass328_1.aClass328_8 = local3;
				this.aClass328_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public void method3233() {
		Static177.aLong94 = Static32.method595() + 5000L;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;I)Lclient!tj;")
	public Class328 method3234(@OriginalArg(0) Component arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int arg4) {
		return this.method3232(17, arg4, new Object[] { arg0, arg1, arg3 }, arg2);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Lclient!tj;")
	public Class328 method3235() {
		return this.method3232(5, 0, (Object) null, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!tj;")
	public Class328 method3236(@OriginalArg(0) URL arg0) {
		return this.method3232(4, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!tj;")
	public Class328 method3237(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method3232(2, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lclient!tj;")
	public Class328 method3238(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return this.method3232(8, 0, new Object[] { arg2, arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
	public void method3239() {
		synchronized (this) {
			this.aBoolean265 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass171_2 != null) {
			try {
				this.aClass171_2.method4934();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass171_4 != null) {
			try {
				this.aClass171_4.method4934();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass171Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass171Array1.length; local44++) {
				if (this.aClass171Array1[local44] != null) {
					try {
						this.aClass171Array1[local44].method4934();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass171_3 != null) {
			try {
				this.aClass171_3.method4934();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/lang/String;)Lclient!tj;")
	public Class328 method3240(@OriginalArg(1) String arg0) {
		return this.method3232(16, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;ZB)Lclient!tj;")
	public Class328 method3241(@OriginalArg(0) String arg0) {
		return this.method3232(12, 0, arg0, 0);
	}
}
