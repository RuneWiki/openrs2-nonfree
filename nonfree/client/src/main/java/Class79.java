import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class79 implements Runnable {

	@OriginalMember(owner = "client!w", name = "i", descriptor = "[Lclient!ic;")
	public Class30[] aClass30Array1;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!ve;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!ic;")
	public Class30 aClass30_2 = null;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!jc;")
	private Class34 aClass34_8 = null;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!jc;")
	private Class34 aClass34_7 = null;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!ic;")
	public Class30 aClass30_3 = null;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	public int anInt3006 = 0;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class79(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static125.aString5 = "1.1";
		Static125.aString3 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static125.aString3 = System.getProperty("java.vendor");
			Static125.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static125.aString4 = System.getProperty("user.home");
			if (Static125.aString4 != null) {
				Static125.aString4 = Static125.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static125.aString4 == null) {
			Static125.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static125.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static125.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static125.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static125.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2092(arg3, arg4, arg2);
		}
		this.aBoolean238 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!w", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class34 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean238) {
						return;
					}
					if (this.aClass34_8 != null) {
						local15 = this.aClass34_8;
						this.aClass34_8 = this.aClass34_8.aClass34_3;
						if (this.aClass34_8 == null) {
							this.aClass34_7 = null;
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
				@Pc(41) int local41 = local15.anInt1569;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt1568);
				} else if (local41 == 2) {
					@Pc(68) Thread local68 = new Thread((Runnable) local15.anObject3);
					local68.setDaemon(true);
					local68.start();
					local68.setPriority(local15.anInt1568);
					local15.anObject2 = local68;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(110) Object[] local110;
					if (local41 == 8) {
						local110 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local110[0]).getDeclaredMethod((String) local110[1], (Class[]) local110[2]);
					} else if (local41 == 9) {
						local110 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local110[0]).getDeclaredField((String) local110[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1567 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt1567 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!jc;")
	public Class34 method2087(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method2096(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Class;)Lclient!jc;")
	public Class34 method2088(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method2096(8, 0, new Object[] { arg2, arg1, arg0 });
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILjava/lang/String;)Lclient!jc;")
	public Class34 method2089(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method2096(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Lclient!ve;")
	public Interface3 method2090() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!jc;")
	public Class34 method2091(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2096(9, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;IIB)V")
	private void method2092(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(11) boolean local11 = false;
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static125.aString4, "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(82) int local82 = 0; local82 < local69.length; local82++) {
				for (@Pc(85) int local85 = 0; local85 < local46.length; local85++) {
					try {
						@Pc(90) String local90 = local46[local85];
						if (local90.length() > 0 && !(new File(local90)).exists()) {
							continue;
						}
						@Pc(113) File local113 = new File(local90 + local69[local82]);
						@Pc(124) boolean local124;
						if (local79 == 1 && !local113.exists()) {
							local124 = local113.mkdir();
							if (!local124) {
								continue;
							}
						}
						@Pc(150) int local150;
						@Pc(135) File local135;
						if (!local11) {
							try {
								local135 = new File(local113, "uid.dat");
								if (local79 == 1 && (!local135.exists() || local135.length() < 4L)) {
									local150 = -1;
									@Pc(154) Random local154 = new Random();
									while (local150 == -1) {
										local150 = local154.nextInt();
									}
									@Pc(170) DataOutputStream local170 = new DataOutputStream(new FileOutputStream(local135));
									local170.writeInt(local150);
									local170.close();
								}
								if (local135.exists()) {
									local11 = true;
									@Pc(188) DataInputStream local188 = new DataInputStream(new FileInputStream(local135));
									this.anInt3006 = local188.readInt() + 1;
									local188.close();
								}
							} catch (@Pc(198) Exception local198) {
							}
						}
						if (this.aFile3 == null) {
							try {
								local113 = new File(local113, arg0);
								if (local79 == 1 && !local113.exists()) {
									local124 = local113.mkdir();
									if (!local124) {
										continue;
									}
								}
								local135 = new File(local113, "main_file_cache.dat2");
								if (local79 == 0 && !local135.exists()) {
									continue;
								}
								this.aClass30_2 = new Class30(local135, "rw", 52428800L);
								this.aClass30Array1 = new Class30[arg1];
								for (local150 = 0; local150 < arg1; local150++) {
									this.aClass30Array1[local150] = new Class30(new File(local113, "main_file_cache.idx" + local150), "rw", 1048576L);
								}
								this.aClass30_3 = new Class30(new File(local113, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local113;
							} catch (@Pc(290) Exception local290) {
								try {
									this.aClass30_2.method969();
									for (@Pc(296) int local296 = 0; local296 < arg1; local296++) {
										this.aClass30Array1[local296].method969();
									}
									this.aClass30_3.method969();
								} catch (@Pc(315) Exception local315) {
								}
								this.aClass30Array1 = null;
								this.aClass30_2 = this.aClass30_3 = null;
								this.aFile2 = this.aFile3 = null;
							}
						}
					} catch (@Pc(332) Exception local332) {
					}
					if (local11 && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public void method2093() {
		synchronized (this) {
			this.aBoolean238 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass30_2 != null) {
			try {
				this.aClass30_2.method969();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass30_3 != null) {
			try {
				this.aClass30_3.method969();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass30Array1 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < this.aClass30Array1.length; local52++) {
			if (this.aClass30Array1[local52] != null) {
				try {
					this.aClass30Array1[local52].method969();
				} catch (@Pc(66) IOException local66) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/net/URL;)Lclient!jc;")
	public Class34 method2094(@OriginalArg(1) URL arg0) {
		return this.method2096(4, 0, arg0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Lclient!jc;")
	public Class34 method2095(@OriginalArg(1) int arg0) {
		return this.method2096(3, arg0, null);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!jc;")
	private Class34 method2096(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class34 local3 = new Class34();
		local3.anInt1568 = arg1;
		local3.anInt1569 = arg0;
		local3.anObject3 = arg2;
		synchronized (this) {
			if (this.aClass34_7 == null) {
				this.aClass34_7 = this.aClass34_8 = local3;
			} else {
				this.aClass34_7.aClass34_3 = local3;
				this.aClass34_7 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
