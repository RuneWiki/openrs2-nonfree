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

@OriginalClass("client!pc")
public final class Class63 implements Runnable {

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "[Lclient!qd;")
	public Class68[] aClass68Array1;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!uh;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!qd;")
	public Class68 aClass68_2 = null;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!dd;")
	private Class15 aClass15_6 = null;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Lclient!qd;")
	public Class68 aClass68_4 = null;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!qd;")
	public Class68 aClass68_3 = null;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!dd;")
	private Class15 aClass15_7 = null;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class63(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static122.aString4 = "1.1";
		Static122.aString2 = "Unknown";
		try {
			Static122.aString2 = System.getProperty("java.vendor");
			Static122.aString4 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static122.aString3 = System.getProperty("user.home");
			if (Static122.aString3 != null) {
				Static122.aString3 = Static122.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static122.aString3 == null) {
			Static122.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static122.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static122.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static122.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static122.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1959(arg3, arg4, arg2);
		}
		this.aBoolean121 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public void method1954() {
		synchronized (this) {
			this.aBoolean121 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass68_4 != null) {
			try {
				this.aClass68_4.method2092();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass68_2 != null) {
			try {
				this.aClass68_2.method2092();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass68Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass68Array1.length; local50++) {
				if (this.aClass68Array1[local50] != null) {
					try {
						this.aClass68Array1[local50].method2092();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass68_3 != null) {
			try {
				this.aClass68_3.method2092();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!dd;")
	public Class15 method1955(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method1961(0, new Object[] { arg1, arg0, arg2 }, 8);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/Runnable;IZ)Lclient!dd;")
	public Class15 method1956(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method1961(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lclient!uh;")
	public Interface3 method1957() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!dd;")
	public Class15 method1958(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method1961(0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;IIZ)V")
	private void method1959(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static122.aString3, "/tmp/", "" };
		@Pc(65) String[] local65 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(67) int local67 = 0; local67 < 2; local67++) {
			for (@Pc(70) int local70 = 0; local70 < local65.length; local70++) {
				for (@Pc(73) int local73 = 0; local73 < local42.length; local73++) {
					try {
						@Pc(78) String local78 = local42[local73];
						if (local78.length() > 0 && !(new File(local78)).exists()) {
							continue;
						}
						@Pc(104) File local104 = new File(local78 + local65[local70]);
						@Pc(113) boolean local113;
						if (local67 == 1 && !local104.exists()) {
							local113 = local104.mkdir();
							if (!local113) {
								continue;
							}
						}
						@Pc(125) File local125;
						if (this.aClass68_3 == null) {
							try {
								local125 = new File(local104, "random.dat");
								if (local67 == 1 || local125.exists()) {
									this.aClass68_3 = new Class68(local125, "rw", 25L);
								}
							} catch (@Pc(143) Exception local143) {
								this.aClass68_3 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local104 = new File(local104, arg0);
								if (local67 == 1 && !local104.exists()) {
									local113 = local104.mkdir();
									if (!local113) {
										continue;
									}
								}
								local125 = new File(local104, "main_file_cache.dat2");
								if (local67 == 0 && !local125.exists()) {
									continue;
								}
								this.aClass68_4 = new Class68(local125, "rw", 52428800L);
								this.aClass68Array1 = new Class68[arg1];
								for (@Pc(195) int local195 = 0; local195 < arg1; local195++) {
									this.aClass68Array1[local195] = new Class68(new File(local104, "main_file_cache.idx" + local195), "rw", 1048576L);
								}
								this.aClass68_2 = new Class68(new File(local104, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local104;
							} catch (@Pc(244) Exception local244) {
								try {
									this.aClass68_4.method2092();
									for (@Pc(250) int local250 = 0; local250 < arg1; local250++) {
										this.aClass68Array1[local250].method2092();
									}
									this.aClass68_2.method2092();
								} catch (@Pc(271) Exception local271) {
								}
								this.aFile1 = this.aFile2 = null;
								this.aClass68Array1 = null;
								this.aClass68_4 = this.aClass68_2 = null;
							}
						}
					} catch (@Pc(288) Exception local288) {
					}
					if (this.aClass68_3 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILjava/lang/String;)Lclient!dd;")
	public Class15 method1960(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method1961(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!dd;")
	private Class15 method1961(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class15 local3 = new Class15();
		local3.anInt822 = arg2;
		local3.anInt820 = arg0;
		local3.anObject1 = arg1;
		synchronized (this) {
			if (this.aClass15_7 == null) {
				this.aClass15_7 = this.aClass15_6 = local3;
			} else {
				this.aClass15_7.aClass15_2 = local3;
				this.aClass15_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/net/URL;)Lclient!dd;")
	public Class15 method1962(@OriginalArg(1) URL arg0) {
		return this.method1961(0, arg0, 4);
	}

	@OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class15 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean121) {
						return;
					}
					if (this.aClass15_6 != null) {
						local15 = this.aClass15_6;
						this.aClass15_6 = this.aClass15_6.aClass15_2;
						if (this.aClass15_6 == null) {
							this.aClass15_7 = null;
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
				@Pc(41) int local41 = local15.anInt822;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt820);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject1);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt820);
					local15.anObject2 = local56;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(89) Object[] local89;
					if (local41 == 8) {
						local89 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local89[0]).getDeclaredMethod((String) local89[1], (Class[]) local89[2]);
					} else if (local41 == 9) {
						local89 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local89[0]).getDeclaredField((String) local89[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt821 = 1;
			} catch (@Pc(144) ThreadDeath local144) {
				throw local144;
			} catch (@Pc(147) Throwable local147) {
				local15.anInt821 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!dd;")
	public Class15 method1963(@OriginalArg(1) int arg0) {
		return this.method1961(arg0, null, 3);
	}
}
