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

@OriginalClass("client!fm")
public final class Class80_Sub1 extends Class80 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "Lclient!nv;")
	private final Class177 aClass177_12 = new Class177();

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Lclient!nv;")
	private final Class177 aClass177_14 = new Class177();

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray6 = new boolean[112];

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class80_Sub1(@OriginalArg(0) Component arg0) {
		Static8.method145();
		this.method1736(arg0);
	}

	@OriginalMember(owner = "client!fm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	@Override
	public void method1726() {
		this.method1734();
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)I")
	private int method1730() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray6[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray6[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray6[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
	private void method1732(@OriginalArg(0) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0.getKeyCode();
		if (local12 == 0) {
			local12 = 0;
		} else if (local12 >= 0 && local12 < Static133.anIntArray129.length) {
			local12 = Static133.anIntArray129[local12];
			if (arg1 == 0 && (local12 & 0x80) != 0) {
				local12 = 0;
			} else {
				local12 &= 0xFFFFFF7F;
			}
		} else {
			local12 = 0;
		}
		if (local12 != 0) {
			this.method1737('\u0000', local12, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1729() {
		this.aClass177_12.method3614();
		for (@Pc(21) Class5_Sub12 local21 = (Class5_Sub12) this.aClass177_14.method3621(); local21 != null; local21 = (Class5_Sub12) this.aClass177_14.method3621()) {
			local21.anInt1541 = this.method1730();
			if (local21.anInt1542 == 0) {
				if (!this.aBooleanArray6[local21.anInt1535]) {
					@Pc(135) Class5_Sub12 local135 = new Class5_Sub12();
					local135.anInt1542 = 0;
					local135.anInt1541 = local21.anInt1541;
					local135.anInt1535 = local21.anInt1535;
					local135.aLong56 = local21.aLong56;
					local135.aChar2 = '\u0000';
					this.aClass177_12.method3615(local135);
					this.aBooleanArray6[local21.anInt1535] = true;
				}
				local21.anInt1542 = 2;
				this.aClass177_12.method3615(local21);
			} else if (local21.anInt1542 == 1) {
				if (this.aBooleanArray6[local21.anInt1535]) {
					this.aClass177_12.method3615(local21);
					this.aBooleanArray6[local21.anInt1535] = false;
				}
			} else if (local21.anInt1542 == -1) {
				for (@Pc(47) int local47 = 0; local47 < 112; local47++) {
					if (this.aBooleanArray6[local47]) {
						@Pc(58) Class5_Sub12 local58 = new Class5_Sub12();
						local58.anInt1541 = local21.anInt1541;
						local58.aLong56 = local21.aLong56;
						local58.anInt1535 = local47;
						local58.anInt1542 = 1;
						local58.aChar2 = '\u0000';
						this.aClass177_12.method3615(local58);
						this.aBooleanArray6[local47] = false;
					}
				}
			} else if (local21.anInt1542 == 3) {
				this.aClass177_12.method3615(local21);
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1732(arg0, 1);
	}

	@OriginalMember(owner = "client!fm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1732(arg0, 0);
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
	private void method1734() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(20) int local20 = 0; local20 < 112; local20++) {
			this.aBooleanArray6[local20] = false;
		}
		this.aClass177_12.method3614();
		this.aClass177_14.method3614();
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Lclient!md;")
	@Override
	public Interface10 method1725() {
		return (Interface10) this.aClass177_12.method3621();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1723(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray6[arg0] : false;
	}

	@OriginalMember(owner = "client!fm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1737('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method1736(@OriginalArg(0) Component arg0) {
		this.method1734();
		this.aComponent2 = arg0;
		@Pc(15) Method local15 = Static144.aMethod1;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(CIZI)V")
	private void method1737(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class5_Sub12 local7 = new Class5_Sub12();
		local7.anInt1542 = arg2;
		local7.aChar2 = arg0;
		local7.anInt1535 = arg1;
		local7.aLong56 = Static446.method5903();
		this.aClass177_14.method3615(local7);
	}

	@OriginalMember(owner = "client!fm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static379.method3490(local6)) {
			this.method1737(local6, -1, 3);
			arg0.consume();
		}
	}
}
