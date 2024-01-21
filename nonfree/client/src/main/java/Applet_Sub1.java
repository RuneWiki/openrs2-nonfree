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

@OriginalClass("client!AHZQVBFX")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!AHZQVBFX", name = "b", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!AHZQVBFX", name = "f", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!AHZQVBFX", name = "j", descriptor = "I")
	protected int anInt831;

	@OriginalMember(owner = "client!AHZQVBFX", name = "l", descriptor = "I")
	protected int anInt832;

	@OriginalMember(owner = "client!AHZQVBFX", name = "m", descriptor = "I")
	protected int anInt833;

	@OriginalMember(owner = "client!AHZQVBFX", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!AHZQVBFX", name = "o", descriptor = "Lclient!HGHKUVEK;")
	protected Class17 aClass17_2;

	@OriginalMember(owner = "client!AHZQVBFX", name = "q", descriptor = "Lclient!CVFADBZV;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!AHZQVBFX", name = "t", descriptor = "I")
	protected int anInt834;

	@OriginalMember(owner = "client!AHZQVBFX", name = "u", descriptor = "I")
	protected int anInt835;

	@OriginalMember(owner = "client!AHZQVBFX", name = "v", descriptor = "I")
	public int anInt836;

	@OriginalMember(owner = "client!AHZQVBFX", name = "w", descriptor = "I")
	public int anInt837;

	@OriginalMember(owner = "client!AHZQVBFX", name = "x", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!AHZQVBFX", name = "y", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!AHZQVBFX", name = "z", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!AHZQVBFX", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!AHZQVBFX", name = "B", descriptor = "I")
	protected int anInt841;

	@OriginalMember(owner = "client!AHZQVBFX", name = "C", descriptor = "I")
	protected int anInt842;

	@OriginalMember(owner = "client!AHZQVBFX", name = "D", descriptor = "I")
	protected int anInt843;

	@OriginalMember(owner = "client!AHZQVBFX", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!AHZQVBFX", name = "H", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!AHZQVBFX", name = "I", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "I")
	private int anInt826 = -18411;

	@OriginalMember(owner = "client!AHZQVBFX", name = "c", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!AHZQVBFX", name = "d", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!AHZQVBFX", name = "e", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!AHZQVBFX", name = "g", descriptor = "I")
	private int anInt829 = 20;

	@OriginalMember(owner = "client!AHZQVBFX", name = "h", descriptor = "I")
	protected int anInt830 = 1;

	@OriginalMember(owner = "client!AHZQVBFX", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!AHZQVBFX", name = "k", descriptor = "Z")
	protected boolean aBoolean197 = false;

	@OriginalMember(owner = "client!AHZQVBFX", name = "p", descriptor = "[Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1[] aClass3_Sub3_Sub3_Sub1Array3 = new Class3_Sub3_Sub3_Sub1[6];

	@OriginalMember(owner = "client!AHZQVBFX", name = "r", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!AHZQVBFX", name = "s", descriptor = "Z")
	protected boolean aBoolean199 = true;

	@OriginalMember(owner = "client!AHZQVBFX", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!AHZQVBFX", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(III)V")
	protected final void method575(@OriginalArg(2) int arg0) {
		try {
			this.anInt832 = 765;
			this.anInt833 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(-916, this, this.anInt832, this.anInt833);
			@Pc(20) boolean local20 = false;
			this.aGraphics2 = this.method585().getGraphics();
			this.aClass17_2 = new Class17((byte) 9, this.method585(), this.anInt832, this.anInt833);
			this.method586(this, 1);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("68362, " + 765 + ", " + 503 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "b", descriptor = "(III)V")
	protected final void method576() {
		try {
			this.anInt832 = 765;
			this.anInt833 = 503;
			this.aGraphics2 = this.method585().getGraphics();
			this.aClass17_2 = new Class17((byte) 9, this.method585(), this.anInt832, this.anInt833);
			this.method586(this, 1);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("29575, " + 5 + ", " + 503 + ", " + 765 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method585().addMouseListener(this);
		this.method585().addMouseMotionListener(this);
		this.method585().addKeyListener(this);
		this.method585().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method587(0, "Loading...");
		this.method580();
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
				if (this.anInt828 < 0) {
					if (this.anInt828 == -1) {
						this.method577();
					}
					return;
				}
				if (this.anInt828 > 0) {
					this.anInt828--;
					if (this.anInt828 == 0) {
						this.method577();
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
					local39 = (int) ((long) (this.anInt829 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt829 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt829) {
					local41 = this.anInt829;
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
				if (local41 < this.anInt830) {
					local41 = this.anInt830;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt841 = this.anInt838;
					this.anInt842 = this.anInt839;
					this.anInt843 = this.anInt840;
					this.aLong28 = this.aLong27;
					this.anInt838 = 0;
					this.method581();
					this.anInt844 = this.anInt845;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt829 > 0) {
					this.anInt831 = local39 * 1000 / (this.anInt829 * 256);
				}
				this.method583();
			} while (!this.aBoolean197);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt831 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt829 + " mindel:" + this.anInt830);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean197 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(I)V")
	private void method577() {
		try {
			this.anInt828 = -2;
			this.method582(this.anInt827);
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(18) Exception local18) {
				}
				try {
					System.exit(0);
				} catch (@Pc(22) Throwable local22) {
				}
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("8678, " + 603 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(II)V")
	protected final void method578() {
		try {
			this.anInt829 = 1000;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("94408, " + 7121 + ", " + 1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt828 >= 0) {
			this.anInt828 = 0;
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt828 >= 0) {
			this.anInt828 = 4000 / this.anInt829;
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt828 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt828 == -1) {
			this.method577();
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean198 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean198 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt834 = 0;
		this.anInt839 = local2;
		this.anInt840 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt838 = 2;
			this.anInt835 = 2;
		} else {
			this.anInt838 = 1;
			this.anInt835 = 1;
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt834 = 0;
		this.anInt835 = 0;
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt834 = 0;
		this.anInt836 = -1;
		this.anInt837 = -1;
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt834 = 0;
		this.anInt836 = local2;
		this.anInt837 = local5;
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt834 = 0;
		this.anInt836 = local2;
		this.anInt837 = local5;
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt834 = 0;
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
			this.anIntArray211[this.anInt845] = local10;
			this.anInt845 = this.anInt845 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt834 = 0;
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

	@OriginalMember(owner = "client!AHZQVBFX", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "b", descriptor = "(I)I")
	protected final int method579() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt845 != this.anInt844) {
				local1 = this.anIntArray211[this.anInt844];
				this.anInt844 = this.anInt844 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("91905, " + -239 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean199 = true;
		this.aBoolean198 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean199 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "()V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "c", descriptor = "(I)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "d", descriptor = "(I)V")
	protected void method582(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 0) {
				;
			}
		} catch (@Pc(3) RuntimeException local3) {
			signlink.reporterror("89048, " + arg0 + ", " + local3.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "e", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "f", descriptor = "(I)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "g", descriptor = "(I)Ljava/awt/Component;")
	protected Component method585() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("61560, " + 731 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method586(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(ILjava/lang/String;I)V")
	protected void method587(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method585().getGraphics();
				try {
					this.method585().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method585().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method585().getFontMetrics(local49);
			if (this.aBoolean198) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt832, this.anInt833);
				this.aBoolean198 = false;
			}
			@Pc(87) Color local87 = new Color(140, 17, 17);
			@Pc(94) int local94 = this.anInt833 / 2 - 18;
			this.aGraphics2.setColor(local87);
			this.aGraphics2.drawRect(this.anInt832 / 2 - 152, local94, 304, 34);
			this.aGraphics2.fillRect(this.anInt832 / 2 - 150, local94 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt832 / 2 + arg0 * 3 - 150, local94 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt832 - local42.stringWidth(arg1)) / 2, local94 + 22);
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("23342, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}
}
