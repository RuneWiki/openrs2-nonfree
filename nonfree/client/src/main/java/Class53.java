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

@OriginalClass("client!sb")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!u;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!md;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!gb;")
	private Class20 aClass20_13 = null;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!nb;")
	public Class42 aClass42_2 = null;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Ljava/lang/String;")
	private String aString6 = null;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Ljava/lang/String;")
	private String aString3 = null;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!gb;")
	private Class20 aClass20_14 = null;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Ljava/lang/String;")
	private String aString7 = null;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!nb;")
	public Class42 aClass42_3 = null;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
	public int anInt2654 = 0;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "[Lclient!nb;")
	public Class42[] aClass42Array1;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class53(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		Static94.aString4 = "Unknown";
		this.anApplet1 = arg1;
		this.anInetAddress1 = arg2;
		Static94.aString5 = "1.1";
		try {
			Static94.aString4 = System.getProperty("java.vendor");
			Static94.aString5 = System.getProperty("java.version");
			Static94.aString8 = System.getProperty("user.home");
			if (Static94.aString8 != null) {
				Static94.aString8 = Static94.aString8 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static94.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static94.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static94.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static94.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method1623(arg4, arg3);
			this.aClass42_3 = new Class42(new File(this.aString7 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass42Array1 = new Class42[arg5];
			for (@Pc(152) int local152 = 0; local152 < arg5; local152++) {
				this.aClass42Array1[local152] = new Class42(new File(this.aString7 + "main_file_cache.idx" + local152), "rw", 1048576L);
			}
			this.aClass42_2 = new Class42(new File(this.aString7 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method1626();
		}
		this.aBoolean146 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)Lclient!gb;")
	public Class20 method1622(@OriginalArg(1) int arg0) {
		return this.method1632(3, null, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	private void method1623(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (Static94.aString8 == null) {
			Static94.aString8 = "~/";
		}
		@Pc(62) String[] local62 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static94.aString8, "/tmp/", "" };
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(80) String local80 = ".file_store_" + arg1;
		for (@Pc(90) int local90 = 0; local90 < local62.length; local90++) {
			try {
				@Pc(95) String local95 = local62[local90];
				@Pc(106) File local106;
				if (local95.length() > 0) {
					local106 = new File(local95);
					if (!local106.exists()) {
						continue;
					}
				}
				local106 = new File(local95 + local80);
				if (local106.exists() || local106.mkdir()) {
					if (arg0.length() > 0) {
						local106 = new File(local106, arg0);
						if (!local106.exists() && !local106.mkdir()) {
							continue;
						}
					}
					this.aString3 = this.aString2 = local106.getParent() + "/";
					this.aString6 = this.aString7 = local106.getPath() + "/";
					return;
				}
			} catch (@Pc(178) Exception local178) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)Lclient!u;")
	public Interface3 method1624() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(BI)Lclient!gb;")
	public Class20 method1625(@OriginalArg(1) int arg0) {
		return this.method1632(1, null, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	private void method1626() {
		try {
			@Pc(12) File local12 = new File(this.aString2 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(36) DataOutputStream local36 = new DataOutputStream(new FileOutputStream(this.aString2 + "uid.dat"));
				local36.writeInt((int) (Math.random() * 9.9999999E7D));
				local36.close();
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			@Pc(66) DataInputStream local66 = new DataInputStream(new FileInputStream(this.aString2 + "uid.dat"));
			this.anInt2654 = local66.readInt() + 1;
			local66.close();
		} catch (@Pc(76) Exception local76) {
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Lclient!md;")
	public Interface2 method1627() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!sb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class20 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean146) {
						return;
					}
					if (this.aClass20_13 != null) {
						local15 = this.aClass20_13;
						this.aClass20_13 = this.aClass20_13.aClass20_6;
						if (this.aClass20_13 == null) {
							this.aClass20_14 = null;
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
				@Pc(41) int local41 = local15.anInt1157;
				if (local41 == 1) {
					local15.anObject4 = new Socket(this.anInetAddress1, local15.anInt1158);
				} else if (local41 == 2) {
					@Pc(131) Thread local131 = new Thread((Runnable) local15.anObject3);
					local131.setDaemon(true);
					local131.start();
					local131.setPriority(local15.anInt1158);
					local15.anObject4 = local131;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local41 == 9) {
						local92 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local41 == 10) {
						local92 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1156 = 1;
			} catch (@Pc(148) Exception local148) {
				local15.anInt1156 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!gb;")
	public Class20 method1628(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1632(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!gb;")
	public Class20 method1629(@OriginalArg(0) URL arg0) {
		return this.method1632(4, arg0, 0);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public void method1630() {
		synchronized (this) {
			this.aBoolean146 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.anInterface3_2 != null) {
			this.anInterface3_2.method1713();
		}
		if (this.aClass42_3 != null) {
			try {
				this.aClass42_3.method1216();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass42_2 != null) {
			try {
				this.aClass42_2.method1216();
			} catch (@Pc(53) IOException local53) {
			}
		}
		if (this.aClass42Array1 == null) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < this.aClass42Array1.length; local59++) {
			if (this.aClass42Array1[local59] != null) {
				try {
					this.aClass42Array1[local59].method1216();
				} catch (@Pc(75) IOException local75) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;[Ljava/lang/Class;)Lclient!gb;")
	public Class20 method1631(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method1632(9, new Object[] { arg0, arg1, arg2 }, 0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZILjava/lang/Object;I)Lclient!gb;")
	private Class20 method1632(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(9) Class20 local9 = new Class20();
		local9.anObject3 = arg1;
		local9.anInt1157 = arg0;
		local9.anInt1158 = arg2;
		synchronized (this) {
			if (this.aClass20_14 == null) {
				this.aClass20_14 = this.aClass20_13 = local9;
			} else {
				this.aClass20_14.aClass20_6 = local9;
				this.aClass20_14 = local9;
			}
			this.notify();
			return local9;
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)Lclient!gb;")
	public Class20 method1633() {
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!gb;")
	public Class20 method1634(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1632(10, new Object[] { arg1, arg0 }, 0);
	}
}
