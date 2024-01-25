import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class20 {

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
	public int anInt781 = 1;

	static {
		new Class306("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!ge;II)V")
	private void method782(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static147.method2361(arg0.method3928());
		} else if (arg1 == 2) {
			this.anInt781 = 0;
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method783(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3922();
			if (local5 == 0) {
				return;
			}
			this.method782(arg0, local5);
		}
	}
}
