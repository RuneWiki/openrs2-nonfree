import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class54 implements Runnable {

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!cd;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!t;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!u;")
	private Class62 aClass62_41 = null;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!tc;")
	public Class60 aClass60_2 = null;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Ljava/lang/String;")
	private String aString4 = null;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public int anInt2355 = 0;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!u;")
	private Class62 aClass62_42 = null;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Ljava/lang/String;")
	private String aString1 = null;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "Ljava/lang/String;")
	private String aString6 = null;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!tc;")
	public Class60 aClass60_3 = null;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "[Lclient!tc;")
	public Class60[] aClass60Array1;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class54(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		Static86.aString2 = "Unknown";
		this.anInetAddress1 = arg2;
		Static86.aString3 = "1.1";
		this.anApplet1 = arg1;
		try {
			Static86.aString2 = System.getProperty("java.vendor");
			Static86.aString3 = System.getProperty("java.version");
			Static86.aString7 = System.getProperty("user.home");
			if (Static86.aString7 != null) {
				Static86.aString7 = Static86.aString7 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static86.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static86.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static86.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static86.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method1489(arg3, arg4);
			this.aClass60_3 = new Class60(new File(this.aString4 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass60Array1 = new Class60[arg5];
			for (@Pc(152) int local152 = 0; local152 < arg5; local152++) {
				this.aClass60Array1[local152] = new Class60(new File(this.aString4 + "main_file_cache.idx" + local152), "rw", 1048576L);
			}
			this.aClass60_2 = new Class60(new File(this.aString4 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method1484();
		}
		this.aBoolean110 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Lclient!u;")
	public Class62 method1483(@OriginalArg(0) int arg0) {
		return this.method1488(3, arg0, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	private void method1484() {
		try {
			@Pc(21) File local21 = new File(this.aString5 + "uid.dat");
			if (!local21.exists() || local21.length() < 4L) {
				@Pc(45) DataOutputStream local45 = new DataOutputStream(new FileOutputStream(this.aString5 + "uid.dat"));
				local45.writeInt((int) (Math.random() * 9.9999999E7D));
				local45.close();
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			@Pc(71) DataInputStream local71 = new DataInputStream(new FileInputStream(this.aString5 + "uid.dat"));
			this.anInt2355 = local71.readInt() + 1;
			local71.close();
		} catch (@Pc(81) Exception local81) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Lclient!u;")
	public Class62 method1485() {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Ljava/lang/Class;ZLjava/lang/Class;Ljava/lang/String;)Lclient!u;")
	public Class62 method1486(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method1488(9, 0, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/net/URL;Z)Lclient!u;")
	public Class62 method1487(@OriginalArg(0) URL arg0) {
		return this.method1488(4, 0, arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!u;")
	private Class62 method1488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		@Pc(3) Class62 local3 = new Class62();
		local3.anInt2573 = arg1;
		local3.anInt2571 = arg0;
		local3.anObject3 = arg2;
		synchronized (this) {
			if (this.aClass62_42 == null) {
				this.aClass62_42 = this.aClass62_41 = local3;
			} else {
				this.aClass62_42.aClass62_48 = local3;
				this.aClass62_42 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method1489(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static86.aString7 == null) {
			Static86.aString7 = "~/";
		}
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(72) String[] local72 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static86.aString7, "/tmp/", "" };
		@Pc(80) String local80 = ".file_store_" + arg0;
		for (@Pc(82) int local82 = 0; local82 < local72.length; local82++) {
			try {
				@Pc(87) String local87 = local72[local82];
				@Pc(95) File local95;
				if (local87.length() > 0) {
					local95 = new File(local87);
					if (!local95.exists()) {
						continue;
					}
				}
				local95 = new File(local87 + local80);
				if (local95.exists() || local95.mkdir()) {
					if (arg1.length() > 0) {
						local95 = new File(local95, arg1);
						if (!local95.exists() && !local95.mkdir()) {
							continue;
						}
					}
					this.aString1 = this.aString5 = local95.getParent() + "/";
					this.aString6 = this.aString4 = local95.getPath() + "/";
					return;
				}
			} catch (@Pc(167) Exception local167) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!u;")
	public Class62 method1490(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1488(10, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	public void method1491() {
		synchronized (this) {
			this.aBoolean110 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.anInterface1_2 != null) {
			this.anInterface1_2.method188();
		}
		if (this.aClass60_3 != null) {
			try {
				this.aClass60_3.method1658();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass60_2 != null) {
			try {
				this.aClass60_2.method1658();
			} catch (@Pc(48) IOException local48) {
			}
		}
		if (this.aClass60Array1 == null) {
			return;
		}
		for (@Pc(54) int local54 = 0; local54 < this.aClass60Array1.length; local54++) {
			if (this.aClass60Array1[local54] != null) {
				try {
					this.aClass60Array1[local54].method1658();
				} catch (@Pc(68) IOException local68) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)Lclient!u;")
	public Class62 method1492(@OriginalArg(1) int arg0) {
		return this.method1488(1, arg0, null);
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)Lclient!t;")
	public Interface3 method1493() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)Lclient!cd;")
	public Interface1 method1494() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!ra", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class62 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean110) {
						return;
					}
					if (this.aClass62_41 != null) {
						local15 = this.aClass62_41;
						this.aClass62_41 = this.aClass62_41.aClass62_48;
						if (this.aClass62_41 == null) {
							this.aClass62_42 = null;
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
				@Pc(41) int local41 = local15.anInt2571;
				if (local41 == 1) {
					local15.anObject4 = new Socket(this.anInetAddress1, local15.anInt2573);
				} else if (local41 == 2) {
					@Pc(117) Thread local117 = new Thread((Runnable) local15.anObject3);
					local117.setDaemon(true);
					local117.start();
					local117.setPriority(local15.anInt2573);
					local15.anObject4 = local117;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(71) Object[] local71;
					if (local41 == 9) {
						local71 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local71[0]).getDeclaredMethod((String) local71[1], (Class[]) local71[2]);
					} else if (local41 == 10) {
						local71 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local71[0]).getDeclaredField((String) local71[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2572 = 1;
			} catch (@Pc(144) Exception local144) {
				local15.anInt2572 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!u;")
	public Class62 method1495(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1488(2, arg0, arg1);
	}
}
