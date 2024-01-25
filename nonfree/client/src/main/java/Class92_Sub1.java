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

@OriginalClass("client!ia")
public final class Class92_Sub1 extends Class92 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!ua;")
	private Class157_Sub1 aClass157_Sub1_1;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!ua;")
	private Class157_Sub1 aClass157_Sub1_2;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "Lclient!ua;")
	private Class157_Sub1 aClass157_Sub1_3;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "[Z")
	private final boolean[] aBooleanArray16 = new boolean[112];

	static {
		new Class159("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class92_Sub1(@OriginalArg(0) Component arg0) {
		Static315.method5195();
		this.method2623(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 == '\u0000') {
			local6 = '\u0000';
		}
		if (local6 > '\u0000' && Static113.method2382(local6)) {
			this.method2624(local6, 2, -1);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2623(@OriginalArg(0) Component arg0) {
		this.method2630();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static200.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	@Override
	public void method2618() {
		this.method2630();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BCII)V")
	private void method2624(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class157_Sub1 local7 = new Class157_Sub1();
		local7.anInt6110 = arg1;
		local7.anInt6109 = arg2;
		local7.aChar4 = arg0;
		local7.aLong194 = Static208.method3879();
		if (this.aClass157_Sub1_3 == null) {
			this.aClass157_Sub1_1 = local7;
		} else {
			this.aClass157_Sub1_3.aClass157_Sub1_4 = local7;
		}
		this.aClass157_Sub1_3 = local7;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2615() {
		for (@Pc(8) Class157_Sub1 local8 = this.aClass157_Sub1_1; local8 != null; local8 = local8.aClass157_Sub1_4) {
			if (local8.anInt6110 == 0) {
				if (local8.anInt6109 >= 0) {
					local8.aBoolean452 = !this.aBooleanArray16[local8.anInt6109];
				}
				this.aBooleanArray16[local8.anInt6109] = true;
			} else if (local8.anInt6110 == 1) {
				this.aBooleanArray16[local8.anInt6109] = false;
			} else if (local8.anInt6110 == -1) {
				for (@Pc(50) int local50 = 0; local50 < 112; local50++) {
					this.aBooleanArray16[local50] = false;
				}
			}
		}
		this.aClass157_Sub1_2 = this.aClass157_Sub1_1;
		this.aClass157_Sub1_1 = null;
		this.aClass157_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)Lclient!pk;")
	@Override
	public Class157 method2619() {
		@Pc(13) Class157_Sub1 local13;
		for (local13 = this.aClass157_Sub1_2; local13 != null && local13.anInt6110 == -1; local13 = local13.aClass157_Sub1_4) {
		}
		if (local13 == null) {
			this.aClass157_Sub1_2 = null;
		} else {
			this.aClass157_Sub1_2 = local13.aClass157_Sub1_4;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method2626(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && local14 < Static19.anIntArray13.length) {
			local14 = Static19.anIntArray13[local14];
			if (arg1 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 > 0) {
			this.method2624('\u0000', arg1, local14);
		}
	}

	@OriginalMember(owner = "client!ia", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2626(arg0, 0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2620(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray16[arg0] : false;
	}

	@OriginalMember(owner = "client!ia", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2624('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!ia", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	private void method2630() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(30) int local30 = 0; local30 < 112; local30++) {
			this.aBooleanArray16[local30] = false;
		}
		this.aClass157_Sub1_3 = null;
		this.aClass157_Sub1_1 = null;
		this.aClass157_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!ia", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2626(arg0, 1);
	}
}
