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

@OriginalClass("client!cea")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!cea", name = "G", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "Lclient!sd;")
	public Class333 aClass333_2 = null;

	@OriginalMember(owner = "client!cea", name = "A", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!cea", name = "z", descriptor = "Lclient!sd;")
	public Class333 aClass333_1 = null;

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "Lclient!ke;")
	private Class201 aClass201_3 = null;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "Lclient!sd;")
	public Class333 aClass333_3 = null;

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!cea", name = "D", descriptor = "Lclient!ke;")
	private Class201 aClass201_4 = null;

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!cea", name = "r", descriptor = "[Lclient!sd;")
	public Class333[] aClass333Array1;

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "Ljava/lang/Object;")
	private Object anObject2;

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "Lclient!rm;")
	private Class326 aClass326_1;

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "Ljava/lang/Object;")
	private Object anObject3;

	@OriginalMember(owner = "client!cea", name = "s", descriptor = "Ljava/lang/Object;")
	private Object anObject1;

	@OriginalMember(owner = "client!cea", name = "y", descriptor = "Lclient!baa;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static75.aString23 = arg1;
		this.aBoolean97 = arg3;
		Static75.aString25 = "1.1";
		Static75.anInt1151 = arg0;
		Static75.aString26 = "Unknown";
		try {
			Static75.aString26 = System.getProperty("java.vendor");
			Static75.aString25 = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		if (Static75.aString26.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean98 = true;
		}
		try {
			Static75.aString22 = System.getProperty("os.name");
		} catch (@Pc(72) Exception local72) {
			Static75.aString22 = "Unknown";
		}
		Static75.aString24 = Static75.aString22.toLowerCase();
		try {
			Static75.aString19 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(87) Exception local87) {
			Static75.aString19 = "";
		}
		try {
			Static75.aString21 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(97) Exception local97) {
			Static75.aString21 = "";
		}
		try {
			Static75.aString20 = System.getProperty("user.home");
			if (Static75.aString20 != null) {
				Static75.aString20 = Static75.aString20 + "/";
			}
		} catch (@Pc(117) Exception local117) {
		}
		if (Static75.aString20 == null) {
			Static75.aString20 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(131) Throwable local131) {
		}
		if (!this.aBoolean98) {
			try {
				Static75.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(151) Exception local151) {
			}
			try {
				Static75.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(168) Exception local168) {
			}
		}
		Static683.method9024(Static75.anInt1151, Static75.aString23);
		if (this.aBoolean97) {
			this.aClass333_2 = new Class333(Static683.method9023((String) null, "random.dat", Static75.anInt1151), "rw", 25L);
			this.aClass333_3 = new Class333(Static683.method9022("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass333_1 = new Class333(Static683.method9022("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass333Array1 = new Class333[arg2];
			for (@Pc(226) int local226 = 0; local226 < arg2; local226++) {
				this.aClass333Array1[local226] = new Class333(Static683.method9022("main_file_cache.idx" + local226), "rw", 1048576L);
			}
			if (this.aBoolean98) {
				try {
					this.anObject2 = Class.forName("su").getDeclaredConstructor().newInstance();
				} catch (@Pc(271) Throwable local271) {
				}
			}
			try {
				if (this.aBoolean98) {
					this.aClass326_1 = new Class326();
				} else {
					this.anObject3 = Class.forName("eia").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(291) Throwable local291) {
			}
			try {
				if (this.aBoolean98) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject1 = Class.forName("kp").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(310) Throwable local310) {
			}
		}
		if (this.aBoolean97 && !this.aBoolean98) {
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
		this.aBoolean96 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZLjava/lang/String;I)Lclient!ke;")
	public Class201 method939(@OriginalArg(1) String arg0) {
		return this.method945(arg0, 12, 0, 0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!ke;")
	public Class201 method940(@OriginalArg(0) URL arg0) {
		return this.method945(arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ke;")
	public Class201 method941(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method945(arg0, 2, arg1, 0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)Lclient!ke;")
	public Class201 method942() {
		return this.method945((Object) null, 5, 0, 0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(B[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lclient!ke;")
	public Class201 method943(@OriginalArg(1) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method945(new Object[] { arg1, arg2, arg0 }, 8, 0, 0);
	}

	@OriginalMember(owner = "client!cea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class201 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean96) {
						return;
					}
					if (this.aClass201_3 != null) {
						local15 = this.aClass201_3;
						this.aClass201_3 = this.aClass201_3.aClass201_6;
						if (this.aClass201_3 == null) {
							this.aClass201_4 = null;
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
				@Pc(42) int local42 = local15.anInt5728;
				if (local42 == 1) {
					if (Static626.method8479() < Static75.aLong53) {
						throw new IOException();
					}
					local15.anObject16 = new Socket(InetAddress.getByName((String) local15.anObject15), local15.anInt5731);
				} else if (local42 == 22) {
					if (Static75.aLong53 > Static626.method8479()) {
						throw new IOException();
					}
					try {
						local15.anObject16 = Static288.method4391(local15.anInt5731, (String) local15.anObject15).method3527();
					} catch (@Pc(964) IOException_Sub1 local964) {
						local15.anObject16 = local964.getMessage();
						throw local964;
					}
				} else if (local42 == 2) {
					@Pc(88) Thread local88 = new Thread((Runnable) local15.anObject15);
					local88.setDaemon(true);
					local88.start();
					local88.setPriority(local15.anInt5731);
					local15.anObject16 = local88;
				} else if (local42 == 4) {
					if (Static75.aLong53 > Static626.method8479()) {
						throw new IOException();
					}
					local15.anObject16 = new DataInputStream(((URL) local15.anObject15).openStream());
				} else {
					@Pc(120) Object[] local120;
					if (local42 == 8) {
						local120 = (Object[]) local15.anObject15;
						if (this.aBoolean97 && ((Class) local120[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local120[0]).getDeclaredMethod((String) local120[1], (Class[]) local120[2]);
					} else if (local42 == 9) {
						local120 = (Object[]) local15.anObject15;
						if (this.aBoolean97 && ((Class) local120[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject16 = ((Class) local120[0]).getDeclaredField((String) local120[1]);
					} else if (local42 == 18) {
						@Pc(875) Clipboard local875 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject16 = local875.getContents((Object) null);
					} else if (local42 == 19) {
						@Pc(864) Transferable local864 = (Transferable) local15.anObject15;
						@Pc(867) Clipboard local867 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local867.setContents(local864, (ClipboardOwner) null);
					} else if (this.aBoolean97) {
						@Pc(223) String local223;
						if (local42 == 3) {
							if (Static75.aLong53 > Static626.method8479()) {
								throw new IOException();
							}
							local223 = (local15.anInt5731 >> 24 & 0xFF) + "." + (local15.anInt5731 >> 16 & 0xFF) + "." + (local15.anInt5731 >> 8 & 0xFF) + "." + (local15.anInt5731 & 0xFF);
							local15.anObject16 = InetAddress.getByName(local223).getHostName();
						} else if (local42 == 21) {
							if (Static626.method8479() < Static75.aLong53) {
								throw new IOException();
							}
							local15.anObject16 = InetAddress.getByName((String) local15.anObject15).getAddress();
						} else if (local42 == 5) {
							if (this.aBoolean98) {
								local15.anObject16 = this.aClass326_1.method7821();
							} else {
								local15.anObject16 = Class.forName("eia").getMethod("listmodes").invoke(this.anObject3);
							}
						} else if (local42 == 6) {
							@Pc(707) Frame local707 = new Frame("Jagex Full Screen");
							local15.anObject16 = local707;
							local707.setResizable(false);
							if (this.aBoolean98) {
								this.aClass326_1.method7822(local15.anInt5731 & 0xFFFF, local15.anInt5731 >>> 16, local707, local15.anInt5730 & 0xFFFF, local15.anInt5730 >> 16);
							} else {
								Class.forName("eia").getMethod("enter", Static75.aClass4 == null ? (Static75.aClass4 = a("java.awt.Frame")) : Static75.aClass4, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject3, local707, Integer.valueOf(local15.anInt5731 >>> 16), new Integer(local15.anInt5731 & 0xFFFF), Integer.valueOf(local15.anInt5730 >> 16), new Integer(local15.anInt5730 & 0xFFFF));
							}
						} else if (local42 != 7) {
							@Pc(284) Class333 local284;
							if (local42 == 12) {
								local284 = Static75.method950(Static75.aString23, Static75.anInt1151, (String) local15.anObject15);
								local15.anObject16 = local284;
							} else if (local42 == 13) {
								local284 = Static75.method950("", Static75.anInt1151, (String) local15.anObject15);
								local15.anObject16 = local284;
							} else if (this.aBoolean97 && local42 == 14) {
								@Pc(318) int local318 = local15.anInt5731;
								@Pc(321) int local321 = local15.anInt5730;
								if (this.aBoolean98) {
									this.aCallback_Sub1_1.method546(local321, local318);
								} else {
									Class.forName("kp").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject1, Integer.valueOf(local318), new Integer(local321));
								}
							} else if (this.aBoolean97 && local42 == 15) {
								@Pc(392) boolean local392 = local15.anInt5731 != 0;
								@Pc(396) Component local396 = (Component) local15.anObject15;
								if (this.aBoolean98) {
									this.aCallback_Sub1_1.method547(local396, local392);
								} else {
									Class.forName("kp").getDeclaredMethod("showcursor", Static75.aClass1 == null ? (Static75.aClass1 = a("java.awt.Component")) : Static75.aClass1, Boolean.TYPE).invoke(this.anObject1, local396, Boolean.valueOf(local392));
								}
							} else if (!this.aBoolean98 && local42 == 17) {
								local120 = (Object[]) local15.anObject15;
								Class.forName("kp").getDeclaredMethod("setcustomcursor", Static75.aClass1 == null ? (Static75.aClass1 = a("java.awt.Component")) : Static75.aClass1, Static75.aClass2 == null ? (Static75.aClass2 = a("[I")) : Static75.aClass2, Integer.TYPE, Integer.TYPE, Static75.aClass3 == null ? (Static75.aClass3 = a("java.awt.Point")) : Static75.aClass3).invoke(this.anObject1, (Component) local120[0], (int[]) local120[1], Integer.valueOf(local15.anInt5731), new Integer(local15.anInt5730), (Point) local120[2]);
							} else if (local42 == 16) {
								try {
									if (!Static75.aString24.startsWith("win")) {
										throw new Exception();
									}
									local223 = (String) local15.anObject15;
									if (!local223.startsWith("http://") && !local223.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(509) String local509 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(511) int local511 = 0; local511 < local223.length(); local511++) {
										if (local509.indexOf(local223.charAt(local511)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local223 + "\"");
									local15.anObject16 = null;
								} catch (@Pc(553) Exception local553) {
									local15.anObject16 = local553;
									throw local553;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean98) {
							this.aClass326_1.method7823((Frame) local15.anObject15);
						} else {
							Class.forName("eia").getMethod("exit").invoke(this.anObject3);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5729 = 1;
			} catch (@Pc(975) ThreadDeath local975) {
				throw local975;
			} catch (@Pc(978) Throwable local978) {
				local15.anInt5729 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIZII)Lclient!ke;")
	public Class201 method944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method945((Object) null, 6, (arg0 << 16) + arg1, arg2 << 16);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lclient!ke;")
	private Class201 method945(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class201 local3 = new Class201();
		local3.anInt5731 = arg2;
		local3.anInt5728 = arg1;
		local3.anObject15 = arg0;
		local3.anInt5730 = arg3;
		synchronized (this) {
			if (this.aClass201_4 == null) {
				this.aClass201_4 = this.aClass201_3 = local3;
			} else {
				this.aClass201_4.aClass201_6 = local3;
				this.aClass201_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)Z")
	public boolean method946() {
		if (!this.aBoolean97) {
			return false;
		} else if (this.aBoolean98) {
			return this.aClass326_1 != null;
		} else {
			return this.anObject3 != null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;IIZ)Lclient!ke;")
	public Class201 method947(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method945(arg0, arg2 ? 22 : 1, arg1, 0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/awt/Point;Ljava/awt/Component;IZ[II)Lclient!ke;")
	public Class201 method948(@OriginalArg(0) Point arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		return this.method945(new Object[] { arg1, arg3, arg0 }, 17, arg2, arg4);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IB)Lclient!ke;")
	public Class201 method949(@OriginalArg(0) int arg0) {
		return this.method945((Object) null, 3, arg0, 0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ke;")
	public Class201 method951(@OriginalArg(0) String arg0) {
		return this.method945(arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method952() {
		return this.anObject2;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!ke;")
	public Class201 method953(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method945(new Object[] { arg0, arg1 }, 9, 0, 0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)V")
	public void method954() {
		Static75.aLong53 = Static626.method8479() + 5000L;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)V")
	public void method955() {
		synchronized (this) {
			this.aBoolean96 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass333_3 != null) {
			try {
				this.aClass333_3.method7955();
			} catch (@Pc(29) IOException local29) {
			}
		}
		if (this.aClass333_1 != null) {
			try {
				this.aClass333_1.method7955();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass333Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.aClass333Array1.length; local46++) {
				if (this.aClass333Array1[local46] != null) {
					try {
						this.aClass333Array1[local46].method7955();
					} catch (@Pc(61) IOException local61) {
					}
				}
			}
		}
		if (this.aClass333_2 != null) {
			try {
				this.aClass333_2.method7955();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	public boolean method956(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!ke;")
	public Class201 method957(@OriginalArg(0) Frame arg0) {
		return this.method945(arg0, 7, 0, 0);
	}
}
