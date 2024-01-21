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

@OriginalClass("client!e")
public final class Class16 implements Runnable {

	@OriginalMember(owner = "client!e", name = "g", descriptor = "[Lclient!qa;")
	public Class70[] aClass70Array1;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!gf;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!qa;")
	public Class70 aClass70_1 = null;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!qa;")
	public Class70 aClass70_2 = null;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!qa;")
	public Class70 aClass70_3 = null;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!hf;")
	private Class32 aClass32_3 = null;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Lclient!hf;")
	private Class32 aClass32_2 = null;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class16(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static36.aString2 = "1.1";
		Static36.aString1 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static36.aString1 = System.getProperty("java.vendor");
			Static36.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static36.aString3 = System.getProperty("user.home");
			if (Static36.aString3 != null) {
				Static36.aString3 = Static36.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static36.aString3 == null) {
			Static36.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static36.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static36.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static36.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static36.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method981(arg3, arg2, arg4);
		}
		this.aBoolean78 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Lclient!hf;")
	public Class32 method979(@OriginalArg(0) int arg0) {
		return this.method986(3, arg0, null);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)Lclient!gf;")
	public Interface2 method980() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class32 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean78) {
						return;
					}
					if (this.aClass32_3 != null) {
						local15 = this.aClass32_3;
						this.aClass32_3 = this.aClass32_3.aClass32_4;
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
				@Pc(41) int local41 = local15.anInt1973;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt1975);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject3);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1975);
					local15.anObject2 = local56;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(82) Object[] local82;
					if (local41 == 8) {
						local82 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local82[0]).getDeclaredMethod((String) local82[1], (Class[]) local82[2]);
					} else if (local41 == 9) {
						local82 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local82[0]).getDeclaredField((String) local82[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1974 = 1;
			} catch (@Pc(144) ThreadDeath local144) {
				throw local144;
			} catch (@Pc(147) Throwable local147) {
				local15.anInt1974 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method981(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(30) String[] local30 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(65) String[] local65 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static36.aString3, "/tmp/", "" };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(75) int local75 = 0; local75 < local30.length; local75++) {
				for (@Pc(78) int local78 = 0; local78 < local65.length; local78++) {
					try {
						@Pc(83) String local83 = local65[local78];
						if (local83.length() > 0 && !(new File(local83)).exists()) {
							continue;
						}
						@Pc(109) File local109 = new File(local83 + local30[local75]);
						@Pc(120) boolean local120;
						if (local72 == 1 && !local109.exists()) {
							local120 = local109.mkdir();
							if (!local120) {
								continue;
							}
						}
						@Pc(132) File local132;
						if (this.aClass70_1 == null) {
							try {
								local132 = new File(local109, "random.dat");
								if (local72 == 1 || local132.exists()) {
									this.aClass70_1 = new Class70(local132, "rw", 25L);
								}
							} catch (@Pc(150) Exception local150) {
								this.aClass70_1 = null;
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
								this.aClass70_2 = new Class70(local132, "rw", 104857600L);
								this.aClass70Array1 = new Class70[arg2];
								for (@Pc(200) int local200 = 0; local200 < arg2; local200++) {
									this.aClass70Array1[local200] = new Class70(new File(local109, "main_file_cache.idx" + local200), "rw", 1048576L);
								}
								this.aClass70_3 = new Class70(new File(local109, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local109;
							} catch (@Pc(245) Exception local245) {
								try {
									this.aClass70_2.method2442();
									for (@Pc(251) int local251 = 0; local251 < arg2; local251++) {
										this.aClass70Array1[local251].method2442();
									}
									this.aClass70_3.method2442();
								} catch (@Pc(274) Exception local274) {
								}
								this.aClass70_2 = this.aClass70_3 = null;
								this.aClass70Array1 = null;
								this.aFile1 = this.aFile2 = null;
							}
						}
					} catch (@Pc(291) Exception local291) {
					}
					if (this.aClass70_1 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lclient!hf;")
	public Class32 method982(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method986(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/net/URL;)Lclient!hf;")
	public Class32 method983(@OriginalArg(1) URL arg0) {
		return this.method986(4, 0, arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lclient!hf;")
	public Class32 method984(@OriginalArg(1) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method986(8, 0, new Object[] { arg2, arg1, arg0 });
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!hf;")
	public Class32 method985(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method986(9, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIIILjava/lang/Object;)Lclient!hf;")
	private Class32 method986(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class32 local3 = new Class32();
		local3.anInt1975 = arg1;
		local3.anObject3 = arg2;
		local3.anInt1973 = arg0;
		synchronized (this) {
			if (this.aClass32_2 == null) {
				this.aClass32_2 = this.aClass32_3 = local3;
			} else {
				this.aClass32_2.aClass32_4 = local3;
				this.aClass32_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method987() {
		synchronized (this) {
			this.aBoolean78 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass70_2 != null) {
			try {
				this.aClass70_2.method2442();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass70_3 != null) {
			try {
				this.aClass70_3.method2442();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass70Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass70Array1.length; local52++) {
				if (this.aClass70Array1[local52] != null) {
					try {
						this.aClass70Array1[local52].method2442();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass70_1 != null) {
			try {
				this.aClass70_1.method2442();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;BI)Lclient!hf;")
	public Class32 method988(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method986(1, arg1, arg0);
	}
}
