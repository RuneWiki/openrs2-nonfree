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

@OriginalClass("client!bp")
public final class Class38_Sub1 extends Class38 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!bp", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "Lclient!ro;")
	private final Class306 aClass306_9 = new Class306();

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "Lclient!ro;")
	private final Class306 aClass306_10 = new Class306();

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "[Z")
	private final boolean[] aBooleanArray6 = new boolean[112];

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class38_Sub1(@OriginalArg(0) Component arg0) {
		Static272.method4136();
		this.method801(arg0);
	}

	@OriginalMember(owner = "client!bp", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method806(arg0, 1);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method795() {
		this.aClass306_9.method7315();
		for (@Pc(21) Class5_Sub29 local21 = (Class5_Sub29) this.aClass306_10.method7302(); local21 != null; local21 = (Class5_Sub29) this.aClass306_10.method7302()) {
			local21.anInt5774 = this.method807();
			if (local21.anInt5769 == 0) {
				if (!this.aBooleanArray6[local21.anInt5773]) {
					@Pc(134) Class5_Sub29 local134 = new Class5_Sub29();
					local134.aLong169 = local21.aLong169;
					local134.anInt5769 = 0;
					local134.aChar2 = '\u0000';
					local134.anInt5773 = local21.anInt5773;
					local134.anInt5774 = local21.anInt5774;
					this.aClass306_9.method7303(local134);
					this.aBooleanArray6[local21.anInt5773] = true;
				}
				local21.anInt5769 = 2;
				this.aClass306_9.method7303(local21);
			} else if (local21.anInt5769 == 1) {
				if (this.aBooleanArray6[local21.anInt5773]) {
					this.aClass306_9.method7303(local21);
					this.aBooleanArray6[local21.anInt5773] = false;
				}
			} else if (local21.anInt5769 == -1) {
				for (@Pc(57) int local57 = 0; local57 < 112; local57++) {
					if (this.aBooleanArray6[local57]) {
						@Pc(68) Class5_Sub29 local68 = new Class5_Sub29();
						local68.anInt5774 = local21.anInt5774;
						local68.anInt5769 = 1;
						local68.anInt5773 = local57;
						local68.aLong169 = local21.aLong169;
						local68.aChar2 = '\u0000';
						this.aClass306_9.method7303(local68);
						this.aBooleanArray6[local57] = false;
					}
				}
			} else if (local21.anInt5769 == 3) {
				this.aClass306_9.method7303(local21);
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method801(@OriginalArg(1) Component arg0) {
		this.method802();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static295.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V")
	private void method802() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray6[local22] = false;
		}
		this.aClass306_9.method7315();
		this.aClass306_10.method7315();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	@Override
	public void method796() {
		this.method802();
	}

	@OriginalMember(owner = "client!bp", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static269.method1213(local6)) {
			this.method808(local6, 3, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method799(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray6[arg0] : false;
	}

	@OriginalMember(owner = "client!bp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IZ)V")
	private void method806(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static559.anIntArray709.length > local8) {
			local8 = Static559.anIntArray709[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method808('\u0000', arg1, local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)Lclient!tda;")
	@Override
	public Interface24 method800() {
		return (Interface24) this.aClass306_9.method7302();
	}

	@OriginalMember(owner = "client!bp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method808('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)I")
	private int method807() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray6[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray6[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray6[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(CIII)V")
	private void method808(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class5_Sub29 local7 = new Class5_Sub29();
		local7.anInt5773 = arg2;
		local7.anInt5769 = arg1;
		local7.aChar2 = arg0;
		local7.aLong169 = Static205.method3179();
		this.aClass306_10.method7303(local7);
	}

	@OriginalMember(owner = "client!bp", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method806(arg0, 0);
	}
}
