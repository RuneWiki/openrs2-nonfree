import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class4_Sub36 extends Class4 {

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public int anInt5280;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
	public final int anInt5276;

	static {
		new Class15("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		new Class15("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(II)V")
	public Class4_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5280 = arg1;
		this.anInt5276 = arg0;
	}
}
