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

@OriginalClass("client!cf")
public final class Class14 implements Runnable {

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "[Lclient!ca;")
	public Class11[] aClass11Array1;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!j;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!fc;")
	private Class24 aClass24_1 = null;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!fc;")
	private Class24 aClass24_2 = null;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!ca;")
	public Class11 aClass11_2 = null;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!ca;")
	public Class11 aClass11_1 = null;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!ca;")
	public Class11 aClass11_3 = null;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class14(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet1 = arg1;
		Static16.aString3 = "1.1";
		Static16.aString2 = "Unknown";
		try {
			Static16.aString2 = System.getProperty("java.vendor");
			Static16.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static16.aString1 = System.getProperty("user.home");
			if (Static16.aString1 != null) {
				Static16.aString1 = Static16.aString1 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static16.aString1 == null) {
			Static16.aString1 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static16.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static16.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static16.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static16.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method188(arg3, arg4, arg2);
		}
		this.aBoolean10 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!fc;")
	public Class24 method184(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method190(new Object[] { arg2, arg0, arg1 }, 0, 8);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!fc;")
	public Class24 method185(@OriginalArg(0) int arg0) {
		return this.method190(null, arg0, 3);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lclient!fc;")
	public Class24 method186(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method190(new Object[] { arg1, arg0 }, 0, 9);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/net/URL;)Lclient!fc;")
	public Class24 method187(@OriginalArg(1) URL arg0) {
		return this.method190(arg0, 0, 4);
	}

	@OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class24 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean10) {
						return;
					}
					if (this.aClass24_2 != null) {
						local15 = this.aClass24_2;
						this.aClass24_2 = this.aClass24_2.aClass24_5;
						if (this.aClass24_2 == null) {
							this.aClass24_1 = null;
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
				@Pc(41) int local41 = local15.anInt815;
				if (local41 == 1) {
					local15.anObject10 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt816);
				} else if (local41 == 2) {
					@Pc(68) Thread local68 = new Thread((Runnable) local15.anObject9);
					local68.setDaemon(true);
					local68.start();
					local68.setPriority(local15.anInt816);
					local15.anObject10 = local68;
				} else if (local41 == 4) {
					local15.anObject10 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(108) Object[] local108;
					if (local41 == 8) {
						local108 = (Object[]) local15.anObject9;
						local15.anObject10 = ((Class) local108[0]).getDeclaredMethod((String) local108[1], (Class[]) local108[2]);
					} else if (local41 == 9) {
						local108 = (Object[]) local15.anObject9;
						local15.anObject10 = ((Class) local108[0]).getDeclaredField((String) local108[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt814 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt814 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method188(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static16.aString1, "/tmp/", "" };
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(81) int local81 = 0; local81 < local67.length; local81++) {
				for (@Pc(84) int local84 = 0; local84 < local34.length; local84++) {
					try {
						@Pc(89) String local89 = local34[local84];
						if (local89.length() > 0 && !(new File(local89)).exists()) {
							continue;
						}
						@Pc(115) File local115 = new File(local89 + local67[local81]);
						@Pc(126) boolean local126;
						if (local78 == 1 && !local115.exists()) {
							local126 = local115.mkdir();
							if (!local126) {
								continue;
							}
						}
						@Pc(138) File local138;
						if (this.aClass11_2 == null) {
							try {
								local138 = new File(local115, "random.dat");
								if (local78 == 1 || local138.exists()) {
									this.aClass11_2 = new Class11(local138, "rw", 25L);
								}
							} catch (@Pc(154) Exception local154) {
								this.aClass11_2 = null;
							}
						}
						if (this.aFile3 == null) {
							try {
								local115 = new File(local115, arg0);
								if (local78 == 1 && !local115.exists()) {
									local126 = local115.mkdir();
									if (!local126) {
										continue;
									}
								}
								local138 = new File(local115, "main_file_cache.dat2");
								if (local78 == 0 && !local138.exists()) {
									continue;
								}
								this.aClass11_1 = new Class11(local138, "rw", 52428800L);
								this.aClass11Array1 = new Class11[arg1];
								for (@Pc(204) int local204 = 0; local204 < arg1; local204++) {
									this.aClass11Array1[local204] = new Class11(new File(local115, "main_file_cache.idx" + local204), "rw", 1048576L);
								}
								this.aClass11_3 = new Class11(new File(local115, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local115;
							} catch (@Pc(249) Exception local249) {
								try {
									this.aClass11_1.method155();
									for (@Pc(255) int local255 = 0; local255 < arg1; local255++) {
										this.aClass11Array1[local255].method155();
									}
									this.aClass11_3.method155();
								} catch (@Pc(276) Exception local276) {
								}
								this.aClass11_1 = this.aClass11_3 = null;
								this.aFile2 = this.aFile3 = null;
								this.aClass11Array1 = null;
							}
						}
					} catch (@Pc(293) Exception local293) {
					}
					if (this.aClass11_2 != null && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public void method189() {
		synchronized (this) {
			this.aBoolean10 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass11_1 != null) {
			try {
				this.aClass11_1.method155();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass11_3 != null) {
			try {
				this.aClass11_3.method155();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass11Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass11Array1.length; local49++) {
				if (this.aClass11Array1[local49] != null) {
					try {
						this.aClass11Array1[local49].method155();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass11_2 != null) {
			try {
				this.aClass11_2.method155();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!fc;")
	private Class24 method190(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class24 local3 = new Class24();
		local3.anObject9 = arg0;
		local3.anInt816 = arg1;
		local3.anInt815 = arg2;
		synchronized (this) {
			if (this.aClass24_1 == null) {
				this.aClass24_1 = this.aClass24_2 = local3;
			} else {
				this.aClass24_1.aClass24_5 = local3;
				this.aClass24_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Lclient!j;")
	public Interface2 method191() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!fc;")
	public Class24 method192(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method190(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!fc;")
	public Class24 method193(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method190(arg0, arg1, 1);
	}
}
