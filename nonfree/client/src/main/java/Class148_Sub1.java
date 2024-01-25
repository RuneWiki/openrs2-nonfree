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

@OriginalClass("client!hca")
public final class Class148_Sub1 extends Class148 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!hca", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!hca", name = "v", descriptor = "Lclient!tf;")
	private final Class340 aClass340_28 = new Class340();

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "Lclient!tf;")
	private final Class340 aClass340_29 = new Class340();

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "[Z")
	private final boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class148_Sub1(@OriginalArg(0) Component arg0) {
		Static618.method8506();
		this.method3958(arg0);
	}

	@OriginalMember(owner = "client!hca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static632.method8584(local6)) {
			this.method3964(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)I")
	private int method3956() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray11[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray11[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray11[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3963(arg0, 0);
	}

	@OriginalMember(owner = "client!hca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3964('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3958(@OriginalArg(0) Component arg0) {
		this.method3960();
		this.aComponent1 = arg0;
		@Pc(11) Method local11 = Static174.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent1, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent1.addKeyListener(this);
		this.aComponent1.addFocusListener(this);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Lclient!m;")
	@Override
	public Interface17 method3953() {
		return (Interface17) this.aClass340_28.method8127();
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V")
	private void method3960() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeKeyListener(this);
		this.aComponent1.removeFocusListener(this);
		this.aComponent1 = null;
		for (@Pc(31) int local31 = 0; local31 < 112; local31++) {
			this.aBooleanArray11[local31] = false;
		}
		this.aClass340_28.method8129();
		this.aClass340_29.method8129();
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method3950() {
		this.aClass340_28.method8129();
		for (@Pc(20) Class6_Sub55 local20 = (Class6_Sub55) this.aClass340_29.method8127(); local20 != null; local20 = (Class6_Sub55) this.aClass340_29.method8127()) {
			local20.anInt10378 = this.method3956();
			if (local20.anInt10387 == 0) {
				if (!this.aBooleanArray11[local20.anInt10386]) {
					@Pc(47) Class6_Sub55 local47 = new Class6_Sub55();
					local47.aChar6 = '\u0000';
					local47.aLong343 = local20.aLong343;
					local47.anInt10387 = 0;
					local47.anInt10378 = local20.anInt10378;
					local47.anInt10386 = local20.anInt10386;
					this.aClass340_28.method8131(local47);
					this.aBooleanArray11[local20.anInt10386] = true;
				}
				local20.anInt10387 = 2;
				this.aClass340_28.method8131(local20);
			} else if (local20.anInt10387 == 1) {
				if (this.aBooleanArray11[local20.anInt10386]) {
					this.aClass340_28.method8131(local20);
					this.aBooleanArray11[local20.anInt10386] = false;
				}
			} else if (local20.anInt10387 == -1) {
				for (@Pc(139) int local139 = 0; local139 < 112; local139++) {
					if (this.aBooleanArray11[local139]) {
						@Pc(152) Class6_Sub55 local152 = new Class6_Sub55();
						local152.aChar6 = '\u0000';
						local152.aLong343 = local20.aLong343;
						local152.anInt10387 = 1;
						local152.anInt10378 = local20.anInt10378;
						local152.anInt10386 = local139;
						this.aClass340_28.method8131(local152);
						this.aBooleanArray11[local139] = false;
					}
				}
			} else if (local20.anInt10387 == 3) {
				this.aClass340_28.method8131(local20);
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method3952(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray11[arg0] : false;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method3963(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static614.anIntArray637.length) {
			local8 = Static614.anIntArray637[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method3964('\u0000', local8, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)V")
	@Override
	public void method3951() {
		this.method3960();
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(CBII)V")
	private void method3964(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class6_Sub55 local7 = new Class6_Sub55();
		local7.anInt10386 = arg1;
		local7.anInt10387 = arg2;
		local7.aChar6 = arg0;
		local7.aLong343 = Static549.method7758();
		this.aClass340_29.method8131(local7);
	}

	@OriginalMember(owner = "client!hca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3963(arg0, 1);
	}
}
