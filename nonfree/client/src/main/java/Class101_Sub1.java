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

@OriginalClass("client!gba")
public final class Class101_Sub1 extends Class101 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gba", name = "y", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!gba", name = "v", descriptor = "Lclient!eea;")
	private final Class71 aClass71_23 = new Class71();

	@OriginalMember(owner = "client!gba", name = "x", descriptor = "Lclient!eea;")
	private final Class71 aClass71_24 = new Class71();

	@OriginalMember(owner = "client!gba", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray19 = new boolean[112];

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class101_Sub1(@OriginalArg(0) Component arg0) {
		Static220.method4022();
		this.method2594(arg0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method2594(@OriginalArg(0) Component arg0) {
		this.method2595();
		this.aComponent2 = arg0;
		@Pc(19) Method local19 = Static472.aMethod2;
		if (local19 != null) {
			try {
				local19.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2589(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray19[arg0] : false;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	private void method2595() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray19[local22] = false;
		}
		this.aClass71_23.method2088();
		this.aClass71_24.method2088();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIC)V")
	private void method2596(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(7) Class3_Sub23 local7 = new Class3_Sub23();
		local7.aChar1 = arg2;
		local7.anInt4795 = arg0;
		local7.anInt4789 = arg1;
		local7.aLong121 = Static12.method647();
		this.aClass71_24.method2076(local7);
	}

	@OriginalMember(owner = "client!gba", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
	@Override
	public void method2590() {
		this.method2595();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)Lclient!cba;")
	@Override
	public Interface2 method2591() {
		return (Interface2) this.aClass71_23.method2084();
	}

	@OriginalMember(owner = "client!gba", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2600(0, arg0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method2600(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static331.anIntArray547.length) {
			local8 = Static331.anIntArray547[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method2596(local8, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)I")
	private int method2601() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray19[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray19[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray19[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gba", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static152.method2632(local6)) {
			this.method2596(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gba", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2600(1, arg0);
	}

	@OriginalMember(owner = "client!gba", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2596(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method2592() {
		this.aClass71_23.method2088();
		for (@Pc(19) Class3_Sub23 local19 = (Class3_Sub23) this.aClass71_24.method2084(); local19 != null; local19 = (Class3_Sub23) this.aClass71_24.method2084()) {
			local19.anInt4788 = this.method2601();
			if (local19.anInt4789 == 0) {
				if (!this.aBooleanArray19[local19.anInt4795]) {
					@Pc(39) Class3_Sub23 local39 = new Class3_Sub23();
					local39.anInt4788 = local19.anInt4788;
					local39.aLong121 = local19.aLong121;
					local39.anInt4789 = 0;
					local39.aChar1 = '\u0000';
					local39.anInt4795 = local19.anInt4795;
					this.aClass71_23.method2076(local39);
					this.aBooleanArray19[local19.anInt4795] = true;
				}
				local19.anInt4789 = 2;
				this.aClass71_23.method2076(local19);
			} else if (local19.anInt4789 == 1) {
				if (this.aBooleanArray19[local19.anInt4795]) {
					this.aClass71_23.method2076(local19);
					this.aBooleanArray19[local19.anInt4795] = false;
				}
			} else if (local19.anInt4789 == -1) {
				for (@Pc(89) int local89 = 0; local89 < 112; local89++) {
					if (this.aBooleanArray19[local89]) {
						@Pc(100) Class3_Sub23 local100 = new Class3_Sub23();
						local100.aChar1 = '\u0000';
						local100.anInt4795 = local89;
						local100.anInt4789 = 1;
						local100.aLong121 = local19.aLong121;
						local100.anInt4788 = local19.anInt4788;
						this.aClass71_23.method2076(local100);
						this.aBooleanArray19[local89] = false;
					}
				}
			} else if (local19.anInt4789 == 3) {
				this.aClass71_23.method2076(local19);
			}
		}
	}
}
