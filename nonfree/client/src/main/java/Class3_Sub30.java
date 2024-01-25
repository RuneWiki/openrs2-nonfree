import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "J")
	public long aLong143;

	static {
		new Class189("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	private Class3_Sub30() {
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(J)V")
	public Class3_Sub30(@OriginalArg(0) long arg0) {
		this.aLong143 = arg0;
	}
}
