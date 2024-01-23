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

@OriginalClass("client!gj")
public final class Class41 implements Runnable {

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "Lclient!mb;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "[Lclient!me;")
	public Class62[] aClass62Array1;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "Lclient!me;")
	public Class62 aClass62_1 = null;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "Lclient!me;")
	public Class62 aClass62_2 = null;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Lclient!eg;")
	private Class33 aClass33_7 = null;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "Lclient!me;")
	public Class62 aClass62_3 = null;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Lclient!eg;")
	private Class33 aClass33_6 = null;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class41(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static76.aString2 = "1.1";
		this.anApplet1 = arg1;
		Static76.aString5 = "Unknown";
		try {
			Static76.aString5 = System.getProperty("java.vendor");
			Static76.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static76.aString4 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(49) Exception local49) {
			Static76.aString4 = "unknown";
		}
		try {
			Static76.aString3 = System.getProperty("user.home");
			if (Static76.aString3 != null) {
				Static76.aString3 = Static76.aString3 + "/";
			}
		} catch (@Pc(67) Exception local67) {
		}
		if (Static76.aString3 == null) {
			Static76.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(77) Throwable local77) {
		}
		try {
			if (arg1 == null) {
				Static76.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static76.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(104) Exception local104) {
		}
		try {
			if (arg1 == null) {
				Static76.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static76.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(131) Exception local131) {
		}
		if (arg0) {
			this.method1269(arg4, arg2, arg3);
		}
		this.aBoolean58 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!gj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class33 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean58) {
						return;
					}
					if (this.aClass33_7 != null) {
						local15 = this.aClass33_7;
						this.aClass33_7 = this.aClass33_7.aClass33_3;
						if (this.aClass33_7 == null) {
							this.aClass33_6 = null;
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
				@Pc(41) int local41 = local15.anInt948;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt949);
				} else if (local41 == 2) {
					@Pc(135) Thread local135 = new Thread((Runnable) local15.anObject1);
					local135.setDaemon(true);
					local135.start();
					local135.setPriority(local15.anInt949);
					local15.anObject2 = local135;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local41 == 8) {
						local92 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local41 == 9) {
						local92 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt947 = 1;
			} catch (@Pc(152) ThreadDeath local152) {
				throw local152;
			} catch (@Pc(155) Throwable local155) {
				local15.anInt947 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!eg;")
	public Class33 method1259(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1267(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!eg;")
	public Class33 method1260(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1267(9, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	public void method1261() {
		synchronized (this) {
			this.aBoolean58 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass62_3 != null) {
			try {
				this.aClass62_3.method2305();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass62_1 != null) {
			try {
				this.aClass62_1.method2305();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass62Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass62Array1.length; local55++) {
				if (this.aClass62Array1[local55] != null) {
					try {
						this.aClass62Array1[local55].method2305();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass62_2 != null) {
			try {
				this.aClass62_2.method2305();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!eg;")
	public Class33 method1262(@OriginalArg(0) String arg0) {
		return this.method1267(12, arg0, 0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)Lclient!eg;")
	public Class33 method1263(@OriginalArg(0) int arg0) {
		return this.method1267(3, null, arg0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLjava/lang/String;I)Lclient!eg;")
	public Class33 method1264(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method1267(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!eg;")
	public Class33 method1266(@OriginalArg(0) Class arg0) {
		return this.method1267(11, arg0, 0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lclient!eg;")
	private Class33 method1267(@OriginalArg(0) int arg0, @OriginalArg(3) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class33 local3 = new Class33();
		local3.anInt949 = arg2;
		local3.anObject1 = arg1;
		local3.anInt948 = arg0;
		synchronized (this) {
			if (this.aClass33_6 == null) {
				this.aClass33_6 = this.aClass33_7 = local3;
			} else {
				this.aClass33_6.aClass33_3 = local3;
				this.aClass33_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Lclient!mb;")
	public Interface1 method1268() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method1269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static76.aString3, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local75.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local52.length; local83++) {
					try {
						@Pc(88) String local88 = local52[local83];
						if (local88.length() > 0 && !(new File(local88)).exists()) {
							continue;
						}
						@Pc(114) File local114 = new File(local88 + local75[local80]);
						@Pc(123) boolean local123;
						if (local77 == 1 && !local114.exists()) {
							local123 = local114.mkdir();
							if (!local123) {
								continue;
							}
						}
						@Pc(135) File local135;
						if (this.aClass62_2 == null) {
							try {
								local135 = new File(local114, "random.dat");
								if (local77 == 1 || local135.exists()) {
									this.aClass62_2 = new Class62(local135, "rw", 25L);
								}
							} catch (@Pc(151) Exception local151) {
								this.aClass62_2 = null;
							}
						}
						if (this.aFile1 == null) {
							try {
								local114 = new File(local114, arg2);
								if (local77 == 1 && !local114.exists()) {
									local123 = local114.mkdir();
									if (!local123) {
										continue;
									}
								}
								local135 = new File(local114, "main_file_cache.dat2");
								if (local77 == 0 && !local135.exists()) {
									continue;
								}
								this.aClass62_3 = new Class62(local135, "rw", 104857600L);
								this.aClass62Array1 = new Class62[arg0];
								for (@Pc(204) int local204 = 0; local204 < arg0; local204++) {
									this.aClass62Array1[local204] = new Class62(new File(local114, "main_file_cache.idx" + local204), "rw", 1048576L);
								}
								this.aClass62_1 = new Class62(new File(local114, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local114;
							} catch (@Pc(249) Exception local249) {
								try {
									this.aClass62_3.method2305();
									for (@Pc(257) int local257 = 0; local257 < arg0; local257++) {
										this.aClass62Array1[local257].method2305();
									}
									this.aClass62_1.method2305();
								} catch (@Pc(282) Exception local282) {
								}
								this.aFile2 = this.aFile1 = null;
								this.aClass62Array1 = null;
								this.aClass62_3 = this.aClass62_1 = null;
							}
						}
					} catch (@Pc(299) Exception local299) {
					}
					if (this.aClass62_2 != null && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!eg;")
	public Class33 method1270(@OriginalArg(0) URL arg0) {
		return this.method1267(4, arg0, 0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Class;)Lclient!eg;")
	public Class33 method1271(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method1267(8, new Object[] { arg2, arg1, arg0 }, 0);
	}
}
