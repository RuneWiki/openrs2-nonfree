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
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "[Lclient!u;")
	public Class80[] aClass80Array1;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Lclient!ma;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!ca;")
	private Class11 aClass11_3 = null;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!u;")
	public Class80 aClass80_1 = null;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!u;")
	public Class80 aClass80_2 = null;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!u;")
	public Class80 aClass80_3 = null;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "Lclient!ca;")
	private Class11 aClass11_4 = null;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class36(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static71.aString3 = "1.1";
		Static71.aString4 = "Unknown";
		try {
			Static71.aString4 = System.getProperty("java.vendor");
			Static71.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static71.aString5 = System.getProperty("user.home");
			if (Static71.aString5 != null) {
				Static71.aString5 = Static71.aString5 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static71.aString5 == null) {
			Static71.aString5 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static71.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static71.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static71.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static71.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1110(arg3, arg2, arg4);
		}
		this.aBoolean65 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ih", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class11 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean65) {
						return;
					}
					if (this.aClass11_3 != null) {
						local15 = this.aClass11_3;
						this.aClass11_3 = this.aClass11_3.aClass11_1;
						if (this.aClass11_3 == null) {
							this.aClass11_4 = null;
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
				@Pc(41) int local41 = local15.anInt466;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt465);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject1);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt465);
					local15.anObject2 = local56;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(100) Object[] local100;
					if (local41 == 8) {
						local100 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local100[0]).getDeclaredMethod((String) local100[1], (Class[]) local100[2]);
					} else if (local41 == 9) {
						local100 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local100[0]).getDeclaredField((String) local100[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt467 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt467 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ca;")
	public Class11 method1109(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method1117(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;BII)V")
	private void method1110(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static71.aString5, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local42.length; local81++) {
					try {
						@Pc(86) String local86 = local42[local81];
						if (local86.length() > 0 && !(new File(local86)).exists()) {
							continue;
						}
						@Pc(109) File local109 = new File(local86 + local73[local78]);
						@Pc(120) boolean local120;
						if (local75 == 1 && !local109.exists()) {
							local120 = local109.mkdir();
							if (!local120) {
								continue;
							}
						}
						@Pc(132) File local132;
						if (this.aClass80_1 == null) {
							try {
								local132 = new File(local109, "random.dat");
								if (local75 == 1 || local132.exists()) {
									this.aClass80_1 = new Class80(local132, "rw", 25L);
								}
							} catch (@Pc(148) Exception local148) {
								this.aClass80_1 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local109 = new File(local109, arg0);
								if (local75 == 1 && !local109.exists()) {
									local120 = local109.mkdir();
									if (!local120) {
										continue;
									}
								}
								local132 = new File(local109, "main_file_cache.dat2");
								if (local75 == 0 && !local132.exists()) {
									continue;
								}
								this.aClass80_3 = new Class80(local132, "rw", 104857600L);
								this.aClass80Array1 = new Class80[arg2];
								for (@Pc(198) int local198 = 0; local198 < arg2; local198++) {
									this.aClass80Array1[local198] = new Class80(new File(local109, "main_file_cache.idx" + local198), "rw", 1048576L);
								}
								this.aClass80_2 = new Class80(new File(local109, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local109;
							} catch (@Pc(247) Exception local247) {
								try {
									this.aClass80_3.method2561();
									for (@Pc(253) int local253 = 0; local253 < arg2; local253++) {
										this.aClass80Array1[local253].method2561();
									}
									this.aClass80_2.method2561();
								} catch (@Pc(274) Exception local274) {
								}
								this.aClass80_3 = this.aClass80_2 = null;
								this.aClass80Array1 = null;
								this.aFile1 = this.aFile2 = null;
							}
						}
					} catch (@Pc(291) Exception local291) {
					}
					if (this.aClass80_1 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!ca;")
	public Class11 method1111(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1117(9, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public void method1112() {
		synchronized (this) {
			this.aBoolean65 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass80_3 != null) {
			try {
				this.aClass80_3.method2561();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass80_2 != null) {
			try {
				this.aClass80_2.method2561();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass80Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass80Array1.length; local49++) {
				if (this.aClass80Array1[local49] != null) {
					try {
						this.aClass80Array1[local49].method2561();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass80_1 != null) {
			try {
				this.aClass80_1.method2561();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Lclient!ma;")
	public Interface3 method1113() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!ca;")
	public Class11 method1114(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method1117(1, arg1, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Lclient!ca;")
	public Class11 method1115(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method1117(8, new Object[] { arg0, arg1, arg2 }, 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ca;")
	public Class11 method1116(@OriginalArg(1) URL arg0) {
		return this.method1117(4, arg0, 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lclient!ca;")
	private Class11 method1117(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class11 local3 = new Class11();
		local3.anObject1 = arg1;
		local3.anInt466 = arg0;
		local3.anInt465 = arg2;
		synchronized (this) {
			if (this.aClass11_4 == null) {
				this.aClass11_4 = this.aClass11_3 = local3;
			} else {
				this.aClass11_4.aClass11_1 = local3;
				this.aClass11_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lclient!ca;")
	public Class11 method1118(@OriginalArg(1) int arg0) {
		return this.method1117(3, null, arg0);
	}
}
