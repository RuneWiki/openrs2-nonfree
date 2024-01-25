import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class8 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!pc;")
	private final Class188 aClass188_5;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public final int anInt275;

	static {
		new Class256("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class8(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		new Class129(64);
		this.aClass188_5 = arg2;
		this.anInt275 = this.aClass188_5.method4285(15);
	}
}
