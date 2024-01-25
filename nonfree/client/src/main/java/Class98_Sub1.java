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

@OriginalClass("client!pj")
public final class Class98_Sub1 extends Class98 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "Lclient!am;")
	private Class13_Sub1 aClass13_Sub1_2;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Lclient!am;")
	private Class13_Sub1 aClass13_Sub1_3;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "Lclient!am;")
	private Class13_Sub1 aClass13_Sub1_4;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[Z")
	private final boolean[] aBooleanArray20 = new boolean[112];

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class98_Sub1(@OriginalArg(0) Component arg0) {
		Static284.method4944();
		this.method4521(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	@Override
	public void method4516() {
		this.method4520();
	}

	@OriginalMember(owner = "client!pj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4523(arg0, 0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Lclient!bm;")
	@Override
	public Class13 method4513() {
		@Pc(14) Class13_Sub1 local14;
		for (local14 = this.aClass13_Sub1_4; local14 != null && local14.anInt224 == -1; local14 = local14.aClass13_Sub1_1) {
		}
		if (local14 == null) {
			this.aClass13_Sub1_4 = null;
		} else {
			this.aClass13_Sub1_4 = local14.aClass13_Sub1_1;
		}
		return local14;
	}

	@OriginalMember(owner = "client!pj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4524('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	private void method4520() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray20[local22] = false;
		}
		this.aClass13_Sub1_3 = null;
		this.aClass13_Sub1_2 = null;
		this.aClass13_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method4521(@OriginalArg(0) Component arg0) {
		this.method4520();
		this.aComponent1 = arg0;
		@Pc(18) Method local18 = Static175.aMethod2;
		if (local18 != null) {
			try {
				local18.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(33) Throwable local33) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!pj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method4517(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray20[arg0] : false;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
	private void method4523(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static133.anIntArray222.length > local8) {
			local8 = Static133.anIntArray222[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4524('\u0000', local8, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4514() {
		for (@Pc(16) Class13_Sub1 local16 = this.aClass13_Sub1_3; local16 != null; local16 = local16.aClass13_Sub1_1) {
			if (local16.anInt224 == 0) {
				if (local16.anInt221 >= 0) {
					local16.aBoolean24 = !this.aBooleanArray20[local16.anInt221];
				}
				this.aBooleanArray20[local16.anInt221] = true;
			} else if (local16.anInt224 == 1) {
				this.aBooleanArray20[local16.anInt221] = false;
			} else if (local16.anInt224 == -1) {
				for (@Pc(37) int local37 = 0; local37 < 112; local37++) {
					this.aBooleanArray20[local37] = false;
				}
			}
		}
		this.aClass13_Sub1_4 = this.aClass13_Sub1_3;
		this.aClass13_Sub1_2 = null;
		this.aClass13_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!pj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static319.method5149(local6)) {
			this.method4524(local6, -1, 2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ICII)V")
	private void method4524(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class13_Sub1 local7 = new Class13_Sub1();
		local7.anInt221 = arg1;
		local7.anInt224 = arg2;
		local7.aChar1 = arg0;
		local7.aLong6 = Static101.method1805();
		if (this.aClass13_Sub1_2 == null) {
			this.aClass13_Sub1_3 = local7;
		} else {
			this.aClass13_Sub1_2.aClass13_Sub1_1 = local7;
		}
		this.aClass13_Sub1_2 = local7;
	}

	@OriginalMember(owner = "client!pj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4523(arg0, 1);
	}
}
