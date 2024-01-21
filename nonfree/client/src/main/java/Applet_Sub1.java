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

@OriginalClass("client!NHAOTYHM")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!NHAOTYHM", name = "g", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!NHAOTYHM", name = "k", descriptor = "I")
	protected int anInt847;

	@OriginalMember(owner = "client!NHAOTYHM", name = "m", descriptor = "I")
	protected int anInt848;

	@OriginalMember(owner = "client!NHAOTYHM", name = "n", descriptor = "I")
	protected int anInt849;

	@OriginalMember(owner = "client!NHAOTYHM", name = "o", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!NHAOTYHM", name = "p", descriptor = "Lclient!HVBGFDBD;")
	protected Class15 aClass15_2;

	@OriginalMember(owner = "client!NHAOTYHM", name = "r", descriptor = "Lclient!VZJCTUDQ;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!NHAOTYHM", name = "u", descriptor = "I")
	protected int anInt850;

	@OriginalMember(owner = "client!NHAOTYHM", name = "v", descriptor = "I")
	protected int anInt851;

	@OriginalMember(owner = "client!NHAOTYHM", name = "w", descriptor = "I")
	public int anInt852;

	@OriginalMember(owner = "client!NHAOTYHM", name = "x", descriptor = "I")
	public int anInt853;

	@OriginalMember(owner = "client!NHAOTYHM", name = "y", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!NHAOTYHM", name = "z", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!NHAOTYHM", name = "A", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!NHAOTYHM", name = "B", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!NHAOTYHM", name = "C", descriptor = "I")
	protected int anInt857;

	@OriginalMember(owner = "client!NHAOTYHM", name = "D", descriptor = "I")
	protected int anInt858;

	@OriginalMember(owner = "client!NHAOTYHM", name = "E", descriptor = "I")
	protected int anInt859;

	@OriginalMember(owner = "client!NHAOTYHM", name = "F", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!NHAOTYHM", name = "I", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!NHAOTYHM", name = "J", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!NHAOTYHM", name = "b", descriptor = "I")
	private int anInt840 = 374;

	@OriginalMember(owner = "client!NHAOTYHM", name = "c", descriptor = "I")
	private int anInt841 = 672;

	@OriginalMember(owner = "client!NHAOTYHM", name = "d", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!NHAOTYHM", name = "e", descriptor = "I")
	private int anInt842 = 827;

	@OriginalMember(owner = "client!NHAOTYHM", name = "f", descriptor = "I")
	private int anInt843 = 3;

	@OriginalMember(owner = "client!NHAOTYHM", name = "h", descriptor = "I")
	private int anInt845 = 20;

	@OriginalMember(owner = "client!NHAOTYHM", name = "i", descriptor = "I")
	protected int anInt846 = 1;

	@OriginalMember(owner = "client!NHAOTYHM", name = "j", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!NHAOTYHM", name = "l", descriptor = "Z")
	protected boolean aBoolean226 = false;

	@OriginalMember(owner = "client!NHAOTYHM", name = "q", descriptor = "[Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4[] aClass6_Sub1_Sub1_Sub4Array3 = new Class6_Sub1_Sub1_Sub4[6];

	@OriginalMember(owner = "client!NHAOTYHM", name = "s", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!NHAOTYHM", name = "t", descriptor = "Z")
	protected boolean aBoolean228 = true;

	@OriginalMember(owner = "client!NHAOTYHM", name = "G", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!NHAOTYHM", name = "H", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(BII)V")
	protected final void method575(@OriginalArg(0) byte arg0) {
		try {
			this.anInt848 = 765;
			this.anInt849 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(-859, this, this.anInt849, this.anInt848);
			@Pc(21) boolean local21 = false;
			this.aGraphics2 = this.method585().getGraphics();
			this.aClass15_2 = new Class15(this.method585(), this.anInt849, 45981, this.anInt848);
			this.method586(this, 1);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("51195, " + arg0 + ", " + 503 + ", " + 765 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(III)V")
	protected final void method576() {
		try {
			this.anInt848 = 765;
			this.anInt849 = 503;
			this.aGraphics2 = this.method585().getGraphics();
			this.aClass15_2 = new Class15(this.method585(), this.anInt849, 45981, this.anInt848);
			this.method586(this, 1);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("36515, " + 503 + ", " + 765 + ", " + 4 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method585().addMouseListener(this);
		this.method585().addMouseMotionListener(this);
		this.method585().addKeyListener(this);
		this.method585().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method587("Loading...", 0);
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
				if (this.anInt844 < 0) {
					if (this.anInt844 == -1) {
						this.method577();
					}
					return;
				}
				if (this.anInt844 > 0) {
					this.anInt844--;
					if (this.anInt844 == 0) {
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
					local39 = (int) ((long) (this.anInt845 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt845 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt845) {
					local41 = this.anInt845;
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
				if (local41 < this.anInt846) {
					local41 = this.anInt846;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt857 = this.anInt854;
					this.anInt858 = this.anInt855;
					this.anInt859 = this.anInt856;
					this.aLong28 = this.aLong27;
					this.anInt854 = 0;
					this.method581();
					this.anInt860 = this.anInt861;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt845 > 0) {
					this.anInt847 = local39 * 1000 / (this.anInt845 * 256);
				}
				this.method583(672);
			} while (!this.aBoolean226);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt847 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt845 + " mindel:" + this.anInt846);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean226 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(I)V")
	private void method577() {
		try {
			this.anInt844 = -2;
			this.method582(374);
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
			signlink.reporterror("89509, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(II)V")
	protected final void method578() {
		try {
			this.anInt845 = 1000;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("50293, " + 1 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt844 >= 0) {
			this.anInt844 = 0;
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt844 >= 0) {
			this.anInt844 = 4000 / this.anInt845;
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt844 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt844 == -1) {
			this.method577();
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean227 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean227 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt850 = 0;
		this.anInt855 = local2;
		this.anInt856 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt854 = 2;
			this.anInt851 = 2;
		} else {
			this.anInt854 = 1;
			this.anInt851 = 1;
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt850 = 0;
		this.anInt851 = 0;
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt850 = 0;
		this.anInt852 = -1;
		this.anInt853 = -1;
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt850 = 0;
		this.anInt852 = local2;
		this.anInt853 = local5;
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt850 = 0;
		this.anInt852 = local2;
		this.anInt853 = local5;
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt850 = 0;
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
			this.anIntArray211[this.anInt861] = local10;
			this.anInt861 = this.anInt861 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt850 = 0;
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

	@OriginalMember(owner = "client!NHAOTYHM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(B)I")
	protected final int method579(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 9) {
				return this.anInt842;
			}
			@Pc(7) int local7 = -1;
			if (this.anInt861 != this.anInt860) {
				local7 = this.anIntArray211[this.anInt860];
				this.anInt860 = this.anInt860 + 1 & 0x7F;
			}
			return local7;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("73473, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean228 = true;
		this.aBoolean227 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean228 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "()V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "b", descriptor = "(I)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "c", descriptor = "(I)V")
	protected void method582(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("91067, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "d", descriptor = "(I)V")
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("7224, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(Z)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "e", descriptor = "(I)Ljava/awt/Component;")
	protected Component method585() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("18692, " + -489 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method586(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(Ljava/lang/String;II)V")
	protected void method587(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
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
			if (this.aBoolean227) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt848, this.anInt849);
				this.aBoolean227 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt849 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt848 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt848 / 2 - 150, local88 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt848 / 2 + arg1 * 3 - 150, local88 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt848 - local42.stringWidth(arg0)) / 2, local88 + 22);
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("82737, " + arg0 + ", " + 27936 + ", " + arg1 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}
}
