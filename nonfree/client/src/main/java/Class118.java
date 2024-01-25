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

@OriginalClass("client!gh")
public final class Class118 implements Runnable {

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!sb;")
	private Class301 aClass301_3 = null;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!ww;")
	public Class379 aClass379_1 = null;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!sb;")
	private Class301 aClass301_4 = null;

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "Lclient!ww;")
	public Class379 aClass379_3 = null;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "Z")
	public boolean aBoolean301 = false;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Lclient!ww;")
	public Class379 aClass379_2 = null;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "Z")
	private boolean aBoolean303 = false;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[Lclient!ww;")
	public Class379[] aClass379Array1;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Ljava/lang/Object;")
	private Object anObject8;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Ljava/lang/Object;")
	private Object anObject10;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "Lclient!ow;")
	private Class246 aClass246_1;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Ljava/lang/Object;")
	private Object anObject9;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!gda;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static175.anInt4172 = arg0;
		this.aBoolean302 = arg3;
		Static175.aString52 = "1.1";
		Static175.aString53 = arg1;
		Static175.aString47 = "Unknown";
		try {
			Static175.aString47 = System.getProperty("java.vendor");
			Static175.aString52 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static175.aString47.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean301 = true;
		}
		try {
			Static175.aString50 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static175.aString50 = "Unknown";
		}
		Static175.aString46 = Static175.aString50.toLowerCase();
		try {
			Static175.aString51 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static175.aString51 = "";
		}
		try {
			Static175.aString48 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static175.aString48 = "";
		}
		try {
			Static175.aString49 = System.getProperty("user.home");
			if (Static175.aString49 != null) {
				Static175.aString49 = Static175.aString49 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static175.aString49 == null) {
			Static175.aString49 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean301) {
			try {
				Static175.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static175.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static421.method6587(Static175.anInt4172, Static175.aString53);
		if (this.aBoolean302) {
			this.aClass379_3 = new Class379(Static421.method6589(null, "random.dat", Static175.anInt4172), "rw", 25L);
			this.aClass379_1 = new Class379(Static421.method6588("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass379_2 = new Class379(Static421.method6588("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass379Array1 = new Class379[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass379Array1[local181] = new Class379(Static421.method6588("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean301) {
				try {
					this.anObject8 = Class.forName("Class69").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean301) {
					this.aClass246_1 = new Class246();
				} else {
					this.anObject10 = Class.forName("Class87").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean301) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject9 = Class.forName("Class350").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean302 && !this.aBoolean301) {
			@Pc(257) ThreadGroup local257 = Thread.currentThread().getThreadGroup();
			for (@Pc(260) ThreadGroup local260 = local257.getParent(); local260 != null; local260 = local260.getParent()) {
				local257 = local260;
			}
			@Pc(271) Thread[] local271 = new Thread[1000];
			local257.enumerate(local271);
			for (@Pc(277) int local277 = 0; local277 < local271.length; local277++) {
				if (local271[local277] != null && local271[local277].getName().startsWith("AWT")) {
					local271[local277].setPriority(1);
				}
			}
		}
		this.aBoolean303 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;B)Lclient!sb;")
	public Class301 method3393(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2) {
		return this.method3404(8, new Object[] { arg0, arg1, arg2 }, 0, 0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	public boolean method3394(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(11) FileOutputStream local11 = new FileOutputStream(arg0);
			local11.write(arg1, 0, arg1.length);
			local11.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Lclient!sb;")
	public Class301 method3395() {
		return this.method3404(5, null, 0, 0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZBLjava/lang/String;)Lclient!sb;")
	public Class301 method3396(@OriginalArg(2) String arg0) {
		return this.method3404(12, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILjava/awt/Component;[ILjava/awt/Point;)Lclient!sb;")
	public Class301 method3397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Point arg4) {
		return this.method3404(17, new Object[] { arg2, arg3, arg4 }, arg1, arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)Lclient!sb;")
	public Class301 method3398(@OriginalArg(1) int arg0) {
		return this.method3404(3, null, 0, arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!sb;")
	public Class301 method3399(@OriginalArg(0) URL arg0) {
		return this.method3404(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)Lclient!sb;")
	public Class301 method3400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method3404(6, null, arg1 << 16, (arg0 << 16) - -arg2);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZLjava/lang/String;Z)Lclient!sb;")
	public Class301 method3402(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		return this.method3404(arg2 ? 22 : 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public void method3403() {
		synchronized (this) {
			this.aBoolean303 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass379_1 != null) {
			try {
				this.aClass379_1.method8628();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass379_2 != null) {
			try {
				this.aClass379_2.method8628();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass379Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass379Array1.length; local53++) {
				if (this.aClass379Array1[local53] != null) {
					try {
						this.aClass379Array1[local53].method8628();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass379_3 != null) {
			try {
				this.aClass379_3.method8628();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!sb;")
	private Class301 method3404(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class301 local3 = new Class301();
		local3.anInt8916 = arg2;
		local3.anInt8917 = arg0;
		local3.anObject17 = arg1;
		local3.anInt8918 = arg3;
		synchronized (this) {
			if (this.aClass301_4 == null) {
				this.aClass301_4 = this.aClass301_3 = local3;
			} else {
				this.aClass301_4.aClass301_7 = local3;
				this.aClass301_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!sb;")
	public Class301 method3405(@OriginalArg(1) Frame arg0) {
		return this.method3404(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!gh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class301 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean303) {
						return;
					}
					if (this.aClass301_3 != null) {
						local15 = this.aClass301_3;
						this.aClass301_3 = this.aClass301_3.aClass301_7;
						if (this.aClass301_3 == null) {
							this.aClass301_4 = null;
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
				@Pc(41) int local41 = local15.anInt8917;
				if (local41 == 1) {
					if (Static175.aLong108 > Static342.method5463()) {
						throw new IOException();
					}
					local15.anObject18 = new Socket(InetAddress.getByName((String) local15.anObject17), local15.anInt8918);
				} else if (local41 == 22) {
					if (Static342.method5463() < Static175.aLong108) {
						throw new IOException();
					}
					try {
						local15.anObject18 = Static643.method8629(local15.anInt8918, (String) local15.anObject17).method8304();
					} catch (@Pc(822) IOException_Sub1 local822) {
						local15.anObject18 = local822.getMessage();
						throw local822;
					}
				} else if (local41 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local15.anObject17);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local15.anInt8918);
					local15.anObject18 = local59;
				} else if (local41 == 4) {
					if (Static342.method5463() < Static175.aLong108) {
						throw new IOException();
					}
					local15.anObject18 = new DataInputStream(((URL) local15.anObject17).openStream());
				} else {
					@Pc(107) Object[] local107;
					if (local41 == 8) {
						local107 = (Object[]) local15.anObject17;
						if (this.aBoolean302 && ((Class) local107[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject18 = ((Class) local107[0]).getDeclaredMethod((String) local107[1], (Class[]) local107[2]);
					} else if (local41 == 9) {
						local107 = (Object[]) local15.anObject17;
						if (this.aBoolean302 && ((Class) local107[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject18 = ((Class) local107[0]).getDeclaredField((String) local107[1]);
					} else if (local41 == 18) {
						@Pc(790) Clipboard local790 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject18 = local790.getContents(null);
					} else if (local41 == 19) {
						@Pc(779) Transferable local779 = (Transferable) local15.anObject17;
						@Pc(782) Clipboard local782 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local782.setContents(local779, null);
					} else if (this.aBoolean302) {
						@Pc(412) String local412;
						if (local41 == 3) {
							if (Static175.aLong108 > Static342.method5463()) {
								throw new IOException();
							}
							local412 = (local15.anInt8918 >> 24 & 0xFF) + "." + (local15.anInt8918 >> 16 & 0xFF) + "." + (local15.anInt8918 >> 8 & 0xFF) + "." + (local15.anInt8918 & 0xFF);
							local15.anObject18 = InetAddress.getByName(local412).getHostName();
						} else if (local41 == 21) {
							if (Static175.aLong108 > Static342.method5463()) {
								throw new IOException();
							}
							local15.anObject18 = InetAddress.getByName((String) local15.anObject17).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean301) {
								local15.anObject18 = this.aClass246_1.method6473();
							} else {
								local15.anObject18 = Class.forName("Class87").getMethod("listmodes").invoke(this.anObject10);
							}
						} else if (local41 == 6) {
							@Pc(199) Frame local199 = new Frame("Jagex Full Screen");
							local15.anObject18 = local199;
							local199.setResizable(false);
							if (this.aBoolean301) {
								this.aClass246_1.method6475(local15.anInt8916 >> 16, local15.anInt8918 & 0xFFFF, local199, local15.anInt8916 & 0xFFFF, local15.anInt8918 >>> 16);
							} else {
								Class.forName("Class87").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject10, local199, Integer.valueOf(local15.anInt8918 >>> 16), new Integer(local15.anInt8918 & 0xFFFF), Integer.valueOf(local15.anInt8916 >> 16), new Integer(local15.anInt8916 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(354) Class379 local354;
							if (local41 == 12) {
								local354 = Static175.method3401(Static175.aString53, (String) local15.anObject17, Static175.anInt4172);
								local15.anObject18 = local354;
							} else if (local41 == 13) {
								local354 = Static175.method3401("", (String) local15.anObject17, Static175.anInt4172);
								local15.anObject18 = local354;
							} else if (this.aBoolean302 && local41 == 14) {
								@Pc(634) int local634 = local15.anInt8918;
								@Pc(637) int local637 = local15.anInt8916;
								if (this.aBoolean301) {
									this.aCallback_Sub1_1.method3349(local637, local634);
								} else {
									Class.forName("Class350").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject9, Integer.valueOf(local634), new Integer(local637));
								}
							} else if (this.aBoolean302 && local41 == 15) {
								@Pc(578) boolean local578 = local15.anInt8918 != 0;
								@Pc(582) Component local582 = (Component) local15.anObject17;
								if (this.aBoolean301) {
									this.aCallback_Sub1_1.method3348(local582, local578);
								} else {
									Class.forName("Class350").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject9, local582, Boolean.valueOf(local578));
								}
							} else if (!this.aBoolean301 && local41 == 17) {
								local107 = (Object[]) local15.anObject17;
								Class.forName("Class350").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject9, (Component) local107[0], (int[]) local107[1], Integer.valueOf(local15.anInt8918), new Integer(local15.anInt8916), (Point) local107[2]);
							} else if (local41 == 16) {
								try {
									if (!Static175.aString46.startsWith("win")) {
										throw new Exception();
									}
									local412 = (String) local15.anObject17;
									if (!local412.startsWith("http://") && !local412.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(426) String local426 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(428) int local428 = 0; local428 < local412.length(); local428++) {
										if (local426.indexOf(local412.charAt(local428)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local412 + "\"");
									local15.anObject18 = null;
								} catch (@Pc(466) Exception local466) {
									local15.anObject18 = local466;
									throw local466;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean301) {
							this.aClass246_1.method6474((Frame) local15.anObject17);
						} else {
							Class.forName("Class87").getMethod("exit").invoke(this.anObject10);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt8915 = 1;
			} catch (@Pc(857) ThreadDeath local857) {
				throw local857;
			} catch (@Pc(860) Throwable local860) {
				local15.anInt8915 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3406() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)Lclient!sb;")
	public Class301 method3407(@OriginalArg(1) String arg0) {
		return this.method3404(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!sb;")
	public Class301 method3408(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method3404(9, new Object[] { arg0, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!sb;")
	public Class301 method3410(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method3404(2, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)Z")
	public boolean method3411() {
		if (!this.aBoolean302) {
			return false;
		} else if (this.aBoolean301) {
			return this.aClass246_1 != null;
		} else {
			return this.anObject10 != null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
	public void method3412() {
		Static175.aLong108 = Static342.method5463() + 5000L;
	}
}
