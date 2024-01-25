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

@OriginalClass("client!kh")
public final class Class102_Sub1 extends Class102 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_27 = new Class163();

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_28 = new Class163();

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "[Z")
	private final boolean[] aBooleanArray10 = new boolean[112];

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class102_Sub1(@OriginalArg(0) Component arg0) {
		Static295.method4179();
		this.method4314(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method4314(@OriginalArg(1) Component arg0) {
		this.method4321();
		this.aComponent4 = arg0;
		@Pc(19) Method local19 = Static332.aMethod2;
		if (local19 != null) {
			try {
				local19.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)I")
	private int method4316() {
		@Pc(12) int local12 = 0;
		if (this.aBooleanArray10[81]) {
			local12 = 1;
		}
		if (this.aBooleanArray10[82]) {
			local12 |= 0x4;
		}
		if (this.aBooleanArray10[86]) {
			local12 |= 0x2;
		}
		return local12;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Lclient!waa;")
	@Override
	public Interface26 method4307() {
		return (Interface26) this.aClass163_27.method3644();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method4310() {
		this.aClass163_27.method3643();
		for (@Pc(23) Class4_Sub44 local23 = (Class4_Sub44) this.aClass163_28.method3644(); local23 != null; local23 = (Class4_Sub44) this.aClass163_28.method3644()) {
			local23.anInt8229 = this.method4316();
			if (local23.anInt8217 == 0) {
				if (!this.aBooleanArray10[local23.anInt8230]) {
					@Pc(46) Class4_Sub44 local46 = new Class4_Sub44();
					local46.aLong246 = local23.aLong246;
					local46.aChar3 = '\u0000';
					local46.anInt8229 = local23.anInt8229;
					local46.anInt8230 = local23.anInt8230;
					local46.anInt8217 = 0;
					this.aClass163_27.method3646(local46);
					this.aBooleanArray10[local23.anInt8230] = true;
				}
				local23.anInt8217 = 2;
				this.aClass163_27.method3646(local23);
			} else if (local23.anInt8217 == 1) {
				if (this.aBooleanArray10[local23.anInt8230]) {
					this.aClass163_27.method3646(local23);
					this.aBooleanArray10[local23.anInt8230] = false;
				}
			} else if (local23.anInt8217 == -1) {
				for (@Pc(109) int local109 = 0; local109 < 112; local109++) {
					if (this.aBooleanArray10[local109]) {
						@Pc(120) Class4_Sub44 local120 = new Class4_Sub44();
						local120.anInt8217 = 1;
						local120.anInt8229 = local23.anInt8229;
						local120.aLong246 = local23.aLong246;
						local120.anInt8230 = local109;
						local120.aChar3 = '\u0000';
						this.aClass163_27.method3646(local120);
						this.aBooleanArray10[local109] = false;
					}
				}
			} else if (local23.anInt8217 == 3) {
				this.aClass163_27.method3646(local23);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	@Override
	public void method4312() {
		this.method4321();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(CIIB)V")
	private void method4318(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub44 local7 = new Class4_Sub44();
		local7.anInt8217 = arg1;
		local7.anInt8230 = arg2;
		local7.aChar3 = arg0;
		local7.aLong246 = Static429.method5935();
		this.aClass163_28.method3646(local7);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4311(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray10[arg0] : false;
	}

	@OriginalMember(owner = "client!kh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V")
	private void method4321() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray10[local26] = false;
		}
		this.aClass163_27.method3643();
		this.aClass163_28.method3643();
	}

	@OriginalMember(owner = "client!kh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4322(arg0, 0);
	}

	@OriginalMember(owner = "client!kh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4318('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
	private void method4322(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static23.anIntArray45.length > local8) {
			local8 = Static23.anIntArray45[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4318('\u0000', arg1, local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4322(arg0, 1);
	}

	@OriginalMember(owner = "client!kh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static209.method3122(local6)) {
			this.method4318(local6, 3, -1);
			arg0.consume();
		}
	}
}
