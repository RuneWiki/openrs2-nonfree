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

@OriginalClass("client!rf")
public final class Class74 implements Runnable {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "[Lclient!kc;")
	public Class46[] aClass46Array1;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Lclient!sb;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!kc;")
	public Class46 aClass46_2 = null;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!pe;")
	private Class63 aClass63_6 = null;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "Lclient!kc;")
	public Class46 aClass46_4 = null;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!kc;")
	public Class46 aClass46_3 = null;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!pe;")
	private Class63 aClass63_7 = null;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class74(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static143.aString3 = "Unknown";
		Static143.aString2 = "1.1";
		try {
			Static143.aString3 = System.getProperty("java.vendor");
			Static143.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static143.aString4 = System.getProperty("user.home");
			if (Static143.aString4 != null) {
				Static143.aString4 = Static143.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static143.aString4 == null) {
			Static143.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static143.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static143.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static143.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static143.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2479(arg3, arg2, arg4);
		}
		this.aBoolean185 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!rf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class63 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean185) {
						return;
					}
					if (this.aClass63_6 != null) {
						local15 = this.aClass63_6;
						this.aClass63_6 = this.aClass63_6.aClass63_5;
						if (this.aClass63_6 == null) {
							this.aClass63_7 = null;
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
				@Pc(41) int local41 = local15.anInt3325;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt3326);
				} else if (local41 == 2) {
					@Pc(68) Thread local68 = new Thread((Runnable) local15.anObject2);
					local68.setDaemon(true);
					local68.start();
					local68.setPriority(local15.anInt3326);
					local15.anObject3 = local68;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(108) Object[] local108;
					if (local41 == 8) {
						local108 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local108[0]).getDeclaredMethod((String) local108[1], (Class[]) local108[2]);
					} else if (local41 == 9) {
						local108 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local108[0]).getDeclaredField((String) local108[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt3324 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt3324 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Lclient!pe;")
	public Class63 method2477(@OriginalArg(0) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method2480(8, new Object[] { arg0, arg2, arg1 }, 0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILjava/lang/String;)Lclient!pe;")
	public Class63 method2478(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method2480(1, arg1, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method2479(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(47) String[] local47 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static143.aString4, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(75) int local75 = 0; local75 < local70.length; local75++) {
				for (@Pc(78) int local78 = 0; local78 < local47.length; local78++) {
					try {
						@Pc(83) String local83 = local47[local78];
						if (local83.length() > 0 && !(new File(local83)).exists()) {
							continue;
						}
						@Pc(109) File local109 = new File(local83 + local70[local75]);
						@Pc(120) boolean local120;
						if (local72 == 1 && !local109.exists()) {
							local120 = local109.mkdir();
							if (!local120) {
								continue;
							}
						}
						@Pc(132) File local132;
						if (this.aClass46_2 == null) {
							try {
								local132 = new File(local109, "random.dat");
								if (local72 == 1 || local132.exists()) {
									this.aClass46_2 = new Class46(local132, "rw", 25L);
								}
							} catch (@Pc(150) Exception local150) {
								this.aClass46_2 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local109 = new File(local109, arg0);
								if (local72 == 1 && !local109.exists()) {
									local120 = local109.mkdir();
									if (!local120) {
										continue;
									}
								}
								local132 = new File(local109, "main_file_cache.dat2");
								if (local72 == 0 && !local132.exists()) {
									continue;
								}
								this.aClass46_4 = new Class46(local132, "rw", 104857600L);
								this.aClass46Array1 = new Class46[arg2];
								for (@Pc(203) int local203 = 0; local203 < arg2; local203++) {
									this.aClass46Array1[local203] = new Class46(new File(local109, "main_file_cache.idx" + local203), "rw", 1048576L);
								}
								this.aClass46_3 = new Class46(new File(local109, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local109;
							} catch (@Pc(248) Exception local248) {
								try {
									this.aClass46_4.method1501();
									for (@Pc(254) int local254 = 0; local254 < arg2; local254++) {
										this.aClass46Array1[local254].method1501();
									}
									this.aClass46_3.method1501();
								} catch (@Pc(275) Exception local275) {
								}
								this.aFile3 = this.aFile2 = null;
								this.aClass46Array1 = null;
								this.aClass46_4 = this.aClass46_3 = null;
							}
						}
					} catch (@Pc(292) Exception local292) {
					}
					if (this.aClass46_2 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!pe;")
	private Class63 method2480(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class63 local3 = new Class63();
		local3.anInt3325 = arg0;
		local3.anObject2 = arg1;
		local3.anInt3326 = arg2;
		synchronized (this) {
			if (this.aClass63_7 == null) {
				this.aClass63_7 = this.aClass63_6 = local3;
			} else {
				this.aClass63_7.aClass63_5 = local3;
				this.aClass63_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!pe;")
	public Class63 method2481(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2480(9, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!pe;")
	public Class63 method2482(@OriginalArg(1) int arg0) {
		return this.method2480(3, null, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method2483() {
		synchronized (this) {
			this.aBoolean185 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass46_4 != null) {
			try {
				this.aClass46_4.method1501();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass46_3 != null) {
			try {
				this.aClass46_3.method1501();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass46Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass46Array1.length; local52++) {
				if (this.aClass46Array1[local52] != null) {
					try {
						this.aClass46Array1[local52].method1501();
					} catch (@Pc(68) IOException local68) {
					}
				}
			}
		}
		if (this.aClass46_2 != null) {
			try {
				this.aClass46_2.method1501();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!pe;")
	public Class63 method2484(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2480(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!pe;")
	public Class63 method2485(@OriginalArg(0) URL arg0) {
		return this.method2480(4, arg0, 0);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Lclient!sb;")
	public Interface3 method2486() {
		return this.anInterface3_1;
	}
}
