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

@OriginalClass("client!av")
public final class Class16_Sub1 extends Class16 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Lclient!bg;")
	private Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!av", name = "n", descriptor = "Lclient!bg;")
	private Class19_Sub1 aClass19_Sub1_2;

	@OriginalMember(owner = "client!av", name = "v", descriptor = "Lclient!bg;")
	private Class19_Sub1 aClass19_Sub1_3;

	@OriginalMember(owner = "client!av", name = "E", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!av", name = "w", descriptor = "[Z")
	private final boolean[] aBooleanArray3 = new boolean[112];

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class16_Sub1(@OriginalArg(0) Component arg0) {
		Static134.method2323();
		this.method593(arg0);
	}

	@OriginalMember(owner = "client!av", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method588(0, arg0);
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method586() {
		for (@Pc(8) Class19_Sub1 local8 = this.aClass19_Sub1_2; local8 != null; local8 = local8.aClass19_Sub1_4) {
			if (local8.anInt781 == 0) {
				if (local8.anInt782 >= 0) {
					local8.aBoolean44 = !this.aBooleanArray3[local8.anInt782];
				}
				this.aBooleanArray3[local8.anInt782] = true;
			} else if (local8.anInt781 == 1) {
				this.aBooleanArray3[local8.anInt782] = false;
			} else if (local8.anInt781 == -1) {
				for (@Pc(53) int local53 = 0; local53 < 112; local53++) {
					this.aBooleanArray3[local53] = false;
				}
			}
		}
		this.aClass19_Sub1_1 = this.aClass19_Sub1_2;
		this.aClass19_Sub1_2 = null;
		this.aClass19_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)Lclient!kc;")
	@Override
	public Class19 method584() {
		@Pc(8) Class19_Sub1 local8;
		for (local8 = this.aClass19_Sub1_1; local8 != null && local8.anInt781 == -1; local8 = local8.aClass19_Sub1_4) {
		}
		if (local8 == null) {
			this.aClass19_Sub1_1 = null;
		} else {
			this.aClass19_Sub1_1 = local8.aClass19_Sub1_4;
		}
		return local8;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
	private void method588(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(13) int local13 = arg1.getKeyCode();
		if (local13 == 0) {
			local13 = 0;
		} else if (local13 >= 0 && local13 < Static157.anIntArray256.length) {
			local13 = Static157.anIntArray256[local13];
			if (arg0 == 0 && (local13 & 0x80) != 0) {
				local13 = 0;
			} else {
				local13 &= 0xFFFFFF7F;
			}
		} else {
			local13 = 0;
		}
		if (local13 != 0) {
			this.method594('\u0000', local13, arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!av", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static135.method2457(local6)) {
			this.method594(local6, -1, 2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!av", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method594('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(I)V")
	@Override
	public void method585() {
		this.method592();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method580(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray3[arg0] : false;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V")
	private void method592() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(20) int local20 = 0; local20 < 112; local20++) {
			this.aBooleanArray3[local20] = false;
		}
		this.aClass19_Sub1_1 = null;
		this.aClass19_Sub1_2 = null;
		this.aClass19_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method593(@OriginalArg(1) Component arg0) {
		this.method592();
		this.aComponent1 = arg0;
		@Pc(15) Method local15 = Static162.aMethod2;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!av", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!av", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method588(1, arg0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(CIII)V")
	private void method594(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class19_Sub1 local7 = new Class19_Sub1();
		local7.anInt782 = arg1;
		local7.anInt781 = arg2;
		local7.aChar1 = arg0;
		local7.aLong29 = Static150.method2672();
		if (this.aClass19_Sub1_3 == null) {
			this.aClass19_Sub1_2 = local7;
		} else {
			this.aClass19_Sub1_3.aClass19_Sub1_4 = local7;
		}
		this.aClass19_Sub1_3 = local7;
	}
}
