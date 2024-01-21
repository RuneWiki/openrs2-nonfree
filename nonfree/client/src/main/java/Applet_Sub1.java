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

@OriginalClass("client!HXQNMAEJ")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!HXQNMAEJ", name = "d", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "f", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "j", descriptor = "I")
	protected int anInt829;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "l", descriptor = "I")
	protected int anInt830;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "m", descriptor = "I")
	protected int anInt831;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "o", descriptor = "Lclient!TWKZMYGD;")
	protected Class36 aClass36_2;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "q", descriptor = "Lclient!DQQGYYJG;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "t", descriptor = "I")
	protected int anInt832;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "u", descriptor = "I")
	protected int anInt833;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "v", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "w", descriptor = "I")
	public int anInt835;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "x", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "y", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "z", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "B", descriptor = "I")
	protected int anInt839;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "C", descriptor = "I")
	protected int anInt840;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "D", descriptor = "I")
	protected int anInt841;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "H", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "I", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "a", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "b", descriptor = "B")
	private byte aByte36 = -102;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "c", descriptor = "I")
	private int anInt823 = 7129;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "e", descriptor = "I")
	private int anInt825 = -353;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "g", descriptor = "I")
	private int anInt827 = 20;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "h", descriptor = "I")
	protected int anInt828 = 1;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!HXQNMAEJ", name = "k", descriptor = "Z")
	protected boolean aBoolean211 = false;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "p", descriptor = "[Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array3 = new Class1_Sub1_Sub2_Sub1[6];

	@OriginalMember(owner = "client!HXQNMAEJ", name = "r", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "s", descriptor = "Z")
	protected boolean aBoolean213 = true;

	@OriginalMember(owner = "client!HXQNMAEJ", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!HXQNMAEJ", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!HXQNMAEJ", name = "a", descriptor = "(III)V")
	protected final void method569() {
		try {
			this.anInt830 = 765;
			this.anInt831 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt831, this.anInt824, this.anInt830, this);
			this.aGraphics2 = this.method579(this.anInt823).getGraphics();
			this.aClass36_2 = new Class36(this.anInt831, this.anInt830, (byte) 22, this.method579(this.anInt823));
			this.method580(this, 1);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("92925, " + -242 + ", " + 765 + ", " + 503 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "b", descriptor = "(III)V")
	protected final void method570() {
		try {
			this.anInt830 = 765;
			this.anInt831 = 503;
			this.aGraphics2 = this.method579(this.anInt823).getGraphics();
			this.aClass36_2 = new Class36(this.anInt831, this.anInt830, (byte) 22, this.method579(this.anInt823));
			this.method580(this, 1);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("34012, " + 11004 + ", " + 765 + ", " + 503 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method579(this.anInt823).addMouseListener(this);
		this.method579(this.anInt823).addMouseMotionListener(this);
		this.method579(this.anInt823).addKeyListener(this);
		this.method579(this.anInt823).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method581("Loading...", 0);
		this.method574();
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
			@Pc(174) int local174;
			do {
				if (this.anInt826 < 0) {
					if (this.anInt826 == -1) {
						this.method571(this.aByte36);
					}
					return;
				}
				if (this.anInt826 > 0) {
					this.anInt826--;
					if (this.anInt826 == 0) {
						this.method571(this.aByte36);
						return;
					}
				}
				@Pc(85) int local85 = local43;
				@Pc(87) int local87 = local45;
				local43 = 300;
				local45 = 1;
				local64 = System.currentTimeMillis();
				if (this.aLongArray2[local41] == 0L) {
					local43 = local85;
					local45 = local87;
				} else if (local64 > this.aLongArray2[local41]) {
					local43 = (int) ((long) (this.anInt827 * 2560) / (local64 - this.aLongArray2[local41]));
				}
				if (local43 < 25) {
					local43 = 25;
				}
				if (local43 > 256) {
					local43 = 256;
					local45 = (int) ((long) this.anInt827 - (local64 - this.aLongArray2[local41]) / 10L);
				}
				if (local45 > this.anInt827) {
					local45 = this.anInt827;
				}
				this.aLongArray2[local41] = local64;
				local41 = (local41 + 1) % 10;
				if (local45 > 1) {
					for (local174 = 0; local174 < 10; local174++) {
						if (this.aLongArray2[local174] != 0L) {
							this.aLongArray2[local174] += local45;
						}
					}
				}
				if (local45 < this.anInt828) {
					local45 = this.anInt828;
				}
				try {
					Thread.sleep((long) local45);
				} catch (@Pc(208) InterruptedException local208) {
					local49++;
				}
				while (local47 < 256) {
					this.anInt839 = this.anInt836;
					this.anInt840 = this.anInt837;
					this.anInt841 = this.anInt838;
					this.aLong28 = this.aLong27;
					this.anInt836 = 0;
					this.method575();
					this.anInt842 = this.anInt843;
					local47 += local43;
				}
				local47 &= 0xFF;
				if (this.anInt827 > 0) {
					this.anInt829 = local43 * 1000 / (this.anInt827 * 256);
				}
				this.method577();
			} while (!this.aBoolean211);
			System.out.println("ntime:" + local64);
			for (local174 = 0; local174 < 10; local174++) {
				@Pc(290) int local290 = (local41 + 20 - local174 - 1) % 10;
				System.out.println("otim" + local290 + ":" + this.aLongArray2[local290]);
			}
			System.out.println("fps:" + this.anInt829 + " ratio:" + local43 + " count:" + local47);
			System.out.println("del:" + local45 + " deltime:" + this.anInt827 + " mindel:" + this.anInt828);
			System.out.println("intex:" + local49 + " opos:" + local41);
			this.aBoolean211 = false;
			local49 = 0;
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "a", descriptor = "(B)V")
	private void method571(@OriginalArg(0) byte arg0) {
		try {
			this.anInt826 = -2;
			if (arg0 != -102) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			this.method576();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(22) Exception local22) {
				}
				try {
					System.exit(0);
				} catch (@Pc(26) Throwable local26) {
				}
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("77481, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "a", descriptor = "(II)V")
	protected final void method572() {
		try {
			this.anInt827 = 1000;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("6352, " + 1 + ", " + -410 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt826 >= 0) {
			this.anInt826 = 0;
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt826 >= 0) {
			this.anInt826 = 4000 / this.anInt827;
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt826 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt826 == -1) {
			this.method571(this.aByte36);
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean212 = true;
		this.method578();
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean212 = true;
		this.method578();
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt832 = 0;
		this.anInt837 = local2;
		this.anInt838 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt836 = 2;
			this.anInt833 = 2;
		} else {
			this.anInt836 = 1;
			this.anInt833 = 1;
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt832 = 0;
		this.anInt833 = 0;
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt832 = 0;
		this.anInt834 = -1;
		this.anInt835 = -1;
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt832 = 0;
		this.anInt834 = local2;
		this.anInt835 = local5;
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt832 = 0;
		this.anInt834 = local2;
		this.anInt835 = local5;
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt832 = 0;
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
			this.anIntArray211[this.anInt843] = local10;
			this.anInt843 = this.anInt843 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt832 = 0;
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

	@OriginalMember(owner = "client!HXQNMAEJ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "a", descriptor = "(Z)I")
	protected final int method573(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				return this.anInt823;
			}
			@Pc(6) int local6 = -1;
			if (this.anInt843 != this.anInt842) {
				local6 = this.anIntArray211[this.anInt842];
				this.anInt842 = this.anInt842 + 1 & 0x7F;
			}
			return local6;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("37468, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean213 = true;
		this.aBoolean212 = true;
		this.method578();
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean213 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "a", descriptor = "()V")
	protected void method574() {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "b", descriptor = "(Z)V")
	protected void method575() {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "a", descriptor = "(I)V")
	protected void method576() {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "b", descriptor = "(B)V")
	protected void method577() {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "c", descriptor = "(B)V")
	protected void method578() {
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "b", descriptor = "(I)Ljava/awt/Component;")
	protected Component method579(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 7129) {
				this.anInt824 = -17;
			}
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("97347, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method580(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!HXQNMAEJ", name = "a", descriptor = "(ILjava/lang/String;I)V")
	protected void method581(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method579(this.anInt823).getGraphics();
				try {
					this.method579(this.anInt823).repaint();
				} catch (@Pc(23) Exception local23) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(27) Exception local27) {
				}
			}
			@Pc(38) Font local38 = new Font("Helvetica", 1, 13);
			@Pc(45) FontMetrics local45 = this.method579(this.anInt823).getFontMetrics(local38);
			@Pc(52) Font local52 = new Font("Helvetica", 0, 13);
			this.method579(this.anInt823).getFontMetrics(local52);
			if (this.aBoolean212) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt830, this.anInt831);
				this.aBoolean212 = false;
			}
			@Pc(85) Color local85 = new Color(140, 17, 17);
			@Pc(92) int local92 = this.anInt831 / 2 - 18;
			this.aGraphics2.setColor(local85);
			this.aGraphics2.drawRect(this.anInt830 / 2 - 152, local92, 304, 34);
			this.aGraphics2.fillRect(this.anInt830 / 2 - 150, local92 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt830 / 2 + arg1 * 3 - 150, local92 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local38);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt830 - local45.stringWidth(arg0)) / 2, local92 + 22);
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("89058, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}
}
