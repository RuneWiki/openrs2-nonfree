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

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	protected int anInt191;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	protected int anInt192;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!qb;")
	protected Class35 aClass35_2;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt193;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	protected int anInt194;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	protected int anInt200;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	protected int anInt201;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "I")
	protected int anInt202;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "J")
	protected long aLong13;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
	private boolean aBoolean38 = true;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "B")
	private byte aByte4 = 7;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	private int anInt185 = 2;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	private int anInt186 = 5;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	private int anInt188 = 20;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	protected int anInt189 = 1;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Z")
	protected boolean aBoolean40 = false;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2 = new Class1_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Z")
	private boolean aBoolean41 = true;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Z")
	protected boolean aBoolean42 = true;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
	protected int[] anIntArray29 = new int[128];

	@OriginalMember(owner = "client!a", name = "G", descriptor = "[I")
	private int[] anIntArray30 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZII)V")
	protected final void method83() {
		try {
			this.anInt191 = 765;
			this.anInt192 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, this.anInt191, this.anInt192, 0);
			this.aGraphics2 = this.method93(this.aByte4).getGraphics();
			this.aClass35_2 = new Class35(this.anInt192, this.anInt185, this.anInt191, this.method93(this.aByte4));
			this.method94(this, 1);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("82199, " + false + ", " + 765 + ", " + 503 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIB)V")
	protected final void method84() {
		try {
			this.anInt191 = 765;
			this.anInt192 = 503;
			this.aGraphics2 = this.method93(this.aByte4).getGraphics();
			this.aClass35_2 = new Class35(this.anInt192, this.anInt185, this.anInt191, this.method93(this.aByte4));
			this.method94(this, 1);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("70689, " + 503 + ", " + 765 + ", " + 23 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method93(this.aByte4).addMouseListener(this);
		this.method93(this.aByte4).addMouseMotionListener(this);
		this.method93(this.aByte4).addKeyListener(this);
		this.method93(this.aByte4).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method95("Loading...", 0);
		this.method88();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		@Pc(45) int local45 = 1;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			this.aLongArray2[local51] = System.currentTimeMillis();
		}
		@Pc(64) long local64 = System.currentTimeMillis();
		while (true) {
			@Pc(173) int local173;
			do {
				if (this.anInt187 < 0) {
					if (this.anInt187 == -1) {
						this.method85();
					}
					return;
				}
				if (this.anInt187 > 0) {
					this.anInt187--;
					if (this.anInt187 == 0) {
						this.method85();
						return;
					}
				}
				@Pc(84) int local84 = local43;
				@Pc(86) int local86 = local45;
				local43 = 300;
				local45 = 1;
				local64 = System.currentTimeMillis();
				if (this.aLongArray2[local41] == 0L) {
					local43 = local84;
					local45 = local86;
				} else if (local64 > this.aLongArray2[local41]) {
					local43 = (int) ((long) (this.anInt188 * 2560) / (local64 - this.aLongArray2[local41]));
				}
				if (local43 < 25) {
					local43 = 25;
				}
				if (local43 > 256) {
					local43 = 256;
					local45 = (int) ((long) this.anInt188 - (local64 - this.aLongArray2[local41]) / 10L);
				}
				if (local45 > this.anInt188) {
					local45 = this.anInt188;
				}
				this.aLongArray2[local41] = local64;
				local41 = (local41 + 1) % 10;
				if (local45 > 1) {
					for (local173 = 0; local173 < 10; local173++) {
						if (this.aLongArray2[local173] != 0L) {
							this.aLongArray2[local173] += local45;
						}
					}
				}
				if (local45 < this.anInt189) {
					local45 = this.anInt189;
				}
				try {
					Thread.sleep((long) local45);
				} catch (@Pc(207) InterruptedException local207) {
					local49++;
				}
				while (local47 < 256) {
					this.anInt200 = this.anInt197;
					this.anInt201 = this.anInt198;
					this.anInt202 = this.anInt199;
					this.aLong13 = this.aLong12;
					this.anInt197 = 0;
					this.method89();
					this.anInt203 = this.anInt204;
					local47 += local43;
				}
				local47 &= 0xFF;
				if (this.anInt188 > 0) {
					this.anInt190 = local43 * 1000 / (this.anInt188 * 256);
				}
				this.method91();
			} while (!this.aBoolean40);
			System.out.println("ntime:" + local64);
			for (local173 = 0; local173 < 10; local173++) {
				@Pc(289) int local289 = (local41 + 20 - local173 - 1) % 10;
				System.out.println("otim" + local289 + ":" + this.aLongArray2[local289]);
			}
			System.out.println("fps:" + this.anInt190 + " ratio:" + local43 + " count:" + local47);
			System.out.println("del:" + local45 + " deltime:" + this.anInt188 + " mindel:" + this.anInt189);
			System.out.println("intex:" + local49 + " opos:" + local41);
			this.aBoolean40 = false;
			local49 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	private void method85() {
		try {
			this.anInt187 = -2;
			this.method90();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(22) Exception local22) {
				}
				try {
					System.exit(0);
				} catch (@Pc(26) Throwable local26) {
				}
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("99945, " + 6568 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	protected final void method86() {
		try {
			this.anInt188 = 1000;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("63213, " + -27605 + ", " + 1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt187 >= 0) {
			this.anInt187 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt187 >= 0) {
			this.anInt187 = 4000 / this.anInt188;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt187 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt187 == -1) {
			this.method85();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean41 = true;
		this.method92(148);
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean41 = true;
		this.method92(148);
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
		this.anInt193 = 0;
		this.anInt198 = local2;
		this.anInt199 = local5;
		this.aLong12 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt197 = 2;
			this.anInt194 = 2;
		} else {
			this.anInt197 = 1;
			this.anInt194 = 1;
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt193 = 0;
		this.anInt194 = 0;
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
		this.anInt193 = 0;
		this.anInt195 = -1;
		this.anInt196 = -1;
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
		this.anInt193 = 0;
		this.anInt195 = local2;
		this.anInt196 = local5;
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
		this.anInt193 = 0;
		this.anInt195 = local2;
		this.anInt196 = local5;
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt193 = 0;
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
			this.anIntArray29[local10] = 1;
		}
		if (local10 > 4) {
			this.anIntArray30[this.anInt204] = local10;
			this.anInt204 = this.anInt204 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt193 = 0;
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
			this.anIntArray29[local8] = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)I")
	protected final int method87() {
		try {
			@Pc(6) int local6 = -1;
			if (this.anInt204 != this.anInt203) {
				local6 = this.anIntArray30[this.anInt203];
				this.anInt203 = this.anInt203 + 1 & 0x7F;
			}
			return local6;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("64404, " + 5 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean42 = true;
		this.aBoolean41 = true;
		this.method92(148);
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean42 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray29[local4] = 0;
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

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	protected void method89() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method90() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	protected void method91() {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	protected void method92(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("51714, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Ljava/awt/Component;")
	protected Component method93(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 7) {
				throw new NullPointerException();
			}
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("4890, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method94(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;II)V")
	protected void method95(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method93(this.aByte4).getGraphics();
				try {
					this.method93(this.aByte4).repaint();
				} catch (@Pc(23) Exception local23) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(27) Exception local27) {
				}
			}
			@Pc(38) Font local38 = new Font("Helvetica", 1, 13);
			@Pc(58) FontMetrics local58 = this.method93(this.aByte4).getFontMetrics(local38);
			@Pc(65) Font local65 = new Font("Helvetica", 0, 13);
			this.method93(this.aByte4).getFontMetrics(local65);
			if (this.aBoolean41) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt191, this.anInt192);
				this.aBoolean41 = false;
			}
			@Pc(98) Color local98 = new Color(140, 17, 17);
			@Pc(105) int local105 = this.anInt192 / 2 - 18;
			this.aGraphics2.setColor(local98);
			this.aGraphics2.drawRect(this.anInt191 / 2 - 152, local105, 304, 34);
			this.aGraphics2.fillRect(this.anInt191 / 2 - 150, local105 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt191 / 2 + arg1 * 3 - 150, local105 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local38);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt191 - local58.stringWidth(arg0)) / 2, local105 + 22);
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("67039, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}
}
