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

@OriginalClass("client!om")
public final class Class31_Sub1 extends Class31 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!om", name = "t", descriptor = "Lclient!kr;")
	private Class143_Sub1 aClass143_Sub1_2;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "Lclient!kr;")
	private Class143_Sub1 aClass143_Sub1_3;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "Lclient!kr;")
	private Class143_Sub1 aClass143_Sub1_4;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "[Z")
	private final boolean[] aBooleanArray20 = new boolean[112];

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class31_Sub1(@OriginalArg(0) Component arg0) {
		Static14.method218();
		this.method3808(arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(CIII)V")
	private void method3806(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class143_Sub1 local7 = new Class143_Sub1();
		local7.aChar4 = arg0;
		local7.anInt3471 = arg2;
		local7.anInt3475 = arg1;
		local7.aLong105 = Static232.method3058();
		if (this.aClass143_Sub1_3 == null) {
			this.aClass143_Sub1_4 = local7;
		} else {
			this.aClass143_Sub1_3.aClass143_Sub1_1 = local7;
		}
		this.aClass143_Sub1_3 = local7;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3799() {
		for (@Pc(8) Class143_Sub1 local8 = this.aClass143_Sub1_4; local8 != null; local8 = local8.aClass143_Sub1_1) {
			if (local8.anInt3475 == 0) {
				if (local8.anInt3471 >= 0) {
					local8.aBoolean277 = !this.aBooleanArray20[local8.anInt3471];
				}
				this.aBooleanArray20[local8.anInt3471] = true;
			} else if (local8.anInt3475 == 1) {
				this.aBooleanArray20[local8.anInt3471] = false;
			} else if (local8.anInt3475 == -1) {
				for (@Pc(36) int local36 = 0; local36 < 112; local36++) {
					this.aBooleanArray20[local36] = false;
				}
			}
		}
		this.aClass143_Sub1_2 = this.aClass143_Sub1_4;
		this.aClass143_Sub1_3 = null;
		this.aClass143_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!om", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3809(arg0, 1);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method3808(@OriginalArg(1) Component arg0) {
		this.method3810();
		this.aComponent2 = arg0;
		@Pc(15) Method local15 = Static191.aMethod1;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;I)V")
	private void method3809(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && Static230.anIntArray392.length > local14) {
			local14 = Static230.anIntArray392[local14];
			if (arg1 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method3806('\u0000', arg1, local14);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	@Override
	public void method3802() {
		this.method3810();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3798(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray20[arg0] : false;
	}

	@OriginalMember(owner = "client!om", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3809(arg0, 0);
	}

	@OriginalMember(owner = "client!om", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static10.method180(local6)) {
			this.method3806(local6, 2, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!om", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3806('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!om", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lclient!mn;")
	@Override
	public Class143 method3796() {
		@Pc(8) Class143_Sub1 local8;
		for (local8 = this.aClass143_Sub1_2; local8 != null && local8.anInt3475 == -1; local8 = local8.aClass143_Sub1_1) {
		}
		if (local8 == null) {
			this.aClass143_Sub1_2 = null;
		} else {
			this.aClass143_Sub1_2 = local8.aClass143_Sub1_1;
		}
		return local8;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
	private void method3810() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray20[local22] = false;
		}
		this.aClass143_Sub1_2 = null;
		this.aClass143_Sub1_4 = null;
		this.aClass143_Sub1_3 = null;
	}
}
