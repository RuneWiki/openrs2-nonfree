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

@OriginalClass("client!bo")
public final class Class4_Sub1 extends Class4 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!v;")
	private final Class362 aClass362_5 = new Class362();

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "Lclient!v;")
	private final Class362 aClass362_6 = new Class362();

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "[Z")
	private final boolean[] aBooleanArray3 = new boolean[112];

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class4_Sub1(@OriginalArg(0) Component arg0) {
		Static15.method461();
		this.method1030(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	@Override
	public void method1021() {
		this.method1032();
	}

	@OriginalMember(owner = "client!bo", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method1028(arg0, 1);
	}

	@OriginalMember(owner = "client!bo", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method1026('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(CIBI)V")
	private void method1026(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class6_Sub12 local15 = new Class6_Sub12();
		local15.anInt1733 = arg1;
		local15.aChar1 = arg0;
		local15.anInt1734 = arg2;
		local15.aLong52 = Static566.method7936();
		this.aClass362_6.method8536(local15);
	}

	@OriginalMember(owner = "client!bo", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static313.method4499(local6)) {
			this.method1026(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)I")
	private int method1027() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray3[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray3[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray3[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1023() {
		this.aClass362_5.method8543();
		for (@Pc(21) Class6_Sub12 local21 = (Class6_Sub12) this.aClass362_6.method8531(); local21 != null; local21 = (Class6_Sub12) this.aClass362_6.method8531()) {
			local21.anInt1728 = this.method1027();
			if (local21.anInt1734 == 0) {
				if (!this.aBooleanArray3[local21.anInt1733]) {
					@Pc(133) Class6_Sub12 local133 = new Class6_Sub12();
					local133.aChar1 = '\u0000';
					local133.anInt1728 = local21.anInt1728;
					local133.aLong52 = local21.aLong52;
					local133.anInt1734 = 0;
					local133.anInt1733 = local21.anInt1733;
					this.aClass362_5.method8536(local133);
					this.aBooleanArray3[local21.anInt1733] = true;
				}
				local21.anInt1734 = 2;
				this.aClass362_5.method8536(local21);
			} else if (local21.anInt1734 == 1) {
				if (this.aBooleanArray3[local21.anInt1733]) {
					this.aClass362_5.method8536(local21);
					this.aBooleanArray3[local21.anInt1733] = false;
				}
			} else if (local21.anInt1734 == -1) {
				for (@Pc(66) int local66 = 0; local66 < 112; local66++) {
					if (this.aBooleanArray3[local66]) {
						@Pc(77) Class6_Sub12 local77 = new Class6_Sub12();
						local77.aChar1 = '\u0000';
						local77.aLong52 = local21.aLong52;
						local77.anInt1733 = local66;
						local77.anInt1734 = 1;
						local77.anInt1728 = local21.anInt1728;
						this.aClass362_5.method8536(local77);
						this.aBooleanArray3[local66] = false;
					}
				}
			} else if (local21.anInt1734 == 3) {
				this.aClass362_5.method8536(local21);
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;I)V")
	private void method1028(@OriginalArg(1) KeyEvent arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static332.anIntArray512.length > local8) {
			local8 = Static332.anIntArray512[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method1026('\u0000', local8, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Lclient!oj;")
	@Override
	public Interface20 method1025() {
		return (Interface20) this.aClass362_5.method8531();
	}

	@OriginalMember(owner = "client!bo", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1024(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray3[arg0] : false;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method1030(@OriginalArg(0) Component arg0) {
		this.method1032();
		this.aComponent1 = arg0;
		@Pc(15) Method local15 = Static647.aMethod1;
		if (local15 != null) {
			try {
				local15.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V")
	private void method1032() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray3[local22] = false;
		}
		this.aClass362_5.method8543();
		this.aClass362_6.method8543();
	}

	@OriginalMember(owner = "client!bo", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method1028(arg0, 0);
	}
}
