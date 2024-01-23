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
public final class Class87 implements Runnable {

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Lclient!ih;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "[Lclient!fg;")
	public Class34[] aClass34Array1;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!ud;")
	private Class116 aClass116_5 = null;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!fg;")
	public Class34 aClass34_3 = null;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!fg;")
	public Class34 aClass34_4 = null;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!fg;")
	public Class34 aClass34_2 = null;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Lclient!ud;")
	private Class116 aClass116_6 = null;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class87(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static161.aString6 = "Unknown";
		Static161.aString8 = "1.1";
		this.anApplet1 = arg1;
		try {
			Static161.aString6 = System.getProperty("java.vendor");
			Static161.aString8 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static161.aString7 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static161.aString7 = "Unknown";
		}
		Static161.aString9 = Static161.aString7.toLowerCase();
		try {
			Static161.aString4 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static161.aString4 = "";
		}
		try {
			Static161.aString10 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static161.aString10 = "";
		}
		try {
			Static161.aString5 = System.getProperty("user.home");
			if (Static161.aString5 != null) {
				Static161.aString5 = Static161.aString5 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static161.aString5 == null) {
			Static161.aString5 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg1 == null) {
				Static161.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static161.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg1 == null) {
				Static161.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static161.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		if (arg0) {
			this.method2685(arg3, arg4, arg2);
		}
		this.aBoolean141 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;II)V")
	private void method2685(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static161.aString5, "/tmp/", "" };
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local67.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local44.length; local81++) {
					try {
						@Pc(86) String local86 = local44[local81];
						if (local86.length() > 0 && !(new File(local86)).exists()) {
							continue;
						}
						@Pc(112) File local112 = new File(local86 + local67[local78]);
						@Pc(121) boolean local121;
						if (local75 == 1 && !local112.exists()) {
							local121 = local112.mkdir();
							if (!local121) {
								continue;
							}
						}
						@Pc(133) File local133;
						if (this.aClass34_4 == null) {
							try {
								local133 = new File(local112, "random.dat");
								if (local75 == 1 || local133.exists()) {
									this.aClass34_4 = new Class34(local133, "rw", 25L);
								}
							} catch (@Pc(151) Exception local151) {
								this.aClass34_4 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local112 = new File(local112, arg0);
								if (local75 == 1 && !local112.exists()) {
									local121 = local112.mkdir();
									if (!local121) {
										continue;
									}
								}
								local133 = new File(local112, "main_file_cache.dat2");
								if (local75 == 0 && !local133.exists()) {
									continue;
								}
								this.aClass34_2 = new Class34(local133, "rw", 104857600L);
								this.aClass34Array1 = new Class34[arg1];
								for (@Pc(206) int local206 = 0; local206 < arg1; local206++) {
									this.aClass34Array1[local206] = new Class34(new File(local112, "main_file_cache.idx" + local206), "rw", 1048576L);
								}
								this.aClass34_3 = new Class34(new File(local112, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local112;
							} catch (@Pc(251) Exception local251) {
								try {
									this.aClass34_2.method949();
									for (@Pc(257) int local257 = 0; local257 < arg1; local257++) {
										this.aClass34Array1[local257].method949();
									}
									this.aClass34_3.method949();
								} catch (@Pc(280) Exception local280) {
								}
								this.aFile3 = this.aFile2 = null;
								this.aClass34_2 = this.aClass34_3 = null;
								this.aClass34Array1 = null;
							}
						}
					} catch (@Pc(297) Exception local297) {
					}
					if (this.aClass34_4 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!ud;")
	public Class116 method2686(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method2693(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lclient!ih;")
	public Interface2 method2687() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lclient!ud;")
	public Class116 method2689(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return this.method2693(8, 0, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ud;")
	public Class116 method2690(@OriginalArg(1) String arg0) {
		return this.method2693(12, 0, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!ud;")
	public Class116 method2691(@OriginalArg(1) int arg0) {
		return this.method2693(3, arg0, null);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!ud;")
	public Class116 method2692(@OriginalArg(0) URL arg0) {
		return this.method2693(4, 0, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!ud;")
	private Class116 method2693(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(7) Class116 local7 = new Class116();
		local7.anObject4 = arg2;
		local7.anInt4154 = arg1;
		local7.anInt4155 = arg0;
		synchronized (this) {
			if (this.aClass116_6 == null) {
				this.aClass116_6 = this.aClass116_5 = local7;
			} else {
				this.aClass116_6.aClass116_8 = local7;
				this.aClass116_6 = local7;
			}
			this.notify();
			return local7;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!ud;")
	public Class116 method2694(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method2693(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public void method2695() {
		synchronized (this) {
			this.aBoolean141 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass34_2 != null) {
			try {
				this.aClass34_2.method949();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass34_3 != null) {
			try {
				this.aClass34_3.method949();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass34Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass34Array1.length; local44++) {
				if (this.aClass34Array1[local44] != null) {
					try {
						this.aClass34Array1[local44].method949();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass34_4 != null) {
			try {
				this.aClass34_4.method949();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!ud;")
	public Class116 method2696(@OriginalArg(1) Class arg0) {
		return this.method2693(11, 0, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class116 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean141) {
						return;
					}
					if (this.aClass116_5 != null) {
						local15 = this.aClass116_5;
						this.aClass116_5 = this.aClass116_5.aClass116_8;
						if (this.aClass116_5 == null) {
							this.aClass116_6 = null;
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
				@Pc(41) int local41 = local15.anInt4155;
				if (local41 == 1) {
					local15.anObject5 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt4154);
				} else if (local41 == 2) {
					@Pc(129) Thread local129 = new Thread((Runnable) local15.anObject4);
					local129.setDaemon(true);
					local129.start();
					local129.setPriority(local15.anInt4154);
					local15.anObject5 = local129;
				} else if (local41 == 4) {
					local15.anObject5 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(71) Object[] local71;
					if (local41 == 8) {
						local71 = (Object[]) local15.anObject4;
						local15.anObject5 = ((Class) local71[0]).getDeclaredMethod((String) local71[1], (Class[]) local71[2]);
					} else if (local41 == 9) {
						local71 = (Object[]) local15.anObject4;
						local15.anObject5 = ((Class) local71[0]).getDeclaredField((String) local71[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt4156 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt4156 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!ud;")
	public Class116 method2697(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2693(9, 0, new Object[] { arg0, arg1 });
	}
}
