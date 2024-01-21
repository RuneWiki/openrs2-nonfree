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

@OriginalClass("client!q")
public final class Class59 implements Runnable {

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!bc;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "[Lclient!v;")
	public Class78[] aClass78Array1;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!g;")
	private Class26 aClass26_52 = null;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Lclient!v;")
	public Class78 aClass78_3 = null;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!g;")
	private Class26 aClass26_51 = null;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!v;")
	public Class78 aClass78_1 = null;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!v;")
	public Class78 aClass78_2 = null;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class59(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static91.aString4 = "Unknown";
		this.anApplet1 = arg1;
		Static91.aString3 = "1.1";
		try {
			Static91.aString4 = System.getProperty("java.vendor");
			Static91.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static91.aString2 = System.getProperty("user.home");
			if (Static91.aString2 != null) {
				Static91.aString2 = Static91.aString2 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static91.aString2 == null) {
			Static91.aString2 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static91.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static91.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static91.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static91.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method1644(arg3, arg2, arg4);
		}
		this.aBoolean181 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLjava/lang/String;I)Lclient!g;")
	public Class26 method1636(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method1640(1, arg1, arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Lclient!g;")
	public Class26 method1637(@OriginalArg(1) int arg0) {
		return this.method1640(3, arg0, null);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!g;")
	public Class26 method1638(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method1640(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!g;")
	public Class26 method1639(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method1640(8, 0, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!q", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class26 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean181) {
						return;
					}
					if (this.aClass26_51 != null) {
						local15 = this.aClass26_51;
						this.aClass26_51 = this.aClass26_51.aClass26_19;
						if (this.aClass26_51 == null) {
							this.aClass26_52 = null;
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
				@Pc(41) int local41 = local15.anInt833;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt832);
				} else if (local41 == 2) {
					@Pc(68) Thread local68 = new Thread((Runnable) local15.anObject1);
					local68.setDaemon(true);
					local68.start();
					local68.setPriority(local15.anInt832);
					local15.anObject2 = local68;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(91) Object[] local91;
					if (local41 == 8) {
						local91 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local91[0]).getDeclaredMethod((String) local91[1], (Class[]) local91[2]);
					} else if (local41 == 9) {
						local91 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local91[0]).getDeclaredField((String) local91[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt831 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt831 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/lang/Object;BI)Lclient!g;")
	private Class26 method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		@Pc(3) Class26 local3 = new Class26();
		local3.anObject1 = arg2;
		local3.anInt833 = arg0;
		local3.anInt832 = arg1;
		synchronized (this) {
			if (this.aClass26_52 == null) {
				this.aClass26_52 = this.aClass26_51 = local3;
			} else {
				this.aClass26_52.aClass26_19 = local3;
				this.aClass26_52 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Lclient!bc;")
	public Interface3 method1641() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public void method1642() {
		synchronized (this) {
			this.aBoolean181 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass78_3 != null) {
			try {
				this.aClass78_3.method2041();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass78_2 != null) {
			try {
				this.aClass78_2.method2041();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass78Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass78Array1.length; local48++) {
				if (this.aClass78Array1[local48] != null) {
					try {
						this.aClass78Array1[local48].method2041();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass78_1 != null) {
			try {
				this.aClass78_1.method2041();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!g;")
	public Class26 method1643(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1640(9, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLjava/lang/String;II)V")
	private void method1644(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static91.aString2, "/tmp/", "" };
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local78.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local45.length; local86++) {
					try {
						@Pc(91) String local91 = local45[local86];
						if (local91.length() > 0 && !(new File(local91)).exists()) {
							continue;
						}
						@Pc(114) File local114 = new File(local91 + local78[local83]);
						@Pc(123) boolean local123;
						if (local80 == 1 && !local114.exists()) {
							local123 = local114.mkdir();
							if (!local123) {
								continue;
							}
						}
						@Pc(135) File local135;
						if (this.aClass78_1 == null) {
							try {
								local135 = new File(local114, "random.dat");
								if (local80 == 1 || local135.exists()) {
									this.aClass78_1 = new Class78(local135, "rw", 25L);
								}
							} catch (@Pc(153) Exception local153) {
								this.aClass78_1 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local114 = new File(local114, arg0);
								if (local80 == 1 && !local114.exists()) {
									local123 = local114.mkdir();
									if (!local123) {
										continue;
									}
								}
								local135 = new File(local114, "main_file_cache.dat2");
								if (local80 == 0 && !local135.exists()) {
									continue;
								}
								this.aClass78_3 = new Class78(local135, "rw", 52428800L);
								this.aClass78Array1 = new Class78[arg2];
								for (@Pc(206) int local206 = 0; local206 < arg2; local206++) {
									this.aClass78Array1[local206] = new Class78(new File(local114, "main_file_cache.idx" + local206), "rw", 1048576L);
								}
								this.aClass78_2 = new Class78(new File(local114, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local114;
							} catch (@Pc(255) Exception local255) {
								try {
									this.aClass78_3.method2041();
									for (@Pc(261) int local261 = 0; local261 < arg2; local261++) {
										this.aClass78Array1[local261].method2041();
									}
									this.aClass78_2.method2041();
								} catch (@Pc(282) Exception local282) {
								}
								this.aClass78Array1 = null;
								this.aClass78_3 = this.aClass78_2 = null;
								this.aFile1 = this.aFile2 = null;
							}
						}
					} catch (@Pc(299) Exception local299) {
					}
					if (this.aClass78_1 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!g;")
	public Class26 method1645(@OriginalArg(0) URL arg0) {
		return this.method1640(4, 0, arg0);
	}
}
