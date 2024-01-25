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

@OriginalClass("client!ne")
public final class Class139 implements Runnable {

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!kl;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[Lclient!ih;")
	public Class92[] aClass92Array1;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!bc;")
	private Class16 aClass16_6 = null;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!ih;")
	public Class92 aClass92_3 = null;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Z")
	private boolean aBoolean345 = false;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!ih;")
	public Class92 aClass92_2 = null;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "Lclient!ih;")
	public Class92 aClass92_4 = null;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!bc;")
	private Class16 aClass16_5 = null;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class139(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static210.aString30 = "Unknown";
		Static210.aString35 = "1.1";
		this.anApplet1 = arg0;
		try {
			Static210.aString30 = System.getProperty("java.vendor");
			Static210.aString35 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static210.aString31 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static210.aString31 = "Unknown";
		}
		Static210.aString33 = Static210.aString31.toLowerCase();
		try {
			Static210.aString36 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static210.aString36 = "";
		}
		try {
			Static210.aString32 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static210.aString32 = "";
		}
		try {
			Static210.aString34 = System.getProperty("user.home");
			if (Static210.aString34 != null) {
				Static210.aString34 = Static210.aString34 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static210.aString34 == null) {
			Static210.aString34 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static210.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static210.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static210.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static210.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean345 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!bc;")
	public Class16 method3855(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method3867(-12773, 0, arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/net/URL;)Lclient!bc;")
	public Class16 method3856(@OriginalArg(1) URL arg0) {
		return this.method3867(-12773, 0, 0, 4, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILjava/lang/String;)Lclient!bc;")
	public Class16 method3857(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method3867(-12773, 0, arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)Lclient!bc;")
	public Class16 method3858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method3867(-12773, arg2 << 16, arg1 + (arg0 << 16), 6, null);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public void method3859() {
		synchronized (this) {
			this.aBoolean345 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass92_4 != null) {
			try {
				this.aClass92_4.method2387();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass92_2 != null) {
			try {
				this.aClass92_2.method2387();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass92Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass92Array1.length; local52++) {
				if (this.aClass92Array1[local52] != null) {
					try {
						this.aClass92Array1[local52].method2387();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass92_3 != null) {
			try {
				this.aClass92_3.method2387();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lclient!bc;")
	public Class16 method3860() {
		return this.method3867(-12773, 0, 0, 13, null);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/awt/Component;Z)Lclient!bc;")
	private Class16 method3861(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 > -59) {
			this.anInterface6_1 = null;
		}
		return this.method3867(-12773, 0, arg2 ? 1 : 0, 15, arg1);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lclient!bc;")
	public Class16 method3862(@OriginalArg(1) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method3867(-12773, 0, 0, 8, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!bc;")
	public Class16 method3863(@OriginalArg(1) Frame arg0) {
		return this.method3867(-12773, 0, 0, 7, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Lclient!bc;")
	private Class16 method3864(@OriginalArg(0) int arg0) {
		return arg0 < 68 ? null : this.method3867(-12773, 0, 0, 18, null);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Lclient!bc;")
	public Class16 method3865() {
		return this.method3867(-12773, 0, 0, 5, null);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method3866(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(9) Class16 local9 = this.method3871(arg0 ^ 0xFFFFFFAC, arg1, 0, arg0);
		return (byte[]) local9.anObject1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!bc;")
	private Class16 method3867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class16 local3 = new Class16();
		local3.anObject2 = arg4;
		local3.anInt379 = arg3;
		local3.anInt380 = arg2;
		synchronized (this) {
			if (this.aClass16_6 == null) {
				this.aClass16_6 = this.aClass16_5 = local3;
			} else {
				this.aClass16_6.aClass16_1 = local3;
				this.aClass16_6 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Lclient!bc;")
	public Class16 method3868() {
		return this.method3867(-12773, 0, 0, 12, null);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!bc;")
	private Class16 method3869(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 16) {
			this.method3863(null);
		}
		return this.method3867(-12773, 0, 0, 19, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)Lclient!kl;")
	public Interface6 method3870() {
		return this.anInterface6_1;
	}

	@OriginalMember(owner = "client!ne", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class16 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean345) {
						return;
					}
					if (this.aClass16_5 != null) {
						local15 = this.aClass16_5;
						this.aClass16_5 = this.aClass16_5.aClass16_1;
						if (this.aClass16_5 == null) {
							this.aClass16_6 = null;
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
				@Pc(41) int local41 = local15.anInt379;
				if (local41 == 1) {
					if (Static210.aLong149 > Static340.method5863()) {
						throw new IOException();
					}
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt380);
				} else if (local41 == 2) {
					@Pc(177) Thread local177 = new Thread((Runnable) local15.anObject2);
					local177.setDaemon(true);
					local177.start();
					local177.setPriority(local15.anInt380);
					local15.anObject1 = local177;
				} else if (local41 == 4) {
					if (Static210.aLong149 > Static340.method5863()) {
						throw new IOException();
					}
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(138) Object[] local138;
					if (local41 == 8) {
						local138 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local138[0]).getDeclaredMethod((String) local138[1], (Class[]) local138[2]);
					} else if (local41 == 9) {
						local138 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local138[0]).getDeclaredField((String) local138[1]);
					} else if (local41 == 18) {
						@Pc(108) Clipboard local108 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject1 = local108.getContents(null);
					} else if (local41 == 19) {
						@Pc(126) Transferable local126 = (Transferable) local15.anObject2;
						@Pc(129) Clipboard local129 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local129.setContents(local126, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt381 = 1;
			} catch (@Pc(194) ThreadDeath local194) {
				throw local194;
			} catch (@Pc(197) Throwable local197) {
				local15.anInt381 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!bc;")
	private Class16 method3871(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class16 local3 = new Class16();
		synchronized (local3) {
			local3.anInt379 = arg3;
			local3.anObject2 = arg1;
			local3.anInt380 = arg2;
			synchronized (this) {
				if (this.aClass16_6 == null) {
					this.aClass16_6 = this.aClass16_5 = local3;
				} else {
					this.aClass16_6.aClass16_1 = local3;
					this.aClass16_6 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
			if (arg0 >= -25) {
				this.anEventQueue1 = null;
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;IILjava/awt/Point;[II)Lclient!bc;")
	public Class16 method3872(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) int[] arg4) {
		return this.method3867(-12773, arg2, arg1, 17, new Object[] { arg0, arg4, arg3 });
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!bc;")
	public Class16 method3873(@OriginalArg(0) Class arg0) {
		return this.method3867(-12773, 0, 0, 10, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!bc;")
	public Class16 method3874(@OriginalArg(1) Class arg0) {
		return this.method3867(-12773, 0, 0, 20, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)Z")
	public boolean method3875() {
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!bc;")
	public Class16 method3876(@OriginalArg(1) Class arg0) {
		return this.method3867(-12773, 0, 0, 11, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lclient!bc;")
	public Class16 method3877(@OriginalArg(1) int arg0) {
		return this.method3867(-12773, 0, arg0, 3, null);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!bc;")
	private Class16 method3878(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -76) {
			this.method3861((byte) 81, null, true);
		}
		return this.method3867(arg1 - 12697, 0, 0, 21, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V")
	public void method3879() {
		Static210.aLong149 = Static340.method5863() + 5000L;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lclient!bc;")
	public Class16 method3880(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3867(-12773, 0, 0, 9, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!bc;")
	private Class16 method3881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		return arg1 == 5081 ? this.method3867(arg1 - 17854, local2.y + arg0, arg2 + local2.x, 14, null) : null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!bc;")
	public Class16 method3882(@OriginalArg(1) String arg0) {
		return this.method3867(-12773, 0, 0, 16, arg0);
	}
}
