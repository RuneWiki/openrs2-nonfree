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

@OriginalClass("client!AYIVJZQQ")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!AYIVJZQQ", name = "e", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "f", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "j", descriptor = "I")
	protected int anInt834;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "l", descriptor = "I")
	protected int anInt835;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "m", descriptor = "I")
	protected int anInt836;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "o", descriptor = "Lclient!NUXCAHZM;")
	protected Class29 aClass29_2;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "q", descriptor = "Lclient!YVSOOFAD;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "t", descriptor = "I")
	protected int anInt837;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "u", descriptor = "I")
	protected int anInt838;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "v", descriptor = "I")
	public int anInt839;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "w", descriptor = "I")
	public int anInt840;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "x", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "y", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "z", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "B", descriptor = "I")
	protected int anInt844;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "C", descriptor = "I")
	protected int anInt845;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "D", descriptor = "I")
	protected int anInt846;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "H", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "I", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "I")
	private int anInt829 = -920;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "b", descriptor = "B")
	private byte aByte37 = 64;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "c", descriptor = "Z")
	private boolean aBoolean187 = true;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "d", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "g", descriptor = "I")
	private int anInt832 = 20;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "h", descriptor = "I")
	protected int anInt833 = 1;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!AYIVJZQQ", name = "k", descriptor = "Z")
	protected boolean aBoolean189 = false;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "p", descriptor = "[Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3[] aClass8_Sub1_Sub1_Sub3Array3 = new Class8_Sub1_Sub1_Sub3[6];

	@OriginalMember(owner = "client!AYIVJZQQ", name = "r", descriptor = "Z")
	private boolean aBoolean190 = true;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "s", descriptor = "Z")
	protected boolean aBoolean191 = true;

	@OriginalMember(owner = "client!AYIVJZQQ", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!AYIVJZQQ", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "(III)V")
	protected final void method567(@OriginalArg(0) int arg0) {
		try {
			this.anInt835 = 765;
			this.anInt836 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt836, this.anInt835, this, false);
			if (arg0 < 0) {
				this.aGraphics2 = this.method577().getGraphics();
				this.aClass29_2 = new Class29(this.anInt836, this.anInt835, true, this.method577());
				this.method578(this, 1);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("98055, " + arg0 + ", " + 503 + ", " + 765 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "(IBI)V")
	protected final void method568(@OriginalArg(1) byte arg0) {
		try {
			this.anInt835 = 765;
			this.anInt836 = 503;
			if (arg0 != this.aByte37) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			this.aGraphics2 = this.method577().getGraphics();
			this.aClass29_2 = new Class29(this.anInt836, this.anInt835, true, this.method577());
			this.method578(this, 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("30721, " + 765 + ", " + arg0 + ", " + 503 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method577().addMouseListener(this);
		this.method577().addMouseMotionListener(this);
		this.method577().addKeyListener(this);
		this.method577().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method579(0, "Loading...");
		this.method572();
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
				if (this.anInt831 < 0) {
					if (this.anInt831 == -1) {
						this.method569();
					}
					return;
				}
				if (this.anInt831 > 0) {
					this.anInt831--;
					if (this.anInt831 == 0) {
						this.method569();
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
					local39 = (int) ((long) (this.anInt832 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt832 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt832) {
					local41 = this.anInt832;
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
				if (local41 < this.anInt833) {
					local41 = this.anInt833;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt844 = this.anInt841;
					this.anInt845 = this.anInt842;
					this.anInt846 = this.anInt843;
					this.aLong28 = this.aLong27;
					this.anInt841 = 0;
					this.method573();
					this.anInt847 = this.anInt848;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt832 > 0) {
					this.anInt834 = local39 * 1000 / (this.anInt832 * 256);
				}
				this.method575();
			} while (!this.aBoolean189);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt834 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt832 + " mindel:" + this.anInt833);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean189 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "(B)V")
	private void method569() {
		try {
			this.anInt831 = -2;
			this.method574();
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
			signlink.reporterror("99980, " + -30 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "(IB)V")
	protected final void method570() {
		try {
			this.anInt832 = 1000;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("76169, " + 1 + ", " + 21 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt831 >= 0) {
			this.anInt831 = 0;
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt831 >= 0) {
			this.anInt831 = 4000 / this.anInt832;
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt831 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt831 == -1) {
			this.method569();
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean190 = true;
		this.method576(111);
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean190 = true;
		this.method576(111);
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt837 = 0;
		this.anInt842 = local2;
		this.anInt843 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt841 = 2;
			this.anInt838 = 2;
		} else {
			this.anInt841 = 1;
			this.anInt838 = 1;
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt837 = 0;
		this.anInt838 = 0;
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt837 = 0;
		this.anInt839 = -1;
		this.anInt840 = -1;
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt837 = 0;
		this.anInt839 = local2;
		this.anInt840 = local5;
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt837 = 0;
		this.anInt839 = local2;
		this.anInt840 = local5;
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt837 = 0;
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
			this.anIntArray211[this.anInt848] = local10;
			this.anInt848 = this.anInt848 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt837 = 0;
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

	@OriginalMember(owner = "client!AYIVJZQQ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "(Z)I")
	protected final int method571() {
		try {
			@Pc(6) int local6 = -1;
			if (this.anInt848 != this.anInt847) {
				local6 = this.anIntArray211[this.anInt847];
				this.anInt847 = this.anInt847 + 1 & 0x7F;
			}
			return local6;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("63552, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean191 = true;
		this.aBoolean190 = true;
		this.method576(111);
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean191 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "()V")
	protected void method572() {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "b", descriptor = "(B)V")
	protected void method573() {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "(I)V")
	protected void method574() {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "b", descriptor = "(I)V")
	protected void method575() {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "c", descriptor = "(I)V")
	protected void method576(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "d", descriptor = "(I)Ljava/awt/Component;")
	protected Component method577() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("64808, " + -51 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method578(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!AYIVJZQQ", name = "a", descriptor = "(BILjava/lang/String;)V")
	protected void method579(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method577().getGraphics();
				try {
					this.method577().repaint();
				} catch (@Pc(13) Exception local13) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(17) Exception local17) {
				}
			}
			@Pc(28) Font local28 = new Font("Helvetica", 1, 13);
			@Pc(38) FontMetrics local38 = this.method577().getFontMetrics(local28);
			@Pc(45) Font local45 = new Font("Helvetica", 0, 13);
			this.method577().getFontMetrics(local45);
			if (this.aBoolean190) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt835, this.anInt836);
				this.aBoolean190 = false;
			}
			@Pc(77) Color local77 = new Color(140, 17, 17);
			@Pc(84) int local84 = this.anInt836 / 2 - 18;
			this.aGraphics2.setColor(local77);
			this.aGraphics2.drawRect(this.anInt835 / 2 - 152, local84, 304, 34);
			this.aGraphics2.fillRect(this.anInt835 / 2 - 150, local84 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt835 / 2 + arg0 * 3 - 150, local84 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local28);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt835 - local38.stringWidth(arg1)) / 2, local84 + 22);
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("88258, " + 62 + ", " + arg0 + ", " + arg1 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}
