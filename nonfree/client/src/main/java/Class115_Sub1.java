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

@OriginalClass("client!hp")
public final class Class115_Sub1 extends Class115 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "Lclient!nj;")
	private final Class181 aClass181_13 = new Class181();

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "Lclient!nj;")
	private final Class181 aClass181_14 = new Class181();

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray11 = new boolean[112];

	static {
		new Class231(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class115_Sub1(@OriginalArg(0) Component arg0) {
		Static202.method2839();
		this.method2382(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)I")
	private int method2377() {
		@Pc(10) int local10 = 0;
		if (this.aBooleanArray11[81]) {
			local10 = 1;
		}
		if (this.aBooleanArray11[82]) {
			local10 |= 0x4;
		}
		if (this.aBooleanArray11[86]) {
			local10 |= 0x2;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2383(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!hp", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2384(0, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V")
	private void method2379() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray11[local22] = false;
		}
		this.aClass181_13.method3969();
		this.aClass181_14.method3969();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method2372() {
		this.aClass181_13.method3969();
		for (@Pc(15) Class2_Sub23 local15 = (Class2_Sub23) this.aClass181_14.method3976(); local15 != null; local15 = (Class2_Sub23) this.aClass181_14.method3976()) {
			local15.anInt3513 = this.method2377();
			if (local15.anInt3518 == 0) {
				if (!this.aBooleanArray11[local15.anInt3520]) {
					@Pc(128) Class2_Sub23 local128 = new Class2_Sub23();
					local128.anInt3520 = local15.anInt3520;
					local128.anInt3518 = 0;
					local128.anInt3513 = local15.anInt3513;
					local128.aLong171 = local15.aLong171;
					local128.aChar2 = '\u0000';
					this.aClass181_13.method3973(local128);
					this.aBooleanArray11[local15.anInt3520] = true;
				}
				local15.anInt3518 = 2;
				this.aClass181_13.method3973(local15);
			} else if (local15.anInt3518 == 1) {
				if (this.aBooleanArray11[local15.anInt3520]) {
					this.aClass181_13.method3973(local15);
					this.aBooleanArray11[local15.anInt3520] = false;
				}
			} else if (local15.anInt3518 == -1) {
				for (@Pc(42) int local42 = 0; local42 < 112; local42++) {
					if (this.aBooleanArray11[local42]) {
						@Pc(53) Class2_Sub23 local53 = new Class2_Sub23();
						local53.anInt3518 = 1;
						local53.anInt3520 = local42;
						local53.aChar2 = '\u0000';
						local53.aLong171 = local15.aLong171;
						local53.anInt3513 = local15.anInt3513;
						this.aClass181_13.method3973(local53);
						this.aBooleanArray11[local42] = false;
					}
				}
			} else if (local15.anInt3518 == 3) {
				this.aClass181_13.method3973(local15);
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static274.method3924(local6)) {
			this.method2383(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)Lclient!ct;")
	@Override
	public Interface2 method2373() {
		return (Interface2) this.aClass181_13.method3976();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2374(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray11[arg0] : false;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	@Override
	public void method2371() {
		this.method2379();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2382(@OriginalArg(0) Component arg0) {
		this.method2379();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static307.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IICI)V")
	private void method2383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char arg2) {
		@Pc(11) Class2_Sub23 local11 = new Class2_Sub23();
		local11.aChar2 = arg2;
		local11.anInt3518 = arg1;
		local11.anInt3520 = arg0;
		local11.aLong171 = Static432.method5870();
		this.aClass181_14.method3973(local11);
	}

	@OriginalMember(owner = "client!hp", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2384(1, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
	private void method2384(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static215.anIntArray339.length > local8) {
			local8 = Static215.anIntArray339[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method2383(local8, arg0, '\u0000');
			arg1.consume();
		}
	}
}
