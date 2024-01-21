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

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	protected int anInt237;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	protected int anInt238;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!rb;")
	protected Class36 aClass36_2;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "I")
	protected int anInt239;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	protected int anInt240;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	protected int anInt241;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt242;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	protected int anInt243;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	protected int anInt244;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	protected int anInt245;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	private int anInt231 = 8;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	private int anInt234 = 20;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	protected int anInt235 = 1;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Z")
	protected boolean aBoolean27 = false;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2 = new Class1_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
	protected int[] anIntArray23 = new int[128];

	@OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
	private int[] anIntArray24 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method79() {
		try {
			this.anInt237 = 789;
			this.anInt238 = 532;
			this.aFrame_Sub1_2 = new Frame_Sub1(3, this.anInt238, this.anInt237, this);
			this.aGraphics2 = this.method89().getGraphics();
			this.aClass36_2 = new Class36(this.method89(), this.anInt237, true, this.anInt238);
			this.method90(this, 1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("48444, " + 789 + ", " + 532 + ", " + -946 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(III)V")
	protected final void method80() {
		try {
			this.anInt237 = 789;
			this.anInt238 = 532;
			this.aGraphics2 = this.method89().getGraphics();
			this.aClass36_2 = new Class36(this.method89(), this.anInt237, true, this.anInt238);
			this.method90(this, 1);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("49570, " + -2082 + ", " + 789 + ", " + 532 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method89().addMouseListener(this);
		this.method89().addMouseMotionListener(this);
		this.method89().addKeyListener(this);
		this.method89().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method91(this.anInt232, 0, "Loading...");
		this.method84();
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 256;
		@Pc(42) int local42 = 1;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < 10; local48++) {
			this.aLongArray2[local48] = System.currentTimeMillis();
		}
		@Pc(61) long local61 = System.currentTimeMillis();
		while (true) {
			@Pc(170) int local170;
			do {
				if (this.anInt233 < 0) {
					if (this.anInt233 == -1) {
						this.method81();
					}
					return;
				}
				if (this.anInt233 > 0) {
					this.anInt233--;
					if (this.anInt233 == 0) {
						this.method81();
						return;
					}
				}
				@Pc(81) int local81 = local40;
				@Pc(83) int local83 = local42;
				local40 = 300;
				local42 = 1;
				local61 = System.currentTimeMillis();
				if (this.aLongArray2[local38] == 0L) {
					local40 = local81;
					local42 = local83;
				} else if (local61 > this.aLongArray2[local38]) {
					local40 = (int) ((long) (this.anInt234 * 2560) / (local61 - this.aLongArray2[local38]));
				}
				if (local40 < 25) {
					local40 = 25;
				}
				if (local40 > 256) {
					local40 = 256;
					local42 = (int) ((long) this.anInt234 - (local61 - this.aLongArray2[local38]) / 10L);
				}
				if (local42 > this.anInt234) {
					local42 = this.anInt234;
				}
				this.aLongArray2[local38] = local61;
				local38 = (local38 + 1) % 10;
				if (local42 > 1) {
					for (local170 = 0; local170 < 10; local170++) {
						if (this.aLongArray2[local170] != 0L) {
							this.aLongArray2[local170] += local42;
						}
					}
				}
				if (local42 < this.anInt235) {
					local42 = this.anInt235;
				}
				try {
					Thread.sleep((long) local42);
				} catch (@Pc(204) InterruptedException local204) {
					local46++;
				}
				while (local44 < 256) {
					this.method85();
					this.anInt243 = 0;
					this.anInt246 = this.anInt247;
					local44 += local40;
				}
				local44 &= 0xFF;
				if (this.anInt234 > 0) {
					this.anInt236 = local40 * 1000 / (this.anInt234 * 256);
				}
				this.method87((byte) 4);
			} while (!this.aBoolean27);
			System.out.println("ntime:" + local61);
			for (local170 = 0; local170 < 10; local170++) {
				@Pc(270) int local270 = (local38 + 20 - local170 - 1) % 10;
				System.out.println("otim" + local270 + ":" + this.aLongArray2[local270]);
			}
			System.out.println("fps:" + this.anInt236 + " ratio:" + local40 + " count:" + local44);
			System.out.println("del:" + local42 + " deltime:" + this.anInt234 + " mindel:" + this.anInt235);
			System.out.println("intex:" + local46 + " opos:" + local38);
			this.aBoolean27 = false;
			local46 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	private void method81() {
		try {
			this.anInt233 = -2;
			this.method86();
			try {
				Thread.sleep(1000L);
			} catch (@Pc(15) Exception local15) {
			}
			try {
				System.exit(0);
			} catch (@Pc(19) Throwable local19) {
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("60767, " + -19960 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	protected final void method82() {
		try {
			this.anInt234 = 1000;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("26962, " + -165 + ", " + 1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt233 >= 0) {
			this.anInt233 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt233 >= 0) {
			this.anInt233 = 4000 / this.anInt234;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt233 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt233 == -1) {
			this.method81();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean28 = true;
		this.method88();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean28 = true;
		this.method88();
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
		this.anInt239 = 0;
		this.anInt244 = local2;
		this.anInt245 = local5;
		if (arg0.isMetaDown()) {
			this.anInt243 = 2;
			this.anInt240 = 2;
		} else {
			this.anInt243 = 1;
			this.anInt240 = 1;
		}
		if (Class10.aBoolean99) {
			Class10.method261(local2, arg0.isMetaDown() ? 1 : 0, local5);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt239 = 0;
		this.anInt240 = 0;
		if (Class10.aBoolean99) {
			Class10.method262(arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class10.aBoolean99) {
			Class10.method268();
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Class10.aBoolean99) {
			Class10.method269();
		}
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
		this.anInt239 = 0;
		this.anInt241 = local2;
		this.anInt242 = local5;
		if (Class10.aBoolean99) {
			Class10.method263(local5, local2);
		}
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
		this.anInt239 = 0;
		this.anInt241 = local2;
		this.anInt242 = local5;
		if (Class10.aBoolean99) {
			Class10.method263(local5, local2);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt239 = 0;
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
			this.anIntArray23[local10] = 1;
		}
		if (local10 > 4) {
			this.anIntArray24[this.anInt247] = local10;
			this.anInt247 = this.anInt247 + 1 & 0x7F;
		}
		if (Class10.aBoolean99) {
			Class10.method264(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt239 = 0;
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
			this.anIntArray23[local8] = 0;
		}
		if (Class10.aBoolean99) {
			Class10.method265(local8);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean28 = true;
		this.method88();
		if (Class10.aBoolean99) {
			Class10.method266();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Class10.aBoolean99) {
			Class10.method267(785);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)I")
	protected final int method83() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt247 != this.anInt246) {
				local11 = this.anIntArray24[this.anInt246];
				this.anInt246 = this.anInt246 + 1 & 0x7F;
			}
			return local11;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("18329, " + 5 + ", " + local33.toString());
			throw new RuntimeException();
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
	protected void method84() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	protected void method85() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
	protected void method86() {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V")
	protected void method87(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("9337, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	protected void method88() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Ljava/awt/Component;")
	protected Component method89() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("20526, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method90(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILjava/lang/String;)V")
	protected void method91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method89().getGraphics();
				try {
					this.method89().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method89().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method89().getFontMetrics(local49);
			if (this.aBoolean28) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt237, this.anInt238);
				this.aBoolean28 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt238 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt237 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt237 / 2 - 150, local88 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt237 / 2 + arg1 * 3 - 150, local88 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			if (arg0 == 0) {
				this.aGraphics2.setColor(Color.white);
				this.aGraphics2.drawString(arg2, (this.anInt237 - local42.stringWidth(arg2)) / 2, local88 + 22);
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("4645, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}
}
