import java.applet.Applet;
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
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class182 implements Runnable {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Lclient!hba;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "[Lclient!hd;")
	public Class116[] aClass116Array1;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Lclient!hd;")
	public Class116 aClass116_2 = null;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "Lclient!qo;")
	private Class243 aClass243_3 = null;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!qo;")
	private Class243 aClass243_4 = null;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!hd;")
	public Class116 aClass116_1 = null;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "Lclient!hd;")
	public Class116 aClass116_3 = null;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
	private final int anInt5579;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString46;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class182(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static283.aString52 = "Unknown";
		this.anInt5579 = arg1;
		this.anApplet1 = arg0;
		this.aString46 = arg2;
		Static283.aString49 = "1.1";
		try {
			Static283.aString52 = System.getProperty("java.vendor");
			Static283.aString49 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static283.aString48 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static283.aString48 = "Unknown";
		}
		Static283.aString53 = Static283.aString48.toLowerCase();
		try {
			Static283.aString51 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static283.aString51 = "";
		}
		try {
			Static283.aString50 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static283.aString50 = "";
		}
		try {
			Static283.aString47 = System.getProperty("user.home");
			if (Static283.aString47 != null) {
				Static283.aString47 = Static283.aString47 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static283.aString47 == null) {
			Static283.aString47 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static283.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static283.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static283.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static283.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean386 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public void method4794() {
		synchronized (this) {
			this.aBoolean386 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass116_3 != null) {
			try {
				this.aClass116_3.method3371();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass116_1 != null) {
			try {
				this.aClass116_1.method3371();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass116Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass116Array1.length; local52++) {
				if (this.aClass116Array1[local52] != null) {
					try {
						this.aClass116Array1[local52].method3371();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass116_2 != null) {
			try {
				this.aClass116_2.method3371();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!qo;")
	private Class243 method4795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class243 local3 = new Class243();
		synchronized (local3) {
			local3.anInt6906 = arg1;
			local3.anInt6907 = arg0;
			if (arg2 != 170) {
				this.method4805(null);
			}
			local3.anObject13 = arg3;
			synchronized (this) {
				if (this.aClass243_3 == null) {
					this.aClass243_3 = this.aClass243_4 = local3;
				} else {
					this.aClass243_3.aClass243_6 = local3;
					this.aClass243_3 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(57) InterruptedException local57) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLjava/net/URL;)Lclient!qo;")
	public Class243 method4796(@OriginalArg(1) URL arg0) {
		return this.method4815(0, arg0, 4, 0);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Lclient!qo;")
	public Class243 method4797() {
		return this.method4815(0, null, 5, 0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!qo;")
	public Class243 method4798(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method4815(0, new Object[] { arg2, arg0, arg1 }, 8, 0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!qo;")
	public Class243 method4799(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method4815(arg0, arg1, 2, 0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z")
	public boolean method4800() {
		return false;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!qo;")
	private Class243 method4801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (arg1 != 10) {
			this.aBoolean386 = true;
		}
		@Pc(8) Point local8 = arg2.getLocationOnScreen();
		return this.method4815(local8.x + arg3, null, 14, local8.y + arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!qo;")
	private Class243 method4802(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		return arg0 <= 83 ? null : this.method4815(arg1 ? 1 : 0, arg2, 15, 0);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)Lclient!hba;")
	public Interface3 method4803() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method4804(@OriginalArg(0) String arg0) {
		return Static283.method4806(this.aString46, arg0, this.anInt5579);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!qo;")
	public Class243 method4805(@OriginalArg(1) Frame arg0) {
		return this.method4815(0, arg0, 7, 0);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method4807(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -46) {
			return null;
		} else {
			@Pc(12) Class243 local12 = this.method4795(0, 21, 170, arg0);
			return (byte[]) local12.anObject12;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;I[III)Lclient!qo;")
	public Class243 method4808(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method4815(arg3, new Object[] { arg0, arg2, arg1 }, 17, arg4);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!qo;")
	public Class243 method4809(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method4815(0, new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Lclient!qo;")
	private Class243 method4810(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.method4812(-18, 24, -125);
		}
		return this.method4815(0, null, 18, 0);
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(Ljava/lang/String;I)Lclient!qo;")
	public Class243 method4811(@OriginalArg(0) String arg0) {
		return this.method4815(0, arg0, 16, 0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIII)Lclient!qo;")
	public Class243 method4812(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method4815(arg1 + (arg0 << 16), null, 6, arg2 << 16);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!qo;")
	private Class243 method4813(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 == 0 ? this.method4815(0, arg1, 19, 0) : null;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;ZZ)Lclient!qo;")
	public Class243 method4814(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method4815(0, arg0, 12, 0) : this.method4815(0, arg0, 13, 0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBLjava/lang/Object;II)Lclient!qo;")
	private Class243 method4815(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class243 local9 = new Class243();
		local9.anInt6907 = arg0;
		local9.anInt6906 = arg2;
		local9.anObject13 = arg1;
		synchronized (this) {
			if (this.aClass243_3 == null) {
				this.aClass243_3 = this.aClass243_4 = local9;
			} else {
				this.aClass243_3.aClass243_6 = local9;
				this.aClass243_3 = local9;
			}
			this.notify();
			return local9;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLjava/lang/String;)Lclient!qo;")
	private Class243 method4816(@OriginalArg(1) String arg0) {
		return this.method4815(0, arg0, 21, 0);
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)V")
	public void method4817() {
		Static283.aLong144 = (long) 5000 + Static93.method2172();
	}

	@OriginalMember(owner = "client!lp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class243 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean386) {
						return;
					}
					if (this.aClass243_4 != null) {
						local15 = this.aClass243_4;
						this.aClass243_4 = this.aClass243_4.aClass243_6;
						if (this.aClass243_4 == null) {
							this.aClass243_3 = null;
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
				@Pc(41) int local41 = local15.anInt6906;
				if (local41 == 1) {
					if (Static283.aLong144 > Static93.method2172()) {
						throw new IOException();
					}
					local15.anObject12 = new Socket(InetAddress.getByName((String) local15.anObject13), local15.anInt6907);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject13);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt6907);
					local15.anObject12 = local56;
				} else if (local41 == 4) {
					if (Static93.method2172() < Static283.aLong144) {
						throw new IOException();
					}
					local15.anObject12 = new DataInputStream(((URL) local15.anObject13).openStream());
				} else {
					@Pc(141) Object[] local141;
					if (local41 == 8) {
						local141 = (Object[]) local15.anObject13;
						local15.anObject12 = ((Class) local141[0]).getDeclaredMethod((String) local141[1], (Class[]) local141[2]);
					} else if (local41 == 9) {
						local141 = (Object[]) local15.anObject13;
						local15.anObject12 = ((Class) local141[0]).getDeclaredField((String) local141[1]);
					} else if (local41 == 18) {
						@Pc(109) Clipboard local109 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject12 = local109.getContents(null);
					} else if (local41 == 19) {
						@Pc(129) Transferable local129 = (Transferable) local15.anObject13;
						@Pc(132) Clipboard local132 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local132.setContents(local129, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6905 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt6905 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!qo;")
	public Class243 method4818(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method4815(arg1, arg0, 1, 0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lclient!qo;")
	public Class243 method4819(@OriginalArg(1) int arg0) {
		return this.method4815(arg0, null, 3, 0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	public boolean method4820(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/Class;)V")
	private void method4821(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		if (arg0 != 13558) {
			return;
		}
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!Static283.aString53.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local29.invoke(local39, Boolean.TRUE);
			local39.invoke(local18, arg1, "jawt");
			local29.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local29.invoke(local39, Boolean.TRUE);
		if (!Static283.aString53.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local18, arg1, this.method4804("sw3d.dll").toString());
		local29.invoke(local39, Boolean.FALSE);
	}
}
