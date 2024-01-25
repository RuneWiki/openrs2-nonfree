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

@OriginalClass("client!mi")
public final class Class189_Sub1 extends Class189 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "Lclient!rk;")
	private final Class249 aClass249_27 = new Class249();

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "Lclient!rk;")
	private final Class249 aClass249_28 = new Class249();

	@OriginalMember(owner = "client!mi", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray24 = new boolean[112];

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class189_Sub1(@OriginalArg(0) Component arg0) {
		Static262.method6201();
		this.method4720(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ICIB)V")
	private void method4715(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub37 local7 = new Class2_Sub37();
		local7.aChar3 = arg1;
		local7.anInt6874 = arg0;
		local7.anInt6878 = arg2;
		local7.aLong171 = Static143.method2502();
		this.aClass249_28.method6523(local7);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
	private void method4716(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(14) int local14 = arg1.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && Static215.anIntArray622.length > local14) {
			local14 = Static215.anIntArray622[local14];
			if (arg0 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method4715(local14, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I")
	private int method4717() {
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

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	@Override
	public void method4711() {
		this.method4721();
	}

	@OriginalMember(owner = "client!mi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4716(0, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lclient!nt;")
	@Override
	public Interface13 method4713() {
		return (Interface13) this.aClass249_27.method6529();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method4710(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray24[arg0] : false;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method4720(@OriginalArg(1) Component arg0) {
		this.method4721();
		this.aComponent2 = arg0;
		@Pc(15) Method local15 = Static482.aMethod1;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	private void method4721() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray24[local22] = false;
		}
		this.aClass249_27.method6530();
		this.aClass249_28.method6530();
	}

	@OriginalMember(owner = "client!mi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4716(1, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4715(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method4712() {
		this.aClass249_27.method6530();
		for (@Pc(15) Class2_Sub37 local15 = (Class2_Sub37) this.aClass249_28.method6529(); local15 != null; local15 = (Class2_Sub37) this.aClass249_28.method6529()) {
			local15.anInt6880 = this.method4717();
			if (local15.anInt6878 == 0) {
				if (!this.aBooleanArray24[local15.anInt6874]) {
					@Pc(123) Class2_Sub37 local123 = new Class2_Sub37();
					local123.anInt6874 = local15.anInt6874;
					local123.aLong171 = local15.aLong171;
					local123.anInt6878 = 0;
					local123.anInt6880 = local15.anInt6880;
					local123.aChar3 = '\u0000';
					this.aClass249_27.method6523(local123);
					this.aBooleanArray24[local15.anInt6874] = true;
				}
				local15.anInt6878 = 2;
				this.aClass249_27.method6523(local15);
			} else if (local15.anInt6878 == 1) {
				if (this.aBooleanArray24[local15.anInt6874]) {
					this.aClass249_27.method6523(local15);
					this.aBooleanArray24[local15.anInt6874] = false;
				}
			} else if (local15.anInt6878 == -1) {
				for (@Pc(37) int local37 = 0; local37 < 112; local37++) {
					if (this.aBooleanArray24[local37]) {
						@Pc(48) Class2_Sub37 local48 = new Class2_Sub37();
						local48.anInt6874 = local37;
						local48.anInt6880 = local15.anInt6880;
						local48.anInt6878 = 1;
						local48.aLong171 = local15.aLong171;
						local48.aChar3 = '\u0000';
						this.aClass249_27.method6523(local48);
						this.aBooleanArray24[local37] = false;
					}
				}
			} else if (local15.anInt6878 == 3) {
				this.aClass249_27.method6523(local15);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static33.method674(local6)) {
			this.method4715(-1, local6, 3);
			arg0.consume();
		}
	}
}
