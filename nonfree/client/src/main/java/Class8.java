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

@OriginalClass("client!ba")
public final class Class8 implements Runnable {

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "[Lclient!bb;")
	public Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!n;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	public int anInt181 = 0;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!eb;")
	private Class20 aClass20_3 = null;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Lclient!bb;")
	public Class9 aClass9_1 = null;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!eb;")
	private Class20 aClass20_2 = null;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!bb;")
	public Class9 aClass9_2 = null;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class8(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		this.anInetAddress1 = arg2;
		Static8.aString3 = "Unknown";
		this.anApplet1 = arg1;
		Static8.aString2 = "1.1";
		try {
			Static8.aString3 = System.getProperty("java.vendor");
			Static8.aString2 = System.getProperty("java.version");
		} catch (@Pc(46) Exception local46) {
		}
		try {
			Static8.aString1 = System.getProperty("user.home");
			if (Static8.aString1 != null) {
				Static8.aString1 = Static8.aString1 + "/";
			}
		} catch (@Pc(62) Exception local62) {
		}
		if (Static8.aString1 == null) {
			Static8.aString1 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(72) Throwable local72) {
		}
		try {
			if (arg1 == null) {
				Static8.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static8.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(99) Exception local99) {
		}
		try {
			if (arg1 == null) {
				Static8.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static8.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		if (arg0) {
			this.method143(arg3, arg4, arg5);
		}
		this.aBoolean11 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!eb;")
	private Class20 method140(@OriginalArg(2) Object arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class20 local3 = new Class20();
		local3.anInt930 = arg1;
		local3.anObject1 = arg0;
		local3.anInt932 = arg2;
		synchronized (this) {
			if (this.aClass20_3 == null) {
				this.aClass20_3 = this.aClass20_2 = local3;
			} else {
				this.aClass20_3.aClass20_4 = local3;
				this.aClass20_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class20 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean11) {
						return;
					}
					if (this.aClass20_2 != null) {
						local15 = this.aClass20_2;
						this.aClass20_2 = this.aClass20_2.aClass20_4;
						if (this.aClass20_2 == null) {
							this.aClass20_3 = null;
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
				@Pc(41) int local41 = local15.anInt930;
				if (local41 == 1) {
					local15.anObject2 = new Socket(this.anInetAddress1, local15.anInt932);
				} else if (local41 == 2) {
					@Pc(129) Thread local129 = new Thread((Runnable) local15.anObject1);
					local129.setDaemon(true);
					local129.start();
					local129.setPriority(local15.anInt932);
					local15.anObject2 = local129;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local41 == 9) {
						local81 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local41 == 10) {
						local81 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt931 = 1;
			} catch (@Pc(146) Exception local146) {
				local15.anInt931 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lclient!eb;")
	public Class20 method141(@OriginalArg(0) int arg0) {
		return this.method140(null, 1, arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Lclient!eb;")
	public Class20 method142(@OriginalArg(0) int arg0) {
		return this.method140(null, 3, arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method143(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(48) String[] local48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static8.aString1, "" };
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(73) boolean local73 = false;
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local71.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local48.length; local81++) {
					try {
						@Pc(86) String local86 = local48[local81];
						if (local86.length() > 0 && !(new File(local86)).exists()) {
							continue;
						}
						@Pc(112) File local112 = new File(local86 + local71[local78]);
						@Pc(123) boolean local123;
						if (local75 == 1 && !local112.exists()) {
							local123 = local112.mkdir();
							if (!local123) {
								continue;
							}
						}
						@Pc(149) int local149;
						@Pc(134) File local134;
						if (!local73) {
							try {
								local134 = new File(local112, "uid.dat");
								if (local75 == 1 && (!local134.exists() || local134.length() < 4L)) {
									local149 = -1;
									@Pc(153) Random local153 = new Random();
									while (local149 == -1) {
										local149 = local153.nextInt();
									}
									@Pc(169) DataOutputStream local169 = new DataOutputStream(new FileOutputStream(local134));
									local169.writeInt(local149);
									local169.close();
								}
								if (local134.exists()) {
									local73 = true;
									@Pc(187) DataInputStream local187 = new DataInputStream(new FileInputStream(local134));
									this.anInt181 = local187.readInt() + 1;
									local187.close();
								}
							} catch (@Pc(197) Exception local197) {
							}
						}
						if (this.aFile1 == null) {
							try {
								local112 = new File(local112, arg1);
								if (local75 == 1 && !local112.exists()) {
									local123 = local112.mkdir();
									if (!local123) {
										continue;
									}
								}
								local134 = new File(local112, "main_file_cache.dat2");
								if (local75 == 0 && !local134.exists()) {
									continue;
								}
								this.aClass9_2 = new Class9(local134, "rw", 52428800L);
								this.aClass9Array1 = new Class9[arg2];
								for (local149 = 0; local149 < arg2; local149++) {
									this.aClass9Array1[local149] = new Class9(new File(local112, "main_file_cache.idx" + local149), "rw", 1048576L);
								}
								this.aClass9_1 = new Class9(new File(local112, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local112;
							} catch (@Pc(289) Exception local289) {
								try {
									this.aClass9_2.method154();
									for (@Pc(295) int local295 = 0; local295 < arg2; local295++) {
										this.aClass9Array1[local295].method154();
									}
									this.aClass9_1.method154();
								} catch (@Pc(316) Exception local316) {
								}
								this.aClass9Array1 = null;
								this.aClass9_2 = this.aClass9_1 = null;
								this.aFile2 = this.aFile1 = null;
							}
						}
					} catch (@Pc(333) Exception local333) {
					}
					if (local73 && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Lclient!n;")
	public Interface3 method144() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Lclient!eb;")
	public Class20 method145(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method140(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/net/URL;)Lclient!eb;")
	public Class20 method146(@OriginalArg(1) URL arg0) {
		return this.method140(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!eb;")
	public Class20 method147(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method140(new Object[] { arg1, arg0 }, 10, 0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Lclient!eb;")
	public Class20 method148(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method140(new Object[] { arg0, arg1, arg2 }, 9, 0);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	public void method149() {
		synchronized (this) {
			this.aBoolean11 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass9_2 != null) {
			try {
				this.aClass9_2.method154();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass9_1 != null) {
			try {
				this.aClass9_1.method154();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass9Array1 == null) {
			return;
		}
		for (@Pc(46) int local46 = 0; local46 < this.aClass9Array1.length; local46++) {
			if (this.aClass9Array1[local46] != null) {
				try {
					this.aClass9Array1[local46].method154();
				} catch (@Pc(60) IOException local60) {
				}
			}
		}
	}
}
