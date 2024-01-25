import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class190 {

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
	public int anInt5502 = 0;

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
	public int anInt5500 = 0;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	public int anInt5506 = 2048;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
	public int anInt5504 = 2048;

	static {
		new Class83("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZLclient!iv;)V")
	public void method4218(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2490();
			if (local5 == 0) {
				return;
			}
			this.method4220(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBLclient!iv;)V")
	private void method4220(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt5502 = arg1.method2490();
		} else if (arg0 == 2) {
			this.anInt5506 = arg1.method2536();
		} else if (arg0 == 3) {
			this.anInt5504 = arg1.method2536();
		} else if (arg0 == 4) {
			this.anInt5500 = arg1.method2512();
		}
	}
}
