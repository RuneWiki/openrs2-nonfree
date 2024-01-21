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
	private int anInt129;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	protected int anInt134;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	protected int anInt135;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!qb;")
	protected Class32 aClass32_2;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt136;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	protected int anInt137;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	protected int anInt138;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	protected int anInt139;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	protected int anInt140;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	protected int anInt141;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	protected int anInt142;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	private int anInt127 = 44;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	private int anInt128 = 496;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "B")
	private byte aByte9 = 125;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "B")
	private byte aByte10 = 7;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "B")
	private byte aByte11 = 21;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	private int anInt131 = 20;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	protected int anInt132 = 1;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "q", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array2 = new Class1_Sub3_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Z")
	private boolean aBoolean32 = true;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
	protected int[] anIntArray28 = new int[128];

	@OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
	private int[] anIntArray29 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method62() {
		try {
			this.anInt134 = 789;
			this.anInt135 = 532;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt134, this.anInt135, this, 129);
			this.aGraphics2 = this.method72().getGraphics();
			this.aClass32_2 = new Class32(this.anInt135, this.anInt134, this.aByte11, this.method72());
			this.method73(this, 1);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("11187, " + 0 + ", " + 789 + ", " + 532 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIB)V")
	protected final void method63(@OriginalArg(2) byte arg0) {
		try {
			this.anInt134 = 789;
			this.anInt135 = 532;
			this.aGraphics2 = this.method72().getGraphics();
			this.aClass32_2 = new Class32(this.anInt135, this.anInt134, this.aByte11, this.method72());
			this.method73(this, 1);
			if (arg0 == this.aByte10) {
				@Pc(35) boolean local35 = false;
			} else {
				for (@Pc(38) int local38 = 1; local38 > 0; local38++) {
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("52372, " + 532 + ", " + 789 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.method72().addMouseListener(this);
		this.method72().addMouseMotionListener(this);
		this.method72().addKeyListener(this);
		this.method72().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method74("Loading...", 0);
		this.method67();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		@Pc(41) int local41 = 1;
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < 10; local45++) {
			this.aLongArray2[local45] = System.currentTimeMillis();
		}
		@Pc(58) long local58 = System.currentTimeMillis();
		while (this.anInt130 >= 0) {
			if (this.anInt130 > 0) {
				this.anInt130--;
				if (this.anInt130 == 0) {
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
				local39 = (int) ((long) (this.anInt131 * 2560) / (local58 - this.aLongArray2[local37]));
			}
			if (local39 < 25) {
				local39 = 25;
			}
			if (local39 > 256) {
				local39 = 256;
				local41 = (int) ((long) this.anInt131 - (local58 - this.aLongArray2[local37]) / 10L);
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
			if (local41 < this.anInt132) {
				local41 = this.anInt132;
			}
			try {
				Thread.sleep((long) local41);
			} catch (@Pc(194) InterruptedException local194) {
			}
			while (local43 < 256) {
				this.method68();
				this.anInt140 = 0;
				this.anInt143 = this.anInt144;
				local43 += local39;
			}
			local43 &= 0xFF;
			if (this.anInt131 > 0) {
				this.anInt133 = local39 * 1000 / (this.anInt131 * 256);
			}
			this.method70();
		}
		if (this.anInt130 == -1) {
			this.method64();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	private void method64() {
		try {
			this.anInt130 = -2;
			this.method69();
			if (this.anInt129 > 0 || this.anInt129 < 0) {
				this.anInt127 = 114;
			}
			try {
				Thread.sleep(1000L);
			} catch (@Pc(20) Exception local20) {
			}
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("57702, " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	protected final void method65() {
		try {
			this.anInt131 = 1000;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("9036, " + 0 + ", " + 1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt130 >= 0) {
			this.anInt130 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt130 >= 0) {
			this.anInt130 = 4000 / this.anInt131;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt130 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt130 == -1) {
			this.method64();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean32 = true;
		this.method71();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean32 = true;
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
		this.anInt136 = 0;
		this.anInt141 = local2;
		this.anInt142 = local5;
		if (arg0.isMetaDown()) {
			this.anInt140 = 2;
			this.anInt137 = 2;
		} else {
			this.anInt140 = 1;
			this.anInt137 = 1;
		}
		if (Class8.aBoolean81) {
			Class8.method213(arg0.isMetaDown() ? 1 : 0, local5, local2);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt136 = 0;
		this.anInt137 = 0;
		if (Class8.aBoolean81) {
			Class8.method214(arg0.isMetaDown() ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class8.aBoolean81) {
			Class8.method220();
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Class8.aBoolean81) {
			Class8.method221();
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
		this.anInt136 = 0;
		this.anInt138 = local2;
		this.anInt139 = local5;
		if (Class8.aBoolean81) {
			Class8.method215(local2, local5);
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
		this.anInt136 = 0;
		this.anInt138 = local2;
		this.anInt139 = local5;
		if (Class8.aBoolean81) {
			Class8.method215(local2, local5);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt136 = 0;
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
			this.anIntArray29[this.anInt144] = local10;
			this.anInt144 = this.anInt144 + 1 & 0x7F;
		}
		if (Class8.aBoolean81) {
			Class8.method216(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt136 = 0;
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
		if (Class8.aBoolean81) {
			Class8.method217(local8);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean32 = true;
		this.method71();
		if (Class8.aBoolean81) {
			Class8.method218();
		}
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Class8.aBoolean81) {
			Class8.method219(this.aByte9);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
	protected final int method66() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt144 != this.anInt143) {
				local1 = this.anIntArray29[this.anInt143];
				this.anInt143 = this.anInt143 + 1 & 0x7F;
			}
			return local1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("68021, " + -16167 + ", " + local33.toString());
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

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	protected void method68() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method69() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	protected void method70() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V")
	protected void method71() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Ljava/awt/Component;")
	protected Component method72() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("5529, " + -66 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method73(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;II)V")
	protected void method74(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method72().getGraphics();
				try {
					this.method72().repaint();
				} catch (@Pc(15) Exception local15) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(19) Exception local19) {
				}
			}
			@Pc(30) Font local30 = new Font("Helvetica", 1, 13);
			@Pc(36) FontMetrics local36 = this.method72().getFontMetrics(local30);
			@Pc(43) Font local43 = new Font("Helvetica", 0, 13);
			this.method72().getFontMetrics(local43);
			if (this.aBoolean32) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt134, this.anInt135);
				this.aBoolean32 = false;
			}
			@Pc(80) Color local80 = new Color(140, 17, 17);
			@Pc(87) int local87 = this.anInt135 / 2 - 18;
			this.aGraphics2.setColor(local80);
			this.aGraphics2.drawRect(this.anInt134 / 2 - 152, local87, 304, 34);
			this.aGraphics2.fillRect(this.anInt134 / 2 - 150, local87 + 2, arg1 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt134 / 2 + arg1 * 3 - 150, local87 + 2, 300 - arg1 * 3, 30);
			this.aGraphics2.setFont(local30);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg0, (this.anInt134 - local36.stringWidth(arg0)) / 2, local87 + 22);
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("43142, " + arg0 + ", " + arg1 + ", " + -745 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}
}
