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

@OriginalClass("client!qj")
public final class Class272 implements Runnable {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "Lclient!bi;")
	public Class31 aClass31_2 = null;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "Lclient!bi;")
	public Class31 aClass31_4 = null;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Z")
	private boolean aBoolean510 = false;

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "Z")
	public boolean aBoolean512 = false;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!ue;")
	private Class331 aClass331_8 = null;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Lclient!bi;")
	public Class31 aClass31_3 = null;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "Z")
	public boolean aBoolean511 = false;

	@OriginalMember(owner = "client!qj", name = "B", descriptor = "Lclient!ue;")
	private Class331 aClass331_9 = null;

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "[Lclient!bi;")
	public Class31[] aClass31Array1;

	@OriginalMember(owner = "client!qj", name = "z", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "Lclient!rq;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "Ljava/lang/Object;")
	private Object anObject9;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!mm;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "Ljava/lang/Object;")
	private Object anObject10;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class272(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		this.aBoolean511 = arg3;
		Static426.aString70 = "Unknown";
		Static426.aString68 = "1.1";
		Static426.aString71 = arg1;
		Static426.anInt7407 = arg0;
		try {
			Static426.aString70 = System.getProperty("java.vendor");
			Static426.aString68 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static426.aString70.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean512 = true;
		}
		try {
			Static426.aString67 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static426.aString67 = "Unknown";
		}
		Static426.aString72 = Static426.aString67.toLowerCase();
		try {
			Static426.aString69 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static426.aString69 = "";
		}
		try {
			Static426.aString73 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static426.aString73 = "";
		}
		try {
			Static426.aString66 = System.getProperty("user.home");
			if (Static426.aString66 != null) {
				Static426.aString66 = Static426.aString66 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static426.aString66 == null) {
			Static426.aString66 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean512) {
			try {
				Static426.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static426.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static504.method6800(Static426.aString71, Static426.anInt7407);
		if (this.aBoolean511) {
			this.aClass31_4 = new Class31(Static504.method6802(null, Static426.anInt7407, "random.dat"), "rw", 25L);
			this.aClass31_3 = new Class31(Static504.method6801("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass31_2 = new Class31(Static504.method6801("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass31Array1 = new Class31[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass31Array1[local181] = new Class31(Static504.method6801("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean512) {
				try {
					this.anObject11 = Class.forName("Class360").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean512) {
					this.aClass291_1 = new Class291();
				} else {
					this.anObject9 = Class.forName("Class35").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean512) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject10 = Class.forName("Class282").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean511 && !this.aBoolean512) {
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
		this.aBoolean510 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	public boolean method6116(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	public void method6117() {
		synchronized (this) {
			this.aBoolean510 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass31_3 != null) {
			try {
				this.aClass31_3.method1007();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass31_2 != null) {
			try {
				this.aClass31_2.method1007();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass31Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass31Array1.length; local50++) {
				if (this.aClass31Array1[local50] != null) {
					try {
						this.aClass31Array1[local50].method1007();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass31_4 != null) {
			try {
				this.aClass31_4.method1007();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Z")
	public boolean method6118() {
		if (!this.aBoolean511) {
			return false;
		} else if (this.aBoolean512) {
			return this.aClass291_1 != null;
		} else {
			return this.anObject9 != null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILjava/lang/String;Z)Lclient!ue;")
	public Class331 method6119(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		return this.method6122(arg0, 0, arg2 ? 22 : 1, arg1);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!ue;")
	public Class331 method6121(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method6122(arg0, 0, 2, arg1);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIILjava/lang/Object;B)Lclient!ue;")
	private Class331 method6122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3) {
		@Pc(3) Class331 local3 = new Class331();
		local3.anInt8817 = arg0;
		local3.anInt8815 = arg1;
		local3.anObject17 = arg3;
		local3.anInt8816 = arg2;
		synchronized (this) {
			if (this.aClass331_9 == null) {
				this.aClass331_9 = this.aClass331_8 = local3;
			} else {
				this.aClass331_9.aClass331_11 = local3;
				this.aClass331_9 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Class;)Lclient!ue;")
	public Class331 method6123(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method6122(0, 0, 8, new Object[] { arg2, arg1, arg0 });
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Lclient!ue;")
	public Class331 method6124(@OriginalArg(0) int arg0) {
		return this.method6122(arg0, 0, 3, null);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZLjava/lang/String;)Lclient!ue;")
	public Class331 method6125(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		return arg0 ? this.method6122(0, 0, 12, arg1) : this.method6122(0, 0, 13, arg1);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method6126() {
		return this.anObject11;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)Lclient!ue;")
	public Class331 method6127(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method6122((arg2 << 16) + arg1, arg0 << 16, 6, null);
	}

	@OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class331 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean510) {
						return;
					}
					if (this.aClass331_8 != null) {
						local15 = this.aClass331_8;
						this.aClass331_8 = this.aClass331_8.aClass331_11;
						if (this.aClass331_8 == null) {
							this.aClass331_9 = null;
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
				@Pc(41) int local41 = local15.anInt8816;
				if (local41 == 1) {
					if (Static8.method201() < Static426.aLong204) {
						throw new IOException();
					}
					local15.anObject18 = new Socket(InetAddress.getByName((String) local15.anObject17), local15.anInt8817);
				} else if (local41 == 22) {
					if (Static426.aLong204 > Static8.method201()) {
						throw new IOException();
					}
					try {
						local15.anObject18 = Static68.method6774((String) local15.anObject17, local15.anInt8817).method4072();
					} catch (@Pc(94) IOException_Sub1 local94) {
						local15.anObject18 = local94.getMessage();
						throw local94;
					}
				} else if (local41 == 2) {
					@Pc(110) Thread local110 = new Thread((Runnable) local15.anObject17);
					local110.setDaemon(true);
					local110.start();
					local110.setPriority(local15.anInt8817);
					local15.anObject18 = local110;
				} else if (local41 == 4) {
					if (Static426.aLong204 > Static8.method201()) {
						throw new IOException();
					}
					local15.anObject18 = new DataInputStream(((URL) local15.anObject17).openStream());
				} else {
					@Pc(435) Object[] local435;
					if (local41 == 8) {
						local435 = (Object[]) local15.anObject17;
						if (this.aBoolean511 && ((Class) local435[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject18 = ((Class) local435[0]).getDeclaredMethod((String) local435[1], (Class[]) local435[2]);
					} else if (local41 == 9) {
						local435 = (Object[]) local15.anObject17;
						if (this.aBoolean511 && ((Class) local435[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject18 = ((Class) local435[0]).getDeclaredField((String) local435[1]);
					} else if (local41 == 18) {
						@Pc(142) Clipboard local142 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject18 = local142.getContents(null);
					} else if (local41 == 19) {
						@Pc(763) Transferable local763 = (Transferable) local15.anObject17;
						@Pc(766) Clipboard local766 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local766.setContents(local763, null);
					} else if (this.aBoolean511) {
						@Pc(205) String local205;
						if (local41 == 3) {
							if (Static426.aLong204 > Static8.method201()) {
								throw new IOException();
							}
							local205 = (local15.anInt8817 >> 24 & 0xFF) + "." + (local15.anInt8817 >> 16 & 0xFF) + "." + (local15.anInt8817 >> 8 & 0xFF) + "." + (local15.anInt8817 & 0xFF);
							local15.anObject18 = InetAddress.getByName(local205).getHostName();
						} else if (local41 == 21) {
							if (Static8.method201() < Static426.aLong204) {
								throw new IOException();
							}
							local15.anObject18 = InetAddress.getByName((String) local15.anObject17).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean512) {
								local15.anObject18 = this.aClass291_1.method6460();
							} else {
								local15.anObject18 = Class.forName("Class35").getMethod("listmodes").invoke(this.anObject9);
							}
						} else if (local41 == 6) {
							@Pc(618) Frame local618 = new Frame("Jagex Full Screen");
							local15.anObject18 = local618;
							local618.setResizable(false);
							if (this.aBoolean512) {
								this.aClass291_1.method6458(local15.anInt8815 & 0xFFFF, local15.anInt8817 >>> 16, local618, local15.anInt8815 >> 16, local15.anInt8817 & 0xFFFF);
							} else {
								Class.forName("Class35").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject9, local618, Integer.valueOf(local15.anInt8817 >>> 16), new Integer(local15.anInt8817 & 0xFFFF), Integer.valueOf(local15.anInt8815 >> 16), new Integer(local15.anInt8815 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(286) Class31 local286;
							if (local41 == 12) {
								local286 = Static426.method6115(Static426.aString71, (String) local15.anObject17, Static426.anInt7407);
								local15.anObject18 = local286;
							} else if (local41 == 13) {
								local286 = Static426.method6115("", (String) local15.anObject17, Static426.anInt7407);
								local15.anObject18 = local286;
							} else if (this.aBoolean511 && local41 == 14) {
								@Pc(306) int local306 = local15.anInt8817;
								@Pc(309) int local309 = local15.anInt8815;
								if (this.aBoolean512) {
									this.aCallback_Sub1_1.method4924(local309, local306);
								} else {
									Class.forName("Class282").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject10, Integer.valueOf(local306), new Integer(local309));
								}
							} else if (this.aBoolean511 && local41 == 15) {
								@Pc(370) boolean local370 = local15.anInt8817 != 0;
								@Pc(374) Component local374 = (Component) local15.anObject17;
								if (this.aBoolean512) {
									this.aCallback_Sub1_1.method4923(local370, local374);
								} else {
									Class.forName("Class282").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject10, local374, Boolean.valueOf(local370));
								}
							} else if (!this.aBoolean512 && local41 == 17) {
								local435 = (Object[]) local15.anObject17;
								Class.forName("Class282").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject10, (Component) local435[0], (int[]) local435[1], Integer.valueOf(local15.anInt8817), new Integer(local15.anInt8815), (Point) local435[2]);
							} else if (local41 == 16) {
								try {
									if (!Static426.aString72.startsWith("win")) {
										throw new Exception();
									}
									local205 = (String) local15.anObject17;
									if (!local205.startsWith("http://") && !local205.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(555) String local555 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(557) int local557 = 0; local557 < local205.length(); local557++) {
										if (local555.indexOf(local205.charAt(local557)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local205 + "\"");
									local15.anObject18 = null;
								} catch (@Pc(591) Exception local591) {
									local15.anObject18 = local591;
									throw local591;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean512) {
							this.aClass291_1.method6459((Frame) local15.anObject17);
						} else {
							Class.forName("Class35").getMethod("exit").invoke(this.anObject9);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt8818 = 1;
			} catch (@Pc(856) ThreadDeath local856) {
				throw local856;
			} catch (@Pc(859) Throwable local859) {
				local15.anInt8818 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!ue;")
	public Class331 method6128(@OriginalArg(0) URL arg0) {
		return this.method6122(0, 0, 4, arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ue;")
	public Class331 method6129(@OriginalArg(1) String arg0) {
		return this.method6122(0, 0, 16, arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!ue;")
	public Class331 method6130(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method6122(0, 0, 9, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
	public void method6131() {
		Static426.aLong204 = Static8.method201() + 5000L;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!ue;")
	public Class331 method6132(@OriginalArg(1) Frame arg0) {
		return this.method6122(0, 0, 7, arg0);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Lclient!ue;")
	public Class331 method6133() {
		return this.method6122(0, 0, 5, null);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([IBLjava/awt/Component;Ljava/awt/Point;II)Lclient!ue;")
	public Class331 method6134(@OriginalArg(0) int[] arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method6122(arg3, arg4, 17, new Object[] { arg1, arg0, arg2 });
	}
}
