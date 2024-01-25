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

@OriginalClass("client!gk")
public final class Class133_Sub1 extends Class133 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Lclient!tj;")
	private final Class357 aClass357_19 = new Class357();

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "Lclient!tj;")
	private final Class357 aClass357_20 = new Class357();

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray12 = new boolean[112];

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class133_Sub1(@OriginalArg(0) Component arg0) {
		Static285.method4299();
		this.method3455(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method3452() {
		this.aClass357_19.method8403();
		for (@Pc(25) Class3_Sub10 local25 = (Class3_Sub10) this.aClass357_20.method8398(); local25 != null; local25 = (Class3_Sub10) this.aClass357_20.method8398()) {
			local25.anInt845 = this.method3456();
			if (local25.anInt846 == 0) {
				if (!this.aBooleanArray12[local25.anInt847]) {
					@Pc(52) Class3_Sub10 local52 = new Class3_Sub10();
					local52.aChar1 = '\u0000';
					local52.anInt845 = local25.anInt845;
					local52.anInt847 = local25.anInt847;
					local52.anInt846 = 0;
					local52.aLong42 = local25.aLong42;
					this.aClass357_19.method8401(local52);
					this.aBooleanArray12[local25.anInt847] = true;
				}
				local25.anInt846 = 2;
				this.aClass357_19.method8401(local25);
			} else if (local25.anInt846 == 1) {
				if (this.aBooleanArray12[local25.anInt847]) {
					this.aClass357_19.method8401(local25);
					this.aBooleanArray12[local25.anInt847] = false;
				}
			} else if (local25.anInt846 == -1) {
				for (@Pc(130) int local130 = 0; local130 < 112; local130++) {
					if (this.aBooleanArray12[local130]) {
						@Pc(143) Class3_Sub10 local143 = new Class3_Sub10();
						local143.aLong42 = local25.aLong42;
						local143.anInt846 = 1;
						local143.aChar1 = '\u0000';
						local143.anInt847 = local130;
						local143.anInt845 = local25.anInt845;
						this.aClass357_19.method8401(local143);
						this.aBooleanArray12[local130] = false;
					}
				}
			} else if (local25.anInt846 == 3) {
				this.aClass357_19.method8401(local25);
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3455(@OriginalArg(0) Component arg0) {
		this.method3457();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static75.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!gk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3458(arg0, 0);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
	private int method3456() {
		@Pc(13) int local13 = 0;
		if (this.aBooleanArray12[81]) {
			local13 = 1;
		}
		if (this.aBooleanArray12[82]) {
			local13 |= 0x4;
		}
		if (this.aBooleanArray12[86]) {
			local13 |= 0x2;
		}
		return local13;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
	private void method3457() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(31) int local31 = 0; local31 < 112; local31++) {
			this.aBooleanArray12[local31] = false;
		}
		this.aClass357_19.method8403();
		this.aClass357_20.method8403();
	}

	@OriginalMember(owner = "client!gk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static521.method7425(local6)) {
			this.method3459(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3459(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!gk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method3458(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static655.anIntArray588.length > local8) {
			local8 = Static655.anIntArray588[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method3459(arg1, '\u0000', local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method3450(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray12[arg0] : false;
	}

	@OriginalMember(owner = "client!gk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3458(arg0, 1);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	@Override
	public void method3451() {
		this.method3457();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Lclient!dk;")
	@Override
	public Interface3 method3448() {
		return (Interface3) this.aClass357_19.method8398();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ICIB)V")
	private void method3459(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class3_Sub10 local15 = new Class3_Sub10();
		local15.anInt847 = arg2;
		local15.aChar1 = arg1;
		local15.anInt846 = arg0;
		local15.aLong42 = Static626.method8479();
		this.aClass357_20.method8401(local15);
	}
}
