import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class Class3_Sub3_Sub11 extends Class3_Sub3 {

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Z")
	public boolean aBoolean436;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Z")
	public volatile boolean aBoolean437 = true;

	static {
		new Class174("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
		new Class174("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)[B")
	public abstract byte[] method5280();

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I")
	public abstract int method5282();
}
