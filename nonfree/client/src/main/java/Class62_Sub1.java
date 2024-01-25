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

@OriginalClass("client!cw")
public final class Class62_Sub1 extends Class62 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!cw", name = "F", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "Lclient!mba;")
	private final Class216 aClass216_8 = new Class216();

	@OriginalMember(owner = "client!cw", name = "C", descriptor = "Lclient!mba;")
	private final Class216 aClass216_9 = new Class216();

	@OriginalMember(owner = "client!cw", name = "E", descriptor = "[Z")
	private final boolean[] aBooleanArray3 = new boolean[112];

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class62_Sub1(@OriginalArg(0) Component arg0) {
		Static180.method2956();
		this.method1428(arg0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBLjava/awt/event/KeyEvent;)V")
	private void method1426(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static133.anIntArray660.length > local8) {
			local8 = Static133.anIntArray660[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method1430(arg0, '\u0000', local8);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1419() {
		this.aClass216_8.method5454();
		for (@Pc(21) Class3_Sub5 local21 = (Class3_Sub5) this.aClass216_9.method5462(); local21 != null; local21 = (Class3_Sub5) this.aClass216_9.method5462()) {
			local21.anInt209 = this.method1429();
			if (local21.anInt216 == 0) {
				if (!this.aBooleanArray3[local21.anInt211]) {
					@Pc(133) Class3_Sub5 local133 = new Class3_Sub5();
					local133.aLong13 = local21.aLong13;
					local133.anInt211 = local21.anInt211;
					local133.aChar1 = '\u0000';
					local133.anInt209 = local21.anInt209;
					local133.anInt216 = 0;
					this.aClass216_8.method5449(local133);
					this.aBooleanArray3[local21.anInt211] = true;
				}
				local21.anInt216 = 2;
				this.aClass216_8.method5449(local21);
			} else if (local21.anInt216 == 1) {
				if (this.aBooleanArray3[local21.anInt211]) {
					this.aClass216_8.method5449(local21);
					this.aBooleanArray3[local21.anInt211] = false;
				}
			} else if (local21.anInt216 == -1) {
				for (@Pc(45) int local45 = 0; local45 < 112; local45++) {
					if (this.aBooleanArray3[local45]) {
						@Pc(56) Class3_Sub5 local56 = new Class3_Sub5();
						local56.anInt211 = local45;
						local56.anInt216 = 1;
						local56.aLong13 = local21.aLong13;
						local56.anInt209 = local21.anInt209;
						local56.aChar1 = '\u0000';
						this.aClass216_8.method5449(local56);
						this.aBooleanArray3[local45] = false;
					}
				}
			} else if (local21.anInt216 == 3) {
				this.aClass216_8.method5449(local21);
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	private void method1428(@OriginalArg(1) Component arg0) {
		this.method1432();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static501.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!cw", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static377.method5951(local6)) {
			this.method1430(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)Lclient!up;")
	@Override
	public Interface26 method1425() {
		return (Interface26) this.aClass216_8.method5462();
	}

	@OriginalMember(owner = "client!cw", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)I")
	private int method1429() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray3[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray3[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray3[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cw", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1426(1, arg0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ICBI)V")
	private void method1430(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub5 local7 = new Class3_Sub5();
		local7.aChar1 = arg1;
		local7.anInt216 = arg0;
		local7.anInt211 = arg2;
		local7.aLong13 = Static191.method3071();
		this.aClass216_9.method5449(local7);
	}

	@OriginalMember(owner = "client!cw", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1426(0, arg0);
	}

	@OriginalMember(owner = "client!cw", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1430(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(B)V")
	private void method1432() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray3[local22] = false;
		}
		this.aClass216_8.method5454();
		this.aClass216_9.method5454();
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)V")
	@Override
	public void method1422() {
		this.method1432();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1421(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray3[arg0] : false;
	}
}
