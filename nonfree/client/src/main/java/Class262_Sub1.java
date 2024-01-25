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

@OriginalClass("client!rt")
public final class Class262_Sub1 extends Class262 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Lclient!su;")
	private final Class298 aClass298_167 = new Class298();

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "Lclient!su;")
	private final Class298 aClass298_168 = new Class298();

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "[Z")
	private final boolean[] aBooleanArray27 = new boolean[112];

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class262_Sub1(@OriginalArg(0) Component arg0) {
		Static99.method1441();
		this.method6385(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Lclient!gm;")
	@Override
	public Interface5 method6379() {
		return (Interface5) this.aClass298_167.method6811();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method6385(@OriginalArg(0) Component arg0) {
		this.method6390();
		this.aComponent4 = arg0;
		@Pc(13) Method local13 = Static508.aMethod1;
		if (local13 != null) {
			try {
				local13.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(28) Throwable local28) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBIC)V")
	private void method6386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char arg2) {
		@Pc(14) Class6_Sub47 local14 = new Class6_Sub47();
		local14.aChar4 = arg2;
		local14.anInt8675 = arg0;
		local14.anInt8671 = arg1;
		local14.aLong218 = Static416.method5922();
		this.aClass298_168.method6812(local14);
	}

	@OriginalMember(owner = "client!rt", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!rt", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static543.method7378(local6)) {
			this.method6386(-1, 3, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)I")
	private int method6388() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray27[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray27[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray27[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rt", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6391(1, arg0);
	}

	@OriginalMember(owner = "client!rt", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6386(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	private void method6390() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray27[local22] = false;
		}
		this.aClass298_167.method6808();
		this.aClass298_168.method6808();
	}

	@OriginalMember(owner = "client!rt", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6391(0, arg0);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method6382() {
		this.aClass298_167.method6808();
		for (@Pc(15) Class6_Sub47 local15 = (Class6_Sub47) this.aClass298_168.method6811(); local15 != null; local15 = (Class6_Sub47) this.aClass298_168.method6811()) {
			local15.anInt8669 = this.method6388();
			if (local15.anInt8671 == 0) {
				if (!this.aBooleanArray27[local15.anInt8675]) {
					@Pc(46) Class6_Sub47 local46 = new Class6_Sub47();
					local46.anInt8671 = 0;
					local46.aChar4 = '\u0000';
					local46.anInt8675 = local15.anInt8675;
					local46.aLong218 = local15.aLong218;
					local46.anInt8669 = local15.anInt8669;
					this.aClass298_167.method6812(local46);
					this.aBooleanArray27[local15.anInt8675] = true;
				}
				local15.anInt8671 = 2;
				this.aClass298_167.method6812(local15);
			} else if (local15.anInt8671 == 1) {
				if (this.aBooleanArray27[local15.anInt8675]) {
					this.aClass298_167.method6812(local15);
					this.aBooleanArray27[local15.anInt8675] = false;
				}
			} else if (local15.anInt8671 == -1) {
				for (@Pc(111) int local111 = 0; local111 < 112; local111++) {
					if (this.aBooleanArray27[local111]) {
						@Pc(122) Class6_Sub47 local122 = new Class6_Sub47();
						local122.aChar4 = '\u0000';
						local122.anInt8669 = local15.anInt8669;
						local122.aLong218 = local15.aLong218;
						local122.anInt8671 = 1;
						local122.anInt8675 = local111;
						this.aClass298_167.method6812(local122);
						this.aBooleanArray27[local111] = false;
					}
				}
			} else if (local15.anInt8671 == 3) {
				this.aClass298_167.method6812(local15);
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6381(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray27[arg0] : false;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
	private void method6391(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(14) int local14 = arg1.getKeyCode();
		if (local14 == 0) {
			local14 = 0;
		} else if (local14 >= 0 && local14 < Static390.anIntArray498.length) {
			local14 = Static390.anIntArray498[local14];
			if (arg0 == 0 && (local14 & 0x80) != 0) {
				local14 = 0;
			} else {
				local14 &= 0xFFFFFF7F;
			}
		} else {
			local14 = 0;
		}
		if (local14 != 0) {
			this.method6386(local14, arg0, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
	@Override
	public void method6384() {
		this.method6390();
	}
}
