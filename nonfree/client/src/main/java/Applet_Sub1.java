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

@OriginalClass("client!KWRIFYWM")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!KWRIFYWM", name = "d", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!KWRIFYWM", name = "h", descriptor = "I")
	protected int anInt821;

	@OriginalMember(owner = "client!KWRIFYWM", name = "j", descriptor = "I")
	protected int anInt822;

	@OriginalMember(owner = "client!KWRIFYWM", name = "k", descriptor = "I")
	protected int anInt823;

	@OriginalMember(owner = "client!KWRIFYWM", name = "l", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!KWRIFYWM", name = "m", descriptor = "Lclient!YJGBGRIO;")
	protected Class47 aClass47_2;

	@OriginalMember(owner = "client!KWRIFYWM", name = "o", descriptor = "Lclient!HAQQOONQ;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!KWRIFYWM", name = "r", descriptor = "I")
	protected int anInt824;

	@OriginalMember(owner = "client!KWRIFYWM", name = "s", descriptor = "I")
	protected int anInt825;

	@OriginalMember(owner = "client!KWRIFYWM", name = "t", descriptor = "I")
	public int anInt826;

	@OriginalMember(owner = "client!KWRIFYWM", name = "u", descriptor = "I")
	public int anInt827;

	@OriginalMember(owner = "client!KWRIFYWM", name = "v", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!KWRIFYWM", name = "w", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!KWRIFYWM", name = "x", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!KWRIFYWM", name = "y", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!KWRIFYWM", name = "z", descriptor = "I")
	protected int anInt831;

	@OriginalMember(owner = "client!KWRIFYWM", name = "A", descriptor = "I")
	protected int anInt832;

	@OriginalMember(owner = "client!KWRIFYWM", name = "B", descriptor = "I")
	protected int anInt833;

	@OriginalMember(owner = "client!KWRIFYWM", name = "C", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!KWRIFYWM", name = "F", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!KWRIFYWM", name = "G", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "B")
	private byte aByte28 = 4;

	@OriginalMember(owner = "client!KWRIFYWM", name = "b", descriptor = "I")
	private int anInt817 = 6;

	@OriginalMember(owner = "client!KWRIFYWM", name = "c", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!KWRIFYWM", name = "e", descriptor = "I")
	private int anInt819 = 20;

	@OriginalMember(owner = "client!KWRIFYWM", name = "f", descriptor = "I")
	protected int anInt820 = 1;

	@OriginalMember(owner = "client!KWRIFYWM", name = "g", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!KWRIFYWM", name = "i", descriptor = "Z")
	protected boolean aBoolean230 = false;

	@OriginalMember(owner = "client!KWRIFYWM", name = "n", descriptor = "[Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array3 = new Class4_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!KWRIFYWM", name = "p", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!KWRIFYWM", name = "q", descriptor = "Z")
	protected boolean aBoolean232 = true;

	@OriginalMember(owner = "client!KWRIFYWM", name = "D", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!KWRIFYWM", name = "E", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "(IIZ)V")
	protected final void method573() {
		try {
			this.anInt822 = 765;
			this.anInt823 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt823, this, true, this.anInt822);
			this.aGraphics2 = this.method583(this.anInt817).getGraphics();
			this.aClass47_2 = new Class47(this.method583(this.anInt817), true, this.anInt822, this.anInt823);
			this.method584(this, 1);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("62479, " + 503 + ", " + 765 + ", " + false + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "(III)V")
	protected final void method574() {
		try {
			this.anInt822 = 765;
			this.anInt823 = 503;
			this.aGraphics2 = this.method583(this.anInt817).getGraphics();
			this.aClass47_2 = new Class47(this.method583(this.anInt817), true, this.anInt822, this.anInt823);
			this.method584(this, 1);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("58016, " + 1 + ", " + 503 + ", " + 765 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method583(this.anInt817).addMouseListener(this);
		this.method583(this.anInt817).addMouseMotionListener(this);
		this.method583(this.anInt817).addKeyListener(this);
		this.method583(this.anInt817).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method585("Loading...", 0);
		this.method578();
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
				if (this.anInt818 < 0) {
					if (this.anInt818 == -1) {
						this.method575();
					}
					return;
				}
				if (this.anInt818 > 0) {
					this.anInt818--;
					if (this.anInt818 == 0) {
						this.method575();
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
					local43 = (int) ((long) (this.anInt819 * 2560) / (local64 - this.aLongArray2[local41]));
				}
				if (local43 < 25) {
					local43 = 25;
				}
				if (local43 > 256) {
					local43 = 256;
					local45 = (int) ((long) this.anInt819 - (local64 - this.aLongArray2[local41]) / 10L);
				}
				if (local45 > this.anInt819) {
					local45 = this.anInt819;
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
				if (local45 < this.anInt820) {
					local45 = this.anInt820;
				}
				try {
					Thread.sleep((long) local45);
				} catch (@Pc(207) InterruptedException local207) {
					local49++;
				}
				while (local47 < 256) {
					this.anInt831 = this.anInt828;
					this.anInt832 = this.anInt829;
					this.anInt833 = this.anInt830;
					this.aLong28 = this.aLong27;
					this.anInt828 = 0;
					this.method579();
					this.anInt834 = this.anInt835;
					local47 += local43;
				}
				local47 &= 0xFF;
				if (this.anInt819 > 0) {
					this.anInt821 = local43 * 1000 / (this.anInt819 * 256);
				}
				this.method581();
			} while (!this.aBoolean230);
			System.out.println("ntime:" + local64);
			for (local173 = 0; local173 < 10; local173++) {
				@Pc(289) int local289 = (local41 + 20 - local173 - 1) % 10;
				System.out.println("otim" + local289 + ":" + this.aLongArray2[local289]);
			}
			System.out.println("fps:" + this.anInt821 + " ratio:" + local43 + " count:" + local47);
			System.out.println("del:" + local45 + " deltime:" + this.anInt819 + " mindel:" + this.anInt820);
			System.out.println("intex:" + local49 + " opos:" + local41);
			this.aBoolean230 = false;
			local49 = 0;
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "(I)V")
	private void method575() {
		try {
			this.anInt818 = -2;
			this.method580((byte) 2);
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
			signlink.reporterror("92257, " + 1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "(BI)V")
	protected final void method576() {
		try {
			this.anInt819 = 1000;
			if (this.aByte28 == 4) {
				;
			}
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("66099, " + 4 + ", " + 1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt818 >= 0) {
			this.anInt818 = 0;
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt818 >= 0) {
			this.anInt818 = 4000 / this.anInt819;
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt818 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt818 == -1) {
			this.method575();
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean231 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean231 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt824 = 0;
		this.anInt829 = local2;
		this.anInt830 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt828 = 2;
			this.anInt825 = 2;
		} else {
			this.anInt828 = 1;
			this.anInt825 = 1;
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt824 = 0;
		this.anInt825 = 0;
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt824 = 0;
		this.anInt826 = -1;
		this.anInt827 = -1;
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt824 = 0;
		this.anInt826 = local2;
		this.anInt827 = local5;
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt824 = 0;
		this.anInt826 = local2;
		this.anInt827 = local5;
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt824 = 0;
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
			this.anIntArray211[this.anInt835] = local10;
			this.anInt835 = this.anInt835 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt824 = 0;
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

	@OriginalMember(owner = "client!KWRIFYWM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "(Z)I")
	protected final int method577() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt835 != this.anInt834) {
				local1 = this.anIntArray211[this.anInt834];
				this.anInt834 = this.anInt834 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("86646, " + true + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean232 = true;
		this.aBoolean231 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean232 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "()V")
	protected void method578() {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "(B)V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "b", descriptor = "(B)V")
	protected void method580(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("57905, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "c", descriptor = "(B)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "d", descriptor = "(B)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "b", descriptor = "(I)Ljava/awt/Component;")
	protected Component method583(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 6 || arg0 > 6) {
				throw new NullPointerException();
			}
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("89544, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method584(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!KWRIFYWM", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	protected void method585(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method583(this.anInt817).getGraphics();
				try {
					this.method583(this.anInt817).repaint();
				} catch (@Pc(23) Exception local23) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(27) Exception local27) {
				}
			}
			@Pc(38) Font local38 = new Font("Helvetica", 1, 13);
			@Pc(45) FontMetrics local45 = this.method583(this.anInt817).getFontMetrics(local38);
			@Pc(52) Font local52 = new Font("Helvetica", 0, 13);
			this.method583(this.anInt817).getFontMetrics(local52);
			if (this.aBoolean231) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt822, this.anInt823);
				this.aBoolean231 = false;
			}
			@Pc(85) Color local85 = new Color(140, 17, 17);
			@Pc(92) int local92 = this.anInt823 / 2 - 18;
			this.aGraphics2.setColor(local85);
			this.aGraphics2.drawRect(this.anInt822 / 2 - 152, local92, 304, 34);
			this.aGraphics2.fillRect(this.anInt822 / 2 - 150, local92 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt822 / 2 + arg1 * 3 - 150, local92 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local38);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt822 - local45.stringWidth(arg0)) / 2, local92 + 22);
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("48689, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}
}
