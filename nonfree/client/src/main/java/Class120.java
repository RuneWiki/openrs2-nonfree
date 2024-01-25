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

@OriginalClass("client!lh")
public final class Class120 implements Runnable {

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "[Lclient!vk;")
	public Class212[] aClass212Array1;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!pl;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!dj;")
	private Class51 aClass51_3 = null;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!vk;")
	public Class212 aClass212_2 = null;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "Lclient!vk;")
	public Class212 aClass212_1 = null;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Lclient!dj;")
	private Class51 aClass51_4 = null;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!vk;")
	public Class212 aClass212_3 = null;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "Z")
	private boolean aBoolean315 = false;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class120(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static172.aString127 = "Unknown";
		Static172.aString131 = "1.1";
		this.anApplet1 = arg0;
		try {
			Static172.aString127 = System.getProperty("java.vendor");
			Static172.aString131 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static172.aString132 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static172.aString132 = "Unknown";
		}
		Static172.aString129 = Static172.aString132.toLowerCase();
		try {
			Static172.aString130 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static172.aString130 = "";
		}
		try {
			Static172.aString133 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static172.aString133 = "";
		}
		try {
			Static172.aString128 = System.getProperty("user.home");
			if (Static172.aString128 != null) {
				Static172.aString128 = Static172.aString128 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static172.aString128 == null) {
			Static172.aString128 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static172.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static172.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static172.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static172.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean315 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBILjava/lang/Object;)Lclient!dj;")
	private Class51 method3216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class51 local3 = new Class51();
		local3.anObject2 = arg3;
		local3.anInt1231 = arg0;
		local3.anInt1230 = arg1;
		synchronized (this) {
			if (this.aClass51_3 == null) {
				this.aClass51_3 = this.aClass51_4 = local3;
			} else {
				this.aClass51_3.aClass51_1 = local3;
				this.aClass51_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
	public void method3217() {
		Static172.aLong131 = Static274.method4763() + 5000L;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!dj;")
	public Class51 method3218(@OriginalArg(0) URL arg0) {
		return this.method3216(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!dj;")
	private Class51 method3219(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		return arg1 > -112 ? null : this.method3216(19, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Lclient!dj;")
	public Class51 method3220(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2) {
		return this.method3216(8, 0, 0, new Object[] { arg2, arg0, arg1 });
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/String;)Lclient!dj;")
	public Class51 method3221(@OriginalArg(1) String arg0) {
		return this.method3216(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!dj;")
	public Class51 method3222(@OriginalArg(1) Class arg0) {
		return this.method3216(10, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Lclient!dj;")
	public Class51 method3223() {
		return this.method3216(13, 0, 0, null);
	}

	@OriginalMember(owner = "client!lh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class51 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean315) {
						return;
					}
					if (this.aClass51_4 != null) {
						local15 = this.aClass51_4;
						this.aClass51_4 = this.aClass51_4.aClass51_1;
						if (this.aClass51_4 == null) {
							this.aClass51_3 = null;
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
				@Pc(41) int local41 = local15.anInt1231;
				if (local41 == 1) {
					if (Static274.method4763() < Static172.aLong131) {
						throw new IOException();
					}
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt1230);
				} else if (local41 == 2) {
					@Pc(56) Thread local56 = new Thread((Runnable) local15.anObject2);
					local56.setDaemon(true);
					local56.start();
					local56.setPriority(local15.anInt1230);
					local15.anObject1 = local56;
				} else if (local41 == 4) {
					if (Static274.method4763() < Static172.aLong131) {
						throw new IOException();
					}
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local41 == 8) {
						local81 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local41 == 9) {
						local81 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else if (local41 == 18) {
						@Pc(106) Clipboard local106 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject1 = local106.getContents(null);
					} else if (local41 == 19) {
						@Pc(119) Transferable local119 = (Transferable) local15.anObject2;
						@Pc(122) Clipboard local122 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local122.setContents(local119, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt1229 = 1;
			} catch (@Pc(196) ThreadDeath local196) {
				throw local196;
			} catch (@Pc(199) Throwable local199) {
				local15.anInt1229 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!dj;")
	private Class51 method3224(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		return this.method3216(15, arg0 ? 1 : 0, 0, arg1);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!dj;")
	public Class51 method3225(@OriginalArg(1) Frame arg0) {
		return this.method3216(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lclient!dj;")
	public Class51 method3226() {
		return this.method3216(5, 0, 0, null);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILjava/lang/String;)Lclient!dj;")
	public Class51 method3227(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method3216(1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)Lclient!pl;")
	public Interface7 method3228() {
		return this.anInterface7_1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!dj;")
	private Class51 method3229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg0 != 14736) {
			this.method3218(null);
		}
		@Pc(10) Point local10 = arg3.getLocationOnScreen();
		return this.method3216(14, local10.x + arg1, local10.y + arg2, null);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)Lclient!dj;")
	public Class51 method3230(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3216(6, arg2 + (arg0 << 16), arg1 << 16, null);
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Lclient!dj;")
	public Class51 method3231() {
		return this.method3216(12, 0, 0, null);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!dj;")
	public Class51 method3232(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method3216(2, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public void method3233() {
		synchronized (this) {
			this.aBoolean315 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass212_1 != null) {
			try {
				this.aClass212_1.method5533();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass212_2 != null) {
			try {
				this.aClass212_2.method5533();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass212Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass212Array1.length; local50++) {
				if (this.aClass212Array1[local50] != null) {
					try {
						this.aClass212Array1[local50].method5533();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass212_3 != null) {
			try {
				this.aClass212_3.method5533();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILjava/lang/Object;IZ)Lclient!dj;")
	private Class51 method3234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) boolean arg3) {
		@Pc(3) Class51 local3 = new Class51();
		synchronized (local3) {
			local3.anInt1231 = arg0;
			local3.anObject2 = arg2;
			local3.anInt1230 = arg1;
			if (!arg3) {
				return null;
			}
			synchronized (this) {
				if (this.aClass51_3 == null) {
					this.aClass51_3 = this.aClass51_4 = local3;
				} else {
					this.aClass51_3.aClass51_1 = local3;
					this.aClass51_3 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(58) InterruptedException local58) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!dj;")
	private Class51 method3235(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		return arg0 ? null : this.method3216(21, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Lclient!dj;")
	public Class51 method3236(@OriginalArg(0) int arg0) {
		return this.method3216(3, arg0, 0, null);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Lclient!dj;")
	private Class51 method3237() {
		return this.method3216(18, 0, 0, null);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!dj;")
	public Class51 method3238(@OriginalArg(1) Class arg0) {
		return this.method3216(11, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!dj;")
	public Class51 method3239(@OriginalArg(0) Class arg0) {
		return this.method3216(20, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)Z")
	public boolean method3240() {
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(BLjava/lang/String;)[B")
	private byte[] method3241(@OriginalArg(1) String arg0) {
		@Pc(15) Class51 local15 = this.method3234(21, 0, arg0, true);
		return (byte[]) local15.anObject1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!dj;")
	public Class51 method3242(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method3216(9, 0, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[IILjava/awt/Component;Ljava/awt/Point;)Lclient!dj;")
	public Class51 method3243(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) Point arg4) {
		return this.method3216(17, arg2, arg0, new Object[] { arg3, arg1, arg4 });
	}
}
