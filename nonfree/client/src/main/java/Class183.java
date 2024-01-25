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
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class183 implements Runnable {

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "[Lclient!je;")
	public Class128[] aClass128Array1;

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "Lclient!ur;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "Lclient!je;")
	public Class128 aClass128_2 = null;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "Lclient!je;")
	public Class128 aClass128_3 = null;

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "Z")
	private boolean aBoolean337 = false;

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "Lclient!je;")
	public Class128 aClass128_1 = null;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "Lclient!ln;")
	private Class157 aClass157_6 = null;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "Lclient!ln;")
	private Class157 aClass157_5 = null;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
	private final int anInt5393;

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "Ljava/lang/String;")
	private String aString45;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class183(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		this.anInt5393 = arg1;
		Static282.aString42 = "Unknown";
		this.aString45 = arg2;
		Static282.aString44 = "1.1";
		try {
			Static282.aString42 = System.getProperty("java.vendor");
			Static282.aString44 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static282.aString41 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static282.aString41 = "Unknown";
		}
		Static282.aString38 = Static282.aString41.toLowerCase();
		try {
			Static282.aString40 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static282.aString40 = "";
		}
		try {
			Static282.aString39 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static282.aString39 = "";
		}
		try {
			Static282.aString43 = System.getProperty("user.home");
			if (Static282.aString43 != null) {
				Static282.aString43 = Static282.aString43 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static282.aString43 == null) {
			Static282.aString43 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static282.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static282.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static282.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static282.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean337 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z")
	public boolean method4138() {
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!ln;")
	public Class157 method4139(@OriginalArg(1) Class arg0) {
		return this.method4156(0, 20, 0, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ln;")
	public Class157 method4140(@OriginalArg(1) String arg0) {
		return this.method4156(0, 16, 0, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ln;")
	public Class157 method4141(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4156(0, 2, arg1, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	public void method4142() {
		synchronized (this) {
			this.aBoolean337 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass128_1 != null) {
			try {
				this.aClass128_1.method3091();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass128_3 != null) {
			try {
				this.aClass128_3.method3091();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass128Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass128Array1.length; local50++) {
				if (this.aClass128Array1[local50] != null) {
					try {
						this.aClass128Array1[local50].method3091();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass128_2 != null) {
			try {
				this.aClass128_2.method3091();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lclient!ln;")
	public Class157 method4143(@OriginalArg(0) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method4156(0, 8, 0, new Object[] { arg2, arg1, arg0 });
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ln;")
	public Class157 method4144(@OriginalArg(1) URL arg0) {
		return this.method4156(0, 4, 0, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)Lclient!ln;")
	public Class157 method4145() {
		return this.method4156(0, 5, 0, null);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method4146(@OriginalArg(1) String arg0) {
		return Static282.method4164(arg0, this.anInt5393, this.aString45);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!ln;")
	public Class157 method4147(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method4156(0, 9, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIII)Lclient!ln;")
	public Class157 method4148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return this.method4156(arg0 << 16, 6, (arg2 << 16) + arg1, null);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!ln;")
	private Class157 method4149(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 0) {
			this.aClass128_3 = null;
		}
		return this.method4156(0, 19, 0, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBIILjava/lang/Object;)Lclient!ln;")
	private Class157 method4150(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class157 local3 = new Class157();
		synchronized (local3) {
			local3.anObject12 = arg3;
			local3.anInt4668 = arg1;
			local3.anInt4669 = arg2;
			synchronized (this) {
				if (this.aClass157_6 == null) {
					this.aClass157_6 = this.aClass157_5 = local3;
				} else {
					this.aClass157_6.aClass157_4 = local3;
					this.aClass157_6 = local3;
				}
				this.notify();
			}
			if (arg0 != 26) {
				this.aString45 = null;
			}
			try {
				local3.wait();
			} catch (@Pc(55) InterruptedException local55) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method4151(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class157 local7 = this.method4150((byte) 26, 21, 0, arg0);
		return arg1 == -12226 ? (byte[]) local7.anObject13 : null;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Component;I[IILjava/awt/Point;I)Lclient!ln;")
	public Class157 method4152(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4) {
		return this.method4156(arg1, 17, arg3, new Object[] { arg0, arg2, arg4 });
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI)Lclient!ln;")
	public Class157 method4153(@OriginalArg(1) int arg0) {
		return this.method4156(0, 3, arg0, null);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!ln;")
	public Class157 method4154(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method4156(0, 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)Lclient!ur;")
	public Interface12 method4155() {
		return this.anInterface12_2;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!ln;")
	private Class157 method4156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3) {
		@Pc(11) Class157 local11 = new Class157();
		local11.anObject12 = arg3;
		local11.anInt4668 = arg1;
		local11.anInt4669 = arg2;
		synchronized (this) {
			if (this.aClass157_6 == null) {
				this.aClass157_6 = this.aClass157_5 = local11;
			} else {
				this.aClass157_6.aClass157_4 = local11;
				this.aClass157_6 = local11;
			}
			this.notify();
			return local11;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/String;Z)Lclient!ln;")
	public Class157 method4157(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method4156(0, 12, 0, arg0) : this.method4156(0, 13, 0, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ln;")
	private Class157 method4158(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 91) {
			Static282.anInt5394 = 34;
		}
		return this.method4156(0, 21, 0, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!ln;")
	public Class157 method4159(@OriginalArg(0) Frame arg0) {
		return this.method4156(0, 7, 0, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V")
	public void method4160() {
		Static282.aLong147 = Static250.method3737() + 5000L;
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)Lclient!ln;")
	private Class157 method4161(@OriginalArg(0) int arg0) {
		return arg0 >= -65 ? null : this.method4156(0, 18, 0, null);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lclient!ln;")
	private Class157 method4162(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg2) {
			this.method4156(-108, -85, 76, null);
		}
		return this.method4156(0, 15, arg1 ? 1 : 0, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!ln;")
	public Class157 method4163(@OriginalArg(1) Class arg0) {
		return this.method4156(0, 11, 0, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIBLjava/awt/Component;)Lclient!ln;")
	private Class157 method4165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		if (arg2 >= -118) {
			this.anApplet1 = null;
		}
		return this.method4156(local2.y + arg1, 14, arg0 + local2.x, null);
	}

	@OriginalMember(owner = "client!nv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class157 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean337) {
						return;
					}
					if (this.aClass157_5 != null) {
						local15 = this.aClass157_5;
						this.aClass157_5 = this.aClass157_5.aClass157_4;
						if (this.aClass157_5 == null) {
							this.aClass157_6 = null;
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
				@Pc(41) int local41 = local15.anInt4668;
				if (local41 == 1) {
					if (Static282.aLong147 > Static250.method3737()) {
						throw new IOException();
					}
					local15.anObject13 = new Socket(InetAddress.getByName((String) local15.anObject12), local15.anInt4669);
				} else if (local41 == 2) {
					@Pc(77) Thread local77 = new Thread((Runnable) local15.anObject12);
					local77.setDaemon(true);
					local77.start();
					local77.setPriority(local15.anInt4669);
					local15.anObject13 = local77;
				} else if (local41 == 4) {
					if (Static250.method3737() < Static282.aLong147) {
						throw new IOException();
					}
					local15.anObject13 = new DataInputStream(((URL) local15.anObject12).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local41 == 8) {
						local102 = (Object[]) local15.anObject12;
						local15.anObject13 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local41 == 9) {
						local102 = (Object[]) local15.anObject12;
						local15.anObject13 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local41 == 18) {
						@Pc(147) Clipboard local147 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject13 = local147.getContents(null);
					} else if (local41 == 19) {
						@Pc(162) Transferable local162 = (Transferable) local15.anObject12;
						@Pc(165) Clipboard local165 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local165.setContents(local162, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt4667 = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.anInt4667 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(ILjava/lang/Class;)V")
	public void method4166(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(17) Class[] local17 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(19) Runtime local19 = Runtime.getRuntime();
		@Pc(30) Method local30 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(40) Method local40;
		if (!Static282.aString38.startsWith("mac")) {
			local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local17);
			local30.invoke(local40, Boolean.TRUE);
			local40.invoke(local19, arg0, "jawt");
			local30.invoke(local40, Boolean.FALSE);
		}
		local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local17);
		local30.invoke(local40, Boolean.TRUE);
		if (!Static282.aString38.startsWith("win")) {
			throw new Exception();
		}
		local40.invoke(local19, arg0, this.method4146("sw3d.dll").toString());
		local30.invoke(local40, Boolean.FALSE);
	}
}
