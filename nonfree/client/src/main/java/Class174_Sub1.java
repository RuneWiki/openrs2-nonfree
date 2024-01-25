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

@OriginalClass("client!kaa")
public final class Class174_Sub1 extends Class174 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!kaa", name = "F", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!kaa", name = "w", descriptor = "Lclient!au;")
	private final Class22 aClass22_29 = new Class22();

	@OriginalMember(owner = "client!kaa", name = "A", descriptor = "Lclient!au;")
	private final Class22 aClass22_30 = new Class22();

	@OriginalMember(owner = "client!kaa", name = "G", descriptor = "[Z")
	private final boolean[] aBooleanArray14 = new boolean[112];

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class174_Sub1(@OriginalArg(0) Component arg0) {
		Static571.method8036();
		this.method4095(arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static67.method1484(local6)) {
			this.method4101(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method4095(@OriginalArg(1) Component arg0) {
		this.method4098();
		this.aComponent3 = arg0;
		@Pc(11) Method local11 = Static594.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!kaa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)I")
	private int method4097() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray14[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray14[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray14[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kaa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4102(1, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "(I)V")
	private void method4098() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray14[local28] = false;
		}
		this.aClass22_29.method886();
		this.aClass22_30.method886();
	}

	@OriginalMember(owner = "client!kaa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4102(0, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Lclient!ri;")
	@Override
	public Interface19 method4088() {
		return (Interface19) this.aClass22_29.method896();
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method4091() {
		this.aClass22_29.method886();
		for (@Pc(15) Class4_Sub34 local15 = (Class4_Sub34) this.aClass22_30.method896(); local15 != null; local15 = (Class4_Sub34) this.aClass22_30.method896()) {
			local15.anInt6981 = this.method4097();
			if (local15.anInt6983 == 0) {
				if (!this.aBooleanArray14[local15.anInt6986]) {
					@Pc(124) Class4_Sub34 local124 = new Class4_Sub34();
					local124.aChar4 = '\u0000';
					local124.anInt6981 = local15.anInt6981;
					local124.anInt6986 = local15.anInt6986;
					local124.anInt6983 = 0;
					local124.aLong186 = local15.aLong186;
					this.aClass22_29.method894(local124);
					this.aBooleanArray14[local15.anInt6986] = true;
				}
				local15.anInt6983 = 2;
				this.aClass22_29.method894(local15);
			} else if (local15.anInt6983 == 1) {
				if (this.aBooleanArray14[local15.anInt6986]) {
					this.aClass22_29.method894(local15);
					this.aBooleanArray14[local15.anInt6986] = false;
				}
			} else if (local15.anInt6983 == -1) {
				for (@Pc(59) int local59 = 0; local59 < 112; local59++) {
					if (this.aBooleanArray14[local59]) {
						@Pc(70) Class4_Sub34 local70 = new Class4_Sub34();
						local70.aChar4 = '\u0000';
						local70.anInt6983 = 1;
						local70.aLong186 = local15.aLong186;
						local70.anInt6981 = local15.anInt6981;
						local70.anInt6986 = local59;
						this.aClass22_29.method894(local70);
						this.aBooleanArray14[local59] = false;
					}
				}
			} else if (local15.anInt6983 == 3) {
				this.aClass22_29.method894(local15);
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(CIII)V")
	private void method4101(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub34 local7 = new Class4_Sub34();
		local7.aChar4 = arg0;
		local7.anInt6983 = arg2;
		local7.anInt6986 = arg1;
		local7.aLong186 = Static112.method2047();
		this.aClass22_30.method894(local7);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4090(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray14[arg0] : false;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
	@Override
	public void method4086() {
		this.method4098();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method4102(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static547.anIntArray561.length) {
			local8 = Static547.anIntArray561[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4101('\u0000', local8, arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4101('\u0000', 0, -1);
	}
}
