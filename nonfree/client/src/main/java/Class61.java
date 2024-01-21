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

@OriginalClass("client!na")
public final class Class61 implements Runnable {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "[Lclient!nh;")
	public Class66[] aClass66Array1;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "Lclient!tc;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Lclient!nh;")
	public Class66 aClass66_1 = null;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!nh;")
	public Class66 aClass66_2 = null;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!wg;")
	private Class94 aClass94_5 = null;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!wg;")
	private Class94 aClass94_4 = null;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!nh;")
	public Class66 aClass66_3 = null;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class61(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static117.aString4 = "Unknown";
		Static117.aString3 = "1.1";
		this.anApplet1 = arg1;
		try {
			Static117.aString4 = System.getProperty("java.vendor");
			Static117.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static117.aString5 = System.getProperty("user.home");
			if (Static117.aString5 != null) {
				Static117.aString5 = Static117.aString5 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static117.aString5 == null) {
			Static117.aString5 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static117.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static117.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static117.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static117.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1793(arg2, arg4, arg3);
		}
		this.aBoolean102 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public void method1784() {
		synchronized (this) {
			this.aBoolean102 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass66_2 != null) {
			try {
				this.aClass66_2.method1839();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass66_1 != null) {
			try {
				this.aClass66_1.method1839();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass66Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass66Array1.length; local53++) {
				if (this.aClass66Array1[local53] != null) {
					try {
						this.aClass66Array1[local53].method1839();
					} catch (@Pc(69) IOException local69) {
					}
				}
			}
		}
		if (this.aClass66_3 != null) {
			try {
				this.aClass66_3.method1839();
			} catch (@Pc(85) IOException local85) {
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!wg;")
	private Class94 method1785(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class94 local3 = new Class94();
		local3.anObject4 = arg0;
		local3.anInt4473 = arg1;
		local3.anInt4474 = arg2;
		synchronized (this) {
			if (this.aClass94_5 == null) {
				this.aClass94_5 = this.aClass94_4 = local3;
			} else {
				this.aClass94_5.aClass94_8 = local3;
				this.aClass94_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class94 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean102) {
						return;
					}
					if (this.aClass94_4 != null) {
						local15 = this.aClass94_4;
						this.aClass94_4 = this.aClass94_4.aClass94_8;
						if (this.aClass94_4 == null) {
							this.aClass94_5 = null;
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
				@Pc(41) int local41 = local15.anInt4473;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt4474);
				} else if (local41 == 2) {
					@Pc(68) Thread local68 = new Thread((Runnable) local15.anObject4);
					local68.setDaemon(true);
					local68.start();
					local68.setPriority(local15.anInt4474);
					local15.anObject3 = local68;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(93) Object[] local93;
					if (local41 == 8) {
						local93 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local93[0]).getDeclaredMethod((String) local93[1], (Class[]) local93[2]);
					} else if (local41 == 9) {
						local93 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local93[0]).getDeclaredField((String) local93[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt4472 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt4472 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lclient!tc;")
	public Interface3 method1786() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!wg;")
	public Class94 method1787(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method1785(new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lclient!wg;")
	public Class94 method1788(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method1785(new Object[] { arg1, arg0, arg2 }, 8, 0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!wg;")
	public Class94 method1789(@OriginalArg(0) URL arg0) {
		return this.method1785(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!wg;")
	public Class94 method1790(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method1785(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!wg;")
	public Class94 method1791(@OriginalArg(1) int arg0) {
		return this.method1785(null, 3, arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!wg;")
	public Class94 method1792(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1785(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/lang/String;Z)V")
	private void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(38) String[] local38 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(73) String[] local73 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static117.aString5, "/tmp/", "" };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local38.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local73.length; local81++) {
					try {
						@Pc(86) String local86 = local73[local81];
						if (local86.length() > 0 && !(new File(local86)).exists()) {
							continue;
						}
						@Pc(109) File local109 = new File(local86 + local38[local78]);
						@Pc(120) boolean local120;
						if (local75 == 1 && !local109.exists()) {
							local120 = local109.mkdir();
							if (!local120) {
								continue;
							}
						}
						@Pc(132) File local132;
						if (this.aClass66_3 == null) {
							try {
								local132 = new File(local109, "random.dat");
								if (local75 == 1 || local132.exists()) {
									this.aClass66_3 = new Class66(local132, "rw", 25L);
								}
							} catch (@Pc(150) Exception local150) {
								this.aClass66_3 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local109 = new File(local109, arg2);
								if (local75 == 1 && !local109.exists()) {
									local120 = local109.mkdir();
									if (!local120) {
										continue;
									}
								}
								local132 = new File(local109, "main_file_cache.dat2");
								if (local75 == 0 && !local132.exists()) {
									continue;
								}
								this.aClass66_2 = new Class66(local132, "rw", 104857600L);
								this.aClass66Array1 = new Class66[arg1];
								for (@Pc(205) int local205 = 0; local205 < arg1; local205++) {
									this.aClass66Array1[local205] = new Class66(new File(local109, "main_file_cache.idx" + local205), "rw", 1048576L);
								}
								this.aClass66_1 = new Class66(new File(local109, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local109;
							} catch (@Pc(254) Exception local254) {
								try {
									this.aClass66_2.method1839();
									for (@Pc(260) int local260 = 0; local260 < arg1; local260++) {
										this.aClass66Array1[local260].method1839();
									}
									this.aClass66_1.method1839();
								} catch (@Pc(281) Exception local281) {
								}
								this.aClass66_2 = this.aClass66_1 = null;
								this.aFile1 = this.aFile2 = null;
								this.aClass66Array1 = null;
							}
						}
					} catch (@Pc(298) Exception local298) {
					}
					if (this.aClass66_3 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}
}
