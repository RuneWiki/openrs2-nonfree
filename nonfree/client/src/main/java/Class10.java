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

@OriginalClass("client!am")
public final class Class10 implements Runnable {

	@OriginalMember(owner = "client!am", name = "d", descriptor = "[Lclient!le;")
	public Class117[] aClass117Array1;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "Lclient!ie;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Lclient!le;")
	public Class117 aClass117_2 = null;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "Z")
	private boolean aBoolean14 = false;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!le;")
	public Class117 aClass117_1 = null;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Lclient!ep;")
	private Class60 aClass60_2 = null;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "Lclient!le;")
	public Class117 aClass117_3 = null;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "Lclient!ep;")
	private Class60 aClass60_1 = null;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class10(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static11.aString19 = "1.1";
		this.anApplet1 = arg0;
		Static11.aString20 = "Unknown";
		try {
			Static11.aString20 = System.getProperty("java.vendor");
			Static11.aString19 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static11.aString15 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static11.aString15 = "Unknown";
		}
		Static11.aString17 = Static11.aString15.toLowerCase();
		try {
			Static11.aString16 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static11.aString16 = "";
		}
		try {
			Static11.aString14 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static11.aString14 = "";
		}
		try {
			Static11.aString18 = System.getProperty("user.home");
			if (Static11.aString18 != null) {
				Static11.aString18 = Static11.aString18 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static11.aString18 == null) {
			Static11.aString18 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static11.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static11.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static11.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static11.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean14 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)Lclient!ep;")
	public Class60 method309() {
		return this.method333(13, null, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILjava/lang/String;)Lclient!ep;")
	public Class60 method310(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method333(1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!ep;")
	public Class60 method311(@OriginalArg(1) Frame arg0) {
		return this.method333(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/net/URL;)Lclient!ep;")
	public Class60 method312(@OriginalArg(1) URL arg0) {
		return this.method333(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z")
	public boolean method313() {
		return false;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIZLjava/lang/Object;)Lclient!ep;")
	private Class60 method314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Object arg3) {
		if (!arg2) {
			this.method334(null, null);
		}
		@Pc(12) Class60 local12 = new Class60();
		synchronized (local12) {
			local12.anInt1837 = arg1;
			local12.anObject1 = arg3;
			local12.anInt1839 = arg0;
			synchronized (this) {
				if (this.aClass60_1 == null) {
					this.aClass60_1 = this.aClass60_2 = local12;
				} else {
					this.aClass60_1.aClass60_4 = local12;
					this.aClass60_1 = local12;
				}
				this.notify();
			}
			try {
				local12.wait();
			} catch (@Pc(58) InterruptedException local58) {
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)Lclient!ep;")
	public Class60 method315() {
		return this.method333(5, null, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lclient!ep;")
	public Class60 method316(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method333(2, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!ep;")
	public Class60 method317(@OriginalArg(1) Class arg0) {
		return this.method333(20, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ep;")
	public Class60 method318(@OriginalArg(0) String arg0) {
		return this.method333(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!ep;")
	private Class60 method319(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 <= 111) {
			this.method333(-114, null, 118, 116);
		}
		return this.method333(15, arg2, 0, arg1 ? 1 : 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)Lclient!ep;")
	public Class60 method320(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method333(6, null, arg1 << 16, arg0 + (arg2 << 16));
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!ep;")
	public Class60 method321(@OriginalArg(1) Class arg0) {
		return this.method333(10, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(Z)Lclient!ie;")
	public Interface4 method322() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)Lclient!ep;")
	private Class60 method323(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method317(null);
		}
		return this.method333(18, null, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;I[I)Lclient!ep;")
	public Class60 method324(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		return this.method333(17, new Object[] { arg1, arg4, arg2 }, arg0, arg3);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!ep;")
	private Class60 method325(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		return this.method333(14, null, arg2 + local2.y, local2.x + arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Lclient!ep;")
	public Class60 method326(@OriginalArg(0) int arg0) {
		return this.method333(3, null, 0, arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ep;")
	private Class60 method327(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		return arg1 == -79 ? this.method333(21, arg0, 0, 0) : null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lclient!ep;")
	public Class60 method328() {
		return this.method333(12, null, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(Z)V")
	public void method329() {
		Static11.aLong10 = Static284.method4783() + 5000L;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method330(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 < 77) {
			return null;
		} else {
			@Pc(12) Class60 local12 = this.method314(21, 0, true, arg0);
			return (byte[]) local12.anObject2;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!ep;")
	public Class60 method331(@OriginalArg(0) Class arg0) {
		return this.method333(11, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	public void method332() {
		synchronized (this) {
			this.aBoolean14 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass117_3 != null) {
			try {
				this.aClass117_3.method3260();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass117_1 != null) {
			try {
				this.aClass117_1.method3260();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass117Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass117Array1.length; local49++) {
				if (this.aClass117Array1[local49] != null) {
					try {
						this.aClass117Array1[local49].method3260();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass117_2 != null) {
			try {
				this.aClass117_2.method3260();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lclient!ep;")
	private Class60 method333(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class60 local8 = new Class60();
		local8.anObject1 = arg1;
		local8.anInt1839 = arg0;
		local8.anInt1837 = arg3;
		synchronized (this) {
			if (this.aClass60_1 == null) {
				this.aClass60_1 = this.aClass60_2 = local8;
			} else {
				this.aClass60_1.aClass60_4 = local8;
				this.aClass60_1 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "client!am", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class60 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean14) {
						return;
					}
					if (this.aClass60_2 != null) {
						local15 = this.aClass60_2;
						this.aClass60_2 = this.aClass60_2.aClass60_4;
						if (this.aClass60_2 == null) {
							this.aClass60_1 = null;
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
				@Pc(41) int local41 = local15.anInt1839;
				if (local41 == 1) {
					if (Static11.aLong10 > Static284.method4783()) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt1837);
				} else if (local41 == 2) {
					@Pc(58) Thread local58 = new Thread((Runnable) local15.anObject1);
					local58.setDaemon(true);
					local58.start();
					local58.setPriority(local15.anInt1837);
					local15.anObject2 = local58;
				} else if (local41 == 4) {
					if (Static11.aLong10 > Static284.method4783()) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(86) Object[] local86;
					if (local41 == 8) {
						local86 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local86[0]).getDeclaredMethod((String) local86[1], (Class[]) local86[2]);
					} else if (local41 == 9) {
						local86 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local86[0]).getDeclaredField((String) local86[1]);
					} else if (local41 == 18) {
						@Pc(104) Clipboard local104 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local104.getContents(null);
					} else if (local41 == 19) {
						@Pc(119) Transferable local119 = (Transferable) local15.anObject1;
						@Pc(122) Clipboard local122 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local122.setContents(local119, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt1838 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt1838 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!ep;")
	public Class60 method334(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method333(9, new Object[] { arg1, arg0 }, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!ep;")
	public Class60 method335(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method333(8, new Object[] { arg2, arg0, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!ep;")
	private Class60 method336(@OriginalArg(0) Transferable arg0) {
		return this.method333(19, arg0, 0, 0);
	}
}
