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

@OriginalClass("client!oq")
public final class Class268 implements Runnable {

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "Z")
	public boolean aBoolean644 = false;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "Lclient!tba;")
	private Class331 aClass331_7 = null;

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "Lclient!tba;")
	private Class331 aClass331_8 = null;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Lclient!vm;")
	public Class373 aClass373_2 = null;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "Lclient!vm;")
	public Class373 aClass373_3 = null;

	@OriginalMember(owner = "client!oq", name = "A", descriptor = "Lclient!vm;")
	public Class373 aClass373_4 = null;

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "Z")
	public boolean aBoolean645 = false;

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "Z")
	private boolean aBoolean646 = false;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "[Lclient!vm;")
	public Class373[] aClass373Array1;

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "Ljava/lang/Object;")
	private Object anObject15;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Lclient!aha;")
	private Class14 aClass14_1;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "Lclient!lk;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread8;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class268(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		this.aBoolean644 = arg3;
		Static429.anInt7512 = arg0;
		Static429.aString71 = "Unknown";
		Static429.aString70 = arg1;
		Static429.aString66 = "1.1";
		try {
			Static429.aString71 = System.getProperty("java.vendor");
			Static429.aString66 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static429.aString71.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean645 = true;
		}
		try {
			Static429.aString68 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static429.aString68 = "Unknown";
		}
		Static429.aString64 = Static429.aString68.toLowerCase();
		try {
			Static429.aString65 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static429.aString65 = "";
		}
		try {
			Static429.aString69 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static429.aString69 = "";
		}
		try {
			Static429.aString67 = System.getProperty("user.home");
			if (Static429.aString67 != null) {
				Static429.aString67 = Static429.aString67 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static429.aString67 == null) {
			Static429.aString67 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean645) {
			try {
				Static429.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static429.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static44.method604(Static429.anInt7512, Static429.aString70);
		if (this.aBoolean644) {
			this.aClass373_2 = new Class373(Static44.method605((String) null, Static429.anInt7512, "random.dat"), "rw", 25L);
			this.aClass373_4 = new Class373(Static44.method603("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass373_3 = new Class373(Static44.method603("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass373Array1 = new Class373[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass373Array1[local180] = new Class373(Static44.method603("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean645) {
				try {
					this.anObject15 = Class.forName("Class346").getDeclaredConstructor().newInstance();
				} catch (@Pc(213) Throwable local213) {
				}
			}
			try {
				if (this.aBoolean645) {
					this.aClass14_1 = new Class14();
				} else {
					this.anObject13 = Class.forName("Class3").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(230) Throwable local230) {
			}
			try {
				if (this.aBoolean645) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject14 = Class.forName("Class250").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(246) Throwable local246) {
			}
		}
		if (this.aBoolean644 && !this.aBoolean645) {
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
		this.aBoolean646 = false;
		this.aThread8 = new Thread(this);
		this.aThread8.setPriority(10);
		this.aThread8.setDaemon(true);
		this.aThread8.start();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z")
	public boolean method6322() {
		if (!this.aBoolean644) {
			return false;
		} else if (this.aBoolean645) {
			return this.aClass14_1 != null;
		} else {
			return this.anObject13 != null;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIII)Lclient!tba;")
	public Class331 method6323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method6341(arg2 + (arg0 << 16), (Object) null, 6, arg1 << 16);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Lclient!tba;")
	public Class331 method6324(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) String arg2) {
		return this.method6341(0, new Object[] { arg1, arg2, arg0 }, 8, 0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;ZI)Lclient!tba;")
	public Class331 method6326(@OriginalArg(0) String arg0) {
		return this.method6341(0, arg0, 12, 0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	public boolean method6327(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Lclient!tba;")
	public Class331 method6328(@OriginalArg(0) int arg0) {
		return this.method6341(arg0, (Object) null, 3, 0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
	public void method6329() {
		Static429.aLong202 = Static547.method7619() + 5000L;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLjava/awt/Component;[IIILjava/awt/Point;)Lclient!tba;")
	public Class331 method6330(@OriginalArg(1) Component arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method6341(arg2, new Object[] { arg0, arg1, arg4 }, 17, arg3);
	}

	@OriginalMember(owner = "client!oq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class331 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean646) {
						return;
					}
					if (this.aClass331_7 != null) {
						local15 = this.aClass331_7;
						this.aClass331_7 = this.aClass331_7.aClass331_11;
						if (this.aClass331_7 == null) {
							this.aClass331_8 = null;
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
				@Pc(41) int local41 = local15.anInt9107;
				if (local41 == 1) {
					if (Static547.method7619() < Static429.aLong202) {
						throw new IOException();
					}
					local15.anObject20 = new Socket(InetAddress.getByName((String) local15.anObject19), local15.anInt9110);
				} else if (local41 == 22) {
					if (Static429.aLong202 > Static547.method7619()) {
						throw new IOException();
					}
					try {
						local15.anObject20 = Static511.method7287(local15.anInt9110, (String) local15.anObject19).method7985();
					} catch (@Pc(824) IOException_Sub1 local824) {
						local15.anObject20 = local824.getMessage();
						throw local824;
					}
				} else if (local41 == 2) {
					@Pc(785) Thread local785 = new Thread((Runnable) local15.anObject19);
					local785.setDaemon(true);
					local785.start();
					local785.setPriority(local15.anInt9110);
					local15.anObject20 = local785;
				} else if (local41 == 4) {
					if (Static429.aLong202 > Static547.method7619()) {
						throw new IOException();
					}
					local15.anObject20 = new DataInputStream(((URL) local15.anObject19).openStream());
				} else {
					@Pc(342) Object[] local342;
					if (local41 == 8) {
						local342 = (Object[]) local15.anObject19;
						if (this.aBoolean644 && ((Class) local342[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject20 = ((Class) local342[0]).getDeclaredMethod((String) local342[1], (Class[]) local342[2]);
					} else if (local41 == 9) {
						local342 = (Object[]) local15.anObject19;
						if (this.aBoolean644 && ((Class) local342[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject20 = ((Class) local342[0]).getDeclaredField((String) local342[1]);
					} else if (local41 == 18) {
						@Pc(69) Clipboard local69 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject20 = local69.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(82) Transferable local82 = (Transferable) local15.anObject19;
						@Pc(85) Clipboard local85 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local85.setContents(local82, (ClipboardOwner) null);
					} else if (this.aBoolean644) {
						@Pc(147) String local147;
						if (local41 == 3) {
							if (Static429.aLong202 > Static547.method7619()) {
								throw new IOException();
							}
							local147 = (local15.anInt9110 >> 24 & 0xFF) + "." + (local15.anInt9110 >> 16 & 0xFF) + "." + (local15.anInt9110 >> 8 & 0xFF) + "." + (local15.anInt9110 & 0xFF);
							local15.anObject20 = InetAddress.getByName(local147).getHostName();
						} else if (local41 == 21) {
							if (Static429.aLong202 > Static547.method7619()) {
								throw new IOException();
							}
							local15.anObject20 = InetAddress.getByName((String) local15.anObject19).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean645) {
								local15.anObject20 = this.aClass14_1.method203();
							} else {
								local15.anObject20 = Class.forName("Class3").getMethod("listmodes").invoke(this.anObject13);
							}
						} else if (local41 == 6) {
							@Pc(537) Frame local537 = new Frame("Jagex Full Screen");
							local15.anObject20 = local537;
							local537.setResizable(false);
							if (this.aBoolean645) {
								this.aClass14_1.method204(local15.anInt9110 >>> 16, local537, local15.anInt9109 >> 16, local15.anInt9109 & 0xFFFF, local15.anInt9110 & 0xFFFF);
							} else {
								Class.forName("Class3").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject13, local537, Integer.valueOf(local15.anInt9110 >>> 16), new Integer(local15.anInt9110 & 0xFFFF), Integer.valueOf(local15.anInt9109 >> 16), new Integer(local15.anInt9109 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(182) Class373 local182;
							if (local41 == 12) {
								local182 = Static429.method6332(Static429.aString70, (String) local15.anObject19, Static429.anInt7512);
								local15.anObject20 = local182;
							} else if (local41 == 13) {
								local182 = Static429.method6332("", (String) local15.anObject19, Static429.anInt7512);
								local15.anObject20 = local182;
							} else if (this.aBoolean644 && local41 == 14) {
								@Pc(198) int local198 = local15.anInt9110;
								@Pc(201) int local201 = local15.anInt9109;
								if (this.aBoolean645) {
									this.aCallback_Sub1_1.method5288(local201, local198);
								} else {
									Class.forName("Class250").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject14, Integer.valueOf(local198), new Integer(local201));
								}
							} else if (this.aBoolean644 && local41 == 15) {
								@Pc(443) boolean local443 = local15.anInt9110 != 0;
								@Pc(447) Component local447 = (Component) local15.anObject19;
								if (this.aBoolean645) {
									this.aCallback_Sub1_1.method5287(local443, local447);
								} else {
									Class.forName("Class250").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject14, local447, Boolean.valueOf(local443));
								}
							} else if (!this.aBoolean645 && local41 == 17) {
								local342 = (Object[]) local15.anObject19;
								Class.forName("Class250").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject14, (Component) local342[0], (int[]) local342[1], Integer.valueOf(local15.anInt9110), new Integer(local15.anInt9109), (Point) local342[2]);
							} else if (local41 == 16) {
								try {
									if (!Static429.aString64.startsWith("win")) {
										throw new Exception();
									}
									local147 = (String) local15.anObject19;
									if (!local147.startsWith("http://") && !local147.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(287) String local287 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(289) int local289 = 0; local147.length() > local289; local289++) {
										if (local287.indexOf(local147.charAt(local289)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local147 + "\"");
									local15.anObject20 = null;
								} catch (@Pc(328) Exception local328) {
									local15.anObject20 = local328;
									throw local328;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean645) {
							this.aClass14_1.method205((Frame) local15.anObject19);
						} else {
							Class.forName("Class3").getMethod("exit").invoke(this.anObject13);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt9108 = 1;
			} catch (@Pc(855) ThreadDeath local855) {
				throw local855;
			} catch (@Pc(858) Throwable local858) {
				local15.anInt9108 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZIILjava/lang/String;)Lclient!tba;")
	public Class331 method6331(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method6341(arg1, arg2, arg0 ? 22 : 1, 0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!tba;")
	public Class331 method6333(@OriginalArg(1) Frame arg0) {
		return this.method6341(0, arg0, 7, 0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/net/URL;)Lclient!tba;")
	public Class331 method6334(@OriginalArg(1) URL arg0) {
		return this.method6341(0, arg0, 4, 0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method6335() {
		return this.anObject15;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!tba;")
	public Class331 method6336(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method6341(0, new Object[] { arg0, arg1 }, 9, 0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!tba;")
	public Class331 method6337(@OriginalArg(0) String arg0) {
		return this.method6341(0, arg0, 16, 0);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Lclient!tba;")
	public Class331 method6338() {
		return this.method6341(0, (Object) null, 5, 0);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)V")
	public void method6339() {
		synchronized (this) {
			this.aBoolean646 = true;
			this.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass373_4 != null) {
			try {
				this.aClass373_4.method8641();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass373_3 != null) {
			try {
				this.aClass373_3.method8641();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass373Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass373Array1.length; local48++) {
				if (this.aClass373Array1[local48] != null) {
					try {
						this.aClass373Array1[local48].method8641();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass373_2 != null) {
			try {
				this.aClass373_2.method8641();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!tba;")
	public Class331 method6340(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method6341(arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lclient!tba;")
	private Class331 method6341(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class331 local3 = new Class331();
		local3.anInt9109 = arg3;
		local3.anObject19 = arg1;
		local3.anInt9107 = arg2;
		local3.anInt9110 = arg0;
		synchronized (this) {
			if (this.aClass331_8 == null) {
				this.aClass331_8 = this.aClass331_7 = local3;
			} else {
				this.aClass331_8.aClass331_11 = local3;
				this.aClass331_8 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
