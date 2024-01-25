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

@OriginalClass("client!dka")
public final class Class89_Sub1 extends Class89 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!dka", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!dka", name = "k", descriptor = "Lclient!ef;")
	private final Class102 aClass102_8 = new Class102();

	@OriginalMember(owner = "client!dka", name = "w", descriptor = "Lclient!ef;")
	private final Class102 aClass102_9 = new Class102();

	@OriginalMember(owner = "client!dka", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray3 = new boolean[112];

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class89_Sub1(@OriginalArg(0) Component arg0) {
		Static163.method2208();
		this.method1628(arg0);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
	private void method1623(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static319.anIntArray315.length > local8) {
			local8 = Static319.anIntArray315[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method1626(local8, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!dka", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1626(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method1617(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray3[arg0] : false;
	}

	@OriginalMember(owner = "client!dka", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1623(1, arg0);
	}

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "(I)V")
	private void method1625() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(27) int local27 = 0; local27 < 112; local27++) {
			this.aBooleanArray3[local27] = false;
		}
		this.aClass102_8.method1932();
		this.aClass102_9.method1932();
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(ICBI)V")
	private void method1626(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class5_Sub40 local15 = new Class5_Sub40();
		local15.anInt7804 = arg2;
		local15.aChar6 = arg1;
		local15.anInt7814 = arg0;
		local15.aLong231 = Static515.method7499(127);
		this.aClass102_9.method1921(local15);
	}

	@OriginalMember(owner = "client!dka", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!dka", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1623(0, arg0);
	}

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method1614() {
		this.aClass102_8.method1932();
		for (@Pc(23) Class5_Sub40 local23 = (Class5_Sub40) this.aClass102_9.method1928(); local23 != null; local23 = (Class5_Sub40) this.aClass102_9.method1928()) {
			local23.anInt7805 = this.method1629();
			if (local23.anInt7804 == 0) {
				if (!this.aBooleanArray3[local23.anInt7814]) {
					@Pc(154) Class5_Sub40 local154 = new Class5_Sub40();
					local154.anInt7805 = local23.anInt7805;
					local154.anInt7804 = 0;
					local154.aChar6 = '\u0000';
					local154.aLong231 = local23.aLong231;
					local154.anInt7814 = local23.anInt7814;
					this.aClass102_8.method1921(local154);
					this.aBooleanArray3[local23.anInt7814] = true;
				}
				local23.anInt7804 = 2;
				this.aClass102_8.method1921(local23);
			} else if (local23.anInt7804 == 1) {
				if (this.aBooleanArray3[local23.anInt7814]) {
					this.aClass102_8.method1921(local23);
					this.aBooleanArray3[local23.anInt7814] = false;
				}
			} else if (local23.anInt7804 == -1) {
				for (@Pc(67) int local67 = 0; local67 < 112; local67++) {
					if (this.aBooleanArray3[local67]) {
						@Pc(80) Class5_Sub40 local80 = new Class5_Sub40();
						local80.anInt7814 = local67;
						local80.aChar6 = '\u0000';
						local80.anInt7805 = local23.anInt7805;
						local80.aLong231 = local23.aLong231;
						local80.anInt7804 = 1;
						this.aClass102_8.method1921(local80);
						this.aBooleanArray3[local67] = false;
					}
				}
			} else if (local23.anInt7804 == 3) {
				this.aClass102_8.method1921(local23);
			}
		}
	}

	@OriginalMember(owner = "client!dka", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static226.method3219(local6)) {
			this.method1626(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method1628(@OriginalArg(0) Component arg0) {
		this.method1625();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static359.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(B)V")
	@Override
	public void method1619() {
		this.method1625();
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)Lclient!ks;")
	@Override
	public Interface12 method1620() {
		return (Interface12) this.aClass102_8.method1928();
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Z)I")
	private int method1629() {
		@Pc(13) int local13 = 0;
		if (this.aBooleanArray3[81]) {
			local13 = 1;
		}
		if (this.aBooleanArray3[82]) {
			local13 |= 0x4;
		}
		if (this.aBooleanArray3[86]) {
			local13 |= 0x2;
		}
		return local13;
	}
}
