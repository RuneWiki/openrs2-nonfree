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

@OriginalClass("client!aa")
public final class Class2 implements Runnable {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!se;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!jc;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public int anInt11 = 0;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "Lclient!o;")
	public Class53 aClass53_1 = null;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!o;")
	public Class53 aClass53_2 = null;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!kb;")
	private Class42 aClass42_1 = null;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Ljava/lang/String;")
	private String aString3 = null;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!kb;")
	private Class42 aClass42_2 = null;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Ljava/lang/String;")
	private String aString6 = null;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "Ljava/lang/String;")
	private String aString7 = null;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[Lclient!o;")
	public Class53[] aClass53Array1;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class2(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		Static2.aString5 = "Unknown";
		this.anInetAddress1 = arg2;
		this.anApplet1 = arg1;
		Static2.aString1 = "1.1";
		try {
			Static2.aString5 = System.getProperty("java.vendor");
			Static2.aString1 = System.getProperty("java.version");
			Static2.aString4 = System.getProperty("user.home");
			if (Static2.aString4 != null) {
				Static2.aString4 = Static2.aString4 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static2.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static2.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static2.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static2.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method17(arg4, arg3);
			this.aClass53_2 = new Class53(new File(this.aString7 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass53Array1 = new Class53[arg5];
			for (@Pc(152) int local152 = 0; local152 < arg5; local152++) {
				this.aClass53Array1[local152] = new Class53(new File(this.aString7 + "main_file_cache.idx" + local152), "rw", 1048576L);
			}
			this.aClass53_1 = new Class53(new File(this.aString7 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method12();
		}
		this.aBoolean1 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!aa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class42 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean1) {
						return;
					}
					if (this.aClass42_1 != null) {
						local15 = this.aClass42_1;
						this.aClass42_1 = this.aClass42_1.aClass42_6;
						if (this.aClass42_1 == null) {
							this.aClass42_2 = null;
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
				@Pc(41) int local41 = local15.anInt1394;
				if (local41 == 1) {
					local15.anObject2 = new Socket(this.anInetAddress1, local15.anInt1396);
				} else if (local41 == 2) {
					@Pc(117) Thread local117 = new Thread((Runnable) local15.anObject3);
					local117.setDaemon(true);
					local117.start();
					local117.setPriority(local15.anInt1396);
					local15.anObject2 = local117;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(74) Object[] local74;
					if (local41 == 9) {
						local74 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local74[0]).getDeclaredMethod((String) local74[1], (Class[]) local74[2]);
					} else if (local41 == 10) {
						local74 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local74[0]).getDeclaredField((String) local74[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1395 = 1;
			} catch (@Pc(144) Exception local144) {
				local15.anInt1395 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Lclient!se;")
	public Interface3 method5() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!kb;")
	public Class42 method6(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method10(10, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Lclient!jc;")
	public Interface1 method7() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Lclient!kb;")
	public Class42 method8() {
		return null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lclient!kb;")
	public Class42 method9(@OriginalArg(0) int arg0) {
		return this.method10(3, arg0, null);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIBLjava/lang/Object;)Lclient!kb;")
	private Class42 method10(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class42 local3 = new Class42();
		local3.anInt1394 = arg0;
		local3.anInt1396 = arg1;
		local3.anObject3 = arg2;
		synchronized (this) {
			if (this.aClass42_2 == null) {
				this.aClass42_2 = this.aClass42_1 = local3;
			} else {
				this.aClass42_2.aClass42_6 = local3;
				this.aClass42_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public void method11() {
		synchronized (this) {
			this.aBoolean1 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.anInterface1_1 != null) {
			this.anInterface1_1.method873();
		}
		if (this.aClass53_2 != null) {
			try {
				this.aClass53_2.method1175();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass53_1 != null) {
			try {
				this.aClass53_1.method1175();
			} catch (@Pc(50) IOException local50) {
			}
		}
		if (this.aClass53Array1 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.aClass53Array1.length; local56++) {
			if (this.aClass53Array1[local56] != null) {
				try {
					this.aClass53Array1[local56].method1175();
				} catch (@Pc(70) IOException local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	private void method12() {
		try {
			@Pc(12) File local12 = new File(this.aString3 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(36) DataOutputStream local36 = new DataOutputStream(new FileOutputStream(this.aString3 + "uid.dat"));
				local36.writeInt((int) (Math.random() * 9.9999999E7D));
				local36.close();
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			@Pc(62) DataInputStream local62 = new DataInputStream(new FileInputStream(this.aString3 + "uid.dat"));
			this.anInt11 = local62.readInt() + 1;
			local62.close();
		} catch (@Pc(72) Exception local72) {
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!kb;")
	public Class42 method13(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method10(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!kb;")
	public Class42 method14(@OriginalArg(0) URL arg0) {
		return this.method10(4, 0, arg0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Lclient!kb;")
	public Class42 method15(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method10(9, 0, new Object[] { arg2, arg0, arg1 });
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Lclient!kb;")
	public Class42 method16(@OriginalArg(1) int arg0) {
		return this.method10(1, arg0, null);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method17(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		if (Static2.aString4 == null) {
			Static2.aString4 = "~/";
		}
		@Pc(74) String[] local74 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static2.aString4, "/tmp/", "" };
		@Pc(82) String local82 = ".file_store_" + arg1;
		for (@Pc(84) int local84 = 0; local84 < local74.length; local84++) {
			try {
				@Pc(89) String local89 = local74[local84];
				@Pc(97) File local97;
				if (local89.length() > 0) {
					local97 = new File(local89);
					if (!local97.exists()) {
						continue;
					}
				}
				local97 = new File(local89 + local82);
				if (local97.exists() || local97.mkdir()) {
					if (arg0.length() > 0) {
						local97 = new File(local97, arg0);
						if (!local97.exists() && !local97.mkdir()) {
							continue;
						}
					}
					this.aString2 = this.aString3 = local97.getParent() + "/";
					this.aString6 = this.aString7 = local97.getPath() + "/";
					return;
				}
			} catch (@Pc(166) Exception local166) {
			}
		}
		throw new RuntimeException();
	}
}
