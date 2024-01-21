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

@OriginalClass("client!dc")
public final class Class17 implements Runnable {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "[Lclient!lb;")
	public Class42[] aClass42Array1;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!d;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!cc;")
	private Class12 aClass12_5 = null;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!cc;")
	private Class12 aClass12_6 = null;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!lb;")
	public Class42 aClass42_2 = null;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!lb;")
	public Class42 aClass42_1 = null;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!lb;")
	public Class42 aClass42_3 = null;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class17(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static21.aString3 = "Unknown";
		Static21.aString2 = "1.1";
		try {
			Static21.aString3 = System.getProperty("java.vendor");
			Static21.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static21.aString1 = System.getProperty("user.home");
			if (Static21.aString1 != null) {
				Static21.aString1 = Static21.aString1 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static21.aString1 == null) {
			Static21.aString1 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static21.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static21.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static21.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static21.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method382(arg2, arg3, arg4);
		}
		this.aBoolean54 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lclient!cc;")
	public Class12 method381(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method390(0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method382(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static21.aString1, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(74) int local74 = 0; local74 < local69.length; local74++) {
				for (@Pc(77) int local77 = 0; local77 < local46.length; local77++) {
					try {
						@Pc(82) String local82 = local46[local77];
						if (local82.length() > 0 && !(new File(local82)).exists()) {
							continue;
						}
						@Pc(105) File local105 = new File(local82 + local69[local74]);
						@Pc(116) boolean local116;
						if (local71 == 1 && !local105.exists()) {
							local116 = local105.mkdir();
							if (!local116) {
								continue;
							}
						}
						@Pc(128) File local128;
						if (this.aClass42_3 == null) {
							try {
								local128 = new File(local105, "random.dat");
								if (local71 == 1 || local128.exists()) {
									this.aClass42_3 = new Class42(local128, "rw", 25L);
								}
							} catch (@Pc(144) Exception local144) {
								this.aClass42_3 = null;
							}
						}
						if (this.aFile1 == null) {
							try {
								local105 = new File(local105, arg1);
								if (local71 == 1 && !local105.exists()) {
									local116 = local105.mkdir();
									if (!local116) {
										continue;
									}
								}
								local128 = new File(local105, "main_file_cache.dat2");
								if (local71 == 0 && !local128.exists()) {
									continue;
								}
								this.aClass42_1 = new Class42(local128, "rw", 52428800L);
								this.aClass42Array1 = new Class42[arg2];
								for (@Pc(194) int local194 = 0; local194 < arg2; local194++) {
									this.aClass42Array1[local194] = new Class42(new File(local105, "main_file_cache.idx" + local194), "rw", 1048576L);
								}
								this.aClass42_2 = new Class42(new File(local105, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local105;
							} catch (@Pc(239) Exception local239) {
								try {
									this.aClass42_1.method1149();
									for (@Pc(245) int local245 = 0; local245 < arg2; local245++) {
										this.aClass42Array1[local245].method1149();
									}
									this.aClass42_2.method1149();
								} catch (@Pc(262) Exception local262) {
								}
								this.aClass42Array1 = null;
								this.aClass42_1 = this.aClass42_2 = null;
								this.aFile2 = this.aFile1 = null;
							}
						}
					} catch (@Pc(279) Exception local279) {
					}
					if (this.aClass42_3 != null && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!cc;")
	public Class12 method383(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method390(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public void method384() {
		synchronized (this) {
			this.aBoolean54 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass42_1 != null) {
			try {
				this.aClass42_1.method1149();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass42_2 != null) {
			try {
				this.aClass42_2.method1149();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass42Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass42Array1.length; local48++) {
				if (this.aClass42Array1[local48] != null) {
					try {
						this.aClass42Array1[local48].method1149();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass42_3 != null) {
			try {
				this.aClass42_3.method1149();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class12 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean54) {
						return;
					}
					if (this.aClass12_5 != null) {
						local15 = this.aClass12_5;
						this.aClass12_5 = this.aClass12_5.aClass12_4;
						if (this.aClass12_5 == null) {
							this.aClass12_6 = null;
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
				@Pc(41) int local41 = local15.anInt374;
				if (local41 == 1) {
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt372);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject2);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt372);
					local15.anObject1 = local56;
				} else if (local41 == 4) {
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local41 == 8) {
						local81 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local41 == 9) {
						local81 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt373 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt373 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lclient!d;")
	public Interface1 method385() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/net/URL;)Lclient!cc;")
	public Class12 method386(@OriginalArg(1) URL arg0) {
		return this.method390(0, arg0, 4);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lclient!cc;")
	public Class12 method387(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method390(0, new Object[] { arg2, arg1, arg0 }, 8);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lclient!cc;")
	public Class12 method388(@OriginalArg(0) int arg0) {
		return this.method390(arg0, null, 3);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!cc;")
	public Class12 method389(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method390(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!cc;")
	private Class12 method390(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(11) Class12 local11 = new Class12();
		local11.anInt374 = arg2;
		local11.anObject2 = arg1;
		local11.anInt372 = arg0;
		synchronized (this) {
			if (this.aClass12_6 == null) {
				this.aClass12_6 = this.aClass12_5 = local11;
			} else {
				this.aClass12_6.aClass12_4 = local11;
				this.aClass12_6 = local11;
			}
			this.notify();
			return local11;
		}
	}
}
