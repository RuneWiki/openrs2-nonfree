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

@OriginalClass("client!n")
public final class Class221 implements Runnable {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!oaa;")
	public Class235 aClass235_2 = null;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Z")
	public boolean aBoolean483 = false;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!oaa;")
	public Class235 aClass235_4 = null;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Z")
	private boolean aBoolean484 = false;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Lclient!kp;")
	private Class192 aClass192_6 = null;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "Z")
	public boolean aBoolean485 = false;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!oaa;")
	public Class235 aClass235_3 = null;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "Lclient!kp;")
	private Class192 aClass192_7 = null;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "[Lclient!oaa;")
	public Class235[] aClass235Array1;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Ljava/lang/Object;")
	private Object anObject41;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "Lclient!fw;")
	private Class108 aClass108_1;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Ljava/lang/Object;")
	private Object anObject42;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Ljava/lang/Object;")
	private Object anObject40;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!o;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class221(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static342.aString86 = "1.1";
		Static342.aString81 = "Unknown";
		this.aBoolean485 = arg3;
		Static342.anInt6023 = arg0;
		Static342.aString87 = arg1;
		try {
			Static342.aString81 = System.getProperty("java.vendor");
			Static342.aString86 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static342.aString81.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean483 = true;
		}
		try {
			Static342.aString84 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static342.aString84 = "Unknown";
		}
		Static342.aString82 = Static342.aString84.toLowerCase();
		try {
			Static342.aString85 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static342.aString85 = "";
		}
		try {
			Static342.aString83 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static342.aString83 = "";
		}
		try {
			Static342.aString80 = System.getProperty("user.home");
			if (Static342.aString80 != null) {
				Static342.aString80 = Static342.aString80 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static342.aString80 == null) {
			Static342.aString80 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean483) {
			try {
				Static342.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static342.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static399.method5829(Static342.aString87, Static342.anInt6023);
		if (this.aBoolean485) {
			this.aClass235_3 = new Class235(Static399.method5831("random.dat", null, Static342.anInt6023), "rw", 25L);
			this.aClass235_4 = new Class235(Static399.method5830("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass235_2 = new Class235(Static399.method5830("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass235Array1 = new Class235[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass235Array1[local181] = new Class235(Static399.method5830("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean483) {
				try {
					this.anObject41 = Class.forName("Class104").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean483) {
					this.aClass108_1 = new Class108();
				} else {
					this.anObject42 = Class.forName("Class334").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean483) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject40 = Class.forName("Class274").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean485 && !this.aBoolean483) {
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
		this.aBoolean484 = false;
		this.aThread5 = new Thread(this);
		this.aThread5.setPriority(10);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([BZLjava/io/File;)Z")
	public boolean method5190(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIZ)Lclient!kp;")
	public Class192 method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method5199(arg2 << 16, arg1 + (arg0 << 16), null, 6);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method5192() {
		return this.anObject41;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;ZBI)Lclient!kp;")
	public Class192 method5194(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		return this.method5199(0, arg2, arg0, arg1 ? 22 : 1);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!kp;")
	public Class192 method5195(@OriginalArg(0) URL arg0) {
		return this.method5199(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!kp;")
	public Class192 method5196(@OriginalArg(0) Frame arg0) {
		return this.method5199(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([IZLjava/awt/Point;IILjava/awt/Component;)Lclient!kp;")
	public Class192 method5197(@OriginalArg(0) int[] arg0, @OriginalArg(2) Point arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method5199(arg2, arg3, new Object[] { arg4, arg0, arg1 }, 17);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Lclient!kp;")
	public Class192 method5198(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method5199(0, arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!kp;")
	private Class192 method5199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class192 local3 = new Class192();
		local3.anObject31 = arg2;
		local3.anInt5184 = arg3;
		local3.anInt5185 = arg0;
		local3.anInt5187 = arg1;
		synchronized (this) {
			if (this.aClass192_7 == null) {
				this.aClass192_7 = this.aClass192_6 = local3;
			} else {
				this.aClass192_7.aClass192_5 = local3;
				this.aClass192_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;ZB)Lclient!kp;")
	public Class192 method5200(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method5199(0, 0, arg0, 12) : this.method5199(0, 0, arg0, 13);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public void method5201() {
		Static342.aLong172 = Static587.method7753() + 5000L;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!kp;")
	public Class192 method5202(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method5199(0, 0, new Object[] { arg1, arg0, arg2 }, 8);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lclient!kp;")
	public Class192 method5203(@OriginalArg(0) int arg0) {
		return this.method5199(0, arg0, null, 3);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)Z")
	public boolean method5204() {
		if (!this.aBoolean485) {
			return false;
		} else if (this.aBoolean483) {
			return this.aClass108_1 != null;
		} else {
			return this.anObject42 != null;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public void method5205() {
		synchronized (this) {
			this.aBoolean484 = true;
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		if (this.aClass235_4 != null) {
			try {
				this.aClass235_4.method5488();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass235_2 != null) {
			try {
				this.aClass235_2.method5488();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass235Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass235Array1.length; local47++) {
				if (this.aClass235Array1[local47] != null) {
					try {
						this.aClass235Array1[local47].method5488();
					} catch (@Pc(61) IOException local61) {
					}
				}
			}
		}
		if (this.aClass235_3 != null) {
			try {
				this.aClass235_3.method5488();
			} catch (@Pc(81) IOException local81) {
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)Lclient!kp;")
	public Class192 method5206() {
		return this.method5199(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class192 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean484) {
						return;
					}
					if (this.aClass192_6 != null) {
						local15 = this.aClass192_6;
						this.aClass192_6 = this.aClass192_6.aClass192_5;
						if (this.aClass192_6 == null) {
							this.aClass192_7 = null;
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
				@Pc(41) int local41 = local15.anInt5184;
				if (local41 == 1) {
					if (Static587.method7753() < Static342.aLong172) {
						throw new IOException();
					}
					local15.anObject30 = new Socket(InetAddress.getByName((String) local15.anObject31), local15.anInt5187);
				} else if (local41 == 22) {
					if (Static587.method7753() < Static342.aLong172) {
						throw new IOException();
					}
					try {
						local15.anObject30 = Static35.method622(local15.anInt5187, (String) local15.anObject31).method4818();
					} catch (@Pc(857) IOException_Sub1 local857) {
						local15.anObject30 = local857.getMessage();
						throw local857;
					}
				} else if (local41 == 2) {
					@Pc(822) Thread local822 = new Thread((Runnable) local15.anObject31);
					local822.setDaemon(true);
					local822.start();
					local822.setPriority(local15.anInt5187);
					local15.anObject30 = local822;
				} else if (local41 == 4) {
					if (Static587.method7753() < Static342.aLong172) {
						throw new IOException();
					}
					local15.anObject30 = new DataInputStream(((URL) local15.anObject31).openStream());
				} else {
					@Pc(91) Object[] local91;
					if (local41 == 8) {
						local91 = (Object[]) local15.anObject31;
						if (this.aBoolean485 && ((Class) local91[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject30 = ((Class) local91[0]).getDeclaredMethod((String) local91[1], (Class[]) local91[2]);
					} else if (local41 == 9) {
						local91 = (Object[]) local15.anObject31;
						if (this.aBoolean485 && ((Class) local91[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject30 = ((Class) local91[0]).getDeclaredField((String) local91[1]);
					} else if (local41 == 18) {
						@Pc(158) Clipboard local158 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject30 = local158.getContents(null);
					} else if (local41 == 19) {
						@Pc(173) Transferable local173 = (Transferable) local15.anObject31;
						@Pc(176) Clipboard local176 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local176.setContents(local173, null);
					} else if (this.aBoolean485) {
						@Pc(352) String local352;
						if (local41 == 3) {
							if (Static342.aLong172 > Static587.method7753()) {
								throw new IOException();
							}
							local352 = (local15.anInt5187 >> 24 & 0xFF) + "." + (local15.anInt5187 >> 16 & 0xFF) + "." + (local15.anInt5187 >> 8 & 0xFF) + "." + (local15.anInt5187 & 0xFF);
							local15.anObject30 = InetAddress.getByName(local352).getHostName();
						} else if (local41 == 21) {
							if (Static342.aLong172 > Static587.method7753()) {
								throw new IOException();
							}
							local15.anObject30 = InetAddress.getByName((String) local15.anObject31).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean483) {
								local15.anObject30 = this.aClass108_1.method2840();
							} else {
								local15.anObject30 = Class.forName("Class334").getMethod("listmodes").invoke(this.anObject42);
							}
						} else if (local41 == 6) {
							@Pc(575) Frame local575 = new Frame("Jagex Full Screen");
							local15.anObject30 = local575;
							local575.setResizable(false);
							if (this.aBoolean483) {
								this.aClass108_1.method2841(local15.anInt5185 & 0xFFFF, local15.anInt5187 & 0xFFFF, local575, local15.anInt5187 >>> 16, local15.anInt5185 >> 16);
							} else {
								Class.forName("Class334").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject42, local575, Integer.valueOf(local15.anInt5187 >>> 16), new Integer(local15.anInt5187 & 0xFFFF), Integer.valueOf(local15.anInt5185 >> 16), new Integer(local15.anInt5185 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(530) Class235 local530;
							if (local41 == 12) {
								local530 = Static342.method5193(Static342.aString87, (String) local15.anObject31, Static342.anInt6023);
								local15.anObject30 = local530;
							} else if (local41 == 13) {
								local530 = Static342.method5193("", (String) local15.anObject31, Static342.anInt6023);
								local15.anObject30 = local530;
							} else if (this.aBoolean485 && local41 == 14) {
								@Pc(474) int local474 = local15.anInt5187;
								@Pc(477) int local477 = local15.anInt5185;
								if (this.aBoolean483) {
									this.aCallback_Sub1_1.method5462(local474, local477);
								} else {
									Class.forName("Class274").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject40, Integer.valueOf(local474), new Integer(local477));
								}
							} else if (this.aBoolean485 && local41 == 15) {
								@Pc(418) boolean local418 = local15.anInt5187 != 0;
								@Pc(422) Component local422 = (Component) local15.anObject31;
								if (this.aBoolean483) {
									this.aCallback_Sub1_1.method5463(local418, local422);
								} else {
									Class.forName("Class274").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject40, local422, Boolean.valueOf(local418));
								}
							} else if (!this.aBoolean483 && local41 == 17) {
								local91 = (Object[]) local15.anObject31;
								Class.forName("Class274").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject40, (Component) local91[0], (int[]) local91[1], Integer.valueOf(local15.anInt5187), new Integer(local15.anInt5185), (Point) local91[2]);
							} else if (local41 == 16) {
								try {
									if (!Static342.aString82.startsWith("win")) {
										throw new Exception();
									}
									local352 = (String) local15.anObject31;
									if (!local352.startsWith("http://") && !local352.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(366) String local366 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(368) int local368 = 0;
									while (true) {
										if (local368 >= local352.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local352 + "\"");
											local15.anObject30 = null;
											break;
										}
										if (local366.indexOf(local352.charAt(local368)) == -1) {
											throw new Exception();
										}
										local368++;
									}
								} catch (@Pc(403) Exception local403) {
									local15.anObject30 = local403;
									throw local403;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean483) {
							this.aClass108_1.method2839((Frame) local15.anObject31);
						} else {
							Class.forName("Class334").getMethod("exit").invoke(this.anObject42);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5186 = 1;
			} catch (@Pc(868) ThreadDeath local868) {
				throw local868;
			} catch (@Pc(871) Throwable local871) {
				local15.anInt5186 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!kp;")
	public Class192 method5207(@OriginalArg(0) String arg0) {
		return this.method5199(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!kp;")
	public Class192 method5208(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method5199(0, 0, new Object[] { arg1, arg0 }, 9);
	}
}
