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

@OriginalClass("client!qk")
public final class Class173_Sub1 extends Class173 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!qk", name = "D", descriptor = "Lclient!gw;")
	private final Class91 aClass91_39 = new Class91();

	@OriginalMember(owner = "client!qk", name = "E", descriptor = "Lclient!gw;")
	private final Class91 aClass91_40 = new Class91();

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "[Z")
	private final boolean[] aBooleanArray116 = new boolean[112];

	static {
		new Class21("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class173_Sub1(@OriginalArg(0) Component arg0) {
		Static123.method2320();
		this.method4902(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4895(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray116[arg0] : false;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	private void method4899() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray116[local22] = false;
		}
		this.aClass91_39.method2582();
		this.aClass91_40.method2582();
	}

	@OriginalMember(owner = "client!qk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method4904('\u0000', -1, 0);
	}

	@OriginalMember(owner = "client!qk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method4905(arg0, 0);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)I")
	private int method4901() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray116[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray116[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray116[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method4905(arg0, 1);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method4902(@OriginalArg(1) Component arg0) {
		this.method4899();
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static419.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!qk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lclient!mh;")
	@Override
	public Interface5 method4894() {
		return (Interface5) this.aClass91_39.method2583();
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	@Override
	public void method4898() {
		this.method4899();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(CIII)V")
	private void method4904(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub19 local7 = new Class4_Sub19();
		local7.anInt3161 = arg2;
		local7.aChar3 = arg0;
		local7.anInt3169 = arg1;
		local7.aLong105 = Static167.method2929();
		this.aClass91_40.method2587(local7);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
	private void method4905(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static418.anIntArray251.length) {
			local8 = Static418.anIntArray251[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method4904('\u0000', arg1, local8);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static59.method1340(local6)) {
			this.method4904(local6, 3, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4896() {
		this.aClass91_39.method2582();
		for (@Pc(23) Class4_Sub19 local23 = (Class4_Sub19) this.aClass91_40.method2583(); local23 != null; local23 = (Class4_Sub19) this.aClass91_40.method2583()) {
			local23.anInt3168 = this.method4901();
			if (local23.anInt3169 == 0) {
				if (!this.aBooleanArray116[local23.anInt3161]) {
					@Pc(43) Class4_Sub19 local43 = new Class4_Sub19();
					local43.anInt3161 = local23.anInt3161;
					local43.anInt3169 = 0;
					local43.aChar3 = '\u0000';
					local43.anInt3168 = local23.anInt3168;
					local43.aLong105 = local23.aLong105;
					this.aClass91_39.method2587(local43);
					this.aBooleanArray116[local23.anInt3161] = true;
				}
				local23.anInt3169 = 2;
				this.aClass91_39.method2587(local23);
			} else if (local23.anInt3169 == 1) {
				if (this.aBooleanArray116[local23.anInt3161]) {
					this.aClass91_39.method2587(local23);
					this.aBooleanArray116[local23.anInt3161] = false;
				}
			} else if (local23.anInt3169 == -1) {
				for (@Pc(108) int local108 = 0; local108 < 112; local108++) {
					if (this.aBooleanArray116[local108]) {
						@Pc(119) Class4_Sub19 local119 = new Class4_Sub19();
						local119.aChar3 = '\u0000';
						local119.anInt3168 = local23.anInt3168;
						local119.anInt3169 = 1;
						local119.anInt3161 = local108;
						local119.aLong105 = local23.aLong105;
						this.aClass91_39.method2587(local119);
						this.aBooleanArray116[local108] = false;
					}
				}
			} else if (local23.anInt3169 == 3) {
				this.aClass91_39.method2587(local23);
			}
		}
	}
}
