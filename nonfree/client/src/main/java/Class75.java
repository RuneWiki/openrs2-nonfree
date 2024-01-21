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

@OriginalClass("client!vb")
public final class Class75 implements Runnable {

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!dc;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[Lclient!l;")
	public Class39[] aClass39Array1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!l;")
	public Class39 aClass39_3 = null;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!l;")
	public Class39 aClass39_2 = null;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!gd;")
	private Class22 aClass22_6 = null;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Lclient!gd;")
	private Class22 aClass22_7 = null;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
	public int anInt3184 = 0;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class75(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static123.aString5 = "1.1";
		this.anApplet1 = arg1;
		Static123.aString3 = "Unknown";
		try {
			Static123.aString3 = System.getProperty("java.vendor");
			Static123.aString5 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static123.aString4 = System.getProperty("user.home");
			if (Static123.aString4 != null) {
				Static123.aString4 = Static123.aString4 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static123.aString4 == null) {
			Static123.aString4 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static123.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static123.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static123.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static123.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method2180(arg2, arg3, arg4);
		}
		this.aBoolean176 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lclient!gd;")
	public Class22 method2172(@OriginalArg(0) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method2177(new Object[] { arg2, arg1, arg0 }, 8, 0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lclient!gd;")
	public Class22 method2173(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method2177(new Object[] { arg0, arg1 }, 9, 0);
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class22 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean176) {
						return;
					}
					if (this.aClass22_7 != null) {
						local15 = this.aClass22_7;
						this.aClass22_7 = this.aClass22_7.aClass22_3;
						if (this.aClass22_7 == null) {
							this.aClass22_6 = null;
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
				@Pc(41) int local41 = local15.anInt1198;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt1199);
				} else if (local41 == 2) {
					@Pc(131) Thread local131 = new Thread((Runnable) local15.anObject2);
					local131.setDaemon(true);
					local131.start();
					local131.setPriority(local15.anInt1199);
					local15.anObject3 = local131;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(85) Object[] local85;
					if (local41 == 8) {
						local85 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local85[0]).getDeclaredMethod((String) local85[1], (Class[]) local85[2]);
					} else if (local41 == 9) {
						local85 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local85[0]).getDeclaredField((String) local85[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1200 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt1200 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!gd;")
	public Class22 method2174(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method2177(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/net/URL;)Lclient!gd;")
	public Class22 method2175(@OriginalArg(1) URL arg0) {
		return this.method2177(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method2176() {
		synchronized (this) {
			this.aBoolean176 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass39_3 != null) {
			try {
				this.aClass39_3.method1256();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass39_2 != null) {
			try {
				this.aClass39_2.method1256();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass39Array1 == null) {
			return;
		}
		for (@Pc(48) int local48 = 0; local48 < this.aClass39Array1.length; local48++) {
			if (this.aClass39Array1[local48] != null) {
				try {
					this.aClass39Array1[local48].method1256();
				} catch (@Pc(62) IOException local62) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!gd;")
	private Class22 method2177(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class22 local3 = new Class22();
		local3.anInt1199 = arg2;
		local3.anObject2 = arg0;
		local3.anInt1198 = arg1;
		synchronized (this) {
			if (this.aClass22_6 == null) {
				this.aClass22_6 = this.aClass22_7 = local3;
			} else {
				this.aClass22_6.aClass22_3 = local3;
				this.aClass22_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/String;I)Lclient!gd;")
	public Class22 method2178(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method2177(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Lclient!dc;")
	public Interface1 method2179() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method2180(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static123.aString4, "/tmp/", "" };
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
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
						@Pc(114) boolean local114;
						if (local71 == 1 && !local105.exists()) {
							local114 = local105.mkdir();
							if (!local114) {
								continue;
							}
						}
						@Pc(144) int local144;
						@Pc(125) File local125;
						if (!local69) {
							try {
								local125 = new File(local105, "uid.dat");
								if (local71 == 1 && (!local125.exists() || local125.length() < 4L)) {
									@Pc(142) Random local142 = new Random();
									for (local144 = -1; local144 == -1; local144 = local142.nextInt()) {
									}
									@Pc(159) DataOutputStream local159 = new DataOutputStream(new FileOutputStream(local125));
									local159.writeInt(local144);
									local159.close();
								}
								if (local125.exists()) {
									local69 = true;
									@Pc(177) DataInputStream local177 = new DataInputStream(new FileInputStream(local125));
									this.anInt3184 = local177.readInt() + 1;
									local177.close();
								}
							} catch (@Pc(187) Exception local187) {
							}
						}
						if (this.aFile3 == null) {
							try {
								local105 = new File(local105, arg1);
								if (local71 == 1 && !local105.exists()) {
									local114 = local105.mkdir();
									if (!local114) {
										continue;
									}
								}
								local125 = new File(local105, "main_file_cache.dat2");
								if (local71 == 0 && !local125.exists()) {
									continue;
								}
								this.aClass39_3 = new Class39(local125, "rw", 52428800L);
								this.aClass39Array1 = new Class39[arg2];
								for (local144 = 0; local144 < arg2; local144++) {
									this.aClass39Array1[local144] = new Class39(new File(local105, "main_file_cache.idx" + local144), "rw", 1048576L);
								}
								this.aClass39_2 = new Class39(new File(local105, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local105;
							} catch (@Pc(282) Exception local282) {
								try {
									this.aClass39_3.method1256();
									for (@Pc(288) int local288 = 0; local288 < arg2; local288++) {
										this.aClass39Array1[local288].method1256();
									}
									this.aClass39_2.method1256();
								} catch (@Pc(309) Exception local309) {
								}
								this.aClass39Array1 = null;
								this.aClass39_3 = this.aClass39_2 = null;
								this.aFile2 = this.aFile3 = null;
							}
						}
					} catch (@Pc(326) Exception local326) {
					}
					if (local69 && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lclient!gd;")
	public Class22 method2181(@OriginalArg(0) int arg0) {
		return this.method2177(null, 3, arg0);
	}
}
