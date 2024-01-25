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

@OriginalClass("client!pd")
public final class Class193_Sub1 extends Class193 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "Lclient!ki;")
	private final Class183 aClass183_48 = new Class183();

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "Lclient!ki;")
	private final Class183 aClass183_49 = new Class183();

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "[Z")
	private final boolean[] aBooleanArray29 = new boolean[112];

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class193_Sub1(@OriginalArg(0) Component arg0) {
		Static377.method6098();
		this.method6337(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static388.method6203(local6)) {
			this.method6336(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6336(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!pd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6333(1, arg0);
	}

	@OriginalMember(owner = "client!pd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6333(0, arg0);
	}

	@OriginalMember(owner = "client!pd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6323(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray29[arg0] : false;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
	private int method6332() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray29[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray29[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray29[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZILjava/awt/event/KeyEvent;)V")
	private void method6333(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(12) int local12 = arg1.getKeyCode();
		if (local12 == 0) {
			local12 = 0;
		} else if (local12 >= 0 && Static174.anIntArray233.length > local12) {
			local12 = Static174.anIntArray233[local12];
			if (arg0 == 0 && (local12 & 0x80) != 0) {
				local12 = 0;
			} else {
				local12 &= 0xFFFFFF7F;
			}
		} else {
			local12 = 0;
		}
		if (local12 != 0) {
			this.method6336(local12, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	@Override
	public void method6325() {
		this.method6335();
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	private void method6335() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(20) int local20 = 0; local20 < 112; local20++) {
			this.aBooleanArray29[local20] = false;
		}
		this.aClass183_48.method4790();
		this.aClass183_49.method4790();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method6329() {
		this.aClass183_48.method4790();
		for (@Pc(20) Class3_Sub34 local20 = (Class3_Sub34) this.aClass183_49.method4797(); local20 != null; local20 = (Class3_Sub34) this.aClass183_49.method4797()) {
			local20.anInt6090 = this.method6332();
			if (local20.anInt6086 == 0) {
				if (!this.aBooleanArray29[local20.anInt6087]) {
					@Pc(43) Class3_Sub34 local43 = new Class3_Sub34();
					local43.aLong170 = local20.aLong170;
					local43.anInt6090 = local20.anInt6090;
					local43.anInt6087 = local20.anInt6087;
					local43.anInt6086 = 0;
					local43.aChar2 = '\u0000';
					this.aClass183_48.method4792(local43);
					this.aBooleanArray29[local20.anInt6087] = true;
				}
				local20.anInt6086 = 2;
				this.aClass183_48.method4792(local20);
			} else if (local20.anInt6086 == 1) {
				if (this.aBooleanArray29[local20.anInt6087]) {
					this.aClass183_48.method4792(local20);
					this.aBooleanArray29[local20.anInt6087] = false;
				}
			} else if (local20.anInt6086 == -1) {
				for (@Pc(118) int local118 = 0; local118 < 112; local118++) {
					if (this.aBooleanArray29[local118]) {
						@Pc(129) Class3_Sub34 local129 = new Class3_Sub34();
						local129.anInt6087 = local118;
						local129.anInt6090 = local20.anInt6090;
						local129.anInt6086 = 1;
						local129.aChar2 = '\u0000';
						local129.aLong170 = local20.aLong170;
						this.aClass183_48.method4792(local129);
						this.aBooleanArray29[local118] = false;
					}
				}
			} else if (local20.anInt6086 == 3) {
				this.aClass183_48.method4792(local20);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ICII)V")
	private void method6336(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub34 local7 = new Class3_Sub34();
		local7.anInt6087 = arg0;
		local7.anInt6086 = arg2;
		local7.aChar2 = arg1;
		local7.aLong170 = Static376.method6088();
		this.aClass183_49.method4792(local7);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method6337(@OriginalArg(0) Component arg0) {
		this.method6335();
		this.aComponent2 = arg0;
		@Pc(16) Method local16 = Static530.aMethod2;
		if (local16 != null) {
			try {
				local16.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Lclient!vr;")
	@Override
	public Interface23 method6324() {
		return (Interface23) this.aClass183_48.method4797();
	}
}
