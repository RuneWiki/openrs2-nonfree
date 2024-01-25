import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class26 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	public final int anInt1199;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	public final int anInt1200;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public final int anInt1205;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public final int anInt1202;

	static {
		new Class114("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(IIII)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1199 = arg1;
		this.anInt1200 = arg0;
		this.anInt1205 = arg2;
		this.anInt1202 = arg3;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)Lclient!bd;")
	public Class26 method1224(@OriginalArg(1) int arg0) {
		return new Class26(this.anInt1200, arg0, this.anInt1205, this.anInt1202);
	}
}
