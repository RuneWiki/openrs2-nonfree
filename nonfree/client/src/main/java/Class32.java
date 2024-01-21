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

@OriginalClass("client!gg")
public final class Class32 implements Runnable {

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!sh;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "[Lclient!tc;")
	public Class74[] aClass74Array1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!ea;")
	private Class18 aClass18_4 = null;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!tc;")
	public Class74 aClass74_2 = null;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Lclient!tc;")
	public Class74 aClass74_1 = null;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!tc;")
	public Class74 aClass74_3 = null;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!ea;")
	private Class18 aClass18_3 = null;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class32(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static62.aString2 = "Unknown";
		this.anApplet1 = arg1;
		Static62.aString3 = "1.1";
		try {
			Static62.aString2 = System.getProperty("java.vendor");
			Static62.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static62.aString1 = System.getProperty("user.home");
			if (Static62.aString1 != null) {
				Static62.aString1 = Static62.aString1 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static62.aString1 == null) {
			Static62.aString1 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static62.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static62.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static62.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static62.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1482(arg3, arg2, arg4);
		}
		this.aBoolean71 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILjava/lang/String;)Lclient!ea;")
	public Class18 method1475(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method1481(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!ea;")
	public Class18 method1476(@OriginalArg(0) URL arg0) {
		return this.method1481(0, arg0, 4);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lclient!ea;")
	public Class18 method1477(@OriginalArg(0) int arg0) {
		return this.method1481(arg0, null, 3);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/Class;Ljava/lang/String;)Lclient!ea;")
	public Class18 method1478(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method1481(0, new Object[] { arg1, arg2, arg0 }, 8);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lclient!sh;")
	public Interface1 method1479() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Lclient!ea;")
	public Class18 method1480(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method1481(0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!ea;")
	private Class18 method1481(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class18 local8 = new Class18();
		local8.anObject3 = arg1;
		local8.anInt1404 = arg0;
		local8.anInt1402 = arg2;
		synchronized (this) {
			if (this.aClass18_4 == null) {
				this.aClass18_4 = this.aClass18_3 = local8;
			} else {
				this.aClass18_4.aClass18_2 = local8;
				this.aClass18_4 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method1482(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(41) String[] local41 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(76) String[] local76 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static62.aString1, "/tmp/", "" };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(81) int local81 = 0; local81 < local41.length; local81++) {
				for (@Pc(84) int local84 = 0; local84 < local76.length; local84++) {
					try {
						@Pc(89) String local89 = local76[local84];
						if (local89.length() > 0 && !(new File(local89)).exists()) {
							continue;
						}
						@Pc(115) File local115 = new File(local89 + local41[local81]);
						@Pc(124) boolean local124;
						if (local78 == 1 && !local115.exists()) {
							local124 = local115.mkdir();
							if (!local124) {
								continue;
							}
						}
						@Pc(136) File local136;
						if (this.aClass74_2 == null) {
							try {
								local136 = new File(local115, "random.dat");
								if (local78 == 1 || local136.exists()) {
									this.aClass74_2 = new Class74(local136, "rw", 25L);
								}
							} catch (@Pc(152) Exception local152) {
								this.aClass74_2 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local115 = new File(local115, arg0);
								if (local78 == 1 && !local115.exists()) {
									local124 = local115.mkdir();
									if (!local124) {
										continue;
									}
								}
								local136 = new File(local115, "main_file_cache.dat2");
								if (local78 == 0 && !local136.exists()) {
									continue;
								}
								this.aClass74_3 = new Class74(local136, "rw", 104857600L);
								this.aClass74Array1 = new Class74[arg2];
								for (@Pc(204) int local204 = 0; local204 < arg2; local204++) {
									this.aClass74Array1[local204] = new Class74(new File(local115, "main_file_cache.idx" + local204), "rw", 1048576L);
								}
								this.aClass74_1 = new Class74(new File(local115, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local115;
							} catch (@Pc(249) Exception local249) {
								try {
									this.aClass74_3.method3174();
									for (@Pc(255) int local255 = 0; local255 < arg2; local255++) {
										this.aClass74Array1[local255].method3174();
									}
									this.aClass74_1.method3174();
								} catch (@Pc(272) Exception local272) {
								}
								this.aFile1 = this.aFile2 = null;
								this.aClass74Array1 = null;
								this.aClass74_3 = this.aClass74_1 = null;
							}
						}
					} catch (@Pc(289) Exception local289) {
					}
					if (this.aClass74_2 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!ea;")
	public Class18 method1483(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method1481(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!gg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class18 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean71) {
						return;
					}
					if (this.aClass18_3 != null) {
						local15 = this.aClass18_3;
						this.aClass18_3 = this.aClass18_3.aClass18_2;
						if (this.aClass18_3 == null) {
							this.aClass18_4 = null;
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
				@Pc(41) int local41 = local15.anInt1402;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt1404);
				} else if (local41 == 2) {
					@Pc(54) Thread local54 = new Thread((Runnable) local15.anObject3);
					local54.setDaemon(true);
					local54.start();
					local54.setPriority(local15.anInt1404);
					local15.anObject2 = local54;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(94) Object[] local94;
					if (local41 == 8) {
						local94 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local94[0]).getDeclaredMethod((String) local94[1], (Class[]) local94[2]);
					} else if (local41 == 9) {
						local94 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local94[0]).getDeclaredField((String) local94[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1403 = 1;
			} catch (@Pc(142) ThreadDeath local142) {
				throw local142;
			} catch (@Pc(145) Throwable local145) {
				local15.anInt1403 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public void method1484() {
		synchronized (this) {
			this.aBoolean71 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass74_3 != null) {
			try {
				this.aClass74_3.method3174();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass74_1 != null) {
			try {
				this.aClass74_1.method3174();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass74Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass74Array1.length; local49++) {
				if (this.aClass74Array1[local49] != null) {
					try {
						this.aClass74Array1[local49].method3174();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass74_2 != null) {
			try {
				this.aClass74_2.method3174();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}
}
