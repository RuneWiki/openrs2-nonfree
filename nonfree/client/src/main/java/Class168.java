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

@OriginalClass("client!k")
public final class Class168 implements Runnable {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!qq;")
	public Class272 aClass272_1 = null;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Z")
	private boolean aBoolean333 = false;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Lclient!sw;")
	private Class309 aClass309_4 = null;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!sw;")
	private Class309 aClass309_5 = null;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Lclient!qq;")
	public Class272 aClass272_2 = null;

	@OriginalMember(owner = "client!k", name = "A", descriptor = "Lclient!qq;")
	public Class272 aClass272_3 = null;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "Z")
	public boolean aBoolean335 = false;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "[Lclient!qq;")
	public Class272[] aClass272Array1;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Lclient!ig;")
	private Class141 aClass141_1;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Lclient!g;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject12;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class168(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		this.aBoolean334 = arg3;
		Static268.aString134 = "1.1";
		Static268.anInt5105 = arg0;
		Static268.aString131 = "Unknown";
		Static268.aString135 = arg1;
		try {
			Static268.aString131 = System.getProperty("java.vendor");
			Static268.aString134 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static268.aString131.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean335 = true;
		}
		try {
			Static268.aString128 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static268.aString128 = "Unknown";
		}
		Static268.aString130 = Static268.aString128.toLowerCase();
		try {
			Static268.aString129 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static268.aString129 = "";
		}
		try {
			Static268.aString132 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static268.aString132 = "";
		}
		try {
			Static268.aString133 = System.getProperty("user.home");
			if (Static268.aString133 != null) {
				Static268.aString133 = Static268.aString133 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static268.aString133 == null) {
			Static268.aString133 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean335) {
			try {
				Static268.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static268.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static398.method5599(Static268.anInt5105, Static268.aString135);
		if (this.aBoolean334) {
			this.aClass272_3 = new Class272(Static398.method5597("random.dat", null, Static268.anInt5105), "rw", 25L);
			this.aClass272_2 = new Class272(Static398.method5598("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass272_1 = new Class272(Static398.method5598("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass272Array1 = new Class272[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass272Array1[local181] = new Class272(Static398.method5598("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean335) {
				try {
					this.anObject13 = Class.forName("Class260").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean335) {
					this.aClass141_1 = new Class141();
				} else {
					this.anObject14 = Class.forName("Class352").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean335) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject12 = Class.forName("Class231").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean334 && !this.aBoolean335) {
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
		this.aBoolean333 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!k", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class309 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean333) {
						return;
					}
					if (this.aClass309_4 != null) {
						local15 = this.aClass309_4;
						this.aClass309_4 = this.aClass309_4.aClass309_9;
						if (this.aClass309_4 == null) {
							this.aClass309_5 = null;
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
				@Pc(41) int local41 = local15.anInt8651;
				if (local41 == 1) {
					if (Static96.method2000() < Static268.aLong127) {
						throw new IOException();
					}
					local15.anObject15 = new Socket(InetAddress.getByName((String) local15.anObject16), local15.anInt8653);
				} else if (local41 == 22) {
					if (Static96.method2000() < Static268.aLong127) {
						throw new IOException();
					}
					try {
						local15.anObject15 = Static44.method8134(local15.anInt8653, (String) local15.anObject16).method6927();
					} catch (@Pc(102) IOException_Sub1 local102) {
						local15.anObject15 = local102.getMessage();
						throw local102;
					}
				} else if (local41 == 2) {
					@Pc(850) Thread local850 = new Thread((Runnable) local15.anObject16);
					local850.setDaemon(true);
					local850.start();
					local850.setPriority(local15.anInt8653);
					local15.anObject15 = local850;
				} else if (local41 == 4) {
					if (Static96.method2000() < Static268.aLong127) {
						throw new IOException();
					}
					local15.anObject15 = new DataInputStream(((URL) local15.anObject16).openStream());
				} else {
					@Pc(123) Object[] local123;
					if (local41 == 8) {
						local123 = (Object[]) local15.anObject16;
						if (this.aBoolean334 && ((Class) local123[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject15 = ((Class) local123[0]).getDeclaredMethod((String) local123[1], (Class[]) local123[2]);
					} else if (local41 == 9) {
						local123 = (Object[]) local15.anObject16;
						if (this.aBoolean334 && ((Class) local123[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject15 = ((Class) local123[0]).getDeclaredField((String) local123[1]);
					} else if (local41 == 18) {
						@Pc(163) Clipboard local163 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject15 = local163.getContents(null);
					} else if (local41 == 19) {
						@Pc(178) Transferable local178 = (Transferable) local15.anObject16;
						@Pc(181) Clipboard local181 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local181.setContents(local178, null);
					} else if (this.aBoolean334) {
						@Pc(551) String local551;
						if (local41 == 3) {
							if (Static96.method2000() < Static268.aLong127) {
								throw new IOException();
							}
							local551 = (local15.anInt8653 >> 24 & 0xFF) + "." + (local15.anInt8653 >> 16 & 0xFF) + "." + (local15.anInt8653 >> 8 & 0xFF) + "." + (local15.anInt8653 & 0xFF);
							local15.anObject15 = InetAddress.getByName(local551).getHostName();
						} else if (local41 == 21) {
							if (Static268.aLong127 > Static96.method2000()) {
								throw new IOException();
							}
							local15.anObject15 = InetAddress.getByName((String) local15.anObject16).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean335) {
								local15.anObject15 = this.aClass141_1.method3683();
							} else {
								local15.anObject15 = Class.forName("Class352").getMethod("listmodes").invoke(this.anObject14);
							}
						} else if (local41 == 6) {
							@Pc(217) Frame local217 = new Frame("Jagex Full Screen");
							local15.anObject15 = local217;
							local217.setResizable(false);
							if (this.aBoolean335) {
								this.aClass141_1.method3685(local15.anInt8652 >> 16, local217, local15.anInt8653 >>> 16, local15.anInt8653 & 0xFFFF, local15.anInt8652 & 0xFFFF);
							} else {
								Class.forName("Class352").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject14, local217, Integer.valueOf(local15.anInt8653 >>> 16), new Integer(local15.anInt8653 & 0xFFFF), Integer.valueOf(local15.anInt8652 >> 16), new Integer(local15.anInt8652 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(350) Class272 local350;
							if (local41 == 12) {
								local350 = Static268.method4093(Static268.anInt5105, (String) local15.anObject16, Static268.aString135);
								local15.anObject15 = local350;
							} else if (local41 == 13) {
								local350 = Static268.method4093(Static268.anInt5105, (String) local15.anObject16, "");
								local15.anObject15 = local350;
							} else if (this.aBoolean334 && local41 == 14) {
								@Pc(614) int local614 = local15.anInt8653;
								@Pc(617) int local617 = local15.anInt8652;
								if (this.aBoolean335) {
									this.aCallback_Sub1_1.method2943(local614, local617);
								} else {
									Class.forName("Class231").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject12, Integer.valueOf(local614), new Integer(local617));
								}
							} else if (this.aBoolean334 && local41 == 15) {
								@Pc(378) boolean local378 = local15.anInt8653 != 0;
								@Pc(382) Component local382 = (Component) local15.anObject16;
								if (this.aBoolean335) {
									this.aCallback_Sub1_1.method2942(local382, local378);
								} else {
									Class.forName("Class231").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject12, local382, Boolean.valueOf(local378));
								}
							} else if (!this.aBoolean335 && local41 == 17) {
								local123 = (Object[]) local15.anObject16;
								Class.forName("Class231").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject12, (Component) local123[0], (int[]) local123[1], Integer.valueOf(local15.anInt8653), new Integer(local15.anInt8652), (Point) local123[2]);
							} else if (local41 == 16) {
								try {
									if (!Static268.aString130.startsWith("win")) {
										throw new Exception();
									}
									local551 = (String) local15.anObject16;
									if (!local551.startsWith("http://") && !local551.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(565) String local565 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(567) int local567 = 0; local567 < local551.length(); local567++) {
										if (local565.indexOf(local551.charAt(local567)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local551 + "\"");
									local15.anObject15 = null;
								} catch (@Pc(601) Exception local601) {
									local15.anObject15 = local601;
									throw local601;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean335) {
							this.aClass141_1.method3684((Frame) local15.anObject16);
						} else {
							Class.forName("Class352").getMethod("exit").invoke(this.anObject14);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt8650 = 1;
			} catch (@Pc(867) ThreadDeath local867) {
				throw local867;
			} catch (@Pc(870) Throwable local870) {
				local15.anInt8650 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZI)Lclient!sw;")
	public Class309 method4076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method4083(null, (arg2 << 16) + arg0, arg1 << 16, 6);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Z")
	public boolean method4077() {
		if (!this.aBoolean334) {
			return false;
		} else if (this.aBoolean335) {
			return this.aClass141_1 != null;
		} else {
			return this.anObject14 != null;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z[BLjava/io/File;)Z")
	public boolean method4078(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!sw;")
	public Class309 method4079(@OriginalArg(0) URL arg0) {
		return this.method4083(arg0, 0, 0, 4);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;Z)Lclient!sw;")
	public Class309 method4080(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method4083(arg0, 0, 0, 12) : this.method4083(arg0, 0, 0, 13);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;B)Lclient!sw;")
	public Class309 method4081(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return this.method4083(new Object[] { arg1, arg2, arg0 }, 0, 0, 8);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
	public void method4082() {
		Static268.aLong127 = Static96.method2000() + 5000L;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!sw;")
	private Class309 method4083(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class309 local3 = new Class309();
		local3.anInt8651 = arg3;
		local3.anInt8653 = arg1;
		local3.anObject16 = arg0;
		local3.anInt8652 = arg2;
		synchronized (this) {
			if (this.aClass309_5 == null) {
				this.aClass309_5 = this.aClass309_4 = local3;
			} else {
				this.aClass309_5.aClass309_9 = local3;
				this.aClass309_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZILjava/lang/String;I)Lclient!sw;")
	public Class309 method4084(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method4083(arg1, arg2, 0, arg0 ? 22 : 1);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Lclient!sw;")
	public Class309 method4085() {
		return this.method4083(null, 0, 0, 5);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!sw;")
	public Class309 method4086(@OriginalArg(0) String arg0) {
		return this.method4083(arg0, 0, 0, 16);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!sw;")
	public Class309 method4087(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method4083(new Object[] { arg1, arg0 }, 0, 0, 9);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/Point;[IIILjava/awt/Component;)Lclient!sw;")
	public Class309 method4088(@OriginalArg(1) Point arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method4083(new Object[] { arg4, arg1, arg0 }, arg2, arg3, 17);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!sw;")
	public Class309 method4089(@OriginalArg(0) Frame arg0) {
		return this.method4083(arg0, 0, 0, 7);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method4090() {
		return this.anObject13;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lclient!sw;")
	public Class309 method4091(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4083(arg0, arg1, 0, 2);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)Lclient!sw;")
	public Class309 method4094(@OriginalArg(1) int arg0) {
		return this.method4083(null, arg0, 0, 3);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	public void method4095() {
		synchronized (this) {
			this.aBoolean333 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass272_2 != null) {
			try {
				this.aClass272_2.method6172();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass272_1 != null) {
			try {
				this.aClass272_1.method6172();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass272Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass272Array1.length; local50++) {
				if (this.aClass272Array1[local50] != null) {
					try {
						this.aClass272Array1[local50].method6172();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass272_3 != null) {
			try {
				this.aClass272_3.method6172();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}
}
