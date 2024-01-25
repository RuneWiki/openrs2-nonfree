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
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class229 implements Runnable {

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Lclient!ch;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "[Lclient!ob;")
	public Class208[] aClass208Array1;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "Lclient!vs;")
	private Class311 aClass311_3 = null;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "Lclient!ob;")
	public Class208 aClass208_1 = null;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "Lclient!ob;")
	public Class208 aClass208_2 = null;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "Lclient!ob;")
	public Class208 aClass208_3 = null;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "Lclient!vs;")
	private Class311 aClass311_4 = null;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "Ljava/lang/String;")
	private final String aString171;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	private final int anInt6742;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class229(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		this.aString171 = arg2;
		this.anInt6742 = arg1;
		Static380.aString168 = "Unknown";
		Static380.aString172 = "1.1";
		try {
			Static380.aString168 = System.getProperty("java.vendor");
			Static380.aString172 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static380.aString166 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static380.aString166 = "Unknown";
		}
		Static380.aString170 = Static380.aString166.toLowerCase();
		try {
			Static380.aString165 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static380.aString165 = "";
		}
		try {
			Static380.aString167 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static380.aString167 = "";
		}
		try {
			Static380.aString169 = System.getProperty("user.home");
			if (Static380.aString169 != null) {
				Static380.aString169 = Static380.aString169 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static380.aString169 == null) {
			Static380.aString169 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static380.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static380.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static380.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static380.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean500 = false;
		this.aThread5 = new Thread(this);
		this.aThread5.setPriority(10);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILjava/lang/Object;B)Lclient!vs;")
	private Class311 method6056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3) {
		@Pc(3) Class311 local3 = new Class311();
		local3.anInt9168 = arg2;
		local3.anObject16 = arg3;
		local3.anInt9167 = arg0;
		synchronized (this) {
			if (this.aClass311_4 == null) {
				this.aClass311_4 = this.aClass311_3 = local3;
			} else {
				this.aClass311_4.aClass311_8 = local3;
				this.aClass311_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class311 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean500) {
						return;
					}
					if (this.aClass311_3 != null) {
						local15 = this.aClass311_3;
						this.aClass311_3 = this.aClass311_3.aClass311_8;
						if (this.aClass311_3 == null) {
							this.aClass311_4 = null;
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
				@Pc(41) int local41 = local15.anInt9167;
				if (local41 == 1) {
					if (Static110.method2222() < Static380.aLong192) {
						throw new IOException();
					}
					local15.anObject17 = new Socket(InetAddress.getByName((String) local15.anObject16), local15.anInt9168);
				} else if (local41 == 2) {
					@Pc(185) Thread local185 = new Thread((Runnable) local15.anObject16);
					local185.setDaemon(true);
					local185.start();
					local185.setPriority(local15.anInt9168);
					local15.anObject17 = local185;
				} else if (local41 == 4) {
					if (Static380.aLong192 > Static110.method2222()) {
						throw new IOException();
					}
					local15.anObject17 = new DataInputStream(((URL) local15.anObject16).openStream());
				} else {
					@Pc(146) Object[] local146;
					if (local41 == 8) {
						local146 = (Object[]) local15.anObject16;
						local15.anObject17 = ((Class) local146[0]).getDeclaredMethod((String) local146[1], (Class[]) local146[2]);
					} else if (local41 == 9) {
						local146 = (Object[]) local15.anObject16;
						local15.anObject17 = ((Class) local146[0]).getDeclaredField((String) local146[1]);
					} else if (local41 == 18) {
						@Pc(114) Clipboard local114 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject17 = local114.getContents(null);
					} else if (local41 == 19) {
						@Pc(129) Transferable local129 = (Transferable) local15.anObject16;
						@Pc(132) Clipboard local132 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local132.setContents(local129, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt9169 = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.anInt9169 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!vs;")
	private Class311 method6057(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		return arg1 == -44 ? this.method6056(21, 0, 0, arg0) : null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!vs;")
	private Class311 method6058(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class311 local3 = new Class311();
		synchronized (local3) {
			local3.anObject16 = arg2;
			local3.anInt9168 = arg1;
			if (arg0 != 0) {
				this.method6059(58, 69, -4, null);
			}
			local3.anInt9167 = arg3;
			synchronized (this) {
				if (this.aClass311_4 == null) {
					this.aClass311_4 = this.aClass311_3 = local3;
				} else {
					this.aClass311_4.aClass311_8 = local3;
					this.aClass311_4 = local3;
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

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!vs;")
	private Class311 method6059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		return arg2 == 7471 ? this.method6056(14, local2.y + arg0, arg1 - -local2.x, null) : null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BILjava/lang/Runnable;)Lclient!vs;")
	public Class311 method6060(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method6056(2, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lclient!vs;")
	public Class311 method6061(@OriginalArg(0) Class[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) {
		return this.method6056(8, 0, 0, new Object[] { arg2, arg1, arg0 });
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	public boolean method6062(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!vs;")
	public Class311 method6063(@OriginalArg(0) Frame arg0) {
		return this.method6056(7, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
	public boolean method6064() {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	public void method6065() {
		synchronized (this) {
			this.aBoolean500 = true;
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		if (this.aClass208_2 != null) {
			try {
				this.aClass208_2.method5704();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass208_3 != null) {
			try {
				this.aClass208_3.method5704();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass208Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass208Array1.length; local48++) {
				if (this.aClass208Array1[local48] != null) {
					try {
						this.aClass208Array1[local48].method5704();
					} catch (@Pc(62) IOException local62) {
					}
				}
			}
		}
		if (this.aClass208_1 != null) {
			try {
				this.aClass208_1.method5704();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/Class;)V")
	private void method6066(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(20) Class[] local20 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(22) Runtime local22 = Runtime.getRuntime();
		@Pc(33) Method local33 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(43) Method local43;
		if (!Static380.aString170.startsWith("mac")) {
			local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local20);
			local33.invoke(local43, Boolean.TRUE);
			local43.invoke(local22, arg0, "jawt");
			local33.invoke(local43, Boolean.FALSE);
		}
		local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local20);
		local33.invoke(local43, Boolean.TRUE);
		if (!Static380.aString170.startsWith("win")) {
			throw new Exception();
		}
		local43.invoke(local22, arg0, this.method6076("sw3d.dll").toString());
		local33.invoke(local43, Boolean.FALSE);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Lclient!vs;")
	public Class311 method6067() {
		return this.method6056(5, 0, 0, null);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Lclient!vs;")
	private Class311 method6068(@OriginalArg(0) int arg0) {
		if (arg0 >= -34) {
			this.method6069();
		}
		return this.method6056(18, 0, 0, null);
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
	public void method6069() {
		Static380.aLong192 = Static110.method2222() + 5000L;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Ljava/lang/String;B)Lclient!vs;")
	public Class311 method6070(@OriginalArg(0) String arg0) {
		return this.method6056(16, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!vs;")
	public Class311 method6071(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		return arg1 ? this.method6056(12, 0, 0, arg0) : this.method6056(13, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!vs;")
	private Class311 method6072(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 8) {
			this.method6083(-82, null);
		}
		return this.method6056(19, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lclient!vs;")
	public Class311 method6073(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method6056(9, 0, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;I[I)Lclient!vs;")
	public Class311 method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) Point arg3, @OriginalArg(5) int[] arg4) {
		return this.method6056(17, arg0, arg1, new Object[] { arg2, arg4, arg3 });
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Lclient!vs;")
	public Class311 method6075(@OriginalArg(1) int arg0) {
		return this.method6056(3, 0, arg0, null);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method6076(@OriginalArg(1) String arg0) {
		return Static380.method6077(arg0, this.aString171, this.anInt6742);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/net/URL;)Lclient!vs;")
	public Class311 method6078(@OriginalArg(1) URL arg0) {
		return this.method6056(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method6079(@OriginalArg(1) String arg0) {
		@Pc(7) Class311 local7 = this.method6058(0, 0, arg0, 21);
		return (byte[]) local7.anObject17;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!vs;")
	private Class311 method6080(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			Static380.aString166 = null;
		}
		return this.method6056(15, 0, arg0 ? 1 : 0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Lclient!ch;")
	public Interface4 method6081() {
		return this.anInterface4_2;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BIIII)Lclient!vs;")
	public Class311 method6082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method6056(6, arg1 << 16, arg0 + (arg2 << 16), null);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!vs;")
	public Class311 method6083(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method6056(1, 0, arg0, arg1);
	}
}
