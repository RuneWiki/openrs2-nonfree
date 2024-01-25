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

@OriginalClass("client!wd")
public final class Class354 implements Runnable {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Z")
	private boolean aBoolean709 = false;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "Lclient!vba;")
	public Class337 aClass337_4 = null;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Z")
	public boolean aBoolean710 = false;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!nga;")
	private Class234 aClass234_8 = null;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!vba;")
	public Class337 aClass337_2 = null;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Z")
	public boolean aBoolean711 = false;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "Lclient!nga;")
	private Class234 aClass234_9 = null;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!vba;")
	public Class337 aClass337_3 = null;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "[Lclient!vba;")
	public Class337[] aClass337Array1;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Ljava/lang/Object;")
	private Object anObject18;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!wp;")
	private Class363 aClass363_1;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!mg;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread8;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class354(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static576.aString98 = "1.1";
		Static576.aString99 = "Unknown";
		Static576.aString101 = arg1;
		Static576.anInt10054 = arg0;
		this.aBoolean711 = arg3;
		try {
			Static576.aString99 = System.getProperty("java.vendor");
			Static576.aString98 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static576.aString99.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean710 = true;
		}
		try {
			Static576.aString97 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static576.aString97 = "Unknown";
		}
		Static576.aString104 = Static576.aString97.toLowerCase();
		try {
			Static576.aString100 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static576.aString100 = "";
		}
		try {
			Static576.aString102 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static576.aString102 = "";
		}
		try {
			Static576.aString103 = System.getProperty("user.home");
			if (Static576.aString103 != null) {
				Static576.aString103 = Static576.aString103 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static576.aString103 == null) {
			Static576.aString103 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean710) {
			try {
				Static576.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static576.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static131.method2638(Static576.anInt10054, Static576.aString101);
		if (this.aBoolean711) {
			this.aClass337_4 = new Class337(Static131.method2640(null, "random.dat", Static576.anInt10054), "rw", 25L);
			this.aClass337_3 = new Class337(Static131.method2639("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass337_2 = new Class337(Static131.method2639("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass337Array1 = new Class337[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass337Array1[local181] = new Class337(Static131.method2639("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean710) {
				try {
					this.anObject20 = Class.forName("Class175").getDeclaredConstructor().newInstance();
				} catch (@Pc(218) Throwable local218) {
				}
			}
			try {
				if (this.aBoolean710) {
					this.aClass363_1 = new Class363();
				} else {
					this.anObject18 = Class.forName("Class248").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (this.aBoolean710) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject19 = Class.forName("Class335").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(251) Throwable local251) {
			}
		}
		if (this.aBoolean711 && !this.aBoolean710) {
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
		this.aBoolean709 = false;
		this.aThread8 = new Thread(this);
		this.aThread8.setPriority(10);
		this.aThread8.setDaemon(true);
		this.aThread8.start();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIB)Lclient!nga;")
	public Class234 method8214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method8227(arg0 << 16, null, 6, (arg2 << 16) + arg1);
	}

	@OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class234 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean709) {
						return;
					}
					if (this.aClass234_9 != null) {
						local15 = this.aClass234_9;
						this.aClass234_9 = this.aClass234_9.aClass234_5;
						if (this.aClass234_9 == null) {
							this.aClass234_8 = null;
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
				@Pc(41) int local41 = local15.anInt6716;
				if (local41 == 1) {
					if (Static576.aLong261 > Static574.method8210()) {
						throw new IOException();
					}
					local15.anObject16 = new Socket(InetAddress.getByName((String) local15.anObject17), local15.anInt6719);
				} else if (local41 == 22) {
					if (Static574.method8210() < Static576.aLong261) {
						throw new IOException();
					}
					try {
						local15.anObject16 = Static312.method5278(local15.anInt6719, (String) local15.anObject17).method5053();
					} catch (@Pc(98) IOException_Sub1 local98) {
						local15.anObject16 = local98.getMessage();
						throw local98;
					}
				} else if (local41 == 2) {
					@Pc(843) Thread local843 = new Thread((Runnable) local15.anObject17);
					local843.setDaemon(true);
					local843.start();
					local843.setPriority(local15.anInt6719);
					local15.anObject16 = local843;
				} else if (local41 == 4) {
					if (Static574.method8210() < Static576.aLong261) {
						throw new IOException();
					}
					local15.anObject16 = new DataInputStream(((URL) local15.anObject17).openStream());
				} else {
					@Pc(142) Object[] local142;
					if (local41 == 8) {
						local142 = (Object[]) local15.anObject17;
						if (this.aBoolean711 && ((Class) local142[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local142[0]).getDeclaredMethod((String) local142[1], (Class[]) local142[2]);
					} else if (local41 == 9) {
						local142 = (Object[]) local15.anObject17;
						if (this.aBoolean711 && ((Class) local142[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local142[0]).getDeclaredField((String) local142[1]);
					} else if (local41 == 18) {
						@Pc(182) Clipboard local182 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject16 = local182.getContents(null);
					} else if (local41 == 19) {
						@Pc(195) Transferable local195 = (Transferable) local15.anObject17;
						@Pc(198) Clipboard local198 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local198.setContents(local195, null);
					} else if (this.aBoolean711) {
						@Pc(259) String local259;
						if (local41 == 3) {
							if (Static574.method8210() < Static576.aLong261) {
								throw new IOException();
							}
							local259 = (local15.anInt6719 >> 24 & 0xFF) + "." + (local15.anInt6719 >> 16 & 0xFF) + "." + (local15.anInt6719 >> 8 & 0xFF) + "." + (local15.anInt6719 & 0xFF);
							local15.anObject16 = InetAddress.getByName(local259).getHostName();
						} else if (local41 == 21) {
							if (Static574.method8210() < Static576.aLong261) {
								throw new IOException();
							}
							local15.anObject16 = InetAddress.getByName((String) local15.anObject17).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean710) {
								local15.anObject16 = this.aClass363_1.method8312();
							} else {
								local15.anObject16 = Class.forName("Class248").getMethod("listmodes").invoke(this.anObject18);
							}
						} else if (local41 == 6) {
							@Pc(663) Frame local663 = new Frame("Jagex Full Screen");
							local15.anObject16 = local663;
							local663.setResizable(false);
							if (this.aBoolean710) {
								this.aClass363_1.method8311(local663, local15.anInt6719 >>> 16, local15.anInt6719 & 0xFFFF, local15.anInt6718 >> 16, local15.anInt6718 & 0xFFFF);
							} else {
								Class.forName("Class248").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject18, local663, Integer.valueOf(local15.anInt6719 >>> 16), new Integer(local15.anInt6719 & 0xFFFF), Integer.valueOf(local15.anInt6718 >> 16), new Integer(local15.anInt6718 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(333) Class337 local333;
							if (local41 == 12) {
								local333 = Static576.method8216((String) local15.anObject17, Static576.aString101, Static576.anInt10054);
								local15.anObject16 = local333;
							} else if (local41 == 13) {
								local333 = Static576.method8216((String) local15.anObject17, "", Static576.anInt10054);
								local15.anObject16 = local333;
							} else if (this.aBoolean711 && local41 == 14) {
								@Pc(598) int local598 = local15.anInt6719;
								@Pc(601) int local601 = local15.anInt6718;
								if (this.aBoolean710) {
									this.aCallback_Sub1_1.method5347(local601, local598);
								} else {
									Class.forName("Class335").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject19, Integer.valueOf(local598), new Integer(local601));
								}
							} else if (this.aBoolean711 && local41 == 15) {
								@Pc(542) boolean local542 = local15.anInt6719 != 0;
								@Pc(546) Component local546 = (Component) local15.anObject17;
								if (this.aBoolean710) {
									this.aCallback_Sub1_1.method5346(local546, local542);
								} else {
									Class.forName("Class335").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject19, local546, Boolean.valueOf(local542));
								}
							} else if (!this.aBoolean710 && local41 == 17) {
								local142 = (Object[]) local15.anObject17;
								Class.forName("Class335").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject19, (Component) local142[0], (int[]) local142[1], Integer.valueOf(local15.anInt6719), new Integer(local15.anInt6718), (Point) local142[2]);
							} else if (local41 == 16) {
								try {
									if (!Static576.aString104.startsWith("win")) {
										throw new Exception();
									}
									local259 = (String) local15.anObject17;
									if (!local259.startsWith("http://") && !local259.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(486) String local486 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(488) int local488 = 0; local259.length() > local488; local488++) {
										if (local486.indexOf(local259.charAt(local488)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local259 + "\"");
									local15.anObject16 = null;
								} catch (@Pc(522) Exception local522) {
									local15.anObject16 = local522;
									throw local522;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean710) {
							this.aClass363_1.method8313((Frame) local15.anObject17);
						} else {
							Class.forName("Class248").getMethod("exit").invoke(this.anObject18);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6717 = 1;
			} catch (@Pc(860) ThreadDeath local860) {
				throw local860;
			} catch (@Pc(863) Throwable local863) {
				local15.anInt6717 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!nga;")
	public Class234 method8215(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method8227(0, arg0, 12, 0) : this.method8227(0, arg0, 13, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public void method8217() {
		Static576.aLong261 = Static574.method8210() + 5000L;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/net/URL;Z)Lclient!nga;")
	public Class234 method8218(@OriginalArg(0) URL arg0) {
		return this.method8227(0, arg0, 4, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!nga;")
	public Class234 method8219(@OriginalArg(0) Frame arg0) {
		return this.method8227(0, arg0, 7, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZILjava/lang/String;)Lclient!nga;")
	public Class234 method8220(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		return this.method8227(0, arg2, arg1 ? 22 : 1, arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lclient!nga;")
	public Class234 method8221(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method8227(0, new Object[] { arg2, arg0, arg1 }, 8, 0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method8222() {
		return this.anObject20;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lclient!nga;")
	public Class234 method8223(@OriginalArg(1) int arg0) {
		return this.method8227(0, null, 3, arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!nga;")
	public Class234 method8224(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method8227(0, new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public void method8225() {
		synchronized (this) {
			this.aBoolean709 = true;
			this.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass337_3 != null) {
			try {
				this.aClass337_3.method7966();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass337_2 != null) {
			try {
				this.aClass337_2.method7966();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass337Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass337Array1.length; local44++) {
				if (this.aClass337Array1[local44] != null) {
					try {
						this.aClass337Array1[local44].method7966();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass337_4 != null) {
			try {
				this.aClass337_4.method7966();
			} catch (@Pc(81) IOException local81) {
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)Z")
	public boolean method8226() {
		if (!this.aBoolean711) {
			return false;
		} else if (this.aBoolean710) {
			return this.aClass363_1 != null;
		} else {
			return this.anObject18 != null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!nga;")
	private Class234 method8227(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class234 local3 = new Class234();
		local3.anObject17 = arg1;
		local3.anInt6718 = arg0;
		local3.anInt6719 = arg3;
		local3.anInt6716 = arg2;
		synchronized (this) {
			if (this.aClass234_8 == null) {
				this.aClass234_8 = this.aClass234_9 = local3;
			} else {
				this.aClass234_8.aClass234_5 = local3;
				this.aClass234_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	public boolean method8229(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Component;II[ILjava/awt/Point;I)Lclient!nga;")
	public Class234 method8230(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Point arg4) {
		return this.method8227(arg2, new Object[] { arg0, arg3, arg4 }, 17, arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!nga;")
	public Class234 method8231(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method8227(0, arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!nga;")
	public Class234 method8232(@OriginalArg(0) String arg0) {
		return this.method8227(0, arg0, 16, 0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!nga;")
	public Class234 method8233() {
		return this.method8227(0, null, 5, 0);
	}
}
