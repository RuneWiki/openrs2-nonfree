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

@OriginalClass("client!bk")
public final class Class25_Sub1 extends Class25 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!da;")
	private Class50_Sub1 aClass50_Sub1_1;

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "Lclient!da;")
	private Class50_Sub1 aClass50_Sub1_2;

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "Lclient!da;")
	private Class50_Sub1 aClass50_Sub1_3;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "[Z")
	private final boolean[] aBooleanArray6 = new boolean[112];

	static {
		new Class140("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class25_Sub1(@OriginalArg(0) Component arg0) {
		Static189.method3532();
		this.method403(arg0);
	}

	@OriginalMember(owner = "client!bk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method401(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static278.anIntArray442.length > local8) {
			local8 = Static278.anIntArray442[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method406(local8, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lclient!ol;")
	@Override
	public Class50 method394() {
		@Pc(13) Class50_Sub1 local13;
		for (local13 = this.aClass50_Sub1_2; local13 != null && local13.anInt937 == -1; local13 = local13.aClass50_Sub1_4) {
		}
		if (local13 == null) {
			this.aClass50_Sub1_2 = null;
		} else {
			this.aClass50_Sub1_2 = local13.aClass50_Sub1_4;
		}
		return local13;
	}

	@OriginalMember(owner = "client!bk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method401(0, arg0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method403(@OriginalArg(0) Component arg0) {
		this.method405();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static293.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method398(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray6[arg0] : false;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	@Override
	public void method399() {
		this.method405();
	}

	@OriginalMember(owner = "client!bk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method401(1, arg0);
	}

	@OriginalMember(owner = "client!bk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method406(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)V")
	private void method405() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray6[local22] = false;
		}
		this.aClass50_Sub1_3 = null;
		this.aClass50_Sub1_1 = null;
		this.aClass50_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZIIC)V")
	private void method406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class50_Sub1 local7 = new Class50_Sub1();
		local7.aChar1 = arg2;
		local7.anInt937 = arg1;
		local7.anInt934 = arg0;
		local7.aLong32 = Static22.method285();
		if (this.aClass50_Sub1_1 == null) {
			this.aClass50_Sub1_3 = local7;
		} else {
			this.aClass50_Sub1_1.aClass50_Sub1_4 = local7;
		}
		this.aClass50_Sub1_1 = local7;
	}

	@OriginalMember(owner = "client!bk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static197.method3640(local6)) {
			this.method406(-1, 2, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method395() {
		for (@Pc(14) Class50_Sub1 local14 = this.aClass50_Sub1_3; local14 != null; local14 = local14.aClass50_Sub1_4) {
			if (local14.anInt937 == 0) {
				if (local14.anInt934 >= 0) {
					local14.aBoolean95 = !this.aBooleanArray6[local14.anInt934];
				}
				this.aBooleanArray6[local14.anInt934] = true;
			} else if (local14.anInt937 == 1) {
				this.aBooleanArray6[local14.anInt934] = false;
			} else if (local14.anInt937 == -1) {
				for (@Pc(40) int local40 = 0; local40 < 112; local40++) {
					this.aBooleanArray6[local40] = false;
				}
			}
		}
		this.aClass50_Sub1_2 = this.aClass50_Sub1_3;
		this.aClass50_Sub1_1 = null;
		this.aClass50_Sub1_3 = null;
	}
}
