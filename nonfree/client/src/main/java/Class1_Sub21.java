import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!id", name = "q", descriptor = "I")
	public int anInt3508;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public final int anInt3507;

	static {
		new Class158("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
		new Class158("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V")
	public Class1_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3508 = arg1;
		this.anInt3507 = arg0;
	}
}
