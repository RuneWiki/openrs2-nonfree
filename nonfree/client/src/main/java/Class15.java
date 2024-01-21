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

@OriginalClass("client!de")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!ca;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[Lclient!af;")
	public Class6[] aClass6Array1;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!jb;")
	private Class37 aClass37_3 = null;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "I")
	public int anInt621 = 0;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Lclient!jb;")
	private Class37 aClass37_4 = null;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!af;")
	public Class6 aClass6_1 = null;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!af;")
	public Class6 aClass6_2 = null;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class15(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static22.aString2 = "1.1";
		Static22.aString3 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static22.aString3 = System.getProperty("java.vendor");
			Static22.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static22.aString1 = System.getProperty("user.home");
			if (Static22.aString1 != null) {
				Static22.aString1 = Static22.aString1 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static22.aString1 == null) {
			Static22.aString1 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static22.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static22.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static22.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static22.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method468(arg2, arg3, arg4);
		}
		this.aBoolean22 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public void method460() {
		synchronized (this) {
			this.aBoolean22 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass6_1 != null) {
			try {
				this.aClass6_1.method105();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass6_2 != null) {
			try {
				this.aClass6_2.method105();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass6Array1 == null) {
			return;
		}
		for (@Pc(49) int local49 = 0; local49 < this.aClass6Array1.length; local49++) {
			if (this.aClass6Array1[local49] != null) {
				try {
					this.aClass6Array1[local49].method105();
				} catch (@Pc(63) IOException local63) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class37 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean22) {
						return;
					}
					if (this.aClass37_4 != null) {
						local15 = this.aClass37_4;
						this.aClass37_4 = this.aClass37_4.aClass37_5;
						if (this.aClass37_4 == null) {
							this.aClass37_3 = null;
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
				@Pc(41) int local41 = local15.anInt1338;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt1339);
				} else if (local41 == 2) {
					@Pc(117) Thread local117 = new Thread((Runnable) local15.anObject2);
					local117.setDaemon(true);
					local117.start();
					local117.setPriority(local15.anInt1339);
					local15.anObject3 = local117;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(69) Object[] local69;
					if (local41 == 8) {
						local69 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local69[0]).getDeclaredMethod((String) local69[1], (Class[]) local69[2]);
					} else if (local41 == 9) {
						local69 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local69[0]).getDeclaredField((String) local69[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1337 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt1337 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/net/URL;)Lclient!jb;")
	public Class37 method461(@OriginalArg(1) URL arg0) {
		return this.method467(arg0, 0, 4);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILjava/lang/String;)Lclient!jb;")
	public Class37 method462(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method467(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lclient!jb;")
	public Class37 method463(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method467(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Lclient!jb;")
	public Class37 method464(@OriginalArg(0) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method467(new Object[] { arg0, arg2, arg1 }, 0, 8);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Lclient!ca;")
	public Interface1 method465() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)Lclient!jb;")
	public Class37 method466(@OriginalArg(0) int arg0) {
		return this.method467(null, arg0, 3);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!jb;")
	private Class37 method467(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class37 local8 = new Class37();
		local8.anInt1339 = arg1;
		local8.anInt1338 = arg2;
		local8.anObject2 = arg0;
		synchronized (this) {
			if (this.aClass37_3 == null) {
				this.aClass37_3 = this.aClass37_4 = local8;
			} else {
				this.aClass37_3.aClass37_5 = local8;
				this.aClass37_3 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method468(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static22.aString1, "" };
		@Pc(46) boolean local46 = false;
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(74) int local74 = 0; local74 < local69.length; local74++) {
				for (@Pc(77) int local77 = 0; local77 < local44.length; local77++) {
					try {
						@Pc(82) String local82 = local44[local77];
						if (local82.length() > 0 && !(new File(local82)).exists()) {
							continue;
						}
						@Pc(105) File local105 = new File(local82 + local69[local74]);
						@Pc(116) boolean local116;
						if (local71 == 1 && !local105.exists()) {
							local116 = local105.mkdir();
							if (!local116) {
								continue;
							}
						}
						@Pc(142) int local142;
						@Pc(127) File local127;
						if (!local46) {
							try {
								local127 = new File(local105, "uid.dat");
								if (local71 == 1 && (!local127.exists() || local127.length() < 4L)) {
									local142 = -1;
									@Pc(146) Random local146 = new Random();
									while (local142 == -1) {
										local142 = local146.nextInt();
									}
									@Pc(161) DataOutputStream local161 = new DataOutputStream(new FileOutputStream(local127));
									local161.writeInt(local142);
									local161.close();
								}
								if (local127.exists()) {
									local46 = true;
									@Pc(179) DataInputStream local179 = new DataInputStream(new FileInputStream(local127));
									this.anInt621 = local179.readInt() + 1;
									local179.close();
								}
							} catch (@Pc(189) Exception local189) {
							}
						}
						if (this.aFile3 == null) {
							try {
								local105 = new File(local105, arg1);
								if (local71 == 1 && !local105.exists()) {
									local116 = local105.mkdir();
									if (!local116) {
										continue;
									}
								}
								local127 = new File(local105, "main_file_cache.dat2");
								if (local71 == 0 && !local127.exists()) {
									continue;
								}
								this.aClass6_1 = new Class6(local127, "rw", 52428800L);
								this.aClass6Array1 = new Class6[arg2];
								for (local142 = 0; local142 < arg2; local142++) {
									this.aClass6Array1[local142] = new Class6(new File(local105, "main_file_cache.idx" + local142), "rw", 1048576L);
								}
								this.aClass6_2 = new Class6(new File(local105, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local105;
							} catch (@Pc(283) Exception local283) {
								try {
									this.aClass6_1.method105();
									for (@Pc(289) int local289 = 0; local289 < arg2; local289++) {
										this.aClass6Array1[local289].method105();
									}
									this.aClass6_2.method105();
								} catch (@Pc(310) Exception local310) {
								}
								this.aClass6Array1 = null;
								this.aClass6_1 = this.aClass6_2 = null;
								this.aFile2 = this.aFile3 = null;
							}
						}
					} catch (@Pc(327) Exception local327) {
					}
					if (local46 && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!jb;")
	public Class37 method469(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method467(new Object[] { arg0, arg1 }, 0, 9);
	}
}
