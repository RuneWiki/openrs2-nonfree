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

@OriginalClass("client!bi")
public final class Class12 implements Runnable {

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[Lclient!md;")
	public Class67[] aClass67Array1;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "Lclient!qd;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!md;")
	public Class67 aClass67_2 = null;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!mb;")
	private Class65 aClass65_1 = null;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Lclient!mb;")
	private Class65 aClass65_2 = null;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Lclient!md;")
	public Class67 aClass67_1 = null;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "Lclient!md;")
	public Class67 aClass67_3 = null;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class12(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static19.aString1 = "1.1";
		Static19.aString2 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static19.aString2 = System.getProperty("java.vendor");
			Static19.aString1 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static19.aString3 = System.getProperty("user.home");
			if (Static19.aString3 != null) {
				Static19.aString3 = Static19.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static19.aString3 == null) {
			Static19.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static19.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static19.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static19.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static19.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method296(arg3, arg2, arg4);
		}
		this.aBoolean18 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public void method292() {
		synchronized (this) {
			this.aBoolean18 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass67_2 != null) {
			try {
				this.aClass67_2.method1871();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass67_3 != null) {
			try {
				this.aClass67_3.method1871();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass67Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass67Array1.length; local52++) {
				if (this.aClass67Array1[local52] != null) {
					try {
						this.aClass67Array1[local52].method1871();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass67_1 != null) {
			try {
				this.aClass67_1.method1871();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBILjava/lang/Object;)Lclient!mb;")
	private Class65 method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class65 local3 = new Class65();
		local3.anObject2 = arg2;
		local3.anInt2447 = arg0;
		local3.anInt2445 = arg1;
		synchronized (this) {
			if (this.aClass65_2 == null) {
				this.aClass65_2 = this.aClass65_1 = local3;
			} else {
				this.aClass65_2.aClass65_7 = local3;
				this.aClass65_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lclient!mb;")
	public Class65 method294(@OriginalArg(1) int arg0) {
		return this.method293(arg0, 3, null);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!mb;")
	public Class65 method295(@OriginalArg(0) URL arg0) {
		return this.method293(0, 4, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;BII)V")
	private void method296(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static19.aString3, "/tmp/", "" };
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local78.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local34.length; local86++) {
					try {
						@Pc(91) String local91 = local34[local86];
						if (local91.length() > 0 && !(new File(local91)).exists()) {
							continue;
						}
						@Pc(114) File local114 = new File(local91 + local78[local83]);
						@Pc(123) boolean local123;
						if (local80 == 1 && !local114.exists()) {
							local123 = local114.mkdir();
							if (!local123) {
								continue;
							}
						}
						@Pc(135) File local135;
						if (this.aClass67_1 == null) {
							try {
								local135 = new File(local114, "random.dat");
								if (local80 == 1 || local135.exists()) {
									this.aClass67_1 = new Class67(local135, "rw", 25L);
								}
							} catch (@Pc(153) Exception local153) {
								this.aClass67_1 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local114 = new File(local114, arg0);
								if (local80 == 1 && !local114.exists()) {
									local123 = local114.mkdir();
									if (!local123) {
										continue;
									}
								}
								local135 = new File(local114, "main_file_cache.dat2");
								if (local80 == 0 && !local135.exists()) {
									continue;
								}
								this.aClass67_2 = new Class67(local135, "rw", 104857600L);
								this.aClass67Array1 = new Class67[arg2];
								for (@Pc(206) int local206 = 0; local206 < arg2; local206++) {
									this.aClass67Array1[local206] = new Class67(new File(local114, "main_file_cache.idx" + local206), "rw", 1048576L);
								}
								this.aClass67_3 = new Class67(new File(local114, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local114;
							} catch (@Pc(251) Exception local251) {
								try {
									this.aClass67_2.method1871();
									for (@Pc(259) int local259 = 0; local259 < arg2; local259++) {
										this.aClass67Array1[local259].method1871();
									}
									this.aClass67_3.method1871();
								} catch (@Pc(282) Exception local282) {
								}
								this.aClass67_2 = this.aClass67_3 = null;
								this.aClass67Array1 = null;
								this.aFile1 = this.aFile2 = null;
							}
						}
					} catch (@Pc(299) Exception local299) {
					}
					if (this.aClass67_1 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!mb;")
	public Class65 method297(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method293(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!mb;")
	public Class65 method298(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method293(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class65 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean18) {
						return;
					}
					if (this.aClass65_1 != null) {
						local15 = this.aClass65_1;
						this.aClass65_1 = this.aClass65_1.aClass65_7;
						if (this.aClass65_1 == null) {
							this.aClass65_2 = null;
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
				@Pc(41) int local41 = local15.anInt2445;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt2447);
				} else if (local41 == 2) {
					@Pc(129) Thread local129 = new Thread((Runnable) local15.anObject2);
					local129.setDaemon(true);
					local129.start();
					local129.setPriority(local15.anInt2447);
					local15.anObject3 = local129;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(71) Object[] local71;
					if (local41 == 8) {
						local71 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local71[0]).getDeclaredMethod((String) local71[1], (Class[]) local71[2]);
					} else if (local41 == 9) {
						local71 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local71[0]).getDeclaredField((String) local71[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2446 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt2446 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Lclient!mb;")
	public Class65 method299(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2) {
		return this.method293(0, 8, new Object[] { arg2, arg0, arg1 });
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!mb;")
	public Class65 method300(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method293(0, 9, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Lclient!qd;")
	public Interface3 method301() {
		return this.anInterface3_1;
	}
}
