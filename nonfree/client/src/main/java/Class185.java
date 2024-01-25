import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public final class Class185 {

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
	public final int anInt5328;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
	public final int anInt5329;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
	public final int anInt5324;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
	public final int anInt5326;

	static {
		new Class189("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIII)V")
	public Class185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5328 = arg3;
		this.anInt5329 = arg0;
		this.anInt5324 = arg1;
		this.anInt5326 = arg2;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IB)Lclient!ou;")
	public Class185 method4165(@OriginalArg(0) int arg0) {
		return new Class185(this.anInt5329, arg0, this.anInt5326, this.anInt5328);
	}
}
