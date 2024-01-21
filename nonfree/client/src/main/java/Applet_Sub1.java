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

@OriginalClass("client!a")
public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	private int anInt70;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	protected int anInt74;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	protected int anInt75;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/awt/Graphics;")
	protected Graphics aGraphics2;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!pb;")
	protected Class27 aClass27_2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!b;")
	protected Frame_Sub1 aFrame_Sub1_2;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	protected int anInt76;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	protected int anInt77;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	protected int anInt78;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	protected int anInt79;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "I")
	protected int anInt80;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	protected int anInt81;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	protected int anInt82;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "B")
	private byte aByte4 = -64;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	private int anInt69 = 2;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "B")
	private byte aByte5 = 4;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	private int anInt71 = 20;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	protected int anInt72 = 1;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array2 = new Class1_Sub3_Sub2_Sub2[6];

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
	private boolean aBoolean18 = true;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
	protected int[] anIntArray17 = new int[128];

	@OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
	private int[] anIntArray18 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)V")
	protected final void method56() {
		this.anInt74 = 789;
		this.anInt75 = 532;
		this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt74, this, 22967, this.anInt75);
		this.aGraphics2 = this.method66().getGraphics();
		this.aClass27_2 = new Class27(this.anInt75, 604, this.anInt74, this.method66());
		if (this.aByte5 == 4) {
			this.method67(this, 1);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IBI)V")
	protected final void method57() {
		this.anInt74 = 789;
		this.anInt75 = 532;
		this.aGraphics2 = this.method66().getGraphics();
		this.aClass27_2 = new Class27(this.anInt75, 604, this.anInt74, this.method66());
		this.method67(this, 1);
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		System.out.println("Registering event listeners");
		this.method66().addMouseListener(this);
		this.method66().addMouseMotionListener(this);
		this.method66().addKeyListener(this);
		this.method66().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method68("Loading...", 0);
		this.method61();
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 256;
		@Pc(44) int local44 = 1;
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < 10; local48++) {
			this.aLongArray2[local48] = System.currentTimeMillis();
		}
		@Pc(61) long local61 = System.currentTimeMillis();
		while (this.anInt70 >= 0) {
			if (this.anInt70 > 0) {
				this.anInt70--;
				if (this.anInt70 == 0) {
					this.method58();
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
				local42 = (int) ((long) (this.anInt71 * 2560) / (local61 - this.aLongArray2[local40]));
			}
			if (local42 < 25) {
				local42 = 25;
			}
			if (local42 > 256) {
				local42 = 256;
				local44 = (int) ((long) this.anInt71 - (local61 - this.aLongArray2[local40]) / 10L);
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
			if (local44 < this.anInt72) {
				local44 = this.anInt72;
			}
			try {
				Thread.sleep((long) local44);
			} catch (@Pc(197) InterruptedException local197) {
			}
			while (local46 < 256) {
				this.method62();
				this.anInt80 = 0;
				this.anInt83 = this.anInt84;
				local46 += local42;
			}
			local46 &= 0xFF;
			if (this.anInt71 > 0) {
				this.anInt73 = local42 * 1000 / (this.anInt71 * 256);
			}
			this.method64();
		}
		if (this.anInt70 == -1) {
			this.method58();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	private void method58() {
		this.anInt70 = -2;
		System.out.println("Closing program");
		this.method63(this.aByte4);
		try {
			Thread.sleep(1000L);
		} catch (@Pc(29) Exception local29) {
		}
		try {
			System.exit(0);
		} catch (@Pc(33) Throwable local33) {
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	protected final void method59() {
		this.anInt71 = 1000;
	}

	@OriginalMember(owner = "client!a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt70 >= 0) {
			this.anInt70 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt70 >= 0) {
			this.anInt70 = 4000 / this.anInt71;
		}
	}

	@OriginalMember(owner = "client!a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt70 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt70 == -1) {
			System.out.println("5 seconds expired, forcing kill");
			this.method58();
		}
	}

	@OriginalMember(owner = "client!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.aBoolean18 = true;
		this.method65();
	}

	@OriginalMember(owner = "client!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		this.aBoolean18 = true;
		this.method65();
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
		this.anInt76 = 0;
		this.anInt81 = local2;
		this.anInt82 = local5;
		if (arg0.isMetaDown()) {
			this.anInt80 = 2;
			this.anInt77 = 2;
		} else {
			this.anInt80 = 1;
			this.anInt77 = 1;
		}
	}

	@OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt76 = 0;
		this.anInt77 = 0;
	}

	@OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
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
		this.anInt76 = 0;
		this.anInt78 = local2;
		this.anInt79 = local5;
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
		this.anInt76 = 0;
		this.anInt78 = local2;
		this.anInt79 = local5;
	}

	@OriginalMember(owner = "client!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.anInt76 = 0;
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
			this.anIntArray17[local10] = 1;
		}
		if (local10 > 4) {
			this.anIntArray18[this.anInt84] = local10;
			this.anInt84 = this.anInt84 + 1 & 0x7F;
		}
	}

	@OriginalMember(owner = "client!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.anInt76 = 0;
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
			this.anIntArray17[local8] = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		this.aBoolean18 = true;
		this.method65();
	}

	@OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)I")
	protected final int method60() {
		@Pc(6) int local6 = -1;
		if (this.anInt84 != this.anInt83) {
			local6 = this.anIntArray18[this.anInt83];
			this.anInt83 = this.anInt83 + 1 & 0x7F;
		}
		return local6;
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
	protected void method61() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	protected void method62() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	protected void method63(@OriginalArg(0) byte arg0) {
		if (arg0 != -64) {
			for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	protected void method64() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	protected void method65() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)Ljava/awt/Component;")
	protected Component method66() {
		return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method67(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	protected void method68(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(14) FontMetrics local14 = this.method66().getFontMetrics(local8);
		@Pc(21) Font local21 = new Font("Helvetica", 0, 13);
		this.method66().getFontMetrics(local21);
		if (this.aBoolean18) {
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(0, 0, this.anInt74, this.anInt75);
			this.aBoolean18 = false;
		}
		@Pc(53) Color local53 = new Color(140, 17, 17);
		@Pc(60) int local60 = this.anInt75 / 2 - 18;
		this.aGraphics2.setColor(local53);
		this.aGraphics2.drawRect(this.anInt74 / 2 - 152, local60, 304, 34);
		this.aGraphics2.fillRect(this.anInt74 / 2 - 150, local60 + 2, arg1 * 3, 30);
		this.aGraphics2.setColor(Color.black);
		this.aGraphics2.fillRect(this.anInt74 / 2 + arg1 * 3 - 150, local60 + 2, 300 - arg1 * 3, 30);
		this.aGraphics2.setFont(local8);
		this.aGraphics2.setColor(Color.white);
		this.aGraphics2.drawString(arg0, (this.anInt74 - local14.stringWidth(arg0)) / 2, local60 + 22);
	}
}
