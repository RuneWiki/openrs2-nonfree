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

@OriginalClass("client!MKNKYTZT")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!MKNKYTZT", name = "c", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!MKNKYTZT", name = "g", descriptor = "I")
	protected int anInt843;

	@OriginalMember(owner = "client!MKNKYTZT", name = "i", descriptor = "I")
	protected int anInt844;

	@OriginalMember(owner = "client!MKNKYTZT", name = "j", descriptor = "I")
	protected int anInt845;

	@OriginalMember(owner = "client!MKNKYTZT", name = "k", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!MKNKYTZT", name = "l", descriptor = "Lclient!YZGYDKDO;")
	protected Class48 aClass48_2;

	@OriginalMember(owner = "client!MKNKYTZT", name = "n", descriptor = "Lclient!SGXZRDZF;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!MKNKYTZT", name = "q", descriptor = "I")
	protected int anInt846;

	@OriginalMember(owner = "client!MKNKYTZT", name = "r", descriptor = "I")
	protected int anInt847;

	@OriginalMember(owner = "client!MKNKYTZT", name = "s", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!MKNKYTZT", name = "t", descriptor = "I")
	public int anInt849;

	@OriginalMember(owner = "client!MKNKYTZT", name = "u", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!MKNKYTZT", name = "v", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!MKNKYTZT", name = "w", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!MKNKYTZT", name = "x", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!MKNKYTZT", name = "y", descriptor = "I")
	protected int anInt853;

	@OriginalMember(owner = "client!MKNKYTZT", name = "z", descriptor = "I")
	protected int anInt854;

	@OriginalMember(owner = "client!MKNKYTZT", name = "A", descriptor = "I")
	protected int anInt855;

	@OriginalMember(owner = "client!MKNKYTZT", name = "B", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!MKNKYTZT", name = "E", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!MKNKYTZT", name = "F", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "Z")
	private boolean aBoolean180 = false;

	@OriginalMember(owner = "client!MKNKYTZT", name = "b", descriptor = "I")
	private int anInt839 = 11419;

	@OriginalMember(owner = "client!MKNKYTZT", name = "d", descriptor = "I")
	private int anInt841 = 20;

	@OriginalMember(owner = "client!MKNKYTZT", name = "e", descriptor = "I")
	protected int anInt842 = 1;

	@OriginalMember(owner = "client!MKNKYTZT", name = "f", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!MKNKYTZT", name = "h", descriptor = "Z")
	protected boolean aBoolean181 = false;

	@OriginalMember(owner = "client!MKNKYTZT", name = "m", descriptor = "[Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!MKNKYTZT", name = "o", descriptor = "Z")
	private boolean aBoolean182 = true;

	@OriginalMember(owner = "client!MKNKYTZT", name = "p", descriptor = "Z")
	protected boolean aBoolean183 = true;

	@OriginalMember(owner = "client!MKNKYTZT", name = "C", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!MKNKYTZT", name = "D", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(III)V")
	protected final void method576() {
		try {
			this.anInt844 = 765;
			this.anInt845 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, true, this.anInt844, this.anInt845);
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass48_2 = new Class48(this.method586(), this.anInt844, this.anInt845, (byte) 52);
			this.method587(this, 1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("46476, " + 503 + ", " + -92 + ", " + 765 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "b", descriptor = "(III)V")
	protected final void method577() {
		try {
			this.anInt844 = 765;
			this.anInt845 = 503;
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass48_2 = new Class48(this.method586(), this.anInt844, this.anInt845, (byte) 52);
			this.method587(this, 1);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("48820, " + 503 + ", " + 35865 + ", " + 765 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method586().addMouseListener(this);
		this.method586().addMouseMotionListener(this);
		this.method586().addKeyListener(this);
		this.method586().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588(0, "Loading...", (byte) 1);
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
				if (this.anInt840 < 0) {
					if (this.anInt840 == -1) {
						this.method578(92);
					}
					return;
				}
				if (this.anInt840 > 0) {
					this.anInt840--;
					if (this.anInt840 == 0) {
						this.method578(92);
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
					local39 = (int) ((long) (this.anInt841 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt841 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt841) {
					local41 = this.anInt841;
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
				if (local41 < this.anInt842) {
					local41 = this.anInt842;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt853 = this.anInt850;
					this.anInt854 = this.anInt851;
					this.anInt855 = this.anInt852;
					this.aLong28 = this.aLong27;
					this.anInt850 = 0;
					this.method582();
					this.anInt856 = this.anInt857;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt841 > 0) {
					this.anInt843 = local39 * 1000 / (this.anInt841 * 256);
				}
				this.method584();
			} while (!this.aBoolean181);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt843 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt841 + " mindel:" + this.anInt842);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean181 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(I)V")
	private void method578(@OriginalArg(0) int arg0) {
		try {
			this.anInt840 = -2;
			this.method583();
			@Pc(9) boolean local9 = false;
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
			signlink.reporterror("22361, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(II)V")
	protected final void method579(@OriginalArg(0) int arg0) {
		try {
			this.anInt841 = 1000;
			@Pc(8) boolean local8 = false;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("85084, " + arg0 + ", " + 1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt840 >= 0) {
			this.anInt840 = 0;
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt840 >= 0) {
			this.anInt840 = 4000 / this.anInt841;
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt840 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt840 == -1) {
			this.method578(92);
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean182 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean182 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt846 = 0;
		this.anInt851 = local2;
		this.anInt852 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt850 = 2;
			this.anInt847 = 2;
		} else {
			this.anInt850 = 1;
			this.anInt847 = 1;
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt846 = 0;
		this.anInt847 = 0;
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt846 = 0;
		this.anInt848 = -1;
		this.anInt849 = -1;
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt846 = 0;
		this.anInt848 = local2;
		this.anInt849 = local5;
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt846 = 0;
		this.anInt848 = local2;
		this.anInt849 = local5;
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt846 = 0;
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
			this.anIntArray211[this.anInt857] = local10;
			this.anInt857 = this.anInt857 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt846 = 0;
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

	@OriginalMember(owner = "client!MKNKYTZT", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "b", descriptor = "(I)I")
	protected final int method580() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt857 != this.anInt856) {
				local1 = this.anIntArray211[this.anInt856];
				this.anInt856 = this.anInt856 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("52103, " + -1372 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean183 = true;
		this.aBoolean182 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean183 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "()V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "c", descriptor = "(I)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "d", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(Z)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "e", descriptor = "(I)V")
	protected void method585() {
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "f", descriptor = "(I)Ljava/awt/Component;")
	protected Component method586() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("42508, " + -5092 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(ILjava/lang/String;B)V")
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
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
			if (this.aBoolean182) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt844, this.anInt845);
				this.aBoolean182 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt845 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt844 / 2 - 152, local88, 304, 34);
			@Pc(109) boolean local109 = false;
			this.aGraphics2.fillRect(this.anInt844 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt844 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt844 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("41322, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}
}
