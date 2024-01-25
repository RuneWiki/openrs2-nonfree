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

@OriginalClass("client!qi")
public final class Class241_Sub1 extends Class241 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qi", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "Lclient!ui;")
	private final Class295 aClass295_42 = new Class295();

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "Lclient!ui;")
	private final Class295 aClass295_43 = new Class295();

	@OriginalMember(owner = "client!qi", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray34 = new boolean[112];

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class241_Sub1(@OriginalArg(0) Component arg0) {
		Static131.method2486();
		this.method6307(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method6307(@OriginalArg(1) Component arg0) {
		this.method6309();
		this.aComponent3 = arg0;
		@Pc(19) Method local19 = Static380.aMethod2;
		if (local19 != null) {
			try {
				local19.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IICB)V")
	private void method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char arg2) {
		@Pc(7) Class1_Sub19 local7 = new Class1_Sub19();
		local7.aChar2 = arg2;
		local7.anInt3875 = arg1;
		local7.anInt3877 = arg0;
		local7.aLong94 = Static110.method2222();
		this.aClass295_43.method7533(local7);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6303(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray34[arg0] : false;
	}

	@OriginalMember(owner = "client!qi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6310(arg0, 0);
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V")
	private void method6309() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray34[local26] = false;
		}
		this.aClass295_42.method7541();
		this.aClass295_43.method7541();
	}

	@OriginalMember(owner = "client!qi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6310(arg0, 1);
	}

	@OriginalMember(owner = "client!qi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static35.method1103(local6)) {
			this.method6308(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
	private void method6310(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0.getKeyCode();
		if (local12 == 0) {
			local12 = 0;
		} else if (local12 >= 0 && local12 < Static204.anIntArray321.length) {
			local12 = Static204.anIntArray321[local12];
			if (arg1 == 0 && (local12 & 0x80) != 0) {
				local12 = 0;
			} else {
				local12 &= 0xFFFFFF7F;
			}
		} else {
			local12 = 0;
		}
		if (local12 != 0) {
			this.method6308(local12, arg1, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V")
	@Override
	public void method6306() {
		this.method6309();
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method6305() {
		this.aClass295_42.method7541();
		for (@Pc(15) Class1_Sub19 local15 = (Class1_Sub19) this.aClass295_43.method7547(); local15 != null; local15 = (Class1_Sub19) this.aClass295_43.method7547()) {
			local15.anInt3873 = this.method6313();
			if (local15.anInt3875 == 0) {
				if (!this.aBooleanArray34[local15.anInt3877]) {
					@Pc(40) Class1_Sub19 local40 = new Class1_Sub19();
					local40.aLong94 = local15.aLong94;
					local40.anInt3875 = 0;
					local40.anInt3877 = local15.anInt3877;
					local40.anInt3873 = local15.anInt3873;
					local40.aChar2 = '\u0000';
					this.aClass295_42.method7533(local40);
					this.aBooleanArray34[local15.anInt3877] = true;
				}
				local15.anInt3875 = 2;
				this.aClass295_42.method7533(local15);
			} else if (local15.anInt3875 == 1) {
				if (this.aBooleanArray34[local15.anInt3877]) {
					this.aClass295_42.method7533(local15);
					this.aBooleanArray34[local15.anInt3877] = false;
				}
			} else if (local15.anInt3875 == -1) {
				for (@Pc(110) int local110 = 0; local110 < 112; local110++) {
					if (this.aBooleanArray34[local110]) {
						@Pc(121) Class1_Sub19 local121 = new Class1_Sub19();
						local121.anInt3873 = local15.anInt3873;
						local121.aLong94 = local15.aLong94;
						local121.anInt3877 = local110;
						local121.anInt3875 = 1;
						local121.aChar2 = '\u0000';
						this.aClass295_42.method7533(local121);
						this.aBooleanArray34[local110] = false;
					}
				}
			} else if (local15.anInt3875 == 3) {
				this.aClass295_42.method7533(local15);
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Lclient!vaa;")
	@Override
	public Interface18 method6301() {
		return (Interface18) this.aClass295_42.method7547();
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)I")
	private int method6313() {
		@Pc(10) int local10 = 0;
		if (this.aBooleanArray34[81]) {
			local10 = 1;
		}
		if (this.aBooleanArray34[82]) {
			local10 |= 0x4;
		}
		if (this.aBooleanArray34[86]) {
			local10 |= 0x2;
		}
		return local10;
	}

	@OriginalMember(owner = "client!qi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6308(0, -1, '\u0000');
	}
}
