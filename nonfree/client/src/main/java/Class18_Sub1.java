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

@OriginalClass("client!qu")
public final class Class18_Sub1 extends Class18 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qu", name = "v", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "Lclient!fea;")
	private final Class99 aClass99_61 = new Class99();

	@OriginalMember(owner = "client!qu", name = "u", descriptor = "Lclient!fea;")
	private final Class99 aClass99_62 = new Class99();

	@OriginalMember(owner = "client!qu", name = "x", descriptor = "[Z")
	private final boolean[] aBooleanArray29 = new boolean[112];

	static {
		new Class40("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class18_Sub1(@OriginalArg(0) Component arg0) {
		Static418.method6025();
		this.method5982(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5981(arg0, 1);
	}

	@OriginalMember(owner = "client!qu", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5981(arg0, 0);
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V")
	private void method5979() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray29[local28] = false;
		}
		this.aClass99_61.method2524();
		this.aClass99_62.method2524();
	}

	@OriginalMember(owner = "client!qu", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static536.method7292(local6)) {
			this.method5980(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)Lclient!bs;")
	@Override
	public Interface1 method5974() {
		return (Interface1) this.aClass99_61.method2516();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	@Override
	public void method5978() {
		this.method5979();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IBCI)V")
	private void method5980(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class5_Sub31 local13 = new Class5_Sub31();
		local13.anInt6019 = arg2;
		local13.aChar3 = arg1;
		local13.anInt6027 = arg0;
		local13.aLong168 = Static105.method2132();
		this.aClass99_62.method2513(local13);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method5975() {
		this.aClass99_61.method2524();
		for (@Pc(15) Class5_Sub31 local15 = (Class5_Sub31) this.aClass99_62.method2516(); local15 != null; local15 = (Class5_Sub31) this.aClass99_62.method2516()) {
			local15.anInt6022 = this.method5983();
			if (local15.anInt6019 == 0) {
				if (!this.aBooleanArray29[local15.anInt6027]) {
					@Pc(38) Class5_Sub31 local38 = new Class5_Sub31();
					local38.anInt6022 = local15.anInt6022;
					local38.anInt6027 = local15.anInt6027;
					local38.anInt6019 = 0;
					local38.aLong168 = local15.aLong168;
					local38.aChar3 = '\u0000';
					this.aClass99_61.method2513(local38);
					this.aBooleanArray29[local15.anInt6027] = true;
				}
				local15.anInt6019 = 2;
				this.aClass99_61.method2513(local15);
			} else if (local15.anInt6019 == 1) {
				if (this.aBooleanArray29[local15.anInt6027]) {
					this.aClass99_61.method2513(local15);
					this.aBooleanArray29[local15.anInt6027] = false;
				}
			} else if (local15.anInt6019 == -1) {
				for (@Pc(101) int local101 = 0; local101 < 112; local101++) {
					if (this.aBooleanArray29[local101]) {
						@Pc(112) Class5_Sub31 local112 = new Class5_Sub31();
						local112.aLong168 = local15.aLong168;
						local112.anInt6027 = local101;
						local112.aChar3 = '\u0000';
						local112.anInt6019 = 1;
						local112.anInt6022 = local15.anInt6022;
						this.aClass99_61.method2513(local112);
						this.aBooleanArray29[local101] = false;
					}
				}
			} else if (local15.anInt6019 == 3) {
				this.aClass99_61.method2513(local15);
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5980(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IZ)V")
	private void method5981(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0.getKeyCode();
		if (local13 == 0) {
			local13 = 0;
		} else if (local13 >= 0 && Static169.anIntArray251.length > local13) {
			local13 = Static169.anIntArray251[local13];
			if (arg1 == 0 && (local13 & 0x80) != 0) {
				local13 = 0;
			} else {
				local13 &= 0xFFFFFF7F;
			}
		} else {
			local13 = 0;
		}
		if (local13 != 0) {
			this.method5980(local13, '\u0000', arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method5982(@OriginalArg(0) Component arg0) {
		this.method5979();
		this.aComponent2 = arg0;
		@Pc(15) Method local15 = Static9.aMethod1;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)I")
	private int method5983() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray29[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray29[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray29[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method5977(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray29[arg0] : false;
	}
}
