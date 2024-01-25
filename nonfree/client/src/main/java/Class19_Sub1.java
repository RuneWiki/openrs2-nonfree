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

@OriginalClass("client!eda")
public final class Class19_Sub1 extends Class19 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!eda", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!eda", name = "y", descriptor = "Lclient!tm;")
	private final Class338 aClass338_69 = new Class338();

	@OriginalMember(owner = "client!eda", name = "z", descriptor = "Lclient!tm;")
	private final Class338 aClass338_70 = new Class338();

	@OriginalMember(owner = "client!eda", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class19_Sub1(@OriginalArg(0) Component arg0) {
		Static475.method6877();
		this.method2365(arg0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
	@Override
	public void method2355() {
		this.method2366();
	}

	@OriginalMember(owner = "client!eda", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2364(1, arg0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)I")
	private int method2360() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray11[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray11[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray11[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)Lclient!pfa;")
	@Override
	public Interface22 method2357() {
		return (Interface22) this.aClass338_69.method8169();
	}

	@OriginalMember(owner = "client!eda", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2364(0, arg0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2352(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray11[arg0] : false;
	}

	@OriginalMember(owner = "client!eda", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static19.method572(local6)) {
			this.method2363(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIC)V")
	private void method2363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class3_Sub47 local7 = new Class3_Sub47();
		local7.anInt8003 = arg1;
		local7.aChar3 = arg2;
		local7.anInt8010 = arg0;
		local7.aLong240 = Static524.method7320();
		this.aClass338_70.method8171(local7);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method2364(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static554.anIntArray764.length) {
			local8 = Static554.anIntArray764[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method2363(local8, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!eda", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!eda", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2363(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method2351() {
		this.aClass338_69.method8175();
		for (@Pc(19) Class3_Sub47 local19 = (Class3_Sub47) this.aClass338_70.method8169(); local19 != null; local19 = (Class3_Sub47) this.aClass338_70.method8169()) {
			local19.anInt8005 = this.method2360();
			if (local19.anInt8003 == 0) {
				if (!this.aBooleanArray11[local19.anInt8010]) {
					@Pc(123) Class3_Sub47 local123 = new Class3_Sub47();
					local123.aLong240 = local19.aLong240;
					local123.anInt8003 = 0;
					local123.anInt8005 = local19.anInt8005;
					local123.anInt8010 = local19.anInt8010;
					local123.aChar3 = '\u0000';
					this.aClass338_69.method8171(local123);
					this.aBooleanArray11[local19.anInt8010] = true;
				}
				local19.anInt8003 = 2;
				this.aClass338_69.method8171(local19);
			} else if (local19.anInt8003 == 1) {
				if (this.aBooleanArray11[local19.anInt8010]) {
					this.aClass338_69.method8171(local19);
					this.aBooleanArray11[local19.anInt8010] = false;
				}
			} else if (local19.anInt8003 == -1) {
				for (@Pc(69) int local69 = 0; local69 < 112; local69++) {
					if (this.aBooleanArray11[local69]) {
						@Pc(80) Class3_Sub47 local80 = new Class3_Sub47();
						local80.aChar3 = '\u0000';
						local80.aLong240 = local19.aLong240;
						local80.anInt8010 = local69;
						local80.anInt8005 = local19.anInt8005;
						local80.anInt8003 = 1;
						this.aClass338_69.method8171(local80);
						this.aBooleanArray11[local69] = false;
					}
				}
			} else if (local19.anInt8003 == 3) {
				this.aClass338_69.method8171(local19);
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method2365(@OriginalArg(1) Component arg0) {
		this.method2366();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static497.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V")
	private void method2366() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray11[local22] = false;
		}
		this.aClass338_69.method8175();
		this.aClass338_70.method8175();
	}
}
