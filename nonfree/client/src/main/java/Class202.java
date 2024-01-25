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

@OriginalClass("client!kj")
public final class Class202 implements Runnable {

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "Z")
	public boolean aBoolean384 = false;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "Lclient!qaa;")
	public Class281 aClass281_2 = null;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Lclient!rb;")
	private Class297 aClass297_2 = null;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Z")
	private boolean aBoolean385 = false;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "Lclient!qaa;")
	public Class281 aClass281_3 = null;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "Lclient!rb;")
	private Class297 aClass297_3 = null;

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "Z")
	public boolean aBoolean386 = false;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "Lclient!qaa;")
	public Class281 aClass281_4 = null;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "[Lclient!qaa;")
	public Class281[] aClass281Array1;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "Ljava/lang/Object;")
	private Object anObject9;

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "Lclient!saa;")
	private Class315 aClass315_1;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "Ljava/lang/Object;")
	private Object anObject8;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Lclient!ifa;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class202(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static308.anInt5488 = arg0;
		Static308.aString50 = "Unknown";
		Static308.aString49 = arg1;
		this.aBoolean384 = arg3;
		Static308.aString46 = "1.1";
		try {
			Static308.aString50 = System.getProperty("java.vendor");
			Static308.aString46 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static308.aString50.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean386 = true;
		}
		try {
			Static308.aString47 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static308.aString47 = "Unknown";
		}
		Static308.aString53 = Static308.aString47.toLowerCase();
		try {
			Static308.aString52 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static308.aString52 = "";
		}
		try {
			Static308.aString51 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static308.aString51 = "";
		}
		try {
			Static308.aString48 = System.getProperty("user.home");
			if (Static308.aString48 != null) {
				Static308.aString48 = Static308.aString48 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static308.aString48 == null) {
			Static308.aString48 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean386) {
			try {
				Static308.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static308.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static519.method7338(Static308.aString49, Static308.anInt5488);
		if (this.aBoolean384) {
			this.aClass281_2 = new Class281(Static519.method7340(Static308.anInt5488, "random.dat", (String) null), "rw", 25L);
			this.aClass281_3 = new Class281(Static519.method7339("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass281_4 = new Class281(Static519.method7339("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass281Array1 = new Class281[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass281Array1[local180] = new Class281(Static519.method7339("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean386) {
				try {
					this.anObject7 = Class.forName("Class251").getDeclaredConstructor().newInstance();
				} catch (@Pc(213) Throwable local213) {
				}
			}
			try {
				if (this.aBoolean386) {
					this.aClass315_1 = new Class315();
				} else {
					this.anObject9 = Class.forName("Class376").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(230) Throwable local230) {
			}
			try {
				if (this.aBoolean386) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject8 = Class.forName("Class91").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(246) Throwable local246) {
			}
		}
		if (this.aBoolean384 && !this.aBoolean386) {
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
		this.aBoolean385 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!kj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class297 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean385) {
						return;
					}
					if (this.aClass297_2 != null) {
						local15 = this.aClass297_2;
						this.aClass297_2 = this.aClass297_2.aClass297_8;
						if (this.aClass297_2 == null) {
							this.aClass297_3 = null;
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
				@Pc(41) int local41 = local15.anInt8460;
				if (local41 == 1) {
					if (Static124.method1947() < Static308.aLong158) {
						throw new IOException();
					}
					local15.anObject15 = new Socket(InetAddress.getByName((String) local15.anObject16), local15.anInt8458);
				} else if (local41 == 22) {
					if (Static308.aLong158 > Static124.method1947()) {
						throw new IOException();
					}
					try {
						local15.anObject15 = Static577.method7869((String) local15.anObject16, local15.anInt8458).method891();
					} catch (@Pc(836) IOException_Sub1 local836) {
						local15.anObject15 = local836.getMessage();
						throw local836;
					}
				} else if (local41 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local15.anObject16);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local15.anInt8458);
					local15.anObject15 = local59;
				} else if (local41 == 4) {
					if (Static308.aLong158 > Static124.method1947()) {
						throw new IOException();
					}
					local15.anObject15 = new DataInputStream(((URL) local15.anObject16).openStream());
				} else {
					@Pc(86) Object[] local86;
					if (local41 == 8) {
						local86 = (Object[]) local15.anObject16;
						if (this.aBoolean384 && ((Class) local86[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject15 = ((Class) local86[0]).getDeclaredMethod((String) local86[1], (Class[]) local86[2]);
					} else if (local41 == 9) {
						local86 = (Object[]) local15.anObject16;
						if (this.aBoolean384 && ((Class) local86[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject15 = ((Class) local86[0]).getDeclaredField((String) local86[1]);
					} else if (local41 == 18) {
						@Pc(789) Clipboard local789 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject15 = local789.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(157) Transferable local157 = (Transferable) local15.anObject16;
						@Pc(160) Clipboard local160 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local160.setContents(local157, (ClipboardOwner) null);
					} else if (this.aBoolean384) {
						@Pc(481) String local481;
						if (local41 == 3) {
							if (Static308.aLong158 > Static124.method1947()) {
								throw new IOException();
							}
							local481 = (local15.anInt8458 >> 24 & 0xFF) + "." + (local15.anInt8458 >> 16 & 0xFF) + "." + (local15.anInt8458 >> 8 & 0xFF) + "." + (local15.anInt8458 & 0xFF);
							local15.anObject15 = InetAddress.getByName(local481).getHostName();
						} else if (local41 == 21) {
							if (Static124.method1947() < Static308.aLong158) {
								throw new IOException();
							}
							local15.anObject15 = InetAddress.getByName((String) local15.anObject16).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean386) {
								local15.anObject15 = this.aClass315_1.method7361();
							} else {
								local15.anObject15 = Class.forName("Class376").getMethod("listmodes").invoke(this.anObject9);
							}
						} else if (local41 == 6) {
							@Pc(215) Frame local215 = new Frame("Jagex Full Screen");
							local15.anObject15 = local215;
							local215.setResizable(false);
							if (this.aBoolean386) {
								this.aClass315_1.method7362(local15.anInt8461 >> 16, local215, local15.anInt8458 >>> 16, local15.anInt8461 & 0xFFFF, local15.anInt8458 & 0xFFFF);
							} else {
								Class.forName("Class376").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject9, local215, Integer.valueOf(local15.anInt8458 >>> 16), new Integer(local15.anInt8458 & 0xFFFF), Integer.valueOf(local15.anInt8461 >> 16), new Integer(local15.anInt8461 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(370) Class281 local370;
							if (local41 == 12) {
								local370 = Static308.method4736(Static308.aString49, (String) local15.anObject16, Static308.anInt5488);
								local15.anObject15 = local370;
							} else if (local41 == 13) {
								local370 = Static308.method4736("", (String) local15.anObject16, Static308.anInt5488);
								local15.anObject15 = local370;
							} else if (this.aBoolean384 && local41 == 14) {
								@Pc(402) int local402 = local15.anInt8458;
								@Pc(405) int local405 = local15.anInt8461;
								if (this.aBoolean386) {
									this.aCallback_Sub1_1.method3493(local405, local402);
								} else {
									Class.forName("Class91").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject8, Integer.valueOf(local402), new Integer(local405));
								}
							} else if (this.aBoolean384 && local41 == 15) {
								@Pc(651) boolean local651 = local15.anInt8458 != 0;
								@Pc(655) Component local655 = (Component) local15.anObject16;
								if (this.aBoolean386) {
									this.aCallback_Sub1_1.method3494(local655, local651);
								} else {
									Class.forName("Class91").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject8, local655, Boolean.valueOf(local651));
								}
							} else if (!this.aBoolean386 && local41 == 17) {
								local86 = (Object[]) local15.anObject16;
								Class.forName("Class91").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject8, (Component) local86[0], (int[]) local86[1], Integer.valueOf(local15.anInt8458), new Integer(local15.anInt8461), (Point) local86[2]);
							} else if (local41 == 16) {
								try {
									if (!Static308.aString53.startsWith("win")) {
										throw new Exception();
									}
									local481 = (String) local15.anObject16;
									if (!local481.startsWith("http://") && !local481.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(495) String local495 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(497) int local497 = 0; local481.length() > local497; local497++) {
										if (local495.indexOf(local481.charAt(local497)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local481 + "\"");
									local15.anObject15 = null;
								} catch (@Pc(536) Exception local536) {
									local15.anObject15 = local536;
									throw local536;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean386) {
							this.aClass315_1.method7360((Frame) local15.anObject16);
						} else {
							Class.forName("Class376").getMethod("exit").invoke(this.anObject9);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt8459 = 1;
			} catch (@Pc(867) ThreadDeath local867) {
				throw local867;
			} catch (@Pc(870) Throwable local870) {
				local15.anInt8459 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
	public void method4723() {
		Static308.aLong158 = Static124.method1947() + 5000L;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public Object method4724() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lclient!rb;")
	public Class297 method4725(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method4728(0, new Object[] { arg1, arg0 }, 0, 9);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;)Lclient!rb;")
	public Class297 method4726(@OriginalArg(1) String arg0) {
		return this.method4728(0, arg0, 0, 16);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!rb;")
	public Class297 method4727(@OriginalArg(1) Frame arg0) {
		return this.method4728(0, arg0, 0, 7);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lclient!rb;")
	private Class297 method4728(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class297 local3 = new Class297();
		local3.anInt8460 = arg3;
		local3.anInt8461 = arg2;
		local3.anObject16 = arg1;
		local3.anInt8458 = arg0;
		synchronized (this) {
			if (this.aClass297_3 == null) {
				this.aClass297_3 = this.aClass297_2 = local3;
			} else {
				this.aClass297_3.aClass297_8 = local3;
				this.aClass297_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lclient!rb;")
	public Class297 method4729(@OriginalArg(0) int arg0) {
		return this.method4728(arg0, (Object) null, 0, 3);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZIILjava/lang/String;)Lclient!rb;")
	public Class297 method4730(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		return this.method4728(arg1, arg2, 0, arg0 ? 22 : 1);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIILjava/awt/Component;BLjava/awt/Point;)Lclient!rb;")
	public Class297 method4731(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(5) Point arg4) {
		return this.method4728(arg2, new Object[] { arg3, arg0, arg4 }, arg1, 17);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([BLjava/io/File;I)Z")
	public boolean method4732(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!rb;")
	public Class297 method4733(@OriginalArg(0) String arg0) {
		return this.method4728(0, arg0, 0, 12);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public void method4734() {
		synchronized (this) {
			this.aBoolean385 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass281_3 != null) {
			try {
				this.aClass281_3.method6893();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass281_4 != null) {
			try {
				this.aClass281_4.method6893();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass281Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass281Array1.length; local48++) {
				if (this.aClass281Array1[local48] != null) {
					try {
						this.aClass281Array1[local48].method6893();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass281_2 != null) {
			try {
				this.aClass281_2.method6893();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!rb;")
	public Class297 method4737(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4728(arg1, arg0, 0, 2);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;Z)Lclient!rb;")
	public Class297 method4738(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2) {
		return this.method4728(0, new Object[] { arg0, arg2, arg1 }, 0, 8);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)Lclient!rb;")
	public Class297 method4739() {
		return this.method4728(0, (Object) null, 0, 5);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!rb;")
	public Class297 method4740(@OriginalArg(0) URL arg0) {
		return this.method4728(0, arg0, 0, 4);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)Lclient!rb;")
	public Class297 method4741(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method4728(arg0 + (arg2 << 16), (Object) null, arg1 << 16, 6);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)Z")
	public boolean method4742() {
		if (!this.aBoolean384) {
			return false;
		} else if (this.aBoolean386) {
			return this.aClass315_1 != null;
		} else {
			return this.anObject9 != null;
		}
	}
}
