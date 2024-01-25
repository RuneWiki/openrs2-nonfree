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

@OriginalClass("client!vr")
public final class Class244_Sub1 extends Class244 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Lclient!bw;")
	private Class30_Sub1 aClass30_Sub1_2;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "Lclient!bw;")
	private Class30_Sub1 aClass30_Sub1_3;

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "Lclient!bw;")
	private Class30_Sub1 aClass30_Sub1_4;

	@OriginalMember(owner = "client!vr", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "[Z")
	private final boolean[] aBooleanArray24 = new boolean[112];

	static {
		new Class83("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class244_Sub1(@OriginalArg(0) Component arg0) {
		Static208.method2250();
		this.method5495(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BICI)V")
	private void method5492(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class30_Sub1 local15 = new Class30_Sub1();
		local15.anInt781 = arg2;
		local15.anInt782 = arg0;
		local15.aChar1 = arg1;
		local15.aLong29 = Static282.method3962();
		if (this.aClass30_Sub1_3 == null) {
			this.aClass30_Sub1_2 = local15;
		} else {
			this.aClass30_Sub1_3.aClass30_Sub1_1 = local15;
		}
		this.aClass30_Sub1_3 = local15;
	}

	@OriginalMember(owner = "client!vr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5492(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5487() {
		for (@Pc(8) Class30_Sub1 local8 = this.aClass30_Sub1_2; local8 != null; local8 = local8.aClass30_Sub1_1) {
			if (local8.anInt782 == 0) {
				if (local8.anInt781 >= 0) {
					local8.aBoolean77 = !this.aBooleanArray24[local8.anInt781];
				}
				this.aBooleanArray24[local8.anInt781] = true;
			} else if (local8.anInt782 == 1) {
				this.aBooleanArray24[local8.anInt781] = false;
			} else if (local8.anInt782 == -1) {
				for (@Pc(37) int local37 = 0; local37 < 112; local37++) {
					this.aBooleanArray24[local37] = false;
				}
			}
		}
		this.aClass30_Sub1_4 = this.aClass30_Sub1_2;
		this.aClass30_Sub1_3 = null;
		this.aClass30_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Lclient!ri;")
	@Override
	public Class30 method5483() {
		@Pc(8) Class30_Sub1 local8;
		for (local8 = this.aClass30_Sub1_4; local8 != null && local8.anInt782 == -1; local8 = local8.aClass30_Sub1_1) {
		}
		if (local8 == null) {
			this.aClass30_Sub1_4 = null;
		} else {
			this.aClass30_Sub1_4 = local8.aClass30_Sub1_1;
		}
		return local8;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5489(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray24[arg0] : false;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	@Override
	public void method5486() {
		this.method5496();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
	private void method5494(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && Static309.anIntArray373.length > local14) {
			local14 = Static309.anIntArray373[local14];
			if (arg1 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method5492(arg1, '\u0000', local14);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method5495(@OriginalArg(1) Component arg0) {
		this.method5496();
		this.aComponent3 = arg0;
		@Pc(16) Method local16 = Static98.aMethod1;
		if (local16 != null) {
			try {
				local16.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
	private void method5496() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray24[local22] = false;
		}
		this.aClass30_Sub1_2 = null;
		this.aClass30_Sub1_3 = null;
		this.aClass30_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!vr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!vr", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5494(arg0, 1);
	}

	@OriginalMember(owner = "client!vr", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static26.method521(local6)) {
			this.method5492(2, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vr", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5494(arg0, 0);
	}
}
