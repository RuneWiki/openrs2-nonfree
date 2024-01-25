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

@OriginalClass("client!pi")
public final class Class258 implements Runnable {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Lclient!mca;")
	public Class204 aClass204_2 = null;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Z")
	public boolean aBoolean523 = false;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!mca;")
	public Class204 aClass204_3 = null;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Lclient!mca;")
	public Class204 aClass204_4 = null;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "Lclient!bp;")
	private Class39 aClass39_3 = null;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "Z")
	public boolean aBoolean524 = false;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "Lclient!bp;")
	private Class39 aClass39_4 = null;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "Z")
	private boolean aBoolean525 = false;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "[Lclient!mca;")
	public Class204[] aClass204Array1;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "Ljava/lang/Object;")
	private Object anObject17;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Lclient!cw;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "Ljava/lang/Object;")
	private Object anObject18;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/lang/Object;")
	private Object anObject16;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "Lclient!u;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class258(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static408.anInt7020 = arg0;
		Static408.aString55 = "Unknown";
		Static408.aString58 = arg1;
		Static408.aString56 = "1.1";
		this.aBoolean524 = arg3;
		try {
			Static408.aString55 = System.getProperty("java.vendor");
			Static408.aString56 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static408.aString55.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean523 = true;
		}
		try {
			Static408.aString62 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static408.aString62 = "Unknown";
		}
		Static408.aString61 = Static408.aString62.toLowerCase();
		try {
			Static408.aString59 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static408.aString59 = "";
		}
		try {
			Static408.aString60 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static408.aString60 = "";
		}
		try {
			Static408.aString57 = System.getProperty("user.home");
			if (Static408.aString57 != null) {
				Static408.aString57 = Static408.aString57 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static408.aString57 == null) {
			Static408.aString57 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean523) {
			try {
				Static408.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static408.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static431.method6075(Static408.anInt7020, Static408.aString58);
		if (this.aBoolean524) {
			this.aClass204_4 = new Class204(Static431.method6076("random.dat", Static408.anInt7020, null), "rw", 25L);
			this.aClass204_3 = new Class204(Static431.method6074("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass204_2 = new Class204(Static431.method6074("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass204Array1 = new Class204[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass204Array1[local181] = new Class204(Static431.method6074("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean523) {
				try {
					this.anObject17 = Class.forName("Class214").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean523) {
					this.aClass59_1 = new Class59();
				} else {
					this.anObject18 = Class.forName("Class338").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean523) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject16 = Class.forName("Class196").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean524 && !this.aBoolean523) {
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
		this.aBoolean525 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!bp;")
	public Class39 method5878(@OriginalArg(0) String arg0) {
		return this.method5880(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/io/File;[B)Z")
	public boolean method5879(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!bp;")
	private Class39 method5880(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class39 local3 = new Class39();
		local3.anInt893 = arg3;
		local3.anObject1 = arg1;
		local3.anInt895 = arg0;
		local3.anInt892 = arg2;
		synchronized (this) {
			if (this.aClass39_3 == null) {
				this.aClass39_3 = this.aClass39_4 = local3;
			} else {
				this.aClass39_3.aClass39_1 = local3;
				this.aClass39_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!bp;")
	public Class39 method5881(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method5880(2, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public void method5882() {
		synchronized (this) {
			this.aBoolean525 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass204_3 != null) {
			try {
				this.aClass204_3.method4677();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass204_2 != null) {
			try {
				this.aClass204_2.method4677();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass204Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass204Array1.length; local53++) {
				if (this.aClass204Array1[local53] != null) {
					try {
						this.aClass204Array1[local53].method4677();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass204_4 != null) {
			try {
				this.aClass204_4.method4677();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;B)Lclient!bp;")
	public Class39 method5883(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2) {
		return this.method5880(8, new Object[] { arg0, arg1, arg2 }, 0, 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z")
	public boolean method5884() {
		if (!this.aBoolean524) {
			return false;
		} else if (this.aBoolean523) {
			return this.aClass59_1 != null;
		} else {
			return this.anObject18 != null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class39 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean525) {
						return;
					}
					if (this.aClass39_4 != null) {
						local15 = this.aClass39_4;
						this.aClass39_4 = this.aClass39_4.aClass39_1;
						if (this.aClass39_4 == null) {
							this.aClass39_3 = null;
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
				@Pc(41) int local41 = local15.anInt895;
				if (local41 == 1) {
					if (Static408.aLong197 > Static158.method2936()) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt893);
				} else if (local41 == 22) {
					if (Static158.method2936() < Static408.aLong197) {
						throw new IOException();
					}
					try {
						local15.anObject2 = Static20.method319((String) local15.anObject1, local15.anInt893).method5541();
					} catch (@Pc(102) IOException_Sub1 local102) {
						local15.anObject2 = local102.getMessage();
						throw local102;
					}
				} else if (local41 == 2) {
					@Pc(850) Thread local850 = new Thread((Runnable) local15.anObject1);
					local850.setDaemon(true);
					local850.start();
					local850.setPriority(local15.anInt893);
					local15.anObject2 = local850;
				} else if (local41 == 4) {
					if (Static408.aLong197 > Static158.method2936()) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(126) Object[] local126;
					if (local41 == 8) {
						local126 = (Object[]) local15.anObject1;
						if (this.aBoolean524 && ((Class) local126[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject2 = ((Class) local126[0]).getDeclaredMethod((String) local126[1], (Class[]) local126[2]);
					} else if (local41 == 9) {
						local126 = (Object[]) local15.anObject1;
						if (this.aBoolean524 && ((Class) local126[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject2 = ((Class) local126[0]).getDeclaredField((String) local126[1]);
					} else if (local41 == 18) {
						@Pc(781) Clipboard local781 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local781.getContents(null);
					} else if (local41 == 19) {
						@Pc(163) Transferable local163 = (Transferable) local15.anObject1;
						@Pc(166) Clipboard local166 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local166.setContents(local163, null);
					} else if (this.aBoolean524) {
						@Pc(518) String local518;
						if (local41 == 3) {
							if (Static158.method2936() < Static408.aLong197) {
								throw new IOException();
							}
							local518 = (local15.anInt893 >> 24 & 0xFF) + "." + (local15.anInt893 >> 16 & 0xFF) + "." + (local15.anInt893 >> 8 & 0xFF) + "." + (local15.anInt893 & 0xFF);
							local15.anObject2 = InetAddress.getByName(local518).getHostName();
						} else if (local41 == 21) {
							if (Static158.method2936() < Static408.aLong197) {
								throw new IOException();
							}
							local15.anObject2 = InetAddress.getByName((String) local15.anObject1).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean523) {
								local15.anObject2 = this.aClass59_1.method1602();
							} else {
								local15.anObject2 = Class.forName("Class338").getMethod("listmodes").invoke(this.anObject18);
							}
						} else if (local41 == 6) {
							@Pc(219) Frame local219 = new Frame("Jagex Full Screen");
							local15.anObject2 = local219;
							local219.setResizable(false);
							if (this.aBoolean523) {
								this.aClass59_1.method1604(local15.anInt892 >> 16, local15.anInt892 & 0xFFFF, local15.anInt893 >>> 16, local219, local15.anInt893 & 0xFFFF);
							} else {
								Class.forName("Class338").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject18, local219, Integer.valueOf(local15.anInt893 >>> 16), new Integer(local15.anInt893 & 0xFFFF), Integer.valueOf(local15.anInt892 >> 16), new Integer(local15.anInt892 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(377) Class204 local377;
							if (local41 == 12) {
								local377 = Static408.method5885((String) local15.anObject1, Static408.anInt7020, Static408.aString58);
								local15.anObject2 = local377;
							} else if (local41 == 13) {
								local377 = Static408.method5885((String) local15.anObject1, Static408.anInt7020, "");
								local15.anObject2 = local377;
							} else if (this.aBoolean524 && local41 == 14) {
								@Pc(640) int local640 = local15.anInt893;
								@Pc(643) int local643 = local15.anInt892;
								if (this.aBoolean523) {
									this.aCallback_Sub1_1.method6975(local640, local643);
								} else {
									Class.forName("Class196").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject16, Integer.valueOf(local640), new Integer(local643));
								}
							} else if (this.aBoolean524 && local41 == 15) {
								@Pc(584) boolean local584 = local15.anInt893 != 0;
								@Pc(588) Component local588 = (Component) local15.anObject1;
								if (this.aBoolean523) {
									this.aCallback_Sub1_1.method6974(local584, local588);
								} else {
									Class.forName("Class196").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject16, local588, Boolean.valueOf(local584));
								}
							} else if (!this.aBoolean523 && local41 == 17) {
								local126 = (Object[]) local15.anObject1;
								Class.forName("Class196").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject16, (Component) local126[0], (int[]) local126[1], Integer.valueOf(local15.anInt893), new Integer(local15.anInt892), (Point) local126[2]);
							} else if (local41 == 16) {
								try {
									if (!Static408.aString61.startsWith("win")) {
										throw new Exception();
									}
									local518 = (String) local15.anObject1;
									if (!local518.startsWith("http://") && !local518.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(532) String local532 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(534) int local534 = 0;
									while (true) {
										if (local534 >= local518.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local518 + "\"");
											local15.anObject2 = null;
											break;
										}
										if (local532.indexOf(local518.charAt(local534)) == -1) {
											throw new Exception();
										}
										local534++;
									}
								} catch (@Pc(569) Exception local569) {
									local15.anObject2 = local569;
									throw local569;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean523) {
							this.aClass59_1.method1603((Frame) local15.anObject1);
						} else {
							Class.forName("Class338").getMethod("exit").invoke(this.anObject18);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt894 = 1;
			} catch (@Pc(867) ThreadDeath local867) {
				throw local867;
			} catch (@Pc(870) Throwable local870) {
				local15.anInt894 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
	public void method5886() {
		Static408.aLong197 = Static158.method2936() + 5000L;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!bp;")
	public Class39 method5887(@OriginalArg(1) Frame arg0) {
		return this.method5880(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)Lclient!bp;")
	public Class39 method5888() {
		return this.method5880(5, null, 0, 0);
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method5889() {
		return this.anObject17;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!bp;")
	public Class39 method5890(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method5880(9, new Object[] { arg0, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZILjava/lang/String;)Lclient!bp;")
	public Class39 method5891(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method5880(arg0 ? 22 : 1, arg2, 0, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lclient!bp;")
	public Class39 method5893(@OriginalArg(1) int arg0) {
		return this.method5880(3, null, 0, arg0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLjava/net/URL;)Lclient!bp;")
	public Class39 method5894(@OriginalArg(1) URL arg0) {
		return this.method5880(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;ZB)Lclient!bp;")
	public Class39 method5895(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method5880(12, arg0, 0, 0) : this.method5880(13, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIB)Lclient!bp;")
	public Class39 method5896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method5880(6, null, arg2 << 16, arg0 + (arg1 << 16));
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/awt/Point;[ILjava/awt/Component;II)Lclient!bp;")
	public Class39 method5897(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Component arg3, @OriginalArg(5) int arg4) {
		return this.method5880(17, new Object[] { arg3, arg2, arg1 }, arg4, arg0);
	}
}
