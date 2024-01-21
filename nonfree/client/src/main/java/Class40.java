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

@OriginalClass("client!je")
public final class Class40 implements Runnable {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!qf;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "[Lclient!pf;")
	public Class63[] aClass63Array1;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!be;")
	private Class10 aClass10_7 = null;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!pf;")
	public Class63 aClass63_4 = null;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!be;")
	private Class10 aClass10_8 = null;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!pf;")
	public Class63 aClass63_2 = null;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!pf;")
	public Class63 aClass63_3 = null;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class40(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static63.aString2 = "Unknown";
		this.anApplet1 = arg1;
		Static63.aString3 = "1.1";
		try {
			Static63.aString2 = System.getProperty("java.vendor");
			Static63.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static63.aString1 = System.getProperty("user.home");
			if (Static63.aString1 != null) {
				Static63.aString1 = Static63.aString1 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static63.aString1 == null) {
			Static63.aString1 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static63.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static63.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static63.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static63.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method946(arg2, arg4, arg3);
		}
		this.aBoolean64 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class10 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean64) {
						return;
					}
					if (this.aClass10_7 != null) {
						local15 = this.aClass10_7;
						this.aClass10_7 = this.aClass10_7.aClass10_2;
						if (this.aClass10_7 == null) {
							this.aClass10_8 = null;
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
				@Pc(41) int local41 = local15.anInt296;
				if (local41 == 1) {
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt297);
				} else if (local41 == 2) {
					@Pc(121) Thread local121 = new Thread((Runnable) local15.anObject2);
					local121.setDaemon(true);
					local121.start();
					local121.setPriority(local15.anInt297);
					local15.anObject1 = local121;
				} else if (local41 == 4) {
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(72) Object[] local72;
					if (local41 == 8) {
						local72 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local72[0]).getDeclaredMethod((String) local72[1], (Class[]) local72[2]);
					} else if (local41 == 9) {
						local72 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local72[0]).getDeclaredField((String) local72[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt295 = 1;
			} catch (@Pc(150) ThreadDeath local150) {
				throw local150;
			} catch (@Pc(153) Throwable local153) {
				local15.anInt295 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public void method943() {
		synchronized (this) {
			this.aBoolean64 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass63_2 != null) {
			try {
				this.aClass63_2.method1379();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass63_3 != null) {
			try {
				this.aClass63_3.method1379();
			} catch (@Pc(51) IOException local51) {
			}
		}
		if (this.aClass63Array1 != null) {
			for (@Pc(57) int local57 = 0; local57 < this.aClass63Array1.length; local57++) {
				if (this.aClass63Array1[local57] != null) {
					try {
						this.aClass63Array1[local57].method1379();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass63_4 != null) {
			try {
				this.aClass63_4.method1379();
			} catch (@Pc(91) IOException local91) {
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Lclient!be;")
	public Class10 method944(@OriginalArg(1) int arg0) {
		return this.method952(null, 3, arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lclient!be;")
	public Class10 method945(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method952(new Object[] { arg0, arg1 }, 9, 0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BIILjava/lang/String;)V")
	private void method946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(38) String[] local38 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(73) String[] local73 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static63.aString1, "/tmp/", "" };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local38.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local73.length; local81++) {
					try {
						@Pc(86) String local86 = local73[local81];
						if (local86.length() > 0 && !(new File(local86)).exists()) {
							continue;
						}
						@Pc(112) File local112 = new File(local86 + local38[local78]);
						@Pc(121) boolean local121;
						if (local75 == 1 && !local112.exists()) {
							local121 = local112.mkdir();
							if (!local121) {
								continue;
							}
						}
						@Pc(133) File local133;
						if (this.aClass63_4 == null) {
							try {
								local133 = new File(local112, "random.dat");
								if (local75 == 1 || local133.exists()) {
									this.aClass63_4 = new Class63(local133, "rw", 25L);
								}
							} catch (@Pc(151) Exception local151) {
								this.aClass63_4 = null;
							}
						}
						if (this.aFile1 == null) {
							try {
								local112 = new File(local112, arg2);
								if (local75 == 1 && !local112.exists()) {
									local121 = local112.mkdir();
									if (!local121) {
										continue;
									}
								}
								local133 = new File(local112, "main_file_cache.dat2");
								if (local75 == 0 && !local133.exists()) {
									continue;
								}
								this.aClass63_2 = new Class63(local133, "rw", 52428800L);
								this.aClass63Array1 = new Class63[arg1];
								for (@Pc(203) int local203 = 0; local203 < arg1; local203++) {
									this.aClass63Array1[local203] = new Class63(new File(local112, "main_file_cache.idx" + local203), "rw", 1048576L);
								}
								this.aClass63_3 = new Class63(new File(local112, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local112;
							} catch (@Pc(248) Exception local248) {
								try {
									this.aClass63_2.method1379();
									for (@Pc(254) int local254 = 0; local254 < arg1; local254++) {
										this.aClass63Array1[local254].method1379();
									}
									this.aClass63_3.method1379();
								} catch (@Pc(275) Exception local275) {
								}
								this.aClass63_2 = this.aClass63_3 = null;
								this.aFile2 = this.aFile1 = null;
								this.aClass63Array1 = null;
							}
						}
					} catch (@Pc(292) Exception local292) {
					}
					if (this.aClass63_4 != null && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!be;")
	public Class10 method947(@OriginalArg(0) URL arg0) {
		return this.method952(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;BI)Lclient!be;")
	public Class10 method948(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method952(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lclient!be;")
	public Class10 method949(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return this.method952(new Object[] { arg1, arg2, arg0 }, 8, 0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lclient!qf;")
	public Interface1 method950() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!be;")
	public Class10 method951(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method952(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!be;")
	private Class10 method952(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class10 local3 = new Class10();
		local3.anInt297 = arg2;
		local3.anInt296 = arg1;
		local3.anObject2 = arg0;
		synchronized (this) {
			if (this.aClass10_8 == null) {
				this.aClass10_8 = this.aClass10_7 = local3;
			} else {
				this.aClass10_8.aClass10_2 = local3;
				this.aClass10_8 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
