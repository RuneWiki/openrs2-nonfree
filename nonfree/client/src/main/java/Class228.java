import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class228 implements Runnable {

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "Z")
	public boolean aBoolean613 = false;

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "Lclient!wp;")
	private Class376 aClass376_25 = null;

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "Lclient!is;")
	public Class150 aClass150_3 = null;

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "Lclient!is;")
	public Class150 aClass150_2 = null;

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "Z")
	public boolean aBoolean614 = false;

	@OriginalMember(owner = "client!nga", name = "u", descriptor = "Z")
	private boolean aBoolean615 = false;

	@OriginalMember(owner = "client!nga", name = "z", descriptor = "Lclient!is;")
	public Class150 aClass150_4 = null;

	@OriginalMember(owner = "client!nga", name = "x", descriptor = "Lclient!wp;")
	private Class376 aClass376_26 = null;

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "[Lclient!is;")
	public Class150[] aClass150Array1;

	@OriginalMember(owner = "client!nga", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "Ljava/lang/Object;")
	private Object anObject12;

	@OriginalMember(owner = "client!nga", name = "p", descriptor = "Lclient!lga;")
	private Class198 aClass198_1;

	@OriginalMember(owner = "client!nga", name = "A", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "Lclient!qha;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!nga", name = "s", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static372.aString76 = "Unknown";
		Static372.aString83 = "1.1";
		Static372.anInt7076 = arg0;
		this.aBoolean614 = arg3;
		Static372.aString77 = arg1;
		try {
			Static372.aString76 = System.getProperty("java.vendor");
			Static372.aString83 = System.getProperty("java.version");
		} catch (@Pc(44) Exception local44) {
		}
		if (Static372.aString76.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean613 = true;
		}
		try {
			Static372.aString80 = System.getProperty("os.name");
		} catch (@Pc(59) Exception local59) {
			Static372.aString80 = "Unknown";
		}
		Static372.aString79 = Static372.aString80.toLowerCase();
		try {
			Static372.aString78 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(70) Exception local70) {
			Static372.aString78 = "";
		}
		try {
			Static372.aString81 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(78) Exception local78) {
			Static372.aString81 = "";
		}
		try {
			Static372.aString82 = System.getProperty("user.home");
			if (Static372.aString82 != null) {
				Static372.aString82 = Static372.aString82 + "/";
			}
		} catch (@Pc(96) Exception local96) {
		}
		if (Static372.aString82 == null) {
			Static372.aString82 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(106) Throwable local106) {
		}
		if (!this.aBoolean613) {
			try {
				Static372.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(122) Exception local122) {
			}
			try {
				Static372.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(135) Exception local135) {
			}
		}
		Static129.method2911(Static372.aString77, Static372.anInt7076);
		if (this.aBoolean614) {
			this.aClass150_3 = new Class150(Static129.method2913(null, "random.dat", Static372.anInt7076), "rw", 25L);
			this.aClass150_4 = new Class150(Static129.method2912("main_file_cache.dat2"), "rw", 209715200L);
			this.aClass150_2 = new Class150(Static129.method2912("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass150Array1 = new Class150[arg2];
			for (@Pc(181) int local181 = 0; local181 < arg2; local181++) {
				this.aClass150Array1[local181] = new Class150(Static129.method2912("main_file_cache.idx" + local181), "rw", 1048576L);
			}
			if (this.aBoolean613) {
				try {
					this.anObject13 = Class.forName("Class287").getDeclaredConstructor().newInstance();
				} catch (@Pc(214) Throwable local214) {
				}
			}
			try {
				if (this.aBoolean613) {
					this.aClass198_1 = new Class198();
				} else {
					this.anObject12 = Class.forName("Class283").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(231) Throwable local231) {
			}
			try {
				if (this.aBoolean613) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject14 = Class.forName("Class266").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(247) Throwable local247) {
			}
		}
		if (this.aBoolean614 && !this.aBoolean613) {
			@Pc(257) ThreadGroup local257 = Thread.currentThread().getThreadGroup();
			for (@Pc(260) ThreadGroup local260 = local257.getParent(); local260 != null; local260 = local260.getParent()) {
				local257 = local260;
			}
			@Pc(271) Thread[] local271 = new Thread[1000];
			local257.enumerate(local271);
			for (@Pc(277) int local277 = 0; local277 < local271.length; local277++) {
				if (local271[local277] != null && local271[local277].getName().startsWith("AWT")) {
					local271[local277].setPriority(1);
				}
			}
		}
		this.aBoolean615 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
	public void method5929() {
		synchronized (this) {
			this.aBoolean615 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass150_4 != null) {
			try {
				this.aClass150_4.method4653();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass150_2 != null) {
			try {
				this.aClass150_2.method4653();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass150Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass150Array1.length; local48++) {
				if (this.aClass150Array1[local48] != null) {
					try {
						this.aClass150Array1[local48].method4653();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass150_3 != null) {
			try {
				this.aClass150_3.method4653();
			} catch (@Pc(78) IOException local78) {
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
	public void method5931() {
		Static372.aLong166 = (long) 5000 + Static444.method6719();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([BILjava/io/File;)Z")
	public boolean method5932(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(B)Lclient!wp;")
	public Class376 method5933() {
		return this.method5942(0, 5, null, 0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([IILjava/awt/Component;Ljava/awt/Point;II)Lclient!wp;")
	public Class376 method5934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) int arg4) {
		return this.method5942(arg1, 17, new Object[] { arg2, arg0, arg3 }, arg4);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IZLjava/lang/String;)Lclient!wp;")
	public Class376 method5935(@OriginalArg(2) String arg0) {
		return this.method5942(0, 12, arg0, 0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Class;Ljava/lang/Class;)Lclient!wp;")
	public Class376 method5936(@OriginalArg(0) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method5942(0, 8, new Object[] { arg2, arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(B)Z")
	public boolean method5937() {
		if (!this.aBoolean614) {
			return false;
		} else if (this.aBoolean613) {
			return this.aClass198_1 != null;
		} else {
			return this.anObject12 != null;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lclient!wp;")
	public Class376 method5938(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method5942(0, 2, arg1, arg0);
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public Object method5939() {
		return this.anObject13;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/String;ZII)Lclient!wp;")
	public Class376 method5940(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		return this.method5942(0, arg1 ? 22 : 1, arg0, arg2);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IBILjava/lang/Object;I)Lclient!wp;")
	private Class376 method5942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class376 local3 = new Class376();
		local3.anInt10513 = arg1;
		local3.anInt10512 = arg3;
		local3.anInt10511 = arg0;
		local3.anObject20 = arg2;
		synchronized (this) {
			if (this.aClass376_26 == null) {
				this.aClass376_26 = this.aClass376_25 = local3;
			} else {
				this.aClass376_26.aClass376_38 = local3;
				this.aClass376_26 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!nga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class376 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean615) {
						return;
					}
					if (this.aClass376_25 != null) {
						local15 = this.aClass376_25;
						this.aClass376_25 = this.aClass376_25.aClass376_38;
						if (this.aClass376_25 == null) {
							this.aClass376_26 = null;
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
				@Pc(41) int local41 = local15.anInt10513;
				if (local41 == 1) {
					if (Static372.aLong166 > Static444.method6719()) {
						throw new IOException();
					}
					local15.anObject19 = new Socket(InetAddress.getByName((String) local15.anObject20), local15.anInt10512);
				} else if (local41 == 22) {
					if (Static372.aLong166 > Static444.method6719()) {
						throw new IOException();
					}
					try {
						local15.anObject19 = Static556.method7826(local15.anInt10512, (String) local15.anObject20).method8210();
					} catch (@Pc(73) IOException_Sub1 local73) {
						local15.anObject19 = local73.getMessage();
						throw local73;
					}
				} else if (local41 == 2) {
					@Pc(832) Thread local832 = new Thread((Runnable) local15.anObject20);
					local832.setDaemon(true);
					local832.start();
					local832.setPriority(local15.anInt10512);
					local15.anObject19 = local832;
				} else if (local41 == 4) {
					if (Static444.method6719() < Static372.aLong166) {
						throw new IOException();
					}
					local15.anObject19 = new DataInputStream(((URL) local15.anObject20).openStream());
				} else {
					@Pc(367) Object[] local367;
					if (local41 == 8) {
						local367 = (Object[]) local15.anObject20;
						if (this.aBoolean614 && ((Class) local367[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject19 = ((Class) local367[0]).getDeclaredMethod((String) local367[1], (Class[]) local367[2]);
					} else if (local41 == 9) {
						local367 = (Object[]) local15.anObject20;
						if (this.aBoolean614 && ((Class) local367[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject19 = ((Class) local367[0]).getDeclaredField((String) local367[1]);
					} else if (local41 == 18) {
						@Pc(122) Clipboard local122 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject19 = local122.getContents(null);
					} else if (local41 == 19) {
						@Pc(755) Transferable local755 = (Transferable) local15.anObject20;
						@Pc(758) Clipboard local758 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local758.setContents(local755, null);
					} else if (this.aBoolean614) {
						@Pc(189) String local189;
						if (local41 == 3) {
							if (Static372.aLong166 > Static444.method6719()) {
								throw new IOException();
							}
							local189 = (local15.anInt10512 >> 24 & 0xFF) + "." + (local15.anInt10512 >> 16 & 0xFF) + "." + (local15.anInt10512 >> 8 & 0xFF) + "." + (local15.anInt10512 & 0xFF);
							local15.anObject19 = InetAddress.getByName(local189).getHostName();
						} else if (local41 == 21) {
							if (Static372.aLong166 > Static444.method6719()) {
								throw new IOException();
							}
							local15.anObject19 = InetAddress.getByName((String) local15.anObject20).getAddress();
						} else if (local41 == 5) {
							if (this.aBoolean613) {
								local15.anObject19 = this.aClass198_1.method5369();
							} else {
								local15.anObject19 = Class.forName("Class283").getMethod("listmodes").invoke(this.anObject12);
							}
						} else if (local41 == 6) {
							@Pc(610) Frame local610 = new Frame("Jagex Full Screen");
							local15.anObject19 = local610;
							local610.setResizable(false);
							if (this.aBoolean613) {
								this.aClass198_1.method5370(local15.anInt10512 & 0xFFFF, local610, local15.anInt10512 >>> 16, local15.anInt10511 >> 16, local15.anInt10511 & 0xFFFF);
							} else {
								Class.forName("Class283").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject12, local610, Integer.valueOf(local15.anInt10512 >>> 16), new Integer(local15.anInt10512 & 0xFFFF), Integer.valueOf(local15.anInt10511 >> 16), new Integer(local15.anInt10511 & 0xFFFF));
							}
						} else if (local41 != 7) {
							@Pc(253) Class150 local253;
							if (local41 == 12) {
								local253 = Static372.method5941(Static372.anInt7076, Static372.aString77, (String) local15.anObject20);
								local15.anObject19 = local253;
							} else if (local41 == 13) {
								local253 = Static372.method5941(Static372.anInt7076, "", (String) local15.anObject20);
								local15.anObject19 = local253;
							} else if (this.aBoolean614 && local41 == 14) {
								@Pc(521) int local521 = local15.anInt10512;
								@Pc(524) int local524 = local15.anInt10511;
								if (this.aBoolean613) {
									this.aCallback_Sub1_1.method6901(local524, local521);
								} else {
									Class.forName("Class266").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject14, Integer.valueOf(local521), new Integer(local524));
								}
							} else if (this.aBoolean614 && local41 == 15) {
								@Pc(465) boolean local465 = local15.anInt10512 != 0;
								@Pc(469) Component local469 = (Component) local15.anObject20;
								if (this.aBoolean613) {
									this.aCallback_Sub1_1.method6900(local465, local469);
								} else {
									Class.forName("Class266").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.anObject14, local469, Boolean.valueOf(local465));
								}
							} else if (!this.aBoolean613 && local41 == 17) {
								local367 = (Object[]) local15.anObject20;
								Class.forName("Class266").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.anObject14, (Component) local367[0], (int[]) local367[1], Integer.valueOf(local15.anInt10512), new Integer(local15.anInt10511), (Point) local367[2]);
							} else if (local41 == 16) {
								try {
									if (!Static372.aString79.startsWith("win")) {
										throw new Exception();
									}
									local189 = (String) local15.anObject20;
									if (!local189.startsWith("http://") && !local189.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(312) String local312 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(314) int local314 = 0; local314 < local189.length(); local314++) {
										if (local312.indexOf(local189.charAt(local314)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local189 + "\"");
									local15.anObject19 = null;
								} catch (@Pc(353) Exception local353) {
									local15.anObject19 = local353;
									throw local353;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean613) {
							this.aClass198_1.method5368((Frame) local15.anObject20);
						} else {
							Class.forName("Class283").getMethod("exit").invoke(this.anObject12);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt10510 = 1;
			} catch (@Pc(874) ThreadDeath local874) {
				throw local874;
			} catch (@Pc(877) Throwable local877) {
				local15.anInt10510 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)Lclient!wp;")
	public Class376 method5943(@OriginalArg(0) int arg0) {
		return this.method5942(0, 3, null, arg0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!wp;")
	public Class376 method5944(@OriginalArg(0) Frame arg0) {
		return this.method5942(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/net/URL;Z)Lclient!wp;")
	public Class376 method5945(@OriginalArg(0) URL arg0) {
		return this.method5942(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BLjava/lang/String;)Lclient!wp;")
	public Class376 method5946(@OriginalArg(1) String arg0) {
		return this.method5942(0, 16, arg0, 0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIZ)Lclient!wp;")
	public Class376 method5947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method5942(arg2 << 16, 6, null, arg0 + (arg1 << 16));
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lclient!wp;")
	public Class376 method5948(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method5942(0, 9, new Object[] { arg0, arg1 }, 0);
	}
}
