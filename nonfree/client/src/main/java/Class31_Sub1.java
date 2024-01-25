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

@OriginalClass("client!bi")
public final class Class31_Sub1 extends Class31 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "Lclient!wo;")
	private final Class361 aClass361_22 = new Class361();

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "Lclient!wo;")
	private final Class361 aClass361_23 = new Class361();

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "[Z")
	private final boolean[] aBooleanArray2 = new boolean[112];

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class31_Sub1(@OriginalArg(0) Component arg0) {
		Static32.method782();
		this.method991(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method991(@OriginalArg(1) Component arg0) {
		this.method993();
		this.aComponent1 = arg0;
		@Pc(13) Method local13 = Static162.aMethod2;
		if (local13 != null) {
			try {
				local13.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(28) Throwable local28) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(CIII)V")
	private void method992(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub41 local7 = new Class1_Sub41();
		local7.anInt7860 = arg1;
		local7.aChar5 = arg0;
		local7.anInt7861 = arg2;
		local7.aLong345 = Static255.method4035();
		this.aClass361_23.method7855(local7);
	}

	@OriginalMember(owner = "client!bi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method994(0, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
	private void method993() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray2[local22] = false;
		}
		this.aClass361_22.method7860();
		this.aClass361_23.method7860();
	}

	@OriginalMember(owner = "client!bi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static424.method5937(local6)) {
			this.method992(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method989() {
		this.aClass361_22.method7860();
		for (@Pc(22) Class1_Sub41 local22 = (Class1_Sub41) this.aClass361_23.method7850(); local22 != null; local22 = (Class1_Sub41) this.aClass361_23.method7850()) {
			local22.anInt7862 = this.method996();
			if (local22.anInt7861 == 0) {
				if (!this.aBooleanArray2[local22.anInt7860]) {
					@Pc(131) Class1_Sub41 local131 = new Class1_Sub41();
					local131.aChar5 = '\u0000';
					local131.anInt7860 = local22.anInt7860;
					local131.anInt7861 = 0;
					local131.aLong345 = local22.aLong345;
					local131.anInt7862 = local22.anInt7862;
					this.aClass361_22.method7855(local131);
					this.aBooleanArray2[local22.anInt7860] = true;
				}
				local22.anInt7861 = 2;
				this.aClass361_22.method7855(local22);
			} else if (local22.anInt7861 == 1) {
				if (this.aBooleanArray2[local22.anInt7860]) {
					this.aClass361_22.method7855(local22);
					this.aBooleanArray2[local22.anInt7860] = false;
				}
			} else if (local22.anInt7861 == -1) {
				for (@Pc(56) int local56 = 0; local56 < 112; local56++) {
					if (this.aBooleanArray2[local56]) {
						@Pc(67) Class1_Sub41 local67 = new Class1_Sub41();
						local67.aLong345 = local22.aLong345;
						local67.aChar5 = '\u0000';
						local67.anInt7860 = local56;
						local67.anInt7862 = local22.anInt7862;
						local67.anInt7861 = 1;
						this.aClass361_22.method7855(local67);
						this.aBooleanArray2[local56] = false;
					}
				}
			} else if (local22.anInt7861 == 3) {
				this.aClass361_22.method7855(local22);
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method985(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray2[arg0] : false;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBLjava/awt/event/KeyEvent;)V")
	private void method994(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(16) int local16 = arg1.getKeyCode();
		if (local16 == 0) {
			local16 = 0;
		} else if (local16 >= 0 && local16 < Static564.anIntArray618.length) {
			local16 = Static564.anIntArray618[local16];
			if (arg0 == 0 && (local16 & 0x80) != 0) {
				local16 = 0;
			} else {
				local16 &= 0xFFFFFF7F;
			}
		} else {
			local16 = 0;
		}
		if (local16 != 0) {
			this.method992('\u0000', local16, arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!bi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method994(1, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)I")
	private int method996() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray2[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray2[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray2[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	@Override
	public void method984() {
		this.method993();
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Lclient!tea;")
	@Override
	public Interface21 method990() {
		return (Interface21) this.aClass361_22.method7850();
	}

	@OriginalMember(owner = "client!bi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method992('\u0000', 0, -1);
	}
}
