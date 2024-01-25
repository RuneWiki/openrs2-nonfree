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

@OriginalClass("client!pe")
public final class Class246 implements Runnable {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!ip;")
	public Class155 aClass155_1 = null;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!sba;")
	private Class280 aClass280_5 = null;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!ip;")
	public Class155 aClass155_3 = null;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "Lclient!sba;")
	private Class280 aClass280_6 = null;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
	private boolean aBoolean533 = false;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!ip;")
	public Class155 aClass155_2 = null;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
	public boolean aBoolean534 = false;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "Z")
	public boolean aBoolean535 = false;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "[Lclient!ip;")
	public Class155[] aClass155Array1;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Lclient!eg;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Ljava/lang/Object;")
	private Object anObject12;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!rg;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		this.aBoolean534 = arg3;
		Static389.anInt7292 = arg0;
		Static389.aString90 = arg1;
		Static389.aString91 = "1.1";
		Static389.aString92 = "Unknown";
		try {
			Static389.aString92 = System.getProperty("java.vendor");
			Static389.aString91 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static389.aString92.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean535 = true;
		}
		try {
			Static389.aString87 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static389.aString87 = "Unknown";
		}
		Static389.aString89 = Static389.aString87.toLowerCase();
		try {
			Static389.aString88 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static389.aString88 = "";
		}
		try {
			System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
		}
		try {
			Static389.aString86 = System.getProperty("user.home");
			if (Static389.aString86 != null) {
				Static389.aString86 = Static389.aString86 + "/";
			}
		} catch (@Pc(94) Exception local94) {
		}
		if (Static389.aString86 == null) {
			Static389.aString86 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(104) Throwable local104) {
		}
		if (!this.aBoolean535) {
			try {
				Static389.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(120) Exception local120) {
			}
			try {
				Static389.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(133) Exception local133) {
			}
		}
		Static563.method7981(Static389.aString90, Static389.anInt7292);
		if (this.aBoolean534) {
			this.aClass155_3 = new Class155(Static563.method7983("random.dat", null, Static389.anInt7292), "rw", 25L);
			this.aClass155_1 = new Class155(Static563.method7982("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass155_2 = new Class155(Static563.method7982("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass155Array1 = new Class155[arg2];
			for (@Pc(179) int local179 = 0; local179 < arg2; local179++) {
				this.aClass155Array1[local179] = new Class155(Static563.method7982("main_file_cache.idx" + local179), "rw", 1048576L);
			}
			if (this.aBoolean535) {
				try {
					this.anObject11 = Class.forName("Class291").getDeclaredConstructor().newInstance();
				} catch (@Pc(216) Throwable local216) {
				}
			}
			try {
				if (this.aBoolean535) {
					this.aClass86_1 = new Class86();
				} else {
					this.anObject13 = Class.forName("Class109").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(233) Throwable local233) {
			}
			try {
				if (this.aBoolean535) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject12 = Class.forName("Class103").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(249) Throwable local249) {
			}
		}
		if (this.aBoolean534 && !this.aBoolean535) {
			@Pc(259) ThreadGroup local259 = Thread.currentThread().getThreadGroup();
			for (@Pc(262) ThreadGroup local262 = local259.getParent(); local262 != null; local262 = local262.getParent()) {
				local259 = local262;
			}
			@Pc(273) Thread[] local273 = new Thread[1000];
			local259.enumerate(local273);
			for (@Pc(279) int local279 = 0; local279 < local273.length; local279++) {
				if (local273[local279] != null && local273[local279].getName().startsWith("AWT")) {
					local273[local279].setPriority(1);
				}
			}
		}
		this.aBoolean533 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BLjava/io/File;I)Z")
	public boolean method6128(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!sba;")
	public Class280 method6129(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method6141(0, 0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!sba;")
	public Class280 method6130(@OriginalArg(1) Frame arg0) {
		return this.method6141(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)Lclient!sba;")
	public Class280 method6131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method6141(arg2 << 16, (arg0 << 16) + arg1, null, 6);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB[ILjava/awt/Component;Ljava/awt/Point;I)Lclient!sba;")
	public Class280 method6132(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int arg4) {
		return this.method6141(arg0, arg4, new Object[] { arg2, arg1, arg3 }, 17);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!sba;")
	public Class280 method6134(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method6141(0, arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Z")
	public boolean method6135() {
		if (!this.aBoolean534) {
			return false;
		} else if (this.aBoolean535) {
			return this.aClass86_1 != null;
		} else {
			return this.anObject13 != null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;ZI)Lclient!sba;")
	public Class280 method6136(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method6141(0, 0, arg0, 12) : this.method6141(0, 0, arg0, 13);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method6138() {
		return this.anObject11;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public void method6139() {
		Static389.aLong163 = Static174.method3502() + (long) 5000;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lclient!sba;")
	public Class280 method6140(@OriginalArg(0) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method6141(0, 0, new Object[] { arg2, arg1, arg0 }, 8);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILjava/lang/Object;BI)Lclient!sba;")
	private Class280 method6141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class280 local3 = new Class280();
		local3.anInt8465 = arg3;
		local3.anInt8464 = arg0;
		local3.anInt8466 = arg1;
		local3.anObject15 = arg2;
		synchronized (this) {
			if (this.aClass280_5 == null) {
				this.aClass280_5 = this.aClass280_6 = local3;
			} else {
				this.aClass280_5.aClass280_7 = local3;
				this.aClass280_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class280 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean533) {
						return;
					}
					if (this.aClass280_6 != null) {
						local15 = this.aClass280_6;
						this.aClass280_6 = this.aClass280_6.aClass280_7;
						if (this.aClass280_6 == null) {
							this.aClass280_5 = null;
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
				@Pc(41) int local41 = local15.anInt8465;
				if (local41 == 1) {
					if (Static174.method3502() < Static389.aLong163) {
						throw new IOException();
					}
					local15.anObject16 = new Socket(InetAddress.getByName((String) local15.anObject15), local15.anInt8466);
				} else if (local41 == 22) {
					if (Static389.aLong163 > Static174.method3502()) {
						throw new IOException();
					}
					local15.anObject16 = Static56.method7844(local15.anInt8466, (String) local15.anObject15).method5751();
				} else if (local41 == 2) {
					@Pc(817) Thread local817 = new Thread((Runnable) local15.anObject15);
					local817.setDaemon(true);
					local817.start();
					local817.setPriority(local15.anInt8466);
					local15.anObject16 = local817;
				} else if (local41 == 4) {
					if (Static174.method3502() < Static389.aLong163) {
						throw new IOException();
					}
					local15.anObject16 = new DataInputStream(((URL) local15.anObject15).openStream());
				} else {
					@Pc(108) Object[] local108;
					if (local41 == 8) {
						local108 = (Object[]) local15.anObject15;
						if (this.aBoolean534 && ((Class) local108[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local108[0]).getDeclaredMethod((String) local108[1], (Class[]) local108[2]);
					} else if (local41 == 9) {
						local108 = (Object[]) local15.anObject15;
						if (this.aBoolean534 && ((Class) local108[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local108[0]).getDeclaredField((String) local108[1]);
					} else if (local41 == 18) {
						@Pc(179) Clipboard local179 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject16 = local179.getContents(null);
					} else if (local41 == 19) {
						@Pc(192) Transferable local192 = (Transferable) local15.anObject15;
						@Pc(195) Clipboard local195 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local195.setContents(local192, null);
					} else if (this.aBoolean534) {
						@Pc(458) String local458;
						if (local41 == 3) {
							if (Static174.method3502() < Static389.aLong163) {
								throw new IOException();
							}
							local458 = (local15.anInt8466 >> 24 & 0xFF) + "." + (local15.anInt8466 >> 16 & 0xFF) + "." + (local15.anInt8466 >> 8 & 0xFF) + "." + (local15.anInt8466 & 0xFF);
							local15.anObject16 = InetAddress.getByName(local458).getHostName();
						} else if (local41 == 21) {
							if (Static389.aLong163 > Static174.method3502()) {
								throw new IOException();
							}
							local15.anObject16 = InetAddress.getByName((String) local15.anObject15).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean535) {
								local15.anObject16 = this.aClass86_1.method2340();
							} else {
								local15.anObject16 = Class.forName("Class109").getMethod("listmodes").invoke(this.anObject13);
							}
						} else if (local41 == 6) {
							@Pc(271) Frame local271 = new Frame("Jagex Full Screen");
							local15.anObject16 = local271;
							local271.setResizable(false);
							if (this.aBoolean535) {
								this.aClass86_1.method2341(local15.anInt8466 >>> 16, local15.anInt8464 & 0xFFFF, local271, local15.anInt8466 & 0xFFFF, local15.anInt8464 >> 16);
							} else {
								Class.forName("Class109").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject13, local271, Integer.valueOf(local15.anInt8466 >>> 16), new Integer(local15.anInt8466 & 0xFFFF), Integer.valueOf(local15.anInt8464 >> 16), new Integer(local15.anInt8464 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(733) Class155 local733;
							if (local41 == 12) {
								local733 = Static389.method6133(Static389.aString90, (String) local15.anObject15, Static389.anInt7292);
								local15.anObject16 = local733;
							} else if (local41 == 13) {
								local733 = Static389.method6133("", (String) local15.anObject15, Static389.anInt7292);
								local15.anObject16 = local733;
							} else if (this.aBoolean534 && local41 == 14) {
								@Pc(677) int local677 = local15.anInt8466;
								@Pc(680) int local680 = local15.anInt8464;
								if (this.aBoolean535) {
									this.aCallback_Sub1_1.method6738(local677, local680);
								} else {
									Class.forName("Class103").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject12, Integer.valueOf(local677), new Integer(local680));
								}
							} else if (this.aBoolean534 && local41 == 15) {
								@Pc(621) boolean local621 = local15.anInt8466 != 0;
								@Pc(625) Component local625 = (Component) local15.anObject15;
								if (this.aBoolean535) {
									this.aCallback_Sub1_1.method6737(local621, local625);
								} else {
									Class.forName("Class103").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject12, local625, Boolean.valueOf(local621));
								}
							} else if (!this.aBoolean535 && local41 == 17) {
								local108 = (Object[]) local15.anObject15;
								Class.forName("Class103").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject12, (Component) local108[0], (int[]) local108[1], Integer.valueOf(local15.anInt8466), new Integer(local15.anInt8464), (Point) local108[2]);
							} else if (local41 == 16) {
								try {
									if (!Static389.aString89.startsWith("win")) {
										throw new Exception();
									}
									local458 = (String) local15.anObject15;
									if (!local458.startsWith("http://") && !local458.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(472) String local472 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(474) int local474 = 0; local474 < local458.length(); local474++) {
										if (local472.indexOf(local458.charAt(local474)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local458 + "\"");
									local15.anObject16 = null;
								} catch (@Pc(509) Exception local509) {
									local15.anObject16 = local509;
									throw local509;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean535) {
							this.aClass86_1.method2339((Frame) local15.anObject15);
						} else {
							Class.forName("Class109").getMethod("exit").invoke(this.anObject13);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt8467 = 1;
			} catch (@Pc(859) ThreadDeath local859) {
				throw local859;
			} catch (@Pc(862) Throwable local862) {
				local15.anInt8467 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lclient!sba;")
	public Class280 method6142(@OriginalArg(1) int arg0) {
		return this.method6141(0, arg0, null, 3);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Lclient!sba;")
	public Class280 method6143() {
		return this.method6141(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!sba;")
	public Class280 method6144(@OriginalArg(1) URL arg0) {
		return this.method6141(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLjava/lang/String;Z)Lclient!sba;")
	public Class280 method6145(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		return this.method6141(0, arg0, arg1, arg2 ? 22 : 1);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
	public void method6146() {
		synchronized (this) {
			this.aBoolean533 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass155_1 != null) {
			try {
				this.aClass155_1.method4077();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass155_2 != null) {
			try {
				this.aClass155_2.method4077();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass155Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass155Array1.length; local44++) {
				if (this.aClass155Array1[local44] != null) {
					try {
						this.aClass155Array1[local44].method4077();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass155_3 != null) {
			try {
				this.aClass155_3.method4077();
			} catch (@Pc(74) IOException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!sba;")
	public Class280 method6147(@OriginalArg(0) String arg0) {
		return this.method6141(0, 0, arg0, 16);
	}
}
