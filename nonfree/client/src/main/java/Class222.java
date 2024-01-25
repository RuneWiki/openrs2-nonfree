import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class222 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public int anInt6534;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
	public final int[] anIntArray542;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "[I")
	public final int[] anIntArray544;

	static {
		new Class84("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I)V")
	public Class222(@OriginalArg(0) int arg0) {
		this.anInt6534 = arg0;
		this.anIntArray542 = new int[this.anInt6534];
		this.anIntArray544 = new int[this.anInt6534];
	}
}
