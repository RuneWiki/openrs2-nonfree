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

@OriginalClass("client!jc")
public final class Class35 implements Runnable {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!gb;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!cd;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!be;")
	public Class8 aClass8_3 = null;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!qb;")
	private Class54 aClass54_1 = null;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Ljava/lang/String;")
	private String aString7 = null;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Ljava/lang/String;")
	private String aString3 = null;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!be;")
	public Class8 aClass8_2 = null;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	public int anInt1372 = 0;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!qb;")
	private Class54 aClass54_2 = null;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[Lclient!be;")
	public Class8[] aClass8Array1;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class35(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		Static47.aString8 = "Unknown";
		this.anInetAddress1 = arg2;
		Static47.aString4 = "1.1";
		this.anApplet1 = arg1;
		try {
			Static47.aString8 = System.getProperty("java.vendor");
			Static47.aString4 = System.getProperty("java.version");
			Static47.aString6 = System.getProperty("user.home");
			if (Static47.aString6 != null) {
				Static47.aString6 = Static47.aString6 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static47.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static47.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		if (arg0) {
			this.method767(arg4, arg3);
			this.aClass8_3 = new Class8(new File(this.aString7 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass8Array1 = new Class8[arg5];
			for (@Pc(125) int local125 = 0; local125 < arg5; local125++) {
				this.aClass8Array1[local125] = new Class8(new File(this.aString7 + "main_file_cache.idx" + local125), "rw", 1048576L);
			}
			this.aClass8_2 = new Class8(new File(this.aString7 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method772();
		}
		this.aBoolean76 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method767(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		if (Static47.aString6 == null) {
			Static47.aString6 = "~/";
		}
		@Pc(27) String local27 = ".file_store_" + arg1;
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static47.aString6, "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local86.length; local88++) {
			try {
				@Pc(93) String local93 = local86[local88];
				@Pc(101) File local101;
				if (local93.length() > 0) {
					local101 = new File(local93);
					if (!local101.exists()) {
						continue;
					}
				}
				local101 = new File(local93 + local27);
				if (local101.exists() || local101.mkdir()) {
					if (arg0.length() > 0) {
						local101 = new File(local101, arg0);
						if (!local101.exists() && !local101.mkdir()) {
							continue;
						}
					}
					this.aString2 = this.aString5 = local101.getParent() + "/";
					this.aString3 = this.aString7 = local101.getPath() + "/";
					return;
				}
			} catch (@Pc(170) Exception local170) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Lclient!gb;")
	public Interface2 method768() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Lclient!qb;")
	public Class54 method769(@OriginalArg(1) int arg0) {
		return this.method774(null, 1, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class54 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean76) {
						return;
					}
					if (this.aClass54_1 != null) {
						local15 = this.aClass54_1;
						this.aClass54_1 = this.aClass54_1.aClass54_4;
						if (this.aClass54_1 == null) {
							this.aClass54_2 = null;
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
				@Pc(41) int local41 = local15.anInt2216;
				if (local41 == 1) {
					local15.anObject3 = new Socket(this.anInetAddress1, local15.anInt2218);
				} else if (local41 == 2) {
					@Pc(66) Thread local66 = new Thread((Runnable) local15.anObject4);
					local66.setDaemon(true);
					local66.start();
					local66.setPriority(local15.anInt2218);
					local15.anObject3 = local66;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local41 == 9) {
						local92 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local41 == 10) {
						local92 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2217 = 1;
			} catch (@Pc(142) Exception local142) {
				local15.anInt2217 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Lclient!qb;")
	public Class54 method770(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method774(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Lclient!qb;")
	public Class54 method771() {
		return null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	private void method772() {
		try {
			@Pc(12) File local12 = new File(this.aString5 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(38) DataOutputStream local38 = new DataOutputStream(new FileOutputStream(this.aString5 + "uid.dat"));
				local38.writeInt((int) (Math.random() * 9.9999999E7D));
				local38.close();
			}
		} catch (@Pc(56) Exception local56) {
		}
		try {
			@Pc(72) DataInputStream local72 = new DataInputStream(new FileInputStream(this.aString5 + "uid.dat"));
			this.anInt1372 = local72.readInt() + 1;
			local72.close();
		} catch (@Pc(82) Exception local82) {
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Lclient!cd;")
	public Interface1 method773() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!qb;")
	private Class54 method774(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class54 local3 = new Class54();
		local3.anObject4 = arg0;
		local3.anInt2218 = arg2;
		local3.anInt2216 = arg1;
		synchronized (this) {
			if (this.aClass54_2 == null) {
				this.aClass54_2 = this.aClass54_1 = local3;
			} else {
				this.aClass54_2.aClass54_4 = local3;
				this.aClass54_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	public void method775() {
		synchronized (this) {
			this.aBoolean76 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.anInterface2_1 != null) {
			this.anInterface2_1.method605();
		}
		if (this.aClass8_3 != null) {
			try {
				this.aClass8_3.method266();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass8_2 != null) {
			try {
				this.aClass8_2.method266();
			} catch (@Pc(52) IOException local52) {
			}
		}
		if (this.aClass8Array1 == null) {
			return;
		}
		for (@Pc(58) int local58 = 0; local58 < this.aClass8Array1.length; local58++) {
			if (this.aClass8Array1[local58] != null) {
				try {
					this.aClass8Array1[local58].method266();
				} catch (@Pc(72) IOException local72) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!qb;")
	public Class54 method776(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method774(new Object[] { arg0, arg1 }, 10, 0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lclient!qb;")
	public Class54 method777(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method774(new Object[] { arg0, arg1, arg2 }, 9, 0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!qb;")
	public Class54 method778(@OriginalArg(0) URL arg0) {
		return this.method774(arg0, 4, 0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Lclient!qb;")
	public Class54 method779(@OriginalArg(0) int arg0) {
		return this.method774(null, 3, arg0);
	}
}
