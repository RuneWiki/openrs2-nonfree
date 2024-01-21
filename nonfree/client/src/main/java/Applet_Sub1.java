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
	private int anInt225;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	protected int anInt229;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	protected int anInt230;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!rb;")
	protected Class37 aClass37_2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	protected int anInt231;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt232;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	public int anInt234;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	protected int anInt238;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	protected int anInt239;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	protected int anInt240;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	private int anInt223 = -96;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	private int anInt224 = -602;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	private int anInt226 = 20;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	protected int anInt227 = 1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
	protected boolean aBoolean41 = false;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2 = new Class1_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
	private boolean aBoolean42 = true;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Z")
	protected boolean aBoolean43 = true;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
	protected int[] anIntArray32 = new int[128];

	@OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
	private int[] anIntArray33 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method85(@OriginalArg(1) int arg0) {
		try {
			this.anInt229 = 765;
			this.anInt230 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1((byte) 3, this, this.anInt230, this.anInt229);
			this.aGraphics2 = this.method95(437).getGraphics();
			this.aClass37_2 = new Class37((byte) -82, this.anInt230, this.method95(437), this.anInt229);
			if (arg0 >= 0) {
				this.aBoolean39 = !this.aBoolean39;
			}
			this.method96(this, 1);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("68010, " + 503 + ", " + arg0 + ", " + 765 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(III)V")
	protected final void method86() {
		try {
			this.anInt229 = 765;
			this.anInt230 = 503;
			this.aGraphics2 = this.method95(437).getGraphics();
			this.aClass37_2 = new Class37((byte) -82, this.anInt230, this.method95(437), this.anInt229);
			this.method96(this, 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("91784, " + 765 + ", " + 40169 + ", " + 503 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method95(437).addMouseListener(this);
		this.method95(437).addMouseMotionListener(this);
		this.method95(437).addKeyListener(this);
		this.method95(437).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method97(638, "Loading...", 0);
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
				if (this.anInt225 < 0) {
					if (this.anInt225 == -1) {
						this.method87();
					}
					return;
				}
				if (this.anInt225 > 0) {
					this.anInt225--;
					if (this.anInt225 == 0) {
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
					local39 = (int) ((long) (this.anInt226 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt226 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt226) {
					local41 = this.anInt226;
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
				if (local41 < this.anInt227) {
					local41 = this.anInt227;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt238 = this.anInt235;
					this.anInt239 = this.anInt236;
					this.anInt240 = this.anInt237;
					this.aLong13 = this.aLong12;
					this.anInt235 = 0;
					this.method91((byte) 5);
					this.anInt241 = this.anInt242;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt226 > 0) {
					this.anInt228 = local39 * 1000 / (this.anInt226 * 256);
				}
				this.method93();
			} while (!this.aBoolean41);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt228 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt226 + " mindel:" + this.anInt227);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean41 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	private void method87() {
		try {
			this.anInt225 = -2;
			this.method92();
			try {
				Thread.sleep(1000L);
			} catch (@Pc(21) Exception local21) {
			}
			try {
				System.exit(0);
			} catch (@Pc(25) Throwable local25) {
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("30939, " + -602 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	protected final void method88() {
		try {
			this.anInt226 = 1000;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("59710, " + 1 + ", " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt225 >= 0) {
			this.anInt225 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt225 >= 0) {
			this.anInt225 = 4000 / this.anInt226;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt225 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt225 == -1) {
			this.method87();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean42 = true;
		this.method94();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean42 = true;
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
		this.anInt231 = 0;
		this.anInt236 = local2;
		this.anInt237 = local5;
		this.aLong12 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt235 = 2;
			this.anInt232 = 2;
		} else {
			this.anInt235 = 1;
			this.anInt232 = 1;
		}
		if (Class10.aBoolean123) {
			Class10.method271(arg0.isMetaDown() ? 1 : 0, local5, local2);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt231 = 0;
		this.anInt232 = 0;
		if (Class10.aBoolean123) {
			Class10.method272(arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class10.aBoolean123) {
			Class10.method278();
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt231 = 0;
		this.anInt233 = -1;
		this.anInt234 = -1;
		if (Class10.aBoolean123) {
			Class10.method279();
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
		this.anInt231 = 0;
		this.anInt233 = local2;
		this.anInt234 = local5;
		if (Class10.aBoolean123) {
			Class10.method273(local5, local2);
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
		this.anInt231 = 0;
		this.anInt233 = local2;
		this.anInt234 = local5;
		if (Class10.aBoolean123) {
			Class10.method273(local5, local2);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt231 = 0;
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
			this.anIntArray33[this.anInt242] = local10;
			this.anInt242 = this.anInt242 + 1 & 0x7F;
		}
		if (Class10.aBoolean123) {
			Class10.method274(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt231 = 0;
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
		if (Class10.aBoolean123) {
			Class10.method275(local8, this.anInt223);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)I")
	protected final int method89() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt242 != this.anInt241) {
				local1 = this.anIntArray33[this.anInt241];
				this.anInt241 = this.anInt241 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("14375, " + -24 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean43 = true;
		this.aBoolean42 = true;
		this.method94();
		if (Class10.aBoolean123) {
			Class10.method276();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean43 = false;
		if (Class10.aBoolean123) {
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
			@Pc(4) boolean local4 = false;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("90123, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
	protected void method92() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	protected void method93() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method94() {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Ljava/awt/Component;")
	protected Component method95(@OriginalArg(0) int arg0) {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("82514, " + 437 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method96(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/lang/String;I)V")
	protected void method97(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method95(437).getGraphics();
				try {
					this.method95(437).repaint();
				} catch (@Pc(13) Exception local13) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(17) Exception local17) {
				}
			}
			@Pc(28) Font local28 = new Font("Helvetica", 1, 13);
			@Pc(34) FontMetrics local34 = this.method95(437).getFontMetrics(local28);
			@Pc(41) Font local41 = new Font("Helvetica", 0, 13);
			this.method95(437).getFontMetrics(local41);
			if (this.aBoolean42) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt229, this.anInt230);
				this.aBoolean42 = false;
			}
			@Pc(73) Color local73 = new Color(140, 17, 17);
			@Pc(83) int local83 = this.anInt230 / 2 - 18;
			this.aGraphics2.setColor(local73);
			this.aGraphics2.drawRect(this.anInt229 / 2 - 152, local83, 304, 34);
			this.aGraphics2.fillRect(this.anInt229 / 2 - 150, local83 + 2, arg2 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt229 / 2 + arg2 * 3 - 150, local83 + 2, 300 - arg2 * 3, 30);
			this.aGraphics2.setFont(local28);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt229 - local34.stringWidth(arg1)) / 2, local83 + 22);
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("89930, " + 638 + ", " + arg1 + ", " + arg2 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}
}
