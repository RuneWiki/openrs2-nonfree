import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class InputStream_Sub1 extends InputStream {

	static {
		new Class62("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!at", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static215.method3855(30000L);
		return -1;
	}
}
