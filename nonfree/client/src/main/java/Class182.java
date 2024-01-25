import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class182 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!pd;")
	public Class182 aClass182_2;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public int anInt5511;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!oh;")
	public Class1_Sub3 aClass1_Sub3_2;

	static {
		new Class175("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public void method4451() {
		if (Static349.anInt7451 >= 500) {
			return;
		}
		this.aClass182_2 = Static274.aClass182_1;
		this.aClass1_Sub3_2 = null;
		this.anInt5511 = 0;
		Static349.anInt7451++;
		Static274.aClass182_1 = this;
	}
}
