import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class5_Sub48 extends Class5 {

	@OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
	public final int anInt8629;

	@OriginalMember(owner = "client!vba", name = "o", descriptor = "Z")
	public final boolean aBoolean625;

	@OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
	public final int anInt8622;

	@OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
	public final int anInt8628;

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
	public final int anInt8621;

	@OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
	public final int anInt8624;

	static {
		new Class40("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
		new Class40("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class5_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8629 = arg1;
		this.aBoolean625 = arg5;
		this.anInt8622 = arg2;
		this.anInt8628 = arg4;
		this.anInt8621 = arg0;
		this.anInt8624 = arg3;
	}
}
