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

@OriginalClass("client!fk")
public final class Class60_Sub1 extends Class60 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "Lclient!os;")
	private Class159_Sub1 aClass159_Sub1_1;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "Lclient!os;")
	private Class159_Sub1 aClass159_Sub1_2;

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "Lclient!os;")
	private Class159_Sub1 aClass159_Sub1_3;

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "[Z")
	private final boolean[] aBooleanArray8 = new boolean[112];

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class60_Sub1(@OriginalArg(0) Component arg0) {
		Static289.method5104();
		this.method1877(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;ZI)V")
	private void method1871(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static46.anIntArray75.length > local8) {
			local8 = Static46.anIntArray75[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method1873(arg1, '\u0000', local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!fk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1871(arg0, 1);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lclient!sc;")
	@Override
	public Class159 method1865() {
		@Pc(13) Class159_Sub1 local13;
		for (local13 = this.aClass159_Sub1_1; local13 != null && local13.anInt4732 == -1; local13 = local13.aClass159_Sub1_4) {
		}
		if (local13 == null) {
			this.aClass159_Sub1_1 = null;
		} else {
			this.aClass159_Sub1_1 = local13.aClass159_Sub1_4;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1873(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ICII)V")
	private void method1873(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class159_Sub1 local7 = new Class159_Sub1();
		local7.aChar4 = arg1;
		local7.anInt4729 = arg2;
		local7.anInt4732 = arg0;
		local7.aLong164 = Static183.method3462();
		if (this.aClass159_Sub1_3 == null) {
			this.aClass159_Sub1_2 = local7;
		} else {
			this.aClass159_Sub1_3.aClass159_Sub1_4 = local7;
		}
		this.aClass159_Sub1_3 = local7;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1863(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray8[arg0] : false;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	private void method1875() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(30) int local30 = 0; local30 < 112; local30++) {
			this.aBooleanArray8[local30] = false;
		}
		this.aClass159_Sub1_1 = null;
		this.aClass159_Sub1_2 = null;
		this.aClass159_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!fk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static248.method4699(local6)) {
			this.method1873(2, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1871(arg0, 0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	@Override
	public void method1868() {
		this.method1875();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method1877(@OriginalArg(0) Component arg0) {
		this.method1875();
		this.aComponent2 = arg0;
		@Pc(17) Method local17 = Static111.aMethod2;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1870() {
		for (@Pc(8) Class159_Sub1 local8 = this.aClass159_Sub1_2; local8 != null; local8 = local8.aClass159_Sub1_4) {
			if (local8.anInt4732 == 0) {
				if (local8.anInt4729 >= 0) {
					local8.aBoolean360 = !this.aBooleanArray8[local8.anInt4729];
				}
				this.aBooleanArray8[local8.anInt4729] = true;
			} else if (local8.anInt4732 == 1) {
				this.aBooleanArray8[local8.anInt4729] = false;
			} else if (local8.anInt4732 == -1) {
				for (@Pc(31) int local31 = 0; local31 < 112; local31++) {
					this.aBooleanArray8[local31] = false;
				}
			}
		}
		this.aClass159_Sub1_1 = this.aClass159_Sub1_2;
		this.aClass159_Sub1_2 = null;
		this.aClass159_Sub1_3 = null;
	}
}
