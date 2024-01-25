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

@OriginalClass("client!qca")
public final class Class297_Sub1 extends Class297 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!qca", name = "w", descriptor = "Lclient!at;")
	private final Class20 aClass20_42 = new Class20();

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "Lclient!at;")
	private final Class20 aClass20_43 = new Class20();

	@OriginalMember(owner = "client!qca", name = "r", descriptor = "[Z")
	private final boolean[] aBooleanArray21 = new boolean[112];

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class297_Sub1(@OriginalArg(0) Component arg0) {
		Static624.method8496();
		this.method6744(arg0);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
	private void method6738(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static359.anIntArray341.length > local8) {
			local8 = Static359.anIntArray341[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method6739(arg1, '\u0000', local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ICIB)V")
	private void method6739(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub29 local7 = new Class5_Sub29();
		local7.anInt5162 = arg0;
		local7.aChar5 = arg1;
		local7.anInt5161 = arg2;
		local7.aLong149 = Static480.method6763();
		this.aClass20_43.method370(local7);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)I")
	private int method6740() {
		@Pc(13) int local13 = 0;
		if (this.aBooleanArray21[81]) {
			local13 = 1;
		}
		if (this.aBooleanArray21[82]) {
			local13 |= 0x4;
		}
		if (this.aBooleanArray21[86]) {
			local13 |= 0x2;
		}
		return local13;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6737(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray21[arg0] : false;
	}

	@OriginalMember(owner = "client!qca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6738(arg0, 0);
	}

	@OriginalMember(owner = "client!qca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6739(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)Lclient!om;")
	@Override
	public Interface23 method6733() {
		return (Interface23) this.aClass20_42.method369();
	}

	@OriginalMember(owner = "client!qca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static206.method3381(local6)) {
			this.method6739(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6738(arg0, 1);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method6744(@OriginalArg(1) Component arg0) {
		this.method6745();
		this.aComponent4 = arg0;
		@Pc(11) Method local11 = Static576.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6735() {
		this.aClass20_42.method374();
		for (@Pc(15) Class5_Sub29 local15 = (Class5_Sub29) this.aClass20_43.method369(); local15 != null; local15 = (Class5_Sub29) this.aClass20_43.method369()) {
			local15.anInt5155 = this.method6740();
			if (local15.anInt5162 == 0) {
				if (!this.aBooleanArray21[local15.anInt5161]) {
					@Pc(47) Class5_Sub29 local47 = new Class5_Sub29();
					local47.anInt5162 = 0;
					local47.aLong149 = local15.aLong149;
					local47.anInt5161 = local15.anInt5161;
					local47.anInt5155 = local15.anInt5155;
					local47.aChar5 = '\u0000';
					this.aClass20_42.method370(local47);
					this.aBooleanArray21[local15.anInt5161] = true;
				}
				local15.anInt5162 = 2;
				this.aClass20_42.method370(local15);
			} else if (local15.anInt5162 == 1) {
				if (this.aBooleanArray21[local15.anInt5161]) {
					this.aClass20_42.method370(local15);
					this.aBooleanArray21[local15.anInt5161] = false;
				}
			} else if (local15.anInt5162 == -1) {
				for (@Pc(123) int local123 = 0; local123 < 112; local123++) {
					if (this.aBooleanArray21[local123]) {
						@Pc(136) Class5_Sub29 local136 = new Class5_Sub29();
						local136.aChar5 = '\u0000';
						local136.anInt5161 = local123;
						local136.anInt5155 = local15.anInt5155;
						local136.anInt5162 = 1;
						local136.aLong149 = local15.aLong149;
						this.aClass20_42.method370(local136);
						this.aBooleanArray21[local123] = false;
					}
				}
			} else if (local15.anInt5162 == 3) {
				this.aClass20_42.method370(local15);
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "(I)V")
	private void method6745() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(23) int local23 = 0; local23 < 112; local23++) {
			this.aBooleanArray21[local23] = false;
		}
		if (2 != 2) {
			this.keyPressed((KeyEvent) null);
		}
		this.aClass20_42.method374();
		this.aClass20_43.method374();
	}

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "(I)V")
	@Override
	public void method6734() {
		this.method6745();
	}
}
