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

@OriginalClass("client!ql")
public final class Class171_Sub1 extends Class171 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "Lclient!hk;")
	private Class85_Sub1 aClass85_Sub1_2;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "Lclient!hk;")
	private Class85_Sub1 aClass85_Sub1_3;

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "Lclient!hk;")
	private Class85_Sub1 aClass85_Sub1_4;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "[Z")
	private final boolean[] aBooleanArray25 = new boolean[112];

	static {
		new Class34("clan_chat", "clanchat", "conversation_clan", "clan_chat");
		new Class34("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class171_Sub1(@OriginalArg(0) Component arg0) {
		Static97.method4764();
		this.method4641(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4638(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray25[arg0] : false;
	}

	@OriginalMember(owner = "client!ql", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4643('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method4641(@OriginalArg(0) Component arg0) {
		this.method4645();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static207.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
	@Override
	public void method4637() {
		this.method4645();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method4642(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static335.anIntArray515.length > local8) {
			local8 = Static335.anIntArray515[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4643('\u0000', arg1, local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ql", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4642(arg0, 1);
	}

	@OriginalMember(owner = "client!ql", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static72.method1687(local6)) {
			this.method4643(local6, 2, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ql", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4642(arg0, 0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ICII)V")
	private void method4643(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class85_Sub1 local7 = new Class85_Sub1();
		local7.aChar4 = arg0;
		local7.anInt2645 = arg2;
		local7.anInt2639 = arg1;
		local7.aLong88 = Static162.method3252();
		if (this.aClass85_Sub1_2 == null) {
			this.aClass85_Sub1_3 = local7;
		} else {
			this.aClass85_Sub1_2.aClass85_Sub1_1 = local7;
		}
		this.aClass85_Sub1_2 = local7;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Lclient!hn;")
	@Override
	public Class85 method4633() {
		@Pc(14) Class85_Sub1 local14;
		for (local14 = this.aClass85_Sub1_4; local14 != null && local14.anInt2639 == -1; local14 = local14.aClass85_Sub1_1) {
		}
		if (local14 == null) {
			this.aClass85_Sub1_4 = null;
		} else {
			this.aClass85_Sub1_4 = local14.aClass85_Sub1_1;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4640() {
		for (@Pc(8) Class85_Sub1 local8 = this.aClass85_Sub1_3; local8 != null; local8 = local8.aClass85_Sub1_1) {
			if (local8.anInt2639 == 0) {
				if (local8.anInt2645 >= 0) {
					local8.aBoolean256 = !this.aBooleanArray25[local8.anInt2645];
				}
				this.aBooleanArray25[local8.anInt2645] = true;
			} else if (local8.anInt2639 == 1) {
				this.aBooleanArray25[local8.anInt2645] = false;
			} else if (local8.anInt2639 == -1) {
				for (@Pc(23) int local23 = 0; local23 < 112; local23++) {
					this.aBooleanArray25[local23] = false;
				}
			}
		}
		this.aClass85_Sub1_4 = this.aClass85_Sub1_3;
		this.aClass85_Sub1_3 = null;
		this.aClass85_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
	private void method4645() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray25[local28] = false;
		}
		this.aClass85_Sub1_2 = null;
		this.aClass85_Sub1_3 = null;
		this.aClass85_Sub1_4 = null;
	}
}
