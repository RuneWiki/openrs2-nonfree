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

@OriginalClass("client!BFZNZUKL")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!BFZNZUKL", name = "e", descriptor = "I")
	private int anInt807;

	@OriginalMember(owner = "client!BFZNZUKL", name = "i", descriptor = "I")
	protected int anInt810;

	@OriginalMember(owner = "client!BFZNZUKL", name = "k", descriptor = "I")
	protected int anInt811;

	@OriginalMember(owner = "client!BFZNZUKL", name = "l", descriptor = "I")
	protected int anInt812;

	@OriginalMember(owner = "client!BFZNZUKL", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!BFZNZUKL", name = "n", descriptor = "Lclient!MEXICRKY;")
	protected Class26 aClass26_2;

	@OriginalMember(owner = "client!BFZNZUKL", name = "p", descriptor = "Lclient!VCIVYIXH;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!BFZNZUKL", name = "s", descriptor = "I")
	protected int anInt813;

	@OriginalMember(owner = "client!BFZNZUKL", name = "t", descriptor = "I")
	protected int anInt814;

	@OriginalMember(owner = "client!BFZNZUKL", name = "u", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!BFZNZUKL", name = "v", descriptor = "I")
	public int anInt816;

	@OriginalMember(owner = "client!BFZNZUKL", name = "w", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!BFZNZUKL", name = "x", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!BFZNZUKL", name = "y", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!BFZNZUKL", name = "z", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!BFZNZUKL", name = "A", descriptor = "I")
	protected int anInt820;

	@OriginalMember(owner = "client!BFZNZUKL", name = "B", descriptor = "I")
	protected int anInt821;

	@OriginalMember(owner = "client!BFZNZUKL", name = "C", descriptor = "I")
	protected int anInt822;

	@OriginalMember(owner = "client!BFZNZUKL", name = "D", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!BFZNZUKL", name = "G", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!BFZNZUKL", name = "H", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "I")
	private int anInt805 = -35195;

	@OriginalMember(owner = "client!BFZNZUKL", name = "b", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!BFZNZUKL", name = "c", descriptor = "I")
	private int anInt806 = 10685;

	@OriginalMember(owner = "client!BFZNZUKL", name = "d", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!BFZNZUKL", name = "f", descriptor = "I")
	private int anInt808 = 20;

	@OriginalMember(owner = "client!BFZNZUKL", name = "g", descriptor = "I")
	protected int anInt809 = 1;

	@OriginalMember(owner = "client!BFZNZUKL", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!BFZNZUKL", name = "j", descriptor = "Z")
	protected boolean aBoolean182 = false;

	@OriginalMember(owner = "client!BFZNZUKL", name = "o", descriptor = "[Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2[] aClass1_Sub2_Sub1_Sub2Array3 = new Class1_Sub2_Sub1_Sub2[6];

	@OriginalMember(owner = "client!BFZNZUKL", name = "q", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!BFZNZUKL", name = "r", descriptor = "Z")
	protected boolean aBoolean184 = true;

	@OriginalMember(owner = "client!BFZNZUKL", name = "E", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!BFZNZUKL", name = "F", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(IZI)V")
	protected final void method576() {
		try {
			this.anInt811 = 765;
			this.anInt812 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt812, this, this.anInt811, 0);
			this.aGraphics2 = this.method586(735).getGraphics();
			this.aClass26_2 = new Class26(this.anInt812, 0, this.anInt811, this.method586(735));
			this.method587(this, 1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("91182, " + 765 + ", " + true + ", " + 503 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(IIB)V")
	protected final void method577() {
		try {
			this.anInt811 = 765;
			this.anInt812 = 503;
			this.aGraphics2 = this.method586(735).getGraphics();
			this.aClass26_2 = new Class26(this.anInt812, 0, this.anInt811, this.method586(735));
			this.method587(this, 1);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("20386, " + 765 + ", " + 503 + ", " + -94 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method586(735).addMouseListener(this);
		this.method586(735).addMouseMotionListener(this);
		this.method586(735).addKeyListener(this);
		this.method586(735).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588(0, (byte) 6, "Loading...");
		this.method581();
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
						this.method578();
					}
					return;
				}
				if (this.anInt807 > 0) {
					this.anInt807--;
					if (this.anInt807 == 0) {
						this.method578();
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
					this.method582();
					this.anInt823 = this.anInt824;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt808 > 0) {
					this.anInt810 = local39 * 1000 / (this.anInt808 * 256);
				}
				this.method584();
			} while (!this.aBoolean182);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt810 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt808 + " mindel:" + this.anInt809);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean182 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(Z)V")
	private void method578() {
		try {
			this.anInt807 = -2;
			this.method583();
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
			signlink.reporterror("49824, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(II)V")
	protected final void method579() {
		try {
			this.anInt808 = 1000;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("12240, " + 1 + ", " + 1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt807 >= 0) {
			this.anInt807 = 0;
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt807 >= 0) {
			this.anInt807 = 4000 / this.anInt808;
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt807 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt807 == -1) {
			this.method578();
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean183 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean183 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!BFZNZUKL", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt813 = 0;
		this.anInt814 = 0;
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt813 = 0;
		this.anInt815 = -1;
		this.anInt816 = -1;
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!BFZNZUKL", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!BFZNZUKL", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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

	@OriginalMember(owner = "client!BFZNZUKL", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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

	@OriginalMember(owner = "client!BFZNZUKL", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(I)I")
	protected final int method580() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt824 != this.anInt823) {
				local1 = this.anIntArray211[this.anInt823];
				this.anInt823 = this.anInt823 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("474, " + -36198 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean184 = true;
		this.aBoolean183 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean184 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "()V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "b", descriptor = "(I)V")
	protected void method582() {
		try {
			if (this.anInt806 != 10685) {
				this.aBoolean180 = !this.aBoolean180;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("84621, " + 10685 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "b", descriptor = "(Z)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "c", descriptor = "(I)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "d", descriptor = "(I)V")
	protected void method585() {
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "e", descriptor = "(I)Ljava/awt/Component;")
	protected Component method586(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("11635, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(IBLjava/lang/String;)V")
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method586(735).getGraphics();
				try {
					this.method586(735).repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method586(735).getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method586(735).getFontMetrics(local49);
			if (this.aBoolean183) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt811, this.anInt812);
				this.aBoolean183 = false;
			}
			@Pc(87) Color local87 = new Color(140, 17, 17);
			@Pc(94) int local94 = this.anInt812 / 2 - 18;
			this.aGraphics2.setColor(local87);
			this.aGraphics2.drawRect(this.anInt811 / 2 - 152, local94, 304, 34);
			this.aGraphics2.fillRect(this.anInt811 / 2 - 150, local94 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt811 / 2 + arg0 * 3 - 150, local94 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg2, (this.anInt811 - local42.stringWidth(arg2)) / 2, local94 + 22);
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("1162, " + arg0 + ", " + 6 + ", " + arg2 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}
}
