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

@OriginalClass("client!dl")
public final class Class52_Sub1 extends Class52 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "Lclient!cs;")
	private Class42_Sub1 aClass42_Sub1_2;

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "Lclient!cs;")
	private Class42_Sub1 aClass42_Sub1_3;

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "Lclient!cs;")
	private Class42_Sub1 aClass42_Sub1_4;

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "[Z")
	private final boolean[] aBooleanArray10 = new boolean[112];

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class52_Sub1(@OriginalArg(0) Component arg0) {
		Static365.method5077();
		this.method1352(arg0);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1347(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray10[arg0] : false;
	}

	@OriginalMember(owner = "client!dl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1350('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(CIII)V")
	private void method1350(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class42_Sub1 local11 = new Class42_Sub1();
		local11.anInt1695 = arg2;
		local11.anInt1692 = arg1;
		local11.aChar1 = arg0;
		local11.aLong44 = Static208.method3182();
		if (this.aClass42_Sub1_3 == null) {
			this.aClass42_Sub1_4 = local11;
		} else {
			this.aClass42_Sub1_3.aClass42_Sub1_1 = local11;
		}
		this.aClass42_Sub1_3 = local11;
	}

	@OriginalMember(owner = "client!dl", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static251.method3861(local6)) {
			this.method1350(local6, 2, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1349() {
		for (@Pc(8) Class42_Sub1 local8 = this.aClass42_Sub1_4; local8 != null; local8 = local8.aClass42_Sub1_1) {
			if (local8.anInt1692 == 0) {
				if (local8.anInt1695 >= 0) {
					local8.aBoolean142 = !this.aBooleanArray10[local8.anInt1695];
				}
				this.aBooleanArray10[local8.anInt1695] = true;
			} else if (local8.anInt1692 == 1) {
				this.aBooleanArray10[local8.anInt1695] = false;
			} else if (local8.anInt1692 == -1) {
				for (@Pc(46) int local46 = 0; local46 < 112; local46++) {
					this.aBooleanArray10[local46] = false;
				}
			}
		}
		this.aClass42_Sub1_2 = this.aClass42_Sub1_4;
		this.aClass42_Sub1_3 = null;
		this.aClass42_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!dl", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1351(arg0, 1);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
	private void method1351(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && Static158.anIntArray205.length > local14) {
			local14 = Static158.anIntArray205[local14];
			if (arg1 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method1350('\u0000', arg1, local14);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	@Override
	public void method1345() {
		this.method1355();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1352(@OriginalArg(1) Component arg0) {
		this.method1355();
		this.aComponent3 = arg0;
		@Pc(15) Method local15 = Static197.aMethod1;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!dl", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1351(arg0, 0);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Lclient!db;")
	@Override
	public Class42 method1348() {
		@Pc(14) Class42_Sub1 local14;
		for (local14 = this.aClass42_Sub1_2; local14 != null && local14.anInt1692 == -1; local14 = local14.aClass42_Sub1_1) {
		}
		if (local14 == null) {
			this.aClass42_Sub1_2 = null;
		} else {
			this.aClass42_Sub1_2 = local14.aClass42_Sub1_1;
		}
		return local14;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)V")
	private void method1355() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray10[local28] = false;
		}
		this.aClass42_Sub1_2 = null;
		this.aClass42_Sub1_3 = null;
		this.aClass42_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!dl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
