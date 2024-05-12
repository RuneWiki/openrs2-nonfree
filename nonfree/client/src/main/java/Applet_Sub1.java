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
import sign.signlink;

public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	private boolean aBoolean33 = false;

	private boolean aBoolean34 = false;

	private int anInt125;

	private boolean aBoolean35 = false;

	private byte aByte7 = 3;

	private int anInt126 = 27808;

	private int anInt127;

	private int anInt128 = 20;

	public int anInt129 = 1;

	private long[] aLongArray2 = new long[10];

	public int anInt130;

	public int anInt131;

	public int anInt132;

	public Graphics aGraphics2;

	public Class32 aClass32_2;

	public Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array2 = new Class1_Sub3_Sub2_Sub2[6];

	public Frame_Sub1 aFrame_Sub1_2;

	public boolean aBoolean36 = true;

	public int anInt133;

	public int anInt134;

	public int anInt135;

	public int anInt136;

	public int anInt137;

	public int anInt138;

	public int anInt139;

	public int[] anIntArray28 = new int[128];

	private int[] anIntArray29 = new int[128];

	private int anInt140;

	private int anInt141;

	public final void method62(int arg0, int arg1, int arg2) {
		try {
			if (arg2 != 0) {
				this.anInt125 = 411;
			}
			this.anInt131 = arg1;
			this.anInt132 = arg0;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt132, 35731, this, this.anInt131);
			this.aGraphics2 = this.method72(this.aByte7).getGraphics();
			this.aClass32_2 = new Class32(this.method72(this.aByte7), this.anInt131, 299, this.anInt132);
			this.method73(this, 1);
		} catch (RuntimeException var5) {
			signlink.reporterror("32828, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final void method63(int arg0, boolean arg1, int arg2) {
		try {
			this.anInt131 = arg2;
			this.anInt132 = arg0;
			this.aGraphics2 = this.method72(this.aByte7).getGraphics();
			this.aClass32_2 = new Class32(this.method72(this.aByte7), this.anInt131, 299, this.anInt132);
			if (arg1) {
				this.anInt125 = -370;
			}
			this.method73(this, 1);
		} catch (RuntimeException var5) {
			signlink.reporterror("68129, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public void run() {
		this.method72(this.aByte7).addMouseListener(this);
		this.method72(this.aByte7).addMouseMotionListener(this);
		this.method72(this.aByte7).addKeyListener(this);
		this.method72(this.aByte7).addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method74(true, "Loading...", 0);
		this.method67();
		int var3 = 0;
		int var4 = 256;
		int var5 = 1;
		int var6 = 0;
		for (int var7 = 0; var7 < 10; ++var7) {
			this.aLongArray2[var7] = System.currentTimeMillis();
		}
		long var1 = System.currentTimeMillis();
		while (this.anInt127 >= 0) {
			if (this.anInt127 > 0) {
				--this.anInt127;
				if (this.anInt127 == 0) {
					this.method64(-652);
					return;
				}
			}
			int var8 = var4;
			int var9 = var5;
			var4 = 300;
			var5 = 1;
			var1 = System.currentTimeMillis();
			if (this.aLongArray2[var3] == 0L) {
				var4 = var8;
				var5 = var9;
			} else if (var1 > this.aLongArray2[var3]) {
				var4 = (int) ((long) (2560 * this.anInt128) / (var1 - this.aLongArray2[var3]));
			}
			if (var4 < 25) {
				var4 = 25;
			}
			if (var4 > 256) {
				var4 = 256;
				var5 = (int) ((long) this.anInt128 - (var1 - this.aLongArray2[var3]) / 10L);
			}
			this.aLongArray2[var3] = var1;
			var3 = (var3 + 1) % 10;
			if (var5 > 1) {
				for (int var10 = 0; var10 < 10; ++var10) {
					if (this.aLongArray2[var10] != 0L) {
						this.aLongArray2[var10] += (long) var5;
					}
				}
			}
			if (var5 < this.anInt129) {
				var5 = this.anInt129;
			}
			try {
				Thread.sleep((long) var5);
			} catch (InterruptedException var11) {
			}
			while (var6 < 256) {
				this.method68(437);
				this.anInt137 = 0;
				this.anInt140 = this.anInt141;
				var6 += var4;
			}
			var6 &= 255;
			if (this.anInt128 > 0) {
				this.anInt130 = 1000 * var4 / (this.anInt128 * 256);
			}
			this.method70(false);
		}
		if (this.anInt127 == -1) {
			this.method64(-652);
		}
	}

	public final void method64(int arg0) {
		try {
			while (arg0 >= 0) {
				this.aBoolean35 = !this.aBoolean35;
			}
			this.anInt127 = -2;
			this.method69((byte) -28);
			try {
				Thread.sleep(1000L);
			} catch (Exception var4) {
			}
			try {
				System.exit(0);
			} catch (Throwable var3) {
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("31182, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final void method65(int arg0, int arg1) {
		try {
			this.anInt128 = 1000 / arg1;
			if (arg0 <= 0) {
				this.aBoolean33 = !this.aBoolean33;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("9789, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void start() {
		if (this.anInt127 >= 0) {
			this.anInt127 = 0;
		}
	}

	public final void stop() {
		if (this.anInt127 >= 0) {
			this.anInt127 = 4000 / this.anInt128;
		}
	}

	public final void destroy() {
		this.anInt127 = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}
		if (this.anInt127 == -1) {
			this.method64(-652);
		}
	}

	public final void update(Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean36 = true;
		this.method71(3);
	}

	public final void paint(Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean36 = true;
		this.method71(3);
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.anInt133 = 0;
		this.anInt138 = var2;
		this.anInt139 = var3;
		if (arg0.isMetaDown()) {
			this.anInt137 = 2;
			this.anInt134 = 2;
		} else {
			this.anInt137 = 1;
			this.anInt134 = 1;
		}
		if (Class8.aBoolean81) {
			Class8.method213(var2, arg0.isMetaDown() ? 1 : 0, var3, (byte) 4);
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		this.anInt133 = 0;
		this.anInt134 = 0;
		if (Class8.aBoolean81) {
			Class8.method214(arg0.isMetaDown() ? 1 : 0, 0);
		}
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
		if (Class8.aBoolean81) {
			Class8.method220(-657);
		}
	}

	public final void mouseExited(MouseEvent arg0) {
		if (Class8.aBoolean81) {
			Class8.method221(false);
		}
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.anInt133 = 0;
		this.anInt135 = var2;
		this.anInt136 = var3;
		if (Class8.aBoolean81) {
			Class8.method215(var3, true, var2);
		}
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.anInt133 = 0;
		this.anInt135 = var2;
		this.anInt136 = var3;
		if (Class8.aBoolean81) {
			Class8.method215(var3, true, var2);
		}
	}

	public final void keyPressed(KeyEvent arg0) {
		this.anInt133 = 0;
		int var2 = arg0.getKeyCode();
		int var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}
		if (var2 == 37) {
			var3 = 1;
		}
		if (var2 == 39) {
			var3 = 2;
		}
		if (var2 == 38) {
			var3 = 3;
		}
		if (var2 == 40) {
			var3 = 4;
		}
		if (var2 == 17) {
			var3 = 5;
		}
		if (var2 == 8) {
			var3 = 8;
		}
		if (var2 == 127) {
			var3 = 8;
		}
		if (var2 == 9) {
			var3 = 9;
		}
		if (var2 == 10) {
			var3 = 10;
		}
		if (var2 >= 112 && var2 <= 123) {
			var3 = 1008 + var2 - 112;
		}
		if (var2 == 36) {
			var3 = 1000;
		}
		if (var2 == 35) {
			var3 = 1001;
		}
		if (var2 == 33) {
			var3 = 1002;
		}
		if (var2 == 34) {
			var3 = 1003;
		}
		if (var3 > 0 && var3 < 128) {
			this.anIntArray28[var3] = 1;
		}
		if (var3 > 4) {
			this.anIntArray29[this.anInt141] = var3;
			this.anInt141 = this.anInt141 + 1 & 127;
		}
		if (Class8.aBoolean81) {
			Class8.method216(var3, true);
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		this.anInt133 = 0;
		int var2 = arg0.getKeyCode();
		char var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}
		if (var2 == 37) {
			var3 = 1;
		}
		if (var2 == 39) {
			var3 = 2;
		}
		if (var2 == 38) {
			var3 = 3;
		}
		if (var2 == 40) {
			var3 = 4;
		}
		if (var2 == 17) {
			var3 = 5;
		}
		if (var2 == 8) {
			var3 = '\b';
		}
		if (var2 == 127) {
			var3 = '\b';
		}
		if (var2 == 9) {
			var3 = '\t';
		}
		if (var2 == 10) {
			var3 = '\n';
		}
		if (var3 > 0 && var3 < 128) {
			this.anIntArray28[var3] = 0;
		}
		if (Class8.aBoolean81) {
			Class8.method217(var3, 1);
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	public final void focusGained(FocusEvent arg0) {
		this.aBoolean36 = true;
		this.method71(3);
		if (Class8.aBoolean81) {
			Class8.method218(-936);
		}
	}

	public final void focusLost(FocusEvent arg0) {
		if (Class8.aBoolean81) {
			Class8.method219(0);
		}
	}

	public final int method66(boolean arg0) {
		try {
			int var2 = -1;
			if (arg0) {
				return 2;
			} else {
				if (this.anInt141 != this.anInt140) {
					var2 = this.anIntArray29[this.anInt140];
					this.anInt140 = this.anInt140 + 1 & 127;
				}
				return var2;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("3026, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent arg0) {
	}

	public final void windowDeiconified(WindowEvent arg0) {
	}

	public final void windowIconified(WindowEvent arg0) {
	}

	public final void windowOpened(WindowEvent arg0) {
	}

	public void method67() {
	}

	public void method68(int arg0) {
		try {
			if (arg0 <= 0) {
				this.aBoolean34 = !this.aBoolean34;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("39582, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public void method69(byte arg0) {
		try {
			if (arg0 != -28) {
				this.anInt126 = -407;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("60526, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public void method70(boolean arg0) {
		try {
			if (arg0) {
				this.aBoolean35 = !this.aBoolean35;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("89494, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public void method71(int arg0) {
		try {
			if (arg0 < 3 || arg0 > 3) {
				this.aBoolean34 = !this.aBoolean34;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("40825, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public Component method72(byte arg0) {
		try {
			if (arg0 != 3) {
				throw new NullPointerException();
			} else {
				return this.aFrame_Sub1_2 != null ? this.aFrame_Sub1_2 : this;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("24145, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public void method73(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	public void method74(boolean arg0, String arg1, int arg2) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method72(this.aByte7).getGraphics();
				try {
					this.method72(this.aByte7).repaint();
				} catch (Exception var10) {
				}
				try {
					Thread.sleep(1000L);
				} catch (Exception var9) {
				}
			}
			Font var4 = new Font("Helvetica", 1, 13);
			FontMetrics var5 = this.method72(this.aByte7).getFontMetrics(var4);
			Font var6 = new Font("Helvetica", 0, 13);
			this.method72(this.aByte7).getFontMetrics(var6);
			if (this.aBoolean36) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt131, this.anInt132);
				this.aBoolean36 = false;
			}
			Color var7 = new Color(140, 17, 17);
			int var8 = this.anInt132 / 2 - 18;
			this.aGraphics2.setColor(var7);
			this.aGraphics2.drawRect(this.anInt131 / 2 - 152, var8, 304, 34);
			this.aGraphics2.fillRect(this.anInt131 / 2 - 150, var8 + 2, arg2 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt131 / 2 - 150 + arg2 * 3, var8 + 2, 300 - arg2 * 3, 30);
			this.aGraphics2.setFont(var4);
			this.aGraphics2.setColor(Color.white);
			if (arg0) {
				this.aGraphics2.drawString(arg1, (this.anInt131 - var5.stringWidth(arg1)) / 2, var8 + 22);
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("55533, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}
}
