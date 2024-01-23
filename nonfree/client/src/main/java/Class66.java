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

@OriginalClass("client!gn")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "[Lclient!ma;")
	public Class97[] aClass97Array1;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "Lclient!pk;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!ea;")
	private Class43 aClass43_4 = null;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "Lclient!ea;")
	private Class43 aClass43_5 = null;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "Lclient!ma;")
	public Class97 aClass97_2 = null;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Lclient!ma;")
	public Class97 aClass97_3 = null;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "Lclient!ma;")
	public Class97 aClass97_4 = null;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class66(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static93.aString66 = "Unknown";
		Static93.aString62 = "1.1";
		this.anApplet1 = arg0;
		try {
			Static93.aString66 = System.getProperty("java.vendor");
			Static93.aString62 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static93.aString68 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static93.aString68 = "Unknown";
		}
		Static93.aString65 = Static93.aString68.toLowerCase();
		try {
			Static93.aString63 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static93.aString63 = "";
		}
		try {
			Static93.aString67 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static93.aString67 = "";
		}
		try {
			Static93.aString64 = System.getProperty("user.home");
			if (Static93.aString64 != null) {
				Static93.aString64 = Static93.aString64 + "/";
			}
		} catch (@Pc(80) Exception local80) {
		}
		if (Static93.aString64 == null) {
			Static93.aString64 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(90) Throwable local90) {
		}
		try {
			if (arg0 == null) {
				Static93.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static93.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(118) Exception local118) {
		}
		try {
			if (arg0 == null) {
				Static93.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static93.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(145) Exception local145) {
		}
		this.aBoolean115 = false;
		this.aThread1 = new Thread(this);
		this.aThread1.setPriority(10);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public void method1602() {
		Static93.aLong74 = Static294.method4792() + 5000L;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)Lclient!ea;")
	public Class43 method1604() {
		return this.method1621(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!gn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class43 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean115) {
						return;
					}
					if (this.aClass43_5 != null) {
						local17 = this.aClass43_5;
						this.aClass43_5 = this.aClass43_5.aClass43_3;
						if (this.aClass43_5 == null) {
							this.aClass43_4 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local17.anInt1457;
				if (local47 == 1) {
					if (Static93.aLong74 > Static294.method4792()) {
						throw new IOException();
					}
					local17.anObject3 = new Socket(InetAddress.getByName((String) local17.anObject4), local17.anInt1458);
				} else if (local47 == 2) {
					@Pc(190) Thread local190 = new Thread((Runnable) local17.anObject4);
					local190.setDaemon(true);
					local190.start();
					local190.setPriority(local17.anInt1458);
					local17.anObject3 = local190;
				} else if (local47 == 4) {
					if (Static294.method4792() < Static93.aLong74) {
						throw new IOException();
					}
					local17.anObject3 = new DataInputStream(((URL) local17.anObject4).openStream());
				} else {
					@Pc(129) Object[] local129;
					if (local47 == 8) {
						local129 = (Object[]) local17.anObject4;
						local17.anObject3 = ((Class) local129[0]).getDeclaredMethod((String) local129[1], (Class[]) local129[2]);
					} else if (local47 == 9) {
						local129 = (Object[]) local17.anObject4;
						local17.anObject3 = ((Class) local129[0]).getDeclaredField((String) local129[1]);
					} else if (local47 == 18) {
						@Pc(97) Clipboard local97 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject3 = local97.getContents(null);
					} else if (local47 == 19) {
						@Pc(116) Transferable local116 = (Transferable) local17.anObject4;
						@Pc(119) Clipboard local119 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local119.setContents(local116, null);
					} else {
						throw new Exception();
					}
				}
				local17.anInt1456 = 1;
			} catch (@Pc(207) ThreadDeath local207) {
				throw local207;
			} catch (@Pc(210) Throwable local210) {
				local17.anInt1456 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ea;")
	public Class43 method1605(@OriginalArg(0) String arg0) {
		return this.method1621(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ea;")
	public Class43 method1606(@OriginalArg(1) String arg0) {
		return this.method1621(0, 0, arg0, 12);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!ea;")
	public Class43 method1607(@OriginalArg(1) Class arg0) {
		return this.method1621(0, 0, arg0, 10);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!ea;")
	public Class43 method1608(@OriginalArg(0) Frame arg0) {
		return this.method1621(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!ea;")
	public Class43 method1609(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method1621(0, 0, new Object[] { arg2, arg0, arg1 }, 8);
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Z")
	public boolean method1610() {
		return false;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!ea;")
	public Class43 method1611(@OriginalArg(1) URL arg0) {
		return this.method1621(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V")
	public void method1613() {
		synchronized (this) {
			this.aBoolean115 = true;
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass97_4 != null) {
			try {
				this.aClass97_4.method2931();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass97_3 != null) {
			try {
				this.aClass97_3.method2931();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass97Array1 != null) {
			for (@Pc(45) int local45 = 0; local45 < this.aClass97Array1.length; local45++) {
				if (this.aClass97Array1[local45] != null) {
					try {
						this.aClass97Array1[local45].method2931();
					} catch (@Pc(64) IOException local64) {
					}
				}
			}
		}
		if (this.aClass97_2 != null) {
			try {
				this.aClass97_2.method2931();
			} catch (@Pc(76) IOException local76) {
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!ea;")
	public Class43 method1614(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method1621(0, 0, new Object[] { arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lclient!ea;")
	public Class43 method1615(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1) {
		return this.method1621(0, arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!ea;")
	public Class43 method1616(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method1621(0, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!ea;")
	public Class43 method1618(@OriginalArg(1) Class arg0) {
		return this.method1621(0, 0, arg0, 11);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Lclient!ea;")
	public Class43 method1619(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int arg4) {
		return this.method1621(arg1, arg4, new Object[] { arg2, arg0, arg3 }, 17);
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Lclient!pk;")
	public Interface5 method1620() {
		return this.anInterface5_2;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBILjava/lang/Object;I)Lclient!ea;")
	private Class43 method1621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class43 local3 = new Class43();
		local3.anInt1457 = arg3;
		local3.anInt1458 = arg1;
		local3.anObject4 = arg2;
		synchronized (this) {
			if (this.aClass43_4 == null) {
				this.aClass43_4 = this.aClass43_5 = local3;
			} else {
				this.aClass43_4.aClass43_3 = local3;
				this.aClass43_4 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIIII)Lclient!ea;")
	public Class43 method1622(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method1621(arg1 << 16, arg0 + (arg2 << 16), null, 6);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lclient!ea;")
	public Class43 method1624(@OriginalArg(1) int arg0) {
		return this.method1621(0, arg0, null, 3);
	}
}
