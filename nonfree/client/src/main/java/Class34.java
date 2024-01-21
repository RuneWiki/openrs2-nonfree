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

@OriginalClass("client!lc")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!db;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!le;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!ed;")
	private Class18 aClass18_7 = null;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public int anInt1799 = 0;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!ed;")
	private Class18 aClass18_8 = null;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Ljava/lang/String;")
	private String aString6 = null;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!q;")
	public Class48 aClass48_1 = null;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Ljava/lang/String;")
	private String aString4 = null;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!q;")
	public Class48 aClass48_2 = null;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Ljava/lang/String;")
	private String aString8 = null;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lclient!q;")
	public Class48[] aClass48Array1;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class34(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anApplet1 = arg1;
		this.anInetAddress1 = arg2;
		Static58.aString7 = "1.1";
		Static58.aString5 = "Unknown";
		try {
			Static58.aString5 = System.getProperty("java.vendor");
			Static58.aString7 = System.getProperty("java.version");
			Static58.aString3 = System.getProperty("user.home");
			if (Static58.aString3 != null) {
				Static58.aString3 = Static58.aString3 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static58.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static58.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static58.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static58.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method1265(arg3, arg4);
			this.aClass48_2 = new Class48(new File(this.aString4 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass48Array1 = new Class48[arg5];
			for (@Pc(152) int local152 = 0; local152 < arg5; local152++) {
				this.aClass48Array1[local152] = new Class48(new File(this.aString4 + "main_file_cache.idx" + local152), "rw", 1048576L);
			}
			this.aClass48_1 = new Class48(new File(this.aString4 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method1258();
		}
		this.aBoolean100 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public void method1253() {
		synchronized (this) {
			this.aBoolean100 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.anInterface1_2 != null) {
			this.anInterface1_2.method585();
		}
		if (this.aClass48_2 != null) {
			try {
				this.aClass48_2.method1469();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass48_1 != null) {
			try {
				this.aClass48_1.method1469();
			} catch (@Pc(53) IOException local53) {
			}
		}
		if (this.aClass48Array1 == null) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < this.aClass48Array1.length; local59++) {
			if (this.aClass48Array1[local59] != null) {
				try {
					this.aClass48Array1[local59].method1469();
				} catch (@Pc(75) IOException local75) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;B)Lclient!ed;")
	public Class18 method1254(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return this.method1257(0, 9, new Object[] { arg2, arg1, arg0 });
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lclient!le;")
	public Interface3 method1255() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!ed;")
	public Class18 method1256(@OriginalArg(1) URL arg0) {
		return this.method1257(0, 4, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!ed;")
	private Class18 method1257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class18 local3 = new Class18();
		local3.anObject2 = arg2;
		local3.anInt1026 = arg0;
		local3.anInt1027 = arg1;
		synchronized (this) {
			if (this.aClass18_8 == null) {
				this.aClass18_8 = this.aClass18_7 = local3;
			} else {
				this.aClass18_8.aClass18_4 = local3;
				this.aClass18_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	private void method1258() {
		try {
			@Pc(12) File local12 = new File(this.aString6 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(38) DataOutputStream local38 = new DataOutputStream(new FileOutputStream(this.aString6 + "uid.dat"));
				local38.writeInt((int) (Math.random() * 9.9999999E7D));
				local38.close();
			}
		} catch (@Pc(48) Exception local48) {
		}
		try {
			@Pc(70) DataInputStream local70 = new DataInputStream(new FileInputStream(this.aString6 + "uid.dat"));
			this.anInt1799 = local70.readInt() + 1;
			local70.close();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Lclient!db;")
	public Interface1 method1259() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class18 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean100) {
						return;
					}
					if (this.aClass18_7 != null) {
						local15 = this.aClass18_7;
						this.aClass18_7 = this.aClass18_7.aClass18_4;
						if (this.aClass18_7 == null) {
							this.aClass18_8 = null;
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
				@Pc(41) int local41 = local15.anInt1027;
				if (local41 == 1) {
					local15.anObject3 = new Socket(this.anInetAddress1, local15.anInt1026);
				} else if (local41 == 2) {
					@Pc(131) Thread local131 = new Thread((Runnable) local15.anObject2);
					local131.setDaemon(true);
					local131.start();
					local131.setPriority(local15.anInt1026);
					local15.anObject3 = local131;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(83) Object[] local83;
					if (local41 == 9) {
						local83 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local83[0]).getDeclaredMethod((String) local83[1], (Class[]) local83[2]);
					} else if (local41 == 10) {
						local83 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local83[0]).getDeclaredField((String) local83[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1028 = 1;
			} catch (@Pc(148) Exception local148) {
				local15.anInt1028 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Lclient!ed;")
	public Class18 method1260(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method1257(0, 10, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lclient!ed;")
	public Class18 method1261(@OriginalArg(1) int arg0) {
		return this.method1257(arg0, 3, null);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!ed;")
	public Class18 method1262(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method1257(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)Lclient!ed;")
	public Class18 method1263(@OriginalArg(1) int arg0) {
		return this.method1257(arg0, 1, null);
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Lclient!ed;")
	public Class18 method1264() {
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method1265(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		if (Static58.aString3 == null) {
			Static58.aString3 = "~/";
		}
		@Pc(19) String local19 = ".file_store_" + arg0;
		@Pc(78) String[] local78 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static58.aString3, "/tmp/", "" };
		for (@Pc(89) int local89 = 0; local89 < local78.length; local89++) {
			try {
				@Pc(94) String local94 = local78[local89];
				@Pc(102) File local102;
				if (local94.length() > 0) {
					local102 = new File(local94);
					if (!local102.exists()) {
						continue;
					}
				}
				local102 = new File(local94 + local19);
				if (local102.exists() || local102.mkdir()) {
					if (arg1.length() > 0) {
						local102 = new File(local102, arg1);
						if (!local102.exists() && !local102.mkdir()) {
							continue;
						}
					}
					this.aString8 = this.aString6 = local102.getParent() + "/";
					this.aString2 = this.aString4 = local102.getPath() + "/";
					return;
				}
			} catch (@Pc(171) Exception local171) {
			}
		}
		throw new RuntimeException();
	}
}
