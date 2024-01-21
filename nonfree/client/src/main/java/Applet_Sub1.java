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

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	private int anInt125;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	protected int anInt126;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "I")
	protected int anInt127;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Lclient!qb;")
	protected Class32 aClass32_2;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	protected int anInt128;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	protected int anInt129;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	protected int anInt130;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	protected int anInt131;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	protected int anInt132;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	protected int anInt133;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	protected int anInt134;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "I")
	private int anInt136;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	private int anInt119 = -17143;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "B")
	private byte aByte11 = 5;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "B")
	private byte aByte12 = -14;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "B")
	private byte aByte13 = 3;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "B")
	private byte aByte14 = 123;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	private int anInt120 = -43626;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	private int anInt121 = 17194;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	private int anInt123 = 20;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	protected int anInt124 = 1;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "t", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array2 = new Class1_Sub3_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
	private boolean aBoolean35 = true;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "[I")
	protected int[] anIntArray28 = new int[128];

	@OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
	private int[] anIntArray29 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)V")
	protected final void method62() {
		try {
			this.anInt126 = 789;
			this.anInt127 = 532;
			this.aFrame_Sub1_2 = new Frame_Sub1(this, this.anInt127, (byte) 5, this.anInt126);
			this.aGraphics2 = this.method72(this.anInt121).getGraphics();
			this.aClass32_2 = new Class32((byte) -121, this.anInt127, this.method72(this.anInt121), this.anInt126);
			if (this.aByte12 == -14) {
				this.method73(this, 1);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("16744, " + 532 + ", " + -14 + ", " + 789 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method63() {
		try {
			this.anInt126 = 789;
			this.anInt127 = 532;
			this.aGraphics2 = this.method72(this.anInt121).getGraphics();
			this.aClass32_2 = new Class32((byte) -121, this.anInt127, this.method72(this.anInt121), this.anInt126);
			this.method73(this, 1);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("5326, " + 789 + ", " + 532 + ", " + 2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method72(this.anInt121).addMouseListener(this);
		this.method72(this.anInt121).addMouseMotionListener(this);
		this.method72(this.anInt121).addKeyListener(this);
		this.method72(this.anInt121).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method74(0, "Loading...");
		this.method67();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		@Pc(45) int local45 = 1;
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			this.aLongArray2[local49] = System.currentTimeMillis();
		}
		@Pc(62) long local62 = System.currentTimeMillis();
		while (this.anInt122 >= 0) {
			if (this.anInt122 > 0) {
				this.anInt122--;
				if (this.anInt122 == 0) {
					this.method64();
					return;
				}
			}
			@Pc(82) int local82 = local43;
			@Pc(84) int local84 = local45;
			local43 = 300;
			local45 = 1;
			local62 = System.currentTimeMillis();
			if (this.aLongArray2[local41] == 0L) {
				local43 = local82;
				local45 = local84;
			} else if (local62 > this.aLongArray2[local41]) {
				local43 = (int) ((long) (this.anInt123 * 2560) / (local62 - this.aLongArray2[local41]));
			}
			if (local43 < 25) {
				local43 = 25;
			}
			if (local43 > 256) {
				local43 = 256;
				local45 = (int) ((long) this.anInt123 - (local62 - this.aLongArray2[local41]) / 10L);
			}
			this.aLongArray2[local41] = local62;
			local41 = (local41 + 1) % 10;
			if (local45 > 1) {
				for (@Pc(164) int local164 = 0; local164 < 10; local164++) {
					if (this.aLongArray2[local164] != 0L) {
						this.aLongArray2[local164] += local45;
					}
				}
			}
			if (local45 < this.anInt124) {
				local45 = this.anInt124;
			}
			try {
				Thread.sleep((long) local45);
			} catch (@Pc(198) InterruptedException local198) {
			}
			while (local47 < 256) {
				this.method68();
				this.anInt132 = 0;
				this.anInt135 = this.anInt136;
				local47 += local43;
			}
			local47 &= 0xFF;
			if (this.anInt123 > 0) {
				this.anInt125 = local43 * 1000 / (this.anInt123 * 256);
			}
			this.method70();
		}
		if (this.anInt122 == -1) {
			this.method64();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	private void method64() {
		try {
			this.anInt122 = -2;
			this.method69();
			try {
				Thread.sleep(1000L);
			} catch (@Pc(14) Exception local14) {
			}
			try {
				System.exit(0);
			} catch (@Pc(18) Throwable local18) {
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("26314, " + -994 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V")
	protected final void method65() {
		try {
			this.anInt123 = 1000;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("66753, " + true + ", " + 1 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt122 >= 0) {
			this.anInt122 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt122 >= 0) {
			this.anInt122 = 4000 / this.anInt123;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt122 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt122 == -1) {
			this.method64();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean35 = true;
		this.method71();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean35 = true;
		this.method71();
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
		this.anInt128 = 0;
		this.anInt133 = local2;
		this.anInt134 = local5;
		if (arg0.isMetaDown()) {
			this.anInt132 = 2;
			this.anInt129 = 2;
		} else {
			this.anInt132 = 1;
			this.anInt129 = 1;
		}
		if (Class8.aBoolean79) {
			Class8.method212(local5, local2, arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt128 = 0;
		this.anInt129 = 0;
		if (Class8.aBoolean79) {
			Class8.method213(arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class8.aBoolean79) {
			Class8.method219();
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Class8.aBoolean79) {
			Class8.method220();
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
		this.anInt128 = 0;
		this.anInt130 = local2;
		this.anInt131 = local5;
		if (Class8.aBoolean79) {
			Class8.method214(local5, local2);
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
		this.anInt128 = 0;
		this.anInt130 = local2;
		this.anInt131 = local5;
		if (Class8.aBoolean79) {
			Class8.method214(local5, local2);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt128 = 0;
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
			this.anIntArray28[local10] = 1;
		}
		if (local10 > 4) {
			this.anIntArray29[this.anInt136] = local10;
			this.anInt136 = this.anInt136 + 1 & 0x7F;
		}
		if (Class8.aBoolean79) {
			Class8.method215(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt128 = 0;
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
			this.anIntArray28[local8] = 0;
		}
		if (Class8.aBoolean79) {
			Class8.method216(local8, this.aByte11);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean35 = true;
		this.method71();
		if (Class8.aBoolean79) {
			Class8.method217();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Class8.aBoolean79) {
			Class8.method218();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
	protected final int method66() {
		try {
			@Pc(10) int local10 = -1;
			if (this.anInt136 != this.anInt135) {
				local10 = this.anIntArray29[this.anInt135];
				this.anInt135 = this.anInt135 + 1 & 0x7F;
			}
			return local10;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("36383, " + 0 + ", " + local32.toString());
			throw new RuntimeException();
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
	protected void method67() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	protected void method68() {
		try {
			if (this.aByte14 != 123) {
				this.anInt121 = -45;
			}
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("68938, " + 123 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method69() {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	protected void method70() {
		try {
			if (this.anInt120 == -43626) {
				;
			}
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("35234, " + -43626 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	protected void method71() {
		try {
			if (this.aByte15 != 0) {
				this.aBoolean33 = !this.aBoolean33;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("89442, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Ljava/awt/Component;")
	protected Component method72(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != this.anInt121) {
				this.aBoolean34 = !this.aBoolean34;
			}
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("21393, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method73(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILjava/lang/String;)V")
	protected void method74(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method72(this.anInt121).getGraphics();
				try {
					this.method72(this.anInt121).repaint();
				} catch (@Pc(22) Exception local22) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(26) Exception local26) {
				}
			}
			@Pc(37) Font local37 = new Font("Helvetica", 1, 13);
			@Pc(44) FontMetrics local44 = this.method72(this.anInt121).getFontMetrics(local37);
			@Pc(51) Font local51 = new Font("Helvetica", 0, 13);
			this.method72(this.anInt121).getFontMetrics(local51);
			if (this.aBoolean35) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt126, this.anInt127);
				this.aBoolean35 = false;
			}
			@Pc(84) Color local84 = new Color(140, 17, 17);
			@Pc(91) int local91 = this.anInt127 / 2 - 18;
			this.aGraphics2.setColor(local84);
			this.aGraphics2.drawRect(this.anInt126 / 2 - 152, local91, 304, 34);
			this.aGraphics2.fillRect(this.anInt126 / 2 - 150, local91 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt126 / 2 + arg0 * 3 - 150, local91 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local37);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt126 - local44.stringWidth(arg1)) / 2, local91 + 22);
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("27529, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}
}
