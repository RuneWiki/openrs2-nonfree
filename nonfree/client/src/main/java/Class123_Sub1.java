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

@OriginalClass("client!ji")
public final class Class123_Sub1 extends Class123 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "Lclient!rs;")
	private Class128_Sub1 aClass128_Sub1_1;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Lclient!rs;")
	private Class128_Sub1 aClass128_Sub1_2;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Lclient!rs;")
	private Class128_Sub1 aClass128_Sub1_3;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "[Z")
	private final boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class123_Sub1(@OriginalArg(0) Component arg0) {
		Static364.method2861();
		this.method2759(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static200.method2835(local6)) {
			this.method2764(2, -1, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method2759(@OriginalArg(0) Component arg0) {
		this.method2763();
		this.aComponent1 = arg0;
		@Pc(19) Method local19 = Static117.aMethod1;
		if (local19 != null) {
			try {
				local19.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ji", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2764(-1, 0, '\u0000');
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	@Override
	public void method2755() {
		this.method2763();
	}

	@OriginalMember(owner = "client!ji", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ji", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2762(arg0, 1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2750(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray11[arg0] : false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method2762(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && Static133.anIntArray159.length > local14) {
			local14 = Static133.anIntArray159[local14];
			if (arg1 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method2764(arg1, local14, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ji", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2762(arg0, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Lclient!jv;")
	@Override
	public Class128 method2751() {
		@Pc(8) Class128_Sub1 local8;
		for (local8 = this.aClass128_Sub1_1; local8 != null && local8.anInt6064 == -1; local8 = local8.aClass128_Sub1_4) {
		}
		if (local8 == null) {
			this.aClass128_Sub1_1 = null;
		} else {
			this.aClass128_Sub1_1 = local8.aClass128_Sub1_4;
		}
		return local8;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
	private void method2763() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray11[local28] = false;
		}
		this.aClass128_Sub1_1 = null;
		this.aClass128_Sub1_3 = null;
		this.aClass128_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IICB)V")
	private void method2764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char arg2) {
		@Pc(7) Class128_Sub1 local7 = new Class128_Sub1();
		local7.anInt6058 = arg1;
		local7.anInt6064 = arg0;
		local7.aChar5 = arg2;
		local7.aLong184 = Static27.method359();
		if (this.aClass128_Sub1_3 == null) {
			this.aClass128_Sub1_2 = local7;
		} else {
			this.aClass128_Sub1_3.aClass128_Sub1_4 = local7;
		}
		this.aClass128_Sub1_3 = local7;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2757() {
		for (@Pc(13) Class128_Sub1 local13 = this.aClass128_Sub1_2; local13 != null; local13 = local13.aClass128_Sub1_4) {
			if (local13.anInt6064 == 0) {
				if (local13.anInt6058 >= 0) {
					local13.aBoolean684 = !this.aBooleanArray11[local13.anInt6058];
				}
				this.aBooleanArray11[local13.anInt6058] = true;
			} else if (local13.anInt6064 == 1) {
				this.aBooleanArray11[local13.anInt6058] = false;
			} else if (local13.anInt6064 == -1) {
				for (@Pc(65) int local65 = 0; local65 < 112; local65++) {
					this.aBooleanArray11[local65] = false;
				}
			}
		}
		this.aClass128_Sub1_1 = this.aClass128_Sub1_2;
		this.aClass128_Sub1_2 = null;
		this.aClass128_Sub1_3 = null;
	}
}
