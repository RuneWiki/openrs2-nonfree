import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class Class1 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!ki;")
	public Class1 aClass1_261;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!ki;")
	public Class1 aClass1_262;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "J")
	public long aLong227;

	static {
		new Class84("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
		new Class84("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)Z")
	public final boolean method6069() {
		return this.aClass1_262 != null;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public final void method6071() {
		if (this.aClass1_262 != null) {
			this.aClass1_262.aClass1_261 = this.aClass1_261;
			this.aClass1_261.aClass1_262 = this.aClass1_262;
			this.aClass1_262 = null;
			this.aClass1_261 = null;
		}
	}
}
