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

@OriginalClass("client!da")
public final class Class14 implements Runnable {

	@OriginalMember(owner = "client!da", name = "e", descriptor = "[Lclient!t;")
	public Class83[] aClass83Array1;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!rh;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!t;")
	public Class83 aClass83_1 = null;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Lclient!ha;")
	private Class34 aClass34_2 = null;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!ha;")
	private Class34 aClass34_1 = null;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Lclient!t;")
	public Class83 aClass83_3 = null;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Lclient!t;")
	public Class83 aClass83_2 = null;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class14(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static32.aString3 = "1.1";
		this.anApplet1 = arg1;
		Static32.aString1 = "Unknown";
		try {
			Static32.aString1 = System.getProperty("java.vendor");
			Static32.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static32.aString2 = System.getProperty("user.home");
			if (Static32.aString2 != null) {
				Static32.aString2 = Static32.aString2 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static32.aString2 == null) {
			Static32.aString2 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static32.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static32.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static32.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static32.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method622(arg3, arg4, arg2);
		}
		this.aBoolean40 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public void method619() {
		synchronized (this) {
			this.aBoolean40 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass83_2 != null) {
			try {
				this.aClass83_2.method2934();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass83_1 != null) {
			try {
				this.aClass83_1.method2934();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass83Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass83Array1.length; local47++) {
				if (this.aClass83Array1[local47] != null) {
					try {
						this.aClass83Array1[local47].method2934();
					} catch (@Pc(61) IOException local61) {
					}
				}
			}
		}
		if (this.aClass83_3 != null) {
			try {
				this.aClass83_3.method2934();
			} catch (@Pc(77) IOException local77) {
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;B)Lclient!ha;")
	public Class34 method620(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method621(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!da", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class34 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean40) {
						return;
					}
					if (this.aClass34_2 != null) {
						local15 = this.aClass34_2;
						this.aClass34_2 = this.aClass34_2.aClass34_5;
						if (this.aClass34_2 == null) {
							this.aClass34_1 = null;
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
				@Pc(41) int local41 = local15.anInt1728;
				if (local41 == 1) {
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt1729);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject2);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1729);
					local15.anObject1 = local56;
				} else if (local41 == 4) {
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(84) Object[] local84;
					if (local41 == 8) {
						local84 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local84[0]).getDeclaredMethod((String) local84[1], (Class[]) local84[2]);
					} else if (local41 == 9) {
						local84 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local84[0]).getDeclaredField((String) local84[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1727 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt1727 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lclient!ha;")
	private Class34 method621(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class34 local3 = new Class34();
		local3.anInt1729 = arg1;
		local3.anObject2 = arg0;
		local3.anInt1728 = arg2;
		synchronized (this) {
			if (this.aClass34_1 == null) {
				this.aClass34_1 = this.aClass34_2 = local3;
			} else {
				this.aClass34_1.aClass34_5 = local3;
				this.aClass34_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method622(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static32.aString2, "/tmp/", "" };
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(69) int local69 = 0; local69 < 2; local69++) {
			for (@Pc(72) int local72 = 0; local72 < local67.length; local72++) {
				for (@Pc(75) int local75 = 0; local75 < local44.length; local75++) {
					try {
						@Pc(80) String local80 = local44[local75];
						if (local80.length() > 0 && !(new File(local80)).exists()) {
							continue;
						}
						@Pc(103) File local103 = new File(local80 + local67[local72]);
						@Pc(114) boolean local114;
						if (local69 == 1 && !local103.exists()) {
							local114 = local103.mkdir();
							if (!local114) {
								continue;
							}
						}
						@Pc(126) File local126;
						if (this.aClass83_3 == null) {
							try {
								local126 = new File(local103, "random.dat");
								if (local69 == 1 || local126.exists()) {
									this.aClass83_3 = new Class83(local126, "rw", 25L);
								}
							} catch (@Pc(144) Exception local144) {
								this.aClass83_3 = null;
							}
						}
						if (this.aFile1 == null) {
							try {
								local103 = new File(local103, arg0);
								if (local69 == 1 && !local103.exists()) {
									local114 = local103.mkdir();
									if (!local114) {
										continue;
									}
								}
								local126 = new File(local103, "main_file_cache.dat2");
								if (local69 == 0 && !local126.exists()) {
									continue;
								}
								this.aClass83_2 = new Class83(local126, "rw", 104857600L);
								this.aClass83Array1 = new Class83[arg1];
								for (@Pc(194) int local194 = 0; local194 < arg1; local194++) {
									this.aClass83Array1[local194] = new Class83(new File(local103, "main_file_cache.idx" + local194), "rw", 1048576L);
								}
								this.aClass83_1 = new Class83(new File(local103, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local103;
							} catch (@Pc(243) Exception local243) {
								try {
									this.aClass83_2.method2934();
									for (@Pc(249) int local249 = 0; local249 < arg1; local249++) {
										this.aClass83Array1[local249].method2934();
									}
									this.aClass83_1.method2934();
								} catch (@Pc(270) Exception local270) {
								}
								this.aFile2 = this.aFile1 = null;
								this.aClass83Array1 = null;
								this.aClass83_2 = this.aClass83_1 = null;
							}
						}
					} catch (@Pc(287) Exception local287) {
					}
					if (this.aClass83_3 != null && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!ha;")
	public Class34 method623(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method621(new Object[] { arg1, arg0 }, 0, 9);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!ha;")
	public Class34 method624(@OriginalArg(0) URL arg0) {
		return this.method621(arg0, 0, 4);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/Runnable;IZ)Lclient!ha;")
	public Class34 method625(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method621(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!ha;")
	public Class34 method626(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method621(new Object[] { arg1, arg2, arg0 }, 0, 8);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Lclient!rh;")
	public Interface3 method627() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Lclient!ha;")
	public Class34 method628(@OriginalArg(1) int arg0) {
		return this.method621(null, arg0, 3);
	}
}
