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

@OriginalClass("client!HJHAUOBE")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!HJHAUOBE", name = "f", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!HJHAUOBE", name = "j", descriptor = "I")
	protected int anInt809;

	@OriginalMember(owner = "client!HJHAUOBE", name = "l", descriptor = "I")
	protected int anInt810;

	@OriginalMember(owner = "client!HJHAUOBE", name = "m", descriptor = "I")
	protected int anInt811;

	@OriginalMember(owner = "client!HJHAUOBE", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!HJHAUOBE", name = "o", descriptor = "Lclient!DRNBRPSO;")
	protected Class8 aClass8_2;

	@OriginalMember(owner = "client!HJHAUOBE", name = "q", descriptor = "Lclient!BXWMHFQK;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!HJHAUOBE", name = "t", descriptor = "I")
	protected int anInt812;

	@OriginalMember(owner = "client!HJHAUOBE", name = "u", descriptor = "I")
	protected int anInt813;

	@OriginalMember(owner = "client!HJHAUOBE", name = "v", descriptor = "I")
	public int anInt814;

	@OriginalMember(owner = "client!HJHAUOBE", name = "w", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!HJHAUOBE", name = "x", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!HJHAUOBE", name = "y", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!HJHAUOBE", name = "z", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!HJHAUOBE", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!HJHAUOBE", name = "B", descriptor = "I")
	protected int anInt819;

	@OriginalMember(owner = "client!HJHAUOBE", name = "C", descriptor = "I")
	protected int anInt820;

	@OriginalMember(owner = "client!HJHAUOBE", name = "D", descriptor = "I")
	protected int anInt821;

	@OriginalMember(owner = "client!HJHAUOBE", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!HJHAUOBE", name = "H", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!HJHAUOBE", name = "I", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "I")
	private int anInt803 = 339;

	@OriginalMember(owner = "client!HJHAUOBE", name = "b", descriptor = "I")
	private int anInt804 = 3;

	@OriginalMember(owner = "client!HJHAUOBE", name = "c", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!HJHAUOBE", name = "d", descriptor = "Z")
	private boolean aBoolean207 = true;

	@OriginalMember(owner = "client!HJHAUOBE", name = "e", descriptor = "I")
	private int anInt805 = 33560;

	@OriginalMember(owner = "client!HJHAUOBE", name = "g", descriptor = "I")
	private int anInt807 = 20;

	@OriginalMember(owner = "client!HJHAUOBE", name = "h", descriptor = "I")
	protected int anInt808 = 1;

	@OriginalMember(owner = "client!HJHAUOBE", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!HJHAUOBE", name = "k", descriptor = "Z")
	protected boolean aBoolean208 = false;

	@OriginalMember(owner = "client!HJHAUOBE", name = "p", descriptor = "[Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3[] aClass6_Sub1_Sub3_Sub3Array3 = new Class6_Sub1_Sub3_Sub3[6];

	@OriginalMember(owner = "client!HJHAUOBE", name = "r", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!HJHAUOBE", name = "s", descriptor = "Z")
	protected boolean aBoolean210 = true;

	@OriginalMember(owner = "client!HJHAUOBE", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!HJHAUOBE", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(III)V")
	protected final void method574() {
		try {
			this.anInt810 = 765;
			this.anInt811 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt810, this.anInt811, false, this);
			this.aGraphics2 = this.method584().getGraphics();
			this.aClass8_2 = new Class8(this.anInt811, this.anInt810, this.method584(), 384);
			this.method585(this, 1);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("35529, " + 765 + ", " + 503 + ", " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "b", descriptor = "(III)V")
	protected final void method575() {
		try {
			this.anInt810 = 765;
			this.anInt811 = 503;
			this.aGraphics2 = this.method584().getGraphics();
			this.aClass8_2 = new Class8(this.anInt811, this.anInt810, this.method584(), 384);
			this.method585(this, 1);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("19856, " + 503 + ", " + 45241 + ", " + 765 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method584().addMouseListener(this);
		this.method584().addMouseMotionListener(this);
		this.method584().addKeyListener(this);
		this.method584().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method586("Loading...", 0);
		this.method579();
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
				if (this.anInt806 < 0) {
					if (this.anInt806 == -1) {
						this.method576(this.anInt803);
					}
					return;
				}
				if (this.anInt806 > 0) {
					this.anInt806--;
					if (this.anInt806 == 0) {
						this.method576(this.anInt803);
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
					local39 = (int) ((long) (2560 * this.anInt807) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt807 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt807) {
					local41 = this.anInt807;
				}
				this.aLongArray2[local37] = local60;
				local37 = (local37 + 1) % 10;
				if (local41 > 1) {
					for (local170 = 0; local170 < 10; local170++) {
						if (this.aLongArray2[local170] != 0L) {
							this.aLongArray2[local170] += (long) local41;
						}
					}
				}
				if (local41 < this.anInt808) {
					local41 = this.anInt808;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(204) InterruptedException local204) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt819 = this.anInt816;
					this.anInt820 = this.anInt817;
					this.anInt821 = this.anInt818;
					this.aLong28 = this.aLong27;
					this.anInt816 = 0;
					this.method580();
					this.anInt822 = this.anInt823;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt807 > 0) {
					this.anInt809 = 1000 * local39 / (this.anInt807 * 256);
				}
				this.method582((byte) 2);
			} while (!this.aBoolean208);
			System.out.println("ntime:" + local60);
			for (local170 = 0; local170 < 10; local170++) {
				@Pc(286) int local286 = (local37 - local170 - 1 + 20) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt809 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt807 + " mindel:" + this.anInt808);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean208 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(I)V")
	private void method576(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 30 / arg0;
			this.anInt806 = -2;
			this.method581(this.anInt804);
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
			signlink.reporterror("43630, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(ZI)V")
	protected final void method577() {
		try {
			this.anInt807 = 1000;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("47413, " + false + ", " + 1 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt806 >= 0) {
			this.anInt806 = 0;
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt806 >= 0) {
			this.anInt806 = 4000 / this.anInt807;
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt806 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt806 == -1) {
			this.method576(this.anInt803);
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean209 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean209 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt812 = 0;
		this.anInt817 = local2;
		this.anInt818 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt816 = 2;
			this.anInt813 = 2;
		} else {
			this.anInt816 = 1;
			this.anInt813 = 1;
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt812 = 0;
		this.anInt813 = 0;
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt812 = 0;
		this.anInt814 = -1;
		this.anInt815 = -1;
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt812 = 0;
		this.anInt814 = local2;
		this.anInt815 = local5;
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt812 = 0;
		this.anInt814 = local2;
		this.anInt815 = local5;
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt812 = 0;
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
			local10 = 1008 + local7 - 112;
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
			this.anIntArray211[this.anInt823] = local10;
			this.anInt823 = this.anInt823 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt812 = 0;
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

	@OriginalMember(owner = "client!HJHAUOBE", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "b", descriptor = "(I)I")
	protected final int method578() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt823 != this.anInt822) {
				local1 = this.anIntArray211[this.anInt822];
				this.anInt822 = this.anInt822 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("37687, " + -198 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean210 = true;
		this.aBoolean209 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean210 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "()V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "c", descriptor = "(I)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "d", descriptor = "(I)V")
	protected void method581(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 3 || arg0 > 3) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("57407, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(B)V")
	protected void method582(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("66182, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "e", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "f", descriptor = "(I)Ljava/awt/Component;")
	protected Component method584() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("26637, " + -518 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method585(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	protected void method586(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method584().getGraphics();
				try {
					this.method584().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method584().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method584().getFontMetrics(local49);
			if (this.aBoolean209) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt810, this.anInt811);
				this.aBoolean209 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt811 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt810 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt810 / 2 - 150, local88 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt810 / 2 - 150 + arg1 * 3, local88 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt810 - local42.stringWidth(arg0)) / 2, local88 + 22);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("59324, " + arg0 + ", " + false + ", " + arg1 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}
}
