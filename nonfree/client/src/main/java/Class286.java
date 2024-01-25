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

@OriginalClass("client!qg")
public final class Class286 implements Runnable {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Lclient!dq;")
	public Class82 aClass82_2 = null;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "Lclient!dq;")
	public Class82 aClass82_3 = null;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Lclient!sq;")
	private Class319 aClass319_6 = null;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!sq;")
	private Class319 aClass319_5 = null;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Z")
	public boolean aBoolean534 = false;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "Lclient!dq;")
	public Class82 aClass82_4 = null;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "Z")
	public boolean aBoolean536 = false;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "[Lclient!dq;")
	public Class82[] aClass82Array1;

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Ljava/lang/Object;")
	private Object anObject12;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "Lclient!qd;")
	private Class283 aClass283_1;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!kfa;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class286(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static465.aString69 = "Unknown";
		Static465.anInt7529 = arg0;
		Static465.aString66 = "1.1";
		Static465.aString70 = arg1;
		this.aBoolean536 = arg3;
		try {
			Static465.aString69 = System.getProperty("java.vendor");
			Static465.aString66 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static465.aString69.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean534 = true;
		}
		try {
			Static465.aString71 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static465.aString71 = "Unknown";
		}
		Static465.aString65 = Static465.aString71.toLowerCase();
		try {
			Static465.aString68 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static465.aString68 = "";
		}
		try {
			Static465.aString67 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static465.aString67 = "";
		}
		try {
			Static465.aString64 = System.getProperty("user.home");
			if (Static465.aString64 != null) {
				Static465.aString64 = Static465.aString64 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static465.aString64 == null) {
			Static465.aString64 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean534) {
			try {
				Static465.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static465.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static491.method6876(Static465.anInt7529, Static465.aString70);
		if (this.aBoolean536) {
			this.aClass82_2 = new Class82(Static491.method6874((String) null, "random.dat", Static465.anInt7529), "rw", 25L);
			this.aClass82_3 = new Class82(Static491.method6875("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass82_4 = new Class82(Static491.method6875("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass82Array1 = new Class82[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass82Array1[local181] = new Class82(Static491.method6875("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean534) {
				try {
					this.anObject14 = Class.forName("Class242").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean534) {
					this.aClass283_1 = new Class283();
				} else {
					this.anObject12 = Class.forName("Class383").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean534) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject13 = Class.forName("Class133").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean536 && !this.aBoolean534) {
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
		this.aBoolean535 = false;
		this.aThread5 = new Thread(this);
		this.aThread5.setPriority(10);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!sq;")
	public Class319 method6570(@OriginalArg(0) String arg0) {
		return this.method6585(12, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!sq;")
	public Class319 method6571(@OriginalArg(0) Frame arg0) {
		return this.method6585(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lclient!sq;")
	public Class319 method6572(@OriginalArg(0) int arg0) {
		return this.method6585(3, (Object) null, arg0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Component;IZLjava/awt/Point;[II)Lclient!sq;")
	public Class319 method6573(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		return this.method6585(17, new Object[] { arg0, arg3, arg2 }, arg4, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Lclient!sq;")
	public Class319 method6574() {
		return this.method6585(5, (Object) null, 0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!sq;")
	public Class319 method6575(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method6585(2, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lclient!sq;")
	public Class319 method6577(@OriginalArg(1) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method6585(8, new Object[] { arg0, arg2, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class319 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean535) {
						return;
					}
					if (this.aClass319_5 != null) {
						local15 = this.aClass319_5;
						this.aClass319_5 = this.aClass319_5.aClass319_7;
						if (this.aClass319_5 == null) {
							this.aClass319_6 = null;
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
				@Pc(41) int local41 = local15.anInt8561;
				if (local41 == 1) {
					if (Static48.method1203() < Static465.aLong207) {
						throw new IOException();
					}
					local15.anObject19 = new Socket(InetAddress.getByName((String) local15.anObject20), local15.anInt8560);
				} else if (local41 == 22) {
					if (Static48.method1203() < Static465.aLong207) {
						throw new IOException();
					}
					try {
						local15.anObject19 = Static501.method6959((String) local15.anObject20, local15.anInt8560).method7874();
					} catch (@Pc(75) IOException_Sub1 local75) {
						local15.anObject19 = local75.getMessage();
						throw local75;
					}
				} else if (local41 == 2) {
					@Pc(830) Thread local830 = new Thread((Runnable) local15.anObject20);
					local830.setDaemon(true);
					local830.start();
					local830.setPriority(local15.anInt8560);
					local15.anObject19 = local830;
				} else if (local41 == 4) {
					if (Static465.aLong207 > Static48.method1203()) {
						throw new IOException();
					}
					local15.anObject19 = new DataInputStream(((URL) local15.anObject20).openStream());
				} else {
					@Pc(119) Object[] local119;
					if (local41 == 8) {
						local119 = (Object[]) local15.anObject20;
						if (this.aBoolean536 && ((Class) local119[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject19 = ((Class) local119[0]).getDeclaredMethod((String) local119[1], (Class[]) local119[2]);
					} else if (local41 == 9) {
						local119 = (Object[]) local15.anObject20;
						if (this.aBoolean536 && ((Class) local119[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject19 = ((Class) local119[0]).getDeclaredField((String) local119[1]);
					} else if (local41 == 18) {
						@Pc(788) Clipboard local788 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject19 = local788.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(777) Transferable local777 = (Transferable) local15.anObject20;
						@Pc(780) Clipboard local780 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local780.setContents(local777, (ClipboardOwner) null);
					} else if (this.aBoolean536) {
						@Pc(254) String local254;
						if (local41 == 3) {
							if (Static465.aLong207 > Static48.method1203()) {
								throw new IOException();
							}
							local254 = (local15.anInt8560 >> 24 & 0xFF) + "." + (local15.anInt8560 >> 16 & 0xFF) + "." + (local15.anInt8560 >> 8 & 0xFF) + "." + (local15.anInt8560 & 0xFF);
							local15.anObject19 = InetAddress.getByName(local254).getHostName();
						} else if (local41 == 21) {
							if (Static465.aLong207 > Static48.method1203()) {
								throw new IOException();
							}
							local15.anObject19 = InetAddress.getByName((String) local15.anObject20).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean534) {
								local15.anObject19 = this.aClass283_1.method6497();
							} else {
								local15.anObject19 = Class.forName("Class383").getMethod("listmodes").invoke(this.anObject12);
							}
						} else if (local41 == 6) {
							@Pc(580) Frame local580 = new Frame("Jagex Full Screen");
							local15.anObject19 = local580;
							local580.setResizable(false);
							if (this.aBoolean534) {
								this.aClass283_1.method6499(local15.anInt8560 >>> 16, local580, local15.anInt8560 & 0xFFFF, local15.anInt8559 & 0xFFFF, local15.anInt8559 >> 16);
							} else {
								Class.forName("Class383").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject12, local580, Integer.valueOf(local15.anInt8560 >>> 16), new Integer(local15.anInt8560 & 0xFFFF), Integer.valueOf(local15.anInt8559 >> 16), new Integer(local15.anInt8559 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(535) Class82 local535;
							if (local41 == 12) {
								local535 = Static465.method6569(Static465.aString70, (String) local15.anObject20, Static465.anInt7529);
								local15.anObject19 = local535;
							} else if (local41 == 13) {
								local535 = Static465.method6569("", (String) local15.anObject20, Static465.anInt7529);
								local15.anObject19 = local535;
							} else if (this.aBoolean536 && local41 == 14) {
								@Pc(479) int local479 = local15.anInt8560;
								@Pc(482) int local482 = local15.anInt8559;
								if (this.aBoolean534) {
									this.aCallback_Sub1_1.method4620(local482, local479);
								} else {
									Class.forName("Class133").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject13, Integer.valueOf(local479), new Integer(local482));
								}
							} else if (this.aBoolean536 && local41 == 15) {
								@Pc(423) boolean local423 = local15.anInt8560 != 0;
								@Pc(427) Component local427 = (Component) local15.anObject20;
								if (this.aBoolean534) {
									this.aCallback_Sub1_1.method4619(local423, local427);
								} else {
									Class.forName("Class133").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject13, local427, Boolean.valueOf(local423));
								}
							} else if (!this.aBoolean534 && local41 == 17) {
								local119 = (Object[]) local15.anObject20;
								Class.forName("Class133").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject13, (Component) local119[0], (int[]) local119[1], Integer.valueOf(local15.anInt8560), new Integer(local15.anInt8559), (Point) local119[2]);
							} else if (local41 == 16) {
								try {
									if (!Static465.aString65.startsWith("win")) {
										throw new Exception();
									}
									local254 = (String) local15.anObject20;
									if (!local254.startsWith("http://") && !local254.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(268) String local268 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(270) int local270 = 0; local254.length() > local270; local270++) {
										if (local268.indexOf(local254.charAt(local270)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local254 + "\"");
									local15.anObject19 = null;
								} catch (@Pc(308) Exception local308) {
									local15.anObject19 = local308;
									throw local308;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean534) {
							this.aClass283_1.method6498((Frame) local15.anObject20);
						} else {
							Class.forName("Class383").getMethod("exit").invoke(this.anObject12);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt8562 = 1;
			} catch (@Pc(872) ThreadDeath local872) {
				throw local872;
			} catch (@Pc(875) Throwable local875) {
				local15.anInt8562 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method6578() {
		return this.anObject14;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public void method6579() {
		Static465.aLong207 = Static48.method1203() + 5000L;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
	public void method6580() {
		synchronized (this) {
			this.aBoolean535 = true;
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass82_3 != null) {
			try {
				this.aClass82_3.method2011();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass82_4 != null) {
			try {
				this.aClass82_4.method2011();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass82Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass82Array1.length; local44++) {
				if (this.aClass82Array1[local44] != null) {
					try {
						this.aClass82Array1[local44].method2011();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass82_2 != null) {
			try {
				this.aClass82_2.method2011();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZLjava/lang/String;I)Lclient!sq;")
	public Class319 method6581(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method6585(arg0 ? 22 : 1, arg1, arg2, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!sq;")
	public Class319 method6582(@OriginalArg(0) URL arg0) {
		return this.method6585(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!sq;")
	public Class319 method6583(@OriginalArg(0) String arg0) {
		return this.method6585(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lclient!sq;")
	public Class319 method6584(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method6585(9, new Object[] { arg1, arg0 }, 0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!sq;")
	private Class319 method6585(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class319 local3 = new Class319();
		local3.anInt8561 = arg0;
		local3.anObject20 = arg1;
		local3.anInt8559 = arg3;
		local3.anInt8560 = arg2;
		synchronized (this) {
			if (this.aClass319_6 == null) {
				this.aClass319_6 = this.aClass319_5 = local3;
			} else {
				this.aClass319_6.aClass319_7 = local3;
				this.aClass319_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	public boolean method6586(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIII)Lclient!sq;")
	public Class319 method6587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method6585(6, (Object) null, (arg0 << 16) + arg2, arg1 << 16);
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)Z")
	public boolean method6588() {
		if (!this.aBoolean536) {
			return false;
		} else if (this.aBoolean534) {
			return this.aClass283_1 != null;
		} else {
			return this.anObject12 != null;
		}
	}
}
