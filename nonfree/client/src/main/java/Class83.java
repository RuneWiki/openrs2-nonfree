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

@OriginalClass("client!qg")
public final class Class83 implements Runnable {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "[Lclient!fg;")
	public Class34[] aClass34Array1;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!qd;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!fg;")
	public Class34 aClass34_2 = null;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!p;")
	private Class75 aClass75_7 = null;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Lclient!fg;")
	public Class34 aClass34_4 = null;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Lclient!fg;")
	public Class34 aClass34_3 = null;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Lclient!p;")
	private Class75 aClass75_8 = null;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class83(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static162.aString5 = "1.1";
		Static162.aString6 = "Unknown";
		try {
			Static162.aString6 = System.getProperty("java.vendor");
			Static162.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static162.aString4 = System.getProperty("user.home");
			if (Static162.aString4 != null) {
				Static162.aString4 = Static162.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static162.aString4 == null) {
			Static162.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static162.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static162.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static162.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static162.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2626(arg3, arg2, arg4);
		}
		this.aBoolean236 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Lclient!qd;")
	public Interface2 method2617() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!p;")
	public Class75 method2618(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2621(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!p;")
	public Class75 method2619(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2621(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public void method2620() {
		synchronized (this) {
			this.aBoolean236 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass34_4 != null) {
			try {
				this.aClass34_4.method1115();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass34_2 != null) {
			try {
				this.aClass34_2.method1115();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass34Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass34Array1.length; local52++) {
				if (this.aClass34Array1[local52] != null) {
					try {
						this.aClass34Array1[local52].method1115();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass34_3 != null) {
			try {
				this.aClass34_3.method1115();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!p;")
	private Class75 method2621(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class75 local3 = new Class75();
		local3.anObject4 = arg1;
		local3.anInt3345 = arg2;
		local3.anInt3344 = arg0;
		synchronized (this) {
			if (this.aClass75_7 == null) {
				this.aClass75_7 = this.aClass75_8 = local3;
			} else {
				this.aClass75_7.aClass75_6 = local3;
				this.aClass75_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class75 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean236) {
						return;
					}
					if (this.aClass75_8 != null) {
						local15 = this.aClass75_8;
						this.aClass75_8 = this.aClass75_8.aClass75_6;
						if (this.aClass75_8 == null) {
							this.aClass75_7 = null;
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
				@Pc(41) int local41 = local15.anInt3344;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt3345);
				} else if (local41 == 2) {
					@Pc(135) Thread local135 = new Thread((Runnable) local15.anObject4);
					local135.setDaemon(true);
					local135.start();
					local135.setPriority(local15.anInt3345);
					local15.anObject3 = local135;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(87) Object[] local87;
					if (local41 == 8) {
						local87 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local87[0]).getDeclaredMethod((String) local87[1], (Class[]) local87[2]);
					} else if (local41 == 9) {
						local87 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local87[0]).getDeclaredField((String) local87[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt3346 = 1;
			} catch (@Pc(152) ThreadDeath local152) {
				throw local152;
			} catch (@Pc(155) Throwable local155) {
				local15.anInt3346 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!p;")
	public Class75 method2622(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2621(9, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lclient!p;")
	public Class75 method2623(@OriginalArg(1) int arg0) {
		return this.method2621(3, null, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!p;")
	public Class75 method2624(@OriginalArg(1) URL arg0) {
		return this.method2621(4, arg0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;B)Lclient!p;")
	public Class75 method2625(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2) {
		return this.method2621(8, new Object[] { arg1, arg0, arg2 }, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method2626(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(34) String[] local34 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(69) String[] local69 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static162.aString4, "/tmp/", "" };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local34.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local69.length; local81++) {
					try {
						@Pc(86) String local86 = local69[local81];
						if (local86.length() > 0 && !(new File(local86)).exists()) {
							continue;
						}
						@Pc(112) File local112 = new File(local86 + local34[local78]);
						@Pc(121) boolean local121;
						if (local75 == 1 && !local112.exists()) {
							local121 = local112.mkdir();
							if (!local121) {
								continue;
							}
						}
						@Pc(133) File local133;
						if (this.aClass34_3 == null) {
							try {
								local133 = new File(local112, "random.dat");
								if (local75 == 1 || local133.exists()) {
									this.aClass34_3 = new Class34(local133, "rw", 25L);
								}
							} catch (@Pc(149) Exception local149) {
								this.aClass34_3 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local112 = new File(local112, arg0);
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
								this.aClass34_4 = new Class34(local133, "rw", 104857600L);
								this.aClass34Array1 = new Class34[arg2];
								for (@Pc(199) int local199 = 0; local199 < arg2; local199++) {
									this.aClass34Array1[local199] = new Class34(new File(local112, "main_file_cache.idx" + local199), "rw", 1048576L);
								}
								this.aClass34_2 = new Class34(new File(local112, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local112;
							} catch (@Pc(248) Exception local248) {
								try {
									this.aClass34_4.method1115();
									for (@Pc(256) int local256 = 0; local256 < arg2; local256++) {
										this.aClass34Array1[local256].method1115();
									}
									this.aClass34_2.method1115();
								} catch (@Pc(279) Exception local279) {
								}
								this.aClass34Array1 = null;
								this.aFile3 = this.aFile2 = null;
								this.aClass34_4 = this.aClass34_2 = null;
							}
						}
					} catch (@Pc(296) Exception local296) {
					}
					if (this.aClass34_3 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}
}
