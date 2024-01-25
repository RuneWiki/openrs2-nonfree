import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	public final int anInt6450;

	static {
		new Class21("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		new Class21("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	protected Class4_Sub1_Sub12(@OriginalArg(0) int arg0) {
		this.anInt6450 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5267();

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)Z")
	public abstract boolean method5269();
}
