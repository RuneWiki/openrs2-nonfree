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

@OriginalClass("client!uo")
public final class Class97_Sub1 extends Class97 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "Lclient!ud;")
	private Class69_Sub1 aClass69_Sub1_2;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "Lclient!ud;")
	private Class69_Sub1 aClass69_Sub1_3;

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "Lclient!ud;")
	private Class69_Sub1 aClass69_Sub1_4;

	@OriginalMember(owner = "client!uo", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray30 = new boolean[112];

	static {
		new Class93("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
		new Class93("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class97_Sub1(@OriginalArg(0) Component arg0) {
		Static219.method3896();
		this.method5682(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)Lclient!fp;")
	@Override
	public Class69 method5671() {
		@Pc(16) Class69_Sub1 local16;
		for (local16 = this.aClass69_Sub1_2; local16 != null && local16.anInt6382 == -1; local16 = local16.aClass69_Sub1_1) {
		}
		if (local16 == null) {
			this.aClass69_Sub1_2 = null;
		} else {
			this.aClass69_Sub1_2 = local16.aClass69_Sub1_1;
		}
		return local16;
	}

	@OriginalMember(owner = "client!uo", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
	private void method5680(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && Static88.anIntArray197.length > local8) {
			local8 = Static88.anIntArray197[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method5681(local8, arg1, '\u0000');
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uo", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method5680(arg0, 0);
	}

	@OriginalMember(owner = "client!uo", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method5680(arg0, 1);
	}

	@OriginalMember(owner = "client!uo", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method5681(0, -1, '\u0000');
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIC)V")
	private void method5681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char arg2) {
		@Pc(13) Class69_Sub1 local13 = new Class69_Sub1();
		local13.aChar4 = arg2;
		local13.anInt6382 = arg1;
		local13.anInt6387 = arg0;
		local13.aLong195 = Static51.method1197();
		if (this.aClass69_Sub1_4 == null) {
			this.aClass69_Sub1_3 = local13;
		} else {
			this.aClass69_Sub1_4.aClass69_Sub1_1 = local13;
		}
		this.aClass69_Sub1_4 = local13;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
	@Override
	public void method5670() {
		this.method5686();
	}

	@OriginalMember(owner = "client!uo", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static118.method4598(local6)) {
			this.method5681(-1, 2, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method5682(@OriginalArg(1) Component arg0) {
		this.method5686();
		this.aComponent3 = arg0;
		@Pc(11) Method local11 = Static268.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent3, Boolean.FALSE);
			} catch (@Pc(34) Throwable local34) {
			}
		}
		this.aComponent3.addKeyListener(this);
		this.aComponent3.addFocusListener(this);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method5672(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray30[arg0] : false;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method5674() {
		for (@Pc(13) Class69_Sub1 local13 = this.aClass69_Sub1_3; local13 != null; local13 = local13.aClass69_Sub1_1) {
			if (local13.anInt6382 == 0) {
				if (local13.anInt6387 >= 0) {
					local13.aBoolean564 = !this.aBooleanArray30[local13.anInt6387];
				}
				this.aBooleanArray30[local13.anInt6387] = true;
			} else if (local13.anInt6382 == 1) {
				this.aBooleanArray30[local13.anInt6387] = false;
			} else if (local13.anInt6382 == -1) {
				for (@Pc(54) int local54 = 0; local54 < 112; local54++) {
					this.aBooleanArray30[local54] = false;
				}
			}
		}
		this.aClass69_Sub1_2 = this.aClass69_Sub1_3;
		this.aClass69_Sub1_3 = null;
		this.aClass69_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V")
	private void method5686() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeKeyListener(this);
		this.aComponent3.removeFocusListener(this);
		this.aComponent3 = null;
		for (@Pc(30) int local30 = 0; local30 < 112; local30++) {
			this.aBooleanArray30[local30] = false;
		}
		this.aClass69_Sub1_3 = null;
		this.aClass69_Sub1_2 = null;
		this.aClass69_Sub1_4 = null;
	}
}
