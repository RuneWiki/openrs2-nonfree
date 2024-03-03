import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class156 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_87;

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "[I")
	public static final int[] anIntArray256;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "[S")
	public static short[] aShortArray77;

	static {
		new Class79("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		aClass79_87 = new Class79("slide:", "gleiten:", "glissement:", "deslizamento:");
		anIntArray256 = new int[50];
		aShortArray77 = new short[256];
	}
}
