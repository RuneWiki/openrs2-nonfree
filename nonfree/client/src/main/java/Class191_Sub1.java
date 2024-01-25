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

@OriginalClass("client!ue")
public final class Class191_Sub1 extends Class191 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!ow;")
	private final Class271 aClass271_63 = new Class271();

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!ow;")
	private final Class271 aClass271_64 = new Class271();

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray63 = new boolean[112];

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class191_Sub1(@OriginalArg(0) Component arg0) {
		Static394.method7233();
		this.method8975(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	private void method8968() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeKeyListener(this);
		this.aComponent5.removeFocusListener(this);
		this.aComponent5 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray63[local22] = false;
		}
		this.aClass271_63.method7181();
		this.aClass271_64.method7181();
	}

	@OriginalMember(owner = "client!ue", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method8969(1, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method8969(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static636.anIntArray575.length) {
			local8 = Static636.anIntArray575[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method8971(arg0, '\u0000', local8);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)I")
	private int method8970() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray63[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray63[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray63[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IICI)V")
	private void method8971(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub37 local7 = new Class2_Sub37();
		local7.aChar2 = arg1;
		local7.anInt5677 = arg0;
		local7.anInt5685 = arg2;
		local7.aLong157 = Static99.method1701();
		this.aClass271_64.method7174(local7);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Lclient!tm;")
	@Override
	public Interface21 method8962() {
		return (Interface21) this.aClass271_63.method7172();
	}

	@OriginalMember(owner = "client!ue", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method8969(0, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8961() {
		this.aClass271_63.method7181();
		for (@Pc(21) Class2_Sub37 local21 = (Class2_Sub37) this.aClass271_64.method7172(); local21 != null; local21 = (Class2_Sub37) this.aClass271_64.method7172()) {
			local21.anInt5683 = this.method8970();
			if (local21.anInt5677 == 0) {
				if (!this.aBooleanArray63[local21.anInt5685]) {
					@Pc(44) Class2_Sub37 local44 = new Class2_Sub37();
					local44.aLong157 = local21.aLong157;
					local44.anInt5677 = 0;
					local44.aChar2 = '\u0000';
					local44.anInt5683 = local21.anInt5683;
					local44.anInt5685 = local21.anInt5685;
					this.aClass271_63.method7174(local44);
					this.aBooleanArray63[local21.anInt5685] = true;
				}
				local21.anInt5677 = 2;
				this.aClass271_63.method7174(local21);
			} else if (local21.anInt5677 == 1) {
				if (this.aBooleanArray63[local21.anInt5685]) {
					this.aClass271_63.method7174(local21);
					this.aBooleanArray63[local21.anInt5685] = false;
				}
			} else if (local21.anInt5677 == -1) {
				for (@Pc(112) int local112 = 0; local112 < 112; local112++) {
					if (this.aBooleanArray63[local112]) {
						@Pc(123) Class2_Sub37 local123 = new Class2_Sub37();
						local123.aLong157 = local21.aLong157;
						local123.anInt5677 = 1;
						local123.anInt5685 = local112;
						local123.aChar2 = '\u0000';
						local123.anInt5683 = local21.anInt5683;
						this.aClass271_63.method7174(local123);
						this.aBooleanArray63[local112] = false;
					}
				}
			} else if (local21.anInt5677 == 3) {
				this.aClass271_63.method7174(local21);
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method8963(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray63[arg0] : false;
	}

	@OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method8971(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!ue", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static606.method9084(local6)) {
			this.method8971(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	@Override
	public void method8967() {
		this.method8968();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method8975(@OriginalArg(0) Component arg0) {
		this.method8968();
		this.aComponent5 = arg0;
		@Pc(19) Method local19 = Static72.aMethod2;
		if (local19 != null) {
			try {
				local19.invoke(this.aComponent5, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent5.addKeyListener(this);
		this.aComponent5.addFocusListener(this);
	}
}
