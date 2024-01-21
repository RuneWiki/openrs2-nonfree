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

@OriginalClass("client!EUDZGBGU")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!EUDZGBGU", name = "f", descriptor = "I")
	private int anInt807;

	@OriginalMember(owner = "client!EUDZGBGU", name = "j", descriptor = "I")
	protected int anInt810;

	@OriginalMember(owner = "client!EUDZGBGU", name = "l", descriptor = "I")
	protected int anInt811;

	@OriginalMember(owner = "client!EUDZGBGU", name = "m", descriptor = "I")
	protected int anInt812;

	@OriginalMember(owner = "client!EUDZGBGU", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!EUDZGBGU", name = "o", descriptor = "Lclient!BVMYRJQC;")
	protected Class10 aClass10_2;

	@OriginalMember(owner = "client!EUDZGBGU", name = "q", descriptor = "Lclient!IUROYOHP;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!EUDZGBGU", name = "t", descriptor = "I")
	protected int anInt813;

	@OriginalMember(owner = "client!EUDZGBGU", name = "u", descriptor = "I")
	protected int anInt814;

	@OriginalMember(owner = "client!EUDZGBGU", name = "v", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!EUDZGBGU", name = "w", descriptor = "I")
	public int anInt816;

	@OriginalMember(owner = "client!EUDZGBGU", name = "x", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!EUDZGBGU", name = "y", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!EUDZGBGU", name = "z", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!EUDZGBGU", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!EUDZGBGU", name = "B", descriptor = "I")
	protected int anInt820;

	@OriginalMember(owner = "client!EUDZGBGU", name = "C", descriptor = "I")
	protected int anInt821;

	@OriginalMember(owner = "client!EUDZGBGU", name = "D", descriptor = "I")
	protected int anInt822;

	@OriginalMember(owner = "client!EUDZGBGU", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!EUDZGBGU", name = "H", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!EUDZGBGU", name = "I", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "I")
	private int anInt806 = 2;

	@OriginalMember(owner = "client!EUDZGBGU", name = "b", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!EUDZGBGU", name = "c", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!EUDZGBGU", name = "d", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!EUDZGBGU", name = "e", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!EUDZGBGU", name = "g", descriptor = "I")
	private int anInt808 = 20;

	@OriginalMember(owner = "client!EUDZGBGU", name = "h", descriptor = "I")
	protected int anInt809 = 1;

	@OriginalMember(owner = "client!EUDZGBGU", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!EUDZGBGU", name = "k", descriptor = "Z")
	protected boolean aBoolean228 = false;

	@OriginalMember(owner = "client!EUDZGBGU", name = "p", descriptor = "[Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2[] aClass5_Sub1_Sub2_Sub2Array3 = new Class5_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!EUDZGBGU", name = "r", descriptor = "Z")
	private boolean aBoolean229 = true;

	@OriginalMember(owner = "client!EUDZGBGU", name = "s", descriptor = "Z")
	protected boolean aBoolean230 = true;

	@OriginalMember(owner = "client!EUDZGBGU", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!EUDZGBGU", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "(BII)V")
	protected final void method571(@OriginalArg(0) byte arg0) {
		try {
			this.anInt811 = 765;
			this.anInt812 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt812, true, this.anInt811, this);
			@Pc(21) boolean local21 = false;
			this.aGraphics2 = this.method581().getGraphics();
			this.aClass10_2 = new Class10(this.anInt812, this.method581(), false, this.anInt811);
			this.method582(this, 1);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("96235, " + arg0 + ", " + 503 + ", " + 765 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "(III)V")
	protected final void method572() {
		try {
			this.anInt811 = 765;
			this.anInt812 = 503;
			this.aGraphics2 = this.method581().getGraphics();
			this.aClass10_2 = new Class10(this.anInt812, this.method581(), false, this.anInt811);
			this.method582(this, 1);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("35972, " + 766 + ", " + 503 + ", " + 765 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method581().addMouseListener(this);
		this.method581().addMouseMotionListener(this);
		this.method581().addKeyListener(this);
		this.method581().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method583(0, "Loading...");
		this.method576();
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
				if (this.anInt807 < 0) {
					if (this.anInt807 == -1) {
						this.method573();
					}
					return;
				}
				if (this.anInt807 > 0) {
					this.anInt807--;
					if (this.anInt807 == 0) {
						this.method573();
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
					local39 = (int) ((long) (this.anInt808 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt808 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt808) {
					local41 = this.anInt808;
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
				if (local41 < this.anInt809) {
					local41 = this.anInt809;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt820 = this.anInt817;
					this.anInt821 = this.anInt818;
					this.anInt822 = this.anInt819;
					this.aLong28 = this.aLong27;
					this.anInt817 = 0;
					this.method577();
					this.anInt823 = this.anInt824;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt808 > 0) {
					this.anInt810 = local39 * 1000 / (this.anInt808 * 256);
				}
				this.method579();
			} while (!this.aBoolean228);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt810 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt808 + " mindel:" + this.anInt809);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean228 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "(Z)V")
	private void method573() {
		try {
			this.anInt807 = -2;
			this.method578();
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
			signlink.reporterror("62256, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "(II)V")
	protected final void method574() {
		try {
			this.anInt808 = 1000;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("4068, " + 0 + ", " + 1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt807 >= 0) {
			this.anInt807 = 0;
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt807 >= 0) {
			this.anInt807 = 4000 / this.anInt808;
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt807 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt807 == -1) {
			this.method573();
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean229 = true;
		this.method580();
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean229 = true;
		this.method580();
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt813 = 0;
		this.anInt818 = local2;
		this.anInt819 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt817 = 2;
			this.anInt814 = 2;
		} else {
			this.anInt817 = 1;
			this.anInt814 = 1;
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt813 = 0;
		this.anInt814 = 0;
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt813 = 0;
		this.anInt815 = -1;
		this.anInt816 = -1;
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt813 = 0;
		this.anInt815 = local2;
		this.anInt816 = local5;
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt813 = 0;
		this.anInt815 = local2;
		this.anInt816 = local5;
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt813 = 0;
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
			this.anIntArray211[this.anInt824] = local10;
			this.anInt824 = this.anInt824 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt813 = 0;
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

	@OriginalMember(owner = "client!EUDZGBGU", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "(I)I")
	protected final int method575() {
		try {
			@Pc(10) int local10 = -1;
			if (this.anInt824 != this.anInt823) {
				local10 = this.anIntArray211[this.anInt823];
				this.anInt823 = this.anInt823 + 1 & 0x7F;
			}
			return local10;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("92283, " + 299 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean230 = true;
		this.aBoolean229 = true;
		this.method580();
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean230 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "()V")
	protected void method576() {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "b", descriptor = "(I)V")
	protected void method577() {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "c", descriptor = "(I)V")
	protected void method578() {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "(B)V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "b", descriptor = "(B)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "d", descriptor = "(I)Ljava/awt/Component;")
	protected Component method581() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("14523, " + 4 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method582(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!EUDZGBGU", name = "a", descriptor = "(ILjava/lang/String;I)V")
	protected void method583(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method581().getGraphics();
				try {
					this.method581().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method581().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method581().getFontMetrics(local49);
			if (this.aBoolean229) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt811, this.anInt812);
				this.aBoolean229 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt812 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt811 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt811 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt811 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt811 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("34704, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}
}
