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

@OriginalClass("client!nb")
public final class Class163_Sub1 extends Class163 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!kg;")
	private Class21_Sub1 aClass21_Sub1_2;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Lclient!kg;")
	private Class21_Sub1 aClass21_Sub1_3;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!kg;")
	private Class21_Sub1 aClass21_Sub1_4;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray16 = new boolean[112];

	static {
		new Class84("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class163_Sub1(@OriginalArg(0) Component arg0) {
		Static136.method1929();
		this.method3811(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3811(@OriginalArg(0) Component arg0) {
		this.method3814();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static210.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!nb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3815(arg0, 1);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	@Override
	public void method3806() {
		this.method3814();
	}

	@OriginalMember(owner = "client!nb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static160.method2428(local6)) {
			this.method3816(2, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3809(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray16[arg0] : false;
	}

	@OriginalMember(owner = "client!nb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method3810() {
		for (@Pc(8) Class21_Sub1 local8 = this.aClass21_Sub1_3; local8 != null; local8 = local8.aClass21_Sub1_1) {
			if (local8.anInt3840 == 0) {
				if (local8.anInt3844 >= 0) {
					local8.aBoolean265 = !this.aBooleanArray16[local8.anInt3844];
				}
				this.aBooleanArray16[local8.anInt3844] = true;
			} else if (local8.anInt3840 == 1) {
				this.aBooleanArray16[local8.anInt3844] = false;
			} else if (local8.anInt3840 == -1) {
				for (@Pc(60) int local60 = 0; local60 < 112; local60++) {
					this.aBooleanArray16[local60] = false;
				}
			}
		}
		this.aClass21_Sub1_4 = this.aClass21_Sub1_3;
		this.aClass21_Sub1_3 = null;
		this.aClass21_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lclient!bd;")
	@Override
	public Class21 method3805() {
		@Pc(8) Class21_Sub1 local8;
		for (local8 = this.aClass21_Sub1_4; local8 != null && local8.anInt3840 == -1; local8 = local8.aClass21_Sub1_1) {
		}
		if (local8 == null) {
			this.aClass21_Sub1_4 = null;
		} else {
			this.aClass21_Sub1_4 = local8.aClass21_Sub1_1;
		}
		return local8;
	}

	@OriginalMember(owner = "client!nb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3816(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	private void method3814() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(20) int local20 = 0; local20 < 112; local20++) {
			this.aBooleanArray16[local20] = false;
		}
		this.aClass21_Sub1_4 = null;
		this.aClass21_Sub1_3 = null;
		this.aClass21_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!nb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3815(arg0, 0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method3815(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && local14 < Static259.anIntArray513.length) {
			local14 = Static259.anIntArray513[local14];
			if (arg1 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method3816(arg1, '\u0000', local14);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZICI)V")
	private void method3816(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class21_Sub1 local7 = new Class21_Sub1();
		local7.anInt3840 = arg0;
		local7.aChar3 = arg1;
		local7.anInt3844 = arg2;
		local7.aLong118 = Static101.method1557();
		if (this.aClass21_Sub1_2 == null) {
			this.aClass21_Sub1_3 = local7;
		} else {
			this.aClass21_Sub1_2.aClass21_Sub1_1 = local7;
		}
		this.aClass21_Sub1_2 = local7;
	}
}
