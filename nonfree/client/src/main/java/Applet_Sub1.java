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

@OriginalClass("client!NZBGSSTU")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!NZBGSSTU", name = "e", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!NZBGSSTU", name = "i", descriptor = "I")
	protected int anInt809;

	@OriginalMember(owner = "client!NZBGSSTU", name = "k", descriptor = "I")
	protected int anInt810;

	@OriginalMember(owner = "client!NZBGSSTU", name = "l", descriptor = "I")
	protected int anInt811;

	@OriginalMember(owner = "client!NZBGSSTU", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!NZBGSSTU", name = "n", descriptor = "Lclient!ESGPTMPA;")
	protected Class8 aClass8_2;

	@OriginalMember(owner = "client!NZBGSSTU", name = "p", descriptor = "Lclient!WHTHTILQ;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!NZBGSSTU", name = "s", descriptor = "I")
	protected int anInt812;

	@OriginalMember(owner = "client!NZBGSSTU", name = "t", descriptor = "I")
	protected int anInt813;

	@OriginalMember(owner = "client!NZBGSSTU", name = "u", descriptor = "I")
	public int anInt814;

	@OriginalMember(owner = "client!NZBGSSTU", name = "v", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!NZBGSSTU", name = "w", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!NZBGSSTU", name = "x", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!NZBGSSTU", name = "y", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!NZBGSSTU", name = "z", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!NZBGSSTU", name = "A", descriptor = "I")
	protected int anInt819;

	@OriginalMember(owner = "client!NZBGSSTU", name = "B", descriptor = "I")
	protected int anInt820;

	@OriginalMember(owner = "client!NZBGSSTU", name = "C", descriptor = "I")
	protected int anInt821;

	@OriginalMember(owner = "client!NZBGSSTU", name = "D", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!NZBGSSTU", name = "G", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!NZBGSSTU", name = "H", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "I")
	private int anInt804 = -52;

	@OriginalMember(owner = "client!NZBGSSTU", name = "b", descriptor = "I")
	private int anInt805 = 625;

	@OriginalMember(owner = "client!NZBGSSTU", name = "c", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!NZBGSSTU", name = "d", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!NZBGSSTU", name = "f", descriptor = "I")
	private int anInt807 = 20;

	@OriginalMember(owner = "client!NZBGSSTU", name = "g", descriptor = "I")
	protected int anInt808 = 1;

	@OriginalMember(owner = "client!NZBGSSTU", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!NZBGSSTU", name = "j", descriptor = "Z")
	protected boolean aBoolean177 = false;

	@OriginalMember(owner = "client!NZBGSSTU", name = "o", descriptor = "[Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[6];

	@OriginalMember(owner = "client!NZBGSSTU", name = "q", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!NZBGSSTU", name = "r", descriptor = "Z")
	protected boolean aBoolean179 = true;

	@OriginalMember(owner = "client!NZBGSSTU", name = "E", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!NZBGSSTU", name = "F", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(BII)V")
	protected final void method574(@OriginalArg(0) byte arg0) {
		try {
			this.anInt810 = 765;
			@Pc(7) boolean local7 = false;
			this.anInt811 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, this.anInt811, this.anInt810, 0);
			this.aGraphics2 = this.method584().getGraphics();
			this.aClass8_2 = new Class8(this.anInt811, this.anInt810, this.method584(), this.anInt805);
			this.method585(this, 1);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("6321, " + arg0 + ", " + 765 + ", " + 503 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(IIZ)V")
	protected final void method575() {
		try {
			this.anInt810 = 765;
			this.anInt811 = 503;
			this.aGraphics2 = this.method584().getGraphics();
			this.aClass8_2 = new Class8(this.anInt811, this.anInt810, this.method584(), this.anInt805);
			this.method585(this, 1);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("60061, " + 503 + ", " + 765 + ", " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method584().addMouseListener(this);
		this.method584().addMouseMotionListener(this);
		this.method584().addKeyListener(this);
		this.method584().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method586(0, "Loading...");
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
				if (this.anInt806 < 0) {
					if (this.anInt806 == -1) {
						this.method576();
					}
					return;
				}
				if (this.anInt806 > 0) {
					this.anInt806--;
					if (this.anInt806 == 0) {
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
					local39 = (int) ((long) (this.anInt807 * 2560) / (local60 - this.aLongArray2[local37]));
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
					for (local169 = 0; local169 < 10; local169++) {
						if (this.aLongArray2[local169] != 0L) {
							this.aLongArray2[local169] += local41;
						}
					}
				}
				if (local41 < this.anInt808) {
					local41 = this.anInt808;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
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
					this.anInt809 = local39 * 1000 / (this.anInt807 * 256);
				}
				this.method582();
			} while (!this.aBoolean177);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt809 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt807 + " mindel:" + this.anInt808);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean177 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(Z)V")
	private void method576() {
		try {
			this.anInt806 = -2;
			this.method581();
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
			signlink.reporterror("66116, " + false + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(II)V")
	protected final void method577() {
		try {
			this.anInt807 = 1000;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("87572, " + 1 + ", " + -52 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt806 >= 0) {
			this.anInt806 = 0;
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt806 >= 0) {
			this.anInt806 = 4000 / this.anInt807;
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt806 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt806 == -1) {
			this.method576();
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean178 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean178 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!NZBGSSTU", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt812 = 0;
		this.anInt813 = 0;
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt812 = 0;
		this.anInt814 = -1;
		this.anInt815 = -1;
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!NZBGSSTU", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!NZBGSSTU", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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
			this.anIntArray211[this.anInt823] = local10;
			this.anInt823 = this.anInt823 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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

	@OriginalMember(owner = "client!NZBGSSTU", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(I)I")
	protected final int method578() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt823 != this.anInt822) {
				local11 = this.anIntArray211[this.anInt822];
				this.anInt822 = this.anInt822 + 1 & 0x7F;
			}
			return local11;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("82992, " + 878 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean179 = true;
		this.aBoolean178 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean179 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "()V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "b", descriptor = "(Z)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "c", descriptor = "(Z)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "d", descriptor = "(Z)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "b", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "c", descriptor = "(I)Ljava/awt/Component;")
	protected Component method584() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("39614, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method585(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(IILjava/lang/String;)V")
	protected void method586(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
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
			if (this.aBoolean178) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt810, this.anInt811);
				this.aBoolean178 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt811 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt810 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt810 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt810 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt810 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("81127, " + -618 + ", " + arg0 + ", " + arg1 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}
}
