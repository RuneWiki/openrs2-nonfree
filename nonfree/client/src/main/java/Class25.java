import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class Class25 {

	static {
		new Class189("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	protected Class25() {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lclient!fv;")
	public abstract Class84 method662();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method663(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
	public abstract void method665(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)I")
	public abstract int method666(@OriginalArg(1) int arg0);
}
