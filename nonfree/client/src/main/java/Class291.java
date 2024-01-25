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

@OriginalClass("client!qn")
public final class Class291 implements Runnable {

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Lclient!eba;")
	private Class81 aClass81_8 = null;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "Lclient!eba;")
	private Class81 aClass81_9 = null;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "Z")
	private boolean aBoolean620 = false;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "Z")
	public boolean aBoolean619 = false;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "Lclient!mea;")
	public Class214 aClass214_1 = null;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
	public boolean aBoolean618 = false;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "Lclient!mea;")
	public Class214 aClass214_2 = null;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "Lclient!mea;")
	public Class214 aClass214_3 = null;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "[Lclient!mea;")
	public Class214[] aClass214Array1;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject15;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject16;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "Lclient!sr;")
	private Class325 aClass325_1;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "Ljava/lang/Object;")
	private Object anObject17;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Lclient!jf;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class291(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		this.aBoolean619 = arg3;
		Static497.anInt8155 = arg0;
		Static497.aString94 = arg1;
		Static497.aString96 = "Unknown";
		Static497.aString93 = "1.1";
		try {
			Static497.aString96 = System.getProperty("java.vendor");
			Static497.aString93 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static497.aString96.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean618 = true;
		}
		try {
			Static497.aString95 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static497.aString95 = "Unknown";
		}
		Static497.aString91 = Static497.aString95.toLowerCase();
		try {
			Static497.aString98 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static497.aString98 = "";
		}
		try {
			Static497.aString92 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static497.aString92 = "";
		}
		try {
			Static497.aString97 = System.getProperty("user.home");
			if (Static497.aString97 != null) {
				Static497.aString97 = Static497.aString97 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static497.aString97 == null) {
			Static497.aString97 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean618) {
			try {
				Static497.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static497.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static626.method8771(Static497.anInt8155, Static497.aString94);
		if (this.aBoolean619) {
			this.aClass214_3 = new Class214(Static626.method8773(Static497.anInt8155, (String) null, "random.dat"), "rw", 25L);
			this.aClass214_1 = new Class214(Static626.method8772("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass214_2 = new Class214(Static626.method8772("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass214Array1 = new Class214[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass214Array1[local180] = new Class214(Static626.method8772("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean618) {
				try {
					this.anObject15 = Class.forName("Class153").getDeclaredConstructor().newInstance();
				} catch (@Pc(217) Throwable local217) {
				}
			}
			try {
				if (this.aBoolean618) {
					this.aClass325_1 = new Class325();
				} else {
					this.anObject16 = Class.forName("Class378").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(234) Throwable local234) {
			}
			try {
				if (this.aBoolean618) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject17 = Class.forName("Class156").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(250) Throwable local250) {
			}
		}
		if (this.aBoolean619 && !this.aBoolean618) {
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
		this.aBoolean620 = false;
		this.aThread7 = new Thread(this);
		this.aThread7.setPriority(10);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!eba;")
	private Class81 method7123(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class81 local3 = new Class81();
		local3.anObject5 = arg1;
		local3.anInt2530 = arg0;
		local3.anInt2533 = arg2;
		local3.anInt2531 = arg3;
		synchronized (this) {
			if (this.aClass81_9 == null) {
				this.aClass81_9 = this.aClass81_8 = local3;
			} else {
				this.aClass81_9.aClass81_1 = local3;
				this.aClass81_9 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!eba;")
	public Class81 method7124(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method7123(0, new Object[] { arg0, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!eba;")
	public Class81 method7125(@OriginalArg(0) String arg0) {
		return this.method7123(0, arg0, 0, 16);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZII)Lclient!eba;")
	public Class81 method7126(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method7123(arg1 << 16, (Object) null, arg2 + (arg0 << 16), 6);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!eba;")
	public Class81 method7127(@OriginalArg(0) URL arg0) {
		return this.method7123(0, arg0, 0, 4);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)Lclient!eba;")
	public Class81 method7128(@OriginalArg(1) int arg0) {
		return this.method7123(0, (Object) null, arg0, 3);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public void method7129() {
		synchronized (this) {
			this.aBoolean620 = true;
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass214_1 != null) {
			try {
				this.aClass214_1.method5380();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass214_2 != null) {
			try {
				this.aClass214_2.method5380();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass214Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass214Array1.length; local44++) {
				if (this.aClass214Array1[local44] != null) {
					try {
						this.aClass214Array1[local44].method5380();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass214_3 != null) {
			try {
				this.aClass214_3.method5380();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/lang/String;Z)Lclient!eba;")
	public Class81 method7130(@OriginalArg(1) String arg0) {
		return this.method7123(0, arg0, 0, 12);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)Lclient!eba;")
	public Class81 method7132() {
		return this.method7123(0, (Object) null, 0, 5);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Z")
	public boolean method7133() {
		if (!this.aBoolean619) {
			return false;
		} else if (this.aBoolean618) {
			return this.aClass325_1 != null;
		} else {
			return this.anObject16 != null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
	public void method7134() {
		Static497.aLong246 = Static524.method7320() + 5000L;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!eba;")
	public Class81 method7135(@OriginalArg(0) Frame arg0) {
		return this.method7123(0, arg0, 0, 7);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!eba;")
	public Class81 method7136(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method7123(0, arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;IIZ)Lclient!eba;")
	public Class81 method7137(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method7123(0, arg0, arg1, arg2 ? 22 : 1);
	}

	@OriginalMember(owner = "client!qn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class81 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean620) {
						return;
					}
					if (this.aClass81_8 != null) {
						local15 = this.aClass81_8;
						this.aClass81_8 = this.aClass81_8.aClass81_1;
						if (this.aClass81_8 == null) {
							this.aClass81_9 = null;
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
				@Pc(41) int local41 = local15.anInt2531;
				if (local41 == 1) {
					if (Static524.method7320() < Static497.aLong246) {
						throw new IOException();
					}
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject5), local15.anInt2533);
				} else if (local41 == 22) {
					if (Static524.method7320() < Static497.aLong246) {
						throw new IOException();
					}
					try {
						local15.anObject4 = Static249.method4134(local15.anInt2533, (String) local15.anObject5).method7790();
					} catch (@Pc(100) IOException_Sub1 local100) {
						local15.anObject4 = local100.getMessage();
						throw local100;
					}
				} else if (local41 == 2) {
					@Pc(848) Thread local848 = new Thread((Runnable) local15.anObject5);
					local848.setDaemon(true);
					local848.start();
					local848.setPriority(local15.anInt2533);
					local15.anObject4 = local848;
				} else if (local41 == 4) {
					if (Static497.aLong246 > Static524.method7320()) {
						throw new IOException();
					}
					local15.anObject4 = new DataInputStream(((URL) local15.anObject5).openStream());
				} else {
					@Pc(123) Object[] local123;
					if (local41 == 8) {
						local123 = (Object[]) local15.anObject5;
						if (this.aBoolean619 && ((Class) local123[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject4 = ((Class) local123[0]).getDeclaredMethod((String) local123[1], (Class[]) local123[2]);
					} else if (local41 == 9) {
						local123 = (Object[]) local15.anObject5;
						if (this.aBoolean619 && ((Class) local123[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject4 = ((Class) local123[0]).getDeclaredField((String) local123[1]);
					} else if (local41 == 18) {
						@Pc(812) Clipboard local812 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject4 = local812.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(194) Transferable local194 = (Transferable) local15.anObject5;
						@Pc(197) Clipboard local197 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local197.setContents(local194, (ClipboardOwner) null);
					} else if (this.aBoolean619) {
						@Pc(539) String local539;
						if (local41 == 3) {
							if (Static497.aLong246 > Static524.method7320()) {
								throw new IOException();
							}
							local539 = (local15.anInt2533 >> 24 & 0xFF) + "." + (local15.anInt2533 >> 16 & 0xFF) + "." + (local15.anInt2533 >> 8 & 0xFF) + "." + (local15.anInt2533 & 0xFF);
							local15.anObject4 = InetAddress.getByName(local539).getHostName();
						} else if (local41 == 21) {
							if (Static497.aLong246 > Static524.method7320()) {
								throw new IOException();
							}
							local15.anObject4 = InetAddress.getByName((String) local15.anObject5).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean618) {
								local15.anObject4 = this.aClass325_1.method7932();
							} else {
								local15.anObject4 = Class.forName("Class378").getMethod("listmodes").invoke(this.anObject16);
							}
						} else if (local41 == 6) {
							@Pc(252) Frame local252 = new Frame("Jagex Full Screen");
							local15.anObject4 = local252;
							local252.setResizable(false);
							if (this.aBoolean618) {
								this.aClass325_1.method7934(local15.anInt2533 & 0xFFFF, local252, local15.anInt2530 >> 16, local15.anInt2530 & 0xFFFF, local15.anInt2533 >>> 16);
							} else {
								Class.forName("Class378").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject16, local252, Integer.valueOf(local15.anInt2533 >>> 16), new Integer(local15.anInt2533 & 0xFFFF), Integer.valueOf(local15.anInt2530 >> 16), new Integer(local15.anInt2530 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(713) Class214 local713;
							if (local41 == 12) {
								local713 = Static497.method7140(Static497.anInt8155, Static497.aString94, (String) local15.anObject5);
								local15.anObject4 = local713;
							} else if (local41 == 13) {
								local713 = Static497.method7140(Static497.anInt8155, "", (String) local15.anObject5);
								local15.anObject4 = local713;
							} else if (this.aBoolean619 && local41 == 14) {
								@Pc(657) int local657 = local15.anInt2533;
								@Pc(660) int local660 = local15.anInt2530;
								if (this.aBoolean618) {
									this.aCallback_Sub1_1.method4429(local657, local660);
								} else {
									Class.forName("Class156").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject17, Integer.valueOf(local657), new Integer(local660));
								}
							} else if (this.aBoolean619 && local41 == 15) {
								@Pc(601) boolean local601 = local15.anInt2533 != 0;
								@Pc(605) Component local605 = (Component) local15.anObject5;
								if (this.aBoolean618) {
									this.aCallback_Sub1_1.method4430(local605, local601);
								} else {
									Class.forName("Class156").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject17, local605, Boolean.valueOf(local601));
								}
							} else if (!this.aBoolean618 && local41 == 17) {
								local123 = (Object[]) local15.anObject5;
								Class.forName("Class156").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject17, (Component) local123[0], (int[]) local123[1], Integer.valueOf(local15.anInt2533), new Integer(local15.anInt2530), (Point) local123[2]);
							} else if (local41 == 16) {
								try {
									if (!Static497.aString91.startsWith("win")) {
										throw new Exception();
									}
									local539 = (String) local15.anObject5;
									if (!local539.startsWith("http://") && !local539.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(553) String local553 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(555) int local555 = 0;
									while (true) {
										if (local555 >= local539.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local539 + "\"");
											local15.anObject4 = null;
											break;
										}
										if (local553.indexOf(local539.charAt(local555)) == -1) {
											throw new Exception();
										}
										local555++;
									}
								} catch (@Pc(589) Exception local589) {
									local15.anObject4 = local589;
									throw local589;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean618) {
							this.aClass325_1.method7933((Frame) local15.anObject5);
						} else {
							Class.forName("Class378").getMethod("exit").invoke(this.anObject16);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2532 = 1;
			} catch (@Pc(865) ThreadDeath local865) {
				throw local865;
			} catch (@Pc(868) Throwable local868) {
				local15.anInt2532 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Class;Ljava/lang/Class;)Lclient!eba;")
	public Class81 method7138(@OriginalArg(0) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method7123(0, new Object[] { arg2, arg0, arg1 }, 0, 8);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([BILjava/io/File;)Z")
	public boolean method7139(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method7141() {
		return this.anObject15;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ[IILjava/awt/Component;Ljava/awt/Point;)Lclient!eba;")
	public Class81 method7142(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) Point arg4) {
		return this.method7123(arg2, new Object[] { arg3, arg1, arg4 }, arg0, 17);
	}
}
