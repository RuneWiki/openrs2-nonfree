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

@OriginalClass("client!lm")
public final class Class195_Sub1 extends Class195 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!gk;")
	private final Class112 aClass112_34 = new Class112();

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "Lclient!gk;")
	private final Class112 aClass112_35 = new Class112();

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray16 = new boolean[112];

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class195_Sub1(@OriginalArg(0) Component arg0) {
		Static46.method740();
		this.method4505(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)I")
	private int method4500() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray16[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray16[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray16[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!lm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static381.method5568(local6)) {
			this.method4506(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4496() {
		this.aClass112_34.method3092();
		for (@Pc(15) Class3_Sub27 local15 = (Class3_Sub27) this.aClass112_35.method3094(); local15 != null; local15 = (Class3_Sub27) this.aClass112_35.method3094()) {
			local15.anInt3773 = this.method4500();
			if (local15.anInt3778 == 0) {
				if (!this.aBooleanArray16[local15.anInt3779]) {
					@Pc(126) Class3_Sub27 local126 = new Class3_Sub27();
					local126.aChar3 = '\u0000';
					local126.aLong114 = local15.aLong114;
					local126.anInt3778 = 0;
					local126.anInt3779 = local15.anInt3779;
					local126.anInt3773 = local15.anInt3773;
					this.aClass112_34.method3079(local126);
					this.aBooleanArray16[local15.anInt3779] = true;
				}
				local15.anInt3778 = 2;
				this.aClass112_34.method3079(local15);
			} else if (local15.anInt3778 == 1) {
				if (this.aBooleanArray16[local15.anInt3779]) {
					this.aClass112_34.method3079(local15);
					this.aBooleanArray16[local15.anInt3779] = false;
				}
			} else if (local15.anInt3778 == -1) {
				for (@Pc(72) int local72 = 0; local72 < 112; local72++) {
					if (this.aBooleanArray16[local72]) {
						@Pc(83) Class3_Sub27 local83 = new Class3_Sub27();
						local83.aLong114 = local15.aLong114;
						local83.anInt3779 = local72;
						local83.aChar3 = '\u0000';
						local83.anInt3773 = local15.anInt3773;
						local83.anInt3778 = 1;
						this.aClass112_34.method3079(local83);
						this.aBooleanArray16[local72] = false;
					}
				}
			} else if (local15.anInt3778 == 3) {
				this.aClass112_34.method3079(local15);
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;Z)V")
	private void method4502(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(13) int local13 = arg1.getKeyCode();
		if (local13 == 0) {
			local13 = 0;
		} else if (local13 >= 0 && local13 < Static311.anIntArray295.length) {
			local13 = Static311.anIntArray295[local13];
			if (arg0 == 0 && (local13 & 0x80) != 0) {
				local13 = 0;
			} else {
				local13 &= 0xFFFFFF7F;
			}
		} else {
			local13 = 0;
		}
		if (local13 != 0) {
			this.method4506('\u0000', local13, arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V")
	private void method4503() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray16[local22] = false;
		}
		this.aClass112_34.method3092();
		this.aClass112_35.method3092();
	}

	@OriginalMember(owner = "client!lm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Lclient!kk;")
	@Override
	public Interface7 method4498() {
		return (Interface7) this.aClass112_34.method3094();
	}

	@OriginalMember(owner = "client!lm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4506('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method4505(@OriginalArg(0) Component arg0) {
		this.method4503();
		this.aComponent3 = arg0;
		@Pc(11) Method local11 = Static408.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method4499(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray16[arg0] : false;
	}

	@OriginalMember(owner = "client!lm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4502(0, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(CIII)V")
	private void method4506(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub27 local7 = new Class3_Sub27();
		local7.aChar3 = arg0;
		local7.anInt3778 = arg2;
		local7.anInt3779 = arg1;
		local7.aLong114 = Static158.method2936();
		this.aClass112_35.method3079(local7);
	}

	@OriginalMember(owner = "client!lm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4502(1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	@Override
	public void method4495() {
		this.method4503();
	}
}
