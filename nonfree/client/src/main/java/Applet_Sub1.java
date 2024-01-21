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

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	protected int anInt230;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	protected int anInt231;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!rb;")
	protected Class36 aClass36_2;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	protected int anInt232;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	protected int anInt233;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	protected int anInt234;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	protected int anInt235;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	protected int anInt236;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	protected int anInt237;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	protected int anInt238;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	private int anInt224 = 800;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	private int anInt225 = 495;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "B")
	private byte aByte10 = 0;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "B")
	private byte aByte11 = 0;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "B")
	private byte aByte12 = 68;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "B")
	private byte aByte13 = -43;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "B")
	private byte aByte14 = 9;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	private int anInt227 = 20;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	protected int anInt228 = 1;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Z")
	protected boolean aBoolean32 = false;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2 = new Class1_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "[I")
	protected int[] anIntArray23 = new int[128];

	@OriginalMember(owner = "client!a", name = "D", descriptor = "[I")
	private int[] anIntArray24 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method79() {
		try {
			this.anInt230 = 789;
			this.anInt231 = 532;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt230, (byte) 81, this.anInt231, this);
			this.aGraphics2 = this.method89(this.aByte14).getGraphics();
			this.aClass36_2 = new Class36((byte) 9, this.anInt231, this.anInt230, this.method89(this.aByte14));
			this.method90(this, 1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("67543, " + 789 + ", " + 532 + ", " + 587 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(III)V")
	protected final void method80() {
		try {
			this.anInt230 = 789;
			this.anInt231 = 532;
			this.aGraphics2 = this.method89(this.aByte14).getGraphics();
			this.aClass36_2 = new Class36((byte) 9, this.anInt231, this.anInt230, this.method89(this.aByte14));
			this.method90(this, 1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("88937, " + 0 + ", " + 532 + ", " + 789 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method89(this.aByte14).addMouseListener(this);
		this.method89(this.aByte14).addMouseMotionListener(this);
		this.method89(this.aByte14).addKeyListener(this);
		this.method89(this.aByte14).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method91("Loading...", 0);
		this.method84();
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
				if (this.anInt226 < 0) {
					if (this.anInt226 == -1) {
						this.method81();
					}
					return;
				}
				if (this.anInt226 > 0) {
					this.anInt226--;
					if (this.anInt226 == 0) {
						this.method81();
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
					local43 = (int) ((long) (this.anInt227 * 2560) / (local64 - this.aLongArray2[local41]));
				}
				if (local43 < 25) {
					local43 = 25;
				}
				if (local43 > 256) {
					local43 = 256;
					local45 = (int) ((long) this.anInt227 - (local64 - this.aLongArray2[local41]) / 10L);
				}
				if (local45 > this.anInt227) {
					local45 = this.anInt227;
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
				if (local45 < this.anInt228) {
					local45 = this.anInt228;
				}
				try {
					Thread.sleep((long) local45);
				} catch (@Pc(207) InterruptedException local207) {
					local49++;
				}
				while (local47 < 256) {
					this.method85();
					this.anInt236 = 0;
					this.anInt239 = this.anInt240;
					local47 += local43;
				}
				local47 &= 0xFF;
				if (this.anInt227 > 0) {
					this.anInt229 = local43 * 1000 / (this.anInt227 * 256);
				}
				this.method87(447);
			} while (!this.aBoolean32);
			System.out.println("ntime:" + local64);
			for (local173 = 0; local173 < 10; local173++) {
				@Pc(273) int local273 = (local41 + 20 - local173 - 1) % 10;
				System.out.println("otim" + local273 + ":" + this.aLongArray2[local273]);
			}
			System.out.println("fps:" + this.anInt229 + " ratio:" + local43 + " count:" + local47);
			System.out.println("del:" + local45 + " deltime:" + this.anInt227 + " mindel:" + this.anInt228);
			System.out.println("intex:" + local49 + " opos:" + local41);
			this.aBoolean32 = false;
			local49 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	private void method81() {
		try {
			this.anInt226 = -2;
			this.method86();
			if (this.aByte10 == 0) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(14) Exception local14) {
				}
				try {
					System.exit(0);
				} catch (@Pc(18) Throwable local18) {
				}
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("55621, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
	protected final void method82() {
		try {
			if (this.aByte11 == 0) {
				this.anInt227 = 1000;
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("16302, " + 1 + ", " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt226 >= 0) {
			this.anInt226 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt226 >= 0) {
			this.anInt226 = 4000 / this.anInt227;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt226 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt226 == -1) {
			this.method81();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean33 = true;
		this.method88();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean33 = true;
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
		this.anInt232 = 0;
		this.anInt237 = local2;
		this.anInt238 = local5;
		if (arg0.isMetaDown()) {
			this.anInt236 = 2;
			this.anInt233 = 2;
		} else {
			this.anInt236 = 1;
			this.anInt233 = 1;
		}
		if (Class10.aBoolean105) {
			Class10.method262(arg0.isMetaDown() ? 1 : 0, (byte) 7, local2, local5);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt232 = 0;
		this.anInt233 = 0;
		if (Class10.aBoolean105) {
			Class10.method263(arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class10.aBoolean105) {
			Class10.method269();
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Class10.aBoolean105) {
			Class10.method270();
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
		this.anInt232 = 0;
		this.anInt234 = local2;
		this.anInt235 = local5;
		if (Class10.aBoolean105) {
			Class10.method264(local5, local2);
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
		this.anInt232 = 0;
		this.anInt234 = local2;
		this.anInt235 = local5;
		if (Class10.aBoolean105) {
			Class10.method264(local5, local2);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt232 = 0;
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
			this.anIntArray24[this.anInt240] = local10;
			this.anInt240 = this.anInt240 + 1 & 0x7F;
		}
		if (Class10.aBoolean105) {
			Class10.method265(local10, (byte) 7);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt232 = 0;
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
		if (Class10.aBoolean105) {
			Class10.method266(this.anInt225, local8);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean33 = true;
		this.method88();
		if (Class10.aBoolean105) {
			Class10.method267((byte) 5);
		}
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Class10.aBoolean105) {
			Class10.method268();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)I")
	protected final int method83(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = -1;
			@Pc(8) boolean local8 = false;
			if (this.anInt240 != this.anInt239) {
				local3 = this.anIntArray24[this.anInt239];
				this.anInt239 = this.anInt239 + 1 & 0x7F;
			}
			return local3;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("13123, " + arg0 + ", " + local39.toString());
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

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	protected void method85() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
	protected void method86() {
		try {
			if (this.aByte12 != 68) {
				this.anInt224 = 473;
			}
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("42436, " + 68 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	protected void method87(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("91831, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V")
	protected void method88() {
		try {
			if (this.aByte13 != -43) {
				this.aBoolean31 = !this.aBoolean31;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("92543, " + -43 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(B)Ljava/awt/Component;")
	protected Component method89(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 9) {
				@Pc(4) boolean local4 = false;
			} else {
				this.aBoolean31 = !this.aBoolean31;
			}
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("50377, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method90(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	protected void method91(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method89(this.aByte14).getGraphics();
				try {
					this.method89(this.aByte14).repaint();
				} catch (@Pc(23) Exception local23) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(27) Exception local27) {
				}
			}
			@Pc(38) Font local38 = new Font("Helvetica", 1, 13);
			@Pc(45) FontMetrics local45 = this.method89(this.aByte14).getFontMetrics(local38);
			@Pc(52) Font local52 = new Font("Helvetica", 0, 13);
			this.method89(this.aByte14).getFontMetrics(local52);
			if (this.aBoolean33) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt230, this.anInt231);
				this.aBoolean33 = false;
			}
			@Pc(85) Color local85 = new Color(140, 17, 17);
			@Pc(92) int local92 = this.anInt231 / 2 - 18;
			this.aGraphics2.setColor(local85);
			this.aGraphics2.drawRect(this.anInt230 / 2 - 152, local92, 304, 34);
			this.aGraphics2.fillRect(this.anInt230 / 2 - 150, local92 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt230 / 2 + arg1 * 3 - 150, local92 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local38);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt230 - local45.stringWidth(arg0)) / 2, local92 + 22);
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("56675, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}
}
