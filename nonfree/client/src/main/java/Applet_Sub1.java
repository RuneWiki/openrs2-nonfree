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

@OriginalClass("client!KISFBCOP")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!KISFBCOP", name = "f", descriptor = "I")
	private int anInt799;

	@OriginalMember(owner = "client!KISFBCOP", name = "j", descriptor = "I")
	protected int anInt802;

	@OriginalMember(owner = "client!KISFBCOP", name = "l", descriptor = "I")
	protected int anInt803;

	@OriginalMember(owner = "client!KISFBCOP", name = "m", descriptor = "I")
	protected int anInt804;

	@OriginalMember(owner = "client!KISFBCOP", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!KISFBCOP", name = "o", descriptor = "Lclient!TRQPVNER;")
	protected Class42 aClass42_2;

	@OriginalMember(owner = "client!KISFBCOP", name = "q", descriptor = "Lclient!UNSEVWCI;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!KISFBCOP", name = "t", descriptor = "I")
	protected int anInt805;

	@OriginalMember(owner = "client!KISFBCOP", name = "u", descriptor = "I")
	protected int anInt806;

	@OriginalMember(owner = "client!KISFBCOP", name = "v", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!KISFBCOP", name = "w", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!KISFBCOP", name = "x", descriptor = "I")
	private int anInt809;

	@OriginalMember(owner = "client!KISFBCOP", name = "y", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!KISFBCOP", name = "z", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!KISFBCOP", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!KISFBCOP", name = "B", descriptor = "I")
	protected int anInt812;

	@OriginalMember(owner = "client!KISFBCOP", name = "C", descriptor = "I")
	protected int anInt813;

	@OriginalMember(owner = "client!KISFBCOP", name = "D", descriptor = "I")
	protected int anInt814;

	@OriginalMember(owner = "client!KISFBCOP", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!KISFBCOP", name = "H", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!KISFBCOP", name = "I", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!KISFBCOP", name = "b", descriptor = "I")
	private int anInt796 = 171;

	@OriginalMember(owner = "client!KISFBCOP", name = "c", descriptor = "Z")
	private boolean aBoolean219 = true;

	@OriginalMember(owner = "client!KISFBCOP", name = "d", descriptor = "I")
	private int anInt797 = 19413;

	@OriginalMember(owner = "client!KISFBCOP", name = "e", descriptor = "I")
	private int anInt798 = 883;

	@OriginalMember(owner = "client!KISFBCOP", name = "g", descriptor = "I")
	private int anInt800 = 20;

	@OriginalMember(owner = "client!KISFBCOP", name = "h", descriptor = "I")
	protected int anInt801 = 1;

	@OriginalMember(owner = "client!KISFBCOP", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!KISFBCOP", name = "k", descriptor = "Z")
	protected boolean aBoolean220 = false;

	@OriginalMember(owner = "client!KISFBCOP", name = "p", descriptor = "[Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array3 = new Class2_Sub1_Sub1_Sub4[6];

	@OriginalMember(owner = "client!KISFBCOP", name = "r", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!KISFBCOP", name = "s", descriptor = "Z")
	protected boolean aBoolean222 = true;

	@OriginalMember(owner = "client!KISFBCOP", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!KISFBCOP", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "(III)V")
	protected final void method573() {
		try {
			this.anInt803 = 765;
			this.anInt804 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, this.anInt803, 2, this.anInt804);
			this.aGraphics2 = this.method583().getGraphics();
			this.aClass42_2 = new Class42(this.anInt803, true, this.method583(), this.anInt804);
			this.method584(this, 1);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("60747, " + 765 + ", " + 503 + ", " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "(IZI)V")
	protected final void method574(@OriginalArg(1) boolean arg0) {
		try {
			this.anInt803 = 765;
			this.anInt804 = 503;
			if (!arg0) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			this.aGraphics2 = this.method583().getGraphics();
			this.aClass42_2 = new Class42(this.anInt803, true, this.method583(), this.anInt804);
			this.method584(this, 1);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("30868, " + 503 + ", " + arg0 + ", " + 765 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method583().addMouseListener(this);
		this.method583().addMouseMotionListener(this);
		this.method583().addKeyListener(this);
		this.method583().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method585(0, "Loading...");
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
				if (this.anInt799 < 0) {
					if (this.anInt799 == -1) {
						this.method575();
					}
					return;
				}
				if (this.anInt799 > 0) {
					this.anInt799--;
					if (this.anInt799 == 0) {
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
					local39 = (int) ((long) (this.anInt800 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt800 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt800) {
					local41 = this.anInt800;
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
				if (local41 < this.anInt801) {
					local41 = this.anInt801;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt812 = this.anInt809;
					this.anInt813 = this.anInt810;
					this.anInt814 = this.anInt811;
					this.aLong28 = this.aLong27;
					this.anInt809 = 0;
					this.method579();
					this.anInt815 = this.anInt816;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt800 > 0) {
					this.anInt802 = local39 * 1000 / (this.anInt800 * 256);
				}
				this.method581();
			} while (!this.aBoolean220);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt802 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt800 + " mindel:" + this.anInt801);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean220 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "(B)V")
	private void method575() {
		try {
			this.anInt799 = -2;
			this.method580();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(18) Exception local18) {
				}
				try {
					System.exit(0);
				} catch (@Pc(22) Throwable local22) {
				}
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("49531, " + -101 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "(II)V")
	protected final void method576() {
		try {
			this.anInt800 = 1000;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("880, " + 1 + ", " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt799 >= 0) {
			this.anInt799 = 0;
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt799 >= 0) {
			this.anInt799 = 4000 / this.anInt800;
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt799 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt799 == -1) {
			this.method575();
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean221 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean221 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt805 = 0;
		this.anInt810 = local2;
		this.anInt811 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt809 = 2;
			this.anInt806 = 2;
		} else {
			this.anInt809 = 1;
			this.anInt806 = 1;
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt805 = 0;
		this.anInt806 = 0;
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt805 = 0;
		this.anInt807 = -1;
		this.anInt808 = -1;
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt805 = 0;
		this.anInt807 = local2;
		this.anInt808 = local5;
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt805 = 0;
		this.anInt807 = local2;
		this.anInt808 = local5;
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt805 = 0;
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
			this.anIntArray211[this.anInt816] = local10;
			this.anInt816 = this.anInt816 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt805 = 0;
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

	@OriginalMember(owner = "client!KISFBCOP", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "(Z)I")
	protected final int method577() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt816 != this.anInt815) {
				local1 = this.anIntArray211[this.anInt815];
				this.anInt815 = this.anInt815 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("68761, " + true + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean222 = true;
		this.aBoolean221 = true;
		this.method582();
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean222 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "()V")
	protected void method578() {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "(I)V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "b", descriptor = "(Z)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "b", descriptor = "(B)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "b", descriptor = "(I)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "c", descriptor = "(B)Ljava/awt/Component;")
	protected Component method583() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("94390, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method584(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!KISFBCOP", name = "a", descriptor = "(ILjava/lang/String;I)V")
	protected void method585(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
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
			if (this.aBoolean221) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt803, this.anInt804);
				this.aBoolean221 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt804 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt803 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt803 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt803 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt803 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("80717, " + arg0 + ", " + arg1 + ", " + -211 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}
}
