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

@OriginalClass("client!bb")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "[Lclient!pe;")
	public Class55[] aClass55Array1;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!d;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!ie;")
	private Class32 aClass32_2 = null;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!pe;")
	public Class55 aClass55_3 = null;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!pe;")
	public Class55 aClass55_1 = null;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!ie;")
	private Class32 aClass32_3 = null;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!pe;")
	public Class55 aClass55_2 = null;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class7(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static7.aString2 = "1.1";
		this.anApplet1 = arg1;
		Static7.aString3 = "Unknown";
		try {
			Static7.aString3 = System.getProperty("java.vendor");
			Static7.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static7.aString1 = System.getProperty("user.home");
			if (Static7.aString1 != null) {
				Static7.aString1 = Static7.aString1 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static7.aString1 == null) {
			Static7.aString1 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static7.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static7.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static7.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static7.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method283(arg4, arg3, arg2);
		}
		this.aBoolean13 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)Lclient!ie;")
	public Class32 method276(@OriginalArg(0) int arg0) {
		return this.method282(arg0, 3, null);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lclient!ie;")
	public Class32 method277(@OriginalArg(1) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method282(0, 8, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public void method278() {
		synchronized (this) {
			this.aBoolean13 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass55_2 != null) {
			try {
				this.aClass55_2.method1615();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass55_1 != null) {
			try {
				this.aClass55_1.method1615();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass55Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass55Array1.length; local49++) {
				if (this.aClass55Array1[local49] != null) {
					try {
						this.aClass55Array1[local49].method1615();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass55_3 != null) {
			try {
				this.aClass55_3.method1615();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!ie;")
	public Class32 method279(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method282(0, 9, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lclient!d;")
	public Interface1 method280() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;B)Lclient!ie;")
	public Class32 method281(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method282(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!ie;")
	private Class32 method282(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class32 local3 = new Class32();
		local3.anInt1493 = arg0;
		local3.anInt1492 = arg1;
		local3.anObject3 = arg2;
		synchronized (this) {
			if (this.aClass32_2 == null) {
				this.aClass32_2 = this.aClass32_3 = local3;
			} else {
				this.aClass32_2.aClass32_6 = local3;
				this.aClass32_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLjava/lang/String;I)V")
	private void method283(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(30) String[] local30 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(65) String[] local65 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static7.aString1, "/tmp/", "" };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(81) int local81 = 0; local81 < local30.length; local81++) {
				for (@Pc(84) int local84 = 0; local84 < local65.length; local84++) {
					try {
						@Pc(89) String local89 = local65[local84];
						if (local89.length() > 0 && !(new File(local89)).exists()) {
							continue;
						}
						@Pc(115) File local115 = new File(local89 + local30[local81]);
						@Pc(124) boolean local124;
						if (local78 == 1 && !local115.exists()) {
							local124 = local115.mkdir();
							if (!local124) {
								continue;
							}
						}
						@Pc(136) File local136;
						if (this.aClass55_3 == null) {
							try {
								local136 = new File(local115, "random.dat");
								if (local78 == 1 || local136.exists()) {
									this.aClass55_3 = new Class55(local136, "rw", 25L);
								}
							} catch (@Pc(152) Exception local152) {
								this.aClass55_3 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local115 = new File(local115, arg1);
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
								this.aClass55_2 = new Class55(local136, "rw", 52428800L);
								this.aClass55Array1 = new Class55[arg0];
								for (@Pc(207) int local207 = 0; local207 < arg0; local207++) {
									this.aClass55Array1[local207] = new Class55(new File(local115, "main_file_cache.idx" + local207), "rw", 1048576L);
								}
								this.aClass55_1 = new Class55(new File(local115, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local115;
							} catch (@Pc(252) Exception local252) {
								try {
									this.aClass55_2.method1615();
									for (@Pc(258) int local258 = 0; local258 < arg0; local258++) {
										this.aClass55Array1[local258].method1615();
									}
									this.aClass55_1.method1615();
								} catch (@Pc(279) Exception local279) {
								}
								this.aClass55_2 = this.aClass55_1 = null;
								this.aClass55Array1 = null;
								this.aFile1 = this.aFile2 = null;
							}
						}
					} catch (@Pc(296) Exception local296) {
					}
					if (this.aClass55_3 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class32 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean13) {
						return;
					}
					if (this.aClass32_3 != null) {
						local15 = this.aClass32_3;
						this.aClass32_3 = this.aClass32_3.aClass32_6;
						if (this.aClass32_3 == null) {
							this.aClass32_2 = null;
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
				@Pc(41) int local41 = local15.anInt1492;
				if (local41 == 1) {
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt1493);
				} else if (local41 == 2) {
					@Pc(68) Thread local68 = new Thread((Runnable) local15.anObject3);
					local68.setDaemon(true);
					local68.start();
					local68.setPriority(local15.anInt1493);
					local15.anObject4 = local68;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(101) Object[] local101;
					if (local41 == 8) {
						local101 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local101[0]).getDeclaredMethod((String) local101[1], (Class[]) local101[2]);
					} else if (local41 == 9) {
						local101 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local101[0]).getDeclaredField((String) local101[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1494 = 1;
			} catch (@Pc(144) ThreadDeath local144) {
				throw local144;
			} catch (@Pc(147) Throwable local147) {
				local15.anInt1494 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!ie;")
	public Class32 method284(@OriginalArg(0) URL arg0) {
		return this.method282(0, 4, arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!ie;")
	public Class32 method285(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method282(arg1, 2, arg0);
	}
}
