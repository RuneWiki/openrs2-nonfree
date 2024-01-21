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

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	private int anInt74;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	protected int anInt75;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	protected int anInt76;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!qb;")
	protected Class29 aClass29_2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	protected int anInt77;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	protected int anInt78;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt79;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	protected int anInt80;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	protected int anInt81;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	protected int anInt82;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	protected int anInt83;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	private int anInt70 = 3073;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Z")
	private boolean aBoolean27 = true;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "B")
	private byte aByte3 = -63;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	private int anInt72 = 20;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	protected int anInt73 = 1;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array2 = new Class1_Sub3_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
	private boolean aBoolean29 = true;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
	protected int[] anIntArray15 = new int[128];

	@OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
	private int[] anIntArray16 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	protected final void method54() {
		try {
			this.anInt75 = 789;
			this.anInt76 = 532;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt75, this.anInt76, this, true);
			this.aGraphics2 = this.method64().getGraphics();
			this.aClass29_2 = new Class29(this.anInt76, (byte) -58, this.method64(), this.anInt75);
			this.method65(this, 1);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("14921, " + ", " + 789 + ", " + 532 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZII)V")
	protected final void method55() {
		try {
			this.anInt75 = 789;
			this.anInt76 = 532;
			this.aGraphics2 = this.method64().getGraphics();
			this.aClass29_2 = new Class29(this.anInt76, (byte) -58, this.method64(), this.anInt75);
			this.method65(this, 1);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("78519, " + true + ", " + 789 + ", " + 532 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		System.out.println("Registering event listeners");
		this.method64().addMouseListener(this);
		this.method64().addMouseMotionListener(this);
		this.method64().addKeyListener(this);
		this.method64().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method66(0, "Loading...");
		this.method59();
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 256;
		@Pc(44) int local44 = 1;
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < 10; local48++) {
			this.aLongArray2[local48] = System.currentTimeMillis();
		}
		@Pc(61) long local61 = System.currentTimeMillis();
		while (this.anInt71 >= 0) {
			if (this.anInt71 > 0) {
				this.anInt71--;
				if (this.anInt71 == 0) {
					this.method56();
					return;
				}
			}
			@Pc(81) int local81 = local42;
			@Pc(83) int local83 = local44;
			local42 = 300;
			local44 = 1;
			local61 = System.currentTimeMillis();
			if (this.aLongArray2[local40] == 0L) {
				local42 = local81;
				local44 = local83;
			} else if (local61 > this.aLongArray2[local40]) {
				local42 = (int) ((long) (this.anInt72 * 2560) / (local61 - this.aLongArray2[local40]));
			}
			if (local42 < 25) {
				local42 = 25;
			}
			if (local42 > 256) {
				local42 = 256;
				local44 = (int) ((long) this.anInt72 - (local61 - this.aLongArray2[local40]) / 10L);
			}
			this.aLongArray2[local40] = local61;
			local40 = (local40 + 1) % 10;
			if (local44 > 1) {
				for (@Pc(163) int local163 = 0; local163 < 10; local163++) {
					if (this.aLongArray2[local163] != 0L) {
						this.aLongArray2[local163] += local44;
					}
				}
			}
			if (local44 < this.anInt73) {
				local44 = this.anInt73;
			}
			try {
				Thread.sleep((long) local44);
			} catch (@Pc(197) InterruptedException local197) {
			}
			while (local46 < 256) {
				this.method60();
				this.anInt81 = 0;
				this.anInt84 = this.anInt85;
				local46 += local42;
			}
			local46 &= 0xFF;
			if (this.anInt72 > 0) {
				this.anInt74 = local42 * 1000 / (this.anInt72 * 256);
			}
			this.method62();
		}
		if (this.anInt71 == -1) {
			this.method56();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	private void method56() {
		try {
			this.anInt71 = -2;
			System.out.println("Closing program");
			this.method61();
			try {
				Thread.sleep(1000L);
			} catch (@Pc(17) Exception local17) {
			}
			try {
				System.exit(0);
			} catch (@Pc(21) Throwable local21) {
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("20060, " + -59 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
	protected final void method57(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt72 = 1000;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("49387, " + arg0 + ", " + 1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt71 >= 0) {
			this.anInt71 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt71 >= 0) {
			this.anInt71 = 4000 / this.anInt72;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt71 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt71 == -1) {
			System.out.println("5 seconds expired, forcing kill");
			this.method56();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean29 = true;
		this.method63();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean29 = true;
		this.method63();
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
		this.anInt77 = 0;
		this.anInt82 = local2;
		this.anInt83 = local5;
		if (arg0.isMetaDown()) {
			this.anInt81 = 2;
			this.anInt78 = 2;
		} else {
			this.anInt81 = 1;
			this.anInt78 = 1;
		}
		if (Class8.aBoolean66) {
			Class8.method188(local5, local2);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt77 = 0;
		this.anInt78 = 0;
		if (Class8.aBoolean66) {
			Class8.method189(this.aBoolean27);
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class8.aBoolean66) {
			Class8.method195();
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Class8.aBoolean66) {
			Class8.method196();
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
		this.anInt77 = 0;
		this.anInt79 = local2;
		this.anInt80 = local5;
		if (Class8.aBoolean66) {
			Class8.method190(local5, local2);
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
		this.anInt77 = 0;
		this.anInt79 = local2;
		this.anInt80 = local5;
		if (Class8.aBoolean66) {
			Class8.method190(local5, local2);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt77 = 0;
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
			this.anIntArray15[local10] = 1;
		}
		if (local10 > 4) {
			this.anIntArray16[this.anInt85] = local10;
			this.anInt85 = this.anInt85 + 1 & 0x7F;
		}
		if (Class8.aBoolean66) {
			Class8.method191(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt77 = 0;
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
			this.anIntArray15[local8] = 0;
		}
		if (Class8.aBoolean66) {
			Class8.method192(this.aByte3, local8);
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean29 = true;
		this.method63();
		if (Class8.aBoolean66) {
			Class8.method193(this.aBoolean28);
		}
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Class8.aBoolean66) {
			Class8.method194((byte) 9);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
	protected final int method58() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt85 != this.anInt84) {
				local7 = this.anIntArray16[this.anInt84];
				this.anInt84 = this.anInt84 + 1 & 0x7F;
			}
			return local7;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("82734, " + 6542 + ", " + local29.toString());
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
	protected void method59() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	protected void method60() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	protected void method61() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method62() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	protected void method63() {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Ljava/awt/Component;")
	protected Component method64() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("25082, " + -36374 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method65(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BILjava/lang/String;)V")
	protected void method66(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method64().getGraphics();
				try {
					this.method64().repaint();
				} catch (@Pc(21) Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch (@Pc(25) Exception local25) {
				}
			}
			@Pc(36) Font local36 = new Font("Helvetica", 1, 13);
			@Pc(42) FontMetrics local42 = this.method64().getFontMetrics(local36);
			@Pc(49) Font local49 = new Font("Helvetica", 0, 13);
			this.method64().getFontMetrics(local49);
			if (this.aBoolean29) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt75, this.anInt76);
				this.aBoolean29 = false;
			}
			@Pc(81) Color local81 = new Color(140, 17, 17);
			@Pc(88) int local88 = this.anInt76 / 2 - 18;
			this.aGraphics2.setColor(local81);
			this.aGraphics2.drawRect(this.anInt75 / 2 - 152, local88, 304, 34);
			this.aGraphics2.fillRect(this.anInt75 / 2 - 150, local88 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt75 / 2 + arg0 * 3 - 150, local88 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt75 - local42.stringWidth(arg1)) / 2, local88 + 22);
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("56376, " + -75 + ", " + arg0 + ", " + arg1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}
}
