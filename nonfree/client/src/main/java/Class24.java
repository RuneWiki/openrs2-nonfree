import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class24 implements Runnable {

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Lclient!pf;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "[Lclient!wh;")
	public Class99[] aClass99Array1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!nc;")
	private Class65 aClass65_1 = null;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1 = null;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!wh;")
	public Class99 aClass99_3 = null;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Lclient!nc;")
	private Class65 aClass65_2 = null;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!wh;")
	public Class99 aClass99_1 = null;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Ljava/io/File;")
	private File aFile2 = null;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!wh;")
	public Class99 aClass99_2 = null;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class24(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static30.aString3 = "Unknown";
		Static30.aString1 = "1.1";
		this.anApplet1 = arg1;
		try {
			Static30.aString3 = System.getProperty("java.vendor");
			Static30.aString1 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static30.aString2 = System.getProperty("user.home");
			if (Static30.aString2 != null) {
				Static30.aString2 = Static30.aString2 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (Static30.aString2 == null) {
			Static30.aString2 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				Static30.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static30.aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				Static30.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static30.aMethod1 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		if (arg0) {
			this.method562(arg4, arg3, arg2);
		}
		this.aBoolean49 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!nc;")
	public Class65 method555(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method564(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!nc;")
	public Class65 method556(@OriginalArg(0) URL arg0) {
		return this.method564(0, 4, arg0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Lclient!pf;")
	public Interface2 method557() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	public void method558() {
		synchronized (this) {
			this.aBoolean49 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass99_3 != null) {
			try {
				this.aClass99_3.method3404();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass99_2 != null) {
			try {
				this.aClass99_2.method3404();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass99Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass99Array1.length; local44++) {
				if (this.aClass99Array1[local44] != null) {
					try {
						this.aClass99Array1[local44].method3404();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass99_1 != null) {
			try {
				this.aClass99_1.method3404();
			} catch (@Pc(74) IOException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!nc;")
	public Class65 method559(@OriginalArg(1) int arg0) {
		return this.method564(arg0, 3, null);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!nc;")
	public Class65 method560(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method564(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lclient!nc;")
	public Class65 method561(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method564(0, 8, new Object[] { arg0, arg1, arg2 });
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;BI)V")
	private void method562(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Static30.aString2, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(74) int local74 = 0; local74 < local69.length; local74++) {
				for (@Pc(77) int local77 = 0; local77 < local42.length; local77++) {
					try {
						@Pc(82) String local82 = local42[local77];
						if (local82.length() > 0 && !(new File(local82)).exists()) {
							continue;
						}
						@Pc(108) File local108 = new File(local82 + local69[local74]);
						@Pc(117) boolean local117;
						if (local71 == 1 && !local108.exists()) {
							local117 = local108.mkdir();
							if (!local117) {
								continue;
							}
						}
						@Pc(129) File local129;
						if (this.aClass99_1 == null) {
							try {
								local129 = new File(local108, "random.dat");
								if (local71 == 1 || local129.exists()) {
									this.aClass99_1 = new Class99(local129, "rw", 25L);
								}
							} catch (@Pc(145) Exception local145) {
								this.aClass99_1 = null;
							}
						}
						if (this.aFile2 == null) {
							try {
								local108 = new File(local108, arg1);
								if (local71 == 1 && !local108.exists()) {
									local117 = local108.mkdir();
									if (!local117) {
										continue;
									}
								}
								local129 = new File(local108, "main_file_cache.dat2");
								if (local71 == 0 && !local129.exists()) {
									continue;
								}
								this.aClass99_3 = new Class99(local129, "rw", 104857600L);
								this.aClass99Array1 = new Class99[arg0];
								for (@Pc(198) int local198 = 0; local198 < arg0; local198++) {
									this.aClass99Array1[local198] = new Class99(new File(local108, "main_file_cache.idx" + local198), "rw", 1048576L);
								}
								this.aClass99_2 = new Class99(new File(local108, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile1 = this.aFile2 = local108;
							} catch (@Pc(243) Exception local243) {
								try {
									this.aClass99_3.method3404();
									for (@Pc(249) int local249 = 0; local249 < arg0; local249++) {
										this.aClass99Array1[local249].method3404();
									}
									this.aClass99_2.method3404();
								} catch (@Pc(266) Exception local266) {
								}
								this.aClass99Array1 = null;
								this.aClass99_3 = this.aClass99_2 = null;
								this.aFile1 = this.aFile2 = null;
							}
						}
					} catch (@Pc(283) Exception local283) {
					}
					if (this.aClass99_1 != null && this.aFile2 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile2 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!nc;")
	public Class65 method563(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method564(0, 9, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class65 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean49) {
						return;
					}
					if (this.aClass65_2 != null) {
						local15 = this.aClass65_2;
						this.aClass65_2 = this.aClass65_2.aClass65_8;
						if (this.aClass65_2 == null) {
							this.aClass65_1 = null;
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
				@Pc(41) int local41 = local15.anInt2679;
				if (local41 == 1) {
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt2680);
				} else if (local41 == 2) {
					@Pc(129) Thread local129 = new Thread((Runnable) local15.anObject4);
					local129.setDaemon(true);
					local129.start();
					local129.setPriority(local15.anInt2680);
					local15.anObject3 = local129;
				} else if (local41 == 4) {
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(76) Object[] local76;
					if (local41 == 8) {
						local76 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local76[0]).getDeclaredMethod((String) local76[1], (Class[]) local76[2]);
					} else if (local41 == 9) {
						local76 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local76[0]).getDeclaredField((String) local76[1]);
					} else {
						throw new Exception();
					}
				}
				local15.anInt2681 = 1;
			} catch (@Pc(146) ThreadDeath local146) {
				throw local146;
			} catch (@Pc(149) Throwable local149) {
				local15.anInt2681 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!nc;")
	private Class65 method564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		@Pc(3) Class65 local3 = new Class65();
		local3.anInt2680 = arg0;
		local3.anObject4 = arg2;
		local3.anInt2679 = arg1;
		synchronized (this) {
			if (this.aClass65_1 == null) {
				this.aClass65_1 = this.aClass65_2 = local3;
			} else {
				this.aClass65_1.aClass65_8 = local3;
				this.aClass65_1 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
