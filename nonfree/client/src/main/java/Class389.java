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

@OriginalClass("client!vo")
public final class Class389 implements Runnable {

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Lclient!hma;")
	private Class163 aClass163_8 = null;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!ob;")
	public Class268 aClass268_3 = null;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "Z")
	public boolean aBoolean912 = false;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "Lclient!hma;")
	private Class163 aClass163_9 = null;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "Z")
	public boolean aBoolean913 = false;

	@OriginalMember(owner = "client!vo", name = "A", descriptor = "Lclient!ob;")
	public Class268 aClass268_2 = null;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "Z")
	private boolean aBoolean914 = false;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Lclient!ob;")
	public Class268 aClass268_4 = null;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "[Lclient!ob;")
	public Class268[] aClass268Array1;

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "Ljava/lang/Object;")
	private Object anObject17;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "Ljava/lang/Object;")
	private Object anObject18;

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "Lclient!ia;")
	private Class169 aClass169_1;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "Lclient!eja;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class389(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static688.aString123 = arg1;
		Static688.aString118 = "Unknown";
		Static688.aString121 = "1.1";
		this.aBoolean913 = arg3;
		Static688.anInt10582 = arg0;
		try {
			Static688.aString118 = System.getProperty("java.vendor");
			Static688.aString121 = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		if (Static688.aString118.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean912 = true;
		}
		try {
			Static688.aString125 = System.getProperty("os.name");
		} catch (@Pc(72) Exception local72) {
			Static688.aString125 = "Unknown";
		}
		Static688.aString122 = Static688.aString125.toLowerCase();
		try {
			Static688.aString119 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(87) Exception local87) {
			Static688.aString119 = "";
		}
		try {
			Static688.aString124 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(97) Exception local97) {
			Static688.aString124 = "";
		}
		try {
			Static688.aString120 = System.getProperty("user.home");
			if (Static688.aString120 != null) {
				Static688.aString120 = Static688.aString120 + "/";
			}
		} catch (@Pc(117) Exception local117) {
		}
		if (Static688.aString120 == null) {
			Static688.aString120 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(131) Throwable local131) {
		}
		if (!this.aBoolean912) {
			try {
				Static688.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(151) Exception local151) {
			}
			try {
				Static688.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(168) Exception local168) {
			}
		}
		Static197.method2801(Static688.aString123, Static688.anInt10582);
		if (this.aBoolean913) {
			this.aClass268_4 = new Class268(Static197.method2799((String) null, "random.dat", Static688.anInt10582), "rw", 25L);
			this.aClass268_3 = new Class268(Static197.method2800("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass268_2 = new Class268(Static197.method2800("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass268Array1 = new Class268[arg2];
			for (@Pc(226) int local226 = 0; local226 < arg2; local226++) {
				this.aClass268Array1[local226] = new Class268(Static197.method2800("main_file_cache.idx" + local226), "rw", 1048576L);
			}
			if (this.aBoolean912) {
				try {
					this.anObject17 = Class.forName("rg").getDeclaredConstructor().newInstance();
				} catch (@Pc(271) Throwable local271) {
				}
			}
			try {
				if (this.aBoolean912) {
					this.aClass169_1 = new Class169();
				} else {
					this.anObject18 = Class.forName("wk").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(291) Throwable local291) {
			}
			try {
				if (this.aBoolean912) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject19 = Class.forName("ima").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(310) Throwable local310) {
			}
		}
		if (this.aBoolean913 && !this.aBoolean912) {
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
		this.aBoolean914 = false;
		this.aThread7 = new Thread(this);
		this.aThread7.setPriority(10);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!hma;")
	public Class163 method9262(@OriginalArg(0) String arg0) {
		return this.method9270(arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "client!vo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class163 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean914) {
						return;
					}
					if (this.aClass163_9 != null) {
						local15 = this.aClass163_9;
						this.aClass163_9 = this.aClass163_9.aClass163_2;
						if (this.aClass163_9 == null) {
							this.aClass163_8 = null;
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
				@Pc(42) int local42 = local15.anInt3846;
				if (local42 == 1) {
					if (Static567.method7863() < Static688.aLong333) {
						throw new IOException();
					}
					local15.anObject5 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt3844);
				} else if (local42 == 22) {
					if (Static567.method7863() < Static688.aLong333) {
						throw new IOException();
					}
					try {
						local15.anObject5 = Static618.method8401(local15.anInt3844, (String) local15.anObject4).method8346();
					} catch (@Pc(943) IOException_Sub1 local943) {
						local15.anObject5 = local943.getMessage();
						throw local943;
					}
				} else if (local42 == 2) {
					@Pc(907) Thread local907 = new Thread((Runnable) local15.anObject4);
					local907.setDaemon(true);
					local907.start();
					local907.setPriority(local15.anInt3844);
					local15.anObject5 = local907;
				} else if (local42 == 4) {
					if (Static567.method7863() < Static688.aLong333) {
						throw new IOException();
					}
					local15.anObject5 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local42 == 8) {
						local102 = (Object[]) local15.anObject4;
						if (this.aBoolean913 && ((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject5 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local42 == 9) {
						local102 = (Object[]) local15.anObject4;
						if (this.aBoolean913 && ((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject5 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local42 == 18) {
						@Pc(136) Clipboard local136 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject5 = local136.getContents((Object) null);
					} else if (local42 == 19) {
						@Pc(151) Transferable local151 = (Transferable) local15.anObject4;
						@Pc(154) Clipboard local154 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local154.setContents(local151, (ClipboardOwner) null);
					} else if (this.aBoolean913) {
						@Pc(349) String local349;
						if (local42 == 3) {
							if (Static567.method7863() < Static688.aLong333) {
								throw new IOException();
							}
							local349 = (local15.anInt3844 >> 24 & 0xFF) + "." + (local15.anInt3844 >> 16 & 0xFF) + "." + (local15.anInt3844 >> 8 & 0xFF) + "." + (local15.anInt3844 & 0xFF);
							local15.anObject5 = InetAddress.getByName(local349).getHostName();
						} else if (local42 == 21) {
							if (Static567.method7863() < Static688.aLong333) {
								throw new IOException();
							}
							local15.anObject5 = InetAddress.getByName((String) local15.anObject4).getAddress();
						} else if (local42 == 5) {
							if (this.aBoolean912) {
								local15.anObject5 = this.aClass169_1.method3677();
							} else {
								local15.anObject5 = Class.forName("wk").getMethod("listmodes").invoke(this.anObject18);
							}
						} else if (local42 == 6) {
							@Pc(682) Frame local682 = new Frame("Jagex Full Screen");
							local15.anObject5 = local682;
							local682.setResizable(false);
							if (this.aBoolean912) {
								this.aClass169_1.method3678(local15.anInt3845 >> 16, local15.anInt3844 & 0xFFFF, local15.anInt3845 & 0xFFFF, local15.anInt3844 >>> 16, local682);
							} else {
								Class.forName("wk").getMethod("enter", Static688.aClass57 == null ? (Static688.aClass57 = a("java.awt.Frame")) : Static688.aClass57, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject18, local682, Integer.valueOf(local15.anInt3844 >>> 16), new Integer(local15.anInt3844 & 0xFFFF), Integer.valueOf(local15.anInt3845 >> 16), new Integer(local15.anInt3845 & 0xFFFF));
							}
						} else if (local42 != 7) {
							@Pc(282) Class268 local282;
							if (local42 == 12) {
								local282 = Static688.method9266(Static688.anInt10582, (String) local15.anObject4, Static688.aString123);
								local15.anObject5 = local282;
							} else if (local42 == 13) {
								local282 = Static688.method9266(Static688.anInt10582, (String) local15.anObject4, "");
								local15.anObject5 = local282;
							} else if (this.aBoolean913 && local42 == 14) {
								@Pc(610) int local610 = local15.anInt3844;
								@Pc(613) int local613 = local15.anInt3845;
								if (this.aBoolean912) {
									this.aCallback_Sub1_1.method2142(local610, local613);
								} else {
									Class.forName("ima").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject19, Integer.valueOf(local610), new Integer(local613));
								}
							} else if (this.aBoolean913 && local42 == 15) {
								@Pc(545) boolean local545 = local15.anInt3844 != 0;
								@Pc(549) Component local549 = (Component) local15.anObject4;
								if (this.aBoolean912) {
									this.aCallback_Sub1_1.method2143(local549, local545);
								} else {
									Class.forName("ima").getDeclaredMethod("showcursor", Static688.aClass54 == null ? (Static688.aClass54 = a("java.awt.Component")) : Static688.aClass54, Boolean.TYPE).invoke(this.anObject19, local549, Boolean.valueOf(local545));
								}
							} else if (!this.aBoolean912 && local42 == 17) {
								local102 = (Object[]) local15.anObject4;
								Class.forName("ima").getDeclaredMethod("setcustomcursor", Static688.aClass54 == null ? (Static688.aClass54 = a("java.awt.Component")) : Static688.aClass54, Static688.aClass55 == null ? (Static688.aClass55 = a("[I")) : Static688.aClass55, Integer.TYPE, Integer.TYPE, Static688.aClass56 == null ? (Static688.aClass56 = a("java.awt.Point")) : Static688.aClass56).invoke(this.anObject19, (Component) local102[0], (int[]) local102[1], Integer.valueOf(local15.anInt3844), new Integer(local15.anInt3845), (Point) local102[2]);
							} else if (local42 == 16) {
								try {
									if (!Static688.aString122.startsWith("win")) {
										throw new Exception();
									}
									local349 = (String) local15.anObject4;
									if (!local349.startsWith("http://") && !local349.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(372) String local372 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(374) int local374 = 0; local349.length() > local374; local374++) {
										if (local372.indexOf(local349.charAt(local374)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local349 + "\"");
									local15.anObject5 = null;
								} catch (@Pc(416) Exception local416) {
									local15.anObject5 = local416;
									throw local416;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean912) {
							this.aClass169_1.method3679((Frame) local15.anObject4);
						} else {
							Class.forName("wk").getMethod("exit").invoke(this.anObject18);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt3843 = 1;
			} catch (@Pc(975) ThreadDeath local975) {
				throw local975;
			} catch (@Pc(978) Throwable local978) {
				local15.anInt3843 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
	public void method9264() {
		synchronized (this) {
			this.aBoolean914 = true;
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		if (this.aClass268_3 != null) {
			try {
				this.aClass268_3.method6511();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass268_2 != null) {
			try {
				this.aClass268_2.method6511();
			} catch (@Pc(50) IOException local50) {
			}
		}
		if (this.aClass268Array1 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.aClass268Array1.length; local56++) {
				if (this.aClass268Array1[local56] != null) {
					try {
						this.aClass268Array1[local56].method6511();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass268_4 != null) {
			try {
				this.aClass268_4.method6511();
			} catch (@Pc(94) IOException local94) {
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
	public void method9265() {
		Static688.aLong333 = Static567.method7863() + 5000L;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[IIILjava/awt/Component;Ljava/awt/Point;)Lclient!hma;")
	public Class163 method9267(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) Point arg4) {
		return this.method9270(new Object[] { arg3, arg1, arg4 }, 17, arg0, arg2);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLjava/net/URL;)Lclient!hma;")
	public Class163 method9268(@OriginalArg(1) URL arg0) {
		return this.method9270(arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lclient!hma;")
	public Class163 method9269(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2) {
		return this.method9270(new Object[] { arg0, arg2, arg1 }, 8, 0, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/Object;IZII)Lclient!hma;")
	private Class163 method9270(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class163 local3 = new Class163();
		local3.anObject4 = arg0;
		local3.anInt3846 = arg1;
		local3.anInt3845 = arg3;
		local3.anInt3844 = arg2;
		synchronized (this) {
			if (this.aClass163_8 == null) {
				this.aClass163_8 = this.aClass163_9 = local3;
			} else {
				this.aClass163_8.aClass163_2 = local3;
				this.aClass163_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!hma;")
	public Class163 method9271(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method9270(new Object[] { arg0, arg1 }, 9, 0, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Lclient!hma;")
	public Class163 method9272() {
		return this.method9270((Object) null, 5, 0, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)Lclient!hma;")
	public Class163 method9273(@OriginalArg(1) int arg0) {
		return this.method9270((Object) null, 3, arg0, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZII)Lclient!hma;")
	public Class163 method9274(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method9270((Object) null, 6, (arg0 << 16) + arg2, arg1 << 16);
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)Z")
	public boolean method9275() {
		if (!this.aBoolean913) {
			return false;
		} else if (this.aBoolean912) {
			return this.aClass169_1 != null;
		} else {
			return this.anObject18 != null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!hma;")
	public Class163 method9276(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method9270(arg0, 2, arg1, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!hma;")
	public Class163 method9277(@OriginalArg(2) String arg0) {
		return this.method9270(arg0, 12, 0, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!hma;")
	public Class163 method9278(@OriginalArg(1) Frame arg0) {
		return this.method9270(arg0, 7, 0, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLjava/lang/String;ZI)Lclient!hma;")
	public Class163 method9279(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return this.method9270(arg0, arg1 ? 22 : 1, arg2, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	public boolean method9280(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method9281() {
		return this.anObject17;
	}
}
