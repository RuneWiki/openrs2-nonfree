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

@OriginalClass("client!gw")
public final class Class107_Sub1 extends Class107 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "Lclient!ca;")
	private Class36_Sub1 aClass36_Sub1_2;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "Lclient!ca;")
	private Class36_Sub1 aClass36_Sub1_3;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "Lclient!ca;")
	private Class36_Sub1 aClass36_Sub1_4;

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "[Z")
	private final boolean[] aBooleanArray12 = new boolean[112];

	static {
		new Class15("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class107_Sub1(@OriginalArg(0) Component arg0) {
		Static310.method4060();
		this.method2007(arg0);
	}

	@OriginalMember(owner = "client!gw", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2009(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IBLjava/awt/event/KeyEvent;)V")
	private void method2005(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(14) int local14 = arg1.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && local14 < Static295.anIntArray390.length) {
			local14 = Static295.anIntArray390[local14];
			if (arg0 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method2009(local14, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!gw", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2005(1, arg0);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method2003(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray12[arg0] : false;
	}

	@OriginalMember(owner = "client!gw", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2005(0, arg0);
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(I)V")
	private void method2006() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray12[local22] = false;
		}
		this.aClass36_Sub1_2 = null;
		this.aClass36_Sub1_4 = null;
		this.aClass36_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)V")
	@Override
	public void method1998() {
		this.method2006();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method2007(@OriginalArg(1) Component arg0) {
		this.method2006();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static300.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2002() {
		for (@Pc(8) Class36_Sub1 local8 = this.aClass36_Sub1_2; local8 != null; local8 = local8.aClass36_Sub1_1) {
			if (local8.anInt689 == 0) {
				if (local8.anInt691 >= 0) {
					local8.aBoolean44 = !this.aBooleanArray12[local8.anInt691];
				}
				this.aBooleanArray12[local8.anInt691] = true;
			} else if (local8.anInt689 == 1) {
				this.aBooleanArray12[local8.anInt691] = false;
			} else if (local8.anInt689 == -1) {
				for (@Pc(35) int local35 = 0; local35 < 112; local35++) {
					this.aBooleanArray12[local35] = false;
				}
			}
		}
		this.aClass36_Sub1_3 = this.aClass36_Sub1_2;
		this.aClass36_Sub1_4 = null;
		this.aClass36_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIC)V")
	private void method2009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class36_Sub1 local7 = new Class36_Sub1();
		local7.anInt689 = arg1;
		local7.anInt691 = arg0;
		local7.aChar1 = arg2;
		local7.aLong21 = Static266.method3498();
		if (this.aClass36_Sub1_4 == null) {
			this.aClass36_Sub1_2 = local7;
		} else {
			this.aClass36_Sub1_4.aClass36_Sub1_1 = local7;
		}
		this.aClass36_Sub1_4 = local7;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Lclient!ks;")
	@Override
	public Class36 method2000() {
		@Pc(13) Class36_Sub1 local13;
		for (local13 = this.aClass36_Sub1_3; local13 != null && local13.anInt689 == -1; local13 = local13.aClass36_Sub1_1) {
		}
		if (local13 == null) {
			this.aClass36_Sub1_3 = null;
		} else {
			this.aClass36_Sub1_3 = local13.aClass36_Sub1_1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!gw", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static410.method5572(local6)) {
			this.method2009(-1, 2, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gw", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
