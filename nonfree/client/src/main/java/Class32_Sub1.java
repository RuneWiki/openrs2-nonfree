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

@OriginalClass("client!bea")
public final class Class32_Sub1 extends Class32 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!bea", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bea", name = "l", descriptor = "Lclient!nt;")
	private final Class238 aClass238_1 = new Class238();

	@OriginalMember(owner = "client!bea", name = "y", descriptor = "Lclient!nt;")
	private final Class238 aClass238_2 = new Class238();

	@OriginalMember(owner = "client!bea", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray9 = new boolean[112];

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class32_Sub1(@OriginalArg(0) Component arg0) {
		Static158.method2966();
		this.method793(arg0);
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)V")
	private void method790() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(20) int local20 = 0; local20 < 112; local20++) {
			this.aBooleanArray9[local20] = false;
		}
		this.aClass238_1.method5841();
		this.aClass238_2.method5841();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	@Override
	public void method787() {
		this.method790();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;Z)V")
	private void method791(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static18.anIntArray45.length) {
			local8 = Static18.anIntArray45[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method792(local8, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZICI)V")
	private void method792(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub30 local7 = new Class2_Sub30();
		local7.anInt5668 = arg0;
		local7.anInt5663 = arg2;
		local7.aChar3 = arg1;
		local7.aLong168 = Static438.method6517();
		this.aClass238_2.method5837(local7);
	}

	@OriginalMember(owner = "client!bea", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method791(1, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!bea", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static630.method8480(local6)) {
			this.method792(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method785() {
		this.aClass238_1.method5841();
		for (@Pc(22) Class2_Sub30 local22 = (Class2_Sub30) this.aClass238_2.method5832(); local22 != null; local22 = (Class2_Sub30) this.aClass238_2.method5832()) {
			local22.anInt5673 = this.method794();
			if (local22.anInt5663 == 0) {
				if (!this.aBooleanArray9[local22.anInt5668]) {
					@Pc(44) Class2_Sub30 local44 = new Class2_Sub30();
					local44.aChar3 = '\u0000';
					local44.anInt5668 = local22.anInt5668;
					local44.anInt5663 = 0;
					local44.aLong168 = local22.aLong168;
					local44.anInt5673 = local22.anInt5673;
					this.aClass238_1.method5837(local44);
					this.aBooleanArray9[local22.anInt5668] = true;
				}
				local22.anInt5663 = 2;
				this.aClass238_1.method5837(local22);
			} else if (local22.anInt5663 == 1) {
				if (this.aBooleanArray9[local22.anInt5668]) {
					this.aClass238_1.method5837(local22);
					this.aBooleanArray9[local22.anInt5668] = false;
				}
			} else if (local22.anInt5663 == -1) {
				for (@Pc(125) int local125 = 0; local125 < 112; local125++) {
					if (this.aBooleanArray9[local125]) {
						@Pc(136) Class2_Sub30 local136 = new Class2_Sub30();
						local136.aLong168 = local22.aLong168;
						local136.anInt5668 = local125;
						local136.aChar3 = '\u0000';
						local136.anInt5663 = 1;
						local136.anInt5673 = local22.anInt5673;
						this.aClass238_1.method5837(local136);
						this.aBooleanArray9[local125] = false;
					}
				}
			} else if (local22.anInt5663 == 3) {
				this.aClass238_1.method5837(local22);
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	private void method793(@OriginalArg(1) Component arg0) {
		this.method790();
		this.aComponent1 = arg0;
		@Pc(16) Method local16 = Static604.aMethod1;
		if (local16 != null) {
			try {
				local16.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!bea", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method791(0, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method789(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)Lclient!ou;")
	@Override
	public Interface16 method786() {
		return (Interface16) this.aClass238_1.method5832();
	}

	@OriginalMember(owner = "client!bea", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method792(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)I")
	private int method794() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray9[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray9[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray9[86]) {
			local5 |= 0x2;
		}
		return local5;
	}
}
