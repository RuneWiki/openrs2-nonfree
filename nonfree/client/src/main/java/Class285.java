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

@OriginalClass("client!tq")
public final class Class285 implements Runnable {

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Z")
	private boolean aBoolean623 = false;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "Lclient!wr;")
	public Class323 aClass323_2 = null;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!oc;")
	private Class212 aClass212_5 = null;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Lclient!wr;")
	public Class323 aClass323_3 = null;

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "Lclient!wr;")
	public Class323 aClass323_4 = null;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "Z")
	public boolean aBoolean625 = false;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "Lclient!oc;")
	private Class212 aClass212_6 = null;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "Z")
	public boolean aBoolean624 = false;

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "[Lclient!wr;")
	public Class323[] aClass323Array1;

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "Ljava/lang/Object;")
	private Object anObject18;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "Ljava/lang/Object;")
	private Object anObject17;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "Lclient!am;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "Lclient!mr;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class285(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static472.aString76 = arg1;
		Static472.aString77 = "Unknown";
		this.aBoolean625 = arg3;
		Static472.aString74 = "1.1";
		Static472.anInt8505 = arg0;
		try {
			Static472.aString77 = System.getProperty("java.vendor");
			Static472.aString74 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static472.aString77.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean624 = true;
		}
		try {
			Static472.aString78 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static472.aString78 = "Unknown";
		}
		Static472.aString75 = Static472.aString78.toLowerCase();
		try {
			Static472.aString79 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static472.aString79 = "";
		}
		try {
			System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
		}
		try {
			Static472.aString73 = System.getProperty("user.home");
			if (Static472.aString73 != null) {
				Static472.aString73 = Static472.aString73 + "/";
			}
		} catch (@Pc(94) Exception local94) {
		}
		if (Static472.aString73 == null) {
			Static472.aString73 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(104) Throwable local104) {
		}
		if (!this.aBoolean624) {
			try {
				Static472.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(120) Exception local120) {
			}
			try {
				Static472.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(133) Exception local133) {
			}
		}
		Static452.method6825(Static472.anInt8505, Static472.aString76);
		if (this.aBoolean625) {
			this.aClass323_2 = new Class323(Static452.method6823("random.dat", null, Static472.anInt8505), "rw", 25L);
			this.aClass323_3 = new Class323(Static452.method6824("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass323_4 = new Class323(Static452.method6824("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass323Array1 = new Class323[arg2];
			for (@Pc(179) int local179 = 0; local179 < arg2; local179++) {
				this.aClass323Array1[local179] = new Class323(Static452.method6824("main_file_cache.idx" + local179), "rw", 1048576L);
			}
			if (this.aBoolean624) {
				try {
					this.anObject18 = Class.forName("Class143").getDeclaredConstructor().newInstance();
				} catch (@Pc(212) Throwable local212) {
				}
			}
			try {
				if (this.aBoolean624) {
					this.aClass15_1 = new Class15();
				} else {
					this.anObject17 = Class.forName("Class136").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(229) Throwable local229) {
			}
			try {
				if (this.aBoolean624) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject19 = Class.forName("Class217").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(245) Throwable local245) {
			}
		}
		if (this.aBoolean625 && !this.aBoolean624) {
			@Pc(255) ThreadGroup local255 = Thread.currentThread().getThreadGroup();
			for (@Pc(258) ThreadGroup local258 = local255.getParent(); local258 != null; local258 = local258.getParent()) {
				local255 = local258;
			}
			@Pc(269) Thread[] local269 = new Thread[1000];
			local255.enumerate(local269);
			for (@Pc(275) int local275 = 0; local275 < local269.length; local275++) {
				if (local269[local275] != null && local269[local275].getName().startsWith("AWT")) {
					local269[local275].setPriority(1);
				}
			}
		}
		this.aBoolean623 = false;
		this.aThread5 = new Thread(this);
		this.aThread5.setPriority(10);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	public boolean method7032(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZLjava/lang/String;)Lclient!oc;")
	public Class212 method7034(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		return arg0 ? this.method7046(0, arg1, 12, 0) : this.method7046(0, arg1, 13, 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!oc;")
	public Class212 method7035(@OriginalArg(0) URL arg0) {
		return this.method7046(0, arg0, 4, 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([ILjava/awt/Point;ILjava/awt/Component;BI)Lclient!oc;")
	public Class212 method7036(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(5) int arg4) {
		return this.method7046(arg4, new Object[] { arg3, arg0, arg1 }, 17, arg2);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Lclient!oc;")
	public Class212 method7037() {
		return this.method7046(0, null, 5, 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)Z")
	public boolean method7038() {
		if (!this.aBoolean625) {
			return false;
		} else if (this.aBoolean624) {
			return this.aClass15_1 != null;
		} else {
			return this.anObject17 != null;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lclient!oc;")
	public Class212 method7039(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method7046(0, new Object[] { arg1, arg0, arg2 }, 8, 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/String;)Lclient!oc;")
	public Class212 method7040(@OriginalArg(1) String arg0) {
		return this.method7046(0, arg0, 16, 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BIIII)Lclient!oc;")
	public Class212 method7041(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method7046(arg2 << 16, null, 6, arg1 + (arg0 << 16));
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)Lclient!oc;")
	public Class212 method7042(@OriginalArg(0) int arg0) {
		return this.method7046(0, null, 3, arg0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Lclient!oc;")
	public Class212 method7043(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method7046(0, new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZILjava/lang/String;)Lclient!oc;")
	public Class212 method7044(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		return this.method7046(0, arg2, arg1 ? 22 : 1, arg0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public void method7045() {
		synchronized (this) {
			this.aBoolean623 = true;
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass323_3 != null) {
			try {
				this.aClass323_3.method7794();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass323_4 != null) {
			try {
				this.aClass323_4.method7794();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass323Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass323Array1.length; local48++) {
				if (this.aClass323Array1[local48] != null) {
					try {
						this.aClass323Array1[local48].method7794();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass323_2 != null) {
			try {
				this.aClass323_2.method7794();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/Object;BII)Lclient!oc;")
	private Class212 method7046(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class212 local3 = new Class212();
		local3.anInt6550 = arg2;
		local3.anInt6549 = arg0;
		local3.anObject12 = arg1;
		local3.anInt6548 = arg3;
		synchronized (this) {
			if (this.aClass212_6 == null) {
				this.aClass212_6 = this.aClass212_5 = local3;
			} else {
				this.aClass212_6.aClass212_3 = local3;
				this.aClass212_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!tq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class212 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean623) {
						return;
					}
					if (this.aClass212_5 != null) {
						local15 = this.aClass212_5;
						this.aClass212_5 = this.aClass212_5.aClass212_3;
						if (this.aClass212_5 == null) {
							this.aClass212_6 = null;
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
				@Pc(41) int local41 = local15.anInt6550;
				if (local41 == 1) {
					if (Static12.method647() < Static472.aLong264) {
						throw new IOException();
					}
					local15.anObject13 = new Socket(InetAddress.getByName((String) local15.anObject12), local15.anInt6548);
				} else if (local41 == 22) {
					if (Static472.aLong264 > Static12.method647()) {
						throw new IOException();
					}
					local15.anObject13 = Static371.method5854((String) local15.anObject12, local15.anInt6548).method172();
				} else if (local41 == 2) {
					@Pc(84) Thread local84 = new Thread((Runnable) local15.anObject12);
					local84.setDaemon(true);
					local84.start();
					local84.setPriority(local15.anInt6548);
					local15.anObject13 = local84;
				} else if (local41 == 4) {
					if (Static12.method647() < Static472.aLong264) {
						throw new IOException();
					}
					local15.anObject13 = new DataInputStream(((URL) local15.anObject12).openStream());
				} else {
					@Pc(293) Object[] local293;
					if (local41 == 8) {
						local293 = (Object[]) local15.anObject12;
						if (this.aBoolean625 && ((Class) local293[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local293[0]).getDeclaredMethod((String) local293[1], (Class[]) local293[2]);
					} else if (local41 == 9) {
						local293 = (Object[]) local15.anObject12;
						if (this.aBoolean625 && ((Class) local293[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local293[0]).getDeclaredField((String) local293[1]);
					} else if (local41 == 18) {
						@Pc(114) Clipboard local114 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject13 = local114.getContents(null);
					} else if (local41 == 19) {
						@Pc(728) Transferable local728 = (Transferable) local15.anObject12;
						@Pc(731) Clipboard local731 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local731.setContents(local728, null);
					} else if (this.aBoolean625) {
						@Pc(234) String local234;
						if (local41 == 3) {
							if (Static12.method647() < Static472.aLong264) {
								throw new IOException();
							}
							local234 = (local15.anInt6548 >> 24 & 0xFF) + "." + (local15.anInt6548 >> 16 & 0xFF) + "." + (local15.anInt6548 >> 8 & 0xFF) + "." + (local15.anInt6548 & 0xFF);
							local15.anObject13 = InetAddress.getByName(local234).getHostName();
						} else if (local41 == 21) {
							if (Static12.method647() < Static472.aLong264) {
								throw new IOException();
							}
							local15.anObject13 = InetAddress.getByName((String) local15.anObject12).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean624) {
								local15.anObject13 = this.aClass15_1.method651();
							} else {
								local15.anObject13 = Class.forName("Class136").getMethod("listmodes").invoke(this.anObject17);
							}
						} else if (local41 == 6) {
							@Pc(524) Frame local524 = new Frame("Jagex Full Screen");
							local15.anObject13 = local524;
							local524.setResizable(false);
							if (this.aBoolean624) {
								this.aClass15_1.method650(local15.anInt6549 >> 16, local15.anInt6548 >>> 16, local15.anInt6548 & 0xFFFF, local15.anInt6549 & 0xFFFF, local524);
							} else {
								Class.forName("Class136").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject17, local524, Integer.valueOf(local15.anInt6548 >>> 16), new Integer(local15.anInt6548 & 0xFFFF), Integer.valueOf(local15.anInt6549 >> 16), new Integer(local15.anInt6549 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(177) Class323 local177;
							if (local41 == 12) {
								local177 = Static472.method7033(Static472.aString76, Static472.anInt8505, (String) local15.anObject12);
								local15.anObject13 = local177;
							} else if (local41 == 13) {
								local177 = Static472.method7033("", Static472.anInt8505, (String) local15.anObject12);
								local15.anObject13 = local177;
							} else if (this.aBoolean625 && local41 == 14) {
								@Pc(447) int local447 = local15.anInt6548;
								@Pc(450) int local450 = local15.anInt6549;
								if (this.aBoolean624) {
									this.aCallback_Sub1_1.method5032(local447, local450);
								} else {
									Class.forName("Class217").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject19, Integer.valueOf(local447), new Integer(local450));
								}
							} else if (this.aBoolean625 && local41 == 15) {
								@Pc(391) boolean local391 = local15.anInt6548 != 0;
								@Pc(395) Component local395 = (Component) local15.anObject12;
								if (this.aBoolean624) {
									this.aCallback_Sub1_1.method5033(local395, local391);
								} else {
									Class.forName("Class217").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject19, local395, Boolean.valueOf(local391));
								}
							} else if (!this.aBoolean624 && local41 == 17) {
								local293 = (Object[]) local15.anObject12;
								Class.forName("Class217").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject19, (Component) local293[0], (int[]) local293[1], Integer.valueOf(local15.anInt6548), new Integer(local15.anInt6549), (Point) local293[2]);
							} else if (local41 == 16) {
								try {
									if (!Static472.aString75.startsWith("win")) {
										throw new Exception();
									}
									local234 = (String) local15.anObject12;
									if (!local234.startsWith("http://") && !local234.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(248) String local248 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(250) int local250 = 0;
									while (true) {
										if (local250 >= local234.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local234 + "\"");
											local15.anObject13 = null;
											break;
										}
										if (local248.indexOf(local234.charAt(local250)) == -1) {
											throw new Exception();
										}
										local250++;
									}
								} catch (@Pc(284) Exception local284) {
									local15.anObject13 = local284;
									throw local284;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean624) {
							this.aClass15_1.method652((Frame) local15.anObject12);
						} else {
							Class.forName("Class136").getMethod("exit").invoke(this.anObject17);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6547 = 1;
			} catch (@Pc(846) ThreadDeath local846) {
				throw local846;
			} catch (@Pc(849) Throwable local849) {
				local15.anInt6547 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!oc;")
	public Class212 method7047(@OriginalArg(1) Frame arg0) {
		return this.method7046(0, arg0, 7, 0);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method7048() {
		return this.anObject18;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V")
	public void method7049() {
		Static472.aLong264 = Static12.method647() + 5000L;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!oc;")
	public Class212 method7050(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method7046(0, arg1, 2, arg0);
	}
}
