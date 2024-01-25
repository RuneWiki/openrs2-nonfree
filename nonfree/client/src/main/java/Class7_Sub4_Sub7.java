import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class Class7_Sub4_Sub7 extends Class7_Sub4 {

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public final int anInt5366;

	static {
		new Class55("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		new Class55("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
	protected Class7_Sub4_Sub7(@OriginalArg(0) int arg0) {
		this.anInt5366 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4298();

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Z")
	public abstract boolean method4299();
}
