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

@OriginalClass("client!RMDQJLZZ")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!RMDQJLZZ", name = "b", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "d", descriptor = "I")
	private int anInt804;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "h", descriptor = "I")
	protected int anInt807;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "j", descriptor = "I")
	protected int anInt808;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "k", descriptor = "I")
	protected int anInt809;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "l", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "m", descriptor = "Lclient!VFZXUVTW;")
	protected Class40 aClass40_2;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "o", descriptor = "Lclient!IWUEUKZJ;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "r", descriptor = "I")
	protected int anInt810;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "s", descriptor = "I")
	protected int anInt811;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "t", descriptor = "I")
	public int anInt812;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "u", descriptor = "I")
	public int anInt813;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "v", descriptor = "I")
	private int anInt814;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "w", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "x", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "y", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "z", descriptor = "I")
	protected int anInt817;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "A", descriptor = "I")
	protected int anInt818;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "B", descriptor = "I")
	protected int anInt819;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "C", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "F", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "G", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "c", descriptor = "B")
	private byte aByte30 = 4;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "e", descriptor = "I")
	private int anInt805 = 20;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "f", descriptor = "I")
	protected int anInt806 = 1;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "g", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!RMDQJLZZ", name = "i", descriptor = "Z")
	protected boolean aBoolean197 = false;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "n", descriptor = "[Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array3 = new Class8_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!RMDQJLZZ", name = "p", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "q", descriptor = "Z")
	protected boolean aBoolean199 = true;

	@OriginalMember(owner = "client!RMDQJLZZ", name = "D", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!RMDQJLZZ", name = "E", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(III)V")
	protected final void method576() {
		try {
			this.anInt808 = 765;
			this.anInt809 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt808, this, 208, this.anInt809);
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass40_2 = new Class40(this.anInt809, this.anInt808, this.aByte30, this.method586());
			this.method587(this, 1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("51004, " + -31255 + ", " + 503 + ", " + 765 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(IIB)V")
	protected final void method577() {
		try {
			this.anInt808 = 765;
			this.anInt809 = 503;
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass40_2 = new Class40(this.anInt809, this.anInt808, this.aByte30, this.method586());
			this.method587(this, 1);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("46383, " + 765 + ", " + 503 + ", " + 9 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method586().addMouseListener(this);
		this.method586().addMouseMotionListener(this);
		this.method586().addKeyListener(this);
		this.method586().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588(0, "Loading...");
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
				if (this.anInt804 < 0) {
					if (this.anInt804 == -1) {
						this.method578();
					}
					return;
				}
				if (this.anInt804 > 0) {
					this.anInt804--;
					if (this.anInt804 == 0) {
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
					local39 = (int) ((long) (this.anInt805 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt805 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt805) {
					local41 = this.anInt805;
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
				if (local41 < this.anInt806) {
					local41 = this.anInt806;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt817 = this.anInt814;
					this.anInt818 = this.anInt815;
					this.anInt819 = this.anInt816;
					this.aLong28 = this.aLong27;
					this.anInt814 = 0;
					this.method582();
					this.anInt820 = this.anInt821;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt805 > 0) {
					this.anInt807 = local39 * 1000 / (this.anInt805 * 256);
				}
				this.method584();
			} while (!this.aBoolean197);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt807 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt805 + " mindel:" + this.anInt806);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean197 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(I)V")
	private void method578() {
		try {
			this.anInt804 = -2;
			this.method583((byte) 4);
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
			signlink.reporterror("61951, " + -23199 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(II)V")
	protected final void method579() {
		try {
			this.anInt805 = 1000;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("95892, " + -177 + ", " + 1 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt804 >= 0) {
			this.anInt804 = 0;
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt804 >= 0) {
			this.anInt804 = 4000 / this.anInt805;
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt804 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt804 == -1) {
			this.method578();
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean198 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean198 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt810 = 0;
		this.anInt815 = local2;
		this.anInt816 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt814 = 2;
			this.anInt811 = 2;
		} else {
			this.anInt814 = 1;
			this.anInt811 = 1;
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt810 = 0;
		this.anInt811 = 0;
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt810 = 0;
		this.anInt812 = -1;
		this.anInt813 = -1;
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt810 = 0;
		this.anInt812 = local2;
		this.anInt813 = local5;
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt810 = 0;
		this.anInt812 = local2;
		this.anInt813 = local5;
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt810 = 0;
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
			this.anIntArray211[this.anInt821] = local10;
			this.anInt821 = this.anInt821 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt810 = 0;
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

	@OriginalMember(owner = "client!RMDQJLZZ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(Z)I")
	protected final int method580() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt821 != this.anInt820) {
				local1 = this.anIntArray211[this.anInt820];
				this.anInt820 = this.anInt820 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("57932, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean199 = true;
		this.aBoolean198 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean199 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "()V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "b", descriptor = "(I)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(B)V")
	protected void method583(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("77686, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "b", descriptor = "(B)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "c", descriptor = "(I)V")
	protected void method585() {
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "d", descriptor = "(I)Ljava/awt/Component;")
	protected Component method586() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("30372, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(IBLjava/lang/String;)V")
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method586().getGraphics();
				try {
					this.method586().repaint();
				} catch (@Pc(13) Exception local13) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(17) Exception local17) {
				}
			}
			@Pc(28) Font local28 = new Font("Helvetica", 1, 13);
			@Pc(34) FontMetrics local34 = this.method586().getFontMetrics(local28);
			@Pc(41) Font local41 = new Font("Helvetica", 0, 13);
			this.method586().getFontMetrics(local41);
			if (this.aBoolean198) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt808, this.anInt809);
				this.aBoolean198 = false;
			}
			@Pc(73) Color local73 = new Color(140, 17, 17);
			@Pc(80) int local80 = this.anInt809 / 2 - 18;
			this.aGraphics2.setColor(local73);
			this.aGraphics2.drawRect(this.anInt808 / 2 - 152, local80, 304, 34);
			this.aGraphics2.fillRect(this.anInt808 / 2 - 150, local80 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt808 / 2 + arg0 * 3 - 150, local80 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local28);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt808 - local34.stringWidth(arg1)) / 2, local80 + 22);
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("58633, " + arg0 + ", " + -127 + ", " + arg1 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}
