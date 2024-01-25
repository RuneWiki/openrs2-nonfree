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

@OriginalClass("client!lm")
public final class Class154_Sub1 extends Class154 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "Lclient!qw;")
	private final Class302 aClass302_37 = new Class302();

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "Lclient!qw;")
	private final Class302 aClass302_38 = new Class302();

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "[Z")
	private final boolean[] aBooleanArray18 = new boolean[112];

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class154_Sub1(@OriginalArg(0) Component arg0) {
		Static234.method3517();
		this.method5027(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	@Override
	public void method5016() {
		this.method5026();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)I")
	private int method5018() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray18[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray18[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray18[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!lm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static55.method1046(local6)) {
			this.method5021(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5011() {
		this.aClass302_37.method6614();
		for (@Pc(15) Class3_Sub22 local15 = (Class3_Sub22) this.aClass302_38.method6611(); local15 != null; local15 = (Class3_Sub22) this.aClass302_38.method6611()) {
			local15.anInt3543 = this.method5018();
			if (local15.anInt3540 == 0) {
				if (!this.aBooleanArray18[local15.anInt3534]) {
					@Pc(43) Class3_Sub22 local43 = new Class3_Sub22();
					local43.aLong94 = local15.aLong94;
					local43.anInt3543 = local15.anInt3543;
					local43.anInt3540 = 0;
					local43.anInt3534 = local15.anInt3534;
					local43.aChar4 = '\u0000';
					this.aClass302_37.method6613(local43);
					this.aBooleanArray18[local15.anInt3534] = true;
				}
				local15.anInt3540 = 2;
				this.aClass302_37.method6613(local15);
			} else if (local15.anInt3540 == 1) {
				if (this.aBooleanArray18[local15.anInt3534]) {
					this.aClass302_37.method6613(local15);
					this.aBooleanArray18[local15.anInt3534] = false;
				}
			} else if (local15.anInt3540 == -1) {
				for (@Pc(108) int local108 = 0; local108 < 112; local108++) {
					if (this.aBooleanArray18[local108]) {
						@Pc(119) Class3_Sub22 local119 = new Class3_Sub22();
						local119.anInt3543 = local15.anInt3543;
						local119.anInt3540 = 1;
						local119.anInt3534 = local108;
						local119.aLong94 = local15.aLong94;
						local119.aChar4 = '\u0000';
						this.aClass302_37.method6613(local119);
						this.aBooleanArray18[local108] = false;
					}
				}
			} else if (local15.anInt3540 == 3) {
				this.aClass302_37.method6613(local15);
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method5020(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static293.anIntArray482.length) {
			local8 = Static293.anIntArray482[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method5021(local8, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BICI)V")
	private void method5021(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub22 local7 = new Class3_Sub22();
		local7.anInt3540 = arg2;
		local7.aChar4 = arg1;
		local7.anInt3534 = arg0;
		local7.aLong94 = Static15.method380();
		this.aClass302_38.method6613(local7);
	}

	@OriginalMember(owner = "client!lm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5021(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5014(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray18[arg0] : false;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V")
	private void method5026() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray18[local28] = false;
		}
		this.aClass302_37.method6614();
		this.aClass302_38.method6614();
	}

	@OriginalMember(owner = "client!lm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5020(1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Lclient!oea;")
	@Override
	public Interface18 method5012() {
		return (Interface18) this.aClass302_37.method6611();
	}

	@OriginalMember(owner = "client!lm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5020(0, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method5027(@OriginalArg(0) Component arg0) {
		this.method5026();
		this.aComponent2 = arg0;
		@Pc(15) Method local15 = Static126.aMethod2;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}
}
