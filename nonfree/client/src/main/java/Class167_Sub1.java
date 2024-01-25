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

@OriginalClass("client!jea")
public final class Class167_Sub1 extends Class167 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!jea", name = "w", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "Lclient!fha;")
	private final Class109 aClass109_31 = new Class109();

	@OriginalMember(owner = "client!jea", name = "u", descriptor = "Lclient!fha;")
	private final Class109 aClass109_32 = new Class109();

	@OriginalMember(owner = "client!jea", name = "v", descriptor = "[Z")
	private final boolean[] aBooleanArray69 = new boolean[112];

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class167_Sub1(@OriginalArg(0) Component arg0) {
		Static183.method2676();
		this.method3549(arg0);
	}

	@OriginalMember(owner = "client!jea", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3553(arg0, 1);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3544(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray69[arg0] : false;
	}

	@OriginalMember(owner = "client!jea", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3553(arg0, 0);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(BICI)V")
	private void method3548(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub35 local7 = new Class2_Sub35();
		local7.aChar4 = arg1;
		local7.anInt6109 = arg0;
		local7.anInt6113 = arg2;
		local7.aLong177 = Static476.method6413();
		this.aClass109_32.method2323(local7);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method3549(@OriginalArg(0) Component arg0) {
		this.method3551();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static359.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "(I)I")
	private int method3550() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray69[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray69[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray69[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
	@Override
	public void method3545() {
		this.method3551();
	}

	@OriginalMember(owner = "client!jea", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)Lclient!uea;")
	@Override
	public Interface22 method3543() {
		return (Interface22) this.aClass109_31.method2322();
	}

	@OriginalMember(owner = "client!jea", name = "f", descriptor = "(I)V")
	private void method3551() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray69[local22] = false;
		}
		this.aClass109_31.method2329();
		this.aClass109_32.method2329();
	}

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3547() {
		this.aClass109_31.method2329();
		for (@Pc(17) Class2_Sub35 local17 = (Class2_Sub35) this.aClass109_32.method2322(); local17 != null; local17 = (Class2_Sub35) this.aClass109_32.method2322()) {
			local17.anInt6111 = this.method3550();
			if (local17.anInt6113 == 0) {
				if (!this.aBooleanArray69[local17.anInt6109]) {
					@Pc(39) Class2_Sub35 local39 = new Class2_Sub35();
					local39.aLong177 = local17.aLong177;
					local39.anInt6109 = local17.anInt6109;
					local39.anInt6111 = local17.anInt6111;
					local39.anInt6113 = 0;
					local39.aChar4 = '\u0000';
					this.aClass109_31.method2323(local39);
					this.aBooleanArray69[local17.anInt6109] = true;
				}
				local17.anInt6113 = 2;
				this.aClass109_31.method2323(local17);
			} else if (local17.anInt6113 == 1) {
				if (this.aBooleanArray69[local17.anInt6109]) {
					this.aClass109_31.method2323(local17);
					this.aBooleanArray69[local17.anInt6109] = false;
				}
			} else if (local17.anInt6113 == -1) {
				for (@Pc(104) int local104 = 0; local104 < 112; local104++) {
					if (this.aBooleanArray69[local104]) {
						@Pc(115) Class2_Sub35 local115 = new Class2_Sub35();
						local115.aLong177 = local17.aLong177;
						local115.anInt6111 = local17.anInt6111;
						local115.anInt6113 = 1;
						local115.aChar4 = '\u0000';
						local115.anInt6109 = local104;
						this.aClass109_31.method2323(local115);
						this.aBooleanArray69[local104] = false;
					}
				}
			} else if (local17.anInt6113 == 3) {
				this.aClass109_31.method2323(local17);
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3548(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method3553(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static89.anIntArray557.length) {
			local8 = Static89.anIntArray557[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method3548(local8, '\u0000', arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jea", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static10.method162(local6)) {
			this.method3548(-1, local6, 3);
			arg0.consume();
		}
	}
}
