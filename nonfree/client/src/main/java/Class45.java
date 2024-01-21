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

@OriginalClass("client!ke")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "[Lclient!sa;")
	public Class77[] aClass77Array1;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!fg;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!sa;")
	public Class77 aClass77_3 = null;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!sa;")
	public Class77 aClass77_4 = null;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!sa;")
	public Class77 aClass77_2 = null;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!da;")
	private Class16 aClass16_5 = null;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!da;")
	private Class16 aClass16_6 = null;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class45(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static89.aString3 = "1.1";
		this.anApplet1 = arg1;
		Static89.aString2 = "Unknown";
		try {
			Static89.aString2 = System.getProperty("java.vendor");
			Static89.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static89.aString1 = System.getProperty("user.home");
			if (Static89.aString1 != null) {
				Static89.aString1 = Static89.aString1 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static89.aString1 == null) {
			Static89.aString1 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static89.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static89.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static89.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static89.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1483(arg3, arg4, arg2);
		}
		this.aBoolean80 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!da;")
	public Class16 method1479(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method1481(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lclient!fg;")
	public Interface2 method1480() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lclient!da;")
	private Class16 method1481(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class16 local8 = new Class16();
		local8.anInt751 = arg0;
		local8.anObject2 = arg1;
		local8.anInt750 = arg2;
		synchronized (this) {
			if (this.aClass16_5 == null) {
				this.aClass16_5 = this.aClass16_6 = local8;
			} else {
				this.aClass16_5.aClass16_2 = local8;
				this.aClass16_5 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Lclient!da;")
	public Class16 method1482(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method1481(0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;IBI)V")
	private void method1483(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static89.aString1, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local50.length; local81++) {
					try {
						@Pc(86) String local86 = local50[local81];
						if (local86.length() > 0 && !(new File(local86)).exists()) {
							continue;
						}
						@Pc(109) File local109 = new File(local86 + local73[local78]);
						@Pc(118) boolean local118;
						if (local75 == 1 && !local109.exists()) {
							local118 = local109.mkdir();
							if (!local118) {
								continue;
							}
						}
						@Pc(130) File local130;
						if (this.aClass77_4 == null) {
							try {
								local130 = new File(local109, "random.dat");
								if (local75 == 1 || local130.exists()) {
									this.aClass77_4 = new Class77(local130, "rw", 25L);
								}
							} catch (@Pc(148) Exception local148) {
								this.aClass77_4 = null;
							}
						}
						if (this.aFile1 == null) {
							try {
								local109 = new File(local109, arg0);
								if (local75 == 1 && !local109.exists()) {
									local118 = local109.mkdir();
									if (!local118) {
										continue;
									}
								}
								local130 = new File(local109, "main_file_cache.dat2");
								if (local75 == 0 && !local130.exists()) {
									continue;
								}
								this.aClass77_2 = new Class77(local130, "rw", 104857600L);
								this.aClass77Array1 = new Class77[arg1];
								for (@Pc(203) int local203 = 0; local203 < arg1; local203++) {
									this.aClass77Array1[local203] = new Class77(new File(local109, "main_file_cache.idx" + local203), "rw", 1048576L);
								}
								this.aClass77_3 = new Class77(new File(local109, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local109;
							} catch (@Pc(248) Exception local248) {
								try {
									this.aClass77_2.method2432();
									for (@Pc(254) int local254 = 0; local254 < arg1; local254++) {
										this.aClass77Array1[local254].method2432();
									}
									this.aClass77_3.method2432();
								} catch (@Pc(271) Exception local271) {
								}
								this.aClass77Array1 = null;
								this.aFile2 = this.aFile1 = null;
								this.aClass77_2 = this.aClass77_3 = null;
							}
						}
					} catch (@Pc(288) Exception local288) {
					}
					if (this.aClass77_4 != null && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!da;")
	public Class16 method1484(@OriginalArg(0) URL arg0) {
		return this.method1481(0, arg0, 4);
	}

	@OriginalMember(owner = "client!ke", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class16 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean80) {
						return;
					}
					if (this.aClass16_6 != null) {
						local15 = this.aClass16_6;
						this.aClass16_6 = this.aClass16_6.aClass16_2;
						if (this.aClass16_6 == null) {
							this.aClass16_5 = null;
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
				@Pc(41) int local41 = local15.anInt750;
				if (local41 == 1) {
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt751);
				} else if (local41 == 2) {
					@Pc(58) Thread local58 = new Thread((Runnable) local15.anObject2);
					local58.setDaemon(true);
					local58.start();
					local58.setPriority(local15.anInt751);
					local15.anObject1 = local58;
				} else if (local41 == 4) {
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(100) Object[] local100;
					if (local41 == 8) {
						local100 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local100[0]).getDeclaredMethod((String) local100[1], (Class[]) local100[2]);
					} else if (local41 == 9) {
						local100 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local100[0]).getDeclaredField((String) local100[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt749 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt749 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public void method1485() {
		synchronized (this) {
			this.aBoolean80 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass77_2 != null) {
			try {
				this.aClass77_2.method2432();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass77_3 != null) {
			try {
				this.aClass77_3.method2432();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass77Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass77Array1.length; local50++) {
				if (this.aClass77Array1[local50] != null) {
					try {
						this.aClass77Array1[local50].method2432();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass77_4 != null) {
			try {
				this.aClass77_4.method2432();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZLjava/lang/String;)Lclient!da;")
	public Class16 method1486(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method1481(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lclient!da;")
	public Class16 method1487(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2) {
		return this.method1481(0, new Object[] { arg2, arg0, arg1 }, 8);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lclient!da;")
	public Class16 method1488(@OriginalArg(1) int arg0) {
		return this.method1481(arg0, null, 3);
	}
}
