import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!no", name = "o", descriptor = "Ljava/lang/String;")
	public String aString43;

	static {
		new Class256("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	private Class2_Sub31() {
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub31(@OriginalArg(0) String arg0) {
		this.aString43 = arg0;
	}
}
