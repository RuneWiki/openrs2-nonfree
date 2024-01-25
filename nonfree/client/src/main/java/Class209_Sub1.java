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

@OriginalClass("client!mm")
public final class Class209_Sub1 extends Class209 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "Lclient!bq;")
	private final Class43 aClass43_35 = new Class43();

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "Lclient!bq;")
	private final Class43 aClass43_36 = new Class43();

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray16 = new boolean[112];

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class209_Sub1(@OriginalArg(0) Component arg0) {
		Static553.method7770();
		this.method5494(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5491(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!mm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5493(0, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)I")
	private int method5489() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray16[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray16[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray16[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V")
	private void method5490() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray16[local22] = false;
		}
		this.aClass43_35.method1431();
		this.aClass43_36.method1431();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
	@Override
	public void method5481() {
		this.method5490();
	}

	@OriginalMember(owner = "client!mm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBCI)V")
	private void method5491(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class8_Sub23 local15 = new Class8_Sub23();
		local15.anInt4004 = arg0;
		local15.anInt4005 = arg2;
		local15.aChar2 = arg1;
		local15.aLong100 = Static342.method5463();
		this.aClass43_36.method1424(local15);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method5487() {
		this.aClass43_35.method1431();
		for (@Pc(23) Class8_Sub23 local23 = (Class8_Sub23) this.aClass43_36.method1432(); local23 != null; local23 = (Class8_Sub23) this.aClass43_36.method1432()) {
			local23.anInt4000 = this.method5489();
			if (local23.anInt4005 == 0) {
				if (!this.aBooleanArray16[local23.anInt4004]) {
					@Pc(46) Class8_Sub23 local46 = new Class8_Sub23();
					local46.aChar2 = '\u0000';
					local46.anInt4000 = local23.anInt4000;
					local46.anInt4004 = local23.anInt4004;
					local46.aLong100 = local23.aLong100;
					local46.anInt4005 = 0;
					this.aClass43_35.method1424(local46);
					this.aBooleanArray16[local23.anInt4004] = true;
				}
				local23.anInt4005 = 2;
				this.aClass43_35.method1424(local23);
			} else if (local23.anInt4005 == 1) {
				if (this.aBooleanArray16[local23.anInt4004]) {
					this.aClass43_35.method1424(local23);
					this.aBooleanArray16[local23.anInt4004] = false;
				}
			} else if (local23.anInt4005 == -1) {
				for (@Pc(127) int local127 = 0; local127 < 112; local127++) {
					if (this.aBooleanArray16[local127]) {
						@Pc(138) Class8_Sub23 local138 = new Class8_Sub23();
						local138.aLong100 = local23.aLong100;
						local138.anInt4004 = local127;
						local138.anInt4000 = local23.anInt4000;
						local138.anInt4005 = 1;
						local138.aChar2 = '\u0000';
						this.aClass43_35.method1424(local138);
						this.aBooleanArray16[local127] = false;
					}
				}
			} else if (local23.anInt4005 == 3) {
				this.aClass43_35.method1424(local23);
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method5482(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray16[arg0] : false;
	}

	@OriginalMember(owner = "client!mm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5493(1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Lclient!q;")
	@Override
	public Interface21 method5486() {
		return (Interface21) this.aClass43_35.method1432();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
	private void method5493(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static81.anIntArray100.length) {
			local8 = Static81.anIntArray100[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method5491(local8, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!mm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static179.method3444(local6)) {
			this.method5491(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method5494(@OriginalArg(0) Component arg0) {
		this.method5490();
		this.aComponent2 = arg0;
		@Pc(15) Method local15 = Static175.aMethod1;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}
}
