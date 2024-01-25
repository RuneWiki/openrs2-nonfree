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

@OriginalClass("client!lu")
public final class Class231 implements Runnable {

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "Lclient!fi;")
	public Class123 aClass123_2 = null;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "Lclient!fi;")
	public Class123 aClass123_1 = null;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Z")
	public boolean aBoolean482 = false;

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "Lclient!fo;")
	private Class129 aClass129_13 = null;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "Z")
	private boolean aBoolean483 = false;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "Lclient!fo;")
	private Class129 aClass129_12 = null;

	@OriginalMember(owner = "client!lu", name = "y", descriptor = "Z")
	public boolean aBoolean484 = false;

	@OriginalMember(owner = "client!lu", name = "z", descriptor = "Lclient!fi;")
	public Class123 aClass123_3 = null;

	@OriginalMember(owner = "client!lu", name = "A", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "[Lclient!fi;")
	public Class123[] aClass123Array1;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "Ljava/lang/Object;")
	private Object anObject10;

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "Lclient!up;")
	private Class364 aClass364_1;

	@OriginalMember(owner = "client!lu", name = "w", descriptor = "Lclient!kaa;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "Ljava/lang/Object;")
	private Object anObject9;

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class231(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static353.aString81 = arg1;
		this.aBoolean482 = arg3;
		Static353.aString84 = "1.1";
		Static353.aString79 = "Unknown";
		Static353.anInt6309 = arg0;
		try {
			Static353.aString79 = System.getProperty("java.vendor");
			Static353.aString84 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static353.aString79.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean484 = true;
		}
		try {
			Static353.aString83 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static353.aString83 = "Unknown";
		}
		Static353.aString80 = Static353.aString83.toLowerCase();
		try {
			Static353.aString86 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static353.aString86 = "";
		}
		try {
			Static353.aString82 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static353.aString82 = "";
		}
		try {
			Static353.aString85 = System.getProperty("user.home");
			if (Static353.aString85 != null) {
				Static353.aString85 = Static353.aString85 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static353.aString85 == null) {
			Static353.aString85 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean484) {
			try {
				Static353.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static353.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static590.method7924(Static353.anInt6309, Static353.aString81);
		if (this.aBoolean482) {
			this.aClass123_3 = new Class123(Static590.method7925(Static353.anInt6309, "random.dat", (String) null), "rw", 25L);
			this.aClass123_1 = new Class123(Static590.method7926("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass123_2 = new Class123(Static590.method7926("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass123Array1 = new Class123[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass123Array1[local181] = new Class123(Static590.method7926("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean484) {
				try {
					this.anObject11 = Class.forName("Class252").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean484) {
					this.aClass364_1 = new Class364();
				} else {
					this.anObject10 = Class.forName("Class155").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean484) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject9 = Class.forName("Class230").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean482 && !this.aBoolean484) {
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
		this.aBoolean483 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!fo;")
	public Class129 method5284(@OriginalArg(0) String arg0) {
		return this.method5302(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BILjava/lang/String;Z)Lclient!fo;")
	public Class129 method5286(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		return this.method5302(arg1, 0, arg2 ? 22 : 1, arg0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "([BBLjava/io/File;)Z")
	public boolean method5287(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)Lclient!fo;")
	public Class129 method5288(@OriginalArg(0) int arg0) {
		return this.method5302((Object) null, 0, 3, arg0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!fo;")
	public Class129 method5290(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method5302(new Object[] { arg0, arg1 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)Lclient!fo;")
	public Class129 method5291(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method5302((Object) null, arg0 << 16, 6, (arg2 << 16) + arg1);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLjava/net/URL;)Lclient!fo;")
	public Class129 method5292(@OriginalArg(1) URL arg0) {
		return this.method5302(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public void method5293() {
		Static353.aLong164 = Static131.method2268() + 5000L;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)Z")
	public boolean method5294() {
		if (!this.aBoolean482) {
			return false;
		} else if (this.aBoolean484) {
			return this.aClass364_1 != null;
		} else {
			return this.anObject10 != null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class129 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean483) {
						return;
					}
					if (this.aClass129_12 != null) {
						local15 = this.aClass129_12;
						this.aClass129_12 = this.aClass129_12.aClass129_5;
						if (this.aClass129_12 == null) {
							this.aClass129_13 = null;
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
				@Pc(41) int local41 = local15.anInt3301;
				if (local41 == 1) {
					if (Static131.method2268() < Static353.aLong164) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt3300);
				} else if (local41 == 22) {
					if (Static353.aLong164 > Static131.method2268()) {
						throw new IOException();
					}
					try {
						local15.anObject7 = Static495.method7039(local15.anInt3300, (String) local15.anObject6).method6690();
					} catch (@Pc(71) IOException_Sub1 local71) {
						local15.anObject7 = local71.getMessage();
						throw local71;
					}
				} else if (local41 == 2) {
					@Pc(89) Thread local89 = new Thread((Runnable) local15.anObject6);
					local89.setDaemon(true);
					local89.start();
					local89.setPriority(local15.anInt3300);
					local15.anObject7 = local89;
				} else if (local41 == 4) {
					if (Static353.aLong164 > Static131.method2268()) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(335) Object[] local335;
					if (local41 == 8) {
						local335 = (Object[]) local15.anObject6;
						if (this.aBoolean482 && ((Class) local335[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject7 = ((Class) local335[0]).getDeclaredMethod((String) local335[1], (Class[]) local335[2]);
					} else if (local41 == 9) {
						local335 = (Object[]) local15.anObject6;
						if (this.aBoolean482 && ((Class) local335[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject7 = ((Class) local335[0]).getDeclaredField((String) local335[1]);
					} else if (local41 == 18) {
						@Pc(119) Clipboard local119 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject7 = local119.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(134) Transferable local134 = (Transferable) local15.anObject6;
						@Pc(137) Clipboard local137 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local137.setContents(local134, (ClipboardOwner) null);
					} else if (this.aBoolean482) {
						@Pc(267) String local267;
						if (local41 == 3) {
							if (Static131.method2268() < Static353.aLong164) {
								throw new IOException();
							}
							local267 = (local15.anInt3300 >> 24 & 0xFF) + "." + (local15.anInt3300 >> 16 & 0xFF) + "." + (local15.anInt3300 >> 8 & 0xFF) + "." + (local15.anInt3300 & 0xFF);
							local15.anObject7 = InetAddress.getByName(local267).getHostName();
						} else if (local41 == 21) {
							if (Static131.method2268() < Static353.aLong164) {
								throw new IOException();
							}
							local15.anObject7 = InetAddress.getByName((String) local15.anObject6).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean484) {
								local15.anObject7 = this.aClass364_1.method8087();
							} else {
								local15.anObject7 = Class.forName("Class155").getMethod("listmodes").invoke(this.anObject10);
							}
						} else if (local41 == 6) {
							@Pc(554) Frame local554 = new Frame("Jagex Full Screen");
							local15.anObject7 = local554;
							local554.setResizable(false);
							if (this.aBoolean484) {
								this.aClass364_1.method8086(local15.anInt3298 & 0xFFFF, local15.anInt3298 >> 16, local554, local15.anInt3300 & 0xFFFF, local15.anInt3300 >>> 16);
							} else {
								Class.forName("Class155").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject10, local554, Integer.valueOf(local15.anInt3300 >>> 16), new Integer(local15.anInt3300 & 0xFFFF), Integer.valueOf(local15.anInt3298 >> 16), new Integer(local15.anInt3298 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(224) Class123 local224;
							if (local41 == 12) {
								local224 = Static353.method5285(Static353.aString81, Static353.anInt6309, (String) local15.anObject6);
								local15.anObject7 = local224;
							} else if (local41 == 13) {
								local224 = Static353.method5285("", Static353.anInt6309, (String) local15.anObject6);
								local15.anObject7 = local224;
							} else if (this.aBoolean482 && local41 == 14) {
								@Pc(489) int local489 = local15.anInt3300;
								@Pc(492) int local492 = local15.anInt3298;
								if (this.aBoolean484) {
									this.aCallback_Sub1_1.method4582(local492, local489);
								} else {
									Class.forName("Class230").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject9, Integer.valueOf(local489), new Integer(local492));
								}
							} else if (this.aBoolean482 && local41 == 15) {
								@Pc(433) boolean local433 = local15.anInt3300 != 0;
								@Pc(437) Component local437 = (Component) local15.anObject6;
								if (this.aBoolean484) {
									this.aCallback_Sub1_1.method4581(local433, local437);
								} else {
									Class.forName("Class230").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject9, local437, Boolean.valueOf(local433));
								}
							} else if (!this.aBoolean484 && local41 == 17) {
								local335 = (Object[]) local15.anObject6;
								Class.forName("Class230").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject9, (Component) local335[0], (int[]) local335[1], Integer.valueOf(local15.anInt3300), new Integer(local15.anInt3298), (Point) local335[2]);
							} else if (local41 == 16) {
								try {
									if (!Static353.aString80.startsWith("win")) {
										throw new Exception();
									}
									local267 = (String) local15.anObject6;
									if (!local267.startsWith("http://") && !local267.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(281) String local281 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(283) int local283 = 0; local283 < local267.length(); local283++) {
										if (local281.indexOf(local267.charAt(local283)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local267 + "\"");
									local15.anObject7 = null;
								} catch (@Pc(321) Exception local321) {
									local15.anObject7 = local321;
									throw local321;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean484) {
							this.aClass364_1.method8085((Frame) local15.anObject6);
						} else {
							Class.forName("Class155").getMethod("exit").invoke(this.anObject10);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt3299 = 1;
			} catch (@Pc(855) ThreadDeath local855) {
				throw local855;
			} catch (@Pc(858) Throwable local858) {
				local15.anInt3299 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLjava/lang/String;Z)Lclient!fo;")
	public Class129 method5295(@OriginalArg(1) String arg0) {
		return this.method5302(arg0, 0, 12, 0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!fo;")
	public Class129 method5296(@OriginalArg(1) Frame arg0) {
		return this.method5302(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!fo;")
	public Class129 method5297(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method5302(arg1, 0, 2, arg0);
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method5298() {
		return this.anObject11;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lclient!fo;")
	public Class129 method5299(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method5302(new Object[] { arg2, arg0, arg1 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;BI[II)Lclient!fo;")
	public Class129 method5300(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		return this.method5302(new Object[] { arg0, arg3, arg1 }, arg2, 17, arg4);
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)V")
	public void method5301() {
		synchronized (this) {
			this.aBoolean483 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass123_1 != null) {
			try {
				this.aClass123_1.method2764();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass123_2 != null) {
			try {
				this.aClass123_2.method2764();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass123Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass123Array1.length; local50++) {
				if (this.aClass123Array1[local50] != null) {
					try {
						this.aClass123Array1[local50].method2764();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass123_3 != null) {
			try {
				this.aClass123_3.method2764();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Lclient!fo;")
	private Class129 method5302(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class129 local8 = new Class129();
		local8.anObject6 = arg0;
		local8.anInt3300 = arg3;
		local8.anInt3301 = arg2;
		local8.anInt3298 = arg1;
		synchronized (this) {
			if (this.aClass129_13 == null) {
				this.aClass129_13 = this.aClass129_12 = local8;
			} else {
				this.aClass129_13.aClass129_5 = local8;
				this.aClass129_13 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)Lclient!fo;")
	public Class129 method5303() {
		return this.method5302((Object) null, 0, 5, 0);
	}
}
