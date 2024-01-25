import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class InputStream_Sub1 extends InputStream {

	static {
		new Class84("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!st", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static67.method1189(30000L);
		return -1;
	}
}
