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

@OriginalClass("client!pm")
public final class Class139 implements Runnable {

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Lclient!le;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "[Lclient!kd;")
	public Class105[] aClass105Array1;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Lclient!kd;")
	public Class105 aClass105_1 = null;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Lclient!kd;")
	public Class105 aClass105_2 = null;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "Lclient!vk;")
	private Class185 aClass185_5 = null;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Lclient!vk;")
	private Class185 aClass185_6 = null;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!kd;")
	public Class105 aClass105_3 = null;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class139(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		Static215.aString253 = "1.1";
		this.anApplet1 = arg0;
		Static215.aString256 = "Unknown";
		try {
			Static215.aString256 = System.getProperty("java.vendor");
			Static215.aString253 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static215.aString252 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static215.aString252 = "Unknown";
		}
		Static215.aString254 = Static215.aString252.toLowerCase();
		try {
			Static215.aString250 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static215.aString250 = "";
		}
		try {
			Static215.aString255 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static215.aString255 = "";
		}
		try {
			Static215.aString251 = System.getProperty("user.home");
			if (Static215.aString251 != null) {
				Static215.aString251 = Static215.aString251 + "/";
			}
		} catch (@Pc(80) Exception local80) {
		}
		if (Static215.aString251 == null) {
			Static215.aString251 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(91) Throwable local91) {
		}
		try {
			if (arg0 == null) {
				Static215.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static215.aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(118) Exception local118) {
		}
		try {
			if (arg0 == null) {
				Static215.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static215.aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(145) Exception local145) {
		}
		this.aBoolean297 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lclient!vk;")
	public Class185 method3491(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method3513(9, 0, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIBI)Lclient!vk;")
	public Class185 method3492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method3513(6, arg1 + (arg0 << 16), null, arg2 << 16);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lclient!vk;")
	public Class185 method3493(@OriginalArg(0) Frame arg0) {
		return this.method3513(7, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lclient!vk;")
	public Class185 method3494(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method3513(2, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!vk;")
	public Class185 method3495(@OriginalArg(1) Class arg0) {
		return this.method3513(10, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public void method3497() {
		synchronized (this) {
			this.aBoolean297 = true;
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		if (this.aClass105_2 != null) {
			try {
				this.aClass105_2.method2246();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass105_1 != null) {
			try {
				this.aClass105_1.method2246();
			} catch (@Pc(50) IOException local50) {
			}
		}
		if (this.aClass105Array1 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.aClass105Array1.length; local56++) {
				if (this.aClass105Array1[local56] != null) {
					try {
						this.aClass105Array1[local56].method2246();
					} catch (@Pc(75) IOException local75) {
					}
				}
			}
		}
		if (this.aClass105_3 != null) {
			try {
				this.aClass105_3.method2246();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!vk;")
	public Class185 method3498(@OriginalArg(0) Class arg0) {
		return this.method3513(11, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class185 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean297) {
						return;
					}
					if (this.aClass185_5 != null) {
						local18 = this.aClass185_5;
						this.aClass185_5 = this.aClass185_5.aClass185_7;
						if (this.aClass185_5 == null) {
							this.aClass185_6 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(36) InterruptedException local36) {
					}
				}
			}
			try {
				@Pc(48) int local48 = local18.anInt5624;
				if (local48 == 1) {
					if (Static101.method1677() < Static215.aLong152) {
						throw new IOException();
					}
					local18.anObject7 = new Socket(InetAddress.getByName((String) local18.anObject6), local18.anInt5622);
				} else if (local48 == 2) {
					@Pc(171) Thread local171 = new Thread((Runnable) local18.anObject6);
					local171.setDaemon(true);
					local171.start();
					local171.setPriority(local18.anInt5622);
					local18.anObject7 = local171;
				} else if (local48 == 4) {
					if (Static215.aLong152 > Static101.method1677()) {
						throw new IOException();
					}
					local18.anObject7 = new DataInputStream(((URL) local18.anObject6).openStream());
				} else {
					@Pc(94) Object[] local94;
					if (local48 == 8) {
						local94 = (Object[]) local18.anObject6;
						local18.anObject7 = ((Class) local94[0]).getDeclaredMethod((String) local94[1], (Class[]) local94[2]);
					} else if (local48 == 9) {
						local94 = (Object[]) local18.anObject6;
						local18.anObject7 = ((Class) local94[0]).getDeclaredField((String) local94[1]);
					} else if (local48 == 18) {
						@Pc(139) Clipboard local139 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject7 = local139.getContents(null);
					} else if (local48 == 19) {
						@Pc(152) Transferable local152 = (Transferable) local18.anObject6;
						@Pc(155) Clipboard local155 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local155.setContents(local152, null);
					} else {
						throw new Exception();
					}
				}
				local18.anInt5623 = 1;
			} catch (@Pc(210) ThreadDeath local210) {
				throw local210;
			} catch (@Pc(213) Throwable local213) {
				local18.anInt5623 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Lclient!vk;")
	public Class185 method3499(@OriginalArg(1) int arg0) {
		return this.method3513(3, arg0, null, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;[Ljava/lang/Class;)Lclient!vk;")
	public Class185 method3502(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method3513(8, 0, new Object[] { arg1, arg0, arg2 }, 0);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!vk;")
	public Class185 method3503(@OriginalArg(0) Class arg0) {
		return this.method3513(20, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!vk;")
	public Class185 method3504(@OriginalArg(0) String arg0) {
		return this.method3513(16, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!vk;")
	public Class185 method3505(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method3513(1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Lclient!vk;")
	public Class185 method3506() {
		return this.method3513(5, 0, null, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/net/URL;I)Lclient!vk;")
	public Class185 method3507(@OriginalArg(0) URL arg0) {
		return this.method3513(4, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Ljava/lang/String;B)Lclient!vk;")
	public Class185 method3508(@OriginalArg(0) String arg0) {
		return this.method3513(12, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)Z")
	public boolean method3509() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLjava/awt/Point;I[IILjava/awt/Component;)Lclient!vk;")
	public Class185 method3510(@OriginalArg(1) Point arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method3513(17, arg3, new Object[] { arg4, arg2, arg0 }, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)Lclient!le;")
	public Interface4 method3511() {
		return this.anInterface4_2;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public void method3512() {
		Static215.aLong152 = (long) 5000 + Static101.method1677();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!vk;")
	private Class185 method3513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class185 local3 = new Class185();
		local3.anInt5624 = arg0;
		local3.anInt5622 = arg1;
		local3.anObject6 = arg2;
		synchronized (this) {
			if (this.aClass185_6 == null) {
				this.aClass185_6 = this.aClass185_5 = local3;
			} else {
				this.aClass185_6.aClass185_7 = local3;
				this.aClass185_6 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
