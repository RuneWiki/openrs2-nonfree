import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
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

@OriginalClass("client!dd")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "[Lclient!ab;")
	public Class3[] aClass3Array1;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!r;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
	public int anInt818 = 0;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!ab;")
	public Class3 aClass3_1 = null;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!tf;")
	private Class73 aClass73_4 = null;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!ab;")
	public Class3 aClass3_2 = null;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!tf;")
	private Class73 aClass73_5 = null;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class15(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static25.aString2 = "1.1";
		Static25.aString1 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static25.aString1 = System.getProperty("java.vendor");
			Static25.aString2 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static25.aString3 = System.getProperty("user.home");
			if (Static25.aString3 != null) {
				Static25.aString3 = Static25.aString3 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static25.aString3 == null) {
			Static25.aString3 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static25.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static25.aMethod1 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static25.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static25.aMethod2 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method491(arg3, arg4, arg2);
		}
		this.aBoolean42 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!dd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class73 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean42) {
						return;
					}
					if (this.aClass73_4 != null) {
						local15 = this.aClass73_4;
						this.aClass73_4 = this.aClass73_4.aClass73_17;
						if (this.aClass73_4 == null) {
							this.aClass73_5 = null;
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
				@Pc(41) int local41 = local15.anInt2811;
				if (local41 == 1) {
					local15.anObject4 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt2812);
				} else if (local41 == 2) {
					@Pc(127) Thread local127 = new Thread((Runnable) local15.anObject3);
					local127.setDaemon(true);
					local127.start();
					local127.setPriority(local15.anInt2812);
					local15.anObject4 = local127;
				} else if (local41 == 4) {
					local15.anObject4 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(71) Object[] local71;
					if (local41 == 8) {
						local71 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local71[0]).getDeclaredMethod((String) local71[1], (Class[]) local71[2]);
					} else if (local41 == 9) {
						local71 = (Object[]) local15.anObject3;
						local15.anObject4 = ((Class) local71[0]).getDeclaredField((String) local71[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2813 = 1;
			} catch (@Pc(144) ThreadDeath local144) {
				throw local144;
			} catch (@Pc(147) Throwable local147) {
				local15.anInt2813 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lclient!tf;")
	public Class73 method482(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method486(0, new Object[] { arg1, arg0, arg2 }, 8);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILjava/lang/String;)Lclient!tf;")
	public Class73 method483(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method486(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lclient!r;")
	public Interface3 method484() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public void method485() {
		synchronized (this) {
			this.aBoolean42 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass3_1 != null) {
			try {
				this.aClass3_1.method100();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass3_2 != null) {
			try {
				this.aClass3_2.method100();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass3Array1 == null) {
			return;
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass3Array1.length; local44++) {
			if (this.aClass3Array1[local44] != null) {
				try {
					this.aClass3Array1[local44].method100();
				} catch (@Pc(58) IOException local58) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!tf;")
	private Class73 method486(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class73 local3 = new Class73();
		local3.anInt2811 = arg2;
		local3.anObject3 = arg1;
		local3.anInt2812 = arg0;
		synchronized (this) {
			if (this.aClass73_5 == null) {
				this.aClass73_5 = this.aClass73_4 = local3;
			} else {
				this.aClass73_5.aClass73_17 = local3;
				this.aClass73_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!tf;")
	public Class73 method487(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method486(0, new Object[] { arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lclient!tf;")
	public Class73 method488(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method486(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Lclient!tf;")
	public Class73 method489(@OriginalArg(1) int arg0) {
		return this.method486(arg0, null, 3);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!tf;")
	public Class73 method490(@OriginalArg(0) URL arg0) {
		return this.method486(0, arg0, 4);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;IIZ)V")
	private void method491(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static25.aString3, "/tmp/", "" };
		@Pc(65) String[] local65 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(67) boolean local67 = false;
		for (@Pc(69) int local69 = 0; local69 < 2; local69++) {
			for (@Pc(72) int local72 = 0; local72 < local65.length; local72++) {
				for (@Pc(75) int local75 = 0; local75 < local42.length; local75++) {
					try {
						@Pc(80) String local80 = local42[local75];
						if (local80.length() > 0 && !(new File(local80)).exists()) {
							continue;
						}
						@Pc(106) File local106 = new File(local80 + local65[local72]);
						@Pc(117) boolean local117;
						if (local69 == 1 && !local106.exists()) {
							local117 = local106.mkdir();
							if (!local117) {
								continue;
							}
						}
						@Pc(145) int local145;
						@Pc(128) File local128;
						if (!local67) {
							try {
								local128 = new File(local106, "uid.dat");
								if (local69 == 1 && (!local128.exists() || local128.length() < 4L)) {
									local145 = -1;
									@Pc(149) Random local149 = new Random();
									while (local145 == -1) {
										local145 = local149.nextInt();
									}
									@Pc(164) DataOutputStream local164 = new DataOutputStream(new FileOutputStream(local128));
									local164.writeInt(local145);
									local164.close();
								}
								if (local128.exists()) {
									local67 = true;
									@Pc(182) DataInputStream local182 = new DataInputStream(new FileInputStream(local128));
									this.anInt818 = local182.readInt() + 1;
									local182.close();
								}
							} catch (@Pc(192) Exception local192) {
							}
						}
						if (this.aFile2 == null) {
							try {
								local106 = new File(local106, arg0);
								if (local69 == 1 && !local106.exists()) {
									local117 = local106.mkdir();
									if (!local117) {
										continue;
									}
								}
								local128 = new File(local106, "main_file_cache.dat2");
								if (local69 == 0 && !local128.exists()) {
									continue;
								}
								this.aClass3_1 = new Class3(local128, "rw", 52428800L);
								this.aClass3Array1 = new Class3[arg1];
								for (local145 = 0; local145 < arg1; local145++) {
									this.aClass3Array1[local145] = new Class3(new File(local106, "main_file_cache.idx" + local145), "rw", 1048576L);
								}
								this.aClass3_2 = new Class3(new File(local106, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local106;
							} catch (@Pc(284) Exception local284) {
								try {
									this.aClass3_1.method100();
									for (@Pc(290) int local290 = 0; local290 < arg1; local290++) {
										this.aClass3Array1[local290].method100();
									}
									this.aClass3_2.method100();
								} catch (@Pc(307) Exception local307) {
								}
								this.aClass3Array1 = null;
								this.aClass3_1 = this.aClass3_2 = null;
								this.aFile3 = this.aFile2 = null;
							}
						}
					} catch (@Pc(324) Exception local324) {
					}
					if (local67 && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}
}
