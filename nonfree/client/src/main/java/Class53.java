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

@OriginalClass("client!od")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!ce;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "[Lclient!sc;")
	public Class70[] aClass70Array1;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Lclient!sc;")
	public Class70 aClass70_3 = null;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!sc;")
	public Class70 aClass70_2 = null;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Lclient!sc;")
	public Class70 aClass70_4 = null;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!gg;")
	private Class26 aClass26_4 = null;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "Lclient!gg;")
	private Class26 aClass26_5 = null;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class53(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static112.aString5 = "Unknown";
		this.anApplet1 = arg1;
		Static112.aString4 = "1.1";
		try {
			Static112.aString5 = System.getProperty("java.vendor");
			Static112.aString4 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static112.aString3 = System.getProperty("user.home");
			if (Static112.aString3 != null) {
				Static112.aString3 = Static112.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static112.aString3 == null) {
			Static112.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static112.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static112.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static112.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static112.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2275(arg2, arg4, arg3);
		}
		this.aBoolean140 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!od", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class26 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean140) {
						return;
					}
					if (this.aClass26_4 != null) {
						local15 = this.aClass26_4;
						this.aClass26_4 = this.aClass26_4.aClass26_3;
						if (this.aClass26_4 == null) {
							this.aClass26_5 = null;
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
				@Pc(41) int local41 = local15.anInt1789;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt1787);
				} else if (local41 == 2) {
					@Pc(66) Thread local66 = new Thread((Runnable) local15.anObject1);
					local66.setDaemon(true);
					local66.start();
					local66.setPriority(local15.anInt1787);
					local15.anObject2 = local66;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(108) Object[] local108;
					if (local41 == 8) {
						local108 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local108[0]).getDeclaredMethod((String) local108[1], (Class[]) local108[2]);
					} else if (local41 == 9) {
						local108 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local108[0]).getDeclaredField((String) local108[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1788 = 1;
			} catch (@Pc(144) ThreadDeath local144) {
				throw local144;
			} catch (@Pc(147) Throwable local147) {
				local15.anInt1788 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Lclient!ce;")
	public Interface2 method2268() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!gg;")
	public Class26 method2269(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2273(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!gg;")
	public Class26 method2270(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method2273(new Object[] { arg1, arg0, arg2 }, 0, 8);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!gg;")
	public Class26 method2271(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method2273(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Lclient!gg;")
	public Class26 method2272(@OriginalArg(0) int arg0) {
		return this.method2273(null, arg0, 3);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lclient!gg;")
	private Class26 method2273(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(11) Class26 local11 = new Class26();
		local11.anInt1789 = arg2;
		local11.anInt1787 = arg1;
		local11.anObject1 = arg0;
		synchronized (this) {
			if (this.aClass26_5 == null) {
				this.aClass26_5 = this.aClass26_4 = local11;
			} else {
				this.aClass26_5.aClass26_3 = local11;
				this.aClass26_5 = local11;
			}
			this.notify();
			return local11;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/net/URL;)Lclient!gg;")
	public Class26 method2274(@OriginalArg(1) URL arg0) {
		return this.method2273(arg0, 0, 4);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static112.aString3, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local46.length; local81++) {
					try {
						@Pc(86) String local86 = local46[local81];
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
						if (this.aClass70_3 == null) {
							try {
								local132 = new File(local109, "random.dat");
								if (local75 == 1 || local132.exists()) {
									this.aClass70_3 = new Class70(local132, "rw", 25L);
								}
							} catch (@Pc(150) Exception local150) {
								this.aClass70_3 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local109 = new File(local109, arg2);
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
								this.aClass70_2 = new Class70(local132, "rw", 52428800L);
								this.aClass70Array1 = new Class70[arg1];
								for (@Pc(203) int local203 = 0; local203 < arg1; local203++) {
									this.aClass70Array1[local203] = new Class70(new File(local109, "main_file_cache.idx" + local203), "rw", 1048576L);
								}
								this.aClass70_4 = new Class70(new File(local109, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local109;
							} catch (@Pc(252) Exception local252) {
								try {
									this.aClass70_2.method2740();
									for (@Pc(258) int local258 = 0; local258 < arg1; local258++) {
										this.aClass70Array1[local258].method2740();
									}
									this.aClass70_4.method2740();
								} catch (@Pc(281) Exception local281) {
								}
								this.aClass70Array1 = null;
								this.aFile1 = this.aFile2 = null;
								this.aClass70_2 = this.aClass70_4 = null;
							}
						}
					} catch (@Pc(298) Exception local298) {
					}
					if (this.aClass70_3 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!gg;")
	public Class26 method2276(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method2273(new Object[] { arg0, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public void method2277() {
		synchronized (this) {
			this.aBoolean140 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass70_2 != null) {
			try {
				this.aClass70_2.method2740();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass70_4 != null) {
			try {
				this.aClass70_4.method2740();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass70Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass70Array1.length; local48++) {
				if (this.aClass70Array1[local48] != null) {
					try {
						this.aClass70Array1[local48].method2740();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass70_3 != null) {
			try {
				this.aClass70_3.method2740();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}
}
