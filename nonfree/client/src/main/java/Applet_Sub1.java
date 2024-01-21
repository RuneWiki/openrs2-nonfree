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

@OriginalClass("client!HXUVWQPY")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!HXUVWQPY", name = "c", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!HXUVWQPY", name = "d", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!HXUVWQPY", name = "h", descriptor = "I")
	protected int anInt825;

	@OriginalMember(owner = "client!HXUVWQPY", name = "j", descriptor = "I")
	protected int anInt826;

	@OriginalMember(owner = "client!HXUVWQPY", name = "k", descriptor = "I")
	protected int anInt827;

	@OriginalMember(owner = "client!HXUVWQPY", name = "l", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!HXUVWQPY", name = "m", descriptor = "Lclient!AKBGAGNS;")
	protected Class1 aClass1_2;

	@OriginalMember(owner = "client!HXUVWQPY", name = "o", descriptor = "Lclient!LKLMGHHW;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!HXUVWQPY", name = "r", descriptor = "I")
	protected int anInt828;

	@OriginalMember(owner = "client!HXUVWQPY", name = "s", descriptor = "I")
	protected int anInt829;

	@OriginalMember(owner = "client!HXUVWQPY", name = "t", descriptor = "I")
	public int anInt830;

	@OriginalMember(owner = "client!HXUVWQPY", name = "u", descriptor = "I")
	public int anInt831;

	@OriginalMember(owner = "client!HXUVWQPY", name = "v", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!HXUVWQPY", name = "w", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!HXUVWQPY", name = "x", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!HXUVWQPY", name = "y", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!HXUVWQPY", name = "z", descriptor = "I")
	protected int anInt835;

	@OriginalMember(owner = "client!HXUVWQPY", name = "A", descriptor = "I")
	protected int anInt836;

	@OriginalMember(owner = "client!HXUVWQPY", name = "B", descriptor = "I")
	protected int anInt837;

	@OriginalMember(owner = "client!HXUVWQPY", name = "C", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!HXUVWQPY", name = "F", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!HXUVWQPY", name = "G", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "Z")
	private boolean aBoolean195 = true;

	@OriginalMember(owner = "client!HXUVWQPY", name = "b", descriptor = "I")
	private int anInt820 = 720;

	@OriginalMember(owner = "client!HXUVWQPY", name = "e", descriptor = "I")
	private int anInt823 = 20;

	@OriginalMember(owner = "client!HXUVWQPY", name = "f", descriptor = "I")
	protected int anInt824 = 1;

	@OriginalMember(owner = "client!HXUVWQPY", name = "g", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!HXUVWQPY", name = "i", descriptor = "Z")
	protected boolean aBoolean196 = false;

	@OriginalMember(owner = "client!HXUVWQPY", name = "n", descriptor = "[Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3[] aClass2_Sub1_Sub3_Sub3Array3 = new Class2_Sub1_Sub3_Sub3[6];

	@OriginalMember(owner = "client!HXUVWQPY", name = "p", descriptor = "Z")
	private boolean aBoolean197 = true;

	@OriginalMember(owner = "client!HXUVWQPY", name = "q", descriptor = "Z")
	protected boolean aBoolean198 = true;

	@OriginalMember(owner = "client!HXUVWQPY", name = "D", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!HXUVWQPY", name = "E", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(III)V")
	protected final void method576() {
		try {
			this.anInt826 = 765;
			this.anInt827 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, this.anInt826, false, this.anInt827);
			this.aGraphics2 = this.method586(this.aBoolean195).getGraphics();
			this.aClass1_2 = new Class1(this.anInt827, -826, this.method586(this.aBoolean195), this.anInt826);
			this.method587(this, 1);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("82325, " + 765 + ", " + 503 + ", " + 1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "b", descriptor = "(III)V")
	protected final void method577(@OriginalArg(0) int arg0) {
		try {
			this.anInt826 = 765;
			this.anInt827 = 503;
			this.aGraphics2 = this.method586(this.aBoolean195).getGraphics();
			this.aClass1_2 = new Class1(this.anInt827, -826, this.method586(this.aBoolean195), this.anInt826);
			if (arg0 != 37470) {
				for (@Pc(31) int local31 = 1; local31 > 0; local31++) {
				}
			}
			this.method587(this, 1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("25954, " + arg0 + ", " + 503 + ", " + 765 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method586(this.aBoolean195).addMouseListener(this);
		this.method586(this.aBoolean195).addMouseMotionListener(this);
		this.method586(this.aBoolean195).addKeyListener(this);
		this.method586(this.aBoolean195).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588(0, "Loading...");
		this.method581();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		@Pc(45) int local45 = 1;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			this.aLongArray2[local51] = System.currentTimeMillis();
		}
		@Pc(64) long local64 = System.currentTimeMillis();
		while (true) {
			@Pc(173) int local173;
			do {
				if (this.anInt822 < 0) {
					if (this.anInt822 == -1) {
						this.method578();
					}
					return;
				}
				if (this.anInt822 > 0) {
					this.anInt822--;
					if (this.anInt822 == 0) {
						this.method578();
						return;
					}
				}
				@Pc(84) int local84 = local43;
				@Pc(86) int local86 = local45;
				local43 = 300;
				local45 = 1;
				local64 = System.currentTimeMillis();
				if (this.aLongArray2[local41] == 0L) {
					local43 = local84;
					local45 = local86;
				} else if (local64 > this.aLongArray2[local41]) {
					local43 = (int) ((long) (this.anInt823 * 2560) / (local64 - this.aLongArray2[local41]));
				}
				if (local43 < 25) {
					local43 = 25;
				}
				if (local43 > 256) {
					local43 = 256;
					local45 = (int) ((long) this.anInt823 - (local64 - this.aLongArray2[local41]) / 10L);
				}
				if (local45 > this.anInt823) {
					local45 = this.anInt823;
				}
				this.aLongArray2[local41] = local64;
				local41 = (local41 + 1) % 10;
				if (local45 > 1) {
					for (local173 = 0; local173 < 10; local173++) {
						if (this.aLongArray2[local173] != 0L) {
							this.aLongArray2[local173] += local45;
						}
					}
				}
				if (local45 < this.anInt824) {
					local45 = this.anInt824;
				}
				try {
					Thread.sleep((long) local45);
				} catch (@Pc(207) InterruptedException local207) {
					local49++;
				}
				while (local47 < 256) {
					this.anInt835 = this.anInt832;
					this.anInt836 = this.anInt833;
					this.anInt837 = this.anInt834;
					this.aLong28 = this.aLong27;
					this.anInt832 = 0;
					this.method582(670);
					this.anInt838 = this.anInt839;
					local47 += local43;
				}
				local47 &= 0xFF;
				if (this.anInt823 > 0) {
					this.anInt825 = local43 * 1000 / (this.anInt823 * 256);
				}
				this.method584();
			} while (!this.aBoolean196);
			System.out.println("ntime:" + local64);
			for (local173 = 0; local173 < 10; local173++) {
				@Pc(289) int local289 = (local41 + 20 - local173 - 1) % 10;
				System.out.println("otim" + local289 + ":" + this.aLongArray2[local289]);
			}
			System.out.println("fps:" + this.anInt825 + " ratio:" + local43 + " count:" + local47);
			System.out.println("del:" + local45 + " deltime:" + this.anInt823 + " mindel:" + this.anInt824);
			System.out.println("intex:" + local49 + " opos:" + local41);
			this.aBoolean196 = false;
			local49 = 0;
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(I)V")
	private void method578() {
		try {
			this.anInt822 = -2;
			this.method583();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(17) Exception local17) {
				}
				try {
					System.exit(0);
				} catch (@Pc(21) Throwable local21) {
				}
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("5489, " + -16 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(BI)V")
	protected final void method579(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 3) {
				this.anInt821 = -335;
			}
			this.anInt823 = 1000;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("66694, " + arg0 + ", " + 1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt822 >= 0) {
			this.anInt822 = 0;
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt822 >= 0) {
			this.anInt822 = 4000 / this.anInt823;
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt822 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt822 == -1) {
			this.method578();
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean197 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean197 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt828 = 0;
		this.anInt833 = local2;
		this.anInt834 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt832 = 2;
			this.anInt829 = 2;
		} else {
			this.anInt832 = 1;
			this.anInt829 = 1;
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt828 = 0;
		this.anInt829 = 0;
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt828 = 0;
		this.anInt830 = -1;
		this.anInt831 = -1;
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt828 = 0;
		this.anInt830 = local2;
		this.anInt831 = local5;
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt828 = 0;
		this.anInt830 = local2;
		this.anInt831 = local5;
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt828 = 0;
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
			this.anIntArray211[this.anInt839] = local10;
			this.anInt839 = this.anInt839 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt828 = 0;
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

	@OriginalMember(owner = "client!HXUVWQPY", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(B)I")
	protected final int method580(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(17) int local17 = -1;
			if (this.anInt839 != this.anInt838) {
				local17 = this.anIntArray211[this.anInt838];
				this.anInt838 = this.anInt838 + 1 & 0x7F;
			}
			return local17;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("38082, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean198 = true;
		this.aBoolean197 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean198 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "()V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "b", descriptor = "(I)V")
	protected void method582(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("82139, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "c", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "d", descriptor = "(I)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(Z)V")
	protected void method585() {
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	protected Component method586(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("62008, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(ILjava/lang/String;I)V")
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method586(this.aBoolean195).getGraphics();
				try {
					this.method586(this.aBoolean195).repaint();
				} catch (@Pc(23) Exception local23) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(27) Exception local27) {
				}
			}
			@Pc(38) Font local38 = new Font("Helvetica", 1, 13);
			@Pc(45) FontMetrics local45 = this.method586(this.aBoolean195).getFontMetrics(local38);
			@Pc(52) Font local52 = new Font("Helvetica", 0, 13);
			this.method586(this.aBoolean195).getFontMetrics(local52);
			if (this.aBoolean197) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt826, this.anInt827);
				this.aBoolean197 = false;
			}
			@Pc(85) Color local85 = new Color(140, 17, 17);
			@Pc(92) int local92 = this.anInt827 / 2 - 18;
			this.aGraphics2.setColor(local85);
			this.aGraphics2.drawRect(this.anInt826 / 2 - 152, local92, 304, 34);
			this.aGraphics2.fillRect(this.anInt826 / 2 - 150, local92 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt826 / 2 + arg0 * 3 - 150, local92 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local38);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt826 - local45.stringWidth(arg1)) / 2, local92 + 22);
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("38580, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}
}
