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
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class77 implements Runnable {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!lb;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "[Lclient!ub;")
	public Class72[] aClass72Array1;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!mc;")
	private Class46 aClass46_6 = null;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!mc;")
	private Class46 aClass46_7 = null;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!ub;")
	public Class72 aClass72_2 = null;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!ub;")
	public Class72 aClass72_3 = null;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	public int anInt3157 = 0;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class77(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		this.anApplet1 = arg1;
		Static123.aString2 = "Unknown";
		this.anInetAddress1 = arg2;
		Static123.aString3 = "1.1";
		try {
			Static123.aString2 = System.getProperty("java.vendor");
			Static123.aString3 = System.getProperty("java.version");
		} catch (@Pc(46) Exception local46) {
		}
		try {
			Static123.aString4 = System.getProperty("user.home");
			if (Static123.aString4 != null) {
				Static123.aString4 = Static123.aString4 + "/";
			}
		} catch (@Pc(62) Exception local62) {
		}
		if (Static123.aString4 == null) {
			Static123.aString4 = "~/";
		}
		try {
			if (arg1 == null) {
				Static123.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static123.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static123.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static123.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method2167(arg3, arg4, arg5);
		}
		this.aBoolean137 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lclient!mc;")
	public Class46 method2161(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method2170(9, new Object[] { arg0, arg1, arg2 }, 0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)Lclient!lb;")
	public Interface3 method2162() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
	public void method2163() {
		synchronized (this) {
			this.aBoolean137 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass72_2 != null) {
			try {
				this.aClass72_2.method1972();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass72_3 != null) {
			try {
				this.aClass72_3.method1972();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass72Array1 == null) {
			return;
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass72Array1.length; local44++) {
			if (this.aClass72Array1[local44] != null) {
				try {
					this.aClass72Array1[local44].method1972();
				} catch (@Pc(58) IOException local58) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lclient!mc;")
	public Class46 method2164(@OriginalArg(1) int arg0) {
		return this.method2170(3, null, arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!mc;")
	public Class46 method2165(@OriginalArg(0) URL arg0) {
		return this.method2170(4, arg0, 0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lclient!mc;")
	public Class46 method2166(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method2170(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;IB)V")
	private void method2167(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static123.aString4, "" };
		@Pc(65) String[] local65 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(67) boolean local67 = false;
		for (@Pc(69) int local69 = 0; local69 < 2; local69++) {
			for (@Pc(72) int local72 = 0; local72 < local65.length; local72++) {
				for (@Pc(75) int local75 = 0; local75 < local42.length; local75++) {
					try {
						@Pc(80) String local80 = local42[local75];
						if (local80.length() > 0 && !(new File(local80)).exists()) {
							continue;
						}
						@Pc(103) File local103 = new File(local80 + local65[local72]);
						@Pc(114) boolean local114;
						if (local69 == 1 && !local103.exists()) {
							local114 = local103.mkdir();
							if (!local114) {
								continue;
							}
						}
						@Pc(138) int local138;
						@Pc(125) File local125;
						if (!local67) {
							try {
								local125 = new File(local103, "uid.dat");
								if (local69 == 1 && (!local125.exists() || local125.length() < 4L)) {
									local138 = -1;
									@Pc(142) Random local142 = new Random();
									while (local138 == -1) {
										local138 = local142.nextInt();
									}
									@Pc(158) DataOutputStream local158 = new DataOutputStream(new FileOutputStream(local125));
									local158.writeInt(local138);
									local158.close();
								}
								if (local125.exists()) {
									local67 = true;
									@Pc(176) DataInputStream local176 = new DataInputStream(new FileInputStream(local125));
									this.anInt3157 = local176.readInt() + 1;
									local176.close();
								}
							} catch (@Pc(186) Exception local186) {
							}
						}
						if (this.aFile3 == null) {
							try {
								local103 = new File(local103, arg1);
								if (local69 == 1 && !local103.exists()) {
									local114 = local103.mkdir();
									if (!local114) {
										continue;
									}
								}
								local125 = new File(local103, "main_file_cache.dat2");
								if (local69 == 0 && !local125.exists()) {
									continue;
								}
								this.aClass72_2 = new Class72(local125, "rw", 52428800L);
								this.aClass72Array1 = new Class72[arg2];
								for (local138 = 0; local138 < arg2; local138++) {
									this.aClass72Array1[local138] = new Class72(new File(local103, "main_file_cache.idx" + local138), "rw", 1048576L);
								}
								this.aClass72_3 = new Class72(new File(local103, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile3 = local103;
							} catch (@Pc(284) Exception local284) {
								try {
									this.aClass72_2.method1972();
									for (@Pc(290) int local290 = 0; local290 < arg2; local290++) {
										this.aClass72Array1[local290].method1972();
									}
									this.aClass72_3.method1972();
								} catch (@Pc(311) Exception local311) {
								}
								this.aClass72_2 = this.aClass72_3 = null;
								this.aFile2 = this.aFile3 = null;
								this.aClass72Array1 = null;
							}
						}
					} catch (@Pc(328) Exception local328) {
					}
					if (local67 && this.aFile3 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile3 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Lclient!mc;")
	public Class46 method2168(@OriginalArg(0) int arg0) {
		return this.method2170(1, null, arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!mc;")
	public Class46 method2169(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method2170(10, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class46 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean137) {
						return;
					}
					if (this.aClass46_6 != null) {
						local15 = this.aClass46_6;
						this.aClass46_6 = this.aClass46_6.aClass46_3;
						if (this.aClass46_6 == null) {
							this.aClass46_7 = null;
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
				@Pc(41) int local41 = local15.anInt1963;
				if (local41 == 1) {
					local15.anObject4 = new Socket(this.anInetAddress1, local15.anInt1962);
				} else if (local41 == 2) {
					@Pc(129) Thread local129 = new Thread((Runnable) local15.anObject3);
					local129.setDaemon(true);
					local129.start();
					local129.setPriority(local15.anInt1962);
					local15.anObject4 = local129;
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
				local15.anInt1964 = 1;
			} catch (@Pc(146) Exception local146) {
				local15.anInt1964 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!mc;")
	private Class46 method2170(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class46 local3 = new Class46();
		local3.anObject3 = arg1;
		local3.anInt1963 = arg0;
		local3.anInt1962 = arg2;
		synchronized (this) {
			if (this.aClass46_7 == null) {
				this.aClass46_7 = this.aClass46_6 = local3;
			} else {
				this.aClass46_7.aClass46_3 = local3;
				this.aClass46_7 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
