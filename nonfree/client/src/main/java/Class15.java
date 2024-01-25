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

@OriginalClass("client!ap")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "[Lclient!k;")
	public Class110[] aClass110Array1;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "Lclient!a;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Lclient!vd;")
	private Class205 aClass205_2 = null;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "Lclient!vd;")
	private Class205 aClass205_1 = null;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "Lclient!k;")
	public Class110 aClass110_1 = null;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "Lclient!k;")
	public Class110 aClass110_3 = null;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "Lclient!k;")
	public Class110 aClass110_2 = null;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class15(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static12.aString8 = "1.1";
		this.anApplet1 = arg0;
		Static12.aString9 = "Unknown";
		try {
			Static12.aString9 = System.getProperty("java.vendor");
			Static12.aString8 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static12.aString14 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static12.aString14 = "Unknown";
		}
		Static12.aString10 = Static12.aString14.toLowerCase();
		try {
			Static12.aString11 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static12.aString11 = "";
		}
		try {
			Static12.aString12 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static12.aString12 = "";
		}
		try {
			Static12.aString13 = System.getProperty("user.home");
			if (Static12.aString13 != null) {
				Static12.aString13 = Static12.aString13 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static12.aString13 == null) {
			Static12.aString13 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static12.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static12.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static12.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static12.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean13 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!vd;")
	private Class205 method270(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 41) {
			Static12.aString11 = null;
		}
		return this.method295(arg0, 0, 19, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)Lclient!a;")
	public Interface1 method271() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!vd;")
	public Class205 method272(@OriginalArg(0) URL arg0) {
		return this.method295(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!vd;")
	public Class205 method273(@OriginalArg(1) Frame arg0) {
		return this.method295(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!vd;")
	public Class205 method274(@OriginalArg(1) Class arg0) {
		return this.method295(arg0, 0, 10, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;)Lclient!vd;")
	private Class205 method275(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 0) {
			Static12.aString11 = null;
		}
		return this.method295(arg1, 0, 21, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!vd;")
	public Class205 method276(@OriginalArg(0) Class arg0) {
		return this.method295(arg0, 0, 20, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)Lclient!vd;")
	public Class205 method277() {
		return this.method295(null, 0, 12, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lclient!vd;")
	public Class205 method278(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		return this.method295(new Object[] { arg0, arg1 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Lclient!vd;")
	public Class205 method279() {
		return this.method295(null, 0, 5, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lclient!vd;")
	public Class205 method280(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return this.method295(new Object[] { arg2, arg1, arg0 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIBI)Lclient!vd;")
	public Class205 method281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method295(null, (arg0 << 16) + arg2, 6, arg1 << 16);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(ILjava/lang/String;)Lclient!vd;")
	public Class205 method282(@OriginalArg(1) String arg0) {
		return this.method295(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)Lclient!vd;")
	public Class205 method283() {
		return this.method295(null, 0, 13, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!vd;")
	public Class205 method284(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method295(arg0, arg1, 1, 0);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
	public void method285() {
		synchronized (this) {
			this.aBoolean13 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass110_1 != null) {
			try {
				this.aClass110_1.method3079();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass110_2 != null) {
			try {
				this.aClass110_2.method3079();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass110Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass110Array1.length; local50++) {
				if (this.aClass110Array1[local50] != null) {
					try {
						this.aClass110Array1[local50].method3079();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass110_3 != null) {
			try {
				this.aClass110_3.method3079();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)Z")
	public boolean method286() {
		return false;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!vd;")
	public Class205 method287(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method295(arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)Lclient!vd;")
	public Class205 method288(@OriginalArg(0) int arg0) {
		return this.method295(null, arg0, 3, 0);
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
	public void method289() {
		Static12.aLong4 = Static168.method3300() + 5000L;
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)Lclient!vd;")
	private Class205 method290(@OriginalArg(0) int arg0) {
		if (arg0 <= 69) {
			this.method283();
		}
		return this.method295(null, 0, 18, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!vd;")
	private Class205 method291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		if (arg0 != 0) {
			return null;
		}
		@Pc(7) Class205 local7 = new Class205();
		synchronized (local7) {
			local7.anObject8 = arg2;
			local7.anInt6371 = arg1;
			local7.anInt6372 = arg3;
			synchronized (this) {
				if (this.aClass205_2 == null) {
					this.aClass205_2 = this.aClass205_1 = local7;
				} else {
					this.aClass205_2.aClass205_11 = local7;
					this.aClass205_2 = local7;
				}
				this.notify();
			}
			try {
				local7.wait();
			} catch (@Pc(53) InterruptedException local53) {
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/awt/Component;II[IILjava/awt/Point;)Lclient!vd;")
	public Class205 method292(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method295(new Object[] { arg0, arg2, arg4 }, arg1, 17, arg3);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!vd;")
	public Class205 method293(@OriginalArg(1) Class arg0) {
		return this.method295(arg0, 0, 11, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lclient!vd;")
	private Class205 method294(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (arg2 != -114) {
			this.method286();
		}
		return this.method295(arg0, arg1 ? 1 : 0, 15, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/Object;IIZI)Lclient!vd;")
	private Class205 method295(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class205 local3 = new Class205();
		local3.anInt6371 = arg2;
		local3.anInt6372 = arg1;
		local3.anObject8 = arg0;
		synchronized (this) {
			if (this.aClass205_2 == null) {
				this.aClass205_2 = this.aClass205_1 = local3;
			} else {
				this.aClass205_2.aClass205_11 = local3;
				this.aClass205_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ap", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class205 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean13) {
						return;
					}
					if (this.aClass205_1 != null) {
						local15 = this.aClass205_1;
						this.aClass205_1 = this.aClass205_1.aClass205_11;
						if (this.aClass205_1 == null) {
							this.aClass205_2 = null;
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
				@Pc(41) int local41 = local15.anInt6371;
				if (local41 == 1) {
					if (Static12.aLong4 > Static168.method3300()) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject8), local15.anInt6372);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject8);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt6372);
					local15.anObject7 = local56;
				} else if (local41 == 4) {
					if (Static168.method3300() < Static12.aLong4) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject8).openStream());
				} else {
					@Pc(109) Object[] local109;
					if (local41 == 8) {
						local109 = (Object[]) local15.anObject8;
						local15.anObject7 = ((Class) local109[0]).getDeclaredMethod((String) local109[1], (Class[]) local109[2]);
					} else if (local41 == 9) {
						local109 = (Object[]) local15.anObject8;
						local15.anObject7 = ((Class) local109[0]).getDeclaredField((String) local109[1]);
					} else if (local41 == 18) {
						@Pc(127) Clipboard local127 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject7 = local127.getContents(null);
					} else if (local41 == 19) {
						@Pc(140) Transferable local140 = (Transferable) local15.anObject8;
						@Pc(143) Clipboard local143 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local143.setContents(local140, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6370 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt6370 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method296(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -79) {
			this.aClass110Array1 = null;
		}
		@Pc(13) Class205 local13 = this.method291(0, 21, arg0, 0);
		return (byte[]) local13.anObject7;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBILjava/awt/Component;)Lclient!vd;")
	private Class205 method297(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 == 124) {
			@Pc(7) Point local7 = arg3.getLocationOnScreen();
			return this.method295(null, local7.x + arg0, 14, arg2 + local7.y);
		} else {
			return null;
		}
	}
}
