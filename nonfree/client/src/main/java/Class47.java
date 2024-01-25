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

@OriginalClass("client!br")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!br", name = "j", descriptor = "Lclient!pga;")
	public Class288 aClass288_2 = null;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Lclient!pga;")
	public Class288 aClass288_1 = null;

	@OriginalMember(owner = "client!br", name = "B", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "Lclient!pga;")
	public Class288 aClass288_3 = null;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "Lclient!sfa;")
	private Class338 aClass338_1 = null;

	@OriginalMember(owner = "client!br", name = "C", descriptor = "Lclient!sfa;")
	private Class338 aClass338_2 = null;

	@OriginalMember(owner = "client!br", name = "x", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "[Lclient!pga;")
	public Class288[] aClass288Array1;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "Ljava/lang/Object;")
	private Object anObject4;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject3;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "Lclient!vca;")
	private Class387 aClass387_1;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "Lclient!oi;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static60.aString27 = "Unknown";
		this.aBoolean105 = arg3;
		Static60.aString28 = arg1;
		Static60.anInt1493 = arg0;
		Static60.aString23 = "1.1";
		try {
			Static60.aString27 = System.getProperty("java.vendor");
			Static60.aString23 = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		if (Static60.aString27.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean106 = true;
		}
		try {
			Static60.aString22 = System.getProperty("os.name");
		} catch (@Pc(72) Exception local72) {
			Static60.aString22 = "Unknown";
		}
		Static60.aString26 = Static60.aString22.toLowerCase();
		try {
			Static60.aString25 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(87) Exception local87) {
			Static60.aString25 = "";
		}
		try {
			Static60.aString24 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(97) Exception local97) {
			Static60.aString24 = "";
		}
		try {
			Static60.aString21 = System.getProperty("user.home");
			if (Static60.aString21 != null) {
				Static60.aString21 = Static60.aString21 + "/";
			}
		} catch (@Pc(117) Exception local117) {
		}
		if (Static60.aString21 == null) {
			Static60.aString21 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(131) Throwable local131) {
		}
		if (!this.aBoolean106) {
			try {
				Static60.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(151) Exception local151) {
			}
			try {
				Static60.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(168) Exception local168) {
			}
		}
		Static200.method3058(Static60.aString28, Static60.anInt1493);
		if (this.aBoolean105) {
			this.aClass288_3 = new Class288(Static200.method3057((String) null, "random.dat", Static60.anInt1493), "rw", 25L);
			this.aClass288_1 = new Class288(Static200.method3059("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass288_2 = new Class288(Static200.method3059("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass288Array1 = new Class288[arg2];
			for (@Pc(226) int local226 = 0; local226 < arg2; local226++) {
				this.aClass288Array1[local226] = new Class288(Static200.method3059("main_file_cache.idx" + local226), "rw", 1048576L);
			}
			if (this.aBoolean106) {
				try {
					this.anObject4 = Class.forName("og").getDeclaredConstructor().newInstance();
				} catch (@Pc(267) Throwable local267) {
				}
			}
			try {
				if (this.aBoolean106) {
					this.aClass387_1 = new Class387();
				} else {
					this.anObject3 = Class.forName("Class271").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(285) Throwable local285) {
			}
			try {
				if (this.aBoolean106) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject5 = Class.forName("uq").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(304) Throwable local304) {
			}
		}
		if (this.aBoolean105 && !this.aBoolean106) {
			@Pc(316) ThreadGroup local316 = Thread.currentThread().getThreadGroup();
			for (@Pc(319) ThreadGroup local319 = local316.getParent(); local319 != null; local319 = local319.getParent()) {
				local316 = local319;
			}
			@Pc(330) Thread[] local330 = new Thread[1000];
			local316.enumerate(local330);
			for (@Pc(336) int local336 = 0; local336 < local330.length; local336++) {
				if (local330[local336] != null && local330[local336].getName().startsWith("AWT")) {
					local330[local336].setPriority(1);
				}
			}
		}
		this.aBoolean107 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBIILjava/lang/Object;)Lclient!sfa;")
	private Class338 method1387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class338 local3 = new Class338();
		local3.anInt8933 = arg0;
		local3.anObject17 = arg3;
		local3.anInt8936 = arg2;
		local3.anInt8935 = arg1;
		synchronized (this) {
			if (this.aClass338_1 == null) {
				this.aClass338_1 = this.aClass338_2 = local3;
			} else {
				this.aClass338_1.aClass338_7 = local3;
				this.aClass338_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lclient!sfa;")
	public Class338 method1388(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method1387(8, 0, 0, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	public void method1389() {
		Static60.aLong47 = Static517.method6965() + 5000L;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	public void method1390() {
		synchronized (this) {
			this.aBoolean107 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass288_1 != null) {
			try {
				this.aClass288_1.method6780();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass288_2 != null) {
			try {
				this.aClass288_2.method6780();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass288Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass288Array1.length; local55++) {
				if (this.aClass288Array1[local55] != null) {
					try {
						this.aClass288Array1[local55].method6780();
					} catch (@Pc(70) IOException local70) {
					}
				}
			}
		}
		if (this.aClass288_3 != null) {
			try {
				this.aClass288_3.method6780();
			} catch (@Pc(93) IOException local93) {
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;ZI)Lclient!sfa;")
	public Class338 method1391(@OriginalArg(0) String arg0) {
		return this.method1387(12, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/net/URL;)Lclient!sfa;")
	public Class338 method1393(@OriginalArg(1) URL arg0) {
		return this.method1387(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!sfa;")
	public Class338 method1394(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1387(2, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!br", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class338 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean107) {
						return;
					}
					if (this.aClass338_2 != null) {
						local15 = this.aClass338_2;
						this.aClass338_2 = this.aClass338_2.aClass338_7;
						if (this.aClass338_2 == null) {
							this.aClass338_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(42) int local42 = local15.anInt8933;
				if (local42 == 1) {
					if (Static60.aLong47 > Static517.method6965()) {
						throw new IOException();
					}
					local15.anObject16 = new Socket(InetAddress.getByName((String) local15.anObject17), local15.anInt8936);
				} else if (local42 == 22) {
					if (Static60.aLong47 > Static517.method6965()) {
						throw new IOException();
					}
					try {
						local15.anObject16 = Static234.method3392(local15.anInt8936, (String) local15.anObject17).method9059();
					} catch (@Pc(81) IOException_Sub1 local81) {
						local15.anObject16 = local81.getMessage();
						throw local81;
					}
				} else if (local42 == 2) {
					@Pc(933) Thread local933 = new Thread((Runnable) local15.anObject17);
					local933.setDaemon(true);
					local933.start();
					local933.setPriority(local15.anInt8936);
					local15.anObject16 = local933;
				} else if (local42 == 4) {
					if (Static60.aLong47 > Static517.method6965()) {
						throw new IOException();
					}
					local15.anObject16 = new DataInputStream(((URL) local15.anObject17).openStream());
				} else {
					@Pc(110) Object[] local110;
					if (local42 == 8) {
						local110 = (Object[]) local15.anObject17;
						if (this.aBoolean105 && ((Class) local110[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local110[0]).getDeclaredMethod((String) local110[1], (Class[]) local110[2]);
					} else if (local42 == 9) {
						local110 = (Object[]) local15.anObject17;
						if (this.aBoolean105 && ((Class) local110[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local110[0]).getDeclaredField((String) local110[1]);
					} else if (local42 == 18) {
						@Pc(868) Clipboard local868 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject16 = local868.getContents((Object) null);
					} else if (local42 == 19) {
						@Pc(857) Transferable local857 = (Transferable) local15.anObject17;
						@Pc(860) Clipboard local860 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local860.setContents(local857, (ClipboardOwner) null);
					} else if (this.aBoolean105) {
						@Pc(623) String local623;
						if (local42 == 3) {
							if (Static60.aLong47 > Static517.method6965()) {
								throw new IOException();
							}
							local623 = (local15.anInt8936 >> 24 & 0xFF) + "." + (local15.anInt8936 >> 16 & 0xFF) + "." + (local15.anInt8936 >> 8 & 0xFF) + "." + (local15.anInt8936 & 0xFF);
							local15.anObject16 = InetAddress.getByName(local623).getHostName();
						} else if (local42 == 21) {
							if (Static517.method6965() < Static60.aLong47) {
								throw new IOException();
							}
							local15.anObject16 = InetAddress.getByName((String) local15.anObject17).getAddress();
						} else if (local42 == 5) {
							if (this.aBoolean106) {
								local15.anObject16 = this.aClass387_1.method9003();
							} else {
								local15.anObject16 = Class.forName("Class271").getMethod("listmodes").invoke(this.anObject3);
							}
						} else if (local42 == 6) {
							@Pc(215) Frame local215 = new Frame("Jagex Full Screen");
							local15.anObject16 = local215;
							local215.setResizable(false);
							if (this.aBoolean106) {
								this.aClass387_1.method9001(local15.anInt8935 >> 16, local15.anInt8935 & 0xFFFF, local215, local15.anInt8936 >>> 16, local15.anInt8936 & 0xFFFF);
							} else {
								Class.forName("Class271").getMethod("enter", Static60.aClass1 == null ? (Static60.aClass1 = a("java.awt.Frame")) : Static60.aClass1, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject3, local215, Integer.valueOf(local15.anInt8936 >>> 16), new Integer(local15.anInt8936 & 0xFFFF), Integer.valueOf(local15.anInt8935 >> 16), new Integer(local15.anInt8935 & 0xFFFF));
							}
						} else if (local42 != 7) {
							@Pc(384) Class288 local384;
							if (local42 == 12) {
								local384 = Static60.method1386(Static60.anInt1493, (String) local15.anObject17, Static60.aString28);
								local15.anObject16 = local384;
							} else if (local42 == 13) {
								local384 = Static60.method1386(Static60.anInt1493, (String) local15.anObject17, "");
								local15.anObject16 = local384;
							} else if (this.aBoolean105 && local42 == 14) {
								@Pc(699) int local699 = local15.anInt8936;
								@Pc(702) int local702 = local15.anInt8935;
								if (this.aBoolean106) {
									this.aCallback_Sub1_1.method6344(local702, local699);
								} else {
									Class.forName("uq").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject5, Integer.valueOf(local699), new Integer(local702));
								}
							} else if (this.aBoolean105 && local42 == 15) {
								@Pc(423) boolean local423 = local15.anInt8936 != 0;
								@Pc(427) Component local427 = (Component) local15.anObject17;
								if (this.aBoolean106) {
									this.aCallback_Sub1_1.method6345(local423, local427);
								} else {
									Class.forName("uq").getDeclaredMethod("showcursor", Static60.aClass2 == null ? (Static60.aClass2 = a("java.awt.Component")) : Static60.aClass2, Boolean.TYPE).invoke(this.anObject5, local427, Boolean.valueOf(local423));
								}
							} else if (!this.aBoolean106 && local42 == 17) {
								local110 = (Object[]) local15.anObject17;
								Class.forName("uq").getDeclaredMethod("setcustomcursor", Static60.aClass2 == null ? (Static60.aClass2 = a("java.awt.Component")) : Static60.aClass2, Static60.aClass3 == null ? (Static60.aClass3 = a("[I")) : Static60.aClass3, Integer.TYPE, Integer.TYPE, Static60.aClass4 == null ? (Static60.aClass4 = a("java.awt.Point")) : Static60.aClass4).invoke(this.anObject5, (Component) local110[0], (int[]) local110[1], Integer.valueOf(local15.anInt8936), new Integer(local15.anInt8935), (Point) local110[2]);
							} else if (local42 == 16) {
								try {
									if (!Static60.aString26.startsWith("win")) {
										throw new Exception();
									}
									local623 = (String) local15.anObject17;
									if (!local623.startsWith("http://") && !local623.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(646) String local646 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(648) int local648 = 0; local648 < local623.length(); local648++) {
										if (local646.indexOf(local623.charAt(local648)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local623 + "\"");
									local15.anObject16 = null;
								} catch (@Pc(686) Exception local686) {
									local15.anObject16 = local686;
									throw local686;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean106) {
							this.aClass387_1.method9002((Frame) local15.anObject17);
						} else {
							Class.forName("Class271").getMethod("exit").invoke(this.anObject3);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt8934 = 1;
			} catch (@Pc(976) ThreadDeath local976) {
				throw local976;
			} catch (@Pc(979) Throwable local979) {
				local15.anInt8934 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)Z")
	public boolean method1395() {
		if (!this.aBoolean105) {
			return false;
		} else if (this.aBoolean106) {
			return this.aClass387_1 != null;
		} else {
			return this.anObject3 != null;
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)Lclient!sfa;")
	public Class338 method1396() {
		return this.method1387(5, 0, 0, (Object) null);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZILjava/lang/String;)Lclient!sfa;")
	public Class338 method1397(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method1387(arg0 ? 22 : 1, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)Lclient!sfa;")
	public Class338 method1398(@OriginalArg(1) int arg0) {
		return this.method1387(3, 0, arg0, (Object) null);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/io/File;B[B)Z")
	public boolean method1399(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!sfa;")
	public Class338 method1400(@OriginalArg(1) Frame arg0) {
		return this.method1387(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!sfa;")
	public Class338 method1401(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method1387(9, 0, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([IILjava/awt/Component;BILjava/awt/Point;)Lclient!sfa;")
	public Class338 method1402(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method1387(17, arg3, arg1, new Object[] { arg2, arg0, arg4 });
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!sfa;")
	public Class338 method1403(@OriginalArg(0) String arg0) {
		return this.method1387(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method1404() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIII)Lclient!sfa;")
	public Class338 method1405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method1387(6, arg2 << 16, arg0 + (arg1 << 16), (Object) null);
	}
}
