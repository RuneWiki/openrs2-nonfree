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

@OriginalClass("client!cc")
public final class Class12 implements Runnable {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!sc;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "Lclient!rd;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!sa;")
	public Class58 aClass58_1 = null;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Ljava/lang/String;")
	private String aString4 = null;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!f;")
	private Class19 aClass19_2 = null;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!sa;")
	public Class58 aClass58_2 = null;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!f;")
	private Class19 aClass19_3 = null;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Ljava/lang/String;")
	private String aString7 = null;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	public int anInt379 = 0;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[Lclient!sa;")
	public Class58[] aClass58Array1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class12(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anInetAddress1 = arg2;
		this.anApplet1 = arg1;
		Static14.aString1 = "1.1";
		Static14.aString6 = "Unknown";
		try {
			Static14.aString6 = System.getProperty("java.vendor");
			Static14.aString1 = System.getProperty("java.version");
			Static14.aString3 = System.getProperty("user.home");
			if (Static14.aString3 != null) {
				Static14.aString3 = Static14.aString3 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static14.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static14.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		if (arg0) {
			this.method332(arg3, arg4);
			this.aClass58_1 = new Class58(new File(this.aString2 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass58Array1 = new Class58[arg5];
			for (@Pc(125) int local125 = 0; local125 < arg5; local125++) {
				this.aClass58Array1[local125] = new Class58(new File(this.aString2 + "main_file_cache.idx" + local125), "rw", 1048576L);
			}
			this.aClass58_2 = new Class58(new File(this.aString2 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method331();
		}
		this.aBoolean18 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!f;")
	public Class19 method321(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method328(0, new Object[] { arg1, arg0 }, 10);
	}

	@OriginalMember(owner = "client!cc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class19 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean18) {
						return;
					}
					if (this.aClass19_2 != null) {
						local15 = this.aClass19_2;
						this.aClass19_2 = this.aClass19_2.aClass19_5;
						if (this.aClass19_2 == null) {
							this.aClass19_3 = null;
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
				@Pc(41) int local41 = local15.anInt801;
				if (local41 == 1) {
					local15.anObject3 = new Socket(this.anInetAddress1, local15.anInt800);
				} else if (local41 == 2) {
					@Pc(131) Thread local131 = new Thread((Runnable) local15.anObject2);
					local131.setDaemon(true);
					local131.start();
					local131.setPriority(local15.anInt800);
					local15.anObject3 = local131;
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
				local15.anInt799 = 1;
			} catch (@Pc(148) Exception local148) {
				local15.anInt799 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!f;")
	public Class19 method322(@OriginalArg(1) int arg0) {
		return this.method328(arg0, null, 1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!f;")
	public Class19 method323(@OriginalArg(0) URL arg0) {
		return this.method328(0, arg0, 4);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lclient!f;")
	public Class19 method324(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method328(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lclient!f;")
	public Class19 method325(@OriginalArg(0) int arg0) {
		return this.method328(arg0, null, 3);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public void method326() {
		synchronized (this) {
			this.aBoolean18 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.anInterface3_1 != null) {
			this.anInterface3_1.method1684();
		}
		if (this.aClass58_1 != null) {
			try {
				this.aClass58_1.method1709();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass58_2 != null) {
			try {
				this.aClass58_2.method1709();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass58Array1 == null) {
			return;
		}
		for (@Pc(51) int local51 = 0; local51 < this.aClass58Array1.length; local51++) {
			if (this.aClass58Array1[local51] != null) {
				try {
					this.aClass58Array1[local51].method1709();
				} catch (@Pc(65) IOException local65) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)Lclient!sc;")
	public Interface4 method327() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZLjava/lang/Object;II)Lclient!f;")
	private Class19 method328(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class19 local3 = new Class19();
		local3.anObject2 = arg1;
		local3.anInt800 = arg0;
		local3.anInt801 = arg2;
		synchronized (this) {
			if (this.aClass19_3 == null) {
				this.aClass19_3 = this.aClass19_2 = local3;
			} else {
				this.aClass19_3.aClass19_5 = local3;
				this.aClass19_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Lclient!f;")
	public Class19 method329(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method328(0, new Object[] { arg2, arg0, arg1 }, 9);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lclient!rd;")
	public Interface3 method330() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	private void method331() {
		try {
			@Pc(12) File local12 = new File(this.aString7 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(43) DataOutputStream local43 = new DataOutputStream(new FileOutputStream(this.aString7 + "uid.dat"));
				local43.writeInt((int) (Math.random() * 9.9999999E7D));
				local43.close();
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			@Pc(69) DataInputStream local69 = new DataInputStream(new FileInputStream(this.aString7 + "uid.dat"));
			this.anInt379 = local69.readInt() + 1;
			local69.close();
		} catch (@Pc(79) Exception local79) {
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBLjava/lang/String;)V")
	private void method332(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static14.aString3 == null) {
			Static14.aString3 = "~/";
		}
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(78) String[] local78 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static14.aString3, "/tmp/", "" };
		@Pc(86) String local86 = ".file_store_" + arg0;
		for (@Pc(88) int local88 = 0; local88 < local78.length; local88++) {
			try {
				@Pc(93) String local93 = local78[local88];
				@Pc(101) File local101;
				if (local93.length() > 0) {
					local101 = new File(local93);
					if (!local101.exists()) {
						continue;
					}
				}
				local101 = new File(local93 + local86);
				if (local101.exists() || local101.mkdir()) {
					if (arg1.length() > 0) {
						local101 = new File(local101, arg1);
						if (!local101.exists() && !local101.mkdir()) {
							continue;
						}
					}
					this.aString4 = this.aString7 = local101.getParent() + "/";
					this.aString5 = this.aString2 = local101.getPath() + "/";
					return;
				}
			} catch (@Pc(170) Exception local170) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Lclient!f;")
	public Class19 method333() {
		return null;
	}
}
