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

@OriginalClass("client!lc")
public final class Class207 implements Runnable {

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Z")
	private boolean aBoolean397 = false;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!pga;")
	private Class281 aClass281_1 = null;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!ea;")
	public Class80 aClass80_1 = null;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
	public boolean aBoolean398 = false;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Lclient!ea;")
	public Class80 aClass80_3 = null;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "Z")
	public boolean aBoolean399 = false;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!ea;")
	public Class80 aClass80_2 = null;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "Lclient!pga;")
	private Class281 aClass281_2 = null;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "[Lclient!ea;")
	public Class80[] aClass80Array1;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Ljava/lang/Object;")
	private Object anObject8;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!pi;")
	private Class282 aClass282_1;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "Lclient!naa;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		this.aBoolean399 = arg3;
		Static332.aString67 = "Unknown";
		Static332.aString60 = arg1;
		Static332.aString66 = "1.1";
		Static332.anInt5176 = arg0;
		try {
			Static332.aString67 = System.getProperty("java.vendor");
			Static332.aString66 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static332.aString67.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean398 = true;
		}
		try {
			Static332.aString61 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static332.aString61 = "Unknown";
		}
		Static332.aString65 = Static332.aString61.toLowerCase();
		try {
			Static332.aString64 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static332.aString64 = "";
		}
		try {
			Static332.aString62 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static332.aString62 = "";
		}
		try {
			Static332.aString63 = System.getProperty("user.home");
			if (Static332.aString63 != null) {
				Static332.aString63 = Static332.aString63 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static332.aString63 == null) {
			Static332.aString63 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean398) {
			try {
				Static332.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static332.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static29.method645(Static332.anInt5176, Static332.aString60);
		if (this.aBoolean399) {
			this.aClass80_1 = new Class80(Static29.method644(Static332.anInt5176, (String) null, "random.dat"), "rw", 25L);
			this.aClass80_3 = new Class80(Static29.method646("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass80_2 = new Class80(Static29.method646("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass80Array1 = new Class80[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass80Array1[local181] = new Class80(Static29.method646("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean398) {
				try {
					this.anObject7 = Class.forName("Class307").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean398) {
					this.aClass282_1 = new Class282();
				} else {
					this.anObject8 = Class.forName("Class115").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean398) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject6 = Class.forName("Class13").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean399 && !this.aBoolean398) {
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
		this.aBoolean397 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class281 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean397) {
						return;
					}
					if (this.aClass281_2 != null) {
						local15 = this.aClass281_2;
						this.aClass281_2 = this.aClass281_2.aClass281_5;
						if (this.aClass281_2 == null) {
							this.aClass281_1 = null;
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
				@Pc(41) int local41 = local15.anInt7340;
				if (local41 == 1) {
					if (Static429.method5935() < Static332.aLong159) {
						throw new IOException();
					}
					local15.anObject17 = new Socket(InetAddress.getByName((String) local15.anObject16), local15.anInt7337);
				} else if (local41 == 22) {
					if (Static429.method5935() < Static332.aLong159) {
						throw new IOException();
					}
					try {
						local15.anObject17 = Static33.method7963(local15.anInt7337, (String) local15.anObject16).method6031();
					} catch (@Pc(73) IOException_Sub1 local73) {
						local15.anObject17 = local73.getMessage();
						throw local73;
					}
				} else if (local41 == 2) {
					@Pc(91) Thread local91 = new Thread((Runnable) local15.anObject16);
					local91.setDaemon(true);
					local91.start();
					local91.setPriority(local15.anInt7337);
					local15.anObject17 = local91;
				} else if (local41 == 4) {
					if (Static332.aLong159 > Static429.method5935()) {
						throw new IOException();
					}
					local15.anObject17 = new DataInputStream(((URL) local15.anObject16).openStream());
				} else {
					@Pc(121) Object[] local121;
					if (local41 == 8) {
						local121 = (Object[]) local15.anObject16;
						if (this.aBoolean399 && ((Class) local121[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject17 = ((Class) local121[0]).getDeclaredMethod((String) local121[1], (Class[]) local121[2]);
					} else if (local41 == 9) {
						local121 = (Object[]) local15.anObject16;
						if (this.aBoolean399 && ((Class) local121[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject17 = ((Class) local121[0]).getDeclaredField((String) local121[1]);
					} else if (local41 == 18) {
						@Pc(777) Clipboard local777 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject17 = local777.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(766) Transferable local766 = (Transferable) local15.anObject16;
						@Pc(769) Clipboard local769 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local769.setContents(local766, (ClipboardOwner) null);
					} else if (this.aBoolean399) {
						@Pc(215) String local215;
						if (local41 == 3) {
							if (Static332.aLong159 > Static429.method5935()) {
								throw new IOException();
							}
							local215 = (local15.anInt7337 >> 24 & 0xFF) + "." + (local15.anInt7337 >> 16 & 0xFF) + "." + (local15.anInt7337 >> 8 & 0xFF) + "." + (local15.anInt7337 & 0xFF);
							local15.anObject17 = InetAddress.getByName(local215).getHostName();
						} else if (local41 == 21) {
							if (Static332.aLong159 > Static429.method5935()) {
								throw new IOException();
							}
							local15.anObject17 = InetAddress.getByName((String) local15.anObject16).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean398) {
								local15.anObject17 = this.aClass282_1.method6451();
							} else {
								local15.anObject17 = Class.forName("Class115").getMethod("listmodes").invoke(this.anObject8);
							}
						} else if (local41 == 6) {
							@Pc(606) Frame local606 = new Frame("Jagex Full Screen");
							local15.anObject17 = local606;
							local606.setResizable(false);
							if (this.aBoolean398) {
								this.aClass282_1.method6449(local15.anInt7337 & 0xFFFF, local15.anInt7339 >> 16, local606, local15.anInt7337 >>> 16, local15.anInt7339 & 0xFFFF);
							} else {
								Class.forName("Class115").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject8, local606, Integer.valueOf(local15.anInt7337 >>> 16), new Integer(local15.anInt7337 & 0xFFFF), Integer.valueOf(local15.anInt7339 >> 16), new Integer(local15.anInt7339 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(272) Class80 local272;
							if (local41 == 12) {
								local272 = Static332.method4577((String) local15.anObject16, Static332.anInt5176, Static332.aString60);
								local15.anObject17 = local272;
							} else if (local41 == 13) {
								local272 = Static332.method4577((String) local15.anObject16, Static332.anInt5176, "");
								local15.anObject17 = local272;
							} else if (this.aBoolean399 && local41 == 14) {
								@Pc(541) int local541 = local15.anInt7337;
								@Pc(544) int local544 = local15.anInt7339;
								if (this.aBoolean398) {
									this.aCallback_Sub1_1.method5038(local544, local541);
								} else {
									Class.forName("Class13").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject6, Integer.valueOf(local541), new Integer(local544));
								}
							} else if (this.aBoolean399 && local41 == 15) {
								@Pc(305) boolean local305 = local15.anInt7337 != 0;
								@Pc(309) Component local309 = (Component) local15.anObject16;
								if (this.aBoolean398) {
									this.aCallback_Sub1_1.method5037(local309, local305);
								} else {
									Class.forName("Class13").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject6, local309, Boolean.valueOf(local305));
								}
							} else if (!this.aBoolean398 && local41 == 17) {
								local121 = (Object[]) local15.anObject16;
								Class.forName("Class13").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject6, (Component) local121[0], (int[]) local121[1], Integer.valueOf(local15.anInt7337), new Integer(local15.anInt7339), (Point) local121[2]);
							} else if (local41 == 16) {
								try {
									if (!Static332.aString65.startsWith("win")) {
										throw new Exception();
									}
									local215 = (String) local15.anObject16;
									if (!local215.startsWith("http://") && !local215.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(492) String local492 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(494) int local494 = 0; local494 < local215.length(); local494++) {
										if (local492.indexOf(local215.charAt(local494)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local215 + "\"");
									local15.anObject17 = null;
								} catch (@Pc(528) Exception local528) {
									local15.anObject17 = local528;
									throw local528;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean398) {
							this.aClass282_1.method6450((Frame) local15.anObject16);
						} else {
							Class.forName("Class115").getMethod("exit").invoke(this.anObject8);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt7338 = 1;
			} catch (@Pc(860) ThreadDeath local860) {
				throw local860;
			} catch (@Pc(863) Throwable local863) {
				local15.anInt7338 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/net/URL;)Lclient!pga;")
	public Class281 method4568(@OriginalArg(1) URL arg0) {
		return this.method4583(0, 4, 0, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Lclient!pga;")
	public Class281 method4569(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2) {
		return this.method4583(0, 8, 0, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public void method4570() {
		synchronized (this) {
			this.aBoolean397 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass80_3 != null) {
			try {
				this.aClass80_3.method2118();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass80_2 != null) {
			try {
				this.aClass80_2.method2118();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass80Array1 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aClass80Array1.length; local51++) {
				if (this.aClass80Array1[local51] != null) {
					try {
						this.aClass80Array1[local51].method2118();
					} catch (@Pc(65) IOException local65) {
					}
				}
			}
		}
		if (this.aClass80_1 != null) {
			try {
				this.aClass80_1.method2118();
			} catch (@Pc(85) IOException local85) {
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public void method4571() {
		Static332.aLong159 = Static429.method5935() + 5000L;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;IIZ)Lclient!pga;")
	public Class281 method4572(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method4583(0, arg2 ? 22 : 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method4573() {
		if (!this.aBoolean399) {
			return false;
		} else if (this.aBoolean398) {
			return this.aClass282_1 != null;
		} else {
			return this.anObject8 != null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZZLjava/lang/String;)Lclient!pga;")
	public Class281 method4574(@OriginalArg(2) String arg0) {
		return this.method4583(0, 12, 0, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!pga;")
	public Class281 method4575(@OriginalArg(0) String arg0) {
		return this.method4583(0, 16, 0, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([IILjava/awt/Component;Ljava/awt/Point;II)Lclient!pga;")
	public Class281 method4576(@OriginalArg(0) int[] arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method4583(arg3, 17, arg4, new Object[] { arg1, arg0, arg2 });
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!pga;")
	public Class281 method4578(@OriginalArg(0) Frame arg0) {
		return this.method4583(0, 7, 0, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!pga;")
	public Class281 method4579(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method4583(0, 9, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)Lclient!pga;")
	public Class281 method4581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method4583(arg0 << 16, 6, (arg1 << 16) + arg2, (Object) null);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public Object method4582() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!pga;")
	private Class281 method4583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class281 local3 = new Class281();
		local3.anInt7337 = arg2;
		local3.anObject16 = arg3;
		local3.anInt7340 = arg1;
		local3.anInt7339 = arg0;
		synchronized (this) {
			if (this.aClass281_1 == null) {
				this.aClass281_1 = this.aClass281_2 = local3;
			} else {
				this.aClass281_1.aClass281_5 = local3;
				this.aClass281_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	public boolean method4584(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(Z)Lclient!pga;")
	public Class281 method4585() {
		return this.method4583(0, 5, 0, (Object) null);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lclient!pga;")
	public Class281 method4586(@OriginalArg(1) int arg0) {
		return this.method4583(0, 3, arg0, (Object) null);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!pga;")
	public Class281 method4587(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method4583(0, 2, arg0, arg1);
	}
}
