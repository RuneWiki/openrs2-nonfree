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

@OriginalClass("client!fl")
public final class Class104 implements Runnable {

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "Lclient!jt;")
	private Class159 aClass159_1 = null;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!vl;")
	public Class360 aClass360_1 = null;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!vl;")
	public Class360 aClass360_2 = null;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Z")
	private boolean aBoolean289 = false;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Lclient!jt;")
	private Class159 aClass159_2 = null;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Z")
	public boolean aBoolean290 = false;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
	public boolean aBoolean288 = false;

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "Lclient!vl;")
	public Class360 aClass360_3 = null;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "[Lclient!vl;")
	public Class360[] aClass360Array1;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Ljava/lang/Object;")
	private Object anObject8;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "Lclient!bha;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "Lclient!kea;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class104(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static161.aString35 = "1.1";
		Static161.aString36 = arg1;
		this.aBoolean290 = arg3;
		Static161.aString37 = "Unknown";
		Static161.anInt3661 = arg0;
		try {
			Static161.aString37 = System.getProperty("java.vendor");
			Static161.aString35 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static161.aString37.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean288 = true;
		}
		try {
			Static161.aString33 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static161.aString33 = "Unknown";
		}
		Static161.aString38 = Static161.aString33.toLowerCase();
		try {
			Static161.aString34 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static161.aString34 = "";
		}
		try {
			Static161.aString31 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static161.aString31 = "";
		}
		try {
			Static161.aString32 = System.getProperty("user.home");
			if (Static161.aString32 != null) {
				Static161.aString32 = Static161.aString32 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static161.aString32 == null) {
			Static161.aString32 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean288) {
			try {
				Static161.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static161.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static546.method7687(Static161.anInt3661, Static161.aString36);
		if (this.aBoolean290) {
			this.aClass360_2 = new Class360(Static546.method7685(Static161.anInt3661, "random.dat", (String) null), "rw", 25L);
			this.aClass360_3 = new Class360(Static546.method7686("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass360_1 = new Class360(Static546.method7686("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass360Array1 = new Class360[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass360Array1[local181] = new Class360(Static546.method7686("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean288) {
				try {
					this.anObject6 = Class.forName("Class172").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean288) {
					this.aClass29_1 = new Class29();
				} else {
					this.anObject8 = Class.forName("Class83").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean288) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject7 = Class.forName("Class328").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean290 && !this.aBoolean288) {
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
		this.aBoolean289 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!jt;")
	public Class159 method3127(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method3146(0, arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/String;)Lclient!jt;")
	public Class159 method3128(@OriginalArg(1) String arg0) {
		return this.method3146(0, 0, 16, arg0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Z")
	public boolean method3129() {
		if (!this.aBoolean290) {
			return false;
		} else if (this.aBoolean288) {
			return this.aClass29_1 != null;
		} else {
			return this.anObject8 != null;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method3130() {
		Static161.aLong96 = Static582.method8056() + 5000L;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!jt;")
	public Class159 method3131(@OriginalArg(1) Frame arg0) {
		return this.method3146(0, 0, 7, arg0);
	}

	@OriginalMember(owner = "client!fl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class159 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean289) {
						return;
					}
					if (this.aClass159_2 != null) {
						local15 = this.aClass159_2;
						this.aClass159_2 = this.aClass159_2.aClass159_5;
						if (this.aClass159_2 == null) {
							this.aClass159_1 = null;
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
				@Pc(41) int local41 = local15.anInt5911;
				if (local41 == 1) {
					if (Static161.aLong96 > Static582.method8056()) {
						throw new IOException();
					}
					local15.anObject13 = new Socket(InetAddress.getByName((String) local15.anObject12), local15.anInt5913);
				} else if (local41 == 22) {
					if (Static161.aLong96 > Static582.method8056()) {
						throw new IOException();
					}
					try {
						local15.anObject13 = Static240.method4372((String) local15.anObject12, local15.anInt5913).method8770();
					} catch (@Pc(75) IOException_Sub1 local75) {
						local15.anObject13 = local75.getMessage();
						throw local75;
					}
				} else if (local41 == 2) {
					@Pc(91) Thread local91 = new Thread((Runnable) local15.anObject12);
					local91.setDaemon(true);
					local91.start();
					local91.setPriority(local15.anInt5913);
					local15.anObject13 = local91;
				} else if (local41 == 4) {
					if (Static161.aLong96 > Static582.method8056()) {
						throw new IOException();
					}
					local15.anObject13 = new DataInputStream(((URL) local15.anObject12).openStream());
				} else {
					@Pc(123) Object[] local123;
					if (local41 == 8) {
						local123 = (Object[]) local15.anObject12;
						if (this.aBoolean290 && ((Class) local123[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local123[0]).getDeclaredMethod((String) local123[1], (Class[]) local123[2]);
					} else if (local41 == 9) {
						local123 = (Object[]) local15.anObject12;
						if (this.aBoolean290 && ((Class) local123[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local123[0]).getDeclaredField((String) local123[1]);
					} else if (local41 == 18) {
						@Pc(154) Clipboard local154 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject13 = local154.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(776) Transferable local776 = (Transferable) local15.anObject12;
						@Pc(779) Clipboard local779 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local779.setContents(local776, (ClipboardOwner) null);
					} else if (this.aBoolean290) {
						@Pc(215) String local215;
						if (local41 == 3) {
							if (Static161.aLong96 > Static582.method8056()) {
								throw new IOException();
							}
							local215 = (local15.anInt5913 >> 24 & 0xFF) + "." + (local15.anInt5913 >> 16 & 0xFF) + "." + (local15.anInt5913 >> 8 & 0xFF) + "." + (local15.anInt5913 & 0xFF);
							local15.anObject13 = InetAddress.getByName(local215).getHostName();
						} else if (local41 == 21) {
							if (Static161.aLong96 > Static582.method8056()) {
								throw new IOException();
							}
							local15.anObject13 = InetAddress.getByName((String) local15.anObject12).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean288) {
								local15.anObject13 = this.aClass29_1.method1353();
							} else {
								local15.anObject13 = Class.forName("Class83").getMethod("listmodes").invoke(this.anObject8);
							}
						} else if (local41 == 6) {
							@Pc(239) Frame local239 = new Frame("Jagex Full Screen");
							local15.anObject13 = local239;
							local239.setResizable(false);
							if (this.aBoolean288) {
								this.aClass29_1.method1355(local15.anInt5912 >> 16, local15.anInt5913 >>> 16, local15.anInt5912 & 0xFFFF, local15.anInt5913 & 0xFFFF, local239);
							} else {
								Class.forName("Class83").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject8, local239, Integer.valueOf(local15.anInt5913 >>> 16), new Integer(local15.anInt5913 & 0xFFFF), Integer.valueOf(local15.anInt5912 >> 16), new Integer(local15.anInt5912 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(394) Class360 local394;
							if (local41 == 12) {
								local394 = Static161.method3140(Static161.aString36, (String) local15.anObject12, Static161.anInt3661);
								local15.anObject13 = local394;
							} else if (local41 == 13) {
								local394 = Static161.method3140("", (String) local15.anObject12, Static161.anInt3661);
								local15.anObject13 = local394;
							} else if (this.aBoolean290 && local41 == 14) {
								@Pc(414) int local414 = local15.anInt5913;
								@Pc(417) int local417 = local15.anInt5912;
								if (this.aBoolean288) {
									this.aCallback_Sub1_1.method5013(local417, local414);
								} else {
									Class.forName("Class328").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject7, Integer.valueOf(local414), new Integer(local417));
								}
							} else if (this.aBoolean290 && local41 == 15) {
								@Pc(477) boolean local477 = local15.anInt5913 != 0;
								@Pc(481) Component local481 = (Component) local15.anObject12;
								if (this.aBoolean288) {
									this.aCallback_Sub1_1.method5014(local477, local481);
								} else {
									Class.forName("Class328").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject7, local481, Boolean.valueOf(local477));
								}
							} else if (!this.aBoolean288 && local41 == 17) {
								local123 = (Object[]) local15.anObject12;
								Class.forName("Class328").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject7, (Component) local123[0], (int[]) local123[1], Integer.valueOf(local15.anInt5913), new Integer(local15.anInt5912), (Point) local123[2]);
							} else if (local41 == 16) {
								try {
									if (!Static161.aString38.startsWith("win")) {
										throw new Exception();
									}
									local215 = (String) local15.anObject12;
									if (!local215.startsWith("http://") && !local215.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(570) String local570 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(572) int local572 = 0;
									while (true) {
										if (local572 >= local215.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local215 + "\"");
											local15.anObject13 = null;
											break;
										}
										if (local570.indexOf(local215.charAt(local572)) == -1) {
											throw new Exception();
										}
										local572++;
									}
								} catch (@Pc(610) Exception local610) {
									local15.anObject13 = local610;
									throw local610;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean288) {
							this.aClass29_1.method1354((Frame) local15.anObject12);
						} else {
							Class.forName("Class83").getMethod("exit").invoke(this.anObject8);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5910 = 1;
			} catch (@Pc(865) ThreadDeath local865) {
				throw local865;
			} catch (@Pc(868) Throwable local868) {
				local15.anInt5910 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;ZIZ)Lclient!jt;")
	public Class159 method3132(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method3146(0, arg1, arg2 ? 22 : 1, arg0);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Lclient!jt;")
	public Class159 method3133() {
		return this.method3146(0, 0, 5, (Object) null);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/net/URL;)Lclient!jt;")
	public Class159 method3135(@OriginalArg(1) URL arg0) {
		return this.method3146(0, 0, 4, arg0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method3136() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lclient!jt;")
	public Class159 method3137(@OriginalArg(0) int arg0) {
		return this.method3146(0, arg0, 3, (Object) null);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIII)Lclient!jt;")
	public Class159 method3138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method3146(arg0 << 16, arg2 + (arg1 << 16), 6, (Object) null);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lclient!jt;")
	public Class159 method3139(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method3146(0, 0, 8, new Object[] { arg1, arg0, arg2 });
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([ILjava/awt/Point;IBILjava/awt/Component;)Lclient!jt;")
	public Class159 method3141(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method3146(arg2, arg3, 17, new Object[] { arg4, arg0, arg1 });
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!jt;")
	public Class159 method3142(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method3146(0, 0, 9, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	public void method3143() {
		synchronized (this) {
			this.aBoolean289 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass360_3 != null) {
			try {
				this.aClass360_3.method8359();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass360_1 != null) {
			try {
				this.aClass360_1.method8359();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass360Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass360Array1.length; local48++) {
				if (this.aClass360Array1[local48] != null) {
					try {
						this.aClass360Array1[local48].method8359();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass360_2 != null) {
			try {
				this.aClass360_2.method8359();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;ZI)Lclient!jt;")
	public Class159 method3144(@OriginalArg(0) String arg0) {
		return this.method3146(0, 0, 12, arg0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([BZLjava/io/File;)Z")
	public boolean method3145(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!jt;")
	private Class159 method3146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(9) Class159 local9 = new Class159();
		local9.anObject12 = arg3;
		local9.anInt5911 = arg2;
		local9.anInt5913 = arg1;
		local9.anInt5912 = arg0;
		synchronized (this) {
			if (this.aClass159_1 == null) {
				this.aClass159_1 = this.aClass159_2 = local9;
			} else {
				this.aClass159_1.aClass159_5 = local9;
				this.aClass159_1 = local9;
			}
			this.notify();
			return local9;
		}
	}
}
