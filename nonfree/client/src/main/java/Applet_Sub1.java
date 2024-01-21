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

@OriginalClass("client!a")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	protected int anInt182;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	protected int anInt183;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!qb;")
	protected Class35 aClass35_2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	protected int anInt184;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt185;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	protected int anInt191;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	protected int anInt192;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	protected int anInt193;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "J")
	protected long aLong13;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	private int anInt175 = -128;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	private int anInt176 = 37395;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	private int anInt177 = -6002;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	private int anInt179 = 20;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	protected int anInt180 = 1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
	protected boolean aBoolean49 = false;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2 = new Class1_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Z")
	protected boolean aBoolean51 = true;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
	protected int[] anIntArray30 = new int[128];

	@OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
	private int[] anIntArray31 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method83() {
		try {
			this.anInt182 = 765;
			this.anInt183 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt183, 27016, this.anInt182, this);
			this.aGraphics2 = this.method93().getGraphics();
			this.aClass35_2 = new Class35(this.method93(), this.anInt182, this.anInt183, 2);
			this.method94(this, 1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("84735, " + 503 + ", " + 765 + ", " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZII)V")
	protected final void method84() {
		try {
			this.anInt182 = 765;
			this.anInt183 = 503;
			this.aGraphics2 = this.method93().getGraphics();
			this.aClass35_2 = new Class35(this.method93(), this.anInt182, this.anInt183, 2);
			this.method94(this, 1);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("72806, " + true + ", " + 765 + ", " + 503 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method93().addMouseListener(this);
		this.method93().addMouseMotionListener(this);
		this.method93().addKeyListener(this);
		this.method93().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method95(0, "Loading...");
		this.method88();
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
				if (this.anInt178 < 0) {
					if (this.anInt178 == -1) {
						this.method85();
					}
					return;
				}
				if (this.anInt178 > 0) {
					this.anInt178--;
					if (this.anInt178 == 0) {
						this.method85();
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
					local39 = (int) ((long) (this.anInt179 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt179 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt179) {
					local41 = this.anInt179;
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
				if (local41 < this.anInt180) {
					local41 = this.anInt180;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt191 = this.anInt188;
					this.anInt192 = this.anInt189;
					this.anInt193 = this.anInt190;
					this.aLong13 = this.aLong12;
					this.anInt188 = 0;
					this.method89();
					this.anInt194 = this.anInt195;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt179 > 0) {
					this.anInt181 = local39 * 1000 / (this.anInt179 * 256);
				}
				this.method91((byte) 1);
			} while (!this.aBoolean49);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt181 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt179 + " mindel:" + this.anInt180);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean49 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	private void method85() {
		try {
			this.anInt178 = -2;
			this.method90(874);
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
			signlink.reporterror("66676, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	protected final void method86() {
		try {
			this.anInt179 = 1000;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("19917, " + 1 + ", " + 711 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt178 >= 0) {
			this.anInt178 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt178 >= 0) {
			this.anInt178 = 4000 / this.anInt179;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt178 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt178 == -1) {
			this.method85();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean50 = true;
		this.method92();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean50 = true;
		this.method92();
	}

	@OriginalMember(owner = "client!a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt184 = 0;
		this.anInt189 = local2;
		this.anInt190 = local5;
		this.aLong12 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt188 = 2;
			this.anInt185 = 2;
		} else {
			this.anInt188 = 1;
			this.anInt185 = 1;
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt184 = 0;
		this.anInt185 = 0;
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt184 = 0;
		this.anInt186 = -1;
		this.anInt187 = -1;
	}

	@OriginalMember(owner = "client!a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt184 = 0;
		this.anInt186 = local2;
		this.anInt187 = local5;
	}

	@OriginalMember(owner = "client!a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt184 = 0;
		this.anInt186 = local2;
		this.anInt187 = local5;
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt184 = 0;
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
			this.anIntArray30[local10] = 1;
		}
		if (local10 > 4) {
			this.anIntArray31[this.anInt195] = local10;
			this.anInt195 = this.anInt195 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt184 = 0;
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
			this.anIntArray30[local8] = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
	protected final int method87() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt195 != this.anInt194) {
				local1 = this.anIntArray31[this.anInt194];
				this.anInt194 = this.anInt194 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("9078, " + -128 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean51 = true;
		this.aBoolean50 = true;
		this.method92();
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean51 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray30[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!a", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
	protected void method88() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method89() {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	protected void method90(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("23302, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	protected void method91(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	protected void method92() {
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Ljava/awt/Component;")
	protected Component method93() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("96176, " + 7 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method94(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZILjava/lang/String;)V")
	protected void method95(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method93().getGraphics();
				try {
					this.method93().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method93().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method93().getFontMetrics(local49);
			if (this.aBoolean50) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt182, this.anInt183);
				this.aBoolean50 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt183 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt182 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt182 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt182 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt182 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("88163, " + false + ", " + arg0 + ", " + arg1 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}
}
