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

@OriginalClass("client!PXJVLLTT")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!PXJVLLTT", name = "e", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!PXJVLLTT", name = "i", descriptor = "I")
	protected int anInt813;

	@OriginalMember(owner = "client!PXJVLLTT", name = "k", descriptor = "I")
	protected int anInt814;

	@OriginalMember(owner = "client!PXJVLLTT", name = "l", descriptor = "I")
	protected int anInt815;

	@OriginalMember(owner = "client!PXJVLLTT", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!PXJVLLTT", name = "n", descriptor = "Lclient!BEVLZSVU;")
	protected Class6 aClass6_2;

	@OriginalMember(owner = "client!PXJVLLTT", name = "p", descriptor = "Lclient!RBKIQEVU;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!PXJVLLTT", name = "s", descriptor = "I")
	protected int anInt816;

	@OriginalMember(owner = "client!PXJVLLTT", name = "t", descriptor = "I")
	protected int anInt817;

	@OriginalMember(owner = "client!PXJVLLTT", name = "u", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!PXJVLLTT", name = "v", descriptor = "I")
	public int anInt819;

	@OriginalMember(owner = "client!PXJVLLTT", name = "w", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!PXJVLLTT", name = "x", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!PXJVLLTT", name = "y", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!PXJVLLTT", name = "z", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!PXJVLLTT", name = "A", descriptor = "I")
	protected int anInt823;

	@OriginalMember(owner = "client!PXJVLLTT", name = "B", descriptor = "I")
	protected int anInt824;

	@OriginalMember(owner = "client!PXJVLLTT", name = "C", descriptor = "I")
	protected int anInt825;

	@OriginalMember(owner = "client!PXJVLLTT", name = "D", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!PXJVLLTT", name = "G", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!PXJVLLTT", name = "H", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!PXJVLLTT", name = "a", descriptor = "I")
	private int anInt808 = -9522;

	@OriginalMember(owner = "client!PXJVLLTT", name = "b", descriptor = "I")
	private int anInt809 = 44758;

	@OriginalMember(owner = "client!PXJVLLTT", name = "c", descriptor = "B")
	private byte aByte21 = 6;

	@OriginalMember(owner = "client!PXJVLLTT", name = "d", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!PXJVLLTT", name = "f", descriptor = "I")
	private int anInt811 = 20;

	@OriginalMember(owner = "client!PXJVLLTT", name = "g", descriptor = "I")
	protected int anInt812 = 1;

	@OriginalMember(owner = "client!PXJVLLTT", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!PXJVLLTT", name = "j", descriptor = "Z")
	protected boolean aBoolean211 = false;

	@OriginalMember(owner = "client!PXJVLLTT", name = "o", descriptor = "[Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3[] aClass5_Sub1_Sub1_Sub3Array3 = new Class5_Sub1_Sub1_Sub3[6];

	@OriginalMember(owner = "client!PXJVLLTT", name = "q", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!PXJVLLTT", name = "r", descriptor = "Z")
	protected boolean aBoolean213 = true;

	@OriginalMember(owner = "client!PXJVLLTT", name = "E", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!PXJVLLTT", name = "F", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!PXJVLLTT", name = "a", descriptor = "(III)V")
	protected final void method573(@OriginalArg(1) int arg0) {
		try {
			this.anInt814 = 765;
			this.anInt815 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1((byte) 6, this, this.anInt814, this.anInt815);
			this.aGraphics2 = this.method583().getGraphics();
			this.aClass6_2 = new Class6(this.anInt815, this.anInt814, this.method583(), false);
			this.method584(this, 1);
			@Pc(43) boolean local43 = false;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("31666, " + 503 + ", " + arg0 + ", " + 765 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "a", descriptor = "(IBI)V")
	protected final void method574() {
		try {
			if (this.aByte21 != 6) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			this.anInt814 = 765;
			this.anInt815 = 503;
			this.aGraphics2 = this.method583().getGraphics();
			this.aClass6_2 = new Class6(this.anInt815, this.anInt814, this.method583(), false);
			this.method584(this, 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("73567, " + 765 + ", " + 6 + ", " + 503 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method583().addMouseListener(this);
		this.method583().addMouseMotionListener(this);
		this.method583().addKeyListener(this);
		this.method583().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method585("Loading...", 0);
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
				if (this.anInt810 < 0) {
					if (this.anInt810 == -1) {
						this.method575();
					}
					return;
				}
				if (this.anInt810 > 0) {
					this.anInt810--;
					if (this.anInt810 == 0) {
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
					this.method579();
					this.anInt826 = this.anInt827;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt811 > 0) {
					this.anInt813 = local39 * 1000 / (this.anInt811 * 256);
				}
				this.method581();
			} while (!this.aBoolean211);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt813 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt811 + " mindel:" + this.anInt812);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean211 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "a", descriptor = "(Z)V")
	private void method575() {
		try {
			this.anInt810 = -2;
			this.method580();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(15) Exception local15) {
				}
				try {
					System.exit(0);
				} catch (@Pc(19) Throwable local19) {
				}
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("18200, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "a", descriptor = "(BI)V")
	protected final void method576() {
		try {
			this.anInt811 = 1000;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("81957, " + 2 + ", " + 1 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt810 >= 0) {
			this.anInt810 = 0;
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt810 >= 0) {
			this.anInt810 = 4000 / this.anInt811;
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt810 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt810 == -1) {
			this.method575();
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean212 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean212 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!PXJVLLTT", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt816 = 0;
		this.anInt817 = 0;
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt816 = 0;
		this.anInt818 = -1;
		this.anInt819 = -1;
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!PXJVLLTT", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!PXJVLLTT", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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

	@OriginalMember(owner = "client!PXJVLLTT", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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

	@OriginalMember(owner = "client!PXJVLLTT", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "b", descriptor = "(Z)I")
	protected final int method577() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt827 != this.anInt826) {
				local1 = this.anIntArray211[this.anInt826];
				this.anInt826 = this.anInt826 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("35964, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean213 = true;
		this.aBoolean212 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean213 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "a", descriptor = "()V")
	protected void method578() {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "a", descriptor = "(I)V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "b", descriptor = "(I)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "c", descriptor = "(I)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "c", descriptor = "(Z)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "d", descriptor = "(I)Ljava/awt/Component;")
	protected Component method583() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("72826, " + 9 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method584(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!PXJVLLTT", name = "a", descriptor = "(Ljava/lang/String;II)V")
	protected void method585(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
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
			if (this.aBoolean212) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt814, this.anInt815);
				this.aBoolean212 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt815 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt814 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt814 / 2 - 150, local88 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt814 / 2 + arg1 * 3 - 150, local88 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt814 - local42.stringWidth(arg0)) / 2, local88 + 22);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("93549, " + arg0 + ", " + -460 + ", " + arg1 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}
}
