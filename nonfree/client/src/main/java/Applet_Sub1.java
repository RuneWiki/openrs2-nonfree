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

@OriginalClass("client!UBLCAEEN")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!UBLCAEEN", name = "e", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!UBLCAEEN", name = "i", descriptor = "I")
	protected int anInt798;

	@OriginalMember(owner = "client!UBLCAEEN", name = "k", descriptor = "I")
	protected int anInt799;

	@OriginalMember(owner = "client!UBLCAEEN", name = "l", descriptor = "I")
	protected int anInt800;

	@OriginalMember(owner = "client!UBLCAEEN", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!UBLCAEEN", name = "n", descriptor = "Lclient!XBLPPVAP;")
	protected Class42 aClass42_2;

	@OriginalMember(owner = "client!UBLCAEEN", name = "p", descriptor = "Lclient!ZQDWDFIV;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!UBLCAEEN", name = "s", descriptor = "I")
	protected int anInt801;

	@OriginalMember(owner = "client!UBLCAEEN", name = "t", descriptor = "I")
	protected int anInt802;

	@OriginalMember(owner = "client!UBLCAEEN", name = "u", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!UBLCAEEN", name = "v", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!UBLCAEEN", name = "w", descriptor = "I")
	private int anInt805;

	@OriginalMember(owner = "client!UBLCAEEN", name = "x", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!UBLCAEEN", name = "y", descriptor = "I")
	private int anInt807;

	@OriginalMember(owner = "client!UBLCAEEN", name = "z", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!UBLCAEEN", name = "A", descriptor = "I")
	protected int anInt808;

	@OriginalMember(owner = "client!UBLCAEEN", name = "B", descriptor = "I")
	protected int anInt809;

	@OriginalMember(owner = "client!UBLCAEEN", name = "C", descriptor = "I")
	protected int anInt810;

	@OriginalMember(owner = "client!UBLCAEEN", name = "D", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!UBLCAEEN", name = "G", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!UBLCAEEN", name = "H", descriptor = "I")
	private int anInt812;

	@OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "I")
	private int anInt794 = -943;

	@OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!UBLCAEEN", name = "c", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!UBLCAEEN", name = "d", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!UBLCAEEN", name = "f", descriptor = "I")
	private int anInt796 = 20;

	@OriginalMember(owner = "client!UBLCAEEN", name = "g", descriptor = "I")
	protected int anInt797 = 1;

	@OriginalMember(owner = "client!UBLCAEEN", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!UBLCAEEN", name = "j", descriptor = "Z")
	protected boolean aBoolean237 = false;

	@OriginalMember(owner = "client!UBLCAEEN", name = "o", descriptor = "[Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array3 = new Class2_Sub1_Sub1_Sub3[6];

	@OriginalMember(owner = "client!UBLCAEEN", name = "q", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!UBLCAEEN", name = "r", descriptor = "Z")
	protected boolean aBoolean239 = true;

	@OriginalMember(owner = "client!UBLCAEEN", name = "E", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!UBLCAEEN", name = "F", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(III)V")
	protected final void method576() {
		try {
			this.anInt799 = 765;
			this.anInt800 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt800, 183, this.anInt799, this);
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass42_2 = new Class42(this.method586(), this.anInt799, this.anInt800, false);
			this.method587(this, 1);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("23599, " + 503 + ", " + 6 + ", " + 765 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "(III)V")
	protected final void method577() {
		try {
			this.anInt799 = 765;
			this.anInt800 = 503;
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass42_2 = new Class42(this.method586(), this.anInt799, this.anInt800, false);
			this.method587(this, 1);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("99735, " + 503 + ", " + -383 + ", " + 765 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method586().addMouseListener(this);
		this.method586().addMouseMotionListener(this);
		this.method586().addKeyListener(this);
		this.method586().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588("Loading...", 0, (byte) 5);
		this.method581();
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
				if (this.anInt795 < 0) {
					if (this.anInt795 == -1) {
						this.method578();
					}
					return;
				}
				if (this.anInt795 > 0) {
					this.anInt795--;
					if (this.anInt795 == 0) {
						this.method578();
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
					local39 = (int) ((long) (this.anInt796 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt796 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt796) {
					local41 = this.anInt796;
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
				if (local41 < this.anInt797) {
					local41 = this.anInt797;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt808 = this.anInt805;
					this.anInt809 = this.anInt806;
					this.anInt810 = this.anInt807;
					this.aLong28 = this.aLong27;
					this.anInt805 = 0;
					this.method582(this.aBoolean234);
					this.anInt811 = this.anInt812;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt796 > 0) {
					this.anInt798 = local39 * 1000 / (this.anInt796 * 256);
				}
				this.method584();
			} while (!this.aBoolean237);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(286) int local286 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt798 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt796 + " mindel:" + this.anInt797);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean237 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(Z)V")
	private void method578() {
		try {
			this.anInt795 = -2;
			this.method583(271);
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
			signlink.reporterror("62679, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(II)V")
	protected final void method579() {
		try {
			this.anInt796 = 1000;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("40772, " + 7 + ", " + 1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt795 >= 0) {
			this.anInt795 = 0;
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt795 >= 0) {
			this.anInt795 = 4000 / this.anInt796;
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt795 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt795 == -1) {
			this.method578();
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean238 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean238 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt801 = 0;
		this.anInt806 = local2;
		this.anInt807 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt805 = 2;
			this.anInt802 = 2;
		} else {
			this.anInt805 = 1;
			this.anInt802 = 1;
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt801 = 0;
		this.anInt802 = 0;
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt801 = 0;
		this.anInt803 = -1;
		this.anInt804 = -1;
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt801 = 0;
		this.anInt803 = local2;
		this.anInt804 = local5;
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt801 = 0;
		this.anInt803 = local2;
		this.anInt804 = local5;
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt801 = 0;
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
			this.anIntArray211[this.anInt812] = local10;
			this.anInt812 = this.anInt812 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt801 = 0;
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

	@OriginalMember(owner = "client!UBLCAEEN", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(I)I")
	protected final int method580() {
		try {
			@Pc(10) int local10 = -1;
			if (this.anInt812 != this.anInt811) {
				local10 = this.anIntArray211[this.anInt811];
				this.anInt811 = this.anInt811 + 1 & 0x7F;
			}
			return local10;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("58135, " + 4 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean239 = true;
		this.aBoolean238 = true;
		this.method585();
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean239 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "()V")
	protected void method581() {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "(Z)V")
	protected void method582(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.aBoolean234 = !this.aBoolean234;
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("92596, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "(I)V")
	protected void method583(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(B)V")
	protected void method584() {
		try {
			;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("48802, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "c", descriptor = "(Z)V")
	protected void method585() {
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "(B)Ljava/awt/Component;")
	protected Component method586() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("39322, " + 75 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	protected void method588(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method586().getGraphics();
				try {
					this.method586().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method586().getFontMetrics(local36);
			@Pc(47) boolean local47 = false;
			@Pc(64) Font local64 = new Font("Helvetica", 0, 13);
			this.method586().getFontMetrics(local64);
			if (this.aBoolean238) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt799, this.anInt800);
				this.aBoolean238 = false;
			}
			@Pc(96) Color local96 = new Color(140, 17, 17);
			@Pc(103) int local103 = this.anInt800 / 2 - 18;
			this.aGraphics2.setColor(local96);
			this.aGraphics2.drawRect(this.anInt799 / 2 - 152, local103, 304, 34);
			this.aGraphics2.fillRect(this.anInt799 / 2 - 150, local103 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt799 / 2 + arg1 * 3 - 150, local103 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt799 - local42.stringWidth(arg0)) / 2, local103 + 22);
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("45987, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}
}
