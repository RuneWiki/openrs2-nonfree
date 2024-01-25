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

@OriginalClass("client!de")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!la;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "[Lclient!cs;")
	public Class39[] aClass39Array1;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!cs;")
	public Class39 aClass39_2 = null;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!cs;")
	public Class39 aClass39_3 = null;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!vc;")
	private Class207 aClass207_4 = null;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Lclient!cs;")
	public Class39 aClass39_4 = null;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Lclient!vc;")
	private Class207 aClass207_5 = null;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class42(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static59.aString43 = "Unknown";
		Static59.aString39 = "1.1";
		try {
			Static59.aString43 = System.getProperty("java.vendor");
			Static59.aString39 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static59.aString44 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static59.aString44 = "Unknown";
		}
		Static59.aString40 = Static59.aString44.toLowerCase();
		try {
			Static59.aString42 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static59.aString42 = "";
		}
		try {
			Static59.aString41 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static59.aString41 = "";
		}
		try {
			Static59.aString38 = System.getProperty("user.home");
			if (Static59.aString38 != null) {
				Static59.aString38 = Static59.aString38 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static59.aString38 == null) {
			Static59.aString38 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static59.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static59.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static59.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static59.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean59 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lclient!vc;")
	private Class207 method959(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 > -94 ? null : this.method962(arg1, 0, 0, 19, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILjava/lang/String;)Lclient!vc;")
	public Class207 method960(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method962(arg1, 0, 0, 1, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BIIILjava/lang/Object;)Lclient!vc;")
	private Class207 method961(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class207 local3 = new Class207();
		synchronized (local3) {
			local3.anInt6347 = arg1;
			local3.anInt6345 = arg2;
			local3.anObject6 = arg3;
			synchronized (this) {
				if (this.aClass207_4 == null) {
					this.aClass207_4 = this.aClass207_5 = local3;
				} else {
					this.aClass207_4.aClass207_8 = local3;
					this.aClass207_4 = local3;
				}
				if (arg0 != -41) {
					Static59.aString44 = null;
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

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!vc;")
	private Class207 method962(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class207 local3 = new Class207();
		local3.anObject6 = arg0;
		local3.anInt6347 = arg3;
		local3.anInt6345 = arg4;
		synchronized (this) {
			if (this.aClass207_4 == null) {
				this.aClass207_4 = this.aClass207_5 = local3;
			} else {
				this.aClass207_4.aClass207_8 = local3;
				this.aClass207_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public void method963() {
		synchronized (this) {
			this.aBoolean59 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass39_2 != null) {
			try {
				this.aClass39_2.method903();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass39_3 != null) {
			try {
				this.aClass39_3.method903();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass39Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass39Array1.length; local49++) {
				if (this.aClass39Array1[local49] != null) {
					try {
						this.aClass39Array1[local49].method903();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass39_4 != null) {
			try {
				this.aClass39_4.method903();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Lclient!vc;")
	public Class207 method964() {
		return this.method962(null, 0, 0, 12, 0);
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z")
	public boolean method965() {
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!vc;")
	public Class207 method966(@OriginalArg(0) Frame arg0) {
		return this.method962(arg0, 0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!vc;")
	public Class207 method967(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method962(new Object[] { arg1, arg0 }, 0, 0, 9, 0);
	}

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class207 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean59) {
						return;
					}
					if (this.aClass207_5 != null) {
						local15 = this.aClass207_5;
						this.aClass207_5 = this.aClass207_5.aClass207_8;
						if (this.aClass207_5 == null) {
							this.aClass207_4 = null;
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
				@Pc(41) int local41 = local15.anInt6347;
				if (local41 == 1) {
					if (Static53.method898() < Static59.aLong54) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt6345);
				} else if (local41 == 2) {
					@Pc(75) Thread local75 = new Thread((Runnable) local15.anObject6);
					local75.setDaemon(true);
					local75.start();
					local75.setPriority(local15.anInt6345);
					local15.anObject7 = local75;
				} else if (local41 == 4) {
					if (Static59.aLong54 > Static53.method898()) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(121) Object[] local121;
					if (local41 == 8) {
						local121 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local121[0]).getDeclaredMethod((String) local121[1], (Class[]) local121[2]);
					} else if (local41 == 9) {
						local121 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local121[0]).getDeclaredField((String) local121[1]);
					} else if (local41 == 18) {
						@Pc(168) Clipboard local168 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject7 = local168.getContents(null);
					} else if (local41 == 19) {
						@Pc(157) Transferable local157 = (Transferable) local15.anObject6;
						@Pc(160) Clipboard local160 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local160.setContents(local157, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6346 = 1;
			} catch (@Pc(194) ThreadDeath local194) {
				throw local194;
			} catch (@Pc(197) Throwable local197) {
				local15.anInt6346 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method968(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.aClass207_5 = null;
		}
		@Pc(13) Class207 local13 = this.method961((byte) -41, 21, 0, arg0);
		return (byte[]) local13.anObject7;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/awt/Component;ILjava/awt/Point;I[I)Lclient!vc;")
	public Class207 method969(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		return this.method962(new Object[] { arg1, arg4, arg2 }, 0, arg3, 17, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!vc;")
	private Class207 method970(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		return arg0 == 4949 ? this.method962(null, arg0 ^ 0x1355, arg3 + local2.y, 14, local2.x + arg2) : null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Lclient!vc;")
	public Class207 method971() {
		return this.method962(null, 0, 0, 13, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lclient!vc;")
	public Class207 method972(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method962(arg0, 0, 0, 2, arg1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)Lclient!vc;")
	public Class207 method973(@OriginalArg(1) int arg0) {
		return this.method962(null, 0, 0, 3, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!vc;")
	public Class207 method974(@OriginalArg(0) URL arg0) {
		return this.method962(arg0, 0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public void method975() {
		Static59.aLong54 = Static53.method898() + 5000L;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;)Lclient!vc;")
	public Class207 method976(@OriginalArg(1) String arg0) {
		return this.method962(arg0, 0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!vc;")
	public Class207 method977(@OriginalArg(0) Class arg0) {
		return this.method962(arg0, 0, 0, 10, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIB)Lclient!vc;")
	public Class207 method978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method962(null, 0, arg0 << 16, 6, arg1 + (arg2 << 16));
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!vc;")
	private Class207 method979(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -47) {
			Static59.aString40 = null;
		}
		return this.method962(arg0, 0, 0, 21, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!vc;")
	public Class207 method980(@OriginalArg(1) Class arg0) {
		return this.method962(arg0, 0, 0, 11, 0);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!vc;")
	public Class207 method981(@OriginalArg(0) Class arg0) {
		return this.method962(arg0, 0, 0, 20, 0);
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)Lclient!vc;")
	private Class207 method982(@OriginalArg(0) int arg0) {
		if (arg0 != 7782) {
			this.anApplet1 = null;
		}
		return this.method962(null, 0, 0, 18, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;Z)Lclient!vc;")
	public Class207 method983(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2) {
		return this.method962(new Object[] { arg1, arg0, arg2 }, 0, 0, 8, 0);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)Lclient!la;")
	public Interface4 method984() {
		return this.anInterface4_2;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Lclient!vc;")
	public Class207 method985() {
		return this.method962(null, 0, 0, 5, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BZLjava/awt/Component;)Lclient!vc;")
	private Class207 method986(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		return this.method962(arg1, 0, 0, 15, arg0 ? 1 : 0);
	}
}
