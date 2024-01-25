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

@OriginalClass("client!ff")
public final class Class97_Sub1 extends Class97 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "Lclient!gca;")
	private final Class111 aClass111_11 = new Class111();

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Lclient!gca;")
	private final Class111 aClass111_12 = new Class111();

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "[Z")
	private final boolean[] aBooleanArray13 = new boolean[112];

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class97_Sub1(@OriginalArg(0) Component arg0) {
		Static336.method5003();
		this.method2377(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2365(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray13[arg0] : false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BICI)V")
	private void method2373(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub42 local7 = new Class1_Sub42();
		local7.aChar5 = arg1;
		local7.anInt8022 = arg0;
		local7.anInt8023 = arg2;
		local7.aLong208 = Static480.method6650();
		this.aClass111_12.method2552(local7);
	}

	@OriginalMember(owner = "client!ff", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method2373(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2366() {
		this.aClass111_11.method2555();
		for (@Pc(23) Class1_Sub42 local23 = (Class1_Sub42) this.aClass111_12.method2553(); local23 != null; local23 = (Class1_Sub42) this.aClass111_12.method2553()) {
			local23.anInt8017 = this.method2376();
			if (local23.anInt8022 == 0) {
				if (!this.aBooleanArray13[local23.anInt8023]) {
					@Pc(43) Class1_Sub42 local43 = new Class1_Sub42();
					local43.aChar5 = '\u0000';
					local43.anInt8023 = local23.anInt8023;
					local43.anInt8022 = 0;
					local43.aLong208 = local23.aLong208;
					local43.anInt8017 = local23.anInt8017;
					this.aClass111_11.method2552(local43);
					this.aBooleanArray13[local23.anInt8023] = true;
				}
				local23.anInt8022 = 2;
				this.aClass111_11.method2552(local23);
			} else if (local23.anInt8022 == 1) {
				if (this.aBooleanArray13[local23.anInt8023]) {
					this.aClass111_11.method2552(local23);
					this.aBooleanArray13[local23.anInt8023] = false;
				}
			} else if (local23.anInt8022 == -1) {
				for (@Pc(95) int local95 = 0; local95 < 112; local95++) {
					if (this.aBooleanArray13[local95]) {
						@Pc(106) Class1_Sub42 local106 = new Class1_Sub42();
						local106.anInt8017 = local23.anInt8017;
						local106.anInt8022 = 1;
						local106.anInt8023 = local95;
						local106.aChar5 = '\u0000';
						local106.aLong208 = local23.aLong208;
						this.aClass111_11.method2552(local106);
						this.aBooleanArray13[local95] = false;
					}
				}
			} else if (local23.anInt8022 == 3) {
				this.aClass111_11.method2552(local23);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	private void method2375() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(27) int local27 = 0; local27 < 112; local27++) {
			this.aBooleanArray13[local27] = false;
		}
		this.aClass111_11.method2555();
		this.aClass111_12.method2555();
	}

	@OriginalMember(owner = "client!ff", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method2379(0, arg0);
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I")
	private int method2376() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray13[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray13[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray13[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method2377(@OriginalArg(1) Component arg0) {
		this.method2375();
		this.aComponent2 = arg0;
		@Pc(13) Method local13 = Static285.aMethod1;
		if (local13 != null) {
			try {
				local13.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(39) Throwable local39) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ff", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static508.method7111(local6)) {
			this.method2373(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
	private void method2379(@OriginalArg(0) int arg0, @OriginalArg(1) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static170.anIntArray147.length) {
			local8 = Static170.anIntArray147[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method2373(arg0, '\u0000', local8);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!ff", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Lclient!jo;")
	@Override
	public Interface14 method2370() {
		return (Interface14) this.aClass111_11.method2553();
	}

	@OriginalMember(owner = "client!ff", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method2379(1, arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	@Override
	public void method2367() {
		this.method2375();
	}
}
