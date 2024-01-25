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

@OriginalClass("client!laa")
public final class Class198 implements Runnable {

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "Z")
	public boolean aBoolean402 = false;

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "Lclient!pk;")
	public Class268 aClass268_2 = null;

	@OriginalMember(owner = "client!laa", name = "o", descriptor = "Lclient!kl;")
	private Class191 aClass191_9 = null;

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "Lclient!pk;")
	public Class268 aClass268_1 = null;

	@OriginalMember(owner = "client!laa", name = "t", descriptor = "Lclient!kl;")
	private Class191 aClass191_10 = null;

	@OriginalMember(owner = "client!laa", name = "s", descriptor = "Lclient!pk;")
	public Class268 aClass268_3 = null;

	@OriginalMember(owner = "client!laa", name = "B", descriptor = "Z")
	private boolean aBoolean403 = false;

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "[Lclient!pk;")
	public Class268[] aClass268Array1;

	@OriginalMember(owner = "client!laa", name = "C", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "Ljava/lang/Object;")
	private Object anObject12;

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "Lclient!uj;")
	private Class334 aClass334_1;

	@OriginalMember(owner = "client!laa", name = "v", descriptor = "Lclient!qca;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!laa", name = "y", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!laa", name = "u", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class198(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static285.aString62 = "Unknown";
		Static285.aString60 = arg1;
		this.aBoolean401 = arg3;
		Static285.aString64 = "1.1";
		Static285.anInt5221 = arg0;
		try {
			Static285.aString62 = System.getProperty("java.vendor");
			Static285.aString64 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static285.aString62.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean402 = true;
		}
		try {
			Static285.aString58 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static285.aString58 = "Unknown";
		}
		Static285.aString59 = Static285.aString58.toLowerCase();
		try {
			Static285.aString57 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static285.aString57 = "";
		}
		try {
			Static285.aString63 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static285.aString63 = "";
		}
		try {
			Static285.aString61 = System.getProperty("user.home");
			if (Static285.aString61 != null) {
				Static285.aString61 = Static285.aString61 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static285.aString61 == null) {
			Static285.aString61 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean402) {
			try {
				Static285.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static285.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static212.method3211(Static285.aString60, Static285.anInt5221);
		if (this.aBoolean401) {
			this.aClass268_1 = new Class268(Static212.method3210(Static285.anInt5221, null, "random.dat"), "rw", 25L);
			this.aClass268_3 = new Class268(Static212.method3209("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass268_2 = new Class268(Static212.method3209("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass268Array1 = new Class268[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass268Array1[local180] = new Class268(Static212.method3209("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean402) {
				try {
					this.anObject14 = Class.forName("Class218").getDeclaredConstructor().newInstance();
				} catch (@Pc(213) Throwable local213) {
				}
			}
			try {
				if (this.aBoolean402) {
					this.aClass334_1 = new Class334();
				} else {
					this.anObject12 = Class.forName("Class161").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(230) Throwable local230) {
			}
			try {
				if (this.aBoolean402) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject13 = Class.forName("Class135").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(246) Throwable local246) {
			}
		}
		if (this.aBoolean401 && !this.aBoolean402) {
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
		this.aBoolean403 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!kl;")
	public Class191 method4285(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method4293(0, arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)Z")
	public boolean method4286() {
		if (!this.aBoolean401) {
			return false;
		} else if (this.aBoolean402) {
			return this.aClass334_1 != null;
		} else {
			return this.anObject12 != null;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIII)Lclient!kl;")
	public Class191 method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return this.method4293(arg0 << 16, arg1 + (arg2 << 16), null, 6);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZLjava/lang/String;II)Lclient!kl;")
	public Class191 method4289(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return this.method4293(0, arg2, arg1, arg0 ? 22 : 1);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!kl;")
	public Class191 method4290(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method4293(0, 0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!laa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class191 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean403) {
						return;
					}
					if (this.aClass191_9 != null) {
						local15 = this.aClass191_9;
						this.aClass191_9 = this.aClass191_9.aClass191_6;
						if (this.aClass191_9 == null) {
							this.aClass191_10 = null;
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
				@Pc(41) int local41 = local15.anInt5013;
				if (local41 == 1) {
					if (Static285.aLong129 > Static480.method6650()) {
						throw new IOException();
					}
					local15.anObject11 = new Socket(InetAddress.getByName((String) local15.anObject10), local15.anInt5011);
				} else if (local41 == 22) {
					if (Static285.aLong129 > Static480.method6650()) {
						throw new IOException();
					}
					try {
						local15.anObject11 = Static128.method2267((String) local15.anObject10, local15.anInt5011).method1506();
					} catch (@Pc(832) IOException_Sub1 local832) {
						local15.anObject11 = local832.getMessage();
						throw local832;
					}
				} else if (local41 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local15.anObject10);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local15.anInt5011);
					local15.anObject11 = local59;
				} else if (local41 == 4) {
					if (Static480.method6650() < Static285.aLong129) {
						throw new IOException();
					}
					local15.anObject11 = new DataInputStream(((URL) local15.anObject10).openStream());
				} else {
					@Pc(371) Object[] local371;
					if (local41 == 8) {
						local371 = (Object[]) local15.anObject10;
						if (this.aBoolean401 && ((Class) local371[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject11 = ((Class) local371[0]).getDeclaredMethod((String) local371[1], (Class[]) local371[2]);
					} else if (local41 == 9) {
						local371 = (Object[]) local15.anObject10;
						if (this.aBoolean401 && ((Class) local371[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject11 = ((Class) local371[0]).getDeclaredField((String) local371[1]);
					} else if (local41 == 18) {
						@Pc(89) Clipboard local89 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject11 = local89.getContents(null);
					} else if (local41 == 19) {
						@Pc(104) Transferable local104 = (Transferable) local15.anObject10;
						@Pc(107) Clipboard local107 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local107.setContents(local104, null);
					} else if (this.aBoolean401) {
						@Pc(482) String local482;
						if (local41 == 3) {
							if (Static480.method6650() < Static285.aLong129) {
								throw new IOException();
							}
							local482 = (local15.anInt5011 >> 24 & 0xFF) + "." + (local15.anInt5011 >> 16 & 0xFF) + "." + (local15.anInt5011 >> 8 & 0xFF) + "." + (local15.anInt5011 & 0xFF);
							local15.anObject11 = InetAddress.getByName(local482).getHostName();
						} else if (local41 == 21) {
							if (Static480.method6650() < Static285.aLong129) {
								throw new IOException();
							}
							local15.anObject11 = InetAddress.getByName((String) local15.anObject10).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean402) {
								local15.anObject11 = this.aClass334_1.method7291();
							} else {
								local15.anObject11 = Class.forName("Class161").getMethod("listmodes").invoke(this.anObject12);
							}
						} else if (local41 == 6) {
							@Pc(181) Frame local181 = new Frame("Jagex Full Screen");
							local15.anObject11 = local181;
							local181.setResizable(false);
							if (this.aBoolean402) {
								this.aClass334_1.method7290(local15.anInt5011 >>> 16, local181, local15.anInt5011 & 0xFFFF, local15.anInt5012 >> 16, local15.anInt5012 & 0xFFFF);
							} else {
								Class.forName("Class161").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject12, local181, Integer.valueOf(local15.anInt5011 >>> 16), new Integer(local15.anInt5011 & 0xFFFF), Integer.valueOf(local15.anInt5012 >> 16), new Integer(local15.anInt5012 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(339) Class268 local339;
							if (local41 == 12) {
								local339 = Static285.method4288(Static285.aString60, (String) local15.anObject10, Static285.anInt5221);
								local15.anObject11 = local339;
							} else if (local41 == 13) {
								local339 = Static285.method4288("", (String) local15.anObject10, Static285.anInt5221);
								local15.anObject11 = local339;
							} else if (this.aBoolean401 && local41 == 14) {
								@Pc(608) int local608 = local15.anInt5011;
								@Pc(611) int local611 = local15.anInt5012;
								if (this.aBoolean402) {
									this.aCallback_Sub1_1.method5954(local608, local611);
								} else {
									Class.forName("Class135").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject13, Integer.valueOf(local608), new Integer(local611));
								}
							} else if (this.aBoolean401 && local41 == 15) {
								@Pc(552) boolean local552 = local15.anInt5011 != 0;
								@Pc(556) Component local556 = (Component) local15.anObject10;
								if (this.aBoolean402) {
									this.aCallback_Sub1_1.method5953(local556, local552);
								} else {
									Class.forName("Class135").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject13, local556, Boolean.valueOf(local552));
								}
							} else if (!this.aBoolean402 && local41 == 17) {
								local371 = (Object[]) local15.anObject10;
								Class.forName("Class135").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject13, (Component) local371[0], (int[]) local371[1], Integer.valueOf(local15.anInt5011), new Integer(local15.anInt5012), (Point) local371[2]);
							} else if (local41 == 16) {
								try {
									if (!Static285.aString59.startsWith("win")) {
										throw new Exception();
									}
									local482 = (String) local15.anObject10;
									if (!local482.startsWith("http://") && !local482.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(496) String local496 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(498) int local498 = 0;
									while (true) {
										if (local498 >= local482.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local482 + "\"");
											local15.anObject11 = null;
											break;
										}
										if (local496.indexOf(local482.charAt(local498)) == -1) {
											throw new Exception();
										}
										local498++;
									}
								} catch (@Pc(537) Exception local537) {
									local15.anObject11 = local537;
									throw local537;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean402) {
							this.aClass334_1.method7289((Frame) local15.anObject10);
						} else {
							Class.forName("Class161").getMethod("exit").invoke(this.anObject12);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5014 = 1;
			} catch (@Pc(863) ThreadDeath local863) {
				throw local863;
			} catch (@Pc(866) Throwable local866) {
				local15.anInt5014 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZBLjava/lang/String;)Lclient!kl;")
	public Class191 method4291(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		return arg0 ? this.method4293(0, 0, arg1, 12) : this.method4293(0, 0, arg1, 13);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)Lclient!kl;")
	public Class191 method4292(@OriginalArg(1) int arg0) {
		return this.method4293(0, arg0, null, 3);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!kl;")
	private Class191 method4293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class191 local8 = new Class191();
		local8.anInt5012 = arg0;
		local8.anObject10 = arg2;
		local8.anInt5011 = arg1;
		local8.anInt5013 = arg3;
		synchronized (this) {
			if (this.aClass191_10 == null) {
				this.aClass191_10 = this.aClass191_9 = local8;
			} else {
				this.aClass191_10.aClass191_6 = local8;
				this.aClass191_10 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/io/File;B[B)Z")
	public boolean method4294(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(15) FileOutputStream local15 = new FileOutputStream(arg0);
			local15.write(arg1, 0, arg1.length);
			local15.close();
			return true;
		} catch (@Pc(26) IOException local26) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
	public void method4295() {
		synchronized (this) {
			this.aBoolean403 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass268_3 != null) {
			try {
				this.aClass268_3.method5816();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass268_2 != null) {
			try {
				this.aClass268_2.method5816();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass268Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass268Array1.length; local55++) {
				if (this.aClass268Array1[local55] != null) {
					try {
						this.aClass268Array1[local55].method5816();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass268_1 != null) {
			try {
				this.aClass268_1.method5816();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!kl;")
	public Class191 method4296(@OriginalArg(0) Frame arg0) {
		return this.method4293(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method4297() {
		return this.anObject14;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!kl;")
	public Class191 method4298(@OriginalArg(0) String arg0) {
		return this.method4293(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
	public void method4299() {
		Static285.aLong129 = Static480.method6650() + 5000L;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!kl;")
	public Class191 method4300(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method4293(0, 0, new Object[] { arg2, arg0, arg1 }, 8);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/awt/Component;IILjava/awt/Point;[I)Lclient!kl;")
	public Class191 method4301(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int[] arg4) {
		return this.method4293(arg0, arg2, new Object[] { arg1, arg4, arg3 }, 17);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)Lclient!kl;")
	public Class191 method4302() {
		return this.method4293(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!kl;")
	public Class191 method4303(@OriginalArg(0) URL arg0) {
		return this.method4293(0, 0, arg0, 4);
	}
}
