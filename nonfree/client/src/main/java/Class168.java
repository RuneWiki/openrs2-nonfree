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

@OriginalClass("client!rd")
public final class Class168 implements Runnable {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!mf;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "[Lclient!mi;")
	public Class130[] aClass130Array1;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!ts;")
	private Class193 aClass193_4 = null;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!ts;")
	private Class193 aClass193_5 = null;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!mi;")
	public Class130 aClass130_1 = null;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Lclient!mi;")
	public Class130 aClass130_2 = null;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!mi;")
	public Class130 aClass130_3 = null;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class168(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static268.aString54 = "Unknown";
		Static268.aString51 = "1.1";
		this.anApplet1 = arg0;
		try {
			Static268.aString54 = System.getProperty("java.vendor");
			Static268.aString51 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static268.aString53 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static268.aString53 = "Unknown";
		}
		Static268.aString52 = Static268.aString53.toLowerCase();
		try {
			Static268.aString55 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static268.aString55 = "";
		}
		try {
			Static268.aString49 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static268.aString49 = "";
		}
		try {
			Static268.aString50 = System.getProperty("user.home");
			if (Static268.aString50 != null) {
				Static268.aString50 = Static268.aString50 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static268.aString50 == null) {
			Static268.aString50 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static268.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static268.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static268.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static268.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean489 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lclient!ts;")
	private Class193 method4829(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class193 local3 = new Class193();
		synchronized (local3) {
			local3.anInt6292 = arg2;
			if (arg1 < 59) {
				this.run();
			}
			local3.anInt6294 = arg3;
			local3.anObject6 = arg0;
			synchronized (this) {
				if (this.aClass193_5 == null) {
					this.aClass193_5 = this.aClass193_4 = local3;
				} else {
					this.aClass193_5.aClass193_8 = local3;
					this.aClass193_5 = local3;
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

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Lclient!ts;")
	private Class193 method4830(@OriginalArg(0) int arg0) {
		return arg0 == -24216 ? this.method4855(null, arg0 + 24273, 0, 0, 18) : null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!ts;")
	private Class193 method4831(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 != -4496) {
			this.method4837(null);
		}
		return this.method4855(arg2, arg0 + 4538, arg1 ? 1 : 0, 0, 15);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!ts;")
	public Class193 method4832(@OriginalArg(1) Frame arg0) {
		return this.method4855(arg0, 41, 0, 0, 7);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Lclient!ts;")
	public Class193 method4833(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2) {
		return this.method4855(new Object[] { arg2, arg0, arg1 }, 89, 0, 0, 8);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ts;")
	public Class193 method4834(@OriginalArg(1) String arg0) {
		return this.method4855(arg0, 58, 0, 0, 16);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lclient!ts;")
	public Class193 method4835(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method4855(new Object[] { arg1, arg0 }, 53, 0, 0, 9);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lclient!ts;")
	public Class193 method4836() {
		return this.method4855(null, 114, 0, 0, 12);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!ts;")
	public Class193 method4837(@OriginalArg(0) Class arg0) {
		return this.method4855(arg0, 87, 0, 0, 20);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public void method4838() {
		synchronized (this) {
			this.aBoolean489 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass130_1 != null) {
			try {
				this.aClass130_1.method3574();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass130_3 != null) {
			try {
				this.aClass130_3.method3574();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass130Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass130Array1.length; local50++) {
				if (this.aClass130Array1[local50] != null) {
					try {
						this.aClass130Array1[local50].method3574();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass130_2 != null) {
			try {
				this.aClass130_2.method3574();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)Lclient!mf;")
	public Interface3 method4839() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lclient!ts;")
	public Class193 method4840(@OriginalArg(1) int arg0) {
		return this.method4855(null, 36, arg0, 0, 3);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBII)Lclient!ts;")
	public Class193 method4841(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method4855(null, 127, (arg0 << 16) + arg2, arg1 << 16, 6);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([ILjava/awt/Point;ILjava/awt/Component;II)Lclient!ts;")
	public Class193 method4842(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4) {
		return this.method4855(new Object[] { arg3, arg0, arg1 }, 121, arg4, arg2, 17);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ts;")
	private Class193 method4843(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -112) {
			this.anInterface3_1 = null;
		}
		return this.method4855(arg1, 75, 0, 0, 21);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Lclient!ts;")
	public Class193 method4844() {
		return this.method4855(null, 93, 0, 0, 13);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!ts;")
	private Class193 method4845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 > -81) {
			this.aClass193_4 = null;
		}
		@Pc(8) Point local8 = arg3.getLocationOnScreen();
		return this.method4855(null, 83, arg2 + local8.x, arg0 - -local8.y, 14);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Z")
	public boolean method4846() {
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!ts;")
	public Class193 method4847(@OriginalArg(0) Class arg0) {
		return this.method4855(arg0, 47, 0, 0, 11);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;BI)Lclient!ts;")
	public Class193 method4848(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method4855(arg0, 47, arg1, 0, 1);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method4849(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -80) {
			this.method4848(null, -107);
		}
		@Pc(16) Class193 local16 = this.method4829(arg0, (byte) 67, 21, 0);
		return (byte[]) local16.anObject7;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!ts;")
	public Class193 method4850(@OriginalArg(0) URL arg0) {
		return this.method4855(arg0, 95, 0, 0, 4);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!ts;")
	private Class193 method4851(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		return arg1 < 33 ? null : this.method4855(arg0, 91, 0, 0, 19);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Lclient!ts;")
	public Class193 method4852() {
		return this.method4855(null, 72, 0, 0, 5);
	}

	@OriginalMember(owner = "client!rd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class193 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean489) {
						return;
					}
					if (this.aClass193_4 != null) {
						local15 = this.aClass193_4;
						this.aClass193_4 = this.aClass193_4.aClass193_8;
						if (this.aClass193_4 == null) {
							this.aClass193_5 = null;
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
				@Pc(41) int local41 = local15.anInt6292;
				if (local41 == 1) {
					if (Static268.aLong160 > Static51.method1197()) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt6294);
				} else if (local41 == 2) {
					@Pc(160) Thread local160 = new Thread((Runnable) local15.anObject6);
					local160.setDaemon(true);
					local160.start();
					local160.setPriority(local15.anInt6294);
					local15.anObject7 = local160;
				} else if (local41 == 4) {
					if (Static51.method1197() < Static268.aLong160) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(59) Object[] local59;
					if (local41 == 8) {
						local59 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local59[0]).getDeclaredMethod((String) local59[1], (Class[]) local59[2]);
					} else if (local41 == 9) {
						local59 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local59[0]).getDeclaredField((String) local59[1]);
					} else if (local41 == 18) {
						@Pc(86) Clipboard local86 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject7 = local86.getContents(null);
					} else if (local41 == 19) {
						@Pc(101) Transferable local101 = (Transferable) local15.anObject6;
						@Pc(104) Clipboard local104 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local104.setContents(local101, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6293 = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.anInt6293 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
	public void method4853() {
		Static268.aLong160 = Static51.method1197() + 5000L;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!ts;")
	public Class193 method4854(@OriginalArg(1) Class arg0) {
		return this.method4855(arg0, 97, 0, 0, 10);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!ts;")
	private Class193 method4855(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class193 local3 = new Class193();
		local3.anInt6292 = arg4;
		local3.anObject6 = arg0;
		local3.anInt6294 = arg2;
		synchronized (this) {
			if (this.aClass193_5 == null) {
				this.aClass193_5 = this.aClass193_4 = local3;
			} else {
				this.aClass193_5.aClass193_8 = local3;
				this.aClass193_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lclient!ts;")
	public Class193 method4856(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method4855(arg0, 54, arg1, 0, 2);
	}
}
