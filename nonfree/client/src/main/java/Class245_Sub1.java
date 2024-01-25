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

@OriginalClass("client!wb")
public final class Class245_Sub1 extends Class245 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
	public static final int[] anIntArray728 = new int[32];

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!li;")
	private Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "Lclient!li;")
	private Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "Lclient!li;")
	private Class3_Sub1 aClass3_Sub1_4;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "[Z")
	private final boolean[] aBooleanArray25 = new boolean[112];

	static {
		@Pc(13) int local13 = 2;
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			anIntArray728[local15] = local13 - 1;
			local13 += local13;
		}
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class245_Sub1(@OriginalArg(0) Component arg0) {
		Static321.method4394();
		this.method5911(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;I)V")
	private void method5910(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static461.anIntArray718.length) {
			local8 = Static461.anIntArray718[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method5912(local8, arg1, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5907(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray25[arg0] : false;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5911(@OriginalArg(0) Component arg0) {
		this.method5913();
		this.aComponent3 = arg0;
		@Pc(17) Method local17 = Static240.aMethod1;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	@Override
	public void method5908() {
		this.method5913();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIIC)V")
	private void method5912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(11) Class3_Sub1 local11 = new Class3_Sub1();
		local11.anInt4284 = arg1;
		local11.aChar4 = arg2;
		local11.anInt4285 = arg0;
		local11.aLong139 = Static220.method3314();
		if (this.aClass3_Sub1_2 == null) {
			this.aClass3_Sub1_4 = local11;
		} else {
			this.aClass3_Sub1_2.aClass3_Sub1_1 = local11;
		}
		this.aClass3_Sub1_2 = local11;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5904() {
		for (@Pc(8) Class3_Sub1 local8 = this.aClass3_Sub1_4; local8 != null; local8 = local8.aClass3_Sub1_1) {
			if (local8.anInt4284 == 0) {
				if (local8.anInt4285 >= 0) {
					local8.aBoolean286 = !this.aBooleanArray25[local8.anInt4285];
				}
				this.aBooleanArray25[local8.anInt4285] = true;
			} else if (local8.anInt4284 == 1) {
				this.aBooleanArray25[local8.anInt4285] = false;
			} else if (local8.anInt4284 == -1) {
				for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
					this.aBooleanArray25[local26] = false;
				}
			}
		}
		this.aClass3_Sub1_3 = this.aClass3_Sub1_4;
		this.aClass3_Sub1_4 = null;
		this.aClass3_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!wb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5910(arg0, 0);
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	private void method5913() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(27) int local27 = 0; local27 < 112; local27++) {
			this.aBooleanArray25[local27] = false;
		}
		this.aClass3_Sub1_3 = null;
		this.aClass3_Sub1_2 = null;
		this.aClass3_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!wb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5910(arg0, 1);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Lclient!ab;")
	@Override
	public Class3 method5906() {
		@Pc(8) Class3_Sub1 local8;
		for (local8 = this.aClass3_Sub1_3; local8 != null && local8.anInt4284 == -1; local8 = local8.aClass3_Sub1_1) {
		}
		if (local8 == null) {
			this.aClass3_Sub1_3 = null;
		} else {
			this.aClass3_Sub1_3 = local8.aClass3_Sub1_1;
		}
		return local8;
	}

	@OriginalMember(owner = "client!wb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static447.method5141(local6)) {
			this.method5912(-1, 2, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5912(0, -1, '\u0000');
	}
}
