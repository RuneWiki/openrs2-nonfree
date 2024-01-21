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

@OriginalClass("client!vf")
public final class Class80 implements Runnable {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "[Lclient!oe;")
	public Class54[] aClass54Array1;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!uf;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!oe;")
	public Class54 aClass54_2 = null;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!bd;")
	private Class10 aClass10_8 = null;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!oe;")
	public Class54 aClass54_3 = null;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!bd;")
	private Class10 aClass10_7 = null;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Lclient!oe;")
	public Class54 aClass54_4 = null;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class80(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static128.aString3 = "Unknown";
		this.anApplet1 = arg1;
		Static128.aString5 = "1.1";
		try {
			Static128.aString3 = System.getProperty("java.vendor");
			Static128.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static128.aString4 = System.getProperty("user.home");
			if (Static128.aString4 != null) {
				Static128.aString4 = Static128.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static128.aString4 == null) {
			Static128.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static128.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static128.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static128.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static128.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2036(arg2, arg4, arg3);
		}
		this.aBoolean116 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lclient!bd;")
	public Class10 method2035(@OriginalArg(1) int arg0) {
		return this.method2044(3, null, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method2036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static128.aString4, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local67.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local34.length; local83++) {
					try {
						@Pc(88) String local88 = local34[local83];
						if (local88.length() > 0 && !(new File(local88)).exists()) {
							continue;
						}
						@Pc(114) File local114 = new File(local88 + local67[local80]);
						@Pc(125) boolean local125;
						if (local77 == 1 && !local114.exists()) {
							local125 = local114.mkdir();
							if (!local125) {
								continue;
							}
						}
						@Pc(137) File local137;
						if (this.aClass54_4 == null) {
							try {
								local137 = new File(local114, "random.dat");
								if (local77 == 1 || local137.exists()) {
									this.aClass54_4 = new Class54(local137, "rw", 25L);
								}
							} catch (@Pc(155) Exception local155) {
								this.aClass54_4 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local114 = new File(local114, arg2);
								if (local77 == 1 && !local114.exists()) {
									local125 = local114.mkdir();
									if (!local125) {
										continue;
									}
								}
								local137 = new File(local114, "main_file_cache.dat2");
								if (local77 == 0 && !local137.exists()) {
									continue;
								}
								this.aClass54_2 = new Class54(local137, "rw", 52428800L);
								this.aClass54Array1 = new Class54[arg1];
								for (@Pc(207) int local207 = 0; local207 < arg1; local207++) {
									this.aClass54Array1[local207] = new Class54(new File(local114, "main_file_cache.idx" + local207), "rw", 1048576L);
								}
								this.aClass54_3 = new Class54(new File(local114, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local114;
							} catch (@Pc(252) Exception local252) {
								try {
									this.aClass54_2.method1586();
									for (@Pc(258) int local258 = 0; local258 < arg1; local258++) {
										this.aClass54Array1[local258].method1586();
									}
									this.aClass54_3.method1586();
								} catch (@Pc(275) Exception local275) {
								}
								this.aClass54_2 = this.aClass54_3 = null;
								this.aFile3 = this.aFile2 = null;
								this.aClass54Array1 = null;
							}
						}
					} catch (@Pc(292) Exception local292) {
					}
					if (this.aClass54_4 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!bd;")
	public Class10 method2037(@OriginalArg(0) URL arg0) {
		return this.method2044(4, arg0, 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!bd;")
	public Class10 method2038(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method2044(8, new Object[] { arg1, arg2, arg0 }, 0);
	}

	@OriginalMember(owner = "client!vf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class10 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean116) {
						return;
					}
					if (this.aClass10_8 != null) {
						local15 = this.aClass10_8;
						this.aClass10_8 = this.aClass10_8.aClass10_3;
						if (this.aClass10_8 == null) {
							this.aClass10_7 = null;
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
				@Pc(41) int local41 = local15.anInt241;
				if (local41 == 1) {
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt243);
				} else if (local41 == 2) {
					@Pc(115) Thread local115 = new Thread((Runnable) local15.anObject2);
					local115.setDaemon(true);
					local115.start();
					local115.setPriority(local15.anInt243);
					local15.anObject1 = local115;
				} else if (local41 == 4) {
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(66) Object[] local66;
					if (local41 == 8) {
						local66 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local66[0]).getDeclaredMethod((String) local66[1], (Class[]) local66[2]);
					} else if (local41 == 9) {
						local66 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local66[0]).getDeclaredField((String) local66[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt242 = 1;
			} catch (@Pc(144) ThreadDeath local144) {
				throw local144;
			} catch (@Pc(147) Throwable local147) {
				local15.anInt242 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;BI)Lclient!bd;")
	public Class10 method2039(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method2044(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!bd;")
	public Class10 method2040(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2044(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public void method2041() {
		synchronized (this) {
			this.aBoolean116 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass54_2 != null) {
			try {
				this.aClass54_2.method1586();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass54_3 != null) {
			try {
				this.aClass54_3.method1586();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass54Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass54Array1.length; local44++) {
				if (this.aClass54Array1[local44] != null) {
					try {
						this.aClass54Array1[local44].method1586();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass54_4 != null) {
			try {
				this.aClass54_4.method1586();
			} catch (@Pc(74) IOException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!bd;")
	public Class10 method2042(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2044(9, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)Lclient!uf;")
	public Interface3 method2043() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/lang/Object;BII)Lclient!bd;")
	private Class10 method2044(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(9) Class10 local9 = new Class10();
		local9.anInt243 = arg2;
		local9.anInt241 = arg0;
		local9.anObject2 = arg1;
		synchronized (this) {
			if (this.aClass10_7 == null) {
				this.aClass10_7 = this.aClass10_8 = local9;
			} else {
				this.aClass10_7.aClass10_3 = local9;
				this.aClass10_7 = local9;
			}
			this.notify();
			return local9;
		}
	}
}
