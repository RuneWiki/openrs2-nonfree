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

@OriginalClass("client!SXKUAOFD")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!SXKUAOFD", name = "b", descriptor = "I")
	private int anInt807;

	@OriginalMember(owner = "client!SXKUAOFD", name = "d", descriptor = "I")
	private int anInt809;

	@OriginalMember(owner = "client!SXKUAOFD", name = "f", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!SXKUAOFD", name = "j", descriptor = "I")
	protected int anInt813;

	@OriginalMember(owner = "client!SXKUAOFD", name = "l", descriptor = "I")
	protected int anInt814;

	@OriginalMember(owner = "client!SXKUAOFD", name = "m", descriptor = "I")
	protected int anInt815;

	@OriginalMember(owner = "client!SXKUAOFD", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!SXKUAOFD", name = "o", descriptor = "Lclient!ZTWZAULT;")
	protected Class49 aClass49_2;

	@OriginalMember(owner = "client!SXKUAOFD", name = "q", descriptor = "Lclient!SZXWXMTH;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!SXKUAOFD", name = "t", descriptor = "I")
	protected int anInt816;

	@OriginalMember(owner = "client!SXKUAOFD", name = "u", descriptor = "I")
	protected int anInt817;

	@OriginalMember(owner = "client!SXKUAOFD", name = "v", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!SXKUAOFD", name = "w", descriptor = "I")
	public int anInt819;

	@OriginalMember(owner = "client!SXKUAOFD", name = "x", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!SXKUAOFD", name = "y", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!SXKUAOFD", name = "z", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!SXKUAOFD", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!SXKUAOFD", name = "B", descriptor = "I")
	protected int anInt823;

	@OriginalMember(owner = "client!SXKUAOFD", name = "C", descriptor = "I")
	protected int anInt824;

	@OriginalMember(owner = "client!SXKUAOFD", name = "D", descriptor = "I")
	protected int anInt825;

	@OriginalMember(owner = "client!SXKUAOFD", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!SXKUAOFD", name = "H", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!SXKUAOFD", name = "I", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!SXKUAOFD", name = "c", descriptor = "I")
	private int anInt808 = -347;

	@OriginalMember(owner = "client!SXKUAOFD", name = "e", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!SXKUAOFD", name = "g", descriptor = "I")
	private int anInt811 = 20;

	@OriginalMember(owner = "client!SXKUAOFD", name = "h", descriptor = "I")
	protected int anInt812 = 1;

	@OriginalMember(owner = "client!SXKUAOFD", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!SXKUAOFD", name = "k", descriptor = "Z")
	protected boolean aBoolean215 = false;

	@OriginalMember(owner = "client!SXKUAOFD", name = "p", descriptor = "[Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array3 = new Class2_Sub1_Sub3_Sub2[6];

	@OriginalMember(owner = "client!SXKUAOFD", name = "r", descriptor = "Z")
	private boolean aBoolean216 = true;

	@OriginalMember(owner = "client!SXKUAOFD", name = "s", descriptor = "Z")
	protected boolean aBoolean217 = true;

	@OriginalMember(owner = "client!SXKUAOFD", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!SXKUAOFD", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(III)V")
	protected final void method574() {
		try {
			this.anInt814 = 765;
			this.anInt815 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt815, 0, this.anInt814, this);
			this.aGraphics2 = this.method584().getGraphics();
			this.aClass49_2 = new Class49(this.anInt809, this.method584(), this.anInt814, this.anInt815);
			this.method585(this, 1);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("9085, " + 765 + ", " + 503 + ", " + 312 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "b", descriptor = "(III)V")
	protected final void method575(@OriginalArg(0) int arg0) {
		try {
			this.anInt814 = 765;
			this.anInt815 = 503;
			if (arg0 == 0) {
				this.aGraphics2 = this.method584().getGraphics();
				this.aClass49_2 = new Class49(this.anInt809, this.method584(), this.anInt814, this.anInt815);
				this.method585(this, 1);
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("98335, " + arg0 + ", " + 765 + ", " + 503 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "run", descriptor = "()V")
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
			@Pc(169) int local169;
			do {
				if (this.anInt810 < 0) {
					if (this.anInt810 == -1) {
						this.method576();
					}
					return;
				}
				if (this.anInt810 > 0) {
					this.anInt810--;
					if (this.anInt810 == 0) {
						this.method576();
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
					local39 = (int) ((long) (this.anInt811 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt811 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt811) {
					local41 = this.anInt811;
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
				if (local41 < this.anInt812) {
					local41 = this.anInt812;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt823 = this.anInt820;
					this.anInt824 = this.anInt821;
					this.anInt825 = this.anInt822;
					this.aLong28 = this.aLong27;
					this.anInt820 = 0;
					this.method580();
					this.anInt826 = this.anInt827;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt811 > 0) {
					this.anInt813 = local39 * 1000 / (this.anInt811 * 256);
				}
				this.method582();
			} while (!this.aBoolean215);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt813 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt811 + " mindel:" + this.anInt812);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean215 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(I)V")
	private void method576() {
		try {
			this.anInt810 = -2;
			this.method581();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
				try {
					System.exit(0);
				} catch (@Pc(29) Throwable local29) {
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("18933, " + -95 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(ZI)V")
	protected final void method577() {
		try {
			this.anInt811 = 1000;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("83209, " + true + ", " + 1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt810 >= 0) {
			this.anInt810 = 0;
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt810 >= 0) {
			this.anInt810 = 4000 / this.anInt811;
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt810 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt810 == -1) {
			this.method576();
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean216 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean216 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt816 = 0;
		this.anInt821 = local2;
		this.anInt822 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt820 = 2;
			this.anInt817 = 2;
		} else {
			this.anInt820 = 1;
			this.anInt817 = 1;
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt816 = 0;
		this.anInt817 = 0;
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt816 = 0;
		this.anInt818 = -1;
		this.anInt819 = -1;
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt816 = 0;
		this.anInt818 = local2;
		this.anInt819 = local5;
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt816 = 0;
		this.anInt818 = local2;
		this.anInt819 = local5;
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt816 = 0;
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
			this.anIntArray211[this.anInt827] = local10;
			this.anInt827 = this.anInt827 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt816 = 0;
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

	@OriginalMember(owner = "client!SXKUAOFD", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(Z)I")
	protected final int method578() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt827 != this.anInt826) {
				local1 = this.anIntArray211[this.anInt826];
				this.anInt826 = this.anInt826 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("8354, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean217 = true;
		this.aBoolean216 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean217 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "()V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "b", descriptor = "(Z)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "c", descriptor = "(Z)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "b", descriptor = "(I)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "c", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "d", descriptor = "(I)Ljava/awt/Component;")
	protected Component method584() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("76151, " + -319 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method585(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	protected void method586(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			if (this.aBoolean216) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt814, this.anInt815);
				this.aBoolean216 = false;
			}
			@Pc(87) Color local87 = new Color(140, 17, 17);
			@Pc(94) int local94 = this.anInt815 / 2 - 18;
			this.aGraphics2.setColor(local87);
			this.aGraphics2.drawRect(this.anInt814 / 2 - 152, local94, 304, 34);
			this.aGraphics2.fillRect(this.anInt814 / 2 - 150, local94 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt814 / 2 + arg1 * 3 - 150, local94 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt814 - local42.stringWidth(arg0)) / 2, local94 + 22);
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("94151, " + arg0 + ", " + arg1 + ", " + 108 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}
}
