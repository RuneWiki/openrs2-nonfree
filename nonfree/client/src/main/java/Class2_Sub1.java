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

@OriginalClass("client!er")
public final class Class2_Sub1 extends Class2 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!er", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "Lclient!bg;")
	private Class19_Sub1 aClass19_Sub1_2;

	@OriginalMember(owner = "client!er", name = "A", descriptor = "Lclient!bg;")
	private Class19_Sub1 aClass19_Sub1_3;

	@OriginalMember(owner = "client!er", name = "E", descriptor = "Lclient!bg;")
	private Class19_Sub1 aClass19_Sub1_4;

	@OriginalMember(owner = "client!er", name = "s", descriptor = "[Z")
	private final boolean[] aBooleanArray7 = new boolean[112];

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class2_Sub1(@OriginalArg(0) Component arg0) {
		Static146.method2668();
		this.method1439(arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(CIZI)V")
	private void method1436(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class19_Sub1 local11 = new Class19_Sub1();
		local11.anInt459 = arg2;
		local11.aChar1 = arg0;
		local11.anInt468 = arg1;
		local11.aLong21 = Static340.method5863();
		if (this.aClass19_Sub1_3 == null) {
			this.aClass19_Sub1_4 = local11;
		} else {
			this.aClass19_Sub1_3.aClass19_Sub1_1 = local11;
		}
		this.aClass19_Sub1_3 = local11;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1425(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray7[arg0] : false;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(B)V")
	private void method1437() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray7[local26] = false;
		}
		this.aClass19_Sub1_4 = null;
		this.aClass19_Sub1_2 = null;
		this.aClass19_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!er", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1440(arg0, 1);
	}

	@OriginalMember(owner = "client!er", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1440(arg0, 0);
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
	@Override
	public void method1431() {
		this.method1437();
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)Lclient!mb;")
	@Override
	public Class19 method1433() {
		@Pc(13) Class19_Sub1 local13;
		for (local13 = this.aClass19_Sub1_2; local13 != null && local13.anInt468 == -1; local13 = local13.aClass19_Sub1_1) {
		}
		if (local13 == null) {
			this.aClass19_Sub1_2 = null;
		} else {
			this.aClass19_Sub1_2 = local13.aClass19_Sub1_1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1429() {
		for (@Pc(16) Class19_Sub1 local16 = this.aClass19_Sub1_4; local16 != null; local16 = local16.aClass19_Sub1_1) {
			if (local16.anInt468 == 0) {
				if (local16.anInt459 >= 0) {
					local16.aBoolean34 = !this.aBooleanArray7[local16.anInt459];
				}
				this.aBooleanArray7[local16.anInt459] = true;
			} else if (local16.anInt468 == 1) {
				this.aBooleanArray7[local16.anInt459] = false;
			} else if (local16.anInt468 == -1) {
				for (@Pc(31) int local31 = 0; local31 < 112; local31++) {
					this.aBooleanArray7[local31] = false;
				}
			}
		}
		this.aClass19_Sub1_2 = this.aClass19_Sub1_4;
		this.aClass19_Sub1_4 = null;
		this.aClass19_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method1439(@OriginalArg(1) Component arg0) {
		this.method1437();
		this.aComponent1 = arg0;
		@Pc(17) Method local17 = Static210.aMethod2;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!er", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 == '\u0000') {
			local6 = '\u0000';
		}
		if (local6 > '\u0000' && Static175.method2601(local6)) {
			this.method1436(local6, 2, -1);
		}
	}

	@OriginalMember(owner = "client!er", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!er", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1436('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
	private void method1440(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 == 0) {
			local6 = 0;
		} else if (local6 >= 0 && local6 < Static161.anIntArray331.length) {
			local6 = Static161.anIntArray331[local6];
			if (arg1 == 0 && (local6 & 0x80) != 0) {
				local6 = 0;
			} else {
				local6 &= 0xFFFFFF7F;
			}
		} else {
			local6 = 0;
		}
		if (local6 > 0) {
			this.method1436('\u0000', arg1, local6);
		}
	}
}
