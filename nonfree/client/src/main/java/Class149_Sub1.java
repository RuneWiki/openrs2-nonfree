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

@OriginalClass("client!mj")
public final class Class149_Sub1 extends Class149 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!mb;")
	private Class15_Sub1 aClass15_Sub1_2;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "Lclient!mb;")
	private Class15_Sub1 aClass15_Sub1_3;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "Lclient!mb;")
	private Class15_Sub1 aClass15_Sub1_4;

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "[Z")
	private final boolean[] aBooleanArray92 = new boolean[112];

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class149_Sub1(@OriginalArg(0) Component arg0) {
		Static248.method3978();
		this.method3689(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3692(-1, 0, '\u0000');
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3689(@OriginalArg(0) Component arg0) {
		this.method3691();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static65.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!mj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
	@Override
	public void method3682() {
		this.method3691();
	}

	@OriginalMember(owner = "client!mj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3690(arg0, 1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Lclient!au;")
	@Override
	public Class15 method3683() {
		@Pc(14) Class15_Sub1 local14;
		for (local14 = this.aClass15_Sub1_2; local14 != null && local14.anInt3915 == -1; local14 = local14.aClass15_Sub1_1) {
		}
		if (local14 == null) {
			this.aClass15_Sub1_2 = null;
		} else {
			this.aClass15_Sub1_2 = local14.aClass15_Sub1_1;
		}
		return local14;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3685(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray92[arg0] : false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method3690(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static325.anIntArray701.length > local8) {
			local8 = Static325.anIntArray701[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method3692(arg1, local8, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	private void method3691() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(30) int local30 = 0; local30 < 112; local30++) {
			this.aBooleanArray92[local30] = false;
		}
		this.aClass15_Sub1_4 = null;
		this.aClass15_Sub1_2 = null;
		this.aClass15_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIC)V")
	private void method3692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class15_Sub1 local7 = new Class15_Sub1();
		local7.anInt3915 = arg0;
		local7.anInt3921 = arg1;
		local7.aChar5 = arg2;
		local7.aLong131 = Static51.method979();
		if (this.aClass15_Sub1_3 == null) {
			this.aClass15_Sub1_4 = local7;
		} else {
			this.aClass15_Sub1_3.aClass15_Sub1_1 = local7;
		}
		this.aClass15_Sub1_3 = local7;
	}

	@OriginalMember(owner = "client!mj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static183.method2984(local6)) {
			this.method3692(2, -1, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3690(arg0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3684() {
		for (@Pc(15) Class15_Sub1 local15 = this.aClass15_Sub1_4; local15 != null; local15 = local15.aClass15_Sub1_1) {
			if (local15.anInt3915 == 0) {
				if (local15.anInt3921 >= 0) {
					local15.aBoolean292 = !this.aBooleanArray92[local15.anInt3921];
				}
				this.aBooleanArray92[local15.anInt3921] = true;
			} else if (local15.anInt3915 == 1) {
				this.aBooleanArray92[local15.anInt3921] = false;
			} else if (local15.anInt3915 == -1) {
				for (@Pc(43) int local43 = 0; local43 < 112; local43++) {
					this.aBooleanArray92[local43] = false;
				}
			}
		}
		this.aClass15_Sub1_2 = this.aClass15_Sub1_4;
		this.aClass15_Sub1_3 = null;
		this.aClass15_Sub1_4 = null;
	}
}
