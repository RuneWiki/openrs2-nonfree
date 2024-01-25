import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class14_Sub1 extends Class14 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!lo;")
	private Class150_Sub1 aClass150_Sub1_1;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "Lclient!lo;")
	private Class150_Sub1 aClass150_Sub1_2;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "Lclient!lo;")
	private Class150_Sub1 aClass150_Sub1_3;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray6 = new boolean[112];

	static {
		new Class242(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class14_Sub1(@OriginalArg(0) Component arg0) {
		Static239.method3307();
		this.method1522(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1520(arg0, 0);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
	@Override
	public void method1514() {
		this.method1517();
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
	private void method1517() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray6[local22] = false;
		}
		this.aClass150_Sub1_2 = null;
		this.aClass150_Sub1_3 = null;
		this.aClass150_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!eh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static232.method3209(local6)) {
			this.method1523(2, -1, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1510(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray6[arg0] : false;
	}

	@OriginalMember(owner = "client!eh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1520(arg0, 1);
	}

	@OriginalMember(owner = "client!eh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1523(-1, 0, '\u0000');
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method1520(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static190.anIntArray303.length) {
			local8 = Static190.anIntArray303[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method1523(arg1, local8, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Lclient!sk;")
	@Override
	public Class150 method1513() {
		@Pc(8) Class150_Sub1 local8;
		for (local8 = this.aClass150_Sub1_1; local8 != null && local8.anInt4259 == -1; local8 = local8.aClass150_Sub1_4) {
		}
		if (local8 == null) {
			this.aClass150_Sub1_1 = null;
		} else {
			this.aClass150_Sub1_1 = local8.aClass150_Sub1_4;
		}
		return local8;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1512() {
		for (@Pc(8) Class150_Sub1 local8 = this.aClass150_Sub1_3; local8 != null; local8 = local8.aClass150_Sub1_4) {
			if (local8.anInt4259 == 0) {
				if (local8.anInt4256 >= 0) {
					local8.aBoolean317 = !this.aBooleanArray6[local8.anInt4256];
				}
				this.aBooleanArray6[local8.anInt4256] = true;
			} else if (local8.anInt4259 == 1) {
				this.aBooleanArray6[local8.anInt4256] = false;
			} else if (local8.anInt4259 == -1) {
				for (@Pc(37) int local37 = 0; local37 < 112; local37++) {
					this.aBooleanArray6[local37] = false;
				}
			}
		}
		this.aClass150_Sub1_1 = this.aClass150_Sub1_3;
		this.aClass150_Sub1_3 = null;
		this.aClass150_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method1522(@OriginalArg(1) Component arg0) {
		this.method1517();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static159.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIC)V")
	private void method1523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class150_Sub1 local7 = new Class150_Sub1();
		local7.anInt4256 = arg1;
		local7.aChar2 = arg2;
		local7.anInt4259 = arg0;
		local7.aLong115 = Static199.method2845();
		if (this.aClass150_Sub1_2 == null) {
			this.aClass150_Sub1_3 = local7;
		} else {
			this.aClass150_Sub1_2.aClass150_Sub1_4 = local7;
		}
		this.aClass150_Sub1_2 = local7;
	}
}
