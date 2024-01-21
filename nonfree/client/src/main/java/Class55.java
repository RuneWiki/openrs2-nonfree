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

@OriginalClass("client!s")
public final class Class55 implements Runnable {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!ia;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!vc;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Ljava/lang/String;")
	private String aString8 = null;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!qc;")
	public Class52 aClass52_3 = null;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!fa;")
	private Class19 aClass19_7 = null;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!qc;")
	public Class52 aClass52_2 = null;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!fa;")
	private Class19 aClass19_6 = null;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	public int anInt2309 = 0;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "Ljava/lang/String;")
	private String aString7 = null;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "[Lclient!qc;")
	public Class52[] aClass52Array1;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class55(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		Static86.aString3 = "Unknown";
		this.anApplet1 = arg1;
		this.anInetAddress1 = arg2;
		Static86.aString4 = "1.1";
		try {
			Static86.aString3 = System.getProperty("java.vendor");
			Static86.aString4 = System.getProperty("java.version");
			Static86.aString6 = System.getProperty("user.home");
			if (Static86.aString6 != null) {
				Static86.aString6 = Static86.aString6 + "/";
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
		if (arg0) {
			this.method1401(arg4, arg3);
			this.aClass52_3 = new Class52(new File(this.aString7 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass52Array1 = new Class52[arg5];
			for (@Pc(125) int local125 = 0; local125 < arg5; local125++) {
				this.aClass52Array1[local125] = new Class52(new File(this.aString7 + "main_file_cache.idx" + local125), "rw", 1048576L);
			}
			this.aClass52_2 = new Class52(new File(this.aString7 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method1405();
		}
		this.aBoolean103 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLjava/net/URL;)Lclient!fa;")
	public Class19 method1395(@OriginalArg(1) URL arg0) {
		return this.method1400(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Lclient!vc;")
	public Interface4 method1396() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!fa;")
	public Class19 method1397(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method1400(new Object[] { arg1, arg0 }, 10, 0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!fa;")
	public Class19 method1398(@OriginalArg(1) int arg0) {
		return this.method1400(null, 3, arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;B)Lclient!fa;")
	public Class19 method1399(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return this.method1400(new Object[] { arg2, arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!fa;")
	private Class19 method1400(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(8) Class19 local8 = new Class19();
		local8.anObject1 = arg0;
		local8.anInt881 = arg2;
		local8.anInt880 = arg1;
		synchronized (this) {
			if (this.aClass19_6 == null) {
				this.aClass19_6 = this.aClass19_7 = local8;
			} else {
				this.aClass19_6.aClass19_3 = local8;
				this.aClass19_6 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method1401(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		if (Static86.aString6 == null) {
			Static86.aString6 = "~/";
		}
		@Pc(74) String[] local74 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static86.aString6, "/tmp/", "" };
		@Pc(82) String local82 = ".file_store_" + arg1;
		for (@Pc(92) int local92 = 0; local92 < local74.length; local92++) {
			try {
				@Pc(97) String local97 = local74[local92];
				@Pc(105) File local105;
				if (local97.length() > 0) {
					local105 = new File(local97);
					if (!local105.exists()) {
						continue;
					}
				}
				local105 = new File(local97 + local82);
				if (local105.exists() || local105.mkdir()) {
					if (arg0.length() > 0) {
						local105 = new File(local105, arg0);
						if (!local105.exists() && !local105.mkdir()) {
							continue;
						}
					}
					this.aString8 = this.aString2 = local105.getParent() + "/";
					this.aString5 = this.aString7 = local105.getPath() + "/";
					return;
				}
			} catch (@Pc(174) Exception local174) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public void method1402() {
		synchronized (this) {
			this.aBoolean103 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.anInterface4_1 != null) {
			this.anInterface4_1.method1627();
		}
		if (this.aClass52_3 != null) {
			try {
				this.aClass52_3.method1263();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass52_2 != null) {
			try {
				this.aClass52_2.method1263();
			} catch (@Pc(51) IOException local51) {
			}
		}
		if (this.aClass52Array1 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.aClass52Array1.length; local57++) {
			if (this.aClass52Array1[local57] != null) {
				try {
					this.aClass52Array1[local57].method1263();
				} catch (@Pc(71) IOException local71) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)Lclient!fa;")
	public Class19 method1403() {
		return null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!fa;")
	public Class19 method1404(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1400(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	private void method1405() {
		try {
			@Pc(12) File local12 = new File(this.aString2 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(38) DataOutputStream local38 = new DataOutputStream(new FileOutputStream(this.aString2 + "uid.dat"));
				local38.writeInt((int) (Math.random() * 9.9999999E7D));
				local38.close();
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			@Pc(71) DataInputStream local71 = new DataInputStream(new FileInputStream(this.aString2 + "uid.dat"));
			this.anInt2309 = local71.readInt() + 1;
			local71.close();
		} catch (@Pc(81) Exception local81) {
		}
	}

	@OriginalMember(owner = "client!s", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class19 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean103) {
						return;
					}
					if (this.aClass19_7 != null) {
						local15 = this.aClass19_7;
						this.aClass19_7 = this.aClass19_7.aClass19_3;
						if (this.aClass19_7 == null) {
							this.aClass19_6 = null;
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
				@Pc(41) int local41 = local15.anInt880;
				if (local41 == 1) {
					local15.anObject2 = new Socket(this.anInetAddress1, local15.anInt881);
				} else if (local41 == 2) {
					@Pc(66) Thread local66 = new Thread((Runnable) local15.anObject1);
					local66.setDaemon(true);
					local66.start();
					local66.setPriority(local15.anInt881);
					local15.anObject2 = local66;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(99) Object[] local99;
					if (local41 == 9) {
						local99 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local99[0]).getDeclaredMethod((String) local99[1], (Class[]) local99[2]);
					} else if (local41 == 10) {
						local99 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local99[0]).getDeclaredField((String) local99[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt879 = 1;
			} catch (@Pc(144) Exception local144) {
				local15.anInt879 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lclient!ia;")
	public Interface2 method1406() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)Lclient!fa;")
	public Class19 method1407(@OriginalArg(0) int arg0) {
		return this.method1400(null, 1, arg0);
	}
}
