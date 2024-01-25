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

@OriginalClass("client!rj")
public final class Class287 implements Runnable {

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "Z")
	public boolean aBoolean628 = false;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "Lclient!cu;")
	public Class63 aClass63_4 = null;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!cu;")
	public Class63 aClass63_2 = null;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "Z")
	public boolean aBoolean630 = false;

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "Lclient!vfa;")
	private Class347 aClass347_6 = null;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Lclient!cu;")
	public Class63 aClass63_3 = null;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "Z")
	private boolean aBoolean629 = false;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "Lclient!vfa;")
	private Class347 aClass347_7 = null;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "[Lclient!cu;")
	public Class63[] aClass63Array1;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Ljava/lang/Object;")
	private Object anObject40;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "Ljava/lang/Object;")
	private Object anObject42;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "Lclient!hca;")
	private Class135 aClass135_1;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "Ljava/lang/Object;")
	private Object anObject41;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "Lclient!ib;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class287(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static464.aString78 = arg1;
		Static464.aString77 = "Unknown";
		Static464.aString82 = "1.1";
		this.aBoolean630 = arg3;
		Static464.anInt7970 = arg0;
		try {
			Static464.aString77 = System.getProperty("java.vendor");
			Static464.aString82 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static464.aString77.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean628 = true;
		}
		try {
			Static464.aString81 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static464.aString81 = "Unknown";
		}
		Static464.aString79 = Static464.aString81.toLowerCase();
		try {
			Static464.aString75 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static464.aString75 = "";
		}
		try {
			Static464.aString76 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static464.aString76 = "";
		}
		try {
			Static464.aString80 = System.getProperty("user.home");
			if (Static464.aString80 != null) {
				Static464.aString80 = Static464.aString80 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static464.aString80 == null) {
			Static464.aString80 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean628) {
			try {
				Static464.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static464.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static303.method4553(Static464.anInt7970, Static464.aString78);
		if (this.aBoolean630) {
			this.aClass63_3 = new Class63(Static303.method4551("random.dat", null, Static464.anInt7970), "rw", 25L);
			this.aClass63_4 = new Class63(Static303.method4552("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass63_2 = new Class63(Static303.method4552("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass63Array1 = new Class63[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass63Array1[local181] = new Class63(Static303.method4552("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean628) {
				try {
					this.anObject40 = Class.forName("Class292").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean628) {
					this.aClass135_1 = new Class135();
				} else {
					this.anObject42 = Class.forName("Class365").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean628) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject41 = Class.forName("Class277").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean630 && !this.aBoolean628) {
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
		this.aBoolean629 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!vfa;")
	public Class347 method6531(@OriginalArg(0) URL arg0) {
		return this.method6540(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	public boolean method6532(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!vfa;")
	public Class347 method6533(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method6540(arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public void method6534() {
		Static464.aLong216 = Static548.method7437() + (long) 5000;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)Lclient!vfa;")
	public Class347 method6535(@OriginalArg(0) int arg0) {
		return this.method6540(null, arg0, 3, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Lclient!vfa;")
	public Class347 method6537() {
		return this.method6540(null, 0, 5, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;)Lclient!vfa;")
	public Class347 method6539(@OriginalArg(1) String arg0) {
		return this.method6540(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!rj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class347 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean629) {
						return;
					}
					if (this.aClass347_6 != null) {
						local15 = this.aClass347_6;
						this.aClass347_6 = this.aClass347_6.aClass347_9;
						if (this.aClass347_6 == null) {
							this.aClass347_7 = null;
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
				@Pc(41) int local41 = local15.anInt9171;
				if (local41 == 1) {
					if (Static464.aLong216 > Static548.method7437()) {
						throw new IOException();
					}
					local15.anObject49 = new Socket(InetAddress.getByName((String) local15.anObject50), local15.anInt9170);
				} else if (local41 == 22) {
					if (Static464.aLong216 > Static548.method7437()) {
						throw new IOException();
					}
					try {
						local15.anObject49 = Static528.method7280(local15.anInt9170, (String) local15.anObject50).method4964();
					} catch (@Pc(829) IOException_Sub1 local829) {
						local15.anObject49 = local829.getMessage();
						throw local829;
					}
				} else if (local41 == 2) {
					@Pc(790) Thread local790 = new Thread((Runnable) local15.anObject50);
					local790.setDaemon(true);
					local790.start();
					local790.setPriority(local15.anInt9170);
					local15.anObject49 = local790;
				} else if (local41 == 4) {
					if (Static464.aLong216 > Static548.method7437()) {
						throw new IOException();
					}
					local15.anObject49 = new DataInputStream(((URL) local15.anObject50).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local41 == 8) {
						local81 = (Object[]) local15.anObject50;
						if (this.aBoolean630 && ((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject49 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local41 == 9) {
						local81 = (Object[]) local15.anObject50;
						if (this.aBoolean630 && ((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject49 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else if (local41 == 18) {
						@Pc(150) Clipboard local150 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject49 = local150.getContents(null);
					} else if (local41 == 19) {
						@Pc(163) Transferable local163 = (Transferable) local15.anObject50;
						@Pc(166) Clipboard local166 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local166.setContents(local163, null);
					} else if (this.aBoolean630) {
						@Pc(225) String local225;
						if (local41 == 3) {
							if (Static548.method7437() < Static464.aLong216) {
								throw new IOException();
							}
							local225 = (local15.anInt9170 >> 24 & 0xFF) + "." + (local15.anInt9170 >> 16 & 0xFF) + "." + (local15.anInt9170 >> 8 & 0xFF) + "." + (local15.anInt9170 & 0xFF);
							local15.anObject49 = InetAddress.getByName(local225).getHostName();
						} else if (local41 == 21) {
							if (Static464.aLong216 > Static548.method7437()) {
								throw new IOException();
							}
							local15.anObject49 = InetAddress.getByName((String) local15.anObject50).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean628) {
								local15.anObject49 = this.aClass135_1.method3185();
							} else {
								local15.anObject49 = Class.forName("Class365").getMethod("listmodes").invoke(this.anObject42);
							}
						} else if (local41 == 6) {
							@Pc(642) Frame local642 = new Frame("Jagex Full Screen");
							local15.anObject49 = local642;
							local642.setResizable(false);
							if (this.aBoolean628) {
								this.aClass135_1.method3186(local642, local15.anInt9170 & 0xFFFF, local15.anInt9173 >> 16, local15.anInt9173 & 0xFFFF, local15.anInt9170 >>> 16);
							} else {
								Class.forName("Class365").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject42, local642, Integer.valueOf(local15.anInt9170 >>> 16), new Integer(local15.anInt9170 & 0xFFFF), Integer.valueOf(local15.anInt9173 >> 16), new Integer(local15.anInt9173 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(308) Class63 local308;
							if (local41 == 12) {
								local308 = Static464.method6536(Static464.anInt7970, (String) local15.anObject50, Static464.aString78);
								local15.anObject49 = local308;
							} else if (local41 == 13) {
								local308 = Static464.method6536(Static464.anInt7970, (String) local15.anObject50, "");
								local15.anObject49 = local308;
							} else if (this.aBoolean630 && local41 == 14) {
								@Pc(589) int local589 = local15.anInt9170;
								@Pc(592) int local592 = local15.anInt9173;
								if (this.aBoolean628) {
									this.aCallback_Sub1_1.method3446(local592, local589);
								} else {
									Class.forName("Class277").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject41, Integer.valueOf(local589), new Integer(local592));
								}
							} else if (this.aBoolean630 && local41 == 15) {
								@Pc(355) boolean local355 = local15.anInt9170 != 0;
								@Pc(359) Component local359 = (Component) local15.anObject50;
								if (this.aBoolean628) {
									this.aCallback_Sub1_1.method3445(local359, local355);
								} else {
									Class.forName("Class277").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject41, local359, Boolean.valueOf(local355));
								}
							} else if (!this.aBoolean628 && local41 == 17) {
								local81 = (Object[]) local15.anObject50;
								Class.forName("Class277").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject41, (Component) local81[0], (int[]) local81[1], Integer.valueOf(local15.anInt9170), new Integer(local15.anInt9173), (Point) local81[2]);
							} else if (local41 == 16) {
								try {
									if (!Static464.aString79.startsWith("win")) {
										throw new Exception();
									}
									local225 = (String) local15.anObject50;
									if (!local225.startsWith("http://") && !local225.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(545) String local545 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(547) int local547 = 0;
									while (true) {
										if (local547 >= local225.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local225 + "\"");
											local15.anObject49 = null;
											break;
										}
										if (local545.indexOf(local225.charAt(local547)) == -1) {
											throw new Exception();
										}
										local547++;
									}
								} catch (@Pc(581) Exception local581) {
									local15.anObject49 = local581;
									throw local581;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean628) {
							this.aClass135_1.method3187((Frame) local15.anObject50);
						} else {
							Class.forName("Class365").getMethod("exit").invoke(this.anObject42);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt9172 = 1;
			} catch (@Pc(864) ThreadDeath local864) {
				throw local864;
			} catch (@Pc(867) Throwable local867) {
				local15.anInt9172 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!vfa;")
	private Class347 method6540(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class347 local3 = new Class347();
		local3.anObject50 = arg0;
		local3.anInt9171 = arg2;
		local3.anInt9170 = arg1;
		local3.anInt9173 = arg3;
		synchronized (this) {
			if (this.aClass347_7 == null) {
				this.aClass347_7 = this.aClass347_6 = local3;
			} else {
				this.aClass347_7.aClass347_9 = local3;
				this.aClass347_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;I)Lclient!vfa;")
	public Class347 method6541(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2) {
		return this.method6540(new Object[] { arg0, arg1, arg2 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)Z")
	public boolean method6542() {
		if (!this.aBoolean630) {
			return false;
		} else if (this.aBoolean628) {
			return this.aClass135_1 != null;
		} else {
			return this.anObject42 != null;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBZLjava/lang/String;)Lclient!vfa;")
	public Class347 method6543(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		return this.method6540(arg2, arg0, arg1 ? 22 : 1, 0);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method6544() {
		return this.anObject40;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!vfa;")
	public Class347 method6545(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method6540(new Object[] { arg1, arg0 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([ILjava/awt/Point;IIZLjava/awt/Component;)Lclient!vfa;")
	public Class347 method6546(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Component arg4) {
		return this.method6540(new Object[] { arg4, arg0, arg1 }, arg2, 17, arg3);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public void method6547() {
		synchronized (this) {
			this.aBoolean629 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass63_4 != null) {
			try {
				this.aClass63_4.method1174();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass63_2 != null) {
			try {
				this.aClass63_2.method1174();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass63Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass63Array1.length; local44++) {
				if (this.aClass63Array1[local44] != null) {
					try {
						this.aClass63Array1[local44].method1174();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass63_3 != null) {
			try {
				this.aClass63_3.method1174();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;BZ)Lclient!vfa;")
	public Class347 method6548(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method6540(arg0, 0, 12, 0) : this.method6540(arg0, 0, 13, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBII)Lclient!vfa;")
	public Class347 method6549(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method6540(null, arg2 + (arg1 << 16), 6, arg0 << 16);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!vfa;")
	public Class347 method6550(@OriginalArg(0) Frame arg0) {
		return this.method6540(arg0, 0, 7, 0);
	}
}
