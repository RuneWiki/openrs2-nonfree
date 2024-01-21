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

@OriginalClass("client!GRXJFORE")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!GRXJFORE", name = "d", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!GRXJFORE", name = "f", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!GRXJFORE", name = "j", descriptor = "I")
	protected int anInt799;

	@OriginalMember(owner = "client!GRXJFORE", name = "l", descriptor = "I")
	protected int anInt800;

	@OriginalMember(owner = "client!GRXJFORE", name = "m", descriptor = "I")
	protected int anInt801;

	@OriginalMember(owner = "client!GRXJFORE", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!GRXJFORE", name = "o", descriptor = "Lclient!GYXQUUFC;")
	protected Class13 aClass13_2;

	@OriginalMember(owner = "client!GRXJFORE", name = "q", descriptor = "Lclient!JWHKCZBF;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!GRXJFORE", name = "t", descriptor = "I")
	protected int anInt802;

	@OriginalMember(owner = "client!GRXJFORE", name = "u", descriptor = "I")
	protected int anInt803;

	@OriginalMember(owner = "client!GRXJFORE", name = "v", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!GRXJFORE", name = "w", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!GRXJFORE", name = "x", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!GRXJFORE", name = "y", descriptor = "I")
	private int anInt807;

	@OriginalMember(owner = "client!GRXJFORE", name = "z", descriptor = "I")
	private int anInt808;

	@OriginalMember(owner = "client!GRXJFORE", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!GRXJFORE", name = "B", descriptor = "I")
	protected int anInt809;

	@OriginalMember(owner = "client!GRXJFORE", name = "C", descriptor = "I")
	protected int anInt810;

	@OriginalMember(owner = "client!GRXJFORE", name = "D", descriptor = "I")
	protected int anInt811;

	@OriginalMember(owner = "client!GRXJFORE", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!GRXJFORE", name = "H", descriptor = "I")
	private int anInt812;

	@OriginalMember(owner = "client!GRXJFORE", name = "I", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!GRXJFORE", name = "b", descriptor = "I")
	private int anInt793 = 932;

	@OriginalMember(owner = "client!GRXJFORE", name = "c", descriptor = "I")
	private int anInt794 = 5;

	@OriginalMember(owner = "client!GRXJFORE", name = "e", descriptor = "Z")
	private boolean aBoolean192 = true;

	@OriginalMember(owner = "client!GRXJFORE", name = "g", descriptor = "I")
	private int anInt797 = 20;

	@OriginalMember(owner = "client!GRXJFORE", name = "h", descriptor = "I")
	protected int anInt798 = 1;

	@OriginalMember(owner = "client!GRXJFORE", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!GRXJFORE", name = "k", descriptor = "Z")
	protected boolean aBoolean193 = false;

	@OriginalMember(owner = "client!GRXJFORE", name = "p", descriptor = "[Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array3 = new Class3_Sub1_Sub2_Sub4[6];

	@OriginalMember(owner = "client!GRXJFORE", name = "r", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!GRXJFORE", name = "s", descriptor = "Z")
	protected boolean aBoolean195 = true;

	@OriginalMember(owner = "client!GRXJFORE", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!GRXJFORE", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(III)V")
	protected final void method575() {
		try {
			this.anInt800 = 765;
			this.anInt801 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, this.anInt801, -45071, this.anInt800);
			this.aGraphics2 = this.method585().getGraphics();
			this.aClass13_2 = new Class13(3, this.anInt801, this.anInt800, this.method585());
			this.method586(this, 1);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("14107, " + -12006 + ", " + 765 + ", " + 503 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "b", descriptor = "(III)V")
	protected final void method576() {
		try {
			this.anInt800 = 765;
			this.anInt801 = 503;
			this.aGraphics2 = this.method585().getGraphics();
			this.aClass13_2 = new Class13(3, this.anInt801, this.anInt800, this.method585());
			this.method586(this, 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("99410, " + 37560 + ", " + 765 + ", " + 503 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method585().addMouseListener(this);
		this.method585().addMouseMotionListener(this);
		this.method585().addKeyListener(this);
		this.method585().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method587(0, "Loading...");
		this.method580();
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
				if (this.anInt796 < 0) {
					if (this.anInt796 == -1) {
						this.method577();
					}
					return;
				}
				if (this.anInt796 > 0) {
					this.anInt796--;
					if (this.anInt796 == 0) {
						this.method577();
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
					local39 = (int) ((long) (this.anInt797 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt797 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt797) {
					local41 = this.anInt797;
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
				if (local41 < this.anInt798) {
					local41 = this.anInt798;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt809 = this.anInt806;
					this.anInt810 = this.anInt807;
					this.anInt811 = this.anInt808;
					this.aLong28 = this.aLong27;
					this.anInt806 = 0;
					this.method581(this.anInt794);
					this.anInt812 = this.anInt813;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt797 > 0) {
					this.anInt799 = local39 * 1000 / (this.anInt797 * 256);
				}
				this.method583();
			} while (!this.aBoolean193);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(286) int local286 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt799 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt797 + " mindel:" + this.anInt798);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean193 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(B)V")
	private void method577() {
		try {
			this.anInt796 = -2;
			this.method582();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(23) Exception local23) {
				}
				try {
					System.exit(0);
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("2110, " + -15 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(ZI)V")
	protected final void method578() {
		try {
			this.anInt797 = 1000;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("86893, " + false + ", " + 1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt796 >= 0) {
			this.anInt796 = 0;
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt796 >= 0) {
			this.anInt796 = 4000 / this.anInt797;
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt796 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt796 == -1) {
			this.method577();
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean194 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean194 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt802 = 0;
		this.anInt807 = local2;
		this.anInt808 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt806 = 2;
			this.anInt803 = 2;
		} else {
			this.anInt806 = 1;
			this.anInt803 = 1;
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt802 = 0;
		this.anInt803 = 0;
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt802 = 0;
		this.anInt804 = -1;
		this.anInt805 = -1;
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt802 = 0;
		this.anInt804 = local2;
		this.anInt805 = local5;
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt802 = 0;
		this.anInt804 = local2;
		this.anInt805 = local5;
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt802 = 0;
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
			this.anIntArray211[this.anInt813] = local10;
			this.anInt813 = this.anInt813 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt802 = 0;
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

	@OriginalMember(owner = "client!GRXJFORE", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(I)I")
	protected final int method579(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.anInt795 = -97;
			}
			@Pc(6) int local6 = -1;
			if (this.anInt813 != this.anInt812) {
				local6 = this.anIntArray211[this.anInt812];
				this.anInt812 = this.anInt812 + 1 & 0x7F;
			}
			return local6;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("13136, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean195 = true;
		this.aBoolean194 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean195 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "()V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "b", descriptor = "(I)V")
	protected void method581(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < this.anInt794 || arg0 > this.anInt794) {
				this.aBoolean191 = !this.aBoolean191;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("84987, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "c", descriptor = "(I)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "d", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "e", descriptor = "(I)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "f", descriptor = "(I)Ljava/awt/Component;")
	protected Component method585() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("11315, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method586(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(BILjava/lang/String;)V")
	protected void method587(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method585().getGraphics();
				try {
					this.method585().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method585().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method585().getFontMetrics(local49);
			if (this.aBoolean194) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt800, this.anInt801);
				this.aBoolean194 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt801 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt800 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt800 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt800 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt800 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("2122, " + -59 + ", " + arg0 + ", " + arg1 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}
}
