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

@OriginalClass("client!rh")
public final class Class76 implements Runnable {

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "[Lclient!kh;")
	public Class51[] aClass51Array1;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Lclient!r;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Lclient!td;")
	private Class84 aClass84_6 = null;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "Lclient!kh;")
	public Class51 aClass51_2 = null;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Lclient!kh;")
	public Class51 aClass51_3 = null;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "Lclient!td;")
	private Class84 aClass84_7 = null;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Lclient!kh;")
	public Class51 aClass51_4 = null;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class76(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static150.aString4 = "Unknown";
		Static150.aString5 = "1.1";
		try {
			Static150.aString4 = System.getProperty("java.vendor");
			Static150.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static150.aString3 = System.getProperty("user.home");
			if (Static150.aString3 != null) {
				Static150.aString3 = Static150.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static150.aString3 == null) {
			Static150.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static150.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static150.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static150.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static150.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2568(arg4, arg2, arg3);
		}
		this.aBoolean138 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/net/URL;)Lclient!td;")
	public Class84 method2560(@OriginalArg(1) URL arg0) {
		return this.method2567(0, 4, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class84 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean138) {
						return;
					}
					if (this.aClass84_7 != null) {
						local15 = this.aClass84_7;
						this.aClass84_7 = this.aClass84_7.aClass84_8;
						if (this.aClass84_7 == null) {
							this.aClass84_6 = null;
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
				@Pc(41) int local41 = local15.anInt3577;
				if (local41 == 1) {
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt3579);
				} else if (local41 == 2) {
					@Pc(127) Thread local127 = new Thread((Runnable) local15.anObject3);
					local127.setDaemon(true);
					local127.start();
					local127.setPriority(local15.anInt3579);
					local15.anObject4 = local127;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(79) Object[] local79;
					if (local41 == 8) {
						local79 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local79[0]).getDeclaredMethod((String) local79[1], (Class[]) local79[2]);
					} else if (local41 == 9) {
						local79 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local79[0]).getDeclaredField((String) local79[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt3578 = 1;
			} catch (@Pc(144) ThreadDeath local144) {
				throw local144;
			} catch (@Pc(147) Throwable local147) {
				local15.anInt3578 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)Lclient!td;")
	public Class84 method2561(@OriginalArg(0) int arg0) {
		return this.method2567(arg0, 3, null);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method2562() {
		synchronized (this) {
			this.aBoolean138 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass51_4 != null) {
			try {
				this.aClass51_4.method1865();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass51_2 != null) {
			try {
				this.aClass51_2.method1865();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass51Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass51Array1.length; local48++) {
				if (this.aClass51Array1[local48] != null) {
					try {
						this.aClass51Array1[local48].method1865();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass51_3 != null) {
			try {
				this.aClass51_3.method1865();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!td;")
	public Class84 method2563(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2567(0, 9, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!td;")
	public Class84 method2564(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method2567(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lclient!td;")
	public Class84 method2565(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method2567(0, 8, new Object[] { arg0, arg1, arg2 });
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!td;")
	public Class84 method2566(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method2567(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!td;")
	private Class84 method2567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		@Pc(3) Class84 local3 = new Class84();
		local3.anInt3577 = arg1;
		local3.anObject3 = arg2;
		local3.anInt3579 = arg0;
		synchronized (this) {
			if (this.aClass84_6 == null) {
				this.aClass84_6 = this.aClass84_7 = local3;
			} else {
				this.aClass84_6.aClass84_8 = local3;
				this.aClass84_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIILjava/lang/String;)V")
	private void method2568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(32) String[] local32 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(67) String[] local67 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static150.aString3, "/tmp/", "" };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local32.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local67.length; local79++) {
					try {
						@Pc(84) String local84 = local67[local79];
						if (local84.length() > 0 && !(new File(local84)).exists()) {
							continue;
						}
						@Pc(107) File local107 = new File(local84 + local32[local76]);
						@Pc(116) boolean local116;
						if (local73 == 1 && !local107.exists()) {
							local116 = local107.mkdir();
							if (!local116) {
								continue;
							}
						}
						@Pc(128) File local128;
						if (this.aClass51_3 == null) {
							try {
								local128 = new File(local107, "random.dat");
								if (local73 == 1 || local128.exists()) {
									this.aClass51_3 = new Class51(local128, "rw", 25L);
								}
							} catch (@Pc(144) Exception local144) {
								this.aClass51_3 = null;
							}
						}
						if (this.aFile3 == null) {
							try {
								local107 = new File(local107, arg2);
								if (local73 == 1 && !local107.exists()) {
									local116 = local107.mkdir();
									if (!local116) {
										continue;
									}
								}
								local128 = new File(local107, "main_file_cache.dat2");
								if (local73 == 0 && !local128.exists()) {
									continue;
								}
								this.aClass51_4 = new Class51(local128, "rw", 104857600L);
								this.aClass51Array1 = new Class51[arg0];
								for (@Pc(197) int local197 = 0; local197 < arg0; local197++) {
									this.aClass51Array1[local197] = new Class51(new File(local107, "main_file_cache.idx" + local197), "rw", 1048576L);
								}
								this.aClass51_2 = new Class51(new File(local107, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local107;
							} catch (@Pc(246) Exception local246) {
								try {
									this.aClass51_4.method1865();
									for (@Pc(252) int local252 = 0; local252 < arg0; local252++) {
										this.aClass51Array1[local252].method1865();
									}
									this.aClass51_2.method1865();
								} catch (@Pc(273) Exception local273) {
								}
								this.aClass51Array1 = null;
								this.aFile2 = this.aFile3 = null;
								this.aClass51_4 = this.aClass51_2 = null;
							}
						}
					} catch (@Pc(290) Exception local290) {
					}
					if (this.aClass51_3 != null && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lclient!r;")
	public Interface2 method2569() {
		return this.anInterface2_2;
	}
}
