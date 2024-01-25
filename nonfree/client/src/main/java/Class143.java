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

@OriginalClass("client!nh")
public final class Class143 implements Runnable {

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "[Lclient!ib;")
	public Class90[] aClass90Array1;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Lclient!fq;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!ib;")
	public Class90 aClass90_3 = null;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!ib;")
	public Class90 aClass90_1 = null;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Lclient!ph;")
	private Class162 aClass162_5 = null;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "Lclient!ph;")
	private Class162 aClass162_6 = null;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!ib;")
	public Class90 aClass90_2 = null;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class143(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static207.aString39 = "Unknown";
		Static207.aString40 = "1.1";
		try {
			Static207.aString39 = System.getProperty("java.vendor");
			Static207.aString40 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static207.aString42 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static207.aString42 = "Unknown";
		}
		Static207.aString41 = Static207.aString42.toLowerCase();
		try {
			Static207.aString44 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static207.aString44 = "";
		}
		try {
			Static207.aString45 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static207.aString45 = "";
		}
		try {
			Static207.aString43 = System.getProperty("user.home");
			if (Static207.aString43 != null) {
				Static207.aString43 = Static207.aString43 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static207.aString43 == null) {
			Static207.aString43 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static207.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static207.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static207.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static207.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean414 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!nh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class162 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean414) {
						return;
					}
					if (this.aClass162_5 != null) {
						local15 = this.aClass162_5;
						this.aClass162_5 = this.aClass162_5.aClass162_8;
						if (this.aClass162_5 == null) {
							this.aClass162_6 = null;
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
				@Pc(41) int local41 = local15.anInt4799;
				if (local41 == 1) {
					if (Static162.method3252() < Static207.aLong133) {
						throw new IOException();
					}
					local15.anObject5 = new Socket(InetAddress.getByName((String) local15.anObject4), local15.anInt4800);
				} else if (local41 == 2) {
					@Pc(158) Thread local158 = new Thread((Runnable) local15.anObject4);
					local158.setDaemon(true);
					local158.start();
					local158.setPriority(local15.anInt4800);
					local15.anObject5 = local158;
				} else if (local41 == 4) {
					if (Static162.method3252() < Static207.aLong133) {
						throw new IOException();
					}
					local15.anObject5 = new DataInputStream(((URL) local15.anObject4).openStream());
				} else {
					@Pc(85) Object[] local85;
					if (local41 == 8) {
						local85 = (Object[]) local15.anObject4;
						local15.anObject5 = ((Class) local85[0]).getDeclaredMethod((String) local85[1], (Class[]) local85[2]);
					} else if (local41 == 9) {
						local85 = (Object[]) local15.anObject4;
						local15.anObject5 = ((Class) local85[0]).getDeclaredField((String) local85[1]);
					} else if (local41 == 18) {
						@Pc(103) Clipboard local103 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject5 = local103.getContents(null);
					} else if (local41 == 19) {
						@Pc(123) Transferable local123 = (Transferable) local15.anObject4;
						@Pc(126) Clipboard local126 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local126.setContents(local123, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt4801 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local15.anInt4801 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Lclient!ph;")
	public Class162 method3885() {
		return this.method3912(null, 0, 13, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!ph;")
	private Class162 method3886(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		@Pc(3) Class162 local3 = new Class162();
		synchronized (local3) {
			local3.anInt4800 = arg1;
			local3.anObject4 = arg2;
			local3.anInt4799 = arg0;
			synchronized (this) {
				if (this.aClass162_6 == null) {
					this.aClass162_6 = this.aClass162_5 = local3;
				} else {
					this.aClass162_6.aClass162_8 = local3;
					this.aClass162_6 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(57) InterruptedException local57) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!ph;")
	public Class162 method3887(@OriginalArg(1) Class arg0) {
		return this.method3912(arg0, 0, 10, 0);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Lclient!ph;")
	public Class162 method3888() {
		return this.method3912(null, 0, 5, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZLjava/lang/String;)Lclient!ph;")
	public Class162 method3889(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method3912(arg1, 0, 1, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!ph;")
	public Class162 method3890(@OriginalArg(0) Class arg0) {
		return this.method3912(arg0, 0, 11, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/awt/Component;II)Lclient!ph;")
	private Class162 method3891(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		return arg0 < 96 ? null : this.method3912(null, arg3 + local2.y, 14, arg2 + local2.x);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!ph;")
	private Class162 method3892(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			Static207.anInt4332 = -8;
		}
		return this.method3912(arg0, 0, 19, 0);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public void method3893() {
		Static207.aLong133 = Static162.method3252() + 5000L;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/net/URL;)Lclient!ph;")
	public Class162 method3894(@OriginalArg(1) URL arg0) {
		return this.method3912(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)Z")
	public boolean method3895() {
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!ph;")
	private Class162 method3896(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2) {
		return arg1 >= -125 ? null : this.method3912(arg2, 0, 15, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method3897(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class162 local7 = this.method3886(21, 0, arg0);
		return arg1 >= -65 ? null : (byte[]) local7.anObject5;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lclient!ph;")
	public Class162 method3898(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2) {
		return this.method3912(new Object[] { arg0, arg2, arg1 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)Lclient!ph;")
	public Class162 method3899() {
		return this.method3912(null, 0, 12, 0);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)Lclient!ph;")
	private Class162 method3900(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static207.aString44 = null;
		}
		return this.method3912(null, 0, 18, 0);
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)Lclient!fq;")
	public Interface1 method3901() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/awt/Frame;)Lclient!ph;")
	public Class162 method3902(@OriginalArg(1) Frame arg0) {
		return this.method3912(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)Lclient!ph;")
	public Class162 method3903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method3912(null, arg2 << 16, 6, (arg1 << 16) + arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/awt/Point;II[ILjava/awt/Component;)Lclient!ph;")
	public Class162 method3904(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Component arg4) {
		return this.method3912(new Object[] { arg4, arg3, arg1 }, arg0, 17, arg2);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!ph;")
	public Class162 method3905(@OriginalArg(1) Class arg0) {
		return this.method3912(arg0, 0, 20, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ph;")
	private Class162 method3906(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method3892(null, 67);
		}
		return this.method3912(arg0, 0, 21, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public void method3907() {
		synchronized (this) {
			this.aBoolean414 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass90_3 != null) {
			try {
				this.aClass90_3.method2565();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass90_2 != null) {
			try {
				this.aClass90_2.method2565();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass90Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass90Array1.length; local48++) {
				if (this.aClass90Array1[local48] != null) {
					try {
						this.aClass90Array1[local48].method2565();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass90_1 != null) {
			try {
				this.aClass90_1.method2565();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ph;")
	public Class162 method3908(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method3912(arg0, 0, 2, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lclient!ph;")
	public Class162 method3909(@OriginalArg(0) int arg0) {
		return this.method3912(null, 0, 3, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lclient!ph;")
	public Class162 method3910(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method3912(new Object[] { arg0, arg1 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Ljava/lang/String;B)Lclient!ph;")
	public Class162 method3911(@OriginalArg(0) String arg0) {
		return this.method3912(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!ph;")
	private Class162 method3912(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class162 local3 = new Class162();
		local3.anObject4 = arg0;
		local3.anInt4800 = arg3;
		local3.anInt4799 = arg2;
		synchronized (this) {
			if (this.aClass162_6 == null) {
				this.aClass162_6 = this.aClass162_5 = local3;
			} else {
				this.aClass162_6.aClass162_8 = local3;
				this.aClass162_6 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
