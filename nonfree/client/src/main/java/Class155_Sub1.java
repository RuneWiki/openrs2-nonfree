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

@OriginalClass("client!jfa")
public final class Class155_Sub1 extends Class155 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!jfa", name = "D", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!jfa", name = "t", descriptor = "Lclient!ws;")
	private final Class361 aClass361_36 = new Class361();

	@OriginalMember(owner = "client!jfa", name = "z", descriptor = "Lclient!ws;")
	private final Class361 aClass361_37 = new Class361();

	@OriginalMember(owner = "client!jfa", name = "C", descriptor = "[Z")
	private final boolean[] aBooleanArray18 = new boolean[112];

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class155_Sub1(@OriginalArg(0) Component arg0) {
		Static532.method7234();
		this.method4048(arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4037() {
		this.aClass361_36.method7842();
		for (@Pc(15) Class6_Sub8 local15 = (Class6_Sub8) this.aClass361_37.method7835(); local15 != null; local15 = (Class6_Sub8) this.aClass361_37.method7835()) {
			local15.anInt1018 = this.method4050();
			if (local15.anInt1017 == 0) {
				if (!this.aBooleanArray18[local15.anInt1013]) {
					@Pc(126) Class6_Sub8 local126 = new Class6_Sub8();
					local126.aChar1 = '\u0000';
					local126.anInt1018 = local15.anInt1018;
					local126.aLong29 = local15.aLong29;
					local126.anInt1013 = local15.anInt1013;
					local126.anInt1017 = 0;
					this.aClass361_36.method7833(local126);
					this.aBooleanArray18[local15.anInt1013] = true;
				}
				local15.anInt1017 = 2;
				this.aClass361_36.method7833(local15);
			} else if (local15.anInt1017 == 1) {
				if (this.aBooleanArray18[local15.anInt1013]) {
					this.aClass361_36.method7833(local15);
					this.aBooleanArray18[local15.anInt1013] = false;
				}
			} else if (local15.anInt1017 == -1) {
				for (@Pc(72) int local72 = 0; local72 < 112; local72++) {
					if (this.aBooleanArray18[local72]) {
						@Pc(83) Class6_Sub8 local83 = new Class6_Sub8();
						local83.anInt1018 = local15.anInt1018;
						local83.anInt1013 = local72;
						local83.aChar1 = '\u0000';
						local83.anInt1017 = 1;
						local83.aLong29 = local15.aLong29;
						this.aClass361_36.method7833(local83);
						this.aBooleanArray18[local72] = false;
					}
				}
			} else if (local15.anInt1017 == 3) {
				this.aClass361_36.method7833(local15);
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method4042(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray18[arg0] : false;
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)Lclient!fs;")
	@Override
	public Interface8 method4039() {
		return (Interface8) this.aClass361_36.method7835();
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
	private void method4043() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(27) int local27 = 0; local27 < 112; local27++) {
			this.aBooleanArray18[local27] = false;
		}
		this.aClass361_36.method7842();
		this.aClass361_37.method7842();
	}

	@OriginalMember(owner = "client!jfa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4049(0, arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(CIII)V")
	private void method4046(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class6_Sub8 local7 = new Class6_Sub8();
		local7.anInt1013 = arg1;
		local7.anInt1017 = arg2;
		local7.aChar1 = arg0;
		local7.aLong29 = Static8.method201();
		this.aClass361_37.method7833(local7);
	}

	@OriginalMember(owner = "client!jfa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4049(1, arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method4048(@OriginalArg(0) Component arg0) {
		this.method4043();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static426.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!jfa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static150.method2876(local6)) {
			this.method4046(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method4049(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static268.anIntArray600.length > local8) {
			local8 = Static268.anIntArray600[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4046('\u0000', local8, arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4046('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "(I)V")
	@Override
	public void method4040() {
		this.method4043();
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)I")
	private int method4050() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray18[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray18[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray18[86]) {
			local5 |= 0x2;
		}
		return local5;
	}
}
