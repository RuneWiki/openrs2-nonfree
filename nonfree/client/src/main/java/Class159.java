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
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class159 implements Runnable {

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "Lclient!ed;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "[Lclient!hl;")
	public Class108[] aClass108Array1;

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "Z")
	private boolean aBoolean290 = false;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Lclient!wp;")
	private Class270 aClass270_3 = null;

	@OriginalMember(owner = "client!lt", name = "s", descriptor = "Lclient!wp;")
	private Class270 aClass270_4 = null;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "Lclient!hl;")
	public Class108 aClass108_1 = null;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "Lclient!hl;")
	public Class108 aClass108_2 = null;

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "Lclient!hl;")
	public Class108 aClass108_3 = null;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "Ljava/lang/String;")
	private final String aString43;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
	private final int anInt4375;

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class159(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString43 = arg2;
		Static240.aString45 = "1.1";
		Static240.aString39 = "Unknown";
		this.anInt4375 = arg1;
		this.anApplet1 = arg0;
		try {
			Static240.aString39 = System.getProperty("java.vendor");
			Static240.aString45 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static240.aString41 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static240.aString41 = "Unknown";
		}
		Static240.aString42 = Static240.aString41.toLowerCase();
		try {
			Static240.aString38 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static240.aString38 = "";
		}
		try {
			Static240.aString44 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static240.aString44 = "";
		}
		try {
			Static240.aString40 = System.getProperty("user.home");
			if (Static240.aString40 != null) {
				Static240.aString40 = Static240.aString40 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static240.aString40 == null) {
			Static240.aString40 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static240.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static240.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static240.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static240.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean290 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!lt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class270 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean290) {
						return;
					}
					if (this.aClass270_4 != null) {
						local15 = this.aClass270_4;
						this.aClass270_4 = this.aClass270_4.aClass270_8;
						if (this.aClass270_4 == null) {
							this.aClass270_3 = null;
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
				@Pc(41) int local41 = local15.anInt7547;
				if (local41 == 1) {
					if (Static220.method3314() < Static240.aLong142) {
						throw new IOException();
					}
					local15.anObject9 = new Socket(InetAddress.getByName((String) local15.anObject10), local15.anInt7546);
				} else if (local41 == 2) {
					@Pc(187) Thread local187 = new Thread((Runnable) local15.anObject10);
					local187.setDaemon(true);
					local187.start();
					local187.setPriority(local15.anInt7546);
					local15.anObject9 = local187;
				} else if (local41 == 4) {
					if (Static240.aLong142 > Static220.method3314()) {
						throw new IOException();
					}
					local15.anObject9 = new DataInputStream(((URL) local15.anObject10).openStream());
				} else {
					@Pc(148) Object[] local148;
					if (local41 == 8) {
						local148 = (Object[]) local15.anObject10;
						local15.anObject9 = ((Class) local148[0]).getDeclaredMethod((String) local148[1], (Class[]) local148[2]);
					} else if (local41 == 9) {
						local148 = (Object[]) local15.anObject10;
						local15.anObject9 = ((Class) local148[0]).getDeclaredField((String) local148[1]);
					} else if (local41 == 18) {
						@Pc(116) Clipboard local116 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject9 = local116.getContents(null);
					} else if (local41 == 19) {
						@Pc(136) Transferable local136 = (Transferable) local15.anObject10;
						@Pc(139) Clipboard local139 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local139.setContents(local136, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt7548 = 1;
			} catch (@Pc(204) ThreadDeath local204) {
				throw local204;
			} catch (@Pc(207) Throwable local207) {
				local15.anInt7548 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!wp;")
	public Class270 method3496(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3522(0, arg1, 0, 2, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method3497(@OriginalArg(0) String arg0) {
		return Static240.method3504(this.anInt4375, arg0, this.aString43);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lclient!wp;")
	public Class270 method3498(@OriginalArg(1) Class[] arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) {
		return this.method3522(0, new Object[] { arg1, arg2, arg0 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!wp;")
	public Class270 method3499(@OriginalArg(1) Class arg0) {
		return this.method3522(0, arg0, 0, 20, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!wp;")
	private Class270 method3500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class270 local3 = new Class270();
		synchronized (local3) {
			local3.anInt7547 = arg1;
			local3.anInt7546 = arg3;
			local3.anObject10 = arg2;
			synchronized (this) {
				if (arg0 != -20) {
					Static240.aMethod2 = null;
				}
				if (this.aClass270_3 == null) {
					this.aClass270_3 = this.aClass270_4 = local3;
				} else {
					this.aClass270_3.aClass270_8 = local3;
					this.aClass270_3 = local3;
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

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
	public void method3501() {
		synchronized (this) {
			this.aBoolean290 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass108_2 != null) {
			try {
				this.aClass108_2.method2643();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass108_1 != null) {
			try {
				this.aClass108_1.method2643();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass108Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass108Array1.length; local49++) {
				if (this.aClass108Array1[local49] != null) {
					try {
						this.aClass108Array1[local49].method2643();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass108_3 != null) {
			try {
				this.aClass108_3.method2643();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!wp;")
	public Class270 method3502(@OriginalArg(0) String arg0) {
		return this.method3522(0, arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public void method3503() {
		Static240.aLong142 = (long) 5000 + Static220.method3314();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/String;)Lclient!wp;")
	private Class270 method3505(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 18176) {
			Static240.aString40 = null;
		}
		return this.method3522(0, arg1, 0, 21, 0);
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)Lclient!ed;")
	public Interface2 method3506() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILjava/awt/Component;ILjava/awt/Point;[I)Lclient!wp;")
	public Class270 method3507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int[] arg4) {
		return this.method3522(0, new Object[] { arg2, arg4, arg3 }, arg1, 17, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!wp;")
	public Class270 method3508(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method3522(0, new Object[] { arg1, arg0 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!wp;")
	private Class270 method3509(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 >= -63) {
			this.anEventQueue1 = null;
		}
		return this.method3522(0, arg0, 0, 15, arg2 ? 1 : 0);
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)Z")
	public boolean method3510() {
		return false;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIII)Lclient!wp;")
	public Class270 method3511(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method3522(0, null, arg1 << 16, 6, (arg2 << 16) + arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Lclient!wp;")
	public Class270 method3512(@OriginalArg(1) int arg0) {
		return this.method3522(0, null, 0, 3, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "(I)Lclient!wp;")
	private Class270 method3513(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.method3522(0, null, 0, 18, 0) : null;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;ZI)Lclient!wp;")
	public Class270 method3514(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method3522(0, arg0, 0, 12, 0) : this.method3522(0, arg0, 0, 13, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lclient!wp;")
	private Class270 method3515(@OriginalArg(0) Transferable arg0) {
		return this.method3522(0, arg0, 0, 19, 0);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(ILjava/lang/Class;)V")
	public void method3516(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(23) Runtime local23 = Runtime.getRuntime();
		@Pc(34) Method local34 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(44) Method local44;
		if (!Static240.aString42.startsWith("mac")) {
			local44 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local34.invoke(local44, Boolean.TRUE);
			local44.invoke(local23, arg0, "jawt");
			local34.invoke(local44, Boolean.FALSE);
		}
		local44 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local34.invoke(local44, Boolean.TRUE);
		if (!Static240.aString42.startsWith("win")) {
			throw new Exception();
		}
		local44.invoke(local23, arg0, this.method3497("sw3d.dll").toString());
		local34.invoke(local44, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!wp;")
	public Class270 method3517(@OriginalArg(0) Frame arg0) {
		return this.method3522(0, arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZILjava/lang/String;)Lclient!wp;")
	public Class270 method3518(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		return this.method3522(0, arg1, 0, 1, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lclient!wp;")
	private Class270 method3519(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 29) {
			@Pc(7) Point local7 = arg0.getLocationOnScreen();
			return this.method3522(arg2 - 29, null, arg3 + local7.y, 14, local7.x + arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method3520(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static240.aMethod1 = null;
		}
		@Pc(12) Class270 local12 = this.method3500(-20, 21, arg0, 0);
		return (byte[]) local12.anObject9;
	}

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "(I)Lclient!wp;")
	public Class270 method3521() {
		return this.method3522(0, null, 0, 5, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!wp;")
	private Class270 method3522(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class270 local3 = new Class270();
		local3.anObject10 = arg1;
		local3.anInt7546 = arg4;
		local3.anInt7547 = arg3;
		synchronized (this) {
			if (this.aClass270_3 == null) {
				this.aClass270_3 = this.aClass270_4 = local3;
			} else {
				this.aClass270_3.aClass270_8 = local3;
				this.aClass270_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLjava/net/URL;)Lclient!wp;")
	public Class270 method3523(@OriginalArg(1) URL arg0) {
		return this.method3522(0, arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!wp;")
	public Class270 method3524(@OriginalArg(1) Class arg0) {
		return this.method3522(0, arg0, 0, 11, 0);
	}
}
