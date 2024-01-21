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

@OriginalClass("client!ue")
public final class Class74 implements Runnable {

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Lclient!ma;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "[Lclient!we;")
	public Class81[] aClass81Array1;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public int anInt2952 = 0;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!we;")
	public Class81 aClass81_2 = null;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Lclient!oc;")
	private Class56 aClass56_8 = null;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!oc;")
	private Class56 aClass56_7 = null;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Lclient!we;")
	public Class81 aClass81_3 = null;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class74(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static116.aString5 = "1.1";
		Static116.aString3 = "Unknown";
		try {
			Static116.aString3 = System.getProperty("java.vendor");
			Static116.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static116.aString4 = System.getProperty("user.home");
			if (Static116.aString4 != null) {
				Static116.aString4 = Static116.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static116.aString4 == null) {
			Static116.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static116.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static116.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static116.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static116.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1869(arg3, arg2, arg4);
		}
		this.aBoolean218 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Lclient!oc;")
	public Class56 method1867(@OriginalArg(1) int arg0) {
		return this.method1872(arg0, null, 3);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/lang/String;)Lclient!oc;")
	public Class56 method1868(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method1872(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method1869(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(32) String[] local32 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(34) boolean local34 = false;
		@Pc(69) String[] local69 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static116.aString4, "" };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(81) int local81 = 0; local81 < local32.length; local81++) {
				for (@Pc(84) int local84 = 0; local84 < local69.length; local84++) {
					try {
						@Pc(89) String local89 = local69[local84];
						if (local89.length() > 0 && !(new File(local89)).exists()) {
							continue;
						}
						@Pc(112) File local112 = new File(local89 + local32[local81]);
						@Pc(123) boolean local123;
						if (local78 == 1 && !local112.exists()) {
							local123 = local112.mkdir();
							if (!local123) {
								continue;
							}
						}
						@Pc(147) int local147;
						@Pc(134) File local134;
						if (!local34) {
							try {
								local134 = new File(local112, "uid.dat");
								if (local78 == 1 && (!local134.exists() || local134.length() < 4L)) {
									local147 = -1;
									@Pc(151) Random local151 = new Random();
									while (local147 == -1) {
										local147 = local151.nextInt();
									}
									@Pc(167) DataOutputStream local167 = new DataOutputStream(new FileOutputStream(local134));
									local167.writeInt(local147);
									local167.close();
								}
								if (local134.exists()) {
									local34 = true;
									@Pc(185) DataInputStream local185 = new DataInputStream(new FileInputStream(local134));
									this.anInt2952 = local185.readInt() + 1;
									local185.close();
								}
							} catch (@Pc(195) Exception local195) {
							}
						}
						if (this.aFile2 == null) {
							try {
								local112 = new File(local112, arg0);
								if (local78 == 1 && !local112.exists()) {
									local123 = local112.mkdir();
									if (!local123) {
										continue;
									}
								}
								local134 = new File(local112, "main_file_cache.dat2");
								if (local78 == 0 && !local134.exists()) {
									continue;
								}
								this.aClass81_2 = new Class81(local134, "rw", 52428800L);
								this.aClass81Array1 = new Class81[arg2];
								for (local147 = 0; local147 < arg2; local147++) {
									this.aClass81Array1[local147] = new Class81(new File(local112, "main_file_cache.idx" + local147), "rw", 1048576L);
								}
								this.aClass81_3 = new Class81(new File(local112, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local112;
							} catch (@Pc(293) Exception local293) {
								try {
									this.aClass81_2.method2036();
									for (@Pc(299) int local299 = 0; local299 < arg2; local299++) {
										this.aClass81Array1[local299].method2036();
									}
									this.aClass81_3.method2036();
								} catch (@Pc(320) Exception local320) {
								}
								this.aClass81Array1 = null;
								this.aFile1 = this.aFile2 = null;
								this.aClass81_2 = this.aClass81_3 = null;
							}
						}
					} catch (@Pc(337) Exception local337) {
					}
					if (local34 && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;BLjava/lang/String;)Lclient!oc;")
	public Class56 method1870(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method1872(0, new Object[] { arg0, arg2, arg1 }, 9);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Lclient!oc;")
	public Class56 method1871(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1872(0, new Object[] { arg1, arg0 }, 10);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!oc;")
	private Class56 method1872(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class56 local3 = new Class56();
		local3.anInt2058 = arg2;
		local3.anInt2057 = arg0;
		local3.anObject3 = arg1;
		synchronized (this) {
			if (this.aClass56_7 == null) {
				this.aClass56_7 = this.aClass56_8 = local3;
			} else {
				this.aClass56_7.aClass56_5 = local3;
				this.aClass56_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public void method1873() {
		synchronized (this) {
			this.aBoolean218 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass81_2 != null) {
			try {
				this.aClass81_2.method2036();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass81_3 != null) {
			try {
				this.aClass81_3.method2036();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass81Array1 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < this.aClass81Array1.length; local50++) {
			if (this.aClass81Array1[local50] != null) {
				try {
					this.aClass81Array1[local50].method2036();
				} catch (@Pc(64) IOException local64) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/net/URL;)Lclient!oc;")
	public Class56 method1874(@OriginalArg(1) URL arg0) {
		return this.method1872(0, arg0, 4);
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class56 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean218) {
						return;
					}
					if (this.aClass56_8 != null) {
						local15 = this.aClass56_8;
						this.aClass56_8 = this.aClass56_8.aClass56_5;
						if (this.aClass56_8 == null) {
							this.aClass56_7 = null;
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
				@Pc(41) int local41 = local15.anInt2058;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt2057);
				} else if (local41 == 2) {
					@Pc(68) Thread local68 = new Thread((Runnable) local15.anObject3);
					local68.setDaemon(true);
					local68.start();
					local68.setPriority(local15.anInt2057);
					local15.anObject2 = local68;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(110) Object[] local110;
					if (local41 == 9) {
						local110 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local110[0]).getDeclaredMethod((String) local110[1], (Class[]) local110[2]);
					} else if (local41 == 10) {
						local110 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local110[0]).getDeclaredField((String) local110[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2056 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt2056 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!oc;")
	public Class56 method1875(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method1872(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Lclient!ma;")
	public Interface2 method1876() {
		return this.anInterface2_2;
	}
}
