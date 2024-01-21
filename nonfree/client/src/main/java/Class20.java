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

@OriginalClass("client!df")
public final class Class20 implements Runnable {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!ic;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "[Lclient!oa;")
	public Class59[] aClass59Array1;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!cf;")
	private Class15 aClass15_4 = null;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!oa;")
	public Class59 aClass59_1 = null;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!cf;")
	private Class15 aClass15_5 = null;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!oa;")
	public Class59 aClass59_2 = null;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Lclient!oa;")
	public Class59 aClass59_3 = null;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class20(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static24.aString2 = "1.1";
		this.anApplet1 = arg1;
		Static24.aString1 = "Unknown";
		try {
			Static24.aString1 = System.getProperty("java.vendor");
			Static24.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static24.aString3 = System.getProperty("user.home");
			if (Static24.aString3 != null) {
				Static24.aString3 = Static24.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static24.aString3 == null) {
			Static24.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static24.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static24.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static24.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static24.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method366(arg2, arg4, arg3);
		}
		this.aBoolean21 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBILjava/lang/String;)V")
	private void method366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static24.aString3, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(65) String[] local65 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(67) int local67 = 0; local67 < 2; local67++) {
			for (@Pc(70) int local70 = 0; local70 < local65.length; local70++) {
				for (@Pc(73) int local73 = 0; local73 < local34.length; local73++) {
					try {
						@Pc(78) String local78 = local34[local73];
						if (local78.length() > 0 && !(new File(local78)).exists()) {
							continue;
						}
						@Pc(104) File local104 = new File(local78 + local65[local70]);
						@Pc(113) boolean local113;
						if (local67 == 1 && !local104.exists()) {
							local113 = local104.mkdir();
							if (!local113) {
								continue;
							}
						}
						@Pc(125) File local125;
						if (this.aClass59_1 == null) {
							try {
								local125 = new File(local104, "random.dat");
								if (local67 == 1 || local125.exists()) {
									this.aClass59_1 = new Class59(local125, "rw", 25L);
								}
							} catch (@Pc(143) Exception local143) {
								this.aClass59_1 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local104 = new File(local104, arg2);
								if (local67 == 1 && !local104.exists()) {
									local113 = local104.mkdir();
									if (!local113) {
										continue;
									}
								}
								local125 = new File(local104, "main_file_cache.dat2");
								if (local67 == 0 && !local125.exists()) {
									continue;
								}
								this.aClass59_2 = new Class59(local125, "rw", 52428800L);
								this.aClass59Array1 = new Class59[arg1];
								for (@Pc(195) int local195 = 0; local195 < arg1; local195++) {
									this.aClass59Array1[local195] = new Class59(new File(local104, "main_file_cache.idx" + local195), "rw", 1048576L);
								}
								this.aClass59_3 = new Class59(new File(local104, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local104;
							} catch (@Pc(240) Exception local240) {
								try {
									this.aClass59_2.method1319();
									for (@Pc(246) int local246 = 0; local246 < arg1; local246++) {
										this.aClass59Array1[local246].method1319();
									}
									this.aClass59_3.method1319();
								} catch (@Pc(263) Exception local263) {
								}
								this.aFile1 = this.aFile2 = null;
								this.aClass59_2 = this.aClass59_3 = null;
								this.aClass59Array1 = null;
							}
						}
					} catch (@Pc(280) Exception local280) {
					}
					if (this.aClass59_1 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Lclient!cf;")
	public Class15 method367(@OriginalArg(1) int arg0) {
		return this.method375(null, arg0, 3);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lclient!cf;")
	public Class15 method368(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2) {
		return this.method375(new Object[] { arg1, arg0, arg2 }, 0, 8);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!cf;")
	public Class15 method369(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method375(new Object[] { arg0, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/net/URL;Z)Lclient!cf;")
	public Class15 method370(@OriginalArg(0) URL arg0) {
		return this.method375(arg0, 0, 4);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!cf;")
	public Class15 method371(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method375(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class15 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean21) {
						return;
					}
					if (this.aClass15_4 != null) {
						local15 = this.aClass15_4;
						this.aClass15_4 = this.aClass15_4.aClass15_3;
						if (this.aClass15_4 == null) {
							this.aClass15_5 = null;
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
				@Pc(41) int local41 = local15.anInt405;
				if (local41 == 1) {
					local15.anObject9 = new Socket(InetAddress.getByName((String) local15.anObject10), local15.anInt403);
				} else if (local41 == 2) {
					@Pc(54) Thread local54 = new Thread((Runnable) local15.anObject10);
					local54.setDaemon(true);
					local54.start();
					local54.setPriority(local15.anInt403);
					local15.anObject9 = local54;
				} else if (local41 == 4) {
					local15.anObject9 = new DataInputStream(((URL) local15.anObject10).openStream());
				} else {
					@Pc(87) Object[] local87;
					if (local41 == 8) {
						local87 = (Object[]) local15.anObject10;
						local15.anObject9 = ((Class) local87[0]).getDeclaredMethod((String) local87[1], (Class[]) local87[2]);
					} else if (local41 == 9) {
						local87 = (Object[]) local15.anObject10;
						local15.anObject9 = ((Class) local87[0]).getDeclaredField((String) local87[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt404 = 1;
			} catch (@Pc(142) ThreadDeath local142) {
				throw local142;
			} catch (@Pc(145) Throwable local145) {
				local15.anInt404 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public void method372() {
		synchronized (this) {
			this.aBoolean21 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass59_2 != null) {
			try {
				this.aClass59_2.method1319();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass59_3 != null) {
			try {
				this.aClass59_3.method1319();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass59Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass59Array1.length; local52++) {
				if (this.aClass59Array1[local52] != null) {
					try {
						this.aClass59Array1[local52].method1319();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass59_1 != null) {
			try {
				this.aClass59_1.method1319();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Lclient!ic;")
	public Interface3 method373() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lclient!cf;")
	public Class15 method374(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method375(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!cf;")
	private Class15 method375(@OriginalArg(2) Object arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(8) Class15 local8 = new Class15();
		local8.anInt405 = arg2;
		local8.anObject10 = arg0;
		local8.anInt403 = arg1;
		synchronized (this) {
			if (this.aClass15_5 == null) {
				this.aClass15_5 = this.aClass15_4 = local8;
			} else {
				this.aClass15_5.aClass15_3 = local8;
				this.aClass15_5 = local8;
			}
			this.notify();
			return local8;
		}
	}
}
