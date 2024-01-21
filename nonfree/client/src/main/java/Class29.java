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

@OriginalClass("client!ha")
public final class Class29 implements Runnable {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!ma;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "[Lclient!he;")
	public Class31[] aClass31Array1;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!ad;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!he;")
	public Class31 aClass31_1 = null;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public int anInt1084 = 0;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!he;")
	public Class31 aClass31_2 = null;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!vb;")
	private Class70 aClass70_4 = null;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!vb;")
	private Class70 aClass70_3 = null;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress1;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class29(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		Static43.aString2 = "Unknown";
		this.anInetAddress1 = arg2;
		this.anApplet1 = arg1;
		Static43.aString1 = "1.1";
		try {
			Static43.aString2 = System.getProperty("java.vendor");
			Static43.aString1 = System.getProperty("java.version");
		} catch (@Pc(46) Exception local46) {
		}
		try {
			Static43.aString3 = System.getProperty("user.home");
			if (Static43.aString3 != null) {
				Static43.aString3 = Static43.aString3 + "/";
			}
		} catch (@Pc(62) Exception local62) {
		}
		if (Static43.aString3 == null) {
			Static43.aString3 = "~/";
		}
		try {
			if (arg1 == null) {
				Static43.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static43.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (arg1 == null) {
				Static43.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static43.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		if (arg0) {
			this.method773(arg4, arg3, arg5);
		}
		this.aBoolean47 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lclient!vb;")
	public Class70 method772(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return this.method783(9, 0, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method773(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", Static43.aString3, "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(80) boolean local80 = false;
		for (@Pc(82) int local82 = 0; local82 < 2; local82++) {
			for (@Pc(85) int local85 = 0; local85 < local78.length; local85++) {
				for (@Pc(88) int local88 = 0; local88 < local55.length; local88++) {
					try {
						@Pc(93) String local93 = local55[local88];
						if (local93.length() > 0 && !(new File(local93)).exists()) {
							continue;
						}
						@Pc(116) File local116 = new File(local93 + local78[local85]);
						@Pc(127) boolean local127;
						if (local82 == 1 && !local116.exists()) {
							local127 = local116.mkdir();
							if (!local127) {
								continue;
							}
						}
						@Pc(153) int local153;
						@Pc(138) File local138;
						if (!local80) {
							try {
								local138 = new File(local116, "uid.dat");
								if (local82 == 1 && (!local138.exists() || local138.length() < 4L)) {
									local153 = -1;
									@Pc(157) Random local157 = new Random();
									while (local153 == -1) {
										local153 = local157.nextInt();
									}
									@Pc(173) DataOutputStream local173 = new DataOutputStream(new FileOutputStream(local138));
									local173.writeInt(local153);
									local173.close();
								}
								if (local138.exists()) {
									local80 = true;
									@Pc(191) DataInputStream local191 = new DataInputStream(new FileInputStream(local138));
									this.anInt1084 = local191.readInt() + 1;
									local191.close();
								}
							} catch (@Pc(201) Exception local201) {
							}
						}
						if (this.aFile1 == null) {
							try {
								local116 = new File(local116, arg0);
								if (local82 == 1 && !local116.exists()) {
									local127 = local116.mkdir();
									if (!local127) {
										continue;
									}
								}
								local138 = new File(local116, "main_file_cache.dat2");
								if (local82 == 0 && !local138.exists()) {
									continue;
								}
								this.aClass31_1 = new Class31(local138, "rw", 52428800L);
								this.aClass31Array1 = new Class31[arg2];
								for (local153 = 0; local153 < arg2; local153++) {
									this.aClass31Array1[local153] = new Class31(new File(local116, "main_file_cache.idx" + local153), "rw", 1048576L);
								}
								this.aClass31_2 = new Class31(new File(local116, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile2 = this.aFile1 = local116;
							} catch (@Pc(297) Exception local297) {
								try {
									this.aClass31_1.method802();
									for (@Pc(303) int local303 = 0; local303 < arg2; local303++) {
										this.aClass31Array1[local303].method802();
									}
									this.aClass31_2.method802();
								} catch (@Pc(324) Exception local324) {
								}
								this.aFile2 = this.aFile1 = null;
								this.aClass31_1 = this.aClass31_2 = null;
								this.aClass31Array1 = null;
							}
						}
					} catch (@Pc(341) Exception local341) {
					}
					if (local80 && this.aFile1 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile1 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!vb;")
	public Class70 method774(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method783(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lclient!vb;")
	public Class70 method775() {
		return null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!vb;")
	public Class70 method776(@OriginalArg(0) int arg0) {
		return this.method783(1, arg0, null);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/net/URL;)Lclient!vb;")
	public Class70 method777(@OriginalArg(1) URL arg0) {
		return this.method783(4, 0, arg0);
	}

	@OriginalMember(owner = "client!ha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class70 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean47) {
						return;
					}
					if (this.aClass70_4 != null) {
						local15 = this.aClass70_4;
						this.aClass70_4 = this.aClass70_4.aClass70_8;
						if (this.aClass70_4 == null) {
							this.aClass70_3 = null;
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
				@Pc(41) int local41 = local15.anInt2693;
				if (local41 == 1) {
					local15.anObject3 = new Socket(this.anInetAddress1, local15.anInt2694);
				} else if (local41 == 2) {
					@Pc(127) Thread local127 = new Thread((Runnable) local15.anObject4);
					local127.setDaemon(true);
					local127.start();
					local127.setPriority(local15.anInt2694);
					local15.anObject3 = local127;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(79) Object[] local79;
					if (local41 == 9) {
						local79 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local79[0]).getDeclaredMethod((String) local79[1], (Class[]) local79[2]);
					} else if (local41 == 10) {
						local79 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local79[0]).getDeclaredField((String) local79[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2692 = 1;
			} catch (@Pc(144) Exception local144) {
				local15.anInt2692 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lclient!vb;")
	public Class70 method778(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method783(10, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lclient!ma;")
	public Interface4 method779() {
		return this.anInterface4_2;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)Lclient!ad;")
	public Interface1 method780() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)Lclient!vb;")
	public Class70 method781(@OriginalArg(0) int arg0) {
		return this.method783(3, arg0, null);
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public void method782() {
		synchronized (this) {
			this.aBoolean47 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.anInterface1_2 != null) {
			this.anInterface1_2.method68();
		}
		if (this.aClass31_1 != null) {
			try {
				this.aClass31_1.method802();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass31_2 != null) {
			try {
				this.aClass31_2.method802();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass31Array1 == null) {
			return;
		}
		for (@Pc(55) int local55 = 0; local55 < this.aClass31Array1.length; local55++) {
			if (this.aClass31Array1[local55] != null) {
				try {
					this.aClass31Array1[local55].method802();
				} catch (@Pc(69) IOException local69) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBILjava/lang/Object;)Lclient!vb;")
	private Class70 method783(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(3) Class70 local3 = new Class70();
		local3.anInt2694 = arg1;
		local3.anInt2693 = arg0;
		local3.anObject4 = arg2;
		synchronized (this) {
			if (this.aClass70_3 == null) {
				this.aClass70_3 = this.aClass70_4 = local3;
			} else {
				this.aClass70_3.aClass70_8 = local3;
				this.aClass70_3 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
