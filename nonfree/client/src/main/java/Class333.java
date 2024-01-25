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

@OriginalClass("client!td")
public final class Class333 implements Runnable {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
	public boolean aBoolean693 = false;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Lclient!hu;")
	private Class150 aClass150_10 = null;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!qia;")
	public Class285 aClass285_2 = null;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!hu;")
	private Class150 aClass150_9 = null;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "Lclient!qia;")
	public Class285 aClass285_3 = null;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "Z")
	public boolean aBoolean694 = false;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "Z")
	private boolean aBoolean695 = false;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "Lclient!qia;")
	public Class285 aClass285_4 = null;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "[Lclient!qia;")
	public Class285[] aClass285Array1;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Ljava/lang/Object;")
	private Object anObject23;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Ljava/lang/Object;")
	private Object anObject21;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!qn;")
	private Class286 aClass286_1;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Ljava/lang/Object;")
	private Object anObject22;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!fv;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class333(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static565.aString95 = "1.1";
		Static565.aString94 = "Unknown";
		Static565.anInt9782 = arg0;
		Static565.aString97 = arg1;
		this.aBoolean693 = arg3;
		try {
			Static565.aString94 = System.getProperty("java.vendor");
			Static565.aString95 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static565.aString94.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean694 = true;
		}
		try {
			Static565.aString99 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static565.aString99 = "Unknown";
		}
		Static565.aString98 = Static565.aString99.toLowerCase();
		try {
			Static565.aString96 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static565.aString96 = "";
		}
		try {
			Static565.aString100 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static565.aString100 = "";
		}
		try {
			Static565.aString93 = System.getProperty("user.home");
			if (Static565.aString93 != null) {
				Static565.aString93 = Static565.aString93 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static565.aString93 == null) {
			Static565.aString93 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean694) {
			try {
				Static565.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static565.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static449.method6509(Static565.aString97, Static565.anInt9782);
		if (this.aBoolean693) {
			this.aClass285_2 = new Class285(Static449.method6510((String) null, "random.dat", Static565.anInt9782), "rw", 25L);
			this.aClass285_3 = new Class285(Static449.method6508("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass285_4 = new Class285(Static449.method6508("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass285Array1 = new Class285[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass285Array1[local181] = new Class285(Static449.method6508("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean694) {
				try {
					this.anObject23 = Class.forName("Class355").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean694) {
					this.aClass286_1 = new Class286();
				} else {
					this.anObject21 = Class.forName("Class3").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean694) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject22 = Class.forName("Class289").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean693 && !this.aBoolean694) {
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
		this.aBoolean695 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lclient!hu;")
	public Class150 method8132(@OriginalArg(1) int arg0) {
		return this.method8139((Object) null, 3, arg0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/net/URL;)Lclient!hu;")
	public Class150 method8133(@OriginalArg(1) URL arg0) {
		return this.method8139(arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/awt/Point;[IILjava/awt/Component;B)Lclient!hu;")
	public Class150 method8134(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4) {
		return this.method8139(new Object[] { arg4, arg2, arg1 }, 17, arg0, arg3);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public void method8136() {
		Static565.aLong255 = Static521.method7499() + 5000L;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Lclient!hu;")
	public Class150 method8137() {
		return this.method8139((Object) null, 5, 0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!hu;")
	public Class150 method8138(@OriginalArg(0) String arg0) {
		return this.method8139(arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lclient!hu;")
	private Class150 method8139(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class150 local3 = new Class150();
		local3.anInt4245 = arg1;
		local3.anInt4248 = arg3;
		local3.anInt4246 = arg2;
		local3.anObject7 = arg0;
		synchronized (this) {
			if (this.aClass150_10 == null) {
				this.aClass150_10 = this.aClass150_9 = local3;
			} else {
				this.aClass150_10.aClass150_4 = local3;
				this.aClass150_10 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class150 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean695) {
						return;
					}
					if (this.aClass150_9 != null) {
						local15 = this.aClass150_9;
						this.aClass150_9 = this.aClass150_9.aClass150_4;
						if (this.aClass150_9 == null) {
							this.aClass150_10 = null;
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
				@Pc(41) int local41 = local15.anInt4245;
				if (local41 == 1) {
					if (Static565.aLong255 > Static521.method7499()) {
						throw new IOException();
					}
					local15.anObject8 = new Socket(InetAddress.getByName((String) local15.anObject7), local15.anInt4246);
				} else if (local41 == 22) {
					if (Static521.method7499() < Static565.aLong255) {
						throw new IOException();
					}
					try {
						local15.anObject8 = Static438.method6440((String) local15.anObject7, local15.anInt4246).method8226();
					} catch (@Pc(73) IOException_Sub1 local73) {
						local15.anObject8 = local73.getMessage();
						throw local73;
					}
				} else if (local41 == 2) {
					@Pc(91) Thread local91 = new Thread((Runnable) local15.anObject7);
					local91.setDaemon(true);
					local91.start();
					local91.setPriority(local15.anInt4246);
					local15.anObject8 = local91;
				} else if (local41 == 4) {
					if (Static565.aLong255 > Static521.method7499()) {
						throw new IOException();
					}
					local15.anObject8 = new DataInputStream(((URL) local15.anObject7).openStream());
				} else {
					@Pc(116) Object[] local116;
					if (local41 == 8) {
						local116 = (Object[]) local15.anObject7;
						if (this.aBoolean693 && ((Class) local116[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local116[0]).getDeclaredMethod((String) local116[1], (Class[]) local116[2]);
					} else if (local41 == 9) {
						local116 = (Object[]) local15.anObject7;
						if (this.aBoolean693 && ((Class) local116[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local116[0]).getDeclaredField((String) local116[1]);
					} else if (local41 == 18) {
						@Pc(158) Clipboard local158 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject8 = local158.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(772) Transferable local772 = (Transferable) local15.anObject7;
						@Pc(775) Clipboard local775 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local775.setContents(local772, (ClipboardOwner) null);
					} else if (this.aBoolean693) {
						@Pc(228) String local228;
						if (local41 == 3) {
							if (Static521.method7499() < Static565.aLong255) {
								throw new IOException();
							}
							local228 = (local15.anInt4246 >> 24 & 0xFF) + "." + (local15.anInt4246 >> 16 & 0xFF) + "." + (local15.anInt4246 >> 8 & 0xFF) + "." + (local15.anInt4246 & 0xFF);
							local15.anObject8 = InetAddress.getByName(local228).getHostName();
						} else if (local41 == 21) {
							if (Static521.method7499() < Static565.aLong255) {
								throw new IOException();
							}
							local15.anObject8 = InetAddress.getByName((String) local15.anObject7).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean694) {
								local15.anObject8 = this.aClass286_1.method7233();
							} else {
								local15.anObject8 = Class.forName("Class3").getMethod("listmodes").invoke(this.anObject21);
							}
						} else if (local41 == 6) {
							@Pc(629) Frame local629 = new Frame("Jagex Full Screen");
							local15.anObject8 = local629;
							local629.setResizable(false);
							if (this.aBoolean694) {
								this.aClass286_1.method7234(local15.anInt4246 & 0xFFFF, local15.anInt4248 & 0xFFFF, local15.anInt4246 >>> 16, local629, local15.anInt4248 >> 16);
							} else {
								Class.forName("Class3").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject21, local629, Integer.valueOf(local15.anInt4246 >>> 16), new Integer(local15.anInt4246 & 0xFFFF), Integer.valueOf(local15.anInt4248 >> 16), new Integer(local15.anInt4248 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(300) Class285 local300;
							if (local41 == 12) {
								local300 = Static565.method8135((String) local15.anObject7, Static565.aString97, Static565.anInt9782);
								local15.anObject8 = local300;
							} else if (local41 == 13) {
								local300 = Static565.method8135((String) local15.anObject7, "", Static565.anInt9782);
								local15.anObject8 = local300;
							} else if (this.aBoolean693 && local41 == 14) {
								@Pc(576) int local576 = local15.anInt4246;
								@Pc(579) int local579 = local15.anInt4248;
								if (this.aBoolean694) {
									this.aCallback_Sub1_1.method2777(local576, local579);
								} else {
									Class.forName("Class289").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject22, Integer.valueOf(local576), new Integer(local579));
								}
							} else if (this.aBoolean693 && local41 == 15) {
								@Pc(520) boolean local520 = local15.anInt4246 != 0;
								@Pc(524) Component local524 = (Component) local15.anObject7;
								if (this.aBoolean694) {
									this.aCallback_Sub1_1.method2776(local520, local524);
								} else {
									Class.forName("Class289").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject22, local524, Boolean.valueOf(local520));
								}
							} else if (!this.aBoolean694 && local41 == 17) {
								local116 = (Object[]) local15.anObject7;
								Class.forName("Class289").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject22, (Component) local116[0], (int[]) local116[1], Integer.valueOf(local15.anInt4246), new Integer(local15.anInt4248), (Point) local116[2]);
							} else if (local41 == 16) {
								try {
									if (!Static565.aString98.startsWith("win")) {
										throw new Exception();
									}
									local228 = (String) local15.anObject7;
									if (!local228.startsWith("http://") && !local228.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(372) String local372 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(374) int local374 = 0; local374 < local228.length(); local374++) {
										if (local372.indexOf(local228.charAt(local374)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local228 + "\"");
									local15.anObject8 = null;
								} catch (@Pc(408) Exception local408) {
									local15.anObject8 = local408;
									throw local408;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean694) {
							this.aClass286_1.method7232((Frame) local15.anObject7);
						} else {
							Class.forName("Class3").getMethod("exit").invoke(this.anObject21);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt4247 = 1;
			} catch (@Pc(857) ThreadDeath local857) {
				throw local857;
			} catch (@Pc(860) Throwable local860) {
				local15.anInt4247 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLjava/lang/String;I)Lclient!hu;")
	public Class150 method8140(@OriginalArg(1) String arg0) {
		return this.method8139(arg0, 12, 0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!hu;")
	public Class150 method8141(@OriginalArg(0) Frame arg0) {
		return this.method8139(arg0, 7, 0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!hu;")
	public Class150 method8142(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method8139(new Object[] { arg1, arg0 }, 9, 0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILjava/lang/String;Z)Lclient!hu;")
	public Class150 method8143(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		return this.method8139(arg1, arg2 ? 22 : 1, arg0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z")
	public boolean method8144() {
		if (!this.aBoolean693) {
			return false;
		} else if (this.aBoolean694) {
			return this.aClass286_1 != null;
		} else {
			return this.anObject21 != null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIII)Lclient!hu;")
	public Class150 method8145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method8139((Object) null, 6, arg2 + (arg1 << 16), arg0 << 16);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method8146() {
		return this.anObject23;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public void method8147() {
		synchronized (this) {
			this.aBoolean695 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass285_3 != null) {
			try {
				this.aClass285_3.method7142();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass285_4 != null) {
			try {
				this.aClass285_4.method7142();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass285Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass285Array1.length; local44++) {
				if (this.aClass285Array1[local44] != null) {
					try {
						this.aClass285Array1[local44].method7142();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass285_2 != null) {
			try {
				this.aClass285_2.method7142();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!hu;")
	public Class150 method8149(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method8139(new Object[] { arg1, arg2, arg0 }, 8, 0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLjava/io/File;[B)Z")
	public boolean method8150(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(12) FileOutputStream local12 = new FileOutputStream(arg0);
			local12.write(arg1, 0, arg1.length);
			local12.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!hu;")
	public Class150 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method8139(arg1, 2, arg0, 0);
	}
}
