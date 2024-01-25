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

@OriginalClass("client!kn")
public final class Class207_Sub1 extends Class207 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Lclient!bd;")
	private final Class32 aClass32_28 = new Class32();

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "Lclient!bd;")
	private final Class32 aClass32_29 = new Class32();

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "[Z")
	private final boolean[] aBooleanArray15 = new boolean[112];

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class207_Sub1(@OriginalArg(0) Component arg0) {
		Static565.method8124();
		this.method5075(arg0);
	}

	@OriginalMember(owner = "client!kn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5071(arg0, 1);
	}

	@OriginalMember(owner = "client!kn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static340.method5217(local6)) {
			this.method5074(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
	private void method5071(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static562.anIntArray491.length) {
			local8 = Static562.anIntArray491[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method5074(local8, '\u0000', arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	private void method5072() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(30) int local30 = 0; local30 < 112; local30++) {
			this.aBooleanArray15[local30] = false;
		}
		this.aClass32_28.method588();
		this.aClass32_29.method588();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ICII)V")
	private void method5074(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class14_Sub8 local7 = new Class14_Sub8();
		local7.aChar2 = arg1;
		local7.anInt633 = arg2;
		local7.anInt626 = arg0;
		local7.aLong29 = Static26.method382();
		this.aClass32_29.method582(local7);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method5075(@OriginalArg(0) Component arg0) {
		this.method5072();
		this.aComponent3 = arg0;
		@Pc(19) Method local19 = Static251.aMethod1;
		if (local19 != null) {
			try {
				local19.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Lclient!nq;")
	@Override
	public Interface17 method5069() {
		return (Interface17) this.aClass32_28.method579();
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
	private int method5077() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray15[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray15[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray15[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5071(arg0, 0);
	}

	@OriginalMember(owner = "client!kn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5074(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5067() {
		this.aClass32_28.method588();
		for (@Pc(15) Class14_Sub8 local15 = (Class14_Sub8) this.aClass32_29.method579(); local15 != null; local15 = (Class14_Sub8) this.aClass32_29.method579()) {
			local15.anInt632 = this.method5077();
			if (local15.anInt633 == 0) {
				if (!this.aBooleanArray15[local15.anInt626]) {
					@Pc(151) Class14_Sub8 local151 = new Class14_Sub8();
					local151.aLong29 = local15.aLong29;
					local151.aChar2 = '\u0000';
					local151.anInt626 = local15.anInt626;
					local151.anInt633 = 0;
					local151.anInt632 = local15.anInt632;
					this.aClass32_28.method582(local151);
					this.aBooleanArray15[local15.anInt626] = true;
				}
				local15.anInt633 = 2;
				this.aClass32_28.method582(local15);
			} else if (local15.anInt633 == 1) {
				if (this.aBooleanArray15[local15.anInt626]) {
					this.aClass32_28.method582(local15);
					this.aBooleanArray15[local15.anInt626] = false;
				}
			} else if (local15.anInt633 == -1) {
				for (@Pc(89) int local89 = 0; local89 < 112; local89++) {
					if (this.aBooleanArray15[local89]) {
						@Pc(102) Class14_Sub8 local102 = new Class14_Sub8();
						local102.anInt626 = local89;
						local102.aLong29 = local15.aLong29;
						local102.aChar2 = '\u0000';
						local102.anInt632 = local15.anInt632;
						local102.anInt633 = 1;
						this.aClass32_28.method582(local102);
						this.aBooleanArray15[local89] = false;
					}
				}
			} else if (local15.anInt633 == 3) {
				this.aClass32_28.method582(local15);
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5068(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray15[arg0] : false;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	@Override
	public void method5066() {
		this.method5072();
	}
}
