import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
	public int anInt1849;

	static {
		new Class34("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	private Class1_Sub13() {
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13(@OriginalArg(0) int arg0) {
		this.anInt1849 = arg0;
	}
}
