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

@OriginalClass("client!vfa")
public final class Class90_Sub1 extends Class90 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!vfa", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!vfa", name = "u", descriptor = "Lclient!uh;")
	private final Class341 aClass341_67 = new Class341();

	@OriginalMember(owner = "client!vfa", name = "v", descriptor = "Lclient!uh;")
	private final Class341 aClass341_68 = new Class341();

	@OriginalMember(owner = "client!vfa", name = "w", descriptor = "[Z")
	private final boolean[] aBooleanArray30 = new boolean[112];

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class90_Sub1(@OriginalArg(0) Component arg0) {
		Static183.method3864();
		this.method8791(arg0);
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)Lclient!ll;")
	@Override
	public Interface16 method8782() {
		return (Interface16) this.aClass341_67.method8526();
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method8781(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray30[arg0] : false;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
	private void method8785() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray30[local26] = false;
		}
		this.aClass341_67.method8525();
		this.aClass341_68.method8525();
	}

	@OriginalMember(owner = "client!vfa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method8786(arg0, 0);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method8786(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static360.anIntArray451.length) {
			local8 = Static360.anIntArray451[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method8787(local8, '\u0000', arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V")
	@Override
	public void method8783() {
		this.method8785();
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IICI)V")
	private void method8787(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub23 local7 = new Class2_Sub23();
		local7.anInt5123 = arg2;
		local7.anInt5120 = arg0;
		local7.aChar1 = arg1;
		local7.aLong109 = Static277.method5091();
		this.aClass341_68.method8528(local7);
	}

	@OriginalMember(owner = "client!vfa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method8786(arg0, 1);
	}

	@OriginalMember(owner = "client!vfa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static370.method6243(local6)) {
			this.method8787(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)I")
	private int method8789() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray30[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray30[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray30[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8780() {
		this.aClass341_67.method8525();
		for (@Pc(19) Class2_Sub23 local19 = (Class2_Sub23) this.aClass341_68.method8526(); local19 != null; local19 = (Class2_Sub23) this.aClass341_68.method8526()) {
			local19.anInt5119 = this.method8789();
			if (local19.anInt5123 == 0) {
				if (!this.aBooleanArray30[local19.anInt5120]) {
					@Pc(39) Class2_Sub23 local39 = new Class2_Sub23();
					local39.anInt5120 = local19.anInt5120;
					local39.anInt5123 = 0;
					local39.aChar1 = '\u0000';
					local39.anInt5119 = local19.anInt5119;
					local39.aLong109 = local19.aLong109;
					this.aClass341_67.method8528(local39);
					this.aBooleanArray30[local19.anInt5120] = true;
				}
				local19.anInt5123 = 2;
				this.aClass341_67.method8528(local19);
			} else if (local19.anInt5123 == 1) {
				if (this.aBooleanArray30[local19.anInt5120]) {
					this.aClass341_67.method8528(local19);
					this.aBooleanArray30[local19.anInt5120] = false;
				}
			} else if (local19.anInt5123 == -1) {
				for (@Pc(89) int local89 = 0; local89 < 112; local89++) {
					if (this.aBooleanArray30[local89]) {
						@Pc(100) Class2_Sub23 local100 = new Class2_Sub23();
						local100.aChar1 = '\u0000';
						local100.anInt5120 = local89;
						local100.anInt5119 = local19.anInt5119;
						local100.anInt5123 = 1;
						local100.aLong109 = local19.aLong109;
						this.aClass341_67.method8528(local100);
						this.aBooleanArray30[local89] = false;
					}
				}
			} else if (local19.anInt5123 == 3) {
				this.aClass341_67.method8528(local19);
			}
		}
	}

	@OriginalMember(owner = "client!vfa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method8787(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method8791(@OriginalArg(0) Component arg0) {
		this.method8785();
		this.aComponent4 = arg0;
		@Pc(16) Method local16 = Static623.aMethod1;
		if (local16 != null) {
			try {
				local16.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}
}
