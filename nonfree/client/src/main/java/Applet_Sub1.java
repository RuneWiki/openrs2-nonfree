import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DZXWUJSL")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!DZXWUJSL", name = "d", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!DZXWUJSL", name = "f", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!DZXWUJSL", name = "j", descriptor = "I")
	protected int anInt828;

	@OriginalMember(owner = "client!DZXWUJSL", name = "l", descriptor = "I")
	protected int anInt829;

	@OriginalMember(owner = "client!DZXWUJSL", name = "m", descriptor = "I")
	protected int anInt830;

	@OriginalMember(owner = "client!DZXWUJSL", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!DZXWUJSL", name = "o", descriptor = "Lclient!WOKQCNXG;")
	protected Class42 aClass42_2;

	@OriginalMember(owner = "client!DZXWUJSL", name = "q", descriptor = "Lclient!IOEGEBWF;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!DZXWUJSL", name = "t", descriptor = "I")
	protected int anInt831;

	@OriginalMember(owner = "client!DZXWUJSL", name = "u", descriptor = "I")
	protected int anInt832;

	@OriginalMember(owner = "client!DZXWUJSL", name = "v", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!DZXWUJSL", name = "w", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!DZXWUJSL", name = "x", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!DZXWUJSL", name = "y", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!DZXWUJSL", name = "z", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!DZXWUJSL", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!DZXWUJSL", name = "B", descriptor = "I")
	protected int anInt838;

	@OriginalMember(owner = "client!DZXWUJSL", name = "C", descriptor = "I")
	protected int anInt839;

	@OriginalMember(owner = "client!DZXWUJSL", name = "D", descriptor = "I")
	protected int anInt840;

	@OriginalMember(owner = "client!DZXWUJSL", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!DZXWUJSL", name = "H", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!DZXWUJSL", name = "I", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "I")
	private int anInt823 = -348;

	@OriginalMember(owner = "client!DZXWUJSL", name = "b", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!DZXWUJSL", name = "c", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!DZXWUJSL", name = "e", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!DZXWUJSL", name = "g", descriptor = "I")
	private int anInt826 = 20;

	@OriginalMember(owner = "client!DZXWUJSL", name = "h", descriptor = "I")
	protected int anInt827 = 1;

	@OriginalMember(owner = "client!DZXWUJSL", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!DZXWUJSL", name = "k", descriptor = "Z")
	protected boolean aBoolean214 = false;

	@OriginalMember(owner = "client!DZXWUJSL", name = "p", descriptor = "[Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array3 = new Class3_Sub1_Sub4_Sub4[6];

	@OriginalMember(owner = "client!DZXWUJSL", name = "r", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!DZXWUJSL", name = "s", descriptor = "Z")
	protected boolean aBoolean216 = true;

	@OriginalMember(owner = "client!DZXWUJSL", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!DZXWUJSL", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "(IZI)V")
	protected final void method576() {
		try {
			this.anInt829 = 765;
			this.anInt830 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt830, this.anInt829, 12702, this);
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass42_2 = new Class42(this.anInt829, this.anInt830, 462, this.method586());
			this.method587(this, 1);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("10998, " + 503 + ", " + false + ", " + 765 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "(III)V")
	protected final void method577() {
		try {
			this.anInt829 = 765;
			this.anInt830 = 503;
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass42_2 = new Class42(this.anInt829, this.anInt830, 462, this.method586());
			this.method587(this, 1);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("6580, " + 765 + ", " + 503 + ", " + 4 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method586().addMouseListener(this);
		this.method586().addMouseMotionListener(this);
		this.method586().addKeyListener(this);
		this.method586().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588(0, "Loading...");
		this.method581();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		@Pc(41) int local41 = 1;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < 10; local47++) {
			this.aLongArray2[local47] = System.currentTimeMillis();
		}
		@Pc(60) long local60 = System.currentTimeMillis();
		while (true) {
			@Pc(170) int local170;
			do {
				if (this.anInt825 < 0) {
					if (this.anInt825 == -1) {
						this.method578(this.anInt823);
					}
					return;
				}
				if (this.anInt825 > 0) {
					this.anInt825--;
					if (this.anInt825 == 0) {
						this.method578(this.anInt823);
						return;
					}
				}
				@Pc(81) int local81 = local39;
				@Pc(83) int local83 = local41;
				local39 = 300;
				local41 = 1;
				local60 = System.currentTimeMillis();
				if (this.aLongArray2[local37] == 0L) {
					local39 = local81;
					local41 = local83;
				} else if (local60 > this.aLongArray2[local37]) {
					local39 = (int) ((long) (this.anInt826 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt826 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt826) {
					local41 = this.anInt826;
				}
				this.aLongArray2[local37] = local60;
				local37 = (local37 + 1) % 10;
				if (local41 > 1) {
					for (local170 = 0; local170 < 10; local170++) {
						if (this.aLongArray2[local170] != 0L) {
							this.aLongArray2[local170] += local41;
						}
					}
				}
				if (local41 < this.anInt827) {
					local41 = this.anInt827;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(204) InterruptedException local204) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt838 = this.anInt835;
					this.anInt839 = this.anInt836;
					this.anInt840 = this.anInt837;
					this.aLong28 = this.aLong27;
					this.anInt835 = 0;
					this.method582(this.aBoolean211);
					this.anInt841 = this.anInt842;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt826 > 0) {
					this.anInt828 = local39 * 1000 / (this.anInt826 * 256);
				}
				this.method584();
			} while (!this.aBoolean214);
			System.out.println("ntime:" + local60);
			for (local170 = 0; local170 < 10; local170++) {
				@Pc(287) int local287 = (local37 + 20 - local170 - 1) % 10;
				System.out.println("otim" + local287 + ":" + this.aLongArray2[local287]);
			}
			System.out.println("fps:" + this.anInt828 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt826 + " mindel:" + this.anInt827);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean214 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "(I)V")
	private void method578(@OriginalArg(0) int arg0) {
		try {
			this.anInt825 = -2;
			this.method583();
			while (arg0 >= 0) {
				this.anInt823 = 82;
			}
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(19) Exception local19) {
				}
				try {
					System.exit(0);
				} catch (@Pc(23) Throwable local23) {
				}
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("76247, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "(BI)V")
	protected final void method579() {
		try {
			this.anInt826 = 1000;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("65582, " + 29 + ", " + 1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt825 >= 0) {
			this.anInt825 = 0;
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt825 >= 0) {
			this.anInt825 = 4000 / this.anInt826;
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt825 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt825 == -1) {
			this.method578(this.anInt823);
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean215 = true;
		this.method585(856);
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean215 = true;
		this.method585(856);
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt831 = 0;
		this.anInt836 = local2;
		this.anInt837 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt835 = 2;
			this.anInt832 = 2;
		} else {
			this.anInt835 = 1;
			this.anInt832 = 1;
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt831 = 0;
		this.anInt832 = 0;
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt831 = 0;
		this.anInt833 = -1;
		this.anInt834 = -1;
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt831 = 0;
		this.anInt833 = local2;
		this.anInt834 = local5;
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt831 = 0;
		this.anInt833 = local2;
		this.anInt834 = local5;
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt831 = 0;
		@Pc(7) int local7 = arg0.getKeyCode();
		@Pc(10) int local10 = arg0.getKeyChar();
		if (local10 < 30) {
			local10 = 0;
		}
		if (local7 == 37) {
			local10 = 1;
		}
		if (local7 == 39) {
			local10 = 2;
		}
		if (local7 == 38) {
			local10 = 3;
		}
		if (local7 == 40) {
			local10 = 4;
		}
		if (local7 == 17) {
			local10 = 5;
		}
		if (local7 == 8) {
			local10 = 8;
		}
		if (local7 == 127) {
			local10 = 8;
		}
		if (local7 == 9) {
			local10 = 9;
		}
		if (local7 == 10) {
			local10 = 10;
		}
		if (local7 >= 112 && local7 <= 123) {
			local10 = local7 + 1008 - 112;
		}
		if (local7 == 36) {
			local10 = 1000;
		}
		if (local7 == 35) {
			local10 = 1001;
		}
		if (local7 == 33) {
			local10 = 1002;
		}
		if (local7 == 34) {
			local10 = 1003;
		}
		if (local10 > 0 && local10 < 128) {
			this.anIntArray210[local10] = 1;
		}
		if (local10 > 4) {
			this.anIntArray211[this.anInt842] = local10;
			this.anInt842 = this.anInt842 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt831 = 0;
		@Pc(5) int local5 = arg0.getKeyCode();
		@Pc(8) char local8 = arg0.getKeyChar();
		if (local8 < '\u001e') {
			local8 = '\u0000';
		}
		if (local5 == 37) {
			local8 = '\u0001';
		}
		if (local5 == 39) {
			local8 = '\u0002';
		}
		if (local5 == 38) {
			local8 = '\u0003';
		}
		if (local5 == 40) {
			local8 = '\u0004';
		}
		if (local5 == 17) {
			local8 = '\u0005';
		}
		if (local5 == 8) {
			local8 = '\b';
		}
		if (local5 == 127) {
			local8 = '\b';
		}
		if (local5 == 9) {
			local8 = '\t';
		}
		if (local5 == 10) {
			local8 = '\n';
		}
		if (local8 > '\u0000' && local8 < '\u0080') {
			this.anIntArray210[local8] = 0;
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "(B)I")
	protected final int method580(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(17) int local17 = -1;
			if (this.anInt842 != this.anInt841) {
				local17 = this.anIntArray211[this.anInt841];
				this.anInt841 = this.anInt841 + 1 & 0x7F;
			}
			return local17;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("4651, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean216 = true;
		this.aBoolean215 = true;
		this.method585(856);
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean216 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "()V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "(Z)V")
	protected void method582(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("73444, " + arg0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "b", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "c", descriptor = "(I)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "d", descriptor = "(I)V")
	protected void method585(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("86341, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	protected Component method586() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("63049, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!DZXWUJSL", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method586().getGraphics();
				try {
					this.method586().repaint();
				} catch (@Pc(13) Exception local13) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(17) Exception local17) {
				}
			}
			@Pc(28) Font local28 = new Font("Helvetica", 1, 13);
			@Pc(34) FontMetrics local34 = this.method586().getFontMetrics(local28);
			@Pc(44) Font local44 = new Font("Helvetica", 0, 13);
			this.method586().getFontMetrics(local44);
			if (this.aBoolean215) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt829, this.anInt830);
				this.aBoolean215 = false;
			}
			@Pc(76) Color local76 = new Color(140, 17, 17);
			@Pc(83) int local83 = this.anInt830 / 2 - 18;
			this.aGraphics2.setColor(local76);
			this.aGraphics2.drawRect(this.anInt829 / 2 - 152, local83, 304, 34);
			this.aGraphics2.fillRect(this.anInt829 / 2 - 150, local83 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt829 / 2 + arg0 * 3 - 150, local83 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local28);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt829 - local34.stringWidth(arg1)) / 2, local83 + 22);
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("21116, " + arg0 + ", " + arg1 + ", " + true + ", " + local166.toString());
			throw new RuntimeException();
		}
	}
}
