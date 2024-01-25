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

@OriginalClass("client!cr")
public final class Class57 implements Runnable {

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Lclient!hh;")
	public Class133 aClass133_1 = null;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "Lclient!hh;")
	public Class133 aClass133_2 = null;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Lclient!rp;")
	private Class278 aClass278_1 = null;

	@OriginalMember(owner = "client!cr", name = "x", descriptor = "Lclient!hh;")
	public Class133 aClass133_3 = null;

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "Lclient!rp;")
	private Class278 aClass278_2 = null;

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!cr", name = "y", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "[Lclient!hh;")
	public Class133[] aClass133Array1;

	@OriginalMember(owner = "client!cr", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "Lclient!rs;")
	private Class280 aClass280_1;

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Lclient!hca;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		this.aBoolean74 = arg3;
		Static70.aString19 = "1.1";
		Static70.aString14 = "Unknown";
		Static70.aString16 = arg1;
		Static70.anInt1175 = arg0;
		try {
			Static70.aString14 = System.getProperty("java.vendor");
			Static70.aString19 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static70.aString14.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean75 = true;
		}
		try {
			Static70.aString17 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static70.aString17 = "Unknown";
		}
		Static70.aString18 = Static70.aString17.toLowerCase();
		try {
			Static70.aString15 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static70.aString15 = "";
		}
		try {
			System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
		}
		try {
			Static70.aString13 = System.getProperty("user.home");
			if (Static70.aString13 != null) {
				Static70.aString13 = Static70.aString13 + "/";
			}
		} catch (@Pc(94) Exception local94) {
		}
		if (Static70.aString13 == null) {
			Static70.aString13 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(104) Throwable local104) {
		}
		if (!this.aBoolean75) {
			try {
				Static70.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(120) Exception local120) {
			}
			try {
				Static70.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(133) Exception local133) {
			}
		}
		Static81.method1308(Static70.anInt1175, Static70.aString16);
		if (this.aBoolean74) {
			this.aClass133_3 = new Class133(Static81.method1309(null, "random.dat", Static70.anInt1175), "rw", 25L);
			this.aClass133_1 = new Class133(Static81.method1307("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass133_2 = new Class133(Static81.method1307("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass133Array1 = new Class133[arg2];
			for (@Pc(179) int local179 = 0; local179 < arg2; local179++) {
				this.aClass133Array1[local179] = new Class133(Static81.method1307("main_file_cache.idx" + local179), "rw", 1048576L);
			}
			if (this.aBoolean75) {
				try {
					this.anObject7 = Class.forName("Class236").getDeclaredConstructor().newInstance();
				} catch (@Pc(216) Throwable local216) {
				}
			}
			try {
				if (this.aBoolean75) {
					this.aClass280_1 = new Class280();
				} else {
					this.anObject6 = Class.forName("Class209").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(233) Throwable local233) {
			}
			try {
				if (this.aBoolean75) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject5 = Class.forName("Class205").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(249) Throwable local249) {
			}
		}
		if (this.aBoolean74 && !this.aBoolean75) {
			@Pc(259) ThreadGroup local259 = Thread.currentThread().getThreadGroup();
			for (@Pc(262) ThreadGroup local262 = local259.getParent(); local262 != null; local262 = local262.getParent()) {
				local259 = local262;
			}
			@Pc(273) Thread[] local273 = new Thread[1000];
			local259.enumerate(local273);
			for (@Pc(279) int local279 = 0; local279 < local273.length; local279++) {
				if (local273[local279] != null && local273[local279].getName().startsWith("AWT")) {
					local273[local279].setPriority(1);
				}
			}
		}
		this.aBoolean73 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lclient!rp;")
	public Class278 method914(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2) {
		return this.method920(new Object[] { arg2, arg0, arg1 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Z")
	public boolean method915() {
		if (!this.aBoolean74) {
			return false;
		} else if (this.aBoolean75) {
			return this.aClass280_1 != null;
		} else {
			return this.anObject6 != null;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!rp;")
	public Class278 method916(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method920(arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLjava/net/URL;)Lclient!rp;")
	public Class278 method917(@OriginalArg(1) URL arg0) {
		return this.method920(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	public void method918() {
		synchronized (this) {
			this.aBoolean73 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass133_1 != null) {
			try {
				this.aClass133_1.method2788();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass133_2 != null) {
			try {
				this.aClass133_2.method2788();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass133Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass133Array1.length; local50++) {
				if (this.aClass133Array1[local50] != null) {
					try {
						this.aClass133Array1[local50].method2788();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass133_3 != null) {
			try {
				this.aClass133_3.method2788();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!rp;")
	public Class278 method919(@OriginalArg(0) Frame arg0) {
		return this.method920(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!rp;")
	private Class278 method920(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class278 local8 = new Class278();
		local8.anInt7759 = arg1;
		local8.anInt7760 = arg3;
		local8.anObject23 = arg0;
		local8.anInt7758 = arg2;
		synchronized (this) {
			if (this.aClass278_2 == null) {
				this.aClass278_2 = this.aClass278_1 = local8;
			} else {
				this.aClass278_2.aClass278_8 = local8;
				this.aClass278_2 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZILjava/lang/String;)Lclient!rp;")
	public Class278 method921(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method920(arg2, arg1, arg0 ? 22 : 1, 0);
	}

	@OriginalMember(owner = "client!cr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class278 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean73) {
						return;
					}
					if (this.aClass278_1 != null) {
						local15 = this.aClass278_1;
						this.aClass278_1 = this.aClass278_1.aClass278_8;
						if (this.aClass278_1 == null) {
							this.aClass278_2 = null;
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
				@Pc(41) int local41 = local15.anInt7758;
				if (local41 == 1) {
					if (Static70.aLong38 > Static137.method2058()) {
						throw new IOException();
					}
					local15.anObject24 = new Socket(InetAddress.getByName((String) local15.anObject23), local15.anInt7759);
				} else if (local41 == 22) {
					if (Static70.aLong38 > Static137.method2058()) {
						throw new IOException();
					}
					local15.anObject24 = Static434.method6273(local15.anInt7759, (String) local15.anObject23).method3986();
				} else if (local41 == 2) {
					@Pc(845) Thread local845 = new Thread((Runnable) local15.anObject23);
					local845.setDaemon(true);
					local845.start();
					local845.setPriority(local15.anInt7759);
					local15.anObject24 = local845;
				} else if (local41 == 4) {
					if (Static137.method2058() < Static70.aLong38) {
						throw new IOException();
					}
					local15.anObject24 = new DataInputStream(((URL) local15.anObject23).openStream());
				} else {
					@Pc(133) Object[] local133;
					if (local41 == 8) {
						local133 = (Object[]) local15.anObject23;
						if (this.aBoolean74 && ((Class) local133[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject24 = ((Class) local133[0]).getDeclaredMethod((String) local133[1], (Class[]) local133[2]);
					} else if (local41 == 9) {
						local133 = (Object[]) local15.anObject23;
						if (this.aBoolean74 && ((Class) local133[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject24 = ((Class) local133[0]).getDeclaredField((String) local133[1]);
					} else if (local41 == 18) {
						@Pc(173) Clipboard local173 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject24 = local173.getContents(null);
					} else if (local41 == 19) {
						@Pc(801) Transferable local801 = (Transferable) local15.anObject23;
						@Pc(804) Clipboard local804 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local804.setContents(local801, null);
					} else if (this.aBoolean74) {
						@Pc(247) String local247;
						if (local41 == 3) {
							if (Static70.aLong38 > Static137.method2058()) {
								throw new IOException();
							}
							local247 = (local15.anInt7759 >> 24 & 0xFF) + "." + (local15.anInt7759 >> 16 & 0xFF) + "." + (local15.anInt7759 >> 8 & 0xFF) + "." + (local15.anInt7759 & 0xFF);
							local15.anObject24 = InetAddress.getByName(local247).getHostName();
						} else if (local41 == 21) {
							if (Static137.method2058() < Static70.aLong38) {
								throw new IOException();
							}
							local15.anObject24 = InetAddress.getByName((String) local15.anObject23).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean75) {
								local15.anObject24 = this.aClass280_1.method6433();
							} else {
								local15.anObject24 = Class.forName("Class209").getMethod("listmodes").invoke(this.anObject6);
							}
						} else if (local41 == 6) {
							@Pc(295) Frame local295 = new Frame("Jagex Full Screen");
							local15.anObject24 = local295;
							local295.setResizable(false);
							if (this.aBoolean75) {
								this.aClass280_1.method6431(local15.anInt7759 >>> 16, local295, local15.anInt7760 & 0xFFFF, local15.anInt7760 >> 16, local15.anInt7759 & 0xFFFF);
							} else {
								Class.forName("Class209").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject6, local295, Integer.valueOf(local15.anInt7759 >>> 16), new Integer(local15.anInt7759 & 0xFFFF), Integer.valueOf(local15.anInt7760 >> 16), new Integer(local15.anInt7760 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(424) Class133 local424;
							if (local41 == 12) {
								local424 = Static70.method924((String) local15.anObject23, Static70.anInt1175, Static70.aString16);
								local15.anObject24 = local424;
							} else if (local41 == 13) {
								local424 = Static70.method924((String) local15.anObject23, Static70.anInt1175, "");
								local15.anObject24 = local424;
							} else if (this.aBoolean74 && local41 == 14) {
								@Pc(704) int local704 = local15.anInt7759;
								@Pc(707) int local707 = local15.anInt7760;
								if (this.aBoolean75) {
									this.aCallback_Sub1_1.method2713(local704, local707);
								} else {
									Class.forName("Class205").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject5, Integer.valueOf(local704), new Integer(local707));
								}
							} else if (this.aBoolean74 && local41 == 15) {
								@Pc(469) boolean local469 = local15.anInt7759 != 0;
								@Pc(473) Component local473 = (Component) local15.anObject23;
								if (this.aBoolean75) {
									this.aCallback_Sub1_1.method2712(local469, local473);
								} else {
									Class.forName("Class205").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject5, local473, Boolean.valueOf(local469));
								}
							} else if (!this.aBoolean75 && local41 == 17) {
								local133 = (Object[]) local15.anObject23;
								Class.forName("Class205").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject5, (Component) local133[0], (int[]) local133[1], Integer.valueOf(local15.anInt7759), new Integer(local15.anInt7760), (Point) local133[2]);
							} else if (local41 == 16) {
								try {
									if (!Static70.aString18.startsWith("win")) {
										throw new Exception();
									}
									local247 = (String) local15.anObject23;
									if (!local247.startsWith("http://") && !local247.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(654) String local654 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(656) int local656 = 0; local247.length() > local656; local656++) {
										if (local654.indexOf(local247.charAt(local656)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local247 + "\"");
									local15.anObject24 = null;
								} catch (@Pc(691) Exception local691) {
									local15.anObject24 = local691;
									throw local691;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean75) {
							this.aClass280_1.method6432((Frame) local15.anObject23);
						} else {
							Class.forName("Class209").getMethod("exit").invoke(this.anObject6);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt7757 = 1;
			} catch (@Pc(862) ThreadDeath local862) {
				throw local862;
			} catch (@Pc(865) Throwable local865) {
				local15.anInt7757 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([BLjava/io/File;I)Z")
	public boolean method922(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!rp;")
	public Class278 method923(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method920(new Object[] { arg0, arg1 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)Lclient!rp;")
	public Class278 method925(@OriginalArg(1) int arg0) {
		return this.method920(null, arg0, 3, 0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBIII)Lclient!rp;")
	public Class278 method927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method920(null, arg0 + (arg2 << 16), 6, arg1 << 16);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLjava/lang/String;)Lclient!rp;")
	public Class278 method928(@OriginalArg(1) String arg0) {
		return this.method920(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!rp;")
	public Class278 method929(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		return arg0 ? this.method920(arg1, 0, 12, 0) : this.method920(arg1, 0, 13, 0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public void method930() {
		Static70.aLong38 = Static137.method2058() + 5000L;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[III)Lclient!rp;")
	public Class278 method931(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		return this.method920(new Object[] { arg2, arg3, arg1 }, arg4, 17, arg0);
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method932() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)Lclient!rp;")
	public Class278 method933() {
		return this.method920(null, 0, 5, 0);
	}
}
