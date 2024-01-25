import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class9 {

	@OriginalMember(owner = "client!al", name = "e", descriptor = "[Lclient!cl;")
	public static final Class32[] aClass32Array1 = new Class32[5];

	static {
		for (@Pc(15) int local15 = 0; local15 < aClass32Array1.length; local15++) {
			aClass32Array1[local15] = new Class32();
		}
		new Class159("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}
}
