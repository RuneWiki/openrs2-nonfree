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

@OriginalClass("client!wh")
public final class Class252_Sub1 extends Class252 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Lclient!fca;")
	private final Class114 aClass114_68 = new Class114();

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "Lclient!fca;")
	private final Class114 aClass114_69 = new Class114();

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "[Z")
	private final boolean[] aBooleanArray39 = new boolean[112];

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class252_Sub1(@OriginalArg(0) Component arg0) {
		Static98.method1951();
		this.method8822(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method8822(@OriginalArg(1) Component arg0) {
		this.method8826();
		this.aComponent5 = arg0;
		@Pc(11) Method local11 = Static429.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent5, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent5.addKeyListener(this);
		this.aComponent5.addFocusListener(this);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Lclient!mr;")
	@Override
	public Interface16 method8817() {
		return (Interface16) this.aClass114_68.method2813();
	}

	@OriginalMember(owner = "client!wh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method8823(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method8818(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray39[arg0] : false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBCI)V")
	private void method8823(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class5_Sub49 local15 = new Class5_Sub49();
		local15.aChar5 = arg1;
		local15.anInt8837 = arg0;
		local15.anInt8841 = arg2;
		local15.aLong251 = Static547.method7619();
		this.aClass114_69.method2807(local15);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method8820() {
		this.aClass114_68.method2808();
		for (@Pc(15) Class5_Sub49 local15 = (Class5_Sub49) this.aClass114_69.method2813(); local15 != null; local15 = (Class5_Sub49) this.aClass114_69.method2813()) {
			local15.anInt8835 = this.method8830();
			if (local15.anInt8837 == 0) {
				if (!this.aBooleanArray39[local15.anInt8841]) {
					@Pc(123) Class5_Sub49 local123 = new Class5_Sub49();
					local123.anInt8835 = local15.anInt8835;
					local123.aChar5 = '\u0000';
					local123.anInt8837 = 0;
					local123.aLong251 = local15.aLong251;
					local123.anInt8841 = local15.anInt8841;
					this.aClass114_68.method2807(local123);
					this.aBooleanArray39[local15.anInt8841] = true;
				}
				local15.anInt8837 = 2;
				this.aClass114_68.method2807(local15);
			} else if (local15.anInt8837 == 1) {
				if (this.aBooleanArray39[local15.anInt8841]) {
					this.aClass114_68.method2807(local15);
					this.aBooleanArray39[local15.anInt8841] = false;
				}
			} else if (local15.anInt8837 == -1) {
				for (@Pc(37) int local37 = 0; local37 < 112; local37++) {
					if (this.aBooleanArray39[local37]) {
						@Pc(48) Class5_Sub49 local48 = new Class5_Sub49();
						local48.aChar5 = '\u0000';
						local48.anInt8841 = local37;
						local48.anInt8837 = 1;
						local48.anInt8835 = local15.anInt8835;
						local48.aLong251 = local15.aLong251;
						this.aClass114_68.method2807(local48);
						this.aBooleanArray39[local37] = false;
					}
				}
			} else if (local15.anInt8837 == 3) {
				this.aClass114_68.method2807(local15);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method8829(arg0, 0);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	@Override
	public void method8821() {
		this.method8826();
	}

	@OriginalMember(owner = "client!wh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static460.method6584(local6)) {
			this.method8823(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	private void method8826() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeKeyListener(this);
		this.aComponent5.removeFocusListener(this);
		this.aComponent5 = null;
		for (@Pc(20) int local20 = 0; local20 < 112; local20++) {
			this.aBooleanArray39[local20] = false;
		}
		this.aClass114_68.method2808();
		this.aClass114_69.method2808();
	}

	@OriginalMember(owner = "client!wh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method8829(arg0, 1);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method8829(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static596.anIntArray164.length) {
			local8 = Static596.anIntArray164[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method8823(arg1, '\u0000', local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)I")
	private int method8830() {
		@Pc(10) int local10 = 0;
		if (this.aBooleanArray39[81]) {
			local10 = 1;
		}
		if (this.aBooleanArray39[82]) {
			local10 |= 0x4;
		}
		if (this.aBooleanArray39[86]) {
			local10 |= 0x2;
		}
		return local10;
	}
}
