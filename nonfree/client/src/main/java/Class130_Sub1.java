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

@OriginalClass("client!ub")
public final class Class130_Sub1 extends Class130 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!uh;")
	private Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!uh;")
	private Class16_Sub1 aClass16_Sub1_2;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!uh;")
	private Class16_Sub1 aClass16_Sub1_3;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray31 = new boolean[112];

	static {
		new Class55("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class130_Sub1(@OriginalArg(0) Component arg0) {
		Static299.method3999();
		this.method5071(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5076(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!ub", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	private void method5070() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(27) int local27 = 0; local27 < 112; local27++) {
			this.aBooleanArray31[local27] = false;
		}
		this.aClass16_Sub1_1 = null;
		this.aClass16_Sub1_2 = null;
		this.aClass16_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method5071(@OriginalArg(0) Component arg0) {
		this.method5070();
		this.aComponent3 = arg0;
		@Pc(16) Method local16 = Static85.aMethod1;
		if (local16 != null) {
			try {
				local16.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method5064() {
		for (@Pc(12) Class16_Sub1 local12 = this.aClass16_Sub1_1; local12 != null; local12 = local12.aClass16_Sub1_4) {
			if (local12.anInt6430 == 0) {
				if (local12.anInt6436 >= 0) {
					local12.aBoolean416 = !this.aBooleanArray31[local12.anInt6436];
				}
				this.aBooleanArray31[local12.anInt6436] = true;
			} else if (local12.anInt6430 == 1) {
				this.aBooleanArray31[local12.anInt6436] = false;
			} else if (local12.anInt6430 == -1) {
				for (@Pc(63) int local63 = 0; local63 < 112; local63++) {
					this.aBooleanArray31[local63] = false;
				}
			}
		}
		this.aClass16_Sub1_3 = this.aClass16_Sub1_1;
		this.aClass16_Sub1_1 = null;
		this.aClass16_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!ub", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5075(arg0, 1);
	}

	@OriginalMember(owner = "client!ub", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5075(arg0, 0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method5069(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray31[arg0] : false;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	@Override
	public void method5066() {
		this.method5070();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)Lclient!as;")
	@Override
	public Class16 method5067() {
		@Pc(8) Class16_Sub1 local8;
		for (local8 = this.aClass16_Sub1_3; local8 != null && local8.anInt6430 == -1; local8 = local8.aClass16_Sub1_4) {
		}
		if (local8 == null) {
			this.aClass16_Sub1_3 = null;
		} else {
			this.aClass16_Sub1_3 = local8.aClass16_Sub1_4;
		}
		return local8;
	}

	@OriginalMember(owner = "client!ub", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static105.method1836(local6)) {
			this.method5076(2, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method5075(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static198.anIntArray316.length > local8) {
			local8 = Static198.anIntArray316[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method5076(arg1, '\u0000', local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ICIZ)V")
	private void method5076(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class16_Sub1 local7 = new Class16_Sub1();
		local7.anInt6436 = arg2;
		local7.aChar4 = arg1;
		local7.anInt6430 = arg0;
		local7.aLong204 = Static158.method2342();
		if (this.aClass16_Sub1_2 == null) {
			this.aClass16_Sub1_1 = local7;
		} else {
			this.aClass16_Sub1_2.aClass16_Sub1_4 = local7;
		}
		this.aClass16_Sub1_2 = local7;
	}
}
