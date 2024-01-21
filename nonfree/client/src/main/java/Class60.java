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

@OriginalClass("client!vb")
public final class Class60 implements Runnable {

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Lclient!ma;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!bb;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	public int anInt2662 = 0;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!k;")
	public Class36 aClass36_2 = null;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Ljava/lang/String;")
	private String aString4 = null;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Lclient!ud;")
	private Class59 aClass59_7 = null;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Ljava/lang/String;")
	private String aString7 = null;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Ljava/lang/String;")
	private String aString8 = null;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Lclient!ud;")
	private Class59 aClass59_8 = null;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!k;")
	public Class36 aClass36_3 = null;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[Lclient!k;")
	public Class36[] aClass36Array1;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class60(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anInetAddress1 = arg2;
		this.anApplet1 = arg1;
		Static102.aString3 = "Unknown";
		Static102.aString6 = "1.1";
		try {
			Static102.aString3 = System.getProperty("java.vendor");
			Static102.aString6 = System.getProperty("java.version");
			Static102.aString5 = System.getProperty("user.home");
			if (Static102.aString5 != null) {
				Static102.aString5 = Static102.aString5 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static102.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static102.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		if (arg0) {
			this.method1803(arg3, arg4);
			this.aClass36_2 = new Class36(new File(this.aString2 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass36Array1 = new Class36[arg5];
			for (@Pc(125) int local125 = 0; local125 < arg5; local125++) {
				this.aClass36Array1[local125] = new Class36(new File(this.aString2 + "main_file_cache.idx" + local125), "rw", 1048576L);
			}
			this.aClass36_3 = new Class36(new File(this.aString2 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method1812();
		}
		this.aBoolean146 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ud;")
	public Class59 method1802(@OriginalArg(1) URL arg0) {
		return this.method1810(4, arg0, 0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method1803(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		if (Static102.aString5 == null) {
			Static102.aString5 = "~/";
		}
		@Pc(19) String local19 = ".file_store_" + arg0;
		@Pc(78) String[] local78 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static102.aString5, "/tmp/", "" };
		for (@Pc(80) int local80 = 0; local80 < local78.length; local80++) {
			try {
				@Pc(85) String local85 = local78[local80];
				@Pc(96) File local96;
				if (local85.length() > 0) {
					local96 = new File(local85);
					if (!local96.exists()) {
						continue;
					}
				}
				local96 = new File(local85 + local19);
				if (local96.exists() || local96.mkdir()) {
					if (arg1.length() > 0) {
						local96 = new File(local96, arg1);
						if (!local96.exists() && !local96.mkdir()) {
							continue;
						}
					}
					this.aString8 = this.aString7 = local96.getParent() + "/";
					this.aString4 = this.aString2 = local96.getPath() + "/";
					return;
				}
			} catch (@Pc(168) Exception local168) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)Lclient!ud;")
	public Class59 method1804(@OriginalArg(0) int arg0) {
		return this.method1810(1, null, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lclient!ud;")
	public Class59 method1805(@OriginalArg(1) int arg0) {
		return this.method1810(3, null, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lclient!ud;")
	public Class59 method1806() {
		return null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ud;")
	public Class59 method1807(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1810(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class59 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean146) {
						return;
					}
					if (this.aClass59_8 != null) {
						local15 = this.aClass59_8;
						this.aClass59_8 = this.aClass59_8.aClass59_6;
						if (this.aClass59_8 == null) {
							this.aClass59_7 = null;
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
				@Pc(41) int local41 = local15.anInt2521;
				if (local41 == 1) {
					local15.anObject3 = new Socket(this.anInetAddress1, local15.anInt2520);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject4);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt2520);
					local15.anObject3 = local56;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(91) Object[] local91;
					if (local41 == 9) {
						local91 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local91[0]).getDeclaredMethod((String) local91[1], (Class[]) local91[2]);
					} else if (local41 == 10) {
						local91 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local91[0]).getDeclaredField((String) local91[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2522 = 1;
			} catch (@Pc(146) Exception local146) {
				local15.anInt2522 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public void method1808() {
		synchronized (this) {
			this.aBoolean146 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.anInterface1_2 != null) {
			this.anInterface1_2.method129();
		}
		if (this.aClass36_2 != null) {
			try {
				this.aClass36_2.method887();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass36_3 != null) {
			try {
				this.aClass36_3.method887();
			} catch (@Pc(50) IOException local50) {
			}
		}
		if (this.aClass36Array1 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.aClass36Array1.length; local56++) {
			if (this.aClass36Array1[local56] != null) {
				try {
					this.aClass36Array1[local56].method887();
				} catch (@Pc(70) IOException local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Lclient!ma;")
	public Interface3 method1809() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lclient!ud;")
	private Class59 method1810(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class59 local11 = new Class59();
		local11.anInt2521 = arg0;
		local11.anInt2520 = arg2;
		local11.anObject4 = arg1;
		synchronized (this) {
			if (this.aClass59_7 == null) {
				this.aClass59_7 = this.aClass59_8 = local11;
			} else {
				this.aClass59_7.aClass59_6 = local11;
				this.aClass59_7 = local11;
			}
			this.notify();
			return local11;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lclient!ud;")
	public Class59 method1811(@OriginalArg(0) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method1810(9, new Object[] { arg1, arg2, arg0 }, 0);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	private void method1812() {
		try {
			@Pc(12) File local12 = new File(this.aString7 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(36) DataOutputStream local36 = new DataOutputStream(new FileOutputStream(this.aString7 + "uid.dat"));
				local36.writeInt((int) (Math.random() * 9.9999999E7D));
				local36.close();
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			@Pc(62) DataInputStream local62 = new DataInputStream(new FileInputStream(this.aString7 + "uid.dat"));
			this.anInt2662 = local62.readInt() + 1;
			local62.close();
		} catch (@Pc(82) Exception local82) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)Lclient!bb;")
	public Interface1 method1813() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!ud;")
	public Class59 method1814(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method1810(10, new Object[] { arg0, arg1 }, 0);
	}
}
