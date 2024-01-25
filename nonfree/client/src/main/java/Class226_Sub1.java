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

@OriginalClass("client!sp")
public final class Class226_Sub1 extends Class226 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "Lclient!pf;")
	private Class141_Sub1 aClass141_Sub1_2;

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Lclient!pf;")
	private Class141_Sub1 aClass141_Sub1_3;

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "Lclient!pf;")
	private Class141_Sub1 aClass141_Sub1_4;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "[Z")
	private final boolean[] aBooleanArray22 = new boolean[112];

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class226_Sub1(@OriginalArg(0) Component arg0) {
		Static22.method464();
		this.method4984(arg0);
	}

	@OriginalMember(owner = "client!sp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method4984(@OriginalArg(1) Component arg0) {
		this.method4988();
		this.aComponent3 = arg0;
		@Pc(11) Method local11 = Static73.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4977(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray22[arg0] : false;
	}

	@OriginalMember(owner = "client!sp", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4989(0, arg0);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BCII)V")
	private void method4987(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class141_Sub1 local11 = new Class141_Sub1();
		local11.anInt5362 = arg2;
		local11.anInt5366 = arg1;
		local11.aChar3 = arg0;
		local11.aLong151 = Static21.method458();
		if (this.aClass141_Sub1_3 == null) {
			this.aClass141_Sub1_2 = local11;
		} else {
			this.aClass141_Sub1_3.aClass141_Sub1_1 = local11;
		}
		this.aClass141_Sub1_3 = local11;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4979() {
		for (@Pc(8) Class141_Sub1 local8 = this.aClass141_Sub1_2; local8 != null; local8 = local8.aClass141_Sub1_1) {
			if (local8.anInt5366 == 0) {
				if (local8.anInt5362 >= 0) {
					local8.aBoolean389 = !this.aBooleanArray22[local8.anInt5362];
				}
				this.aBooleanArray22[local8.anInt5362] = true;
			} else if (local8.anInt5366 == 1) {
				this.aBooleanArray22[local8.anInt5362] = false;
			} else if (local8.anInt5366 == -1) {
				for (@Pc(34) int local34 = 0; local34 < 112; local34++) {
					this.aBooleanArray22[local34] = false;
				}
			}
		}
		this.aClass141_Sub1_4 = this.aClass141_Sub1_2;
		this.aClass141_Sub1_3 = null;
		this.aClass141_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!sp", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static348.method3785(local6)) {
			this.method4987(local6, 2, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sp", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4989(1, arg0);
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)Lclient!kg;")
	@Override
	public Class141 method4981() {
		@Pc(13) Class141_Sub1 local13;
		for (local13 = this.aClass141_Sub1_4; local13 != null && local13.anInt5366 == -1; local13 = local13.aClass141_Sub1_1) {
		}
		if (local13 == null) {
			this.aClass141_Sub1_4 = null;
		} else {
			this.aClass141_Sub1_4 = local13.aClass141_Sub1_1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
	@Override
	public void method4983() {
		this.method4988();
	}

	@OriginalMember(owner = "client!sp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4987('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)V")
	private void method4988() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(30) int local30 = 0; local30 < 112; local30++) {
			this.aBooleanArray22[local30] = false;
		}
		this.aClass141_Sub1_2 = null;
		this.aClass141_Sub1_3 = null;
		this.aClass141_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method4989(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static156.anIntArray284.length > local8) {
			local8 = Static156.anIntArray284[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4987('\u0000', arg0, local8);
			arg1.consume();
		}
	}
}
