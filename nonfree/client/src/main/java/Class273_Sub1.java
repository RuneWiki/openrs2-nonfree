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

@OriginalClass("client!rb")
public final class Class273_Sub1 extends Class273 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_64 = new Class211();

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_65 = new Class211();

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "[Z")
	private final boolean[] aBooleanArray28 = new boolean[112];

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class273_Sub1(@OriginalArg(0) Component arg0) {
		Static231.method4103();
		this.method6623(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIC)V")
	private void method6618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class6_Sub45 local7 = new Class6_Sub45();
		local7.aChar4 = arg2;
		local7.anInt8855 = arg1;
		local7.anInt8858 = arg0;
		local7.aLong213 = Static174.method3502();
		this.aClass211_65.method5173(local7);
	}

	@OriginalMember(owner = "client!rb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6622(arg0, 1);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method6611() {
		this.aClass211_64.method5179();
		for (@Pc(21) Class6_Sub45 local21 = (Class6_Sub45) this.aClass211_65.method5180(); local21 != null; local21 = (Class6_Sub45) this.aClass211_65.method5180()) {
			local21.anInt8856 = this.method6625();
			if (local21.anInt8858 == 0) {
				if (!this.aBooleanArray28[local21.anInt8855]) {
					@Pc(41) Class6_Sub45 local41 = new Class6_Sub45();
					local41.aChar4 = '\u0000';
					local41.aLong213 = local21.aLong213;
					local41.anInt8856 = local21.anInt8856;
					local41.anInt8855 = local21.anInt8855;
					local41.anInt8858 = 0;
					this.aClass211_64.method5173(local41);
					this.aBooleanArray28[local21.anInt8855] = true;
				}
				local21.anInt8858 = 2;
				this.aClass211_64.method5173(local21);
			} else if (local21.anInt8858 == 1) {
				if (this.aBooleanArray28[local21.anInt8855]) {
					this.aClass211_64.method5173(local21);
					this.aBooleanArray28[local21.anInt8855] = false;
				}
			} else if (local21.anInt8858 == -1) {
				for (@Pc(102) int local102 = 0; local102 < 112; local102++) {
					if (this.aBooleanArray28[local102]) {
						@Pc(113) Class6_Sub45 local113 = new Class6_Sub45();
						local113.anInt8858 = 1;
						local113.aLong213 = local21.aLong213;
						local113.anInt8855 = local102;
						local113.anInt8856 = local21.anInt8856;
						local113.aChar4 = '\u0000';
						this.aClass211_64.method5173(local113);
						this.aBooleanArray28[local102] = false;
					}
				}
			} else if (local21.anInt8858 == 3) {
				this.aClass211_64.method5173(local21);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Lclient!mj;")
	@Override
	public Interface13 method6610() {
		return (Interface13) this.aClass211_64.method5180();
	}

	@OriginalMember(owner = "client!rb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
	private void method6622(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0.getKeyCode();
		if (local13 == 0) {
			local13 = 0;
		} else if (local13 >= 0 && local13 < Static207.anIntArray285.length) {
			local13 = Static207.anIntArray285[local13];
			if (arg1 == 0 && (local13 & 0x80) != 0) {
				local13 = 0;
			} else {
				local13 &= 0xFFFFFF7F;
			}
		} else {
			local13 = 0;
		}
		if (local13 != 0) {
			this.method6618(arg1, local13, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method6623(@OriginalArg(1) Component arg0) {
		this.method6624();
		this.aComponent5 = arg0;
		@Pc(17) Method local17 = Static389.aMethod2;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent5, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent5.addKeyListener(this);
		this.aComponent5.addFocusListener(this);
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	private void method6624() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeKeyListener(this);
		this.aComponent5.removeFocusListener(this);
		this.aComponent5 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray28[local22] = false;
		}
		this.aClass211_64.method5179();
		this.aClass211_65.method5179();
	}

	@OriginalMember(owner = "client!rb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6622(arg0, 0);
	}

	@OriginalMember(owner = "client!rb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static333.method5303(local6)) {
			this.method6618(3, -1, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	@Override
	public void method6613() {
		this.method6624();
	}

	@OriginalMember(owner = "client!rb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6618(-1, 0, '\u0000');
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)I")
	private int method6625() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray28[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray28[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray28[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method6617(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray28[arg0] : false;
	}
}
