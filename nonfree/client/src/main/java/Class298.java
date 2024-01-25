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

@OriginalClass("client!rp")
public final class Class298 implements Runnable {

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "Lclient!ac;")
	public Class4 aClass4_2 = null;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "Lclient!ac;")
	public Class4 aClass4_1 = null;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "Lclient!jg;")
	private Class174 aClass174_7 = null;

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "Z")
	public boolean aBoolean612 = false;

	@OriginalMember(owner = "client!rp", name = "y", descriptor = "Z")
	public boolean aBoolean613 = false;

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "Lclient!ac;")
	public Class4 aClass4_3 = null;

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "Lclient!jg;")
	private Class174 aClass174_8 = null;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "[Lclient!ac;")
	public Class4[] aClass4Array1;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!rp", name = "s", descriptor = "Lclient!nb;")
	private Class231 aClass231_1;

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "Ljava/lang/Object;")
	private Object anObject21;

	@OriginalMember(owner = "client!rp", name = "x", descriptor = "Lclient!sda;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class298(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static501.aString73 = "Unknown";
		Static501.aString76 = arg1;
		Static501.aString79 = "1.1";
		Static501.anInt8437 = arg0;
		this.aBoolean613 = arg3;
		try {
			Static501.aString73 = System.getProperty("java.vendor");
			Static501.aString79 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static501.aString73.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean612 = true;
		}
		try {
			Static501.aString74 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static501.aString74 = "Unknown";
		}
		Static501.aString78 = Static501.aString74.toLowerCase();
		try {
			Static501.aString75 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static501.aString75 = "";
		}
		try {
			Static501.aString77 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static501.aString77 = "";
		}
		try {
			Static501.aString80 = System.getProperty("user.home");
			if (Static501.aString80 != null) {
				Static501.aString80 = Static501.aString80 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static501.aString80 == null) {
			Static501.aString80 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean612) {
			try {
				Static501.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static501.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static404.method6305(Static501.anInt8437, Static501.aString76);
		if (this.aBoolean613) {
			this.aClass4_3 = new Class4(Static404.method6306((String) null, Static501.anInt8437, "random.dat"), "rw", 25L);
			this.aClass4_2 = new Class4(Static404.method6307("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass4_1 = new Class4(Static404.method6307("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass4Array1 = new Class4[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass4Array1[local180] = new Class4(Static404.method6307("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean612) {
				try {
					this.anObject19 = Class.forName("Class195").getDeclaredConstructor().newInstance();
				} catch (@Pc(213) Throwable local213) {
				}
			}
			try {
				if (this.aBoolean612) {
					this.aClass231_1 = new Class231();
				} else {
					this.anObject20 = Class.forName("Class242").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(230) Throwable local230) {
			}
			try {
				if (this.aBoolean612) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject21 = Class.forName("Class205").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(246) Throwable local246) {
			}
		}
		if (this.aBoolean613 && !this.aBoolean612) {
			@Pc(256) ThreadGroup local256 = Thread.currentThread().getThreadGroup();
			for (@Pc(259) ThreadGroup local259 = local256.getParent(); local259 != null; local259 = local259.getParent()) {
				local256 = local259;
			}
			@Pc(270) Thread[] local270 = new Thread[1000];
			local256.enumerate(local270);
			for (@Pc(276) int local276 = 0; local276 < local270.length; local276++) {
				if (local270[local276] != null && local270[local276].getName().startsWith("AWT")) {
					local270[local276].setPriority(1);
				}
			}
		}
		this.aBoolean611 = false;
		this.aThread7 = new Thread(this);
		this.aThread7.setPriority(10);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Z")
	public boolean method7271() {
		if (!this.aBoolean613) {
			return false;
		} else if (this.aBoolean612) {
			return this.aClass231_1 != null;
		} else {
			return this.anObject20 != null;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Lclient!jg;")
	public Class174 method7273(@OriginalArg(1) int arg0) {
		return this.method7288(0, 3, (Object) null, arg0);
	}

	@OriginalMember(owner = "client!rp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class174 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean611) {
						return;
					}
					if (this.aClass174_7 != null) {
						local15 = this.aClass174_7;
						this.aClass174_7 = this.aClass174_7.aClass174_6;
						if (this.aClass174_7 == null) {
							this.aClass174_8 = null;
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
				@Pc(41) int local41 = local15.anInt5123;
				if (local41 == 1) {
					if (Static501.aLong221 > Static191.method3071()) {
						throw new IOException();
					}
					local15.anObject12 = new Socket(InetAddress.getByName((String) local15.anObject11), local15.anInt5124);
				} else if (local41 == 22) {
					if (Static501.aLong221 > Static191.method3071()) {
						throw new IOException();
					}
					try {
						local15.anObject12 = Static86.method7761((String) local15.anObject11, local15.anInt5124).method8270();
					} catch (@Pc(75) IOException_Sub1 local75) {
						local15.anObject12 = local75.getMessage();
						throw local75;
					}
				} else if (local41 == 2) {
					@Pc(826) Thread local826 = new Thread((Runnable) local15.anObject11);
					local826.setDaemon(true);
					local826.start();
					local826.setPriority(local15.anInt5124);
					local15.anObject12 = local826;
				} else if (local41 == 4) {
					if (Static501.aLong221 > Static191.method3071()) {
						throw new IOException();
					}
					local15.anObject12 = new DataInputStream(((URL) local15.anObject11).openStream());
				} else {
					@Pc(115) Object[] local115;
					if (local41 == 8) {
						local115 = (Object[]) local15.anObject11;
						if (this.aBoolean613 && ((Class) local115[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject12 = ((Class) local115[0]).getDeclaredMethod((String) local115[1], (Class[]) local115[2]);
					} else if (local41 == 9) {
						local115 = (Object[]) local15.anObject11;
						if (this.aBoolean613 && ((Class) local115[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject12 = ((Class) local115[0]).getDeclaredField((String) local115[1]);
					} else if (local41 == 18) {
						@Pc(184) Clipboard local184 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject12 = local184.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(811) Transferable local811 = (Transferable) local15.anObject11;
						@Pc(814) Clipboard local814 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local814.setContents(local811, (ClipboardOwner) null);
					} else if (this.aBoolean613) {
						@Pc(397) String local397;
						if (local41 == 3) {
							if (Static191.method3071() < Static501.aLong221) {
								throw new IOException();
							}
							local397 = (local15.anInt5124 >> 24 & 0xFF) + "." + (local15.anInt5124 >> 16 & 0xFF) + "." + (local15.anInt5124 >> 8 & 0xFF) + "." + (local15.anInt5124 & 0xFF);
							local15.anObject12 = InetAddress.getByName(local397).getHostName();
						} else if (local41 == 21) {
							if (Static191.method3071() < Static501.aLong221) {
								throw new IOException();
							}
							local15.anObject12 = InetAddress.getByName((String) local15.anObject11).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean612) {
								local15.anObject12 = this.aClass231_1.method5850();
							} else {
								local15.anObject12 = Class.forName("Class242").getMethod("listmodes").invoke(this.anObject20);
							}
						} else if (local41 == 6) {
							@Pc(619) Frame local619 = new Frame("Jagex Full Screen");
							local15.anObject12 = local619;
							local619.setResizable(false);
							if (this.aBoolean612) {
								this.aClass231_1.method5851(local619, local15.anInt5122 & 0xFFFF, local15.anInt5124 >>> 16, local15.anInt5124 & 0xFFFF, local15.anInt5122 >> 16);
							} else {
								Class.forName("Class242").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject20, local619, Integer.valueOf(local15.anInt5124 >>> 16), new Integer(local15.anInt5124 & 0xFFFF), Integer.valueOf(local15.anInt5122 >> 16), new Integer(local15.anInt5122 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(283) Class4 local283;
							if (local41 == 12) {
								local283 = Static501.method7274(Static501.anInt8437, (String) local15.anObject11, Static501.aString76);
								local15.anObject12 = local283;
							} else if (local41 == 13) {
								local283 = Static501.method7274(Static501.anInt8437, (String) local15.anObject11, "");
								local15.anObject12 = local283;
							} else if (this.aBoolean613 && local41 == 14) {
								@Pc(554) int local554 = local15.anInt5124;
								@Pc(557) int local557 = local15.anInt5122;
								if (this.aBoolean612) {
									this.aCallback_Sub1_1.method7437(local557, local554);
								} else {
									Class.forName("Class205").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject21, Integer.valueOf(local554), new Integer(local557));
								}
							} else if (this.aBoolean613 && local41 == 15) {
								@Pc(316) boolean local316 = local15.anInt5124 != 0;
								@Pc(320) Component local320 = (Component) local15.anObject11;
								if (this.aBoolean612) {
									this.aCallback_Sub1_1.method7438(local320, local316);
								} else {
									Class.forName("Class205").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject21, local320, Boolean.valueOf(local316));
								}
							} else if (!this.aBoolean612 && local41 == 17) {
								local115 = (Object[]) local15.anObject11;
								Class.forName("Class205").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject21, (Component) local115[0], (int[]) local115[1], Integer.valueOf(local15.anInt5124), new Integer(local15.anInt5122), (Point) local115[2]);
							} else if (local41 == 16) {
								try {
									if (!Static501.aString78.startsWith("win")) {
										throw new Exception();
									}
									local397 = (String) local15.anObject11;
									if (!local397.startsWith("http://") && !local397.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(411) String local411 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(413) int local413 = 0;
									while (true) {
										if (local413 >= local397.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local397 + "\"");
											local15.anObject12 = null;
											break;
										}
										if (local411.indexOf(local397.charAt(local413)) == -1) {
											throw new Exception();
										}
										local413++;
									}
								} catch (@Pc(451) Exception local451) {
									local15.anObject12 = local451;
									throw local451;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean612) {
							this.aClass231_1.method5852((Frame) local15.anObject11);
						} else {
							Class.forName("Class242").getMethod("exit").invoke(this.anObject20);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5121 = 1;
			} catch (@Pc(864) ThreadDeath local864) {
				throw local864;
			} catch (@Pc(867) Throwable local867) {
				local15.anInt5121 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!jg;")
	public Class174 method7275(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method7288(0, 9, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!jg;")
	public Class174 method7276(@OriginalArg(0) URL arg0) {
		return this.method7288(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public void method7277() {
		synchronized (this) {
			this.aBoolean611 = true;
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass4_2 != null) {
			try {
				this.aClass4_2.method84();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass4_1 != null) {
			try {
				this.aClass4_1.method84();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass4Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass4Array1.length; local53++) {
				if (this.aClass4Array1[local53] != null) {
					try {
						this.aClass4Array1[local53].method84();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass4_3 != null) {
			try {
				this.aClass4_3.method84();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method7278() {
		return this.anObject19;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;BIZ)Lclient!jg;")
	public Class174 method7279(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method7288(0, arg2 ? 22 : 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)Lclient!jg;")
	public Class174 method7280() {
		return this.method7288(0, 5, (Object) null, 0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Lclient!jg;")
	public Class174 method7281(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2) {
		return this.method7288(0, 8, new Object[] { arg2, arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	public boolean method7282(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Ljava/lang/String;B)Lclient!jg;")
	public Class174 method7283(@OriginalArg(0) String arg0) {
		return this.method7288(0, 16, arg0, 0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/awt/Point;I[IILjava/awt/Component;I)Lclient!jg;")
	public Class174 method7284(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4) {
		return this.method7288(arg1, 17, new Object[] { arg4, arg2, arg0 }, arg3);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
	public void method7285() {
		Static501.aLong221 = Static191.method3071() + 5000L;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)Lclient!jg;")
	public Class174 method7286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method7288(arg0 << 16, 6, (Object) null, (arg2 << 16) + arg1);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!jg;")
	public Class174 method7287(@OriginalArg(1) Frame arg0) {
		return this.method7288(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZIILjava/lang/Object;I)Lclient!jg;")
	private Class174 method7288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class174 local3 = new Class174();
		local3.anInt5122 = arg0;
		local3.anInt5123 = arg1;
		local3.anInt5124 = arg3;
		local3.anObject11 = arg2;
		synchronized (this) {
			if (this.aClass174_8 == null) {
				this.aClass174_8 = this.aClass174_7 = local3;
			} else {
				this.aClass174_8.aClass174_6 = local3;
				this.aClass174_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lclient!jg;")
	public Class174 method7289(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method7288(0, 2, arg1, arg0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;ZB)Lclient!jg;")
	public Class174 method7290(@OriginalArg(0) String arg0) {
		return this.method7288(0, 12, arg0, 0);
	}
}
