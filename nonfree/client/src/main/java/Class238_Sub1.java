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

@OriginalClass("client!qn")
public final class Class238_Sub1 extends Class238 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Lclient!qia;")
	private final Class276 aClass276_51 = new Class276();

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "Lclient!qia;")
	private final Class276 aClass276_52 = new Class276();

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray19 = new boolean[112];

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class238_Sub1(@OriginalArg(0) Component arg0) {
		Static29.method568();
		this.method6953(arg0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method6953(@OriginalArg(1) Component arg0) {
		this.method6955();
		this.aComponent5 = arg0;
		@Pc(20) Method local20 = Static372.aMethod1;
		if (local20 != null) {
			try {
				local20.invoke(this.aComponent5, Boolean.FALSE);
			} catch (@Pc(35) Throwable local35) {
			}
		}
		this.aComponent5.addKeyListener(this);
		this.aComponent5.addFocusListener(this);
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
	private void method6955() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeKeyListener(this);
		this.aComponent5.removeFocusListener(this);
		this.aComponent5 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray19[local26] = false;
		}
		this.aClass276_51.method6910();
		this.aClass276_52.method6910();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Lclient!jfa;")
	@Override
	public Interface13 method6949() {
		return (Interface13) this.aClass276_51.method6911();
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method6951() {
		this.aClass276_51.method6910();
		for (@Pc(22) Class3_Sub9 local22 = (Class3_Sub9) this.aClass276_52.method6911(); local22 != null; local22 = (Class3_Sub9) this.aClass276_52.method6911()) {
			local22.anInt725 = this.method6956();
			if (local22.anInt717 == 0) {
				if (!this.aBooleanArray19[local22.anInt720]) {
					@Pc(45) Class3_Sub9 local45 = new Class3_Sub9();
					local45.aChar1 = '\u0000';
					local45.aLong23 = local22.aLong23;
					local45.anInt725 = local22.anInt725;
					local45.anInt717 = 0;
					local45.anInt720 = local22.anInt720;
					this.aClass276_51.method6906(local45);
					this.aBooleanArray19[local22.anInt720] = true;
				}
				local22.anInt717 = 2;
				this.aClass276_51.method6906(local22);
			} else if (local22.anInt717 == 1) {
				if (this.aBooleanArray19[local22.anInt720]) {
					this.aClass276_51.method6906(local22);
					this.aBooleanArray19[local22.anInt720] = false;
				}
			} else if (local22.anInt717 == -1) {
				for (@Pc(106) int local106 = 0; local106 < 112; local106++) {
					if (this.aBooleanArray19[local106]) {
						@Pc(117) Class3_Sub9 local117 = new Class3_Sub9();
						local117.aChar1 = '\u0000';
						local117.aLong23 = local22.aLong23;
						local117.anInt725 = local22.anInt725;
						local117.anInt717 = 1;
						local117.anInt720 = local106;
						this.aClass276_51.method6906(local117);
						this.aBooleanArray19[local106] = false;
					}
				}
			} else if (local22.anInt717 == 3) {
				this.aClass276_51.method6906(local22);
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static322.method5437(local6)) {
			this.method6958(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6959(1, arg0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
	private int method6956() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray19[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray19[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray19[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6958(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBCI)V")
	private void method6958(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub9 local7 = new Class3_Sub9();
		local7.anInt717 = arg2;
		local7.aChar1 = arg1;
		local7.anInt720 = arg0;
		local7.aLong23 = Static444.method6719();
		this.aClass276_52.method6906(local7);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(12) int local12 = arg1.getKeyCode();
		if (local12 == 0) {
			local12 = 0;
		} else if (local12 >= 0 && Static379.anIntArray436.length > local12) {
			local12 = Static379.anIntArray436[local12];
			if (arg0 == 0 && (local12 & 0x80) != 0) {
				local12 = 0;
			} else {
				local12 &= 0xFFFFFF7F;
			}
		} else {
			local12 = 0;
		}
		if (local12 != 0) {
			this.method6958(local12, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6948(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray19[arg0] : false;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	@Override
	public void method6950() {
		this.method6955();
	}

	@OriginalMember(owner = "client!qn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6959(0, arg0);
	}
}
