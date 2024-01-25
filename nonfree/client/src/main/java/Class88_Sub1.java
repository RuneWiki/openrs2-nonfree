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

@OriginalClass("client!rfa")
public final class Class88_Sub1 extends Class88 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "Lclient!rh;")
	private final Class275 aClass275_159 = new Class275();

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "Lclient!rh;")
	private final Class275 aClass275_160 = new Class275();

	@OriginalMember(owner = "client!rfa", name = "x", descriptor = "[Z")
	private final boolean[] aBooleanArray39 = new boolean[112];

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class88_Sub1(@OriginalArg(0) Component arg0) {
		Static166.method2610();
		this.method6352(arg0);
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method6346() {
		this.aClass275_159.method6357();
		for (@Pc(22) Class6_Sub11 local22 = (Class6_Sub11) this.aClass275_160.method6360(); local22 != null; local22 = (Class6_Sub11) this.aClass275_160.method6360()) {
			local22.anInt1184 = this.method6355();
			if (local22.anInt1180 == 0) {
				if (!this.aBooleanArray39[local22.anInt1185]) {
					@Pc(136) Class6_Sub11 local136 = new Class6_Sub11();
					local136.aChar1 = '\u0000';
					local136.anInt1180 = 0;
					local136.anInt1184 = local22.anInt1184;
					local136.anInt1185 = local22.anInt1185;
					local136.aLong40 = local22.aLong40;
					this.aClass275_159.method6370(local136);
					this.aBooleanArray39[local22.anInt1185] = true;
				}
				local22.anInt1180 = 2;
				this.aClass275_159.method6370(local22);
			} else if (local22.anInt1180 == 1) {
				if (this.aBooleanArray39[local22.anInt1185]) {
					this.aClass275_159.method6370(local22);
					this.aBooleanArray39[local22.anInt1185] = false;
				}
			} else if (local22.anInt1180 == -1) {
				for (@Pc(80) int local80 = 0; local80 < 112; local80++) {
					if (this.aBooleanArray39[local80]) {
						@Pc(91) Class6_Sub11 local91 = new Class6_Sub11();
						local91.anInt1185 = local80;
						local91.aChar1 = '\u0000';
						local91.anInt1184 = local22.anInt1184;
						local91.aLong40 = local22.aLong40;
						local91.anInt1180 = 1;
						this.aClass275_159.method6370(local91);
						this.aBooleanArray39[local80] = false;
					}
				}
			} else if (local22.anInt1180 == 3) {
				this.aClass275_159.method6370(local22);
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6348(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray39[arg0] : false;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)Lclient!nb;")
	@Override
	public Interface16 method6347() {
		return (Interface16) this.aClass275_159.method6360();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIC)V")
	private void method6351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class6_Sub11 local7 = new Class6_Sub11();
		local7.anInt1180 = arg0;
		local7.anInt1185 = arg1;
		local7.aChar1 = arg2;
		local7.aLong40 = Static137.method2058();
		this.aClass275_160.method6370(local7);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method6352(@OriginalArg(0) Component arg0) {
		this.method6354();
		this.aComponent5 = arg0;
		@Pc(11) Method local11 = Static70.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent5, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent5.addKeyListener(this);
		this.aComponent5.addFocusListener(this);
	}

	@OriginalMember(owner = "client!rfa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6356(arg0, 1);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
	@Override
	public void method6345() {
		this.method6354();
	}

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)V")
	private void method6354() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeKeyListener(this);
		this.aComponent5.removeFocusListener(this);
		this.aComponent5 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray39[local22] = false;
		}
		this.aClass275_159.method6357();
		this.aClass275_160.method6357();
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)I")
	private int method6355() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray39[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray39[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray39[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;I)V")
	private void method6356(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static295.anIntArray457.length > local8) {
			local8 = Static295.anIntArray457[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method6351(arg1, local8, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6356(arg0, 0);
	}

	@OriginalMember(owner = "client!rfa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static226.method3317(local6)) {
			this.method6351(3, -1, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!rfa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6351(-1, 0, '\u0000');
	}
}
