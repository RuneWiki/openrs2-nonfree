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

@OriginalClass("client!uo")
public final class Class176 implements Runnable {

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!fl;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "[Lclient!eo;")
	public Class48[] aClass48Array1;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "Lclient!sc;")
	private Class153 aClass153_7 = null;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "Lclient!eo;")
	public Class48 aClass48_2 = null;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "Lclient!sc;")
	private Class153 aClass153_8 = null;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "Lclient!eo;")
	public Class48 aClass48_4 = null;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "Lclient!eo;")
	public Class48 aClass48_3 = null;

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class176(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static290.aString207 = "Unknown";
		this.anApplet1 = arg0;
		Static290.aString204 = "1.1";
		try {
			Static290.aString207 = System.getProperty("java.vendor");
			Static290.aString204 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static290.aString203 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static290.aString203 = "Unknown";
		}
		Static290.aString209 = Static290.aString203.toLowerCase();
		try {
			Static290.aString208 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static290.aString208 = "";
		}
		try {
			Static290.aString205 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static290.aString205 = "";
		}
		try {
			Static290.aString206 = System.getProperty("user.home");
			if (Static290.aString206 != null) {
				Static290.aString206 = Static290.aString206 + "/";
			}
		} catch (@Pc(81) Exception local81) {
		}
		if (Static290.aString206 == null) {
			Static290.aString206 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(93) Throwable local93) {
		}
		try {
			if (arg0 == null) {
				Static290.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static290.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(120) Exception local120) {
		}
		try {
			if (arg0 == null) {
				Static290.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static290.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(147) Exception local147) {
		}
		this.aBoolean496 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	public void method4359() {
		synchronized (this) {
			this.aBoolean496 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass48_4 != null) {
			try {
				this.aClass48_4.method1174();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass48_3 != null) {
			try {
				this.aClass48_3.method1174();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass48Array1 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aClass48Array1.length; local51++) {
				if (this.aClass48Array1[local51] != null) {
					try {
						this.aClass48Array1[local51].method1174();
					} catch (@Pc(69) IOException local69) {
					}
				}
			}
		}
		if (this.aClass48_2 != null) {
			try {
				this.aClass48_2.method1174();
			} catch (@Pc(81) IOException local81) {
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lclient!sc;")
	public Class153 method4360(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method4369(0, 0, new Object[] { arg1, arg0 }, 9);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIB)Lclient!sc;")
	public Class153 method4361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method4369((arg2 << 16) + arg1, arg0 << 16, null, 6);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!sc;")
	public Class153 method4363(@OriginalArg(0) String arg0) {
		return this.method4369(0, 0, arg0, 16);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZLjava/lang/Class;)Lclient!sc;")
	public Class153 method4364(@OriginalArg(1) Class arg0) {
		return this.method4369(0, 0, arg0, 11);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lclient!sc;")
	public Class153 method4365(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method4369(0, 0, new Object[] { arg2, arg0, arg1 }, 8);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/net/URL;)Lclient!sc;")
	public Class153 method4366(@OriginalArg(1) URL arg0) {
		return this.method4369(0, 0, arg0, 4);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Lclient!sc;")
	public Class153 method4367() {
		return this.method4369(0, 0, null, 5);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/awt/Frame;)Lclient!sc;")
	public Class153 method4368(@OriginalArg(1) Frame arg0) {
		return this.method4369(0, 0, arg0, 7);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILjava/lang/Object;I)Lclient!sc;")
	private Class153 method4369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class153 local3 = new Class153();
		local3.anObject7 = arg2;
		local3.anInt4613 = arg0;
		local3.anInt4612 = arg3;
		synchronized (this) {
			if (this.aClass153_8 == null) {
				this.aClass153_8 = this.aClass153_7 = local3;
			} else {
				this.aClass153_8.aClass153_6 = local3;
				this.aClass153_8 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!sc;")
	public Class153 method4371(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method4369(arg1, 0, arg0, 1);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!sc;")
	public Class153 method4373(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method4369(arg0, 0, arg1, 2);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)Lclient!fl;")
	public Interface2 method4374() {
		return this.anInterface2_2;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)Z")
	public boolean method4375() {
		return false;
	}

	@OriginalMember(owner = "client!uo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class153 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean496) {
						return;
					}
					if (this.aClass153_7 != null) {
						local16 = this.aClass153_7;
						this.aClass153_7 = this.aClass153_7.aClass153_6;
						if (this.aClass153_7 == null) {
							this.aClass153_8 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local16.anInt4612;
				if (local46 == 1) {
					if (Static244.method3859() < Static290.aLong201) {
						throw new IOException();
					}
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject7), local16.anInt4613);
				} else if (local46 == 2) {
					@Pc(183) Thread local183 = new Thread((Runnable) local16.anObject7);
					local183.setDaemon(true);
					local183.start();
					local183.setPriority(local16.anInt4613);
					local16.anObject6 = local183;
				} else if (local46 == 4) {
					if (Static290.aLong201 > Static244.method3859()) {
						throw new IOException();
					}
					local16.anObject6 = new DataInputStream(((URL) local16.anObject7).openStream());
				} else {
					@Pc(86) Object[] local86;
					if (local46 == 8) {
						local86 = (Object[]) local16.anObject7;
						local16.anObject6 = ((Class) local86[0]).getDeclaredMethod((String) local86[1], (Class[]) local86[2]);
					} else if (local46 == 9) {
						local86 = (Object[]) local16.anObject7;
						local16.anObject6 = ((Class) local86[0]).getDeclaredField((String) local86[1]);
					} else if (local46 == 18) {
						@Pc(112) Clipboard local112 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject6 = local112.getContents(null);
					} else if (local46 == 19) {
						@Pc(127) Transferable local127 = (Transferable) local16.anObject7;
						@Pc(130) Clipboard local130 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local130.setContents(local127, null);
					} else {
						throw new Exception();
					}
				}
				local16.anInt4614 = 1;
			} catch (@Pc(200) ThreadDeath local200) {
				throw local200;
			} catch (@Pc(203) Throwable local203) {
				local16.anInt4614 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!sc;")
	public Class153 method4376(@OriginalArg(0) Class arg0) {
		return this.method4369(0, 0, arg0, 20);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)Lclient!sc;")
	public Class153 method4377(@OriginalArg(0) int arg0) {
		return this.method4369(arg0, 0, null, 3);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;)Lclient!sc;")
	public Class153 method4378(@OriginalArg(1) String arg0) {
		return this.method4369(0, 0, arg0, 12);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLjava/lang/Class;)Lclient!sc;")
	public Class153 method4379(@OriginalArg(1) Class arg0) {
		return this.method4369(0, 0, arg0, 10);
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V")
	public void method4380() {
		Static290.aLong201 = Static244.method3859() + 5000L;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/Point;III[ILjava/awt/Component;)Lclient!sc;")
	public Class153 method4381(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Component arg4) {
		return this.method4369(arg2, arg1, new Object[] { arg4, arg3, arg0 }, 17);
	}
}
