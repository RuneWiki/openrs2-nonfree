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

@OriginalClass("client!MKANHSMC")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!MKANHSMC", name = "c", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!MKANHSMC", name = "f", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!MKANHSMC", name = "j", descriptor = "I")
	protected int anInt835;

	@OriginalMember(owner = "client!MKANHSMC", name = "l", descriptor = "I")
	protected int anInt836;

	@OriginalMember(owner = "client!MKANHSMC", name = "m", descriptor = "I")
	protected int anInt837;

	@OriginalMember(owner = "client!MKANHSMC", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!MKANHSMC", name = "o", descriptor = "Lclient!DTPUNZHN;")
	protected Class11 aClass11_2;

	@OriginalMember(owner = "client!MKANHSMC", name = "q", descriptor = "Lclient!GLDYLWRM;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!MKANHSMC", name = "t", descriptor = "I")
	protected int anInt838;

	@OriginalMember(owner = "client!MKANHSMC", name = "u", descriptor = "I")
	protected int anInt839;

	@OriginalMember(owner = "client!MKANHSMC", name = "v", descriptor = "I")
	public int anInt840;

	@OriginalMember(owner = "client!MKANHSMC", name = "w", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!MKANHSMC", name = "x", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!MKANHSMC", name = "y", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!MKANHSMC", name = "z", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!MKANHSMC", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!MKANHSMC", name = "B", descriptor = "I")
	protected int anInt845;

	@OriginalMember(owner = "client!MKANHSMC", name = "C", descriptor = "I")
	protected int anInt846;

	@OriginalMember(owner = "client!MKANHSMC", name = "D", descriptor = "I")
	protected int anInt847;

	@OriginalMember(owner = "client!MKANHSMC", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!MKANHSMC", name = "H", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!MKANHSMC", name = "I", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!MKANHSMC", name = "b", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!MKANHSMC", name = "d", descriptor = "B")
	private byte aByte20 = 26;

	@OriginalMember(owner = "client!MKANHSMC", name = "e", descriptor = "I")
	private int anInt831 = 451;

	@OriginalMember(owner = "client!MKANHSMC", name = "g", descriptor = "I")
	private int anInt833 = 20;

	@OriginalMember(owner = "client!MKANHSMC", name = "h", descriptor = "I")
	protected int anInt834 = 1;

	@OriginalMember(owner = "client!MKANHSMC", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!MKANHSMC", name = "k", descriptor = "Z")
	protected boolean aBoolean188 = false;

	@OriginalMember(owner = "client!MKANHSMC", name = "p", descriptor = "[Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1[] aClass8_Sub1_Sub2_Sub1Array3 = new Class8_Sub1_Sub2_Sub1[6];

	@OriginalMember(owner = "client!MKANHSMC", name = "r", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!MKANHSMC", name = "s", descriptor = "Z")
	protected boolean aBoolean190 = true;

	@OriginalMember(owner = "client!MKANHSMC", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!MKANHSMC", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(III)V")
	protected final void method574(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt831 = -14;
			}
			this.anInt836 = 765;
			this.anInt837 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(true, this, this.anInt837, this.anInt836);
			this.aGraphics2 = this.method584((byte) 1).getGraphics();
			this.aClass11_2 = new Class11(this.aByte20, this.anInt837, this.anInt836, this.method584((byte) 1));
			this.method585(this, 1);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("35422, " + arg0 + ", " + 503 + ", " + 765 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "b", descriptor = "(III)V")
	protected final void method575() {
		try {
			this.anInt836 = 765;
			this.anInt837 = 503;
			this.aGraphics2 = this.method584((byte) 1).getGraphics();
			this.aClass11_2 = new Class11(this.aByte20, this.anInt837, this.anInt836, this.method584((byte) 1));
			this.method585(this, 1);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("41809, " + 765 + ", " + 503 + ", " + -43024 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method584((byte) 1).addMouseListener(this);
		this.method584((byte) 1).addMouseMotionListener(this);
		this.method584((byte) 1).addKeyListener(this);
		this.method584((byte) 1).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method586("Loading...", 0, (byte) 6);
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
				if (this.anInt832 < 0) {
					if (this.anInt832 == -1) {
						this.method576();
					}
					return;
				}
				if (this.anInt832 > 0) {
					this.anInt832--;
					if (this.anInt832 == 0) {
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
					local39 = (int) ((long) (this.anInt833 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt833 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt833) {
					local41 = this.anInt833;
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
				if (local41 < this.anInt834) {
					local41 = this.anInt834;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt845 = this.anInt842;
					this.anInt846 = this.anInt843;
					this.anInt847 = this.anInt844;
					this.aLong28 = this.aLong27;
					this.anInt842 = 0;
					this.method580((byte) 8);
					this.anInt848 = this.anInt849;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt833 > 0) {
					this.anInt835 = local39 * 1000 / (this.anInt833 * 256);
				}
				this.method582();
			} while (!this.aBoolean188);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt835 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt833 + " mindel:" + this.anInt834);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean188 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(I)V")
	private void method576() {
		try {
			this.anInt832 = -2;
			this.method581();
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
			signlink.reporterror("63876, " + 21668 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(IZ)V")
	protected final void method577() {
		try {
			this.anInt833 = 1000;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("28752, " + 1 + ", " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt832 >= 0) {
			this.anInt832 = 0;
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt832 >= 0) {
			this.anInt832 = 4000 / this.anInt833;
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt832 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt832 == -1) {
			this.method576();
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean189 = true;
		this.method583(this.anInt830);
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean189 = true;
		this.method583(this.anInt830);
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt838 = 0;
		this.anInt843 = local2;
		this.anInt844 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt842 = 2;
			this.anInt839 = 2;
		} else {
			this.anInt842 = 1;
			this.anInt839 = 1;
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt838 = 0;
		this.anInt839 = 0;
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt838 = 0;
		this.anInt840 = -1;
		this.anInt841 = -1;
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt838 = 0;
		this.anInt840 = local2;
		this.anInt841 = local5;
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt838 = 0;
		this.anInt840 = local2;
		this.anInt841 = local5;
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt838 = 0;
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
			this.anIntArray211[this.anInt849] = local10;
			this.anInt849 = this.anInt849 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt838 = 0;
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

	@OriginalMember(owner = "client!MKANHSMC", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "b", descriptor = "(I)I")
	protected final int method578() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt849 != this.anInt848) {
				local7 = this.anIntArray211[this.anInt848];
				this.anInt848 = this.anInt848 + 1 & 0x7F;
			}
			return local7;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("52599, " + -23366 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean190 = true;
		this.aBoolean189 = true;
		this.method583(this.anInt830);
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean190 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "()V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(B)V")
	protected void method580(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "c", descriptor = "(I)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(Z)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "d", descriptor = "(I)V")
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 0) {
				;
			}
		} catch (@Pc(3) RuntimeException local3) {
			signlink.reporterror("57950, " + arg0 + ", " + local3.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "b", descriptor = "(B)Ljava/awt/Component;")
	protected Component method584(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("36156, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method585(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	protected void method586(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method584((byte) 1).getGraphics();
				try {
					this.method584((byte) 1).repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method584((byte) 1).getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method584((byte) 1).getFontMetrics(local49);
			if (this.aBoolean189) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt836, this.anInt837);
				this.aBoolean189 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt837 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt836 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt836 / 2 - 150, local88 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt836 / 2 + arg1 * 3 - 150, local88 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			@Pc(155) boolean local155 = false;
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt836 - local42.stringWidth(arg0)) / 2, local88 + 22);
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("54616, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}
}
