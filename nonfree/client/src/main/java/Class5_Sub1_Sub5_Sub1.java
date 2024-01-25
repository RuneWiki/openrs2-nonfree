import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class5_Sub1_Sub5_Sub1 extends Class5_Sub1_Sub5 {

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	static {
		new Class85("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
		new Class85("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class5_Sub1_Sub5_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3819() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method3820() {
		return false;
	}
}
