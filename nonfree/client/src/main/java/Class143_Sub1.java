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

@OriginalClass("client!sn")
public final class Class143_Sub1 extends Class143 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Lclient!gf;")
	private Class75_Sub1 aClass75_Sub1_2;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "Lclient!gf;")
	private Class75_Sub1 aClass75_Sub1_3;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "Lclient!gf;")
	private Class75_Sub1 aClass75_Sub1_4;

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "[Z")
	private final boolean[] aBooleanArray21 = new boolean[112];

	static {
		new Class117(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class143_Sub1(@OriginalArg(0) Component arg0) {
		Static291.method4844();
		this.method4860(arg0);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	@Override
	public void method4850() {
		this.method4863();
	}

	@OriginalMember(owner = "client!sn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4859(0, arg0);
		arg0.consume();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method4859(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static20.anIntArray23.length) {
			local8 = Static20.anIntArray23[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 > 0) {
			this.method4861(arg0, local8, '\u0000');
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method4860(@OriginalArg(1) Component arg0) {
		this.method4863();
		this.aComponent3 = arg0;
		@Pc(20) Method local20 = Static167.aMethod1;
		if (local20 != null) {
			try {
				local20.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(35) Throwable local35) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!sn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 == '\u0000') {
			local6 = '\u0000';
		}
		if (local6 > '\u0000' && Static189.method494(local6)) {
			this.method4861(2, -1, local6);
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIC)V")
	private void method4861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class75_Sub1 local7 = new Class75_Sub1();
		local7.anInt1801 = arg1;
		local7.aChar2 = arg2;
		local7.anInt1800 = arg0;
		local7.aLong68 = Static268.method4627();
		if (this.aClass75_Sub1_3 == null) {
			this.aClass75_Sub1_4 = local7;
		} else {
			this.aClass75_Sub1_3.aClass75_Sub1_1 = local7;
		}
		this.aClass75_Sub1_3 = local7;
	}

	@OriginalMember(owner = "client!sn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4861(-1, 0, '\u0000');
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method4851() {
		for (@Pc(16) Class75_Sub1 local16 = this.aClass75_Sub1_4; local16 != null; local16 = local16.aClass75_Sub1_1) {
			if (local16.anInt1800 == 0) {
				if (local16.anInt1801 >= 0) {
					local16.aBoolean107 = !this.aBooleanArray21[local16.anInt1801];
				}
				this.aBooleanArray21[local16.anInt1801] = true;
			} else if (local16.anInt1800 == 1) {
				this.aBooleanArray21[local16.anInt1801] = false;
			} else if (local16.anInt1800 == -1) {
				for (@Pc(36) int local36 = 0; local36 < 112; local36++) {
					this.aBooleanArray21[local36] = false;
				}
			}
		}
		this.aClass75_Sub1_2 = this.aClass75_Sub1_4;
		this.aClass75_Sub1_3 = null;
		this.aClass75_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)V")
	private void method4863() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(27) int local27 = 0; local27 < 112; local27++) {
			this.aBooleanArray21[local27] = false;
		}
		this.aClass75_Sub1_2 = null;
		this.aClass75_Sub1_3 = null;
		this.aClass75_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!sn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!sn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4859(1, arg0);
		arg0.consume();
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)Lclient!fn;")
	@Override
	public Class75 method4856() {
		@Pc(13) Class75_Sub1 local13;
		for (local13 = this.aClass75_Sub1_2; local13 != null && local13.anInt1800 == -1; local13 = local13.aClass75_Sub1_1) {
		}
		if (local13 == null) {
			this.aClass75_Sub1_2 = null;
		} else {
			this.aClass75_Sub1_2 = local13.aClass75_Sub1_1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4857(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray21[arg0] : false;
	}
}
