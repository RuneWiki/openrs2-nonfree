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

@OriginalClass("client!uf")
public final class Class283 implements Runnable {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[Lclient!in;")
	public Class133[] aClass133Array1;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!ap;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Lclient!bca;")
	private Class20 aClass20_7 = null;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!in;")
	public Class133 aClass133_2 = null;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!in;")
	public Class133 aClass133_3 = null;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!bca;")
	private Class20 aClass20_8 = null;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Lclient!in;")
	public Class133 aClass133_4 = null;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private final int anInt8573;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "Ljava/lang/String;")
	private final String aString189;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class283(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static482.aString186 = "1.1";
		Static482.aString183 = "Unknown";
		this.anApplet1 = arg0;
		this.anInt8573 = arg1;
		this.aString189 = arg2;
		try {
			Static482.aString183 = System.getProperty("java.vendor");
			Static482.aString186 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static482.aString184 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static482.aString184 = "Unknown";
		}
		Static482.aString187 = Static482.aString184.toLowerCase();
		try {
			Static482.aString182 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static482.aString182 = "";
		}
		try {
			Static482.aString188 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static482.aString188 = "";
		}
		try {
			Static482.aString185 = System.getProperty("user.home");
			if (Static482.aString185 != null) {
				Static482.aString185 = Static482.aString185 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static482.aString185 == null) {
			Static482.aString185 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static482.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static482.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static482.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static482.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean616 = false;
		this.aThread5 = new Thread(this);
		this.aThread5.setPriority(10);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!bca;")
	private Class20 method7159(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.aClass133_4 = null;
		}
		return this.method7185(-1, arg0, 0, 0, 21);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!bca;")
	public Class20 method7160(@OriginalArg(1) Frame arg0) {
		return this.method7185(-1, arg0, 0, 0, 7);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!bca;")
	private Class20 method7161(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 2444) {
			Static482.aLong219 = -27L;
		}
		return this.method7185(-1, arg0, 0, 0, 19);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method7163(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -50) {
			return null;
		} else {
			@Pc(12) Class20 local12 = this.method7166(0, 21, false, arg0);
			return (byte[]) local12.anObject2;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lclient!bca;")
	public Class20 method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method7185(-1, arg1, arg0, 0, 2);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Lclient!bca;")
	public Class20 method7165() {
		return this.method7185(-1, null, 0, 0, 5);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIZLjava/lang/Object;)Lclient!bca;")
	private Class20 method7166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class20 local3 = new Class20();
		synchronized (local3) {
			local3.anObject1 = arg3;
			if (arg2) {
				return null;
			}
			local3.anInt594 = arg0;
			local3.anInt595 = arg1;
			synchronized (this) {
				if (this.aClass20_8 == null) {
					this.aClass20_8 = this.aClass20_7 = local3;
				} else {
					this.aClass20_8.aClass20_5 = local3;
					this.aClass20_8 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(58) InterruptedException local58) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIBII)Lclient!bca;")
	public Class20 method7167(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method7185(-1, null, (arg1 << 16) + arg2, arg0 << 16, 6);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!bca;")
	private Class20 method7168(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 92) {
			this.method7163(null, (byte) 19);
		}
		return this.method7185(-1, arg0, arg2 ? 1 : 0, 0, 15);
	}

	@OriginalMember(owner = "client!uf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class20 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean616) {
						return;
					}
					if (this.aClass20_7 != null) {
						local15 = this.aClass20_7;
						this.aClass20_7 = this.aClass20_7.aClass20_5;
						if (this.aClass20_7 == null) {
							this.aClass20_8 = null;
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
				@Pc(41) int local41 = local15.anInt595;
				if (local41 == 1) {
					if (Static143.method2502() < Static482.aLong219) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt594);
				} else if (local41 == 2) {
					@Pc(54) Thread local54 = new Thread((Runnable) local15.anObject1);
					local54.setDaemon(true);
					local54.start();
					local54.setPriority(local15.anInt594);
					local15.anObject2 = local54;
				} else if (local41 == 4) {
					if (Static482.aLong219 > Static143.method2502()) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(96) Object[] local96;
					if (local41 == 8) {
						local96 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local96[0]).getDeclaredMethod((String) local96[1], (Class[]) local96[2]);
					} else if (local41 == 9) {
						local96 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local96[0]).getDeclaredField((String) local96[1]);
					} else if (local41 == 18) {
						@Pc(137) Clipboard local137 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local137.getContents(null);
					} else if (local41 == 19) {
						@Pc(152) Transferable local152 = (Transferable) local15.anObject1;
						@Pc(155) Clipboard local155 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local155.setContents(local152, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt593 = 1;
			} catch (@Pc(190) ThreadDeath local190) {
				throw local190;
			} catch (@Pc(193) Throwable local193) {
				local15.anInt593 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;BI)Lclient!bca;")
	public Class20 method7169(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method7185(-1, arg0, arg1, 0, 1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public void method7170() {
		Static482.aLong219 = Static143.method2502() + 5000L;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lclient!bca;")
	public Class20 method7171(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return this.method7185(-1, new Object[] { arg1, arg2, arg0 }, 0, 0, 8);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!bca;")
	public Class20 method7172(@OriginalArg(0) URL arg0) {
		return this.method7185(-1, arg0, 0, 0, 4);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Lclient!ap;")
	public Interface1 method7173() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lclient!bca;")
	public Class20 method7174(@OriginalArg(0) int arg0) {
		return this.method7185(-1, null, arg0, 0, 3);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	public boolean method7175(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	public void method7176() {
		synchronized (this) {
			this.aBoolean616 = true;
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass133_2 != null) {
			try {
				this.aClass133_2.method3306();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass133_4 != null) {
			try {
				this.aClass133_4.method3306();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass133Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass133Array1.length; local44++) {
				if (this.aClass133Array1[local44] != null) {
					try {
						this.aClass133Array1[local44].method3306();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass133_3 != null) {
			try {
				this.aClass133_3.method3306();
			} catch (@Pc(74) IOException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([ILjava/awt/Point;IILjava/awt/Component;B)Lclient!bca;")
	public Class20 method7177(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4) {
		return this.method7185(-1, new Object[] { arg4, arg0, arg1 }, arg3, arg2, 17);
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)Lclient!bca;")
	private Class20 method7178(@OriginalArg(0) int arg0) {
		return arg0 == -30551 ? this.method7185(arg0 ^ 0x7756, null, 0, 0, 18) : null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBILjava/awt/Component;)Lclient!bca;")
	private Class20 method7179(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 == 113) {
			@Pc(7) Point local7 = arg3.getLocationOnScreen();
			return this.method7185(arg1 ^ 0xFFFFFF8E, null, local7.x + arg0, arg2 + local7.y, 14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!bca;")
	public Class20 method7180(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method7185(-1, arg0, 0, 0, 12) : this.method7185(-1, arg0, 0, 0, 13);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!bca;")
	public Class20 method7181(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method7185(-1, new Object[] { arg1, arg0 }, 0, 0, 9);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method7182(@OriginalArg(0) String arg0) {
		return Static482.method7162(arg0, this.aString189, this.anInt8573);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z")
	public boolean method7183() {
		return false;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/Class;B)V")
	private void method7184(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!Static482.aString187.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg0, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		if (arg1 != 45) {
			Static482.aString186 = null;
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!Static482.aString187.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg0, this.method7182("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!bca;")
	private Class20 method7185(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class20 local3 = new Class20();
		local3.anObject1 = arg1;
		local3.anInt594 = arg2;
		local3.anInt595 = arg4;
		synchronized (this) {
			if (this.aClass20_8 == null) {
				this.aClass20_8 = this.aClass20_7 = local3;
			} else {
				this.aClass20_8.aClass20_5 = local3;
				this.aClass20_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(Ljava/lang/String;I)Lclient!bca;")
	public Class20 method7186(@OriginalArg(0) String arg0) {
		return this.method7185(-1, arg0, 0, 0, 16);
	}
}
