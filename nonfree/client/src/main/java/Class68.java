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

@OriginalClass("client!pf")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!kf;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "[Lclient!mg;")
	public Class56[] aClass56Array1;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!k;")
	private Class47 aClass47_5 = null;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!k;")
	private Class47 aClass47_6 = null;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!mg;")
	public Class56 aClass56_2 = null;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!mg;")
	public Class56 aClass56_3 = null;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "Lclient!mg;")
	public Class56 aClass56_4 = null;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class68(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static130.aString4 = "Unknown";
		Static130.aString5 = "1.1";
		try {
			Static130.aString4 = System.getProperty("java.vendor");
			Static130.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static130.aString3 = System.getProperty("user.home");
			if (Static130.aString3 != null) {
				Static130.aString3 = Static130.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static130.aString3 == null) {
			Static130.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static130.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static130.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static130.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static130.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2229(arg3, arg4, arg2);
		}
		this.aBoolean112 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;BLjava/lang/String;)Lclient!k;")
	public Class47 method2221(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) String arg2) {
		return this.method2228(0, 8, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!k;")
	public Class47 method2222(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method2228(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public void method2223() {
		synchronized (this) {
			this.aBoolean112 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass56_3 != null) {
			try {
				this.aClass56_3.method1784();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass56_2 != null) {
			try {
				this.aClass56_2.method1784();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass56Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass56Array1.length; local44++) {
				if (this.aClass56Array1[local44] != null) {
					try {
						this.aClass56Array1[local44].method1784();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass56_4 != null) {
			try {
				this.aClass56_4.method1784();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/net/URL;)Lclient!k;")
	public Class47 method2224(@OriginalArg(1) URL arg0) {
		return this.method2228(0, 4, arg0);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)Lclient!kf;")
	public Interface1 method2225() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!pf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class47 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean112) {
						return;
					}
					if (this.aClass47_6 != null) {
						local15 = this.aClass47_6;
						this.aClass47_6 = this.aClass47_6.aClass47_3;
						if (this.aClass47_6 == null) {
							this.aClass47_5 = null;
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
				@Pc(41) int local41 = local15.anInt1950;
				if (local41 == 1) {
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt1951);
				} else if (local41 == 2) {
					@Pc(129) Thread local129 = new Thread((Runnable) local15.anObject2);
					local129.setDaemon(true);
					local129.start();
					local129.setPriority(local15.anInt1951);
					local15.anObject1 = local129;
				} else if (local41 == 4) {
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(71) Object[] local71;
					if (local41 == 8) {
						local71 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local71[0]).getDeclaredMethod((String) local71[1], (Class[]) local71[2]);
					} else if (local41 == 9) {
						local71 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local71[0]).getDeclaredField((String) local71[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1949 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt1949 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!k;")
	public Class47 method2226(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method2228(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!k;")
	public Class47 method2227(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method2228(0, 9, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBILjava/lang/Object;)Lclient!k;")
	private Class47 method2228(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class47 local3 = new Class47();
		local3.anInt1950 = arg1;
		local3.anObject2 = arg2;
		local3.anInt1951 = arg0;
		synchronized (this) {
			if (this.aClass47_5 == null) {
				this.aClass47_5 = this.aClass47_6 = local3;
			} else {
				this.aClass47_5.aClass47_3 = local3;
				this.aClass47_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method2229(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static130.aString3, "/tmp/", "" };
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(65) String[] local65 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(74) int local74 = 0; local74 < local65.length; local74++) {
				for (@Pc(77) int local77 = 0; local77 < local34.length; local77++) {
					try {
						@Pc(82) String local82 = local34[local77];
						if (local82.length() > 0 && !(new File(local82)).exists()) {
							continue;
						}
						@Pc(105) File local105 = new File(local82 + local65[local74]);
						@Pc(114) boolean local114;
						if (local71 == 1 && !local105.exists()) {
							local114 = local105.mkdir();
							if (!local114) {
								continue;
							}
						}
						@Pc(126) File local126;
						if (this.aClass56_4 == null) {
							try {
								local126 = new File(local105, "random.dat");
								if (local71 == 1 || local126.exists()) {
									this.aClass56_4 = new Class56(local126, "rw", 25L);
								}
							} catch (@Pc(142) Exception local142) {
								this.aClass56_4 = null;
							}
						}
						if (this.aFile3 == null) {
							try {
								local105 = new File(local105, arg0);
								if (local71 == 1 && !local105.exists()) {
									local114 = local105.mkdir();
									if (!local114) {
										continue;
									}
								}
								local126 = new File(local105, "main_file_cache.dat2");
								if (local71 == 0 && !local126.exists()) {
									continue;
								}
								this.aClass56_3 = new Class56(local126, "rw", 104857600L);
								this.aClass56Array1 = new Class56[arg1];
								for (@Pc(195) int local195 = 0; local195 < arg1; local195++) {
									this.aClass56Array1[local195] = new Class56(new File(local105, "main_file_cache.idx" + local195), "rw", 1048576L);
								}
								this.aClass56_2 = new Class56(new File(local105, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local105;
							} catch (@Pc(240) Exception local240) {
								try {
									this.aClass56_3.method1784();
									for (@Pc(246) int local246 = 0; local246 < arg1; local246++) {
										this.aClass56Array1[local246].method1784();
									}
									this.aClass56_2.method1784();
								} catch (@Pc(267) Exception local267) {
								}
								this.aClass56Array1 = null;
								this.aFile2 = this.aFile3 = null;
								this.aClass56_3 = this.aClass56_2 = null;
							}
						}
					} catch (@Pc(284) Exception local284) {
					}
					if (this.aClass56_4 != null && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Lclient!k;")
	public Class47 method2230(@OriginalArg(0) int arg0) {
		return this.method2228(arg0, 3, null);
	}
}
