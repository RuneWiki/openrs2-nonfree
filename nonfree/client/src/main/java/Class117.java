import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class117 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	public final int anInt3031;

	static {
		new Class32("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
		new Class32("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class117(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3031 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
