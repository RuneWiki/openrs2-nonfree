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

@OriginalClass("client!pb")
public final class Class194 implements Runnable {

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "[Lclient!rh;")
	public Class213[] aClass213Array1;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Lclient!nc;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!rh;")
	public Class213 aClass213_1 = null;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!rh;")
	public Class213 aClass213_3 = null;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!jl;")
	private Class136 aClass136_5 = null;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
	private boolean aBoolean390 = false;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!jl;")
	private Class136 aClass136_6 = null;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!rh;")
	public Class213 aClass213_2 = null;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	private final int anInt5538;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString49;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class194(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static307.aString52 = "Unknown";
		this.anInt5538 = arg1;
		Static307.aString46 = "1.1";
		this.aString49 = arg2;
		this.anApplet1 = arg0;
		try {
			Static307.aString52 = System.getProperty("java.vendor");
			Static307.aString46 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static307.aString51 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static307.aString51 = "Unknown";
		}
		Static307.aString50 = Static307.aString51.toLowerCase();
		try {
			Static307.aString48 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static307.aString48 = "";
		}
		try {
			Static307.aString47 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static307.aString47 = "";
		}
		try {
			Static307.aString53 = System.getProperty("user.home");
			if (Static307.aString53 != null) {
				Static307.aString53 = Static307.aString53 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static307.aString53 == null) {
			Static307.aString53 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static307.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static307.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static307.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static307.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean390 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public void method4392() {
		Static307.aLong272 = Static432.method5870() + 5000L;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lclient!jl;")
	public Class136 method4393(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4417(0, 2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjava/lang/String;)[B")
	private byte[] method4394(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class136 local7 = this.method4415(0, arg1, 21, -2);
		if (arg0 != -10) {
			this.aBoolean390 = true;
		}
		return (byte[]) local7.anObject10;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	public void method4395(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!Static307.aString50.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local29.invoke(local39, Boolean.TRUE);
			local39.invoke(local18, arg0, "jawt");
			local29.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local29.invoke(local39, Boolean.TRUE);
		if (!Static307.aString50.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local18, arg0, this.method4396("sw3d.dll").toString());
		local29.invoke(local39, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method4396(@OriginalArg(1) String arg0) {
		return Static307.method4409(this.aString49, arg0, this.anInt5538);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!jl;")
	public Class136 method4397(@OriginalArg(0) String arg0) {
		return this.method4417(0, 16, arg0, 0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Z")
	public boolean method4398() {
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!jl;")
	public Class136 method4399(@OriginalArg(0) Frame arg0) {
		return this.method4417(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!jl;")
	public Class136 method4400(@OriginalArg(1) Class arg0) {
		return this.method4417(0, 20, arg0, 0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lclient!jl;")
	public Class136 method4401(@OriginalArg(1) int arg0) {
		return this.method4417(0, 3, null, arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lclient!jl;")
	private Class136 method4402(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 117) {
			@Pc(7) Point local7 = arg0.getLocationOnScreen();
			return this.method4417(arg3 + local7.y, 14, null, local7.x + arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Lclient!nc;")
	public Interface8 method4403() {
		return this.anInterface8_2;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BLjava/lang/String;)Lclient!jl;")
	private Class136 method4404(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		return arg0 >= -124 ? null : this.method4417(0, 21, arg1, 0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZLjava/lang/String;)Lclient!jl;")
	public Class136 method4405(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		return arg0 ? this.method4417(0, 12, arg1, 0) : this.method4417(0, 13, arg1, 0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lclient!jl;")
	public Class136 method4406(@OriginalArg(1) Class arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method4417(0, 8, new Object[] { arg0, arg2, arg1 }, 0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BLjava/lang/Class;)Lclient!jl;")
	public Class136 method4407(@OriginalArg(1) Class arg0) {
		return this.method4417(0, 11, arg0, 0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!jl;")
	private Class136 method4408(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2) {
		if (arg1 != -62) {
			Static307.aString50 = null;
		}
		return this.method4417(0, 15, arg2, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "client!pb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class136 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean390) {
						return;
					}
					if (this.aClass136_6 != null) {
						local15 = this.aClass136_6;
						this.aClass136_6 = this.aClass136_6.aClass136_4;
						if (this.aClass136_6 == null) {
							this.aClass136_5 = null;
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
				@Pc(41) int local41 = local15.anInt3419;
				if (local41 == 1) {
					if (Static307.aLong272 > Static432.method5870()) {
						throw new IOException();
					}
					local15.anObject10 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt3420);
				} else if (local41 == 2) {
					@Pc(160) Thread local160 = new Thread((Runnable) local15.anObject9);
					local160.setDaemon(true);
					local160.start();
					local160.setPriority(local15.anInt3420);
					local15.anObject10 = local160;
				} else if (local41 == 4) {
					if (Static307.aLong272 > Static432.method5870()) {
						throw new IOException();
					}
					local15.anObject10 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(121) Object[] local121;
					if (local41 == 8) {
						local121 = (Object[]) local15.anObject9;
						local15.anObject10 = ((Class) local121[0]).getDeclaredMethod((String) local121[1], (Class[]) local121[2]);
					} else if (local41 == 9) {
						local121 = (Object[]) local15.anObject9;
						local15.anObject10 = ((Class) local121[0]).getDeclaredField((String) local121[1]);
					} else if (local41 == 18) {
						@Pc(111) Clipboard local111 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject10 = local111.getContents(null);
					} else if (local41 == 19) {
						@Pc(100) Transferable local100 = (Transferable) local15.anObject9;
						@Pc(103) Clipboard local103 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local103.setContents(local100, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt3418 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt3418 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!jl;")
	private Class136 method4410(@OriginalArg(0) int arg0) {
		if (arg0 != -32693) {
			this.aClass213_2 = null;
		}
		return this.method4417(0, 18, null, 0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/net/URL;)Lclient!jl;")
	public Class136 method4411(@OriginalArg(1) URL arg0) {
		return this.method4417(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lclient!jl;")
	public Class136 method4412() {
		return this.method4417(0, 5, null, 0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public void method4413() {
		synchronized (this) {
			this.aBoolean390 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass213_2 != null) {
			try {
				this.aClass213_2.method4946();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass213_3 != null) {
			try {
				this.aClass213_3.method4946();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass213Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass213Array1.length; local49++) {
				if (this.aClass213Array1[local49] != null) {
					try {
						this.aClass213Array1[local49].method4946();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass213_1 != null) {
			try {
				this.aClass213_1.method4946();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lclient!jl;")
	public Class136 method4414(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		return this.method4417(0, 9, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!jl;")
	private Class136 method4415(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class136 local3 = new Class136();
		synchronized (local3) {
			local3.anInt3420 = arg0;
			local3.anInt3419 = arg2;
			local3.anObject9 = arg1;
			synchronized (this) {
				if (this.aClass136_5 == null) {
					this.aClass136_5 = this.aClass136_6 = local3;
				} else {
					this.aClass136_5.aClass136_4 = local3;
					this.aClass136_5 = local3;
				}
				this.notify();
			}
			try {
				if (arg3 != -2) {
					Static307.aString46 = null;
				}
				local3.wait();
			} catch (@Pc(54) InterruptedException local54) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)Lclient!jl;")
	public Class136 method4416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method4417(arg2 << 16, 6, null, (arg1 << 16) + arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIILjava/lang/Object;I)Lclient!jl;")
	private Class136 method4417(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class136 local3 = new Class136();
		local3.anObject9 = arg2;
		local3.anInt3420 = arg3;
		local3.anInt3419 = arg1;
		synchronized (this) {
			if (this.aClass136_5 == null) {
				this.aClass136_5 = this.aClass136_6 = local3;
			} else {
				this.aClass136_5.aClass136_4 = local3;
				this.aClass136_5 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!jl;")
	public Class136 method4418(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method4417(0, 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/awt/Component;IB[ILjava/awt/Point;)Lclient!jl;")
	public Class136 method4419(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Point arg4) {
		return this.method4417(arg2, 17, new Object[] { arg1, arg3, arg4 }, arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lclient!jl;")
	private Class136 method4420(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 < 74) {
			Static307.aString46 = null;
		}
		return this.method4417(0, 19, arg0, 0);
	}
}
