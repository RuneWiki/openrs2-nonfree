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

@OriginalClass("client!kd")
public final class Class123 implements Runnable {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!bn;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "[Lclient!wj;")
	public Class248[] aClass248Array1;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!wj;")
	public Class248 aClass248_2 = null;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!wj;")
	public Class248 aClass248_3 = null;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!gj;")
	private Class86 aClass86_5 = null;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!gj;")
	private Class86 aClass86_6 = null;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!wj;")
	public Class248 aClass248_4 = null;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class123(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static175.aString29 = "Unknown";
		Static175.aString31 = "1.1";
		try {
			Static175.aString29 = System.getProperty("java.vendor");
			Static175.aString31 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static175.aString28 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static175.aString28 = "Unknown";
		}
		Static175.aString32 = Static175.aString28.toLowerCase();
		try {
			Static175.aString30 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static175.aString30 = "";
		}
		try {
			Static175.aString27 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static175.aString27 = "";
		}
		try {
			Static175.aString26 = System.getProperty("user.home");
			if (Static175.aString26 != null) {
				Static175.aString26 = Static175.aString26 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static175.aString26 == null) {
			Static175.aString26 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static175.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static175.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static175.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static175.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean268 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public void method3243() {
		synchronized (this) {
			this.aBoolean268 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass248_4 != null) {
			try {
				this.aClass248_4.method6004();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass248_2 != null) {
			try {
				this.aClass248_2.method6004();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass248Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass248Array1.length; local48++) {
				if (this.aClass248Array1[local48] != null) {
					try {
						this.aClass248Array1[local48].method6004();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass248_3 != null) {
			try {
				this.aClass248_3.method6004();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class86 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean268) {
						return;
					}
					if (this.aClass86_5 != null) {
						local15 = this.aClass86_5;
						this.aClass86_5 = this.aClass86_5.aClass86_3;
						if (this.aClass86_5 == null) {
							this.aClass86_6 = null;
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
				@Pc(41) int local41 = local15.anInt2589;
				if (local41 == 1) {
					if (Static101.method1805() < Static175.aLong107) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject1), local15.anInt2588);
				} else if (local41 == 2) {
					@Pc(179) Thread local179 = new Thread((Runnable) local15.anObject1);
					local179.setDaemon(true);
					local179.start();
					local179.setPriority(local15.anInt2588);
					local15.anObject2 = local179;
				} else if (local41 == 4) {
					if (Static175.aLong107 > Static101.method1805()) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject1).openStream());
				} else {
					@Pc(108) Object[] local108;
					if (local41 == 8) {
						local108 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local108[0]).getDeclaredMethod((String) local108[1], (Class[]) local108[2]);
					} else if (local41 == 9) {
						local108 = (Object[]) local15.anObject1;
						local15.anObject2 = ((Class) local108[0]).getDeclaredField((String) local108[1]);
					} else if (local41 == 18) {
						@Pc(146) Clipboard local146 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local146.getContents(null);
					} else if (local41 == 19) {
						@Pc(130) Transferable local130 = (Transferable) local15.anObject1;
						@Pc(133) Clipboard local133 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local133.setContents(local130, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2590 = 1;
			} catch (@Pc(196) ThreadDeath local196) {
				throw local196;
			} catch (@Pc(199) Throwable local199) {
				local15.anInt2590 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIILjava/awt/Component;BLjava/awt/Point;)Lclient!gj;")
	public Class86 method3244(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(5) Point arg4) {
		return this.method3263(arg2, 17, 2, new Object[] { arg3, arg0, arg4 }, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)Lclient!bn;")
	public Interface1 method3245() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public void method3246() {
		Static175.aLong107 = Static101.method1805() + 5000L;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!gj;")
	private Class86 method3247(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		if (arg1 != 0) {
			this.method3249(123, -10, -102);
		}
		return this.method3263(0, 15, 2, arg2, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Lclient!gj;")
	public Class86 method3248() {
		return this.method3263(0, 12, 2, null, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)Lclient!gj;")
	public Class86 method3249(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3263(arg2 << 16, 6, 2, null, (arg1 << 16) + arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!gj;")
	public Class86 method3250(@OriginalArg(1) Class arg0) {
		return this.method3263(0, 11, 2, arg0, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lclient!gj;")
	public Class86 method3251(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3263(0, 2, 2, arg1, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!gj;")
	public Class86 method3252(@OriginalArg(0) URL arg0) {
		return this.method3263(0, 4, 2, arg0, 0);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Z")
	public boolean method3253() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!gj;")
	public Class86 method3254(@OriginalArg(1) Class arg0) {
		return this.method3263(0, 10, 2, arg0, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method3255(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.method3249(-123, -61, -3);
		}
		@Pc(18) Class86 local18 = this.method3259(0, 21, arg0, 0);
		return (byte[]) local18.anObject2;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!gj;")
	public Class86 method3256(@OriginalArg(0) String arg0) {
		return this.method3263(0, 16, 2, arg0, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lclient!gj;")
	public Class86 method3257(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method3263(0, 9, 2, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Lclient!gj;")
	public Class86 method3258(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.method3263(0, 8, 2, new Object[] { arg0, arg1, arg2 }, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!gj;")
	private Class86 method3259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class86 local3 = new Class86();
		synchronized (local3) {
			local3.anInt2589 = arg1;
			local3.anInt2588 = arg3;
			local3.anObject1 = arg2;
			synchronized (this) {
				if (this.aClass86_6 == null) {
					this.aClass86_6 = this.aClass86_5 = local3;
				} else {
					this.aClass86_6.aClass86_3 = local3;
					this.aClass86_6 = local3;
				}
				this.notify();
			}
			if (arg0 != 0) {
				this.aClass248_3 = null;
			}
			try {
				local3.wait();
			} catch (@Pc(54) InterruptedException local54) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!gj;")
	private Class86 method3260(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		return arg3 == 14 ? this.method3263(arg2 + local2.y, 14, arg3 - 12, null, arg1 + local2.x) : null;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Lclient!gj;")
	public Class86 method3261() {
		return this.method3263(0, 5, 2, null, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!gj;")
	private Class86 method3262(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (!arg0) {
			this.anApplet1 = null;
		}
		return this.method3263(0, 21, 2, arg1, 0);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIILjava/lang/Object;I)Lclient!gj;")
	private Class86 method3263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class86 local3 = new Class86();
		local3.anObject1 = arg3;
		local3.anInt2589 = arg1;
		local3.anInt2588 = arg4;
		synchronized (this) {
			if (this.aClass86_6 == null) {
				this.aClass86_6 = this.aClass86_5 = local3;
			} else {
				this.aClass86_6.aClass86_3 = local3;
				this.aClass86_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!gj;")
	private Class86 method3264(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 == 19 ? this.method3263(0, 19, 2, arg1, 0) : null;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Lclient!gj;")
	private Class86 method3265() {
		return this.method3263(0, 18, 2, null, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!gj;")
	public Class86 method3266(@OriginalArg(0) Frame arg0) {
		return this.method3263(0, 7, 2, arg0, 0);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Lclient!gj;")
	public Class86 method3267() {
		return this.method3263(0, 13, 2, null, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!gj;")
	public Class86 method3268(@OriginalArg(0) Class arg0) {
		return this.method3263(0, 20, 2, arg0, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!gj;")
	public Class86 method3269(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method3263(0, 1, 2, arg1, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lclient!gj;")
	public Class86 method3270(@OriginalArg(0) int arg0) {
		return this.method3263(0, 3, 2, null, arg0);
	}
}
