import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class1_Sub32 extends Class1 {

	static {
		new Class45("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
		new Class45("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
	public abstract int method5772();

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
	public abstract int method5774();

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I")
	public abstract int method5775();

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
	public abstract int method5776();

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)J")
	public abstract long method5778();
}
