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

@OriginalClass("client!dq")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "Lclient!rj;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "[Lclient!sb;")
	public Class202[] aClass202Array1;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Lclient!a;")
	private Class1 aClass1_2 = null;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "Lclient!sb;")
	public Class202 aClass202_3 = null;

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "Lclient!a;")
	private Class1 aClass1_3 = null;

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "Lclient!sb;")
	public Class202 aClass202_4 = null;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Lclient!sb;")
	public Class202 aClass202_2 = null;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class53(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static65.aString9 = "1.1";
		Static65.aString10 = "Unknown";
		this.anApplet1 = arg0;
		try {
			Static65.aString10 = System.getProperty("java.vendor");
			Static65.aString9 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static65.aString15 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static65.aString15 = "Unknown";
		}
		Static65.aString14 = Static65.aString15.toLowerCase();
		try {
			Static65.aString13 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static65.aString13 = "";
		}
		try {
			Static65.aString12 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static65.aString12 = "";
		}
		try {
			Static65.aString11 = System.getProperty("user.home");
			if (Static65.aString11 != null) {
				Static65.aString11 = Static65.aString11 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static65.aString11 == null) {
			Static65.aString11 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static65.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static65.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static65.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static65.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean108 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!a;")
	public Class1 method1169(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method1173(2, arg0, arg1, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class1 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean108) {
						return;
					}
					if (this.aClass1_3 != null) {
						local15 = this.aClass1_3;
						this.aClass1_3 = this.aClass1_3.aClass1_1;
						if (this.aClass1_3 == null) {
							this.aClass1_2 = null;
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
				@Pc(41) int local41 = local15.anInt3;
				if (local41 == 1) {
					if (Static65.aLong42 > Static51.method979()) {
						throw new IOException();
					}
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt1);
				} else if (local41 == 2) {
					@Pc(164) Thread local164 = new Thread((Runnable) local15.anObject2);
					local164.setDaemon(true);
					local164.start();
					local164.setPriority(local15.anInt1);
					local15.anObject1 = local164;
				} else if (local41 == 4) {
					if (Static65.aLong42 > Static51.method979()) {
						throw new IOException();
					}
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local41 == 8) {
						local102 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local41 == 9) {
						local102 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local41 == 18) {
						@Pc(70) Clipboard local70 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject1 = local70.getContents(null);
					} else if (local41 == 19) {
						@Pc(85) Transferable local85 = (Transferable) local15.anObject2;
						@Pc(88) Clipboard local88 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local88.setContents(local85, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2 = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.anInt2 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Lclient!a;")
	public Class1 method1170() {
		return this.method1173(12, null, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Component;BII)Lclient!a;")
	private Class1 method1171(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != -21) {
			this.method1175(122, -1, -54);
		}
		@Pc(13) Point local13 = arg0.getLocationOnScreen();
		return this.method1173(14, null, arg3 + local13.x, 1, arg2 + local13.y);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Lclient!a;")
	public Class1 method1172(@OriginalArg(1) int arg0) {
		return this.method1173(3, null, arg0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!a;")
	private Class1 method1173(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class1 local3 = new Class1();
		local3.anObject2 = arg1;
		local3.anInt3 = arg0;
		local3.anInt1 = arg2;
		synchronized (this) {
			if (this.aClass1_2 == null) {
				this.aClass1_2 = this.aClass1_3 = local3;
			} else {
				this.aClass1_2.aClass1_1 = local3;
				this.aClass1_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILjava/lang/Object;ZI)Lclient!a;")
	private Class1 method1174(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class1 local3 = new Class1();
		synchronized (local3) {
			local3.anInt1 = arg0;
			local3.anObject2 = arg1;
			local3.anInt3 = arg3;
			synchronized (this) {
				if (this.aClass1_2 == null) {
					this.aClass1_2 = this.aClass1_3 = local3;
				} else {
					this.aClass1_2.aClass1_1 = local3;
					this.aClass1_2 = local3;
				}
				if (!arg2) {
					Static65.aString11 = null;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(54) InterruptedException local54) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZIII)Lclient!a;")
	public Class1 method1175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method1173(6, null, (arg1 << 16) + arg2, 1, arg0 << 16);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)Z")
	public boolean method1176() {
		return false;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)Lclient!a;")
	public Class1 method1177() {
		return this.method1173(13, null, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	public void method1178() {
		synchronized (this) {
			this.aBoolean108 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass202_2 != null) {
			try {
				this.aClass202_2.method4940();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass202_4 != null) {
			try {
				this.aClass202_4.method4940();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass202Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass202Array1.length; local50++) {
				if (this.aClass202Array1[local50] != null) {
					try {
						this.aClass202Array1[local50].method4940();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass202_3 != null) {
			try {
				this.aClass202_3.method4940();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;I)Lclient!a;")
	public Class1 method1179(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method1173(1, arg0, arg1, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method1180(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1 local7 = this.method1174(0, arg0, true, arg1);
		return (byte[]) local7.anObject1;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!a;")
	public Class1 method1181(@OriginalArg(0) URL arg0) {
		return this.method1173(4, arg0, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!a;")
	public Class1 method1182(@OriginalArg(0) Class arg0) {
		return this.method1173(10, arg0, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	public void method1183() {
		Static65.aLong42 = Static51.method979() + 5000L;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!a;")
	public Class1 method1184(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method1173(8, new Object[] { arg2, arg0, arg1 }, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!a;")
	private Class1 method1185(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2) {
		return arg1 == -4 ? this.method1173(15, arg0, arg2 ? 1 : 0, 1, 0) : null;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!a;")
	public Class1 method1186(@OriginalArg(0) String arg0) {
		return this.method1173(16, arg0, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!a;")
	private Class1 method1187(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 0) {
			Static65.anInt1255 = 44;
		}
		return this.method1173(19, arg1, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILjava/awt/Component;I[ILjava/awt/Point;)Lclient!a;")
	public Class1 method1188(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Point arg4) {
		return this.method1173(17, new Object[] { arg1, arg3, arg4 }, arg2, 1, arg0);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Lclient!rj;")
	public Interface9 method1189() {
		return this.anInterface9_1;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!a;")
	public Class1 method1190(@OriginalArg(0) Class arg0) {
		return this.method1173(11, arg0, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!a;")
	public Class1 method1191(@OriginalArg(0) Frame arg0) {
		return this.method1173(7, arg0, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)Lclient!a;")
	public Class1 method1192() {
		return this.method1173(5, null, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(Z)Lclient!a;")
	private Class1 method1193(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.method1173(18, null, 0, 1, 0) : null;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!a;")
	public Class1 method1194(@OriginalArg(0) Class arg0) {
		return this.method1173(20, arg0, 0, 1, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;)Lclient!a;")
	private Class1 method1195(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -108) {
			Static65.aString14 = null;
		}
		return this.method1173(21, arg1, 0, arg0 + 109, 0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Lclient!a;")
	public Class1 method1196(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method1173(9, new Object[] { arg1, arg0 }, 0, 1, 0);
	}
}
