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

@OriginalClass("client!gb")
public final class Class115_Sub1 extends Class115 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!tg;")
	private final Class330 aClass330_11 = new Class330();

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "Lclient!tg;")
	private final Class330 aClass330_12 = new Class330();

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "[Z")
	private final boolean[] aBooleanArray6 = new boolean[112];

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class115_Sub1(@OriginalArg(0) Component arg0) {
		Static644.method9023();
		this.method2499(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
	private void method2494() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray6[local28] = false;
		}
		this.aClass330_11.method7910();
		this.aClass330_12.method7910();
	}

	@OriginalMember(owner = "client!gb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2496(arg0, 1);
	}

	@OriginalMember(owner = "client!gb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2496(arg0, 0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method2496(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static180.anIntArray176.length) {
			local8 = Static180.anIntArray176[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method2498(arg1, '\u0000', local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	@Override
	public void method2489() {
		this.method2494();
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)I")
	private int method2497() {
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

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ICII)V")
	private void method2498(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class5_Sub47 local7 = new Class5_Sub47();
		local7.anInt8879 = arg2;
		local7.aChar5 = arg1;
		local7.anInt8876 = arg0;
		local7.aLong220 = Static95.method1587();
		this.aClass330_12.method7917(local7);
	}

	@OriginalMember(owner = "client!gb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static71.method1204(local6)) {
			this.method2498(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method2493() {
		this.aClass330_11.method7910();
		for (@Pc(15) Class5_Sub47 local15 = (Class5_Sub47) this.aClass330_12.method7911(); local15 != null; local15 = (Class5_Sub47) this.aClass330_12.method7911()) {
			local15.anInt8874 = this.method2497();
			if (local15.anInt8876 == 0) {
				if (!this.aBooleanArray6[local15.anInt8879]) {
					@Pc(125) Class5_Sub47 local125 = new Class5_Sub47();
					local125.aChar5 = '\u0000';
					local125.anInt8876 = 0;
					local125.anInt8874 = local15.anInt8874;
					local125.aLong220 = local15.aLong220;
					local125.anInt8879 = local15.anInt8879;
					this.aClass330_11.method7917(local125);
					this.aBooleanArray6[local15.anInt8879] = true;
				}
				local15.anInt8876 = 2;
				this.aClass330_11.method7917(local15);
			} else if (local15.anInt8876 == 1) {
				if (this.aBooleanArray6[local15.anInt8879]) {
					this.aClass330_11.method7917(local15);
					this.aBooleanArray6[local15.anInt8879] = false;
				}
			} else if (local15.anInt8876 == -1) {
				for (@Pc(50) int local50 = 0; local50 < 112; local50++) {
					if (this.aBooleanArray6[local50]) {
						@Pc(61) Class5_Sub47 local61 = new Class5_Sub47();
						local61.anInt8874 = local15.anInt8874;
						local61.aChar5 = '\u0000';
						local61.anInt8879 = local50;
						local61.anInt8876 = 1;
						local61.aLong220 = local15.aLong220;
						this.aClass330_11.method7917(local61);
						this.aBooleanArray6[local50] = false;
					}
				}
			} else if (local15.anInt8876 == 3) {
				this.aClass330_11.method7917(local15);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method2499(@OriginalArg(1) Component arg0) {
		this.method2494();
		this.aComponent2 = arg0;
		@Pc(16) Method local16 = Static144.aMethod1;
		if (local16 != null) {
			try {
				local16.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!gb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2498(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lclient!ao;")
	@Override
	public Interface1 method2491() {
		return (Interface1) this.aClass330_11.method7911();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2490(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray6[arg0] : false;
	}
}
