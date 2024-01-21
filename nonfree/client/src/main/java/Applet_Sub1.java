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

@OriginalClass("client!EBSHSFRY")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!EBSHSFRY", name = "e", descriptor = "I")
	private int anInt799;

	@OriginalMember(owner = "client!EBSHSFRY", name = "g", descriptor = "I")
	private int anInt801;

	@OriginalMember(owner = "client!EBSHSFRY", name = "k", descriptor = "I")
	protected int anInt804;

	@OriginalMember(owner = "client!EBSHSFRY", name = "m", descriptor = "I")
	protected int anInt805;

	@OriginalMember(owner = "client!EBSHSFRY", name = "n", descriptor = "I")
	protected int anInt806;

	@OriginalMember(owner = "client!EBSHSFRY", name = "o", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!EBSHSFRY", name = "p", descriptor = "Lclient!HURULSIZ;")
	protected Class17 aClass17_2;

	@OriginalMember(owner = "client!EBSHSFRY", name = "r", descriptor = "Lclient!GDXGVBDZ;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!EBSHSFRY", name = "u", descriptor = "I")
	protected int anInt807;

	@OriginalMember(owner = "client!EBSHSFRY", name = "v", descriptor = "I")
	protected int anInt808;

	@OriginalMember(owner = "client!EBSHSFRY", name = "w", descriptor = "I")
	public int anInt809;

	@OriginalMember(owner = "client!EBSHSFRY", name = "x", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!EBSHSFRY", name = "y", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!EBSHSFRY", name = "z", descriptor = "I")
	private int anInt812;

	@OriginalMember(owner = "client!EBSHSFRY", name = "A", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!EBSHSFRY", name = "B", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!EBSHSFRY", name = "C", descriptor = "I")
	protected int anInt814;

	@OriginalMember(owner = "client!EBSHSFRY", name = "D", descriptor = "I")
	protected int anInt815;

	@OriginalMember(owner = "client!EBSHSFRY", name = "E", descriptor = "I")
	protected int anInt816;

	@OriginalMember(owner = "client!EBSHSFRY", name = "F", descriptor = "J")
	protected long aLong28;

	@OriginalMember(owner = "client!EBSHSFRY", name = "I", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!EBSHSFRY", name = "J", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "Z")
	private boolean aBoolean177 = true;

	@OriginalMember(owner = "client!EBSHSFRY", name = "b", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!EBSHSFRY", name = "c", descriptor = "B")
	private byte aByte31 = 4;

	@OriginalMember(owner = "client!EBSHSFRY", name = "d", descriptor = "I")
	private int anInt798 = 474;

	@OriginalMember(owner = "client!EBSHSFRY", name = "f", descriptor = "I")
	private int anInt800 = 148;

	@OriginalMember(owner = "client!EBSHSFRY", name = "h", descriptor = "I")
	private int anInt802 = 20;

	@OriginalMember(owner = "client!EBSHSFRY", name = "i", descriptor = "I")
	protected int anInt803 = 1;

	@OriginalMember(owner = "client!EBSHSFRY", name = "j", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!EBSHSFRY", name = "l", descriptor = "Z")
	protected boolean aBoolean179 = false;

	@OriginalMember(owner = "client!EBSHSFRY", name = "q", descriptor = "[Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array3 = new Class2_Sub1_Sub2_Sub2[6];

	@OriginalMember(owner = "client!EBSHSFRY", name = "s", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!EBSHSFRY", name = "t", descriptor = "Z")
	protected boolean aBoolean181 = true;

	@OriginalMember(owner = "client!EBSHSFRY", name = "G", descriptor = "[I")
	protected int[] anIntArray210 = new int[128];

	@OriginalMember(owner = "client!EBSHSFRY", name = "H", descriptor = "[I")
	private int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(IBI)V")
	protected final void method575(@OriginalArg(1) byte arg0) {
		try {
			this.anInt805 = 765;
			this.anInt806 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt805, this.anInt806, this, true);
			if (arg0 == this.aByte31) {
				@Pc(22) boolean local22 = false;
			} else {
				this.anInt800 = -105;
			}
			this.aGraphics2 = this.method585().getGraphics();
			this.aClass17_2 = new Class17(this.anInt806, this.anInt805, this.method585(), this.anInt799);
			this.method586(this, 1);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("37831, " + 503 + ", " + arg0 + ", " + 765 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "b", descriptor = "(IBI)V")
	protected final void method576(@OriginalArg(1) byte arg0) {
		try {
			this.anInt805 = 765;
			this.anInt806 = 503;
			this.aGraphics2 = this.method585().getGraphics();
			@Pc(16) boolean local16 = false;
			this.aClass17_2 = new Class17(this.anInt806, this.anInt805, this.method585(), this.anInt799);
			this.method586(this, 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("54794, " + 503 + ", " + arg0 + ", " + 765 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "run", descriptor = "()V")
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
				if (this.anInt801 < 0) {
					if (this.anInt801 == -1) {
						this.method577();
					}
					return;
				}
				if (this.anInt801 > 0) {
					this.anInt801--;
					if (this.anInt801 == 0) {
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
					local39 = (int) ((long) (this.anInt802 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt802 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt802) {
					local41 = this.anInt802;
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
				if (local41 < this.anInt803) {
					local41 = this.anInt803;
				}
				try {
					Thread.sleep((long) local41);
				} catch (@Pc(203) InterruptedException local203) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt814 = this.anInt811;
					this.anInt815 = this.anInt812;
					this.anInt816 = this.anInt813;
					this.aLong28 = this.aLong27;
					this.anInt811 = 0;
					this.method581(this.anInt798);
					this.anInt817 = this.anInt818;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt802 > 0) {
					this.anInt804 = local39 * 1000 / (this.anInt802 * 256);
				}
				this.method583();
			} while (!this.aBoolean179);
			System.out.println("ntime:" + local60);
			for (local169 = 0; local169 < 10; local169++) {
				@Pc(286) int local286 = (local37 + 20 - local169 - 1) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt804 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt802 + " mindel:" + this.anInt803);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean179 = false;
			local45 = 0;
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(Z)V")
	private void method577() {
		try {
			this.anInt801 = -2;
			this.method582();
			if (this.aFrame_Sub1_2 != null) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(15) Exception local15) {
				}
				try {
					System.exit(0);
				} catch (@Pc(19) Throwable local19) {
				}
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("5150, " + false + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(II)V")
	protected final void method578() {
		try {
			this.anInt802 = 1000;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("59849, " + 1 + ", " + -92 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt801 >= 0) {
			this.anInt801 = 0;
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt801 >= 0) {
			this.anInt801 = 4000 / this.anInt802;
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt801 = -1;
		try {
			Thread.sleep(10000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt801 == -1) {
			this.method577();
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean180 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean180 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt807 = 0;
		this.anInt812 = local2;
		this.anInt813 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt811 = 2;
			this.anInt808 = 2;
		} else {
			this.anInt811 = 1;
			this.anInt808 = 1;
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt807 = 0;
		this.anInt808 = 0;
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt807 = 0;
		this.anInt809 = -1;
		this.anInt810 = -1;
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt807 = 0;
		this.anInt809 = local2;
		this.anInt810 = local5;
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt807 = 0;
		this.anInt809 = local2;
		this.anInt810 = local5;
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt807 = 0;
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
			this.anIntArray211[this.anInt818] = local10;
			this.anInt818 = this.anInt818 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt807 = 0;
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

	@OriginalMember(owner = "client!EBSHSFRY", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "b", descriptor = "(Z)I")
	protected final int method579() {
		try {
			@Pc(5) int local5 = -1;
			if (this.anInt818 != this.anInt817) {
				local5 = this.anIntArray211[this.anInt817];
				this.anInt817 = this.anInt817 + 1 & 0x7F;
			}
			return local5;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("69834, " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean181 = true;
		this.aBoolean180 = true;
		this.method584();
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean181 = false;
		for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "()V")
	protected void method580() {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(I)V")
	protected void method581(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 31 / arg0;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("5071, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "b", descriptor = "(I)V")
	protected void method582() {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "c", descriptor = "(I)V")
	protected void method583() {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "d", descriptor = "(I)V")
	protected void method584() {
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "c", descriptor = "(Z)Ljava/awt/Component;")
	protected Component method585() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("20587, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method586(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(ILjava/lang/String;I)V")
	protected void method587(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method585().getGraphics();
				try {
					this.method585().repaint();
				} catch (@Pc(14) Exception local14) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(18) Exception local18) {
				}
			}
			@Pc(29) Font local29 = new Font("Helvetica", 1, 13);
			@Pc(35) FontMetrics local35 = this.method585().getFontMetrics(local29);
			@Pc(42) Font local42 = new Font("Helvetica", 0, 13);
			this.method585().getFontMetrics(local42);
			if (this.aBoolean180) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt805, this.anInt806);
				this.aBoolean180 = false;
			}
			@Pc(74) Color local74 = new Color(140, 17, 17);
			@Pc(81) int local81 = this.anInt806 / 2 - 18;
			this.aGraphics2.setColor(local74);
			this.aGraphics2.drawRect(this.anInt805 / 2 - 152, local81, 304, 34);
			this.aGraphics2.fillRect(this.anInt805 / 2 - 150, local81 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt805 / 2 + arg0 * 3 - 150, local81 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local29);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt805 - local35.stringWidth(arg1)) / 2, local81 + 22);
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("70647, " + arg0 + ", " + arg1 + ", " + -71 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}
}
