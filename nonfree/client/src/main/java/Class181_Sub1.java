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

@OriginalClass("client!on")
public final class Class181_Sub1 extends Class181 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!ai;")
	private Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Lclient!ai;")
	private Class7_Sub1 aClass7_Sub1_3;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "Lclient!ai;")
	private Class7_Sub1 aClass7_Sub1_4;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "[Z")
	private final boolean[] aBooleanArray21 = new boolean[112];

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class181_Sub1(@OriginalArg(0) Component arg0) {
		Static44.method4796();
		this.method3873(arg0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
	private void method3867(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static48.anIntArray87.length) {
			local8 = Static48.anIntArray87[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method3870(arg0, '\u0000', local8);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!on", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3867(1, arg0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method3865(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray21[arg0] : false;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(Z)V")
	@Override
	public void method3866() {
		this.method3871();
	}

	@OriginalMember(owner = "client!on", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static111.method1709(local6)) {
			this.method3870(2, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)V")
	@Override
	public synchronized void method3864() {
		for (@Pc(8) Class7_Sub1 local8 = this.aClass7_Sub1_4; local8 != null; local8 = local8.aClass7_Sub1_1) {
			if (local8.anInt147 == 0) {
				if (local8.anInt149 >= 0) {
					local8.aBoolean14 = !this.aBooleanArray21[local8.anInt149];
				}
				this.aBooleanArray21[local8.anInt149] = true;
			} else if (local8.anInt147 == 1) {
				this.aBooleanArray21[local8.anInt149] = false;
			} else if (local8.anInt147 == -1) {
				for (@Pc(34) int local34 = 0; local34 < 112; local34++) {
					this.aBooleanArray21[local34] = false;
				}
			}
		}
		this.aClass7_Sub1_2 = this.aClass7_Sub1_4;
		this.aClass7_Sub1_4 = null;
		this.aClass7_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ICIZ)V")
	private void method3870(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class7_Sub1 local7 = new Class7_Sub1();
		local7.anInt149 = arg2;
		local7.aChar1 = arg1;
		local7.anInt147 = arg0;
		local7.aLong7 = Static110.method1702();
		if (this.aClass7_Sub1_3 == null) {
			this.aClass7_Sub1_4 = local7;
		} else {
			this.aClass7_Sub1_3.aClass7_Sub1_1 = local7;
		}
		this.aClass7_Sub1_3 = local7;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(Z)V")
	private void method3871() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(27) int local27 = 0; local27 < 112; local27++) {
			this.aBooleanArray21[local27] = false;
		}
		this.aClass7_Sub1_2 = null;
		this.aClass7_Sub1_4 = null;
		this.aClass7_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!on", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3870(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Lclient!av;")
	@Override
	public Class7 method3862() {
		@Pc(8) Class7_Sub1 local8;
		for (local8 = this.aClass7_Sub1_2; local8 != null && local8.anInt147 == -1; local8 = local8.aClass7_Sub1_1) {
		}
		if (local8 == null) {
			this.aClass7_Sub1_2 = null;
		} else {
			this.aClass7_Sub1_2 = local8.aClass7_Sub1_1;
		}
		return local8;
	}

	@OriginalMember(owner = "client!on", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!on", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3867(0, arg0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method3873(@OriginalArg(0) Component arg0) {
		this.method3871();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static293.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}
}
