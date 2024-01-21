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

@OriginalClass("client!NCIKLCII")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!NCIKLCII", name = "h", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!NCIKLCII", name = "l", descriptor = "I")
	protected int anInt842;

	@OriginalMember(owner = "client!NCIKLCII", name = "n", descriptor = "I")
	protected int anInt843;

	@OriginalMember(owner = "client!NCIKLCII", name = "o", descriptor = "I")
	protected int anInt844;

	@OriginalMember(owner = "client!NCIKLCII", name = "p", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!NCIKLCII", name = "q", descriptor = "Lclient!IUZTBIWV;")
	protected Class17 aClass17_2;

	@OriginalMember(owner = "client!NCIKLCII", name = "s", descriptor = "Lclient!BLPTISPL;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!NCIKLCII", name = "v", descriptor = "I")
	protected int anInt845;

	@OriginalMember(owner = "client!NCIKLCII", name = "w", descriptor = "I")
	protected int anInt846;

	@OriginalMember(owner = "client!NCIKLCII", name = "x", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!NCIKLCII", name = "y", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!NCIKLCII", name = "z", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!NCIKLCII", name = "A", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!NCIKLCII", name = "B", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!NCIKLCII", name = "C", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!NCIKLCII", name = "D", descriptor = "I")
	protected int anInt852;

	@OriginalMember(owner = "client!NCIKLCII", name = "E", descriptor = "I")
	protected int anInt853;

	@OriginalMember(owner = "client!NCIKLCII", name = "F", descriptor = "I")
	protected int anInt854;

	@OriginalMember(owner = "client!NCIKLCII", name = "G", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!NCIKLCII", name = "J", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!NCIKLCII", name = "K", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "I")
	private int anInt835 = -636;

	@OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "B")
	private byte aByte25 = 5;

	@OriginalMember(owner = "client!NCIKLCII", name = "c", descriptor = "I")
	private int anInt836 = 17935;

	@OriginalMember(owner = "client!NCIKLCII", name = "d", descriptor = "I")
	private int anInt837 = 8607;

	@OriginalMember(owner = "client!NCIKLCII", name = "e", descriptor = "Z")
	private boolean aBoolean207 = true;

	@OriginalMember(owner = "client!NCIKLCII", name = "f", descriptor = "I")
	private int anInt838 = 5200;

	@OriginalMember(owner = "client!NCIKLCII", name = "g", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!NCIKLCII", name = "i", descriptor = "I")
	private int anInt840 = 20;

	@OriginalMember(owner = "client!NCIKLCII", name = "j", descriptor = "I")
	protected int anInt841 = 1;

	@OriginalMember(owner = "client!NCIKLCII", name = "k", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!NCIKLCII", name = "m", descriptor = "Z")
	protected boolean aBoolean209 = false;

	@OriginalMember(owner = "client!NCIKLCII", name = "r", descriptor = "[Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array3 = new Class1_Sub1_Sub2_Sub4[6];

	@OriginalMember(owner = "client!NCIKLCII", name = "t", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!NCIKLCII", name = "u", descriptor = "Z")
	protected boolean aBoolean211 = true;

	@OriginalMember(owner = "client!NCIKLCII", name = "H", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!NCIKLCII", name = "I", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(III)V")
	protected final void method574() {
		try {
			this.anInt843 = 765;
			this.anInt844 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(-965, this.anInt844, this, this.anInt843);
			this.aGraphics2 = this.method584().getGraphics();
			this.aClass17_2 = new Class17(this.method584(), this.anInt843, (byte) 0, this.anInt844);
			this.method585(this, 1);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("26424, " + 0 + ", " + 503 + ", " + 765 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "(III)V")
	protected final void method575() {
		try {
			this.anInt843 = 765;
			this.anInt844 = 503;
			this.aGraphics2 = this.method584().getGraphics();
			this.aClass17_2 = new Class17(this.method584(), this.anInt843, (byte) 0, this.anInt844);
			this.method585(this, 1);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("80607, " + -636 + ", " + 765 + ", " + 503 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method584().addMouseListener(this);
		this.method584().addMouseMotionListener(this);
		this.method584().addKeyListener(this);
		this.method584().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method586("Loading...", 0);
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
				if (this.anInt839 < 0) {
					if (this.anInt839 == -1) {
						this.method576((byte) 8);
					}
					return;
				}
				if (this.anInt839 > 0) {
					this.anInt839--;
					if (this.anInt839 == 0) {
						this.method576((byte) 8);
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
					local39 = (int) ((long) (this.anInt840 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt840 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt840) {
					local41 = this.anInt840;
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
				if (local41 < this.anInt841) {
					local41 = this.anInt841;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt852 = this.anInt849;
					this.anInt853 = this.anInt850;
					this.anInt854 = this.anInt851;
					this.aLong28 = this.aLong27;
					this.anInt849 = 0;
					this.method580();
					this.anInt855 = this.anInt856;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt840 > 0) {
					this.anInt842 = local39 * 1000 / (this.anInt840 * 256);
				}
				this.method582(this.anInt837);
			} while (!this.aBoolean209);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(286) int local286 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt842 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt840 + " mindel:" + this.anInt841);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean209 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(B)V")
	private void method576(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt839 = -2;
			this.method581();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(20) Exception local20) {
				}
				try {
					System.exit(0);
				} catch (@Pc(24) Throwable local24) {
				}
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("4524, " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(BI)V")
	protected final void method577(@OriginalArg(0) byte arg0) {
		try {
			if (this.aByte25 == 5) {
				@Pc(7) boolean local7 = false;
			} else {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			this.anInt840 = 1000;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("62152, " + arg0 + ", " + 1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt839 >= 0) {
			this.anInt839 = 0;
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt839 >= 0) {
			this.anInt839 = 4000 / this.anInt840;
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt839 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt839 == -1) {
			this.method576((byte) 8);
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean210 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean210 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt845 = 0;
		this.anInt850 = local2;
		this.anInt851 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt849 = 2;
			this.anInt846 = 2;
		} else {
			this.anInt849 = 1;
			this.anInt846 = 1;
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt845 = 0;
		this.anInt846 = 0;
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt845 = 0;
		this.anInt847 = -1;
		this.anInt848 = -1;
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt845 = 0;
		this.anInt847 = local2;
		this.anInt848 = local5;
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt845 = 0;
		this.anInt847 = local2;
		this.anInt848 = local5;
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt845 = 0;
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
			this.anIntArray211[this.anInt856] = local10;
			this.anInt856 = this.anInt856 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt845 = 0;
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

	@OriginalMember(owner = "client!NCIKLCII", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "(B)I")
	protected final int method578() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt856 != this.anInt855) {
				local11 = this.anIntArray211[this.anInt855];
				this.anInt855 = this.anInt855 + 1 & 0x7F;
			}
			return local11;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("18140, " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean211 = true;
		this.aBoolean210 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean211 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "()V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(Z)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(I)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "(I)V")
	protected void method582(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 8607) {
				this.aBoolean208 = !this.aBoolean208;
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("78499, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "(Z)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "c", descriptor = "(B)Ljava/awt/Component;")
	protected Component method584() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("36938, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method585(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	protected void method586(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			if (this.aBoolean210) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt843, this.anInt844);
				this.aBoolean210 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(93) int local93 = this.anInt844 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt843 / 2 - 152, local93, 304, 34);
			this.aGraphics2.fillRect(this.anInt843 / 2 - 150, local93 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt843 / 2 + arg1 * 3 - 150, local93 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt843 - local42.stringWidth(arg0)) / 2, local93 + 22);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("19156, " + arg0 + ", " + arg1 + ", " + false + ", " + local176.toString());
			throw new RuntimeException();
		}
	}
}
