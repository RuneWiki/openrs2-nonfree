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

@OriginalClass("client!t")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!uf;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "[Lclient!gd;")
	public Class30[] aClass30Array1;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!gd;")
	public Class30 aClass30_2 = null;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!gd;")
	public Class30 aClass30_3 = null;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "Lclient!gd;")
	public Class30 aClass30_4 = null;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!fd;")
	private Class25 aClass25_41 = null;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!fd;")
	private Class25 aClass25_40 = null;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class81(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static170.aString5 = "Unknown";
		this.anApplet1 = arg1;
		Static170.aString4 = "1.1";
		try {
			Static170.aString5 = System.getProperty("java.vendor");
			Static170.aString4 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static170.aString3 = System.getProperty("user.home");
			if (Static170.aString3 != null) {
				Static170.aString3 = Static170.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static170.aString3 == null) {
			Static170.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static170.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static170.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static170.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static170.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method3155(arg3, arg4, arg2);
		}
		this.aBoolean164 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/net/URL;)Lclient!fd;")
	public Class25 method3148(@OriginalArg(1) URL arg0) {
		return this.method3151(0, arg0, 4);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)Lclient!uf;")
	public Interface2 method3149() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public void method3150() {
		synchronized (this) {
			this.aBoolean164 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass30_3 != null) {
			try {
				this.aClass30_3.method1403();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass30_4 != null) {
			try {
				this.aClass30_4.method1403();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass30Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass30Array1.length; local44++) {
				if (this.aClass30Array1[local44] != null) {
					try {
						this.aClass30Array1[local44].method1403();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass30_2 != null) {
			try {
				this.aClass30_2.method1403();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!fd;")
	private Class25 method3151(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class25 local12 = new Class25();
		local12.anInt1694 = arg0;
		local12.anObject1 = arg1;
		local12.anInt1696 = arg2;
		synchronized (this) {
			if (this.aClass25_41 == null) {
				this.aClass25_41 = this.aClass25_40 = local12;
			} else {
				this.aClass25_41.aClass25_15 = local12;
				this.aClass25_41 = local12;
			}
			this.notify();
			return local12;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Lclient!fd;")
	public Class25 method3152(@OriginalArg(0) int arg0) {
		return this.method3151(arg0, null, 3);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!fd;")
	public Class25 method3153(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3151(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!fd;")
	public Class25 method3154(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method3151(0, new Object[] { arg1, arg0, arg2 }, 8);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;IBI)V")
	private void method3155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(32) String[] local32 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(67) String[] local67 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static170.aString3, "/tmp/", "" };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local32.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local67.length; local79++) {
					try {
						@Pc(84) String local84 = local67[local79];
						if (local84.length() > 0 && !(new File(local84)).exists()) {
							continue;
						}
						@Pc(107) File local107 = new File(local84 + local32[local76]);
						@Pc(118) boolean local118;
						if (local73 == 1 && !local107.exists()) {
							local118 = local107.mkdir();
							if (!local118) {
								continue;
							}
						}
						@Pc(130) File local130;
						if (this.aClass30_2 == null) {
							try {
								local130 = new File(local107, "random.dat");
								if (local73 == 1 || local130.exists()) {
									this.aClass30_2 = new Class30(local130, "rw", 25L);
								}
							} catch (@Pc(146) Exception local146) {
								this.aClass30_2 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local107 = new File(local107, arg0);
								if (local73 == 1 && !local107.exists()) {
									local118 = local107.mkdir();
									if (!local118) {
										continue;
									}
								}
								local130 = new File(local107, "main_file_cache.dat2");
								if (local73 == 0 && !local130.exists()) {
									continue;
								}
								this.aClass30_3 = new Class30(local130, "rw", 104857600L);
								this.aClass30Array1 = new Class30[arg1];
								for (@Pc(196) int local196 = 0; local196 < arg1; local196++) {
									this.aClass30Array1[local196] = new Class30(new File(local107, "main_file_cache.idx" + local196), "rw", 1048576L);
								}
								this.aClass30_4 = new Class30(new File(local107, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local107;
							} catch (@Pc(245) Exception local245) {
								try {
									this.aClass30_3.method1403();
									for (@Pc(251) int local251 = 0; local251 < arg1; local251++) {
										this.aClass30Array1[local251].method1403();
									}
									this.aClass30_4.method1403();
								} catch (@Pc(272) Exception local272) {
								}
								this.aFile3 = this.aFile2 = null;
								this.aClass30_3 = this.aClass30_4 = null;
								this.aClass30Array1 = null;
							}
						}
					} catch (@Pc(289) Exception local289) {
					}
					if (this.aClass30_2 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class25 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean164) {
						return;
					}
					if (this.aClass25_40 != null) {
						local15 = this.aClass25_40;
						this.aClass25_40 = this.aClass25_40.aClass25_15;
						if (this.aClass25_40 == null) {
							this.aClass25_41 = null;
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
				@Pc(41) int local41 = local15.anInt1696;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt1694);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject1);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1694);
					local15.anObject2 = local56;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local41 == 8) {
						local81 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local41 == 9) {
						local81 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1695 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt1695 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!fd;")
	public Class25 method3156(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method3151(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Lclient!fd;")
	public Class25 method3157(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method3151(0, new Object[] { arg1, arg0 }, 9);
	}
}
