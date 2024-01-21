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

@OriginalClass("client!BTXFPMEV")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!BTXFPMEV", name = "g", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!BTXFPMEV", name = "k", descriptor = "I")
	protected int anInt823;

	@OriginalMember(owner = "client!BTXFPMEV", name = "m", descriptor = "I")
	protected int anInt824;

	@OriginalMember(owner = "client!BTXFPMEV", name = "n", descriptor = "I")
	protected int anInt825;

	@OriginalMember(owner = "client!BTXFPMEV", name = "o", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!BTXFPMEV", name = "p", descriptor = "Lclient!CMFQLMCT;")
	protected Class7 aClass7_2;

	@OriginalMember(owner = "client!BTXFPMEV", name = "r", descriptor = "Lclient!MOPGUTIE;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!BTXFPMEV", name = "u", descriptor = "I")
	protected int anInt826;

	@OriginalMember(owner = "client!BTXFPMEV", name = "v", descriptor = "I")
	protected int anInt827;

	@OriginalMember(owner = "client!BTXFPMEV", name = "w", descriptor = "I")
	public int anInt828;

	@OriginalMember(owner = "client!BTXFPMEV", name = "x", descriptor = "I")
	public int anInt829;

	@OriginalMember(owner = "client!BTXFPMEV", name = "y", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!BTXFPMEV", name = "z", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!BTXFPMEV", name = "A", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!BTXFPMEV", name = "B", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!BTXFPMEV", name = "C", descriptor = "I")
	protected int anInt833;

	@OriginalMember(owner = "client!BTXFPMEV", name = "D", descriptor = "I")
	protected int anInt834;

	@OriginalMember(owner = "client!BTXFPMEV", name = "E", descriptor = "I")
	protected int anInt835;

	@OriginalMember(owner = "client!BTXFPMEV", name = "F", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!BTXFPMEV", name = "I", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!BTXFPMEV", name = "J", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!BTXFPMEV", name = "a", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!BTXFPMEV", name = "b", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!BTXFPMEV", name = "c", descriptor = "B")
	private byte aByte52 = -32;

	@OriginalMember(owner = "client!BTXFPMEV", name = "d", descriptor = "B")
	private byte aByte53 = 93;

	@OriginalMember(owner = "client!BTXFPMEV", name = "e", descriptor = "B")
	private byte aByte54 = 3;

	@OriginalMember(owner = "client!BTXFPMEV", name = "f", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!BTXFPMEV", name = "h", descriptor = "I")
	private int anInt821 = 20;

	@OriginalMember(owner = "client!BTXFPMEV", name = "i", descriptor = "I")
	protected int anInt822 = 1;

	@OriginalMember(owner = "client!BTXFPMEV", name = "j", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!BTXFPMEV", name = "l", descriptor = "Z")
	protected boolean aBoolean194 = false;

	@OriginalMember(owner = "client!BTXFPMEV", name = "q", descriptor = "[Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array3 = new Class1_Sub1_Sub1_Sub2[6];

	@OriginalMember(owner = "client!BTXFPMEV", name = "s", descriptor = "Z")
	private boolean aBoolean195 = true;

	@OriginalMember(owner = "client!BTXFPMEV", name = "t", descriptor = "Z")
	protected boolean aBoolean196 = true;

	@OriginalMember(owner = "client!BTXFPMEV", name = "G", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!BTXFPMEV", name = "H", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!BTXFPMEV", name = "a", descriptor = "(III)V")
	protected final void method568() {
		try {
			this.anInt824 = 765;
			this.anInt825 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, -24362, this.anInt825, this.anInt824);
			this.aGraphics2 = this.method578(this.aByte53).getGraphics();
			this.aClass7_2 = new Class7(this.anInt824, this.method578(this.aByte53), this.anInt825, 912);
			this.method579(this, 1);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("71548, " + 503 + ", " + 765 + ", " + 0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "a", descriptor = "(ZII)V")
	protected final void method569() {
		try {
			this.anInt824 = 765;
			this.anInt825 = 503;
			this.aGraphics2 = this.method578(this.aByte53).getGraphics();
			this.aClass7_2 = new Class7(this.anInt824, this.method578(this.aByte53), this.anInt825, 912);
			this.method579(this, 1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("86844, " + true + ", " + 503 + ", " + 765 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method578(this.aByte53).addMouseListener(this);
		this.method578(this.aByte53).addMouseMotionListener(this);
		this.method578(this.aByte53).addKeyListener(this);
		this.method578(this.aByte53).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method580("Loading...", 0, (byte) 3);
		this.method573();
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
				if (this.anInt820 < 0) {
					if (this.anInt820 == -1) {
						this.method570();
					}
					return;
				}
				if (this.anInt820 > 0) {
					this.anInt820--;
					if (this.anInt820 == 0) {
						this.method570();
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
					local43 = (int) ((long) (this.anInt821 * 2560) / (local64 - this.aLongArray2[local41]));
				}
				if (local43 < 25) {
					local43 = 25;
				}
				if (local43 > 256) {
					local43 = 256;
					local45 = (int) ((long) this.anInt821 - (local64 - this.aLongArray2[local41]) / 10L);
				}
				if (local45 > this.anInt821) {
					local45 = this.anInt821;
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
				if (local45 < this.anInt822) {
					local45 = this.anInt822;
				}
				try {
					Thread.sleep((long) local45);
				} catch (@Pc(207) InterruptedException local207) {
					local49++;
				}
				while (local47 < 256) {
					this.anInt833 = this.anInt830;
					this.anInt834 = this.anInt831;
					this.anInt835 = this.anInt832;
					this.aLong28 = this.aLong27;
					this.anInt830 = 0;
					this.method574();
					this.anInt836 = this.anInt837;
					local47 += local43;
				}
				local47 &= 0xFF;
				if (this.anInt821 > 0) {
					this.anInt823 = local43 * 1000 / (this.anInt821 * 256);
				}
				this.method576();
			} while (!this.aBoolean194);
			System.out.println("ntime:" + local64);
			for (local173 = 0; local173 < 10; local173++) {
				@Pc(289) int local289 = (local41 + 20 - local173 - 1) % 10;
				System.out.println("otim" + local289 + ":" + this.aLongArray2[local289]);
			}
			System.out.println("fps:" + this.anInt823 + " ratio:" + local43 + " count:" + local47);
			System.out.println("del:" + local45 + " deltime:" + this.anInt821 + " mindel:" + this.anInt822);
			System.out.println("intex:" + local49 + " opos:" + local41);
			this.aBoolean194 = false;
			local49 = 0;
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "a", descriptor = "(I)V")
	private void method570() {
		try {
			this.anInt820 = -2;
			this.method575();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(21) Exception local21) {
				}
				try {
					System.exit(0);
				} catch (@Pc(25) Throwable local25) {
				}
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("69322, " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "a", descriptor = "(II)V")
	protected final void method571() {
		try {
			this.anInt821 = 1000;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("20870, " + 1 + ", " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt820 >= 0) {
			this.anInt820 = 0;
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt820 >= 0) {
			this.anInt820 = 4000 / this.anInt821;
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt820 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt820 == -1) {
			this.method570();
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean195 = true;
		this.method577();
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean195 = true;
		this.method577();
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt826 = 0;
		this.anInt831 = local2;
		this.anInt832 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt830 = 2;
			this.anInt827 = 2;
		} else {
			this.anInt830 = 1;
			this.anInt827 = 1;
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt826 = 0;
		this.anInt827 = 0;
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt826 = 0;
		this.anInt828 = -1;
		this.anInt829 = -1;
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt826 = 0;
		this.anInt828 = local2;
		this.anInt829 = local5;
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt826 = 0;
		this.anInt828 = local2;
		this.anInt829 = local5;
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt826 = 0;
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
			this.anIntArray211[this.anInt837] = local10;
			this.anInt837 = this.anInt837 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt826 = 0;
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

	@OriginalMember(owner = "client!BTXFPMEV", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "b", descriptor = "(I)I")
	protected final int method572() {
		try {
			@Pc(12) int local12 = -1;
			if (this.anInt837 != this.anInt836) {
				local12 = this.anIntArray211[this.anInt836];
				this.anInt836 = this.anInt836 + 1 & 0x7F;
			}
			return local12;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("86247, " + 46308 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean196 = true;
		this.aBoolean195 = true;
		this.method577();
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean196 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "a", descriptor = "()V")
	protected void method573() {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "c", descriptor = "(I)V")
	protected void method574() {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "a", descriptor = "(B)V")
	protected void method575() {
		try {
			if (this.aByte52 == -32) {
				;
			}
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("59864, " + -32 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "d", descriptor = "(I)V")
	protected void method576() {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "e", descriptor = "(I)V")
	protected void method577() {
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "b", descriptor = "(B)Ljava/awt/Component;")
	protected Component method578(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte53) {
				throw new NullPointerException();
			}
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("84569, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method579(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!BTXFPMEV", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	protected void method580(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method578(this.aByte53).getGraphics();
				try {
					this.method578(this.aByte53).repaint();
				} catch (@Pc(23) Exception local23) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(27) Exception local27) {
				}
			}
			@Pc(38) Font local38 = new Font("Helvetica", 1, 13);
			@Pc(45) FontMetrics local45 = this.method578(this.aByte53).getFontMetrics(local38);
			@Pc(52) Font local52 = new Font("Helvetica", 0, 13);
			this.method578(this.aByte53).getFontMetrics(local52);
			if (this.aByte54 != 3) {
				for (@Pc(65) int local65 = 1; local65 > 0; local65++) {
				}
			}
			if (this.aBoolean195) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt824, this.anInt825);
				this.aBoolean195 = false;
			}
			@Pc(96) Color local96 = new Color(140, 17, 17);
			@Pc(103) int local103 = this.anInt825 / 2 - 18;
			this.aGraphics2.setColor(local96);
			this.aGraphics2.drawRect(this.anInt824 / 2 - 152, local103, 304, 34);
			this.aGraphics2.fillRect(this.anInt824 / 2 - 150, local103 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt824 / 2 + arg1 * 3 - 150, local103 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local38);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt824 - local45.stringWidth(arg0)) / 2, local103 + 22);
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("20813, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}
}
