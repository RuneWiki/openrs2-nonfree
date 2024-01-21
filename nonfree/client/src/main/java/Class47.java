import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!ra;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "[Lclient!pa;")
	public Class75[] aClass75Array1;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!pa;")
	public Class75 aClass75_2 = null;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!ef;")
	private Class29 aClass29_4 = null;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!ef;")
	private Class29 aClass29_5 = null;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!pa;")
	public Class75 aClass75_1 = null;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Lclient!pa;")
	public Class75 aClass75_3 = null;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class47(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static94.aString4 = "1.1";
		Static94.aString2 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static94.aString2 = System.getProperty("java.vendor");
			Static94.aString4 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static94.aString3 = System.getProperty("user.home");
			if (Static94.aString3 != null) {
				Static94.aString3 = Static94.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static94.aString3 == null) {
			Static94.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static94.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static94.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static94.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static94.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1367(arg2, arg4, arg3);
		}
		this.aBoolean102 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ef;")
	public Class29 method1360(@OriginalArg(1) URL arg0) {
		return this.method1362(0, arg0, 4);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Lclient!ra;")
	public Interface3 method1361() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!ef;")
	private Class29 method1362(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class29 local9 = new Class29();
		local9.anObject1 = arg1;
		local9.anInt974 = arg2;
		local9.anInt975 = arg0;
		synchronized (this) {
			if (this.aClass29_5 == null) {
				this.aClass29_5 = this.aClass29_4 = local9;
			} else {
				this.aClass29_5.aClass29_2 = local9;
				this.aClass29_5 = local9;
			}
			this.notify();
			return local9;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/Runnable;IZ)Lclient!ef;")
	public Class29 method1363(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method1362(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public void method1364() {
		synchronized (this) {
			this.aBoolean102 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass75_3 != null) {
			try {
				this.aClass75_3.method2153();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass75_1 != null) {
			try {
				this.aClass75_1.method2153();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass75Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass75Array1.length; local52++) {
				if (this.aClass75Array1[local52] != null) {
					try {
						this.aClass75Array1[local52].method2153();
					} catch (@Pc(68) IOException local68) {
					}
				}
			}
		}
		if (this.aClass75_2 != null) {
			try {
				this.aClass75_2.method2153();
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!ef;")
	public Class29 method1365(@OriginalArg(1) int arg0) {
		return this.method1362(arg0, null, 3);
	}

	@OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class29 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean102) {
						return;
					}
					if (this.aClass29_4 != null) {
						local15 = this.aClass29_4;
						this.aClass29_4 = this.aClass29_4.aClass29_2;
						if (this.aClass29_4 == null) {
							this.aClass29_5 = null;
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
				@Pc(41) int local41 = local15.anInt974;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt975);
				} else if (local41 == 2) {
					@Pc(117) Thread local117 = new Thread((Runnable) local15.anObject1);
					local117.setDaemon(true);
					local117.start();
					local117.setPriority(local15.anInt975);
					local15.anObject2 = local117;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(68) Object[] local68;
					if (local41 == 8) {
						local68 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local68[0]).getDeclaredMethod((String) local68[1], (Class[]) local68[2]);
					} else if (local41 == 9) {
						local68 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local68[0]).getDeclaredField((String) local68[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt973 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt973 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lclient!ef;")
	public Class29 method1366(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method1362(0, new Object[] { arg1, arg0, arg2 }, 8);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIBLjava/lang/String;)V")
	private void method1367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(32) String[] local32 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static94.aString3, "/tmp/", "" };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local32.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local75.length; local83++) {
					try {
						@Pc(88) String local88 = local75[local83];
						if (local88.length() > 0 && !(new File(local88)).exists()) {
							continue;
						}
						@Pc(111) File local111 = new File(local88 + local32[local80]);
						@Pc(120) boolean local120;
						if (local77 == 1 && !local111.exists()) {
							local120 = local111.mkdir();
							if (!local120) {
								continue;
							}
						}
						@Pc(132) File local132;
						if (this.aClass75_2 == null) {
							try {
								local132 = new File(local111, "random.dat");
								if (local77 == 1 || local132.exists()) {
									this.aClass75_2 = new Class75(local132, "rw", 25L);
								}
							} catch (@Pc(148) Exception local148) {
								this.aClass75_2 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local111 = new File(local111, arg2);
								if (local77 == 1 && !local111.exists()) {
									local120 = local111.mkdir();
									if (!local120) {
										continue;
									}
								}
								local132 = new File(local111, "main_file_cache.dat2");
								if (local77 == 0 && !local132.exists()) {
									continue;
								}
								this.aClass75_3 = new Class75(local132, "rw", 104857600L);
								this.aClass75Array1 = new Class75[arg1];
								for (@Pc(203) int local203 = 0; local203 < arg1; local203++) {
									this.aClass75Array1[local203] = new Class75(new File(local111, "main_file_cache.idx" + local203), "rw", 1048576L);
								}
								this.aClass75_1 = new Class75(new File(local111, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local111;
							} catch (@Pc(248) Exception local248) {
								try {
									this.aClass75_3.method2153();
									for (@Pc(254) int local254 = 0; local254 < arg1; local254++) {
										this.aClass75Array1[local254].method2153();
									}
									this.aClass75_1.method2153();
								} catch (@Pc(275) Exception local275) {
								}
								this.aClass75Array1 = null;
								this.aFile1 = this.aFile2 = null;
								this.aClass75_3 = this.aClass75_1 = null;
							}
						}
					} catch (@Pc(292) Exception local292) {
					}
					if (this.aClass75_2 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!ef;")
	public Class29 method1368(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method1362(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!ef;")
	public Class29 method1369(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1362(0, new Object[] { arg1, arg0 }, 9);
	}
}
