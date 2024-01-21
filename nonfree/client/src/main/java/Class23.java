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

@OriginalClass("client!ed")
public final class Class23 implements Runnable {

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Lclient!uc;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!nd;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Ljava/lang/String;")
	private String aString4 = null;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!sc;")
	private Class58 aClass58_3 = null;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!sc;")
	private Class58 aClass58_4 = null;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Ljava/lang/String;")
	private String aString7 = null;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!be;")
	public Class10 aClass10_3 = null;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	public int anInt788 = 0;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Lclient!be;")
	public Class10 aClass10_2 = null;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "[Lclient!be;")
	public Class10[] aClass10Array1;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class23(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		Static26.aString3 = "Unknown";
		Static26.aString6 = "1.1";
		this.anApplet1 = arg1;
		this.anInetAddress1 = arg2;
		try {
			Static26.aString3 = System.getProperty("java.vendor");
			Static26.aString6 = System.getProperty("java.version");
			Static26.aString8 = System.getProperty("user.home");
			if (Static26.aString8 != null) {
				Static26.aString8 = Static26.aString8 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static26.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static26.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static26.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static26.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method521(arg4, arg3);
			this.aClass10_3 = new Class10(new File(this.aString2 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass10Array1 = new Class10[arg5];
			for (@Pc(152) int local152 = 0; local152 < arg5; local152++) {
				this.aClass10Array1[local152] = new Class10(new File(this.aString2 + "main_file_cache.idx" + local152), "rw", 1048576L);
			}
			this.aClass10_2 = new Class10(new File(this.aString2 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method527();
		}
		this.aBoolean40 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLjava/net/URL;)Lclient!sc;")
	public Class58 method517(@OriginalArg(1) URL arg0) {
		return this.method522(4, 0, arg0);
	}

	@OriginalMember(owner = "client!ed", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class58 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean40) {
						return;
					}
					if (this.aClass58_3 != null) {
						local15 = this.aClass58_3;
						this.aClass58_3 = this.aClass58_3.aClass58_8;
						if (this.aClass58_3 == null) {
							this.aClass58_4 = null;
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
				@Pc(41) int local41 = local15.anInt2473;
				if (local41 == 1) {
					local15.anObject4 = new Socket(this.anInetAddress1, local15.anInt2475);
				} else if (local41 == 2) {
					@Pc(127) Thread local127 = new Thread((Runnable) local15.anObject3);
					local127.setDaemon(true);
					local127.start();
					local127.setPriority(local15.anInt2475);
					local15.anObject4 = local127;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local41 == 9) {
						local81 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local41 == 10) {
						local81 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2474 = 1;
			} catch (@Pc(144) Exception local144) {
				local15.anInt2474 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Lclient!uc;")
	public Interface4 method518() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Lclient!nd;")
	public Interface2 method519() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!sc;")
	public Class58 method520(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method522(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method521(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		if (Static26.aString8 == null) {
			Static26.aString8 = "~/";
		}
		@Pc(72) String[] local72 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static26.aString8, "/tmp/", "" };
		@Pc(80) String local80 = ".file_store_" + arg1;
		for (@Pc(82) int local82 = 0; local82 < local72.length; local82++) {
			try {
				@Pc(87) String local87 = local72[local82];
				@Pc(98) File local98;
				if (local87.length() > 0) {
					local98 = new File(local87);
					if (!local98.exists()) {
						continue;
					}
				}
				local98 = new File(local87 + local80);
				if (local98.exists() || local98.mkdir()) {
					if (arg0.length() > 0) {
						local98 = new File(local98, arg0);
						if (!local98.exists() && !local98.mkdir()) {
							continue;
						}
					}
					this.aString7 = this.aString5 = local98.getParent() + "/";
					this.aString4 = this.aString2 = local98.getPath() + "/";
					return;
				}
			} catch (@Pc(167) Exception local167) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILjava/lang/Object;B)Lclient!sc;")
	private Class58 method522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		@Pc(3) Class58 local3 = new Class58();
		local3.anObject3 = arg2;
		local3.anInt2473 = arg0;
		local3.anInt2475 = arg1;
		synchronized (this) {
			if (this.aClass58_4 == null) {
				this.aClass58_4 = this.aClass58_3 = local3;
			} else {
				this.aClass58_4.aClass58_8 = local3;
				this.aClass58_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lclient!sc;")
	public Class58 method523(@OriginalArg(0) int arg0) {
		return this.method522(1, arg0, null);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lclient!sc;")
	public Class58 method524(@OriginalArg(0) int arg0) {
		return this.method522(3, arg0, null);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	public void method525() {
		synchronized (this) {
			this.aBoolean40 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.anInterface2_1 != null) {
			this.anInterface2_1.method1240();
		}
		if (this.aClass10_3 != null) {
			try {
				this.aClass10_3.method286();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass10_2 != null) {
			try {
				this.aClass10_2.method286();
			} catch (@Pc(53) IOException local53) {
			}
		}
		if (this.aClass10Array1 == null) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < this.aClass10Array1.length; local59++) {
			if (this.aClass10Array1[local59] != null) {
				try {
					this.aClass10Array1[local59].method286();
				} catch (@Pc(73) IOException local73) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!sc;")
	public Class58 method526(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method522(9, 0, new Object[] { arg2, arg0, arg1 });
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	private void method527() {
		try {
			@Pc(18) File local18 = new File(this.aString5 + "uid.dat");
			if (!local18.exists() || local18.length() < 4L) {
				@Pc(42) DataOutputStream local42 = new DataOutputStream(new FileOutputStream(this.aString5 + "uid.dat"));
				local42.writeInt((int) (Math.random() * 9.9999999E7D));
				local42.close();
			}
		} catch (@Pc(52) Exception local52) {
		}
		try {
			@Pc(68) DataInputStream local68 = new DataInputStream(new FileInputStream(this.aString5 + "uid.dat"));
			this.anInt788 = local68.readInt() + 1;
			local68.close();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)Lclient!sc;")
	public Class58 method528() {
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!sc;")
	public Class58 method529(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method522(10, 0, new Object[] { arg0, arg1 });
	}
}
