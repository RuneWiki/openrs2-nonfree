import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
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

@OriginalClass("client!wa")
public final class Class175 implements Runnable {

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "[Lclient!nn;")
	public Class115[] aClass115Array1;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!ub;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!nn;")
	public Class115 aClass115_3 = null;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!o;")
	private Class116 aClass116_6 = null;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!nn;")
	public Class115 aClass115_2 = null;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "Lclient!o;")
	private Class116 aClass116_7 = null;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "Lclient!nn;")
	public Class115 aClass115_4 = null;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class175(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static288.aString326 = "1.1";
		this.anApplet1 = arg0;
		Static288.aString323 = "Unknown";
		try {
			Static288.aString323 = System.getProperty("java.vendor");
			Static288.aString326 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static288.aString327 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static288.aString327 = "Unknown";
		}
		Static288.aString328 = Static288.aString327.toLowerCase();
		try {
			Static288.aString325 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static288.aString325 = "";
		}
		try {
			Static288.aString322 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static288.aString322 = "";
		}
		try {
			Static288.aString324 = System.getProperty("user.home");
			if (Static288.aString324 != null) {
				Static288.aString324 = Static288.aString324 + "/";
			}
		} catch (@Pc(80) Exception local80) {
		}
		if (Static288.aString324 == null) {
			Static288.aString324 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(90) Throwable local90) {
		}
		try {
			if (arg0 == null) {
				Static288.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static288.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(118) Exception local118) {
		}
		try {
			if (arg0 == null) {
				Static288.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static288.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(146) Exception local146) {
		}
		this.aBoolean430 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lclient!ub;")
	public Interface5 method4319() {
		return this.anInterface5_2;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lclient!o;")
	public Class116 method4320(@OriginalArg(0) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method4330(arg0, arg1, 0, 2);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public void method4321() {
		Static288.aLong199 = Static294.method4413() + 5000L;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Lclient!o;")
	public Class116 method4322(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) String arg2) {
		return this.method4330(new Object[] { arg1, arg2, arg0 }, 0, 0, 8);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lclient!o;")
	public Class116 method4323(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		return this.method4330(new Object[] { arg1, arg0 }, 0, 0, 9);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!o;")
	public Class116 method4324(@OriginalArg(0) Frame arg0) {
		return this.method4330(arg0, 0, 0, 7);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!o;")
	public Class116 method4326(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return this.method4330(arg1, arg0, 0, 1);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!o;")
	public Class116 method4327(@OriginalArg(1) Class arg0) {
		return this.method4330(arg0, 0, 0, 11);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/net/URL;B)Lclient!o;")
	public Class116 method4328(@OriginalArg(0) URL arg0) {
		return this.method4330(arg0, 0, 0, 4);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;I)Lclient!o;")
	public Class116 method4329(@OriginalArg(0) Component arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4) {
		return this.method4330(new Object[] { arg0, arg1, arg4 }, arg3, arg2, 17);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!o;")
	private Class116 method4330(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class116 local3 = new Class116();
		local3.anInt3813 = arg3;
		local3.anObject4 = arg0;
		local3.anInt3811 = arg1;
		synchronized (this) {
			if (this.aClass116_7 == null) {
				this.aClass116_7 = this.aClass116_6 = local3;
			} else {
				this.aClass116_7.aClass116_2 = local3;
				this.aClass116_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLjava/lang/String;)Lclient!o;")
	public Class116 method4331(@OriginalArg(1) String arg0) {
		return this.method4330(arg0, 0, 0, 16);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z")
	public boolean method4332() {
		return false;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lclient!o;")
	public Class116 method4333(@OriginalArg(1) int arg0) {
		return this.method4330(null, arg0, 0, 3);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)Lclient!o;")
	public Class116 method4334() {
		return this.method4330(null, 0, 0, 5);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!o;")
	public Class116 method4335(@OriginalArg(0) Class arg0) {
		return this.method4330(arg0, 0, 0, 10);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)Lclient!o;")
	public Class116 method4336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method4330(null, (arg0 << 16) + arg2, arg1 << 16, 6);
	}

	@OriginalMember(owner = "client!wa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class116 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean430) {
						return;
					}
					if (this.aClass116_6 != null) {
						local17 = this.aClass116_6;
						this.aClass116_6 = this.aClass116_6.aClass116_2;
						if (this.aClass116_6 == null) {
							this.aClass116_7 = null;
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
				@Pc(46) int local46 = local17.anInt3813;
				if (local46 == 1) {
					if (Static288.aLong199 > Static294.method4413()) {
						throw new IOException();
					}
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject4), local17.anInt3811);
				} else if (local46 == 2) {
					@Pc(84) Thread local84 = new Thread((Runnable) local17.anObject4);
					local84.setDaemon(true);
					local84.start();
					local84.setPriority(local17.anInt3811);
					local17.anObject5 = local84;
				} else if (local46 == 4) {
					if (Static294.method4413() < Static288.aLong199) {
						throw new IOException();
					}
					local17.anObject5 = new DataInputStream(((URL) local17.anObject4).openStream());
				} else {
					@Pc(144) Object[] local144;
					if (local46 == 8) {
						local144 = (Object[]) local17.anObject4;
						local17.anObject5 = ((Class) local144[0]).getDeclaredMethod((String) local144[1], (Class[]) local144[2]);
					} else if (local46 == 9) {
						local144 = (Object[]) local17.anObject4;
						local17.anObject5 = ((Class) local144[0]).getDeclaredField((String) local144[1]);
					} else {
						throw new Exception();
					}
				}
				local17.anInt3812 = 1;
			} catch (@Pc(182) ThreadDeath local182) {
				throw local182;
			} catch (@Pc(185) Throwable local185) {
				local17.anInt3812 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V")
	public void method4337() {
		synchronized (this) {
			this.aBoolean430 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass115_4 != null) {
			try {
				this.aClass115_4.method3060();
			} catch (@Pc(30) IOException local30) {
			}
		}
		if (this.aClass115_2 != null) {
			try {
				this.aClass115_2.method3060();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass115Array1 != null) {
			for (@Pc(45) int local45 = 0; local45 < this.aClass115Array1.length; local45++) {
				if (this.aClass115Array1[local45] != null) {
					try {
						this.aClass115Array1[local45].method3060();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.aClass115_3 != null) {
			try {
				this.aClass115_3.method3060();
			} catch (@Pc(76) IOException local76) {
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;)Lclient!o;")
	public Class116 method4338(@OriginalArg(1) String arg0) {
		return this.method4330(arg0, 0, 0, 12);
	}
}
