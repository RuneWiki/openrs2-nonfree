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

@OriginalClass("client!qt")
public final class Class173_Sub1 extends Class173 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "[C")
	public static final char[] aCharArray9 = new char[64];

	@OriginalMember(owner = "client!qt", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "Lclient!gj;")
	private final Class124 aClass124_48 = new Class124();

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "Lclient!gj;")
	private final Class124 aClass124_49 = new Class124();

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray31 = new boolean[112];

	static {
		for (@Pc(10) int local10 = 0; local10 < 26; local10++) {
			aCharArray9[local10] = (char) (local10 + 65);
		}
		for (@Pc(24) int local24 = 26; local24 < 52; local24++) {
			aCharArray9[local24] = (char) (local24 + 71);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray9[local38] = (char) (local38 - 4);
		}
		aCharArray9[62] = '*';
		aCharArray9[63] = '-';
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class173_Sub1(@OriginalArg(0) Component arg0) {
		Static270.method4373();
		this.method6266(arg0);
	}

	@OriginalMember(owner = "client!qt", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6269(arg0, 0);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ICII)V")
	private void method6264(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class4_Sub45 local11 = new Class4_Sub45();
		local11.aChar4 = arg1;
		local11.anInt8152 = arg2;
		local11.anInt8154 = arg0;
		local11.aLong255 = Static184.method3422();
		this.aClass124_49.method3275(local11);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6259(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray31[arg0] : false;
	}

	@OriginalMember(owner = "client!qt", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6264(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!qt", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static437.method6206(local6)) {
			this.method6264(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6261() {
		this.aClass124_48.method3265();
		for (@Pc(22) Class4_Sub45 local22 = (Class4_Sub45) this.aClass124_49.method3272(); local22 != null; local22 = (Class4_Sub45) this.aClass124_49.method3272()) {
			local22.anInt8153 = this.method6265();
			if (local22.anInt8152 == 0) {
				if (!this.aBooleanArray31[local22.anInt8154]) {
					@Pc(134) Class4_Sub45 local134 = new Class4_Sub45();
					local134.anInt8153 = local22.anInt8153;
					local134.anInt8152 = 0;
					local134.anInt8154 = local22.anInt8154;
					local134.aLong255 = local22.aLong255;
					local134.aChar4 = '\u0000';
					this.aClass124_48.method3275(local134);
					this.aBooleanArray31[local22.anInt8154] = true;
				}
				local22.anInt8152 = 2;
				this.aClass124_48.method3275(local22);
			} else if (local22.anInt8152 == 1) {
				if (this.aBooleanArray31[local22.anInt8154]) {
					this.aClass124_48.method3275(local22);
					this.aBooleanArray31[local22.anInt8154] = false;
				}
			} else if (local22.anInt8152 == -1) {
				for (@Pc(80) int local80 = 0; local80 < 112; local80++) {
					if (this.aBooleanArray31[local80]) {
						@Pc(91) Class4_Sub45 local91 = new Class4_Sub45();
						local91.anInt8152 = 1;
						local91.aLong255 = local22.aLong255;
						local91.anInt8153 = local22.anInt8153;
						local91.aChar4 = '\u0000';
						local91.anInt8154 = local80;
						this.aClass124_48.method3275(local91);
						this.aBooleanArray31[local80] = false;
					}
				}
			} else if (local22.anInt8152 == 3) {
				this.aClass124_48.method3275(local22);
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6269(arg0, 1);
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
	@Override
	public void method6262() {
		this.method6268();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Lclient!vc;")
	@Override
	public Interface24 method6260() {
		return (Interface24) this.aClass124_48.method3272();
	}

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "(I)I")
	private int method6265() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray31[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray31[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray31[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method6266(@OriginalArg(1) Component arg0) {
		this.method6268();
		this.aComponent3 = arg0;
		@Pc(17) Method local17 = Static222.aMethod2;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "(I)V")
	private void method6268() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray31[local22] = false;
		}
		this.aClass124_48.method3265();
		this.aClass124_49.method3265();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method6269(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static409.anIntArray692.length) {
			local8 = Static409.anIntArray692[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method6264(local8, '\u0000', arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qt", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
