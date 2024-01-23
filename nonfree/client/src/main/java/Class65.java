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

@OriginalClass("client!mc")
public final class Class65 implements Runnable {

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "[Lclient!kg;")
	public Class59[] aClass59Array1;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!p;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!kg;")
	public Class59 aClass59_2 = null;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!kg;")
	public Class59 aClass59_3 = null;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!kg;")
	public Class59 aClass59_1 = null;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!fi;")
	private Class36 aClass36_6 = null;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!fi;")
	private Class36 aClass36_5 = null;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class65(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static119.aString3 = "1.1";
		Static119.aString2 = "Unknown";
		try {
			Static119.aString2 = System.getProperty("java.vendor");
			Static119.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static119.aString4 = System.getProperty("user.home");
			if (Static119.aString4 != null) {
				Static119.aString4 = Static119.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static119.aString4 == null) {
			Static119.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static119.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static119.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static119.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static119.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2007(arg3, arg4, arg2);
		}
		this.aBoolean148 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lclient!fi;")
	private Class36 method2004(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(12) Class36 local12 = new Class36();
		local12.anInt1502 = arg2;
		local12.anObject3 = arg0;
		local12.anInt1501 = arg1;
		synchronized (this) {
			if (this.aClass36_6 == null) {
				this.aClass36_6 = this.aClass36_5 = local12;
			} else {
				this.aClass36_6.aClass36_3 = local12;
				this.aClass36_6 = local12;
			}
			this.notify();
			return local12;
		}
	}

	@OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class36 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean148) {
						return;
					}
					if (this.aClass36_5 != null) {
						local15 = this.aClass36_5;
						this.aClass36_5 = this.aClass36_5.aClass36_3;
						if (this.aClass36_5 == null) {
							this.aClass36_6 = null;
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
				@Pc(41) int local41 = local15.anInt1502;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt1501);
				} else if (local41 == 2) {
					@Pc(133) Thread local133 = new Thread((Runnable) local15.anObject3);
					local133.setDaemon(true);
					local133.start();
					local133.setPriority(local15.anInt1501);
					local15.anObject2 = local133;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(90) Object[] local90;
					if (local41 == 8) {
						local90 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local90[0]).getDeclaredMethod((String) local90[1], (Class[]) local90[2]);
					} else if (local41 == 9) {
						local90 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local90[0]).getDeclaredField((String) local90[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1500 = 1;
			} catch (@Pc(150) ThreadDeath local150) {
				throw local150;
			} catch (@Pc(153) Throwable local153) {
				local15.anInt1500 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!fi;")
	public Class36 method2005(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method2004(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!fi;")
	public Class36 method2006(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method2004(new Object[] { arg0, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method2007(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static119.aString4, "/tmp/", "" };
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local71.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local34.length; local79++) {
					try {
						@Pc(84) String local84 = local34[local79];
						if (local84.length() > 0 && !(new File(local84)).exists()) {
							continue;
						}
						@Pc(107) File local107 = new File(local84 + local71[local76]);
						@Pc(118) boolean local118;
						if (local73 == 1 && !local107.exists()) {
							local118 = local107.mkdir();
							if (!local118) {
								continue;
							}
						}
						@Pc(130) File local130;
						if (this.aClass59_1 == null) {
							try {
								local130 = new File(local107, "random.dat");
								if (local73 == 1 || local130.exists()) {
									this.aClass59_1 = new Class59(local130, "rw", 25L);
								}
							} catch (@Pc(148) Exception local148) {
								this.aClass59_1 = null;
							}
						}
						if (this.aFile3 == null) {
							try {
								local107 = new File(local107, arg0);
								if (local73 == 1 && !local107.exists()) {
									local118 = local107.mkdir();
									if (!local118) {
										continue;
									}
								}
								local130 = new File(local107, "main_file_cache.dat2");
								if (local73 == 0 && !local130.exists()) {
									continue;
								}
								this.aClass59_2 = new Class59(local130, "rw", 104857600L);
								this.aClass59Array1 = new Class59[arg1];
								for (@Pc(201) int local201 = 0; local201 < arg1; local201++) {
									this.aClass59Array1[local201] = new Class59(new File(local107, "main_file_cache.idx" + local201), "rw", 1048576L);
								}
								this.aClass59_3 = new Class59(new File(local107, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local107;
							} catch (@Pc(246) Exception local246) {
								try {
									this.aClass59_2.method1787();
									for (@Pc(252) int local252 = 0; local252 < arg1; local252++) {
										this.aClass59Array1[local252].method1787();
									}
									this.aClass59_3.method1787();
								} catch (@Pc(269) Exception local269) {
								}
								this.aClass59_2 = this.aClass59_3 = null;
								this.aClass59Array1 = null;
								this.aFile2 = this.aFile3 = null;
							}
						}
					} catch (@Pc(286) Exception local286) {
					}
					if (this.aClass59_1 != null && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lclient!fi;")
	public Class36 method2008(@OriginalArg(1) int arg0) {
		return this.method2004(null, arg0, 3);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILjava/lang/String;)Lclient!fi;")
	public Class36 method2009(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method2004(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;BLjava/lang/String;)Lclient!fi;")
	public Class36 method2010(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) String arg2) {
		return this.method2004(new Object[] { arg1, arg2, arg0 }, 0, 8);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lclient!p;")
	public Interface3 method2011() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/net/URL;)Lclient!fi;")
	public Class36 method2012(@OriginalArg(1) URL arg0) {
		return this.method2004(arg0, 0, 4);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public void method2013() {
		synchronized (this) {
			this.aBoolean148 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass59_2 != null) {
			try {
				this.aClass59_2.method1787();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass59_3 != null) {
			try {
				this.aClass59_3.method1787();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass59Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass59Array1.length; local48++) {
				if (this.aClass59Array1[local48] != null) {
					try {
						this.aClass59Array1[local48].method1787();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass59_1 != null) {
			try {
				this.aClass59_1.method1787();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}
}
