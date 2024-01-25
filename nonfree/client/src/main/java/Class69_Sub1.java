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

@OriginalClass("client!gi")
public final class Class69_Sub1 extends Class69 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Lclient!pe;")
	private Class162_Sub1 aClass162_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Lclient!pe;")
	private Class162_Sub1 aClass162_Sub1_2;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "Lclient!pe;")
	private Class162_Sub1 aClass162_Sub1_3;

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "[Z")
	private final boolean[] aBooleanArray14 = new boolean[112];

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class69_Sub1(@OriginalArg(0) Component arg0) {
		Static234.method3802();
		this.method2268(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2269(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!gi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method2267(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(13) int local13 = arg1.getKeyCode();
		if (local13 == 0) {
			local13 = 0;
		} else if (local13 >= 0 && local13 < Static174.anIntArray650.length) {
			local13 = Static174.anIntArray650[local13];
			if (arg0 == 0 && (local13 & 0x80) != 0) {
				local13 = 0;
			} else {
				local13 &= 0xFFFFFF7F;
			}
		} else {
			local13 = 0;
		}
		if (local13 != 0) {
			this.method2269(local13, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method2268(@OriginalArg(0) Component arg0) {
		this.method2273();
		this.aComponent1 = arg0;
		@Pc(17) Method local17 = Static152.aMethod2;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method2261(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray14[arg0] : false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ICII)V")
	private void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class162_Sub1 local13 = new Class162_Sub1();
		local13.anInt4557 = arg2;
		local13.anInt4552 = arg0;
		local13.aChar5 = arg1;
		local13.aLong151 = Static39.method699();
		if (this.aClass162_Sub1_3 == null) {
			this.aClass162_Sub1_2 = local13;
		} else {
			this.aClass162_Sub1_3.aClass162_Sub1_4 = local13;
		}
		this.aClass162_Sub1_3 = local13;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	@Override
	public void method2265() {
		this.method2273();
	}

	@OriginalMember(owner = "client!gi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static29.method509(local6)) {
			this.method2269(-1, local6, 2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Lclient!mq;")
	@Override
	public Class162 method2260() {
		@Pc(13) Class162_Sub1 local13;
		for (local13 = this.aClass162_Sub1_1; local13 != null && local13.anInt4557 == -1; local13 = local13.aClass162_Sub1_4) {
		}
		if (local13 == null) {
			this.aClass162_Sub1_1 = null;
		} else {
			this.aClass162_Sub1_1 = local13.aClass162_Sub1_4;
		}
		return local13;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2262() {
		for (@Pc(14) Class162_Sub1 local14 = this.aClass162_Sub1_2; local14 != null; local14 = local14.aClass162_Sub1_4) {
			if (local14.anInt4557 == 0) {
				if (local14.anInt4552 >= 0) {
					local14.aBoolean339 = !this.aBooleanArray14[local14.anInt4552];
				}
				this.aBooleanArray14[local14.anInt4552] = true;
			} else if (local14.anInt4557 == 1) {
				this.aBooleanArray14[local14.anInt4552] = false;
			} else if (local14.anInt4557 == -1) {
				for (@Pc(32) int local32 = 0; local32 < 112; local32++) {
					this.aBooleanArray14[local32] = false;
				}
			}
		}
		this.aClass162_Sub1_1 = this.aClass162_Sub1_2;
		this.aClass162_Sub1_3 = null;
		this.aClass162_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
	private void method2273() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray14[local28] = false;
		}
		this.aClass162_Sub1_2 = null;
		this.aClass162_Sub1_1 = null;
		this.aClass162_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!gi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2267(0, arg0);
	}

	@OriginalMember(owner = "client!gi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2267(1, arg0);
	}
}
