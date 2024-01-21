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

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	protected int anInt188;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	protected int anInt189;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	protected int anInt190;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!qb;")
	protected Class35 aClass35_2;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt191;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	protected int anInt192;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	protected int anInt198;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	protected int anInt199;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "I")
	protected int anInt200;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "J")
	protected long aLong13;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "B")
	private byte aByte5 = -114;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "B")
	private byte aByte6 = 8;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	private int anInt184 = 8;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	private int anInt186 = 20;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	protected int anInt187 = 1;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Z")
	protected boolean aBoolean38 = false;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2 = new Class1_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Z")
	protected boolean aBoolean40 = true;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
	protected int[] anIntArray30 = new int[128];

	@OriginalMember(owner = "client!a", name = "G", descriptor = "[I")
	private int[] anIntArray31 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method84() {
		try {
			this.anInt189 = 765;
			this.anInt190 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt190, this.anInt189, false, this);
			this.aGraphics2 = this.method94().getGraphics();
			this.aClass35_2 = new Class35(this.aByte6, this.anInt189, this.anInt190, this.method94());
			this.method95(this, 1);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("70685, " + 765 + ", " + 503 + ", " + 373 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)V")
	protected final void method85() {
		try {
			this.anInt189 = 765;
			this.anInt190 = 503;
			this.aGraphics2 = this.method94().getGraphics();
			this.aClass35_2 = new Class35(this.aByte6, this.anInt189, this.anInt190, this.method94());
			this.method95(this, 1);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("85773, " + 503 + ", " + 21 + ", " + 765 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method94().addMouseListener(this);
		this.method94().addMouseMotionListener(this);
		this.method94().addKeyListener(this);
		this.method94().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method96(0, "Loading...", (byte) 7);
		this.method89();
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
				if (this.anInt185 < 0) {
					if (this.anInt185 == -1) {
						this.method86();
					}
					return;
				}
				if (this.anInt185 > 0) {
					this.anInt185--;
					if (this.anInt185 == 0) {
						this.method86();
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
					local39 = (int) ((long) (this.anInt186 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt186 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt186) {
					local41 = this.anInt186;
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
				if (local41 < this.anInt187) {
					local41 = this.anInt187;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt198 = this.anInt195;
					this.anInt199 = this.anInt196;
					this.anInt200 = this.anInt197;
					this.aLong13 = this.aLong12;
					this.anInt195 = 0;
					this.method90();
					this.anInt201 = this.anInt202;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt186 > 0) {
					this.anInt188 = local39 * 1000 / (this.anInt186 * 256);
				}
				this.method92();
			} while (!this.aBoolean38);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt188 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt186 + " mindel:" + this.anInt187);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean38 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	private void method86() {
		try {
			this.anInt185 = -2;
			this.method91();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(21) Exception local21) {
				}
				try {
					System.exit(0);
				} catch (@Pc(25) Throwable local25) {
				}
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("8542, " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
	protected final void method87() {
		try {
			this.anInt186 = 1000;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("36569, " + -114 + ", " + 1 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt185 >= 0) {
			this.anInt185 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt185 >= 0) {
			this.anInt185 = 4000 / this.anInt186;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt185 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt185 == -1) {
			this.method86();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean39 = true;
		this.method93();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean39 = true;
		this.method93();
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
		this.anInt191 = 0;
		this.anInt196 = local2;
		this.anInt197 = local5;
		this.aLong12 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt195 = 2;
			this.anInt192 = 2;
		} else {
			this.anInt195 = 1;
			this.anInt192 = 1;
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt191 = 0;
		this.anInt192 = 0;
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
		this.anInt191 = 0;
		this.anInt193 = -1;
		this.anInt194 = -1;
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
		this.anInt191 = 0;
		this.anInt193 = local2;
		this.anInt194 = local5;
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
		this.anInt191 = 0;
		this.anInt193 = local2;
		this.anInt194 = local5;
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt191 = 0;
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
			this.anIntArray31[this.anInt202] = local10;
			this.anInt202 = this.anInt202 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt191 = 0;
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

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
	protected final int method88() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt202 != this.anInt201) {
				local1 = this.anIntArray31[this.anInt201];
				this.anInt201 = this.anInt201 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("52582, " + 8 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean40 = true;
		this.aBoolean39 = true;
		this.method93();
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean40 = false;
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
	protected void method89() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	protected void method90() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method91() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	protected void method92() {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	protected void method93() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Ljava/awt/Component;")
	protected Component method94() {
		try {
			if (this.aByte5 != -114) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("31301, " + -114 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method95(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/lang/String;B)V")
	protected void method96(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method94().getGraphics();
				try {
					this.method94().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method94().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method94().getFontMetrics(local49);
			if (this.aBoolean39) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt189, this.anInt190);
				this.aBoolean39 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(86) boolean local86 = false;
			@Pc(98) int local98 = this.anInt190 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt189 / 2 - 152, local98, 304, 34);
			this.aGraphics2.fillRect(this.anInt189 / 2 - 150, local98 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt189 / 2 + arg0 * 3 - 150, local98 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt189 - local42.stringWidth(arg1)) / 2, local98 + 22);
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("93911, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}
}
