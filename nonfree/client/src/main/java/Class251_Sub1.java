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

@OriginalClass("client!pda")
public final class Class251_Sub1 extends Class251 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!pda", name = "D", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!pda", name = "A", descriptor = "Lclient!ada;")
	private final Class8 aClass8_53 = new Class8();

	@OriginalMember(owner = "client!pda", name = "C", descriptor = "Lclient!ada;")
	private final Class8 aClass8_54 = new Class8();

	@OriginalMember(owner = "client!pda", name = "E", descriptor = "[Z")
	private final boolean[] aBooleanArray42 = new boolean[112];

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class251_Sub1(@OriginalArg(0) Component arg0) {
		Static451.method6944();
		this.method6719(arg0);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method6719(@OriginalArg(0) Component arg0) {
		this.method6720();
		this.aComponent4 = arg0;
		@Pc(11) Method local11 = Static177.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!pda", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!pda", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static169.method3109(local6)) {
			this.method6725(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
	@Override
	public void method6713() {
		this.method6720();
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
	private void method6720() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(27) int local27 = 0; local27 < 112; local27++) {
			this.aBooleanArray42[local27] = false;
		}
		this.aClass8_53.method154();
		this.aClass8_54.method154();
	}

	@OriginalMember(owner = "client!pda", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method6723(arg0, 1);
	}

	@OriginalMember(owner = "client!pda", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method6723(arg0, 0);
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)I")
	private int method6722() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray42[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray42[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray42[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IZ)V")
	private void method6723(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static631.anIntArray636.length > local8) {
			local8 = Static631.anIntArray636[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method6725(arg1, '\u0000', local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method6711() {
		this.aClass8_53.method154();
		for (@Pc(20) Class6_Sub26 local20 = (Class6_Sub26) this.aClass8_54.method152(); local20 != null; local20 = (Class6_Sub26) this.aClass8_54.method152()) {
			local20.anInt4781 = this.method6722();
			if (local20.anInt4782 == 0) {
				if (!this.aBooleanArray42[local20.anInt4773]) {
					@Pc(126) Class6_Sub26 local126 = new Class6_Sub26();
					local126.aChar2 = '\u0000';
					local126.aLong123 = local20.aLong123;
					local126.anInt4781 = local20.anInt4781;
					local126.anInt4773 = local20.anInt4773;
					local126.anInt4782 = 0;
					this.aClass8_53.method157(local126);
					this.aBooleanArray42[local20.anInt4773] = true;
				}
				local20.anInt4782 = 2;
				this.aClass8_53.method157(local20);
			} else if (local20.anInt4782 == 1) {
				if (this.aBooleanArray42[local20.anInt4773]) {
					this.aClass8_53.method157(local20);
					this.aBooleanArray42[local20.anInt4773] = false;
				}
			} else if (local20.anInt4782 == -1) {
				for (@Pc(40) int local40 = 0; local40 < 112; local40++) {
					if (this.aBooleanArray42[local40]) {
						@Pc(51) Class6_Sub26 local51 = new Class6_Sub26();
						local51.anInt4773 = local40;
						local51.aLong123 = local20.aLong123;
						local51.anInt4782 = 1;
						local51.anInt4781 = local20.anInt4781;
						local51.aChar2 = '\u0000';
						this.aClass8_53.method157(local51);
						this.aBooleanArray42[local40] = false;
					}
				}
			} else if (local20.anInt4782 == 3) {
				this.aClass8_53.method157(local20);
			}
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method6712(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray42[arg0] : false;
	}

	@OriginalMember(owner = "client!pda", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method6725(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IICI)V")
	private void method6725(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class6_Sub26 local7 = new Class6_Sub26();
		local7.anInt4773 = arg2;
		local7.anInt4782 = arg0;
		local7.aChar2 = arg1;
		local7.aLong123 = Static32.method595();
		this.aClass8_54.method157(local7);
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Lclient!oc;")
	@Override
	public Interface18 method6714() {
		return (Interface18) this.aClass8_53.method152();
	}
}
