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
public final class Class6 implements Runnable {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[Lclient!e;")
	public Class18[] aClass18Array1;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!ab;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!ef;")
	private Class22 aClass22_2 = null;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Lclient!e;")
	public Class18 aClass18_1 = null;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!ef;")
	private Class22 aClass22_1 = null;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!e;")
	public Class18 aClass18_2 = null;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
	public int anInt193 = 0;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class6(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static6.aString1 = "1.1";
		Static6.aString3 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static6.aString3 = System.getProperty("java.vendor");
			Static6.aString1 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static6.aString2 = System.getProperty("user.home");
			if (Static6.aString2 != null) {
				Static6.aString2 = Static6.aString2 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static6.aString2 == null) {
			Static6.aString2 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static6.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static6.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static6.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static6.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method126(arg2, arg4, arg3);
		}
		this.aBoolean7 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class22 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean7) {
						return;
					}
					if (this.aClass22_2 != null) {
						local15 = this.aClass22_2;
						this.aClass22_2 = this.aClass22_2.aClass22_4;
						if (this.aClass22_2 == null) {
							this.aClass22_1 = null;
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
				@Pc(41) int local41 = local15.anInt865;
				if (local41 == 1) {
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt866);
				} else if (local41 == 2) {
					@Pc(117) Thread local117 = new Thread((Runnable) local15.anObject1);
					local117.setDaemon(true);
					local117.start();
					local117.setPriority(local15.anInt866);
					local15.anObject2 = local117;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(61) Object[] local61;
					if (local41 == 9) {
						local61 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local61[0]).getDeclaredMethod((String) local61[1], (Class[]) local61[2]);
					} else if (local41 == 10) {
						local61 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local61[0]).getDeclaredField((String) local61[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt864 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt864 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)Lclient!ef;")
	public Class22 method119(@OriginalArg(1) int arg0) {
		return this.method123(3, arg0, null);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!ab;")
	public Interface1 method120() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lclient!ef;")
	public Class22 method121(@OriginalArg(1) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method123(9, 0, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!ef;")
	public Class22 method122(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method123(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZIILjava/lang/Object;)Lclient!ef;")
	private Class22 method123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class22 local3 = new Class22();
		local3.anInt865 = arg0;
		local3.anInt866 = arg1;
		local3.anObject1 = arg2;
		synchronized (this) {
			if (this.aClass22_1 == null) {
				this.aClass22_1 = this.aClass22_2 = local3;
			} else {
				this.aClass22_1.aClass22_4 = local3;
				this.aClass22_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!ef;")
	public Class22 method124(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method123(10, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public void method125() {
		synchronized (this) {
			this.aBoolean7 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass18_1 != null) {
			try {
				this.aClass18_1.method482();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass18_2 != null) {
			try {
				this.aClass18_2.method482();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass18Array1 == null) {
			return;
		}
		for (@Pc(48) int local48 = 0; local48 < this.aClass18Array1.length; local48++) {
			if (this.aClass18Array1[local48] != null) {
				try {
					this.aClass18Array1[local48].method482();
				} catch (@Pc(62) IOException local62) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(38) String[] local38 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static6.aString2, "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(73) boolean local73 = false;
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local71.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local38.length; local81++) {
					try {
						@Pc(86) String local86 = local38[local81];
						if (local86.length() > 0 && !(new File(local86)).exists()) {
							continue;
						}
						@Pc(109) File local109 = new File(local86 + local71[local78]);
						@Pc(120) boolean local120;
						if (local75 == 1 && !local109.exists()) {
							local120 = local109.mkdir();
							if (!local120) {
								continue;
							}
						}
						@Pc(146) int local146;
						@Pc(131) File local131;
						if (!local73) {
							try {
								local131 = new File(local109, "uid.dat");
								if (local75 == 1 && (!local131.exists() || local131.length() < 4L)) {
									local146 = -1;
									@Pc(150) Random local150 = new Random();
									while (local146 == -1) {
										local146 = local150.nextInt();
									}
									@Pc(166) DataOutputStream local166 = new DataOutputStream(new FileOutputStream(local131));
									local166.writeInt(local146);
									local166.close();
								}
								if (local131.exists()) {
									local73 = true;
									@Pc(184) DataInputStream local184 = new DataInputStream(new FileInputStream(local131));
									this.anInt193 = local184.readInt() + 1;
									local184.close();
								}
							} catch (@Pc(194) Exception local194) {
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
								local131 = new File(local109, "main_file_cache.dat2");
								if (local75 == 0 && !local131.exists()) {
									continue;
								}
								this.aClass18_1 = new Class18(local131, "rw", 52428800L);
								this.aClass18Array1 = new Class18[arg1];
								for (local146 = 0; local146 < arg1; local146++) {
									this.aClass18Array1[local146] = new Class18(new File(local109, "main_file_cache.idx" + local146), "rw", 1048576L);
								}
								this.aClass18_2 = new Class18(new File(local109, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local109;
							} catch (@Pc(289) Exception local289) {
								try {
									this.aClass18_1.method482();
									for (@Pc(295) int local295 = 0; local295 < arg1; local295++) {
										this.aClass18Array1[local295].method482();
									}
									this.aClass18_2.method482();
								} catch (@Pc(316) Exception local316) {
								}
								this.aClass18_1 = this.aClass18_2 = null;
								this.aClass18Array1 = null;
								this.aFile1 = this.aFile2 = null;
							}
						}
					} catch (@Pc(333) Exception local333) {
					}
					if (local73 && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ef;")
	public Class22 method127(@OriginalArg(1) URL arg0) {
		return this.method123(4, 0, arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!ef;")
	public Class22 method128(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method123(1, arg1, arg0);
	}
}
