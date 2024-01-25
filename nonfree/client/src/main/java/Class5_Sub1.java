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

@OriginalClass("client!ac")
public final class Class5_Sub1 extends Class5 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!dm;")
	private final Class73 aClass73_4 = new Class73();

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "Lclient!dm;")
	private final Class73 aClass73_5 = new Class73();

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "[Z")
	private final boolean[] aBooleanArray3 = new boolean[112];

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class5_Sub1(@OriginalArg(0) Component arg0) {
		Static77.method1680();
		this.method215(arg0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method215(@OriginalArg(1) Component arg0) {
		this.method219();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static92.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method211(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray3[arg0] : false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)I")
	private int method216() {
		@Pc(11) int local11 = 0;
		if (this.aBooleanArray3[81]) {
			local11 = 1;
		}
		if (this.aBooleanArray3[82]) {
			local11 |= 0x4;
		}
		if (this.aBooleanArray3[86]) {
			local11 |= 0x2;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BCII)V")
	private void method217(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class12_Sub44 local7 = new Class12_Sub44();
		local7.aChar2 = arg0;
		local7.anInt8035 = arg2;
		local7.anInt8038 = arg1;
		local7.aLong202 = Static76.method1679();
		this.aClass73_5.method2012(local7);
	}

	@OriginalMember(owner = "client!ac", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Interface1 method210() {
		return (Interface1) this.aClass73_4.method2008();
	}

	@OriginalMember(owner = "client!ac", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method217('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!ac", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method220(0, arg0);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
	private void method219() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray3[local22] = false;
		}
		this.aClass73_4.method2014();
		this.aClass73_5.method2014();
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	@Override
	public void method213() {
		this.method219();
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method214() {
		this.aClass73_4.method2014();
		for (@Pc(15) Class12_Sub44 local15 = (Class12_Sub44) this.aClass73_5.method2008(); local15 != null; local15 = (Class12_Sub44) this.aClass73_5.method2008()) {
			local15.anInt8031 = this.method216();
			if (local15.anInt8038 == 0) {
				if (!this.aBooleanArray3[local15.anInt8035]) {
					@Pc(132) Class12_Sub44 local132 = new Class12_Sub44();
					local132.anInt8031 = local15.anInt8031;
					local132.anInt8038 = 0;
					local132.aChar2 = '\u0000';
					local132.aLong202 = local15.aLong202;
					local132.anInt8035 = local15.anInt8035;
					this.aClass73_4.method2012(local132);
					this.aBooleanArray3[local15.anInt8035] = true;
				}
				local15.anInt8038 = 2;
				this.aClass73_4.method2012(local15);
			} else if (local15.anInt8038 == 1) {
				if (this.aBooleanArray3[local15.anInt8035]) {
					this.aClass73_4.method2012(local15);
					this.aBooleanArray3[local15.anInt8035] = false;
				}
			} else if (local15.anInt8038 == -1) {
				for (@Pc(46) int local46 = 0; local46 < 112; local46++) {
					if (this.aBooleanArray3[local46]) {
						@Pc(57) Class12_Sub44 local57 = new Class12_Sub44();
						local57.anInt8031 = local15.anInt8031;
						local57.aChar2 = '\u0000';
						local57.anInt8035 = local46;
						local57.aLong202 = local15.aLong202;
						local57.anInt8038 = 1;
						this.aClass73_4.method2012(local57);
						this.aBooleanArray3[local46] = false;
					}
				}
			} else if (local15.anInt8038 == 3) {
				this.aClass73_4.method2012(local15);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method220(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static466.anIntArray634.length) {
			local8 = Static466.anIntArray634[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method217('\u0000', arg0, local8);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!ac", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method220(1, arg0);
	}

	@OriginalMember(owner = "client!ac", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static66.method1490(local6)) {
			this.method217(local6, 3, -1);
			arg0.consume();
		}
	}
}
