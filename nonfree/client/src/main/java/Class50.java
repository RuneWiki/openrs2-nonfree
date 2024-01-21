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

@OriginalClass("client!ma")
public final class Class50 implements Runnable {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!ve;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "[Lclient!hh;")
	public Class35[] aClass35Array1;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!hh;")
	public Class35 aClass35_1 = null;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Lclient!sh;")
	private Class78 aClass78_6 = null;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!hh;")
	public Class35 aClass35_2 = null;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!sh;")
	private Class78 aClass78_5 = null;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!hh;")
	public Class35 aClass35_3 = null;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class50(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static95.aString5 = "Unknown";
		Static95.aString3 = "1.1";
		try {
			Static95.aString5 = System.getProperty("java.vendor");
			Static95.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static95.aString4 = System.getProperty("user.home");
			if (Static95.aString4 != null) {
				Static95.aString4 = Static95.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static95.aString4 == null) {
			Static95.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static95.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static95.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static95.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static95.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1751(arg2, arg3, arg4);
		}
		this.aBoolean105 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!sh;")
	public Class78 method1743(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method1749(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLjava/net/URL;)Lclient!sh;")
	public Class78 method1744(@OriginalArg(1) URL arg0) {
		return this.method1749(0, arg0, 4);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public void method1745() {
		synchronized (this) {
			this.aBoolean105 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass35_2 != null) {
			try {
				this.aClass35_2.method1286();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass35_3 != null) {
			try {
				this.aClass35_3.method1286();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass35Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass35Array1.length; local55++) {
				if (this.aClass35Array1[local55] != null) {
					try {
						this.aClass35Array1[local55].method1286();
					} catch (@Pc(69) IOException local69) {
					}
				}
			}
		}
		if (this.aClass35_1 != null) {
			try {
				this.aClass35_1.method1286();
			} catch (@Pc(85) IOException local85) {
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lclient!sh;")
	public Class78 method1746(@OriginalArg(1) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method1749(0, new Object[] { arg0, arg2, arg1 }, 8);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Lclient!ve;")
	public Interface3 method1747() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!sh;")
	public Class78 method1748(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1749(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!sh;")
	private Class78 method1749(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(9) Class78 local9 = new Class78();
		local9.anInt3647 = arg0;
		local9.anObject4 = arg1;
		local9.anInt3648 = arg2;
		synchronized (this) {
			if (this.aClass78_5 == null) {
				this.aClass78_5 = this.aClass78_6 = local9;
			} else {
				this.aClass78_5.aClass78_8 = local9;
				this.aClass78_5 = local9;
			}
			this.notify();
			return local9;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!sh;")
	public Class78 method1750(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1749(0, new Object[] { arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;IB)V")
	private void method1751(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static95.aString4, "/tmp/", "" };
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(69) int local69 = 0; local69 < 2; local69++) {
			for (@Pc(72) int local72 = 0; local72 < local67.length; local72++) {
				for (@Pc(75) int local75 = 0; local75 < local44.length; local75++) {
					try {
						@Pc(80) String local80 = local44[local75];
						if (local80.length() > 0 && !(new File(local80)).exists()) {
							continue;
						}
						@Pc(103) File local103 = new File(local80 + local67[local72]);
						@Pc(114) boolean local114;
						if (local69 == 1 && !local103.exists()) {
							local114 = local103.mkdir();
							if (!local114) {
								continue;
							}
						}
						@Pc(126) File local126;
						if (this.aClass35_1 == null) {
							try {
								local126 = new File(local103, "random.dat");
								if (local69 == 1 || local126.exists()) {
									this.aClass35_1 = new Class35(local126, "rw", 25L);
								}
							} catch (@Pc(144) Exception local144) {
								this.aClass35_1 = null;
							}
						}
						if (this.aFile3 == null) {
							try {
								local103 = new File(local103, arg1);
								if (local69 == 1 && !local103.exists()) {
									local114 = local103.mkdir();
									if (!local114) {
										continue;
									}
								}
								local126 = new File(local103, "main_file_cache.dat2");
								if (local69 == 0 && !local126.exists()) {
									continue;
								}
								this.aClass35_2 = new Class35(local126, "rw", 104857600L);
								this.aClass35Array1 = new Class35[arg2];
								for (@Pc(194) int local194 = 0; local194 < arg2; local194++) {
									this.aClass35Array1[local194] = new Class35(new File(local103, "main_file_cache.idx" + local194), "rw", 1048576L);
								}
								this.aClass35_3 = new Class35(new File(local103, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local103;
							} catch (@Pc(243) Exception local243) {
								try {
									this.aClass35_2.method1286();
									for (@Pc(249) int local249 = 0; local249 < arg2; local249++) {
										this.aClass35Array1[local249].method1286();
									}
									this.aClass35_3.method1286();
								} catch (@Pc(266) Exception local266) {
								}
								this.aClass35_2 = this.aClass35_3 = null;
								this.aClass35Array1 = null;
								this.aFile2 = this.aFile3 = null;
							}
						}
					} catch (@Pc(283) Exception local283) {
					}
					if (this.aClass35_1 != null && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ma", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class78 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean105) {
						return;
					}
					if (this.aClass78_6 != null) {
						local15 = this.aClass78_6;
						this.aClass78_6 = this.aClass78_6.aClass78_8;
						if (this.aClass78_6 == null) {
							this.aClass78_5 = null;
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
				@Pc(41) int local41 = local15.anInt3648;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt3647);
				} else if (local41 == 2) {
					@Pc(121) Thread local121 = new Thread((Runnable) local15.anObject4);
					local121.setDaemon(true);
					local121.start();
					local121.setPriority(local15.anInt3647);
					local15.anObject3 = local121;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(75) Object[] local75;
					if (local41 == 8) {
						local75 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local75[0]).getDeclaredMethod((String) local75[1], (Class[]) local75[2]);
					} else if (local41 == 9) {
						local75 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local75[0]).getDeclaredField((String) local75[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt3646 = 1;
			} catch (@Pc(150) ThreadDeath local150) {
				throw local150;
			} catch (@Pc(153) Throwable local153) {
				local15.anInt3646 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lclient!sh;")
	public Class78 method1752(@OriginalArg(1) int arg0) {
		return this.method1749(arg0, null, 3);
	}
}
