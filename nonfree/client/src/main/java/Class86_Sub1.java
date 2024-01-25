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

@OriginalClass("client!fr")
public final class Class86_Sub1 extends Class86 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "Lclient!kg;")
	private Class139_Sub1 aClass139_Sub1_1;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "Lclient!kg;")
	private Class139_Sub1 aClass139_Sub1_2;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "Lclient!kg;")
	private Class139_Sub1 aClass139_Sub1_3;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray13 = new boolean[112];

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class86_Sub1(@OriginalArg(0) Component arg0) {
		Static257.method3958();
		this.method1875(arg0);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIC)V")
	private void method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class139_Sub1 local7 = new Class139_Sub1();
		local7.anInt3573 = arg1;
		local7.aChar1 = arg2;
		local7.anInt3576 = arg0;
		local7.aLong109 = Static154.method2527();
		if (this.aClass139_Sub1_1 == null) {
			this.aClass139_Sub1_3 = local7;
		} else {
			this.aClass139_Sub1_1.aClass139_Sub1_4 = local7;
		}
		this.aClass139_Sub1_1 = local7;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	@Override
	public void method1865() {
		this.method1876();
	}

	@OriginalMember(owner = "client!fr", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1874(arg0, 1);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1867(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray13[arg0] : false;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1866() {
		for (@Pc(14) Class139_Sub1 local14 = this.aClass139_Sub1_3; local14 != null; local14 = local14.aClass139_Sub1_4) {
			if (local14.anInt3576 == 0) {
				if (local14.anInt3573 >= 0) {
					local14.aBoolean238 = !this.aBooleanArray13[local14.anInt3573];
				}
				this.aBooleanArray13[local14.anInt3573] = true;
			} else if (local14.anInt3576 == 1) {
				this.aBooleanArray13[local14.anInt3573] = false;
			} else if (local14.anInt3576 == -1) {
				for (@Pc(32) int local32 = 0; local32 < 112; local32++) {
					this.aBooleanArray13[local32] = false;
				}
			}
		}
		this.aClass139_Sub1_2 = this.aClass139_Sub1_3;
		this.aClass139_Sub1_3 = null;
		this.aClass139_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!fr", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static73.method1408(local6)) {
			this.method1870(2, -1, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method1874(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && Static17.anIntArray21.length > local14) {
			local14 = Static17.anIntArray21[local14];
			if (arg1 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method1870(arg1, local14, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Lclient!pg;")
	@Override
	public Class139 method1868() {
		@Pc(8) Class139_Sub1 local8;
		for (local8 = this.aClass139_Sub1_2; local8 != null && local8.anInt3576 == -1; local8 = local8.aClass139_Sub1_4) {
		}
		if (local8 == null) {
			this.aClass139_Sub1_2 = null;
		} else {
			this.aClass139_Sub1_2 = local8.aClass139_Sub1_4;
		}
		return local8;
	}

	@OriginalMember(owner = "client!fr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method1875(@OriginalArg(0) Component arg0) {
		this.method1876();
		this.aComponent2 = arg0;
		@Pc(22) Method local22 = Static143.aMethod1;
		if (local22 != null) {
			try {
				local22.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(37) Throwable local37) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!fr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1870(-1, 0, '\u0000');
	}

	@OriginalMember(owner = "client!fr", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1874(arg0, 0);
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)V")
	private void method1876() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray13[local26] = false;
		}
		this.aClass139_Sub1_2 = null;
		this.aClass139_Sub1_3 = null;
		this.aClass139_Sub1_1 = null;
	}
}
