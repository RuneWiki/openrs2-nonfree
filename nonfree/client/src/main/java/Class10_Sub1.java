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

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!ke;")
	private Class60_Sub1 aClass60_Sub1_1;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Lclient!ke;")
	private Class60_Sub1 aClass60_Sub1_2;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "Lclient!ke;")
	private Class60_Sub1 aClass60_Sub1_3;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "[Z")
	private final boolean[] aBooleanArray3 = new boolean[112];

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class10_Sub1(@OriginalArg(0) Component arg0) {
		Static315.method4355();
		this.method306(arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	private void method306(@OriginalArg(1) Component arg0) {
		this.method311();
		this.aComponent1 = arg0;
		@Pc(16) Method local16 = Static227.aMethod1;
		if (local16 != null) {
			try {
				local16.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method301(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray3[arg0] : false;
	}

	@OriginalMember(owner = "client!am", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!am", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method310(arg0, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZCI)V")
	private void method308(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class60_Sub1 local14 = new Class60_Sub1();
		local14.aChar2 = arg1;
		local14.anInt3958 = arg2;
		local14.anInt3960 = arg0;
		local14.aLong127 = Static118.method1934();
		if (this.aClass60_Sub1_1 == null) {
			this.aClass60_Sub1_3 = local14;
		} else {
			this.aClass60_Sub1_1.aClass60_Sub1_4 = local14;
		}
		this.aClass60_Sub1_1 = local14;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method305() {
		for (@Pc(16) Class60_Sub1 local16 = this.aClass60_Sub1_3; local16 != null; local16 = local16.aClass60_Sub1_4) {
			if (local16.anInt3958 == 0) {
				if (local16.anInt3960 >= 0) {
					local16.aBoolean339 = !this.aBooleanArray3[local16.anInt3960];
				}
				this.aBooleanArray3[local16.anInt3960] = true;
			} else if (local16.anInt3958 == 1) {
				this.aBooleanArray3[local16.anInt3960] = false;
			} else if (local16.anInt3958 == -1) {
				for (@Pc(59) int local59 = 0; local59 < 112; local59++) {
					this.aBooleanArray3[local59] = false;
				}
			}
		}
		this.aClass60_Sub1_2 = this.aClass60_Sub1_3;
		this.aClass60_Sub1_1 = null;
		this.aClass60_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!am", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method308(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!am", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method310(arg0, 1);
	}

	@OriginalMember(owner = "client!am", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static300.method4235(local6)) {
			this.method308(-1, local6, 2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method310(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static146.anIntArray189.length) {
			local8 = Static146.anIntArray189[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method308(local8, '\u0000', arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lclient!ec;")
	@Override
	public Class60 method302() {
		@Pc(13) Class60_Sub1 local13;
		for (local13 = this.aClass60_Sub1_2; local13 != null && local13.anInt3958 == -1; local13 = local13.aClass60_Sub1_4) {
		}
		if (local13 == null) {
			this.aClass60_Sub1_2 = null;
		} else {
			this.aClass60_Sub1_2 = local13.aClass60_Sub1_4;
		}
		return local13;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	private void method311() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray3[local28] = false;
		}
		this.aClass60_Sub1_3 = null;
		this.aClass60_Sub1_1 = null;
		this.aClass60_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
	@Override
	public void method303() {
		this.method311();
	}
}
