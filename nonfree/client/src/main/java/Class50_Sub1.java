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

@OriginalClass("client!rq")
public final class Class50_Sub1 extends Class50 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "Lclient!sja;")
	private final Class342 aClass342_69 = new Class342();

	@OriginalMember(owner = "client!rq", name = "C", descriptor = "Lclient!sja;")
	private final Class342 aClass342_70 = new Class342();

	@OriginalMember(owner = "client!rq", name = "s", descriptor = "[Z")
	private final boolean[] aBooleanArray22 = new boolean[112];

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class50_Sub1(@OriginalArg(0) Component arg0) {
		Static597.method7695();
		this.method7408(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)I")
	private int method7401() {
		@Pc(13) int local13 = 0;
		if (this.aBooleanArray22[81]) {
			local13 = 1;
		}
		if (this.aBooleanArray22[82]) {
			local13 |= 0x4;
		}
		if (this.aBooleanArray22[86]) {
			local13 |= 0x2;
		}
		return local13;
	}

	@OriginalMember(owner = "client!rq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method7402(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIC)V")
	private void method7402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class3_Sub37 local7 = new Class3_Sub37();
		local7.anInt5674 = arg1;
		local7.aChar2 = arg2;
		local7.anInt5671 = arg0;
		local7.aLong195 = Static517.method6965();
		this.aClass342_70.method7654(local7);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7398() {
		this.aClass342_69.method7655();
		for (@Pc(15) Class3_Sub37 local15 = (Class3_Sub37) this.aClass342_70.method7653(); local15 != null; local15 = (Class3_Sub37) this.aClass342_70.method7653()) {
			local15.anInt5668 = this.method7401();
			if (local15.anInt5674 == 0) {
				if (!this.aBooleanArray22[local15.anInt5671]) {
					@Pc(39) Class3_Sub37 local39 = new Class3_Sub37();
					local39.anInt5674 = 0;
					local39.anInt5671 = local15.anInt5671;
					local39.anInt5668 = local15.anInt5668;
					local39.aChar2 = '\u0000';
					local39.aLong195 = local15.aLong195;
					this.aClass342_69.method7654(local39);
					this.aBooleanArray22[local15.anInt5671] = true;
				}
				local15.anInt5674 = 2;
				this.aClass342_69.method7654(local15);
			} else if (local15.anInt5674 == 1) {
				if (this.aBooleanArray22[local15.anInt5671]) {
					this.aClass342_69.method7654(local15);
					this.aBooleanArray22[local15.anInt5671] = false;
				}
			} else if (local15.anInt5674 == -1) {
				for (@Pc(93) int local93 = 0; local93 < 112; local93++) {
					if (this.aBooleanArray22[local93]) {
						@Pc(106) Class3_Sub37 local106 = new Class3_Sub37();
						local106.anInt5668 = local15.anInt5668;
						local106.anInt5671 = local93;
						local106.anInt5674 = 1;
						local106.aChar2 = '\u0000';
						local106.aLong195 = local15.aLong195;
						this.aClass342_69.method7654(local106);
						this.aBooleanArray22[local93] = false;
					}
				}
			} else if (local15.anInt5674 == 3) {
				this.aClass342_69.method7654(local15);
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	@Override
	public void method7395() {
		this.method7405();
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)Lclient!wo;")
	@Override
	public Interface26 method7397() {
		return (Interface26) this.aClass342_69.method7653();
	}

	@OriginalMember(owner = "client!rq", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static654.method8579(local6)) {
			this.method7402(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rq", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method7404(0, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method7404(1, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method7404(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static463.anIntArray539.length) {
			local8 = Static463.anIntArray539[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method7402(local8, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)V")
	private void method7405() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(23) int local23 = 0; local23 < 112; local23++) {
			this.aBooleanArray22[local23] = false;
		}
		this.aClass342_69.method7655();
		this.aClass342_70.method7655();
	}

	@OriginalMember(owner = "client!rq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method7408(@OriginalArg(0) Component arg0) {
		this.method7405();
		this.aComponent4 = arg0;
		@Pc(11) Method local11 = Static60.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7394(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray22[arg0] : false;
	}
}
