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

@OriginalClass("client!bb")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public static final int anInt248 = 3;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!id;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!c;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public int anInt249 = 0;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!qd;")
	private Class48 aClass48_1 = null;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Lclient!qd;")
	private Class48 aClass48_2 = null;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Ljava/lang/String;")
	private String aString3 = null;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Lclient!dc;")
	public Class16 aClass16_2 = null;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Lclient!dc;")
	public Class16 aClass16_3 = null;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Lclient!dc;")
	public Class16 aClass16_1 = null;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Ljava/lang/String;")
	private String aString6 = null;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "[Lclient!dc;")
	public Class16[] aClass16Array1;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "[Lclient!dc;")
	public Class16[] aClass16Array2;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!qd;", line = 3)
	public Class48 method197() {
		return null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!c;", line = 22)
	public Interface1 method198() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)Lclient!qd;", line = 31)
	public Class48 method199(@OriginalArg(1) int arg0) {
		return this.method200(arg0, 3, null);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBILjava/lang/Object;I)Lclient!qd;", line = 54)
	private Class48 method200(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		@Pc(3) Class48 local3 = new Class48();
		local3.anInt1926 = arg0;
		local3.anInt1927 = arg1;
		local3.anObject3 = arg2;
		synchronized (this) {
			if (this.aClass48_2 == null) {
				this.aClass48_2 = this.aClass48_1 = local3;
			} else {
				this.aClass48_2.aClass48_8 = local3;
				this.aClass48_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;I)Lclient!qd;", line = 93)
	public Class48 method201(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2) {
		return this.method200(0, 9, new Object[] { arg0, arg1, arg2 });
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Lclient!qd;", line = 113)
	public Class48 method202(@OriginalArg(1) int arg0) {
		return this.method200(arg0, 1, null);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 123)
	public void method203() {
		synchronized (this) {
			this.aBoolean24 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.anInterface3_1 != null) {
			this.anInterface3_1.method795();
		}
		if (this.aClass16_1 != null) {
			try {
				this.aClass16_1.method362();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass16_3 != null) {
			try {
				this.aClass16_3.method362();
			} catch (@Pc(50) IOException local50) {
			}
		}
		@Pc(56) int local56;
		if (this.aClass16Array2 != null) {
			for (local56 = 0; local56 < this.aClass16Array2.length; local56++) {
				if (this.aClass16Array2[local56] != null) {
					try {
						this.aClass16Array2[local56].method362();
					} catch (@Pc(70) IOException local70) {
					}
				}
			}
		}
		if (this.aClass16_2 != null) {
			try {
				this.aClass16_2.method362();
			} catch (@Pc(90) IOException local90) {
			}
		}
		if (this.aClass16Array1 == null) {
			return;
		}
		for (local56 = 0; local56 < this.aClass16Array1.length; local56++) {
			if (this.aClass16Array1[local56] != null) {
				try {
					this.aClass16Array1[local56].method362();
				} catch (@Pc(112) IOException local112) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!qd;", line = 212)
	public Class48 method204(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method200(0, 10, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Lclient!id;", line = 221)
	public Interface3 method205() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 231)
	private void method206(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(70) String[] local70 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		@Pc(78) String local78 = ".file_store_" + arg0;
		for (@Pc(80) int local80 = 0; local80 < local70.length; local80++) {
			try {
				@Pc(85) String local85 = local70[local80];
				@Pc(93) File local93;
				if (local85.length() > 0) {
					local93 = new File(local85);
					if (!local93.exists()) {
						continue;
					}
				}
				local93 = new File(local85 + local78);
				if (local93.exists() || local93.mkdir()) {
					if (arg1.length() > 0) {
						local93 = new File(local93, arg1);
						if (!local93.exists() && !local93.mkdir()) {
							continue;
						}
					}
					this.aString6 = this.aString5 = local93.getParent() + "/";
					this.aString2 = this.aString3 = local93.getPath() + "/";
					return;
				}
			} catch (@Pc(162) Exception local162) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!bb", name = "run", descriptor = "()V", line = 298)
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class48 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean24) {
						return;
					}
					if (this.aClass48_1 != null) {
						local15 = this.aClass48_1;
						this.aClass48_1 = this.aClass48_1.aClass48_8;
						if (this.aClass48_1 == null) {
							this.aClass48_2 = null;
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
				@Pc(41) int local41 = local15.anInt1927;
				if (local41 == 1) {
					local15.anObject4 = new Socket(this.anInetAddress1, local15.anInt1926);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject3);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1926);
					local15.anObject4 = local56;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(100) Object[] local100;
					if (local41 == 9) {
						local100 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local100[0]).getDeclaredMethod((String) local100[1], (Class[]) local100[2]);
					} else if (local41 == 10) {
						local100 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local100[0]).getDeclaredField((String) local100[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1928 = 1;
			} catch (@Pc(146) Exception local146) {
				local15.anInt1928 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!qd;", line = 396)
	public Class48 method207(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method200(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 409)
	private void method208() {
		try {
			@Pc(12) File local12 = new File(this.aString5 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(38) DataOutputStream local38 = new DataOutputStream(new FileOutputStream(this.aString5 + "uid.dat"));
				local38.writeInt((int) (Math.random() * 9.9999999E7D));
				local38.close();
			}
		} catch (@Pc(48) Exception local48) {
		}
		try {
			@Pc(64) DataInputStream local64 = new DataInputStream(new FileInputStream(this.aString5 + "uid.dat"));
			this.anInt249 = local64.readInt() + 1;
			local64.close();
		} catch (@Pc(74) Exception local74) {
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLjava/net/URL;)Lclient!qd;", line = 458)
	public Class48 method209(@OriginalArg(1) URL arg0) {
		return this.method200(0, 4, arg0);
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 476)
	public Class7(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anInetAddress1 = arg2;
		Static8.aString4 = "Unknown";
		this.anApplet1 = arg1;
		Static8.aString1 = "1.1";
		try {
			Static8.aString4 = System.getProperty("java.vendor");
			Static8.aString1 = System.getProperty("java.version");
		} catch (@Pc(55) Exception local55) {
		}
		try {
			if (arg1 == null) {
				Static8.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static8.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(82) Exception local82) {
		}
		if (arg0) {
			this.method206(arg3, arg4);
			@Pc(102) File local102 = new File(this.aString5 + "main_file_cache.dat");
			if (local102.exists()) {
				this.aClass16_2 = new Class16(local102, "rw", 52428800L);
			}
			this.aClass16Array1 = new Class16[5];
			for (@Pc(119) int local119 = 0; local119 < 5; local119++) {
				@Pc(135) File local135 = new File(this.aString5 + "main_file_cache.idx" + local119);
				if (local135.exists()) {
					this.aClass16Array1[local119] = new Class16(local135, "rw", 1048576L);
				}
			}
			this.aClass16_1 = new Class16(new File(this.aString3 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass16Array2 = new Class16[arg5];
			for (@Pc(177) int local177 = 0; local177 < arg5; local177++) {
				this.aClass16Array2[local177] = new Class16(new File(this.aString3 + "main_file_cache.idx" + local177), "rw", 1048576L);
			}
			this.aClass16_3 = new Class16(new File(this.aString3 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method208();
		}
		this.aBoolean24 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}
}
