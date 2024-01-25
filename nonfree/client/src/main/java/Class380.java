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

@OriginalClass("client!vt")
public final class Class380 implements Runnable {

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Z")
	private boolean aBoolean727 = false;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!fe;")
	private Class103 aClass103_9 = null;

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "Lclient!fe;")
	private Class103 aClass103_10 = null;

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "Z")
	public boolean aBoolean729 = false;

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "Lclient!gba;")
	public Class114 aClass114_4 = null;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Z")
	public boolean aBoolean728 = false;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Lclient!gba;")
	public Class114 aClass114_3 = null;

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Lclient!gba;")
	public Class114 aClass114_2 = null;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "[Lclient!gba;")
	public Class114[] aClass114Array1;

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "Ljava/lang/Object;")
	private Object anObject29;

	@OriginalMember(owner = "client!vt", name = "B", descriptor = "Lclient!kq;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "Ljava/lang/Object;")
	private Object anObject28;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Lclient!ew;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "Ljava/lang/Object;")
	private Object anObject27;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class380(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		this.aBoolean729 = arg3;
		Static647.anInt10433 = arg0;
		Static647.aString148 = "1.1";
		Static647.aString143 = arg1;
		Static647.aString145 = "Unknown";
		try {
			Static647.aString145 = System.getProperty("java.vendor");
			Static647.aString148 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static647.aString145.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean728 = true;
		}
		try {
			Static647.aString146 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static647.aString146 = "Unknown";
		}
		Static647.aString144 = Static647.aString146.toLowerCase();
		try {
			Static647.aString147 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static647.aString147 = "";
		}
		try {
			Static647.aString150 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static647.aString150 = "";
		}
		try {
			Static647.aString149 = System.getProperty("user.home");
			if (Static647.aString149 != null) {
				Static647.aString149 = Static647.aString149 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static647.aString149 == null) {
			Static647.aString149 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean728) {
			try {
				Static647.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static647.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static361.method5210(Static647.aString143, Static647.anInt10433);
		if (this.aBoolean729) {
			this.aClass114_2 = new Class114(Static361.method5211("random.dat", Static647.anInt10433, (String) null), "rw", 25L);
			this.aClass114_4 = new Class114(Static361.method5212("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass114_3 = new Class114(Static361.method5212("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass114Array1 = new Class114[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass114Array1[local181] = new Class114(Static361.method5212("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean728) {
				try {
					this.anObject29 = Class.forName("Class237").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean728) {
					this.aClass197_1 = new Class197();
				} else {
					this.anObject28 = Class.forName("Class169").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean728) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject27 = Class.forName("Class282").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean729 && !this.aBoolean728) {
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
		this.aBoolean727 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BIIII)Lclient!fe;")
	public Class103 method8807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method8824(6, arg2 << 16, (arg0 << 16) + arg1, (Object) null);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method8808() {
		return this.anObject29;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/net/URL;)Lclient!fe;")
	public Class103 method8811(@OriginalArg(1) URL arg0) {
		return this.method8824(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lclient!fe;")
	public Class103 method8812(@OriginalArg(1) int arg0) {
		return this.method8824(3, 0, arg0, (Object) null);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(ILjava/lang/String;)Lclient!fe;")
	public Class103 method8813(@OriginalArg(1) String arg0) {
		return this.method8824(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!fe;")
	public Class103 method8814(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method8824(9, 0, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!fe;")
	public Class103 method8815(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method8824(2, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	public void method8816() {
		synchronized (this) {
			this.aBoolean727 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass114_4 != null) {
			try {
				this.aClass114_4.method2462();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass114_3 != null) {
			try {
				this.aClass114_3.method2462();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass114Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass114Array1.length; local52++) {
				if (this.aClass114Array1[local52] != null) {
					try {
						this.aClass114Array1[local52].method2462();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass114_2 != null) {
			try {
				this.aClass114_2.method2462();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	public boolean method8817(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z[ILjava/awt/Component;IILjava/awt/Point;)Lclient!fe;")
	public Class103 method8818(@OriginalArg(1) int[] arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method8824(17, arg3, arg2, new Object[] { arg1, arg0, arg4 });
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)Z")
	public boolean method8819() {
		if (!this.aBoolean729) {
			return false;
		} else if (this.aBoolean728) {
			return this.aClass197_1 != null;
		} else {
			return this.anObject28 != null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!fe;")
	public Class103 method8820(@OriginalArg(0) Frame arg0) {
		return this.method8824(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;ZII)Lclient!fe;")
	public Class103 method8821(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		return this.method8824(arg1 ? 22 : 1, 0, arg2, arg0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BZLjava/lang/String;)Lclient!fe;")
	public Class103 method8822(@OriginalArg(2) String arg0) {
		return this.method8824(12, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)Lclient!fe;")
	public Class103 method8823() {
		return this.method8824(5, 0, 0, (Object) null);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!fe;")
	private Class103 method8824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(8) Class103 local8 = new Class103();
		local8.anInt2542 = arg0;
		local8.anInt2543 = arg1;
		local8.anInt2540 = arg2;
		local8.anObject8 = arg3;
		synchronized (this) {
			if (this.aClass103_9 == null) {
				this.aClass103_9 = this.aClass103_10 = local8;
			} else {
				this.aClass103_9.aClass103_5 = local8;
				this.aClass103_9 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lclient!fe;")
	public Class103 method8825(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2) {
		return this.method8824(8, 0, 0, new Object[] { arg1, arg0, arg2 });
	}

	@OriginalMember(owner = "client!vt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class103 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean727) {
						return;
					}
					if (this.aClass103_10 != null) {
						local15 = this.aClass103_10;
						this.aClass103_10 = this.aClass103_10.aClass103_5;
						if (this.aClass103_10 == null) {
							this.aClass103_9 = null;
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
				@Pc(41) int local41 = local15.anInt2542;
				if (local41 == 1) {
					if (Static566.method7936() < Static647.aLong297) {
						throw new IOException();
					}
					local15.anObject9 = new Socket(InetAddress.getByName((String) local15.anObject8), local15.anInt2540);
				} else if (local41 == 22) {
					if (Static647.aLong297 > Static566.method7936()) {
						throw new IOException();
					}
					try {
						local15.anObject9 = Static547.method7790(local15.anInt2540, (String) local15.anObject8).method8761();
					} catch (@Pc(833) IOException_Sub1 local833) {
						local15.anObject9 = local833.getMessage();
						throw local833;
					}
				} else if (local41 == 2) {
					@Pc(63) Thread local63 = new Thread((Runnable) local15.anObject8);
					local63.setDaemon(true);
					local63.start();
					local63.setPriority(local15.anInt2540);
					local15.anObject9 = local63;
				} else if (local41 == 4) {
					if (Static566.method7936() < Static647.aLong297) {
						throw new IOException();
					}
					local15.anObject9 = new DataInputStream(((URL) local15.anObject8).openStream());
				} else {
					@Pc(116) Object[] local116;
					if (local41 == 8) {
						local116 = (Object[]) local15.anObject8;
						if (this.aBoolean729 && ((Class) local116[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject9 = ((Class) local116[0]).getDeclaredMethod((String) local116[1], (Class[]) local116[2]);
					} else if (local41 == 9) {
						local116 = (Object[]) local15.anObject8;
						if (this.aBoolean729 && ((Class) local116[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject9 = ((Class) local116[0]).getDeclaredField((String) local116[1]);
					} else if (local41 == 18) {
						@Pc(768) Clipboard local768 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject9 = local768.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(153) Transferable local153 = (Transferable) local15.anObject8;
						@Pc(156) Clipboard local156 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local156.setContents(local153, (ClipboardOwner) null);
					} else if (this.aBoolean729) {
						@Pc(213) String local213;
						if (local41 == 3) {
							if (Static566.method7936() < Static647.aLong297) {
								throw new IOException();
							}
							local213 = (local15.anInt2540 >> 24 & 0xFF) + "." + (local15.anInt2540 >> 16 & 0xFF) + "." + (local15.anInt2540 >> 8 & 0xFF) + "." + (local15.anInt2540 & 0xFF);
							local15.anObject9 = InetAddress.getByName(local213).getHostName();
						} else if (local41 == 21) {
							if (Static647.aLong297 > Static566.method7936()) {
								throw new IOException();
							}
							local15.anObject9 = InetAddress.getByName((String) local15.anObject8).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean728) {
								local15.anObject9 = this.aClass197_1.method4562();
							} else {
								local15.anObject9 = Class.forName("Class169").getMethod("listmodes").invoke(this.anObject28);
							}
						} else if (local41 == 6) {
							@Pc(282) Frame local282 = new Frame("Jagex Full Screen");
							local15.anObject9 = local282;
							local282.setResizable(false);
							if (this.aBoolean728) {
								this.aClass197_1.method4560(local15.anInt2540 & 0xFFFF, local15.anInt2543 & 0xFFFF, local15.anInt2543 >> 16, local15.anInt2540 >>> 16, local282);
							} else {
								Class.forName("Class169").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject28, local282, Integer.valueOf(local15.anInt2540 >>> 16), new Integer(local15.anInt2540 & 0xFFFF), Integer.valueOf(local15.anInt2543 >> 16), new Integer(local15.anInt2543 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(744) Class114 local744;
							if (local41 == 12) {
								local744 = Static647.method8810((String) local15.anObject8, Static647.anInt10433, Static647.aString143);
								local15.anObject9 = local744;
							} else if (local41 == 13) {
								local744 = Static647.method8810((String) local15.anObject8, Static647.anInt10433, "");
								local15.anObject9 = local744;
							} else if (this.aBoolean729 && local41 == 14) {
								@Pc(688) int local688 = local15.anInt2540;
								@Pc(691) int local691 = local15.anInt2543;
								if (this.aBoolean728) {
									this.aCallback_Sub1_1.method2096(local691, local688);
								} else {
									Class.forName("Class282").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject27, Integer.valueOf(local688), new Integer(local691));
								}
							} else if (this.aBoolean729 && local41 == 15) {
								@Pc(456) boolean local456 = local15.anInt2540 != 0;
								@Pc(460) Component local460 = (Component) local15.anObject8;
								if (this.aBoolean728) {
									this.aCallback_Sub1_1.method2095(local456, local460);
								} else {
									Class.forName("Class282").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject27, local460, Boolean.valueOf(local456));
								}
							} else if (!this.aBoolean728 && local41 == 17) {
								local116 = (Object[]) local15.anObject8;
								Class.forName("Class282").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject27, (Component) local116[0], (int[]) local116[1], Integer.valueOf(local15.anInt2540), new Integer(local15.anInt2543), (Point) local116[2]);
							} else if (local41 == 16) {
								try {
									if (!Static647.aString144.startsWith("win")) {
										throw new Exception();
									}
									local213 = (String) local15.anObject8;
									if (!local213.startsWith("http://") && !local213.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(549) String local549 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(551) int local551 = 0;
									while (true) {
										if (local213.length() <= local551) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local213 + "\"");
											local15.anObject9 = null;
											break;
										}
										if (local549.indexOf(local213.charAt(local551)) == -1) {
											throw new Exception();
										}
										local551++;
									}
								} catch (@Pc(585) Exception local585) {
									local15.anObject9 = local585;
									throw local585;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean728) {
							this.aClass197_1.method4561((Frame) local15.anObject8);
						} else {
							Class.forName("Class169").getMethod("exit").invoke(this.anObject28);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2541 = 1;
			} catch (@Pc(868) ThreadDeath local868) {
				throw local868;
			} catch (@Pc(871) Throwable local871) {
				local15.anInt2541 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(Z)V")
	public void method8826() {
		Static647.aLong297 = Static566.method7936() + 5000L;
	}
}
