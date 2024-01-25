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

@OriginalClass("client!mca")
public final class Class230 implements Runnable {

	@OriginalMember(owner = "client!mca", name = "q", descriptor = "Z")
	private boolean aBoolean470 = false;

	@OriginalMember(owner = "client!mca", name = "y", descriptor = "Lclient!vd;")
	private Class366 aClass366_4 = null;

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "Lclient!qb;")
	public Class286 aClass286_2 = null;

	@OriginalMember(owner = "client!mca", name = "p", descriptor = "Lclient!qb;")
	public Class286 aClass286_3 = null;

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "Lclient!qb;")
	public Class286 aClass286_4 = null;

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "Z")
	public boolean aBoolean471 = false;

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "Lclient!vd;")
	private Class366 aClass366_5 = null;

	@OriginalMember(owner = "client!mca", name = "D", descriptor = "Z")
	public boolean aBoolean472 = false;

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!mca", name = "r", descriptor = "[Lclient!qb;")
	public Class286[] aClass286Array1;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "Ljava/lang/Object;")
	private Object anObject10;

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "Ljava/lang/Object;")
	private Object anObject12;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "Lclient!lf;")
	private Class213 aClass213_1;

	@OriginalMember(owner = "client!mca", name = "u", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!mca", name = "G", descriptor = "Lclient!ofa;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class230(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static359.aString86 = arg1;
		Static359.aString83 = "1.1";
		Static359.aString87 = "Unknown";
		this.aBoolean471 = arg3;
		Static359.anInt6278 = arg0;
		try {
			Static359.aString87 = System.getProperty("java.vendor");
			Static359.aString83 = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		if (Static359.aString87.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean472 = true;
		}
		try {
			Static359.aString80 = System.getProperty("os.name");
		} catch (@Pc(73) Exception local73) {
			Static359.aString80 = "Unknown";
		}
		Static359.aString85 = Static359.aString80.toLowerCase();
		try {
			Static359.aString82 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(88) Exception local88) {
			Static359.aString82 = "";
		}
		try {
			Static359.aString84 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(98) Exception local98) {
			Static359.aString84 = "";
		}
		try {
			Static359.aString81 = System.getProperty("user.home");
			if (Static359.aString81 != null) {
				Static359.aString81 = Static359.aString81 + "/";
			}
		} catch (@Pc(118) Exception local118) {
		}
		if (Static359.aString81 == null) {
			Static359.aString81 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(132) Throwable local132) {
		}
		if (!this.aBoolean472) {
			try {
				Static359.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(152) Exception local152) {
			}
			try {
				Static359.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(169) Exception local169) {
			}
		}
		Static527.method7594(Static359.anInt6278, Static359.aString86);
		if (this.aBoolean471) {
			this.aClass286_4 = new Class286(Static527.method7595("random.dat", Static359.anInt6278, (String) null), "rw", 25L);
			this.aClass286_2 = new Class286(Static527.method7593("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass286_3 = new Class286(Static527.method7593("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass286Array1 = new Class286[arg2];
			for (@Pc(227) int local227 = 0; local227 < arg2; local227++) {
				this.aClass286Array1[local227] = new Class286(Static527.method7593("main_file_cache.idx" + local227), "rw", 1048576L);
			}
			if (this.aBoolean472) {
				try {
					this.anObject10 = Class.forName("lh").getDeclaredConstructor().newInstance();
				} catch (@Pc(272) Throwable local272) {
				}
			}
			try {
				if (this.aBoolean472) {
					this.aClass213_1 = new Class213();
				} else {
					this.anObject12 = Class.forName("vda").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(292) Throwable local292) {
			}
			try {
				if (this.aBoolean472) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject11 = Class.forName("faa").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(311) Throwable local311) {
			}
		}
		if (this.aBoolean471 && !this.aBoolean472) {
			@Pc(323) ThreadGroup local323 = Thread.currentThread().getThreadGroup();
			for (@Pc(326) ThreadGroup local326 = local323.getParent(); local326 != null; local326 = local326.getParent()) {
				local323 = local326;
			}
			@Pc(337) Thread[] local337 = new Thread[1000];
			local323.enumerate(local337);
			for (@Pc(343) int local343 = 0; local343 < local337.length; local343++) {
				if (local337[local343] != null && local337[local343].getName().startsWith("AWT")) {
					local337[local343].setPriority(1);
				}
			}
		}
		this.aBoolean470 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Lclient!vd;")
	public Class366 method5342(@OriginalArg(0) int arg0) {
		return this.method5357(arg0, 0, (Object) null, 3);
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V")
	public void method5343() {
		Static359.aLong195 = Static515.method7499(80) + 5000L;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BZLjava/lang/String;)Lclient!vd;")
	public Class366 method5344(@OriginalArg(2) String arg0) {
		return this.method5357(0, 0, arg0, 12);
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)Lclient!vd;")
	public Class366 method5345() {
		return this.method5357(0, 0, (Object) null, 5);
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method5346() {
		return this.anObject10;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z")
	public boolean method5347() {
		if (!this.aBoolean471) {
			return false;
		} else if (this.aBoolean472) {
			return this.aClass213_1 != null;
		} else {
			return this.anObject12 != null;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;Z)Lclient!vd;")
	public Class366 method5348(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2) {
		return this.method5357(0, 0, new Object[] { arg1, arg0, arg2 }, 8);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!vd;")
	public Class366 method5349(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method5357(0, 0, new Object[] { arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!vd;")
	public Class366 method5350(@OriginalArg(0) String arg0) {
		return this.method5357(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
	public boolean method5351(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BLjava/net/URL;)Lclient!vd;")
	public Class366 method5352(@OriginalArg(1) URL arg0) {
		return this.method5357(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IBLjava/lang/String;Z)Lclient!vd;")
	public Class366 method5353(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		return this.method5357(arg0, 0, arg1, arg2 ? 22 : 1);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
	public void method5355() {
		synchronized (this) {
			this.aBoolean470 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass286_2 != null) {
			try {
				this.aClass286_2.method6820();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass286_3 != null) {
			try {
				this.aClass286_3.method6820();
			} catch (@Pc(48) IOException local48) {
			}
		}
		if (this.aClass286Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass286Array1.length; local54++) {
				if (this.aClass286Array1[local54] != null) {
					try {
						this.aClass286Array1[local54].method6820();
					} catch (@Pc(69) IOException local69) {
					}
				}
			}
		}
		if (this.aClass286_4 != null) {
			try {
				this.aClass286_4.method6820();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "client!mca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class366 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean470) {
						return;
					}
					if (this.aClass366_4 != null) {
						local15 = this.aClass366_4;
						this.aClass366_4 = this.aClass366_4.aClass366_9;
						if (this.aClass366_4 == null) {
							this.aClass366_5 = null;
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
				@Pc(42) int local42 = local15.anInt10203;
				if (local42 == 1) {
					if (Static515.method7499(90) < Static359.aLong195) {
						throw new IOException();
					}
					local15.anObject18 = new Socket(InetAddress.getByName((String) local15.anObject19), local15.anInt10204);
				} else if (local42 == 22) {
					if (Static359.aLong195 > Static515.method7499(72)) {
						throw new IOException();
					}
					try {
						local15.anObject18 = Static274.method4094((String) local15.anObject19, local15.anInt10204).method5296();
					} catch (@Pc(103) IOException_Sub1 local103) {
						local15.anObject18 = local103.getMessage();
						throw local103;
					}
				} else if (local42 == 2) {
					@Pc(119) Thread local119 = new Thread((Runnable) local15.anObject19);
					local119.setDaemon(true);
					local119.start();
					local119.setPriority(local15.anInt10204);
					local15.anObject18 = local119;
				} else if (local42 == 4) {
					if (Static359.aLong195 > Static515.method7499(78)) {
						throw new IOException();
					}
					local15.anObject18 = new DataInputStream(((URL) local15.anObject19).openStream());
				} else {
					@Pc(168) Object[] local168;
					if (local42 == 8) {
						local168 = (Object[]) local15.anObject19;
						if (this.aBoolean471 && ((Class) local168[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject18 = ((Class) local168[0]).getDeclaredMethod((String) local168[1], (Class[]) local168[2]);
					} else if (local42 == 9) {
						local168 = (Object[]) local15.anObject19;
						if (this.aBoolean471 && ((Class) local168[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject18 = ((Class) local168[0]).getDeclaredField((String) local168[1]);
					} else if (local42 == 18) {
						@Pc(922) Clipboard local922 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject18 = local922.getContents((Object) null);
					} else if (local42 == 19) {
						@Pc(219) Transferable local219 = (Transferable) local15.anObject19;
						@Pc(222) Clipboard local222 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local222.setContents(local219, (ClipboardOwner) null);
					} else if (this.aBoolean471) {
						@Pc(388) String local388;
						if (local42 == 3) {
							if (Static359.aLong195 > Static515.method7499(86)) {
								throw new IOException();
							}
							local388 = (local15.anInt10204 >> 24 & 0xFF) + "." + (local15.anInt10204 >> 16 & 0xFF) + "." + (local15.anInt10204 >> 8 & 0xFF) + "." + (local15.anInt10204 & 0xFF);
							local15.anObject18 = InetAddress.getByName(local388).getHostName();
						} else if (local42 == 21) {
							if (Static359.aLong195 > Static515.method7499(93)) {
								throw new IOException();
							}
							local15.anObject18 = InetAddress.getByName((String) local15.anObject19).getAddress();
						} else if (local42 == 5) {
							if (this.aBoolean472) {
								local15.anObject18 = this.aClass213_1.method5114();
							} else {
								local15.anObject18 = Class.forName("vda").getMethod("listmodes").invoke(this.anObject12);
							}
						} else if (local42 == 6) {
							@Pc(743) Frame local743 = new Frame("Jagex Full Screen");
							local15.anObject18 = local743;
							local743.setResizable(false);
							if (this.aBoolean472) {
								this.aClass213_1.method5115(local15.anInt10204 & 0xFFFF, local15.anInt10205 & 0xFFFF, local743, local15.anInt10204 >>> 16, local15.anInt10205 >> 16);
							} else {
								Class.forName("vda").getMethod("enter", Static359.aClass21 == null ? (Static359.aClass21 = a("java.awt.Frame")) : Static359.aClass21, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject12, local743, Integer.valueOf(local15.anInt10204 >>> 16), new Integer(local15.anInt10204 & 0xFFFF), Integer.valueOf(local15.anInt10205 >> 16), new Integer(local15.anInt10205 & 0xFFFF));
							}
						} else if (local42 != 7) {
							@Pc(328) Class286 local328;
							if (local42 == 12) {
								local328 = Static359.method5356(Static359.aString86, Static359.anInt6278, (String) local15.anObject19);
								local15.anObject18 = local328;
							} else if (local42 == 13) {
								local328 = Static359.method5356("", Static359.anInt6278, (String) local15.anObject19);
								local15.anObject18 = local328;
							} else if (this.aBoolean471 && local42 == 14) {
								@Pc(642) int local642 = local15.anInt10204;
								@Pc(645) int local645 = local15.anInt10205;
								if (this.aBoolean472) {
									this.aCallback_Sub1_1.method6238(local642, local645);
								} else {
									Class.forName("faa").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject11, Integer.valueOf(local642), new Integer(local645));
								}
							} else if (this.aBoolean471 && local42 == 15) {
								@Pc(578) boolean local578 = local15.anInt10204 != 0;
								@Pc(582) Component local582 = (Component) local15.anObject19;
								if (this.aBoolean472) {
									this.aCallback_Sub1_1.method6237(local578, local582);
								} else {
									Class.forName("faa").getDeclaredMethod("showcursor", Static359.aClass18 == null ? (Static359.aClass18 = a("java.awt.Component")) : Static359.aClass18, Boolean.TYPE).invoke(this.anObject11, local582, Boolean.valueOf(local578));
								}
							} else if (!this.aBoolean472 && local42 == 17) {
								local168 = (Object[]) local15.anObject19;
								Class.forName("faa").getDeclaredMethod("setcustomcursor", Static359.aClass18 == null ? (Static359.aClass18 = a("java.awt.Component")) : Static359.aClass18, Static359.aClass19 == null ? (Static359.aClass19 = a("[I")) : Static359.aClass19, Integer.TYPE, Integer.TYPE, Static359.aClass20 == null ? (Static359.aClass20 = a("java.awt.Point")) : Static359.aClass20).invoke(this.anObject11, (Component) local168[0], (int[]) local168[1], Integer.valueOf(local15.anInt10204), new Integer(local15.anInt10205), (Point) local168[2]);
							} else if (local42 == 16) {
								try {
									if (!Static359.aString85.startsWith("win")) {
										throw new Exception();
									}
									local388 = (String) local15.anObject19;
									if (!local388.startsWith("http://") && !local388.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(411) String local411 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(413) int local413 = 0;
									while (true) {
										if (local413 >= local388.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local388 + "\"");
											local15.anObject18 = null;
											break;
										}
										if (local411.indexOf(local388.charAt(local413)) == -1) {
											throw new Exception();
										}
										local413++;
									}
								} catch (@Pc(454) Exception local454) {
									local15.anObject18 = local454;
									throw local454;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean472) {
							this.aClass213_1.method5113((Frame) local15.anObject19);
						} else {
							Class.forName("vda").getMethod("exit").invoke(this.anObject12);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt10206 = 1;
			} catch (@Pc(964) ThreadDeath local964) {
				throw local964;
			} catch (@Pc(967) Throwable local967) {
				local15.anInt10206 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BIILjava/lang/Object;I)Lclient!vd;")
	private Class366 method5357(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class366 local3 = new Class366();
		local3.anObject19 = arg2;
		local3.anInt10205 = arg1;
		local3.anInt10204 = arg0;
		local3.anInt10203 = arg3;
		synchronized (this) {
			if (this.aClass366_5 == null) {
				this.aClass366_5 = this.aClass366_4 = local3;
			} else {
				this.aClass366_5.aClass366_9 = local3;
				this.aClass366_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZLjava/lang/Runnable;I)Lclient!vd;")
	public Class366 method5358(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method5357(arg1, 0, arg0, 2);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I[IIZLjava/awt/Component;Ljava/awt/Point;)Lclient!vd;")
	public Class366 method5359(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) Point arg4) {
		return this.method5357(arg0, arg2, new Object[] { arg3, arg1, arg4 }, 17);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!vd;")
	public Class366 method5360(@OriginalArg(0) Frame arg0) {
		return this.method5357(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIZI)Lclient!vd;")
	public Class366 method5361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method5357(arg0 + (arg2 << 16), arg1 << 16, (Object) null, 6);
	}
}
