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

@OriginalClass("client!AMZQHNGA")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!AMZQHNGA", name = "f", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!AMZQHNGA", name = "j", descriptor = "I")
	protected int anInt826;

	@OriginalMember(owner = "client!AMZQHNGA", name = "l", descriptor = "I")
	protected int anInt827;

	@OriginalMember(owner = "client!AMZQHNGA", name = "m", descriptor = "I")
	protected int anInt828;

	@OriginalMember(owner = "client!AMZQHNGA", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!AMZQHNGA", name = "o", descriptor = "Lclient!TZRNBMTC;")
	protected Class32 aClass32_2;

	@OriginalMember(owner = "client!AMZQHNGA", name = "q", descriptor = "Lclient!UUMODXDR;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!AMZQHNGA", name = "t", descriptor = "I")
	protected int anInt829;

	@OriginalMember(owner = "client!AMZQHNGA", name = "u", descriptor = "I")
	protected int anInt830;

	@OriginalMember(owner = "client!AMZQHNGA", name = "v", descriptor = "I")
	public int anInt831;

	@OriginalMember(owner = "client!AMZQHNGA", name = "w", descriptor = "I")
	public int anInt832;

	@OriginalMember(owner = "client!AMZQHNGA", name = "x", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!AMZQHNGA", name = "y", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!AMZQHNGA", name = "z", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!AMZQHNGA", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!AMZQHNGA", name = "B", descriptor = "I")
	protected int anInt836;

	@OriginalMember(owner = "client!AMZQHNGA", name = "C", descriptor = "I")
	protected int anInt837;

	@OriginalMember(owner = "client!AMZQHNGA", name = "D", descriptor = "I")
	protected int anInt838;

	@OriginalMember(owner = "client!AMZQHNGA", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!AMZQHNGA", name = "H", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!AMZQHNGA", name = "I", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!AMZQHNGA", name = "a", descriptor = "I")
	private int anInt820 = -401;

	@OriginalMember(owner = "client!AMZQHNGA", name = "b", descriptor = "I")
	private int anInt821 = 8;

	@OriginalMember(owner = "client!AMZQHNGA", name = "c", descriptor = "I")
	private int anInt822 = 263;

	@OriginalMember(owner = "client!AMZQHNGA", name = "d", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!AMZQHNGA", name = "e", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!AMZQHNGA", name = "g", descriptor = "I")
	private int anInt824 = 20;

	@OriginalMember(owner = "client!AMZQHNGA", name = "h", descriptor = "I")
	protected int anInt825 = 1;

	@OriginalMember(owner = "client!AMZQHNGA", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!AMZQHNGA", name = "k", descriptor = "Z")
	protected boolean aBoolean195 = false;

	@OriginalMember(owner = "client!AMZQHNGA", name = "p", descriptor = "[Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2[] aClass3_Sub1_Sub3_Sub2Array3 = new Class3_Sub1_Sub3_Sub2[6];

	@OriginalMember(owner = "client!AMZQHNGA", name = "r", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!AMZQHNGA", name = "s", descriptor = "Z")
	protected boolean aBoolean197 = true;

	@OriginalMember(owner = "client!AMZQHNGA", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!AMZQHNGA", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!AMZQHNGA", name = "a", descriptor = "(III)V")
	protected final void method574(@OriginalArg(2) int arg0) {
		try {
			this.anInt827 = 765;
			this.anInt828 = 503;
			if (arg0 <= 0) {
				this.aBoolean194 = !this.aBoolean194;
			}
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt827, (byte) 6, this, this.anInt828);
			this.aGraphics2 = this.method584((byte) 9).getGraphics();
			this.aClass32_2 = new Class32(this.anInt827, this.method584((byte) 9), this.anInt828, 9);
			this.method585(this, 1);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("34452, " + 765 + ", " + 503 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "b", descriptor = "(III)V")
	protected final void method575(@OriginalArg(2) int arg0) {
		try {
			this.anInt827 = 765;
			@Pc(6) boolean local6 = false;
			this.anInt828 = 503;
			this.aGraphics2 = this.method584((byte) 9).getGraphics();
			this.aClass32_2 = new Class32(this.anInt827, this.method584((byte) 9), this.anInt828, 9);
			this.method585(this, 1);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("84400, " + 503 + ", " + 765 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method584((byte) 9).addMouseListener(this);
		this.method584((byte) 9).addMouseMotionListener(this);
		this.method584((byte) 9).addKeyListener(this);
		this.method584((byte) 9).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method586(0, this.aBoolean193, "Loading...");
		this.method579();
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
				if (this.anInt823 < 0) {
					if (this.anInt823 == -1) {
						this.method576();
					}
					return;
				}
				if (this.anInt823 > 0) {
					this.anInt823--;
					if (this.anInt823 == 0) {
						this.method576();
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
					local40 = (int) ((long) (this.anInt824 * 2560) / (local61 - this.aLongArray2[local38]));
				}
				if (local40 < 25) {
					local40 = 25;
				}
				if (local40 > 256) {
					local40 = 256;
					local42 = (int) ((long) this.anInt824 - (local61 - this.aLongArray2[local38]) / 10L);
				}
				if (local42 > this.anInt824) {
					local42 = this.anInt824;
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
				if (local42 < this.anInt825) {
					local42 = this.anInt825;
				}
				try {
					Thread.sleep((long) local42);
				} catch (@Pc(204) InterruptedException local204) {
					local46++;
				}
				while (local44 < 256) {
					this.anInt836 = this.anInt833;
					this.anInt837 = this.anInt834;
					this.anInt838 = this.anInt835;
					this.aLong28 = this.aLong27;
					this.anInt833 = 0;
					this.method580();
					this.anInt839 = this.anInt840;
					local44 += local40;
				}
				local44 &= 0xFF;
				if (this.anInt824 > 0) {
					this.anInt826 = local40 * 1000 / (this.anInt824 * 256);
				}
				this.method582();
			} while (!this.aBoolean195);
			System.out.println("ntime:" + local61);
			for (local170 = 0; local170 < 10; local170++) {
				@Pc(286) int local286 = (local38 + 20 - local170 - 1) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt826 + " ratio:" + local40 + " count:" + local44);
			System.out.println("del:" + local42 + " deltime:" + this.anInt824 + " mindel:" + this.anInt825);
			System.out.println("intex:" + local46 + " opos:" + local38);
			this.aBoolean195 = false;
			local46 = 0;
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "a", descriptor = "(B)V")
	private void method576() {
		try {
			this.anInt823 = -2;
			this.method581();
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
			signlink.reporterror("80280, " + -119 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "a", descriptor = "(II)V")
	protected final void method577() {
		try {
			this.anInt824 = 1000;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("86482, " + -12882 + ", " + 1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt823 >= 0) {
			this.anInt823 = 0;
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt823 >= 0) {
			this.anInt823 = 4000 / this.anInt824;
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt823 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt823 == -1) {
			this.method576();
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean196 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean196 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt829 = 0;
		this.anInt834 = local2;
		this.anInt835 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt833 = 2;
			this.anInt830 = 2;
		} else {
			this.anInt833 = 1;
			this.anInt830 = 1;
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt829 = 0;
		this.anInt830 = 0;
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt829 = 0;
		this.anInt831 = -1;
		this.anInt832 = -1;
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt829 = 0;
		this.anInt831 = local2;
		this.anInt832 = local5;
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt829 = 0;
		this.anInt831 = local2;
		this.anInt832 = local5;
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt829 = 0;
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
			this.anIntArray211[this.anInt840] = local10;
			this.anInt840 = this.anInt840 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt829 = 0;
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

	@OriginalMember(owner = "client!AMZQHNGA", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "a", descriptor = "(I)I")
	protected final int method578(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != -7597) {
				return this.anInt820;
			}
			@Pc(7) int local7 = -1;
			if (this.anInt840 != this.anInt839) {
				local7 = this.anIntArray211[this.anInt839];
				this.anInt839 = this.anInt839 + 1 & 0x7F;
			}
			return local7;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("1382, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean197 = true;
		this.aBoolean196 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean197 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "a", descriptor = "()V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "a", descriptor = "(Z)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "b", descriptor = "(B)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "c", descriptor = "(B)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "d", descriptor = "(B)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "e", descriptor = "(B)Ljava/awt/Component;")
	protected Component method584(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("60874, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method585(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!AMZQHNGA", name = "a", descriptor = "(IZLjava/lang/String;)V")
	protected void method586(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method584((byte) 9).getGraphics();
				try {
					this.method584((byte) 9).repaint();
				} catch (@Pc(15) Exception local15) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(19) Exception local19) {
				}
			}
			@Pc(30) Font local30 = new Font("Helvetica", 1, 13);
			@Pc(36) FontMetrics local36 = this.method584((byte) 9).getFontMetrics(local30);
			@Pc(43) Font local43 = new Font("Helvetica", 0, 13);
			this.method584((byte) 9).getFontMetrics(local43);
			if (this.aBoolean196) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt827, this.anInt828);
				this.aBoolean196 = false;
			}
			@Pc(75) Color local75 = new Color(140, 17, 17);
			@Pc(82) int local82 = this.anInt828 / 2 - 18;
			this.aGraphics2.setColor(local75);
			this.aGraphics2.drawRect(this.anInt827 / 2 - 152, local82, 304, 34);
			if (!arg1) {
				this.aGraphics2.fillRect(this.anInt827 / 2 - 150, local82 + 2, arg0 * 3, 30);
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(this.anInt827 / 2 + arg0 * 3 - 150, local82 + 2, 300 - arg0 * 3, 30);
				this.aGraphics2.setFont(local30);
				this.aGraphics2.setColor(Color.white);
				this.aGraphics2.drawString(arg2, (this.anInt827 - local36.stringWidth(arg2)) / 2, local82 + 22);
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("28998, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}
}
