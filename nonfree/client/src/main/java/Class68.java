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

@OriginalClass("client!qf")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[Lclient!kc;")
	public Class45[] aClass45Array1;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Lclient!f;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!kc;")
	public Class45 aClass45_2 = null;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!kc;")
	public Class45 aClass45_3 = null;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Lclient!oc;")
	private Class61 aClass61_5 = null;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!kc;")
	public Class45 aClass45_4 = null;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!oc;")
	private Class61 aClass61_6 = null;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class68(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static130.aString3 = "1.1";
		this.anApplet1 = arg1;
		Static130.aString5 = "Unknown";
		try {
			Static130.aString5 = System.getProperty("java.vendor");
			Static130.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static130.aString4 = System.getProperty("user.home");
			if (Static130.aString4 != null) {
				Static130.aString4 = Static130.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static130.aString4 == null) {
			Static130.aString4 = "~/";
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
			this.method2526(arg2, arg3, arg4);
		}
		this.aBoolean156 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class61 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean156) {
						return;
					}
					if (this.aClass61_5 != null) {
						local15 = this.aClass61_5;
						this.aClass61_5 = this.aClass61_5.aClass61_3;
						if (this.aClass61_5 == null) {
							this.aClass61_6 = null;
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
				@Pc(41) int local41 = local15.anInt2846;
				if (local41 == 1) {
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt2847);
				} else if (local41 == 2) {
					@Pc(117) Thread local117 = new Thread((Runnable) local15.anObject3);
					local117.setDaemon(true);
					local117.start();
					local117.setPriority(local15.anInt2847);
					local15.anObject4 = local117;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(74) Object[] local74;
					if (local41 == 8) {
						local74 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local74[0]).getDeclaredMethod((String) local74[1], (Class[]) local74[2]);
					} else if (local41 == 9) {
						local74 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local74[0]).getDeclaredField((String) local74[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2845 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt2845 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!oc;")
	public Class61 method2523(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2524(9, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBILjava/lang/Object;)Lclient!oc;")
	private Class61 method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class61 local3 = new Class61();
		local3.anInt2846 = arg0;
		local3.anInt2847 = arg1;
		local3.anObject3 = arg2;
		synchronized (this) {
			if (this.aClass61_6 == null) {
				this.aClass61_6 = this.aClass61_5 = local3;
			} else {
				this.aClass61_6.aClass61_3 = local3;
				this.aClass61_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!oc;")
	public Class61 method2525(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method2524(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZILjava/lang/String;I)V")
	private void method2526(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(34) String[] local34 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(69) String[] local69 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static130.aString4, "/tmp/", "" };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local34.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local69.length; local83++) {
					try {
						@Pc(88) String local88 = local69[local83];
						if (local88.length() > 0 && !(new File(local88)).exists()) {
							continue;
						}
						@Pc(114) File local114 = new File(local88 + local34[local80]);
						@Pc(125) boolean local125;
						if (local77 == 1 && !local114.exists()) {
							local125 = local114.mkdir();
							if (!local125) {
								continue;
							}
						}
						@Pc(137) File local137;
						if (this.aClass45_2 == null) {
							try {
								local137 = new File(local114, "random.dat");
								if (local77 == 1 || local137.exists()) {
									this.aClass45_2 = new Class45(local137, "rw", 25L);
								}
							} catch (@Pc(155) Exception local155) {
								this.aClass45_2 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local114 = new File(local114, arg1);
								if (local77 == 1 && !local114.exists()) {
									local125 = local114.mkdir();
									if (!local125) {
										continue;
									}
								}
								local137 = new File(local114, "main_file_cache.dat2");
								if (local77 == 0 && !local137.exists()) {
									continue;
								}
								this.aClass45_3 = new Class45(local137, "rw", 104857600L);
								this.aClass45Array1 = new Class45[arg2];
								for (@Pc(210) int local210 = 0; local210 < arg2; local210++) {
									this.aClass45Array1[local210] = new Class45(new File(local114, "main_file_cache.idx" + local210), "rw", 1048576L);
								}
								this.aClass45_4 = new Class45(new File(local114, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local114;
							} catch (@Pc(255) Exception local255) {
								try {
									this.aClass45_3.method1837();
									for (@Pc(261) int local261 = 0; local261 < arg2; local261++) {
										this.aClass45Array1[local261].method1837();
									}
									this.aClass45_4.method1837();
								} catch (@Pc(278) Exception local278) {
								}
								this.aFile3 = this.aFile2 = null;
								this.aClass45_3 = this.aClass45_4 = null;
								this.aClass45Array1 = null;
							}
						}
					} catch (@Pc(295) Exception local295) {
					}
					if (this.aClass45_2 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Lclient!f;")
	public Interface1 method2527() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/lang/String;)Lclient!oc;")
	public Class61 method2528(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method2524(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
	public void method2529() {
		synchronized (this) {
			this.aBoolean156 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass45_3 != null) {
			try {
				this.aClass45_3.method1837();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass45_4 != null) {
			try {
				this.aClass45_4.method1837();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass45Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass45Array1.length; local48++) {
				if (this.aClass45Array1[local48] != null) {
					try {
						this.aClass45Array1[local48].method1837();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass45_2 != null) {
			try {
				this.aClass45_2.method1837();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lclient!oc;")
	public Class61 method2530(@OriginalArg(0) int arg0) {
		return this.method2524(3, arg0, null);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;B)Lclient!oc;")
	public Class61 method2531(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return this.method2524(8, 0, new Object[] { arg2, arg1, arg0 });
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!oc;")
	public Class61 method2532(@OriginalArg(0) URL arg0) {
		return this.method2524(4, 0, arg0);
	}
}
