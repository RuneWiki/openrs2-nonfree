import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class Class141 {

	static {
		new Class209("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
	public abstract int method4286();

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
	public abstract int method4288();

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)Z")
	public abstract boolean method4289();

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)C")
	public abstract char method4290();

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)J")
	public abstract long method4292();
}
