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

@OriginalClass("client!cs")
public final class Class65_Sub1 extends Class65 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "Lclient!ok;")
	private final Class262 aClass262_8 = new Class262();

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "Lclient!ok;")
	private final Class262 aClass262_9 = new Class262();

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "[Z")
	private final boolean[] aBooleanArray5 = new boolean[112];

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class65_Sub1(@OriginalArg(0) Component arg0) {
		Static437.method6439();
		this.method1570(arg0);
	}

	@OriginalMember(owner = "client!cs", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static140.method2209(local6)) {
			this.method1576(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
	@Override
	public void method1562() {
		this.method1573();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1570(@OriginalArg(1) Component arg0) {
		this.method1573();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static565.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!cs", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1574(arg0, 0);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1564() {
		this.aClass262_8.method6316();
		for (@Pc(19) Class14_Sub24 local19 = (Class14_Sub24) this.aClass262_9.method6323(); local19 != null; local19 = (Class14_Sub24) this.aClass262_9.method6323()) {
			local19.anInt4148 = this.method1575();
			if (local19.anInt4144 == 0) {
				if (!this.aBooleanArray5[local19.anInt4147]) {
					@Pc(125) Class14_Sub24 local125 = new Class14_Sub24();
					local125.aChar3 = '\u0000';
					local125.anInt4147 = local19.anInt4147;
					local125.aLong118 = local19.aLong118;
					local125.anInt4144 = 0;
					local125.anInt4148 = local19.anInt4148;
					this.aClass262_8.method6314(local125);
					this.aBooleanArray5[local19.anInt4147] = true;
				}
				local19.anInt4144 = 2;
				this.aClass262_8.method6314(local19);
			} else if (local19.anInt4144 == 1) {
				if (this.aBooleanArray5[local19.anInt4147]) {
					this.aClass262_8.method6314(local19);
					this.aBooleanArray5[local19.anInt4147] = false;
				}
			} else if (local19.anInt4144 == -1) {
				for (@Pc(39) int local39 = 0; local39 < 112; local39++) {
					if (this.aBooleanArray5[local39]) {
						@Pc(50) Class14_Sub24 local50 = new Class14_Sub24();
						local50.aLong118 = local19.aLong118;
						local50.anInt4147 = local39;
						local50.aChar3 = '\u0000';
						local50.anInt4144 = 1;
						local50.anInt4148 = local19.anInt4148;
						this.aClass262_8.method6314(local50);
						this.aBooleanArray5[local39] = false;
					}
				}
			} else if (local19.anInt4144 == 3) {
				this.aClass262_8.method6314(local19);
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!cs", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1574(arg0, 1);
	}

	@OriginalMember(owner = "client!cs", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1576(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1565(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray5[arg0] : false;
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(Z)V")
	private void method1573() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(29) int local29 = 0; local29 < 112; local29++) {
			this.aBooleanArray5[local29] = false;
		}
		this.aClass262_8.method6316();
		this.aClass262_9.method6316();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method1574(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && Static464.anIntArray616.length > local14) {
			local14 = Static464.anIntArray616[local14];
			if (arg1 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method1576(local14, arg1, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)I")
	private int method1575() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray5[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray5[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray5[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)Lclient!fo;")
	@Override
	public Interface7 method1567() {
		return (Interface7) this.aClass262_8.method6323();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BIIC)V")
	private void method1576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class14_Sub24 local7 = new Class14_Sub24();
		local7.anInt4147 = arg0;
		local7.anInt4144 = arg1;
		local7.aChar3 = arg2;
		local7.aLong118 = Static521.method7499();
		this.aClass262_9.method6314(local7);
	}
}
