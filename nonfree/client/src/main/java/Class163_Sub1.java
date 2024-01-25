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

@OriginalClass("client!iw")
public final class Class163_Sub1 extends Class163 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!iw", name = "y", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!iw", name = "s", descriptor = "Lclient!mr;")
	private final Class223 aClass223_19 = new Class223();

	@OriginalMember(owner = "client!iw", name = "v", descriptor = "Lclient!mr;")
	private final Class223 aClass223_20 = new Class223();

	@OriginalMember(owner = "client!iw", name = "x", descriptor = "[Z")
	private final boolean[] aBooleanArray12 = new boolean[112];

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class163_Sub1(@OriginalArg(0) Component arg0) {
		Static483.method7200();
		this.method4113(arg0);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIZC)V")
	private void method4111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class3_Sub46 local7 = new Class3_Sub46();
		local7.anInt9133 = arg0;
		local7.aChar4 = arg2;
		local7.anInt9134 = arg1;
		local7.aLong243 = Static374.method6036();
		this.aClass223_20.method5868(local7);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4104(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray12[arg0] : false;
	}

	@OriginalMember(owner = "client!iw", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)I")
	private int method4112() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray12[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray12[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray12[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!iw", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4115(arg0, 0);
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)Lclient!cca;")
	@Override
	public Interface5 method4109() {
		return (Interface5) this.aClass223_19.method5872();
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(Z)V")
	@Override
	public synchronized void method4108() {
		this.aClass223_19.method5862();
		for (@Pc(15) Class3_Sub46 local15 = (Class3_Sub46) this.aClass223_20.method5872(); local15 != null; local15 = (Class3_Sub46) this.aClass223_20.method5872()) {
			local15.anInt9139 = this.method4112();
			if (local15.anInt9134 == 0) {
				if (!this.aBooleanArray12[local15.anInt9133]) {
					@Pc(35) Class3_Sub46 local35 = new Class3_Sub46();
					local35.aLong243 = local15.aLong243;
					local35.aChar4 = '\u0000';
					local35.anInt9134 = 0;
					local35.anInt9133 = local15.anInt9133;
					local35.anInt9139 = local15.anInt9139;
					this.aClass223_19.method5868(local35);
					this.aBooleanArray12[local15.anInt9133] = true;
				}
				local15.anInt9134 = 2;
				this.aClass223_19.method5868(local15);
			} else if (local15.anInt9134 == 1) {
				if (this.aBooleanArray12[local15.anInt9133]) {
					this.aClass223_19.method5868(local15);
					this.aBooleanArray12[local15.anInt9133] = false;
				}
			} else if (local15.anInt9134 == -1) {
				for (@Pc(85) int local85 = 0; local85 < 112; local85++) {
					if (this.aBooleanArray12[local85]) {
						@Pc(96) Class3_Sub46 local96 = new Class3_Sub46();
						local96.aChar4 = '\u0000';
						local96.anInt9139 = local15.anInt9139;
						local96.aLong243 = local15.aLong243;
						local96.anInt9133 = local85;
						local96.anInt9134 = 1;
						this.aClass223_19.method5868(local96);
						this.aBooleanArray12[local85] = false;
					}
				}
			} else if (local15.anInt9134 == 3) {
				this.aClass223_19.method5868(local15);
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method4113(@OriginalArg(0) Component arg0) {
		this.method4116();
		this.aComponent2 = arg0;
		@Pc(17) Method local17 = Static211.aMethod2;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
	@Override
	public void method4106() {
		this.method4116();
	}

	@OriginalMember(owner = "client!iw", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4115(arg0, 1);
	}

	@OriginalMember(owner = "client!iw", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4111(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
	private void method4115(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0.getKeyCode();
		if (local12 == 0) {
			local12 = 0;
		} else if (local12 >= 0 && local12 < Static361.anIntArray410.length) {
			local12 = Static361.anIntArray410[local12];
			if (arg1 == 0 && (local12 & 0x80) != 0) {
				local12 = 0;
			} else {
				local12 &= 0xFFFFFF7F;
			}
		} else {
			local12 = 0;
		}
		if (local12 != 0) {
			this.method4111(local12, arg1, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!iw", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static213.method3611(local6)) {
			this.method4111(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(Z)V")
	private void method4116() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray12[local22] = false;
		}
		this.aClass223_19.method5862();
		this.aClass223_20.method5862();
	}
}
