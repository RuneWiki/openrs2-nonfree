import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class74 {

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "Lclient!kr;")
	private final Class171 aClass171_40;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
	public final int anInt2053;

	static {
		new Class306("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class74(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		new Class313(64);
		this.aClass171_40 = arg2;
		this.anInt2053 = this.aClass171_40.method4349(15);
	}
}
