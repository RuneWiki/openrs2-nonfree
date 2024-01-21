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

@OriginalClass("client!EOQQYERM")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "I")
	private int anInt807;

	@OriginalMember(owner = "client!EOQQYERM", name = "c", descriptor = "I")
	private int anInt808;

	@OriginalMember(owner = "client!EOQQYERM", name = "h", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!EOQQYERM", name = "l", descriptor = "I")
	protected int anInt814;

	@OriginalMember(owner = "client!EOQQYERM", name = "n", descriptor = "I")
	protected int anInt815;

	@OriginalMember(owner = "client!EOQQYERM", name = "o", descriptor = "I")
	protected int anInt816;

	@OriginalMember(owner = "client!EOQQYERM", name = "p", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!EOQQYERM", name = "q", descriptor = "Lclient!HZYGKZDT;")
	protected Class13 aClass13_2;

	@OriginalMember(owner = "client!EOQQYERM", name = "s", descriptor = "Lclient!PXHNRURM;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!EOQQYERM", name = "v", descriptor = "I")
	protected int anInt817;

	@OriginalMember(owner = "client!EOQQYERM", name = "w", descriptor = "I")
	protected int anInt818;

	@OriginalMember(owner = "client!EOQQYERM", name = "x", descriptor = "I")
	public int anInt819;

	@OriginalMember(owner = "client!EOQQYERM", name = "y", descriptor = "I")
	public int anInt820;

	@OriginalMember(owner = "client!EOQQYERM", name = "z", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!EOQQYERM", name = "A", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!EOQQYERM", name = "B", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!EOQQYERM", name = "C", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!EOQQYERM", name = "D", descriptor = "I")
	protected int anInt824;

	@OriginalMember(owner = "client!EOQQYERM", name = "E", descriptor = "I")
	protected int anInt825;

	@OriginalMember(owner = "client!EOQQYERM", name = "F", descriptor = "I")
	protected int anInt826;

	@OriginalMember(owner = "client!EOQQYERM", name = "G", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!EOQQYERM", name = "J", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!EOQQYERM", name = "K", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!EOQQYERM", name = "b", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!EOQQYERM", name = "d", descriptor = "B")
	private byte aByte35 = 0;

	@OriginalMember(owner = "client!EOQQYERM", name = "e", descriptor = "I")
	private int anInt809 = -3404;

	@OriginalMember(owner = "client!EOQQYERM", name = "f", descriptor = "I")
	private int anInt810 = -3404;

	@OriginalMember(owner = "client!EOQQYERM", name = "g", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!EOQQYERM", name = "i", descriptor = "I")
	private int anInt812 = 20;

	@OriginalMember(owner = "client!EOQQYERM", name = "j", descriptor = "I")
	protected int anInt813 = 1;

	@OriginalMember(owner = "client!EOQQYERM", name = "k", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!EOQQYERM", name = "m", descriptor = "Z")
	protected boolean aBoolean216 = false;

	@OriginalMember(owner = "client!EOQQYERM", name = "r", descriptor = "[Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3[] aClass4_Sub1_Sub1_Sub3Array3 = new Class4_Sub1_Sub1_Sub3[6];

	@OriginalMember(owner = "client!EOQQYERM", name = "t", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!EOQQYERM", name = "u", descriptor = "Z")
	protected boolean aBoolean218 = true;

	@OriginalMember(owner = "client!EOQQYERM", name = "H", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!EOQQYERM", name = "I", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(III)V")
	protected final void method577() {
		try {
			this.anInt815 = 765;
			this.anInt816 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt815, this.anInt816, 933, this);
			this.aGraphics2 = this.method587().getGraphics();
			this.aClass13_2 = new Class13(this.method587(), this.anInt815, 430, this.anInt816);
			this.method588(this, 1);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("14097, " + 765 + ", " + 0 + ", " + 503 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "b", descriptor = "(III)V")
	protected final void method578() {
		try {
			this.anInt815 = 765;
			this.anInt816 = 503;
			this.aGraphics2 = this.method587().getGraphics();
			this.aClass13_2 = new Class13(this.method587(), this.anInt815, 430, this.anInt816);
			this.method588(this, 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("86466, " + 765 + ", " + 503 + ", " + -44916 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method587().addMouseListener(this);
		this.method587().addMouseMotionListener(this);
		this.method587().addKeyListener(this);
		this.method587().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method589("Loading...", 0);
		this.method582();
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
			@Pc(169) int local169;
			do {
				if (this.anInt811 < 0) {
					if (this.anInt811 == -1) {
						this.method579();
					}
					return;
				}
				if (this.anInt811 > 0) {
					this.anInt811--;
					if (this.anInt811 == 0) {
						this.method579();
						return;
					}
				}
				@Pc(80) int local80 = local39;
				@Pc(82) int local82 = local41;
				local39 = 300;
				local41 = 1;
				local60 = System.currentTimeMillis();
				if (this.aLongArray2[local37] == 0L) {
					local39 = local80;
					local41 = local82;
				} else if (local60 > this.aLongArray2[local37]) {
					local39 = (int) ((long) (this.anInt812 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt812 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt812) {
					local41 = this.anInt812;
				}
				this.aLongArray2[local37] = local60;
				local37 = (local37 + 1) % 10;
				if (local41 > 1) {
					for (local169 = 0; local169 < 10; local169++) {
						if (this.aLongArray2[local169] != 0L) {
							this.aLongArray2[local169] += local41;
						}
					}
				}
				if (local41 < this.anInt813) {
					local41 = this.anInt813;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt824 = this.anInt821;
					this.anInt825 = this.anInt822;
					this.anInt826 = this.anInt823;
					this.aLong28 = this.aLong27;
					this.anInt821 = 0;
					this.method583(this.anInt809);
					this.anInt827 = this.anInt828;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt812 > 0) {
					this.anInt814 = local39 * 1000 / (this.anInt812 * 256);
				}
				this.method585();
			} while (!this.aBoolean216);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(286) int local286 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt814 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt812 + " mindel:" + this.anInt813);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean216 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(B)V")
	private void method579() {
		try {
			this.anInt811 = -2;
			if (this.aByte35 == 0) {
				this.method584(686);
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
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("63377, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(ZI)V")
	protected final void method580() {
		try {
			this.anInt812 = 1000;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("51365, " + false + ", " + 1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt811 >= 0) {
			this.anInt811 = 0;
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt811 >= 0) {
			this.anInt811 = 4000 / this.anInt812;
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt811 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt811 == -1) {
			this.method579();
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean217 = true;
		this.method586();
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean217 = true;
		this.method586();
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt817 = 0;
		this.anInt822 = local2;
		this.anInt823 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt821 = 2;
			this.anInt818 = 2;
		} else {
			this.anInt821 = 1;
			this.anInt818 = 1;
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt817 = 0;
		this.anInt818 = 0;
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt817 = 0;
		this.anInt819 = -1;
		this.anInt820 = -1;
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt817 = 0;
		this.anInt819 = local2;
		this.anInt820 = local5;
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt817 = 0;
		this.anInt819 = local2;
		this.anInt820 = local5;
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt817 = 0;
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
			this.anIntArray211[this.anInt828] = local10;
			this.anInt828 = this.anInt828 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt817 = 0;
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

	@OriginalMember(owner = "client!EOQQYERM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(I)I")
	protected final int method581() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt828 != this.anInt827) {
				local1 = this.anIntArray211[this.anInt827];
				this.anInt827 = this.anInt827 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("13024, " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean218 = true;
		this.aBoolean217 = true;
		this.method586();
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean218 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "()V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "b", descriptor = "(I)V")
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != this.anInt810) {
				this.anInt810 = 124;
			}
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("14547, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "c", descriptor = "(I)V")
	protected void method584(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("25257, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "d", descriptor = "(I)V")
	protected void method585() {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "b", descriptor = "(B)V")
	protected void method586() {
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "e", descriptor = "(I)Ljava/awt/Component;")
	protected Component method587() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("94661, " + -61 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method588(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(ILjava/lang/String;I)V")
	protected void method589(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method587().getGraphics();
				try {
					this.method587().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method587().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method587().getFontMetrics(local49);
			if (this.aBoolean217) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt815, this.anInt816);
				this.aBoolean217 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt816 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt815 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt815 / 2 - 150, local88 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt815 / 2 + arg1 * 3 - 150, local88 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt815 - local42.stringWidth(arg0)) / 2, local88 + 22);
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("19316, " + -23874 + ", " + arg0 + ", " + arg1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}
}
