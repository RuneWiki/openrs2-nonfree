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

@OriginalClass("client!hf")
public final class Class41 implements Runnable {

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "[Lclient!ri;")
	public Class88[] aClass88Array1;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "Lclient!cf;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!la;")
	private Class56 aClass56_8 = null;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!ri;")
	public Class88 aClass88_2 = null;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!la;")
	private Class56 aClass56_9 = null;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!ri;")
	public Class88 aClass88_3 = null;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Lclient!ri;")
	public Class88 aClass88_4 = null;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class41(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static75.aString4 = "Unknown";
		Static75.aString2 = "1.1";
		this.anApplet1 = arg1;
		try {
			Static75.aString4 = System.getProperty("java.vendor");
			Static75.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static75.aString3 = System.getProperty("user.home");
			if (Static75.aString3 != null) {
				Static75.aString3 = Static75.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static75.aString3 == null) {
			Static75.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static75.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static75.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static75.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static75.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1050(arg4, arg3, arg2);
		}
		this.aBoolean66 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public void method1043() {
		synchronized (this) {
			this.aBoolean66 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass88_2 != null) {
			try {
				this.aClass88_2.method2529();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass88_3 != null) {
			try {
				this.aClass88_3.method2529();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass88Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass88Array1.length; local53++) {
				if (this.aClass88Array1[local53] != null) {
					try {
						this.aClass88Array1[local53].method2529();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass88_4 != null) {
			try {
				this.aClass88_4.method2529();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class56 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean66) {
						return;
					}
					if (this.aClass56_8 != null) {
						local15 = this.aClass56_8;
						this.aClass56_8 = this.aClass56_8.aClass56_11;
						if (this.aClass56_8 == null) {
							this.aClass56_9 = null;
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
				@Pc(41) int local41 = local15.anInt2420;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt2419);
				} else if (local41 == 2) {
					@Pc(127) Thread local127 = new Thread((Runnable) local15.anObject1);
					local127.setDaemon(true);
					local127.start();
					local127.setPriority(local15.anInt2419);
					local15.anObject2 = local127;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(71) Object[] local71;
					if (local41 == 8) {
						local71 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local71[0]).getDeclaredMethod((String) local71[1], (Class[]) local71[2]);
					} else if (local41 == 9) {
						local71 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local71[0]).getDeclaredField((String) local71[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2418 = 1;
			} catch (@Pc(144) ThreadDeath local144) {
				throw local144;
			} catch (@Pc(147) Throwable local147) {
				local15.anInt2418 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!la;")
	public Class56 method1044(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method1051(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Lclient!la;")
	public Class56 method1045(@OriginalArg(0) int arg0) {
		return this.method1051(3, arg0, null);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;B)Lclient!la;")
	public Class56 method1046(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method1051(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Lclient!cf;")
	public Interface1 method1047() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!la;")
	public Class56 method1048(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method1051(9, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lclient!la;")
	public Class56 method1049(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2) {
		return this.method1051(8, 0, new Object[] { arg2, arg0, arg1 });
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method1050(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static75.aString3, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(74) int local74 = 0; local74 < local69.length; local74++) {
				for (@Pc(77) int local77 = 0; local77 < local46.length; local77++) {
					try {
						@Pc(82) String local82 = local46[local77];
						if (local82.length() > 0 && !(new File(local82)).exists()) {
							continue;
						}
						@Pc(108) File local108 = new File(local82 + local69[local74]);
						@Pc(117) boolean local117;
						if (local71 == 1 && !local108.exists()) {
							local117 = local108.mkdir();
							if (!local117) {
								continue;
							}
						}
						@Pc(129) File local129;
						if (this.aClass88_4 == null) {
							try {
								local129 = new File(local108, "random.dat");
								if (local71 == 1 || local129.exists()) {
									this.aClass88_4 = new Class88(local129, "rw", 25L);
								}
							} catch (@Pc(145) Exception local145) {
								this.aClass88_4 = null;
							}
						}
						if (this.aFile1 == null) {
							try {
								local108 = new File(local108, arg1);
								if (local71 == 1 && !local108.exists()) {
									local117 = local108.mkdir();
									if (!local117) {
										continue;
									}
								}
								local129 = new File(local108, "main_file_cache.dat2");
								if (local71 == 0 && !local129.exists()) {
									continue;
								}
								this.aClass88_2 = new Class88(local129, "rw", 104857600L);
								this.aClass88Array1 = new Class88[arg0];
								for (@Pc(200) int local200 = 0; local200 < arg0; local200++) {
									this.aClass88Array1[local200] = new Class88(new File(local108, "main_file_cache.idx" + local200), "rw", 1048576L);
								}
								this.aClass88_3 = new Class88(new File(local108, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local108;
							} catch (@Pc(245) Exception local245) {
								try {
									this.aClass88_2.method2529();
									for (@Pc(251) int local251 = 0; local251 < arg0; local251++) {
										this.aClass88Array1[local251].method2529();
									}
									this.aClass88_3.method2529();
								} catch (@Pc(272) Exception local272) {
								}
								this.aFile2 = this.aFile1 = null;
								this.aClass88_2 = this.aClass88_3 = null;
								this.aClass88Array1 = null;
							}
						}
					} catch (@Pc(289) Exception local289) {
					}
					if (this.aClass88_4 != null && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!la;")
	private Class56 method1051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		@Pc(3) Class56 local3 = new Class56();
		local3.anObject1 = arg2;
		local3.anInt2419 = arg1;
		local3.anInt2420 = arg0;
		synchronized (this) {
			if (this.aClass56_9 == null) {
				this.aClass56_9 = this.aClass56_8 = local3;
			} else {
				this.aClass56_9.aClass56_11 = local3;
				this.aClass56_9 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!la;")
	public Class56 method1052(@OriginalArg(0) URL arg0) {
		return this.method1051(4, 0, arg0);
	}
}
