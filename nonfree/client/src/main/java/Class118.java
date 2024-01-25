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

@OriginalClass("client!ko")
public final class Class118 implements Runnable {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "Lclient!jq;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "[Lclient!jp;")
	public Class113[] aClass113Array1;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Lclient!jp;")
	public Class113 aClass113_2 = null;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "Lclient!jp;")
	public Class113 aClass113_3 = null;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Lclient!aa;")
	private Class2 aClass2_5 = null;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "Lclient!aa;")
	private Class2 aClass2_6 = null;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "Lclient!jp;")
	public Class113 aClass113_4 = null;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class118(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static167.aString29 = "Unknown";
		Static167.aString31 = "1.1";
		try {
			Static167.aString29 = System.getProperty("java.vendor");
			Static167.aString31 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static167.aString26 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static167.aString26 = "Unknown";
		}
		Static167.aString32 = Static167.aString26.toLowerCase();
		try {
			Static167.aString30 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static167.aString30 = "";
		}
		try {
			Static167.aString27 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static167.aString27 = "";
		}
		try {
			Static167.aString28 = System.getProperty("user.home");
			if (Static167.aString28 != null) {
				Static167.aString28 = Static167.aString28 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static167.aString28 == null) {
			Static167.aString28 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static167.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static167.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static167.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static167.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean214 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!aa;")
	public Class2 method2692(@OriginalArg(0) Class arg0) {
		return this.method2715(0, 11, 0, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Lclient!aa;")
	public Class2 method2693() {
		return this.method2715(0, 13, 0, null);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Lclient!aa;")
	private Class2 method2694() {
		return this.method2715(0, 18, 0, null);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lclient!aa;")
	private Class2 method2695(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 >= -69) {
			this.method2712(-1, null);
		}
		return this.method2715(0, 19, 0, arg1);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLjava/lang/String;)[B")
	private byte[] method2696(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class2 local7 = this.method2714(arg1, 78, 0, 21);
		return arg0 <= 111 ? null : (byte[]) local7.anObject1;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/awt/Component;[IILjava/awt/Point;ZI)Lclient!aa;")
	public Class2 method2697(@OriginalArg(0) Component arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Point arg3, @OriginalArg(5) int arg4) {
		return this.method2715(arg2, 17, arg4, new Object[] { arg0, arg1, arg3 });
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public void method2698() {
		synchronized (this) {
			this.aBoolean214 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass113_3 != null) {
			try {
				this.aClass113_3.method2307();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass113_2 != null) {
			try {
				this.aClass113_2.method2307();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass113Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass113Array1.length; local50++) {
				if (this.aClass113Array1[local50] != null) {
					try {
						this.aClass113Array1[local50].method2307();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass113_4 != null) {
			try {
				this.aClass113_4.method2307();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Z")
	public boolean method2699() {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class2 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean214) {
						return;
					}
					if (this.aClass2_6 != null) {
						local15 = this.aClass2_6;
						this.aClass2_6 = this.aClass2_6.aClass2_1;
						if (this.aClass2_6 == null) {
							this.aClass2_5 = null;
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
				@Pc(41) int local41 = local15.anInt5;
				if (local41 == 1) {
					if (Static268.method4627() < Static167.aLong99) {
						throw new IOException();
					}
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt7);
				} else if (local41 == 2) {
					@Pc(54) Thread local54 = new Thread((Runnable) local15.anObject2);
					local54.setDaemon(true);
					local54.start();
					local54.setPriority(local15.anInt7);
					local15.anObject1 = local54;
				} else if (local41 == 4) {
					if (Static268.method4627() < Static167.aLong99) {
						throw new IOException();
					}
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(79) Object[] local79;
					if (local41 == 8) {
						local79 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local79[0]).getDeclaredMethod((String) local79[1], (Class[]) local79[2]);
					} else if (local41 == 9) {
						local79 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local79[0]).getDeclaredField((String) local79[1]);
					} else if (local41 == 18) {
						@Pc(122) Clipboard local122 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject1 = local122.getContents(null);
					} else if (local41 == 19) {
						@Pc(140) Transferable local140 = (Transferable) local15.anObject2;
						@Pc(143) Clipboard local143 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local143.setContents(local140, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6 = 1;
			} catch (@Pc(192) ThreadDeath local192) {
				throw local192;
			} catch (@Pc(195) Throwable local195) {
				local15.anInt6 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)Lclient!aa;")
	public Class2 method2700() {
		return this.method2715(0, 5, 0, null);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/String;)Lclient!aa;")
	public Class2 method2701(@OriginalArg(1) String arg0) {
		return this.method2715(0, 16, 0, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)Lclient!aa;")
	public Class2 method2702() {
		return this.method2715(0, 12, 0, null);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lclient!aa;")
	public Class2 method2703(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method2715(0, 8, 0, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)Lclient!aa;")
	public Class2 method2704(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method2715((arg1 << 16) + arg2, 6, arg0 << 16, null);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!aa;")
	public Class2 method2705(@OriginalArg(1) Class arg0) {
		return this.method2715(0, 10, 0, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!aa;")
	private Class2 method2706(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 21) {
			this.anInterface3_2 = null;
		}
		return this.method2715(0, 21, 0, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!aa;")
	public Class2 method2707(@OriginalArg(0) URL arg0) {
		return this.method2715(0, 4, 0, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILjava/lang/String;)Lclient!aa;")
	public Class2 method2708(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method2715(arg0, 1, 0, arg1);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)Lclient!aa;")
	public Class2 method2709(@OriginalArg(0) int arg0) {
		return this.method2715(arg0, 3, 0, null);
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	public void method2710() {
		Static167.aLong99 = Static268.method4627() + 5000L;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lclient!aa;")
	public Class2 method2711(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method2715(0, 9, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!aa;")
	public Class2 method2712(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method2715(arg0, 2, 0, arg1);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!aa;")
	public Class2 method2713(@OriginalArg(0) Frame arg0) {
		return this.method2715(0, 7, 0, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!aa;")
	private Class2 method2714(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class2 local3 = new Class2();
		synchronized (local3) {
			local3.anInt5 = arg3;
			local3.anInt7 = arg2;
			local3.anObject2 = arg0;
			synchronized (this) {
				if (arg1 < 28) {
					this.aBoolean214 = false;
				}
				if (this.aClass2_5 == null) {
					this.aClass2_5 = this.aClass2_6 = local3;
				} else {
					this.aClass2_5.aClass2_1 = local3;
					this.aClass2_5 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(55) InterruptedException local55) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BIIILjava/lang/Object;)Lclient!aa;")
	private Class2 method2715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class2 local3 = new Class2();
		local3.anInt7 = arg0;
		local3.anInt5 = arg1;
		local3.anObject2 = arg3;
		synchronized (this) {
			if (this.aClass2_5 == null) {
				this.aClass2_5 = this.aClass2_6 = local3;
			} else {
				this.aClass2_5.aClass2_1 = local3;
				this.aClass2_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)Lclient!jq;")
	public Interface3 method2716() {
		return this.anInterface3_2;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/awt/Component;BI)Lclient!aa;")
	private Class2 method2717(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Point local10 = arg1.getLocationOnScreen();
		return this.method2715(local10.x + arg0, 14, arg2 + local10.y, null);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!aa;")
	public Class2 method2718(@OriginalArg(0) Class arg0) {
		return this.method2715(0, 20, 0, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!aa;")
	private Class2 method2719(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		return this.method2715(arg0 ? 1 : 0, 15, 0, arg1);
	}
}
