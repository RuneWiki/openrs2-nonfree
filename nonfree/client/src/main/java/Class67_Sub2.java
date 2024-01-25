import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class Class67_Sub2 extends Class67 {

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
	protected int anInt4515;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	protected int anInt4511;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	public final int anInt4509;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
	protected final int anInt4516;

	static {
		new Class117("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIII)V")
	protected Class67_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4515 = arg0;
		this.anInt4511 = arg2;
		this.anInt4509 = arg3;
		this.anInt4516 = arg1;
	}
}
