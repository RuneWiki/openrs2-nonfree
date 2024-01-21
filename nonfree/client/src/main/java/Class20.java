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

@OriginalClass("client!fb")
public final class Class20 implements Runnable {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!ld;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!ac;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!gd;")
	private Class25 aClass25_3 = null;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!gd;")
	private Class25 aClass25_4 = null;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	public int anInt1124 = 0;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!id;")
	public Class29 aClass29_2 = null;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!id;")
	public Class29 aClass29_1 = null;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Ljava/lang/String;")
	private String aString6 = null;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Ljava/lang/String;")
	private String aString7 = null;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "[Lclient!id;")
	public Class29[] aClass29Array1;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class20(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anApplet1 = arg1;
		this.anInetAddress1 = arg2;
		Static25.aString1 = "1.1";
		Static25.aString4 = "Unknown";
		try {
			Static25.aString4 = System.getProperty("java.vendor");
			Static25.aString1 = System.getProperty("java.version");
			Static25.aString3 = System.getProperty("user.home");
			if (Static25.aString3 != null) {
				Static25.aString3 = Static25.aString3 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static25.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static25.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static25.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static25.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method718(arg4, arg3);
			this.aClass29_1 = new Class29(new File(this.aString2 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass29Array1 = new Class29[arg5];
			for (@Pc(152) int local152 = 0; local152 < arg5; local152++) {
				this.aClass29Array1[local152] = new Class29(new File(this.aString2 + "main_file_cache.idx" + local152), "rw", 1048576L);
			}
			this.aClass29_2 = new Class29(new File(this.aString2 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method726();
		}
		this.aBoolean47 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!gd;")
	private Class25 method717(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class25 local3 = new Class25();
		local3.anInt1211 = arg1;
		local3.anInt1213 = arg2;
		local3.anObject2 = arg0;
		synchronized (this) {
			if (this.aClass25_3 == null) {
				this.aClass25_3 = this.aClass25_4 = local3;
			} else {
				this.aClass25_3.aClass25_5 = local3;
				this.aClass25_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	private void method718(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (Static25.aString3 == null) {
			Static25.aString3 = "~/";
		}
		@Pc(62) String[] local62 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static25.aString3, "/tmp/", "" };
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(82) String local82 = ".file_store_" + arg1;
		for (@Pc(89) int local89 = 0; local89 < local62.length; local89++) {
			try {
				@Pc(94) String local94 = local62[local89];
				@Pc(102) File local102;
				if (local94.length() > 0) {
					local102 = new File(local94);
					if (!local102.exists()) {
						continue;
					}
				}
				local102 = new File(local94 + local82);
				if (local102.exists() || local102.mkdir()) {
					if (arg0.length() > 0) {
						local102 = new File(local102, arg0);
						if (!local102.exists() && !local102.mkdir()) {
							continue;
						}
					}
					this.aString7 = this.aString5 = local102.getParent() + "/";
					this.aString6 = this.aString2 = local102.getPath() + "/";
					return;
				}
			} catch (@Pc(171) Exception local171) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lclient!gd;")
	public Class25 method719(@OriginalArg(0) int arg0) {
		return this.method717(null, 1, arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Lclient!gd;")
	public Class25 method720() {
		return null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lclient!ld;")
	public Interface3 method721() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lclient!gd;")
	public Class25 method722(@OriginalArg(1) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method717(new Object[] { arg0, arg2, arg1 }, 9, 0);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lclient!gd;")
	public Class25 method723(@OriginalArg(1) int arg0) {
		return this.method717(null, 3, arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!gd;")
	public Class25 method724(@OriginalArg(0) URL arg0) {
		return this.method717(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!gd;")
	public Class25 method725(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method717(new Object[] { arg0, arg1 }, 10, 0);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	private void method726() {
		try {
			@Pc(12) File local12 = new File(this.aString5 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(36) DataOutputStream local36 = new DataOutputStream(new FileOutputStream(this.aString5 + "uid.dat"));
				local36.writeInt((int) (Math.random() * 9.9999999E7D));
				local36.close();
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			@Pc(66) DataInputStream local66 = new DataInputStream(new FileInputStream(this.aString5 + "uid.dat"));
			this.anInt1124 = local66.readInt() + 1;
			local66.close();
		} catch (@Pc(76) Exception local76) {
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lclient!ac;")
	public Interface1 method727() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!gd;")
	public Class25 method728(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method717(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!fb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class25 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean47) {
						return;
					}
					if (this.aClass25_4 != null) {
						local15 = this.aClass25_4;
						this.aClass25_4 = this.aClass25_4.aClass25_5;
						if (this.aClass25_4 == null) {
							this.aClass25_3 = null;
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
				@Pc(41) int local41 = local15.anInt1211;
				if (local41 == 1) {
					local15.anObject3 = new Socket(this.anInetAddress1, local15.anInt1213);
				} else if (local41 == 2) {
					@Pc(58) Thread local58 = new Thread((Runnable) local15.anObject2);
					local58.setDaemon(true);
					local58.start();
					local58.setPriority(local15.anInt1213);
					local15.anObject3 = local58;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local41 == 9) {
						local92 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local41 == 10) {
						local92 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1212 = 1;
			} catch (@Pc(148) Exception local148) {
				local15.anInt1212 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
	public void method729() {
		synchronized (this) {
			this.aBoolean47 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.anInterface1_1 != null) {
			this.anInterface1_1.method39();
		}
		if (this.aClass29_1 != null) {
			try {
				this.aClass29_1.method912();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass29_2 != null) {
			try {
				this.aClass29_2.method912();
			} catch (@Pc(51) IOException local51) {
			}
		}
		if (this.aClass29Array1 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.aClass29Array1.length; local57++) {
			if (this.aClass29Array1[local57] != null) {
				try {
					this.aClass29Array1[local57].method912();
				} catch (@Pc(71) IOException local71) {
				}
			}
		}
	}
}
