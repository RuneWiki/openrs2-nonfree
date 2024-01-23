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

@OriginalClass("client!ua")
public final class Class176 implements Runnable {

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!bo;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "[Lclient!he;")
	public Class70[] aClass70Array1;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!uh;")
	private Class178 aClass178_6 = null;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Z")
	private boolean aBoolean385 = false;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!uh;")
	private Class178 aClass178_7 = null;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!he;")
	public Class70 aClass70_2 = null;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!he;")
	public Class70 aClass70_4 = null;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!he;")
	public Class70 aClass70_3 = null;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class176(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static275.aString213 = "1.1";
		Static275.aString211 = "Unknown";
		this.anApplet1 = arg0;
		try {
			Static275.aString211 = System.getProperty("java.vendor");
			Static275.aString213 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static275.aString210 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static275.aString210 = "Unknown";
		}
		Static275.aString208 = Static275.aString210.toLowerCase();
		try {
			Static275.aString214 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static275.aString214 = "";
		}
		try {
			Static275.aString209 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static275.aString209 = "";
		}
		try {
			Static275.aString212 = System.getProperty("user.home");
			if (Static275.aString212 != null) {
				Static275.aString212 = Static275.aString212 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static275.aString212 == null) {
			Static275.aString212 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(91) Throwable local91) {
		}
		try {
			if (arg0 == null) {
				Static275.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static275.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(118) Exception local118) {
		}
		try {
			if (arg0 == null) {
				Static275.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static275.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(146) Exception local146) {
		}
		this.aBoolean385 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Z")
	public boolean method4504() {
		return false;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lclient!uh;")
	private Class178 method4505(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class178 local9 = new Class178();
		local9.anInt5647 = arg0;
		local9.anInt5648 = arg3;
		local9.anObject7 = arg1;
		synchronized (this) {
			if (this.aClass178_6 == null) {
				this.aClass178_6 = this.aClass178_7 = local9;
			} else {
				this.aClass178_6.aClass178_8 = local9;
				this.aClass178_6 = local9;
			}
			this.notify();
			return local9;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public void method4506() {
		Static275.aLong213 = Static128.method2196() + 5000L;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Lclient!uh;")
	public Class178 method4507() {
		return this.method4505(0, null, 0, 5);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!uh;")
	public Class178 method4508(@OriginalArg(0) Class arg0) {
		return this.method4505(0, arg0, 0, 20);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!uh;")
	public Class178 method4509(@OriginalArg(1) Class arg0) {
		return this.method4505(0, arg0, 0, 10);
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)Lclient!bo;")
	public Interface3 method4510() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!uh;")
	public Class178 method4511(@OriginalArg(0) String arg0) {
		return this.method4505(0, arg0, 0, 12);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lclient!uh;")
	public Class178 method4513(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method4505(0, new Object[] { arg0, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Frame;B)Lclient!uh;")
	public Class178 method4514(@OriginalArg(0) Frame arg0) {
		return this.method4505(0, arg0, 0, 7);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/net/URL;)Lclient!uh;")
	public Class178 method4515(@OriginalArg(1) URL arg0) {
		return this.method4505(0, arg0, 0, 4);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/lang/String;)Lclient!uh;")
	public Class178 method4517(@OriginalArg(1) String arg0) {
		return this.method4505(0, arg0, 0, 16);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)Lclient!uh;")
	public Class178 method4518(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method4505(arg0 + (arg1 << 16), null, arg2 << 16, 6);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lclient!uh;")
	public Class178 method4519(@OriginalArg(0) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method4505(0, new Object[] { arg2, arg1, arg0 }, 0, 8);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!uh;")
	public Class178 method4521(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method4505(arg1, arg0, 0, 1);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!uh;")
	public Class178 method4522(@OriginalArg(1) Class arg0) {
		return this.method4505(0, arg0, 0, 11);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lclient!uh;")
	public Class178 method4523(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4505(arg1, arg0, 0, 2);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Lclient!uh;")
	public Class178 method4525(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) Point arg4) {
		return this.method4505(arg2, new Object[] { arg3, arg0, arg4 }, arg1, 17);
	}

	@OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class178 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean385) {
						return;
					}
					if (this.aClass178_7 != null) {
						local16 = this.aClass178_7;
						this.aClass178_7 = this.aClass178_7.aClass178_8;
						if (this.aClass178_7 == null) {
							this.aClass178_6 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt5648;
				if (local45 == 1) {
					if (Static128.method2196() < Static275.aLong213) {
						throw new IOException();
					}
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject7), local16.anInt5647);
				} else if (local45 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local16.anObject7);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local16.anInt5647);
					local16.anObject6 = local62;
				} else if (local45 == 4) {
					if (Static128.method2196() < Static275.aLong213) {
						throw new IOException();
					}
					local16.anObject6 = new DataInputStream(((URL) local16.anObject7).openStream());
				} else {
					@Pc(147) Object[] local147;
					if (local45 == 8) {
						local147 = (Object[]) local16.anObject7;
						local16.anObject6 = ((Class) local147[0]).getDeclaredMethod((String) local147[1], (Class[]) local147[2]);
					} else if (local45 == 9) {
						local147 = (Object[]) local16.anObject7;
						local16.anObject6 = ((Class) local147[0]).getDeclaredField((String) local147[1]);
					} else if (local45 == 18) {
						@Pc(136) Clipboard local136 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject6 = local136.getContents(null);
					} else if (local45 == 19) {
						@Pc(121) Transferable local121 = (Transferable) local16.anObject7;
						@Pc(124) Clipboard local124 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local124.setContents(local121, null);
					} else {
						throw new Exception();
					}
				}
				local16.anInt5649 = 1;
			} catch (@Pc(211) ThreadDeath local211) {
				throw local211;
			} catch (@Pc(214) Throwable local214) {
				local16.anInt5649 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	public void method4526() {
		synchronized (this) {
			this.aBoolean385 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass70_4 != null) {
			try {
				this.aClass70_4.method1687();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass70_3 != null) {
			try {
				this.aClass70_3.method1687();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass70Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass70Array1.length; local50++) {
				if (this.aClass70Array1[local50] != null) {
					try {
						this.aClass70Array1[local50].method1687();
					} catch (@Pc(70) IOException local70) {
					}
				}
			}
		}
		if (this.aClass70_2 != null) {
			try {
				this.aClass70_2.method1687();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)Lclient!uh;")
	public Class178 method4527(@OriginalArg(1) int arg0) {
		return this.method4505(arg0, null, 0, 3);
	}
}
