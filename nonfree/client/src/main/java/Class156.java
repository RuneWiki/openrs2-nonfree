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
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class156 implements Runnable {

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!qg;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "[Lclient!ia;")
	public Class106[] aClass106Array1;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "Lclient!ia;")
	public Class106 aClass106_1 = null;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "Lclient!kj;")
	private Class133 aClass133_7 = null;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Z")
	private boolean aBoolean315 = false;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "Lclient!ia;")
	public Class106 aClass106_2 = null;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "Lclient!kj;")
	private Class133 aClass133_8 = null;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!ia;")
	public Class106 aClass106_3 = null;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class156(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static218.aString42 = "1.1";
		Static218.aString47 = "Unknown";
		try {
			Static218.aString47 = System.getProperty("java.vendor");
			Static218.aString42 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static218.aString48 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static218.aString48 = "Unknown";
		}
		Static218.aString43 = Static218.aString48.toLowerCase();
		try {
			Static218.aString45 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static218.aString45 = "";
		}
		try {
			Static218.aString46 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static218.aString46 = "";
		}
		try {
			Static218.aString44 = System.getProperty("user.home");
			if (Static218.aString44 != null) {
				Static218.aString44 = Static218.aString44 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static218.aString44 == null) {
			Static218.aString44 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static218.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static218.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static218.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static218.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean315 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!kj;")
	public Class133 method3637(@OriginalArg(1) Frame arg0) {
		return this.method3644(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/net/URL;)Lclient!kj;")
	public Class133 method3638(@OriginalArg(1) URL arg0) {
		return this.method3644(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)Lclient!kj;")
	private Class133 method3639(@OriginalArg(0) byte arg0) {
		if (arg0 < 2) {
			this.method3642(null, 30);
		}
		return this.method3644(18, null, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Lclient!kj;")
	public Class133 method3640() {
		return this.method3644(5, null, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZI)Lclient!kj;")
	public Class133 method3641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return this.method3644(6, null, (arg0 << 16) + arg1, arg2 << 16);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;BI)Lclient!kj;")
	public Class133 method3642(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method3644(1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!kj;")
	private Class133 method3643(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != 0) {
			this.anEventQueue1 = null;
		}
		return this.method3644(15, arg1, arg2 ? 1 : 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/Object;BII)Lclient!kj;")
	private Class133 method3644(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class133 local3 = new Class133();
		local3.anInt3259 = arg0;
		local3.anObject4 = arg1;
		local3.anInt3258 = arg2;
		synchronized (this) {
			if (this.aClass133_7 == null) {
				this.aClass133_7 = this.aClass133_8 = local3;
			} else {
				this.aClass133_7.aClass133_4 = local3;
				this.aClass133_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)Lclient!kj;")
	public Class133 method3645() {
		return this.method3644(13, null, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!kj;")
	public Class133 method3646(@OriginalArg(1) Class arg0) {
		return this.method3644(10, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	public void method3647() {
		synchronized (this) {
			this.aBoolean315 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass106_1 != null) {
			try {
				this.aClass106_1.method2290();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass106_3 != null) {
			try {
				this.aClass106_3.method2290();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass106Array1 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aClass106Array1.length; local51++) {
				if (this.aClass106Array1[local51] != null) {
					try {
						this.aClass106Array1[local51].method2290();
					} catch (@Pc(65) IOException local65) {
					}
				}
			}
		}
		if (this.aClass106_2 != null) {
			try {
				this.aClass106_2.method2290();
			} catch (@Pc(81) IOException local81) {
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method3648(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class133 local7 = this.method3657(21, 0, arg1, true, arg0);
		return (byte[]) local7.anObject3;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!kj;")
	private Class133 method3649(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 >= -26) {
			this.method3663(null);
		}
		return this.method3644(19, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!kj;")
	public Class133 method3650(@OriginalArg(1) Class arg0) {
		return this.method3644(20, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(ILjava/lang/String;)Lclient!kj;")
	private Class133 method3651(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 0) {
			this.aBoolean315 = true;
		}
		return this.method3644(21, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lclient!kj;")
	public Class133 method3652(@OriginalArg(1) int arg0) {
		return this.method3644(3, null, arg0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lclient!kj;")
	public Class133 method3653(@OriginalArg(0) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method3644(8, new Object[] { arg2, arg1, arg0 }, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lclient!kj;")
	public Class133 method3654(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method3644(9, new Object[] { arg0, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!kj;")
	public Class133 method3655(@OriginalArg(0) Class arg0) {
		return this.method3644(11, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)Lclient!kj;")
	public Class133 method3656() {
		return this.method3644(12, null, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILjava/lang/Object;ZI)Lclient!kj;")
	private Class133 method3657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class133 local3 = new Class133();
		synchronized (local3) {
			local3.anInt3258 = arg1;
			local3.anObject4 = arg2;
			local3.anInt3259 = arg0;
			synchronized (this) {
				if (this.aClass133_7 == null) {
					this.aClass133_7 = this.aClass133_8 = local3;
				} else {
					this.aClass133_7.aClass133_4 = local3;
					this.aClass133_7 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
		}
		if (!arg3) {
			this.method3661();
		}
		return local3;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!kj;")
	public Class133 method3658(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method3644(2, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!mj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class133 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean315) {
						return;
					}
					if (this.aClass133_8 != null) {
						local15 = this.aClass133_8;
						this.aClass133_8 = this.aClass133_8.aClass133_4;
						if (this.aClass133_8 == null) {
							this.aClass133_7 = null;
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
				@Pc(41) int local41 = local15.anInt3259;
				if (local41 == 1) {
					if (Static288.method4512() < Static218.aLong150) {
						throw new IOException();
					}
					local15.anObject3 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt3258);
				} else if (local41 == 2) {
					@Pc(162) Thread local162 = new Thread((Runnable) local15.anObject4);
					local162.setDaemon(true);
					local162.start();
					local162.setPriority(local15.anInt3258);
					local15.anObject3 = local162;
				} else if (local41 == 4) {
					if (Static218.aLong150 > Static288.method4512()) {
						throw new IOException();
					}
					local15.anObject3 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(68) Object[] local68;
					if (local41 == 8) {
						local68 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local68[0]).getDeclaredMethod((String) local68[1], (Class[]) local68[2]);
					} else if (local41 == 9) {
						local68 = (Object[]) local15.anObject4;
						local15.anObject3 = ((Class) local68[0]).getDeclaredField((String) local68[1]);
					} else if (local41 == 18) {
						@Pc(110) Clipboard local110 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject3 = local110.getContents(null);
					} else if (local41 == 19) {
						@Pc(99) Transferable local99 = (Transferable) local15.anObject4;
						@Pc(102) Clipboard local102 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local102.setContents(local99, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt3257 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt3257 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Point;I[IBILjava/awt/Component;)Lclient!kj;")
	public Class133 method3659(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method3644(17, new Object[] { arg4, arg2, arg0 }, arg1, arg3);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Lclient!qg;")
	public Interface8 method3660() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)Z")
	public boolean method3661() {
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!kj;")
	private Class133 method3662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		if (arg1 != 14) {
			this.anApplet1 = null;
		}
		return this.method3644(14, null, local2.x + arg2, local2.y + arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!kj;")
	public Class133 method3663(@OriginalArg(0) String arg0) {
		return this.method3644(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
	public void method3664() {
		Static218.aLong150 = Static288.method4512() + 5000L;
	}
}
