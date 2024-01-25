import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class11_Sub29 extends Class11 {

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	public int anInt4574;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	public final int anInt4569;

	static {
		new Class117("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(II)V")
	public Class11_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4574 = arg1;
		this.anInt4569 = arg0;
	}
}
