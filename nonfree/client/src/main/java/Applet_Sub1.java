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

@OriginalClass("client!LJUNUWBY")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!LJUNUWBY", name = "e", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!LJUNUWBY", name = "i", descriptor = "I")
	protected int anInt806;

	@OriginalMember(owner = "client!LJUNUWBY", name = "k", descriptor = "I")
	protected int anInt807;

	@OriginalMember(owner = "client!LJUNUWBY", name = "l", descriptor = "I")
	protected int anInt808;

	@OriginalMember(owner = "client!LJUNUWBY", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!LJUNUWBY", name = "n", descriptor = "Lclient!PRSDKOTZ;")
	protected Class32 aClass32_2;

	@OriginalMember(owner = "client!LJUNUWBY", name = "p", descriptor = "Lclient!MEWJABWI;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!LJUNUWBY", name = "s", descriptor = "I")
	protected int anInt809;

	@OriginalMember(owner = "client!LJUNUWBY", name = "t", descriptor = "I")
	protected int anInt810;

	@OriginalMember(owner = "client!LJUNUWBY", name = "u", descriptor = "I")
	public int anInt811;

	@OriginalMember(owner = "client!LJUNUWBY", name = "v", descriptor = "I")
	public int anInt812;

	@OriginalMember(owner = "client!LJUNUWBY", name = "w", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!LJUNUWBY", name = "x", descriptor = "I")
	private int anInt814;

	@OriginalMember(owner = "client!LJUNUWBY", name = "y", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!LJUNUWBY", name = "z", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!LJUNUWBY", name = "A", descriptor = "I")
	protected int anInt816;

	@OriginalMember(owner = "client!LJUNUWBY", name = "B", descriptor = "I")
	protected int anInt817;

	@OriginalMember(owner = "client!LJUNUWBY", name = "C", descriptor = "I")
	protected int anInt818;

	@OriginalMember(owner = "client!LJUNUWBY", name = "D", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!LJUNUWBY", name = "G", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!LJUNUWBY", name = "H", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "I")
	private int anInt801 = -397;

	@OriginalMember(owner = "client!LJUNUWBY", name = "b", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!LJUNUWBY", name = "c", descriptor = "I")
	private int anInt802 = 6;

	@OriginalMember(owner = "client!LJUNUWBY", name = "d", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!LJUNUWBY", name = "f", descriptor = "I")
	private int anInt804 = 20;

	@OriginalMember(owner = "client!LJUNUWBY", name = "g", descriptor = "I")
	protected int anInt805 = 1;

	@OriginalMember(owner = "client!LJUNUWBY", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!LJUNUWBY", name = "j", descriptor = "Z")
	protected boolean aBoolean219 = false;

	@OriginalMember(owner = "client!LJUNUWBY", name = "o", descriptor = "[Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array3 = new Class2_Sub1_Sub2_Sub1[6];

	@OriginalMember(owner = "client!LJUNUWBY", name = "q", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!LJUNUWBY", name = "r", descriptor = "Z")
	protected boolean aBoolean221 = true;

	@OriginalMember(owner = "client!LJUNUWBY", name = "E", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!LJUNUWBY", name = "F", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(ZII)V")
	protected final void method576() {
		try {
			this.anInt807 = 765;
			this.anInt808 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt808, 42686, this.anInt807, this);
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass32_2 = new Class32(3, this.anInt808, this.anInt807, this.method586());
			this.method587(this, 1);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("96460, " + true + ", " + 765 + ", " + 503 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(III)V")
	protected final void method577() {
		try {
			this.anInt807 = 765;
			this.anInt808 = 503;
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass32_2 = new Class32(3, this.anInt808, this.anInt807, this.method586());
			this.method587(this, 1);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("18153, " + 551 + ", " + 765 + ", " + 503 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method586().addMouseListener(this);
		this.method586().addMouseMotionListener(this);
		this.method586().addKeyListener(this);
		this.method586().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588(0, "Loading...", this.aBoolean218);
		this.method581();
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
				if (this.anInt803 < 0) {
					if (this.anInt803 == -1) {
						this.method578();
					}
					return;
				}
				if (this.anInt803 > 0) {
					this.anInt803--;
					if (this.anInt803 == 0) {
						this.method578();
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
					local40 = (int) ((long) (this.anInt804 * 2560) / (local61 - this.aLongArray2[local38]));
				}
				if (local40 < 25) {
					local40 = 25;
				}
				if (local40 > 256) {
					local40 = 256;
					local42 = (int) ((long) this.anInt804 - (local61 - this.aLongArray2[local38]) / 10L);
				}
				if (local42 > this.anInt804) {
					local42 = this.anInt804;
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
				if (local42 < this.anInt805) {
					local42 = this.anInt805;
				}
				try {
					Thread.sleep((long) local42);
				} catch (@Pc(204) InterruptedException local204) {
					local46++;
				}
				while (local44 < 256) {
					this.anInt816 = this.anInt813;
					this.anInt817 = this.anInt814;
					this.anInt818 = this.anInt815;
					this.aLong28 = this.aLong27;
					this.anInt813 = 0;
					this.method582();
					this.anInt819 = this.anInt820;
					local44 += local40;
				}
				local44 &= 0xFF;
				if (this.anInt804 > 0) {
					this.anInt806 = local40 * 1000 / (this.anInt804 * 256);
				}
				this.method584();
			} while (!this.aBoolean219);
			System.out.println("ntime:" + local61);
			for (local170 = 0; local170 < 10; local170++) {
				@Pc(286) int local286 = (local38 + 20 - local170 - 1) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt806 + " ratio:" + local40 + " count:" + local44);
			System.out.println("del:" + local42 + " deltime:" + this.anInt804 + " mindel:" + this.anInt805);
			System.out.println("intex:" + local46 + " opos:" + local38);
			this.aBoolean219 = false;
			local46 = 0;
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(I)V")
	private void method578() {
		try {
			this.anInt803 = -2;
			this.method583();
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
			signlink.reporterror("26402, " + 970 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(II)V")
	protected final void method579() {
		try {
			this.anInt804 = 1000;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("60987, " + 31071 + ", " + 1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt803 >= 0) {
			this.anInt803 = 0;
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt803 >= 0) {
			this.anInt803 = 4000 / this.anInt804;
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt803 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt803 == -1) {
			this.method578();
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean220 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean220 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt809 = 0;
		this.anInt814 = local2;
		this.anInt815 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt813 = 2;
			this.anInt810 = 2;
		} else {
			this.anInt813 = 1;
			this.anInt810 = 1;
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt809 = 0;
		this.anInt810 = 0;
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt809 = 0;
		this.anInt811 = -1;
		this.anInt812 = -1;
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt809 = 0;
		this.anInt811 = local2;
		this.anInt812 = local5;
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt809 = 0;
		this.anInt811 = local2;
		this.anInt812 = local5;
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt809 = 0;
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
			this.anIntArray211[this.anInt820] = local10;
			this.anInt820 = this.anInt820 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt809 = 0;
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

	@OriginalMember(owner = "client!LJUNUWBY", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "b", descriptor = "(I)I")
	protected final int method580() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt820 != this.anInt819) {
				local11 = this.anIntArray211[this.anInt819];
				this.anInt819 = this.anInt819 + 1 & 0x7F;
			}
			return local11;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("86147, " + -33830 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean221 = true;
		this.aBoolean220 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean221 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "()V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "c", descriptor = "(I)V")
	protected void method582() {
		try {
			if (this.anInt802 == 6) {
				;
			}
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("48833, " + 6 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(Z)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(B)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "b", descriptor = "(Z)V")
	protected void method585() {
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "c", descriptor = "(Z)Ljava/awt/Component;")
	protected Component method586() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("91947, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method586().getGraphics();
				try {
					this.method586().repaint();
				} catch (@Pc(15) Exception local15) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(19) Exception local19) {
				}
			}
			@Pc(30) Font local30 = new Font("Helvetica", 1, 13);
			@Pc(36) FontMetrics local36 = this.method586().getFontMetrics(local30);
			@Pc(43) Font local43 = new Font("Helvetica", 0, 13);
			this.method586().getFontMetrics(local43);
			if (this.aBoolean220) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt807, this.anInt808);
				this.aBoolean220 = false;
			}
			@Pc(75) Color local75 = new Color(140, 17, 17);
			@Pc(82) int local82 = this.anInt808 / 2 - 18;
			this.aGraphics2.setColor(local75);
			this.aGraphics2.drawRect(this.anInt807 / 2 - 152, local82, 304, 34);
			if (!arg2) {
				this.aGraphics2.fillRect(this.anInt807 / 2 - 150, local82 + 2, arg0 * 3, 30);
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(this.anInt807 / 2 + arg0 * 3 - 150, local82 + 2, 300 - arg0 * 3, 30);
				this.aGraphics2.setFont(local30);
				this.aGraphics2.setColor(Color.white);
				this.aGraphics2.drawString(arg1, (this.anInt807 - local36.stringWidth(arg1)) / 2, local82 + 22);
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("48598, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}
}
