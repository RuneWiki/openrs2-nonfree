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

@OriginalClass("client!OFXQYNOM")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!OFXQYNOM", name = "b", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!OFXQYNOM", name = "e", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!OFXQYNOM", name = "i", descriptor = "I")
	protected int anInt830;

	@OriginalMember(owner = "client!OFXQYNOM", name = "k", descriptor = "I")
	protected int anInt831;

	@OriginalMember(owner = "client!OFXQYNOM", name = "l", descriptor = "I")
	protected int anInt832;

	@OriginalMember(owner = "client!OFXQYNOM", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!OFXQYNOM", name = "n", descriptor = "Lclient!MVSFNVJP;")
	protected Class25 aClass25_2;

	@OriginalMember(owner = "client!OFXQYNOM", name = "p", descriptor = "Lclient!JYOWNEXJ;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!OFXQYNOM", name = "s", descriptor = "I")
	protected int anInt833;

	@OriginalMember(owner = "client!OFXQYNOM", name = "t", descriptor = "I")
	protected int anInt834;

	@OriginalMember(owner = "client!OFXQYNOM", name = "u", descriptor = "I")
	public int anInt835;

	@OriginalMember(owner = "client!OFXQYNOM", name = "v", descriptor = "I")
	public int anInt836;

	@OriginalMember(owner = "client!OFXQYNOM", name = "w", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!OFXQYNOM", name = "x", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!OFXQYNOM", name = "y", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!OFXQYNOM", name = "z", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!OFXQYNOM", name = "A", descriptor = "I")
	protected int anInt840;

	@OriginalMember(owner = "client!OFXQYNOM", name = "B", descriptor = "I")
	protected int anInt841;

	@OriginalMember(owner = "client!OFXQYNOM", name = "C", descriptor = "I")
	protected int anInt842;

	@OriginalMember(owner = "client!OFXQYNOM", name = "D", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!OFXQYNOM", name = "G", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!OFXQYNOM", name = "H", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "I")
	private int anInt825 = 862;

	@OriginalMember(owner = "client!OFXQYNOM", name = "c", descriptor = "B")
	private byte aByte28 = 5;

	@OriginalMember(owner = "client!OFXQYNOM", name = "d", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!OFXQYNOM", name = "f", descriptor = "I")
	private int anInt828 = 20;

	@OriginalMember(owner = "client!OFXQYNOM", name = "g", descriptor = "I")
	protected int anInt829 = 1;

	@OriginalMember(owner = "client!OFXQYNOM", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!OFXQYNOM", name = "j", descriptor = "Z")
	protected boolean aBoolean212 = false;

	@OriginalMember(owner = "client!OFXQYNOM", name = "o", descriptor = "[Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array3 = new Class4_Sub1_Sub2_Sub3[6];

	@OriginalMember(owner = "client!OFXQYNOM", name = "q", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!OFXQYNOM", name = "r", descriptor = "Z")
	protected boolean aBoolean214 = true;

	@OriginalMember(owner = "client!OFXQYNOM", name = "E", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!OFXQYNOM", name = "F", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "(BII)V")
	protected final void method573() {
		try {
			this.anInt831 = 765;
			this.anInt832 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt831, this, this.anInt832, 9);
			this.aGraphics2 = this.method583().getGraphics();
			this.aClass25_2 = new Class25(this.method583(), this.anInt832, this.anInt831, 284);
			this.method584(this, 1);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("69667, " + 80 + ", " + 503 + ", " + 765 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "(IIB)V")
	protected final void method574() {
		try {
			this.anInt831 = 765;
			this.anInt832 = 503;
			this.aGraphics2 = this.method583().getGraphics();
			this.aClass25_2 = new Class25(this.method583(), this.anInt832, this.anInt831, 284);
			this.method584(this, 1);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("84388, " + 765 + ", " + 503 + ", " + 57 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method583().addMouseListener(this);
		this.method583().addMouseMotionListener(this);
		this.method583().addKeyListener(this);
		this.method583().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method585(53, "Loading...", 0);
		this.method578();
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
				if (this.anInt827 < 0) {
					if (this.anInt827 == -1) {
						this.method575();
					}
					return;
				}
				if (this.anInt827 > 0) {
					this.anInt827--;
					if (this.anInt827 == 0) {
						this.method575();
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
					local39 = (int) ((long) (this.anInt828 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt828 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt828) {
					local41 = this.anInt828;
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
				if (local41 < this.anInt829) {
					local41 = this.anInt829;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt840 = this.anInt837;
					this.anInt841 = this.anInt838;
					this.anInt842 = this.anInt839;
					this.aLong28 = this.aLong27;
					this.anInt837 = 0;
					this.method579();
					this.anInt843 = this.anInt844;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt828 > 0) {
					this.anInt830 = local39 * 1000 / (this.anInt828 * 256);
				}
				this.method581();
			} while (!this.aBoolean212);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt830 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt828 + " mindel:" + this.anInt829);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean212 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "(I)V")
	private void method575() {
		try {
			this.anInt827 = -2;
			this.method580((byte) 8);
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
			signlink.reporterror("44450, " + 807 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "(IZ)V")
	protected final void method576() {
		try {
			this.anInt828 = 1000;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("98501, " + 1 + ", " + true + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt827 >= 0) {
			this.anInt827 = 0;
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt827 >= 0) {
			this.anInt827 = 4000 / this.anInt828;
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt827 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt827 == -1) {
			this.method575();
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean213 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean213 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt833 = 0;
		this.anInt838 = local2;
		this.anInt839 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt837 = 2;
			this.anInt834 = 2;
		} else {
			this.anInt837 = 1;
			this.anInt834 = 1;
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt833 = 0;
		this.anInt834 = 0;
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt833 = 0;
		this.anInt835 = -1;
		this.anInt836 = -1;
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt833 = 0;
		this.anInt835 = local2;
		this.anInt836 = local5;
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt833 = 0;
		this.anInt835 = local2;
		this.anInt836 = local5;
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt833 = 0;
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
			this.anIntArray211[this.anInt844] = local10;
			this.anInt844 = this.anInt844 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt833 = 0;
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

	@OriginalMember(owner = "client!OFXQYNOM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "(Z)I")
	protected final int method577() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt844 != this.anInt843) {
				local1 = this.anIntArray211[this.anInt843];
				this.anInt843 = this.anInt843 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("76640, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean214 = true;
		this.aBoolean213 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean214 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "()V")
	protected void method578() {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "b", descriptor = "(I)V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "(B)V")
	protected void method580(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("34024, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "c", descriptor = "(I)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "d", descriptor = "(I)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	protected Component method583() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("57507, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method584(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!OFXQYNOM", name = "a", descriptor = "(ILjava/lang/String;I)V")
	protected void method585(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method583().getGraphics();
				try {
					this.method583().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method583().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method583().getFontMetrics(local49);
			if (this.aBoolean213) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt831, this.anInt832);
				this.aBoolean213 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(85) boolean local85 = false;
			@Pc(92) int local92 = this.anInt832 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt831 / 2 - 152, local92, 304, 34);
			this.aGraphics2.fillRect(this.anInt831 / 2 - 150, local92 + 2, arg2 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt831 / 2 + arg2 * 3 - 150, local92 + 2, 300 - arg2 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt831 - local42.stringWidth(arg1)) / 2, local92 + 22);
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("73691, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}
}
