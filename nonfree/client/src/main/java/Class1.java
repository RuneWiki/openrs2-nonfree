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

@OriginalClass("client!a")
public final class Class1 implements Runnable {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!ea;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "[Lclient!pg;")
	public Class80[] aClass80Array1;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!cd;")
	private Class15 aClass15_1 = null;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!pg;")
	public Class80 aClass80_1 = null;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!pg;")
	public Class80 aClass80_2 = null;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!pg;")
	public Class80 aClass80_3 = null;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!cd;")
	private Class15 aClass15_2 = null;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static1.aString3 = "Unknown";
		Static1.aString2 = "1.1";
		try {
			Static1.aString3 = System.getProperty("java.vendor");
			Static1.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static1.aString1 = System.getProperty("user.home");
			if (Static1.aString1 != null) {
				Static1.aString1 = Static1.aString1 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static1.aString1 == null) {
			Static1.aString1 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static1.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static1.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static1.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static1.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method6(arg2, arg3, arg4);
		}
		this.aBoolean1 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!cd;")
	public Class15 method1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!cd;")
	private Class15 method2(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class15 local3 = new Class15();
		local3.anInt623 = arg0;
		local3.anInt622 = arg1;
		local3.anObject2 = arg2;
		synchronized (this) {
			if (this.aClass15_1 == null) {
				this.aClass15_1 = this.aClass15_2 = local3;
			} else {
				this.aClass15_1.aClass15_4 = local3;
				this.aClass15_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!cd;")
	public Class15 method3(@OriginalArg(0) URL arg0) {
		return this.method2(0, 4, arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!cd;")
	public Class15 method4(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2(0, 9, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Lclient!ea;")
	public Interface1 method5() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZILjava/lang/String;I)V")
	private void method6(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(54) String[] local54 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static1.aString1, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(82) int local82 = 0; local82 < local77.length; local82++) {
				for (@Pc(85) int local85 = 0; local85 < local54.length; local85++) {
					try {
						@Pc(90) String local90 = local54[local85];
						if (local90.length() > 0 && !(new File(local90)).exists()) {
							continue;
						}
						@Pc(113) File local113 = new File(local90 + local77[local82]);
						@Pc(124) boolean local124;
						if (local79 == 1 && !local113.exists()) {
							local124 = local113.mkdir();
							if (!local124) {
								continue;
							}
						}
						@Pc(136) File local136;
						if (this.aClass80_1 == null) {
							try {
								local136 = new File(local113, "random.dat");
								if (local79 == 1 || local136.exists()) {
									this.aClass80_1 = new Class80(local136, "rw", 25L);
								}
							} catch (@Pc(154) Exception local154) {
								this.aClass80_1 = null;
							}
						}
						if (this.aFile1 == null) {
							try {
								local113 = new File(local113, arg1);
								if (local79 == 1 && !local113.exists()) {
									local124 = local113.mkdir();
									if (!local124) {
										continue;
									}
								}
								local136 = new File(local113, "main_file_cache.dat2");
								if (local79 == 0 && !local136.exists()) {
									continue;
								}
								this.aClass80_3 = new Class80(local136, "rw", 104857600L);
								this.aClass80Array1 = new Class80[arg2];
								for (@Pc(209) int local209 = 0; local209 < arg2; local209++) {
									this.aClass80Array1[local209] = new Class80(new File(local113, "main_file_cache.idx" + local209), "rw", 1048576L);
								}
								this.aClass80_2 = new Class80(new File(local113, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local113;
							} catch (@Pc(258) Exception local258) {
								try {
									this.aClass80_3.method2322();
									for (@Pc(264) int local264 = 0; local264 < arg2; local264++) {
										this.aClass80Array1[local264].method2322();
									}
									this.aClass80_2.method2322();
								} catch (@Pc(285) Exception local285) {
								}
								this.aClass80_3 = this.aClass80_2 = null;
								this.aFile2 = this.aFile1 = null;
								this.aClass80Array1 = null;
							}
						}
					} catch (@Pc(302) Exception local302) {
					}
					if (this.aClass80_1 != null && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Lclient!cd;")
	public Class15 method7(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2) {
		return this.method2(0, 8, new Object[] { arg2, arg0, arg1 });
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class15 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean1) {
						return;
					}
					if (this.aClass15_2 != null) {
						local15 = this.aClass15_2;
						this.aClass15_2 = this.aClass15_2.aClass15_4;
						if (this.aClass15_2 == null) {
							this.aClass15_1 = null;
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
				@Pc(41) int local41 = local15.anInt622;
				if (local41 == 1) {
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt623);
				} else if (local41 == 2) {
					@Pc(119) Thread local119 = new Thread((Runnable) local15.anObject2);
					local119.setDaemon(true);
					local119.start();
					local119.setPriority(local15.anInt623);
					local15.anObject1 = local119;
				} else if (local41 == 4) {
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(80) Object[] local80;
					if (local41 == 8) {
						local80 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local80[0]).getDeclaredMethod((String) local80[1], (Class[]) local80[2]);
					} else if (local41 == 9) {
						local80 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local80[0]).getDeclaredField((String) local80[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt624 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt624 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!cd;")
	public Class15 method8(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public void method9() {
		synchronized (this) {
			this.aBoolean1 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass80_3 != null) {
			try {
				this.aClass80_3.method2322();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass80_2 != null) {
			try {
				this.aClass80_2.method2322();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass80Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass80Array1.length; local49++) {
				if (this.aClass80Array1[local49] != null) {
					try {
						this.aClass80Array1[local49].method2322();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass80_1 != null) {
			try {
				this.aClass80_1.method2322();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)Lclient!cd;")
	public Class15 method10(@OriginalArg(0) int arg0) {
		return this.method2(arg0, 3, null);
	}
}
