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

@OriginalClass("client!oca")
public final class Class91_Sub1 extends Class91 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!oca", name = "D", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!oca", name = "s", descriptor = "Lclient!kba;")
	private final Class163 aClass163_43 = new Class163();

	@OriginalMember(owner = "client!oca", name = "C", descriptor = "Lclient!kba;")
	private final Class163 aClass163_44 = new Class163();

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "[Z")
	private final boolean[] aBooleanArray19 = new boolean[112];

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class91_Sub1(@OriginalArg(0) Component arg0) {
		Static370.method5898();
		this.method6233(arg0);
	}

	@OriginalMember(owner = "client!oca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static204.method6279(local6)) {
			this.method6231(3, -1, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6228(1, arg0);
	}

	@OriginalMember(owner = "client!oca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
	@Override
	public void method6218() {
		this.method6227();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	private void method6227() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray19[local22] = false;
		}
		this.aClass163_43.method4970();
		this.aClass163_44.method4970();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
	private void method6228(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static160.anIntArray161.length) {
			local8 = Static160.anIntArray161[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method6231(arg0, local8, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(B)I")
	private int method6229() {
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

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method6219() {
		this.aClass163_43.method4970();
		for (@Pc(15) Class6_Sub14 local15 = (Class6_Sub14) this.aClass163_44.method4969(); local15 != null; local15 = (Class6_Sub14) this.aClass163_44.method4969()) {
			local15.anInt2398 = this.method6229();
			if (local15.anInt2400 == 0) {
				if (!this.aBooleanArray19[local15.anInt2402]) {
					@Pc(123) Class6_Sub14 local123 = new Class6_Sub14();
					local123.aLong49 = local15.aLong49;
					local123.anInt2398 = local15.anInt2398;
					local123.anInt2400 = 0;
					local123.aChar1 = '\u0000';
					local123.anInt2402 = local15.anInt2402;
					this.aClass163_43.method4967(local123);
					this.aBooleanArray19[local15.anInt2402] = true;
				}
				local15.anInt2400 = 2;
				this.aClass163_43.method4967(local15);
			} else if (local15.anInt2400 == 1) {
				if (this.aBooleanArray19[local15.anInt2402]) {
					this.aClass163_43.method4967(local15);
					this.aBooleanArray19[local15.anInt2402] = false;
				}
			} else if (local15.anInt2400 == -1) {
				for (@Pc(56) int local56 = 0; local56 < 112; local56++) {
					if (this.aBooleanArray19[local56]) {
						@Pc(67) Class6_Sub14 local67 = new Class6_Sub14();
						local67.anInt2398 = local15.anInt2398;
						local67.anInt2402 = local56;
						local67.aLong49 = local15.aLong49;
						local67.anInt2400 = 1;
						local67.aChar1 = '\u0000';
						this.aClass163_43.method4967(local67);
						this.aBooleanArray19[local56] = false;
					}
				}
			} else if (local15.anInt2400 == 3) {
				this.aClass163_43.method4967(local15);
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6231(-1, 0, '\u0000');
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IICZ)V")
	private void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char arg2) {
		@Pc(7) Class6_Sub14 local7 = new Class6_Sub14();
		local7.anInt2402 = arg1;
		local7.aChar1 = arg2;
		local7.anInt2400 = arg0;
		local7.aLong49 = Static582.method8056();
		this.aClass163_44.method4967(local7);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method6233(@OriginalArg(0) Component arg0) {
		this.method6227();
		this.aComponent3 = arg0;
		@Pc(11) Method local11 = Static161.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!oca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6228(0, arg0);
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method6224(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray19[arg0] : false;
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)Lclient!db;")
	@Override
	public Interface8 method6221() {
		return (Interface8) this.aClass163_43.method4969();
	}
}
