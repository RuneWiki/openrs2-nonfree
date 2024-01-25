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
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "Lclient!ji;")
	public Class182 aClass182_1 = null;

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!cea", name = "x", descriptor = "Lclient!ot;")
	private Class268 aClass268_3 = null;

	@OriginalMember(owner = "client!cea", name = "y", descriptor = "Lclient!ji;")
	public Class182 aClass182_3 = null;

	@OriginalMember(owner = "client!cea", name = "r", descriptor = "Lclient!ot;")
	private Class268 aClass268_2 = null;

	@OriginalMember(owner = "client!cea", name = "u", descriptor = "Lclient!ji;")
	public Class182 aClass182_2 = null;

	@OriginalMember(owner = "client!cea", name = "q", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "[Lclient!ji;")
	public Class182[] aClass182Array1;

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "Ljava/lang/Object;")
	private Object anObject3;

	@OriginalMember(owner = "client!cea", name = "B", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "Lclient!oc;")
	private Class258 aClass258_1;

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "Ljava/lang/Object;")
	private Object anObject4;

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "Lclient!cc;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static72.aString20 = arg1;
		Static72.aString15 = "1.1";
		Static72.aString14 = "Unknown";
		this.aBoolean75 = arg3;
		Static72.anInt1366 = arg0;
		try {
			Static72.aString14 = System.getProperty("java.vendor");
			Static72.aString15 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static72.aString14.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean76 = true;
		}
		try {
			Static72.aString18 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static72.aString18 = "Unknown";
		}
		Static72.aString13 = Static72.aString18.toLowerCase();
		try {
			Static72.aString16 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static72.aString16 = "";
		}
		try {
			Static72.aString17 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static72.aString17 = "";
		}
		try {
			Static72.aString19 = System.getProperty("user.home");
			if (Static72.aString19 != null) {
				Static72.aString19 = Static72.aString19 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static72.aString19 == null) {
			Static72.aString19 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean76) {
			try {
				Static72.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static72.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static442.method7167(Static72.aString20, Static72.anInt1366);
		if (this.aBoolean75) {
			this.aClass182_3 = new Class182(Static442.method7166((String) null, Static72.anInt1366, "random.dat"), "rw", 25L);
			this.aClass182_1 = new Class182(Static442.method7165("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass182_2 = new Class182(Static442.method7165("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass182Array1 = new Class182[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass182Array1[local181] = new Class182(Static442.method7165("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean76) {
				try {
					this.anObject3 = Class.forName("Class284").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean76) {
					this.aClass258_1 = new Class258();
				} else {
					this.anObject5 = Class.forName("Class231").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean76) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject4 = Class.forName("Class43").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean75 && !this.aBoolean76) {
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
		this.aBoolean77 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "([IILjava/awt/Component;ILjava/awt/Point;B)Lclient!ot;")
	public Class268 method1305(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4) {
		return this.method1323(arg3, arg1, new Object[] { arg2, arg0, arg4 }, 17);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;ZI)Lclient!ot;")
	public Class268 method1306(@OriginalArg(0) String arg0) {
		return this.method1323(0, 0, arg0, 12);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ot;")
	public Class268 method1307(@OriginalArg(0) String arg0) {
		return this.method1323(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)Lclient!ot;")
	public Class268 method1308() {
		return this.method1323(0, 0, (Object) null, 5);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!ot;")
	public Class268 method1309(@OriginalArg(1) Frame arg0) {
		return this.method1323(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V")
	public void method1310() {
		Static72.aLong50 = Static99.method1701() + 5000L;
	}

	@OriginalMember(owner = "client!cea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class268 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean77) {
						return;
					}
					if (this.aClass268_3 != null) {
						local15 = this.aClass268_3;
						this.aClass268_3 = this.aClass268_3.aClass268_8;
						if (this.aClass268_3 == null) {
							this.aClass268_2 = null;
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
				@Pc(41) int local41 = local15.anInt8009;
				if (local41 == 1) {
					if (Static99.method1701() < Static72.aLong50) {
						throw new IOException();
					}
					local15.anObject19 = new Socket(InetAddress.getByName((String) local15.anObject18), local15.anInt8010);
				} else if (local41 == 22) {
					if (Static72.aLong50 > Static99.method1701()) {
						throw new IOException();
					}
					try {
						local15.anObject19 = Static563.method8550(local15.anInt8010, (String) local15.anObject18).method4886();
					} catch (@Pc(100) IOException_Sub1 local100) {
						local15.anObject19 = local100.getMessage();
						throw local100;
					}
				} else if (local41 == 2) {
					@Pc(116) Thread local116 = new Thread((Runnable) local15.anObject18);
					local116.setDaemon(true);
					local116.start();
					local116.setPriority(local15.anInt8010);
					local15.anObject19 = local116;
				} else if (local41 == 4) {
					if (Static99.method1701() < Static72.aLong50) {
						throw new IOException();
					}
					local15.anObject19 = new DataInputStream(((URL) local15.anObject18).openStream());
				} else {
					@Pc(164) Object[] local164;
					if (local41 == 8) {
						local164 = (Object[]) local15.anObject18;
						if (this.aBoolean75 && ((Class) local164[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject19 = ((Class) local164[0]).getDeclaredMethod((String) local164[1], (Class[]) local164[2]);
					} else if (local41 == 9) {
						local164 = (Object[]) local15.anObject18;
						if (this.aBoolean75 && ((Class) local164[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject19 = ((Class) local164[0]).getDeclaredField((String) local164[1]);
					} else if (local41 == 18) {
						@Pc(231) Clipboard local231 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject19 = local231.getContents((Object) null);
					} else if (local41 == 19) {
						@Pc(244) Transferable local244 = (Transferable) local15.anObject18;
						@Pc(247) Clipboard local247 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local247.setContents(local244, (ClipboardOwner) null);
					} else if (this.aBoolean75) {
						@Pc(360) String local360;
						if (local41 == 3) {
							if (Static99.method1701() < Static72.aLong50) {
								throw new IOException();
							}
							local360 = (local15.anInt8010 >> 24 & 0xFF) + "." + (local15.anInt8010 >> 16 & 0xFF) + "." + (local15.anInt8010 >> 8 & 0xFF) + "." + (local15.anInt8010 & 0xFF);
							local15.anObject19 = InetAddress.getByName(local360).getHostName();
						} else if (local41 == 21) {
							if (Static72.aLong50 > Static99.method1701()) {
								throw new IOException();
							}
							local15.anObject19 = InetAddress.getByName((String) local15.anObject18).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean76) {
								local15.anObject19 = this.aClass258_1.method6903();
							} else {
								local15.anObject19 = Class.forName("Class231").getMethod("listmodes").invoke(this.anObject5);
							}
						} else if (local41 == 6) {
							@Pc(642) Frame local642 = new Frame("Jagex Full Screen");
							local15.anObject19 = local642;
							local642.setResizable(false);
							if (this.aBoolean76) {
								this.aClass258_1.method6905(local15.anInt8010 & 0xFFFF, local15.anInt8010 >>> 16, local15.anInt8011 & 0xFFFF, local642, local15.anInt8011 >> 16);
							} else {
								Class.forName("Class231").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject5, local642, Integer.valueOf(local15.anInt8010 >>> 16), new Integer(local15.anInt8010 & 0xFFFF), Integer.valueOf(local15.anInt8011 >> 16), new Integer(local15.anInt8011 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(311) Class182 local311;
							if (local41 == 12) {
								local311 = Static72.method1311(Static72.aString20, (String) local15.anObject18, Static72.anInt1366);
								local15.anObject19 = local311;
							} else if (local41 == 13) {
								local311 = Static72.method1311("", (String) local15.anObject18, Static72.anInt1366);
								local15.anObject19 = local311;
							} else if (this.aBoolean75 && local41 == 14) {
								@Pc(577) int local577 = local15.anInt8010;
								@Pc(580) int local580 = local15.anInt8011;
								if (this.aBoolean76) {
									this.aCallback_Sub1_1.method1237(local580, local577);
								} else {
									Class.forName("Class43").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject4, Integer.valueOf(local577), new Integer(local580));
								}
							} else if (this.aBoolean75 && local41 == 15) {
								@Pc(521) boolean local521 = local15.anInt8010 != 0;
								@Pc(525) Component local525 = (Component) local15.anObject18;
								if (this.aBoolean76) {
									this.aCallback_Sub1_1.method1236(local525, local521);
								} else {
									Class.forName("Class43").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject4, local525, Boolean.valueOf(local521));
								}
							} else if (!this.aBoolean76 && local41 == 17) {
								local164 = (Object[]) local15.anObject18;
								Class.forName("Class43").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject4, (Component) local164[0], (int[]) local164[1], Integer.valueOf(local15.anInt8010), new Integer(local15.anInt8011), (Point) local164[2]);
							} else if (local41 == 16) {
								try {
									if (!Static72.aString13.startsWith("win")) {
										throw new Exception();
									}
									local360 = (String) local15.anObject18;
									if (!local360.startsWith("http://") && !local360.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(374) String local374 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(376) int local376 = 0;
									while (true) {
										if (local360.length() <= local376) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local360 + "\"");
											local15.anObject19 = null;
											break;
										}
										if (local374.indexOf(local360.charAt(local376)) == -1) {
											throw new Exception();
										}
										local376++;
									}
								} catch (@Pc(414) Exception local414) {
									local15.anObject19 = local414;
									throw local414;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean76) {
							this.aClass258_1.method6904((Frame) local15.anObject18);
						} else {
							Class.forName("Class231").getMethod("exit").invoke(this.anObject5);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt8008 = 1;
			} catch (@Pc(868) ThreadDeath local868) {
				throw local868;
			} catch (@Pc(871) Throwable local871) {
				local15.anInt8008 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method1312() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lclient!ot;")
	public Class268 method1313(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2) {
		return this.method1323(0, 0, new Object[] { arg0, arg2, arg1 }, 8);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!ot;")
	public Class268 method1314(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method1323(0, 0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)Z")
	public boolean method1315() {
		if (!this.aBoolean75) {
			return false;
		} else if (this.aBoolean76) {
			return this.aClass258_1 != null;
		} else {
			return this.anObject5 != null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;BIZ)Lclient!ot;")
	public Class268 method1316(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return this.method1323(0, arg1, arg0, arg2 ? 22 : 1);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!ot;")
	public Class268 method1317(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1323(0, arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/io/File;B[B)Z")
	public boolean method1319(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BI)Lclient!ot;")
	public Class268 method1320(@OriginalArg(1) int arg0) {
		return this.method1323(0, arg0, (Object) null, 3);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ot;")
	public Class268 method1321(@OriginalArg(1) URL arg0) {
		return this.method1323(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIII)Lclient!ot;")
	public Class268 method1322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method1323(arg2 << 16, (arg1 << 16) - -arg0, (Object) null, 6);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!ot;")
	private Class268 method1323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class268 local10 = new Class268();
		local10.anInt8011 = arg0;
		local10.anObject18 = arg2;
		local10.anInt8010 = arg1;
		local10.anInt8009 = arg3;
		synchronized (this) {
			if (this.aClass268_2 == null) {
				this.aClass268_2 = this.aClass268_3 = local10;
			} else {
				this.aClass268_2.aClass268_8 = local10;
				this.aClass268_2 = local10;
			}
			this.notify();
			return local10;
		}
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "(I)V")
	public void method1324() {
		synchronized (this) {
			this.aBoolean77 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass182_1 != null) {
			try {
				this.aClass182_1.method4769();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass182_2 != null) {
			try {
				this.aClass182_2.method4769();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass182Array1 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aClass182Array1.length; local51++) {
				if (this.aClass182Array1[local51] != null) {
					try {
						this.aClass182Array1[local51].method4769();
					} catch (@Pc(65) IOException local65) {
					}
				}
			}
		}
		if (this.aClass182_3 != null) {
			try {
				this.aClass182_3.method4769();
			} catch (@Pc(81) IOException local81) {
			}
		}
	}
}
