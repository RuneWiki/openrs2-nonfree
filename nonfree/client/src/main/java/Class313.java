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

@OriginalClass("client!tt")
public final class Class313 implements Runnable {

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Lclient!oaa;")
	private Class224 aClass224_10 = null;

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "Z")
	public boolean aBoolean569 = false;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "Lclient!oaa;")
	private Class224 aClass224_11 = null;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "Z")
	private boolean aBoolean568 = false;

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "Lclient!fn;")
	public Class108 aClass108_4 = null;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "Lclient!fn;")
	public Class108 aClass108_3 = null;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!fn;")
	public Class108 aClass108_2 = null;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "Z")
	public boolean aBoolean570 = false;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "[Lclient!fn;")
	public Class108[] aClass108Array1;

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "Ljava/lang/Object;")
	private Object anObject18;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "Ljava/lang/Object;")
	private Object anObject16;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Lclient!cba;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "Lclient!bq;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Ljava/lang/Object;")
	private Object anObject17;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class313(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static508.aString78 = "1.1";
		Static508.aString75 = arg1;
		Static508.anInt8773 = arg0;
		Static508.aString76 = "Unknown";
		this.aBoolean569 = arg3;
		try {
			Static508.aString76 = System.getProperty("java.vendor");
			Static508.aString78 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static508.aString76.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean570 = true;
		}
		try {
			Static508.aString80 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static508.aString80 = "Unknown";
		}
		Static508.aString77 = Static508.aString80.toLowerCase();
		try {
			Static508.aString74 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static508.aString74 = "";
		}
		try {
			Static508.aString73 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static508.aString73 = "";
		}
		try {
			Static508.aString79 = System.getProperty("user.home");
			if (Static508.aString79 != null) {
				Static508.aString79 = Static508.aString79 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static508.aString79 == null) {
			Static508.aString79 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean570) {
			try {
				Static508.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static508.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static159.method2471(Static508.anInt8773, Static508.aString75);
		if (this.aBoolean569) {
			this.aClass108_3 = new Class108(Static159.method2472(null, Static508.anInt8773, "random.dat"), "rw", 25L);
			this.aClass108_4 = new Class108(Static159.method2473("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass108_2 = new Class108(Static159.method2473("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass108Array1 = new Class108[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass108Array1[local180] = new Class108(Static159.method2473("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean570) {
				try {
					this.anObject18 = Class.forName("Class206").getDeclaredConstructor().newInstance();
				} catch (@Pc(217) Throwable local217) {
				}
			}
			try {
				if (this.aBoolean570) {
					this.aClass44_1 = new Class44();
				} else {
					this.anObject16 = Class.forName("Class167").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(234) Throwable local234) {
			}
			try {
				if (this.aBoolean570) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject17 = Class.forName("Class126").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(250) Throwable local250) {
			}
		}
		if (this.aBoolean569 && !this.aBoolean570) {
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
		this.aBoolean568 = false;
		this.aThread5 = new Thread(this);
		this.aThread5.setPriority(10);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Lclient!oaa;")
	private Class224 method6978(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class224 local3 = new Class224();
		local3.anObject13 = arg0;
		local3.anInt6634 = arg2;
		local3.anInt6631 = arg1;
		local3.anInt6633 = arg3;
		synchronized (this) {
			if (this.aClass224_10 == null) {
				this.aClass224_10 = this.aClass224_11 = local3;
			} else {
				this.aClass224_10.aClass224_7 = local3;
				this.aClass224_10 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)Lclient!oaa;")
	public Class224 method6979(@OriginalArg(0) int arg0) {
		return this.method6978(null, arg0, 3, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!oaa;")
	public Class224 method6980(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method6978(new Object[] { arg1, arg0 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!oaa;")
	public Class224 method6981(@OriginalArg(0) Frame arg0) {
		return this.method6978(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;BIZ)Lclient!oaa;")
	public Class224 method6982(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method6978(arg0, arg1, arg2 ? 22 : 1, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public void method6983() {
		synchronized (this) {
			this.aBoolean568 = true;
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass108_4 != null) {
			try {
				this.aClass108_4.method2453();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass108_2 != null) {
			try {
				this.aClass108_2.method2453();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass108Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass108Array1.length; local44++) {
				if (this.aClass108Array1[local44] != null) {
					try {
						this.aClass108Array1[local44].method2453();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass108_3 != null) {
			try {
				this.aClass108_3.method2453();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
	public void method6984() {
		Static508.aLong221 = Static416.method5922() + 5000L;
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)Lclient!oaa;")
	public Class224 method6985() {
		return this.method6978(null, 0, 5, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BIIII)Lclient!oaa;")
	public Class224 method6986(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method6978(null, arg1 + (arg2 << 16), 6, arg0 << 16);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Class;)Lclient!oaa;")
	public Class224 method6988(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method6978(new Object[] { arg2, arg1, arg0 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I[IBLjava/awt/Component;ILjava/awt/Point;)Lclient!oaa;")
	public Class224 method6989(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method6978(new Object[] { arg2, arg1, arg4 }, arg3, 17, arg0);
	}

	@OriginalMember(owner = "client!tt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class224 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean568) {
						return;
					}
					if (this.aClass224_11 != null) {
						local15 = this.aClass224_11;
						this.aClass224_11 = this.aClass224_11.aClass224_7;
						if (this.aClass224_11 == null) {
							this.aClass224_10 = null;
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
				@Pc(41) int local41 = local15.anInt6634;
				if (local41 == 1) {
					if (Static508.aLong221 > Static416.method5922()) {
						throw new IOException();
					}
					local15.anObject14 = new Socket(InetAddress.getByName((String) local15.anObject13), local15.anInt6631);
				} else if (local41 == 22) {
					if (Static508.aLong221 > Static416.method5922()) {
						throw new IOException();
					}
					try {
						local15.anObject14 = Static446.method6299((String) local15.anObject13, local15.anInt6631).method6875();
					} catch (@Pc(71) IOException_Sub1 local71) {
						local15.anObject14 = local71.getMessage();
						throw local71;
					}
				} else if (local41 == 2) {
					@Pc(87) Thread local87 = new Thread((Runnable) local15.anObject13);
					local87.setDaemon(true);
					local87.start();
					local87.setPriority(local15.anInt6631);
					local15.anObject14 = local87;
				} else if (local41 == 4) {
					if (Static416.method5922() < Static508.aLong221) {
						throw new IOException();
					}
					local15.anObject14 = new DataInputStream(((URL) local15.anObject13).openStream());
				} else {
					@Pc(133) Object[] local133;
					if (local41 == 8) {
						local133 = (Object[]) local15.anObject13;
						if (this.aBoolean569 && ((Class) local133[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject14 = ((Class) local133[0]).getDeclaredMethod((String) local133[1], (Class[]) local133[2]);
					} else if (local41 == 9) {
						local133 = (Object[]) local15.anObject13;
						if (this.aBoolean569 && ((Class) local133[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject14 = ((Class) local133[0]).getDeclaredField((String) local133[1]);
					} else if (local41 == 18) {
						@Pc(175) Clipboard local175 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject14 = local175.getContents(null);
					} else if (local41 == 19) {
						@Pc(188) Transferable local188 = (Transferable) local15.anObject13;
						@Pc(191) Clipboard local191 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local191.setContents(local188, null);
					} else if (this.aBoolean569) {
						@Pc(255) String local255;
						if (local41 == 3) {
							if (Static416.method5922() < Static508.aLong221) {
								throw new IOException();
							}
							local255 = (local15.anInt6631 >> 24 & 0xFF) + "." + (local15.anInt6631 >> 16 & 0xFF) + "." + (local15.anInt6631 >> 8 & 0xFF) + "." + (local15.anInt6631 & 0xFF);
							local15.anObject14 = InetAddress.getByName(local255).getHostName();
						} else if (local41 == 21) {
							if (Static416.method5922() < Static508.aLong221) {
								throw new IOException();
							}
							local15.anObject14 = InetAddress.getByName((String) local15.anObject13).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean570) {
								local15.anObject14 = this.aClass44_1.method852();
							} else {
								local15.anObject14 = Class.forName("Class167").getMethod("listmodes").invoke(this.anObject16);
							}
						} else if (local41 == 6) {
							@Pc(641) Frame local641 = new Frame("Jagex Full Screen");
							local15.anObject14 = local641;
							local641.setResizable(false);
							if (this.aBoolean570) {
								this.aClass44_1.method851(local15.anInt6633 & 0xFFFF, local15.anInt6631 & 0xFFFF, local641, local15.anInt6633 >> 16, local15.anInt6631 >>> 16);
							} else {
								Class.forName("Class167").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject16, local641, Integer.valueOf(local15.anInt6631 >>> 16), new Integer(local15.anInt6631 & 0xFFFF), Integer.valueOf(local15.anInt6633 >> 16), new Integer(local15.anInt6633 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(596) Class108 local596;
							if (local41 == 12) {
								local596 = Static508.method6987(Static508.anInt8773, (String) local15.anObject13, Static508.aString75);
								local15.anObject14 = local596;
							} else if (local41 == 13) {
								local596 = Static508.method6987(Static508.anInt8773, (String) local15.anObject13, "");
								local15.anObject14 = local596;
							} else if (this.aBoolean569 && local41 == 14) {
								@Pc(540) int local540 = local15.anInt6631;
								@Pc(543) int local543 = local15.anInt6633;
								if (this.aBoolean570) {
									this.aCallback_Sub1_1.method767(local543, local540);
								} else {
									Class.forName("Class126").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject17, Integer.valueOf(local540), new Integer(local543));
								}
							} else if (this.aBoolean569 && local41 == 15) {
								@Pc(484) boolean local484 = local15.anInt6631 != 0;
								@Pc(488) Component local488 = (Component) local15.anObject13;
								if (this.aBoolean570) {
									this.aCallback_Sub1_1.method766(local488, local484);
								} else {
									Class.forName("Class126").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject17, local488, Boolean.valueOf(local484));
								}
							} else if (!this.aBoolean570 && local41 == 17) {
								local133 = (Object[]) local15.anObject13;
								Class.forName("Class126").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject17, (Component) local133[0], (int[]) local133[1], Integer.valueOf(local15.anInt6631), new Integer(local15.anInt6633), (Point) local133[2]);
							} else if (local41 == 16) {
								try {
									if (!Static508.aString77.startsWith("win")) {
										throw new Exception();
									}
									local255 = (String) local15.anObject13;
									if (!local255.startsWith("http://") && !local255.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(431) String local431 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(433) int local433 = 0; local255.length() > local433; local433++) {
										if (local431.indexOf(local255.charAt(local433)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local255 + "\"");
									local15.anObject14 = null;
								} catch (@Pc(467) Exception local467) {
									local15.anObject14 = local467;
									throw local467;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean570) {
							this.aClass44_1.method853((Frame) local15.anObject13);
						} else {
							Class.forName("Class167").getMethod("exit").invoke(this.anObject16);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6632 = 1;
			} catch (@Pc(859) ThreadDeath local859) {
				throw local859;
			} catch (@Pc(862) Throwable local862) {
				local15.anInt6632 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!oaa;")
	public Class224 method6991(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method6978(arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method6992() {
		return this.anObject18;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([BILjava/io/File;)Z")
	public boolean method6993(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/lang/String;Z)Lclient!oaa;")
	public Class224 method6994(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method6978(arg0, 0, 12, 0) : this.method6978(arg0, 0, 13, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/net/URL;)Lclient!oaa;")
	public Class224 method6995(@OriginalArg(1) URL arg0) {
		return this.method6978(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!oaa;")
	public Class224 method6996(@OriginalArg(0) String arg0) {
		return this.method6978(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)Z")
	public boolean method6997() {
		if (!this.aBoolean569) {
			return false;
		} else if (this.aBoolean570) {
			return this.aClass44_1 != null;
		} else {
			return this.anObject16 != null;
		}
	}
}
