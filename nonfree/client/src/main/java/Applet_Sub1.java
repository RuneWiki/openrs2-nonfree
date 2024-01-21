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

@OriginalClass("client!VTYHSWDE")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!VTYHSWDE", name = "e", descriptor = "I")
	private int anInt805;

	@OriginalMember(owner = "client!VTYHSWDE", name = "i", descriptor = "I")
	protected int anInt808;

	@OriginalMember(owner = "client!VTYHSWDE", name = "k", descriptor = "I")
	protected int anInt809;

	@OriginalMember(owner = "client!VTYHSWDE", name = "l", descriptor = "I")
	protected int anInt810;

	@OriginalMember(owner = "client!VTYHSWDE", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!VTYHSWDE", name = "n", descriptor = "Lclient!KJGJRATW;")
	protected Class18 aClass18_2;

	@OriginalMember(owner = "client!VTYHSWDE", name = "p", descriptor = "Lclient!WSQCMTWN;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!VTYHSWDE", name = "s", descriptor = "I")
	protected int anInt811;

	@OriginalMember(owner = "client!VTYHSWDE", name = "t", descriptor = "I")
	protected int anInt812;

	@OriginalMember(owner = "client!VTYHSWDE", name = "u", descriptor = "I")
	public int anInt813;

	@OriginalMember(owner = "client!VTYHSWDE", name = "v", descriptor = "I")
	public int anInt814;

	@OriginalMember(owner = "client!VTYHSWDE", name = "w", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!VTYHSWDE", name = "x", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!VTYHSWDE", name = "y", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!VTYHSWDE", name = "z", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!VTYHSWDE", name = "A", descriptor = "I")
	protected int anInt818;

	@OriginalMember(owner = "client!VTYHSWDE", name = "B", descriptor = "I")
	protected int anInt819;

	@OriginalMember(owner = "client!VTYHSWDE", name = "C", descriptor = "I")
	protected int anInt820;

	@OriginalMember(owner = "client!VTYHSWDE", name = "D", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!VTYHSWDE", name = "G", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!VTYHSWDE", name = "H", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "I")
	private int anInt803 = -985;

	@OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!VTYHSWDE", name = "c", descriptor = "I")
	private int anInt804 = -35754;

	@OriginalMember(owner = "client!VTYHSWDE", name = "d", descriptor = "Z")
	private boolean aBoolean190 = true;

	@OriginalMember(owner = "client!VTYHSWDE", name = "f", descriptor = "I")
	private int anInt806 = 20;

	@OriginalMember(owner = "client!VTYHSWDE", name = "g", descriptor = "I")
	protected int anInt807 = 1;

	@OriginalMember(owner = "client!VTYHSWDE", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!VTYHSWDE", name = "j", descriptor = "Z")
	protected boolean aBoolean191 = false;

	@OriginalMember(owner = "client!VTYHSWDE", name = "o", descriptor = "[Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array3 = new Class1_Sub1_Sub2_Sub1[6];

	@OriginalMember(owner = "client!VTYHSWDE", name = "q", descriptor = "Z")
	private boolean aBoolean192 = true;

	@OriginalMember(owner = "client!VTYHSWDE", name = "r", descriptor = "Z")
	protected boolean aBoolean193 = true;

	@OriginalMember(owner = "client!VTYHSWDE", name = "E", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!VTYHSWDE", name = "F", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(III)V")
	protected final void method572() {
		try {
			this.anInt809 = 765;
			this.anInt810 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1((byte) 39, this.anInt810, this, this.anInt809);
			this.aGraphics2 = this.method582(523).getGraphics();
			this.aClass18_2 = new Class18(this.method582(523), 0, this.anInt809, this.anInt810);
			this.method583(this, 1);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("35164, " + 765 + ", " + 0 + ", " + 503 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "(III)V")
	protected final void method573() {
		try {
			this.anInt809 = 765;
			this.anInt810 = 503;
			this.aGraphics2 = this.method582(523).getGraphics();
			this.aClass18_2 = new Class18(this.method582(523), 0, this.anInt809, this.anInt810);
			this.method583(this, 1);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("88606, " + 765 + ", " + 503 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method582(523).addMouseListener(this);
		this.method582(523).addMouseMotionListener(this);
		this.method582(523).addKeyListener(this);
		this.method582(523).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method584(0, "Loading...");
		this.method577();
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
				if (this.anInt805 < 0) {
					if (this.anInt805 == -1) {
						this.method574();
					}
					return;
				}
				if (this.anInt805 > 0) {
					this.anInt805--;
					if (this.anInt805 == 0) {
						this.method574();
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
					local39 = (int) ((long) (this.anInt806 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt806 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt806) {
					local41 = this.anInt806;
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
				if (local41 < this.anInt807) {
					local41 = this.anInt807;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt818 = this.anInt815;
					this.anInt819 = this.anInt816;
					this.anInt820 = this.anInt817;
					this.aLong28 = this.aLong27;
					this.anInt815 = 0;
					this.method578();
					this.anInt821 = this.anInt822;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt806 > 0) {
					this.anInt808 = local39 * 1000 / (this.anInt806 * 256);
				}
				this.method580();
			} while (!this.aBoolean191);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt808 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt806 + " mindel:" + this.anInt807);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean191 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(B)V")
	private void method574() {
		try {
			this.anInt805 = -2;
			this.method579();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(16) Exception local16) {
				}
				try {
					System.exit(0);
				} catch (@Pc(20) Throwable local20) {
				}
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("32822, " + -66 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(II)V")
	protected final void method575() {
		try {
			this.anInt806 = 1000;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("42357, " + 1 + ", " + 45200 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt805 >= 0) {
			this.anInt805 = 0;
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt805 >= 0) {
			this.anInt805 = 4000 / this.anInt806;
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt805 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt805 == -1) {
			this.method574();
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean192 = true;
		this.method581();
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean192 = true;
		this.method581();
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt811 = 0;
		this.anInt816 = local2;
		this.anInt817 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt815 = 2;
			this.anInt812 = 2;
		} else {
			this.anInt815 = 1;
			this.anInt812 = 1;
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt811 = 0;
		this.anInt812 = 0;
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt811 = 0;
		this.anInt813 = -1;
		this.anInt814 = -1;
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt811 = 0;
		this.anInt813 = local2;
		this.anInt814 = local5;
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt811 = 0;
		this.anInt813 = local2;
		this.anInt814 = local5;
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt811 = 0;
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
			this.anIntArray211[this.anInt822] = local10;
			this.anInt822 = this.anInt822 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt811 = 0;
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

	@OriginalMember(owner = "client!VTYHSWDE", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(I)I")
	protected final int method576() {
		try {
			@Pc(8) int local8 = -1;
			if (this.anInt822 != this.anInt821) {
				local8 = this.anIntArray211[this.anInt821];
				this.anInt821 = this.anInt821 + 1 & 0x7F;
			}
			return local8;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("80269, " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean193 = true;
		this.aBoolean192 = true;
		this.method581();
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean193 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "()V")
	protected void method577() {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(Z)V")
	protected void method578() {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "(B)V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "(Z)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "(I)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "c", descriptor = "(I)Ljava/awt/Component;")
	protected Component method582(@OriginalArg(0) int arg0) {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("57624, " + 523 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method583(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(ZILjava/lang/String;)V")
	protected void method584(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method582(523).getGraphics();
				try {
					this.method582(523).repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method582(523).getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method582(523).getFontMetrics(local49);
			if (this.aBoolean192) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt809, this.anInt810);
				this.aBoolean192 = false;
			}
			@Pc(91) Color local91 = new Color(140, 17, 17);
			@Pc(98) int local98 = this.anInt810 / 2 - 18;
			this.aGraphics2.setColor(local91);
			this.aGraphics2.drawRect(this.anInt809 / 2 - 152, local98, 304, 34);
			this.aGraphics2.fillRect(this.anInt809 / 2 - 150, local98 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt809 / 2 + arg0 * 3 - 150, local98 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt809 - local42.stringWidth(arg1)) / 2, local98 + 22);
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("5286, " + true + ", " + arg0 + ", " + arg1 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}
}
