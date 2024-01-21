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

@OriginalClass("client!qd")
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!fa;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Lclient!r;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public int anInt2323 = 0;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!ua;")
	private Class59 aClass59_7 = null;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!qb;")
	public Class49 aClass49_1 = null;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!qb;")
	public Class49 aClass49_2 = null;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!ua;")
	private Class59 aClass59_6 = null;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Ljava/lang/String;")
	private String aString6 = null;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet2 = null;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Ljava/lang/String;")
	private String aString4 = null;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "[Lclient!qb;")
	public Class49[] aClass49Array2;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "[Lclient!qb;")
	public Class49[] aClass49Array1;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class51(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anInetAddress1 = arg2;
		Static84.aString1 = "1.1";
		Static84.aString3 = "Unknown";
		this.anApplet2 = arg1;
		try {
			Static84.aString3 = System.getProperty("java.vendor");
			Static84.aString1 = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		try {
			if (arg1 == null) {
				Static84.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static84.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (arg0) {
			this.method1473(arg3, arg4);
			@Pc(99) File local99 = new File(this.aString2 + "main_file_cache.dat");
			if (local99.exists()) {
				this.aClass49_1 = new Class49(local99, "rw", 52428800L);
			}
			this.aClass49Array2 = new Class49[5];
			for (@Pc(116) int local116 = 0; local116 < 5; local116++) {
				@Pc(132) File local132 = new File(this.aString2 + "main_file_cache.idx" + local116);
				if (local132.exists()) {
					this.aClass49Array2[local116] = new Class49(local132, "rw", 1048576L);
				}
			}
			this.aClass49_2 = new Class49(new File(this.aString6 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass49Array1 = new Class49[arg5];
			for (@Pc(174) int local174 = 0; local174 < arg5; local174++) {
				this.aClass49Array1[local174] = new Class49(new File(this.aString6 + "main_file_cache.idx" + local174), "rw", 1048576L);
			}
			this.method1465();
		}
		this.aBoolean121 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lclient!fa;")
	public Interface2 method1463() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ua;")
	public Class59 method1464(@OriginalArg(1) URL arg0) {
		return this.method1466(arg0, 0, 4);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	private void method1465() {
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
			@Pc(62) DataInputStream local62 = new DataInputStream(new FileInputStream(this.aString2 + "uid.dat"));
			this.anInt2323 = local62.readInt() + 1;
			local62.close();
		} catch (@Pc(76) Exception local76) {
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!ua;")
	private Class59 method1466(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class59 local3 = new Class59();
		local3.anObject6 = arg0;
		local3.anInt2607 = arg2;
		local3.anInt2609 = arg1;
		synchronized (this) {
			if (this.aClass59_7 == null) {
				this.aClass59_7 = this.aClass59_6 = local3;
			} else {
				this.aClass59_7.aClass59_8 = local3;
				this.aClass59_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ua;")
	public Class59 method1467(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method1466(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!ua;")
	public Class59 method1468(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1466(new Object[] { arg1, arg0 }, 0, 10);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)Lclient!ua;")
	public Class59 method1469() {
		return null;
	}

	@OriginalMember(owner = "client!qd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class59 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean121) {
						return;
					}
					if (this.aClass59_6 != null) {
						local15 = this.aClass59_6;
						this.aClass59_6 = this.aClass59_6.aClass59_8;
						if (this.aClass59_6 == null) {
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
				@Pc(41) int local41 = local15.anInt2607;
				if (local41 == 1) {
					local15.anObject5 = new Socket(this.anInetAddress1, local15.anInt2609);
				} else if (local41 == 2) {
					@Pc(129) Thread local129 = new Thread((Runnable) local15.anObject6);
					local129.setDaemon(true);
					local129.start();
					local129.setPriority(local15.anInt2609);
					local15.anObject5 = local129;
				} else if (local41 == 4) {
					local15.anObject5 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(76) Object[] local76;
					if (local41 == 9) {
						local76 = (Object[]) local15.anObject6;
						local15.anObject5 = ((Class) local76[0]).getDeclaredMethod((String) local76[1], (Class[]) local76[2]);
					} else if (local41 == 10) {
						local76 = (Object[]) local15.anObject6;
						local15.anObject5 = ((Class) local76[0]).getDeclaredField((String) local76[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2608 = 1;
			} catch (@Pc(146) Exception local146) {
				local15.anInt2608 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Lclient!ua;")
	public Class59 method1470(@OriginalArg(1) int arg0) {
		return this.method1466(null, arg0, 3);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Lclient!ua;")
	public Class59 method1471(@OriginalArg(0) int arg0) {
		return this.method1466(null, arg0, 1);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public void method1472() {
		synchronized (this) {
			this.aBoolean121 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.anInterface2_2 != null) {
			this.anInterface2_2.method748();
		}
		if (this.aClass49_2 != null) {
			try {
				this.aClass49_2.method1451();
			} catch (@Pc(35) IOException local35) {
			}
		}
		@Pc(45) int local45;
		if (this.aClass49Array1 != null) {
			for (local45 = 0; local45 < this.aClass49Array1.length; local45++) {
				if (this.aClass49Array1[local45] != null) {
					try {
						this.aClass49Array1[local45].method1451();
					} catch (@Pc(59) IOException local59) {
					}
				}
			}
		}
		if (this.aClass49_1 != null) {
			try {
				this.aClass49_1.method1451();
			} catch (@Pc(79) IOException local79) {
			}
		}
		if (this.aClass49Array2 == null) {
			return;
		}
		for (local45 = 0; local45 < this.aClass49Array2.length; local45++) {
			if (this.aClass49Array2[local45] != null) {
				try {
					this.aClass49Array2[local45].method1451();
				} catch (@Pc(99) IOException local99) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZLjava/lang/String;)V")
	private void method1473(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(73) String[] local73 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		@Pc(81) String local81 = ".file_store_" + arg0;
		for (@Pc(83) int local83 = 0; local83 < local73.length; local83++) {
			try {
				@Pc(88) String local88 = local73[local83];
				@Pc(96) File local96;
				if (local88.length() > 0) {
					local96 = new File(local88);
					if (!local96.exists()) {
						continue;
					}
				}
				local96 = new File(local88 + local81);
				if (local96.exists() || local96.mkdir()) {
					if (arg1.length() > 0) {
						local96 = new File(local96, arg1);
						if (!local96.exists() && !local96.mkdir()) {
							continue;
						}
					}
					this.aString5 = this.aString2 = local96.getParent() + "/";
					this.aString4 = this.aString6 = local96.getPath() + "/";
					return;
				}
			} catch (@Pc(168) Exception local168) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Lclient!r;")
	public Interface3 method1474() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Class;Ljava/lang/Class;)Lclient!ua;")
	public Class59 method1475(@OriginalArg(0) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method1466(new Object[] { arg2, arg0, arg1 }, 0, 9);
	}
}
