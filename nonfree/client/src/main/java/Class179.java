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

@OriginalClass("client!sc")
public final class Class179 implements Runnable {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "[Lclient!vn;")
	public Class209[] aClass209Array1;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!ea;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!bl;")
	private Class26 aClass26_8 = null;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!vn;")
	public Class209 aClass209_2 = null;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!bl;")
	private Class26 aClass26_9 = null;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Z")
	private boolean aBoolean517 = false;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!vn;")
	public Class209 aClass209_3 = null;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!vn;")
	public Class209 aClass209_4 = null;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class179(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static293.aString58 = "Unknown";
		Static293.aString56 = "1.1";
		try {
			Static293.aString58 = System.getProperty("java.vendor");
			Static293.aString56 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static293.aString62 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static293.aString62 = "Unknown";
		}
		Static293.aString57 = Static293.aString62.toLowerCase();
		try {
			Static293.aString60 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static293.aString60 = "";
		}
		try {
			Static293.aString59 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static293.aString59 = "";
		}
		try {
			Static293.aString61 = System.getProperty("user.home");
			if (Static293.aString61 != null) {
				Static293.aString61 = Static293.aString61 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static293.aString61 == null) {
			Static293.aString61 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static293.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static293.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static293.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static293.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean517 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z")
	public boolean method4874() {
		return false;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZILjava/lang/Runnable;)Lclient!bl;")
	public Class26 method4875(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method4892(0, 2, arg0, arg1);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!bl;")
	public Class26 method4876(@OriginalArg(0) URL arg0) {
		return this.method4892(0, 4, 0, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!bl;")
	public Class26 method4877(@OriginalArg(1) Class arg0) {
		return this.method4892(0, 11, 0, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Point;[IZIILjava/awt/Component;)Lclient!bl;")
	public Class26 method4878(@OriginalArg(0) Point arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method4892(arg3, 17, arg2, new Object[] { arg4, arg1, arg0 });
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!bl;")
	private Class26 method4879(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -45) {
			Static293.aString56 = null;
		}
		return this.method4892(0, 19, 0, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!bl;")
	public Class26 method4880(@OriginalArg(1) Frame arg0) {
		return this.method4892(0, 7, 0, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lclient!bl;")
	private Class26 method4881(@OriginalArg(0) int arg0) {
		if (arg0 != 21) {
			this.method4875(-106, null);
		}
		return this.method4892(0, 18, 0, null);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!bl;")
	public Class26 method4882(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method4892(0, 8, 0, new Object[] { arg2, arg0, arg1 });
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Lclient!ea;")
	public Interface2 method4883() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILjava/awt/Component;B)Lclient!bl;")
	private Class26 method4884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) Point local2 = arg2.getLocationOnScreen();
		if (arg3 != -73) {
			this.aClass209_2 = null;
		}
		return this.method4892(local2.y + arg1, 14, local2.x + arg0, null);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lclient!bl;")
	public Class26 method4885() {
		return this.method4892(0, 12, 0, null);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)Lclient!bl;")
	public Class26 method4886(@OriginalArg(0) int arg0) {
		return this.method4892(0, 3, arg0, null);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILjava/lang/String;)Lclient!bl;")
	public Class26 method4887(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method4892(0, 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class26 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean517) {
						return;
					}
					if (this.aClass26_8 != null) {
						local15 = this.aClass26_8;
						this.aClass26_8 = this.aClass26_8.aClass26_2;
						if (this.aClass26_8 == null) {
							this.aClass26_9 = null;
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
				@Pc(41) int local41 = local15.anInt485;
				if (local41 == 1) {
					if (Static293.aLong185 > Static22.method285()) {
						throw new IOException();
					}
					local15.anObject1 = new Socket(InetAddress.getByName((String) local15.anObject2), local15.anInt486);
				} else if (local41 == 2) {
					@Pc(156) Thread local156 = new Thread((Runnable) local15.anObject2);
					local156.setDaemon(true);
					local156.start();
					local156.setPriority(local15.anInt486);
					local15.anObject1 = local156;
				} else if (local41 == 4) {
					if (Static293.aLong185 > Static22.method285()) {
						throw new IOException();
					}
					local15.anObject1 = new DataInputStream(((URL) local15.anObject2).openStream());
				} else {
					@Pc(61) Object[] local61;
					if (local41 == 8) {
						local61 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local61[0]).getDeclaredMethod((String) local61[1], (Class[]) local61[2]);
					} else if (local41 == 9) {
						local61 = (Object[]) local15.anObject2;
						local15.anObject1 = ((Class) local61[0]).getDeclaredField((String) local61[1]);
					} else if (local41 == 18) {
						@Pc(124) Clipboard local124 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject1 = local124.getContents(null);
					} else if (local41 == 19) {
						@Pc(108) Transferable local108 = (Transferable) local15.anObject2;
						@Pc(111) Clipboard local111 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local111.setContents(local108, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt484 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt484 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
	public void method4888() {
		Static293.aLong185 = Static22.method285() + 5000L;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!bl;")
	public Class26 method4889(@OriginalArg(0) Class arg0) {
		return this.method4892(0, 20, 0, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lclient!bl;")
	public Class26 method4890() {
		return this.method4892(0, 13, 0, null);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!bl;")
	private Class26 method4891(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class26 local3 = new Class26();
		synchronized (local3) {
			local3.anInt485 = arg2;
			local3.anObject2 = arg0;
			local3.anInt486 = arg3;
			synchronized (this) {
				if (this.aClass26_9 == null) {
					this.aClass26_9 = this.aClass26_8 = local3;
				} else {
					this.aClass26_9.aClass26_2 = local3;
					this.aClass26_9 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
		}
		if (arg1 != 21) {
			this.method4900(null);
		}
		return local3;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZILjava/lang/Object;)Lclient!bl;")
	private Class26 method4892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class26 local3 = new Class26();
		local3.anInt486 = arg2;
		local3.anInt485 = arg1;
		local3.anObject2 = arg3;
		synchronized (this) {
			if (this.aClass26_9 == null) {
				this.aClass26_9 = this.aClass26_8 = local3;
			} else {
				this.aClass26_9.aClass26_2 = local3;
				this.aClass26_9 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!bl;")
	private Class26 method4893(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method4891(null, -114, 33, 60);
		}
		return this.method4892(0, 21, 0, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!bl;")
	public Class26 method4894(@OriginalArg(1) Class arg0) {
		return this.method4892(0, 10, 0, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Ljava/lang/String;Z)Lclient!bl;")
	public Class26 method4895(@OriginalArg(0) String arg0) {
		return this.method4892(0, 16, 0, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
	public void method4896() {
		synchronized (this) {
			this.aBoolean517 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		if (this.aClass209_3 != null) {
			try {
				this.aClass209_3.method5628();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass209_2 != null) {
			try {
				this.aClass209_2.method5628();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass209Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass209Array1.length; local47++) {
				if (this.aClass209Array1[local47] != null) {
					try {
						this.aClass209Array1[local47].method5628();
					} catch (@Pc(61) IOException local61) {
					}
				}
			}
		}
		if (this.aClass209_4 != null) {
			try {
				this.aClass209_4.method5628();
			} catch (@Pc(81) IOException local81) {
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lclient!bl;")
	public Class26 method4897() {
		return this.method4892(0, 5, 0, null);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!bl;")
	private Class26 method4898(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg1 == 15 ? this.method4892(0, 15, arg2 ? 1 : 0, arg0) : null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!bl;")
	public Class26 method4899(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method4892(0, 9, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method4900(@OriginalArg(0) String arg0) {
		@Pc(15) Class26 local15 = this.method4891(arg0, 21, 21, 0);
		return (byte[]) local15.anObject1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIB)Lclient!bl;")
	public Class26 method4901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method4892(arg0 << 16, 6, arg2 + (arg1 << 16), null);
	}
}
