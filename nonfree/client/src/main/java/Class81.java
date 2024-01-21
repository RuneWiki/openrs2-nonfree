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

@OriginalClass("client!ve")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "[Lclient!pc;")
	public Class64[] aClass64Array1;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!ic;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Z")
	private boolean aBoolean123 = false;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!pc;")
	public Class64 aClass64_2 = null;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!pc;")
	public Class64 aClass64_4 = null;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!ke;")
	private Class43 aClass43_9 = null;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!pc;")
	public Class64 aClass64_3 = null;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!ke;")
	private Class43 aClass43_10 = null;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class81(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static126.aString5 = "Unknown";
		Static126.aString3 = "1.1";
		try {
			Static126.aString5 = System.getProperty("java.vendor");
			Static126.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static126.aString4 = System.getProperty("user.home");
			if (Static126.aString4 != null) {
				Static126.aString4 = Static126.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static126.aString4 == null) {
			Static126.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static126.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static126.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static126.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static126.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1944(arg2, arg3, arg4);
		}
		this.aBoolean123 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lclient!ke;")
	public Class43 method1935(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2) {
		return this.method1942(8, new Object[] { arg1, arg0, arg2 }, 0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!ke;")
	public Class43 method1936(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method1942(9, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!ke;")
	public Class43 method1937(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1942(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lclient!ke;")
	public Class43 method1938(@OriginalArg(0) int arg0) {
		return this.method1942(3, null, arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/String;)Lclient!ke;")
	public Class43 method1939(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method1942(1, arg1, arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!ke;")
	public Class43 method1940(@OriginalArg(0) URL arg0) {
		return this.method1942(4, arg0, 0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public void method1941() {
		synchronized (this) {
			this.aBoolean123 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass64_3 != null) {
			try {
				this.aClass64_3.method1384();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass64_4 != null) {
			try {
				this.aClass64_4.method1384();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass64Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass64Array1.length; local49++) {
				if (this.aClass64Array1[local49] != null) {
					try {
						this.aClass64Array1[local49].method1384();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass64_2 != null) {
			try {
				this.aClass64_2.method1384();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!ke;")
	private Class43 method1942(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class43 local3 = new Class43();
		local3.anInt1567 = arg0;
		local3.anInt1566 = arg2;
		local3.anObject3 = arg1;
		synchronized (this) {
			if (this.aClass43_10 == null) {
				this.aClass43_10 = this.aClass43_9 = local3;
			} else {
				this.aClass43_10.aClass43_5 = local3;
				this.aClass43_10 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class43 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean123) {
						return;
					}
					if (this.aClass43_9 != null) {
						local15 = this.aClass43_9;
						this.aClass43_9 = this.aClass43_9.aClass43_5;
						if (this.aClass43_9 == null) {
							this.aClass43_10 = null;
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
				@Pc(41) int local41 = local15.anInt1567;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt1566);
				} else if (local41 == 2) {
					@Pc(117) Thread local117 = new Thread((Runnable) local15.anObject3);
					local117.setDaemon(true);
					local117.start();
					local117.setPriority(local15.anInt1566);
					local15.anObject2 = local117;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(71) Object[] local71;
					if (local41 == 8) {
						local71 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local71[0]).getDeclaredMethod((String) local71[1], (Class[]) local71[2]);
					} else if (local41 == 9) {
						local71 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local71[0]).getDeclaredField((String) local71[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1565 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt1565 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Lclient!ic;")
	public Interface1 method1943() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method1944(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(41) String[] local41 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static126.aString4, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(79) int local79 = 0; local79 < local74.length; local79++) {
				for (@Pc(82) int local82 = 0; local82 < local41.length; local82++) {
					try {
						@Pc(87) String local87 = local41[local82];
						if (local87.length() > 0 && !(new File(local87)).exists()) {
							continue;
						}
						@Pc(110) File local110 = new File(local87 + local74[local79]);
						@Pc(119) boolean local119;
						if (local76 == 1 && !local110.exists()) {
							local119 = local110.mkdir();
							if (!local119) {
								continue;
							}
						}
						@Pc(131) File local131;
						if (this.aClass64_2 == null) {
							try {
								local131 = new File(local110, "random.dat");
								if (local76 == 1 || local131.exists()) {
									this.aClass64_2 = new Class64(local131, "rw", 25L);
								}
							} catch (@Pc(147) Exception local147) {
								this.aClass64_2 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local110 = new File(local110, arg1);
								if (local76 == 1 && !local110.exists()) {
									local119 = local110.mkdir();
									if (!local119) {
										continue;
									}
								}
								local131 = new File(local110, "main_file_cache.dat2");
								if (local76 == 0 && !local131.exists()) {
									continue;
								}
								this.aClass64_3 = new Class64(local131, "rw", 52428800L);
								this.aClass64Array1 = new Class64[arg2];
								for (@Pc(199) int local199 = 0; local199 < arg2; local199++) {
									this.aClass64Array1[local199] = new Class64(new File(local110, "main_file_cache.idx" + local199), "rw", 1048576L);
								}
								this.aClass64_4 = new Class64(new File(local110, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local110;
							} catch (@Pc(244) Exception local244) {
								try {
									this.aClass64_3.method1384();
									for (@Pc(250) int local250 = 0; local250 < arg2; local250++) {
										this.aClass64Array1[local250].method1384();
									}
									this.aClass64_4.method1384();
								} catch (@Pc(267) Exception local267) {
								}
								this.aClass64Array1 = null;
								this.aFile3 = this.aFile2 = null;
								this.aClass64_3 = this.aClass64_4 = null;
							}
						}
					} catch (@Pc(284) Exception local284) {
					}
					if (this.aClass64_2 != null && this.aFile2 != null) {
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
