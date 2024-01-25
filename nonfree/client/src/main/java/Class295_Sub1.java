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

@OriginalClass("client!wd")
public final class Class295_Sub1 extends Class295 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!wba;")
	private final Class353 aClass353_65 = new Class353();

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!wba;")
	private final Class353 aClass353_66 = new Class353();

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "[Z")
	private final boolean[] aBooleanArray26 = new boolean[112];

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class295_Sub1(@OriginalArg(0) Component arg0) {
		Static320.method3903();
		this.method7725(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZI)Z")
	@Override
	public boolean method7719(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray26[arg0] : false;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
	@Override
	public void method7718() {
		this.method7723();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method7715() {
		this.aClass353_65.method7680();
		for (@Pc(21) Class1_Sub33 local21 = (Class1_Sub33) this.aClass353_66.method7688(); local21 != null; local21 = (Class1_Sub33) this.aClass353_66.method7688()) {
			local21.anInt5471 = this.method7721();
			if (local21.anInt5473 == 0) {
				if (!this.aBooleanArray26[local21.anInt5468]) {
					@Pc(41) Class1_Sub33 local41 = new Class1_Sub33();
					local41.anInt5473 = 0;
					local41.anInt5471 = local21.anInt5471;
					local41.aChar3 = '\u0000';
					local41.anInt5468 = local21.anInt5468;
					local41.aLong180 = local21.aLong180;
					this.aClass353_65.method7679(local41);
					this.aBooleanArray26[local21.anInt5468] = true;
				}
				local21.anInt5473 = 2;
				this.aClass353_65.method7679(local21);
			} else if (local21.anInt5473 == 1) {
				if (this.aBooleanArray26[local21.anInt5468]) {
					this.aClass353_65.method7679(local21);
					this.aBooleanArray26[local21.anInt5468] = false;
				}
			} else if (local21.anInt5473 == -1) {
				for (@Pc(93) int local93 = 0; local93 < 112; local93++) {
					if (this.aBooleanArray26[local93]) {
						@Pc(104) Class1_Sub33 local104 = new Class1_Sub33();
						local104.aChar3 = '\u0000';
						local104.anInt5473 = 1;
						local104.anInt5468 = local93;
						local104.anInt5471 = local21.anInt5471;
						local104.aLong180 = local21.aLong180;
						this.aClass353_65.method7679(local104);
						this.aBooleanArray26[local93] = false;
					}
				}
			} else if (local21.anInt5473 == 3) {
				this.aClass353_65.method7679(local21);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static173.method2436(local6)) {
			this.method7722(local6, 3, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I")
	private int method7721() {
		@Pc(10) int local10 = 0;
		if (this.aBooleanArray26[81]) {
			local10 = 1;
		}
		if (this.aBooleanArray26[82]) {
			local10 |= 0x4;
		}
		if (this.aBooleanArray26[86]) {
			local10 |= 0x2;
		}
		return local10;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BCII)V")
	private void method7722(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub33 local7 = new Class1_Sub33();
		local7.anInt5473 = arg1;
		local7.aChar3 = arg0;
		local7.anInt5468 = arg2;
		local7.aLong180 = Static413.method5668();
		this.aClass353_66.method7679(local7);
	}

	@OriginalMember(owner = "client!wd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method7724(0, arg0);
	}

	@OriginalMember(owner = "client!wd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method7722('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!wd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method7724(1, arg0);
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V")
	private void method7723() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeKeyListener(this);
		this.aComponent5.removeFocusListener(this);
		this.aComponent5 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray26[local28] = false;
		}
		this.aClass353_65.method7680();
		this.aClass353_66.method7680();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method7724(@OriginalArg(0) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static470.anIntArray619.length > local8) {
			local8 = Static470.anIntArray619[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method7722('\u0000', arg0, local8);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method7725(@OriginalArg(1) Component arg0) {
		this.method7723();
		this.aComponent5 = arg0;
		@Pc(19) Method local19 = Static148.aMethod1;
		if (local19 != null) {
			try {
				local19.invoke(this.aComponent5, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent5.addKeyListener(this);
		this.aComponent5.addFocusListener(this);
	}

	@OriginalMember(owner = "client!wd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lclient!vr;")
	@Override
	public Interface22 method7720() {
		return (Interface22) this.aClass353_65.method7688();
	}
}
