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

@OriginalClass("client!gba")
public final class Class114 implements Runnable {

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!gba", name = "m", descriptor = "Lclient!rg;")
	public Class283 aClass283_2 = null;

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "Lclient!rg;")
	public Class283 aClass283_1 = null;

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "Lclient!ba;")
	private Class23 aClass23_8 = null;

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "Z")
	public boolean aBoolean212 = false;

	@OriginalMember(owner = "client!gba", name = "v", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!gba", name = "i", descriptor = "Lclient!ba;")
	private Class23 aClass23_7 = null;

	@OriginalMember(owner = "client!gba", name = "y", descriptor = "Lclient!rg;")
	public Class283 aClass283_3 = null;

	@OriginalMember(owner = "client!gba", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!gba", name = "B", descriptor = "[Lclient!rg;")
	public Class283[] aClass283Array1;

	@OriginalMember(owner = "client!gba", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!gba", name = "s", descriptor = "Lclient!wb;")
	private Class351 aClass351_1;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!gba", name = "w", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!gba", name = "x", descriptor = "Lclient!oda;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static162.aString30 = "1.1";
		this.aBoolean212 = arg3;
		Static162.anInt2964 = arg0;
		Static162.aString35 = arg1;
		Static162.aString32 = "Unknown";
		try {
			Static162.aString32 = System.getProperty("java.vendor");
			Static162.aString30 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static162.aString32.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean213 = true;
		}
		try {
			Static162.aString33 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static162.aString33 = "Unknown";
		}
		Static162.aString37 = Static162.aString33.toLowerCase();
		try {
			Static162.aString31 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static162.aString31 = "";
		}
		try {
			Static162.aString34 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static162.aString34 = "";
		}
		try {
			Static162.aString36 = System.getProperty("user.home");
			if (Static162.aString36 != null) {
				Static162.aString36 = Static162.aString36 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static162.aString36 == null) {
			Static162.aString36 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean213) {
			try {
				Static162.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static162.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static10.method139(Static162.aString35, Static162.anInt2964);
		if (this.aBoolean212) {
			this.aClass283_1 = new Class283(Static10.method140(Static162.anInt2964, null, "random.dat"), "rw", 25L);
			this.aClass283_3 = new Class283(Static10.method141("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass283_2 = new Class283(Static10.method141("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass283Array1 = new Class283[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass283Array1[local180] = new Class283(Static10.method141("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean213) {
				try {
					this.anObject6 = Class.forName("Class119").getDeclaredConstructor().newInstance();
				} catch (@Pc(217) Throwable local217) {
				}
			}
			try {
				if (this.aBoolean213) {
					this.aClass351_1 = new Class351();
				} else {
					this.anObject5 = Class.forName("Class110").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(234) Throwable local234) {
			}
			try {
				if (this.aBoolean213) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject7 = Class.forName("Class358").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(250) Throwable local250) {
			}
		}
		if (this.aBoolean212 && !this.aBoolean213) {
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
		this.aBoolean211 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!ba;")
	public Class23 method2498(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method2512(arg0, 0, 2, arg1);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!ba;")
	public Class23 method2500(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2512(new Object[] { arg1, arg0 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
	public void method2501() {
		synchronized (this) {
			this.aBoolean211 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		if (this.aClass283_3 != null) {
			try {
				this.aClass283_3.method6494();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass283_2 != null) {
			try {
				this.aClass283_2.method6494();
			} catch (@Pc(48) IOException local48) {
			}
		}
		if (this.aClass283Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass283Array1.length; local54++) {
				if (this.aClass283Array1[local54] != null) {
					try {
						this.aClass283Array1[local54].method6494();
					} catch (@Pc(68) IOException local68) {
					}
				}
			}
		}
		if (this.aClass283_1 != null) {
			try {
				this.aClass283_1.method6494();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!ba;")
	public Class23 method2502(@OriginalArg(0) Frame arg0) {
		return this.method2512(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ba;")
	public Class23 method2503(@OriginalArg(0) String arg0) {
		return this.method2512(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZ)Lclient!ba;")
	public Class23 method2504(@OriginalArg(0) int arg0) {
		return this.method2512(null, 0, 3, arg0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)Z")
	public boolean method2505() {
		if (!this.aBoolean212) {
			return false;
		} else if (this.aBoolean213) {
			return this.aClass351_1 != null;
		} else {
			return this.anObject5 != null;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/awt/Point;ZILjava/awt/Component;I[I)Lclient!ba;")
	public Class23 method2506(@OriginalArg(0) Point arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		return this.method2512(new Object[] { arg2, arg4, arg0 }, arg1, 17, arg3);
	}

	@OriginalMember(owner = "client!gba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class23 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean211) {
						return;
					}
					if (this.aClass23_7 != null) {
						local15 = this.aClass23_7;
						this.aClass23_7 = this.aClass23_7.aClass23_1;
						if (this.aClass23_7 == null) {
							this.aClass23_8 = null;
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
				@Pc(41) int local41 = local15.anInt877;
				if (local41 == 1) {
					if (Static255.method4035() < Static162.aLong140) {
						throw new IOException();
					}
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt876);
				} else if (local41 == 22) {
					if (Static162.aLong140 > Static255.method4035()) {
						throw new IOException();
					}
					try {
						local15.anObject1 = Static577.method7758((String) local15.anObject2, local15.anInt876).method6500();
					} catch (@Pc(859) IOException_Sub1 local859) {
						local15.anObject1 = local859.getMessage();
						throw local859;
					}
				} else if (local41 == 2) {
					@Pc(86) Thread local86 = new Thread((Runnable) local15.anObject2);
					local86.setDaemon(true);
					local86.start();
					local86.setPriority(local15.anInt876);
					local15.anObject1 = local86;
				} else if (local41 == 4) {
					if (Static255.method4035() < Static162.aLong140) {
						throw new IOException();
					}
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(137) Object[] local137;
					if (local41 == 8) {
						local137 = (Object[]) local15.anObject2;
						if (this.aBoolean212 && ((Class) local137[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject1 = ((Class) local137[0]).getDeclaredMethod((String) local137[1], (Class[]) local137[2]);
					} else if (local41 == 9) {
						local137 = (Object[]) local15.anObject2;
						if (this.aBoolean212 && ((Class) local137[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject1 = ((Class) local137[0]).getDeclaredField((String) local137[1]);
					} else if (local41 == 18) {
						@Pc(794) Clipboard local794 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject1 = local794.getContents(null);
					} else if (local41 == 19) {
						@Pc(783) Transferable local783 = (Transferable) local15.anObject2;
						@Pc(786) Clipboard local786 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local786.setContents(local783, null);
					} else if (this.aBoolean212) {
						@Pc(655) String local655;
						if (local41 == 3) {
							if (Static162.aLong140 > Static255.method4035()) {
								throw new IOException();
							}
							local655 = (local15.anInt876 >> 24 & 0xFF) + "." + (local15.anInt876 >> 16 & 0xFF) + "." + (local15.anInt876 >> 8 & 0xFF) + "." + (local15.anInt876 & 0xFF);
							local15.anObject1 = InetAddress.getByName(local655).getHostName();
						} else if (local41 == 21) {
							if (Static162.aLong140 > Static255.method4035()) {
								throw new IOException();
							}
							local15.anObject1 = InetAddress.getByName((String) local15.anObject2).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean213) {
								local15.anObject1 = this.aClass351_1.method7710();
							} else {
								local15.anObject1 = Class.forName("Class110").getMethod("listmodes").invoke(this.anObject5);
							}
						} else if (local41 == 6) {
							@Pc(240) Frame local240 = new Frame("Jagex Full Screen");
							local15.anObject1 = local240;
							local240.setResizable(false);
							if (this.aBoolean213) {
								this.aClass351_1.method7709(local15.anInt874 & 0xFFFF, local15.anInt874 >> 16, local15.anInt876 & 0xFFFF, local240, local15.anInt876 >>> 16);
							} else {
								Class.forName("Class110").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject5, local240, Integer.valueOf(local15.anInt876 >>> 16), new Integer(local15.anInt876 & 0xFFFF), Integer.valueOf(local15.anInt874 >> 16), new Integer(local15.anInt874 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(400) Class283 local400;
							if (local41 == 12) {
								local400 = Static162.method2499(Static162.anInt2964, (String) local15.anObject2, Static162.aString35);
								local15.anObject1 = local400;
							} else if (local41 == 13) {
								local400 = Static162.method2499(Static162.anInt2964, (String) local15.anObject2, "");
								local15.anObject1 = local400;
							} else if (this.aBoolean212 && local41 == 14) {
								@Pc(413) int local413 = local15.anInt876;
								@Pc(416) int local416 = local15.anInt874;
								if (this.aBoolean213) {
									this.aCallback_Sub1_1.method5457(local413, local416);
								} else {
									Class.forName("Class358").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject7, Integer.valueOf(local413), new Integer(local416));
								}
							} else if (this.aBoolean212 && local41 == 15) {
								@Pc(479) boolean local479 = local15.anInt876 != 0;
								@Pc(483) Component local483 = (Component) local15.anObject2;
								if (this.aBoolean213) {
									this.aCallback_Sub1_1.method5456(local479, local483);
								} else {
									Class.forName("Class358").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject7, local483, Boolean.valueOf(local479));
								}
							} else if (!this.aBoolean213 && local41 == 17) {
								local137 = (Object[]) local15.anObject2;
								Class.forName("Class358").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject7, (Component) local137[0], (int[]) local137[1], Integer.valueOf(local15.anInt876), new Integer(local15.anInt874), (Point) local137[2]);
							} else if (local41 == 16) {
								try {
									if (!Static162.aString37.startsWith("win")) {
										throw new Exception();
									}
									local655 = (String) local15.anObject2;
									if (!local655.startsWith("http://") && !local655.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(669) String local669 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(671) int local671 = 0;
									while (true) {
										if (local655.length() <= local671) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local655 + "\"");
											local15.anObject1 = null;
											break;
										}
										if (local669.indexOf(local655.charAt(local671)) == -1) {
											throw new Exception();
										}
										local671++;
									}
								} catch (@Pc(706) Exception local706) {
									local15.anObject1 = local706;
									throw local706;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean213) {
							this.aClass351_1.method7711((Frame) local15.anObject2);
						} else {
							Class.forName("Class110").getMethod("exit").invoke(this.anObject5);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt875 = 1;
			} catch (@Pc(870) ThreadDeath local870) {
				throw local870;
			} catch (@Pc(873) Throwable local873) {
				local15.anInt875 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lclient!ba;")
	public Class23 method2507(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method2512(new Object[] { arg1, arg0, arg2 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!ba;")
	public Class23 method2508(@OriginalArg(1) URL arg0) {
		return this.method2512(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	public void method2509() {
		Static162.aLong140 = Static255.method4035() + 5000L;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)Lclient!ba;")
	public Class23 method2510() {
		return this.method2512(null, 0, 5, 0);
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method2511() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!ba;")
	private Class23 method2512(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class23 local3 = new Class23();
		local3.anObject2 = arg0;
		local3.anInt876 = arg3;
		local3.anInt874 = arg1;
		local3.anInt877 = arg2;
		synchronized (this) {
			if (this.aClass23_8 == null) {
				this.aClass23_8 = this.aClass23_7 = local3;
			} else {
				this.aClass23_8.aClass23_1 = local3;
				this.aClass23_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZZILjava/lang/String;)Lclient!ba;")
	public Class23 method2513(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method2512(arg2, 0, arg0 ? 22 : 1, arg1);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;BZ)Lclient!ba;")
	public Class23 method2514(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method2512(arg0, 0, 12, 0) : this.method2512(arg0, 0, 13, 0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	public boolean method2516(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIII)Lclient!ba;")
	public Class23 method2517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method2512(null, arg1 << 16, 6, (arg2 << 16) + arg0);
	}
}
