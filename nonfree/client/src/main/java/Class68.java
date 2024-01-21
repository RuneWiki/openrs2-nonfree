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

@OriginalClass("client!qd")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "[Lclient!ec;")
	public Class23[] aClass23Array1;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!da;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!ec;")
	public Class23 aClass23_2 = null;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!ec;")
	public Class23 aClass23_4 = null;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!ca;")
	private Class14 aClass14_6 = null;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
	private boolean aBoolean127 = false;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!ca;")
	private Class14 aClass14_7 = null;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!ec;")
	public Class23 aClass23_3 = null;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class68(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static131.aString5 = "1.1";
		Static131.aString3 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static131.aString3 = System.getProperty("java.vendor");
			Static131.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static131.aString4 = System.getProperty("user.home");
			if (Static131.aString4 != null) {
				Static131.aString4 = Static131.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static131.aString4 == null) {
			Static131.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static131.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static131.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static131.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static131.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2197(arg3, arg2, arg4);
		}
		this.aBoolean127 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public void method2191() {
		synchronized (this) {
			this.aBoolean127 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass23_4 != null) {
			try {
				this.aClass23_4.method662();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass23_2 != null) {
			try {
				this.aClass23_2.method662();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass23Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass23Array1.length; local44++) {
				if (this.aClass23Array1[local44] != null) {
					try {
						this.aClass23Array1[local44].method662();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass23_3 != null) {
			try {
				this.aClass23_3.method662();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lclient!da;")
	public Interface1 method2192() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ca;")
	public Class14 method2193(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2194(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!ca;")
	private Class14 method2194(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(12) Class14 local12 = new Class14();
		local12.anInt515 = arg0;
		local12.anInt517 = arg2;
		local12.anObject2 = arg1;
		synchronized (this) {
			if (this.aClass14_6 == null) {
				this.aClass14_6 = this.aClass14_7 = local12;
			} else {
				this.aClass14_6.aClass14_2 = local12;
				this.aClass14_6 = local12;
			}
			this.notify();
			return local12;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ca;")
	public Class14 method2195(@OriginalArg(1) URL arg0) {
		return this.method2194(0, arg0, 4);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!ca;")
	public Class14 method2196(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2194(0, new Object[] { arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method2197(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static131.aString4, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(74) int local74 = 0; local74 < local69.length; local74++) {
				for (@Pc(77) int local77 = 0; local77 < local46.length; local77++) {
					try {
						@Pc(82) String local82 = local46[local77];
						if (local82.length() > 0 && !(new File(local82)).exists()) {
							continue;
						}
						@Pc(108) File local108 = new File(local82 + local69[local74]);
						@Pc(119) boolean local119;
						if (local71 == 1 && !local108.exists()) {
							local119 = local108.mkdir();
							if (!local119) {
								continue;
							}
						}
						@Pc(131) File local131;
						if (this.aClass23_3 == null) {
							try {
								local131 = new File(local108, "random.dat");
								if (local71 == 1 || local131.exists()) {
									this.aClass23_3 = new Class23(local131, "rw", 25L);
								}
							} catch (@Pc(147) Exception local147) {
								this.aClass23_3 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local108 = new File(local108, arg0);
								if (local71 == 1 && !local108.exists()) {
									local119 = local108.mkdir();
									if (!local119) {
										continue;
									}
								}
								local131 = new File(local108, "main_file_cache.dat2");
								if (local71 == 0 && !local131.exists()) {
									continue;
								}
								this.aClass23_4 = new Class23(local131, "rw", 104857600L);
								this.aClass23Array1 = new Class23[arg2];
								for (@Pc(200) int local200 = 0; local200 < arg2; local200++) {
									this.aClass23Array1[local200] = new Class23(new File(local108, "main_file_cache.idx" + local200), "rw", 1048576L);
								}
								this.aClass23_2 = new Class23(new File(local108, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local108;
							} catch (@Pc(245) Exception local245) {
								try {
									this.aClass23_4.method662();
									for (@Pc(251) int local251 = 0; local251 < arg2; local251++) {
										this.aClass23Array1[local251].method662();
									}
									this.aClass23_2.method662();
								} catch (@Pc(268) Exception local268) {
								}
								this.aClass23_4 = this.aClass23_2 = null;
								this.aClass23Array1 = null;
								this.aFile3 = this.aFile2 = null;
							}
						}
					} catch (@Pc(285) Exception local285) {
					}
					if (this.aClass23_3 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lclient!ca;")
	public Class14 method2198(@OriginalArg(0) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method2194(0, new Object[] { arg2, arg1, arg0 }, 8);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!ca;")
	public Class14 method2199(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method2194(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lclient!ca;")
	public Class14 method2200(@OriginalArg(0) int arg0) {
		return this.method2194(arg0, null, 3);
	}

	@OriginalMember(owner = "client!qd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class14 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean127) {
						return;
					}
					if (this.aClass14_7 != null) {
						local15 = this.aClass14_7;
						this.aClass14_7 = this.aClass14_7.aClass14_2;
						if (this.aClass14_7 == null) {
							this.aClass14_6 = null;
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
				@Pc(41) int local41 = local15.anInt517;
				if (local41 == 1) {
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt515);
				} else if (local41 == 2) {
					@Pc(121) Thread local121 = new Thread((Runnable) local15.anObject2);
					local121.setDaemon(true);
					local121.start();
					local121.setPriority(local15.anInt515);
					local15.anObject1 = local121;
				} else if (local41 == 4) {
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(63) Object[] local63;
					if (local41 == 8) {
						local63 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local63[0]).getDeclaredMethod((String) local63[1], (Class[]) local63[2]);
					} else if (local41 == 9) {
						local63 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local63[0]).getDeclaredField((String) local63[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt516 = 1;
			} catch (@Pc(150) ThreadDeath local150) {
				throw local150;
			} catch (@Pc(153) Throwable local153) {
				local15.anInt516 = 2;
			}
		}
	}
}
