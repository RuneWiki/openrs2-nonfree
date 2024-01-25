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

@OriginalClass("client!tga")
public final class Class349 implements Runnable {

	@OriginalMember(owner = "client!tga", name = "o", descriptor = "Z")
	private boolean aBoolean600 = false;

	@OriginalMember(owner = "client!tga", name = "s", descriptor = "Lclient!uga;")
	private Class361 aClass361_4 = null;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "Lclient!lm;")
	public Class223 aClass223_3 = null;

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "Lclient!lm;")
	public Class223 aClass223_4 = null;

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "Lclient!uga;")
	private Class361 aClass361_5 = null;

	@OriginalMember(owner = "client!tga", name = "j", descriptor = "Z")
	public boolean aBoolean601 = false;

	@OriginalMember(owner = "client!tga", name = "C", descriptor = "Lclient!lm;")
	public Class223 aClass223_2 = null;

	@OriginalMember(owner = "client!tga", name = "k", descriptor = "Z")
	public boolean aBoolean602 = false;

	@OriginalMember(owner = "client!tga", name = "p", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!tga", name = "E", descriptor = "[Lclient!lm;")
	public Class223[] aClass223Array1;

	@OriginalMember(owner = "client!tga", name = "q", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!tga", name = "r", descriptor = "Lclient!lg;")
	private Class220 aClass220_1;

	@OriginalMember(owner = "client!tga", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject15;

	@OriginalMember(owner = "client!tga", name = "n", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!tga", name = "f", descriptor = "Lclient!ll;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!tga", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class349(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static576.aString105 = arg1;
		Static576.aString110 = "Unknown";
		Static576.anInt9006 = arg0;
		Static576.aString107 = "1.1";
		this.aBoolean601 = arg3;
		try {
			Static576.aString110 = System.getProperty("java.vendor");
			Static576.aString107 = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		if (Static576.aString110.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean602 = true;
		}
		try {
			Static576.aString106 = System.getProperty("os.name");
		} catch (@Pc(72) Exception local72) {
			Static576.aString106 = "Unknown";
		}
		Static576.aString103 = Static576.aString106.toLowerCase();
		try {
			Static576.aString109 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(87) Exception local87) {
			Static576.aString109 = "";
		}
		try {
			Static576.aString104 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(97) Exception local97) {
			Static576.aString104 = "";
		}
		try {
			Static576.aString108 = System.getProperty("user.home");
			if (Static576.aString108 != null) {
				Static576.aString108 = Static576.aString108 + "/";
			}
		} catch (@Pc(117) Exception local117) {
		}
		if (Static576.aString108 == null) {
			Static576.aString108 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(131) Throwable local131) {
		}
		if (!this.aBoolean602) {
			try {
				Static576.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(151) Exception local151) {
			}
			try {
				Static576.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(168) Exception local168) {
			}
		}
		Static10.method147(Static576.aString105, Static576.anInt9006);
		if (this.aBoolean601) {
			this.aClass223_4 = new Class223(Static10.method148("random.dat", Static576.anInt9006, (String) null), "rw", 25L);
			this.aClass223_2 = new Class223(Static10.method149("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass223_3 = new Class223(Static10.method149("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass223Array1 = new Class223[arg2];
			for (@Pc(226) int local226 = 0; local226 < arg2; local226++) {
				this.aClass223Array1[local226] = new Class223(Static10.method149("main_file_cache.idx" + local226), "rw", 1048576L);
			}
			if (this.aBoolean602) {
				try {
					this.anObject13 = Class.forName("dg").getDeclaredConstructor().newInstance();
				} catch (@Pc(271) Throwable local271) {
				}
			}
			try {
				if (this.aBoolean602) {
					this.aClass220_1 = new Class220();
				} else {
					this.anObject15 = Class.forName("kj").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(291) Throwable local291) {
			}
			try {
				if (this.aBoolean602) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject14 = Class.forName("sl").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(310) Throwable local310) {
			}
		}
		if (this.aBoolean601 && !this.aBoolean602) {
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
		this.aBoolean600 = false;
		this.aThread7 = new Thread(this);
		this.aThread7.setPriority(10);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!uga;")
	public Class361 method7730(@OriginalArg(1) String arg0) {
		return this.method7743(0, arg0, 0, 16);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/lang/String;Z)Lclient!uga;")
	public Class361 method7731(@OriginalArg(1) String arg0) {
		return this.method7743(0, arg0, 0, 12);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	public boolean method7732(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method7733() {
		return this.anObject13;
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)V")
	public void method7735() {
		synchronized (this) {
			this.aBoolean600 = true;
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass223_2 != null) {
			try {
				this.aClass223_2.method5092();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass223_3 != null) {
			try {
				this.aClass223_3.method5092();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass223Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass223Array1.length; local52++) {
				if (this.aClass223Array1[local52] != null) {
					try {
						this.aClass223Array1[local52].method5092();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass223_4 != null) {
			try {
				this.aClass223_4.method5092();
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Z")
	public boolean method7736() {
		if (!this.aBoolean601) {
			return false;
		} else if (this.aBoolean602) {
			return this.aClass220_1 != null;
		} else {
			return this.anObject15 != null;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Class;Ljava/lang/Class;)Lclient!uga;")
	public Class361 method7737(@OriginalArg(0) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method7743(0, new Object[] { arg2, arg0, arg1 }, 0, 8);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!uga;")
	public Class361 method7738(@OriginalArg(1) Frame arg0) {
		return this.method7743(0, arg0, 0, 7);
	}

	@OriginalMember(owner = "client!tga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class361 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean600) {
						return;
					}
					if (this.aClass361_5 != null) {
						local15 = this.aClass361_5;
						this.aClass361_5 = this.aClass361_5.aClass361_6;
						if (this.aClass361_5 == null) {
							this.aClass361_4 = null;
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
				@Pc(42) int local42 = local15.anInt9722;
				if (local42 == 1) {
					if (Static480.method6763() < Static576.aLong266) {
						throw new IOException();
					}
					local15.anObject20 = new Socket(InetAddress.getByName((String) local15.anObject19), local15.anInt9719);
				} else if (local42 == 22) {
					if (Static576.aLong266 > Static480.method6763()) {
						throw new IOException();
					}
					try {
						local15.anObject20 = Static270.method4449(local15.anInt9719, (String) local15.anObject19).method1140();
					} catch (@Pc(957) IOException_Sub1 local957) {
						local15.anObject20 = local957.getMessage();
						throw local957;
					}
				} else if (local42 == 2) {
					@Pc(90) Thread local90 = new Thread((Runnable) local15.anObject19);
					local90.setDaemon(true);
					local90.start();
					local90.setPriority(local15.anInt9719);
					local15.anObject20 = local90;
				} else if (local42 == 4) {
					if (Static480.method6763() < Static576.aLong266) {
						throw new IOException();
					}
					local15.anObject20 = new DataInputStream(((URL) local15.anObject19).openStream());
				} else {
					@Pc(119) Object[] local119;
					if (local42 == 8) {
						local119 = (Object[]) local15.anObject19;
						if (this.aBoolean601 && ((Class) local119[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject20 = ((Class) local119[0]).getDeclaredMethod((String) local119[1], (Class[]) local119[2]);
					} else if (local42 == 9) {
						local119 = (Object[]) local15.anObject19;
						if (this.aBoolean601 && ((Class) local119[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject20 = ((Class) local119[0]).getDeclaredField((String) local119[1]);
					} else if (local42 == 18) {
						@Pc(872) Clipboard local872 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject20 = local872.getContents((Object) null);
					} else if (local42 == 19) {
						@Pc(170) Transferable local170 = (Transferable) local15.anObject19;
						@Pc(173) Clipboard local173 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local173.setContents(local170, (ClipboardOwner) null);
					} else if (this.aBoolean601) {
						@Pc(598) String local598;
						if (local42 == 3) {
							if (Static576.aLong266 > Static480.method6763()) {
								throw new IOException();
							}
							local598 = (local15.anInt9719 >> 24 & 0xFF) + "." + (local15.anInt9719 >> 16 & 0xFF) + "." + (local15.anInt9719 >> 8 & 0xFF) + "." + (local15.anInt9719 & 0xFF);
							local15.anObject20 = InetAddress.getByName(local598).getHostName();
						} else if (local42 == 21) {
							if (Static576.aLong266 > Static480.method6763()) {
								throw new IOException();
							}
							local15.anObject20 = InetAddress.getByName((String) local15.anObject19).getAddress();
						} else if (local42 == 5) {
							if (this.aBoolean602) {
								local15.anObject20 = this.aClass220_1.method4995();
							} else {
								local15.anObject20 = Class.forName("kj").getMethod("listmodes").invoke(this.anObject15);
							}
						} else if (local42 == 6) {
							@Pc(241) Frame local241 = new Frame("Jagex Full Screen");
							local15.anObject20 = local241;
							local241.setResizable(false);
							if (this.aBoolean602) {
								this.aClass220_1.method4994(local15.anInt9719 & 0xFFFF, local15.anInt9721 & 0xFFFF, local15.anInt9719 >>> 16, local241, local15.anInt9721 >> 16);
							} else {
								Class.forName("kj").getMethod("enter", Static576.aClass22 == null ? (Static576.aClass22 = a("java.awt.Frame")) : Static576.aClass22, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject15, local241, Integer.valueOf(local15.anInt9719 >>> 16), new Integer(local15.anInt9719 & 0xFFFF), Integer.valueOf(local15.anInt9721 >> 16), new Integer(local15.anInt9721 & 0xFFFF));
							}
						} else if (local42 != 7) {
							@Pc(415) Class223 local415;
							if (local42 == 12) {
								local415 = Static576.method7739(Static576.anInt9006, (String) local15.anObject19, Static576.aString105);
								local15.anObject20 = local415;
							} else if (local42 == 13) {
								local415 = Static576.method7739(Static576.anInt9006, (String) local15.anObject19, "");
								local15.anObject20 = local415;
							} else if (this.aBoolean601 && local42 == 14) {
								@Pc(432) int local432 = local15.anInt9719;
								@Pc(435) int local435 = local15.anInt9721;
								if (this.aBoolean602) {
									this.aCallback_Sub1_1.method5084(local432, local435);
								} else {
									Class.forName("sl").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject14, Integer.valueOf(local432), new Integer(local435));
								}
							} else if (this.aBoolean601 && local42 == 15) {
								@Pc(503) boolean local503 = local15.anInt9719 != 0;
								@Pc(507) Component local507 = (Component) local15.anObject19;
								if (this.aBoolean602) {
									this.aCallback_Sub1_1.method5085(local503, local507);
								} else {
									Class.forName("sl").getDeclaredMethod("showcursor", Static576.aClass23 == null ? (Static576.aClass23 = a("java.awt.Component")) : Static576.aClass23, Boolean.TYPE).invoke(this.anObject14, local507, Boolean.valueOf(local503));
								}
							} else if (!this.aBoolean602 && local42 == 17) {
								local119 = (Object[]) local15.anObject19;
								Class.forName("sl").getDeclaredMethod("setcustomcursor", Static576.aClass23 == null ? (Static576.aClass23 = a("java.awt.Component")) : Static576.aClass23, Static576.aClass24 == null ? (Static576.aClass24 = a("[I")) : Static576.aClass24, Integer.TYPE, Integer.TYPE, Static576.aClass25 == null ? (Static576.aClass25 = a("java.awt.Point")) : Static576.aClass25).invoke(this.anObject14, (Component) local119[0], (int[]) local119[1], Integer.valueOf(local15.anInt9719), new Integer(local15.anInt9721), (Point) local119[2]);
							} else if (local42 == 16) {
								try {
									if (!Static576.aString103.startsWith("win")) {
										throw new Exception();
									}
									local598 = (String) local15.anObject19;
									if (!local598.startsWith("http://") && !local598.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(621) String local621 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(623) int local623 = 0;
									while (true) {
										if (local623 >= local598.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local598 + "\"");
											local15.anObject20 = null;
											break;
										}
										if (local621.indexOf(local598.charAt(local623)) == -1) {
											throw new Exception();
										}
										local623++;
									}
								} catch (@Pc(664) Exception local664) {
									local15.anObject20 = local664;
									throw local664;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean602) {
							this.aClass220_1.method4993((Frame) local15.anObject19);
						} else {
							Class.forName("kj").getMethod("exit").invoke(this.anObject15);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt9720 = 1;
			} catch (@Pc(968) ThreadDeath local968) {
				throw local968;
			} catch (@Pc(971) Throwable local971) {
				local15.anInt9720 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[ILjava/awt/Component;ILjava/awt/Point;)Lclient!uga;")
	public Class361 method7740(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method7743(arg0, new Object[] { arg2, arg1, arg4 }, arg3, 17);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/net/URL;)Lclient!uga;")
	public Class361 method7741(@OriginalArg(1) URL arg0) {
		return this.method7743(0, arg0, 0, 4);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;ZII)Lclient!uga;")
	public Class361 method7742(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return this.method7743(0, arg0, arg2, arg1 ? 22 : 1);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!uga;")
	private Class361 method7743(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class361 local3 = new Class361();
		local3.anInt9719 = arg2;
		local3.anInt9722 = arg3;
		local3.anObject19 = arg1;
		local3.anInt9721 = arg0;
		synchronized (this) {
			if (this.aClass361_4 == null) {
				this.aClass361_4 = this.aClass361_5 = local3;
			} else {
				this.aClass361_4.aClass361_6 = local3;
				this.aClass361_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "(I)Lclient!uga;")
	public Class361 method7744() {
		return this.method7743(0, (Object) null, 0, 5);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V")
	public void method7745() {
		Static576.aLong266 = Static480.method6763() + 5000L;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!uga;")
	public Class361 method7746(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method7743(0, arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(II)Lclient!uga;")
	public Class361 method7747(@OriginalArg(1) int arg0) {
		return this.method7743(0, (Object) null, arg0, 3);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!uga;")
	public Class361 method7748(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method7743(0, new Object[] { arg0, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIII)Lclient!uga;")
	public Class361 method7749(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method7743(arg0 << 16, (Object) null, (arg1 << 16) + arg2, 6);
	}
}
