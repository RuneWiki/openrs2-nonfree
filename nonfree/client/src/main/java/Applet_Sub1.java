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

@OriginalClass("client!PKBEYUWN")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!PKBEYUWN", name = "d", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!PKBEYUWN", name = "h", descriptor = "I")
	protected int anInt833;

	@OriginalMember(owner = "client!PKBEYUWN", name = "j", descriptor = "I")
	protected int anInt834;

	@OriginalMember(owner = "client!PKBEYUWN", name = "k", descriptor = "I")
	protected int anInt835;

	@OriginalMember(owner = "client!PKBEYUWN", name = "l", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!PKBEYUWN", name = "m", descriptor = "Lclient!IOGVZQTL;")
	protected Class20 aClass20_2;

	@OriginalMember(owner = "client!PKBEYUWN", name = "o", descriptor = "Lclient!FRBOSPAH;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!PKBEYUWN", name = "r", descriptor = "I")
	protected int anInt836;

	@OriginalMember(owner = "client!PKBEYUWN", name = "s", descriptor = "I")
	protected int anInt837;

	@OriginalMember(owner = "client!PKBEYUWN", name = "t", descriptor = "I")
	public int anInt838;

	@OriginalMember(owner = "client!PKBEYUWN", name = "u", descriptor = "I")
	public int anInt839;

	@OriginalMember(owner = "client!PKBEYUWN", name = "v", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!PKBEYUWN", name = "w", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!PKBEYUWN", name = "x", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!PKBEYUWN", name = "y", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!PKBEYUWN", name = "z", descriptor = "I")
	protected int anInt843;

	@OriginalMember(owner = "client!PKBEYUWN", name = "A", descriptor = "I")
	protected int anInt844;

	@OriginalMember(owner = "client!PKBEYUWN", name = "B", descriptor = "I")
	protected int anInt845;

	@OriginalMember(owner = "client!PKBEYUWN", name = "C", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!PKBEYUWN", name = "F", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!PKBEYUWN", name = "G", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "I")
	private int anInt828 = 9;

	@OriginalMember(owner = "client!PKBEYUWN", name = "b", descriptor = "I")
	private int anInt829 = 490;

	@OriginalMember(owner = "client!PKBEYUWN", name = "c", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!PKBEYUWN", name = "e", descriptor = "I")
	private int anInt831 = 20;

	@OriginalMember(owner = "client!PKBEYUWN", name = "f", descriptor = "I")
	protected int anInt832 = 1;

	@OriginalMember(owner = "client!PKBEYUWN", name = "g", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!PKBEYUWN", name = "i", descriptor = "Z")
	protected boolean aBoolean223 = false;

	@OriginalMember(owner = "client!PKBEYUWN", name = "n", descriptor = "[Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub2Array3 = new Class2_Sub1_Sub1_Sub2[6];

	@OriginalMember(owner = "client!PKBEYUWN", name = "p", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!PKBEYUWN", name = "q", descriptor = "Z")
	protected boolean aBoolean225 = true;

	@OriginalMember(owner = "client!PKBEYUWN", name = "D", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!PKBEYUWN", name = "E", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(III)V")
	protected final void method576() {
		try {
			this.anInt834 = 765;
			this.anInt835 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt834, this.anInt835, 0, this);
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass20_2 = new Class20(this.anInt834, this.anInt835, this.method586(), this.aBoolean222);
			this.method587(this, 1);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("41167, " + 0 + ", " + 503 + ", " + 765 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "b", descriptor = "(III)V")
	protected final void method577() {
		try {
			this.anInt834 = 765;
			this.anInt835 = 503;
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass20_2 = new Class20(this.anInt834, this.anInt835, this.method586(), this.aBoolean222);
			this.method587(this, 1);
			if (this.anInt828 != 9) {
				this.aBoolean222 = !this.aBoolean222;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("14309, " + 765 + ", " + 9 + ", " + 503 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method586().addMouseListener(this);
		this.method586().addMouseMotionListener(this);
		this.method586().addKeyListener(this);
		this.method586().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588((byte) 6, 0, "Loading...");
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
				if (this.anInt830 < 0) {
					if (this.anInt830 == -1) {
						this.method578();
					}
					return;
				}
				if (this.anInt830 > 0) {
					this.anInt830--;
					if (this.anInt830 == 0) {
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
					local39 = (int) ((long) (this.anInt831 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt831 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt831) {
					local41 = this.anInt831;
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
				if (local41 < this.anInt832) {
					local41 = this.anInt832;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt843 = this.anInt840;
					this.anInt844 = this.anInt841;
					this.anInt845 = this.anInt842;
					this.aLong28 = this.aLong27;
					this.anInt840 = 0;
					this.method582();
					this.anInt846 = this.anInt847;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt831 > 0) {
					this.anInt833 = local39 * 1000 / (this.anInt831 * 256);
				}
				this.method584();
			} while (!this.aBoolean223);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt833 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt831 + " mindel:" + this.anInt832);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean223 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(I)V")
	private void method578() {
		try {
			this.anInt830 = -2;
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
			signlink.reporterror("87432, " + 490 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(BI)V")
	protected final void method579() {
		try {
			this.anInt831 = 1000;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("85033, " + -48 + ", " + 1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt830 >= 0) {
			this.anInt830 = 0;
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt830 >= 0) {
			this.anInt830 = 4000 / this.anInt831;
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt830 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt830 == -1) {
			this.method578();
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean224 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean224 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt836 = 0;
		this.anInt841 = local2;
		this.anInt842 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt840 = 2;
			this.anInt837 = 2;
		} else {
			this.anInt840 = 1;
			this.anInt837 = 1;
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt836 = 0;
		this.anInt837 = 0;
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt836 = 0;
		this.anInt838 = -1;
		this.anInt839 = -1;
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt836 = 0;
		this.anInt838 = local2;
		this.anInt839 = local5;
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt836 = 0;
		this.anInt838 = local2;
		this.anInt839 = local5;
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt836 = 0;
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
			this.anIntArray211[this.anInt847] = local10;
			this.anInt847 = this.anInt847 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt836 = 0;
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

	@OriginalMember(owner = "client!PKBEYUWN", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "b", descriptor = "(I)I")
	protected final int method580() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt847 != this.anInt846) {
				local1 = this.anIntArray211[this.anInt846];
				this.anInt846 = this.anInt846 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("78881, " + 126 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean225 = true;
		this.aBoolean224 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean225 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "()V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "c", descriptor = "(I)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(Z)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(B)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "d", descriptor = "(I)V")
	protected void method585() {
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "e", descriptor = "(I)Ljava/awt/Component;")
	protected Component method586() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("76465, " + 1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(BILjava/lang/String;)V")
	protected void method588(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method586().getGraphics();
				try {
					this.method586().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method586().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method586().getFontMetrics(local49);
			if (this.aBoolean224) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt834, this.anInt835);
				this.aBoolean224 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt835 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt834 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt834 / 2 - 150, local88 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt834 / 2 + arg1 * 3 - 150, local88 + 2, 300 - arg1 * 3, 30);
			@Pc(151) boolean local151 = false;
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg2, (this.anInt834 - local42.stringWidth(arg2)) / 2, local88 + 22);
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("71986, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}
}
