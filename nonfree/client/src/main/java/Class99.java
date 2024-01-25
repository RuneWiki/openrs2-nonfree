import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class Class99 {

	static {
		new Class45("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	protected Class99() {
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	public abstract void method6613();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method6616();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public abstract void method6617();

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)I")
	public abstract int method6618();

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)I")
	public abstract int method6619();

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Z")
	public abstract boolean method6620();

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)Z")
	public final boolean method6622() {
		return this.method6620() || this.method6623() || this.method6616();
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)Z")
	protected abstract boolean method6623();

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)Lclient!uf;")
	public abstract Class1_Sub32 method6624();
}
