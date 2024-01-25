import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class Class32 {

	static {
		new Class96("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		new Class96("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
		new Class96("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	protected Class32() {
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public abstract void method3516();

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)I")
	public abstract int method3517();

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)Z")
	public abstract boolean method3519();

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
	protected abstract boolean method3520();

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)Z")
	protected abstract boolean method3521();

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(B)Z")
	public final boolean method3522() {
		return this.method3519() || this.method3520() || this.method3521();
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(I)Lclient!lf;")
	public abstract Class1_Sub22 method3523();

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(I)I")
	public abstract int method3524();

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(I)V")
	public abstract void method3525();
}
