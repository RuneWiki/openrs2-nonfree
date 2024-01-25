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

@OriginalClass("client!ew")
public final class Class99 implements Runnable {

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "Lclient!sr;")
	public Class317 aClass317_1 = null;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "Lclient!ae;")
	private Class5 aClass5_4 = null;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "Lclient!sr;")
	public Class317 aClass317_2 = null;

	@OriginalMember(owner = "client!ew", name = "v", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "Lclient!ae;")
	private Class5 aClass5_5 = null;

	@OriginalMember(owner = "client!ew", name = "B", descriptor = "Lclient!sr;")
	public Class317 aClass317_3 = null;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "[Lclient!sr;")
	public Class317[] aClass317Array1;

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "Lclient!be;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!ew", name = "u", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "Lclient!oca;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!ew", name = "A", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class99(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static132.aString31 = arg1;
		this.aBoolean151 = arg3;
		Static132.aString26 = "1.1";
		Static132.aString32 = "Unknown";
		Static132.anInt2141 = arg0;
		try {
			Static132.aString32 = System.getProperty("java.vendor");
			Static132.aString26 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static132.aString32.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean149 = true;
		}
		try {
			Static132.aString28 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static132.aString28 = "Unknown";
		}
		Static132.aString29 = Static132.aString28.toLowerCase();
		try {
			Static132.aString25 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static132.aString25 = "";
		}
		try {
			Static132.aString30 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static132.aString30 = "";
		}
		try {
			Static132.aString27 = System.getProperty("user.home");
			if (Static132.aString27 != null) {
				Static132.aString27 = Static132.aString27 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static132.aString27 == null) {
			Static132.aString27 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean149) {
			try {
				Static132.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static132.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static352.method5047(Static132.aString31, Static132.anInt2141);
		if (this.aBoolean151) {
			this.aClass317_2 = new Class317(Static352.method5045(Static132.anInt2141, null, "random.dat"), "rw", 25L);
			this.aClass317_1 = new Class317(Static352.method5046("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass317_3 = new Class317(Static352.method5046("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass317Array1 = new Class317[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass317Array1[local181] = new Class317(Static352.method5046("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean149) {
				try {
					this.anObject6 = Class.forName("Class315").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean149) {
					this.aClass29_1 = new Class29();
				} else {
					this.anObject5 = Class.forName("Class54").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean149) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject7 = Class.forName("Class237").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean151 && !this.aBoolean149) {
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
		this.aBoolean150 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Lclient!ae;")
	public Class5 method1772(@OriginalArg(0) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method1773(8, 0, new Object[] { arg0, arg2, arg1 }, 0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!ae;")
	private Class5 method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class5 local3 = new Class5();
		local3.anInt150 = arg3;
		local3.anObject2 = arg2;
		local3.anInt152 = arg1;
		local3.anInt153 = arg0;
		synchronized (this) {
			if (this.aClass5_4 == null) {
				this.aClass5_4 = this.aClass5_5 = local3;
			} else {
				this.aClass5_4.aClass5_1 = local3;
				this.aClass5_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIII)Lclient!ae;")
	public Class5 method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method1773(6, arg1 << 16, null, (arg0 << 16) + arg2);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!ae;")
	public Class5 method1775(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method1773(9, 0, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)Z")
	public boolean method1776() {
		if (!this.aBoolean151) {
			return false;
		} else if (this.aBoolean149) {
			return this.aClass29_1 != null;
		} else {
			return this.anObject5 != null;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!ae;")
	public Class5 method1777(@OriginalArg(1) Frame arg0) {
		return this.method1773(7, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V")
	public void method1778() {
		synchronized (this) {
			this.aBoolean150 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass317_1 != null) {
			try {
				this.aClass317_1.method6333();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass317_3 != null) {
			try {
				this.aClass317_3.method6333();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass317Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass317Array1.length; local50++) {
				if (this.aClass317Array1[local50] != null) {
					try {
						this.aClass317Array1[local50].method6333();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass317_2 != null) {
			try {
				this.aClass317_2.method6333();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILjava/awt/Point;I[ILjava/awt/Component;)Lclient!ae;")
	public Class5 method1779(@OriginalArg(1) int arg0, @OriginalArg(2) Point arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Component arg4) {
		return this.method1773(17, arg2, new Object[] { arg4, arg3, arg1 }, arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	public boolean method1780(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method1781() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)Lclient!ae;")
	public Class5 method1783(@OriginalArg(0) int arg0) {
		return this.method1773(3, 0, null, arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ae;")
	public Class5 method1784(@OriginalArg(1) URL arg0) {
		return this.method1773(4, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Lclient!ae;")
	public Class5 method1785() {
		return this.method1773(5, 0, null, 0);
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!ae;")
	public Class5 method1786(@OriginalArg(0) String arg0) {
		return this.method1773(16, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ae;")
	public Class5 method1787(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1773(2, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ew", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class5 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean150) {
						return;
					}
					if (this.aClass5_5 != null) {
						local15 = this.aClass5_5;
						this.aClass5_5 = this.aClass5_5.aClass5_1;
						if (this.aClass5_5 == null) {
							this.aClass5_4 = null;
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
				@Pc(41) int local41 = local15.anInt153;
				if (local41 == 1) {
					if (Static362.method5133() < Static132.aLong52) {
						throw new IOException();
					}
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt150);
				} else if (local41 == 22) {
					if (Static362.method5133() < Static132.aLong52) {
						throw new IOException();
					}
					try {
						local15.anObject1 = Static276.method4016(local15.anInt150, (String) local15.anObject2).method7531();
					} catch (@Pc(71) IOException_Sub1 local71) {
						local15.anObject1 = local71.getMessage();
						throw local71;
					}
				} else if (local41 == 2) {
					@Pc(819) Thread local819 = new Thread((Runnable) local15.anObject2);
					local819.setDaemon(true);
					local819.start();
					local819.setPriority(local15.anInt150);
					local15.anObject1 = local819;
				} else if (local41 == 4) {
					if (Static132.aLong52 > Static362.method5133()) {
						throw new IOException();
					}
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(113) Object[] local113;
					if (local41 == 8) {
						local113 = (Object[]) local15.anObject2;
						if (this.aBoolean151 && ((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject1 = ((Class) local113[0]).getDeclaredMethod((String) local113[1], (Class[]) local113[2]);
					} else if (local41 == 9) {
						local113 = (Object[]) local15.anObject2;
						if (this.aBoolean151 && ((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject1 = ((Class) local113[0]).getDeclaredField((String) local113[1]);
					} else if (local41 == 18) {
						@Pc(806) Clipboard local806 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject1 = local806.getContents(null);
					} else if (local41 == 19) {
						@Pc(795) Transferable local795 = (Transferable) local15.anObject2;
						@Pc(798) Clipboard local798 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local798.setContents(local795, null);
					} else if (this.aBoolean151) {
						@Pc(234) String local234;
						if (local41 == 3) {
							if (Static362.method5133() < Static132.aLong52) {
								throw new IOException();
							}
							local234 = (local15.anInt150 >> 24 & 0xFF) + "." + (local15.anInt150 >> 16 & 0xFF) + "." + (local15.anInt150 >> 8 & 0xFF) + "." + (local15.anInt150 & 0xFF);
							local15.anObject1 = InetAddress.getByName(local234).getHostName();
						} else if (local41 == 21) {
							if (Static132.aLong52 > Static362.method5133()) {
								throw new IOException();
							}
							local15.anObject1 = InetAddress.getByName((String) local15.anObject2).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean149) {
								local15.anObject1 = this.aClass29_1.method561();
							} else {
								local15.anObject1 = Class.forName("Class54").getMethod("listmodes").invoke(this.anObject5);
							}
						} else if (local41 == 6) {
							@Pc(256) Frame local256 = new Frame("Jagex Full Screen");
							local15.anObject1 = local256;
							local256.setResizable(false);
							if (this.aBoolean149) {
								this.aClass29_1.method559(local15.anInt152 >> 16, local15.anInt150 & 0xFFFF, local15.anInt152 & 0xFFFF, local15.anInt150 >>> 16, local256);
							} else {
								Class.forName("Class54").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject5, local256, Integer.valueOf(local15.anInt150 >>> 16), new Integer(local15.anInt150 & 0xFFFF), Integer.valueOf(local15.anInt152 >> 16), new Integer(local15.anInt152 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(411) Class317 local411;
							if (local41 == 12) {
								local411 = Static132.method1788(Static132.aString31, Static132.anInt2141, (String) local15.anObject2);
								local15.anObject1 = local411;
							} else if (local41 == 13) {
								local411 = Static132.method1788("", Static132.anInt2141, (String) local15.anObject2);
								local15.anObject1 = local411;
							} else if (this.aBoolean151 && local41 == 14) {
								@Pc(429) int local429 = local15.anInt150;
								@Pc(432) int local432 = local15.anInt152;
								if (this.aBoolean149) {
									this.aCallback_Sub1_1.method5252(local429, local432);
								} else {
									Class.forName("Class237").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject7, Integer.valueOf(local429), new Integer(local432));
								}
							} else if (this.aBoolean151 && local41 == 15) {
								@Pc(495) boolean local495 = local15.anInt150 != 0;
								@Pc(499) Component local499 = (Component) local15.anObject2;
								if (this.aBoolean149) {
									this.aCallback_Sub1_1.method5253(local495, local499);
								} else {
									Class.forName("Class237").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject7, local499, Boolean.valueOf(local495));
								}
							} else if (!this.aBoolean149 && local41 == 17) {
								local113 = (Object[]) local15.anObject2;
								Class.forName("Class237").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject7, (Component) local113[0], (int[]) local113[1], Integer.valueOf(local15.anInt150), new Integer(local15.anInt152), (Point) local113[2]);
							} else if (local41 == 16) {
								try {
									if (!Static132.aString29.startsWith("win")) {
										throw new Exception();
									}
									local234 = (String) local15.anObject2;
									if (!local234.startsWith("http://") && !local234.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(588) String local588 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(590) int local590 = 0;
									while (true) {
										if (local234.length() <= local590) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local234 + "\"");
											local15.anObject1 = null;
											break;
										}
										if (local588.indexOf(local234.charAt(local590)) == -1) {
											throw new Exception();
										}
										local590++;
									}
								} catch (@Pc(629) Exception local629) {
									local15.anObject1 = local629;
									throw local629;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean149) {
							this.aClass29_1.method560((Frame) local15.anObject2);
						} else {
							Class.forName("Class54").getMethod("exit").invoke(this.anObject5);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt151 = 1;
			} catch (@Pc(857) ThreadDeath local857) {
				throw local857;
			} catch (@Pc(860) Throwable local860) {
				local15.anInt151 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!ae;")
	public Class5 method1789(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		return arg0 ? this.method1773(12, 0, arg1, 0) : this.method1773(13, 0, arg1, 0);
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
	public void method1790() {
		Static132.aLong52 = Static362.method5133() + 5000L;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZLjava/lang/String;)Lclient!ae;")
	public Class5 method1791(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		return this.method1773(arg1 ? 22 : 1, 0, arg2, arg0);
	}
}
