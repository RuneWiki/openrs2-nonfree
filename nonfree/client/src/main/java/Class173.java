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

@OriginalClass("client!iha")
public final class Class173 implements Runnable {

	@OriginalMember(owner = "client!iha", name = "q", descriptor = "Lclient!td;")
	public Class345 aClass345_2 = null;

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "Lclient!td;")
	public Class345 aClass345_3 = null;

	@OriginalMember(owner = "client!iha", name = "m", descriptor = "Z")
	private boolean aBoolean357 = false;

	@OriginalMember(owner = "client!iha", name = "v", descriptor = "Lclient!mba;")
	private Class230 aClass230_6 = null;

	@OriginalMember(owner = "client!iha", name = "y", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!iha", name = "A", descriptor = "Lclient!mba;")
	private Class230 aClass230_5 = null;

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "Lclient!td;")
	public Class345 aClass345_1 = null;

	@OriginalMember(owner = "client!iha", name = "l", descriptor = "Z")
	public boolean aBoolean359 = false;

	@OriginalMember(owner = "client!iha", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!iha", name = "k", descriptor = "[Lclient!td;")
	public Class345[] aClass345Array1;

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "Ljava/lang/Object;")
	private Object anObject10;

	@OriginalMember(owner = "client!iha", name = "x", descriptor = "Lclient!jca;")
	private Class183 aClass183_1;

	@OriginalMember(owner = "client!iha", name = "C", descriptor = "Ljava/lang/Object;")
	private Object anObject9;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "Lclient!ofa;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!iha", name = "D", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class173(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static251.aString62 = "Unknown";
		Static251.anInt4764 = arg0;
		this.aBoolean358 = arg3;
		Static251.aString58 = arg1;
		Static251.aString64 = "1.1";
		try {
			Static251.aString62 = System.getProperty("java.vendor");
			Static251.aString64 = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		if (Static251.aString62.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean359 = true;
		}
		try {
			Static251.aString60 = System.getProperty("os.name");
		} catch (@Pc(72) Exception local72) {
			Static251.aString60 = "Unknown";
		}
		Static251.aString65 = Static251.aString60.toLowerCase();
		try {
			Static251.aString61 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(87) Exception local87) {
			Static251.aString61 = "";
		}
		try {
			Static251.aString59 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(97) Exception local97) {
			Static251.aString59 = "";
		}
		try {
			Static251.aString63 = System.getProperty("user.home");
			if (Static251.aString63 != null) {
				Static251.aString63 = Static251.aString63 + "/";
			}
		} catch (@Pc(117) Exception local117) {
		}
		if (Static251.aString63 == null) {
			Static251.aString63 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(131) Throwable local131) {
		}
		if (!this.aBoolean359) {
			try {
				Static251.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(151) Exception local151) {
			}
			try {
				Static251.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(168) Exception local168) {
			}
		}
		Static25.method380(Static251.anInt4764, Static251.aString58);
		if (this.aBoolean358) {
			this.aClass345_3 = new Class345(Static25.method381("random.dat", (String) null, Static251.anInt4764), "rw", 25L);
			this.aClass345_2 = new Class345(Static25.method379("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass345_1 = new Class345(Static25.method379("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass345Array1 = new Class345[arg2];
			for (@Pc(226) int local226 = 0; local226 < arg2; local226++) {
				this.aClass345Array1[local226] = new Class345(Static25.method379("main_file_cache.idx" + local226), "rw", 1048576L);
			}
			if (this.aBoolean359) {
				try {
					this.anObject10 = Class.forName("hfa").getDeclaredConstructor().newInstance();
				} catch (@Pc(271) Throwable local271) {
				}
			}
			try {
				if (this.aBoolean359) {
					this.aClass183_1 = new Class183();
				} else {
					this.anObject9 = Class.forName("dw").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(291) Throwable local291) {
			}
			try {
				if (this.aBoolean359) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject11 = Class.forName("rja").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(310) Throwable local310) {
			}
		}
		if (this.aBoolean358 && !this.aBoolean359) {
			@Pc(322) ThreadGroup local322 = Thread.currentThread().getThreadGroup();
			for (@Pc(325) ThreadGroup local325 = local322.getParent(); local325 != null; local325 = local325.getParent()) {
				local322 = local325;
			}
			@Pc(336) Thread[] local336 = new Thread[1000];
			local322.enumerate(local336);
			for (@Pc(342) int local342 = 0; local342 < local336.length; local342++) {
				if (local336[local342] != null && local336[local342].getName().startsWith("AWT")) {
					local336[local342].setPriority(1);
				}
			}
		}
		this.aBoolean357 = false;
		this.aThread5 = new Thread(this);
		this.aThread5.setPriority(10);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZI)Lclient!mba;")
	public Class230 method4232(@OriginalArg(1) int arg0) {
		return this.method4238(3, (Object) null, 0, arg0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
	public void method4233() {
		Static251.aLong132 = Static26.method382() + 5000L;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLjava/lang/String;)Lclient!mba;")
	public Class230 method4234(@OriginalArg(1) String arg0) {
		return this.method4238(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(B)Z")
	public boolean method4235() {
		if (!this.aBoolean358) {
			return false;
		} else if (this.aBoolean359) {
			return this.aClass183_1 != null;
		} else {
			return this.anObject9 != null;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILjava/lang/String;ZI)Lclient!mba;")
	public Class230 method4236(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		return this.method4238(arg2 ? 22 : 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	public boolean method4237(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(13) FileOutputStream local13 = new FileOutputStream(arg1);
			local13.write(arg0, 0, arg0.length);
			local13.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!mba;")
	private Class230 method4238(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class230 local3 = new Class230();
		local3.anObject13 = arg1;
		local3.anInt6255 = arg2;
		local3.anInt6254 = arg3;
		local3.anInt6257 = arg0;
		synchronized (this) {
			if (this.aClass230_6 == null) {
				this.aClass230_6 = this.aClass230_5 = local3;
			} else {
				this.aClass230_6.aClass230_7 = local3;
				this.aClass230_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lclient!mba;")
	public Class230 method4239(@OriginalArg(0) Frame arg0) {
		return this.method4238(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)Lclient!mba;")
	public Class230 method4240() {
		return this.method4238(5, (Object) null, 0, 0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLjava/net/URL;)Lclient!mba;")
	public Class230 method4242(@OriginalArg(1) URL arg0) {
		return this.method4238(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!mba;")
	public Class230 method4244(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method4238(9, new Object[] { arg0, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ZLjava/lang/String;)Lclient!mba;")
	public Class230 method4245(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) String arg2) {
		return this.method4238(8, new Object[] { arg1, arg2, arg0 }, 0, 0);
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)V")
	public void method4246() {
		synchronized (this) {
			this.aBoolean357 = true;
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass345_2 != null) {
			try {
				this.aClass345_2.method8253();
			} catch (@Pc(29) IOException local29) {
			}
		}
		if (this.aClass345_1 != null) {
			try {
				this.aClass345_1.method8253();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass345Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.aClass345Array1.length; local46++) {
				if (this.aClass345Array1[local46] != null) {
					try {
						this.aClass345Array1[local46].method8253();
					} catch (@Pc(61) IOException local61) {
					}
				}
			}
		}
		if (this.aClass345_3 != null) {
			try {
				this.aClass345_3.method8253();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method4247() {
		return this.anObject10;
	}

	@OriginalMember(owner = "client!iha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class230 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean357) {
						return;
					}
					if (this.aClass230_5 != null) {
						local15 = this.aClass230_5;
						this.aClass230_5 = this.aClass230_5.aClass230_7;
						if (this.aClass230_5 == null) {
							this.aClass230_6 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(42) int local42 = local15.anInt6257;
				if (local42 == 1) {
					if (Static251.aLong132 > Static26.method382()) {
						throw new IOException();
					}
					local15.anObject12 = new Socket(InetAddress.getByName((String) local15.anObject13), local15.anInt6254);
				} else if (local42 == 22) {
					if (Static251.aLong132 > Static26.method382()) {
						throw new IOException();
					}
					try {
						local15.anObject12 = Static110.method1776(local15.anInt6254, (String) local15.anObject13).method5890();
					} catch (@Pc(77) IOException_Sub1 local77) {
						local15.anObject12 = local77.getMessage();
						throw local77;
					}
				} else if (local42 == 2) {
					@Pc(923) Thread local923 = new Thread((Runnable) local15.anObject13);
					local923.setDaemon(true);
					local923.start();
					local923.setPriority(local15.anInt6254);
					local15.anObject12 = local923;
				} else if (local42 == 4) {
					if (Static251.aLong132 > Static26.method382()) {
						throw new IOException();
					}
					local15.anObject12 = new DataInputStream(((URL) local15.anObject13).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local42 == 8) {
						local102 = (Object[]) local15.anObject13;
						if (this.aBoolean358 && ((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject12 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local42 == 9) {
						local102 = (Object[]) local15.anObject13;
						if (this.aBoolean358 && ((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject12 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local42 == 18) {
						@Pc(147) Clipboard local147 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject12 = local147.getContents((Object) null);
					} else if (local42 == 19) {
						@Pc(160) Transferable local160 = (Transferable) local15.anObject13;
						@Pc(163) Clipboard local163 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local163.setContents(local160, (ClipboardOwner) null);
					} else if (this.aBoolean358) {
						@Pc(233) String local233;
						if (local42 == 3) {
							if (Static26.method382() < Static251.aLong132) {
								throw new IOException();
							}
							local233 = (local15.anInt6254 >> 24 & 0xFF) + "." + (local15.anInt6254 >> 16 & 0xFF) + "." + (local15.anInt6254 >> 8 & 0xFF) + "." + (local15.anInt6254 & 0xFF);
							local15.anObject12 = InetAddress.getByName(local233).getHostName();
						} else if (local42 == 21) {
							if (Static26.method382() < Static251.aLong132) {
								throw new IOException();
							}
							local15.anObject12 = InetAddress.getByName((String) local15.anObject13).getAddress();
						} else if (local42 == 5) {
							if (this.aBoolean359) {
								local15.anObject12 = this.aClass183_1.method4608();
							} else {
								local15.anObject12 = Class.forName("dw").getMethod("listmodes").invoke(this.anObject9);
							}
						} else if (local42 == 6) {
							@Pc(722) Frame local722 = new Frame("Jagex Full Screen");
							local15.anObject12 = local722;
							local722.setResizable(false);
							if (this.aBoolean359) {
								this.aClass183_1.method4609(local722, local15.anInt6255 >> 16, local15.anInt6254 >>> 16, local15.anInt6254 & 0xFFFF, local15.anInt6255 & 0xFFFF);
							} else {
								Class.forName("dw").getMethod("enter", Static251.aClass30 == null ? (Static251.aClass30 = a("java.awt.Frame")) : Static251.aClass30, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject9, local722, Integer.valueOf(local15.anInt6254 >>> 16), new Integer(local15.anInt6254 & 0xFFFF), Integer.valueOf(local15.anInt6255 >> 16), new Integer(local15.anInt6255 & 0xFFFF));
							}
						} else if (local42 != 7) {
							@Pc(339) Class345 local339;
							if (local42 == 12) {
								local339 = Static251.method4241(Static251.aString58, Static251.anInt4764, (String) local15.anObject13);
								local15.anObject12 = local339;
							} else if (local42 == 13) {
								local339 = Static251.method4241("", Static251.anInt4764, (String) local15.anObject13);
								local15.anObject12 = local339;
							} else if (this.aBoolean358 && local42 == 14) {
								@Pc(650) int local650 = local15.anInt6254;
								@Pc(653) int local653 = local15.anInt6255;
								if (this.aBoolean359) {
									this.aCallback_Sub1_1.method6483(local653, local650);
								} else {
									Class.forName("rja").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject11, Integer.valueOf(local650), new Integer(local653));
								}
							} else if (this.aBoolean358 && local42 == 15) {
								@Pc(585) boolean local585 = local15.anInt6254 != 0;
								@Pc(589) Component local589 = (Component) local15.anObject13;
								if (this.aBoolean359) {
									this.aCallback_Sub1_1.method6482(local589, local585);
								} else {
									Class.forName("rja").getDeclaredMethod("showcursor", Static251.aClass27 == null ? (Static251.aClass27 = a("java.awt.Component")) : Static251.aClass27, Boolean.TYPE).invoke(this.anObject11, local589, Boolean.valueOf(local585));
								}
							} else if (!this.aBoolean359 && local42 == 17) {
								local102 = (Object[]) local15.anObject13;
								Class.forName("rja").getDeclaredMethod("setcustomcursor", Static251.aClass27 == null ? (Static251.aClass27 = a("java.awt.Component")) : Static251.aClass27, Static251.aClass28 == null ? (Static251.aClass28 = a("[I")) : Static251.aClass28, Integer.TYPE, Integer.TYPE, Static251.aClass29 == null ? (Static251.aClass29 = a("java.awt.Point")) : Static251.aClass29).invoke(this.anObject11, (Component) local102[0], (int[]) local102[1], Integer.valueOf(local15.anInt6254), new Integer(local15.anInt6255), (Point) local102[2]);
							} else if (local42 == 16) {
								try {
									if (!Static251.aString65.startsWith("win")) {
										throw new Exception();
									}
									local233 = (String) local15.anObject13;
									if (!local233.startsWith("http://") && !local233.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(530) String local530 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(532) int local532 = 0;
									while (true) {
										if (local532 >= local233.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local233 + "\"");
											local15.anObject12 = null;
											break;
										}
										if (local530.indexOf(local233.charAt(local532)) == -1) {
											throw new Exception();
										}
										local532++;
									}
								} catch (@Pc(569) Exception local569) {
									local15.anObject12 = local569;
									throw local569;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean359) {
							this.aClass183_1.method4610((Frame) local15.anObject13);
						} else {
							Class.forName("dw").getMethod("exit").invoke(this.anObject9);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6256 = 1;
			} catch (@Pc(962) ThreadDeath local962) {
				throw local962;
			} catch (@Pc(965) Throwable local965) {
				local15.anInt6256 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BI[ILjava/awt/Point;Ljava/awt/Component;I)Lclient!mba;")
	public Class230 method4248(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		return this.method4238(17, new Object[] { arg3, arg1, arg2 }, arg0, arg4);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!mba;")
	public Class230 method4249(@OriginalArg(2) String arg0) {
		return this.method4238(12, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lclient!mba;")
	public Class230 method4250(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method4238(2, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BIIII)Lclient!mba;")
	public Class230 method4251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method4238(6, (Object) null, arg2 << 16, arg1 + (arg0 << 16));
	}
}
