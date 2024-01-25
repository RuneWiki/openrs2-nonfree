import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class Class41 {

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!kl;")
	public Class41 aClass41_25;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "Lclient!kl;")
	public Class41 aClass41_26;

	static {
		new Class158("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public final void method5447() {
		if (this.aClass41_26 != null) {
			this.aClass41_26.aClass41_25 = this.aClass41_25;
			this.aClass41_25.aClass41_26 = this.aClass41_26;
			this.aClass41_25 = null;
			this.aClass41_26 = null;
		}
	}
}
