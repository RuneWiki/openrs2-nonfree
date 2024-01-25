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

@OriginalClass("client!or")
public final class Class154_Sub1 extends Class154 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!or", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "Lclient!el;")
	private Class69_Sub1 aClass69_Sub1_2;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "Lclient!el;")
	private Class69_Sub1 aClass69_Sub1_3;

	@OriginalMember(owner = "client!or", name = "C", descriptor = "Lclient!el;")
	private Class69_Sub1 aClass69_Sub1_4;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "[Z")
	private final boolean[] aBooleanArray21 = new boolean[112];

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class154_Sub1(@OriginalArg(0) Component arg0) {
		Static369.method2449();
		this.method3998(arg0);
	}

	@OriginalMember(owner = "client!or", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3999(1, arg0);
	}

	@OriginalMember(owner = "client!or", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static2.method11(local6)) {
			this.method4000(-1, local6, 2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method3998(@OriginalArg(1) Component arg0) {
		this.method4001();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static237.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!or", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4000(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!or", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3999(0, arg0);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method3995() {
		for (@Pc(8) Class69_Sub1 local8 = this.aClass69_Sub1_3; local8 != null; local8 = local8.aClass69_Sub1_1) {
			if (local8.anInt1567 == 0) {
				if (local8.anInt1571 >= 0) {
					local8.aBoolean138 = !this.aBooleanArray21[local8.anInt1571];
				}
				this.aBooleanArray21[local8.anInt1571] = true;
			} else if (local8.anInt1567 == 1) {
				this.aBooleanArray21[local8.anInt1571] = false;
			} else if (local8.anInt1567 == -1) {
				for (@Pc(29) int local29 = 0; local29 < 112; local29++) {
					this.aBooleanArray21[local29] = false;
				}
			}
		}
		this.aClass69_Sub1_4 = this.aClass69_Sub1_3;
		this.aClass69_Sub1_3 = null;
		this.aClass69_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;B)V")
	private void method3999(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static128.anIntArray288.length > local8) {
			local8 = Static128.anIntArray288[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4000(local8, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lclient!vm;")
	@Override
	public Class69 method3991() {
		@Pc(8) Class69_Sub1 local8;
		for (local8 = this.aClass69_Sub1_4; local8 != null && local8.anInt1567 == -1; local8 = local8.aClass69_Sub1_1) {
		}
		if (local8 == null) {
			this.aClass69_Sub1_4 = null;
		} else {
			this.aClass69_Sub1_4 = local8.aClass69_Sub1_1;
		}
		return local8;
	}

	@OriginalMember(owner = "client!or", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method3994(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray21[arg0] : false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ICII)V")
	private void method4000(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class69_Sub1 local13 = new Class69_Sub1();
		local13.aChar3 = arg1;
		local13.anInt1567 = arg2;
		local13.anInt1571 = arg0;
		local13.aLong40 = Static378.method5293();
		if (this.aClass69_Sub1_2 == null) {
			this.aClass69_Sub1_3 = local13;
		} else {
			this.aClass69_Sub1_2.aClass69_Sub1_1 = local13;
		}
		this.aClass69_Sub1_2 = local13;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V")
	private void method4001() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray21[local26] = false;
		}
		this.aClass69_Sub1_3 = null;
		this.aClass69_Sub1_2 = null;
		this.aClass69_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	@Override
	public void method3992() {
		this.method4001();
	}
}
