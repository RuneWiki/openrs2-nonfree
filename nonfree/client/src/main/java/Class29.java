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

@OriginalClass("client!fe")
public final class Class29 implements Runnable {

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "[Lclient!kd;")
	public Class45[] aClass45Array1;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!wd;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!cf;")
	private Class16 aClass16_3 = null;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!kd;")
	public Class45 aClass45_1 = null;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!cf;")
	private Class16 aClass16_2 = null;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!kd;")
	public Class45 aClass45_2 = null;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
	public int anInt913 = 0;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class29(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static37.aString2 = "Unknown";
		Static37.aString4 = "1.1";
		try {
			Static37.aString2 = System.getProperty("java.vendor");
			Static37.aString4 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static37.aString3 = System.getProperty("user.home");
			if (Static37.aString3 != null) {
				Static37.aString3 = Static37.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static37.aString3 == null) {
			Static37.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static37.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static37.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static37.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static37.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method608(arg4, arg3, arg2);
		}
		this.aBoolean39 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class16 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean39) {
						return;
					}
					if (this.aClass16_2 != null) {
						local15 = this.aClass16_2;
						this.aClass16_2 = this.aClass16_2.aClass16_1;
						if (this.aClass16_2 == null) {
							this.aClass16_3 = null;
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
				@Pc(41) int local41 = local15.anInt442;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt443);
				} else if (local41 == 2) {
					@Pc(66) Thread local66 = new Thread((Runnable) local15.anObject1);
					local66.setDaemon(true);
					local66.start();
					local66.setPriority(local15.anInt443);
					local15.anObject2 = local66;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(93) Object[] local93;
					if (local41 == 8) {
						local93 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local93[0]).getDeclaredMethod((String) local93[1], (Class[]) local93[2]);
					} else if (local41 == 9) {
						local93 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local93[0]).getDeclaredField((String) local93[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt441 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt441 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Lclient!wd;")
	public Interface3 method599() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Lclient!cf;")
	public Class16 method600(@OriginalArg(1) int arg0) {
		return this.method606(arg0, null, 3);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	public void method601() {
		synchronized (this) {
			this.aBoolean39 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass45_2 != null) {
			try {
				this.aClass45_2.method1135();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass45_1 != null) {
			try {
				this.aClass45_1.method1135();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass45Array1 == null) {
			return;
		}
		for (@Pc(51) int local51 = 0; local51 < this.aClass45Array1.length; local51++) {
			if (this.aClass45Array1[local51] != null) {
				try {
					this.aClass45Array1[local51].method1135();
				} catch (@Pc(65) IOException local65) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Lclient!cf;")
	public Class16 method602(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) String arg2) {
		return this.method606(0, new Object[] { arg1, arg2, arg0 }, 8);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!cf;")
	public Class16 method603(@OriginalArg(0) URL arg0) {
		return this.method606(0, arg0, 4);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!cf;")
	public Class16 method604(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method606(0, new Object[] { arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;ZI)Lclient!cf;")
	public Class16 method605(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method606(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!cf;")
	private Class16 method606(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class16 local3 = new Class16();
		local3.anInt443 = arg0;
		local3.anInt442 = arg2;
		local3.anObject1 = arg1;
		synchronized (this) {
			if (this.aClass16_3 == null) {
				this.aClass16_3 = this.aClass16_2 = local3;
			} else {
				this.aClass16_3.aClass16_1 = local3;
				this.aClass16_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!cf;")
	public Class16 method607(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method606(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method608(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static37.aString3, "/tmp/", "" };
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(69) boolean local69 = false;
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(74) int local74 = 0; local74 < local67.length; local74++) {
				for (@Pc(77) int local77 = 0; local77 < local44.length; local77++) {
					try {
						@Pc(82) String local82 = local44[local77];
						if (local82.length() > 0 && !(new File(local82)).exists()) {
							continue;
						}
						@Pc(105) File local105 = new File(local82 + local67[local74]);
						@Pc(116) boolean local116;
						if (local71 == 1 && !local105.exists()) {
							local116 = local105.mkdir();
							if (!local116) {
								continue;
							}
						}
						@Pc(146) int local146;
						@Pc(127) File local127;
						if (!local69) {
							try {
								local127 = new File(local105, "uid.dat");
								if (local71 == 1 && (!local127.exists() || local127.length() < 4L)) {
									@Pc(144) Random local144 = new Random();
									for (local146 = -1; local146 == -1; local146 = local144.nextInt()) {
									}
									@Pc(161) DataOutputStream local161 = new DataOutputStream(new FileOutputStream(local127));
									local161.writeInt(local146);
									local161.close();
								}
								if (local127.exists()) {
									local69 = true;
									@Pc(179) DataInputStream local179 = new DataInputStream(new FileInputStream(local127));
									this.anInt913 = local179.readInt() + 1;
									local179.close();
								}
							} catch (@Pc(189) Exception local189) {
							}
						}
						if (this.aFile1 == null) {
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
								this.aClass45_2 = new Class45(local127, "rw", 52428800L);
								this.aClass45Array1 = new Class45[arg0];
								for (local146 = 0; local146 < arg0; local146++) {
									this.aClass45Array1[local146] = new Class45(new File(local105, "main_file_cache.idx" + local146), "rw", 1048576L);
								}
								this.aClass45_1 = new Class45(new File(local105, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local105;
							} catch (@Pc(287) Exception local287) {
								try {
									this.aClass45_2.method1135();
									for (@Pc(293) int local293 = 0; local293 < arg0; local293++) {
										this.aClass45Array1[local293].method1135();
									}
									this.aClass45_1.method1135();
								} catch (@Pc(314) Exception local314) {
								}
								this.aFile2 = this.aFile1 = null;
								this.aClass45Array1 = null;
								this.aClass45_2 = this.aClass45_1 = null;
							}
						}
					} catch (@Pc(331) Exception local331) {
					}
					if (local69 && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}
}
