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

@OriginalClass("client!u")
public final class Class74 implements Runnable {

	@OriginalMember(owner = "client!u", name = "n", descriptor = "[Lclient!ed;")
	public Class19[] aClass19Array1;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!we;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!af;")
	private Class7 aClass7_7 = null;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public int anInt3207 = 0;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!ed;")
	public Class19 aClass19_2 = null;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!af;")
	private Class7 aClass7_8 = null;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Lclient!ed;")
	public Class19 aClass19_3 = null;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class74(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static116.aString5 = "1.1";
		this.anApplet1 = arg1;
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
			this.method2124(arg2, arg3, arg4);
		}
		this.aBoolean114 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public void method2120() {
		synchronized (this) {
			this.aBoolean114 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass19_3 != null) {
			try {
				this.aClass19_3.method659();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass19_2 != null) {
			try {
				this.aClass19_2.method659();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass19Array1 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < this.aClass19Array1.length; local52++) {
			if (this.aClass19Array1[local52] != null) {
				try {
					this.aClass19Array1[local52].method659();
				} catch (@Pc(68) IOException local68) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!af;")
	private Class7 method2121(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class7 local3 = new Class7();
		local3.anObject2 = arg1;
		local3.anInt147 = arg2;
		local3.anInt149 = arg0;
		synchronized (this) {
			if (this.aClass7_7 == null) {
				this.aClass7_7 = this.aClass7_8 = local3;
			} else {
				this.aClass7_7.aClass7_1 = local3;
				this.aClass7_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!af;")
	public Class7 method2122(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2121(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!af;")
	public Class7 method2123(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2121(9, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method2124(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static116.aString4, "/tmp/", "" };
		@Pc(53) boolean local53 = false;
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(81) int local81 = 0; local81 < local76.length; local81++) {
				for (@Pc(84) int local84 = 0; local84 < local51.length; local84++) {
					try {
						@Pc(89) String local89 = local51[local84];
						if (local89.length() > 0 && !(new File(local89)).exists()) {
							continue;
						}
						@Pc(112) File local112 = new File(local89 + local76[local81]);
						@Pc(123) boolean local123;
						if (local78 == 1 && !local112.exists()) {
							local123 = local112.mkdir();
							if (!local123) {
								continue;
							}
						}
						@Pc(149) int local149;
						@Pc(134) File local134;
						if (!local53) {
							try {
								local134 = new File(local112, "uid.dat");
								if (local78 == 1 && (!local134.exists() || local134.length() < 4L)) {
									local149 = -1;
									@Pc(153) Random local153 = new Random();
									while (local149 == -1) {
										local149 = local153.nextInt();
									}
									@Pc(168) DataOutputStream local168 = new DataOutputStream(new FileOutputStream(local134));
									local168.writeInt(local149);
									local168.close();
								}
								if (local134.exists()) {
									local53 = true;
									@Pc(186) DataInputStream local186 = new DataInputStream(new FileInputStream(local134));
									this.anInt3207 = local186.readInt() + 1;
									local186.close();
								}
							} catch (@Pc(196) Exception local196) {
							}
						}
						if (this.aFile3 == null) {
							try {
								local112 = new File(local112, arg1);
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
								this.aClass19_3 = new Class19(local134, "rw", 52428800L);
								this.aClass19Array1 = new Class19[arg2];
								for (local149 = 0; local149 < arg2; local149++) {
									this.aClass19Array1[local149] = new Class19(new File(local112, "main_file_cache.idx" + local149), "rw", 1048576L);
								}
								this.aClass19_2 = new Class19(new File(local112, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local112;
							} catch (@Pc(288) Exception local288) {
								try {
									this.aClass19_3.method659();
									for (@Pc(294) int local294 = 0; local294 < arg2; local294++) {
										this.aClass19Array1[local294].method659();
									}
									this.aClass19_2.method659();
								} catch (@Pc(315) Exception local315) {
								}
								this.aClass19Array1 = null;
								this.aFile2 = this.aFile3 = null;
								this.aClass19_3 = this.aClass19_2 = null;
							}
						}
					} catch (@Pc(332) Exception local332) {
					}
					if (local53 && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/net/URL;)Lclient!af;")
	public Class7 method2125(@OriginalArg(1) URL arg0) {
		return this.method2121(4, arg0, 0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;IB)Lclient!af;")
	public Class7 method2126(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2121(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lclient!af;")
	public Class7 method2127(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method2121(8, new Object[] { arg2, arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!u", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class7 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean114) {
						return;
					}
					if (this.aClass7_8 != null) {
						local15 = this.aClass7_8;
						this.aClass7_8 = this.aClass7_8.aClass7_1;
						if (this.aClass7_8 == null) {
							this.aClass7_7 = null;
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
				@Pc(41) int local41 = local15.anInt149;
				if (local41 == 1) {
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt147);
				} else if (local41 == 2) {
					@Pc(68) Thread local68 = new Thread((Runnable) local15.anObject2);
					local68.setDaemon(true);
					local68.start();
					local68.setPriority(local15.anInt147);
					local15.anObject1 = local68;
				} else if (local41 == 4) {
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local41 == 8) {
						local102 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local41 == 9) {
						local102 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt148 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt148 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Lclient!af;")
	public Class7 method2128(@OriginalArg(0) int arg0) {
		return this.method2121(3, null, arg0);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Lclient!we;")
	public Interface3 method2129() {
		return this.anInterface3_2;
	}
}
