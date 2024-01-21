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

@OriginalClass("client!oc")
public final class Class55 implements Runnable {

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[Lclient!ee;")
	public Class19[] aClass19Array1;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!pf;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!ee;")
	public Class19 aClass19_2 = null;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!n;")
	private Class51 aClass51_5 = null;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	public int anInt2200 = 0;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!n;")
	private Class51 aClass51_6 = null;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!ee;")
	public Class19 aClass19_3 = null;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class55(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static88.aString3 = "1.1";
		this.anApplet1 = arg1;
		Static88.aString2 = "Unknown";
		try {
			Static88.aString2 = System.getProperty("java.vendor");
			Static88.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static88.aString4 = System.getProperty("user.home");
			if (Static88.aString4 != null) {
				Static88.aString4 = Static88.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static88.aString4 == null) {
			Static88.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static88.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static88.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static88.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static88.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1534(arg3, arg4, arg2);
		}
		this.aBoolean77 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public void method1533() {
		synchronized (this) {
			this.aBoolean77 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass19_2 != null) {
			try {
				this.aClass19_2.method658();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass19_3 != null) {
			try {
				this.aClass19_3.method658();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass19Array1 == null) {
			return;
		}
		for (@Pc(49) int local49 = 0; local49 < this.aClass19Array1.length; local49++) {
			if (this.aClass19Array1[local49] != null) {
				try {
					this.aClass19Array1[local49].method658();
				} catch (@Pc(63) IOException local63) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method1534(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static88.aString4, "/tmp/", "" };
		@Pc(48) boolean local48 = false;
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local71.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local46.length; local79++) {
					try {
						@Pc(84) String local84 = local46[local79];
						if (local84.length() > 0 && !(new File(local84)).exists()) {
							continue;
						}
						@Pc(110) File local110 = new File(local84 + local71[local76]);
						@Pc(121) boolean local121;
						if (local73 == 1 && !local110.exists()) {
							local121 = local110.mkdir();
							if (!local121) {
								continue;
							}
						}
						@Pc(149) int local149;
						@Pc(132) File local132;
						if (!local48) {
							try {
								local132 = new File(local110, "uid.dat");
								if (local73 == 1 && (!local132.exists() || local132.length() < 4L)) {
									local149 = -1;
									@Pc(153) Random local153 = new Random();
									while (local149 == -1) {
										local149 = local153.nextInt();
									}
									@Pc(168) DataOutputStream local168 = new DataOutputStream(new FileOutputStream(local132));
									local168.writeInt(local149);
									local168.close();
								}
								if (local132.exists()) {
									local48 = true;
									@Pc(186) DataInputStream local186 = new DataInputStream(new FileInputStream(local132));
									this.anInt2200 = local186.readInt() + 1;
									local186.close();
								}
							} catch (@Pc(196) Exception local196) {
							}
						}
						if (this.aFile3 == null) {
							try {
								local110 = new File(local110, arg0);
								if (local73 == 1 && !local110.exists()) {
									local121 = local110.mkdir();
									if (!local121) {
										continue;
									}
								}
								local132 = new File(local110, "main_file_cache.dat2");
								if (local73 == 0 && !local132.exists()) {
									continue;
								}
								this.aClass19_2 = new Class19(local132, "rw", 52428800L);
								this.aClass19Array1 = new Class19[arg1];
								for (local149 = 0; local149 < arg1; local149++) {
									this.aClass19Array1[local149] = new Class19(new File(local110, "main_file_cache.idx" + local149), "rw", 1048576L);
								}
								this.aClass19_3 = new Class19(new File(local110, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local110;
							} catch (@Pc(288) Exception local288) {
								try {
									this.aClass19_2.method658();
									for (@Pc(294) int local294 = 0; local294 < arg1; local294++) {
										this.aClass19Array1[local294].method658();
									}
									this.aClass19_3.method658();
								} catch (@Pc(311) Exception local311) {
								}
								this.aClass19Array1 = null;
								this.aFile2 = this.aFile3 = null;
								this.aClass19_2 = this.aClass19_3 = null;
							}
						}
					} catch (@Pc(328) Exception local328) {
					}
					if (local48 && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Lclient!pf;")
	public Interface2 method1535() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!n;")
	public Class51 method1536(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method1538(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!n;")
	public Class51 method1537(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1538(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!n;")
	private Class51 method1538(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class51 local3 = new Class51();
		local3.anObject1 = arg0;
		local3.anInt1881 = arg2;
		local3.anInt1879 = arg1;
		synchronized (this) {
			if (this.aClass51_5 == null) {
				this.aClass51_5 = this.aClass51_6 = local3;
			} else {
				this.aClass51_5.aClass51_4 = local3;
				this.aClass51_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!oc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class51 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean77) {
						return;
					}
					if (this.aClass51_6 != null) {
						local15 = this.aClass51_6;
						this.aClass51_6 = this.aClass51_6.aClass51_4;
						if (this.aClass51_6 == null) {
							this.aClass51_5 = null;
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
				@Pc(41) int local41 = local15.anInt1879;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt1881);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject1);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1881);
					local15.anObject2 = local56;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(90) Object[] local90;
					if (local41 == 8) {
						local90 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local90[0]).getDeclaredMethod((String) local90[1], (Class[]) local90[2]);
					} else if (local41 == 9) {
						local90 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local90[0]).getDeclaredField((String) local90[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1880 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt1880 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Lclient!n;")
	public Class51 method1539(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method1538(new Object[] { arg2, arg0, arg1 }, 8, 0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!n;")
	public Class51 method1540(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1538(new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lclient!n;")
	public Class51 method1541(@OriginalArg(0) int arg0) {
		return this.method1538(null, 3, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/net/URL;)Lclient!n;")
	public Class51 method1542(@OriginalArg(1) URL arg0) {
		return this.method1538(arg0, 4, 0);
	}
}
