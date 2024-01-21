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
	private int anInt221;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	protected int anInt226;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	protected int anInt227;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!rb;")
	protected Class37 aClass37_2;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	protected int anInt228;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	protected int anInt229;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	protected int anInt235;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "I")
	protected int anInt236;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	protected int anInt237;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "J")
	protected long aLong13;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	private int anInt220 = -74;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "B")
	private byte aByte10 = 68;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	private int anInt223 = 20;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	protected int anInt224 = 1;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Z")
	protected boolean aBoolean40 = false;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2 = new Class1_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Z")
	private boolean aBoolean41 = true;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Z")
	protected boolean aBoolean42 = true;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "[I")
	protected int[] anIntArray32 = new int[128];

	@OriginalMember(owner = "client!a", name = "H", descriptor = "[I")
	private int[] anIntArray33 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIB)V")
	protected final void method85() {
		try {
			this.anInt226 = 765;
			this.anInt227 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(false, this.anInt227, this, this.anInt226);
			this.aGraphics2 = this.method95().getGraphics();
			this.aClass37_2 = new Class37(true, this.method95(), this.anInt226, this.anInt227);
			this.method96(this, 1);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("31544, " + 765 + ", " + 503 + ", " + 7 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method86() {
		try {
			this.anInt226 = 765;
			this.anInt227 = 503;
			this.aGraphics2 = this.method95().getGraphics();
			this.aClass37_2 = new Class37(true, this.method95(), this.anInt226, this.anInt227);
			this.method96(this, 1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("57759, " + -74 + ", " + 503 + ", " + 765 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method95().addMouseListener(this);
		this.method95().addMouseMotionListener(this);
		this.method95().addKeyListener(this);
		this.method95().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method97((byte) 6, "Loading...", 0);
		this.method90();
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
				if (this.anInt222 < 0) {
					if (this.anInt222 == -1) {
						this.method87();
					}
					return;
				}
				if (this.anInt222 > 0) {
					this.anInt222--;
					if (this.anInt222 == 0) {
						this.method87();
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
					local39 = (int) ((long) (this.anInt223 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt223 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt223) {
					local41 = this.anInt223;
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
				if (local41 < this.anInt224) {
					local41 = this.anInt224;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt235 = this.anInt232;
					this.anInt236 = this.anInt233;
					this.anInt237 = this.anInt234;
					this.aLong13 = this.aLong12;
					this.anInt232 = 0;
					this.method91(this.aByte10);
					this.anInt238 = this.anInt239;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt223 > 0) {
					this.anInt225 = local39 * 1000 / (this.anInt223 * 256);
				}
				this.method93(this.anInt221);
			} while (!this.aBoolean40);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(287) int local287 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local287 + ":" + this.aLongArray2[local287]);
			}
			System.out.println("fps:" + this.anInt225 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt223 + " mindel:" + this.anInt224);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean40 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	private void method87() {
		try {
			this.anInt222 = -2;
			this.method92();
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
			signlink.reporterror("61184, " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	protected final void method88(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 0) {
				this.anInt223 = 1000;
			}
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("19522, " + arg0 + ", " + 1 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt222 >= 0) {
			this.anInt222 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt222 >= 0) {
			this.anInt222 = 4000 / this.anInt223;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt222 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt222 == -1) {
			this.method87();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean41 = true;
		this.method94();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean41 = true;
		this.method94();
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
		this.anInt228 = 0;
		this.anInt233 = local2;
		this.anInt234 = local5;
		this.aLong12 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt232 = 2;
			this.anInt229 = 2;
		} else {
			this.anInt232 = 1;
			this.anInt229 = 1;
		}
		if (Class10.aBoolean127) {
			Class10.method271(local2, local5, arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt228 = 0;
		this.anInt229 = 0;
		if (Class10.aBoolean127) {
			Class10.method272(arg0.isMetaDown() ? 1 : 0, (byte) 2);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class10.aBoolean127) {
			Class10.method278();
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt228 = 0;
		this.anInt230 = -1;
		this.anInt231 = -1;
		if (Class10.aBoolean127) {
			Class10.method279(421);
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
		this.anInt228 = 0;
		this.anInt230 = local2;
		this.anInt231 = local5;
		if (Class10.aBoolean127) {
			Class10.method273(local2, local5);
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
		this.anInt228 = 0;
		this.anInt230 = local2;
		this.anInt231 = local5;
		if (Class10.aBoolean127) {
			Class10.method273(local2, local5);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt228 = 0;
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
			this.anIntArray32[local10] = 1;
		}
		if (local10 > 4) {
			this.anIntArray33[this.anInt239] = local10;
			this.anInt239 = this.anInt239 + 1 & 0x7F;
		}
		if (Class10.aBoolean127) {
			Class10.method274(local10, 614);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt228 = 0;
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
			this.anIntArray32[local8] = 0;
		}
		if (Class10.aBoolean127) {
			Class10.method275(local8);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)I")
	protected final int method89(@OriginalArg(0) byte arg0) {
		try {
			@Pc(1) int local1 = -1;
			if (arg0 != 7) {
				this.aBoolean38 = !this.aBoolean38;
			}
			if (this.anInt239 != this.anInt238) {
				local1 = this.anIntArray33[this.anInt238];
				this.anInt238 = this.anInt238 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("27245, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean42 = true;
		this.aBoolean41 = true;
		this.method94();
		if (Class10.aBoolean127) {
			Class10.method276((byte) 3);
		}
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean42 = false;
		if (Class10.aBoolean127) {
			Class10.method277();
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
	protected void method90() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	protected void method91(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 68) {
				;
			}
		} catch (@Pc(4) RuntimeException local4) {
			signlink.reporterror("33445, " + arg0 + ", " + local4.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	protected void method92() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	protected void method93(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 0) {
				;
			}
		} catch (@Pc(3) RuntimeException local3) {
			signlink.reporterror("9684, " + arg0 + ", " + local3.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	protected void method94() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)Ljava/awt/Component;")
	protected Component method95() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("34320, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method96(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLjava/lang/String;I)V")
	protected void method97(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method95().getGraphics();
				try {
					this.method95().repaint();
				} catch (@Pc(13) Exception local13) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(17) Exception local17) {
				}
			}
			@Pc(28) Font local28 = new Font("Helvetica", 1, 13);
			@Pc(34) FontMetrics local34 = this.method95().getFontMetrics(local28);
			@Pc(41) Font local41 = new Font("Helvetica", 0, 13);
			this.method95().getFontMetrics(local41);
			if (this.aBoolean41) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt226, this.anInt227);
				this.aBoolean41 = false;
			}
			@Pc(77) Color local77 = new Color(140, 17, 17);
			@Pc(84) int local84 = this.anInt227 / 2 - 18;
			this.aGraphics2.setColor(local77);
			this.aGraphics2.drawRect(this.anInt226 / 2 - 152, local84, 304, 34);
			this.aGraphics2.fillRect(this.anInt226 / 2 - 150, local84 + 2, arg2 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt226 / 2 + arg2 * 3 - 150, local84 + 2, 300 - arg2 * 3, 30);
			this.aGraphics2.setFont(local28);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt226 - local34.stringWidth(arg1)) / 2, local84 + 22);
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("36011, " + 6 + ", " + arg1 + ", " + arg2 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}
