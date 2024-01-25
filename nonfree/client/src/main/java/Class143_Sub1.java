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

@OriginalClass("client!tq")
public final class Class143_Sub1 extends Class143 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!tq", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Lclient!ps;")
	private final Class193 aClass193_63 = new Class193();

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "Lclient!ps;")
	private final Class193 aClass193_64 = new Class193();

	@OriginalMember(owner = "client!tq", name = "C", descriptor = "[Z")
	private final boolean[] aBooleanArray25 = new boolean[112];

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class143_Sub1(@OriginalArg(0) Component arg0) {
		Static245.method3509();
		this.method5479(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
	private int method5476() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray25[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray25[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray25[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)V")
	private void method5478() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray25[local26] = false;
		}
		this.aClass193_63.method4524();
		this.aClass193_64.method4524();
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	@Override
	public void method5472() {
		this.method5478();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5479(@OriginalArg(0) Component arg0) {
		this.method5478();
		this.aComponent4 = arg0;
		@Pc(17) Method local17 = Static75.aMethod2;
		if (local17 != null) {
			try {
				local17.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method5473() {
		this.aClass193_63.method4524();
		for (@Pc(23) Class3_Sub6 local23 = (Class3_Sub6) this.aClass193_64.method4521(); local23 != null; local23 = (Class3_Sub6) this.aClass193_64.method4521()) {
			local23.anInt392 = this.method5476();
			if (local23.anInt396 == 0) {
				if (!this.aBooleanArray25[local23.anInt389]) {
					@Pc(46) Class3_Sub6 local46 = new Class3_Sub6();
					local46.aLong18 = local23.aLong18;
					local46.anInt389 = local23.anInt389;
					local46.aChar1 = '\u0000';
					local46.anInt396 = 0;
					local46.anInt392 = local23.anInt392;
					this.aClass193_63.method4527(local46);
					this.aBooleanArray25[local23.anInt389] = true;
				}
				local23.anInt396 = 2;
				this.aClass193_63.method4527(local23);
			} else if (local23.anInt396 == 1) {
				if (this.aBooleanArray25[local23.anInt389]) {
					this.aClass193_63.method4527(local23);
					this.aBooleanArray25[local23.anInt389] = false;
				}
			} else if (local23.anInt396 == -1) {
				for (@Pc(97) int local97 = 0; local97 < 112; local97++) {
					if (this.aBooleanArray25[local97]) {
						@Pc(108) Class3_Sub6 local108 = new Class3_Sub6();
						local108.anInt396 = 1;
						local108.anInt392 = local23.anInt392;
						local108.aLong18 = local23.aLong18;
						local108.aChar1 = '\u0000';
						local108.anInt389 = local97;
						this.aClass193_63.method4527(local108);
						this.aBooleanArray25[local97] = false;
					}
				}
			} else if (local23.anInt396 == 3) {
				this.aClass193_63.method4527(local23);
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5482(0, arg0);
	}

	@OriginalMember(owner = "client!tq", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static216.method3200(local6)) {
			this.method5483(-1, local6, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Lclient!iq;")
	@Override
	public Interface3 method5470() {
		return (Interface3) this.aClass193_63.method4521();
	}

	@OriginalMember(owner = "client!tq", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5482(1, arg0);
	}

	@OriginalMember(owner = "client!tq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5483(0, '\u0000', -1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method5482(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static161.anIntArray383.length > local8) {
			local8 = Static161.anIntArray383[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method5483(local8, '\u0000', arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ICII)V")
	private void method5483(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class3_Sub6 local10 = new Class3_Sub6();
		local10.anInt389 = arg0;
		local10.anInt396 = arg2;
		local10.aChar1 = arg1;
		local10.aLong18 = Static354.method4966();
		this.aClass193_64.method4527(local10);
	}

	@OriginalMember(owner = "client!tq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method5471(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray25[arg0] : false;
	}
}
