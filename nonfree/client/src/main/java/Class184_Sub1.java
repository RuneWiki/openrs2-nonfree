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

@OriginalClass("client!naa")
public final class Class184_Sub1 extends Class184 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "Lclient!cga;")
	private final Class60 aClass60_134 = new Class60();

	@OriginalMember(owner = "client!naa", name = "k", descriptor = "Lclient!cga;")
	private final Class60 aClass60_135 = new Class60();

	@OriginalMember(owner = "client!naa", name = "q", descriptor = "[Z")
	private boolean[] aBooleanArray31 = new boolean[112];

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class184_Sub1(@OriginalArg(0) Component arg0) {
		Static285.method3986();
		this.method6062(arg0);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method6059(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static201.anIntArray262.length > local8) {
			local8 = Static201.anIntArray262[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method6066(arg1, '\u0000', local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!naa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static647.method8753(local6)) {
			this.method6066(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6054() {
		this.aClass60_134.method1223();
		for (@Pc(23) Class2_Sub57 local23 = (Class2_Sub57) this.aClass60_135.method1225(); local23 != null; local23 = (Class2_Sub57) this.aClass60_135.method1225()) {
			local23.anInt10949 = this.method6061();
			if (local23.anInt10947 == 0) {
				if (!this.aBooleanArray31[local23.anInt10950]) {
					@Pc(50) Class2_Sub57 local50 = new Class2_Sub57();
					local50.anInt10947 = 0;
					local50.aLong349 = local23.aLong349;
					local50.anInt10950 = local23.anInt10950;
					local50.anInt10949 = local23.anInt10949;
					local50.aChar7 = '\u0000';
					this.aClass60_134.method1233(local50);
					this.aBooleanArray31[local23.anInt10950] = true;
				}
				local23.anInt10947 = 2;
				this.aClass60_134.method1233(local23);
			} else if (local23.anInt10947 == 1) {
				if (this.aBooleanArray31[local23.anInt10950]) {
					this.aClass60_134.method1233(local23);
					this.aBooleanArray31[local23.anInt10950] = false;
				}
			} else if (local23.anInt10947 == -1) {
				for (@Pc(150) int local150 = 0; local150 < 112; local150++) {
					if (this.aBooleanArray31[local150]) {
						@Pc(163) Class2_Sub57 local163 = new Class2_Sub57();
						local163.anInt10947 = 1;
						local163.aLong349 = local23.aLong349;
						local163.anInt10950 = local150;
						local163.anInt10949 = local23.anInt10949;
						local163.aChar7 = '\u0000';
						this.aClass60_134.method1233(local163);
						this.aBooleanArray31[local150] = false;
					}
				}
			} else if (local23.anInt10947 == 3) {
				this.aClass60_134.method1233(local23);
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6059(arg0, 0);
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)I")
	private int method6061() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray31[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray31[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray31[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!naa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method6062(@OriginalArg(1) Component arg0) {
		this.method6065();
		this.aComponent4 = arg0;
		@Pc(18) Method local18 = Static688.aMethod2;
		if (local18 != null) {
			try {
				local18.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(33) Throwable local33) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!naa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6059(arg0, 1);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)Lclient!rfa;")
	@Override
	public Interface21 method6053() {
		return (Interface21) this.aClass60_134.method1225();
	}

	@OriginalMember(owner = "client!naa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6066(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V")
	@Override
	public void method6057() {
		this.method6065();
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6058(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray31[arg0] : false;
	}

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "(Z)V")
	private void method6065() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(23) int local23 = 0; local23 < 112; local23++) {
			this.aBooleanArray31[local23] = false;
		}
		if (false) {
			this.aBooleanArray31 = null;
		}
		this.aClass60_134.method1223();
		this.aClass60_135.method1223();
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ICII)V")
	private void method6066(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub57 local7 = new Class2_Sub57();
		local7.aChar7 = arg1;
		local7.anInt10947 = arg0;
		local7.anInt10950 = arg2;
		local7.aLong349 = Static567.method7863();
		this.aClass60_135.method1233(local7);
	}
}
