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

@OriginalClass("client!iga")
public final class Class154_Sub1 extends Class154 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!iga", name = "z", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!iga", name = "l", descriptor = "Lclient!oe;")
	private final Class244 aClass244_33 = new Class244();

	@OriginalMember(owner = "client!iga", name = "x", descriptor = "Lclient!oe;")
	private final Class244 aClass244_34 = new Class244();

	@OriginalMember(owner = "client!iga", name = "y", descriptor = "[Z")
	private final boolean[] aBooleanArray8 = new boolean[112];

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class154_Sub1(@OriginalArg(0) Component arg0) {
		Static254.method4091();
		this.method3571(arg0);
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3568() {
		this.aClass244_33.method5962();
		for (@Pc(15) Class4_Sub31 local15 = (Class4_Sub31) this.aClass244_34.method5968(); local15 != null; local15 = (Class4_Sub31) this.aClass244_34.method5968()) {
			local15.anInt7043 = this.method3577();
			if (local15.anInt7039 == 0) {
				if (!this.aBooleanArray8[local15.anInt7042]) {
					@Pc(35) Class4_Sub31 local35 = new Class4_Sub31();
					local35.anInt7039 = 0;
					local35.anInt7042 = local15.anInt7042;
					local35.anInt7043 = local15.anInt7043;
					local35.aLong180 = local15.aLong180;
					local35.aChar5 = '\u0000';
					this.aClass244_33.method5960(local35);
					this.aBooleanArray8[local15.anInt7042] = true;
				}
				local15.anInt7039 = 2;
				this.aClass244_33.method5960(local15);
			} else if (local15.anInt7039 == 1) {
				if (this.aBooleanArray8[local15.anInt7042]) {
					this.aClass244_33.method5960(local15);
					this.aBooleanArray8[local15.anInt7042] = false;
				}
			} else if (local15.anInt7039 == -1) {
				for (@Pc(95) int local95 = 0; local95 < 112; local95++) {
					if (this.aBooleanArray8[local95]) {
						@Pc(106) Class4_Sub31 local106 = new Class4_Sub31();
						local106.anInt7043 = local15.anInt7043;
						local106.aChar5 = '\u0000';
						local106.aLong180 = local15.aLong180;
						local106.anInt7039 = 1;
						local106.anInt7042 = local95;
						this.aClass244_33.method5960(local106);
						this.aBooleanArray8[local95] = false;
					}
				}
			} else if (local15.anInt7039 == 3) {
				this.aClass244_33.method5960(local15);
			}
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3571(@OriginalArg(0) Component arg0) {
		this.method3572();
		this.aComponent3 = arg0;
		@Pc(11) Method local11 = Static576.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(B)V")
	private void method3572() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray8[local26] = false;
		}
		this.aClass244_33.method5962();
		this.aClass244_34.method5962();
	}

	@OriginalMember(owner = "client!iga", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3576(arg0, 1);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(CIII)V")
	private void method3575(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub31 local7 = new Class4_Sub31();
		local7.anInt7042 = arg1;
		local7.aChar5 = arg0;
		local7.anInt7039 = arg2;
		local7.aLong180 = Static574.method8210();
		this.aClass244_34.method5960(local7);
	}

	@OriginalMember(owner = "client!iga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(Z)V")
	@Override
	public void method3566() {
		this.method3572();
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
	private void method3576(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0.getKeyCode();
		if (local16 == 0) {
			local16 = 0;
		} else if (local16 >= 0 && Static166.anIntArray153.length > local16) {
			local16 = Static166.anIntArray153[local16];
			if (arg1 == 0 && (local16 & 0x80) != 0) {
				local16 = 0;
			} else {
				local16 &= 0xFFFFFF7F;
			}
		} else {
			local16 = 0;
		}
		if (local16 != 0) {
			this.method3575('\u0000', local16, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!iga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3575('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "(B)I")
	private int method3577() {
		@Pc(10) int local10 = 0;
		if (this.aBooleanArray8[81]) {
			local10 = 1;
		}
		if (this.aBooleanArray8[82]) {
			local10 |= 0x4;
		}
		if (this.aBooleanArray8[86]) {
			local10 |= 0x2;
		}
		return local10;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3569(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray8[arg0] : false;
	}

	@OriginalMember(owner = "client!iga", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3576(arg0, 0);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)Lclient!bi;")
	@Override
	public Interface2 method3565() {
		return (Interface2) this.aClass244_33.method5968();
	}

	@OriginalMember(owner = "client!iga", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static146.method2805(local6)) {
			this.method3575(local6, -1, 3);
			arg0.consume();
		}
	}
}
