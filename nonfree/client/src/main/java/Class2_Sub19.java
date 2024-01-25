import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
	public final int anInt2408;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
	public final int anInt2411;

	static {
		new Class93("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(II)V")
	public Class2_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2408 = arg0;
		this.anInt2411 = arg1;
	}
}
