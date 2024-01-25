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

@OriginalClass("client!dk")
public final class Class66_Sub1 extends Class66 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!dk", name = "w", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "Lclient!bv;")
	private final Class37 aClass37_22 = new Class37();

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "Lclient!bv;")
	private final Class37 aClass37_23 = new Class37();

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "[Z")
	private final boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class66_Sub1(@OriginalArg(0) Component arg0) {
		Static396.method5970();
		this.method1589(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method1584(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static367.anIntArray660.length) {
			local8 = Static367.anIntArray660[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method1586('\u0000', local8, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(CIII)V")
	private void method1586(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub51 local7 = new Class1_Sub51();
		local7.anInt9051 = arg1;
		local7.anInt9050 = arg2;
		local7.aChar5 = arg0;
		local7.aLong387 = Static60.method1119();
		this.aClass37_23.method970(local7);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Lclient!pm;")
	@Override
	public Interface12 method1581() {
		return (Interface12) this.aClass37_22.method973();
	}

	@OriginalMember(owner = "client!dk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1586('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!dk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1582(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray11[arg0] : false;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
	private void method1587() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray11[local22] = false;
		}
		this.aClass37_22.method967();
		this.aClass37_23.method967();
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)I")
	private int method1588() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray11[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray11[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray11[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static161.method2499(local6)) {
			this.method1586(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1584(arg0, 1);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1583() {
		this.aClass37_22.method967();
		for (@Pc(15) Class1_Sub51 local15 = (Class1_Sub51) this.aClass37_23.method973(); local15 != null; local15 = (Class1_Sub51) this.aClass37_23.method973()) {
			local15.anInt9045 = this.method1588();
			if (local15.anInt9050 == 0) {
				if (!this.aBooleanArray11[local15.anInt9051]) {
					@Pc(38) Class1_Sub51 local38 = new Class1_Sub51();
					local38.anInt9050 = 0;
					local38.anInt9051 = local15.anInt9051;
					local38.anInt9045 = local15.anInt9045;
					local38.aLong387 = local15.aLong387;
					local38.aChar5 = '\u0000';
					this.aClass37_22.method970(local38);
					this.aBooleanArray11[local15.anInt9051] = true;
				}
				local15.anInt9050 = 2;
				this.aClass37_22.method970(local15);
			} else if (local15.anInt9050 == 1) {
				if (this.aBooleanArray11[local15.anInt9051]) {
					this.aClass37_22.method970(local15);
					this.aBooleanArray11[local15.anInt9051] = false;
				}
			} else if (local15.anInt9050 == -1) {
				for (@Pc(118) int local118 = 0; local118 < 112; local118++) {
					if (this.aBooleanArray11[local118]) {
						@Pc(129) Class1_Sub51 local129 = new Class1_Sub51();
						local129.anInt9045 = local15.anInt9045;
						local129.anInt9050 = 1;
						local129.anInt9051 = local118;
						local129.aChar5 = '\u0000';
						local129.aLong387 = local15.aLong387;
						this.aClass37_22.method970(local129);
						this.aBooleanArray11[local118] = false;
					}
				}
			} else if (local15.anInt9050 == 3) {
				this.aClass37_22.method970(local15);
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1584(arg0, 0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	@Override
	public void method1580() {
		this.method1587();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1589(@OriginalArg(1) Component arg0) {
		this.method1587();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static151.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}
}
