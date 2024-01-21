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

@OriginalClass("client!tc")
public final class Class74 implements Runnable {

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "Lclient!gf;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "[Lclient!bc;")
	public Class9[] aClass9Array1;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!le;")
	private Class50 aClass50_6 = null;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!bc;")
	public Class9 aClass9_2 = null;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public int anInt2621 = 0;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!le;")
	private Class50 aClass50_7 = null;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Lclient!bc;")
	public Class9 aClass9_3 = null;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class74(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static113.aString3 = "1.1";
		Static113.aString5 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static113.aString5 = System.getProperty("java.vendor");
			Static113.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static113.aString4 = System.getProperty("user.home");
			if (Static113.aString4 != null) {
				Static113.aString4 = Static113.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static113.aString4 == null) {
			Static113.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static113.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static113.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static113.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static113.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1812(arg4, arg3, arg2);
		}
		this.aBoolean118 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method1812(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(54) String[] local54 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static113.aString4, "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(79) boolean local79 = false;
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(87) int local87 = 0; local87 < local54.length; local87++) {
					try {
						@Pc(92) String local92 = local54[local87];
						if (local92.length() > 0 && !(new File(local92)).exists()) {
							continue;
						}
						@Pc(118) File local118 = new File(local92 + local77[local84]);
						@Pc(129) boolean local129;
						if (local81 == 1 && !local118.exists()) {
							local129 = local118.mkdir();
							if (!local129) {
								continue;
							}
						}
						@Pc(153) int local153;
						@Pc(140) File local140;
						if (!local79) {
							try {
								local140 = new File(local118, "uid.dat");
								if (local81 == 1 && (!local140.exists() || local140.length() < 4L)) {
									local153 = -1;
									@Pc(157) Random local157 = new Random();
									while (local153 == -1) {
										local153 = local157.nextInt();
									}
									@Pc(172) DataOutputStream local172 = new DataOutputStream(new FileOutputStream(local140));
									local172.writeInt(local153);
									local172.close();
								}
								if (local140.exists()) {
									@Pc(188) DataInputStream local188 = new DataInputStream(new FileInputStream(local140));
									local79 = true;
									this.anInt2621 = local188.readInt() + 1;
									local188.close();
								}
							} catch (@Pc(200) Exception local200) {
							}
						}
						if (this.aFile2 == null) {
							try {
								local118 = new File(local118, arg1);
								if (local81 == 1 && !local118.exists()) {
									local129 = local118.mkdir();
									if (!local129) {
										continue;
									}
								}
								local140 = new File(local118, "main_file_cache.dat2");
								if (local81 == 0 && !local140.exists()) {
									continue;
								}
								this.aClass9_3 = new Class9(local140, "rw", 52428800L);
								this.aClass9Array1 = new Class9[arg0];
								for (local153 = 0; local153 < arg0; local153++) {
									this.aClass9Array1[local153] = new Class9(new File(local118, "main_file_cache.idx" + local153), "rw", 1048576L);
								}
								this.aClass9_2 = new Class9(new File(local118, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local118;
							} catch (@Pc(299) Exception local299) {
								try {
									this.aClass9_3.method243();
									for (@Pc(305) int local305 = 0; local305 < arg0; local305++) {
										this.aClass9Array1[local305].method243();
									}
									this.aClass9_2.method243();
								} catch (@Pc(322) Exception local322) {
								}
								this.aClass9Array1 = null;
								this.aClass9_3 = this.aClass9_2 = null;
								this.aFile3 = this.aFile2 = null;
							}
						}
					} catch (@Pc(339) Exception local339) {
					}
					if (local79 && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class50 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean118) {
						return;
					}
					if (this.aClass50_7 != null) {
						local15 = this.aClass50_7;
						this.aClass50_7 = this.aClass50_7.aClass50_3;
						if (this.aClass50_7 == null) {
							this.aClass50_6 = null;
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
				@Pc(41) int local41 = local15.anInt1486;
				if (local41 == 1) {
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt1487);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject3);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1487);
					local15.anObject4 = local56;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(89) Object[] local89;
					if (local41 == 8) {
						local89 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local89[0]).getDeclaredMethod((String) local89[1], (Class[]) local89[2]);
					} else if (local41 == 9) {
						local89 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local89[0]).getDeclaredField((String) local89[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1485 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt1485 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!le;")
	public Class50 method1813(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method1816(9, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!le;")
	public Class50 method1814(@OriginalArg(1) int arg0) {
		return this.method1816(3, arg0, null);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Lclient!gf;")
	public Interface2 method1815() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!le;")
	private Class50 method1816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class50 local3 = new Class50();
		local3.anObject3 = arg2;
		local3.anInt1486 = arg0;
		local3.anInt1487 = arg1;
		synchronized (this) {
			if (this.aClass50_6 == null) {
				this.aClass50_6 = this.aClass50_7 = local3;
			} else {
				this.aClass50_6.aClass50_3 = local3;
				this.aClass50_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!le;")
	public Class50 method1817(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method1816(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Lclient!le;")
	public Class50 method1818(@OriginalArg(0) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method1816(8, 0, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/net/URL;)Lclient!le;")
	public Class50 method1819(@OriginalArg(1) URL arg0) {
		return this.method1816(4, 0, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public void method1820() {
		synchronized (this) {
			this.aBoolean118 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass9_3 != null) {
			try {
				this.aClass9_3.method243();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass9_2 != null) {
			try {
				this.aClass9_2.method243();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass9Array1 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < this.aClass9Array1.length; local52++) {
			if (this.aClass9Array1[local52] != null) {
				try {
					this.aClass9Array1[local52].method243();
				} catch (@Pc(66) IOException local66) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!le;")
	public Class50 method1821(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method1816(2, arg0, arg1);
	}
}
