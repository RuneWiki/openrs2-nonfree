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

@OriginalClass("client!XHFSQKPU")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!XHFSQKPU", name = "d", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!XHFSQKPU", name = "f", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!XHFSQKPU", name = "j", descriptor = "I")
	protected int anInt847;

	@OriginalMember(owner = "client!XHFSQKPU", name = "l", descriptor = "I")
	protected int anInt848;

	@OriginalMember(owner = "client!XHFSQKPU", name = "m", descriptor = "I")
	protected int anInt849;

	@OriginalMember(owner = "client!XHFSQKPU", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!XHFSQKPU", name = "o", descriptor = "Lclient!EDCVNWGU;")
	protected Class12 aClass12_2;

	@OriginalMember(owner = "client!XHFSQKPU", name = "q", descriptor = "Lclient!HCBLGNPC;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!XHFSQKPU", name = "t", descriptor = "I")
	protected int anInt850;

	@OriginalMember(owner = "client!XHFSQKPU", name = "u", descriptor = "I")
	protected int anInt851;

	@OriginalMember(owner = "client!XHFSQKPU", name = "v", descriptor = "I")
	public int anInt852;

	@OriginalMember(owner = "client!XHFSQKPU", name = "w", descriptor = "I")
	public int anInt853;

	@OriginalMember(owner = "client!XHFSQKPU", name = "x", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!XHFSQKPU", name = "y", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!XHFSQKPU", name = "z", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!XHFSQKPU", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!XHFSQKPU", name = "B", descriptor = "I")
	protected int anInt857;

	@OriginalMember(owner = "client!XHFSQKPU", name = "C", descriptor = "I")
	protected int anInt858;

	@OriginalMember(owner = "client!XHFSQKPU", name = "D", descriptor = "I")
	protected int anInt859;

	@OriginalMember(owner = "client!XHFSQKPU", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!XHFSQKPU", name = "H", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!XHFSQKPU", name = "I", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!XHFSQKPU", name = "a", descriptor = "I")
	private int anInt840 = -962;

	@OriginalMember(owner = "client!XHFSQKPU", name = "b", descriptor = "I")
	private int anInt841 = -658;

	@OriginalMember(owner = "client!XHFSQKPU", name = "c", descriptor = "I")
	private int anInt842 = -572;

	@OriginalMember(owner = "client!XHFSQKPU", name = "e", descriptor = "Z")
	private boolean aBoolean219 = true;

	@OriginalMember(owner = "client!XHFSQKPU", name = "g", descriptor = "I")
	private int anInt845 = 20;

	@OriginalMember(owner = "client!XHFSQKPU", name = "h", descriptor = "I")
	protected int anInt846 = 1;

	@OriginalMember(owner = "client!XHFSQKPU", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!XHFSQKPU", name = "k", descriptor = "Z")
	protected boolean aBoolean220 = false;

	@OriginalMember(owner = "client!XHFSQKPU", name = "p", descriptor = "[Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array3 = new Class1_Sub1_Sub3_Sub1[6];

	@OriginalMember(owner = "client!XHFSQKPU", name = "r", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!XHFSQKPU", name = "s", descriptor = "Z")
	protected boolean aBoolean222 = true;

	@OriginalMember(owner = "client!XHFSQKPU", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!XHFSQKPU", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!XHFSQKPU", name = "a", descriptor = "(III)V")
	protected final void method569() {
		try {
			this.anInt848 = 765;
			this.anInt849 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt848, this.anInt849, this, (byte) 26);
			this.aGraphics2 = this.method579().getGraphics();
			this.aClass12_2 = new Class12(this.method579(), -4368, this.anInt849, this.anInt848);
			this.method580(this, 1);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("72410, " + 503 + ", " + -572 + ", " + 765 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "b", descriptor = "(III)V")
	protected final void method570() {
		try {
			this.anInt848 = 765;
			this.anInt849 = 503;
			this.aGraphics2 = this.method579().getGraphics();
			this.aClass12_2 = new Class12(this.method579(), -4368, this.anInt849, this.anInt848);
			this.method580(this, 1);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("15402, " + 503 + ", " + 4 + ", " + 765 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method579().addMouseListener(this);
		this.method579().addMouseMotionListener(this);
		this.method579().addKeyListener(this);
		this.method579().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method581(0, "Loading...");
		this.method574();
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
						this.method571(911);
					}
					return;
				}
				if (this.anInt844 > 0) {
					this.anInt844--;
					if (this.anInt844 == 0) {
						this.method571(911);
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
					this.method575();
					this.anInt860 = this.anInt861;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt845 > 0) {
					this.anInt847 = local39 * 1000 / (this.anInt845 * 256);
				}
				this.method577(350);
			} while (!this.aBoolean220);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt847 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt845 + " mindel:" + this.anInt846);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean220 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "a", descriptor = "(I)V")
	private void method571(@OriginalArg(0) int arg0) {
		try {
			this.anInt844 = -2;
			@Pc(6) boolean local6 = false;
			this.method576((byte) 1);
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
			signlink.reporterror("38041, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "a", descriptor = "(II)V")
	protected final void method572() {
		try {
			this.anInt845 = 1000;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("4500, " + 1 + ", " + -604 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt844 >= 0) {
			this.anInt844 = 0;
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt844 >= 0) {
			this.anInt844 = 4000 / this.anInt845;
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt844 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt844 == -1) {
			this.method571(911);
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean221 = true;
		this.method578();
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean221 = true;
		this.method578();
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!XHFSQKPU", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt850 = 0;
		this.anInt851 = 0;
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt850 = 0;
		this.anInt852 = -1;
		this.anInt853 = -1;
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!XHFSQKPU", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
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

	@OriginalMember(owner = "client!XHFSQKPU", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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

	@OriginalMember(owner = "client!XHFSQKPU", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
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

	@OriginalMember(owner = "client!XHFSQKPU", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "a", descriptor = "(Z)I")
	protected final int method573() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt861 != this.anInt860) {
				local1 = this.anIntArray211[this.anInt860];
				this.anInt860 = this.anInt860 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("73491, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean222 = true;
		this.aBoolean221 = true;
		this.method578();
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean222 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "a", descriptor = "()V")
	protected void method574() {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "a", descriptor = "(B)V")
	protected void method575() {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "b", descriptor = "(B)V")
	protected void method576(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("73110, " + arg0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "b", descriptor = "(I)V")
	protected void method577(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "c", descriptor = "(I)V")
	protected void method578() {
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	protected Component method579() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("52438, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method580(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!XHFSQKPU", name = "a", descriptor = "(IILjava/lang/String;)V")
	protected void method581(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method579().getGraphics();
				try {
					this.method579().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method579().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method579().getFontMetrics(local49);
			if (this.aBoolean221) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt848, this.anInt849);
				this.aBoolean221 = false;
			}
			@Pc(94) Color local94 = new Color(140, 17, 17);
			@Pc(101) int local101 = this.anInt849 / 2 - 18;
			this.aGraphics2.setColor(local94);
			this.aGraphics2.drawRect(this.anInt848 / 2 - 152, local101, 304, 34);
			this.aGraphics2.fillRect(this.anInt848 / 2 - 150, local101 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt848 / 2 + arg0 * 3 - 150, local101 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt848 - local42.stringWidth(arg1)) / 2, local101 + 22);
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("21622, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}
}
