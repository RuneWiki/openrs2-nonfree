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
public final class Class122 implements Runnable {

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "Lclient!vn;")
	private Class380 aClass380_1 = null;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
	public boolean aBoolean281 = false;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "Z")
	public boolean aBoolean282 = false;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Lclient!rv;")
	public Class320 aClass320_1 = null;

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "Lclient!rv;")
	public Class320 aClass320_2 = null;

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "Lclient!vn;")
	private Class380 aClass380_2 = null;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "Lclient!rv;")
	public Class320 aClass320_3 = null;

	@OriginalMember(owner = "client!ft", name = "E", descriptor = "Z")
	private boolean aBoolean283 = false;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ft", name = "F", descriptor = "[Lclient!rv;")
	public Class320[] aClass320Array1;

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject10;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "Ljava/lang/Object;")
	private Object anObject9;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "Lclient!lfa;")
	private Class222 aClass222_1;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "Lclient!nr;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static174.anInt3558 = arg0;
		Static174.aString37 = "1.1";
		this.aBoolean281 = arg3;
		Static174.aString38 = "Unknown";
		Static174.aString31 = arg1;
		try {
			Static174.aString38 = System.getProperty("java.vendor");
			Static174.aString37 = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		if (Static174.aString38.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean282 = true;
		}
		try {
			Static174.aString35 = System.getProperty("os.name");
		} catch (@Pc(72) Exception local72) {
			Static174.aString35 = "Unknown";
		}
		Static174.aString36 = Static174.aString35.toLowerCase();
		try {
			Static174.aString34 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(87) Exception local87) {
			Static174.aString34 = "";
		}
		try {
			Static174.aString33 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(97) Exception local97) {
			Static174.aString33 = "";
		}
		try {
			Static174.aString32 = System.getProperty("user.home");
			if (Static174.aString32 != null) {
				Static174.aString32 = Static174.aString32 + "/";
			}
		} catch (@Pc(117) Exception local117) {
		}
		if (Static174.aString32 == null) {
			Static174.aString32 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(131) Throwable local131) {
		}
		if (!this.aBoolean282) {
			try {
				Static174.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(151) Exception local151) {
			}
			try {
				Static174.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(168) Exception local168) {
			}
		}
		Static134.method2564(Static174.aString31, Static174.anInt3558);
		if (this.aBoolean281) {
			this.aClass320_3 = new Class320(Static134.method2563(Static174.anInt3558, (String) null, "random.dat"), "rw", 25L);
			this.aClass320_1 = new Class320(Static134.method2565("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass320_2 = new Class320(Static134.method2565("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass320Array1 = new Class320[arg2];
			for (@Pc(226) int local226 = 0; local226 < arg2; local226++) {
				this.aClass320Array1[local226] = new Class320(Static134.method2565("main_file_cache.idx" + local226), "rw", 1048576L);
			}
			if (this.aBoolean282) {
				try {
					this.anObject10 = Class.forName("dda").getDeclaredConstructor().newInstance();
				} catch (@Pc(271) Throwable local271) {
				}
			}
			try {
				if (this.aBoolean282) {
					this.aClass222_1 = new Class222();
				} else {
					this.anObject9 = Class.forName("nt").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(291) Throwable local291) {
			}
			try {
				if (this.aBoolean282) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject11 = Class.forName("vh").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(310) Throwable local310) {
			}
		}
		if (this.aBoolean281 && !this.aBoolean282) {
			@Pc(322) ThreadGroup local322 = Thread.currentThread().getThreadGroup();
			for (@Pc(325) ThreadGroup local325 = local322.getParent(); local325 != null; local325 = local325.getParent()) {
				local322 = local325;
			}
			@Pc(336) Thread[] local336 = new Thread[1000];
			local322.enumerate(local336);
			for (@Pc(342) int local342 = 0; local342 < local336.length; local342++) {
				if (local336[local342] != null && local336[local342].getName().startsWith("AWT")) {
					local336[local342].setPriority(1);
				}
			}
		}
		this.aBoolean283 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;ZII)Lclient!vn;")
	public Class380 method3344(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return this.method3357(arg0, arg2, arg1 ? 22 : 1, 0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)Lclient!vn;")
	public Class380 method3345(@OriginalArg(1) int arg0) {
		return this.method3357((Object) null, arg0, 3, 0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZIII)Lclient!vn;")
	public Class380 method3346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method3357((Object) null, arg0 + (arg1 << 16), 6, arg2 << 16);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	public boolean method3347(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([IIIILjava/awt/Component;Ljava/awt/Point;)Lclient!vn;")
	public Class380 method3348(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) Point arg4) {
		return this.method3357(new Object[] { arg3, arg0, arg4 }, arg2, 17, arg1);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3349() {
		return this.anObject10;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!vn;")
	public Class380 method3350(@OriginalArg(0) String arg0) {
		return this.method3357(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Class;)Lclient!vn;")
	public Class380 method3351(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method3357(new Object[] { arg2, arg1, arg0 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!vn;")
	public Class380 method3352(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method3357(arg0, arg1, 2, 0);
	}

	@OriginalMember(owner = "client!ft", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class380 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean283) {
						return;
					}
					if (this.aClass380_1 != null) {
						local15 = this.aClass380_1;
						this.aClass380_1 = this.aClass380_1.aClass380_8;
						if (this.aClass380_1 == null) {
							this.aClass380_2 = null;
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
				@Pc(42) int local42 = local15.anInt10065;
				if (local42 == 1) {
					if (Static549.method7758() < Static174.aLong101) {
						throw new IOException();
					}
					local15.anObject25 = new Socket(InetAddress.getByName((String) local15.anObject24), local15.anInt10064);
				} else if (local42 == 22) {
					if (Static174.aLong101 > Static549.method7758()) {
						throw new IOException();
					}
					try {
						local15.anObject25 = Static486.method7217((String) local15.anObject24, local15.anInt10064).method8877();
					} catch (@Pc(77) IOException_Sub1 local77) {
						local15.anObject25 = local77.getMessage();
						throw local77;
					}
				} else if (local42 == 2) {
					@Pc(93) Thread local93 = new Thread((Runnable) local15.anObject24);
					local93.setDaemon(true);
					local93.start();
					local93.setPriority(local15.anInt10064);
					local15.anObject25 = local93;
				} else if (local42 == 4) {
					if (Static174.aLong101 > Static549.method7758()) {
						throw new IOException();
					}
					local15.anObject25 = new DataInputStream(((URL) local15.anObject24).openStream());
				} else {
					@Pc(140) Object[] local140;
					if (local42 == 8) {
						local140 = (Object[]) local15.anObject24;
						if (this.aBoolean281 && ((Class) local140[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject25 = ((Class) local140[0]).getDeclaredMethod((String) local140[1], (Class[]) local140[2]);
					} else if (local42 == 9) {
						local140 = (Object[]) local15.anObject24;
						if (this.aBoolean281 && ((Class) local140[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject25 = ((Class) local140[0]).getDeclaredField((String) local140[1]);
					} else if (local42 == 18) {
						@Pc(185) Clipboard local185 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject25 = local185.getContents((Object) null);
					} else if (local42 == 19) {
						@Pc(886) Transferable local886 = (Transferable) local15.anObject24;
						@Pc(889) Clipboard local889 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local889.setContents(local886, (ClipboardOwner) null);
					} else if (this.aBoolean281) {
						@Pc(261) String local261;
						if (local42 == 3) {
							if (Static549.method7758() < Static174.aLong101) {
								throw new IOException();
							}
							local261 = (local15.anInt10064 >> 24 & 0xFF) + "." + (local15.anInt10064 >> 16 & 0xFF) + "." + (local15.anInt10064 >> 8 & 0xFF) + "." + (local15.anInt10064 & 0xFF);
							local15.anObject25 = InetAddress.getByName(local261).getHostName();
						} else if (local42 == 21) {
							if (Static549.method7758() < Static174.aLong101) {
								throw new IOException();
							}
							local15.anObject25 = InetAddress.getByName((String) local15.anObject24).getAddress();
						} else if (local42 == 5) {
							if (this.aBoolean282) {
								local15.anObject25 = this.aClass222_1.method5228();
							} else {
								local15.anObject25 = Class.forName("nt").getMethod("listmodes").invoke(this.anObject9);
							}
						} else if (local42 == 6) {
							@Pc(320) Frame local320 = new Frame("Jagex Full Screen");
							local15.anObject25 = local320;
							local320.setResizable(false);
							if (this.aBoolean282) {
								this.aClass222_1.method5229(local15.anInt10066 & 0xFFFF, local15.anInt10064 >>> 16, local15.anInt10064 & 0xFFFF, local320, local15.anInt10066 >> 16);
							} else {
								Class.forName("nt").getMethod("enter", Static174.aClass7 == null ? (Static174.aClass7 = a("java.awt.Frame")) : Static174.aClass7, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject9, local320, Integer.valueOf(local15.anInt10064 >>> 16), new Integer(local15.anInt10064 & 0xFFFF), Integer.valueOf(local15.anInt10066 >> 16), new Integer(local15.anInt10066 & 0xFFFF));
							}
						} else if (local42 != 7) {
							@Pc(490) Class320 local490;
							if (local42 == 12) {
								local490 = Static174.method3363(Static174.aString31, (String) local15.anObject24, Static174.anInt3558);
								local15.anObject25 = local490;
							} else if (local42 == 13) {
								local490 = Static174.method3363("", (String) local15.anObject24, Static174.anInt3558);
								local15.anObject25 = local490;
							} else if (this.aBoolean281 && local42 == 14) {
								@Pc(520) int local520 = local15.anInt10064;
								@Pc(523) int local523 = local15.anInt10066;
								if (this.aBoolean282) {
									this.aCallback_Sub1_1.method6253(local523, local520);
								} else {
									Class.forName("vh").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject11, Integer.valueOf(local520), new Integer(local523));
								}
							} else if (this.aBoolean281 && local42 == 15) {
								@Pc(591) boolean local591 = local15.anInt10064 != 0;
								@Pc(595) Component local595 = (Component) local15.anObject24;
								if (this.aBoolean282) {
									this.aCallback_Sub1_1.method6252(local595, local591);
								} else {
									Class.forName("vh").getDeclaredMethod("showcursor", Static174.aClass8 == null ? (Static174.aClass8 = a("java.awt.Component")) : Static174.aClass8, Boolean.TYPE).invoke(this.anObject11, local595, Boolean.valueOf(local591));
								}
							} else if (!this.aBoolean282 && local42 == 17) {
								local140 = (Object[]) local15.anObject24;
								Class.forName("vh").getDeclaredMethod("setcustomcursor", Static174.aClass8 == null ? (Static174.aClass8 = a("java.awt.Component")) : Static174.aClass8, Static174.aClass9 == null ? (Static174.aClass9 = a("[I")) : Static174.aClass9, Integer.TYPE, Integer.TYPE, Static174.aClass10 == null ? (Static174.aClass10 = a("java.awt.Point")) : Static174.aClass10).invoke(this.anObject11, (Component) local140[0], (int[]) local140[1], Integer.valueOf(local15.anInt10064), new Integer(local15.anInt10066), (Point) local140[2]);
							} else if (local42 == 16) {
								try {
									if (!Static174.aString36.startsWith("win")) {
										throw new Exception();
									}
									local261 = (String) local15.anObject24;
									if (!local261.startsWith("http://") && !local261.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(815) String local815 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(817) int local817 = 0;
									while (true) {
										if (local261.length() <= local817) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local261 + "\"");
											local15.anObject25 = null;
											break;
										}
										if (local815.indexOf(local261.charAt(local817)) == -1) {
											throw new Exception();
										}
										local817++;
									}
								} catch (@Pc(855) Exception local855) {
									local15.anObject25 = local855;
									throw local855;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean282) {
							this.aClass222_1.method5227((Frame) local15.anObject24);
						} else {
							Class.forName("nt").getMethod("exit").invoke(this.anObject9);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt10067 = 1;
			} catch (@Pc(952) ThreadDeath local952) {
				throw local952;
			} catch (@Pc(955) Throwable local955) {
				local15.anInt10067 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
	public void method3353() {
		synchronized (this) {
			this.aBoolean283 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass320_1 != null) {
			try {
				this.aClass320_1.method7693();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass320_2 != null) {
			try {
				this.aClass320_2.method7693();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass320Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass320Array1.length; local52++) {
				if (this.aClass320Array1[local52] != null) {
					try {
						this.aClass320Array1[local52].method7693();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass320_3 != null) {
			try {
				this.aClass320_3.method7693();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)Z")
	public boolean method3354() {
		if (!this.aBoolean281) {
			return false;
		} else if (this.aBoolean282) {
			return this.aClass222_1 != null;
		} else {
			return this.anObject9 != null;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/net/URL;)Lclient!vn;")
	public Class380 method3355(@OriginalArg(1) URL arg0) {
		return this.method3357(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;ZI)Lclient!vn;")
	public Class380 method3356(@OriginalArg(0) String arg0) {
		return this.method3357(arg0, 0, 12, 0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Lclient!vn;")
	private Class380 method3357(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class380 local3 = new Class380();
		local3.anObject24 = arg0;
		local3.anInt10066 = arg3;
		local3.anInt10064 = arg1;
		local3.anInt10065 = arg2;
		synchronized (this) {
			if (this.aClass380_2 == null) {
				this.aClass380_2 = this.aClass380_1 = local3;
			} else {
				this.aClass380_2.aClass380_8 = local3;
				this.aClass380_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Lclient!vn;")
	public Class380 method3359() {
		return this.method3357((Object) null, 0, 5, 0);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(Z)V")
	public void method3360() {
		Static174.aLong101 = Static549.method7758() + 5000L;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!vn;")
	public Class380 method3361(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3357(new Object[] { arg1, arg0 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!vn;")
	public Class380 method3362(@OriginalArg(0) Frame arg0) {
		return this.method3357(arg0, 0, 7, 0);
	}
}
