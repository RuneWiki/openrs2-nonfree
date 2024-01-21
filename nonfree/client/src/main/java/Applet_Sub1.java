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

@OriginalClass("client!KHACHIFW")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!KHACHIFW", name = "d", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!KHACHIFW", name = "h", descriptor = "I")
	protected int anInt822;

	@OriginalMember(owner = "client!KHACHIFW", name = "j", descriptor = "I")
	protected int anInt823;

	@OriginalMember(owner = "client!KHACHIFW", name = "k", descriptor = "I")
	protected int anInt824;

	@OriginalMember(owner = "client!KHACHIFW", name = "l", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!KHACHIFW", name = "m", descriptor = "Lclient!IVIFZQBK;")
	protected Class17 aClass17_2;

	@OriginalMember(owner = "client!KHACHIFW", name = "o", descriptor = "Lclient!FPVKJCAH;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!KHACHIFW", name = "r", descriptor = "I")
	protected int anInt825;

	@OriginalMember(owner = "client!KHACHIFW", name = "s", descriptor = "I")
	protected int anInt826;

	@OriginalMember(owner = "client!KHACHIFW", name = "t", descriptor = "I")
	public int anInt827;

	@OriginalMember(owner = "client!KHACHIFW", name = "u", descriptor = "I")
	public int anInt828;

	@OriginalMember(owner = "client!KHACHIFW", name = "v", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!KHACHIFW", name = "w", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!KHACHIFW", name = "x", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!KHACHIFW", name = "y", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!KHACHIFW", name = "z", descriptor = "I")
	protected int anInt832;

	@OriginalMember(owner = "client!KHACHIFW", name = "A", descriptor = "I")
	protected int anInt833;

	@OriginalMember(owner = "client!KHACHIFW", name = "B", descriptor = "I")
	protected int anInt834;

	@OriginalMember(owner = "client!KHACHIFW", name = "C", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!KHACHIFW", name = "F", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!KHACHIFW", name = "G", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!KHACHIFW", name = "a", descriptor = "Z")
	private boolean aBoolean214 = true;

	@OriginalMember(owner = "client!KHACHIFW", name = "b", descriptor = "I")
	private int anInt817 = 24869;

	@OriginalMember(owner = "client!KHACHIFW", name = "c", descriptor = "I")
	private int anInt818 = 748;

	@OriginalMember(owner = "client!KHACHIFW", name = "e", descriptor = "I")
	private int anInt820 = 20;

	@OriginalMember(owner = "client!KHACHIFW", name = "f", descriptor = "I")
	protected int anInt821 = 1;

	@OriginalMember(owner = "client!KHACHIFW", name = "g", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!KHACHIFW", name = "i", descriptor = "Z")
	protected boolean aBoolean215 = false;

	@OriginalMember(owner = "client!KHACHIFW", name = "n", descriptor = "[Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array3 = new Class1_Sub1_Sub1_Sub1[6];

	@OriginalMember(owner = "client!KHACHIFW", name = "p", descriptor = "Z")
	private boolean aBoolean216 = true;

	@OriginalMember(owner = "client!KHACHIFW", name = "q", descriptor = "Z")
	protected boolean aBoolean217 = true;

	@OriginalMember(owner = "client!KHACHIFW", name = "D", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!KHACHIFW", name = "E", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!KHACHIFW", name = "a", descriptor = "(IZI)V")
	protected final void method565() {
		try {
			this.anInt823 = 765;
			this.anInt824 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, this.anInt823, (byte) 5, this.anInt824);
			this.aGraphics2 = this.method575().getGraphics();
			this.aClass17_2 = new Class17(this.anInt823, this.anInt824, this.method575(), 0);
			this.method576(this, 1);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("61841, " + 503 + ", " + false + ", " + 765 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "b", descriptor = "(IZI)V")
	protected final void method566() {
		try {
			this.anInt823 = 765;
			this.anInt824 = 503;
			this.aGraphics2 = this.method575().getGraphics();
			this.aClass17_2 = new Class17(this.anInt823, this.anInt824, this.method575(), 0);
			this.method576(this, 1);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("44058, " + 503 + ", " + false + ", " + 765 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method575().addMouseListener(this);
		this.method575().addMouseMotionListener(this);
		this.method575().addKeyListener(this);
		this.method575().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method577(0, "Loading...");
		this.method570();
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
				if (this.anInt819 < 0) {
					if (this.anInt819 == -1) {
						this.method567();
					}
					return;
				}
				if (this.anInt819 > 0) {
					this.anInt819--;
					if (this.anInt819 == 0) {
						this.method567();
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
					local39 = (int) ((long) (this.anInt820 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt820 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt820) {
					local41 = this.anInt820;
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
				if (local41 < this.anInt821) {
					local41 = this.anInt821;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt832 = this.anInt829;
					this.anInt833 = this.anInt830;
					this.anInt834 = this.anInt831;
					this.aLong28 = this.aLong27;
					this.anInt829 = 0;
					this.method571();
					this.anInt835 = this.anInt836;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt820 > 0) {
					this.anInt822 = local39 * 1000 / (this.anInt820 * 256);
				}
				this.method573();
			} while (!this.aBoolean215);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt822 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt820 + " mindel:" + this.anInt821);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean215 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "a", descriptor = "(I)V")
	private void method567() {
		try {
			this.anInt819 = -2;
			this.method572(493);
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
			signlink.reporterror("13735, " + 4747 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "a", descriptor = "(ZI)V")
	protected final void method568() {
		try {
			this.anInt820 = 1000;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("88292, " + false + ", " + 1 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt819 >= 0) {
			this.anInt819 = 0;
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt819 >= 0) {
			this.anInt819 = 4000 / this.anInt820;
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt819 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt819 == -1) {
			this.method567();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean216 = true;
		this.method574((byte) 1);
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean216 = true;
		this.method574((byte) 1);
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt825 = 0;
		this.anInt830 = local2;
		this.anInt831 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt829 = 2;
			this.anInt826 = 2;
		} else {
			this.anInt829 = 1;
			this.anInt826 = 1;
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt825 = 0;
		this.anInt826 = 0;
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt825 = 0;
		this.anInt827 = -1;
		this.anInt828 = -1;
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt825 = 0;
		this.anInt827 = local2;
		this.anInt828 = local5;
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt825 = 0;
		this.anInt827 = local2;
		this.anInt828 = local5;
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt825 = 0;
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
			this.anIntArray211[this.anInt836] = local10;
			this.anInt836 = this.anInt836 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt825 = 0;
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

	@OriginalMember(owner = "client!KHACHIFW", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "b", descriptor = "(I)I")
	protected final int method569() {
		try {
			@Pc(14) int local14 = -1;
			if (this.anInt836 != this.anInt835) {
				local14 = this.anIntArray211[this.anInt835];
				this.anInt835 = this.anInt835 + 1 & 0x7F;
			}
			return local14;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("66235, " + -796 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean217 = true;
		this.aBoolean216 = true;
		this.method574((byte) 1);
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean217 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "a", descriptor = "()V")
	protected void method570() {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "c", descriptor = "(I)V")
	protected void method571() {
		try {
			if (this.anInt817 == 24869) {
				;
			}
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("38427, " + 24869 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "d", descriptor = "(I)V")
	protected void method572(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("49106, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "e", descriptor = "(I)V")
	protected void method573() {
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "a", descriptor = "(B)V")
	protected void method574(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("6639, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "f", descriptor = "(I)Ljava/awt/Component;")
	protected Component method575() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("82353, " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method576(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!KHACHIFW", name = "a", descriptor = "(IBLjava/lang/String;)V")
	protected void method577(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method575().getGraphics();
				try {
					this.method575().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method575().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method575().getFontMetrics(local49);
			if (this.aBoolean216) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt823, this.anInt824);
				this.aBoolean216 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt824 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt823 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt823 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt823 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt823 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("49633, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}
}
