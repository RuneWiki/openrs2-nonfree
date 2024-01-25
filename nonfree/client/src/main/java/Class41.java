import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public abstract class Class41 {

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
	public int anInt7094;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
	public int anInt7095;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
	public int anInt7097;

	static {
		new Class174("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
		new Class174("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
		new Class174("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Z")
	public final boolean method5748() {
		return (this.anInt7095 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)Z")
	public final boolean method5750() {
		return (this.anInt7095 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)Z")
	public final boolean method5751() {
		return (this.anInt7095 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(B)Z")
	public final boolean method5752() {
		return (this.anInt7095 & 0x4) != 0;
	}
}
