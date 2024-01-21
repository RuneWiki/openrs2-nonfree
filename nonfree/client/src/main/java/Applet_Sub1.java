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

@OriginalClass("client!CMOCHGYM")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!CMOCHGYM", name = "b", descriptor = "I")
	private int anInt799;

	@OriginalMember(owner = "client!CMOCHGYM", name = "d", descriptor = "I")
	private int anInt800;

	@OriginalMember(owner = "client!CMOCHGYM", name = "h", descriptor = "I")
	protected int anInt803;

	@OriginalMember(owner = "client!CMOCHGYM", name = "j", descriptor = "I")
	protected int anInt804;

	@OriginalMember(owner = "client!CMOCHGYM", name = "k", descriptor = "I")
	protected int anInt805;

	@OriginalMember(owner = "client!CMOCHGYM", name = "l", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!CMOCHGYM", name = "m", descriptor = "Lclient!VOQVBLJN;")
	protected Class42 aClass42_2;

	@OriginalMember(owner = "client!CMOCHGYM", name = "o", descriptor = "Lclient!FLFIRZAJ;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!CMOCHGYM", name = "r", descriptor = "I")
	protected int anInt806;

	@OriginalMember(owner = "client!CMOCHGYM", name = "s", descriptor = "I")
	protected int anInt807;

	@OriginalMember(owner = "client!CMOCHGYM", name = "t", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!CMOCHGYM", name = "u", descriptor = "I")
	public int anInt809;

	@OriginalMember(owner = "client!CMOCHGYM", name = "v", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!CMOCHGYM", name = "w", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!CMOCHGYM", name = "x", descriptor = "I")
	private int anInt812;

	@OriginalMember(owner = "client!CMOCHGYM", name = "y", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!CMOCHGYM", name = "z", descriptor = "I")
	protected int anInt813;

	@OriginalMember(owner = "client!CMOCHGYM", name = "A", descriptor = "I")
	protected int anInt814;

	@OriginalMember(owner = "client!CMOCHGYM", name = "B", descriptor = "I")
	protected int anInt815;

	@OriginalMember(owner = "client!CMOCHGYM", name = "C", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!CMOCHGYM", name = "F", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!CMOCHGYM", name = "G", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!CMOCHGYM", name = "a", descriptor = "Z")
	private boolean aBoolean195 = true;

	@OriginalMember(owner = "client!CMOCHGYM", name = "c", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!CMOCHGYM", name = "e", descriptor = "I")
	private int anInt801 = 20;

	@OriginalMember(owner = "client!CMOCHGYM", name = "f", descriptor = "I")
	protected int anInt802 = 1;

	@OriginalMember(owner = "client!CMOCHGYM", name = "g", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!CMOCHGYM", name = "i", descriptor = "Z")
	protected boolean aBoolean197 = false;

	@OriginalMember(owner = "client!CMOCHGYM", name = "n", descriptor = "[Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array3 = new Class3_Sub1_Sub2_Sub4[6];

	@OriginalMember(owner = "client!CMOCHGYM", name = "p", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!CMOCHGYM", name = "q", descriptor = "Z")
	protected boolean aBoolean199 = true;

	@OriginalMember(owner = "client!CMOCHGYM", name = "D", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!CMOCHGYM", name = "E", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!CMOCHGYM", name = "a", descriptor = "(ZII)V")
	protected final void method574() {
		try {
			this.anInt804 = 765;
			this.anInt805 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, this.anInt804, this.anInt805, 0);
			this.aGraphics2 = this.method584().getGraphics();
			this.aClass42_2 = new Class42(this.anInt805, 5, this.anInt804, this.method584());
			this.method585(this, 1);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("15268, " + true + ", " + 503 + ", " + 765 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "a", descriptor = "(III)V")
	protected final void method575() {
		try {
			this.anInt804 = 765;
			this.anInt805 = 503;
			this.aGraphics2 = this.method584().getGraphics();
			this.aClass42_2 = new Class42(this.anInt805, 5, this.anInt804, this.method584());
			this.method585(this, 1);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("34318, " + 503 + ", " + 765 + ", " + -699 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method584().addMouseListener(this);
		this.method584().addMouseMotionListener(this);
		this.method584().addKeyListener(this);
		this.method584().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method586(0, "Loading...");
		this.method579();
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
				if (this.anInt800 < 0) {
					if (this.anInt800 == -1) {
						this.method576();
					}
					return;
				}
				if (this.anInt800 > 0) {
					this.anInt800--;
					if (this.anInt800 == 0) {
						this.method576();
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
					local39 = (int) ((long) (2560 * this.anInt801) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt801 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt801) {
					local41 = this.anInt801;
				}
				this.aLongArray2[local37] = local60;
				local37 = (local37 + 1) % 10;
				if (local41 > 1) {
					for (local169 = 0; local169 < 10; local169++) {
						if (this.aLongArray2[local169] != 0L) {
							this.aLongArray2[local169] += (long) local41;
						}
					}
				}
				if (local41 < this.anInt802) {
					local41 = this.anInt802;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt813 = this.anInt810;
					this.anInt814 = this.anInt811;
					this.anInt815 = this.anInt812;
					this.aLong28 = this.aLong27;
					this.anInt810 = 0;
					this.method580();
					this.anInt816 = this.anInt817;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt801 > 0) {
					this.anInt803 = 1000 * local39 / (this.anInt801 * 256);
				}
				this.method582();
			} while (!this.aBoolean197);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt803 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt801 + " mindel:" + this.anInt802);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean197 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "a", descriptor = "(I)V")
	private void method576() {
		try {
			this.anInt800 = -2;
			this.method581();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(16) Exception local16) {
				}
				try {
					System.exit(0);
				} catch (@Pc(20) Throwable local20) {
				}
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("48499, " + 21126 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "a", descriptor = "(II)V")
	protected final void method577(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt801 = 1000;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("61799, " + arg0 + ", " + 1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt800 >= 0) {
			this.anInt800 = 0;
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt800 >= 0) {
			this.anInt800 = 4000 / this.anInt801;
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt800 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt800 == -1) {
			this.method576();
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean198 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean198 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt806 = 0;
		this.anInt811 = local2;
		this.anInt812 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt810 = 2;
			this.anInt807 = 2;
		} else {
			this.anInt810 = 1;
			this.anInt807 = 1;
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt806 = 0;
		this.anInt807 = 0;
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt806 = 0;
		this.anInt808 = -1;
		this.anInt809 = -1;
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt806 = 0;
		this.anInt808 = local2;
		this.anInt809 = local5;
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt806 = 0;
		this.anInt808 = local2;
		this.anInt809 = local5;
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt806 = 0;
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
			this.anIntArray211[this.anInt817] = local10;
			this.anInt817 = this.anInt817 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt806 = 0;
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

	@OriginalMember(owner = "client!CMOCHGYM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "b", descriptor = "(I)I")
	protected final int method578() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt817 != this.anInt816) {
				local1 = this.anIntArray211[this.anInt816];
				this.anInt816 = this.anInt816 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("3887, " + -520 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean199 = true;
		this.aBoolean198 = true;
		this.method583();
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean199 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "a", descriptor = "()V")
	protected void method579() {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "a", descriptor = "(Z)V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "c", descriptor = "(I)V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "d", descriptor = "(I)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "e", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	protected Component method584() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("58643, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method585(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!CMOCHGYM", name = "a", descriptor = "(IILjava/lang/String;)V")
	protected void method586(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method584().getGraphics();
				try {
					this.method584().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method584().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method584().getFontMetrics(local49);
			if (this.aBoolean198) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt804, this.anInt805);
				this.aBoolean198 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt805 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt804 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt804 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt804 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt804 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("38131, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}
}
