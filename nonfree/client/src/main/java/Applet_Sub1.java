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
	private int anInt122;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	private int anInt125;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	protected int anInt126;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	protected int anInt127;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!qb;")
	protected Class32 aClass32_2;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "I")
	protected int anInt128;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	protected int anInt129;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	protected int anInt130;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt131;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	protected int anInt132;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	protected int anInt133;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	protected int anInt134;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	private int anInt136;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	private int anInt119 = 587;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	private int anInt120 = 2;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	private int anInt121 = 732;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	private int anInt123 = 20;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	protected int anInt124 = 1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array2 = new Class1_Sub3_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
	protected int[] anIntArray28 = new int[128];

	@OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
	private int[] anIntArray29 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZII)V")
	protected final void method62() {
		try {
			this.anInt126 = 789;
			this.anInt127 = 532;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt127, this.anInt126, this, false);
			this.aGraphics2 = this.method72((byte) 9).getGraphics();
			this.aClass32_2 = new Class32(this.method72((byte) 9), this.anInt126, this.anInt127, true);
			this.method73(this, 1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("26302, " + true + ", " + 789 + ", " + 532 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZI)V")
	protected final void method63() {
		try {
			this.anInt126 = 789;
			this.anInt127 = 532;
			this.aGraphics2 = this.method72((byte) 9).getGraphics();
			this.aClass32_2 = new Class32(this.method72((byte) 9), this.anInt126, this.anInt127, true);
			this.method73(this, 1);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("65448, " + 789 + ", " + true + ", " + 532 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method72((byte) 9).addMouseListener(this);
		this.method72((byte) 9).addMouseMotionListener(this);
		this.method72((byte) 9).addKeyListener(this);
		this.method72((byte) 9).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method74(0, "Loading...");
		this.method67();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		@Pc(41) int local41 = 1;
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < 10; local45++) {
			this.aLongArray2[local45] = System.currentTimeMillis();
		}
		@Pc(58) long local58 = System.currentTimeMillis();
		while (this.anInt122 >= 0) {
			if (this.anInt122 > 0) {
				this.anInt122--;
				if (this.anInt122 == 0) {
					this.method64();
					return;
				}
			}
			@Pc(78) int local78 = local39;
			@Pc(80) int local80 = local41;
			local39 = 300;
			local41 = 1;
			local58 = System.currentTimeMillis();
			if (this.aLongArray2[local37] == 0L) {
				local39 = local78;
				local41 = local80;
			} else if (local58 > this.aLongArray2[local37]) {
				local39 = (int) ((long) (this.anInt123 * 2560) / (local58 - this.aLongArray2[local37]));
			}
			if (local39 < 25) {
				local39 = 25;
			}
			if (local39 > 256) {
				local39 = 256;
				local41 = (int) ((long) this.anInt123 - (local58 - this.aLongArray2[local37]) / 10L);
			}
			this.aLongArray2[local37] = local58;
			local37 = (local37 + 1) % 10;
			if (local41 > 1) {
				for (@Pc(160) int local160 = 0; local160 < 10; local160++) {
					if (this.aLongArray2[local160] != 0L) {
						this.aLongArray2[local160] += local41;
					}
				}
			}
			if (local41 < this.anInt124) {
				local41 = this.anInt124;
			}
			try {
				Thread.sleep((long) local41);
			} catch (@Pc(194) InterruptedException local194) {
			}
			while (local43 < 256) {
				this.method68();
				this.anInt132 = 0;
				this.anInt135 = this.anInt136;
				local43 += local39;
			}
			local43 &= 0xFF;
			if (this.anInt123 > 0) {
				this.anInt125 = local39 * 1000 / (this.anInt123 * 256);
			}
			this.method70(this.anInt119);
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
			} catch (@Pc(19) Exception local19) {
			}
			try {
				System.exit(0);
			} catch (@Pc(23) Throwable local23) {
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("73102, " + -18322 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
	protected final void method65() {
		try {
			this.anInt123 = 1000;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("81641, " + 5 + ", " + 1 + ", " + local10.toString());
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
		this.aBoolean40 = true;
		this.method71();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean40 = true;
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
		if (Class8.aBoolean86) {
			Class8.method201(local2, local5, arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt128 = 0;
		this.anInt129 = 0;
		if (Class8.aBoolean86) {
			Class8.method202(arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class8.aBoolean86) {
			Class8.method208();
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Class8.aBoolean86) {
			Class8.method209();
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
		if (Class8.aBoolean86) {
			Class8.method203(local5, local2);
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
		if (Class8.aBoolean86) {
			Class8.method203(local5, local2);
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
		if (Class8.aBoolean86) {
			Class8.method204(local10);
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
		if (Class8.aBoolean86) {
			Class8.method205(local8);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean40 = true;
		this.method71();
		if (Class8.aBoolean86) {
			Class8.method206();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Class8.aBoolean86) {
			Class8.method207();
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
			signlink.reporterror("73460, " + 5 + ", " + local32.toString());
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

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method68() {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	protected void method69() {
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	protected void method70(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 65 / arg0;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("19211, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	protected void method71() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Ljava/awt/Component;")
	protected Component method72(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("40683, " + arg0 + ", " + local18.toString());
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
				this.aGraphics2 = this.method72((byte) 9).getGraphics();
				try {
					this.method72((byte) 9).repaint();
				} catch (@Pc(20) Exception local20) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(24) Exception local24) {
				}
			}
			@Pc(35) Font local35 = new Font("Helvetica", 1, 13);
			@Pc(41) FontMetrics local41 = this.method72((byte) 9).getFontMetrics(local35);
			@Pc(48) Font local48 = new Font("Helvetica", 0, 13);
			this.method72((byte) 9).getFontMetrics(local48);
			if (this.aBoolean40) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt126, this.anInt127);
				this.aBoolean40 = false;
			}
			@Pc(80) Color local80 = new Color(140, 17, 17);
			@Pc(87) int local87 = this.anInt127 / 2 - 18;
			this.aGraphics2.setColor(local80);
			this.aGraphics2.drawRect(this.anInt126 / 2 - 152, local87, 304, 34);
			this.aGraphics2.fillRect(this.anInt126 / 2 - 150, local87 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt126 / 2 + arg0 * 3 - 150, local87 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local35);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt126 - local41.stringWidth(arg1)) / 2, local87 + 22);
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("41860, " + arg0 + ", " + ", " + arg1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}
}
