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

@OriginalClass("client!hw")
public final class Class150_Sub1 extends Class150 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!hw", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "Lclient!dc;")
	private final Class70 aClass70_18 = new Class70();

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "Lclient!dc;")
	private final Class70 aClass70_19 = new Class70();

	@OriginalMember(owner = "client!hw", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray10 = new boolean[112];

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class150_Sub1(@OriginalArg(0) Component arg0) {
		Static117.method1702();
		this.method2634(arg0);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIC)V")
	private void method2633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char arg2) {
		@Pc(13) Class2_Sub50 local13 = new Class2_Sub50();
		local13.anInt9071 = arg1;
		local13.anInt9073 = arg0;
		local13.aChar5 = arg2;
		local13.aLong257 = Static362.method5133();
		this.aClass70_19.method1269(local13);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method2634(@OriginalArg(1) Component arg0) {
		this.method2639();
		this.aComponent2 = arg0;
		@Pc(17) Method local17 = Static132.aMethod1;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(I)I")
	private int method2635() {
		@Pc(12) int local12 = 0;
		if (this.aBooleanArray10[81]) {
			local12 = 1;
		}
		if (this.aBooleanArray10[82]) {
			local12 |= 0x4;
		}
		if (this.aBooleanArray10[86]) {
			local12 |= 0x2;
		}
		return local12;
	}

	@OriginalMember(owner = "client!hw", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static134.method1815(local6)) {
			this.method2633(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hw", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2633(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!hw", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2638(1, arg0);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2632(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray10[arg0] : false;
	}

	@OriginalMember(owner = "client!hw", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hw", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2638(0, arg0);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	@Override
	public void method2630() {
		this.method2639();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
	private void method2638(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static211.anIntArray257.length > local8) {
			local8 = Static211.anIntArray257[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method2633(local8, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2631() {
		this.aClass70_18.method1265();
		for (@Pc(23) Class2_Sub50 local23 = (Class2_Sub50) this.aClass70_19.method1262(); local23 != null; local23 = (Class2_Sub50) this.aClass70_19.method1262()) {
			local23.anInt9072 = this.method2635();
			if (local23.anInt9071 == 0) {
				if (!this.aBooleanArray10[local23.anInt9073]) {
					@Pc(46) Class2_Sub50 local46 = new Class2_Sub50();
					local46.aLong257 = local23.aLong257;
					local46.anInt9072 = local23.anInt9072;
					local46.anInt9073 = local23.anInt9073;
					local46.anInt9071 = 0;
					local46.aChar5 = '\u0000';
					this.aClass70_18.method1269(local46);
					this.aBooleanArray10[local23.anInt9073] = true;
				}
				local23.anInt9071 = 2;
				this.aClass70_18.method1269(local23);
			} else if (local23.anInt9071 == 1) {
				if (this.aBooleanArray10[local23.anInt9073]) {
					this.aClass70_18.method1269(local23);
					this.aBooleanArray10[local23.anInt9073] = false;
				}
			} else if (local23.anInt9071 == -1) {
				for (@Pc(126) int local126 = 0; local126 < 112; local126++) {
					if (this.aBooleanArray10[local126]) {
						@Pc(137) Class2_Sub50 local137 = new Class2_Sub50();
						local137.anInt9073 = local126;
						local137.aChar5 = '\u0000';
						local137.anInt9071 = 1;
						local137.aLong257 = local23.aLong257;
						local137.anInt9072 = local23.anInt9072;
						this.aClass70_18.method1269(local137);
						this.aBooleanArray10[local126] = false;
					}
				}
			} else if (local23.anInt9071 == 3) {
				this.aClass70_18.method1269(local23);
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)Lclient!wda;")
	@Override
	public Interface24 method2629() {
		return (Interface24) this.aClass70_18.method1262();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
	private void method2639() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray10[local26] = false;
		}
		this.aClass70_18.method1265();
		this.aClass70_19.method1265();
	}
}
