import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class69 {

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	public final int anInt1946;

	static {
		new Class140("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(II)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1946 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
