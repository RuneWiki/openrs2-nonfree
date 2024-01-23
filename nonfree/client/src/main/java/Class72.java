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

@OriginalClass("client!mi")
public final class Class72 implements Runnable {

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!uj;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "[Lclient!ej;")
	public Class35[] aClass35Array1;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "Lclient!ej;")
	public Class35 aClass35_1 = null;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Lclient!fa;")
	private Class38 aClass38_6 = null;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Lclient!fa;")
	private Class38 aClass38_5 = null;

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "Lclient!ej;")
	public Class35 aClass35_3 = null;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "Lclient!ej;")
	public Class35 aClass35_2 = null;

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class72(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static130.aString3 = "Unknown";
		Static130.aString4 = "1.1";
		this.anApplet1 = arg1;
		try {
			Static130.aString3 = System.getProperty("java.vendor");
			Static130.aString4 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static130.aString5 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(49) Exception local49) {
			Static130.aString5 = "unknown";
		}
		try {
			Static130.aString2 = System.getProperty("user.home");
			if (Static130.aString2 != null) {
				Static130.aString2 = Static130.aString2 + "/";
			}
		} catch (@Pc(67) Exception local67) {
		}
		if (Static130.aString2 == null) {
			Static130.aString2 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(77) Throwable local77) {
		}
		try {
			if (arg1 == null) {
				Static130.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static130.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(104) Exception local104) {
		}
		try {
			if (arg1 == null) {
				Static130.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static130.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(131) Exception local131) {
		}
		if (arg0) {
			this.method2251(arg3, arg4, arg2);
		}
		this.aBoolean129 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Class;Ljava/lang/Class;)Lclient!fa;")
	public Class38 method2245(@OriginalArg(0) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method2256(new Object[] { arg2, arg0, arg1 }, 8, 0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!fa;")
	public Class38 method2246(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2256(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!fa;")
	public Class38 method2247(@OriginalArg(0) String arg0) {
		return this.method2256(arg0, 12, 0);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!fa;")
	public Class38 method2249(@OriginalArg(0) Class arg0) {
		return this.method2256(arg0, 11, 0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!fa;")
	public Class38 method2250(@OriginalArg(0) URL arg0) {
		return this.method2256(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;BII)V")
	private void method2251(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(34) String[] local34 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(69) String[] local69 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static130.aString2, "/tmp/", "" };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(82) int local82 = 0; local82 < local34.length; local82++) {
				for (@Pc(85) int local85 = 0; local85 < local69.length; local85++) {
					try {
						@Pc(90) String local90 = local69[local85];
						if (local90.length() > 0 && !(new File(local90)).exists()) {
							continue;
						}
						@Pc(116) File local116 = new File(local90 + local34[local82]);
						@Pc(127) boolean local127;
						if (local71 == 1 && !local116.exists()) {
							local127 = local116.mkdir();
							if (!local127) {
								continue;
							}
						}
						@Pc(139) File local139;
						if (this.aClass35_2 == null) {
							try {
								local139 = new File(local116, "random.dat");
								if (local71 == 1 || local139.exists()) {
									this.aClass35_2 = new Class35(local139, "rw", 25L);
								}
							} catch (@Pc(155) Exception local155) {
								this.aClass35_2 = null;
							}
						}
						if (this.aFile3 == null) {
							try {
								local116 = new File(local116, arg0);
								if (local71 == 1 && !local116.exists()) {
									local127 = local116.mkdir();
									if (!local127) {
										continue;
									}
								}
								local139 = new File(local116, "main_file_cache.dat2");
								if (local71 == 0 && !local139.exists()) {
									continue;
								}
								this.aClass35_3 = new Class35(local139, "rw", 104857600L);
								this.aClass35Array1 = new Class35[arg1];
								for (@Pc(207) int local207 = 0; local207 < arg1; local207++) {
									this.aClass35Array1[local207] = new Class35(new File(local116, "main_file_cache.idx" + local207), "rw", 1048576L);
								}
								this.aClass35_1 = new Class35(new File(local116, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local116;
							} catch (@Pc(256) Exception local256) {
								try {
									this.aClass35_3.method921();
									for (@Pc(262) int local262 = 0; local262 < arg1; local262++) {
										this.aClass35Array1[local262].method921();
									}
									this.aClass35_1.method921();
								} catch (@Pc(279) Exception local279) {
								}
								this.aFile2 = this.aFile3 = null;
								this.aClass35_3 = this.aClass35_1 = null;
								this.aClass35Array1 = null;
							}
						}
					} catch (@Pc(296) Exception local296) {
					}
					if (this.aClass35_2 != null && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!fa;")
	public Class38 method2252(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method2256(new Object[] { arg0, arg1 }, 9, 0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Lclient!fa;")
	public Class38 method2253(@OriginalArg(1) int arg0) {
		return this.method2256(null, 3, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;IB)Lclient!fa;")
	public Class38 method2254(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2256(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lclient!uj;")
	public Interface4 method2255() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!mi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class38 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean129) {
						return;
					}
					if (this.aClass38_6 != null) {
						local15 = this.aClass38_6;
						this.aClass38_6 = this.aClass38_6.aClass38_3;
						if (this.aClass38_6 == null) {
							this.aClass38_5 = null;
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
				@Pc(41) int local41 = local15.anInt1234;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt1235);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject2);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1235);
					local15.anObject3 = local56;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(86) Object[] local86;
					if (local41 == 8) {
						local86 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local86[0]).getDeclaredMethod((String) local86[1], (Class[]) local86[2]);
					} else if (local41 == 9) {
						local86 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local86[0]).getDeclaredField((String) local86[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1236 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt1236 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lclient!fa;")
	private Class38 method2256(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class38 local3 = new Class38();
		local3.anInt1235 = arg2;
		local3.anObject2 = arg0;
		local3.anInt1234 = arg1;
		synchronized (this) {
			if (this.aClass38_5 == null) {
				this.aClass38_5 = this.aClass38_6 = local3;
			} else {
				this.aClass38_5.aClass38_3 = local3;
				this.aClass38_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	public void method2257() {
		synchronized (this) {
			this.aBoolean129 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass35_3 != null) {
			try {
				this.aClass35_3.method921();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass35_1 != null) {
			try {
				this.aClass35_1.method921();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass35Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass35Array1.length; local44++) {
				if (this.aClass35Array1[local44] != null) {
					try {
						this.aClass35Array1[local44].method921();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass35_2 != null) {
			try {
				this.aClass35_2.method921();
			} catch (@Pc(74) IOException local74) {
			}
		}
	}
}
