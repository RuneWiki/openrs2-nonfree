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

@OriginalClass("client!ke")
public final class Class123_Sub1 extends Class123 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
	public static int anInt3368 = 1;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Lclient!h;")
	public static final Class89 aClass89_141 = new Class89(68, 4);

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
	public static int anInt3377 = 0;

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
	public static int anInt3381 = 0;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!co;")
	private Class37_Sub1 aClass37_Sub1_2;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!co;")
	private Class37_Sub1 aClass37_Sub1_3;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Lclient!co;")
	private Class37_Sub1 aClass37_Sub1_4;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[Z")
	private final boolean[] aBooleanArray32 = new boolean[112];

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 393)
	public Class123_Sub1(@OriginalArg(0) Component arg0) {
		Static112.method2380();
		this.method3351(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 5)
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static80.method1910(local6)) {
			this.method3346(local6, -1, 2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BCII)V", line = 21)
	private void method3346(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class37_Sub1 local7 = new Class37_Sub1();
		local7.anInt1244 = arg1;
		local7.anInt1249 = arg2;
		local7.aChar1 = arg0;
		local7.aLong36 = Static190.method3686();
		if (this.aClass37_Sub1_4 == null) {
			this.aClass37_Sub1_3 = local7;
		} else {
			this.aClass37_Sub1_4.aClass37_Sub1_1 = local7;
		}
		this.aClass37_Sub1_4 = local7;
	}

	@OriginalMember(owner = "client!ke", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 120)
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3349(arg0, 0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 141)
	private void method3349(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Class2_Sub26_Sub1.anIntArray285.length > local8) {
			local8 = Class2_Sub26_Sub1.anIntArray285[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method3346('\u0000', local8, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 180)
	@Override
	public void method3339() {
		this.method3352();
	}

	@OriginalMember(owner = "client!ke", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 205)
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 212)
	private void method3351(@OriginalArg(0) Component arg0) {
		this.method3352();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static200.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 235)
	@Override
	public synchronized void method3338() {
		for (@Pc(14) Class37_Sub1 local14 = this.aClass37_Sub1_3; local14 != null; local14 = local14.aClass37_Sub1_1) {
			if (local14.anInt1249 == 0) {
				if (local14.anInt1244 >= 0) {
					local14.aBoolean101 = !this.aBooleanArray32[local14.anInt1244];
				}
				this.aBooleanArray32[local14.anInt1244] = true;
			} else if (local14.anInt1249 == 1) {
				this.aBooleanArray32[local14.anInt1244] = false;
			} else if (local14.anInt1249 == -1) {
				for (@Pc(52) int local52 = 0; local52 < 112; local52++) {
					this.aBooleanArray32[local52] = false;
				}
			}
		}
		this.aClass37_Sub1_2 = this.aClass37_Sub1_3;
		this.aClass37_Sub1_3 = null;
		this.aClass37_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!ke", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 289)
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3349(arg0, 1);
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V", line = 297)
	private void method3352() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray32[local22] = false;
		}
		this.aClass37_Sub1_3 = null;
		this.aClass37_Sub1_2 = null;
		this.aClass37_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!ke", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 330)
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3346('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Z", line = 353)
	@Override
	public boolean method3344(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray32[arg0] : false;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Lclient!rk;", line = 368)
	@Override
	public Class37 method3343() {
		@Pc(13) Class37_Sub1 local13;
		for (local13 = this.aClass37_Sub1_2; local13 != null && local13.anInt1249 == -1; local13 = local13.aClass37_Sub1_1) {
		}
		if (local13 == null) {
			this.aClass37_Sub1_2 = null;
		} else {
			this.aClass37_Sub1_2 = local13.aClass37_Sub1_1;
		}
		return local13;
	}
}
