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
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class209 implements Runnable {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Lclient!cd;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "[Lclient!de;")
	public Class46[] aClass46Array1;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Z")
	private boolean aBoolean351 = false;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "Lclient!de;")
	public Class46 aClass46_3 = null;

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "Lclient!it;")
	private Class122 aClass122_7 = null;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Lclient!de;")
	public Class46 aClass46_2 = null;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "Lclient!it;")
	private Class122 aClass122_8 = null;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "Lclient!de;")
	public Class46 aClass46_4 = null;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Ljava/lang/String;")
	private String aString38;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
	private final int anInt5593;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class209(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString38 = arg2;
		Static325.aString40 = "Unknown";
		this.anInt5593 = arg1;
		this.anApplet1 = arg0;
		Static325.aString45 = "1.1";
		try {
			Static325.aString40 = System.getProperty("java.vendor");
			Static325.aString45 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			Static325.aString39 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			Static325.aString39 = "Unknown";
		}
		Static325.aString41 = Static325.aString39.toLowerCase();
		try {
			Static325.aString43 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			Static325.aString43 = "";
		}
		try {
			Static325.aString44 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			Static325.aString44 = "";
		}
		try {
			Static325.aString42 = System.getProperty("user.home");
			if (Static325.aString42 != null) {
				Static325.aString42 = Static325.aString42 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (Static325.aString42 == null) {
			Static325.aString42 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				Static325.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static325.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				Static325.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static325.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aBoolean351 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIII)Lclient!it;")
	public Class122 method4675(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method4689(arg1 << 16, null, 6, arg0 + (arg2 << 16));
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lclient!it;")
	private Class122 method4676(@OriginalArg(0) boolean arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0) {
			this.aString38 = null;
		}
		return this.method4689(0, arg1, 19, 0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lclient!it;")
	public Class122 method4677(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		return this.method4689(0, new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/awt/Frame;)Lclient!it;")
	public Class122 method4678(@OriginalArg(1) Frame arg0) {
		return this.method4689(0, arg0, 7, 0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Class;Z)Lclient!it;")
	public Class122 method4679(@OriginalArg(0) Class arg0) {
		return this.method4689(0, arg0, 11, 0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Lclient!it;")
	public Class122 method4680(@OriginalArg(1) int arg0) {
		return this.method4689(0, null, 3, arg0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!it;")
	public Class122 method4681(@OriginalArg(0) String arg0) {
		return this.method4689(0, arg0, 16, 0);
	}

	@OriginalMember(owner = "client!qn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class122 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean351) {
						return;
					}
					if (this.aClass122_7 != null) {
						local15 = this.aClass122_7;
						this.aClass122_7 = this.aClass122_7.aClass122_3;
						if (this.aClass122_7 == null) {
							this.aClass122_8 = null;
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
				@Pc(41) int local41 = local15.anInt3555;
				if (local41 == 1) {
					if (Static449.method6552() < Static325.aLong161) {
						throw new IOException();
					}
					local15.anObject7 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt3556);
				} else if (local41 == 2) {
					@Pc(181) Thread local181 = new Thread((Runnable) local15.anObject6);
					local181.setDaemon(true);
					local181.start();
					local181.setPriority(local15.anInt3556);
					local15.anObject7 = local181;
				} else if (local41 == 4) {
					if (Static325.aLong161 > Static449.method6552()) {
						throw new IOException();
					}
					local15.anObject7 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(108) Object[] local108;
					if (local41 == 8) {
						local108 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local108[0]).getDeclaredMethod((String) local108[1], (Class[]) local108[2]);
					} else if (local41 == 9) {
						local108 = (Object[]) local15.anObject6;
						local15.anObject7 = ((Class) local108[0]).getDeclaredField((String) local108[1]);
					} else if (local41 == 18) {
						@Pc(148) Clipboard local148 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject7 = local148.getContents(null);
					} else if (local41 == 19) {
						@Pc(137) Transferable local137 = (Transferable) local15.anObject6;
						@Pc(140) Clipboard local140 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local140.setContents(local137, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt3557 = 1;
			} catch (@Pc(198) ThreadDeath local198) {
				throw local198;
			} catch (@Pc(201) Throwable local201) {
				local15.anInt3557 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	public void method4682() {
		Static325.aLong161 = Static449.method6552() + 5000L;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!it;")
	private Class122 method4683(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class122 local3 = new Class122();
		synchronized (local3) {
			local3.anObject6 = arg0;
			if (arg2 >= -10) {
				this.method4675(125, 59, 112);
			}
			local3.anInt3556 = arg1;
			local3.anInt3555 = arg3;
			synchronized (this) {
				if (this.aClass122_8 == null) {
					this.aClass122_8 = this.aClass122_7 = local3;
				} else {
					this.aClass122_8.aClass122_3 = local3;
					this.aClass122_8 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(60) InterruptedException local60) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[IILjava/awt/Component;ILjava/awt/Point;)Lclient!it;")
	public Class122 method4684(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method4689(arg3, new Object[] { arg2, arg1, arg4 }, 17, arg0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method4685(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 49) {
			this.aClass122_7 = null;
		}
		@Pc(13) Class122 local13 = this.method4683(arg0, 0, -50, 21);
		return (byte[]) local13.anObject7;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public void method4686() {
		synchronized (this) {
			this.aBoolean351 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass46_2 != null) {
			try {
				this.aClass46_2.method1367();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass46_4 != null) {
			try {
				this.aClass46_4.method1367();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass46Array1 != null) {
			for (@Pc(44) int local44 = 0; local44 < this.aClass46Array1.length; local44++) {
				if (this.aClass46Array1[local44] != null) {
					try {
						this.aClass46Array1[local44].method1367();
					} catch (@Pc(58) IOException local58) {
					}
				}
			}
		}
		if (this.aClass46_3 != null) {
			try {
				this.aClass46_3.method1367();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!it;")
	public Class122 method4687(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4689(0, arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!it;")
	public Class122 method4688(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		return this.method4689(0, arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lclient!it;")
	private Class122 method4689(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class122 local3 = new Class122();
		local3.anObject6 = arg1;
		local3.anInt3555 = arg2;
		local3.anInt3556 = arg3;
		synchronized (this) {
			if (this.aClass122_8 == null) {
				this.aClass122_8 = this.aClass122_7 = local3;
			} else {
				this.aClass122_8.aClass122_3 = local3;
				this.aClass122_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Lclient!it;")
	private Class122 method4690(@OriginalArg(0) byte arg0) {
		return arg0 == 59 ? this.method4689(0, null, 18, 0) : null;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)Lclient!cd;")
	public Interface1 method4691() {
		return this.anInterface1_2;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!it;")
	private Class122 method4692(@OriginalArg(0) String arg0) {
		return this.method4689(0, arg0, 21, 0);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)Z")
	public boolean method4693() {
		return false;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lclient!it;")
	public Class122 method4694(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) {
		return this.method4689(0, new Object[] { arg2, arg1, arg0 }, 8, 0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/net/URL;)Lclient!it;")
	public Class122 method4695(@OriginalArg(1) URL arg0) {
		return this.method4689(0, arg0, 4, 0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!it;")
	private Class122 method4696(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2) {
		if (arg1 != 3) {
			Static325.aString39 = null;
		}
		return this.method4689(0, arg2, 15, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Class;B)Lclient!it;")
	public Class122 method4697(@OriginalArg(0) Class arg0) {
		return this.method4689(0, arg0, 20, 0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)Lclient!it;")
	public Class122 method4698(@OriginalArg(1) String arg0) {
		return this.method4689(0, arg0, 12, 0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!it;")
	private Class122 method4699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		@Pc(2) Point local2 = arg2.getLocationOnScreen();
		return this.method4689(local2.y + arg0, null, 14, arg1 + local2.x);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method4700(@OriginalArg(1) String arg0) {
		return Static325.method4701(this.aString38, arg0, this.anInt5593);
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)Lclient!it;")
	public Class122 method4702() {
		return this.method4689(0, null, 5, 0);
	}
}
