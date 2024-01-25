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

@OriginalClass("client!vj")
public final class Class206 implements Runnable {

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "[Lclient!um;")
	public Class201[] aClass201Array1;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "Lclient!pg;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!ue;")
	private Class196 aClass196_7 = null;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Lclient!um;")
	public Class201 aClass201_2 = null;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "Z")
	private boolean aBoolean406 = false;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "Lclient!um;")
	public Class201 aClass201_4 = null;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "Lclient!um;")
	public Class201 aClass201_3 = null;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "Lclient!ue;")
	private Class196 aClass196_8 = null;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class206(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static332.aString293 = "1.1";
		Static332.aString292 = "Unknown";
		this.anApplet1 = arg0;
		try {
			Static332.aString292 = System.getProperty("java.vendor");
			Static332.aString293 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static332.aString291 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static332.aString291 = "Unknown";
		}
		Static332.aString294 = Static332.aString291.toLowerCase();
		try {
			Static332.aString288 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static332.aString288 = "";
		}
		try {
			Static332.aString290 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static332.aString290 = "";
		}
		try {
			Static332.aString289 = System.getProperty("user.home");
			if (Static332.aString289 != null) {
				Static332.aString289 = Static332.aString289 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static332.aString289 == null) {
			Static332.aString289 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static332.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static332.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static332.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static332.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean406 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Lclient!ue;")
	public Class196 method5508() {
		return this.method5527(5, 0, 0, null);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)Lclient!ue;")
	public Class196 method5509() {
		return this.method5527(13, 0, 0, null);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ue;")
	public Class196 method5510(@OriginalArg(0) String arg0) {
		return this.method5527(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!ue;")
	public Class196 method5511(@OriginalArg(0) Class arg0) {
		return this.method5527(20, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public void method5512() {
		synchronized (this) {
			this.aBoolean406 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass201_2 != null) {
			try {
				this.aClass201_2.method5359();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass201_4 != null) {
			try {
				this.aClass201_4.method5359();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass201Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass201Array1.length; local48++) {
				if (this.aClass201Array1[local48] != null) {
					try {
						this.aClass201Array1[local48].method5359();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass201_3 != null) {
			try {
				this.aClass201_3.method5359();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!ue;")
	public Class196 method5513(@OriginalArg(1) Frame arg0) {
		return this.method5527(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lclient!ue;")
	private Class196 method5514(@OriginalArg(0) int arg0) {
		if (arg0 != -19491) {
			Static332.aString289 = null;
		}
		return this.method5527(18, 0, 0, null);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lclient!ue;")
	public Class196 method5515(@OriginalArg(0) int arg0) {
		return this.method5527(3, 0, arg0, null);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ue;")
	private Class196 method5516(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 96) {
			this.anApplet1 = null;
		}
		return this.method5527(21, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)Lclient!ue;")
	public Class196 method5517() {
		return this.method5527(12, 0, 0, null);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!ue;")
	public Class196 method5518(@OriginalArg(1) URL arg0) {
		return this.method5527(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!ue;")
	public Class196 method5519(@OriginalArg(0) Class arg0) {
		return this.method5527(10, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!ue;")
	public Class196 method5520(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method5527(9, 0, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!ue;")
	private Class196 method5521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class196 local3 = new Class196();
		synchronized (local3) {
			local3.anInt5852 = arg1;
			if (arg0 != 13143) {
				this.method5515(91);
			}
			local3.anInt5853 = arg3;
			local3.anObject7 = arg2;
			synchronized (this) {
				if (this.aClass196_8 == null) {
					this.aClass196_8 = this.aClass196_7 = local3;
				} else {
					this.aClass196_8.aClass196_6 = local3;
					this.aClass196_8 = local3;
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

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Point;[IBILjava/awt/Component;)Lclient!ue;")
	public Class196 method5522(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method5527(17, arg3, arg0, new Object[] { arg4, arg2, arg1 });
	}

	@OriginalMember(owner = "client!vj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class196 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean406) {
						return;
					}
					if (this.aClass196_7 != null) {
						local15 = this.aClass196_7;
						this.aClass196_7 = this.aClass196_7.aClass196_6;
						if (this.aClass196_7 == null) {
							this.aClass196_8 = null;
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
				@Pc(41) int local41 = local15.anInt5852;
				if (local41 == 1) {
					if (Static332.aLong212 > Static245.method4300()) {
						throw new IOException();
					}
					local15.anObject8 = new Socket(InetAddress.getByName((String) local15.anObject7), local15.anInt5853);
				} else if (local41 == 2) {
					@Pc(79) Thread local79 = new Thread((Runnable) local15.anObject7);
					local79.setDaemon(true);
					local79.start();
					local79.setPriority(local15.anInt5853);
					local15.anObject8 = local79;
				} else if (local41 == 4) {
					if (Static245.method4300() < Static332.aLong212) {
						throw new IOException();
					}
					local15.anObject8 = new DataInputStream(((URL) local15.anObject7).openStream());
				} else {
					@Pc(123) Object[] local123;
					if (local41 == 8) {
						local123 = (Object[]) local15.anObject7;
						local15.anObject8 = ((Class) local123[0]).getDeclaredMethod((String) local123[1], (Class[]) local123[2]);
					} else if (local41 == 9) {
						local123 = (Object[]) local15.anObject7;
						local15.anObject8 = ((Class) local123[0]).getDeclaredField((String) local123[1]);
					} else if (local41 == 18) {
						@Pc(148) Clipboard local148 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject8 = local148.getContents(null);
					} else if (local41 == 19) {
						@Pc(161) Transferable local161 = (Transferable) local15.anObject7;
						@Pc(164) Clipboard local164 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local164.setContents(local161, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5851 = 1;
			} catch (@Pc(194) ThreadDeath local194) {
				throw local194;
			} catch (@Pc(197) Throwable local197) {
				local15.anInt5851 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!ue;")
	private Class196 method5523(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != 1) {
			Static332.aString292 = null;
		}
		return this.method5527(15, 0, arg2 ? 1 : 0, arg1);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method5524(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class196 local7 = this.method5521(13143, 21, arg0, arg1);
		return (byte[]) local7.anObject8;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZLjava/lang/String;)Lclient!ue;")
	public Class196 method5525(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method5527(1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lclient!ue;")
	public Class196 method5526(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method5527(2, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIILjava/lang/Object;)Lclient!ue;")
	private Class196 method5527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class196 local3 = new Class196();
		local3.anInt5852 = arg0;
		local3.anObject7 = arg3;
		local3.anInt5853 = arg2;
		synchronized (this) {
			if (this.aClass196_8 == null) {
				this.aClass196_8 = this.aClass196_7 = local3;
			} else {
				this.aClass196_8.aClass196_6 = local3;
				this.aClass196_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!ue;")
	private Class196 method5528(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > -24) {
			this.aClass201_2 = null;
		}
		@Pc(8) Point local8 = arg0.getLocationOnScreen();
		return this.method5527(14, local8.y + arg1, local8.x + arg2, null);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lclient!ue;")
	public Class196 method5529(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method5527(8, 0, 0, new Object[] { arg1, arg0, arg2 });
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!ue;")
	private Class196 method5530(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 50) {
			this.method5520(null, null);
		}
		return this.method5527(19, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)Z")
	public boolean method5531() {
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	public void method5532() {
		Static332.aLong212 = Static245.method4300() + 5000L;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!ue;")
	public Class196 method5533(@OriginalArg(1) Class arg0) {
		return this.method5527(11, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)Lclient!pg;")
	public Interface6 method5534() {
		return this.anInterface6_1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBII)Lclient!ue;")
	public Class196 method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method5527(6, arg1 << 16, (arg2 << 16) + arg0, null);
	}
}
