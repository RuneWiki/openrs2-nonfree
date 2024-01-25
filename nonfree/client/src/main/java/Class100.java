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

@OriginalClass("client!fc")
public final class Class100 implements Runnable {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!dq;")
	public Class79 aClass79_1 = null;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!dq;")
	public Class79 aClass79_2 = null;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Lclient!eha;")
	private Class91 aClass91_4 = null;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!dq;")
	public Class79 aClass79_3 = null;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!eha;")
	private Class91 aClass91_5 = null;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "[Lclient!dq;")
	public Class79[] aClass79Array1;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!lea;")
	private Class209 aClass209_1;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject4;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!qq;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static144.aString28 = arg1;
		Static144.anInt2486 = arg0;
		this.aBoolean194 = arg3;
		Static144.aString32 = "Unknown";
		Static144.aString34 = "1.1";
		try {
			Static144.aString32 = System.getProperty("java.vendor");
			Static144.aString34 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static144.aString32.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean192 = true;
		}
		try {
			Static144.aString27 = System.getProperty("os.name");
		} catch (@Pc(58) Exception local58) {
			Static144.aString27 = "Unknown";
		}
		Static144.aString33 = Static144.aString27.toLowerCase();
		try {
			Static144.aString29 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(69) Exception local69) {
			Static144.aString29 = "";
		}
		try {
			Static144.aString30 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
			Static144.aString30 = "";
		}
		try {
			Static144.aString31 = System.getProperty("user.home");
			if (Static144.aString31 != null) {
				Static144.aString31 = Static144.aString31 + "/";
			}
		} catch (@Pc(95) Exception local95) {
		}
		if (Static144.aString31 == null) {
			Static144.aString31 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(105) Throwable local105) {
		}
		if (!this.aBoolean192) {
			try {
				Static144.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(121) Exception local121) {
			}
			try {
				Static144.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(134) Exception local134) {
			}
		}
		Static175.method2694(Static144.anInt2486, Static144.aString28);
		if (this.aBoolean194) {
			this.aClass79_3 = new Class79(Static175.method2695("random.dat", Static144.anInt2486, null), "rw", 25L);
			this.aClass79_2 = new Class79(Static175.method2693("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass79_1 = new Class79(Static175.method2693("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass79Array1 = new Class79[arg2];
			for (@Pc(180) int local180 = 0; local180 < arg2; local180++) {
				this.aClass79Array1[local180] = new Class79(Static175.method2693("main_file_cache.idx" + local180), "rw", 1048576L);
			}
			if (this.aBoolean192) {
				try {
					this.anObject6 = Class.forName("Class143").getDeclaredConstructor().newInstance();
				} catch (@Pc(213) Throwable local213) {
				}
			}
			try {
				if (this.aBoolean192) {
					this.aClass209_1 = new Class209();
				} else {
					this.anObject4 = Class.forName("Class101").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(230) Throwable local230) {
			}
			try {
				if (this.aBoolean192) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject5 = Class.forName("Class36").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(246) Throwable local246) {
			}
		}
		if (this.aBoolean194 && !this.aBoolean192) {
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
		this.aBoolean193 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;IZ)Lclient!eha;")
	public Class91 method2082(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method2087(0, arg0, arg1, arg2 ? 22 : 1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public void method2083() {
		Static144.aLong72 = Static95.method1587() + 5000L;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)Lclient!eha;")
	public Class91 method2084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method2087(arg2 << 16, null, (arg1 << 16) + arg0, 6);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZLjava/lang/String;)Lclient!eha;")
	public Class91 method2085(@OriginalArg(2) String arg0) {
		return this.method2087(0, arg0, 0, 12);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Lclient!eha;")
	public Class91 method2086(@OriginalArg(1) int arg0) {
		return this.method2087(0, null, arg0, 3);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!eha;")
	private Class91 method2087(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class91 local3 = new Class91();
		local3.anObject1 = arg1;
		local3.anInt2272 = arg0;
		local3.anInt2273 = arg2;
		local3.anInt2274 = arg3;
		synchronized (this) {
			if (this.aClass91_4 == null) {
				this.aClass91_4 = this.aClass91_5 = local3;
			} else {
				this.aClass91_4.aClass91_3 = local3;
				this.aClass91_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!eha;")
	public Class91 method2088(@OriginalArg(1) URL arg0) {
		return this.method2087(0, arg0, 0, 4);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	public void method2089() {
		synchronized (this) {
			this.aBoolean193 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass79_2 != null) {
			try {
				this.aClass79_2.method1662();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass79_1 != null) {
			try {
				this.aClass79_1.method1662();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass79Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass79Array1.length; local44++) {
				if (this.aClass79Array1[local44] != null) {
					try {
						this.aClass79Array1[local44].method1662();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass79_3 != null) {
			try {
				this.aClass79_3.method1662();
			} catch (@Pc(74) IOException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class91 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean193) {
						return;
					}
					if (this.aClass91_5 != null) {
						local15 = this.aClass91_5;
						this.aClass91_5 = this.aClass91_5.aClass91_3;
						if (this.aClass91_5 == null) {
							this.aClass91_4 = null;
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
				@Pc(41) int local41 = local15.anInt2274;
				if (local41 == 1) {
					if (Static95.method1587() < Static144.aLong72) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt2273);
				} else if (local41 == 22) {
					if (Static144.aLong72 > Static95.method1587()) {
						throw new IOException();
					}
					try {
						local15.anObject2 = Static283.method4497(local15.anInt2273, (String) local15.anObject1).method5554();
					} catch (@Pc(835) IOException_Sub1 local835) {
						local15.anObject2 = local835.getMessage();
						throw local835;
					}
				} else if (local41 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local15.anObject1);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local15.anInt2273);
					local15.anObject2 = local59;
				} else if (local41 == 4) {
					if (Static144.aLong72 > Static95.method1587()) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(86) Object[] local86;
					if (local41 == 8) {
						local86 = (Object[]) local15.anObject1;
						if (this.aBoolean194 && ((Class) local86[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject2 = ((Class) local86[0]).getDeclaredMethod((String) local86[1], (Class[]) local86[2]);
					} else if (local41 == 9) {
						local86 = (Object[]) local15.anObject1;
						if (this.aBoolean194 && ((Class) local86[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject2 = ((Class) local86[0]).getDeclaredField((String) local86[1]);
					} else if (local41 == 18) {
						@Pc(128) Clipboard local128 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local128.getContents(null);
					} else if (local41 == 19) {
						@Pc(141) Transferable local141 = (Transferable) local15.anObject1;
						@Pc(144) Clipboard local144 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local144.setContents(local141, null);
					} else if (this.aBoolean194) {
						@Pc(435) String local435;
						if (local41 == 3) {
							if (Static144.aLong72 > Static95.method1587()) {
								throw new IOException();
							}
							local435 = (local15.anInt2273 >> 24 & 0xFF) + "." + (local15.anInt2273 >> 16 & 0xFF) + "." + (local15.anInt2273 >> 8 & 0xFF) + "." + (local15.anInt2273 & 0xFF);
							local15.anObject2 = InetAddress.getByName(local435).getHostName();
						} else if (local41 == 21) {
							if (Static95.method1587() < Static144.aLong72) {
								throw new IOException();
							}
							local15.anObject2 = InetAddress.getByName((String) local15.anObject1).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean192) {
								local15.anObject2 = this.aClass209_1.method4802();
							} else {
								local15.anObject2 = Class.forName("Class101").getMethod("listmodes").invoke(this.anObject4);
							}
						} else if (local41 == 6) {
							@Pc(196) Frame local196 = new Frame("Jagex Full Screen");
							local15.anObject2 = local196;
							local196.setResizable(false);
							if (this.aBoolean192) {
								this.aClass209_1.method4801(local15.anInt2272 >> 16, local15.anInt2272 & 0xFFFF, local15.anInt2273 >>> 16, local196, local15.anInt2273 & 0xFFFF);
							} else {
								Class.forName("Class101").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject4, local196, Integer.valueOf(local15.anInt2273 >>> 16), new Integer(local15.anInt2273 & 0xFFFF), Integer.valueOf(local15.anInt2272 >> 16), new Integer(local15.anInt2272 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(325) Class79 local325;
							if (local41 == 12) {
								local325 = Static144.method2096((String) local15.anObject1, Static144.anInt2486, Static144.aString28);
								local15.anObject2 = local325;
							} else if (local41 == 13) {
								local325 = Static144.method2096((String) local15.anObject1, Static144.anInt2486, "");
								local15.anObject2 = local325;
							} else if (this.aBoolean194 && local41 == 14) {
								@Pc(588) int local588 = local15.anInt2273;
								@Pc(591) int local591 = local15.anInt2272;
								if (this.aBoolean192) {
									this.aCallback_Sub1_1.method6885(local588, local591);
								} else {
									Class.forName("Class36").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject5, Integer.valueOf(local588), new Integer(local591));
								}
							} else if (this.aBoolean194 && local41 == 15) {
								@Pc(356) boolean local356 = local15.anInt2273 != 0;
								@Pc(360) Component local360 = (Component) local15.anObject1;
								if (this.aBoolean192) {
									this.aCallback_Sub1_1.method6884(local360, local356);
								} else {
									Class.forName("Class36").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject5, local360, Boolean.valueOf(local356));
								}
							} else if (!this.aBoolean192 && local41 == 17) {
								local86 = (Object[]) local15.anObject1;
								Class.forName("Class36").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject5, (Component) local86[0], (int[]) local86[1], Integer.valueOf(local15.anInt2273), new Integer(local15.anInt2272), (Point) local86[2]);
							} else if (local41 == 16) {
								try {
									if (!Static144.aString33.startsWith("win")) {
										throw new Exception();
									}
									local435 = (String) local15.anObject1;
									if (!local435.startsWith("http://") && !local435.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(449) String local449 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(451) int local451 = 0;
									while (true) {
										if (local435.length() <= local451) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local435 + "\"");
											local15.anObject2 = null;
											break;
										}
										if (local449.indexOf(local435.charAt(local451)) == -1) {
											throw new Exception();
										}
										local451++;
									}
								} catch (@Pc(485) Exception local485) {
									local15.anObject2 = local485;
									throw local485;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean192) {
							this.aClass209_1.method4803((Frame) local15.anObject1);
						} else {
							Class.forName("Class101").getMethod("exit").invoke(this.anObject4);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2271 = 1;
			} catch (@Pc(870) ThreadDeath local870) {
				throw local870;
			} catch (@Pc(873) Throwable local873) {
				local15.anInt2271 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Z")
	public boolean method2090() {
		if (!this.aBoolean194) {
			return false;
		} else if (this.aBoolean192) {
			return this.aClass209_1 != null;
		} else {
			return this.anObject4 != null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Lclient!eha;")
	public Class91 method2091() {
		return this.method2087(0, null, 0, 5);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	public boolean method2092(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!eha;")
	public Class91 method2093(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2087(0, new Object[] { arg0, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!eha;")
	public Class91 method2095(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2087(0, arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!eha;")
	public Class91 method2097(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method2087(0, new Object[] { arg1, arg2, arg0 }, 0, 8);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public Object method2098() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Point;I[IBILjava/awt/Component;)Lclient!eha;")
	public Class91 method2099(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method2087(arg1, new Object[] { arg4, arg2, arg0 }, arg3, 17);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!eha;")
	public Class91 method2100(@OriginalArg(0) Frame arg0) {
		return this.method2087(0, arg0, 0, 7);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;)Lclient!eha;")
	public Class91 method2101(@OriginalArg(1) String arg0) {
		return this.method2087(0, arg0, 0, 16);
	}
}
