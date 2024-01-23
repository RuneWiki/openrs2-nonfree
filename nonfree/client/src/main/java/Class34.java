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

@OriginalClass("client!ej")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!ui;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "[Lclient!fi;")
	public Class39[] aClass39Array1;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "Lclient!fi;")
	public Class39 aClass39_3 = null;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "Lclient!ni;")
	private Class84 aClass84_3 = null;

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "Lclient!fi;")
	public Class39 aClass39_2 = null;

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "Lclient!ni;")
	private Class84 aClass84_2 = null;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "Lclient!fi;")
	public Class39 aClass39_4 = null;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class34(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static53.aString4 = "1.1";
		Static53.aString2 = "Unknown";
		try {
			Static53.aString2 = System.getProperty("java.vendor");
			Static53.aString4 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static53.aString6 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static53.aString6 = "Unknown";
		}
		Static53.aString7 = Static53.aString6.toLowerCase();
		try {
			Static53.aString3 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static53.aString3 = "";
		}
		try {
			Static53.aString8 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static53.aString8 = "";
		}
		try {
			Static53.aString5 = System.getProperty("user.home");
			if (Static53.aString5 != null) {
				Static53.aString5 = Static53.aString5 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static53.aString5 == null) {
			Static53.aString5 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg1 == null) {
				Static53.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static53.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg1 == null) {
				Static53.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static53.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		if (arg0) {
			this.method1057(arg2, arg3, arg4);
		}
		this.aBoolean116 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Lclient!ui;")
	public Interface2 method1056() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method1057(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(34) String[] local34 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(69) String[] local69 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static53.aString5, "/tmp/", "" };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(74) int local74 = 0; local74 < local34.length; local74++) {
				for (@Pc(77) int local77 = 0; local77 < local69.length; local77++) {
					try {
						@Pc(82) String local82 = local69[local77];
						if (local82.length() > 0 && !(new File(local82)).exists()) {
							continue;
						}
						@Pc(108) File local108 = new File(local82 + local34[local74]);
						@Pc(119) boolean local119;
						if (local71 == 1 && !local108.exists()) {
							local119 = local108.mkdir();
							if (!local119) {
								continue;
							}
						}
						@Pc(131) File local131;
						if (this.aClass39_4 == null) {
							try {
								local131 = new File(local108, "random.dat");
								if (local71 == 1 || local131.exists()) {
									this.aClass39_4 = new Class39(local131, "rw", 25L);
								}
							} catch (@Pc(147) Exception local147) {
								this.aClass39_4 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local108 = new File(local108, arg1);
								if (local71 == 1 && !local108.exists()) {
									local119 = local108.mkdir();
									if (!local119) {
										continue;
									}
								}
								local131 = new File(local108, "main_file_cache.dat2");
								if (local71 == 0 && !local131.exists()) {
									continue;
								}
								this.aClass39_2 = new Class39(local131, "rw", 104857600L);
								this.aClass39Array1 = new Class39[arg2];
								for (@Pc(197) int local197 = 0; local197 < arg2; local197++) {
									this.aClass39Array1[local197] = new Class39(new File(local108, "main_file_cache.idx" + local197), "rw", 1048576L);
								}
								this.aClass39_3 = new Class39(new File(local108, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local108;
							} catch (@Pc(246) Exception local246) {
								try {
									this.aClass39_2.method1200();
									for (@Pc(252) int local252 = 0; local252 < arg2; local252++) {
										this.aClass39Array1[local252].method1200();
									}
									this.aClass39_3.method1200();
								} catch (@Pc(273) Exception local273) {
								}
								this.aFile1 = this.aFile2 = null;
								this.aClass39Array1 = null;
								this.aClass39_2 = this.aClass39_3 = null;
							}
						}
					} catch (@Pc(290) Exception local290) {
					}
					if (this.aClass39_4 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!ni;")
	private Class84 method1058(@OriginalArg(2) Object arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class84 local3 = new Class84();
		local3.anObject3 = arg0;
		local3.anInt3172 = arg2;
		local3.anInt3170 = arg1;
		synchronized (this) {
			if (this.aClass84_2 == null) {
				this.aClass84_2 = this.aClass84_3 = local3;
			} else {
				this.aClass84_2.aClass84_8 = local3;
				this.aClass84_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ej", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class84 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean116) {
						return;
					}
					if (this.aClass84_3 != null) {
						local15 = this.aClass84_3;
						this.aClass84_3 = this.aClass84_3.aClass84_8;
						if (this.aClass84_3 == null) {
							this.aClass84_2 = null;
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
				@Pc(41) int local41 = local15.anInt3172;
				if (local41 == 1) {
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt3170);
				} else if (local41 == 2) {
					@Pc(127) Thread local127 = new Thread((Runnable) local15.anObject3);
					local127.setDaemon(true);
					local127.start();
					local127.setPriority(local15.anInt3170);
					local15.anObject4 = local127;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(78) Object[] local78;
					if (local41 == 8) {
						local78 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local78[0]).getDeclaredMethod((String) local78[1], (Class[]) local78[2]);
					} else if (local41 == 9) {
						local78 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local78[0]).getDeclaredField((String) local78[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt3171 = 1;
			} catch (@Pc(144) ThreadDeath local144) {
				throw local144;
			} catch (@Pc(147) Throwable local147) {
				local15.anInt3171 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!ni;")
	public Class84 method1059(@OriginalArg(1) Class arg0) {
		return this.method1058(arg0, 0, 11);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ni;")
	public Class84 method1060(@OriginalArg(0) String arg0) {
		return this.method1058(arg0, 0, 12);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Lclient!ni;")
	public Class84 method1061(@OriginalArg(0) int arg0) {
		return this.method1058(null, arg0, 3);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/net/URL;Z)Lclient!ni;")
	public Class84 method1062(@OriginalArg(0) URL arg0) {
		return this.method1058(arg0, 0, 4);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!ni;")
	public Class84 method1063(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method1058(new Object[] { arg1, arg0 }, 0, 9);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public void method1064() {
		synchronized (this) {
			this.aBoolean116 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass39_2 != null) {
			try {
				this.aClass39_2.method1200();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass39_3 != null) {
			try {
				this.aClass39_3.method1200();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass39Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass39Array1.length; local49++) {
				if (this.aClass39Array1[local49] != null) {
					try {
						this.aClass39Array1[local49].method1200();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass39_4 != null) {
			try {
				this.aClass39_4.method1200();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILjava/lang/String;)Lclient!ni;")
	public Class84 method1065(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method1058(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lclient!ni;")
	public Class84 method1067(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return this.method1058(new Object[] { arg2, arg1, arg0 }, 0, 8);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!ni;")
	public Class84 method1068(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1058(arg1, arg0, 2);
	}
}
