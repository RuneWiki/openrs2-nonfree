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

@OriginalClass("client!vi")
public final class Class99 implements Runnable {

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Lclient!di;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "[Lclient!kd;")
	public Class56[] aClass56Array1;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!qe;")
	private Class82 aClass82_7 = null;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "Lclient!qe;")
	private Class82 aClass82_8 = null;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!kd;")
	public Class56 aClass56_3 = null;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!kd;")
	public Class56 aClass56_4 = null;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "Lclient!kd;")
	public Class56 aClass56_2 = null;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class99(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static203.aString3 = "Unknown";
		Static203.aString5 = "1.1";
		this.anApplet1 = arg1;
		try {
			Static203.aString3 = System.getProperty("java.vendor");
			Static203.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static203.aString4 = System.getProperty("user.home");
			if (Static203.aString4 != null) {
				Static203.aString4 = Static203.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static203.aString4 == null) {
			Static203.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static203.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static203.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static203.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static203.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method3423(arg2, arg3, arg4);
		}
		this.aBoolean225 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Lclient!di;")
	public Interface1 method3417() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/net/URL;)Lclient!qe;")
	public Class82 method3418(@OriginalArg(1) URL arg0) {
		return this.method3426(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Z)Lclient!qe;")
	public Class82 method3419(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return this.method3426(new Object[] { arg2, arg1, arg0 }, 8, 0);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
	public void method3420() {
		synchronized (this) {
			this.aBoolean225 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass56_3 != null) {
			try {
				this.aClass56_3.method1746();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass56_2 != null) {
			try {
				this.aClass56_2.method1746();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass56Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass56Array1.length; local55++) {
				if (this.aClass56Array1[local55] != null) {
					try {
						this.aClass56Array1[local55].method1746();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass56_4 != null) {
			try {
				this.aClass56_4.method1746();
			} catch (@Pc(93) IOException local93) {
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class82 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean225) {
						return;
					}
					if (this.aClass82_8 != null) {
						local15 = this.aClass82_8;
						this.aClass82_8 = this.aClass82_8.aClass82_4;
						if (this.aClass82_8 == null) {
							this.aClass82_7 = null;
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
				@Pc(41) int local41 = local15.anInt3422;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt3420);
				} else if (local41 == 2) {
					@Pc(68) Thread local68 = new Thread((Runnable) local15.anObject3);
					local68.setDaemon(true);
					local68.start();
					local68.setPriority(local15.anInt3420);
					local15.anObject2 = local68;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(112) Object[] local112;
					if (local41 == 8) {
						local112 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local112[0]).getDeclaredMethod((String) local112[1], (Class[]) local112[2]);
					} else if (local41 == 9) {
						local112 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local112[0]).getDeclaredField((String) local112[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt3421 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt3421 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Lclient!qe;")
	public Class82 method3421(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method3426(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!qe;")
	public Class82 method3422(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method3426(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLjava/lang/String;I)V")
	private void method3423(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static203.aString4, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(82) int local82 = 0; local82 < local69.length; local82++) {
				for (@Pc(85) int local85 = 0; local85 < local46.length; local85++) {
					try {
						@Pc(90) String local90 = local46[local85];
						if (local90.length() > 0 && !(new File(local90)).exists()) {
							continue;
						}
						@Pc(113) File local113 = new File(local90 + local69[local82]);
						@Pc(122) boolean local122;
						if (local71 == 1 && !local113.exists()) {
							local122 = local113.mkdir();
							if (!local122) {
								continue;
							}
						}
						@Pc(134) File local134;
						if (this.aClass56_4 == null) {
							try {
								local134 = new File(local113, "random.dat");
								if (local71 == 1 || local134.exists()) {
									this.aClass56_4 = new Class56(local134, "rw", 25L);
								}
							} catch (@Pc(150) Exception local150) {
								this.aClass56_4 = null;
							}
						}
						if (this.aFile3 == null) {
							try {
								local113 = new File(local113, arg1);
								if (local71 == 1 && !local113.exists()) {
									local122 = local113.mkdir();
									if (!local122) {
										continue;
									}
								}
								local134 = new File(local113, "main_file_cache.dat2");
								if (local71 == 0 && !local134.exists()) {
									continue;
								}
								this.aClass56_3 = new Class56(local134, "rw", 104857600L);
								this.aClass56Array1 = new Class56[arg2];
								for (@Pc(203) int local203 = 0; local203 < arg2; local203++) {
									this.aClass56Array1[local203] = new Class56(new File(local113, "main_file_cache.idx" + local203), "rw", 1048576L);
								}
								this.aClass56_2 = new Class56(new File(local113, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local113;
							} catch (@Pc(252) Exception local252) {
								try {
									this.aClass56_3.method1746();
									for (@Pc(258) int local258 = 0; local258 < arg2; local258++) {
										this.aClass56Array1[local258].method1746();
									}
									this.aClass56_2.method1746();
								} catch (@Pc(275) Exception local275) {
								}
								this.aClass56_3 = this.aClass56_2 = null;
								this.aFile2 = this.aFile3 = null;
								this.aClass56Array1 = null;
							}
						}
					} catch (@Pc(292) Exception local292) {
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

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)Lclient!qe;")
	public Class82 method3424(@OriginalArg(1) int arg0) {
		return this.method3426(null, 3, arg0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!qe;")
	public Class82 method3425(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3426(new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLjava/lang/Object;II)Lclient!qe;")
	private Class82 method3426(@OriginalArg(2) Object arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(11) Class82 local11 = new Class82();
		local11.anInt3422 = arg1;
		local11.anInt3420 = arg2;
		local11.anObject3 = arg0;
		synchronized (this) {
			if (this.aClass82_7 == null) {
				this.aClass82_7 = this.aClass82_8 = local11;
			} else {
				this.aClass82_7.aClass82_4 = local11;
				this.aClass82_7 = local11;
			}
			this.notify();
			return local11;
		}
	}
}
