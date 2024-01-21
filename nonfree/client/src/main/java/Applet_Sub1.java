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

@OriginalClass("client!UNXTKTRJ")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!UNXTKTRJ", name = "f", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "j", descriptor = "I")
	protected int anInt846;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "l", descriptor = "I")
	protected int anInt847;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "m", descriptor = "I")
	protected int anInt848;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "n", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "o", descriptor = "Lclient!YQSLUNUN;")
	protected Class50 aClass50_2;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "q", descriptor = "Lclient!LQFUVOUC;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "t", descriptor = "I")
	protected int anInt849;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "u", descriptor = "I")
	protected int anInt850;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "v", descriptor = "I")
	public int anInt851;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "w", descriptor = "I")
	public int anInt852;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "x", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "y", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "z", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "A", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "B", descriptor = "I")
	protected int anInt856;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "C", descriptor = "I")
	protected int anInt857;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "D", descriptor = "I")
	protected int anInt858;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "E", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "H", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "I", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "b", descriptor = "I")
	private int anInt841 = -318;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "c", descriptor = "Z")
	private boolean aBoolean187 = true;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "d", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "e", descriptor = "I")
	private int anInt842 = 6;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "g", descriptor = "I")
	private int anInt844 = 20;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "h", descriptor = "I")
	protected int anInt845 = 1;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!UNXTKTRJ", name = "k", descriptor = "Z")
	protected boolean aBoolean189 = false;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "p", descriptor = "[Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array3 = new Class1_Sub1_Sub2_Sub4[6];

	@OriginalMember(owner = "client!UNXTKTRJ", name = "r", descriptor = "Z")
	private boolean aBoolean190 = true;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "s", descriptor = "Z")
	protected boolean aBoolean191 = true;

	@OriginalMember(owner = "client!UNXTKTRJ", name = "F", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!UNXTKTRJ", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "(III)V")
	protected final void method567() {
		try {
			this.anInt847 = 765;
			this.anInt848 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1((byte) 2, this.anInt847, this.anInt848, this);
			this.aGraphics2 = this.method577((byte) 7).getGraphics();
			this.aClass50_2 = new Class50(this.anInt848, this.method577((byte) 7), this.anInt847, (byte) 1);
			this.method578(this, 1);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("88762, " + 503 + ", " + 0 + ", " + 765 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "(IIB)V")
	protected final void method568() {
		try {
			this.anInt847 = 765;
			this.anInt848 = 503;
			this.aGraphics2 = this.method577((byte) 7).getGraphics();
			this.aClass50_2 = new Class50(this.anInt848, this.method577((byte) 7), this.anInt847, (byte) 1);
			this.method578(this, 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("10432, " + 503 + ", " + 765 + ", " + -23 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method577((byte) 7).addMouseListener(this);
		this.method577((byte) 7).addMouseMotionListener(this);
		this.method577((byte) 7).addKeyListener(this);
		this.method577((byte) 7).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method579(0, "Loading...");
		this.method572();
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
				if (this.anInt843 < 0) {
					if (this.anInt843 == -1) {
						this.method569();
					}
					return;
				}
				if (this.anInt843 > 0) {
					this.anInt843--;
					if (this.anInt843 == 0) {
						this.method569();
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
					local39 = (int) ((long) (this.anInt844 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt844 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt844) {
					local41 = this.anInt844;
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
				if (local41 < this.anInt845) {
					local41 = this.anInt845;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt856 = this.anInt853;
					this.anInt857 = this.anInt854;
					this.anInt858 = this.anInt855;
					this.aLong28 = this.aLong27;
					this.anInt853 = 0;
					this.method573();
					this.anInt859 = this.anInt860;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt844 > 0) {
					this.anInt846 = local39 * 1000 / (this.anInt844 * 256);
				}
				this.method575((byte) 6);
			} while (!this.aBoolean189);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(285) int local285 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local285 + ":" + this.aLongArray2[local285]);
			}
			System.out.println("fps:" + this.anInt846 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt844 + " mindel:" + this.anInt845);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean189 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "(B)V")
	private void method569() {
		try {
			this.anInt843 = -2;
			this.method574();
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
			signlink.reporterror("93796, " + 3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "(II)V")
	protected final void method570(@OriginalArg(0) int arg0) {
		try {
			this.anInt844 = 1000;
			@Pc(8) boolean local8 = false;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("88598, " + arg0 + ", " + 1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt843 >= 0) {
			this.anInt843 = 0;
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt843 >= 0) {
			this.anInt843 = 4000 / this.anInt844;
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt843 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt843 == -1) {
			this.method569();
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean190 = true;
		this.method576();
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean190 = true;
		this.method576();
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt849 = 0;
		this.anInt854 = local2;
		this.anInt855 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt853 = 2;
			this.anInt850 = 2;
		} else {
			this.anInt853 = 1;
			this.anInt850 = 1;
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt849 = 0;
		this.anInt850 = 0;
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt849 = 0;
		this.anInt851 = -1;
		this.anInt852 = -1;
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt849 = 0;
		this.anInt851 = local2;
		this.anInt852 = local5;
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt849 = 0;
		this.anInt851 = local2;
		this.anInt852 = local5;
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt849 = 0;
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
			this.anIntArray211[this.anInt860] = local10;
			this.anInt860 = this.anInt860 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt849 = 0;
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

	@OriginalMember(owner = "client!UNXTKTRJ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "b", descriptor = "(B)I")
	protected final int method571() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt860 != this.anInt859) {
				local7 = this.anIntArray211[this.anInt859];
				this.anInt859 = this.anInt859 + 1 & 0x7F;
			}
			return local7;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("58103, " + -122 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean191 = true;
		this.aBoolean190 = true;
		this.method576();
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean191 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "()V")
	protected void method572() {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "(Z)V")
	protected void method573() {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "(I)V")
	protected void method574() {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "c", descriptor = "(B)V")
	protected void method575(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "b", descriptor = "(Z)V")
	protected void method576() {
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "d", descriptor = "(B)Ljava/awt/Component;")
	protected Component method577(@OriginalArg(0) byte arg0) {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("10389, " + 7 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method578(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!UNXTKTRJ", name = "a", descriptor = "(IZLjava/lang/String;)V")
	protected void method579(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method577((byte) 7).getGraphics();
				try {
					this.method577((byte) 7).repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method577((byte) 7).getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method577((byte) 7).getFontMetrics(local49);
			if (this.aBoolean190) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt847, this.anInt848);
				this.aBoolean190 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt848 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt847 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt847 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt847 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt847 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("27928, " + arg0 + ", " + false + ", " + arg1 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}
}
