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

@OriginalClass("client!bd")
public final class Class21 implements Runnable {

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "[Lclient!vk;")
	public Class207[] aClass207Array1;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!ro;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!id;")
	private Class99 aClass99_1 = null;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!id;")
	private Class99 aClass99_2 = null;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!vk;")
	public Class207 aClass207_1 = null;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!vk;")
	public Class207 aClass207_2 = null;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!vk;")
	public Class207 aClass207_3 = null;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class21(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static22.aString36 = "1.1";
		Static22.aString38 = "Unknown";
		this.anApplet1 = arg0;
		try {
			Static22.aString38 = System.getProperty("java.vendor");
			Static22.aString36 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static22.aString33 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static22.aString33 = "Unknown";
		}
		Static22.aString35 = Static22.aString33.toLowerCase();
		try {
			Static22.aString37 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static22.aString37 = "";
		}
		try {
			Static22.aString39 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static22.aString39 = "";
		}
		try {
			Static22.aString34 = System.getProperty("user.home");
			if (Static22.aString34 != null) {
				Static22.aString34 = Static22.aString34 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static22.aString34 == null) {
			Static22.aString34 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static22.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static22.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static22.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static22.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean23 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!id;")
	public Class99 method364(@OriginalArg(0) URL arg0) {
		return this.method387(4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Lclient!id;")
	public Class99 method365() {
		return this.method387(5, null, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;)Lclient!id;")
	private Class99 method366(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 21) {
			this.method375(61, null);
		}
		return this.method387(21, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZLjava/awt/Component;)Lclient!id;")
	private Class99 method367(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 > -18) {
			this.method380(64, null);
		}
		return this.method387(15, arg2, arg1 ? 1 : 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method368(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.aThread1 = null;
		}
		@Pc(13) Class99 local13 = this.method371(21, arg0, 0, (byte) -42);
		return (byte[]) local13.anObject2;
	}

	@OriginalMember(owner = "client!bd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class99 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean23) {
						return;
					}
					if (this.aClass99_1 != null) {
						local15 = this.aClass99_1;
						this.aClass99_1 = this.aClass99_1.aClass99_5;
						if (this.aClass99_1 == null) {
							this.aClass99_2 = null;
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
				@Pc(41) int local41 = local15.anInt2835;
				if (local41 == 1) {
					if (Static22.aLong19 > Static335.method5308()) {
						throw new IOException();
					}
					local15.anObject2 = new Socket(InetAddress.getByName((String) local15.anObject3), local15.anInt2834);
				} else if (local41 == 2) {
					@Pc(154) Thread local154 = new Thread((Runnable) local15.anObject3);
					local154.setDaemon(true);
					local154.start();
					local154.setPriority(local15.anInt2834);
					local15.anObject2 = local154;
				} else if (local41 == 4) {
					if (Static22.aLong19 > Static335.method5308()) {
						throw new IOException();
					}
					local15.anObject2 = new DataInputStream(((URL) local15.anObject3).openStream());
				} else {
					@Pc(78) Object[] local78;
					if (local41 == 8) {
						local78 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local78[0]).getDeclaredMethod((String) local78[1], (Class[]) local78[2]);
					} else if (local41 == 9) {
						local78 = (Object[]) local15.anObject3;
						local15.anObject2 = ((Class) local78[0]).getDeclaredField((String) local78[1]);
					} else if (local41 == 18) {
						@Pc(105) Clipboard local105 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject2 = local105.getContents(null);
					} else if (local41 == 19) {
						@Pc(123) Transferable local123 = (Transferable) local15.anObject3;
						@Pc(126) Clipboard local126 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local126.setContents(local123, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt2836 = 1;
			} catch (@Pc(192) ThreadDeath local192) {
				throw local192;
			} catch (@Pc(195) Throwable local195) {
				local15.anInt2836 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!id;")
	public Class99 method369(@OriginalArg(1) Class arg0) {
		return this.method387(20, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;BII)Lclient!id;")
	private Class99 method370(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == -44) {
			@Pc(7) Point local7 = arg0.getLocationOnScreen();
			return this.method387(14, null, arg2 + local7.x, local7.y + arg3);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILjava/lang/Object;IB)Lclient!id;")
	private Class99 method371(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(3) Class99 local3 = new Class99();
		synchronized (local3) {
			local3.anInt2834 = arg2;
			local3.anObject3 = arg1;
			local3.anInt2835 = arg0;
			synchronized (this) {
				if (this.aClass99_2 == null) {
					this.aClass99_2 = this.aClass99_1 = local3;
				} else {
					this.aClass99_2.aClass99_5 = local3;
					this.aClass99_2 = local3;
				}
				if (arg3 != -42) {
					Static22.aString37 = null;
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

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Lclient!id;")
	public Class99 method372() {
		return this.method387(13, null, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Z")
	public boolean method373() {
		return false;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!id;")
	public Class99 method374(@OriginalArg(1) Class arg0) {
		return this.method387(10, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!id;")
	public Class99 method375(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method387(2, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!id;")
	public Class99 method376(@OriginalArg(0) Frame arg0) {
		return this.method387(7, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIII)Lclient!id;")
	public Class99 method377(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method387(6, null, (arg2 << 16) + arg0, arg1 << 16);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Lclient!id;")
	public Class99 method378(@OriginalArg(1) int arg0) {
		return this.method387(3, null, arg0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	public void method379() {
		Static22.aLong19 = Static335.method5308() + 5000L;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!id;")
	public Class99 method380(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method387(1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!id;")
	public Class99 method381(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method387(8, new Object[] { arg2, arg0, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Lclient!ro;")
	public Interface8 method382() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lclient!id;")
	private Class99 method383(@OriginalArg(0) int arg0) {
		if (arg0 != -8476) {
			Static22.aMethod2 = null;
		}
		return this.method387(18, null, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!id;")
	public Class99 method384(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method387(9, new Object[] { arg0, arg1 }, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!id;")
	private Class99 method385(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -80) {
			this.method384(null, null);
		}
		return this.method387(19, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Lclient!id;")
	public Class99 method386() {
		return this.method387(12, null, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!id;")
	private Class99 method387(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class99 local3 = new Class99();
		local3.anInt2834 = arg2;
		local3.anInt2835 = arg0;
		local3.anObject3 = arg1;
		synchronized (this) {
			if (this.aClass99_2 == null) {
				this.aClass99_2 = this.aClass99_1 = local3;
			} else {
				this.aClass99_2.aClass99_5 = local3;
				this.aClass99_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!id;")
	public Class99 method388(@OriginalArg(0) Class arg0) {
		return this.method387(11, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILjava/awt/Point;I[ILjava/awt/Component;)Lclient!id;")
	public Class99 method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Component arg4) {
		return this.method387(17, new Object[] { arg4, arg3, arg2 }, arg1, arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!id;")
	public Class99 method390(@OriginalArg(0) String arg0) {
		return this.method387(16, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	public void method391() {
		synchronized (this) {
			this.aBoolean23 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass207_2 != null) {
			try {
				this.aClass207_2.method5336();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass207_1 != null) {
			try {
				this.aClass207_1.method5336();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass207Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass207Array1.length; local44++) {
				if (this.aClass207Array1[local44] != null) {
					try {
						this.aClass207Array1[local44].method5336();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass207_3 != null) {
			try {
				this.aClass207_3.method5336();
			} catch (@Pc(74) IOException local74) {
			}
		}
	}
}
