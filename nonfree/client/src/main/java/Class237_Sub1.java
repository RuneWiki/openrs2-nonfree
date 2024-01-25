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
public final class Class237_Sub1 extends Class237 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "Lclient!or;")
	private final Class244 aClass244_49 = new Class244();

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "Lclient!or;")
	private final Class244 aClass244_50 = new Class244();

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray19 = new boolean[112];

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class237_Sub1(@OriginalArg(0) Component arg0) {
		Static145.method2767();
		this.method5304(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5303(1, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5303(0, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method5299() {
		this.aClass244_49.method5581();
		for (@Pc(15) Class3_Sub34 local15 = (Class3_Sub34) this.aClass244_50.method5578(); local15 != null; local15 = (Class3_Sub34) this.aClass244_50.method5578()) {
			local15.anInt6349 = this.method5301();
			if (local15.anInt6352 == 0) {
				if (!this.aBooleanArray19[local15.anInt6342]) {
					@Pc(35) Class3_Sub34 local35 = new Class3_Sub34();
					local35.anInt6349 = local15.anInt6349;
					local35.aLong169 = local15.aLong169;
					local35.anInt6342 = local15.anInt6342;
					local35.aChar5 = '\u0000';
					local35.anInt6352 = 0;
					this.aClass244_49.method5570(local35);
					this.aBooleanArray19[local15.anInt6342] = true;
				}
				local15.anInt6352 = 2;
				this.aClass244_49.method5570(local15);
			} else if (local15.anInt6352 == 1) {
				if (this.aBooleanArray19[local15.anInt6342]) {
					this.aClass244_49.method5570(local15);
					this.aBooleanArray19[local15.anInt6342] = false;
				}
			} else if (local15.anInt6352 == -1) {
				for (@Pc(104) int local104 = 0; local104 < 112; local104++) {
					if (this.aBooleanArray19[local104]) {
						@Pc(115) Class3_Sub34 local115 = new Class3_Sub34();
						local115.anInt6342 = local104;
						local115.aChar5 = '\u0000';
						local115.aLong169 = local15.aLong169;
						local115.anInt6352 = 1;
						local115.anInt6349 = local15.anInt6349;
						this.aClass244_49.method5570(local115);
						this.aBooleanArray19[local104] = false;
					}
				}
			} else if (local15.anInt6352 == 3) {
				this.aClass244_49.method5570(local15);
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5302(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
	private int method5301() {
		@Pc(10) int local10 = 0;
		if (this.aBooleanArray19[81]) {
			local10 = 1;
		}
		if (this.aBooleanArray19[82]) {
			local10 |= 0x4;
		}
		if (this.aBooleanArray19[86]) {
			local10 |= 0x2;
		}
		return local10;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIC)V")
	private void method5302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class3_Sub34 local7 = new Class3_Sub34();
		local7.anInt6352 = arg1;
		local7.anInt6342 = arg0;
		local7.aChar5 = arg2;
		local7.aLong169 = Static96.method2000();
		this.aClass244_50.method5570(local7);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBLjava/awt/event/KeyEvent;)V")
	private void method5303(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(14) int local14 = arg1.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && Static564.anIntArray565.length > local14) {
			local14 = Static564.anIntArray565[local14];
			if (arg0 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method5302(local14, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5292(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray19[arg0] : false;
	}

	@OriginalMember(owner = "client!oc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method5304(@OriginalArg(1) Component arg0) {
		this.method5305();
		this.aComponent3 = arg0;
		@Pc(15) Method local15 = Static268.aMethod2;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5298() {
		this.method5305();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Lclient!vc;")
	@Override
	public Interface21 method5297() {
		return (Interface21) this.aClass244_49.method5578();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	private void method5305() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray19[local28] = false;
		}
		this.aClass244_49.method5581();
		this.aClass244_50.method5581();
	}

	@OriginalMember(owner = "client!oc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static115.method2283(local6)) {
			this.method5302(-1, 3, local6);
			arg0.consume();
		}
	}
}
