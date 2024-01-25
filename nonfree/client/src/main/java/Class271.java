import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class271 {

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public int anInt7790;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "Lclient!ef;")
	public Class59 aClass59_6;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	public int anInt7786 = 16;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
	public int anInt7793 = 8;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public int anInt7788 = -1;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "Z")
	public boolean aBoolean569 = false;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	public int anInt7789 = -1;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
	public int anInt7791 = 0;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "Z")
	public boolean aBoolean570 = true;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Z")
	public boolean aBoolean568 = true;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	public int anInt7800 = 127;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public int anInt7787 = 1190717;

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
	public int anInt7803 = -1;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
	public int anInt7801 = 128;

	static {
		new Class21("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
		new Class21("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BILclient!wn;)V")
	private void method6195(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt7791 = Static300.method4643(arg1.method4582());
		} else if (arg0 == 2) {
			this.anInt7803 = arg1.method4614();
		} else if (arg0 == 3) {
			this.anInt7803 = arg1.method4560();
			if (this.anInt7803 == 65535) {
				this.anInt7803 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean570 = false;
		} else if (arg0 == 7) {
			this.anInt7788 = Static300.method4643(arg1.method4582());
		} else if (arg0 == 8) {
			this.aClass59_6.anInt1972 = this.anInt7790;
		} else if (arg0 == 9) {
			this.anInt7801 = arg1.method4560() << 0;
		} else if (arg0 == 10) {
			this.aBoolean568 = false;
		} else if (arg0 == 11) {
			this.anInt7793 = arg1.method4614();
		} else if (arg0 == 12) {
			this.aBoolean569 = true;
		} else if (arg0 == 13) {
			this.anInt7787 = arg1.method4582();
		} else if (arg0 == 14) {
			this.anInt7786 = arg1.method4614() << 0;
		} else if (arg0 == 15) {
			this.anInt7789 = arg1.method4560();
			if (this.anInt7789 == 65535) {
				this.anInt7789 = -1;
				return;
			}
			return;
		} else if (arg0 == 16) {
			this.anInt7800 = arg1.method4614();
			return;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	public void method6199() {
		if (this.anInt7789 == -1) {
			this.anInt7789 = this.anInt7803;
		}
		this.anInt7793 = this.anInt7790 | this.anInt7793 << 8;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!wn;I)V")
	public void method6204(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4614();
			if (local14 == 0) {
				return;
			}
			this.method6195(local14, arg0);
		}
	}
}
