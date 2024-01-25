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

@OriginalClass("client!am")
public final class Class10_Sub1 extends Class10 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!am", name = "g", descriptor = "Lclient!be;")
	private Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "Lclient!be;")
	private Class22_Sub1 aClass22_Sub1_2;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "Lclient!be;")
	private Class22_Sub1 aClass22_Sub1_3;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "[Z")
	private final boolean[] aBooleanArray1 = new boolean[112];

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class10_Sub1(@OriginalArg(0) Component arg0) {
		Static68.method1007();
		this.method227(arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method226(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static442.anIntArray574.length > local8) {
			local8 = Static442.anIntArray574[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method229('\u0000', arg0, local8);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method227(@OriginalArg(0) Component arg0) {
		this.method228();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static48.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method221(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray1[arg0] : false;
	}

	@OriginalMember(owner = "client!am", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method226(0, arg0);
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
	private void method228() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray1[local22] = false;
		}
		this.aClass22_Sub1_2 = null;
		this.aClass22_Sub1_3 = null;
		this.aClass22_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!am", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method229('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Lclient!th;")
	@Override
	public Class22 method220() {
		@Pc(13) Class22_Sub1 local13;
		for (local13 = this.aClass22_Sub1_2; local13 != null && local13.anInt446 == -1; local13 = local13.aClass22_Sub1_4) {
		}
		if (local13 == null) {
			this.aClass22_Sub1_2 = null;
		} else {
			this.aClass22_Sub1_2 = local13.aClass22_Sub1_4;
		}
		return local13;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	@Override
	public void method224() {
		this.method228();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method223() {
		for (@Pc(8) Class22_Sub1 local8 = this.aClass22_Sub1_1; local8 != null; local8 = local8.aClass22_Sub1_4) {
			if (local8.anInt446 == 0) {
				if (local8.anInt438 >= 0) {
					local8.aBoolean29 = !this.aBooleanArray1[local8.anInt438];
				}
				this.aBooleanArray1[local8.anInt438] = true;
			} else if (local8.anInt446 == 1) {
				this.aBooleanArray1[local8.anInt438] = false;
			} else if (local8.anInt446 == -1) {
				for (@Pc(59) int local59 = 0; local59 < 112; local59++) {
					this.aBooleanArray1[local59] = false;
				}
			}
		}
		this.aClass22_Sub1_2 = this.aClass22_Sub1_1;
		this.aClass22_Sub1_3 = null;
		this.aClass22_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(CIII)V")
	private void method229(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class22_Sub1 local15 = new Class22_Sub1();
		local15.anInt446 = arg1;
		local15.aChar1 = arg0;
		local15.anInt438 = arg2;
		local15.aLong19 = Static107.method1707();
		if (this.aClass22_Sub1_3 == null) {
			this.aClass22_Sub1_1 = local15;
		} else {
			this.aClass22_Sub1_3.aClass22_Sub1_4 = local15;
		}
		this.aClass22_Sub1_3 = local15;
	}

	@OriginalMember(owner = "client!am", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static199.method3071(local6)) {
			this.method229(local6, 2, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!am", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!am", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method226(1, arg0);
	}
}
