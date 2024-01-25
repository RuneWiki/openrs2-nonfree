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

@OriginalClass("client!vk")
public final class Class359 implements Runnable {

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "Z")
	private boolean aBoolean727 = false;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Lclient!bt;")
	public Class44 aClass44_2 = null;

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "Z")
	public boolean aBoolean728 = false;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Lclient!av;")
	private Class26 aClass26_35 = null;

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "Lclient!bt;")
	public Class44 aClass44_4 = null;

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "Lclient!bt;")
	public Class44 aClass44_3 = null;

	@OriginalMember(owner = "client!vk", name = "v", descriptor = "Lclient!av;")
	private Class26 aClass26_36 = null;

	@OriginalMember(owner = "client!vk", name = "B", descriptor = "Z")
	public boolean aBoolean729 = false;

	@OriginalMember(owner = "client!vk", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!vk", name = "r", descriptor = "[Lclient!bt;")
	public Class44[] aClass44Array1;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "Ljava/lang/Object;")
	private Object anObject18;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Lclient!eba;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "Lclient!nn;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class359(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static604.anInt9904 = arg0;
		Static604.aString97 = arg1;
		Static604.aString95 = "Unknown";
		Static604.aString96 = "1.1";
		this.aBoolean729 = arg3;
		try {
			Static604.aString95 = System.getProperty("java.vendor");
			Static604.aString96 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static604.aString95.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean728 = true;
		}
		try {
			Static604.aString92 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static604.aString92 = "Unknown";
		}
		Static604.aString98 = Static604.aString92.toLowerCase();
		try {
			Static604.aString91 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static604.aString91 = "";
		}
		try {
			Static604.aString94 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static604.aString94 = "";
		}
		try {
			Static604.aString93 = System.getProperty("user.home");
			if (Static604.aString93 != null) {
				Static604.aString93 = Static604.aString93 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static604.aString93 == null) {
			Static604.aString93 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean728) {
			try {
				Static604.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static604.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static154.method2914(Static604.aString97, Static604.anInt9904);
		if (this.aBoolean729) {
			this.aClass44_3 = new Class44(Static154.method2915(Static604.anInt9904, null, "random.dat"), "rw", 25L);
			this.aClass44_2 = new Class44(Static154.method2916("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass44_4 = new Class44(Static154.method2916("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass44Array1 = new Class44[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass44Array1[local181] = new Class44(Static154.method2916("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean728) {
				try {
					this.anObject18 = Class.forName("Class339").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean728) {
					this.aClass84_1 = new Class84();
				} else {
					this.anObject20 = Class.forName("Class123").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean728) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject19 = Class.forName("Class314").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean729 && !this.aBoolean728) {
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
		this.aBoolean727 = false;
		this.aThread7 = new Thread(this);
		this.aThread7.setPriority(10);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method8259() {
		return this.anObject18;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZLjava/lang/String;)Lclient!av;")
	public Class26 method8260(@OriginalArg(2) String arg0) {
		return this.method8275(0, 0, 12, arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
	public void method8261() {
		synchronized (this) {
			this.aBoolean727 = true;
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass44_2 != null) {
			try {
				this.aClass44_2.method960();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass44_4 != null) {
			try {
				this.aClass44_4.method960();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass44Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass44Array1.length; local44++) {
				if (this.aClass44Array1[local44] != null) {
					try {
						this.aClass44Array1[local44].method960();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass44_3 != null) {
			try {
				this.aClass44_3.method960();
			} catch (@Pc(74) IOException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!av;")
	public Class26 method8262(@OriginalArg(0) Frame arg0) {
		return this.method8275(0, 0, 7, arg0);
	}

	@OriginalMember(owner = "client!vk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class26 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean727) {
						return;
					}
					if (this.aClass26_35 != null) {
						local15 = this.aClass26_35;
						this.aClass26_35 = this.aClass26_35.aClass26_3;
						if (this.aClass26_35 == null) {
							this.aClass26_36 = null;
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
				@Pc(41) int local41 = local15.anInt759;
				if (local41 == 1) {
					if (Static438.method6517() < Static604.aLong267) {
						throw new IOException();
					}
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt760);
				} else if (local41 == 22) {
					if (Static438.method6517() < Static604.aLong267) {
						throw new IOException();
					}
					try {
						local15.anObject3 = Static218.method3752((String) local15.anObject2, local15.anInt760).method5721();
					} catch (@Pc(829) IOException_Sub1 local829) {
						local15.anObject3 = local829.getMessage();
						throw local829;
					}
				} else if (local41 == 2) {
					@Pc(57) Thread local57 = new Thread((Runnable) local15.anObject2);
					local57.setDaemon(true);
					local57.start();
					local57.setPriority(local15.anInt760);
					local15.anObject3 = local57;
				} else if (local41 == 4) {
					if (Static604.aLong267 > Static438.method6517()) {
						throw new IOException();
					}
					local15.anObject3 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(85) Object[] local85;
					if (local41 == 8) {
						local85 = (Object[]) local15.anObject2;
						if (this.aBoolean729 && ((Class) local85[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject3 = ((Class) local85[0]).getDeclaredMethod((String) local85[1], (Class[]) local85[2]);
					} else if (local41 == 9) {
						local85 = (Object[]) local15.anObject2;
						if (this.aBoolean729 && ((Class) local85[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject3 = ((Class) local85[0]).getDeclaredField((String) local85[1]);
					} else if (local41 == 18) {
						@Pc(745) Clipboard local745 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject3 = local745.getContents(null);
					} else if (local41 == 19) {
						@Pc(120) Transferable local120 = (Transferable) local15.anObject2;
						@Pc(123) Clipboard local123 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local123.setContents(local120, null);
					} else if (this.aBoolean729) {
						@Pc(364) String local364;
						if (local41 == 3) {
							if (Static604.aLong267 > Static438.method6517()) {
								throw new IOException();
							}
							local364 = (local15.anInt760 >> 24 & 0xFF) + "." + (local15.anInt760 >> 16 & 0xFF) + "." + (local15.anInt760 >> 8 & 0xFF) + "." + (local15.anInt760 & 0xFF);
							local15.anObject3 = InetAddress.getByName(local364).getHostName();
						} else if (local41 == 21) {
							if (Static438.method6517() < Static604.aLong267) {
								throw new IOException();
							}
							local15.anObject3 = InetAddress.getByName((String) local15.anObject2).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean728) {
								local15.anObject3 = this.aClass84_1.method1822();
							} else {
								local15.anObject3 = Class.forName("Class123").getMethod("listmodes").invoke(this.anObject20);
							}
						} else if (local41 == 6) {
							@Pc(547) Frame local547 = new Frame("Jagex Full Screen");
							local15.anObject3 = local547;
							local547.setResizable(false);
							if (this.aBoolean728) {
								this.aClass84_1.method1820(local15.anInt761 >> 16, local15.anInt760 & 0xFFFF, local15.anInt760 >>> 16, local15.anInt761 & 0xFFFF, local547);
							} else {
								Class.forName("Class123").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject20, local547, Integer.valueOf(local15.anInt760 >>> 16), new Integer(local15.anInt760 & 0xFFFF), Integer.valueOf(local15.anInt761 >> 16), new Integer(local15.anInt761 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(526) Class44 local526;
							if (local41 == 12) {
								local526 = Static604.method8269((String) local15.anObject2, Static604.aString97, Static604.anInt9904);
								local15.anObject3 = local526;
							} else if (local41 == 13) {
								local526 = Static604.method8269((String) local15.anObject2, "", Static604.anInt9904);
								local15.anObject3 = local526;
							} else if (this.aBoolean729 && local41 == 14) {
								@Pc(215) int local215 = local15.anInt760;
								@Pc(218) int local218 = local15.anInt761;
								if (this.aBoolean728) {
									this.aCallback_Sub1_1.method5771(local218, local215);
								} else {
									Class.forName("Class314").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject19, Integer.valueOf(local215), new Integer(local218));
								}
							} else if (this.aBoolean729 && local41 == 15) {
								@Pc(281) boolean local281 = local15.anInt760 != 0;
								@Pc(285) Component local285 = (Component) local15.anObject2;
								if (this.aBoolean728) {
									this.aCallback_Sub1_1.method5770(local285, local281);
								} else {
									Class.forName("Class314").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject19, local285, Boolean.valueOf(local281));
								}
							} else if (!this.aBoolean728 && local41 == 17) {
								local85 = (Object[]) local15.anObject2;
								Class.forName("Class314").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject19, (Component) local85[0], (int[]) local85[1], Integer.valueOf(local15.anInt760), new Integer(local15.anInt761), (Point) local85[2]);
							} else if (local41 == 16) {
								try {
									if (!Static604.aString98.startsWith("win")) {
										throw new Exception();
									}
									local364 = (String) local15.anObject2;
									if (!local364.startsWith("http://") && !local364.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(378) String local378 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(380) int local380 = 0;
									while (true) {
										if (local364.length() <= local380) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local364 + "\"");
											local15.anObject3 = null;
											break;
										}
										if (local378.indexOf(local364.charAt(local380)) == -1) {
											throw new Exception();
										}
										local380++;
									}
								} catch (@Pc(418) Exception local418) {
									local15.anObject3 = local418;
									throw local418;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean728) {
							this.aClass84_1.method1821((Frame) local15.anObject2);
						} else {
							Class.forName("Class123").getMethod("exit").invoke(this.anObject20);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt762 = 1;
			} catch (@Pc(864) ThreadDeath local864) {
				throw local864;
			} catch (@Pc(867) Throwable local867) {
				local15.anInt762 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZBLjava/lang/String;I)Lclient!av;")
	public Class26 method8263(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method8275(arg2, 0, arg0 ? 22 : 1, arg1);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([BILjava/io/File;)Z")
	public boolean method8264(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)Lclient!av;")
	public Class26 method8265() {
		return this.method8275(0, 0, 5, null);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public void method8266() {
		Static604.aLong267 = Static438.method6517() + 5000L;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lclient!av;")
	public Class26 method8267(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method8275(0, 0, 8, new Object[] { arg0, arg1, arg2 });
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)Lclient!av;")
	public Class26 method8268(@OriginalArg(0) int arg0) {
		return this.method8275(arg0, 0, 3, null);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/lang/String;)Lclient!av;")
	public Class26 method8271(@OriginalArg(1) String arg0) {
		return this.method8275(0, 0, 16, arg0);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)Z")
	public boolean method8272() {
		if (!this.aBoolean729) {
			return false;
		} else if (this.aBoolean728) {
			return this.aClass84_1 != null;
		} else {
			return this.anObject20 != null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/awt/Component;IIILjava/awt/Point;[I)Lclient!av;")
	public Class26 method8273(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int[] arg4) {
		return this.method8275(arg2, arg1, 17, new Object[] { arg0, arg4, arg3 });
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/net/URL;)Lclient!av;")
	public Class26 method8274(@OriginalArg(1) URL arg0) {
		return this.method8275(0, 0, 4, arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIILjava/lang/Object;B)Lclient!av;")
	private Class26 method8275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3) {
		@Pc(3) Class26 local3 = new Class26();
		local3.anObject2 = arg3;
		local3.anInt759 = arg2;
		local3.anInt761 = arg1;
		local3.anInt760 = arg0;
		synchronized (this) {
			if (this.aClass26_36 == null) {
				this.aClass26_36 = this.aClass26_35 = local3;
			} else {
				this.aClass26_36.aClass26_3 = local3;
				this.aClass26_36 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBIII)Lclient!av;")
	public Class26 method8276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method8275(arg2 + (arg0 << 16), arg1 << 16, 6, null);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Lclient!av;")
	public Class26 method8277(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method8275(0, 0, 9, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lclient!av;")
	public Class26 method8278(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method8275(arg0, 0, 2, arg1);
	}
}
