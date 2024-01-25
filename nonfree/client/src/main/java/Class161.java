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

@OriginalClass("client!ii")
public final class Class161 implements Runnable {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Z")
	private boolean aBoolean343 = false;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!baa;")
	public Class23 aClass23_2 = null;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!sa;")
	private Class299 aClass299_3 = null;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "Lclient!baa;")
	public Class23 aClass23_3 = null;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "Z")
	public boolean aBoolean345 = false;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "Lclient!sa;")
	private Class299 aClass299_4 = null;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "Lclient!baa;")
	public Class23 aClass23_4 = null;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "[Lclient!baa;")
	public Class23[] aClass23Array1;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "Ljava/lang/Object;")
	private Object anObject23;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "Lclient!br;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Ljava/lang/Object;")
	private Object anObject21;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "Lclient!iea;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "Ljava/lang/Object;")
	private Object anObject22;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static222.aString47 = "1.1";
		Static222.anInt4550 = arg0;
		this.aBoolean344 = arg3;
		Static222.aString46 = arg1;
		Static222.aString51 = "Unknown";
		try {
			Static222.aString51 = System.getProperty("java.vendor");
			Static222.aString47 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static222.aString51.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean345 = true;
		}
		try {
			Static222.aString53 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static222.aString53 = "Unknown";
		}
		Static222.aString49 = Static222.aString53.toLowerCase();
		try {
			Static222.aString52 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static222.aString52 = "";
		}
		try {
			Static222.aString48 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static222.aString48 = "";
		}
		try {
			Static222.aString50 = System.getProperty("user.home");
			if (Static222.aString50 != null) {
				Static222.aString50 = Static222.aString50 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static222.aString50 == null) {
			Static222.aString50 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean345) {
			try {
				Static222.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static222.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static24.method444(Static222.anInt4550, Static222.aString46);
		if (this.aBoolean344) {
			this.aClass23_3 = new Class23(Static24.method445(null, Static222.anInt4550, "random.dat"), "rw", 25L);
			this.aClass23_4 = new Class23(Static24.method443("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass23_2 = new Class23(Static24.method443("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass23Array1 = new Class23[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass23Array1[local181] = new Class23(Static24.method443("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean345) {
				try {
					this.anObject23 = Class.forName("Class226").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean345) {
					this.aClass37_1 = new Class37();
				} else {
					this.anObject21 = Class.forName("Class302").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean345) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject22 = Class.forName("Class328").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean344 && !this.aBoolean345) {
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
		this.aBoolean343 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!sa;")
	public Class299 method3814(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method3821(9, 0, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;ZZ)Lclient!sa;")
	public Class299 method3815(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method3821(12, 0, arg0, 0) : this.method3821(13, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Z")
	public boolean method3816() {
		if (!this.aBoolean344) {
			return false;
		} else if (this.aBoolean345) {
			return this.aClass37_1 != null;
		} else {
			return this.anObject21 != null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!sa;")
	public Class299 method3817(@OriginalArg(0) URL arg0) {
		return this.method3821(4, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3818() {
		return this.anObject23;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public void method3819() {
		Static222.aLong109 = Static184.method3422() + 5000L;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;IZ)Lclient!sa;")
	public Class299 method3820(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		return this.method3821(arg2 ? 22 : 1, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!sa;")
	private Class299 method3821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class299 local3 = new Class299();
		local3.anInt7986 = arg3;
		local3.anInt7984 = arg1;
		local3.anInt7983 = arg0;
		local3.anObject40 = arg2;
		synchronized (this) {
			if (this.aClass299_4 == null) {
				this.aClass299_4 = this.aClass299_3 = local3;
			} else {
				this.aClass299_4.aClass299_7 = local3;
				this.aClass299_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
	public void method3822() {
		synchronized (this) {
			this.aBoolean343 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass23_4 != null) {
			try {
				this.aClass23_4.method495();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass23_2 != null) {
			try {
				this.aClass23_2.method495();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass23Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass23Array1.length; local52++) {
				if (this.aClass23Array1[local52] != null) {
					try {
						this.aClass23Array1[local52].method495();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass23_3 != null) {
			try {
				this.aClass23_3.method495();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class299 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean343) {
						return;
					}
					if (this.aClass299_3 != null) {
						local15 = this.aClass299_3;
						this.aClass299_3 = this.aClass299_3.aClass299_7;
						if (this.aClass299_3 == null) {
							this.aClass299_4 = null;
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
				@Pc(41) int local41 = local15.anInt7983;
				if (local41 == 1) {
					if (Static184.method3422() < Static222.aLong109) {
						throw new IOException();
					}
					local15.anObject41 = new Socket(InetAddress.getByName((String) local15.anObject40), local15.anInt7986);
				} else if (local41 == 22) {
					if (Static222.aLong109 > Static184.method3422()) {
						throw new IOException();
					}
					try {
						local15.anObject41 = Static374.method5595((String) local15.anObject40, local15.anInt7986).method7725();
					} catch (@Pc(841) IOException_Sub1 local841) {
						local15.anObject41 = local841.getMessage();
						throw local841;
					}
				} else if (local41 == 2) {
					@Pc(61) Thread local61 = new Thread((Runnable) local15.anObject40);
					local61.setDaemon(true);
					local61.start();
					local61.setPriority(local15.anInt7986);
					local15.anObject41 = local61;
				} else if (local41 == 4) {
					if (Static222.aLong109 > Static184.method3422()) {
						throw new IOException();
					}
					local15.anObject41 = new DataInputStream(((URL) local15.anObject40).openStream());
				} else {
					@Pc(107) Object[] local107;
					if (local41 == 8) {
						local107 = (Object[]) local15.anObject40;
						if (this.aBoolean344 && ((Class) local107[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject41 = ((Class) local107[0]).getDeclaredMethod((String) local107[1], (Class[]) local107[2]);
					} else if (local41 == 9) {
						local107 = (Object[]) local15.anObject40;
						if (this.aBoolean344 && ((Class) local107[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject41 = ((Class) local107[0]).getDeclaredField((String) local107[1]);
					} else if (local41 == 18) {
						@Pc(149) Clipboard local149 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject41 = local149.getContents(null);
					} else if (local41 == 19) {
						@Pc(164) Transferable local164 = (Transferable) local15.anObject40;
						@Pc(167) Clipboard local167 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local167.setContents(local164, null);
					} else if (this.aBoolean344) {
						@Pc(554) String local554;
						if (local41 == 3) {
							if (Static184.method3422() < Static222.aLong109) {
								throw new IOException();
							}
							local554 = (local15.anInt7986 >> 24 & 0xFF) + "." + (local15.anInt7986 >> 16 & 0xFF) + "." + (local15.anInt7986 >> 8 & 0xFF) + "." + (local15.anInt7986 & 0xFF);
							local15.anObject41 = InetAddress.getByName(local554).getHostName();
						} else if (local41 == 21) {
							if (Static222.aLong109 > Static184.method3422()) {
								throw new IOException();
							}
							local15.anObject41 = InetAddress.getByName((String) local15.anObject40).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean345) {
								local15.anObject41 = this.aClass37_1.method770();
							} else {
								local15.anObject41 = Class.forName("Class302").getMethod("listmodes").invoke(this.anObject21);
							}
						} else if (local41 == 6) {
							@Pc(619) Frame local619 = new Frame("Jagex Full Screen");
							local15.anObject41 = local619;
							local619.setResizable(false);
							if (this.aBoolean345) {
								this.aClass37_1.method768(local15.anInt7986 >>> 16, local15.anInt7984 >> 16, local15.anInt7986 & 0xFFFF, local15.anInt7984 & 0xFFFF, local619);
							} else {
								Class.forName("Class302").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject21, local619, Integer.valueOf(local15.anInt7986 >>> 16), new Integer(local15.anInt7986 & 0xFFFF), Integer.valueOf(local15.anInt7984 >> 16), new Integer(local15.anInt7984 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(285) Class23 local285;
							if (local41 == 12) {
								local285 = Static222.method3830(Static222.aString46, (String) local15.anObject40, Static222.anInt4550);
								local15.anObject41 = local285;
							} else if (local41 == 13) {
								local285 = Static222.method3830("", (String) local15.anObject40, Static222.anInt4550);
								local15.anObject41 = local285;
							} else if (this.aBoolean344 && local41 == 14) {
								@Pc(315) int local315 = local15.anInt7986;
								@Pc(318) int local318 = local15.anInt7984;
								if (this.aBoolean345) {
									this.aCallback_Sub1_1.method3744(local318, local315);
								} else {
									Class.forName("Class328").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject22, Integer.valueOf(local315), new Integer(local318));
								}
							} else if (this.aBoolean344 && local41 == 15) {
								@Pc(378) boolean local378 = local15.anInt7986 != 0;
								@Pc(382) Component local382 = (Component) local15.anObject40;
								if (this.aBoolean345) {
									this.aCallback_Sub1_1.method3743(local382, local378);
								} else {
									Class.forName("Class328").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject22, local382, Boolean.valueOf(local378));
								}
							} else if (!this.aBoolean345 && local41 == 17) {
								local107 = (Object[]) local15.anObject40;
								Class.forName("Class328").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject22, (Component) local107[0], (int[]) local107[1], Integer.valueOf(local15.anInt7986), new Integer(local15.anInt7984), (Point) local107[2]);
							} else if (local41 == 16) {
								try {
									if (!Static222.aString49.startsWith("win")) {
										throw new Exception();
									}
									local554 = (String) local15.anObject40;
									if (!local554.startsWith("http://") && !local554.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(568) String local568 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(570) int local570 = 0;
									while (true) {
										if (local570 >= local554.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local554 + "\"");
											local15.anObject41 = null;
											break;
										}
										if (local568.indexOf(local554.charAt(local570)) == -1) {
											throw new Exception();
										}
										local570++;
									}
								} catch (@Pc(609) Exception local609) {
									local15.anObject41 = local609;
									throw local609;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean345) {
							this.aClass37_1.method769((Frame) local15.anObject40);
						} else {
							Class.forName("Class302").getMethod("exit").invoke(this.anObject21);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt7985 = 1;
			} catch (@Pc(876) ThreadDeath local876) {
				throw local876;
			} catch (@Pc(879) Throwable local879) {
				local15.anInt7985 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;)Lclient!sa;")
	public Class299 method3823(@OriginalArg(1) String arg0) {
		return this.method3821(16, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lclient!sa;")
	public Class299 method3824(@OriginalArg(1) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method3821(8, 0, new Object[] { arg2, arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)Lclient!sa;")
	public Class299 method3825() {
		return this.method3821(5, 0, null, 0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Point;Ljava/awt/Component;ZII[I)Lclient!sa;")
	public Class299 method3826(@OriginalArg(0) Point arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		return this.method3821(17, arg3, new Object[] { arg1, arg4, arg0 }, arg2);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!sa;")
	public Class299 method3827(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method3821(2, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIBII)Lclient!sa;")
	public Class299 method3828(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3821(6, arg1 << 16, null, arg0 + (arg2 << 16));
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!sa;")
	public Class299 method3829(@OriginalArg(0) Frame arg0) {
		return this.method3821(7, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLjava/io/File;[B)Z")
	public boolean method3831(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)Lclient!sa;")
	public Class299 method3832(@OriginalArg(0) int arg0) {
		return this.method3821(3, 0, null, arg0);
	}
}
