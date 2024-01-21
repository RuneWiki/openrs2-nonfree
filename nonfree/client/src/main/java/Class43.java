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

@OriginalClass("client!kc")
public final class Class43 implements Runnable {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!aa;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!ka;")
	public Class41[] aClass41Array1;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!ka;")
	public Class41 aClass41_1 = null;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Lclient!nc;")
	private Class54 aClass54_6 = null;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!ka;")
	public Class41 aClass41_2 = null;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	public int anInt1625 = 0;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!nc;")
	private Class54 aClass54_5 = null;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class43(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static58.aString3 = "Unknown";
		this.anApplet1 = arg1;
		Static58.aString2 = "1.1";
		try {
			Static58.aString3 = System.getProperty("java.vendor");
			Static58.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static58.aString4 = System.getProperty("user.home");
			if (Static58.aString4 != null) {
				Static58.aString4 = Static58.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static58.aString4 == null) {
			Static58.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static58.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static58.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static58.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static58.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1098(arg2, arg4, arg3);
		}
		this.aBoolean73 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!kc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class54 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean73) {
						return;
					}
					if (this.aClass54_5 != null) {
						local15 = this.aClass54_5;
						this.aClass54_5 = this.aClass54_5.aClass54_8;
						if (this.aClass54_5 == null) {
							this.aClass54_6 = null;
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
				@Pc(41) int local41 = local15.anInt2075;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt2076);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject3);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt2076);
					local15.anObject2 = local56;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(83) Object[] local83;
					if (local41 == 9) {
						local83 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local83[0]).getDeclaredMethod((String) local83[1], (Class[]) local83[2]);
					} else if (local41 == 10) {
						local83 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local83[0]).getDeclaredField((String) local83[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2077 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt2077 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!nc;")
	public Class54 method1090(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method1096(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lclient!nc;")
	public Class54 method1091(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method1096(0, new Object[] { arg0, arg1, arg2 }, 9);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public void method1092() {
		synchronized (this) {
			this.aBoolean73 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass41_1 != null) {
			try {
				this.aClass41_1.method1072();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass41_2 != null) {
			try {
				this.aClass41_2.method1072();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass41Array1 == null) {
			return;
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass41Array1.length; local44++) {
			if (this.aClass41Array1[local44] != null) {
				try {
					this.aClass41Array1[local44].method1072();
				} catch (@Pc(58) IOException local58) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!nc;")
	public Class54 method1093(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1096(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!nc;")
	public Class54 method1094(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method1096(0, new Object[] { arg1, arg0 }, 10);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!nc;")
	public Class54 method1095(@OriginalArg(0) int arg0) {
		return this.method1096(arg0, null, 3);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!nc;")
	private Class54 method1096(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class54 local3 = new Class54();
		local3.anObject3 = arg1;
		local3.anInt2076 = arg0;
		local3.anInt2075 = arg2;
		synchronized (this) {
			if (this.aClass54_6 == null) {
				this.aClass54_6 = this.aClass54_5 = local3;
			} else {
				this.aClass54_6.aClass54_8 = local3;
				this.aClass54_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lclient!aa;")
	public Interface1 method1097() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method1098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static58.aString4, "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(79) boolean local79 = false;
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(87) int local87 = 0; local87 < local42.length; local87++) {
					try {
						@Pc(92) String local92 = local42[local87];
						if (local92.length() > 0 && !(new File(local92)).exists()) {
							continue;
						}
						@Pc(115) File local115 = new File(local92 + local77[local84]);
						@Pc(124) boolean local124;
						if (local81 == 1 && !local115.exists()) {
							local124 = local115.mkdir();
							if (!local124) {
								continue;
							}
						}
						@Pc(152) int local152;
						@Pc(135) File local135;
						if (!local79) {
							try {
								local135 = new File(local115, "uid.dat");
								if (local81 == 1 && (!local135.exists() || local135.length() < 4L)) {
									local152 = -1;
									@Pc(156) Random local156 = new Random();
									while (local152 == -1) {
										local152 = local156.nextInt();
									}
									@Pc(172) DataOutputStream local172 = new DataOutputStream(new FileOutputStream(local135));
									local172.writeInt(local152);
									local172.close();
								}
								if (local135.exists()) {
									local79 = true;
									@Pc(190) DataInputStream local190 = new DataInputStream(new FileInputStream(local135));
									this.anInt1625 = local190.readInt() + 1;
									local190.close();
								}
							} catch (@Pc(200) Exception local200) {
							}
						}
						if (this.aFile3 == null) {
							try {
								local115 = new File(local115, arg2);
								if (local81 == 1 && !local115.exists()) {
									local124 = local115.mkdir();
									if (!local124) {
										continue;
									}
								}
								local135 = new File(local115, "main_file_cache.dat2");
								if (local81 == 0 && !local135.exists()) {
									continue;
								}
								this.aClass41_1 = new Class41(local135, "rw", 52428800L);
								this.aClass41Array1 = new Class41[arg1];
								for (local152 = 0; local152 < arg1; local152++) {
									this.aClass41Array1[local152] = new Class41(new File(local115, "main_file_cache.idx" + local152), "rw", 1048576L);
								}
								this.aClass41_2 = new Class41(new File(local115, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local115;
							} catch (@Pc(296) Exception local296) {
								try {
									this.aClass41_1.method1072();
									for (@Pc(302) int local302 = 0; local302 < arg1; local302++) {
										this.aClass41Array1[local302].method1072();
									}
									this.aClass41_2.method1072();
								} catch (@Pc(319) Exception local319) {
								}
								this.aClass41_1 = this.aClass41_2 = null;
								this.aFile2 = this.aFile3 = null;
								this.aClass41Array1 = null;
							}
						}
					} catch (@Pc(336) Exception local336) {
					}
					if (local79 && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!nc;")
	public Class54 method1099(@OriginalArg(0) URL arg0) {
		return this.method1096(0, arg0, 4);
	}
}
