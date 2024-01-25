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

@OriginalClass("client!cq")
public final class Class48_Sub1 extends Class48 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "Lclient!rv;")
	private Class113_Sub1 aClass113_Sub1_1;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "Lclient!rv;")
	private Class113_Sub1 aClass113_Sub1_2;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "Lclient!rv;")
	private Class113_Sub1 aClass113_Sub1_3;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray9 = new boolean[112];

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class48_Sub1(@OriginalArg(0) Component arg0) {
		Static453.method6151();
		this.method1125(arg0);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	@Override
	public void method1117() {
		this.method1127();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;B)V")
	private void method1123(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(12) int local12 = arg1.getKeyCode();
		if (local12 == 0) {
			local12 = 0;
		} else if (local12 >= 0 && Static212.anIntArray411.length > local12) {
			local12 = Static212.anIntArray411[local12];
			if (arg0 == 0 && (local12 & 0x80) != 0) {
				local12 = 0;
			} else {
				local12 &= 0xFFFFFF7F;
			}
		} else {
			local12 = 0;
		}
		if (local12 != 0) {
			this.method1128('\u0000', arg0, local12);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!cq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method1125(@OriginalArg(1) Component arg0) {
		this.method1127();
		this.aComponent1 = arg0;
		@Pc(19) Method local19 = Static282.aMethod2;
		if (local19 != null) {
			try {
				local19.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V")
	private void method1127() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray9[local28] = false;
		}
		this.aClass113_Sub1_3 = null;
		this.aClass113_Sub1_1 = null;
		this.aClass113_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1119(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!cq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1128('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!cq", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1123(1, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method1121() {
		for (@Pc(13) Class113_Sub1 local13 = this.aClass113_Sub1_2; local13 != null; local13 = local13.aClass113_Sub1_4) {
			if (local13.anInt6601 == 0) {
				if (local13.anInt6605 >= 0) {
					local13.aBoolean419 = !this.aBooleanArray9[local13.anInt6605];
				}
				this.aBooleanArray9[local13.anInt6605] = true;
			} else if (local13.anInt6601 == 1) {
				this.aBooleanArray9[local13.anInt6605] = false;
			} else if (local13.anInt6601 == -1) {
				for (@Pc(63) int local63 = 0; local63 < 112; local63++) {
					this.aBooleanArray9[local63] = false;
				}
			}
		}
		this.aClass113_Sub1_3 = this.aClass113_Sub1_2;
		this.aClass113_Sub1_1 = null;
		this.aClass113_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!cq", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static363.method5092(local6)) {
			this.method1128(local6, 2, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Lclient!hu;")
	@Override
	public Class113 method1118() {
		@Pc(8) Class113_Sub1 local8;
		for (local8 = this.aClass113_Sub1_3; local8 != null && local8.anInt6601 == -1; local8 = local8.aClass113_Sub1_4) {
		}
		if (local8 == null) {
			this.aClass113_Sub1_3 = null;
		} else {
			this.aClass113_Sub1_3 = local8.aClass113_Sub1_4;
		}
		return local8;
	}

	@OriginalMember(owner = "client!cq", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1123(0, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(CBII)V")
	private void method1128(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class113_Sub1 local11 = new Class113_Sub1();
		local11.aChar5 = arg0;
		local11.anInt6605 = arg2;
		local11.anInt6601 = arg1;
		local11.aLong188 = Static250.method3737();
		if (this.aClass113_Sub1_1 == null) {
			this.aClass113_Sub1_2 = local11;
		} else {
			this.aClass113_Sub1_1.aClass113_Sub1_4 = local11;
		}
		this.aClass113_Sub1_1 = local11;
	}
}
