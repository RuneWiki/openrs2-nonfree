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

@OriginalClass("client!oc")
public final class Class53_Sub1 extends Class53 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!am;")
	private final Class14 aClass14_30 = new Class14();

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "Lclient!am;")
	private final Class14 aClass14_31 = new Class14();

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray112 = new boolean[112];

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class53_Sub1(@OriginalArg(0) Component arg0) {
		Static277.method3741();
		this.method3920(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static266.method3682(local6)) {
			this.method3919(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3909() {
		this.aClass14_30.method204();
		for (@Pc(23) Class1_Sub38 local23 = (Class1_Sub38) this.aClass14_31.method202(); local23 != null; local23 = (Class1_Sub38) this.aClass14_31.method202()) {
			local23.anInt5542 = this.method3921();
			if (local23.anInt5547 == 0) {
				if (!this.aBooleanArray112[local23.anInt5540]) {
					@Pc(46) Class1_Sub38 local46 = new Class1_Sub38();
					local46.aChar5 = '\u0000';
					local46.anInt5542 = local23.anInt5542;
					local46.anInt5547 = 0;
					local46.aLong185 = local23.aLong185;
					local46.anInt5540 = local23.anInt5540;
					this.aClass14_30.method205(local46);
					this.aBooleanArray112[local23.anInt5540] = true;
				}
				local23.anInt5547 = 2;
				this.aClass14_30.method205(local23);
			} else if (local23.anInt5547 == 1) {
				if (this.aBooleanArray112[local23.anInt5540]) {
					this.aClass14_30.method205(local23);
					this.aBooleanArray112[local23.anInt5540] = false;
				}
			} else if (local23.anInt5547 == -1) {
				for (@Pc(127) int local127 = 0; local127 < 112; local127++) {
					if (this.aBooleanArray112[local127]) {
						@Pc(138) Class1_Sub38 local138 = new Class1_Sub38();
						local138.aLong185 = local23.aLong185;
						local138.anInt5547 = 1;
						local138.anInt5542 = local23.anInt5542;
						local138.aChar5 = '\u0000';
						local138.anInt5540 = local127;
						this.aClass14_30.method205(local138);
						this.aBooleanArray112[local127] = false;
					}
				}
			} else if (local23.anInt5547 == 3) {
				this.aClass14_30.method205(local23);
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Lclient!wo;")
	@Override
	public Interface13 method3908() {
		return (Interface13) this.aClass14_30.method202();
	}

	@OriginalMember(owner = "client!oc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3919('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
	private void method3915() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(25) int local25 = 0; local25 < 112; local25++) {
			this.aBooleanArray112[local25] = false;
		}
		this.aClass14_30.method204();
		this.aClass14_31.method204();
	}

	@OriginalMember(owner = "client!oc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3918(arg0, 0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;I)V")
	private void method3918(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static371.anIntArray451.length) {
			local8 = Static371.anIntArray451[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method3919('\u0000', local8, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3910(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray112[arg0] : false;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(CIII)V")
	private void method3919(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub38 local7 = new Class1_Sub38();
		local7.anInt5540 = arg1;
		local7.aChar5 = arg0;
		local7.anInt5547 = arg2;
		local7.aLong185 = Static183.method2674();
		this.aClass14_31.method205(local7);
	}

	@OriginalMember(owner = "client!oc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3918(arg0, 1);
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	@Override
	public void method3911() {
		this.method3915();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method3920(@OriginalArg(1) Component arg0) {
		this.method3915();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static289.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I")
	private int method3921() {
		@Pc(13) int local13 = 0;
		if (this.aBooleanArray112[81]) {
			local13 = 1;
		}
		if (this.aBooleanArray112[82]) {
			local13 |= 0x4;
		}
		if (this.aBooleanArray112[86]) {
			local13 |= 0x2;
		}
		return local13;
	}
}
