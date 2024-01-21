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
	private int anInt222;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	protected int anInt228;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	protected int anInt229;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!rb;")
	protected Class37 aClass37_2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	protected int anInt230;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt231;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	protected int anInt237;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	protected int anInt238;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	protected int anInt239;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	private int anInt221 = 767;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	private int anInt223 = -5797;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	private int anInt225 = 20;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	protected int anInt226 = 1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
	protected boolean aBoolean38 = false;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2 = new Class1_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Z")
	protected boolean aBoolean40 = true;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
	protected int[] anIntArray32 = new int[128];

	@OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
	private int[] anIntArray33 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method85(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				this.aBoolean37 = !this.aBoolean37;
			}
			this.anInt228 = 765;
			this.anInt229 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt229, this, this.anInt228, (byte) 4);
			this.aGraphics2 = this.method95().getGraphics();
			this.aClass37_2 = new Class37(this.anInt229, this.method95(), 0, this.anInt228);
			this.method96(this, 1);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("18663, " + arg0 + ", " + 503 + ", " + 765 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZ)V")
	protected final void method86() {
		try {
			this.anInt228 = 765;
			this.anInt229 = 503;
			this.aGraphics2 = this.method95().getGraphics();
			this.aClass37_2 = new Class37(this.anInt229, this.method95(), 0, this.anInt228);
			this.method96(this, 1);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("84324, " + 765 + ", " + 503 + ", " + false + ", " + local33.toString());
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
		this.method97("Loading...", 0);
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
				if (this.anInt224 < 0) {
					if (this.anInt224 == -1) {
						this.method87(162);
					}
					return;
				}
				if (this.anInt224 > 0) {
					this.anInt224--;
					if (this.anInt224 == 0) {
						this.method87(162);
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
					local39 = (int) ((long) (this.anInt225 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt225 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt225) {
					local41 = this.anInt225;
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
				if (local41 < this.anInt226) {
					local41 = this.anInt226;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt237 = this.anInt234;
					this.anInt238 = this.anInt235;
					this.anInt239 = this.anInt236;
					this.aLong13 = this.aLong12;
					this.anInt234 = 0;
					this.method91();
					this.anInt240 = this.anInt241;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt225 > 0) {
					this.anInt227 = local39 * 1000 / (this.anInt225 * 256);
				}
				this.method93();
			} while (!this.aBoolean38);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt227 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt225 + " mindel:" + this.anInt226);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean38 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	private void method87(@OriginalArg(0) int arg0) {
		try {
			this.anInt224 = -2;
			this.method92(297);
			@Pc(9) boolean local9 = false;
			try {
				Thread.sleep(1000L);
			} catch (@Pc(13) Exception local13) {
			}
			try {
				System.exit(0);
			} catch (@Pc(17) Throwable local17) {
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("83204, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
	protected final void method88() {
		try {
			this.anInt225 = 1000;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("14784, " + 1 + ", " + -99 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt224 >= 0) {
			this.anInt224 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt224 >= 0) {
			this.anInt224 = 4000 / this.anInt225;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt224 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt224 == -1) {
			this.method87(162);
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean39 = true;
		this.method94();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean39 = true;
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
		this.anInt230 = 0;
		this.anInt235 = local2;
		this.anInt236 = local5;
		this.aLong12 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt234 = 2;
			this.anInt231 = 2;
		} else {
			this.anInt234 = 1;
			this.anInt231 = 1;
		}
		if (Class10.aBoolean116) {
			Class10.method270(local5, arg0.isMetaDown() ? 1 : 0, local2);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt230 = 0;
		this.anInt231 = 0;
		if (Class10.aBoolean116) {
			Class10.method271(arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class10.aBoolean116) {
			Class10.method277();
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt230 = 0;
		this.anInt232 = -1;
		this.anInt233 = -1;
		if (Class10.aBoolean116) {
			Class10.method278();
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
		this.anInt230 = 0;
		this.anInt232 = local2;
		this.anInt233 = local5;
		if (Class10.aBoolean116) {
			Class10.method272(local2, local5);
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
		this.anInt230 = 0;
		this.anInt232 = local2;
		this.anInt233 = local5;
		if (Class10.aBoolean116) {
			Class10.method272(local2, local5);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt230 = 0;
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
			this.anIntArray33[this.anInt241] = local10;
			this.anInt241 = this.anInt241 + 1 & 0x7F;
		}
		if (Class10.aBoolean116) {
			Class10.method273(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt230 = 0;
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
		if (Class10.aBoolean116) {
			Class10.method274(local8);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)I")
	protected final int method89() {
		try {
			@Pc(6) int local6 = -1;
			if (this.anInt241 != this.anInt240) {
				local6 = this.anIntArray33[this.anInt240];
				this.anInt240 = this.anInt240 + 1 & 0x7F;
			}
			return local6;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("80515, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean40 = true;
		this.aBoolean39 = true;
		this.method94();
		if (Class10.aBoolean116) {
			Class10.method275();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean40 = false;
		if (Class10.aBoolean116) {
			Class10.method276();
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

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	protected void method91() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method92(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	protected void method93() {
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	protected void method94() {
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Ljava/awt/Component;")
	protected Component method95() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("36920, " + -66 + ", " + local18.toString());
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
	protected void method97(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method95().getGraphics();
				try {
					this.method95().repaint();
				} catch (@Pc(20) Exception local20) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(24) Exception local24) {
				}
			}
			@Pc(35) Font local35 = new Font("Helvetica", 1, 13);
			@Pc(41) FontMetrics local41 = this.method95().getFontMetrics(local35);
			@Pc(48) Font local48 = new Font("Helvetica", 0, 13);
			this.method95().getFontMetrics(local48);
			if (this.aBoolean39) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt228, this.anInt229);
				this.aBoolean39 = false;
			}
			@Pc(80) Color local80 = new Color(140, 17, 17);
			@Pc(87) int local87 = this.anInt229 / 2 - 18;
			this.aGraphics2.setColor(local80);
			this.aGraphics2.drawRect(this.anInt228 / 2 - 152, local87, 304, 34);
			this.aGraphics2.fillRect(this.anInt228 / 2 - 150, local87 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt228 / 2 + arg1 * 3 - 150, local87 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local35);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt228 - local41.stringWidth(arg0)) / 2, local87 + 22);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("86763, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}
}
