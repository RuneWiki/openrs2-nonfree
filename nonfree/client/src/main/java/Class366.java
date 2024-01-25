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

@OriginalClass("client!wv")
public final class Class366 implements Runnable {

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "Lclient!wc;")
	public Class354 aClass354_3 = null;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!tj;")
	private Class316 aClass316_8 = null;

	@OriginalMember(owner = "client!wv", name = "u", descriptor = "Lclient!tj;")
	private Class316 aClass316_9 = null;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Lclient!wc;")
	public Class354 aClass354_2 = null;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "Lclient!wc;")
	public Class354 aClass354_4 = null;

	@OriginalMember(owner = "client!wv", name = "x", descriptor = "Z")
	public boolean aBoolean719 = false;

	@OriginalMember(owner = "client!wv", name = "z", descriptor = "Z")
	public boolean aBoolean720 = false;

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "Z")
	private boolean aBoolean718 = false;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!wv", name = "v", descriptor = "[Lclient!wc;")
	public Class354[] aClass354Array1;

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "Ljava/lang/Object;")
	private Object anObject160;

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "Lclient!dr;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "Ljava/lang/Object;")
	private Object anObject159;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Ljava/lang/Object;")
	private Object anObject158;

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "Lclient!gq;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class366(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static594.aString242 = "1.1";
		Static594.anInt10605 = arg0;
		this.aBoolean719 = arg3;
		Static594.aString235 = "Unknown";
		Static594.aString236 = arg1;
		try {
			Static594.aString235 = System.getProperty("java.vendor");
			Static594.aString242 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static594.aString235.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean720 = true;
		}
		try {
			Static594.aString239 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static594.aString239 = "Unknown";
		}
		Static594.aString238 = Static594.aString239.toLowerCase();
		try {
			Static594.aString241 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static594.aString241 = "";
		}
		try {
			Static594.aString237 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static594.aString237 = "";
		}
		try {
			Static594.aString240 = System.getProperty("user.home");
			if (Static594.aString240 != null) {
				Static594.aString240 = Static594.aString240 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static594.aString240 == null) {
			Static594.aString240 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean720) {
			try {
				Static594.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static594.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static69.method1515(Static594.aString236, Static594.anInt10605);
		if (this.aBoolean719) {
			this.aClass354_3 = new Class354(Static69.method1513("random.dat", null, Static594.anInt10605), "rw", 25L);
			this.aClass354_2 = new Class354(Static69.method1514("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass354_4 = new Class354(Static69.method1514("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass354Array1 = new Class354[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass354Array1[local180] = new Class354(Static69.method1514("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean720) {
				try {
					this.anObject160 = Class.forName("Class336").getDeclaredConstructor().newInstance();
				} catch (@Pc(217) Throwable local217) {
				}
			}
			try {
				if (this.aBoolean720) {
					this.aClass80_1 = new Class80();
				} else {
					this.anObject159 = Class.forName("Class197").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(234) Throwable local234) {
			}
			try {
				if (this.aBoolean720) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject158 = Class.forName("Class124").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(250) Throwable local250) {
			}
		}
		if (this.aBoolean719 && !this.aBoolean720) {
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
		this.aBoolean718 = false;
		this.aThread7 = new Thread(this);
		this.aThread7.setPriority(10);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!tj;")
	public Class316 method8266(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method8279(12, 0, 0, arg0) : this.method8279(13, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public void method8267() {
		Static594.aLong296 = Static112.method2047() + 5000L;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/net/URL;)Lclient!tj;")
	public Class316 method8268(@OriginalArg(1) URL arg0) {
		return this.method8279(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	public boolean method8270(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!tj;")
	public Class316 method8271(@OriginalArg(1) Frame arg0) {
		return this.method8279(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B[Ljava/lang/Class;)Lclient!tj;")
	public Class316 method8272(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method8279(8, 0, 0, new Object[] { arg0, arg1, arg2 });
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public void method8273() {
		synchronized (this) {
			this.aBoolean718 = true;
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass354_2 != null) {
			try {
				this.aClass354_2.method8089();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass354_4 != null) {
			try {
				this.aClass354_4.method8089();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass354Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass354Array1.length; local52++) {
				if (this.aClass354Array1[local52] != null) {
					try {
						this.aClass354Array1[local52].method8089();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass354_3 != null) {
			try {
				this.aClass354_3.method8089();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!tj;")
	public Class316 method8274(@OriginalArg(0) String arg0) {
		return this.method8279(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method8275() {
		return this.anObject160;
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)Z")
	public boolean method8276() {
		if (!this.aBoolean719) {
			return false;
		} else if (this.aBoolean720) {
			return this.aClass80_1 != null;
		} else {
			return this.anObject159 != null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!tj;")
	public Class316 method8277(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method8279(9, 0, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "([ILjava/awt/Point;IZILjava/awt/Component;)Lclient!tj;")
	public Class316 method8278(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method8279(17, arg3, arg2, new Object[] { arg4, arg0, arg1 });
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!tj;")
	private Class316 method8279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class316 local3 = new Class316();
		local3.anInt9479 = arg1;
		local3.anObject137 = arg3;
		local3.anInt9477 = arg2;
		local3.anInt9476 = arg0;
		synchronized (this) {
			if (this.aClass316_8 == null) {
				this.aClass316_8 = this.aClass316_9 = local3;
			} else {
				this.aClass316_8.aClass316_7 = local3;
				this.aClass316_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BZLjava/lang/String;I)Lclient!tj;")
	public Class316 method8280(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method8279(arg0 ? 22 : 1, 0, arg2, arg1);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Lclient!tj;")
	public Class316 method8282(@OriginalArg(1) int arg0) {
		return this.method8279(3, 0, arg0, null);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIBII)Lclient!tj;")
	public Class316 method8283(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method8279(6, arg2 << 16, arg0 + (arg1 << 16), null);
	}

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "(I)Lclient!tj;")
	public Class316 method8284() {
		return this.method8279(5, 0, 0, null);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!tj;")
	public Class316 method8285(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method8279(2, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!wv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class316 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean718) {
						return;
					}
					if (this.aClass316_9 != null) {
						local15 = this.aClass316_9;
						this.aClass316_9 = this.aClass316_9.aClass316_7;
						if (this.aClass316_9 == null) {
							this.aClass316_8 = null;
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
				@Pc(41) int local41 = local15.anInt9476;
				if (local41 == 1) {
					if (Static594.aLong296 > Static112.method2047()) {
						throw new IOException();
					}
					local15.anObject136 = new Socket(InetAddress.getByName((String) local15.anObject137), local15.anInt9477);
				} else if (local41 == 22) {
					if (Static112.method2047() < Static594.aLong296) {
						throw new IOException();
					}
					try {
						local15.anObject136 = Static109.method2011(local15.anInt9477, (String) local15.anObject137).method8073();
					} catch (@Pc(96) IOException_Sub1 local96) {
						local15.anObject136 = local96.getMessage();
						throw local96;
					}
				} else if (local41 == 2) {
					@Pc(842) Thread local842 = new Thread((Runnable) local15.anObject137);
					local842.setDaemon(true);
					local842.start();
					local842.setPriority(local15.anInt9477);
					local15.anObject136 = local842;
				} else if (local41 == 4) {
					if (Static112.method2047() < Static594.aLong296) {
						throw new IOException();
					}
					local15.anObject136 = new DataInputStream(((URL) local15.anObject137).openStream());
				} else {
					@Pc(124) Object[] local124;
					if (local41 == 8) {
						local124 = (Object[]) local15.anObject137;
						if (this.aBoolean719 && ((Class) local124[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject136 = ((Class) local124[0]).getDeclaredMethod((String) local124[1], (Class[]) local124[2]);
					} else if (local41 == 9) {
						local124 = (Object[]) local15.anObject137;
						if (this.aBoolean719 && ((Class) local124[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject136 = ((Class) local124[0]).getDeclaredField((String) local124[1]);
					} else if (local41 == 18) {
						@Pc(777) Clipboard local777 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject136 = local777.getContents(null);
					} else if (local41 == 19) {
						@Pc(163) Transferable local163 = (Transferable) local15.anObject137;
						@Pc(166) Clipboard local166 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local166.setContents(local163, null);
					} else if (this.aBoolean719) {
						@Pc(223) String local223;
						if (local41 == 3) {
							if (Static594.aLong296 > Static112.method2047()) {
								throw new IOException();
							}
							local223 = (local15.anInt9477 >> 24 & 0xFF) + "." + (local15.anInt9477 >> 16 & 0xFF) + "." + (local15.anInt9477 >> 8 & 0xFF) + "." + (local15.anInt9477 & 0xFF);
							local15.anObject136 = InetAddress.getByName(local223).getHostName();
						} else if (local41 == 21) {
							if (Static112.method2047() < Static594.aLong296) {
								throw new IOException();
							}
							local15.anObject136 = InetAddress.getByName((String) local15.anObject137).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean720) {
								local15.anObject136 = this.aClass80_1.method1939();
							} else {
								local15.anObject136 = Class.forName("Class197").getMethod("listmodes").invoke(this.anObject159);
							}
						} else if (local41 == 6) {
							@Pc(247) Frame local247 = new Frame("Jagex Full Screen");
							local15.anObject136 = local247;
							local247.setResizable(false);
							if (this.aBoolean720) {
								this.aClass80_1.method1940(local15.anInt9477 >>> 16, local15.anInt9477 & 0xFFFF, local247, local15.anInt9479 >> 16, local15.anInt9479 & 0xFFFF);
							} else {
								Class.forName("Class197").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject159, local247, Integer.valueOf(local15.anInt9477 >>> 16), new Integer(local15.anInt9477 & 0xFFFF), Integer.valueOf(local15.anInt9479 >> 16), new Integer(local15.anInt9479 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(400) Class354 local400;
							if (local41 == 12) {
								local400 = Static594.method8269(Static594.aString236, (String) local15.anObject137, Static594.anInt10605);
								local15.anObject136 = local400;
							} else if (local41 == 13) {
								local400 = Static594.method8269("", (String) local15.anObject137, Static594.anInt10605);
								local15.anObject136 = local400;
							} else if (this.aBoolean719 && local41 == 14) {
								@Pc(418) int local418 = local15.anInt9477;
								@Pc(421) int local421 = local15.anInt9479;
								if (this.aBoolean720) {
									this.aCallback_Sub1_1.method2901(local421, local418);
								} else {
									Class.forName("Class124").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject158, Integer.valueOf(local418), new Integer(local421));
								}
							} else if (this.aBoolean719 && local41 == 15) {
								@Pc(659) boolean local659 = local15.anInt9477 != 0;
								@Pc(663) Component local663 = (Component) local15.anObject137;
								if (this.aBoolean720) {
									this.aCallback_Sub1_1.method2902(local659, local663);
								} else {
									Class.forName("Class124").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject158, local663, Boolean.valueOf(local659));
								}
							} else if (!this.aBoolean720 && local41 == 17) {
								local124 = (Object[]) local15.anObject137;
								Class.forName("Class124").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject158, (Component) local124[0], (int[]) local124[1], Integer.valueOf(local15.anInt9477), new Integer(local15.anInt9479), (Point) local124[2]);
							} else if (local41 == 16) {
								try {
									if (!Static594.aString238.startsWith("win")) {
										throw new Exception();
									}
									local223 = (String) local15.anObject137;
									if (!local223.startsWith("http://") && !local223.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(511) String local511 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(513) int local513 = 0; local513 < local223.length(); local513++) {
										if (local511.indexOf(local223.charAt(local513)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local223 + "\"");
									local15.anObject136 = null;
								} catch (@Pc(547) Exception local547) {
									local15.anObject136 = local547;
									throw local547;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean720) {
							this.aClass80_1.method1938((Frame) local15.anObject137);
						} else {
							Class.forName("Class197").getMethod("exit").invoke(this.anObject159);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt9478 = 1;
			} catch (@Pc(859) ThreadDeath local859) {
				throw local859;
			} catch (@Pc(862) Throwable local862) {
				local15.anInt9478 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}
}
