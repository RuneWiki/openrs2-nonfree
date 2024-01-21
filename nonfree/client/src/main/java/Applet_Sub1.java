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

@OriginalClass("client!EPVRYXOV")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!EPVRYXOV", name = "c", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!EPVRYXOV", name = "d", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!EPVRYXOV", name = "f", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!EPVRYXOV", name = "g", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!EPVRYXOV", name = "k", descriptor = "I")
	protected int anInt828;

	@OriginalMember(owner = "client!EPVRYXOV", name = "m", descriptor = "I")
	protected int anInt829;

	@OriginalMember(owner = "client!EPVRYXOV", name = "n", descriptor = "I")
	protected int anInt830;

	@OriginalMember(owner = "client!EPVRYXOV", name = "o", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!EPVRYXOV", name = "p", descriptor = "Lclient!ERQSZFRT;")
	protected Class8 aClass8_2;

	@OriginalMember(owner = "client!EPVRYXOV", name = "r", descriptor = "Lclient!INDYOKOE;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!EPVRYXOV", name = "u", descriptor = "I")
	protected int anInt831;

	@OriginalMember(owner = "client!EPVRYXOV", name = "v", descriptor = "I")
	protected int anInt832;

	@OriginalMember(owner = "client!EPVRYXOV", name = "w", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!EPVRYXOV", name = "x", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!EPVRYXOV", name = "y", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!EPVRYXOV", name = "z", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!EPVRYXOV", name = "A", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!EPVRYXOV", name = "B", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!EPVRYXOV", name = "C", descriptor = "I")
	protected int anInt838;

	@OriginalMember(owner = "client!EPVRYXOV", name = "D", descriptor = "I")
	protected int anInt839;

	@OriginalMember(owner = "client!EPVRYXOV", name = "E", descriptor = "I")
	protected int anInt840;

	@OriginalMember(owner = "client!EPVRYXOV", name = "F", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!EPVRYXOV", name = "I", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!EPVRYXOV", name = "J", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!EPVRYXOV", name = "b", descriptor = "I")
	private int anInt820 = 718;

	@OriginalMember(owner = "client!EPVRYXOV", name = "e", descriptor = "I")
	private int anInt823 = 7;

	@OriginalMember(owner = "client!EPVRYXOV", name = "h", descriptor = "I")
	private int anInt826 = 20;

	@OriginalMember(owner = "client!EPVRYXOV", name = "i", descriptor = "I")
	protected int anInt827 = 1;

	@OriginalMember(owner = "client!EPVRYXOV", name = "j", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!EPVRYXOV", name = "l", descriptor = "Z")
	protected boolean aBoolean238 = false;

	@OriginalMember(owner = "client!EPVRYXOV", name = "q", descriptor = "[Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array3 = new Class6_Sub2_Sub2_Sub1[6];

	@OriginalMember(owner = "client!EPVRYXOV", name = "s", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!EPVRYXOV", name = "t", descriptor = "Z")
	protected boolean aBoolean240 = true;

	@OriginalMember(owner = "client!EPVRYXOV", name = "G", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!EPVRYXOV", name = "H", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(IIZ)V")
	protected final void method576() {
		try {
			this.anInt829 = 765;
			this.anInt830 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt830, this, -773, this.anInt829);
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass8_2 = new Class8(this.anInt830, this.anInt829, this.method586(), (byte) 0);
			this.method587(this, 1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("30690, " + 765 + ", " + 503 + ", " + true + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(III)V")
	protected final void method577() {
		try {
			this.anInt829 = 765;
			this.anInt830 = 503;
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass8_2 = new Class8(this.anInt830, this.anInt829, this.method586(), (byte) 0);
			this.method587(this, 1);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("47676, " + 503 + ", " + 34288 + ", " + 765 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method586().addMouseListener(this);
		this.method586().addMouseMotionListener(this);
		this.method586().addKeyListener(this);
		this.method586().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588(this.anInt822, 0, "Loading...");
		this.method581();
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 256;
		@Pc(42) int local42 = 1;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < 10; local48++) {
			this.aLongArray2[local48] = System.currentTimeMillis();
		}
		@Pc(61) long local61 = System.currentTimeMillis();
		while (true) {
			@Pc(170) int local170;
			do {
				if (this.anInt825 < 0) {
					if (this.anInt825 == -1) {
						this.method578();
					}
					return;
				}
				if (this.anInt825 > 0) {
					this.anInt825--;
					if (this.anInt825 == 0) {
						this.method578();
						return;
					}
				}
				@Pc(81) int local81 = local40;
				@Pc(83) int local83 = local42;
				local40 = 300;
				local42 = 1;
				local61 = System.currentTimeMillis();
				if (this.aLongArray2[local38] == 0L) {
					local40 = local81;
					local42 = local83;
				} else if (local61 > this.aLongArray2[local38]) {
					local40 = (int) ((long) (this.anInt826 * 2560) / (local61 - this.aLongArray2[local38]));
				}
				if (local40 < 25) {
					local40 = 25;
				}
				if (local40 > 256) {
					local40 = 256;
					local42 = (int) ((long) this.anInt826 - (local61 - this.aLongArray2[local38]) / 10L);
				}
				if (local42 > this.anInt826) {
					local42 = this.anInt826;
				}
				this.aLongArray2[local38] = local61;
				local38 = (local38 + 1) % 10;
				if (local42 > 1) {
					for (local170 = 0; local170 < 10; local170++) {
						if (this.aLongArray2[local170] != 0L) {
							this.aLongArray2[local170] += local42;
						}
					}
				}
				if (local42 < this.anInt827) {
					local42 = this.anInt827;
				}
				try {
					Thread.sleep((long) local42);
				} catch (@Pc(204) InterruptedException local204) {
					local46++;
				}
				while (local44 < 256) {
					this.anInt838 = this.anInt835;
					this.anInt839 = this.anInt836;
					this.anInt840 = this.anInt837;
					this.aLong28 = this.aLong27;
					this.anInt835 = 0;
					this.method582(this.aBoolean237);
					this.anInt841 = this.anInt842;
					local44 += local40;
				}
				local44 &= 0xFF;
				if (this.anInt826 > 0) {
					this.anInt828 = local40 * 1000 / (this.anInt826 * 256);
				}
				this.method584();
			} while (!this.aBoolean238);
			System.out.println("ntime:" + local61);
			for (local170 = 0; local170 < 10; local170++) {
				@Pc(287) int local287 = (local38 + 20 - local170 - 1) % 10;
				System.out.println("otim" + local287 + ":" + this.aLongArray2[local287]);
			}
			System.out.println("fps:" + this.anInt828 + " ratio:" + local40 + " count:" + local44);
			System.out.println("del:" + local42 + " deltime:" + this.anInt826 + " mindel:" + this.anInt827);
			System.out.println("intex:" + local46 + " opos:" + local38);
			this.aBoolean238 = false;
			local46 = 0;
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(I)V")
	private void method578() {
		try {
			this.anInt825 = -2;
			this.method583(638);
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(23) Exception local23) {
				}
				try {
					System.exit(0);
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("21803, " + 6 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(IB)V")
	protected final void method579(@OriginalArg(1) byte arg0) {
		try {
			this.anInt826 = 1000;
			@Pc(9) boolean local9 = false;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("64603, " + 1 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt825 >= 0) {
			this.anInt825 = 0;
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt825 >= 0) {
			this.anInt825 = 4000 / this.anInt826;
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt825 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt825 == -1) {
			this.method578();
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean239 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean239 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!EPVRYXOV", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt831 = 0;
		this.anInt832 = 0;
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt831 = 0;
		this.anInt833 = -1;
		this.anInt834 = -1;
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!EPVRYXOV", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!EPVRYXOV", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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

	@OriginalMember(owner = "client!EPVRYXOV", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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

	@OriginalMember(owner = "client!EPVRYXOV", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "b", descriptor = "(I)I")
	protected final int method580() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt842 != this.anInt841) {
				local1 = this.anIntArray211[this.anInt841];
				this.anInt841 = this.anInt841 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("59088, " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean240 = true;
		this.aBoolean239 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean240 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "()V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(Z)V")
	protected void method582(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				;
			}
		} catch (@Pc(3) RuntimeException local3) {
			signlink.reporterror("28974, " + arg0 + ", " + local3.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "c", descriptor = "(I)V")
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("98757, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "d", descriptor = "(I)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "e", descriptor = "(I)V")
	protected void method585() {
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "f", descriptor = "(I)Ljava/awt/Component;")
	protected Component method586() {
		try {
			if (this.anInt821 != 0) {
				throw new NullPointerException();
			}
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("74541, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(IILjava/lang/String;)V")
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method586().getGraphics();
				try {
					this.method586().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method586().getFontMetrics(local36);
			if (arg0 != 0) {
				this.anInt820 = 290;
			}
			@Pc(54) Font local54 = new Font("Helvetica", 0, 13);
			this.method586().getFontMetrics(local54);
			if (this.aBoolean239) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt829, this.anInt830);
				this.aBoolean239 = false;
			}
			@Pc(86) Color local86 = new Color(140, 17, 17);
			@Pc(93) int local93 = this.anInt830 / 2 - 18;
			this.aGraphics2.setColor(local86);
			this.aGraphics2.drawRect(this.anInt829 / 2 - 152, local93, 304, 34);
			this.aGraphics2.fillRect(this.anInt829 / 2 - 150, local93 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt829 / 2 + arg1 * 3 - 150, local93 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg2, (this.anInt829 - local42.stringWidth(arg2)) / 2, local93 + 22);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("69821, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}
}
