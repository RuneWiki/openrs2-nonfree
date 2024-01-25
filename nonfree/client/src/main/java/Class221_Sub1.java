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

@OriginalClass("client!uha")
public final class Class221_Sub1 extends Class221 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!uha", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!uha", name = "r", descriptor = "Lclient!fh;")
	private final Class114 aClass114_55 = new Class114();

	@OriginalMember(owner = "client!uha", name = "t", descriptor = "Lclient!fh;")
	private final Class114 aClass114_56 = new Class114();

	@OriginalMember(owner = "client!uha", name = "v", descriptor = "[Z")
	private final boolean[] aBooleanArray24 = new boolean[112];

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class221_Sub1(@OriginalArg(0) Component arg0) {
		Static506.method7044();
		this.method8061(arg0);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method8050(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray24[arg0] : false;
	}

	@OriginalMember(owner = "client!uha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method8059(arg0, 0);
	}

	@OriginalMember(owner = "client!uha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static608.method8538(local6)) {
			this.method8057(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)V")
	private void method8056() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray24[local28] = false;
		}
		this.aClass114_55.method2768();
		this.aClass114_56.method2768();
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method8053() {
		this.aClass114_55.method2768();
		for (@Pc(21) Class2_Sub39 local21 = (Class2_Sub39) this.aClass114_56.method2765(); local21 != null; local21 = (Class2_Sub39) this.aClass114_56.method2765()) {
			local21.anInt8211 = this.method8060();
			if (local21.anInt8212 == 0) {
				if (!this.aBooleanArray24[local21.anInt8217]) {
					@Pc(131) Class2_Sub39 local131 = new Class2_Sub39();
					local131.aChar4 = '\u0000';
					local131.aLong218 = local21.aLong218;
					local131.anInt8211 = local21.anInt8211;
					local131.anInt8217 = local21.anInt8217;
					local131.anInt8212 = 0;
					this.aClass114_55.method2771(local131);
					this.aBooleanArray24[local21.anInt8217] = true;
				}
				local21.anInt8212 = 2;
				this.aClass114_55.method2771(local21);
			} else if (local21.anInt8212 == 1) {
				if (this.aBooleanArray24[local21.anInt8217]) {
					this.aClass114_55.method2771(local21);
					this.aBooleanArray24[local21.anInt8217] = false;
				}
			} else if (local21.anInt8212 == -1) {
				for (@Pc(64) int local64 = 0; local64 < 112; local64++) {
					if (this.aBooleanArray24[local64]) {
						@Pc(75) Class2_Sub39 local75 = new Class2_Sub39();
						local75.anInt8211 = local21.anInt8211;
						local75.aChar4 = '\u0000';
						local75.anInt8217 = local64;
						local75.aLong218 = local21.aLong218;
						local75.anInt8212 = 1;
						this.aClass114_55.method2771(local75);
						this.aBooleanArray24[local64] = false;
					}
				}
			} else if (local21.anInt8212 == 3) {
				this.aClass114_55.method2771(local21);
			}
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(CIII)V")
	private void method8057(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub39 local7 = new Class2_Sub39();
		local7.anInt8212 = arg2;
		local7.aChar4 = arg0;
		local7.anInt8217 = arg1;
		local7.aLong218 = Static48.method1203();
		this.aClass114_56.method2771(local7);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;I)V")
	private void method8059(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 == 0) {
			local6 = 0;
		} else if (local6 >= 0 && local6 < Static328.anIntArray369.length) {
			local6 = Static328.anIntArray369[local6];
			if (arg1 == 0 && (local6 & 0x80) != 0) {
				local6 = 0;
			} else {
				local6 &= 0xFFFFFF7F;
			}
		} else {
			local6 = 0;
		}
		if (local6 != 0) {
			this.method8057('\u0000', local6, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uha", name = "d", descriptor = "(I)I")
	private int method8060() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray24[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray24[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray24[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!uha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method8059(arg0, 1);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method8061(@OriginalArg(0) Component arg0) {
		this.method8056();
		this.aComponent3 = arg0;
		@Pc(17) Method local17 = Static465.aMethod1;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)Lclient!no;")
	@Override
	public Interface20 method8051() {
		return (Interface20) this.aClass114_55.method2765();
	}

	@OriginalMember(owner = "client!uha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
	@Override
	public void method8052() {
		this.method8056();
	}

	@OriginalMember(owner = "client!uha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method8057('\u0000', 0, -1);
	}
}
