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

@OriginalClass("client!jb")
public final class Class35 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "[Lclient!ia;")
	public Class32[] aClass32Array1;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!od;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public int anInt1350 = 0;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!ia;")
	public Class32 aClass32_3 = null;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!he;")
	private Class30 aClass30_4 = null;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!he;")
	private Class30 aClass30_5 = null;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!ia;")
	public Class32 aClass32_2 = null;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljava/io/File;")
	private File aFile3 = null;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class35(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static53.aString3 = "1.1";
		Static53.aString1 = "Unknown";
		this.anApplet1 = arg1;
		try {
			Static53.aString1 = System.getProperty("java.vendor");
			Static53.aString3 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static53.aString2 = System.getProperty("user.home");
			if (Static53.aString2 != null) {
				Static53.aString2 = Static53.aString2 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static53.aString2 == null) {
			Static53.aString2 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static53.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static53.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static53.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static53.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method984(arg2, arg3, arg4);
		}
		this.aBoolean48 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Lclient!od;")
	public Interface3 method979() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!he;")
	private Class30 method980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Object arg2) {
		@Pc(11) Class30 local11 = new Class30();
		local11.anObject2 = arg2;
		local11.anInt1208 = arg1;
		local11.anInt1207 = arg0;
		synchronized (this) {
			if (this.aClass30_5 == null) {
				this.aClass30_5 = this.aClass30_4 = local11;
			} else {
				this.aClass30_5.aClass30_2 = local11;
				this.aClass30_5 = local11;
			}
			this.notify();
			return local11;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!he;")
	public Class30 method981(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method980(2, arg0, arg1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!he;")
	public Class30 method982(@OriginalArg(1) int arg0) {
		return this.method980(3, arg0, null);
	}

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class30 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean48) {
						return;
					}
					if (this.aClass30_4 != null) {
						local15 = this.aClass30_4;
						this.aClass30_4 = this.aClass30_4.aClass30_2;
						if (this.aClass30_4 == null) {
							this.aClass30_5 = null;
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
				@Pc(41) int local41 = local15.anInt1207;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt1208);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject2);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1208);
					local15.anObject3 = local56;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(90) Object[] local90;
					if (local41 == 8) {
						local90 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local90[0]).getDeclaredMethod((String) local90[1], (Class[]) local90[2]);
					} else if (local41 == 9) {
						local90 = (Object[]) local15.anObject2;
						local15.anObject3 = ((Class) local90[0]).getDeclaredField((String) local90[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt1209 = 1;
			} catch (@Pc(148) ThreadDeath local148) {
				throw local148;
			} catch (@Pc(151) Throwable local151) {
				local15.anInt1209 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lclient!he;")
	public Class30 method983(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method980(8, 0, new Object[] { arg2, arg1, arg0 });
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;ZI)V")
	private void method984(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static53.aString2, "/tmp/", "" };
		@Pc(67) String[] local67 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(69) boolean local69 = false;
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(74) int local74 = 0; local74 < local67.length; local74++) {
				for (@Pc(77) int local77 = 0; local77 < local44.length; local77++) {
					try {
						@Pc(82) String local82 = local44[local77];
						if (local82.length() > 0 && !(new File(local82)).exists()) {
							continue;
						}
						@Pc(108) File local108 = new File(local82 + local67[local74]);
						@Pc(119) boolean local119;
						if (local71 == 1 && !local108.exists()) {
							local119 = local108.mkdir();
							if (!local119) {
								continue;
							}
						}
						@Pc(145) int local145;
						@Pc(130) File local130;
						if (!local69) {
							try {
								local130 = new File(local108, "uid.dat");
								if (local71 == 1 && (!local130.exists() || local130.length() < 4L)) {
									local145 = -1;
									@Pc(149) Random local149 = new Random();
									while (local145 == -1) {
										local145 = local149.nextInt();
									}
									@Pc(164) DataOutputStream local164 = new DataOutputStream(new FileOutputStream(local130));
									local164.writeInt(local145);
									local164.close();
								}
								if (local130.exists()) {
									local69 = true;
									@Pc(182) DataInputStream local182 = new DataInputStream(new FileInputStream(local130));
									this.anInt1350 = local182.readInt() + 1;
									local182.close();
								}
							} catch (@Pc(192) Exception local192) {
							}
						}
						if (this.aFile2 == null) {
							try {
								local108 = new File(local108, arg1);
								if (local71 == 1 && !local108.exists()) {
									local119 = local108.mkdir();
									if (!local119) {
										continue;
									}
								}
								local130 = new File(local108, "main_file_cache.dat2");
								if (local71 == 0 && !local130.exists()) {
									continue;
								}
								this.aClass32_2 = new Class32(local130, "rw", 52428800L);
								this.aClass32Array1 = new Class32[arg2];
								for (local145 = 0; local145 < arg2; local145++) {
									this.aClass32Array1[local145] = new Class32(new File(local108, "main_file_cache.idx" + local145), "rw", 1048576L);
								}
								this.aClass32_3 = new Class32(new File(local108, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile3 = this.aFile2 = local108;
							} catch (@Pc(291) Exception local291) {
								try {
									this.aClass32_2.method858();
									for (@Pc(297) int local297 = 0; local297 < arg2; local297++) {
										this.aClass32Array1[local297].method858();
									}
									this.aClass32_3.method858();
								} catch (@Pc(314) Exception local314) {
								}
								this.aClass32_2 = this.aClass32_3 = null;
								this.aFile3 = this.aFile2 = null;
								this.aClass32Array1 = null;
							}
						}
					} catch (@Pc(331) Exception local331) {
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!he;")
	public Class30 method985(@OriginalArg(0) URL arg0) {
		return this.method980(4, 0, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!he;")
	public Class30 method986(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method980(9, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!he;")
	public Class30 method987(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method980(1, arg1, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method988() {
		synchronized (this) {
			this.aBoolean48 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass32_2 != null) {
			try {
				this.aClass32_2.method858();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass32_3 != null) {
			try {
				this.aClass32_3.method858();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass32Array1 == null) {
			return;
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass32Array1.length; local44++) {
			if (this.aClass32Array1[local44] != null) {
				try {
					this.aClass32Array1[local44].method858();
				} catch (@Pc(58) IOException local58) {
				}
			}
		}
	}
}
