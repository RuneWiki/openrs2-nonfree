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

@OriginalClass("client!jb")
public final class Class32 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!rd;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!qc;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!tb;")
	public Class59 aClass59_1 = null;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!tb;")
	public Class59 aClass59_2 = null;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Ljava/lang/String;")
	private String aString4 = null;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!va;")
	private Class64 aClass64_3 = null;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!va;")
	private Class64 aClass64_4 = null;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Ljava/lang/String;")
	private String aString3 = null;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public int anInt1279 = 0;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Ljava/lang/String;")
	private String aString8 = null;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "[Lclient!tb;")
	public Class59[] aClass59Array1;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class32(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		Static49.aString6 = "1.1";
		this.anApplet1 = arg1;
		this.anInetAddress1 = arg2;
		Static49.aString2 = "Unknown";
		try {
			Static49.aString2 = System.getProperty("java.vendor");
			Static49.aString6 = System.getProperty("java.version");
			Static49.aString7 = System.getProperty("user.home");
			if (Static49.aString7 != null) {
				Static49.aString7 = Static49.aString7 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static49.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static49.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		if (arg0) {
			this.method949(arg3, arg4);
			this.aClass59_2 = new Class59(new File(this.aString3 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass59Array1 = new Class59[arg5];
			for (@Pc(125) int local125 = 0; local125 < arg5; local125++) {
				this.aClass59Array1[local125] = new Class59(new File(this.aString3 + "main_file_cache.idx" + local125), "rw", 1048576L);
			}
			this.aClass59_1 = new Class59(new File(this.aString3 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method947();
		}
		this.aBoolean59 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!va;")
	public Class64 method942(@OriginalArg(0) int arg0) {
		return this.method950(3, null, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Lclient!rd;")
	public Interface3 method943() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!va;")
	public Class64 method944(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method950(10, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;B)Lclient!va;")
	public Class64 method945(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2) {
		return this.method950(9, new Object[] { arg0, arg1, arg2 }, 0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Lclient!qc;")
	public Interface2 method946() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class64 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean59) {
						return;
					}
					if (this.aClass64_3 != null) {
						local15 = this.aClass64_3;
						this.aClass64_3 = this.aClass64_3.aClass64_8;
						if (this.aClass64_3 == null) {
							this.aClass64_4 = null;
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
				@Pc(41) int local41 = local15.anInt2676;
				if (local41 == 1) {
					local15.anObject6 = new Socket(this.anInetAddress1, local15.anInt2677);
				} else if (local41 == 2) {
					@Pc(125) Thread local125 = new Thread((Runnable) local15.anObject5);
					local125.setDaemon(true);
					local125.start();
					local125.setPriority(local15.anInt2677);
					local15.anObject6 = local125;
				} else if (local41 == 4) {
					local15.anObject6 = new DataInputStream(((URL) local15.anObject5).openStream());
				} else {
					@Pc(69) Object[] local69;
					if (local41 == 9) {
						local69 = (Object[]) local15.anObject5;
						local15.anObject6 = ((Class) local69[0]).getDeclaredMethod((String) local69[1], (Class[]) local69[2]);
					} else if (local41 == 10) {
						local69 = (Object[]) local15.anObject5;
						local15.anObject6 = ((Class) local69[0]).getDeclaredField((String) local69[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2678 = 1;
			} catch (@Pc(142) Exception local142) {
				local15.anInt2678 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	private void method947() {
		try {
			@Pc(12) File local12 = new File(this.aString5 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(45) DataOutputStream local45 = new DataOutputStream(new FileOutputStream(this.aString5 + "uid.dat"));
				local45.writeInt((int) (Math.random() * 9.9999999E7D));
				local45.close();
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			@Pc(71) DataInputStream local71 = new DataInputStream(new FileInputStream(this.aString5 + "uid.dat"));
			this.anInt1279 = local71.readInt() + 1;
			local71.close();
		} catch (@Pc(81) Exception local81) {
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method948() {
		synchronized (this) {
			this.aBoolean59 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.anInterface3_2 != null) {
			this.anInterface3_2.method1720();
		}
		if (this.aClass59_2 != null) {
			try {
				this.aClass59_2.method1757();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass59_1 != null) {
			try {
				this.aClass59_1.method1757();
			} catch (@Pc(52) IOException local52) {
			}
		}
		if (this.aClass59Array1 == null) {
			return;
		}
		for (@Pc(58) int local58 = 0; local58 < this.aClass59Array1.length; local58++) {
			if (this.aClass59Array1[local58] != null) {
				try {
					this.aClass59Array1[local58].method1757();
				} catch (@Pc(72) IOException local72) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method949(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static49.aString7 == null) {
			Static49.aString7 = "~/";
		}
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(72) String[] local72 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static49.aString7, "/tmp/", "" };
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
					this.aString8 = this.aString5 = local95.getParent() + "/";
					this.aString4 = this.aString3 = local95.getPath() + "/";
					return;
				}
			} catch (@Pc(167) Exception local167) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!va;")
	private Class64 method950(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(8) Class64 local8 = new Class64();
		local8.anInt2677 = arg2;
		local8.anObject5 = arg1;
		local8.anInt2676 = arg0;
		synchronized (this) {
			if (this.aClass64_4 == null) {
				this.aClass64_4 = this.aClass64_3 = local8;
			} else {
				this.aClass64_4.aClass64_8 = local8;
				this.aClass64_4 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Lclient!va;")
	public Class64 method951(@OriginalArg(0) int arg0) {
		return this.method950(1, null, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!va;")
	public Class64 method952(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method950(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!va;")
	public Class64 method953(@OriginalArg(0) URL arg0) {
		return this.method950(4, arg0, 0);
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Lclient!va;")
	public Class64 method954() {
		return null;
	}
}
