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

@OriginalClass("client!nu")
public final class Class60_Sub1 extends Class60 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!nu", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "Lclient!bu;")
	private final Class38 aClass38_46 = new Class38();

	@OriginalMember(owner = "client!nu", name = "v", descriptor = "Lclient!bu;")
	private final Class38 aClass38_47 = new Class38();

	@OriginalMember(owner = "client!nu", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray22 = new boolean[112];

	static {
		new Class114("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class60_Sub1(@OriginalArg(0) Component arg0) {
		Static277.method4742();
		this.method5387(arg0);
	}

	@OriginalMember(owner = "client!nu", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5393(arg0, 0);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5387(@OriginalArg(0) Component arg0) {
		this.method5388();
		this.aComponent3 = arg0;
		@Pc(11) Method local11 = Static283.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(Z)V")
	private void method5388() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(28) int local28 = 0; local28 < 112; local28++) {
			this.aBooleanArray22[local28] = false;
		}
		this.aClass38_46.method1417();
		this.aClass38_47.method1417();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)Lclient!di;")
	@Override
	public Interface2 method5386() {
		return (Interface2) this.aClass38_46.method1423();
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)I")
	private int method5389() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray22[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray22[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray22[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!nu", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5393(arg0, 1);
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5385() {
		this.aClass38_46.method1417();
		for (@Pc(19) Class1_Sub48 local19 = (Class1_Sub48) this.aClass38_47.method1423(); local19 != null; local19 = (Class1_Sub48) this.aClass38_47.method1423()) {
			local19.anInt8401 = this.method5389();
			if (local19.anInt8397 == 0) {
				if (!this.aBooleanArray22[local19.anInt8400]) {
					@Pc(39) Class1_Sub48 local39 = new Class1_Sub48();
					local39.anInt8400 = local19.anInt8400;
					local39.aLong224 = local19.aLong224;
					local39.anInt8397 = 0;
					local39.aChar5 = '\u0000';
					local39.anInt8401 = local19.anInt8401;
					this.aClass38_46.method1426(local39);
					this.aBooleanArray22[local19.anInt8400] = true;
				}
				local19.anInt8397 = 2;
				this.aClass38_46.method1426(local19);
			} else if (local19.anInt8397 == 1) {
				if (this.aBooleanArray22[local19.anInt8400]) {
					this.aClass38_46.method1426(local19);
					this.aBooleanArray22[local19.anInt8400] = false;
				}
			} else if (local19.anInt8397 == -1) {
				for (@Pc(121) int local121 = 0; local121 < 112; local121++) {
					if (this.aBooleanArray22[local121]) {
						@Pc(132) Class1_Sub48 local132 = new Class1_Sub48();
						local132.aLong224 = local19.aLong224;
						local132.anInt8400 = local121;
						local132.anInt8401 = local19.anInt8401;
						local132.aChar5 = '\u0000';
						local132.anInt8397 = 1;
						this.aClass38_46.method1426(local132);
						this.aBooleanArray22[local121] = false;
					}
				}
			} else if (local19.anInt8397 == 3) {
				this.aClass38_46.method1426(local19);
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static318.method5209(local6)) {
			this.method5392(3, local6, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	@Override
	public void method5382() {
		this.method5388();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ICII)V")
	private void method5392(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub48 local7 = new Class1_Sub48();
		local7.anInt8397 = arg0;
		local7.anInt8400 = arg2;
		local7.aChar5 = arg1;
		local7.aLong224 = Static93.method2172();
		this.aClass38_47.method1426(local7);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5384(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray22[arg0] : false;
	}

	@OriginalMember(owner = "client!nu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!nu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5392(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IZ)V")
	private void method5393(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 == 0) {
			local6 = 0;
		} else if (local6 >= 0 && Static511.anIntArray820.length > local6) {
			local6 = Static511.anIntArray820[local6];
			if (arg1 == 0 && (local6 & 0x80) != 0) {
				local6 = 0;
			} else {
				local6 &= 0xFFFFFF7F;
			}
		} else {
			local6 = 0;
		}
		if (local6 != 0) {
			this.method5392(arg1, '\u0000', local6);
			arg0.consume();
		}
	}
}
