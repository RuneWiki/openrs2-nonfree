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

@OriginalClass("client!c")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!be;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Lclient!he;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Lclient!da;")
	public Class16 aClass16_1 = null;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Ljava/lang/String;")
	private String aString1 = null;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "Lclient!jd;")
	private Class34 aClass34_2 = null;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!jd;")
	private Class34 aClass34_1 = null;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Ljava/lang/String;")
	private String aString6 = null;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "Ljava/lang/String;")
	private String aString2 = null;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Ljava/lang/String;")
	private String aString7 = null;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Lclient!da;")
	public Class16 aClass16_2 = null;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "I")
	public int anInt273 = 0;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[Lclient!da;")
	public Class16[] aClass16Array1;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class11(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		Static12.aString4 = "Unknown";
		this.anInetAddress1 = arg2;
		this.anApplet1 = arg1;
		Static12.aString3 = "1.1";
		try {
			Static12.aString4 = System.getProperty("java.vendor");
			Static12.aString3 = System.getProperty("java.version");
			Static12.aString5 = System.getProperty("user.home");
			if (Static12.aString5 != null) {
				Static12.aString5 = Static12.aString5 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (arg1 == null) {
				Static12.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static12.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static12.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static12.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method232(arg4, arg3);
			this.aClass16_2 = new Class16(new File(this.aString2 + "main_file_cache.dat2"), "rw", 52428800L);
			this.aClass16Array1 = new Class16[arg5];
			for (@Pc(152) int local152 = 0; local152 < arg5; local152++) {
				this.aClass16Array1[local152] = new Class16(new File(this.aString2 + "main_file_cache.idx" + local152), "rw", 1048576L);
			}
			this.aClass16_1 = new Class16(new File(this.aString2 + "main_file_cache.idx255"), "rw", 1048576L);
			this.method234();
		}
		this.aBoolean5 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lclient!jd;")
	public Class34 method230(@OriginalArg(1) int arg0) {
		return this.method240(arg0, 3, null);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public void method231() {
		synchronized (this) {
			this.aBoolean5 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.anInterface2_1 != null) {
			this.anInterface2_1.method796();
		}
		if (this.aClass16_2 != null) {
			try {
				this.aClass16_2.method345();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass16_1 != null) {
			try {
				this.aClass16_1.method345();
			} catch (@Pc(54) IOException local54) {
			}
		}
		if (this.aClass16Array1 == null) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < this.aClass16Array1.length; local60++) {
			if (this.aClass16Array1[local60] != null) {
				try {
					this.aClass16Array1[local60].method345();
				} catch (@Pc(74) IOException local74) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method232(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(15) String local15 = ".file_store_" + arg1;
		if (Static12.aString5 == null) {
			Static12.aString5 = "~/";
		}
		@Pc(78) String[] local78 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Static12.aString5, "/tmp/", "" };
		for (@Pc(80) int local80 = 0; local80 < local78.length; local80++) {
			try {
				@Pc(85) String local85 = local78[local80];
				@Pc(93) File local93;
				if (local85.length() > 0) {
					local93 = new File(local85);
					if (!local93.exists()) {
						continue;
					}
				}
				local93 = new File(local85 + local15);
				if (local93.exists() || local93.mkdir()) {
					if (arg0.length() > 0) {
						local93 = new File(local93, arg0);
						if (!local93.exists() && !local93.mkdir()) {
							continue;
						}
					}
					this.aString1 = this.aString6 = local93.getParent() + "/";
					this.aString7 = this.aString2 = local93.getPath() + "/";
					return;
				}
			} catch (@Pc(162) Exception local162) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Lclient!jd;")
	public Class34 method233() {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	private void method234() {
		try {
			@Pc(12) File local12 = new File(this.aString6 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(36) DataOutputStream local36 = new DataOutputStream(new FileOutputStream(this.aString6 + "uid.dat"));
				local36.writeInt((int) (Math.random() * 9.9999999E7D));
				local36.close();
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			@Pc(62) DataInputStream local62 = new DataInputStream(new FileInputStream(this.aString6 + "uid.dat"));
			this.anInt273 = local62.readInt() + 1;
			local62.close();
		} catch (@Pc(81) Exception local81) {
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)Lclient!be;")
	public Interface1 method235() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLjava/net/URL;)Lclient!jd;")
	public Class34 method236(@OriginalArg(1) URL arg0) {
		return this.method240(0, 4, arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!jd;")
	public Class34 method237(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method240(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!jd;")
	public Class34 method238(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method240(0, 10, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lclient!jd;")
	public Class34 method239(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2) {
		return this.method240(0, 9, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!c", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class34 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean5) {
						return;
					}
					if (this.aClass34_1 != null) {
						local15 = this.aClass34_1;
						this.aClass34_1 = this.aClass34_1.aClass34_3;
						if (this.aClass34_1 == null) {
							this.aClass34_2 = null;
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
				@Pc(41) int local41 = local15.anInt1271;
				if (local41 == 1) {
					local15.anObject2 = new Socket(this.anInetAddress1, local15.anInt1270);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject1);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1270);
					local15.anObject2 = local56;
				} else if (local41 == 4) {
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local41 == 9) {
						local81 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local41 == 10) {
						local81 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1269 = 1;
			} catch (@Pc(144) Exception local144) {
				local15.anInt1269 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!jd;")
	private Class34 method240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		@Pc(3) Class34 local3 = new Class34();
		local3.anInt1271 = arg1;
		local3.anObject1 = arg2;
		local3.anInt1270 = arg0;
		synchronized (this) {
			if (this.aClass34_2 == null) {
				this.aClass34_2 = this.aClass34_1 = local3;
			} else {
				this.aClass34_2.aClass34_3 = local3;
				this.aClass34_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)Lclient!he;")
	public Interface2 method241() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Lclient!jd;")
	public Class34 method242(@OriginalArg(0) int arg0) {
		return this.method240(arg0, 1, null);
	}
}
