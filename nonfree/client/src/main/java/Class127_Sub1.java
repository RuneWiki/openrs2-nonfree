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

@OriginalClass("client!he")
public final class Class127_Sub1 extends Class127 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Lclient!hga;")
	private final Class130 aClass130_16 = new Class130();

	@OriginalMember(owner = "client!he", name = "t", descriptor = "Lclient!hga;")
	private final Class130 aClass130_17 = new Class130();

	@OriginalMember(owner = "client!he", name = "D", descriptor = "[Z")
	private final boolean[] aBooleanArray12 = new boolean[112];

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class127_Sub1(@OriginalArg(0) Component arg0) {
		Static464.method6432();
		this.method3285(arg0);
	}

	@OriginalMember(owner = "client!he", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static165.method2915(local6)) {
			this.method3282(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method3276(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray12[arg0] : false;
	}

	@OriginalMember(owner = "client!he", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3278(arg0, 1);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method3278(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.getKeyCode();
		if (local12 == 0) {
			local12 = 0;
		} else if (local12 >= 0 && Static143.anIntArray630.length > local12) {
			local12 = Static143.anIntArray630[local12];
			if (arg1 == 0 && (local12 & 0x80) != 0) {
				local12 = 0;
			} else {
				local12 &= 0xFFFFFF7F;
			}
		} else {
			local12 = 0;
		}
		if (local12 != 0) {
			this.method3282(arg1, '\u0000', local12);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!he", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3278(arg0, 0);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	private void method3281() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray12[local22] = false;
		}
		this.aClass130_16.method3541();
		this.aClass130_17.method3541();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IICI)V")
	private void method3282(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub33 local7 = new Class3_Sub33();
		local7.anInt5997 = arg2;
		local7.anInt5992 = arg0;
		local7.aChar5 = arg1;
		local7.aLong170 = Static587.method7753();
		this.aClass130_17.method3548(local7);
	}

	@OriginalMember(owner = "client!he", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3282(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	@Override
	public void method3273() {
		this.method3281();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Lclient!nr;")
	@Override
	public Interface16 method3271() {
		return (Interface16) this.aClass130_16.method3545();
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
	private int method3284() {
		@Pc(11) int local11 = 0;
		if (this.aBooleanArray12[81]) {
			local11 = 1;
		}
		if (this.aBooleanArray12[82]) {
			local11 |= 0x4;
		}
		if (this.aBooleanArray12[86]) {
			local11 |= 0x2;
		}
		return local11;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3275() {
		this.aClass130_16.method3541();
		for (@Pc(15) Class3_Sub33 local15 = (Class3_Sub33) this.aClass130_17.method3545(); local15 != null; local15 = (Class3_Sub33) this.aClass130_17.method3545()) {
			local15.anInt5989 = this.method3284();
			if (local15.anInt5992 == 0) {
				if (!this.aBooleanArray12[local15.anInt5997]) {
					@Pc(35) Class3_Sub33 local35 = new Class3_Sub33();
					local35.anInt5989 = local15.anInt5989;
					local35.aChar5 = '\u0000';
					local35.anInt5997 = local15.anInt5997;
					local35.aLong170 = local15.aLong170;
					local35.anInt5992 = 0;
					this.aClass130_16.method3548(local35);
					this.aBooleanArray12[local15.anInt5997] = true;
				}
				local15.anInt5992 = 2;
				this.aClass130_16.method3548(local15);
			} else if (local15.anInt5992 == 1) {
				if (this.aBooleanArray12[local15.anInt5997]) {
					this.aClass130_16.method3548(local15);
					this.aBooleanArray12[local15.anInt5997] = false;
				}
			} else if (local15.anInt5992 == -1) {
				for (@Pc(103) int local103 = 0; local103 < 112; local103++) {
					if (this.aBooleanArray12[local103]) {
						@Pc(114) Class3_Sub33 local114 = new Class3_Sub33();
						local114.anInt5992 = 1;
						local114.aChar5 = '\u0000';
						local114.anInt5997 = local103;
						local114.aLong170 = local15.aLong170;
						local114.anInt5989 = local15.anInt5989;
						this.aClass130_16.method3548(local114);
						this.aBooleanArray12[local103] = false;
					}
				}
			} else if (local15.anInt5992 == 3) {
				this.aClass130_16.method3548(local15);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method3285(@OriginalArg(0) Component arg0) {
		this.method3281();
		this.aComponent1 = arg0;
		@Pc(15) Method local15 = Static342.aMethod2;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!he", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
