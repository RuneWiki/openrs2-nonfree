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

@OriginalClass("client!VZUGTFOW")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!VZUGTFOW", name = "b", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!VZUGTFOW", name = "e", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!VZUGTFOW", name = "i", descriptor = "I")
	protected int anInt818;

	@OriginalMember(owner = "client!VZUGTFOW", name = "k", descriptor = "I")
	protected int anInt819;

	@OriginalMember(owner = "client!VZUGTFOW", name = "l", descriptor = "I")
	protected int anInt820;

	@OriginalMember(owner = "client!VZUGTFOW", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!VZUGTFOW", name = "n", descriptor = "Lclient!SKZHQGHX;")
	protected Class36 aClass36_2;

	@OriginalMember(owner = "client!VZUGTFOW", name = "p", descriptor = "Lclient!PNNSUEUM;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!VZUGTFOW", name = "s", descriptor = "I")
	protected int anInt821;

	@OriginalMember(owner = "client!VZUGTFOW", name = "t", descriptor = "I")
	protected int anInt822;

	@OriginalMember(owner = "client!VZUGTFOW", name = "u", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!VZUGTFOW", name = "v", descriptor = "I")
	public int anInt824;

	@OriginalMember(owner = "client!VZUGTFOW", name = "w", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!VZUGTFOW", name = "x", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!VZUGTFOW", name = "y", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!VZUGTFOW", name = "z", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!VZUGTFOW", name = "A", descriptor = "I")
	protected int anInt828;

	@OriginalMember(owner = "client!VZUGTFOW", name = "B", descriptor = "I")
	protected int anInt829;

	@OriginalMember(owner = "client!VZUGTFOW", name = "C", descriptor = "I")
	protected int anInt830;

	@OriginalMember(owner = "client!VZUGTFOW", name = "D", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!VZUGTFOW", name = "G", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!VZUGTFOW", name = "H", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!VZUGTFOW", name = "a", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!VZUGTFOW", name = "c", descriptor = "I")
	private int anInt814 = 25292;

	@OriginalMember(owner = "client!VZUGTFOW", name = "d", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!VZUGTFOW", name = "f", descriptor = "I")
	private int anInt816 = 20;

	@OriginalMember(owner = "client!VZUGTFOW", name = "g", descriptor = "I")
	protected int anInt817 = 1;

	@OriginalMember(owner = "client!VZUGTFOW", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!VZUGTFOW", name = "j", descriptor = "Z")
	protected boolean aBoolean241 = false;

	@OriginalMember(owner = "client!VZUGTFOW", name = "o", descriptor = "[Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array3 = new Class3_Sub1_Sub1_Sub4[6];

	@OriginalMember(owner = "client!VZUGTFOW", name = "q", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!VZUGTFOW", name = "r", descriptor = "Z")
	protected boolean aBoolean243 = true;

	@OriginalMember(owner = "client!VZUGTFOW", name = "E", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!VZUGTFOW", name = "F", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!VZUGTFOW", name = "a", descriptor = "(III)V")
	protected final void method569() {
		try {
			this.anInt819 = 765;
			this.anInt820 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt819, this.anInt820, this, true);
			this.aGraphics2 = this.method579((byte) 2).getGraphics();
			this.aClass36_2 = new Class36(this.anInt820, 13856, this.anInt819, this.method579((byte) 2));
			this.method580(this, 1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("94606, " + 765 + ", " + 503 + ", " + -955 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "b", descriptor = "(III)V")
	protected final void method570() {
		try {
			this.anInt819 = 765;
			this.anInt820 = 503;
			this.aGraphics2 = this.method579((byte) 2).getGraphics();
			this.aClass36_2 = new Class36(this.anInt820, 13856, this.anInt819, this.method579((byte) 2));
			this.method580(this, 1);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("64773, " + 503 + ", " + 765 + ", " + 9 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method579((byte) 2).addMouseListener(this);
		this.method579((byte) 2).addMouseMotionListener(this);
		this.method579((byte) 2).addKeyListener(this);
		this.method579((byte) 2).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method581(this.aBoolean239, 0, "Loading...");
		this.method574();
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
				if (this.anInt815 < 0) {
					if (this.anInt815 == -1) {
						this.method571();
					}
					return;
				}
				if (this.anInt815 > 0) {
					this.anInt815--;
					if (this.anInt815 == 0) {
						this.method571();
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
					local40 = (int) ((long) (this.anInt816 * 2560) / (local61 - this.aLongArray2[local38]));
				}
				if (local40 < 25) {
					local40 = 25;
				}
				if (local40 > 256) {
					local40 = 256;
					local42 = (int) ((long) this.anInt816 - (local61 - this.aLongArray2[local38]) / 10L);
				}
				if (local42 > this.anInt816) {
					local42 = this.anInt816;
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
				if (local42 < this.anInt817) {
					local42 = this.anInt817;
				}
				try {
					Thread.sleep((long) local42);
				} catch (@Pc(204) InterruptedException local204) {
					local46++;
				}
				while (local44 < 256) {
					this.anInt828 = this.anInt825;
					this.anInt829 = this.anInt826;
					this.anInt830 = this.anInt827;
					this.aLong28 = this.aLong27;
					this.anInt825 = 0;
					this.method575();
					this.anInt831 = this.anInt832;
					local44 += local40;
				}
				local44 &= 0xFF;
				if (this.anInt816 > 0) {
					this.anInt818 = local40 * 1000 / (this.anInt816 * 256);
				}
				this.method577();
			} while (!this.aBoolean241);
			System.out.println("ntime:" + local61);
			for (local170 = 0; local170 < 10; local170++) {
				@Pc(286) int local286 = (local38 + 20 - local170 - 1) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt818 + " ratio:" + local40 + " count:" + local44);
			System.out.println("del:" + local42 + " deltime:" + this.anInt816 + " mindel:" + this.anInt817);
			System.out.println("intex:" + local46 + " opos:" + local38);
			this.aBoolean241 = false;
			local46 = 0;
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "a", descriptor = "(I)V")
	private void method571() {
		try {
			this.anInt815 = -2;
			this.method576(533);
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(17) Exception local17) {
				}
				try {
					System.exit(0);
				} catch (@Pc(21) Throwable local21) {
				}
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("60374, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "a", descriptor = "(II)V")
	protected final void method572() {
		try {
			this.anInt816 = 1000;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("20386, " + 1 + ", " + -503 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt815 >= 0) {
			this.anInt815 = 0;
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt815 >= 0) {
			this.anInt815 = 4000 / this.anInt816;
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt815 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt815 == -1) {
			this.method571();
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean242 = true;
		this.method578();
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean242 = true;
		this.method578();
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt821 = 0;
		this.anInt826 = local2;
		this.anInt827 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt825 = 2;
			this.anInt822 = 2;
		} else {
			this.anInt825 = 1;
			this.anInt822 = 1;
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt821 = 0;
		this.anInt822 = 0;
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt821 = 0;
		this.anInt823 = -1;
		this.anInt824 = -1;
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt821 = 0;
		this.anInt823 = local2;
		this.anInt824 = local5;
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt821 = 0;
		this.anInt823 = local2;
		this.anInt824 = local5;
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt821 = 0;
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
			this.anIntArray211[this.anInt832] = local10;
			this.anInt832 = this.anInt832 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt821 = 0;
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

	@OriginalMember(owner = "client!VZUGTFOW", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "b", descriptor = "(I)I")
	protected final int method573(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) int local1 = -1;
			if (arg0 != 31514) {
				this.anInt813 = -291;
			}
			if (this.anInt832 != this.anInt831) {
				local1 = this.anIntArray211[this.anInt831];
				this.anInt831 = this.anInt831 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("25136, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean243 = true;
		this.aBoolean242 = true;
		this.method578();
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean243 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "a", descriptor = "()V")
	protected void method574() {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "c", descriptor = "(I)V")
	protected void method575() {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "d", descriptor = "(I)V")
	protected void method576(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("29011, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "a", descriptor = "(B)V")
	protected void method577() {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "e", descriptor = "(I)V")
	protected void method578() {
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "b", descriptor = "(B)Ljava/awt/Component;")
	protected Component method579(@OriginalArg(0) byte arg0) {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("96898, " + 2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method580(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!VZUGTFOW", name = "a", descriptor = "(ZILjava/lang/String;)V")
	protected void method581(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method579((byte) 2).getGraphics();
				try {
					this.method579((byte) 2).repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method579((byte) 2).getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method579((byte) 2).getFontMetrics(local49);
			if (this.aBoolean242) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt819, this.anInt820);
				this.aBoolean242 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt820 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt819 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt819 / 2 - 150, local88 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			if (!arg0) {
				this.aBoolean240 = !this.aBoolean240;
			}
			this.aGraphics2.fillRect(this.anInt819 / 2 + arg1 * 3 - 150, local88 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg2, (this.anInt819 - local42.stringWidth(arg2)) / 2, local88 + 22);
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("448, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}
}
