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

@OriginalClass("client!ih")
public final class Class39 implements Runnable {

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "[Lclient!dg;")
	public Class20[] aClass20Array1;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Lclient!rb;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!dg;")
	public Class20 aClass20_1 = null;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Lclient!dg;")
	public Class20 aClass20_2 = null;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Lclient!ha;")
	private Class29 aClass29_6 = null;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!ha;")
	private Class29 aClass29_5 = null;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "Lclient!dg;")
	public Class20 aClass20_3 = null;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class39(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static70.aString5 = "1.1";
		this.anApplet1 = arg1;
		Static70.aString4 = "Unknown";
		try {
			Static70.aString4 = System.getProperty("java.vendor");
			Static70.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static70.aString3 = System.getProperty("user.home");
			if (Static70.aString3 != null) {
				Static70.aString3 = Static70.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static70.aString3 == null) {
			Static70.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static70.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static70.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static70.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static70.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1237(arg3, arg4, arg2);
		}
		this.aBoolean106 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILjava/lang/String;)Lclient!ha;")
	public Class29 method1228(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method1235(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	public void method1229() {
		synchronized (this) {
			this.aBoolean106 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass20_1 != null) {
			try {
				this.aClass20_1.method608();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass20_2 != null) {
			try {
				this.aClass20_2.method608();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass20Array1 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aClass20Array1.length; local51++) {
				if (this.aClass20Array1[local51] != null) {
					try {
						this.aClass20Array1[local51].method608();
					} catch (@Pc(65) IOException local65) {
					}
				}
			}
		}
		if (this.aClass20_3 != null) {
			try {
				this.aClass20_3.method608();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)Lclient!ha;")
	public Class29 method1230(@OriginalArg(0) int arg0) {
		return this.method1235(null, 3, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!ha;")
	public Class29 method1231(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method1235(new Object[] { arg0, arg1 }, 9, 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!ha;")
	public Class29 method1232(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method1235(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Lclient!rb;")
	public Interface3 method1233() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!ha;")
	public Class29 method1234(@OriginalArg(0) URL arg0) {
		return this.method1235(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!ih", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class29 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean106) {
						return;
					}
					if (this.aClass29_6 != null) {
						local15 = this.aClass29_6;
						this.aClass29_6 = this.aClass29_6.aClass29_3;
						if (this.aClass29_6 == null) {
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
				@Pc(41) int local41 = local15.anInt1374;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt1373);
				} else if (local41 == 2) {
					@Pc(58) Thread local58 = new Thread((Runnable) local15.anObject1);
					local58.setDaemon(true);
					local58.start();
					local58.setPriority(local15.anInt1373);
					local15.anObject2 = local58;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(83) Object[] local83;
					if (local41 == 8) {
						local83 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local83[0]).getDeclaredMethod((String) local83[1], (Class[]) local83[2]);
					} else if (local41 == 9) {
						local83 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local83[0]).getDeclaredField((String) local83[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1375 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt1375 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lclient!ha;")
	private Class29 method1235(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class29 local3 = new Class29();
		local3.anInt1374 = arg1;
		local3.anInt1373 = arg2;
		local3.anObject1 = arg0;
		synchronized (this) {
			if (this.aClass29_5 == null) {
				this.aClass29_5 = this.aClass29_6 = local3;
			} else {
				this.aClass29_5.aClass29_3 = local3;
				this.aClass29_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lclient!ha;")
	public Class29 method1236(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2) {
		return this.method1235(new Object[] { arg2, arg0, arg1 }, 8, 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method1237(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static70.aString3, "/tmp/", "" };
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local67.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local44.length; local79++) {
					try {
						@Pc(84) String local84 = local44[local79];
						if (local84.length() > 0 && !(new File(local84)).exists()) {
							continue;
						}
						@Pc(110) File local110 = new File(local84 + local67[local76]);
						@Pc(121) boolean local121;
						if (local73 == 1 && !local110.exists()) {
							local121 = local110.mkdir();
							if (!local121) {
								continue;
							}
						}
						@Pc(133) File local133;
						if (this.aClass20_3 == null) {
							try {
								local133 = new File(local110, "random.dat");
								if (local73 == 1 || local133.exists()) {
									this.aClass20_3 = new Class20(local133, "rw", 25L);
								}
							} catch (@Pc(151) Exception local151) {
								this.aClass20_3 = null;
							}
						}
						if (this.aFile3 == null) {
							try {
								local110 = new File(local110, arg0);
								if (local73 == 1 && !local110.exists()) {
									local121 = local110.mkdir();
									if (!local121) {
										continue;
									}
								}
								local133 = new File(local110, "main_file_cache.dat2");
								if (local73 == 0 && !local133.exists()) {
									continue;
								}
								this.aClass20_1 = new Class20(local133, "rw", 104857600L);
								this.aClass20Array1 = new Class20[arg1];
								for (@Pc(204) int local204 = 0; local204 < arg1; local204++) {
									this.aClass20Array1[local204] = new Class20(new File(local110, "main_file_cache.idx" + local204), "rw", 1048576L);
								}
								this.aClass20_2 = new Class20(new File(local110, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local110;
							} catch (@Pc(253) Exception local253) {
								try {
									this.aClass20_1.method608();
									for (@Pc(261) int local261 = 0; local261 < arg1; local261++) {
										this.aClass20Array1[local261].method608();
									}
									this.aClass20_2.method608();
								} catch (@Pc(284) Exception local284) {
								}
								this.aFile2 = this.aFile3 = null;
								this.aClass20_1 = this.aClass20_2 = null;
								this.aClass20Array1 = null;
							}
						}
					} catch (@Pc(301) Exception local301) {
					}
					if (this.aClass20_3 != null && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}
}
