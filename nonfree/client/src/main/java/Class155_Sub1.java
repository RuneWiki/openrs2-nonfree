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

@OriginalClass("client!lt")
public final class Class155_Sub1 extends Class155 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "Lclient!ve;")
	private Class250_Sub1 aClass250_Sub1_1;

	@OriginalMember(owner = "client!lt", name = "s", descriptor = "Lclient!ve;")
	private Class250_Sub1 aClass250_Sub1_2;

	@OriginalMember(owner = "client!lt", name = "u", descriptor = "Lclient!ve;")
	private Class250_Sub1 aClass250_Sub1_3;

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "[Z")
	private final boolean[] aBooleanArray31 = new boolean[112];

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class155_Sub1(@OriginalArg(0) Component arg0) {
		Static42.method759();
		this.method3521(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method3516(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray31[arg0] : false;
	}

	@OriginalMember(owner = "client!lt", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3522(0, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method3521(@OriginalArg(1) Component arg0) {
		this.method3523();
		this.aComponent3 = arg0;
		@Pc(11) Method local11 = Static282.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!lt", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3524(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)Lclient!up;")
	@Override
	public Class250 method3519() {
		@Pc(8) Class250_Sub1 local8;
		for (local8 = this.aClass250_Sub1_1; local8 != null && local8.anInt6875 == -1; local8 = local8.aClass250_Sub1_4) {
		}
		if (local8 == null) {
			this.aClass250_Sub1_1 = null;
		} else {
			this.aClass250_Sub1_1 = local8.aClass250_Sub1_4;
		}
		return local8;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
	private void method3522(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(12) int local12 = arg1.getKeyCode();
		if (local12 == 0) {
			local12 = 0;
		} else if (local12 >= 0 && Static393.anIntArray583.length > local12) {
			local12 = Static393.anIntArray583[local12];
			if (arg0 == 0 && (local12 & 0x80) != 0) {
				local12 = 0;
			} else {
				local12 &= 0xFFFFFF7F;
			}
		} else {
			local12 = 0;
		}
		if (local12 != 0) {
			this.method3524(local12, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)V")
	private void method3523() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(20) int local20 = 0; local20 < 112; local20++) {
			this.aBooleanArray31[local20] = false;
		}
		this.aClass250_Sub1_2 = null;
		this.aClass250_Sub1_1 = null;
		this.aClass250_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)V")
	@Override
	public void method3520() {
		this.method3523();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3518() {
		for (@Pc(14) Class250_Sub1 local14 = this.aClass250_Sub1_3; local14 != null; local14 = local14.aClass250_Sub1_4) {
			if (local14.anInt6875 == 0) {
				if (local14.anInt6876 >= 0) {
					local14.aBoolean480 = !this.aBooleanArray31[local14.anInt6876];
				}
				this.aBooleanArray31[local14.anInt6876] = true;
			} else if (local14.anInt6875 == 1) {
				this.aBooleanArray31[local14.anInt6876] = false;
			} else if (local14.anInt6875 == -1) {
				for (@Pc(60) int local60 = 0; local60 < 112; local60++) {
					this.aBooleanArray31[local60] = false;
				}
			}
		}
		this.aClass250_Sub1_1 = this.aClass250_Sub1_3;
		this.aClass250_Sub1_2 = null;
		this.aClass250_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!lt", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static267.method3944(local6)) {
			this.method3524(-1, 2, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIC)V")
	private void method3524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class250_Sub1 local7 = new Class250_Sub1();
		local7.anInt6875 = arg1;
		local7.aChar5 = arg2;
		local7.anInt6876 = arg0;
		local7.aLong206 = Static279.method4058();
		if (this.aClass250_Sub1_2 == null) {
			this.aClass250_Sub1_3 = local7;
		} else {
			this.aClass250_Sub1_2.aClass250_Sub1_4 = local7;
		}
		this.aClass250_Sub1_2 = local7;
	}

	@OriginalMember(owner = "client!lt", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3522(1, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
