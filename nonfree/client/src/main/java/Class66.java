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

@OriginalClass("client!qe")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!wf;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "[Lclient!vh;")
	public Class87[] aClass87Array1;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!vh;")
	public Class87 aClass87_3 = null;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!vh;")
	public Class87 aClass87_2 = null;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
	private boolean aBoolean139 = false;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!je;")
	private Class41 aClass41_5 = null;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "Lclient!vh;")
	public Class87 aClass87_4 = null;

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Lclient!je;")
	private Class41 aClass41_6 = null;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class66(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static134.aString4 = "Unknown";
		Static134.aString5 = "1.1";
		this.anApplet1 = arg1;
		try {
			Static134.aString4 = System.getProperty("java.vendor");
			Static134.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static134.aString3 = System.getProperty("user.home");
			if (Static134.aString3 != null) {
				Static134.aString3 = Static134.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static134.aString3 == null) {
			Static134.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static134.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static134.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static134.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static134.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2126(arg3, arg4, arg2);
		}
		this.aBoolean139 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/net/URL;)Lclient!je;")
	public Class41 method2123(@OriginalArg(1) URL arg0) {
		return this.method2130(arg0, 0, 4);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public void method2124() {
		synchronized (this) {
			this.aBoolean139 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass87_2 != null) {
			try {
				this.aClass87_2.method2752();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass87_3 != null) {
			try {
				this.aClass87_3.method2752();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass87Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass87Array1.length; local50++) {
				if (this.aClass87Array1[local50] != null) {
					try {
						this.aClass87Array1[local50].method2752();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass87_4 != null) {
			try {
				this.aClass87_4.method2752();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!je;")
	public Class41 method2125(@OriginalArg(0) int arg0) {
		return this.method2130(null, arg0, 3);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method2126(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static134.aString3, "/tmp/", "" };
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(69) int local69 = 0; local69 < 2; local69++) {
			for (@Pc(72) int local72 = 0; local72 < local67.length; local72++) {
				for (@Pc(75) int local75 = 0; local75 < local44.length; local75++) {
					try {
						@Pc(80) String local80 = local44[local75];
						if (local80.length() > 0 && !(new File(local80)).exists()) {
							continue;
						}
						@Pc(103) File local103 = new File(local80 + local67[local72]);
						@Pc(112) boolean local112;
						if (local69 == 1 && !local103.exists()) {
							local112 = local103.mkdir();
							if (!local112) {
								continue;
							}
						}
						@Pc(124) File local124;
						if (this.aClass87_4 == null) {
							try {
								local124 = new File(local103, "random.dat");
								if (local69 == 1 || local124.exists()) {
									this.aClass87_4 = new Class87(local124, "rw", 25L);
								}
							} catch (@Pc(140) Exception local140) {
								this.aClass87_4 = null;
							}
						}
						if (this.aFile1 == null) {
							try {
								local103 = new File(local103, arg0);
								if (local69 == 1 && !local103.exists()) {
									local112 = local103.mkdir();
									if (!local112) {
										continue;
									}
								}
								local124 = new File(local103, "main_file_cache.dat2");
								if (local69 == 0 && !local124.exists()) {
									continue;
								}
								this.aClass87_2 = new Class87(local124, "rw", 104857600L);
								this.aClass87Array1 = new Class87[arg1];
								for (@Pc(195) int local195 = 0; local195 < arg1; local195++) {
									this.aClass87Array1[local195] = new Class87(new File(local103, "main_file_cache.idx" + local195), "rw", 1048576L);
								}
								this.aClass87_3 = new Class87(new File(local103, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local103;
							} catch (@Pc(244) Exception local244) {
								try {
									this.aClass87_2.method2752();
									for (@Pc(250) int local250 = 0; local250 < arg1; local250++) {
										this.aClass87Array1[local250].method2752();
									}
									this.aClass87_3.method2752();
								} catch (@Pc(267) Exception local267) {
								}
								this.aClass87Array1 = null;
								this.aFile2 = this.aFile1 = null;
								this.aClass87_2 = this.aClass87_3 = null;
							}
						}
					} catch (@Pc(284) Exception local284) {
					}
					if (this.aClass87_4 != null && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!je;")
	public Class41 method2127(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2130(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lclient!je;")
	public Class41 method2128(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method2130(new Object[] { arg0, arg1, arg2 }, 0, 8);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!je;")
	public Class41 method2129(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method2130(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class41 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean139) {
						return;
					}
					if (this.aClass41_6 != null) {
						local15 = this.aClass41_6;
						this.aClass41_6 = this.aClass41_6.aClass41_2;
						if (this.aClass41_6 == null) {
							this.aClass41_5 = null;
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
				@Pc(41) int local41 = local15.anInt2098;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt2097);
				} else if (local41 == 2) {
					@Pc(70) Thread local70 = new Thread((Runnable) local15.anObject1);
					local70.setDaemon(true);
					local70.start();
					local70.setPriority(local15.anInt2097);
					local15.anObject2 = local70;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(95) Object[] local95;
					if (local41 == 8) {
						local95 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local95[0]).getDeclaredMethod((String) local95[1], (Class[]) local95[2]);
					} else if (local41 == 9) {
						local95 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local95[0]).getDeclaredField((String) local95[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2096 = 1;
			} catch (@Pc(150) ThreadDeath local150) {
				throw local150;
			} catch (@Pc(153) Throwable local153) {
				local15.anInt2096 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Lclient!je;")
	private Class41 method2130(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class41 local3 = new Class41();
		local3.anInt2097 = arg1;
		local3.anObject1 = arg0;
		local3.anInt2098 = arg2;
		synchronized (this) {
			if (this.aClass41_5 == null) {
				this.aClass41_5 = this.aClass41_6 = local3;
			} else {
				this.aClass41_5.aClass41_2 = local3;
				this.aClass41_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lclient!wf;")
	public Interface3 method2131() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!je;")
	public Class41 method2132(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method2130(new Object[] { arg1, arg0 }, 0, 9);
	}
}
