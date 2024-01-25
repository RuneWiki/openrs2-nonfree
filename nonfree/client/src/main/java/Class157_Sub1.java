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

@OriginalClass("client!hn")
public final class Class157_Sub1 extends Class157 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "Lclient!ga;")
	private final Class124 aClass124_37 = new Class124();

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "Lclient!ga;")
	private final Class124 aClass124_38 = new Class124();

	@OriginalMember(owner = "client!hn", name = "E", descriptor = "[Z")
	private final boolean[] aBooleanArray7 = new boolean[112];

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class157_Sub1(@OriginalArg(0) Component arg0) {
		Static586.method8000();
		this.method3308(arg0);
	}

	@OriginalMember(owner = "client!hn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static246.method3500(local6)) {
			this.method3303(local6, 3, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(CIII)V")
	private void method3303(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub35 local12 = new Class5_Sub35();
		local12.anInt6311 = arg2;
		local12.aChar5 = arg0;
		local12.anInt6307 = arg1;
		local12.aLong180 = Static124.method1947();
		this.aClass124_38.method2574(local12);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method3305(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static649.anIntArray593.length) {
			local8 = Static649.anIntArray593[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method3303('\u0000', arg1, local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	private void method3306() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray7[local26] = false;
		}
		this.aClass124_37.method2567();
		this.aClass124_38.method2567();
	}

	@OriginalMember(owner = "client!hn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3305(arg0, 1);
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	@Override
	public void method3301() {
		this.method3306();
	}

	@OriginalMember(owner = "client!hn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3303('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I")
	private int method3307() {
		@Pc(13) int local13 = 0;
		if (this.aBooleanArray7[81]) {
			local13 = 1;
		}
		if (this.aBooleanArray7[82]) {
			local13 |= 0x4;
		}
		if (this.aBooleanArray7[86]) {
			local13 |= 0x2;
		}
		return local13;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3302() {
		this.aClass124_37.method2567();
		for (@Pc(18) Class5_Sub35 local18 = (Class5_Sub35) this.aClass124_38.method2571(); local18 != null; local18 = (Class5_Sub35) this.aClass124_38.method2571()) {
			local18.anInt6310 = this.method3307();
			if (local18.anInt6307 == 0) {
				if (!this.aBooleanArray7[local18.anInt6311]) {
					@Pc(126) Class5_Sub35 local126 = new Class5_Sub35();
					local126.anInt6307 = 0;
					local126.anInt6311 = local18.anInt6311;
					local126.aChar5 = '\u0000';
					local126.anInt6310 = local18.anInt6310;
					local126.aLong180 = local18.aLong180;
					this.aClass124_37.method2574(local126);
					this.aBooleanArray7[local18.anInt6311] = true;
				}
				local18.anInt6307 = 2;
				this.aClass124_37.method2574(local18);
			} else if (local18.anInt6307 == 1) {
				if (this.aBooleanArray7[local18.anInt6311]) {
					this.aClass124_37.method2574(local18);
					this.aBooleanArray7[local18.anInt6311] = false;
				}
			} else if (local18.anInt6307 == -1) {
				for (@Pc(61) int local61 = 0; local61 < 112; local61++) {
					if (this.aBooleanArray7[local61]) {
						@Pc(72) Class5_Sub35 local72 = new Class5_Sub35();
						local72.anInt6307 = 1;
						local72.aChar5 = '\u0000';
						local72.anInt6311 = local61;
						local72.anInt6310 = local18.anInt6310;
						local72.aLong180 = local18.aLong180;
						this.aClass124_37.method2574(local72);
						this.aBooleanArray7[local61] = false;
					}
				}
			} else if (local18.anInt6307 == 3) {
				this.aClass124_37.method2574(local18);
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method3308(@OriginalArg(0) Component arg0) {
		this.method3306();
		this.aComponent3 = arg0;
		@Pc(11) Method local11 = Static308.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3300(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray7[arg0] : false;
	}

	@OriginalMember(owner = "client!hn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)Lclient!nfa;")
	@Override
	public Interface18 method3298() {
		return (Interface18) this.aClass124_37.method2571();
	}

	@OriginalMember(owner = "client!hn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3305(arg0, 0);
	}
}
