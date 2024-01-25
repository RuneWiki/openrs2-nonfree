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

@OriginalClass("client!jp")
public final class Class177_Sub1 extends Class177 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "Lclient!ae;")
	private final Class8 aClass8_25 = new Class8();

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "Lclient!ae;")
	private final Class8 aClass8_26 = new Class8();

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray24 = new boolean[112];

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class177_Sub1(@OriginalArg(0) Component arg0) {
		Static228.method3559();
		this.method4009(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I")
	private int method4007() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray24[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray24[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray24[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method4001(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray24[arg0] : false;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method4008(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static325.anIntArray685.length > local8) {
			local8 = Static325.anIntArray685[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4011(local8, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method4009(@OriginalArg(0) Component arg0) {
		this.method4010();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static464.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!jp", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4008(0, arg0);
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)V")
	@Override
	public void method4004() {
		this.method4010();
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	private void method4010() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray24[local22] = false;
		}
		this.aClass8_25.method220();
		this.aClass8_26.method220();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIC)V")
	private void method4011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class2_Sub30 local7 = new Class2_Sub30();
		local7.anInt6063 = arg0;
		local7.aChar2 = arg2;
		local7.anInt6066 = arg1;
		local7.aLong151 = Static548.method7437();
		this.aClass8_26.method212(local7);
	}

	@OriginalMember(owner = "client!jp", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4008(1, arg0);
	}

	@OriginalMember(owner = "client!jp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method4000() {
		this.aClass8_25.method220();
		for (@Pc(22) Class2_Sub30 local22 = (Class2_Sub30) this.aClass8_26.method217(); local22 != null; local22 = (Class2_Sub30) this.aClass8_26.method217()) {
			local22.anInt6061 = this.method4007();
			if (local22.anInt6066 == 0) {
				if (!this.aBooleanArray24[local22.anInt6063]) {
					@Pc(134) Class2_Sub30 local134 = new Class2_Sub30();
					local134.aLong151 = local22.aLong151;
					local134.aChar2 = '\u0000';
					local134.anInt6063 = local22.anInt6063;
					local134.anInt6061 = local22.anInt6061;
					local134.anInt6066 = 0;
					this.aClass8_25.method212(local134);
					this.aBooleanArray24[local22.anInt6063] = true;
				}
				local22.anInt6066 = 2;
				this.aClass8_25.method212(local22);
			} else if (local22.anInt6066 == 1) {
				if (this.aBooleanArray24[local22.anInt6063]) {
					this.aClass8_25.method212(local22);
					this.aBooleanArray24[local22.anInt6063] = false;
				}
			} else if (local22.anInt6066 == -1) {
				for (@Pc(59) int local59 = 0; local59 < 112; local59++) {
					if (this.aBooleanArray24[local59]) {
						@Pc(70) Class2_Sub30 local70 = new Class2_Sub30();
						local70.aLong151 = local22.aLong151;
						local70.anInt6061 = local22.anInt6061;
						local70.aChar2 = '\u0000';
						local70.anInt6066 = 1;
						local70.anInt6063 = local59;
						this.aClass8_25.method212(local70);
						this.aBooleanArray24[local59] = false;
					}
				}
			} else if (local22.anInt6066 == 3) {
				this.aClass8_25.method212(local22);
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4011(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!jp", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static191.method3210(local6)) {
			this.method4011(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(B)Lclient!au;")
	@Override
	public Interface2 method4006() {
		return (Interface2) this.aClass8_25.method217();
	}
}
