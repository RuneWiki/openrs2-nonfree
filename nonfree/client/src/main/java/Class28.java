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

@OriginalClass("client!g")
public final class Class28 implements Runnable {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[Lclient!ne;")
	public Class53[] aClass53Array1;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!hd;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!ed;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public int anInt820 = 0;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!ma;")
	private Class48 aClass48_3 = null;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!ne;")
	public Class53 aClass53_3 = null;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!ne;")
	public Class53 aClass53_2 = null;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!ma;")
	private Class48 aClass48_4 = null;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class28(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		this.anApplet1 = arg1;
		Static35.aString2 = "1.1";
		this.anInetAddress1 = arg2;
		Static35.aString1 = "Unknown";
		try {
			Static35.aString1 = System.getProperty("java.vendor");
			Static35.aString2 = System.getProperty("java.version");
		} catch (@Pc(46) Exception local46) {
		}
		try {
			Static35.aString3 = System.getProperty("user.home");
			if (Static35.aString3 != null) {
				Static35.aString3 = Static35.aString3 + "/";
			}
		} catch (@Pc(62) Exception local62) {
		}
		if (Static35.aString3 == null) {
			Static35.aString3 = "~/";
		}
		try {
			if (arg1 == null) {
				Static35.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static35.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static35.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static35.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method575(arg3, arg5, arg4);
		}
		this.aBoolean55 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public void method569() {
		synchronized (this) {
			this.aBoolean55 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.anInterface4_2 != null) {
			this.anInterface4_2.method729();
		}
		if (this.aClass53_2 != null) {
			try {
				this.aClass53_2.method1239();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass53_3 != null) {
			try {
				this.aClass53_3.method1239();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass53Array1 == null) {
			return;
		}
		for (@Pc(51) int local51 = 0; local51 < this.aClass53Array1.length; local51++) {
			if (this.aClass53Array1[local51] != null) {
				try {
					this.aClass53Array1[local51].method1239();
				} catch (@Pc(65) IOException local65) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!ma;")
	public Class48 method570(@OriginalArg(1) int arg0) {
		return this.method572(arg0, null, 3);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lclient!ma;")
	public Class48 method571(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method572(0, new Object[] { arg2, arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!ma;")
	private Class48 method572(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(4) int arg2) {
		@Pc(3) Class48 local3 = new Class48();
		local3.anInt1532 = arg2;
		local3.anObject4 = arg1;
		local3.anInt1533 = arg0;
		synchronized (this) {
			if (this.aClass48_3 == null) {
				this.aClass48_3 = this.aClass48_4 = local3;
			} else {
				this.aClass48_3.aClass48_8 = local3;
				this.aClass48_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Lclient!hd;")
	public Interface4 method573() {
		return this.anInterface4_2;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Lclient!ma;")
	public Class48 method574(@OriginalArg(1) int arg0) {
		return this.method572(arg0, null, 1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILjava/lang/String;B)V")
	private void method575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static35.aString3, "" };
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(69) boolean local69 = false;
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local67.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local44.length; local86++) {
					try {
						@Pc(91) String local91 = local44[local86];
						if (local91.length() > 0 && !(new File(local91)).exists()) {
							continue;
						}
						@Pc(117) File local117 = new File(local91 + local67[local83]);
						@Pc(126) boolean local126;
						if (local80 == 1 && !local117.exists()) {
							local126 = local117.mkdir();
							if (!local126) {
								continue;
							}
						}
						@Pc(154) int local154;
						@Pc(137) File local137;
						if (!local69) {
							try {
								local137 = new File(local117, "uid.dat");
								if (local80 == 1 && (!local137.exists() || local137.length() < 4L)) {
									@Pc(152) Random local152 = new Random();
									for (local154 = -1; local154 == -1; local154 = local152.nextInt()) {
									}
									@Pc(170) DataOutputStream local170 = new DataOutputStream(new FileOutputStream(local137));
									local170.writeInt(local154);
									local170.close();
								}
								if (local137.exists()) {
									local69 = true;
									@Pc(188) DataInputStream local188 = new DataInputStream(new FileInputStream(local137));
									this.anInt820 = local188.readInt() + 1;
									local188.close();
								}
							} catch (@Pc(198) Exception local198) {
							}
						}
						if (this.aFile2 == null) {
							try {
								local117 = new File(local117, arg2);
								if (local80 == 1 && !local117.exists()) {
									local126 = local117.mkdir();
									if (!local126) {
										continue;
									}
								}
								local137 = new File(local117, "main_file_cache.dat2");
								if (local80 == 0 && !local137.exists()) {
									continue;
								}
								this.aClass53_2 = new Class53(local137, "rw", 52428800L);
								this.aClass53Array1 = new Class53[arg1];
								for (local154 = 0; local154 < arg1; local154++) {
									this.aClass53Array1[local154] = new Class53(new File(local117, "main_file_cache.idx" + local154), "rw", 1048576L);
								}
								this.aClass53_3 = new Class53(new File(local117, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local117;
							} catch (@Pc(296) Exception local296) {
								try {
									this.aClass53_2.method1239();
									for (@Pc(302) int local302 = 0; local302 < arg1; local302++) {
										this.aClass53Array1[local302].method1239();
									}
									this.aClass53_3.method1239();
								} catch (@Pc(323) Exception local323) {
								}
								this.aClass53Array1 = null;
								this.aFile1 = this.aFile2 = null;
								this.aClass53_2 = this.aClass53_3 = null;
							}
						}
					} catch (@Pc(340) Exception local340) {
					}
					if (local69 && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!ma;")
	public Class48 method576(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method572(0, new Object[] { arg0, arg1 }, 10);
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)Lclient!ma;")
	public Class48 method577() {
		return null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ma;")
	public Class48 method578(@OriginalArg(1) URL arg0) {
		return this.method572(0, arg0, 4);
	}

	@OriginalMember(owner = "client!g", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class48 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean55) {
						return;
					}
					if (this.aClass48_4 != null) {
						local15 = this.aClass48_4;
						this.aClass48_4 = this.aClass48_4.aClass48_8;
						if (this.aClass48_4 == null) {
							this.aClass48_3 = null;
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
				@Pc(41) int local41 = local15.anInt1532;
				if (local41 == 1) {
					local15.anObject5 = new Socket(this.anInetAddress1, local15.anInt1533);
				} else if (local41 == 2) {
					@Pc(119) Thread local119 = new Thread((Runnable) local15.anObject4);
					local119.setDaemon(true);
					local119.start();
					local119.setPriority(local15.anInt1533);
					local15.anObject5 = local119;
				} else if (local41 == 4) {
					local15.anObject5 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(70) Object[] local70;
					if (local41 == 9) {
						local70 = (Object[]) local15.anObject4;
						local15.anObject5 = ((Class) local70[0]).getDeclaredMethod((String) local70[1], (Class[]) local70[2]);
					} else if (local41 == 10) {
						local70 = (Object[]) local15.anObject4;
						local15.anObject5 = ((Class) local70[0]).getDeclaredField((String) local70[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1534 = 1;
			} catch (@Pc(146) Exception local146) {
				local15.anInt1534 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lclient!ma;")
	public Class48 method579(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method572(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lclient!ed;")
	public Interface3 method580() {
		return this.anInterface3_1;
	}
}
