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

@OriginalClass("client!ge")
public final class Class89_Sub1 extends Class89 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!ek;")
	private Class70_Sub1 aClass70_Sub1_2;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!ek;")
	private Class70_Sub1 aClass70_Sub1_3;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!ek;")
	private Class70_Sub1 aClass70_Sub1_4;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "[Z")
	private final boolean[] aBooleanArray49 = new boolean[112];

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class89_Sub1(@OriginalArg(0) Component arg0) {
		Static393.method5717();
		this.method1852(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1849() {
		for (@Pc(8) Class70_Sub1 local8 = this.aClass70_Sub1_2; local8 != null; local8 = local8.aClass70_Sub1_1) {
			if (local8.anInt1768 == 0) {
				if (local8.anInt1766 >= 0) {
					local8.aBoolean137 = !this.aBooleanArray49[local8.anInt1766];
				}
				this.aBooleanArray49[local8.anInt1766] = true;
			} else if (local8.anInt1768 == 1) {
				this.aBooleanArray49[local8.anInt1766] = false;
			} else if (local8.anInt1768 == -1) {
				for (@Pc(45) int local45 = 0; local45 < 112; local45++) {
					this.aBooleanArray49[local45] = false;
				}
			}
		}
		this.aClass70_Sub1_4 = this.aClass70_Sub1_2;
		this.aClass70_Sub1_3 = null;
		this.aClass70_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	@Override
	public void method1844() {
		this.method1853();
	}

	@OriginalMember(owner = "client!ge", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static122.method1946(local6)) {
			this.method1855(-1, 2, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method1852(@OriginalArg(1) Component arg0) {
		this.method1853();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static218.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	private void method1853() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(30) int local30 = 0; local30 < 112; local30++) {
			this.aBooleanArray49[local30] = false;
		}
		this.aClass70_Sub1_3 = null;
		this.aClass70_Sub1_2 = null;
		this.aClass70_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Lclient!hk;")
	@Override
	public Class70 method1842() {
		@Pc(13) Class70_Sub1 local13;
		for (local13 = this.aClass70_Sub1_4; local13 != null && local13.anInt1768 == -1; local13 = local13.aClass70_Sub1_1) {
		}
		if (local13 == null) {
			this.aClass70_Sub1_4 = null;
		} else {
			this.aClass70_Sub1_4 = local13.aClass70_Sub1_1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method1854(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static158.anIntArray302.length > local8) {
			local8 = Static158.anIntArray302[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method1855(local8, arg1, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ge", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1855(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!ge", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1854(arg0, 1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIIC)V")
	private void method1855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class70_Sub1 local7 = new Class70_Sub1();
		local7.anInt1768 = arg1;
		local7.anInt1766 = arg0;
		local7.aChar1 = arg2;
		local7.aLong49 = Static288.method4512();
		if (this.aClass70_Sub1_3 == null) {
			this.aClass70_Sub1_2 = local7;
		} else {
			this.aClass70_Sub1_3.aClass70_Sub1_1 = local7;
		}
		this.aClass70_Sub1_3 = local7;
	}

	@OriginalMember(owner = "client!ge", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1854(arg0, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1847(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray49[arg0] : false;
	}
}
