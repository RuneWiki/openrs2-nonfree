import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class5_Sub30 extends Class5 {

	@OriginalMember(owner = "client!po", name = "t", descriptor = "Ljava/lang/String;")
	public String aString48;

	static {
		new Class85("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	private Class5_Sub30() {
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub30(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString48 = arg0;
	}
}
