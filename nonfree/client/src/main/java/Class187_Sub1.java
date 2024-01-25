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

@OriginalClass("client!qe")
public final class Class187_Sub1 extends Class187 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "Lclient!hv;")
	private Class40_Sub1 aClass40_Sub1_2;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "Lclient!hv;")
	private Class40_Sub1 aClass40_Sub1_3;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "Lclient!hv;")
	private Class40_Sub1 aClass40_Sub1_4;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray21 = new boolean[112];

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class187_Sub1(@OriginalArg(0) Component arg0) {
		Static358.method5307();
		this.method4611(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4612(arg0, 1);
	}

	@OriginalMember(owner = "client!qe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	@Override
	public void method4604() {
		this.method4610();
	}

	@OriginalMember(owner = "client!qe", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static146.method2488(local6)) {
			this.method4613(-1, 2, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	private void method4610() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray21[local22] = false;
		}
		this.aClass40_Sub1_3 = null;
		this.aClass40_Sub1_2 = null;
		this.aClass40_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method4611(@OriginalArg(0) Component arg0) {
		this.method4610();
		this.aComponent3 = arg0;
		@Pc(15) Method local15 = Static325.aMethod1;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4603() {
		for (@Pc(12) Class40_Sub1 local12 = this.aClass40_Sub1_2; local12 != null; local12 = local12.aClass40_Sub1_1) {
			if (local12.anInt3251 == 0) {
				if (local12.anInt3245 >= 0) {
					local12.aBoolean216 = !this.aBooleanArray21[local12.anInt3245];
				}
				this.aBooleanArray21[local12.anInt3245] = true;
			} else if (local12.anInt3251 == 1) {
				this.aBooleanArray21[local12.anInt3245] = false;
			} else if (local12.anInt3251 == -1) {
				for (@Pc(27) int local27 = 0; local27 < 112; local27++) {
					this.aBooleanArray21[local27] = false;
				}
			}
		}
		this.aClass40_Sub1_4 = this.aClass40_Sub1_2;
		this.aClass40_Sub1_2 = null;
		this.aClass40_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!qe", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4612(arg0, 0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method4612(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static205.anIntArray276.length) {
			local8 = Static205.anIntArray276[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4613(local8, arg1, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4613(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBIC)V")
	private void method4613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class40_Sub1 local7 = new Class40_Sub1();
		local7.anInt3245 = arg0;
		local7.aChar3 = arg2;
		local7.anInt3251 = arg1;
		local7.aLong91 = Static449.method6552();
		if (this.aClass40_Sub1_3 == null) {
			this.aClass40_Sub1_2 = local7;
		} else {
			this.aClass40_Sub1_3.aClass40_Sub1_1 = local7;
		}
		this.aClass40_Sub1_3 = local7;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)Lclient!ct;")
	@Override
	public Class40 method4605() {
		@Pc(13) Class40_Sub1 local13;
		for (local13 = this.aClass40_Sub1_4; local13 != null && local13.anInt3251 == -1; local13 = local13.aClass40_Sub1_1) {
		}
		if (local13 == null) {
			this.aClass40_Sub1_4 = null;
		} else {
			this.aClass40_Sub1_4 = local13.aClass40_Sub1_1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4602(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray21[arg0] : false;
	}
}
